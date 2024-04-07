package jagex2.dash3d;

import jagex2.*;
import jagex2.dash3d.type.Loc;
import jagex2.dash3d.type.Tile;
import jagex2.graphics.*;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class World3D {

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "[Lclient!n;")
	private final Loc[] temporaryLocs = new Loc[5000];

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
	private int temporaryLocCount = 0;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	private int anInt2105 = 0;

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "[[I")
	private final int[][] MINIMAP_OVERLAY_SHAPE = new int[][] { new int[16],
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 }
	};

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "[[I")
	private final int[][] MINIMAP_OVERLAY_ROTATION = new int[][] {
			{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 }
	};

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "[I")
	private final int[] anIntArray460 = new int[10000];

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
	private int anInt2118 = 0;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "[I")
	private final int[] anIntArray461 = new int[10000];

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
	private final int maxLevel;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
	private final int maxTileX;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private final int maxTileZ;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "[[[Lclient!nd;")
	private final Tile[][][] levelTiles;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "[[[I")
	private final int[][][] levelTileOcclusionCycles;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "[[[I")
	private final int[][][] levelHeightMaps;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III[[[I)V")
	public World3D(@OriginalArg(0) int maxLevel, @OriginalArg(1) int maxTileX, @OriginalArg(2) int maxTileZ, @OriginalArg(3) int[][][] levelHeightMaps) {
		this.maxLevel = maxLevel;
		this.maxTileX = maxTileX;
		this.maxTileZ = maxTileZ;
		this.levelTiles = new Tile[maxLevel][maxTileX][maxTileZ];
		this.levelTileOcclusionCycles = new int[maxLevel][maxTileX + 1][maxTileZ + 1];
		this.levelHeightMaps = levelHeightMaps;
		this.reset();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ne;III)V")
	private void method1408(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Tile local14;
		@Pc(29) Model local29;
		if (arg2 < this.maxTileX) {
			local14 = this.levelTiles[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.groundDecoration != null && local14.groundDecoration.aClass2_Sub2_Sub12_2 instanceof Model) {
				local29 = (Model) local14.groundDecoration.aClass2_Sub2_Sub12_2;
				if (local29.vertexNormal != null) {
					this.method1456(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.maxTileX) {
			local14 = this.levelTiles[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.groundDecoration != null && local14.groundDecoration.aClass2_Sub2_Sub12_2 instanceof Model) {
				local29 = (Model) local14.groundDecoration.aClass2_Sub2_Sub12_2;
				if (local29.vertexNormal != null) {
					this.method1456(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.maxTileX && arg3 < this.maxTileZ) {
			local14 = this.levelTiles[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.groundDecoration != null && local14.groundDecoration.aClass2_Sub2_Sub12_2 instanceof Model) {
				local29 = (Model) local14.groundDecoration.aClass2_Sub2_Sub12_2;
				if (local29.vertexNormal != null) {
					this.method1456(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.maxTileX || arg3 <= 0) {
			return;
		}
		local14 = this.levelTiles[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.groundDecoration != null && local14.groundDecoration.aClass2_Sub2_Sub12_2 instanceof Model) {
			local29 = (Model) local14.groundDecoration.aClass2_Sub2_Sub12_2;
			if (local29.vertexNormal != null) {
				this.method1456(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!n;)V")
	private void removeLoc(@OriginalArg(0) Loc loc) {
		for (@Pc(2) int tx = loc.minSceneTileX; tx <= loc.maxSceneTileX; tx++) {
			for (@Pc(6) int tz = loc.minSceneTileZ; tz <= loc.maxSceneTileZ; tz++) {
				@Pc(17) Tile tile = this.levelTiles[loc.level][tx][tz];
				if (tile != null) {
					@Pc(36) int j;
					for (@Pc(21) int i = 0; i < tile.locCount; i++) {
						if (tile.locs[i] == loc) {
							tile.locCount--;
							for (j = i; j < tile.locCount; j++) {
								tile.locs[j] = tile.locs[j + 1];
								tile.locSpan[j] = tile.locSpan[j + 1];
							}
							tile.locs[tile.locCount] = null;
							break;
						}
					}

					tile.locSpans = 0;

					for (j = 0; j < tile.locCount; j++) {
						tile.locSpans |= tile.locSpan[j];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIILclient!jd;III)Z")
	public boolean method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Renderable arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.addLoc(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V")
	public void setWallDecorationOffset(@OriginalArg(0) int level, @OriginalArg(1) int tileX, @OriginalArg(2) int tileZ, @OriginalArg(3) int offset) {
		@Pc(8) Tile tile = this.levelTiles[level][tileX][tileZ];
		if (tile == null) {
			return;
		}
		@Pc(14) WallDecoration decor = tile.wallDecoration;
		if (decor != null) {
			@Pc(23) int sx = tileX * 128 + 64;
			@Pc(29) int sz = tileZ * 128 + 64;
			decor.x = sx + (decor.x - sx) * offset / 16;
			decor.z = sz + (decor.z - sz) * offset / 16;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lclient!uc;")
	public Class60 method1412(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(8) Tile tile = this.levelTiles[level][x][z];
		return tile == null ? null : tile.wall;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
	public void method1413(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(8) Tile tile = this.levelTiles[level][x][z];
		if (tile != null) {
			tile.groundDecoration = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	public void reset() {
		@Pc(4) int x;
		@Pc(7) int z;
		for (@Pc(1) int level = 0; level < this.maxLevel; level++) {
			for (x = 0; x < this.maxTileX; x++) {
				for (z = 0; z < this.maxTileZ; z++) {
					this.levelTiles[level][x][z] = null;
				}
			}
		}
		for (x = 0; x < Static89.LEVEL_COUNT; x++) {
			for (z = 0; z < Static89.levelOccluderCount[x]; z++) {
				Static89.levelOccluders[x][z] = null;
			}
			Static89.levelOccluderCount[x] = 0;
		}
		for (z = 0; z < this.temporaryLocCount; z++) {
			this.temporaryLocs[z] = null;
		}
		this.temporaryLocCount = 0;
		for (@Pc(76) int i = 0; i < Static89.locBuffer.length; i++) {
			Static89.locBuffer[i] = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V")
	public void removeWallDecoration(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(8) Tile tile = this.levelTiles[level][x][z];
		if (tile != null) {
			tile.wallDecoration = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;II)V")
	public void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Renderable arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class4 local6 = new Class4();
		local6.aClass2_Sub2_Sub12_2 = arg4;
		local6.anInt47 = arg1 * 128 + 64;
		local6.anInt44 = arg2 * 128 + 64;
		local6.anInt40 = arg3;
		local6.bitset = arg5;
		local6.info = arg6;
		if (this.levelTiles[arg0][arg1][arg2] == null) {
			this.levelTiles[arg0][arg1][arg2] = new Tile(arg0, arg1, arg2);
		}
		this.levelTiles[arg0][arg1][arg2].groundDecoration = local6;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.levelTileOcclusionCycles[arg0][local17][local21] == -Static89.cycle) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.levelHeightMaps[arg0][arg1][arg3] - arg5;
			if (!this.occluded(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.occluded(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.occluded(local21, local167, local195)) {
				return false;
			} else if (this.occluded(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.tileVisible(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.occluded(local17 + 1, this.levelHeightMaps[arg0][arg1][arg3] - arg5, local21 + 1) && this.occluded(local17 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.occluded(local17 + 128 - 1, this.levelHeightMaps[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.occluded(local17 + 1, this.levelHeightMaps[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)V")
	public void method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			this.levelTiles[arg0][arg1][arg2].anInt1708 = arg3;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)I")
	public int method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.wallDecoration == null ? 0 : local8.wallDecoration.bitset;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public void method1421(@OriginalArg(0) int arg0) {
		this.anInt2105 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.maxTileX; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.maxTileZ; local7++) {
				if (this.levelTiles[arg0][local4][local7] == null) {
					this.levelTiles[arg0][local4][local7] = new Tile(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(III)V")
	public void method1423(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(8) Tile tile = this.levelTiles[level][x][z];
		if (tile == null) {
			return;
		}
		for (@Pc(13) int l = 0; l < tile.locCount; l++) {
			@Pc(19) Loc loc = tile.locs[l];
			if ((loc.bitset >> 29 & 0x3) == 2 && loc.minSceneTileX == x && loc.minSceneTileZ == z) {
				this.removeLoc(loc);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIILclient!jd;IIZ)Z")
	public boolean addTemporary(@OriginalArg(0) int arg0, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int arg3, @OriginalArg(4) int padding, @OriginalArg(5) Renderable renderable, @OriginalArg(6) int yaw, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (renderable == null) {
			return true;
		}
		@Pc(7) int x0 = x - padding;
		@Pc(11) int z0 = z - padding;
		@Pc(15) int x1 = x + padding;
		@Pc(19) int z1 = z + padding;
		if (arg8) {
			if (yaw > 640 && yaw < 1408) {
				z1 += 128;
			}
			if (yaw > 1152 && yaw < 1920) {
				x1 += 128;
			}
			if (yaw > 1664 || yaw < 384) {
				z0 -= 128;
			}
			if (yaw > 128 && yaw < 896) {
				x0 -= 128;
			}
		}
		x0 /= 128;
		z0 /= 128;
		x1 /= 128;
		z1 /= 128;
		return this.addLoc(arg0, x0, z0, x1 + 1 - x0, z1 - z0 + 1, x, z, arg3, renderable, yaw, true, arg7, 0);
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(III)Z")
	private boolean tileVisible(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		@Pc(8) int cycle = this.levelTileOcclusionCycles[level][x][z];
		if (cycle == -Static89.cycle) {
			return false;
		} else if (cycle == Static89.cycle) {
			return true;
		} else {
			@Pc(23) int sx = x << 7;
			@Pc(27) int sz = z << 7;
			if (this.occluded(sx + 1, this.levelHeightMaps[level][x][z], sz + 1) && this.occluded(sx + 128 - 1, this.levelHeightMaps[level][x + 1][z], sz + 1) && this.occluded(sx + 128 - 1, this.levelHeightMaps[level][x + 1][z + 1], sz + 128 - 1) && this.occluded(sx + 1, this.levelHeightMaps[level][x][z + 1], sz + 128 - 1)) {
				this.levelTileOcclusionCycles[level][x][z] = Static89.cycle;
				return true;
			} else {
				this.levelTileOcclusionCycles[level][x][z] = -Static89.cycle;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;ILclient!jd;Lclient!jd;)V")
	public void method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Renderable arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Renderable arg6, @OriginalArg(7) Renderable arg7) {
		@Pc(3) Class51 local3 = new Class51();
		local3.aClass2_Sub2_Sub12_6 = arg4;
		local3.anInt1969 = arg1 * 128 + 64;
		local3.anInt1954 = arg2 * 128 + 64;
		local3.anInt1951 = arg3;
		local3.anInt1964 = arg5;
		local3.aClass2_Sub2_Sub12_4 = arg6;
		local3.aClass2_Sub2_Sub12_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Tile local43 = this.levelTiles[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.locCount; local47++) {
				if ((local43.locs[local47].info & 0x100) == 256 && local43.locs[local47].aClass2_Sub2_Sub12_3 instanceof Model) {
					@Pc(71) Model local71 = (Model) local43.locs[local47].aClass2_Sub2_Sub12_3;
					local71.method1135();
					if (local71.maxY > local34) {
						local34 = local71.maxY;
					}
				}
			}
		}
		local3.anInt1959 = local34;
		if (this.levelTiles[arg0][arg1][arg2] == null) {
			this.levelTiles[arg0][arg1][arg2] = new Tile(arg0, arg1, arg2);
		}
		this.levelTiles[arg0][arg1][arg2].aClass51_1 = local3;
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(III)Lclient!a;")
	public WallDecoration method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null ? null : local8.wallDecoration;
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(III)I")
	public int method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.locCount; local14++) {
			@Pc(20) Loc local20 = local8.locs[local14];
			if ((local20.bitset >> 29 & 0x3) == 2 && local20.minSceneTileX == arg1 && local20.minSceneTileZ == arg2) {
				return local20.bitset;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIII)V")
	public void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.maxTileX * 128) {
			arg0 = this.maxTileX * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.maxTileZ * 128) {
			arg2 = this.maxTileZ * 128 - 1;
		}
		Static89.cycle++;
		Static89.sinEyePitch = Static71.sin[arg3];
		Static89.cosEyePitch = Static71.cos[arg3];
		Static89.sinEyeYaw = Static71.sin[arg4];
		Static89.cosEyeYaw = Static71.cos[arg4];
		Static89.visibilityMap = Static89.visibilityMatrix[(arg3 - 128) / 32][arg4 / 64];
		Static89.eyeX = arg0;
		Static89.eyeY = arg1;
		Static89.eyeZ = arg2;
		Static89.eyeTileX = arg0 / 128;
		Static89.eyeTileZ = arg2 / 128;
		Static89.topLevel = arg5;
		Static89.anInt2115 = Static89.eyeTileX - 25;
		if (Static89.anInt2115 < 0) {
			Static89.anInt2115 = 0;
		}
		Static89.anInt2109 = Static89.eyeTileZ - 25;
		if (Static89.anInt2109 < 0) {
			Static89.anInt2109 = 0;
		}
		Static89.anInt2108 = Static89.eyeTileX + 25;
		if (Static89.anInt2108 > this.maxTileX) {
			Static89.anInt2108 = this.maxTileX;
		}
		Static89.anInt2117 = Static89.eyeTileZ + 25;
		if (Static89.anInt2117 > this.maxTileZ) {
			Static89.anInt2117 = this.maxTileZ;
		}
		this.updateActiveOccluders();
		Static89.anInt2097 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2105; local128 < this.maxLevel; local128++) {
			@Pc(134) Tile[][] local134 = this.levelTiles[local128];
			for (local136 = Static89.anInt2115; local136 < Static89.anInt2108; local136++) {
				for (local139 = Static89.anInt2109; local139 < Static89.anInt2117; local139++) {
					@Pc(146) Tile local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1708 <= arg5 && (Static89.visibilityMap[local136 + 25 - Static89.eyeTileX][local139 + 25 - Static89.eyeTileZ] || this.levelHeightMaps[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean135 = true;
							local146.aBoolean136 = true;
							if (local146.locCount > 0) {
								local146.aBoolean134 = true;
							} else {
								local146.aBoolean134 = false;
							}
							Static89.anInt2097++;
						} else {
							local146.aBoolean135 = false;
							local146.aBoolean136 = false;
							local146.anInt1698 = 0;
						}
					}
				}
			}
		}
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(237) int local237;
		for (@Pc(224) int local224 = this.anInt2105; local224 < this.maxLevel; local224++) {
			@Pc(230) Tile[][] local230 = this.levelTiles[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static89.eyeTileX + local139;
				local241 = Static89.eyeTileX - local139;
				if (local237 >= Static89.anInt2115 || local241 < Static89.anInt2108) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static89.eyeTileZ + local249;
						local258 = Static89.eyeTileZ - local249;
						@Pc(270) Tile local270;
						if (local237 >= Static89.anInt2115) {
							if (local254 >= Static89.anInt2109) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
							if (local258 < Static89.anInt2117) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
						}
						if (local241 < Static89.anInt2108) {
							if (local254 >= Static89.anInt2109) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
							if (local258 < Static89.anInt2117) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean135) {
									this.method1451(local270, true);
								}
							}
						}
						if (Static89.anInt2097 == 0) {
							Static89.takingInput = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2105; local136 < this.maxLevel; local136++) {
			@Pc(361) Tile[][] local361 = this.levelTiles[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static89.eyeTileX + local237;
				local249 = Static89.eyeTileX - local237;
				if (local241 >= Static89.anInt2115 || local249 < Static89.anInt2108) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static89.eyeTileZ + local254;
						@Pc(389) int local389 = Static89.eyeTileZ - local254;
						@Pc(401) Tile local401;
						if (local241 >= Static89.anInt2115) {
							if (local258 >= Static89.anInt2109) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
							if (local389 < Static89.anInt2117) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
						}
						if (local249 < Static89.anInt2108) {
							if (local258 >= Static89.anInt2109) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
							if (local389 < Static89.anInt2117) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean135) {
									this.method1451(local401, false);
								}
							}
						}
						if (Static89.anInt2097 == 0) {
							Static89.takingInput = false;
							return;
						}
					}
				}
			}
		}
		Static89.takingInput = false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIIII)V")
	public void method1432(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Tile local8 = this.levelTiles[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class50 local14 = local8.aClass50_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1941;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class39 local59 = local8.aClass39_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1680;
		@Pc(68) int local68 = local59.anInt1678;
		@Pc(71) int local71 = local59.anInt1679;
		@Pc(74) int local74 = local59.anInt1677;
		@Pc(79) int[] local79 = this.MINIMAP_OVERLAY_SHAPE[local24];
		@Pc(84) int[] local84 = this.MINIMAP_OVERLAY_ROTATION[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "(III)V")
	public void method1434() {
		for (@Pc(1) int local1 = 0; local1 < this.maxLevel; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.maxTileX; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.maxTileZ; local7++) {
					@Pc(17) Tile local17 = this.levelTiles[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class60 local22 = local17.wall;
						if (local22 != null && local22.aClass2_Sub2_Sub12_7 instanceof Model) {
							@Pc(32) Model local32 = (Model) local22.aClass2_Sub2_Sub12_7;
							if (local32.vertexNormal != null) {
								this.method1442(local32, local1, local4, local7, 1, 1);
								if (local22.aClass2_Sub2_Sub12_8 instanceof Model) {
									@Pc(51) Model local51 = (Model) local22.aClass2_Sub2_Sub12_8;
									if (local51.vertexNormal != null) {
										this.method1442(local51, local1, local4, local7, 1, 1);
										this.method1456(local32, local51, 0, 0, 0, false);
										local51.method1158();
									}
								}
								local32.method1158();
							}
						}
						@Pc(98) Model local98;
						for (@Pc(82) int local82 = 0; local82 < local17.locCount; local82++) {
							@Pc(88) Loc local88 = local17.locs[local82];
							if (local88 != null && local88.aClass2_Sub2_Sub12_3 instanceof Model) {
								local98 = (Model) local88.aClass2_Sub2_Sub12_3;
								if (local98.vertexNormal != null) {
									this.method1442(local98, local1, local4, local7, local88.maxSceneTileX + 1 - local88.minSceneTileX, local88.maxSceneTileZ - local88.minSceneTileZ + 1);
									local98.method1158();
								}
							}
						}
						@Pc(134) Class4 local134 = local17.groundDecoration;
						if (local134 != null && local134.aClass2_Sub2_Sub12_2 instanceof Model) {
							local98 = (Model) local134.aClass2_Sub2_Sub12_2;
							if (local98.vertexNormal != null) {
								this.method1408(local98, local1, local4, local7);
								local98.method1158();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(III)Z")
	private boolean occluded(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z) {
		for (@Pc(1) int i = 0; i < Static89.occluderCounter; i++) {
			@Pc(6) Occluder occluder = Static89.activeOccluders[i];
			@Pc(15) int dx;
			@Pc(27) int minZ;
			@Pc(37) int maxZ;
			@Pc(47) int minY;
			@Pc(57) int maxY;
			if (occluder.mode == 1) {
				dx = occluder.minX - x;
				if (dx > 0) {
					minZ = occluder.minZ + (occluder.minDeltaZ * dx >> 8);
					maxZ = occluder.maxZ + (occluder.maxDeltaZ * dx >> 8);
					minY = occluder.minY + (occluder.minDeltaY * dx >> 8);
					maxY = occluder.maxY + (occluder.maxDeltaY * dx >> 8);
					if (z >= minZ && z <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (occluder.mode == 2) {
				dx = x - occluder.minX;
				if (dx > 0) {
					minZ = occluder.minZ + (occluder.minDeltaZ * dx >> 8);
					maxZ = occluder.maxZ + (occluder.maxDeltaZ * dx >> 8);
					minY = occluder.minY + (occluder.minDeltaY * dx >> 8);
					maxY = occluder.maxY + (occluder.maxDeltaY * dx >> 8);
					if (z >= minZ && z <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (occluder.mode == 3) {
				dx = occluder.minZ - z;
				if (dx > 0) {
					minZ = occluder.minX + (occluder.minDeltaX * dx >> 8);
					maxZ = occluder.maxX + (occluder.maxDeltaX * dx >> 8);
					minY = occluder.minY + (occluder.minDeltaY * dx >> 8);
					maxY = occluder.maxY + (occluder.maxDeltaY * dx >> 8);
					if (x >= minZ && x <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (occluder.mode == 4) {
				dx = z - occluder.minZ;
				if (dx > 0) {
					minZ = occluder.minX + (occluder.minDeltaX * dx >> 8);
					maxZ = occluder.maxX + (occluder.maxDeltaX * dx >> 8);
					minY = occluder.minY + (occluder.minDeltaY * dx >> 8);
					maxY = occluder.maxY + (occluder.maxDeltaY * dx >> 8);
					if (x >= minZ && x <= maxZ && y >= minY && y <= maxY) {
						return true;
					}
				}
			} else if (occluder.mode == 5) {
				dx = y - occluder.minY;
				if (dx > 0) {
					minZ = occluder.minX + (occluder.minDeltaX * dx >> 8);
					maxZ = occluder.maxX + (occluder.maxDeltaX * dx >> 8);
					minY = occluder.minZ + (occluder.minDeltaZ * dx >> 8);
					maxY = occluder.maxZ + (occluder.maxDeltaZ * dx >> 8);
					if (x >= minZ && x <= maxZ && z >= minY && z <= maxY) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(III)Lclient!n;")
	public Loc method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.locCount; local14++) {
			@Pc(20) Loc local20 = local8.locs[local14];
			if ((local20.bitset >> 29 & 0x3) == 2 && local20.minSceneTileX == arg1 && local20.minSceneTileZ == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "(III)V")
	public void method1437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass51_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class50 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class50(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.levelTiles[local14][arg1][arg2] == null) {
					this.levelTiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].aClass50_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class50(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.levelTiles[local14][arg1][arg2] == null) {
					this.levelTiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].aClass50_1 = local12;
		} else {
			@Pc(140) Class39 local140 = new Class39(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.levelTiles[local14][arg1][arg2] == null) {
					this.levelTiles[local14][arg1][arg2] = new Tile(local14, arg1, arg2);
				}
			}
			this.levelTiles[arg0][arg1][arg2].aClass39_1 = local140;
		}
	}

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "(III)V")
	public void method1439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		if (local8 != null) {
			local8.wall = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;Lclient!jd;IIII)V")
	public void method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Renderable arg4, @OriginalArg(5) Renderable arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class60 local8 = new Class60();
		local8.bitset = arg8;
		local8.info = arg9;
		local8.anInt2362 = arg1 * 128 + 64;
		local8.anInt2363 = arg2 * 128 + 64;
		local8.anInt2361 = arg3;
		local8.aClass2_Sub2_Sub12_7 = arg4;
		local8.aClass2_Sub2_Sub12_8 = arg5;
		local8.anInt2360 = arg6;
		local8.anInt2364 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.levelTiles[local45][arg1][arg2] == null) {
				this.levelTiles[local45][arg1][arg2] = new Tile(local45, arg1, arg2);
			}
		}
		this.levelTiles[arg0][arg1][arg2].wall = local8;
	}

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "(III)Lclient!ac;")
	public Class4 method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.groundDecoration == null ? null : local8.groundDecoration;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ne;IIIII)V")
	private void method1442(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.maxLevel) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.maxTileX) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.maxTileZ && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Tile local66 = this.levelTiles[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.levelHeightMaps[local17][local24][local34] + this.levelHeightMaps[local17][local24 + 1][local34] + this.levelHeightMaps[local17][local24][local34 + 1] + this.levelHeightMaps[local17][local24 + 1][local34 + 1]) / 4 - (this.levelHeightMaps[arg1][arg2][arg3] + this.levelHeightMaps[arg1][arg2 + 1][arg3] + this.levelHeightMaps[arg1][arg2][arg3 + 1] + this.levelHeightMaps[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class60 local163 = local66.wall;
									if (local163 != null) {
										@Pc(173) Model local173;
										if (local163.aClass2_Sub2_Sub12_7 instanceof Model) {
											local173 = (Model) local163.aClass2_Sub2_Sub12_7;
											if (local173.vertexNormal != null) {
												this.method1456(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass2_Sub2_Sub12_8 instanceof Model) {
											local173 = (Model) local163.aClass2_Sub2_Sub12_8;
											if (local173.vertexNormal != null) {
												this.method1456(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.locCount; local245++) {
										@Pc(251) Loc local251 = local66.locs[local245];
										if (local251 != null && local251.aClass2_Sub2_Sub12_3 instanceof Model) {
											@Pc(261) Model local261 = (Model) local251.aClass2_Sub2_Sub12_3;
											if (local261.vertexNormal != null) {
												@Pc(272) int local272 = local251.maxSceneTileX + 1 - local251.minSceneTileX;
												@Pc(280) int local280 = local251.maxSceneTileZ + 1 - local251.minSceneTileZ;
												this.method1456(arg0, local261, (local251.minSceneTileX - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.minSceneTileZ - arg3) * 128 + (local280 - arg5) * 64, local1);
											}
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIILclient!jd;IZII)Z")
	private boolean addLoc(@OriginalArg(0) int level, @OriginalArg(1) int tileX, @OriginalArg(2) int tileZ, @OriginalArg(3) int tileSizeX, @OriginalArg(4) int tileSizeZ, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Renderable arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean temporary, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int tx = tileX; tx < tileX + tileSizeX; tx++) {
			for (@Pc(4) int tz = tileZ; tz < tileZ + tileSizeZ; tz++) {
				if (tx < 0 || tz < 0 || tx >= this.maxTileX || tz >= this.maxTileZ) {
					return false;
				}
				@Pc(28) Tile tile = this.levelTiles[level][tx][tz];
				if (tile != null && tile.locCount >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Loc loc = new Loc();
		loc.bitset = arg11;
		loc.info = arg12;
		loc.level = level;
		loc.anInt1650 = arg5;
		loc.anInt1658 = arg6;
		loc.anInt1657 = arg7;
		loc.aClass2_Sub2_Sub12_3 = arg8;
		loc.anInt1666 = arg9;
		loc.minSceneTileX = tileX;
		loc.minSceneTileZ = tileZ;
		loc.maxSceneTileX = tileX + tileSizeX - 1;
		loc.maxSceneTileZ = tileZ + tileSizeZ - 1;
		for (@Pc(98) int tx = tileX; tx < tileX + tileSizeX; tx++) {
			for (@Pc(101) int tz = tileZ; tz < tileZ + tileSizeZ; tz++) {
				@Pc(104) int spans = 0;
				if (tx > tileX) {
					spans++;
				}
				if (tx < tileX + tileSizeX - 1) {
					spans += 4;
				}
				if (tz > tileZ) {
					spans += 8;
				}
				if (tz < tileZ + tileSizeZ - 1) {
					spans += 2;
				}
				for (@Pc(130) int l = level; l >= 0; l--) {
					if (this.levelTiles[l][tx][tz] == null) {
						this.levelTiles[l][tx][tz] = new Tile(l, tx, tz);
					}
				}
				@Pc(166) Tile tile = this.levelTiles[level][tx][tz];
				tile.locs[tile.locCount] = loc;
				tile.locSpan[tile.locCount] = spans;
				tile.locSpans |= spans;
				tile.locCount++;
			}
		}
		if (temporary) {
			this.temporaryLocs[this.temporaryLocCount++] = loc;
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean pointInsideTriangle(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int y0, @OriginalArg(3) int y1, @OriginalArg(4) int y2, @OriginalArg(5) int x0, @OriginalArg(6) int x1, @OriginalArg(7) int x2) {
		if (y < y0 && y < y1 && y < y2) {
			return false;
		} else if (y > y0 && y > y1 && y > y2) {
			return false;
		} else if (x < x0 && x < x1 && x < x2) {
			return false;
		} else if (x > x0 && x > x1 && x > x2) {
			return false;
		} else {
			@Pc(59) int crossProduct_01 = (y - y0) * (x1 - x0) - (x - x0) * (y1 - y0);
			@Pc(75) int crossProduct_20 = (y - y2) * (x0 - x2) - (x - x2) * (y0 - y2);
			@Pc(91) int crossProduct_12 = (y - y1) * (x2 - x1) - (x - x1) * (y2 - y1);
			return crossProduct_01 * crossProduct_12 > 0 && crossProduct_12 * crossProduct_20 > 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)Z")
	private boolean wallVisible(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int type) {
		if (!this.tileVisible(level, x, z)) {
			return false;
		}
		@Pc(11) int sceneX = x << 7;
		@Pc(15) int sceneZ = z << 7;
		@Pc(26) int sceneY = this.levelHeightMaps[level][x][z] - 1;
		@Pc(30) int y0 = sceneY - 120;
		@Pc(34) int y1 = sceneY - 230;
		@Pc(38) int y2 = sceneY - 238;
		if (type < 16) {
			if (type == 1) {
				if (sceneX > Static89.eyeX) {
					if (!this.occluded(sceneX, sceneY, sceneZ)) {
						return false;
					}
					if (!this.occluded(sceneX, sceneY, sceneZ + 128)) {
						return false;
					}
				}
				if (level > 0) {
					if (!this.occluded(sceneX, y0, sceneZ)) {
						return false;
					}
					if (!this.occluded(sceneX, y0, sceneZ + 128)) {
						return false;
					}
				}
				if (!this.occluded(sceneX, y1, sceneZ)) {
					return false;
				}
				if (!this.occluded(sceneX, y1, sceneZ + 128)) {
					return false;
				}
				return true;
			}
			if (type == 2) {
				if (sceneZ < Static89.eyeZ) {
					if (!this.occluded(sceneX, sceneY, sceneZ + 128)) {
						return false;
					}
					if (!this.occluded(sceneX + 128, sceneY, sceneZ + 128)) {
						return false;
					}
				}
				if (level > 0) {
					if (!this.occluded(sceneX, y0, sceneZ + 128)) {
						return false;
					}
					if (!this.occluded(sceneX + 128, y0, sceneZ + 128)) {
						return false;
					}
				}
				if (!this.occluded(sceneX, y1, sceneZ + 128)) {
					return false;
				}
				if (!this.occluded(sceneX + 128, y1, sceneZ + 128)) {
					return false;
				}
				return true;
			}
			if (type == 4) {
				if (sceneX < Static89.eyeX) {
					if (!this.occluded(sceneX + 128, sceneY, sceneZ)) {
						return false;
					}
					if (!this.occluded(sceneX + 128, sceneY, sceneZ + 128)) {
						return false;
					}
				}
				if (level > 0) {
					if (!this.occluded(sceneX + 128, y0, sceneZ)) {
						return false;
					}
					if (!this.occluded(sceneX + 128, y0, sceneZ + 128)) {
						return false;
					}
				}
				if (!this.occluded(sceneX + 128, y1, sceneZ)) {
					return false;
				}
				if (!this.occluded(sceneX + 128, y1, sceneZ + 128)) {
					return false;
				}
				return true;
			}
			if (type == 8) {
				if (sceneZ > Static89.eyeZ) {
					if (!this.occluded(sceneX, sceneY, sceneZ)) {
						return false;
					}
					if (!this.occluded(sceneX + 128, sceneY, sceneZ)) {
						return false;
					}
				}
				if (level > 0) {
					if (!this.occluded(sceneX, y0, sceneZ)) {
						return false;
					}
					if (!this.occluded(sceneX + 128, y0, sceneZ)) {
						return false;
					}
				}
				if (!this.occluded(sceneX, y1, sceneZ)) {
					return false;
				}
				if (!this.occluded(sceneX + 128, y1, sceneZ)) {
					return false;
				}
				return true;
			}
		}
		if (!this.occluded(sceneX + 64, y2, sceneZ + 64)) {
			return false;
		} else if (type == 16) {
			return this.occluded(sceneX, y1, sceneZ + 128);
		} else if (type == 32) {
			return this.occluded(sceneX + 128, y1, sceneZ + 128);
		} else if (type == 64) {
			return this.occluded(sceneX + 128, y1, sceneZ);
		} else if (type == 128) {
			return this.occluded(sceneX, y1, sceneZ);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!jd;IIIIII)V")
	public void setWallDecoration(@OriginalArg(0) int level, @OriginalArg(1) int tileX, @OriginalArg(2) int tileZ, @OriginalArg(3) int arg3, @OriginalArg(4) Renderable arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int offsetX, @OriginalArg(8) int offsetZ, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) WallDecoration decor = new WallDecoration();
		decor.bitset = arg9;
		decor.info = arg10;
		decor.x = tileX * 128 + offsetX + 64;
		decor.z = tileZ * 128 + offsetZ + 64;
		decor.anInt3 = arg3;
		decor.aClass2_Sub2_Sub12_1 = arg4;
		decor.anInt4 = arg5;
		decor.anInt1 = arg6;
		for (@Pc(44) int l = level; l >= 0; l--) {
			if (this.levelTiles[l][tileX][tileZ] == null) {
				this.levelTiles[l][tileX][tileZ] = new Tile(l, tileX, tileZ);
			}
		}
		this.levelTiles[level][tileX][tileZ].wallDecoration = decor;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(IIII)Z")
	private boolean visible(@OriginalArg(0) int level, @OriginalArg(1) int tileX, @OriginalArg(2) int tileZ, @OriginalArg(3) int arg3) {
		if (this.tileVisible(level, tileX, tileZ)) {
			@Pc(11) int local11 = tileX << 7;
			@Pc(15) int local15 = tileZ << 7;
			return this.occluded(local11 + 1, this.levelHeightMaps[level][tileX][tileZ] - arg3, local15 + 1) && this.occluded(local11 + 128 - 1, this.levelHeightMaps[level][tileX + 1][tileZ] - arg3, local15 + 1) && this.occluded(local11 + 128 - 1, this.levelHeightMaps[level][tileX + 1][tileZ + 1] - arg3, local15 + 128 - 1) && this.occluded(local11 + 1, this.levelHeightMaps[level][tileX][tileZ + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nc;IIIIII)V")
	private void drawTileOverlay(@OriginalArg(0) Class39 overlay, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int sinEyeYaw, @OriginalArg(4) int cosEyeYaw, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int vertexCount = overlay.vertexX.length;

		for (@Pc(5) int i = 0; i < vertexCount; i++) {
			int x = overlay.vertexX[i] - Static89.eyeX;
			int y = overlay.vertexY[i] - Static89.eyeY;
			int z = overlay.vertexZ[i] - Static89.eyeZ;

			int tmp = z * sinEyeYaw + x * cosEyeYaw >> 16;

			@Pc(47) int local47 = z * cosEyeYaw - x * sinEyeYaw >> 16;
			@Pc(59) int local59 = y * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = y * arg1 + local47 * arg2 >> 16;

			if (local69 < 50) {
				return;
			}
			if (overlay.triangleTextureIds != null) {
				Static69.tmpViewspaceX[i] = tmp;
				Static69.tmpViewspaceY[i] = local59;
				Static69.tmpViewspaceZ[i] = local69;
			}
			Static69.tmpScreenX[i] = Static6.centerX + (tmp << 9) / local69;
			Static69.tmpScreenY[i] = Static6.centerY + (local59 << 9) / local69;
		}
		Static6.alpha = 0;

		vertexCount = overlay.triangleVertexA.length;
		for (int v = 0; v < vertexCount; v++) {
			int a = overlay.triangleVertexA[v];
			int b = overlay.triangleVertexB[v];
			int c = overlay.triangleVertexC[v];

			@Pc(142) int x0 = Static69.tmpScreenX[a];
			@Pc(146) int x1 = Static69.tmpScreenX[b];
			@Pc(150) int x2 = Static69.tmpScreenX[c];

			@Pc(154) int y0 = Static69.tmpScreenY[a];
			@Pc(158) int y1 = Static69.tmpScreenY[b];
			@Pc(162) int y2 = Static69.tmpScreenY[c];

			if ((x0 - x1) * (y2 - y1) - (y0 - y1) * (x2 - x1) > 0) {
				Static6.clipX = false;
				if (x0 < 0 || x1 < 0 || x2 < 0 || x0 > Static6.boundX || x1 > Static6.boundX || x2 > Static6.boundX) {
					Static6.clipX = true;
				}
				if (Static89.takingInput && this.pointInsideTriangle(Static89.mouseX, Static89.mouseY, y0, y1, y2, x0, x1, x2)) {
					Static89.anInt2100 = arg5;
					Static89.anInt2096 = arg6;
				}
				if (overlay.triangleTextureIds == null || overlay.triangleTextureIds[v] == -1) {
					if (overlay.triangleColorA[v] != 12345678) {
						Static6.fillGouraudTriangle(y0, y1, y2, x0, x1, x2, overlay.triangleColorA[v], overlay.triangleColorB[v], overlay.triangleColorC[v]);
					}
				} else if (Static89.lowMemory) {
					@Pc(364) int local364 = Static6.anInterface4_1.method396(overlay.triangleTextureIds[v]);
					Static6.fillGouraudTriangle(y0, y1, y2, x0, x1, x2, Static89.mulLightness(local364, overlay.triangleColorA[v]), Static89.mulLightness(local364, overlay.triangleColorB[v]), Static89.mulLightness(local364, overlay.triangleColorC[v]));
				} else if (overlay.flat) {
					Static6.fillTexturedTriangle(y0, y1, y2, x0, x1, x2, overlay.triangleColorA[v], overlay.triangleColorB[v], overlay.triangleColorC[v], Static69.tmpViewspaceX[0], Static69.tmpViewspaceX[1], Static69.tmpViewspaceX[3], Static69.tmpViewspaceY[0], Static69.tmpViewspaceY[1], Static69.tmpViewspaceY[3], Static69.tmpViewspaceZ[0], Static69.tmpViewspaceZ[1], Static69.tmpViewspaceZ[3], overlay.triangleTextureIds[v]);
				} else {
					Static6.fillTexturedTriangle(y0, y1, y2, x0, x1, x2, overlay.triangleColorA[v], overlay.triangleColorB[v], overlay.triangleColorC[v], Static69.tmpViewspaceX[a], Static69.tmpViewspaceX[b], Static69.tmpViewspaceX[c], Static69.tmpViewspaceY[a], Static69.tmpViewspaceY[b], Static69.tmpViewspaceY[c], Static69.tmpViewspaceZ[a], Static69.tmpViewspaceZ[b], Static69.tmpViewspaceZ[c], overlay.triangleTextureIds[v]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(IIII)I")
	public int getInfo(@OriginalArg(0) int level, @OriginalArg(1) int x, @OriginalArg(2) int z, @OriginalArg(3) int bitset) {
		@Pc(8) Tile tile = this.levelTiles[level][x][z];
		if (tile == null) {
			return -1;
		} else if (tile.wall != null && tile.wall.bitset == bitset) {
			return tile.wall.info & 0xFF;
		} else if (tile.wallDecoration != null && tile.wallDecoration.bitset == bitset) {
			return tile.wallDecoration.info & 0xFF;
		} else if (tile.groundDecoration != null && tile.groundDecoration.bitset == bitset) {
			return tile.groundDecoration.info & 0xFF;
		} else {
			for (@Pc(56) int i = 0; i < tile.locCount; i++) {
				if (tile.locs[i].bitset == bitset) {
					return tile.locs[i].info & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
	public void click(@OriginalArg(0) int mouseX, @OriginalArg(1) int mouseY) {
		Static89.takingInput = true;
		Static89.mouseX = mouseX;
		Static89.mouseY = mouseY;
		Static89.anInt2100 = -1;
		Static89.anInt2096 = -1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nd;Z)V")
	private void method1451(@OriginalArg(0) Tile arg0, @OriginalArg(1) boolean arg1) {
		Static89.aClass44_6.pushBack(arg0);
		while (true) {
			@Pc(8) Tile tile;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Tile[][] local31;
			@Pc(49) Tile local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class60 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Loc var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Tile var35;
										while (true) {
											do {
												tile = (Tile) Static89.aClass44_6.pollFront();
												if (tile == null) {
													return;
												}
											} while (!tile.aBoolean136);
											local17 = tile.anInt1700;
											local20 = tile.anInt1707;
											local23 = tile.level;
											local26 = tile.occludeLevel;
											local31 = this.levelTiles[local23];
											if (!tile.aBoolean135) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.levelTiles[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean136) {
														continue;
													}
												}
												if (local17 <= Static89.eyeTileX && local17 > Static89.anInt2115) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (tile.locSpans & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static89.eyeTileX && local17 < Static89.anInt2108 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (tile.locSpans & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static89.eyeTileZ && local20 > Static89.anInt2109) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (tile.locSpans & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static89.eyeTileZ && local20 < Static89.anInt2117 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean136 && (local49.aBoolean135 || (tile.locSpans & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											tile.aBoolean135 = false;
											if (tile.aClass2_Sub11_1 != null) {
												local49 = tile.aClass2_Sub11_1;
												if (local49.aClass50_1 == null) {
													if (local49.aClass39_1 != null && !this.tileVisible(0, local17, local20)) {
														this.drawTileOverlay(local49.aClass39_1, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local17, local20);
													}
												} else if (!this.tileVisible(0, local17, local20)) {
													this.method1452(local49.aClass50_1, 0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local17, local20);
												}
												@Pc(225) Class60 local225 = local49.wall;
												if (local225 != null) {
													local225.aClass2_Sub2_Sub12_7.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local225.anInt2362 - Static89.eyeX, local225.anInt2361 - Static89.eyeY, local225.anInt2363 - Static89.eyeZ, local225.bitset);
												}
												for (local251 = 0; local251 < local49.locCount; local251++) {
													var12 = local49.locs[local251];
													if (var12 != null) {
														var12.aClass2_Sub2_Sub12_3.draw(var12.anInt1666, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, var12.anInt1650 - Static89.eyeX, var12.anInt1657 - Static89.eyeY, var12.anInt1658 - Static89.eyeZ, var12.bitset);
													}
												}
											}
											var24 = false;
											if (tile.aClass50_1 == null) {
												if (tile.aClass39_1 != null && !this.tileVisible(local26, local17, local20)) {
													var24 = true;
													this.drawTileOverlay(tile.aClass39_1, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local17, local20);
												}
											} else if (!this.tileVisible(local26, local17, local20)) {
												var24 = true;
												this.method1452(tile.aClass50_1, local26, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class60 local340 = tile.wall;
											@Pc(343) WallDecoration local343 = tile.wallDecoration;
											if (local340 != null || local343 != null) {
												if (Static89.eyeTileX == local17) {
													var23++;
												} else if (Static89.eyeTileX < local17) {
													var23 += 2;
												}
												if (Static89.eyeTileZ == local20) {
													var23 += 3;
												} else if (Static89.eyeTileZ > local20) {
													var23 += 6;
												}
												local251 = Static89.FRONT_WALL_TYPES[var23];
												tile.anInt1706 = Static89.BACK_WALL_TYPES[var23];
											}
											if (local340 != null) {
												if ((local340.anInt2360 & Static89.DIRECTION_ALLOW_WALL_CORNER_TYPE[var23]) == 0) {
													tile.anInt1698 = 0;
												} else if (local340.anInt2360 == 16) {
													tile.anInt1698 = 3;
													tile.anInt1704 = Static89.WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS[var23];
													tile.anInt1701 = 3 - tile.anInt1704;
												} else if (local340.anInt2360 == 32) {
													tile.anInt1698 = 6;
													tile.anInt1704 = Static89.WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS[var23];
													tile.anInt1701 = 6 - tile.anInt1704;
												} else if (local340.anInt2360 == 64) {
													tile.anInt1698 = 12;
													tile.anInt1704 = Static89.WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS[var23];
													tile.anInt1701 = 12 - tile.anInt1704;
												} else {
													tile.anInt1698 = 9;
													tile.anInt1704 = Static89.WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS[var23];
													tile.anInt1701 = 9 - tile.anInt1704;
												}
												if ((local340.anInt2360 & local251) != 0 && !this.wallVisible(local26, local17, local20, local340.anInt2360)) {
													local340.aClass2_Sub2_Sub12_7.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local340.anInt2362 - Static89.eyeX, local340.anInt2361 - Static89.eyeY, local340.anInt2363 - Static89.eyeZ, local340.bitset);
												}
												if ((local340.anInt2364 & local251) != 0 && !this.wallVisible(local26, local17, local20, local340.anInt2364)) {
													local340.aClass2_Sub2_Sub12_8.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local340.anInt2362 - Static89.eyeX, local340.anInt2361 - Static89.eyeY, local340.anInt2363 - Static89.eyeZ, local340.bitset);
												}
											}
											if (local343 != null && !this.visible(local26, local17, local20, local343.aClass2_Sub2_Sub12_1.maxY)) {
												if ((local343.anInt4 & local251) != 0) {
													local343.aClass2_Sub2_Sub12_1.draw(local343.anInt1, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local343.x - Static89.eyeX, local343.anInt3 - Static89.eyeY, local343.z - Static89.eyeZ, local343.bitset);
												} else if ((local343.anInt4 & 0x300) != 0) {
													local578 = local343.x - Static89.eyeX;
													local583 = local343.anInt3 - Static89.eyeY;
													local588 = local343.z - Static89.eyeZ;
													local591 = local343.anInt1;
													if (local591 == 1 || local591 == 2) {
														local600 = -local578;
													} else {
														local600 = local578;
													}
													if (local591 == 2 || local591 == 3) {
														var19 = -local588;
													} else {
														var19 = local588;
													}
													@Pc(629) int local629;
													@Pc(635) int local635;
													if ((local343.anInt4 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static89.WALL_DECORATION_INSET_X[local591];
														local635 = local588 + Static89.WALL_DECORATION_INSET_Z[local591];
														local343.aClass2_Sub2_Sub12_1.draw(local591 * 512 + 256, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local629, local583, local635, local343.bitset);
													}
													if ((local343.anInt4 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static89.WALL_DECORATION_OUTSET_X[local591];
														local635 = local588 + Static89.WALL_DECORATION_OUTSET_Z[local591];
														local343.aClass2_Sub2_Sub12_1.draw(local591 * 512 + 1280 & 0x7FF, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local629, local583, local635, local343.bitset);
													}
												}
											}
											if (var24) {
												@Pc(696) Class4 local696 = tile.groundDecoration;
												if (local696 != null) {
													local696.aClass2_Sub2_Sub12_2.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local696.anInt47 - Static89.eyeX, local696.anInt40 - Static89.eyeY, local696.anInt44 - Static89.eyeZ, local696.bitset);
												}
												@Pc(723) Class51 local723 = tile.aClass51_1;
												if (local723 != null && local723.anInt1959 == 0) {
													if (local723.aClass2_Sub2_Sub12_4 != null) {
														local723.aClass2_Sub2_Sub12_4.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local723.anInt1969 - Static89.eyeX, local723.anInt1951 - Static89.eyeY, local723.anInt1954 - Static89.eyeZ, local723.anInt1964);
													}
													if (local723.aClass2_Sub2_Sub12_5 != null) {
														local723.aClass2_Sub2_Sub12_5.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local723.anInt1969 - Static89.eyeX, local723.anInt1951 - Static89.eyeY, local723.anInt1954 - Static89.eyeZ, local723.anInt1964);
													}
													if (local723.aClass2_Sub2_Sub12_6 != null) {
														local723.aClass2_Sub2_Sub12_6.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local723.anInt1969 - Static89.eyeX, local723.anInt1951 - Static89.eyeY, local723.anInt1954 - Static89.eyeZ, local723.anInt1964);
													}
												}
											}
											local578 = tile.locSpans;
											if (local578 != 0) {
												if (local17 < Static89.eyeTileX && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.pushBack(var35);
													}
												}
												if (local20 < Static89.eyeTileZ && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.pushBack(var35);
													}
												}
												if (local17 > Static89.eyeTileX && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.pushBack(var35);
													}
												}
												if (local20 > Static89.eyeTileZ && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean136) {
														Static89.aClass44_6.pushBack(var35);
													}
												}
											}
											break;
										}
										if (tile.anInt1698 != 0) {
											var24 = true;
											for (var23 = 0; var23 < tile.locCount; var23++) {
												if (tile.locs[var23].anInt1648 != Static89.cycle && (tile.locSpan[var23] & tile.anInt1698) == tile.anInt1704) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = tile.wall;
												if (!this.wallVisible(local26, local17, local20, local942.anInt2360)) {
													local942.aClass2_Sub2_Sub12_7.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local942.anInt2362 - Static89.eyeX, local942.anInt2361 - Static89.eyeY, local942.anInt2363 - Static89.eyeZ, local942.bitset);
												}
												tile.anInt1698 = 0;
											}
										}
										if (!tile.aBoolean134) {
											break;
										}
										try {
											@Pc(981) int local981 = tile.locCount;
											tile.aBoolean134 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = tile.locs[local251];
												if (var12.anInt1648 != Static89.cycle) {
													for (local1001 = var12.minSceneTileX; local1001 <= var12.maxSceneTileX; local1001++) {
														for (local578 = var12.minSceneTileZ; local578 <= var12.maxSceneTileZ; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean135) {
																tile.aBoolean134 = true;
																continue label559;
															}
															if (var35.anInt1698 != 0) {
																local588 = 0;
																if (local1001 > var12.minSceneTileX) {
																	local588++;
																}
																if (local1001 < var12.maxSceneTileX) {
																	local588 += 4;
																}
																if (local578 > var12.minSceneTileZ) {
																	local588 += 8;
																}
																if (local578 < var12.maxSceneTileZ) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt1698) == tile.anInt1701) {
																	tile.aBoolean134 = true;
																	continue label559;
																}
															}
														}
													}
													Static89.locBuffer[var23++] = var12;
													local578 = Static89.eyeTileX - var12.minSceneTileX;
													local583 = var12.maxSceneTileX - Static89.eyeTileX;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static89.eyeTileZ - var12.minSceneTileZ;
													local591 = var12.maxSceneTileZ - Static89.eyeTileZ;
													if (local591 > local588) {
														var12.anInt1646 = local578 + local591;
													} else {
														var12.anInt1646 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Loc local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static89.locBuffer[local578];
													if (local1125.anInt1648 != Static89.cycle) {
														if (local1125.anInt1646 > local1116) {
															local1116 = local1125.anInt1646;
															local1001 = local578;
														} else if (local1125.anInt1646 == local1116) {
															local588 = local1125.anInt1650 - Static89.eyeX;
															local591 = local1125.anInt1658 - Static89.eyeZ;
															local600 = Static89.locBuffer[local1001].anInt1650 - Static89.eyeX;
															var19 = Static89.locBuffer[local1001].anInt1658 - Static89.eyeZ;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static89.locBuffer[local1001];
												local1125.anInt1648 = Static89.cycle;
												if (!this.method1417(local26, local1125.minSceneTileX, local1125.maxSceneTileX, local1125.minSceneTileZ, local1125.maxSceneTileZ, local1125.aClass2_Sub2_Sub12_3.maxY)) {
													local1125.aClass2_Sub2_Sub12_3.draw(local1125.anInt1666, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local1125.anInt1650 - Static89.eyeX, local1125.anInt1657 - Static89.eyeY, local1125.anInt1658 - Static89.eyeZ, local1125.bitset);
												}
												for (local588 = local1125.minSceneTileX; local588 <= local1125.maxSceneTileX; local588++) {
													for (local591 = local1125.minSceneTileZ; local591 <= local1125.maxSceneTileZ; local591++) {
														@Pc(1250) Tile local1250 = local31[local588][local591];
														if (local1250.anInt1698 != 0) {
															Static89.aClass44_6.pushBack(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean136) {
															Static89.aClass44_6.pushBack(local1250);
														}
													}
												}
											}
											if (!tile.aBoolean134) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											tile.aBoolean134 = false;
											break;
										}
									}
								} while (!tile.aBoolean136);
							} while (tile.anInt1698 != 0);
							if (local17 > Static89.eyeTileX || local17 <= Static89.anInt2115) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean136);
						if (local17 < Static89.eyeTileX || local17 >= Static89.anInt2108 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean136);
					if (local20 > Static89.eyeTileZ || local20 <= Static89.anInt2109) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean136);
				if (local20 < Static89.eyeTileZ || local20 >= Static89.anInt2117 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean136);
			tile.aBoolean136 = false;
			Static89.anInt2097--;
			@Pc(1392) Class51 local1392 = tile.aClass51_1;
			if (local1392 != null && local1392.anInt1959 != 0) {
				if (local1392.aClass2_Sub2_Sub12_4 != null) {
					local1392.aClass2_Sub2_Sub12_4.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local1392.anInt1969 - Static89.eyeX, local1392.anInt1951 - Static89.eyeY - local1392.anInt1959, local1392.anInt1954 - Static89.eyeZ, local1392.anInt1964);
				}
				if (local1392.aClass2_Sub2_Sub12_5 != null) {
					local1392.aClass2_Sub2_Sub12_5.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local1392.anInt1969 - Static89.eyeX, local1392.anInt1951 - Static89.eyeY - local1392.anInt1959, local1392.anInt1954 - Static89.eyeZ, local1392.anInt1964);
				}
				if (local1392.aClass2_Sub2_Sub12_6 != null) {
					local1392.aClass2_Sub2_Sub12_6.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local1392.anInt1969 - Static89.eyeX, local1392.anInt1951 - Static89.eyeY - local1392.anInt1959, local1392.anInt1954 - Static89.eyeZ, local1392.anInt1964);
				}
			}
			if (tile.anInt1706 != 0) {
				@Pc(1487) WallDecoration local1487 = tile.wallDecoration;
				if (local1487 != null && !this.visible(local26, local17, local20, local1487.aClass2_Sub2_Sub12_1.maxY)) {
					if ((local1487.anInt4 & tile.anInt1706) != 0) {
						local1487.aClass2_Sub2_Sub12_1.draw(local1487.anInt1, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local1487.x - Static89.eyeX, local1487.anInt3 - Static89.eyeY, local1487.z - Static89.eyeZ, local1487.bitset);
					} else if ((local1487.anInt4 & 0x300) != 0) {
						local251 = local1487.x - Static89.eyeX;
						local1116 = local1487.anInt3 - Static89.eyeY;
						local1001 = local1487.z - Static89.eyeZ;
						local578 = local1487.anInt1;
						if (local578 == 1 || local578 == 2) {
							local583 = -local251;
						} else {
							local583 = local251;
						}
						if (local578 == 2 || local578 == 3) {
							local588 = -local1001;
						} else {
							local588 = local1001;
						}
						if ((local1487.anInt4 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static89.WALL_DECORATION_INSET_X[local578];
							local600 = local1001 + Static89.WALL_DECORATION_INSET_Z[local578];
							local1487.aClass2_Sub2_Sub12_1.draw(local578 * 512 + 256, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local591, local1116, local600, local1487.bitset);
						}
						if ((local1487.anInt4 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static89.WALL_DECORATION_OUTSET_X[local578];
							local600 = local1001 + Static89.WALL_DECORATION_OUTSET_Z[local578];
							local1487.aClass2_Sub2_Sub12_1.draw(local578 * 512 + 1280 & 0x7FF, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local591, local1116, local600, local1487.bitset);
						}
					}
				}
				local942 = tile.wall;
				if (local942 != null) {
					if ((local942.anInt2364 & tile.anInt1706) != 0 && !this.wallVisible(local26, local17, local20, local942.anInt2364)) {
						local942.aClass2_Sub2_Sub12_8.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local942.anInt2362 - Static89.eyeX, local942.anInt2361 - Static89.eyeY, local942.anInt2363 - Static89.eyeZ, local942.bitset);
					}
					if ((local942.anInt2360 & tile.anInt1706) != 0 && !this.wallVisible(local26, local17, local20, local942.anInt2360)) {
						local942.aClass2_Sub2_Sub12_7.draw(0, Static89.sinEyePitch, Static89.cosEyePitch, Static89.sinEyeYaw, Static89.cosEyeYaw, local942.anInt2362 - Static89.eyeX, local942.anInt2361 - Static89.eyeY, local942.anInt2363 - Static89.eyeZ, local942.bitset);
					}
				}
			}
			@Pc(1745) Tile local1745;
			if (local23 < this.maxLevel - 1) {
				local1745 = this.levelTiles[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.pushBack(local1745);
				}
			}
			if (local17 < Static89.eyeTileX) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.pushBack(local1745);
				}
			}
			if (local20 < Static89.eyeTileZ) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.pushBack(local1745);
				}
			}
			if (local17 > Static89.eyeTileX) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.pushBack(local1745);
				}
			}
			if (local20 > Static89.eyeTileZ) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean136) {
					Static89.aClass44_6.pushBack(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ra;IIIIIII)V")
	private void method1452(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static89.eyeX;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static89.eyeZ;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.levelHeightMaps[arg1][arg6][arg7] - Static89.eyeY;
		@Pc(51) int local51 = this.levelHeightMaps[arg1][arg6 + 1][arg7] - Static89.eyeY;
		@Pc(66) int local66 = this.levelHeightMaps[arg1][arg6 + 1][arg7 + 1] - Static89.eyeY;
		@Pc(79) int local79 = this.levelHeightMaps[arg1][arg6][arg7 + 1] - Static89.eyeY;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static6.centerX + (local101 << 9) / local121;
		@Pc(287) int local287 = Static6.centerY + (local123 << 9) / local121;
		@Pc(295) int local295 = Static6.centerX + (local21 << 9) / local169;
		@Pc(303) int local303 = Static6.centerY + (local51 << 9) / local169;
		@Pc(311) int local311 = Static6.centerX + (local197 << 9) / local27;
		@Pc(319) int local319 = Static6.centerY + (local66 << 9) / local27;
		@Pc(327) int local327 = Static6.centerX + (local245 << 9) / local265;
		@Pc(335) int local335 = Static6.centerY + (local89 << 9) / local265;
		Static6.alpha = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static6.clipX = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static6.boundX || local327 > Static6.boundX || local295 > Static6.boundX) {
				Static6.clipX = true;
			}
			if (Static89.takingInput && this.pointInsideTriangle(Static89.mouseX, Static89.mouseY, local319, local335, local303, local311, local327, local295)) {
				Static89.anInt2100 = arg6;
				Static89.anInt2096 = arg7;
			}
			if (arg0.anInt1945 == -1) {
				if (arg0.anInt1937 != 12345678) {
					Static6.fillGouraudTriangle(local319, local335, local303, local311, local327, local295, arg0.anInt1937, arg0.anInt1938, arg0.anInt1943);
				}
			} else if (Static89.lowMemory) {
				local472 = Static6.anInterface4_1.method396(arg0.anInt1945);
				Static6.fillGouraudTriangle(local319, local335, local303, local311, local327, local295, Static89.mulLightness(local472, arg0.anInt1937), Static89.mulLightness(local472, arg0.anInt1938), Static89.mulLightness(local472, arg0.anInt1943));
			} else if (arg0.aBoolean156) {
				Static6.fillTexturedTriangle(local319, local335, local303, local311, local327, local295, arg0.anInt1937, arg0.anInt1938, arg0.anInt1943, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1945);
			} else {
				Static6.fillTexturedTriangle(local319, local335, local303, local311, local327, local295, arg0.anInt1937, arg0.anInt1938, arg0.anInt1943, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1945);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static6.clipX = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static6.boundX || local295 > Static6.boundX || local327 > Static6.boundX) {
			Static6.clipX = true;
		}
		if (Static89.takingInput && this.pointInsideTriangle(Static89.mouseX, Static89.mouseY, local287, local303, local335, local279, local295, local327)) {
			Static89.anInt2100 = arg6;
			Static89.anInt2096 = arg7;
		}
		if (arg0.anInt1945 != -1) {
			if (!Static89.lowMemory) {
				Static6.fillTexturedTriangle(local287, local303, local335, local279, local295, local327, arg0.anInt1950, arg0.anInt1943, arg0.anInt1938, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1945);
				return;
			}
			local472 = Static6.anInterface4_1.method396(arg0.anInt1945);
			Static6.fillGouraudTriangle(local287, local303, local335, local279, local295, local327, Static89.mulLightness(local472, arg0.anInt1950), Static89.mulLightness(local472, arg0.anInt1943), Static89.mulLightness(local472, arg0.anInt1938));
		} else if (arg0.anInt1950 != 12345678) {
			Static6.fillGouraudTriangle(local287, local303, local335, local279, local295, local327, arg0.anInt1950, arg0.anInt1943, arg0.anInt1938);
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)V")
	public void method1453(@OriginalArg(0) int stx, @OriginalArg(1) int stz) {
		@Pc(8) Tile ground = this.levelTiles[0][stx][stz];
		for (@Pc(10) int level = 0; level < 3; level++) {
			@Pc(31) Tile local31 = this.levelTiles[level][stx][stz] = this.levelTiles[level + 1][stx][stz];
			if (local31 != null) {
				local31.level--;
				for (@Pc(41) int local41 = 0; local41 < local31.locCount; local41++) {
					@Pc(47) Loc local47 = local31.locs[local41];
					if ((local47.bitset >> 29 & 0x3) == 2 && local47.minSceneTileX == stx && local47.minSceneTileZ == stz) {
						local47.level--;
					}
				}
			}
		}
		if (this.levelTiles[0][stx][stz] == null) {
			this.levelTiles[0][stx][stz] = new Tile(0, stx, stz);
		}
		this.levelTiles[0][stx][stz].aClass2_Sub11_1 = ground;
		this.levelTiles[3][stx][stz] = null;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
	public void method1454() {
		for (@Pc(1) int i = 0; i < this.temporaryLocCount; i++) {
			@Pc(7) Loc loc = this.temporaryLocs[i];
			this.removeLoc(loc);
			this.temporaryLocs[i] = null;
		}
		this.temporaryLocCount = 0;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
	private void updateActiveOccluders() {
		@Pc(3) int count = Static89.levelOccluderCount[Static89.topLevel];
		@Pc(7) Occluder[] occluders = Static89.levelOccluders[Static89.topLevel];
		Static89.occluderCounter = 0;
		for (@Pc(11) int i = 0; i < count; i++) {
			@Pc(16) Occluder occluder = occluders[i];
			@Pc(27) int deltaMaxY;
			@Pc(40) int deltaMinTileZ;
			@Pc(51) int deltaMaxTileZ;
			@Pc(79) int deltaMaxTileX;

			if (occluder.type == 1) {
				deltaMaxY = occluder.minTileX + 25 - Static89.eyeTileX;
				if (deltaMaxY >= 0 && deltaMaxY <= 50) {
					deltaMinTileZ = occluder.minTileZ + 25 - Static89.eyeTileZ;
					if (deltaMinTileZ < 0) {
						deltaMinTileZ = 0;
					}
					deltaMaxTileZ = occluder.maxTileZ + 25 - Static89.eyeTileZ;
					if (deltaMaxTileZ > 50) {
						deltaMaxTileZ = 50;
					}
					boolean ok = false;
					while (deltaMinTileZ <= deltaMaxTileZ) {
						if (Static89.visibilityMap[deltaMaxY][deltaMinTileZ++]) {
							ok = true;
							break;
						}
					}
					if (ok) {
						deltaMaxTileX = Static89.eyeX - occluder.minX;
						if (deltaMaxTileX > 32) {
							occluder.mode = 1;
						} else {
							if (deltaMaxTileX >= -32) {
								continue;
							}
							occluder.mode = 2;
							deltaMaxTileX = -deltaMaxTileX;
						}
						occluder.minDeltaZ = (occluder.minZ - Static89.eyeZ << 8) / deltaMaxTileX;
						occluder.maxDeltaZ = (occluder.maxZ - Static89.eyeZ << 8) / deltaMaxTileX;
						occluder.minDeltaY = (occluder.minY - Static89.eyeY << 8) / deltaMaxTileX;
						occluder.maxDeltaY = (occluder.maxY - Static89.eyeY << 8) / deltaMaxTileX;
						Static89.activeOccluders[Static89.occluderCounter++] = occluder;
					}
				}
			} else if (occluder.type == 2) {
				deltaMaxY = occluder.minTileZ + 25 - Static89.eyeTileZ;
				if (deltaMaxY >= 0 && deltaMaxY <= 50) {
					deltaMinTileZ = occluder.minTileX + 25 - Static89.eyeTileX;
					if (deltaMinTileZ < 0) {
						deltaMinTileZ = 0;
					}
					deltaMaxTileZ = occluder.anInt2072 + 25 - Static89.eyeTileX;
					if (deltaMaxTileZ > 50) {
						deltaMaxTileZ = 50;
					}
					boolean ok = false;
					while (deltaMinTileZ <= deltaMaxTileZ) {
						if (Static89.visibilityMap[deltaMinTileZ++][deltaMaxY]) {
							ok = true;
							break;
						}
					}
					if (ok) {
						deltaMaxTileX = Static89.eyeZ - occluder.minZ;
						if (deltaMaxTileX > 32) {
							occluder.mode = 3;
						} else {
							if (deltaMaxTileX >= -32) {
								continue;
							}
							occluder.mode = 4;
							deltaMaxTileX = -deltaMaxTileX;
						}
						occluder.minDeltaX = (occluder.minX - Static89.eyeX << 8) / deltaMaxTileX;
						occluder.maxDeltaX = (occluder.maxX - Static89.eyeX << 8) / deltaMaxTileX;
						occluder.minDeltaY = (occluder.minY - Static89.eyeY << 8) / deltaMaxTileX;
						occluder.maxDeltaY = (occluder.maxY - Static89.eyeY << 8) / deltaMaxTileX;
						Static89.activeOccluders[Static89.occluderCounter++] = occluder;
					}
				}
			} else if (occluder.type == 4) {
				deltaMaxY = occluder.minY - Static89.eyeY;
				if (deltaMaxY > 128) {
					deltaMinTileZ = occluder.minTileZ + 25 - Static89.eyeTileZ;
					if (deltaMinTileZ < 0) {
						deltaMinTileZ = 0;
					}
					deltaMaxTileZ = occluder.maxTileZ + 25 - Static89.eyeTileZ;
					if (deltaMaxTileZ > 50) {
						deltaMaxTileZ = 50;
					}
					if (deltaMinTileZ <= deltaMaxTileZ) {
						@Pc(319) int deltaMinTileX = occluder.minTileX + 25 - Static89.eyeTileX;
						if (deltaMinTileX < 0) {
							deltaMinTileX = 0;
						}
						deltaMaxTileX = occluder.anInt2072 + 25 - Static89.eyeTileX;
						if (deltaMaxTileX > 50) {
							deltaMaxTileX = 50;
						}
						@Pc(337) boolean ok = false;
						find_visible_tile: for (@Pc(339) int x = deltaMinTileX; x <= deltaMaxTileX; x++) {
							for (@Pc(342) int local342 = deltaMinTileZ; local342 <= deltaMaxTileZ; local342++) {
								if (Static89.visibilityMap[x][local342]) {
									ok = true;
									break find_visible_tile;
								}
							}
						}
						if (ok) {
							occluder.mode = 5;
							occluder.minDeltaX = (occluder.minX - Static89.eyeX << 8) / deltaMaxY;
							occluder.maxDeltaX = (occluder.maxX - Static89.eyeX << 8) / deltaMaxY;
							occluder.minDeltaZ = (occluder.minZ - Static89.eyeZ << 8) / deltaMaxY;
							occluder.maxDeltaZ = (occluder.maxZ - Static89.eyeZ << 8) / deltaMaxY;
							Static89.activeOccluders[Static89.occluderCounter++] = occluder;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ne;Lclient!ne;IIIZ)V")
	private void method1456(@OriginalArg(0) Model arg0, @OriginalArg(1) Model arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1154();
		this.anInt2118++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.vertexX;
		@Pc(15) int local15 = arg1.vertexCount;
		for (@Pc(17) int local17 = 0; local17 < arg0.vertexCount; local17++) {
			@Pc(23) VertexNormal local23 = arg0.vertexNormal[local17];
			@Pc(28) VertexNormal local28 = arg0.vertexNormalOriginal[local17];
			if (local28.w != 0) {
				@Pc(38) int local38 = arg0.vertexY[local17] - arg3;
				if (local38 <= arg1.minY) {
					@Pc(49) int local49 = arg0.vertexX[local17] - arg2;
					if (local49 >= arg1.minX && local49 <= arg1.maxX) {
						@Pc(65) int local65 = arg0.vertexZ[local17] - arg4;
						if (local65 >= arg1.minZ && local65 <= arg1.maxZ) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) VertexNormal local82 = arg1.vertexNormal[local76];
								@Pc(87) VertexNormal local87 = arg1.vertexNormalOriginal[local76];
								if (local49 == local12[local76] && local65 == arg1.vertexZ[local76] && local38 == arg1.vertexY[local76] && local87.w != 0) {
									local23.x += local87.x;
									local23.y += local87.y;
									local23.z += local87.z;
									local23.w += local87.w;
									local82.x += local28.x;
									local82.y += local28.y;
									local82.z += local28.z;
									local82.w += local28.w;
									local9++;
									this.anIntArray461[local17] = this.anInt2118;
									this.anIntArray460[local76] = this.anInt2118;
								}
							}
						}
					}
				}
			}
		}
		if (local9 < 3 || !arg5) {
			return;
		}
		for (@Pc(193) int local193 = 0; local193 < arg0.faceCount; local193++) {
			if (this.anIntArray461[arg0.faceVertexA[local193]] == this.anInt2118 && this.anIntArray461[arg0.faceVertexB[local193]] == this.anInt2118 && this.anIntArray461[arg0.faceVertexC[local193]] == this.anInt2118) {
				arg0.faceInfo[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.faceCount; local236++) {
			if (this.anIntArray460[arg1.faceVertexA[local236]] == this.anInt2118 && this.anIntArray460[arg1.faceVertexB[local236]] == this.anInt2118 && this.anIntArray460[arg1.faceVertexC[local236]] == this.anInt2118) {
				arg1.faceInfo[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIILclient!jd;IIIIII)Z")
	public boolean method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Renderable arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.addLoc(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "(III)I")
	public int method1458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.groundDecoration == null ? 0 : local8.groundDecoration.bitset;
	}

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "(III)I")
	public int method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Tile local8 = this.levelTiles[arg0][arg1][arg2];
		return local8 == null || local8.wall == null ? 0 : local8.wall.bitset;
	}
}

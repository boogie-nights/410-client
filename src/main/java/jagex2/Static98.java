package jagex2;

import jagex2.config.LocType;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.graphics.PixMap;
import jagex2.graphics.Model;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!p;")
	public static PixMap aClass45_30;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_674 = Static13.method257("Loading )2 please wait)3");

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "[Z")
	public static boolean[] cameraModifierEnabled = new boolean[5];

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!nb;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!o;")
	private static Class40 aClass40_675 = Static13.method257("Loading)3)3)3 ");

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_676 = Static13.method257("Fps:");

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public static int[] entityUpdateIds = new int[2048];

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "[Lclient!ne;")
	public static Model[] aModelArray1 = new Model[4];

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_677 = Static13.method257(" is already on your friend list");

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_678 = Static13.method257("@cya@");

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_679 = Static13.method257("Jan");

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	public static int wavevol = 127;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!o;")
	public static Class40 progressMeterText = aClass40_675;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Lclient!o;")
	public static Class40 aClass40_681 = Static13.method257("(U4");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIIII)V")
	public static void addLoc(@OriginalArg(0) int layer, @OriginalArg(1) int x, @OriginalArg(3) int z, @OriginalArg(4) int arg3, @OriginalArg(5) int level, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (x < 1 || z < 1 || x > 102 || z > 102) {
			return;
		}
		if (Static1.lowMemory && Static1.currentLevel != level) {
			return;
		}
		@Pc(29) int bitset = 0;
		if (layer == 0) {
			bitset = Static93.scene.getWallBitset(level, x, z);
		}

		if (layer == 1) {
			bitset = Static93.scene.getWallDecorationBitset(level, x, z);
		}

		if (layer == 2) {
			bitset = Static93.scene.getLocBitset(level, x, z);
		}

		if (layer == 3) {
			bitset = Static93.scene.getGroundDecorationBitset(level, x, z);
		}

		if (bitset != 0) {
			@Pc(92) int otherInfo = Static93.scene.getInfo(level, x, z, bitset);

			@Pc(85) int otherId = bitset >> 14 & 0x7FFF;
			@Pc(102) int otherShape = otherInfo & 0x1F;
			@Pc(98) int otherRotation = otherInfo >> 6 & 0x3;
			@Pc(116) LocType locType;

			if (layer == 0) {
				Static93.scene.method1439(level, x, z);
				locType = Static91.method1470(otherId);
				if (locType.blockwalk) {
					Static79.levelCollisionMap[level].removeWall(otherShape, locType.aBoolean79, z, otherRotation, x);
				}
			}
			if (layer == 1) {
				Static93.scene.removeWallDecoration(level, x, z);
			}
			if (layer == 2) {
				Static93.scene.method1423(level, x, z);
				locType = Static91.method1470(otherId);

				if (x + locType.width > 103 || z + locType.width > 103 || x + locType.length > 103 || locType.length + z > 103) {
					return;
				}

				if (locType.blockwalk) {
					Static79.levelCollisionMap[level].removeLoc(locType.width, locType.length, otherRotation, locType.aBoolean79, x, z);
				}
			}
			if (layer == 3) {
				Static93.scene.removeGroundDecoration(level, x, z);
				locType = Static91.method1470(otherId);
				if (locType.blockwalk && locType.anInt1054 == 1) {
					Static79.levelCollisionMap[level].removeBlocked(x, z);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		int tileLevel = level;
		if (level < 3 && (Static61.levelTileFlags[1][x][z] & 0x2) == 2) {
			tileLevel = level + 1;
		}
		Static51.method845(tileLevel, z, arg3, Static79.levelCollisionMap[level], arg5, Static93.scene, arg6, level, x);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method1567() {
		while (true) {
			if (Static56.in.method1742(Static33.size) >= 11) {
				@Pc(14) int local14 = Static56.in.gBit(11);
				if (local14 != 2047) {
					if (Static100.players[local14] == null) {
						Static100.players[local14] = new PlayerEntity();
						if (Static59.aPacketArray1[local14] != null) {
							Static100.players[local14].read(Static59.aPacketArray1[local14]);
						}
					}
					Static73.playerIds[Static88.playerCount++] = local14;
					@Pc(51) PlayerEntity local51 = Static100.players[local14];
					local51.cycle = Static107.loopCycle;
					@Pc(59) int local59 = Static56.in.gBit(5);
					if (local59 > 15) {
						local59 -= 32;
					}
					@Pc(68) int local68 = Static56.in.gBit(5);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(79) int local79 = Static56.in.gBit(1);
					if (local79 == 1) {
						entityUpdateIds[Static53.entityUpdateCount++] = local14;
					}
					@Pc(97) int local97 = Static56.in.gBit(1);
					local51.move(local97 == 1, Static88.localPlayer.pathTileZ[0] + local59, local68 + Static88.localPlayer.pathTileX[0]);
					continue;
				}
			}
			Static56.in.method1739();
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lclient!ic;")
	public static Class2_Sub2_Sub11 method1568(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Static45.aClass47_12.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static27.aClass5_9.method68(arg0, 16);
		local10 = new Class2_Sub2_Sub11();
		if (local20 != null) {
			local10.method788(new Packet(local20));
		}
		Static45.aClass47_12.put((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method1569() {
		entityUpdateIds = null;
		aClass40_676 = null;
		aClass40_679 = null;
		aClass40_674 = null;
		aClass40_675 = null;
		aModelArray1 = null;
		progressMeterText = null;
		aClass40_681 = null;
		cameraModifierEnabled = null;
		aClass40_677 = null;
		aClass45_30 = null;
		aClass40_678 = null;
	}
}

package jagex2.dash3d;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class CollisionMap {

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	private final int sizeZ;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private final int sizeX;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	private final int offsetX;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	private final int offsetZ;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[[I")
	public final int[][] flags;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(II)V")
	public CollisionMap(@OriginalArg(0) int sizeX, @OriginalArg(1) int sizeZ) {
		this.sizeZ = sizeZ;
		this.sizeX = sizeX;
		this.offsetX = 0;
		this.offsetZ = 0;
		this.flags = new int[this.sizeX][this.sizeZ];
		this.reset();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)Z")
	public boolean reachedWall(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 == arg4 && arg2 == arg1) {
			return true;
		}
		@Pc(29) int local29 = arg4 - this.offsetX;
		@Pc(34) int local34 = arg3 - this.offsetX;
		@Pc(39) int local39 = arg2 - this.offsetZ;
		@Pc(44) int local44 = arg1 - this.offsetZ;
		if (arg5 == 0) {
			if (arg0 == 0) {
				if (local29 == local34 - 1 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44 && (this.flags[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local34 && local44 == local39 - 1 && (this.flags[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 == local34 && local44 == local39 + 1) {
					return true;
				}
				if (local29 == local34 - 1 && local44 == local39 && (this.flags[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local44 == local39 && (this.flags[local29][local44] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local29 == local34 + 1 && local39 == local44) {
					return true;
				}
				if (local34 == local29 && local44 == local39 + 1 && (this.flags[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local44 && (this.flags[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local34 == local29 && local39 - 1 == local44) {
					return true;
				}
				if (local29 == local34 - 1 && local44 == local39 && (this.flags[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local44 && (this.flags[local29][local44] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg0 == 0) {
				if (local34 - 1 == local29 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local44 == local39 + 1) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local44 && (this.flags[local29][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local44 && (this.flags[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (local29 == local34 - 1 && local44 == local39 && (this.flags[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local34 == local29 && local44 == local39 + 1) {
					return true;
				}
				if (local29 == local34 + 1 && local44 == local39) {
					return true;
				}
				if (local29 == local34 && local44 == local39 - 1 && (this.flags[local29][local44] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (local34 - 1 == local29 && local39 == local44 && (this.flags[local29][local44] & 0x1280108) == 0) {
					return true;
				}
				if (local29 == local34 && local44 == local39 + 1 && (this.flags[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local29 == local34 + 1 && local44 == local39) {
					return true;
				}
				if (local34 == local29 && local44 == local39 - 1) {
					return true;
				}
			} else if (arg0 == 3) {
				if (local29 == local34 - 1 && local39 == local44) {
					return true;
				}
				if (local34 == local29 && local39 + 1 == local44 && (this.flags[local29][local44] & 0x1280120) == 0) {
					return true;
				}
				if (local34 + 1 == local29 && local39 == local44 && (this.flags[local29][local44] & 0x1280180) == 0) {
					return true;
				}
				if (local29 == local34 && local39 - 1 == local44) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (local29 == local34 && local39 + 1 == local44 && (this.flags[local29][local44] & 0x20) == 0) {
				return true;
			}
			if (local29 == local34 && local44 == local39 - 1 && (this.flags[local29][local44] & 0x2) == 0) {
				return true;
			}
			if (local34 - 1 == local29 && local44 == local39 && (this.flags[local29][local44] & 0x8) == 0) {
				return true;
			}
			if (local29 == local34 + 1 && local39 == local44 && (this.flags[local29][local44] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZIIII)V")
	public void addWall(@OriginalArg(0) boolean blockrange, @OriginalArg(2) int rotation, @OriginalArg(3) int tileZ, @OriginalArg(4) int tileX, @OriginalArg(5) int shape) {
		@Pc(4) int z = tileZ - this.offsetZ;
		@Pc(13) int x = tileX - this.offsetX;
		if (shape == 0) {
			if (rotation == 0) {
				this.add(128, x, z);
				this.add(8, x - 1, z);
			}
			if (rotation == 1) {
				this.add(2, x, z);
				this.add(32, x, z + 1);
			}
			if (rotation == 2) {
				this.add(8, x, z);
				this.add(128, x + 1, z);
			}
			if (rotation == 3) {
				this.add(32, x, z);
				this.add(2, x, z - 1);
			}
		}
		if (shape == 1 || shape == 3) {
			if (rotation == 0) {
				this.add(1, x, z);
				this.add(16, x - 1, z + 1);
			}
			if (rotation == 1) {
				this.add(4, x, z);
				this.add(64, x + 1, z + 1);
			}
			if (rotation == 2) {
				this.add(16, x, z);
				this.add(1, x + 1, z + -1);
			}
			if (rotation == 3) {
				this.add(64, x, z);
				this.add(4, x - 1, z + -1);
			}
		}
		if (shape == 2) {
			if (rotation == 0) {
				this.add(130, x, z);
				this.add(8, x - 1, z);
				this.add(32, x, z + 1);
			}
			if (rotation == 1) {
				this.add(10, x, z);
				this.add(32, x, z + 1);
				this.add(128, x + 1, z);
			}
			if (rotation == 2) {
				this.add(40, x, z);
				this.add(128, x + 1, z);
				this.add(2, x, z - 1);
			}
			if (rotation == 3) {
				this.add(160, x, z);
				this.add(2, x, z - 1);
				this.add(8, x - 1, z);
			}
		}
		if (!blockrange) {
			return;
		}
		if (shape == 0) {
			if (rotation == 0) {
				this.add(65536, x, z);
				this.add(4096, x - 1, z);
			}
			if (rotation == 1) {
				this.add(1024, x, z);
				this.add(16384, x, z + 1);
			}
			if (rotation == 2) {
				this.add(4096, x, z);
				this.add(65536, x + 1, z);
			}
			if (rotation == 3) {
				this.add(16384, x, z);
				this.add(1024, x, z - 1);
			}
		}
		if (shape == 1 || shape == 3) {
			if (rotation == 0) {
				this.add(512, x, z);
				this.add(8192, x - 1, z + 1);
			}
			if (rotation == 1) {
				this.add(2048, x, z);
				this.add(32768, x + 1, z - -1);
			}
			if (rotation == 2) {
				this.add(8192, x, z);
				this.add(512, x + 1, z + -1);
			}
			if (rotation == 3) {
				this.add(32768, x, z);
				this.add(2048, x - 1, z + -1);
			}
		}
		if (shape != 2) {
			return;
		}
		if (rotation == 0) {
			this.add(66560, x, z);
			this.add(4096, x - 1, z);
			this.add(16384, x, z + 1);
		}
		if (rotation == 1) {
			this.add(5120, x, z);
			this.add(16384, x, z + 1);
			this.add(65536, x + 1, z);
		}
		if (rotation == 2) {
			this.add(20480, x, z);
			this.add(65536, x + 1, z);
			this.add(1024, x, z - 1);
		}
		if (rotation == 3) {
			this.add(81920, x, z);
			this.add(1024, x, z - 1);
			this.add(4096, x - 1, z);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZIII)V")
	public void removeLoc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		if (arg2 == 1 || arg2 == 3) {
			local15 = arg0;
			arg0 = arg1;
			arg1 = local15;
		}
		@Pc(24) int local24 = arg4 - this.offsetX;
		@Pc(30) int local30 = 256;
		if (arg3) {
			local30 = 131328;
		}
		@Pc(41) int local41 = arg5 - this.offsetZ;
		for (local15 = local24; local15 < arg0 + local24; local15++) {
			if (local15 >= 0 && local15 < this.sizeX) {
				for (@Pc(57) int local57 = local41; local57 < local41 + arg1; local57++) {
					if (local57 >= 0 && local57 < this.sizeZ) {
						this.remove(local30, local57, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V")
	private void remove(@OriginalArg(0) int flags, @OriginalArg(2) int z, @OriginalArg(3) int x) {
		this.flags[x][z] &= 0xFFFFFF - flags;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIIIII)V")
	public void addLoc(@OriginalArg(0) int sizeZ, @OriginalArg(1) boolean blockrange, @OriginalArg(2) int tileX, @OriginalArg(3) int arg3, @OriginalArg(5) int tileZ, @OriginalArg(6) int sizeX) {
		@Pc(6) int x = tileX - this.offsetX;
		@Pc(11) int z = tileZ - this.offsetZ;
		@Pc(31) int tx;
		if (arg3 == 1 || arg3 == 3) {
			tx = sizeX;
			sizeX = sizeZ;
			sizeZ = tx;
		}
		@Pc(37) int flags = 256;
		if (blockrange) {
			flags = 131328;
		}
		for (tx = x; tx < x + sizeX; tx++) {
			if (tx >= 0 && this.sizeX > tx) {
				for (@Pc(58) int tz = z; tz < z + sizeZ; tz++) {
					if (tz >= 0 && this.sizeZ > tz) {
						this.add(flags, tx, tz);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBZIII)V")
	public void removeWall(@OriginalArg(0) int shape, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int rotation, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 - this.offsetZ;
		@Pc(13) int local13 = arg4 - this.offsetX;
		if (shape == 0) {
			if (rotation == 0) {
				this.remove(128, local4, local13);
				this.remove(8, local4, local13 - 1);
			}
			if (rotation == 1) {
				this.remove(2, local4, local13);
				this.remove(32, local4 + 1, local13);
			}
			if (rotation == 2) {
				this.remove(8, local4, local13);
				this.remove(128, local4, local13 + 1);
			}
			if (rotation == 3) {
				this.remove(32, local4, local13);
				this.remove(2, local4 - 1, local13);
			}
		}
		if (shape == 1 || shape == 3) {
			if (rotation == 0) {
				this.remove(1, local4, local13);
				this.remove(16, local4 + 1, local13 + -1);
			}
			if (rotation == 1) {
				this.remove(4, local4, local13);
				this.remove(64, local4 + 1, local13 + 1);
			}
			if (rotation == 2) {
				this.remove(16, local4, local13);
				this.remove(1, local4 - 1, local13 + 1);
			}
			if (rotation == 3) {
				this.remove(64, local4, local13);
				this.remove(4, local4 - 1, local13 - 1);
			}
		}
		if (shape == 2) {
			if (rotation == 0) {
				this.remove(130, local4, local13);
				this.remove(8, local4, local13 - 1);
				this.remove(32, local4 + 1, local13);
			}
			if (rotation == 1) {
				this.remove(10, local4, local13);
				this.remove(32, local4 + 1, local13);
				this.remove(128, local4, local13 + 1);
			}
			if (rotation == 2) {
				this.remove(40, local4, local13);
				this.remove(128, local4, local13 + 1);
				this.remove(2, local4 - 1, local13);
			}
			if (rotation == 3) {
				this.remove(160, local4, local13);
				this.remove(2, local4 - 1, local13);
				this.remove(8, local4, local13 - 1);
			}
		}
		if (!arg1) {
			return;
		}
		if (shape == 0) {
			if (rotation == 0) {
				this.remove(65536, local4, local13);
				this.remove(4096, local4, local13 - 1);
			}
			if (rotation == 1) {
				this.remove(1024, local4, local13);
				this.remove(16384, local4 + 1, local13);
			}
			if (rotation == 2) {
				this.remove(4096, local4, local13);
				this.remove(65536, local4, local13 + 1);
			}
			if (rotation == 3) {
				this.remove(16384, local4, local13);
				this.remove(1024, local4 - 1, local13);
			}
		}
		if (shape == 1 || shape == 3) {
			if (rotation == 0) {
				this.remove(512, local4, local13);
				this.remove(8192, local4 + 1, local13 + -1);
			}
			if (rotation == 1) {
				this.remove(2048, local4, local13);
				this.remove(32768, local4 + 1, local13 + 1);
			}
			if (rotation == 2) {
				this.remove(8192, local4, local13);
				this.remove(512, local4 - 1, local13 + 1);
			}
			if (rotation == 3) {
				this.remove(32768, local4, local13);
				this.remove(2048, local4 - 1, local13 - 1);
			}
		}
		if (shape != 2) {
			return;
		}
		if (rotation == 0) {
			this.remove(66560, local4, local13);
			this.remove(4096, local4, local13 - 1);
			this.remove(16384, local4 + 1, local13);
		}
		if (rotation == 1) {
			this.remove(5120, local4, local13);
			this.remove(16384, local4 + 1, local13);
			this.remove(65536, local4, local13 + 1);
		}
		if (rotation == 2) {
			this.remove(20480, local4, local13);
			this.remove(65536, local4, local13 + 1);
			this.remove(1024, local4 - 1, local13);
		}
		if (rotation == 3) {
			this.remove(81920, local4, local13);
			this.remove(1024, local4 - 1, local13);
			this.remove(4096, local4, local13 - 1);
        }
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public void reset() {
		for (@Pc(3) int x = 0; x < this.sizeX; x++) {
			for (@Pc(7) int z = 0; z < this.sizeZ; z++) {
				if (x == 0 || z == 0 || x == this.sizeX - 1 || this.sizeZ - 1 == z) {
					this.flags[x][z] = 0xFFFFFF;
				} else {
					this.flags[x][z] = 0x1000000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIBI)Z")
	public boolean reachedWallDecoration(@OriginalArg(0) int arg0, @OriginalArg(1) int rotation, @OriginalArg(2) int shape, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == arg3 && arg0 == arg4) {
			return true;
		}
		@Pc(28) int dx = arg3 - this.offsetX;
		@Pc(33) int sz = arg0 - this.offsetZ;
		@Pc(38) int dz = arg4 - this.offsetZ;
		@Pc(43) int sx = arg5 - this.offsetX;
		if (shape == 6 || shape == 7) {
			if (shape == 7) {
				rotation = rotation + 2 & 0x3;
			}
			if (rotation == 0) {
				if (dx + 1 == sx && sz == dz && (this.flags[sx][sz] & 0x80) == 0) {
					return true;
				}
				if (dx == sx && sz == dz - 1 && (this.flags[sx][sz] & 0x2) == 0) {
					return true;
				}
			} else if (rotation == 1) {
				if (dx - 1 == sx && dz == sz && (this.flags[sx][sz] & 0x8) == 0) {
					return true;
				}
				if (dx == sx && dz - 1 == sz && (this.flags[sx][sz] & 0x2) == 0) {
					return true;
				}
			} else if (rotation == 2) {
				if (dx - 1 == sx && dz == sz && (this.flags[sx][sz] & 0x8) == 0) {
					return true;
				}
				if (sx == dx && sz == dz + 1 && (this.flags[sx][sz] & 0x20) == 0) {
					return true;
				}
			} else if (rotation == 3) {
				if (sx == dx + 1 && dz == sz && (this.flags[sx][sz] & 0x80) == 0) {
					return true;
				}
				if (sx == dx && sz == dz + 1 && (this.flags[sx][sz] & 0x20) == 0) {
					return true;
				}
			}
		}
		if (shape == 8) {
			if (sx == dx && dz + 1 == sz && (this.flags[sx][sz] & 0x20) == 0) {
				return true;
			}
			if (sx == dx && dz - 1 == sz && (this.flags[sx][sz] & 0x2) == 0) {
				return true;
			}
			if (sx == dx - 1 && dz == sz && (this.flags[sx][sz] & 0x8) == 0) {
				return true;
			}
			if (sx == dx + 1 && sz == dz && (this.flags[sx][sz] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public void setBlocked(@OriginalArg(2) int tileX, @OriginalArg(0) int tileZ) {
		@Pc(13) int x = tileX - this.offsetX;
		@Pc(4) int z = tileZ - this.offsetZ;
		this.flags[x][z] |= 0x200000;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V")
	public void removeBlocked(@OriginalArg(1) int tileX, @OriginalArg(0) int tileZ) {
		@Pc(4) int x = tileX - this.offsetX;
		@Pc(13) int z = tileZ - this.offsetZ;
		this.flags[x][z] &= 0xDFFFFF;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIZ)Z")
	public boolean reachedLoc(@OriginalArg(0) int forceapproach, @OriginalArg(1) int srcZ, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int srcX, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg3 + arg6 - 1;
		@Pc(22) int local22 = arg2 + arg4 - 1;
		if (arg2 <= srcX && srcX <= local22 && srcZ >= arg3 && srcZ <= local9) {
			return true;
		} else if (srcX == arg2 - 1 && arg3 <= srcZ && local9 >= srcZ && (this.flags[srcX - this.offsetX][srcZ - this.offsetZ] & 0x8) == 0 && (forceapproach & 0x8) == 0) {
			return true;
		} else if (local22 + 1 == srcX && arg3 <= srcZ && local9 >= srcZ && (this.flags[srcX - this.offsetX][srcZ - this.offsetZ] & 0x80) == 0 && (forceapproach & 0x2) == 0) {
			return true;
		} else if (srcZ == arg3 - 1 && arg2 <= srcX && local22 >= srcX && (this.flags[srcX - this.offsetX][srcZ - this.offsetZ] & 0x2) == 0 && (forceapproach & 0x4) == 0) {
			return true;
		} else {
			return srcZ == local9 + 1 && srcX >= arg2 && local22 >= srcX && (this.flags[srcX - this.offsetX][srcZ - this.offsetZ] & 0x20) == 0 && (forceapproach & 0x1) == 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZ)V")
	private void add(@OriginalArg(0) int flags, @OriginalArg(1) int x, @OriginalArg(2) int z) {
		this.flags[x][z] |= flags;
	}
}

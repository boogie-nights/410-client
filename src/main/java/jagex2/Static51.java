package jagex2;

import java.math.BigInteger;

import jagex2.config.ComType;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.World3D;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.datastruct.LinkedList;
import jagex2.graphics.Entity;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_10;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public static int anInt1163;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_11;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[[Lclient!mc;")
	public static ComType[][] aClass2_Sub2_Sub13ArrayArray1;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "I")
	public static int anInt1167;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger RSA_EXPONENT = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_355 = Static13.method257("flash2:");

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!o;")
	public static Class40 aClass40_356 = Static13.method257("l");

	@OriginalMember(owner = "client!k", name = "x", descriptor = "[Lclient!o;")
	public static Class40[] friendName = new Class40[200];

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!o;")
	public static Class40 aClass40_357 = Static13.method257("Please remove ");

	@OriginalMember(owner = "client!k", name = "A", descriptor = "I")
	public static volatile int anInt1166 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILclient!fb;ILclient!sd;BIII)V")
	public static void method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) CollisionMap arg3, @OriginalArg(4) int arg4, @OriginalArg(5) World3D arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static91.levelHeightMap[arg0][arg8][arg1];
		@Pc(23) int local23 = Static91.levelHeightMap[arg0][arg8 + 1][arg1];
		@Pc(35) int local35 = Static91.levelHeightMap[arg0][arg8 + 1][arg1 + 1];
		@Pc(45) int local45 = Static91.levelHeightMap[arg0][arg8][arg1 + 1];
		@Pc(55) int local55 = local45 + local35 + local13 + local23 >> 2;
		@Pc(59) Class2_Sub2_Sub10 local59 = Static91.method1470(arg4);
		@Pc(65) int local65 = (arg6 << 6) + arg2;
		@Pc(77) int local77 = (arg1 << 7) + arg8 + (arg4 << 14) + 1073741824;
		if (local59.anInt1054 == 0) {
			local77 += Integer.MIN_VALUE;
		}
		if (local59.anInt1030 == 1) {
			local65 += 256;
		}
		@Pc(118) Entity local118;
		if (arg2 == 22) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 22, local35);
			} else {
				local118 = new Class2_Sub2_Sub12_Sub5(arg4, 22, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1416(arg7, arg8, arg1, local55, local118, local77, local65);
			if (local59.blockwalk && local59.anInt1054 == 1) {
				arg3.setBlocked(arg8, arg1);
			}
			return;
		}
		@Pc(213) int local213;
		if (arg2 == 10 || arg2 == 11) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 10, local35);
			} else {
				local118 = new Class2_Sub2_Sub12_Sub5(arg4, 10, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			if (local118 != null) {
				@Pc(198) int local198 = 0;
				if (arg2 == 11) {
					local198 += 256;
				}
				@Pc(216) int local216;
				if (arg6 == 1 || arg6 == 3) {
					local213 = local59.anInt1040;
					local216 = local59.anInt1036;
				} else {
					local213 = local59.anInt1036;
					local216 = local59.anInt1040;
				}
				arg5.method1410(arg7, arg8, arg1, local55, local213, local216, local118, local198, local77, local65);
			}
			if (local59.blockwalk) {
				arg3.addLoc(local59.anInt1040, local59.aBoolean79, arg8, arg6, arg1, local59.anInt1036);
			}
		} else if (arg2 >= 12) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, arg2, local35);
			} else {
				local118 = new Class2_Sub2_Sub12_Sub5(arg4, arg2, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1410(arg7, arg8, arg1, local55, 1, 1, local118, 0, local77, local65);
			if (local59.blockwalk) {
				arg3.addLoc(local59.anInt1040, local59.aBoolean79, arg8, arg6, arg1, local59.anInt1036);
			}
		} else if (arg2 == 0) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 0, local35);
			} else {
				local118 = new Class2_Sub2_Sub12_Sub5(arg4, 0, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1440(arg7, arg8, arg1, local55, local118, null, Static5.ROTATION_WALL_TYPE[arg6], 0, local77, local65);
			if (local59.blockwalk) {
				arg3.addWall(local59.aBoolean79, arg6, arg1, arg8, arg2);
			}
		} else if (arg2 == 1) {
			if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
				local118 = local59.method765(arg6, local23, local45, local13, 1, local35);
			} else {
				local118 = new Class2_Sub2_Sub12_Sub5(arg4, 1, arg6, local13, local23, local35, local45, local59.anInt1048, true);
			}
			arg5.method1440(arg7, arg8, arg1, local55, local118, null, Static99.ROTATION_WALL_CORNER_TYPE[arg6], 0, local77, local65);
			if (local59.blockwalk) {
				arg3.addWall(local59.aBoolean79, arg6, arg1, arg8, arg2);
			}
		} else {
			@Pc(468) int local468;
			@Pc(500) Entity local500;
			if (arg2 == 2) {
				local468 = arg6 + 1 & 0x3;
				@Pc(490) Entity local490;
				if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
					local490 = local59.method765(arg6 + 4, local23, local45, local13, 2, local35);
					local500 = local59.method765(local468, local23, local45, local13, 2, local35);
				} else {
					local490 = new Class2_Sub2_Sub12_Sub5(arg4, 2, arg6 + 4, local13, local23, local35, local45, local59.anInt1048, true);
					local500 = new Class2_Sub2_Sub12_Sub5(arg4, 2, local468, local13, local23, local35, local45, local59.anInt1048, true);
				}
				arg5.method1440(arg7, arg8, arg1, local55, local490, local500, Static5.ROTATION_WALL_TYPE[arg6], Static5.ROTATION_WALL_TYPE[local468], local77, local65);
				if (local59.blockwalk) {
					arg3.addWall(local59.aBoolean79, arg6, arg1, arg8, arg2);
				}
			} else if (arg2 == 3) {
				if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
					local118 = local59.method765(arg6, local23, local45, local13, 3, local35);
				} else {
					local118 = new Class2_Sub2_Sub12_Sub5(arg4, 3, arg6, local13, local23, local35, local45, local59.anInt1048, true);
				}
				arg5.method1440(arg7, arg8, arg1, local55, local118, null, Static99.ROTATION_WALL_CORNER_TYPE[arg6], 0, local77, local65);
				if (local59.blockwalk) {
					arg3.addWall(local59.aBoolean79, arg6, arg1, arg8, arg2);
				}
			} else if (arg2 == 9) {
				if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
					local118 = local59.method765(arg6, local23, local45, local13, arg2, local35);
				} else {
					local118 = new Class2_Sub2_Sub12_Sub5(arg4, arg2, arg6, local13, local23, local35, local45, local59.anInt1048, true);
				}
				arg5.method1410(arg7, arg8, arg1, local55, 1, 1, local118, 0, local77, local65);
				if (local59.blockwalk) {
					arg3.addLoc(local59.anInt1040, local59.aBoolean79, arg8, arg6, arg1, local59.anInt1036);
				}
			} else {
				if (local59.aBoolean84) {
					if (arg6 == 1) {
						local468 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local468;
					} else if (arg6 == 2) {
						local468 = local45;
						local45 = local23;
						local23 = local468;
						local468 = local35;
						local35 = local13;
						local13 = local468;
					} else if (arg6 == 3) {
						local468 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local468;
					}
				}
				if (arg2 == 4) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new Class2_Sub2_Sub12_Sub5(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.setWallDecoration(arg7, arg8, arg1, local55, local118, Static5.ROTATION_WALL_TYPE[arg6], arg6 * 512, 0, 0, local77, local65);
				} else if (arg2 == 5) {
					local213 = arg5.method1459(arg7, arg8, arg1);
					local468 = 16;
					if (local213 > 0) {
						local468 = Static91.method1470(local213 >> 14 & 0x7FFF).walloff;
					}
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local500 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local500 = new Class2_Sub2_Sub12_Sub5(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.setWallDecoration(arg7, arg8, arg1, local55, local500, Static5.ROTATION_WALL_TYPE[arg6], arg6 * 512, Static83.WALL_DECORATION_ROTATION_FORWARD_X[arg6] * local468, local468 * Static55.WALL_DECORATION_ROTATION_FORWARD_Z[arg6], local77, local65);
				} else if (arg2 == 6) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new Class2_Sub2_Sub12_Sub5(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.setWallDecoration(arg7, arg8, arg1, local55, local118, 256, arg6, 0, 0, local77, local65);
				} else if (arg2 == 7) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new Class2_Sub2_Sub12_Sub5(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.setWallDecoration(arg7, arg8, arg1, local55, local118, 512, arg6, 0, 0, local77, local65);
				} else if (arg2 == 8) {
					if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
						local118 = local59.method765(0, local23, local45, local13, 4, local35);
					} else {
						local118 = new Class2_Sub2_Sub12_Sub5(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
					}
					arg5.setWallDecoration(arg7, arg8, arg1, local55, local118, 768, arg6, 0, 0, local77, local65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!kc;II)V")
	public static void method846(@OriginalArg(0) int arg0, @OriginalArg(1) PlayerEntity arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x80) != 0) {
			arg1.anInt2324 = Static56.in.method1705();
			if (arg1.anInt2324 == 65535) {
				arg1.anInt2324 = -1;
			}
		}
		@Pc(27) int local27;
		if ((arg2 & 0x40) != 0) {
			local27 = Static56.in.method1715();
			@Pc(30) byte[] local30 = new byte[local27];
			@Pc(35) Packet local35 = new Packet(local30);
			Static56.in.method1692(local30, local27);
			Static59.aPacketArray1[arg0] = local35;
			arg1.read(local35);
		}
		if ((arg2 & 0x10) != 0) {
			arg1.aClass40_660 = Static56.in.method1721();
			if (arg1.aClass40_660.method1174(0) == 126) {
				arg1.aClass40_660 = arg1.aClass40_660.method1185(1);
				Static58.method989(2, arg1.aClass40_395, arg1.aClass40_660);
			} else if (arg1 == Static88.localPlayer) {
				Static58.method989(2, arg1.aClass40_395, arg1.aClass40_660);
			}
			arg1.anInt2301 = 0;
			arg1.anInt2294 = 150;
			arg1.anInt2271 = 0;
		}
		@Pc(124) int local124;
		@Pc(141) int local141;
		if ((arg2 & 0x8) != 0) {
			local27 = Static56.in.method1705();
			local124 = Static56.in.method1715();
			if (local27 == 65535) {
				local27 = -1;
			}
			if (local27 == arg1.anInt2307 && local27 != -1) {
				local141 = Static62.method1042(local27).anInt662;
				if (local141 == 1) {
					arg1.anInt2300 = 0;
					arg1.anInt2267 = 0;
					arg1.anInt2316 = 0;
					arg1.anInt2313 = local124;
				}
				if (local141 == 2) {
					arg1.anInt2300 = 0;
				}
			} else if (local27 == -1 || arg1.anInt2307 == -1 || Static62.method1042(local27).anInt658 >= Static62.method1042(arg1.anInt2307).anInt658) {
				arg1.anInt2267 = 0;
				arg1.anInt2307 = local27;
				arg1.anInt2316 = 0;
				arg1.anInt2313 = local124;
				arg1.anInt2281 = arg1.anInt2309;
				arg1.anInt2300 = 0;
			}
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt2317 = Static56.in.method1715();
			arg1.anInt2321 = Static56.in.method1706();
			arg1.anInt2311 = Static56.in.method1715();
			arg1.anInt2286 = Static56.in.method1715();
			arg1.anInt2277 = Static56.in.method1705() + Static107.loopCycle;
			arg1.anInt2297 = Static56.in.method1681() + Static107.loopCycle;
			arg1.anInt2314 = Static56.in.method1706();
			arg1.method1543();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt2302 = Static56.in.method1681();
			local27 = Static56.in.g4();
			arg1.anInt2291 = 0;
			if (arg1.anInt2302 == 65535) {
				arg1.anInt2302 = -1;
			}
			arg1.anInt2320 = Static107.loopCycle + (local27 & 0xFFFF);
			if (arg1.anInt2320 > Static107.loopCycle) {
				arg1.anInt2291 = -1;
			}
			arg1.anInt2289 = local27 >> 16;
			arg1.anInt2268 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			local27 = Static56.in.method1705();
			local124 = Static56.in.method1715();
			local141 = Static56.in.method1715();
			@Pc(332) int local332 = Static56.in.pos;
			if (arg1.aClass40_395 != null && arg1.aClass33_2 != null) {
				@Pc(340) boolean local340 = false;
				@Pc(345) long local345 = arg1.aClass40_395.toBase37();
				if (local124 <= 1) {
					for (@Pc(350) int local350 = 0; local350 < Static99.ignoreCount; local350++) {
						if (Static84.aLongArray4[local350] == local345) {
							local340 = true;
							break;
						}
					}
				}
				if (!local340 && Static19.overrideChat == 0) {
					Static95.aPacket_4.pos = 0;
					Static56.in.method1692(Static95.aPacket_4.data, local141);
					Static95.aPacket_4.pos = 0;
					@Pc(392) Class40 local392 = Static7.method192(Static95.aPacket_4).method1166();
					arg1.aClass40_660 = local392.method1178();
					arg1.anInt2294 = 150;
					arg1.anInt2301 = local27 >> 8;
					arg1.anInt2271 = local27 & 0xFF;
					if (local124 == 2 || local124 == 3) {
						Static58.method989(1, Static80.method1334(new Class40[] { Static92.aClass40_622, arg1.aClass40_395 }), local392);
					} else if (local124 == 1) {
						Static58.method989(1, Static80.method1334(new Class40[] { Static42.aClass40_323, arg1.aClass40_395 }), local392);
					} else {
						Static58.method989(2, arg1.aClass40_395, local392);
					}
				}
			}
			Static56.in.pos = local332 + local141;
		}
		if ((arg2 & 0x200) != 0) {
			local27 = Static56.in.g1();
			local124 = Static56.in.g1();
			arg1.method1540(local27, Static107.loopCycle, local124);
			arg1.anInt2315 = Static107.loopCycle + 300;
			arg1.anInt2298 = Static56.in.method1706();
			arg1.anInt2279 = Static56.in.method1715();
		}
		if ((arg2 & 0x20) != 0) {
			local27 = Static56.in.method1730();
			local124 = Static56.in.g1();
			arg1.method1540(local27, Static107.loopCycle, local124);
			arg1.anInt2315 = Static107.loopCycle + 300;
			arg1.anInt2298 = Static56.in.method1706();
			arg1.anInt2279 = Static56.in.method1706();
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt2280 = Static56.in.method1705();
			arg1.anInt2292 = Static56.in.method1681();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method847() {
		aClass40_356 = null;
		aClass2_Sub2_Sub2_Sub3_10 = null;
		aClass2_Sub2_Sub2_Sub3_11 = null;
		friendName = null;
		anIntArray256 = null;
		RSA_EXPONENT = null;
		aClass2_Sub2_Sub13ArrayArray1 = null;
		aClass40_355 = null;
		aClass40_357 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLclient!ad;Lclient!cb;)V")
	public static void method848(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.anInt1189 = 1;
		local7.aClass5_Sub1_11 = arg1;
		local7.aClass11_3 = arg2;
		local7.id = arg0;
		@Pc(22) LinkedList local22 = Static20.aClass44_2;
		synchronized (Static20.aClass44_2) {
			Static20.aClass44_2.pushBack(local7);
		}
		Static58.method992();
	}
}

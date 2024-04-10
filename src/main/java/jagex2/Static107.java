package jagex2;

import java.awt.Graphics;

import jagex2.config.ComType;
import jagex2.graphics.PixMap;
import jagex2.graphics.PixFont;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public static int anInt2497;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt2498;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!p;")
	public static PixMap aClass45_31;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_716 = Static13.method257(" ");

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_717 = Static13.method257("@gre@1 unread message");

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_718 = Static13.method257("backleft2");

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!o;")
	private static Class40 aClass40_722 = Static13.method257("Swap this note at any bank for the equivalent item");

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_719 = aClass40_722;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_720 = Static13.method257("redstone2");

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!o;")
	public static Class40 textPreparedVisibilityMap = Static13.method257("Prepared visibility map");

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public static int anInt2505 = 0;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public static int loopCycle = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method1653() {
		aClass40_720 = null;
		aClass40_719 = null;
		aClass40_718 = null;
		aClass40_722 = null;
		textPreparedVisibilityMap = null;
		aClass40_717 = null;
		aClass45_31 = null;
		aClass40_716 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ)I")
	public static int perlin(@OriginalArg(0) int scale, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / scale;
		@Pc(13) int local13 = scale - 1 & arg1;
		@Pc(17) int local17 = arg2 / scale;
		@Pc(23) int local23 = arg2 & scale - 1;
		@Pc(33) int local33 = Static20.smoothNoise(local7, local17);
		@Pc(40) int local40 = Static20.smoothNoise(local7 + 1, local17);
		@Pc(51) int local51 = Static20.smoothNoise(local7, local17 + 1);
		@Pc(60) int local60 = Static20.smoothNoise(local7 + 1, local17 + 1);
		@Pc(67) int local67 = Static80.interpolate(local13, local33, scale, local40);
		@Pc(74) int local74 = Static80.interpolate(local13, local51, scale, local60);
		return Static80.interpolate(local23, local67, scale, local74);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!pc;)V")
	public static synchronized void method1657(@OriginalArg(1) Class2_Sub10 arg0) {
		Static21.aClass2_Sub10_1 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	public static synchronized void method1658() {
		if (Static21.aClass2_Sub10_1 != null) {
			Static21.aClass2_Sub10_1.method1287(256);
		}
		Static11.method230(256);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method1659() {
		Static87.aClass18_1.method1275();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static88.aLongArray5[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static97.aLongArray6[local29] = 0L;
		}
		Static23.anInt587 = 0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!mc;)I")
	public static int method1660(@OriginalArg(0) int arg0, @OriginalArg(2) ComType arg1) {
		if (arg1.anIntArrayArray11 == null || arg0 >= arg1.anIntArrayArray11.length) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(22) int[] local22 = arg1.anIntArrayArray11[arg0];
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(31) int local31 = local22[local17++];
				@Pc(33) int local33 = 0;
				@Pc(35) byte local35 = 0;
				if (local31 == 0) {
					return local24;
				}
				if (local31 == 1) {
					local33 = Static94.skillLevel[local22[local17++]];
				}
				if (local31 == 15) {
					local35 = 1;
				}
				if (local31 == 16) {
					local35 = 2;
				}
				if (local31 == 17) {
					local35 = 3;
				}
				if (local31 == 2) {
					local33 = Static59.skillBaseLevel[local22[local17++]];
				}
				if (local31 == 3) {
					local33 = Static48.skillExperience[local22[local17++]];
				}
				@Pc(103) int local103;
				@Pc(116) ComType local116;
				@Pc(121) int local121;
				@Pc(133) int local133;
				if (local31 == 4) {
					local103 = local22[local17++] << 16;
					@Pc(110) int local110 = local103 + local22[local17++];
					local116 = Static81.method1340(local110);
					local121 = local22[local17++];
					if (local121 != -1 && (!Static105.get(local121).members || Static18.aBoolean37)) {
						for (local133 = 0; local133 < local116.invSlotObjId.length; local133++) {
							if (local121 + 1 == local116.invSlotObjId[local133]) {
								local33 += local116.invSlotObjCount[local133];
							}
						}
					}
				}
				if (local31 == 5) {
					local33 = Static67.varps[local22[local17++]];
				}
				if (local31 == 6) {
					local33 = Class11.levelExperience[Static59.skillBaseLevel[local22[local17++]] - 1];
				}
				if (local31 == 7) {
					local33 = Static67.varps[local22[local17++]] * 100 / 46875;
				}
				if (local31 == 8) {
					local33 = Static88.localPlayer.anInt1378;
				}
				if (local31 == 9) {
					for (local103 = 0; local103 < 25; local103++) {
						if (Static73.aBooleanArray27[local103]) {
							local33 += Static59.skillBaseLevel[local103];
						}
					}
				}
				if (local31 == 10) {
					local103 = local22[local17++] << 16;
					local103 += local22[local17++];
					local116 = Static81.method1340(local103);
					local121 = local22[local17++];
					if (local121 != -1 && (!Static105.get(local121).members || Static18.aBoolean37)) {
						for (local133 = 0; local133 < local116.invSlotObjId.length; local133++) {
							if (local121 + 1 == local116.invSlotObjId[local133]) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local31 == 11) {
					local33 = Static93.energy;
				}
				if (local31 == 12) {
					local33 = Static74.weightCarried;
				}
				if (local31 == 13) {
					local103 = Static67.varps[local22[local17++]];
					@Pc(315) int local315 = local22[local17++];
					local33 = (0x1 << local315 & local103) == 0 ? 0 : 1;
				}
				if (local31 == 14) {
					local103 = local22[local17++];
					local33 = method1662(local103);
				}
				if (local31 == 18) {
					local33 = (Static88.localPlayer.x >> 7) + Static87.anInt2058;
				}
				if (local31 == 19) {
					local33 = Static30.anInt725 + (Static88.localPlayer.z >> 7);
				}
				if (local31 == 20) {
					local33 = local22[local17++];
				}
				if (local35 == 0) {
					if (local26 == 0) {
						local24 += local33;
					}
					if (local26 == 1) {
						local24 -= local33;
					}
					if (local26 == 2 && local33 != 0) {
						local24 /= local33;
					}
					if (local26 == 3) {
						local24 *= local33;
					}
					local26 = 0;
				} else {
					local26 = local35;
				}
			}
		} catch (@Pc(419) Exception local419) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public static void method1661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 1171938384) + arg1);
		@Pc(17) Class2_Sub2_Sub9 local17 = (Class2_Sub2_Sub9) Static105.aClass6_7.get(local11);
		if (local17 != null) {
			Static74.aClass41_1.method1204(local17);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	public static int method1662(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub2_Sub1 local7 = Static34.method621(arg0);
		@Pc(10) int local10 = local7.anInt171;
		@Pc(13) int local13 = local7.anInt174;
		@Pc(16) int local16 = local7.anInt170;
		@Pc(23) int local23 = Class61.anIntArray518[local16 - local10];
		return local23 & Static67.varps[local13] >> local10;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([II)V")
	public static synchronized void method1663(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static21.aClass2_Sub10_1 != null) {
			Static21.aClass2_Sub10_1.method1286(arg0, 0, local2);
		}
		Static11.method230(local2);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Graphics;Lclient!fc;III)V")
	public static void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) PixFont arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static4.aClass45_4.bind();
		Static51.aClass2_Sub2_Sub2_Sub3_11.draw(0, 0);
		arg2.method578(Static29.aClass40_219, 55, 28, 0xFFFFFF, true);
		if (arg4 == 0) {
			arg2.method578(Static103.aClass40_715, 55, 41, 65280, true);
		}
		if (arg4 == 1) {
			arg2.method578(Static68.aClass40_106, 55, 41, 16776960, true);
		}
		if (arg4 == 2) {
			arg2.method578(Static94.aClass40_629, 55, 41, 16711680, true);
		}
		if (arg4 == 3) {
			arg2.method578(Static5.aClass40_46, 55, 41, 65535, true);
		}
		arg2.method578(Static53.aClass40_368, 184, 28, 0xFFFFFF, true);
		if (arg0 == 0) {
			arg2.method578(Static103.aClass40_715, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method578(Static68.aClass40_106, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method578(Static94.aClass40_629, 184, 41, 16711680, true);
		}
		arg2.method578(Static75.aClass40_530, 324, 28, 0xFFFFFF, true);
		if (arg3 == 0) {
			arg2.method578(Static103.aClass40_715, 324, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method578(Static68.aClass40_106, 324, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method578(Static94.aClass40_629, 324, 41, 16711680, true);
		}
		arg2.method578(Static74.aClass40_522, 458, 33, 0xFFFFFF, true);
		Static4.aClass45_4.draw(arg1, 0, 453);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Z")
	public static boolean method1665(@OriginalArg(0) int arg0) {
		if (Static92.aBooleanArray31[arg0]) {
			return true;
		} else if (Static54.aClass5_17.method59(arg0)) {
			@Pc(25) int local25 = Static54.aClass5_17.method76(arg0);
			if (local25 == 0) {
				Static92.aBooleanArray31[arg0] = true;
				return true;
			}
			if (Static51.aClass2_Sub2_Sub13ArrayArray1[arg0] == null) {
				Static51.aClass2_Sub2_Sub13ArrayArray1[arg0] = new ComType[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (Static51.aClass2_Sub2_Sub13ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static54.aClass5_17.method68(local47, arg0);
					if (local61 != null) {
						Static51.aClass2_Sub2_Sub13ArrayArray1[arg0][local47] = new ComType();
						Static51.aClass2_Sub2_Sub13ArrayArray1[arg0][local47].method1053(new Packet(local61));
					}
				}
			}
			Static92.aBooleanArray31[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}

package jagex2;

import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "I")
	public static int anInt2027;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!sa", name = "Gb", descriptor = "I")
	public static int anInt2035;

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lclient!o;")
	public static Class40 textLoadedUpdateList = Static13.method257("Loaded update list");

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_585 = Static13.method257("Unexpected server response: ");

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "Lclient!o;")
	public static Class40 aClass40_586 = Static13.method257("Please try using a different world)3");

	@OriginalMember(owner = "client!sa", name = "Fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_593 = Static13.method257("");

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_587 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_588 = Static13.method257("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_589 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[520];

	@OriginalMember(owner = "client!sa", name = "tb", descriptor = "Lclient!o;")
	public static Class40 aClass40_590 = Static13.method257(" with @lre@");

	@OriginalMember(owner = "client!sa", name = "yb", descriptor = "Lclient!o;")
	public static Class40 aClass40_591 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_592 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "Kb", descriptor = "I")
	public static int anInt2039 = 0;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	public static void method1382() {
		aClass40_586 = null;
		aClass40_591 = null;
		aByteArray17 = null;
		anIntArrayArray20 = null;
		aClass40_587 = null;
		aClass40_592 = null;
		textLoadedUpdateList = null;
		aClass40_588 = null;
		aClass40_590 = null;
		aClass40_589 = null;
		aClass40_593 = null;
		aClass40_585 = null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)I")
	public static int method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(29) int local29 = arg0;
		if (arg0 < 3 && (Static61.aByteArrayArrayArray7[1][local11][local7] & 0x2) == 2) {
			local29 = arg0 + 1;
		}
		@Pc(50) int local50 = arg1 & 0x7F;
		@Pc(54) int local54 = arg2 & 0x7F;
		@Pc(81) int local81 = (128 - local50) * Static91.anIntArrayArrayArray8[local29][local11][local7] + Static91.anIntArrayArrayArray8[local29][local11 + 1][local7] * local50 >> 7;
		@Pc(113) int local113 = Static91.anIntArrayArrayArray8[local29][local11][local7 + 1] * (128 - local50) + local50 * Static91.anIntArrayArrayArray8[local29][local11 + 1][local7 + 1] >> 7;
		return local54 * local113 + local81 * (128 - local54) >> 7;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[B)V")
	public static void method1384(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Packet local10 = new Packet(arg0);
		local10.pos = arg0.length - 2;
		Static30.anInt727 = local10.g2();
		Static91.aByteArrayArray10 = new byte[Static30.anInt727][];
		Static66.anIntArray338 = new int[Static30.anInt727];
		Static97.anIntArray503 = new int[Static30.anInt727];
		Static19.anIntArray86 = new int[Static30.anInt727];
		Static83.anIntArray430 = new int[Static30.anInt727];
		local10.pos = arg0.length - Static30.anInt727 * 8 - 7;
		Static44.anInt1079 = local10.g2();
		Static104.anInt2513 = local10.g2();
		@Pc(64) int local64 = (local10.g1() & 0xFF) + 1;
		for (@Pc(66) int local66 = 0; local66 < Static30.anInt727; local66++) {
			Static83.anIntArray430[local66] = local10.g2();
		}
		for (@Pc(80) int local80 = 0; local80 < Static30.anInt727; local80++) {
			Static97.anIntArray503[local80] = local10.g2();
		}
		for (@Pc(98) int local98 = 0; local98 < Static30.anInt727; local98++) {
			Static66.anIntArray338[local98] = local10.g2();
		}
		for (@Pc(116) int local116 = 0; local116 < Static30.anInt727; local116++) {
			Static19.anIntArray86[local116] = local10.g2();
		}
		local10.pos = arg0.length - (local64 - 1) * 3 - Static30.anInt727 * 8 - 7;
		Static20.anIntArray92 = new int[local64];
		for (@Pc(154) int local154 = 1; local154 < local64; local154++) {
			Static20.anIntArray92[local154] = local10.method1718();
			if (Static20.anIntArray92[local154] == 0) {
				Static20.anIntArray92[local154] = 1;
			}
		}
		local10.pos = 0;
		for (@Pc(179) int local179 = 0; local179 < Static30.anInt727; local179++) {
			@Pc(185) int local185 = Static66.anIntArray338[local179];
			@Pc(189) int local189 = Static19.anIntArray86[local179];
			@Pc(193) int local193 = local185 * local189;
			@Pc(196) byte[] local196 = new byte[local193];
			Static91.aByteArrayArray10[local179] = local196;
			@Pc(206) int local206 = local10.g1();
			@Pc(213) int local213;
			if (local206 == 0) {
				for (local213 = 0; local213 < local193; local213++) {
					local196[local213] = local10.g1b();
				}
			} else if (local206 == 1) {
				for (local213 = 0; local213 < local185; local213++) {
					for (@Pc(236) int local236 = 0; local236 < local189; local236++) {
						local196[local185 * local236 + local213] = local10.g1b();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V")
	public static void method1385() {
		if (Static102.anInt2473 == 0) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (Static84.anInt1973 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static63.aClass40Array30[local21] != null) {
				@Pc(31) int local31 = Static76.anIntArray469[local21];
				@Pc(35) Class40 local35 = Static106.aClass40Array40[local21];
				if (local35 != null && local35.method1168(Static42.aClass40_323)) {
					local35 = local35.method1185(5);
				}
				if (local35 != null && local35.method1168(Static92.aClass40_622)) {
					local35 = local35.method1185(5);
				}
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static104.privateChatSetting == 0 || Static104.privateChatSetting == 1 && Static38.method729(local35))) {
					@Pc(85) int local85 = 329 - local15 * 13;
					if (Static32.anInt742 > 4 && local85 - 10 < Static100.anInt2394 + -4 && local85 + 3 >= Static100.anInt2394 + -4) {
						@Pc(129) int local129 = Static103.aClass2_Sub2_Sub2_Sub2_5.method568(Static80.method1334(new Class40[] { Static3.aClass40_18, local35, Static63.aClass40Array30[local21] })) + 25;
						if (local129 > 450) {
							local129 = 450;
						}
						if (local129 + 4 > Static32.anInt742) {
							if (Static61.anInt1550 >= 1) {
								Static21.method402(Static80.method1334(new Class40[] { Static16.aClass40_111, local35 }), 2042, 0, 0, 0);
							}
							Static21.method402(Static80.method1334(new Class40[] { Static88.aClass40_604, local35 }), 2012, 0, 0, 0);
							Static21.method402(Static80.method1334(new Class40[] { Static15.aClass40_535, local35 }), 2051, 0, 0, 0);
						}
					}
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
				if ((local31 == 5 || local31 == 6) && Static104.privateChatSetting < 2) {
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
	public static void method1386() {
		if (Static96.anInt2328 != 0 || anInt2030 != 1) {
			return;
		}
		@Pc(17) int local17 = Static90.anInt2133 - 9;
		@Pc(23) int local23 = Static107.anInt2500 - 25 - 550;
		if (local23 < 0 || local17 < 0 || local23 >= 146 || local17 >= 151) {
			return;
		}
		local23 -= 73;
		local17 -= 75;
		@Pc(45) int local45 = Static67.anInt1669 + Static84.anInt1978 & 0x7FF;
		@Pc(49) int local49 = Class2_Sub2_Sub2_Sub1.sin[local45];
		@Pc(57) int local57 = (Static15.anInt1857 + 256) * local49 >> 8;
		@Pc(61) int local61 = Class2_Sub2_Sub2_Sub1.cos[local45];
		@Pc(69) int local69 = local61 * (Static15.anInt1857 + 256) >> 8;
		@Pc(79) int local79 = local23 * local69 + local17 * local57 >> 11;
		@Pc(90) int local90 = local69 * local17 - local57 * local23 >> 11;
		@Pc(98) int local98 = Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 - local90 >> 7;
		@Pc(106) int local106 = Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 + local79 >> 7;
		@Pc(126) boolean local126 = Static83.method1349(local98, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 1, true, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local106);
		if (!local126) {
			return;
		}
		Static80.out.p1(local23);
		Static80.out.p1(local17);
		Static80.out.method1694(Static67.anInt1669);
		Static80.out.p1(57);
		Static80.out.p1(Static84.anInt1978);
		Static80.out.p1(Static15.anInt1857);
		Static80.out.p1(89);
		Static80.out.method1694(Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275);
		Static80.out.method1694(Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284);
		Static80.out.p1(Static101.anInt2400);
		Static80.out.p1(63);
		return;
	}
}

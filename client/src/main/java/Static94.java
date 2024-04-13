import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_23;

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "[I")
	public static int[] anIntArray544;

	@OriginalMember(owner = "client!vc", name = "nb", descriptor = "J")
	public static long aLong150;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!kc;III)V", line = 11)
	public static void method1638(@OriginalArg(0) int arg0, @OriginalArg(1) PlayerEntity arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1 == arg1 || Static1.anInt797 >= 400) {
			return;
		}
		@Pc(44) JagString local44;
		if (arg1.anInt1373 == 0) {
			local44 = Static72.method1334(new JagString[] { arg1.aClass40_395, Static14.method1260(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378, arg1.anInt1378), JagString.aClass40_731, Static48.method859(arg1.anInt1378), JagString.aClass40_609 });
		} else {
			local44 = Static72.method1334(new JagString[] { arg1.aClass40_395, JagString.aClass40_556, Static48.method859(arg1.anInt1373), JagString.aClass40_609 });
		}
		@Pc(122) int local122;
		if (Static1.anInt1874 == 1) {
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_657, local44 }), 25, arg0, arg2, arg3);
		} else if (Static1.anInt641 != 1) {
			for (local122 = 4; local122 >= 0; local122--) {
				if (Static1.aClass40Array6[local122] != null) {
					@Pc(134) short local134 = 0;
					@Pc(136) int local136 = 0;
					if (Static1.aClass40Array6[local122].method1199(JagString.aClass40_729)) {
						if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378 < arg1.anInt1378) {
							local134 = 2000;
						}
						if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1382 != 0 && arg1.anInt1382 != 0) {
							if (arg1.anInt1382 == Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1382) {
								local134 = 2000;
							} else {
								local134 = 0;
							}
						}
					} else if (Static1.aBooleanArray41[local122]) {
						local134 = 2000;
					}
					if (local122 == 0) {
						local136 = local134 + 15;
					}
					if (local122 == 1) {
						local136 = local134 + 30;
					}
					if (local122 == 2) {
						local136 = local134 + 43;
					}
					if (local122 == 3) {
						local136 = local134 + 38;
					}
					if (local122 == 4) {
						local136 = local134 + 33;
					}
					Static20.method402(Static72.method1334(new JagString[] { Static1.aClass40Array6[local122], JagString.aClass40_30, local44 }), local136, arg0, arg2, arg3);
				}
			}
		} else if ((Static78.anInt2027 & 0x8) == 8) {
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_567, JagString.aClass40_30, local44 }), 36, arg0, arg2, arg3);
		}
		for (local122 = 0; local122 < Static1.anInt797; local122++) {
			if (Static1.anIntArray287[local122] == 24) {
				Static1.aClass40Array8[local122] = Static72.method1334(new JagString[] { JagString.aClass40_526, local44 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V", line = 297)
	public static void method1643() {
		Static1.anIntArray546 = null;
		JagString.aClass40_713 = null;
		JagString.aClass40_708 = null;
		JagString.aClass40_712 = null;
		anIntArray544 = null;
		JagString.aClass40_709 = null;
		JagString.aClass40_711 = null;
		aClass2_Sub2_Sub2_Sub3_23 = null;
		JagString.aClass40_710 = null;
		Static1.aCRC32_2 = null;
		Static1.anIntArray545 = null;
	}
}

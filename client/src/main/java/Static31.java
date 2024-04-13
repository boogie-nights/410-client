import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!gb", name = "Db", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!gb", name = "Fb", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_9;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!mc;B)Z", line = 140)
	public static boolean method607(@OriginalArg(0) ComType arg0) {
		@Pc(13) int local13 = arg0.anInt1610;
		if (local13 >= 1 && local13 <= 200 || !(local13 < 701 || local13 > 900)) {
			if (local13 >= 801) {
				local13 -= 701;
			} else if (local13 >= 701) {
				local13 -= 601;
			} else if (local13 >= 101) {
				local13 -= 101;
			} else {
				local13--;
			}
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_240, Static1.aClass40Array23[local13] }), 2, 0, 0, 0);
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_108, Static1.aClass40Array23[local13] }), 20, 0, 0, 0);
			return true;
		} else if (local13 >= 401 && local13 <= 500) {
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_240, arg0.aClass40_466 }), 45, 0, 0, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V", line = 215)
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static1.anIntArrayArrayArray8[arg1][arg0 + local3][arg2 + local7] = 0;
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static1.anIntArrayArrayArray8[arg1][arg0][local7 + arg2] = Static1.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static1.anIntArrayArrayArray8[arg1][local7 + arg0][arg2] = Static1.anIntArrayArrayArray8[arg1][arg0 + local7][arg2 - 1];
			}
		}
		if (arg0 > 0 && Static1.anIntArrayArrayArray8[arg1][arg0 - 1][arg2] != 0) {
			Static1.anIntArrayArrayArray8[arg1][arg0][arg2] = Static1.anIntArrayArrayArray8[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && Static1.anIntArrayArrayArray8[arg1][arg0][arg2 - 1] != 0) {
			Static1.anIntArrayArrayArray8[arg1][arg0][arg2] = Static1.anIntArrayArrayArray8[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && Static1.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 - 1] != 0) {
			Static1.anIntArrayArrayArray8[arg1][arg0][arg2] = Static1.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V", line = 517)
	public static void method613() {
		anIntArray158 = null;
		JagString.aClass40_239 = null;
		aClass2_Sub2_Sub2_Sub3_9 = null;
		Static1.aClass47_8 = null;
		JagString.aClass40_241 = null;
		JagString.aClass40_240 = null;
		Static1.anIntArray152 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)Z", line = 543)
	public static boolean method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && Static1.anInt721 == arg1) {
			return true;
		} else if (arg0 == 1 && Static1.anInt1496 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static1.anInt2466;
		}
	}
}

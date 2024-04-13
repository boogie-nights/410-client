import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!gb", name = "Fb", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_9;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)V", line = 215)
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				World.levelHeightmap[arg1][arg0 + local3][arg2 + local7] = 0;
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				World.levelHeightmap[arg1][arg0][local7 + arg2] = World.levelHeightmap[arg1][arg0 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				World.levelHeightmap[arg1][local7 + arg0][arg2] = World.levelHeightmap[arg1][arg0 + local7][arg2 - 1];
			}
		}
		if (arg0 > 0 && World.levelHeightmap[arg1][arg0 - 1][arg2] != 0) {
			World.levelHeightmap[arg1][arg0][arg2] = World.levelHeightmap[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && World.levelHeightmap[arg1][arg0][arg2 - 1] != 0) {
			World.levelHeightmap[arg1][arg0][arg2] = World.levelHeightmap[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && World.levelHeightmap[arg1][arg0 - 1][arg2 - 1] != 0) {
			World.levelHeightmap[arg1][arg0][arg2] = World.levelHeightmap[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V", line = 517)
	public static void method613() {
		BZip2State.tt = null;
		JagString.WALK_HERE = null;
		aClass2_Sub2_Sub2_Sub3_9 = null;
		ComType.aClass47_8 = null;
		JagString.aClass40_241 = null;
		JagString.aClass40_240 = null;
		client.flameLineOffset = null;
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

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!d;")
	public static BufferedFile cacheDat;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public static int anInt1664;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 23)
	public static void method1093() {
		VarBitType.aClass5_21 = null;
		JagString.aClass40_481 = null;
		JagString.aClass40_480 = null;
		cacheDat = null;
		anIntArray338 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Z", line = 66)
	public static boolean method1094(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

}

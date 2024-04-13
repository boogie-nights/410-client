import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	public static int anInt1173;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I", line = 61)
	public static int mulHSL(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 87)
	public static void method850() {
		Static1.aClass47_17.clear();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 222)
	public static void method852() {
		JagString.aClass40_358 = null;
		Static1.anIntArray257 = null;
		Static1.anIntArray258 = null;
		JagString.aClass40_359 = null;
		JagString.aClass40_361 = null;
		JagString.aClass40_360 = null;
	}
}

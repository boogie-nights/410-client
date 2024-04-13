import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!va", name = "A", descriptor = "Z")
	public static boolean aBoolean179;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "J")
	public static long aLong143;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 361)
	public static void method1591() {
		Static1.anIntArray519 = null;
		JagString.aClass40_693 = null;
		Static1.anIntArray518 = null;
		JagString.aClass40_694 = null;
		JagString.aClass40_695 = null;
		client.aClass2_Sub2_Sub2_Sub4Array10 = null;
		JagString.aClass40_692 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ud;Lclient!ud;)I", line = 430)
	public static int method1592(@OriginalArg(1) Js5Index arg0, @OriginalArg(2) Js5Index arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method73(JagString.aClass40_593, JagString.aClass40_463)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_593, JagString.aClass40_521)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_593, JagString.aClass40_16)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_593, JagString.aClass40_661)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_593, JagString.aClass40_563)) {
			local5++;
		}
		return local5;
	}

}

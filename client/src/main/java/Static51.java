import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ke", name = "nb", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!ke", name = "Fb", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_29;

	@OriginalMember(owner = "client!ke", name = "Bc", descriptor = "I")
	public static int anInt2325;

	@OriginalMember(owner = "client!ke", name = "Dc", descriptor = "I")
	public static int anInt2327;

	@OriginalMember(owner = "client!ke", name = "Ec", descriptor = "[Lclient!qb;")
	public static Pix8[] aClass2_Sub2_Sub2_Sub3Array15;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V", line = 167)
	public static void method1541() {
		if (Static1.aClass62_1 != null) {
			@Pc(3) Mouse local3 = Static1.aClass62_1;
			synchronized (local3) {
				Static1.aClass62_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lclient!o;", line = 190)
	public static JagString method1542(@OriginalArg(0) int arg0) {
		@Pc(15) JagString local15 = Static48.method859(arg0);
		for (@Pc(21) int local21 = local15.length() - 3; local21 > 0; local21 -= 3) {
			local15 = JagString.concatenate(new JagString[] { local15.method1180(local21, 0), JagString.aClass40_672, local15.method1185(local21) });
		}
		if (local15.length() > 8) {
			local15 = JagString.concatenate(new JagString[] { JagString.aClass40_689, local15.method1180(local15.length() - 8, 0), JagString.aClass40_405, local15, JagString.aClass40_609 });
		} else if (local15.length() > 4) {
			local15 = JagString.concatenate(new JagString[] { JagString.aClass40_678, local15.method1180(local15.length() - 4, 0), JagString.aClass40_221, local15, JagString.aClass40_609 });
		}
		return JagString.concatenate(new JagString[] { JagString.aClass40_716, local15 });
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V", line = 401)
	public static void method1546() {
		JagString.aClass40_658 = null;
		JagString.aClass40_656 = null;
		aClass5_29 = null;
		JagString.aClass40_657 = null;
		client.in = null;
		aClass2_Sub2_Sub2_Sub3Array15 = null;
		JagString.aClass40_659 = null;
	}

}

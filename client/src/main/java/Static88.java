import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ua", name = "Mc", descriptor = "Lclient!vb;")
	public static Pix24 aClass2_Sub2_Sub2_Sub4_9;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "(I)V", line = 1203)
	public static void method1550() {
		if (Static29.aClass25_48 != null) {
			Static29.aClass25_48.close();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)V", line = 1263)
	public static void method1552(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static45.method1537(JagString.aClass40_537, JagString.aClass40_586);
		} else if (arg0 == -2) {
			Static45.method1537(JagString.EMPTY_STRING, JagString.aClass40_573);
		} else if (arg0 == -1) {
			Static45.method1537(JagString.aClass40_157, JagString.aClass40_586);
		} else if (arg0 == 3) {
			Static45.method1537(JagString.EMPTY_STRING, JagString.aClass40_117);
		} else if (arg0 == 4) {
			Static45.method1537(JagString.aClass40_15, JagString.aClass40_488);
		} else if (arg0 == 5) {
			Static45.method1537(JagString.aClass40_732, JagString.aClass40_427);
		} else if (arg0 == 6) {
			Static45.method1537(JagString.aClass40_588, JagString.aClass40_192);
		} else if (arg0 == 7) {
			Static45.method1537(JagString.aClass40_141, JagString.aClass40_570);
		} else if (arg0 == 8) {
			Static45.method1537(JagString.aClass40_410, JagString.aClass40_529);
		} else if (arg0 == 9) {
			Static45.method1537(JagString.aClass40_645, JagString.aClass40_608);
		} else if (arg0 == 10) {
			Static45.method1537(JagString.aClass40_410, JagString.aClass40_713);
		} else if (arg0 == 11) {
			Static45.method1537(JagString.aClass40_341, JagString.aClass40_336);
		} else if (arg0 == 12) {
			Static45.method1537(JagString.aClass40_656, JagString.aClass40_631);
		} else if (arg0 == 13) {
			Static45.method1537(JagString.aClass40_84, JagString.aClass40_586);
		} else if (arg0 == 14) {
			Static45.method1537(JagString.aClass40_742, JagString.aClass40_518);
		} else if (arg0 == 16) {
			Static45.method1537(JagString.aClass40_575, JagString.aClass40_518);
		} else if (arg0 == 17) {
			Static45.method1537(JagString.aClass40_615, JagString.aClass40_338);
		} else if (arg0 == 18) {
			Static45.method1537(JagString.aClass40_406, JagString.aClass40_603);
		} else if (arg0 == 20) {
			Static45.method1537(JagString.aClass40_688, JagString.aClass40_586);
		} else if (arg0 == 22) {
			Static45.method1537(JagString.aClass40_257, JagString.aClass40_366);
		} else if (arg0 == 23) {
			Static45.method1537(JagString.aClass40_162, JagString.aClass40_518);
		} else if (arg0 == 24) {
			Static45.method1537(JagString.aClass40_559, JagString.aClass40_611);
		} else if (arg0 == 25) {
			Static45.method1537(JagString.aClass40_658, JagString.aClass40_586);
		} else if (arg0 == 26) {
			Static45.method1537(JagString.aClass40_104, JagString.aClass40_662);
		} else {
			Static45.method1537(JagString.concatenate(new JagString[] { JagString.aClass40_585, Static48.method859(arg0) }), JagString.aClass40_586);
		}
		client.setState(10);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V", line = 1542)
	public static void method1554() {
		JagString.aClass40_661 = null;
		JagString.aClass40_663 = null;
		JagString.aClass40_662 = null;
		Static1.anIntArray497 = null;
		Static1.aClass44_8 = null;
		aClass2_Sub2_Sub2_Sub4_9 = null;
	}

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "(I)[Lclient!qb;", line = 1567)
	public static Pix8[] method1555() {
		@Pc(4) Pix8[] local4 = new Pix8[Static28.anInt727];
		for (@Pc(10) int local10 = 0; local10 < Static28.anInt727; local10++) {
			@Pc(20) Pix8 local20 = local4[local10] = new Pix8();
			local20.anInt1908 = Static96.anInt2513;
			local20.anInt1909 = Static41.anInt1079;
			local20.anInt1907 = Static75.anIntArray430[local10];
			local20.anInt1906 = Static89.anIntArray503[local10];
			local20.anInt1905 = Static61.anIntArray338[local10];
			local20.anInt1910 = Static18.anIntArray86[local10];
			local20.anIntArray427 = Static19.anIntArray92;
			local20.aByteArray16 = Static83.aByteArrayArray10[local10];
		}
		Static85.method1485();
		return local4;
	}
}

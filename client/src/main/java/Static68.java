import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_24;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Z")
	public static boolean aBoolean145;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Lclient!cb;")
	public static Cache aClass11_4;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!ad;")
	public static Js5 midiJinglesJs5;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 9)
	public static void method1209() {
		for (@Pc(15) LocTemporary local15 = (LocTemporary) Static1.spawnedLocations.head(); local15 != null; local15 = (LocTemporary) Static1.spawnedLocations.next()) {
			if (local15.anInt826 > 0) {
				local15.anInt826--;
			}
			if (local15.anInt826 != 0) {
				if (local15.anInt827 > 0) {
					local15.anInt827--;
				}
				if (local15.anInt827 == 0 && local15.x >= 1 && local15.z >= 1 && local15.x <= 102 && local15.z <= 102 && (local15.anInt828 < 0 || Static73.method1335(local15.anInt828, local15.anInt819))) {
					Static90.method1566(local15.anInt823, local15.x, local15.z, local15.anInt819, local15.level, local15.anInt828, local15.anInt829);
					local15.anInt827 = -1;
					if (local15.anInt828 == local15.anInt820 && local15.anInt820 == -1) {
						local15.method1677();
					} else if (local15.anInt820 == local15.anInt828 && local15.anInt825 == local15.anInt829 && local15.anInt819 == local15.anInt830) {
						local15.method1677();
					}
				}
			} else if (local15.anInt820 < 0 || Static73.method1335(local15.anInt820, local15.anInt830)) {
				Static90.method1566(local15.anInt823, local15.x, local15.z, local15.anInt830, local15.level, local15.anInt820, local15.anInt825);
				local15.method1677();
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V", line = 66)
	public static void method1210() {
		Static1.aClass47_14.method1330();
		Static1.aClass47_19.method1330();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 79)
	public static void method1211() {
		midiJinglesJs5 = null;
		JagString.aClass40_526 = null;
		Static1.aClass41_1 = null;
		JagString.aClass40_523 = null;
		aClass11_4 = null;
		Static1.aClass47_15 = null;
		JagString.aClass40_524 = null;
		JagString.aClass40_522 = null;
		JagString.aClass40_525 = null;
		aClass5_24 = null;
		aByteArrayArrayArray8 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	public static int anInt2172;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!p;")
	public static PixMap aClass45_29;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 761)
	public static void method1482() {
		JagString.BUTTON_OK = null;
		Static1.spawnedLocations = null;
		JagString.aClass40_620 = null;
		SpotAnimType.aClass5_28 = null;
		JagString.aClass40_619 = null;
		JagString.aClass40_622 = null;
		aClass45_29 = null;
		anIntArray472 = null;
		aBooleanArray31 = null;
		JagString.aClass40_618 = null;
		JagString.aClass40_621 = null;
		LocType.aClass47_21 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ud;Z)V", line = 783)
	public static void method1483(@OriginalArg(0) Js5Index arg0) {
		Static26.aClass5_9 = arg0;
		Static54.anInt1505 = Static26.aClass5_9.getGroupCapacity(16);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ud;I)Z", line = 795)
	public static boolean method1484(@OriginalArg(0) int arg0, @OriginalArg(2) Js5Index arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.fetchFile(arg0, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static78.method1384(local9);
			return true;
		}
	}
}

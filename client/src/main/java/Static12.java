import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!vb;")
	public static Pix24 aClass2_Sub2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 17)
	public static void method254() {
		JagString.aClass40_82 = null;
		Static1.anIntArray80 = null;
		Static1.anIntArray79 = null;
		Static1.aClass40Array6 = null;
		aClass2_Sub2_Sub2_Sub4Array3 = null;
		JagString.aClass40_83 = null;
		aClass2_Sub2_Sub2_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V", line = 48)
	public static void method255() {
		for (@Pc(18) LocTemporary local18 = (LocTemporary) Static1.spawnedLocations.head(); local18 != null; local18 = (LocTemporary) Static1.spawnedLocations.next()) {
			if (local18.anInt826 == -1) {
				local18.anInt827 = 0;
				Static4.method86(local18);
			} else {
				local18.unlink();
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ud;IB)Lclient!fc;", line = 340)
	public static PixFont method260(@OriginalArg(0) int arg0, @OriginalArg(1) Js5Index arg1, @OriginalArg(2) int arg2) {
		return Static84.method1484(arg2, arg1, arg0) ? Static20.method406() : null;
	}
}

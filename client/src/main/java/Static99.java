import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public static int anInt2497;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt2498;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!p;")
	public static PixMap aClass45_31;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 14)
	public static void method1653() {
		JagString.aClass40_720 = null;
		JagString.aClass40_719 = null;
		JagString.aClass40_718 = null;
		JagString.aClass40_722 = null;
		JagString.aClass40_721 = null;
		JagString.aClass40_717 = null;
		aClass45_31 = null;
		JagString.aClass40_716 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!pc;)V", line = 77)
	public static synchronized void method1657(@OriginalArg(1) PcmStream arg0) {
		Static20.aClass2_Sub10_1 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V", line = 353)
	public static void method1661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		@Pc(17) Js5NetRequest local17 = (Js5NetRequest) Static1.aClass6_7.get(local11);
		if (local17 != null) {
			Static1.aClass41_1.addTail(local17);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 394)
	public static int method1662(@OriginalArg(1) int arg0) {
		@Pc(7) VarBitType local7 = VarBitType.method621(arg0);
		@Pc(10) int local10 = local7.anInt171;
		@Pc(13) int local13 = local7.anInt174;
		@Pc(16) int local16 = local7.anInt170;
		@Pc(23) int local23 = Static1.anIntArray518[local16 - local10];
		return local23 & client.varps[local13] >> local10;
	}

}

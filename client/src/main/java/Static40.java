import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt1849;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
	public static boolean aBoolean150;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 254)
	public static void method1245() {
		client.aClass2_Sub2_Sub2_Sub4_7 = null;
		FloorUnderlayType.config = null;
		client.animsJs5 = null;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 590)
	public static void method1247() {
		Static11.aClass45_6.bind();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I", line = 602)
	public static int method1248(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static92 {

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 56)
	public static void method1580() {
		JagString.aClass40_688 = null;
		JagString.aClass40_690 = null;
		JagString.aClass40_689 = null;
		client.actionKey = null;
		JagString.aClass40_691 = null;
		client.players = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lclient!o;", line = 71)
	public static JagString method1581(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static48.method859(arg0) : JagString.aClass40_116;
	}

	// todo: ReflectionCheck
	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 121)
	public static Class method1583(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 161)
	public static void method1584() {
		Static1.aClass44_9 = new LinkList();
	}
}

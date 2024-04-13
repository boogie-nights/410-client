import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!d;")
	public static BufferedFile cacheMasterIndex;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt2526;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZI)I", line = 5)
	public static int method1668() {
		return Static1.anInt2333 + Static1.anInt34;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 64)
	public static void method1670() {
		GameShell.frame = null;
		JagString.aClass40_726 = null;
		Static1.aClass6_7 = null;
		JagString.aClass40_728 = null;
		JagString.aClass40_725 = null;
		JagString.aClass40_727 = null;
		JagString.aClass40_729 = null;
		aByteArrayArray12 = null;
		cacheMasterIndex = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI)V", line = 1011)
	public static void sleep(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

}

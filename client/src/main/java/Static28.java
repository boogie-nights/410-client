import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!p;")
	public static Class45 aClass45_15;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_10;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt725;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public static int anInt727;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 7)
	public static void method584() {
		aClass45_15 = null;
		aClass2_Sub2_Sub2_Sub4Array5 = null;
		aClass5_10 = null;
		Static1.aByteArrayArray8 = null;
		JagString.aClass40_220 = null;
		JagString.aClass40_223 = null;
		JagString.aClass40_221 = null;
		JagString.aClass40_222 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!bb;ZB)Z", line = 45)
	public static boolean method585(@OriginalArg(0) SignLink arg0, @OriginalArg(1) boolean arg1) {
		Static1.anInt432 = 20;
		try {
			Static98.aClass12_1 = (AudioBuss2) Class.forName("JavaMidiAudioBuss").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(17) Interface3 local17 = arg0.method205();
			if (local17 != null) {
				Static98.aClass12_1 = new NewMidiAudioBuss(arg0, local17);
				return true;
			} else if (arg1) {
				Static98.aClass12_1 = new LegacyMidiAudioBuss(arg0);
				return true;
			} else {
				return false;
			}
		}
	}
}

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "Lclient!p;")
	public static PixMap aClass45_21;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!rd;")
	public static MouseRecorder aClass52_1;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V", line = 18)
	public static void method787(@OriginalArg(0) boolean arg0) {
		if (Static29.aClass25_48 == null) {
			return;
		}
		try {
			@Pc(11) Packet local11 = new Packet(4);
			local11.p1(arg0 ? 2 : 3);
			local11.p3(0);
			Static29.aClass25_48.method731(local11.data, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				Static29.aClass25_48.method730();
			} catch (@Pc(37) Exception local37) {
			}
			Static29.aClass25_48 = null;
			Static1.anInt2401++;
		}
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V", line = 109)
	public static void method790() {
		aClass45_21 = null;
		JagString.aClass40_333 = null;
		JagString.aClass40_334 = null;
		aClass2_Sub2_Sub2_Sub4Array6 = null;
		JagString.aClass40_335 = null;
		aClass52_1 = null;
		JagString.aClass40_331 = null;
		JagString.aClass40_330 = null;
		JagString.aClass40_332 = null;
	}
}

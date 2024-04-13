import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 9)
	public static void method801() {
		Static24.aFontMetrics1 = null;
		Static71.anImage4 = null;
		Static20.aFont1 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 32)
	public static void method802() {
		JagString.aClass40_336 = null;
		JagString.aClass40_338 = null;
		JagString.aClass40_342 = null;
		JagString.aClass40_339 = null;
		Static1.aClass47_12 = null;
		JagString.aClass40_341 = null;
		JagString.aClass40_340 = null;
		anIntArray225 = null;
		JagString.aClass40_337 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[B", line = 79)
	public static synchronized byte[] method803(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static1.anInt737 > 0) {
			local19 = Static1.aByteArrayArray3[--Static1.anInt737];
			Static1.aByteArrayArray3[Static1.anInt737] = null;
			return local19;
		} else if (arg0 == 5000 && Static1.anInt965 > 0) {
			local19 = Static1.aByteArrayArray8[--Static1.anInt965];
			Static1.aByteArrayArray8[Static1.anInt965] = null;
			return local19;
		} else if (arg0 == 30000 && Static1.anInt264 > 0) {
			local19 = Static1.aByteArrayArray9[--Static1.anInt264];
			Static1.aByteArrayArray9[Static1.anInt264] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}

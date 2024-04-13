import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ne", name = "Rb", descriptor = "I")
	public static int anInt1746;

	@OriginalMember(owner = "client!ne", name = "ec", descriptor = "I")
	public static int anInt1749;

	@OriginalMember(owner = "client!ne", name = "tc", descriptor = "I")
	public static int anInt1751;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I", line = 676)
	public static int method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return Model.anIntArray405[arg1];
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "()V", line = 1056)
	public static void method1150() {
		Model.aClass2_Sub2_Sub12_Sub4_2 = null;
		Model.anIntArray384 = null;
		Model.aClass2_Sub2_Sub12_Sub4_3 = null;
		Model.anIntArray399 = null;
		Model.aBooleanArray26 = null;
		Model.aBooleanArray25 = null;
		Model.anIntArray389 = null;
		Model.anIntArray388 = null;
		Model.anIntArray401 = null;
		Model.anIntArray396 = null;
		Model.anIntArray397 = null;
		Model.anIntArray390 = null;
		Model.anIntArray391 = null;
		Model.anIntArrayArray19 = null;
		Model.anIntArray385 = null;
		Model.anIntArrayArray18 = null;
		Model.anIntArray394 = null;
		Model.anIntArray403 = null;
		Model.anIntArray398 = null;
		Model.anIntArray393 = null;
		Model.anIntArray400 = null;
		Model.anIntArray404 = null;
		Model.anIntArray387 = null;
		Model.anIntArray386 = null;
		Model.anIntArray402 = null;
		Model.anIntArray392 = null;
		Model.anIntArray395 = null;
		Model.anIntArray405 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ud;II)Lclient!ne;", line = 1995)
	public static Model method1163(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) int arg1) {
		@Pc(5) byte[] local5 = arg0.fetchFile(0, arg1);
		return local5 == null ? null : new Model(local5);
	}
}

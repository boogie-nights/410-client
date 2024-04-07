package jagex2.graphics;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Draw3D extends Draw2D {

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "[I")
	public static int[] sin = new int[2048];

	@OriginalMember(owner = "client!b", name = "V", descriptor = "[I")
	public static int[] cos = new int[2048];

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "[I")
	public static int[] reciprocal15 = new int[512];

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "[I")
	public static int[] reciprocal16 = new int[2048];

	static {
		for (@Pc(26) int i = 1; i < 512; i++) {
			reciprocal15[i] = 32768 / i;
		}
		for (@Pc(39) int i = 1; i < 2048; i++) {
			reciprocal16[i] = 65536 / i;
		}
		for (@Pc(52) int i = 0; i < 2048; i++) {
			sin[i] = (int) (Math.sin((double) i * 0.0030679615D) * 65536.0D);
			cos[i] = (int) (Math.cos((double) i * 0.0030679615D) * 65536.0D);
		}
	}
}

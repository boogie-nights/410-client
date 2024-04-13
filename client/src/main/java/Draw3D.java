import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Draw3D extends Draw2D {

	@OriginalMember(owner = "client!b", name = "V", descriptor = "[I")
	public static int[] cos = new int[2048];

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "Z")
	public static boolean aBoolean18 = true;

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!b", name = "jb", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "[I")
	public static int[] reciprocal15 = new int[512];

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "[I")
	public static int[] sin = new int[2048];

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
	public static int anInt228 = 0;

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "[I")
	public static int[] reciprocal16 = new int[2048];

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "[I")
	public static int[] anIntArray63 = new int[65536];

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "Lclient!ld;")
	public static TextureProvider anInterface4_1;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "[I")
	static int[] anIntArray62;

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

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()V", line = 2553)
	public static void unload() {
		anIntArray62 = null;
		anIntArray63 = null;
		anInterface4_1 = null;
		reciprocal15 = null;
		reciprocal16 = null;
		sin = null;
		cos = null;
	}
}

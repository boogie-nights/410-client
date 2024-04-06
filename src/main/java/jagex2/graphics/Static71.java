package jagex2.graphics;

import jagex2.Class2_Sub2_Sub2_Sub1;
import jagex2.Class5;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ne", name = "Rb", descriptor = "I")
	public static int baseX;

	@OriginalMember(owner = "client!ne", name = "ec", descriptor = "I")
	public static int baseY;

	@OriginalMember(owner = "client!ne", name = "tc", descriptor = "I")
	public static int baseZ;

	@OriginalMember(owner = "client!ne", name = "Mb", descriptor = "Lclient!ne;")
	public static Model aClass2_Sub2_Sub12_Sub4_2 = new Model();

	@OriginalMember(owner = "client!ne", name = "Ob", descriptor = "Lclient!ne;")
	public static Model aModel_3 = new Model();

	@OriginalMember(owner = "client!ne", name = "Pb", descriptor = "[I")
	public static int[] anIntArray384 = new int[1];

	@OriginalMember(owner = "client!ne", name = "Qb", descriptor = "[I")
	public static int[] anIntArray385 = new int[12];

	@OriginalMember(owner = "client!ne", name = "Sb", descriptor = "I")
	public static int pickedCount = 0;

	@OriginalMember(owner = "client!ne", name = "Tb", descriptor = "[I")
	public static int[] sin = Class2_Sub2_Sub2_Sub1.sin;

	@OriginalMember(owner = "client!ne", name = "Ub", descriptor = "I")
	public static int mouseZ = 0;

	@OriginalMember(owner = "client!ne", name = "Vb", descriptor = "[I")
	public static int[] pickedBitsets = new int[1000];

	@OriginalMember(owner = "client!ne", name = "Wb", descriptor = "[Z")
	public static boolean[] faceNearClipped = new boolean[4096];

	@OriginalMember(owner = "client!ne", name = "Xb", descriptor = "[I")
	public static int[] vertexScreenX = new int[4096];

	@OriginalMember(owner = "client!ne", name = "Yb", descriptor = "[I")
	public static int[] vertexScreenY = new int[4096];

	@OriginalMember(owner = "client!ne", name = "Zb", descriptor = "[I")
	public static int[] vertexViewSpaceZ = new int[4096];

	@OriginalMember(owner = "client!ne", name = "ac", descriptor = "[I")
	public static int[] anIntArray391 = new int[1500];

	@OriginalMember(owner = "client!ne", name = "bc", descriptor = "[I")
	public static int[] anIntArray392 = Static6.anIntArray63;

	@OriginalMember(owner = "client!ne", name = "cc", descriptor = "[I")
	public static int[] anIntArray393 = new int[10];

	@OriginalMember(owner = "client!ne", name = "dc", descriptor = "[I")
	public static int[] anIntArray394 = new int[2000];

	@OriginalMember(owner = "client!ne", name = "fc", descriptor = "[I")
	public static int[] anIntArray395 = Class2_Sub2_Sub2_Sub1.anIntArray61;

	@OriginalMember(owner = "client!ne", name = "gc", descriptor = "[I")
	public static int[] vertexViewSpaceX = new int[4096];

	@OriginalMember(owner = "client!ne", name = "hc", descriptor = "[I")
	public static int[] vertexViewSpaceY = new int[4096];

	@OriginalMember(owner = "client!ne", name = "ic", descriptor = "[I")
	public static int[] anIntArray398 = new int[12];

	@OriginalMember(owner = "client!ne", name = "jc", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!ne", name = "kc", descriptor = "[I")
	public static int[] anIntArray399 = new int[1];

	@OriginalMember(owner = "client!ne", name = "lc", descriptor = "[[I")
	public static int[][] tmpPriorityFaces = new int[12][2000];

	@OriginalMember(owner = "client!ne", name = "mc", descriptor = "[I")
	public static int[] anIntArray400 = new int[10];

	@OriginalMember(owner = "client!ne", name = "nc", descriptor = "[I")
	public static int[] anIntArray401 = new int[4096];

	@OriginalMember(owner = "client!ne", name = "oc", descriptor = "[[I")
	public static int[][] tmpDepthFaces = new int[1500][512];

	@OriginalMember(owner = "client!ne", name = "pc", descriptor = "[I")
	public static int[] cos = Class2_Sub2_Sub2_Sub1.cos;

	@OriginalMember(owner = "client!ne", name = "qc", descriptor = "[Z")
	public static boolean[] faceClippedX = new boolean[4096];

	@OriginalMember(owner = "client!ne", name = "rc", descriptor = "I")
	public static int mouseX = 0;

	@OriginalMember(owner = "client!ne", name = "sc", descriptor = "[I")
	public static int[] anIntArray403 = new int[2000];

	@OriginalMember(owner = "client!ne", name = "uc", descriptor = "[I")
	public static int[] anIntArray404 = new int[10];

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I")
	public static int mulColorLightness(@OriginalArg(0) int hsl, @OriginalArg(1) int scalar, @OriginalArg(2) int faceInfo) {
		if ((faceInfo & 0x2) == 2) {
			if (scalar < 0) {
				scalar = 0;
			} else if (scalar > 127) {
				scalar = 127;
			}
			return Model.anIntArray405[scalar];
		}
		scalar = scalar * (hsl & 0x7F) >> 7;
		if (scalar < 2) {
			scalar = 2;
		} else if (scalar > 126) {
			scalar = 126;
		}
		return (hsl & 0xFF80) + scalar;
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "()V")
	public static void method1150() {
		aClass2_Sub2_Sub12_Sub4_2 = null;
		anIntArray384 = null;
		aModel_3 = null;
		anIntArray399 = null;
		faceClippedX = null;
		faceNearClipped = null;
		vertexScreenY = null;
		vertexScreenX = null;
		anIntArray401 = null;
		vertexViewSpaceX = null;
		vertexViewSpaceY = null;
		vertexViewSpaceZ = null;
		anIntArray391 = null;
		tmpDepthFaces = null;
		anIntArray385 = null;
		tmpPriorityFaces = null;
		anIntArray394 = null;
		anIntArray403 = null;
		anIntArray398 = null;
		anIntArray393 = null;
		anIntArray400 = null;
		anIntArray404 = null;
		pickedBitsets = null;
		sin = null;
		cos = null;
		anIntArray392 = null;
		anIntArray395 = null;
		Model.anIntArray405 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ud;II)Lclient!ne;")
	public static Model method1163(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int model) {
		@Pc(5) byte[] local5 = arg0.method68(0, model);
		return local5 == null ? null : new Model(local5);
	}
}

package jagex2;

import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
	public static int[] tmpScreenX = new int[6];

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public static int[] tmpScreenY = new int[6];

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "[I")
	public static int[] tmpViewspaceZ = new int[6];

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
	public static int[] tmpViewspaceY = new int[6];

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "[I")
	public static int[] tmpViewspaceX = new int[6];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public static void method1102() {
		tmpScreenX = null;
		tmpScreenY = null;
		tmpViewspaceX = null;
		tmpViewspaceY = null;
		tmpViewspaceZ = null;
		anIntArrayArray14 = null;
		anIntArrayArray13 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!d;")
	public static BufferedFile cacheDat;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public static int anInt1664;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 23)
	public static void method1093() {
		VarBitType.aClass5_21 = null;
		JagString.aClass40_481 = null;
		JagString.aClass40_480 = null;
		cacheDat = null;
		anIntArray338 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Z", line = 66)
	public static boolean method1094(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!o;Lclient!o;I)V", line = 100)
	public static void method1095(@OriginalArg(0) boolean arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) JagString arg2) {
		@Pc(5) short local5 = 151;
		@Pc(6) int local6 = local5 - 3;
		if (Static1.aBoolean1) {
			Static1.aBoolean1 = false;
			Static39.method768(client.graphics);
			Static4.method83(client.graphics);
			Static67.method1207(client.graphics);
			Static30.method594(client.graphics);
			Static99.method1664(Static1.anInt2515, client.graphics, Static95.aClass2_Sub2_Sub2_Sub2_5, Static1.anInt2491, Static1.anInt583);
			Static85.method1487(Static1.anInt1551, Static1.anIntArray2, -1, Static1.anInt1654 == -1, client.graphics);
			Static1.aBoolean23 = true;
			Static1.aBoolean165 = true;
			Static1.aBoolean13 = true;
		}
		Static69.method1230();
		Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg2, 257, 148, 0);
		Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local6 += 15;
			if (arg0) {
				@Pc(81) int local81 = Static95.aClass2_Sub2_Sub2_Sub2_5.method568(arg1) + 4;
				Static25.method1612(257 - local81 / 2, 152, local81, 11, 0);
			}
			Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg1, 257, 163, 0);
			Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg1, 256, 162, 16777215);
		}
		client.drawViewport(client.graphics);
	}
}

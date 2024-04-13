import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt1914;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!p;")
	public static PixMap aClass45_27;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!wd;")
	public static StubAudioChannel aClass24_1;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!p;")
	public static PixMap aClass45_28;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!qd;")
	public static PrivilegedRequest aClass48_7;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)I", line = 43)
	public static int method1326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Draw3D.cos[arg0 * 1024 / arg2] >> 688514529;
		return ((65536 - local12) * arg1 >> 16) + (local12 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 75)
	public static void method1328() {
		Static1.aClass2_Sub3_Sub1_4 = null;
		aClass48_7 = null;
		JagString.aClass40_557 = null;
		JagString.aClass40_556 = null;
		aClass24_1 = null;
		aClass45_27 = null;
		aClass45_28 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;I)V", line = 92)
	public static void method1329(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Js5Index arg1) {
		Static49.aClass5_18 = arg0;
		Static84.aClass5_28 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 163)
	public static void method1331() {
		if (Static1.anInt2030 != 1) {
			return;
		}
		if (Static1.anInt2500 >= 6 && Static1.anInt2500 <= 106 && Static1.anInt2133 >= 467 && Static1.anInt2133 <= 499) {
			Static1.aBoolean95 = true;
			Static1.anInt583 = (Static1.anInt583 + 1) % 4;
			Static1.aBoolean144 = true;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(132);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt583);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2515);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2491);
		}
		if (Static1.anInt2500 >= 135 && Static1.anInt2500 <= 235 && Static1.anInt2133 >= 467 && Static1.anInt2133 <= 499) {
			Static1.aBoolean144 = true;
			Static1.aBoolean95 = true;
			Static1.anInt2515 = (Static1.anInt2515 + 1) % 3;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(132);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt583);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2515);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2491);
		}
		if (Static1.anInt2500 >= 273 && Static1.anInt2500 <= 373 && Static1.anInt2133 >= 467 && Static1.anInt2133 <= 499) {
			Static1.anInt2491 = (Static1.anInt2491 + 1) % 3;
			Static1.aBoolean95 = true;
			Static1.aBoolean144 = true;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(132);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt583);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2515);
			Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2491);
		}
		if (Static1.anInt2500 < 412 || Static1.anInt2500 > 512 || Static1.anInt2133 < 467 || Static1.anInt2133 > 499) {
			return;
		}
		if (Static1.anInt2585 != -1) {
			Static53.method989(0, JagString.aClass40_445, JagString.aClass40_628);
			return;
		}
		Static55.method998();
		if (Static1.anInt808 != -1) {
			Static1.aBoolean103 = false;
			JagString.aClass40_448 = JagString.aClass40_445;
			Static1.anInt1826 = Static1.anInt2585 = Static1.anInt808;
			return;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/Graphics;)V", line = 262)
	public static void method1333(@OriginalArg(1) Graphics arg0) {
		Static2.aClass45_2.method1474(arg0, 4, 4);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lclient!o;)Lclient!o;", line = 277)
	public static JagString method1334(@OriginalArg(1) JagString[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static89.method1563(arg0, arg0.length);
	}
}

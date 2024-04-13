import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
	public static int anInt2058;

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!ad;")
	public static Js5 aClass5_Sub1_18;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "Lclient!pd;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 9)
	private static void method1396() {
		Static7.aClass45_5.method1476();
		Static14.aClass2_Sub2_Sub2_Sub3_19.method1320(0, 0);
		Static3.anIntArray4 = Static6.method175(Static3.anIntArray4);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ob;I)V", line = 23)
	public static void method1397(@OriginalArg(0) Huffman arg0) {
		Static89.aClass42_1 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V", line = 34)
	public static void method1398() {
		aClass5_Sub1_18 = null;
		JagString.aClass40_601 = null;
		JagString.aClass40_600 = null;
		aClass18_1 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!bb;Z)Z", line = 75)
	public static boolean method1400(@OriginalArg(2) SignLink arg0, @OriginalArg(3) boolean arg1) {
		return Static28.method585(arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V", line = 95)
	public static void method1401() {
		Static1.aBoolean13 = true;
		method1396();
		@Pc(29) boolean local29;
		if (Static1.anInt1654 != -1) {
			local29 = Static20.method403(0, -1, Static1.anInt1654, 1, 0, 261, 0, 190);
			if (!local29) {
				Static1.aBoolean59 = true;
			}
		} else if (Static1.anIntArray2[Static1.anInt1551] != -1) {
			local29 = Static20.method403(0, -1, Static1.anIntArray2[Static1.anInt1551], 1, 0, 261, 0, 190);
			if (!local29) {
				Static1.aBoolean59 = true;
			}
		}
		if (Static1.aBoolean175 && Static1.anInt16 == 1) {
			Static22.method480();
		}
		Static67.method1207(Static23.aGraphics1);
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V", line = 140)
	public static void method1402() {
		Static1.aClass47_4.method1330();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[Lclient!o;)[Lclient!o;", line = 171)
	public static JagString[] method1404(@OriginalArg(1) JagString[] arg0) {
		@Pc(4) JagString[] local4 = new JagString[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local4[local15] = Static72.method1334(new JagString[] { Static48.method859(local15), JagString.aClass40_4 });
			if (arg0 != null && arg0[local15] != null) {
				local4[local15] = Static72.method1334(new JagString[] { local4[local15], arg0[local15] });
			}
		}
		return local4;
	}
}

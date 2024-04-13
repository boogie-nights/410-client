import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 197)
	public static void method1689() {
		Static1.aClass47_23 = null;
		JagString.aClass40_734 = null;
		JagString.aClass40_735 = null;
		JagString.aClass40_736 = null;
		JagString.aClass40_737 = null;
		JagString.aClass40_738 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)V", line = 399)
	public static void method1700(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = Static90.method1568(arg0).anInt1076;
		if (local15 == 0) {
			return;
		}
		@Pc(25) int local25 = Static1.anIntArray339[arg0];
		if (local15 == 1) {
			if (local25 == 1) {
				Static6.method168(0.9D);
				((Class19) Static6.anInterface4_1).method404(0.9D);
			}
			if (local25 == 2) {
				Static6.method168(0.8D);
				((Class19) Static6.anInterface4_1).method404(0.8D);
			}
			if (local25 == 3) {
				Static6.method168(0.7D);
				((Class19) Static6.anInterface4_1).method404(0.7D);
			}
			if (local25 == 4) {
				Static6.method168(0.6D);
				((Class19) Static6.anInterface4_1).method404(0.6D);
			}
			Static74.method1342();
			Static1.aBoolean1 = true;
		}
		if (local15 == 3) {
			@Pc(85) short local85 = 0;
			if (local25 == 0) {
				local85 = 255;
			}
			if (local25 == 1) {
				local85 = 192;
			}
			if (local25 == 2) {
				local85 = 128;
			}
			if (local25 == 3) {
				local85 = 64;
			}
			if (local25 == 4) {
				local85 = 0;
			}
			if (Static1.anInt239 != local85) {
				if (Static1.anInt239 == 0 && Static1.anInt1977 != -1) {
					Static86.method1499(0, Static1.anInt1977, Static77.aClass5_Sub1_17, local85);
					Static1.anInt470 = 0;
				} else if (local85 == 0) {
					Static86.method1497();
					Static1.anInt470 = 0;
				} else {
					Static34.method641(local85);
				}
				Static1.anInt239 = local85;
			}
		}
		if (local15 == 6) {
			Static1.anInt1186 = local25;
		}
		if (local15 == 9) {
			Static1.anInt182 = local25;
		}
		if (local15 == 8) {
			Static1.anInt2473 = local25;
			Static1.aBoolean144 = true;
		}
		if (local15 == 4) {
			if (local25 == 0) {
				Static1.anInt2372 = 127;
			}
			if (local25 == 1) {
				Static1.anInt2372 = 96;
			}
			if (local25 == 2) {
				Static1.anInt2372 = 64;
			}
			if (local25 == 3) {
				Static1.anInt2372 = 32;
			}
			if (local25 == 4) {
				Static1.anInt2372 = 0;
			}
		}
		if (local15 == 5) {
			Static1.anInt263 = local25;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V", line = 706)
	public static void method1713() {
		Static1.anInt2587++;
		Static70.method1475(true);
		Static34.method636(true);
		Static70.method1475(false);
		Static34.method636(false);
		Static49.method917();
		Static1.method3();
		@Pc(36) int local36;
		@Pc(34) int local34;
		if (!Static1.aBoolean22) {
			local34 = Static1.anInt1669 + Static1.anInt262 & 0x7FF;
			local36 = Static1.anInt2177;
			if (local36 < Static1.anInt308 / 256) {
				local36 = Static1.anInt308 / 256;
			}
			if (Static1.aBooleanArray35[4] && Static1.anIntArray164[4] + 128 > local36) {
				local36 = Static1.anIntArray164[4] + 128;
			}
			Static38.method752(Static22.anInt577, local34, Static61.anInt1653, local36, Static78.method1383(Static1.anInt8, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284) - 50, local36 * 3 + 600);
		}
		if (Static1.aBoolean22) {
			local36 = Static17.method361();
		} else {
			local36 = Static54.method995();
		}
		local34 = Static44.anInt1114;
		@Pc(96) int local96 = Static14.anInt1863;
		@Pc(98) int local98 = Static73.anInt1935;
		@Pc(100) int local100 = Static33.anInt824;
		@Pc(102) int local102 = Static26.anInt686;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static1.aBooleanArray35[local104]) {
				@Pc(146) int local146 = (int) ((double) -Static1.anIntArray93[local104] + (double) (Static1.anIntArray93[local104] * 2 + 1) * Math.random() + Math.sin((double) Static1.anIntArray415[local104] * ((double) Static1.anIntArray159[local104] / 100.0D)) * (double) Static1.anIntArray164[local104]);
				if (local104 == 3) {
					Static26.anInt686 = Static26.anInt686 + local146 & 0x7FF;
				}
				if (local104 == 2) {
					Static14.anInt1863 += local146;
				}
				if (local104 == 4) {
					Static33.anInt824 += local146;
					if (Static33.anInt824 < 128) {
						Static33.anInt824 = 128;
					}
					if (Static33.anInt824 > 383) {
						Static33.anInt824 = 383;
					}
				}
				if (local104 == 1) {
					Static73.anInt1935 += local146;
				}
				if (local104 == 0) {
					Static44.anInt1114 += local146;
				}
			}
		}
		Static69.method1230();
		Model.aBoolean140 = true;
		Model.anInt1748 = Static1.anInt2394 - 4;
		Model.anInt1747 = 0;
		Model.anInt1750 = Static1.anInt742 - 4;
		Static25.method1610();
		Static85.aClass55_1.method1430(Static44.anInt1114, Static73.anInt1935, Static14.anInt1863, Static33.anInt824, Static26.anInt686, local36);
		Static85.aClass55_1.method1454();
		Static11.method253();
		Static62.method1099();
		((Class19) Static6.anInterface4_1).method405(Static1.anInt1095);
		Static17.method359();
		if (Static1.aBoolean147 && Static97.method1668() == 0) {
			Static1.aBoolean147 = false;
		}
		if (Static1.aBoolean147) {
			Static69.method1230();
			Static25.method1610();
			Static61.method1095(false, null, JagString.aClass40_674);
		}
		Static72.method1333(Static23.aGraphics1);
		Static73.anInt1935 = local98;
		Static33.anInt824 = local100;
		Static14.anInt1863 = local96;
		Static44.anInt1114 = local34;
		Static26.anInt686 = local102;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BZ)I", line = 1054)
	public static int method1726(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static18.method371(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V", line = 1066)
	public static void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub7 local7 = null;
		for (@Pc(12) Class2_Sub7 local12 = (Class2_Sub7) Static1.aClass44_7.method1224(); local12 != null; local12 = (Class2_Sub7) Static1.aClass44_7.method1231()) {
			if (local12.anInt817 == arg1 && local12.anInt818 == arg8 && local12.anInt821 == arg6 && local12.anInt823 == arg2) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub7();
			local7.anInt817 = arg1;
			local7.anInt823 = arg2;
			local7.anInt818 = arg8;
			local7.anInt821 = arg6;
			Static4.method86(local7);
			Static1.aClass44_7.method1221(local7);
		}
		local7.anInt829 = arg3;
		local7.anInt828 = arg5;
		local7.anInt826 = arg7;
		local7.anInt827 = arg0;
		local7.anInt819 = arg4;
	}
}

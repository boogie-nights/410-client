import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[Lclient!cb;")
	public static Cache[] aClass11Array1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 3)
	public static void method356() {
		JagString.aClass40_121 = null;
		Static1.anIntArray85 = null;
		client.menuOption = null;
		aClass11Array1 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ud;B)I", line = 134)
	public static int method358(@OriginalArg(0) Js5Index arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_223)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_544)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_191)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_734)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_64)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_220)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_725)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_718)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_707)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_29)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_319)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_632)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_487)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_288)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_256)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_3)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_720)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_136)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_78)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 222)
	public static void draw3DEntityElements() {
		Static7.method186();
		if (client.crossMode == 1) {
			Static49.aClass2_Sub2_Sub2_Sub4Array7[client.crossCycle / 100].method1624(Static1.anInt1554 - 8 - 4, Static1.anInt2465 - 8 + -4);
		}
		if (client.crossMode == 2) {
			Static49.aClass2_Sub2_Sub2_Sub4Array7[client.crossCycle / 100 + 4].method1624(Static1.anInt1554 - 8 - 4, Static1.anInt2465 + -8 + -4);
		}
		if (Static1.anInt51 != -1) {
			Static26.method533(Static1.anInt51);
			Static20.method403(0, -1, Static1.anInt51, 4, 0, 334, 0, 512);
		}
		if (Static1.anInt2585 != -1) {
			Static26.method533(Static1.anInt2585);
			Static20.method403(0, -1, Static1.anInt2585, 0, 0, 334, 0, 512);
		}
		Static40.method1239();
		if (!Static1.aBoolean175) {
			client.handleInput();
			Static5.method115();
		} else if (Static1.anInt16 == 0) {
			Static22.method480();
		}
		if (Static1.anInt2505 == 1) {
			Static40.aClass2_Sub2_Sub2_Sub4_7.method1624(472, 296);
		}
		@Pc(158) int local158;
		if (Static1.aBoolean173) {
			@Pc(118) byte local118 = 20;
			@Pc(120) int local120 = 16776960;
			if (Static1.anInt1695 < 30 && client.lowMemory) {
				local120 = 16711680;
			}
			if (Static1.anInt1695 < 20 && !client.lowMemory) {
				local120 = 16711680;
			}
			Static95.aClass2_Sub2_Sub2_Sub2_5.method572(JagString.concatenate(new JagString[] { JagString.aClass40_676, Static48.method859(Static1.anInt1695) }), 20, local120);
			local120 = 16776960;
			local158 = local118 + 15;
			@Pc(160) Runtime local160 = Runtime.getRuntime();
			@Pc(170) int local170 = (int) ((local160.totalMemory() - local160.freeMemory()) / 1024L);
			if (local170 > 32768 && client.lowMemory) {
				local120 = 16711680;
			}
			if (local170 > 65536 && !client.lowMemory) {
				local120 = 16711680;
			}
			Static95.aClass2_Sub2_Sub2_Sub2_5.method572(JagString.concatenate(new JagString[] { JagString.aClass40_44, Static48.method859(local170), JagString.aClass40_668 }), 35, local120);
			local158 += 15;
			if (Static1.aBoolean13) {
				Static95.aClass2_Sub2_Sub2_Sub2_5.method572(JagString.aClass40_735, 50, 16711680);
				local158 += 15;
				Static1.aBoolean13 = false;
			}
			if (Static1.aBoolean23) {
				Static95.aClass2_Sub2_Sub2_Sub2_5.method572(JagString.aClass40_481, local158, 16711680);
				Static1.aBoolean23 = false;
				local158 += 15;
			}
			if (Static1.aBoolean165) {
				Static95.aClass2_Sub2_Sub2_Sub2_5.method572(JagString.aClass40_435, local158, 16711680);
				local158 += 15;
				Static1.aBoolean165 = false;
			}
		}
		if (client.systemUpdateTimer == 0) {
			return;
		}
		@Pc(254) int local254 = client.systemUpdateTimer / 50;
		local158 = local254 / 60;
		@Pc(262) int local262 = local254 % 60;
		if (local262 >= 10) {
			Static95.aClass2_Sub2_Sub2_Sub2_5.method575(JagString.concatenate(new JagString[] { JagString.aClass40_618, Static48.method859(local158), JagString.aClass40_673, Static48.method859(local262) }), 4, 329, 16776960);
		} else {
			Static95.aClass2_Sub2_Sub2_Sub2_5.method575(JagString.concatenate(new JagString[] { JagString.aClass40_618, Static48.method859(local158), JagString.aClass40_135, Static48.method859(local262) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!eb;I)Lclient!o;", line = 347)
	public static JagString method360(@OriginalArg(1) Packet arg0) {
		try {
			@Pc(12) JagString local12 = new JagString();
			local12.length = arg0.gSmart1or2();
			if (local12.length > 32767) {
				local12.length = 32767;
			}
			local12.chars = new byte[local12.length];
			arg0.pos += Static89.aClass42_1.method1212(0, local12.length, arg0.pos, arg0.data, local12.chars);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return JagString.aClass40_574;
		}
	}

}

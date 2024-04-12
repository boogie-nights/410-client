package jagex2;

import jagex2.graphics.Static6;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_628 = Static13.method257("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_629 = Static13.method257("Off");

	@OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
	public static int[] skillLevel = new int[25];

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_630 = Static13.method257("Oct");

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_631 = Static13.method257("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_632 = Static13.method257("backvmid1");

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_633 = Static13.method257("Apr");

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public static int anInt2194 = 10;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1489() {
		if (Static1.clearScreen) {
			Static1.clearScreen = false;
			Static42.method768(Static24.graphics);
			Static52.redrawPrivacySettings = true;
			Static22.aBoolean184 = true;
			Static73.redrawChatback = true;
			Static33.redrawSidebar = true;
		}
		Static22.drawScene();
		if (Static97.aBoolean175 && Static1.anInt16 == 1) {
			Static33.redrawSidebar = true;
		}
		@Pc(32) boolean local32;
		if (Static66.anInt1654 != -1) {
			local32 = Static27.method533(Static66.anInt1654);
			if (local32) {
				Static33.redrawSidebar = true;
			}
		}
		if (Static21.anInt481 == 2) {
			Static33.redrawSidebar = true;
		}
		if (Static88.anInt2077 == 2) {
			Static33.redrawSidebar = true;
		}
		if (Static33.redrawSidebar) {
			Static33.redrawSidebar = false;
			Static87.method1401();
		}
		@Pc(101) int local101;
		if (Static85.anInt1994 == -1) {
			Static62.aClass2_Sub2_Sub13_1.anInt1587 = Static59.anInt1506 - Static34.anInt799 - 77;
			if (Static32.anInt742 > 448 && Static32.anInt742 < 560 && Static100.anInt2394 > 332) {
				Static54.method920(Static62.aClass2_Sub2_Sub13_1, 463, Static59.anInt1506, 77, -1, Static100.anInt2394 - 357, Static32.anInt742 + -17, 0);
			}
			local101 = Static59.anInt1506 - Static62.aClass2_Sub2_Sub13_1.anInt1587 - 77;
			if (local101 < 0) {
				local101 = 0;
			}
			if (local101 > Static59.anInt1506 - 77) {
				local101 = Static59.anInt1506 - 77;
			}
			if (Static34.anInt799 != local101) {
				Static73.redrawChatback = true;
				Static34.anInt799 = local101;
			}
		}
		if (Static85.anInt1994 == -1 && Static101.anInt2399 == 3) {
			Static62.aClass2_Sub2_Sub13_1.anInt1587 = Static3.anInt53;
			local101 = Static87.anInt2066 * 14 + 7;
			if (Static32.anInt742 > 448 && Static32.anInt742 < 560 && Static100.anInt2394 > 332) {
				Static54.method920(Static62.aClass2_Sub2_Sub13_1, 463, local101, 77, -1, Static100.anInt2394 - 357, Static32.anInt742 + -17, 0);
			}
			@Pc(168) int local168 = Static62.aClass2_Sub2_Sub13_1.anInt1587;
			if (local168 < 0) {
				local168 = 0;
			}
			if (local168 > local101 - 77) {
				local168 = local101 - 77;
			}
			if (local168 != Static3.anInt53) {
				Static3.anInt53 = local168;
				Static73.redrawChatback = true;
			}
		}
		if (Static85.anInt1994 != -1) {
			local32 = Static27.method533(Static85.anInt1994);
			if (local32) {
				Static73.redrawChatback = true;
			}
		}
		if (Static21.anInt481 == 3) {
			Static73.redrawChatback = true;
		}
		if (Static88.anInt2077 == 3) {
			Static73.redrawChatback = true;
		}
		if (Static17.aClass40_112 != null) {
			Static73.redrawChatback = true;
		}
		if (Static97.aBoolean175 && Static1.anInt16 == 2) {
			Static73.redrawChatback = true;
		}
		if (Static73.redrawChatback) {
			Static73.redrawChatback = false;
			Static2.method23();
		}
		Static19.method370();
		if (Static103.flashingTab != -1) {
			Static22.aBoolean184 = true;
		}
		if (Static22.aBoolean184) {
			if (Static103.flashingTab != -1 && Static62.selectedTab == Static103.flashingTab) {
				Static103.flashingTab = -1;
				Static80.out.p1isaac(145);
				Static80.out.p1(Static62.selectedTab);
			}
			Static92.aBoolean165 = true;
			Static22.aBoolean184 = false;
			Static93.method1487(Static62.selectedTab, Static2.anIntArray2, Static107.loopCycle % 20 < 10 ? -1 : Static103.flashingTab, Static66.anInt1654 == -1, Static24.graphics);
		}
		if (Static52.redrawPrivacySettings) {
			Static92.aBoolean165 = true;
			Static52.redrawPrivacySettings = false;
			Static107.method1664(Static104.privateChatSetting, Static24.graphics, Static103.aClass2_Sub2_Sub2_Sub2_5, Static103.tradeChatSetting, Static23.publicChatSetting);
		}
		Static45.sceneDelta = 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static synchronized void method1490() {
		if (Static70.method1110()) {
			Static32.method595();
			Static15.aBoolean151 = false;
			Static68.aClass5_6 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIZIIILclient!ud;)V")
	public static synchronized void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class5 arg3) {
		if (!Static70.method1110()) {
			return;
		}
		Static46.anInt2458 = arg2;
		Static68.aClass5_6 = arg3;
		Static15.aBoolean151 = true;
		Static76.anInt2153 = -1;
		Static70.anInt1696 = arg1;
		Static98.anInt2370 = arg0;
		Static101.aBoolean179 = false;
		Static90.anInt2135 = 10;
		Static14.anInt310 = 0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1492() {
		Static27.method533(Static84.anInt1971);
		if (Static93.anInt2175 != -1) {
			Static27.method533(Static93.anInt2175);
		}
		Static45.sceneDelta = 0;
		Static29.aClass45_14.bind();
		Static36.anIntArray162 = Static6.method175(Static36.anIntArray162);
		Static26.clear();
		Static21.method403(0, -1, Static84.anInt1971, 0, 0, 503, 0, 765);
		if (Static93.anInt2175 != -1) {
			Static21.method403(0, -1, Static93.anInt2175, 0, 0, 503, 0, 765);
		}
		if (Static97.aBoolean175) {
			Static23.method480();
		} else {
			Static20.method389();
			Static5.drawTooltip();
		}
		Static29.aClass45_14.draw(Static24.graphics, 0, 0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static synchronized void method1493() {
		Static11.method235();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZJ)V")
	public static void method1494(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static105.method1672(arg0 - 1L);
			Static105.method1672(1L);
		} else {
			Static105.method1672(arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method1495() {
		Static53.entityUpdateCount = 0;
		Static13.entityRemovalCount = 0;
		Static23.method477();
		Static25.method520();
		Static70.method1109();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static13.entityRemovalCount; local22++) {
			local28 = Static52.entityRemovalIds[local22];
			if (Static107.loopCycle != Static2.npcs[local28].cycle) {
				Static2.npcs[local28].type = null;
				Static2.npcs[local28] = null;
			}
		}
		if (Static56.in.pos != Static33.size) {
			throw new RuntimeException("gnp1 pos:" + Static56.in.pos + " psize:" + Static33.size);
		}
		for (local28 = 0; local28 < Static73.anInt1800; local28++) {
			if (Static2.npcs[Static63.anIntArray326[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static73.anInt1800);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!o;Lclient!o;Lclient!ud;IZIII)V")
	public static synchronized void method1496(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(6) int arg3) {
		if (Static70.method1110()) {
			@Pc(12) int local12 = arg2.method80(arg0);
			@Pc(18) int local18 = arg2.method72(arg1, local12);
			method1491(local12, arg3, local18, arg2);
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static synchronized void method1497() {
		if (Static70.method1110()) {
			Static63.method1055();
			Static68.aClass5_6 = null;
			Static15.aBoolean151 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public static void method1498() {
		aClass40_630 = null;
		aClass40_633 = null;
		aClass40_631 = null;
		aClass40_632 = null;
		aClass40_629 = null;
		aClass40_628 = null;
		skillLevel = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!ud;IZ)V")
	public static synchronized void method1499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class5 arg2, @OriginalArg(5) int arg3) {
		if (!Static70.method1110()) {
			return;
		}
		Static14.anInt310 = arg0;
		Static76.anInt2153 = -1;
		Static90.anInt2135 = -1;
		Static70.anInt1696 = arg3;
		Static46.anInt2458 = 0;
		Static101.aBoolean179 = false;
		Static15.aBoolean151 = true;
		Static68.aClass5_6 = arg2;
		Static98.anInt2370 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	public static synchronized void method1500() {
		if (!Static70.method1110()) {
			return;
		}
		if (Static15.aBoolean151) {
			@Pc(22) byte[] local22 = Static106.method1735(Static14.anInt310, Static46.anInt2458, Static68.aClass5_6, Static98.anInt2370);
			if (local22 != null) {
				if (Static90.anInt2135 >= 0) {
					Static68.method335(Static101.aBoolean179, local22, Static70.anInt1696, Static90.anInt2135);
				} else if (Static76.anInt2153 < 0) {
					Static73.method1208(Static101.aBoolean179, Static70.anInt1696, local22);
				} else {
					Static46.method1634(Static101.aBoolean179, local22, Static76.anInt2153, Static70.anInt1696);
				}
				Static15.aBoolean151 = false;
				Static68.aClass5_6 = null;
			}
		}
		Static37.method719();
	}
}

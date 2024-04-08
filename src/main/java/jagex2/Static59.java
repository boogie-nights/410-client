package jagex2;

import java.awt.Component;

import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt1500;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!ud;")
	public static Class5 aClass5_20;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[Lclient!eb;")
	public static Packet[] aPacketArray1 = new Packet[2048];

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt1501 = -1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	public static int[] anIntArray312 = new int[25];

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_430 = Static13.method257("(U");

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static int anInt1506 = 78;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method994() {
		aClass5_20 = null;
		aPacketArray1 = null;
		anIntArray312 = null;
		aClass40_430 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I")
	public static int method995() {
		@Pc(12) int local12 = 3;
		if (Static35.anInt824 < 310) {
			@Pc(21) int local21 = Static48.anInt1114 >> 7;
			@Pc(25) int local25 = Static15.anInt1863 >> 7;
			@Pc(30) int local30 = Static88.localPlayer.anInt2275 >> 7;
			if ((Static61.aByteArrayArrayArray7[Static1.currentLevel][local21][local25] & 0x4) != 0) {
				local12 = Static1.currentLevel;
			}
			@Pc(50) int local50 = Static88.localPlayer.anInt2284 >> 7;
			@Pc(62) int local62;
			if (local30 > local21) {
				local62 = local30 - local21;
			} else {
				local62 = local21 - local30;
			}
			@Pc(77) int local77;
			if (local50 > local25) {
				local77 = local50 - local25;
			} else {
				local77 = local25 - local50;
			}
			@Pc(92) int local92;
			@Pc(94) int local94;
			if (local62 <= local77) {
				local92 = local62 * 65536 / local77;
				local94 = 32768;
				while (local50 != local25) {
					if (local25 < local50) {
						local25++;
					} else if (local50 < local25) {
						local25--;
					}
					if ((Static61.aByteArrayArrayArray7[Static1.currentLevel][local21][local25] & 0x4) != 0) {
						local12 = Static1.currentLevel;
					}
					local94 += local92;
					if (local94 >= 65536) {
						local94 -= 65536;
						if (local21 < local30) {
							local21++;
						} else if (local21 > local30) {
							local21--;
						}
						if ((Static61.aByteArrayArrayArray7[Static1.currentLevel][local21][local25] & 0x4) != 0) {
							local12 = Static1.currentLevel;
						}
					}
				}
			} else {
				local94 = 32768;
				local92 = local77 * 65536 / local62;
				while (local21 != local30) {
					local94 += local92;
					if (local21 < local30) {
						local21++;
					} else if (local30 < local21) {
						local21--;
					}
					if ((Static61.aByteArrayArrayArray7[Static1.currentLevel][local21][local25] & 0x4) != 0) {
						local12 = Static1.currentLevel;
					}
					if (local94 >= 65536) {
						if (local50 > local25) {
							local25++;
						} else if (local25 > local50) {
							local25--;
						}
						if ((Static61.aByteArrayArrayArray7[Static1.currentLevel][local21][local25] & 0x4) != 0) {
							local12 = Static1.currentLevel;
						}
						local94 -= 65536;
					}
				}
			}
		}
		if ((Static61.aByteArrayArrayArray7[Static1.currentLevel][Static88.localPlayer.anInt2275 >> 7][Static88.localPlayer.anInt2284 >> 7] & 0x4) != 0) {
			local12 = Static1.currentLevel;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static void method996() {
		Static103.aClass47_22.clear();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ud;ILjava/awt/Component;)V")
	public static void method997(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Component comp) {
		if (Static79.aBoolean152) {
			return;
		}
		Static15.aClass2_Sub2_Sub2_Sub3_19 = Static99.method77(arg0, Static16.aClass40_110, Static30.aClass40_223);
		Static53.aClass2_Sub2_Sub2_Sub3_13 = Static99.method77(arg0, Static16.aClass40_110, Static79.aClass40_544);
		Static17.imageMapBack = Static99.method77(arg0, Static16.aClass40_110, Static25.aClass40_191);
		Static51.aClass2_Sub2_Sub2_Sub3_11 = Static99.method77(arg0, Static16.aClass40_110, Static22.aClass40_734);
		Static15.aClass2_Sub2_Sub2_Sub3_18 = Static99.method77(arg0, Static16.aClass40_110, Static10.aClass40_64);
		Static102.aClass2_Sub2_Sub2_Sub3_23 = Static99.method77(arg0, Static16.aClass40_110, Static30.aClass40_220);
		Static61.areaMapBack = Static83.create(comp, 479, 96);
		Static53.aClass2_Sub2_Sub2_Sub3_13.method1320(0, 0);
		Static12.aClass45_6 = Static83.create(comp, 172, 156);
		Static26.clear();
		Static17.imageMapBack.method1320(0, 0);
		Static7.areaSidebar = Static83.create(comp, 190, 261);
		Static15.aClass2_Sub2_Sub2_Sub3_19.method1320(0, 0);
		Static2.areaViewport = Static83.create(comp, 512, 334);
		Static26.clear();
		Static4.aClass45_4 = Static83.create(comp, 496, 50);
		Static68.aClass45_8 = Static83.create(comp, 269, 37);
		Static25.aClass45_12 = Static83.create(comp, 249, 45);
		@Pc(110) Class2_Sub2_Sub2_Sub4 local110 = Static103.method1644(Static105.aClass40_725, Static16.aClass40_110, arg0);
		Static41.aClass45_20 = Static83.create(comp, local110.anInt2446, local110.anInt2442);
		local110.method1619(0, 0);
		@Pc(128) Class2_Sub2_Sub2_Sub4 local128 = Static103.method1644(Static107.aClass40_718, Static16.aClass40_110, arg0);
		Static30.aClass45_15 = Static83.create(comp, local128.anInt2446, local128.anInt2442);
		local128.method1619(0, 0);
		@Pc(148) Class2_Sub2_Sub2_Sub4 local148 = Static103.method1644(Static46.aClass40_707, Static16.aClass40_110, arg0);
		Static80.aClass45_28 = Static83.create(comp, local148.anInt2446, local148.anInt2442);
		local148.method1619(0, 0);
		@Pc(166) Class2_Sub2_Sub2_Sub4 local166 = Static103.method1644(Static4.aClass40_29, Static16.aClass40_110, arg0);
		Static29.aClass45_13 = Static83.create(comp, local166.anInt2446, local166.anInt2442);
		local166.method1619(0, 0);
		@Pc(184) Class2_Sub2_Sub2_Sub4 local184 = Static103.method1644(Static42.aClass40_319, Static16.aClass40_110, arg0);
		Static92.aClass45_29 = Static83.create(comp, local184.anInt2446, local184.anInt2442);
		local184.method1619(0, 0);
		@Pc(204) Class2_Sub2_Sub2_Sub4 local204 = Static103.method1644(Static94.aClass40_632, Static16.aClass40_110, arg0);
		Static20.aClass45_10 = Static83.create(comp, local204.anInt2446, local204.anInt2442);
		local204.method1619(0, 0);
		@Pc(222) Class2_Sub2_Sub2_Sub4 local222 = Static103.method1644(Static67.aClass40_487, Static16.aClass40_110, arg0);
		Static1.aClass45_1 = Static83.create(comp, local222.anInt2446, local222.anInt2442);
		local222.method1619(0, 0);
		@Pc(240) Class2_Sub2_Sub2_Sub4 local240 = Static103.method1644(Static37.aClass40_288, Static16.aClass40_110, arg0);
		Static44.aClass45_21 = Static83.create(comp, local240.anInt2446, local240.anInt2442);
		local240.method1619(0, 0);
		@Pc(258) Class2_Sub2_Sub2_Sub4 local258 = Static103.method1644(Static36.aClass40_256, Static16.aClass40_110, arg0);
		Static19.aClass45_9 = Static83.create(comp, local258.anInt2446, local258.anInt2442);
		local258.method1619(0, 0);
		Static2.aClass2_Sub2_Sub2_Sub3_1 = Static99.method77(arg0, Static16.aClass40_110, Static1.aClass40_3);
		Static15.aClass2_Sub2_Sub2_Sub3_17 = Static99.method77(arg0, Static16.aClass40_110, Static107.aClass40_720);
		Static51.aClass2_Sub2_Sub2_Sub3_10 = Static99.method77(arg0, Static16.aClass40_110, Static21.aClass40_136);
		Static83.aClass2_Sub2_Sub2_Sub3_20 = Static2.aClass2_Sub2_Sub2_Sub3_1.method1319();
		Static83.aClass2_Sub2_Sub2_Sub3_20.method1318();
		Static97.aClass2_Sub2_Sub2_Sub3_22 = Static15.aClass2_Sub2_Sub2_Sub3_17.method1319();
		Static97.aClass2_Sub2_Sub2_Sub3_22.method1318();
		Static32.aClass2_Sub2_Sub2_Sub3_7 = Static2.aClass2_Sub2_Sub2_Sub3_1.method1319();
		Static32.aClass2_Sub2_Sub2_Sub3_7.method1322();
		Static103.aClass2_Sub2_Sub2_Sub3_24 = Static15.aClass2_Sub2_Sub2_Sub3_17.method1319();
		Static103.aClass2_Sub2_Sub2_Sub3_24.method1322();
		Static53.aClass2_Sub2_Sub2_Sub3_12 = Static51.aClass2_Sub2_Sub2_Sub3_10.method1319();
		Static53.aClass2_Sub2_Sub2_Sub3_12.method1322();
		Static33.aClass2_Sub2_Sub2_Sub3_9 = Static2.aClass2_Sub2_Sub2_Sub3_1.method1319();
		Static33.aClass2_Sub2_Sub2_Sub3_9.method1318();
		Static33.aClass2_Sub2_Sub2_Sub3_9.method1322();
		Static3.aClass2_Sub2_Sub2_Sub3_2 = Static15.aClass2_Sub2_Sub2_Sub3_17.method1319();
		Static3.aClass2_Sub2_Sub2_Sub3_2.method1318();
		Static3.aClass2_Sub2_Sub2_Sub3_2.method1322();
		Static81.aClass2_Sub2_Sub2_Sub3Array10 = Static4.method85(arg0, Static12.aClass40_78, Static16.aClass40_110);
		Static2.anIntArray3 = new int[151];
		Static73.anIntArray407 = new int[151];
		Static102.compassMaskLineOffsets = new int[33];
		Static45.compassMaskLineLengths = new int[33];
		for (@Pc(347) int y = 0; y < 33; y++) {
			@Pc(351) int right = 0;
			@Pc(353) int left = 999;
			for (int x = 0; x < 34; x++) {
				if (Static17.imageMapBack.pixels[y * Static17.imageMapBack.width + x] == 0) {
					if (left == 999) {
						left = x;
					}
				} else if (left != 999) {
					right = x;
					break;
				}
			}
			Static102.compassMaskLineOffsets[y] = left;
			Static45.compassMaskLineLengths[y] = right - left;
		}
		for (int y = 5; y < 156; y++) {
			int left = 999;
			int right = 0;
			for (@Pc(419) int x = 25; x < 172; x++) {
				if (Static17.imageMapBack.pixels[y * Static17.imageMapBack.width + x] == 0 && (x > 34 || y > 34)) {
					if (left == 999) {
						left = x;
					}
				} else if (left != 999) {
					right = x;
					break;
				}
			}
			Static73.anIntArray407[y - 5] = left - 25;
			Static2.anIntArray3[y - 5] = right - left;
		}
		Static79.aBoolean152 = true;
	}
}

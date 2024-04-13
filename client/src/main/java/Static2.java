import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!p;")
	public static PixMap aClass45_2;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!p;")
	public static PixMap aClass45_3;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 5)
	public static void method18() {
		if (!Static1.aBoolean152) {
			return;
		}
		Static95.aClass2_Sub2_Sub2_Sub3_24 = null;
		Static3.aClass2_Sub2_Sub2_Sub3_2 = null;
		Static94.aClass2_Sub2_Sub2_Sub3_23 = null;
		Static1.aBoolean152 = false;
		Static89.aClass2_Sub2_Sub2_Sub3_22 = null;
		Static94.anIntArray544 = null;
		Static84.aClass45_29 = null;
		Static48.aClass2_Sub2_Sub2_Sub3_12 = null;
		Static38.aClass45_20 = null;
		Static1.aClass45_1 = null;
		Static31.aClass2_Sub2_Sub2_Sub3_9 = null;
		anIntArray3 = null;
		Static28.aClass45_15 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_17 = null;
		Static67.anIntArray407 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_19 = null;
		Static72.aClass45_28 = null;
		Static24.aClass45_12 = null;
		Static41.aClass45_21 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		Static11.aClass45_6 = null;
		Static46.aClass2_Sub2_Sub2_Sub3_10 = null;
		Static73.aClass2_Sub2_Sub2_Sub3Array10 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_18 = null;
		Static16.aClass2_Sub2_Sub2_Sub3_6 = null;
		Static63.aClass45_8 = null;
		Static30.aClass2_Sub2_Sub2_Sub3_7 = null;
		Static56.aClass45_23 = null;
		Static4.aClass45_4 = null;
		Static48.aClass2_Sub2_Sub2_Sub3_13 = null;
		Static96.anIntArray548 = null;
		Static46.aClass2_Sub2_Sub2_Sub3_11 = null;
		Static76.anIntArray431 = null;
		Static75.aClass2_Sub2_Sub2_Sub3_20 = null;
		Static7.aClass45_5 = null;
		Static3.anIntArray4 = null;
		Static18.aClass45_9 = null;
		Static19.aClass45_10 = null;
		Static42.anIntArray225 = null;
		aClass45_2 = null;
		Static27.aClass45_13 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 62)
	public static void method19() {
		@Pc(15) int local15;
		for (@Pc(8) int local8 = -1; local8 < Static1.anInt2067; local8++) {
			if (local8 == -1) {
				local15 = 2047;
			} else {
				local15 = Static1.anIntArray408[local8];
			}
			@Pc(25) PlayerEntity local25 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local15];
			if (local25 != null && local25.anInt2294 > 0) {
				local25.anInt2294--;
				if (local25.anInt2294 == 0) {
					local25.aClass40_660 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static1.anInt1800; local15++) {
			@Pc(54) int local54 = Static1.anIntArray326[local15];
			@Pc(58) NpcEntity local58 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local54];
			if (local58 != null && local58.anInt2294 > 0) {
				local58.anInt2294--;
				if (local58.anInt2294 == 0) {
					local58.aClass40_660 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V", line = 128)
	public static void method20() {
		Static1.aClass14Array1 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		aClass45_3 = null;
		Static1.aClass47_1 = null;
		JagString.aClass40_14 = null;
		aClass45_2 = null;
		JagString.aClass40_13 = null;
		Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1 = null;
		Static1.anIntArray2 = null;
		JagString.aClass40_15 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!o;", line = 150)
	public static JagString method21(@OriginalArg(0) int arg0) {
		return Static72.method1334(new JagString[] { Static48.method859(arg0 >> 24 & 0xFF), JagString.aClass40_557, Static48.method859(arg0 >> 16 & 0xFF), JagString.aClass40_557, Static48.method859(arg0 >> 8 & 0xFF), JagString.aClass40_557, Static48.method859(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z", line = 163)
	public static boolean method22() {
		if (Static64.aClass25_36 == null) {
			return false;
		}
		@Pc(226) int local226;
		try {
			@Pc(13) int local13 = Static64.aClass25_36.method728();
			if (local13 == 0) {
				return false;
			}
			if (Static1.packetType == -1) {
				local13--;
				Static64.aClass25_36.method725(0, 1, Static1.in.data);
				Static1.in.pos = 0;
				Static1.packetType = Static1.in.gIsaac1();
				Static1.anInt785 = Static1.anIntArray82[Static1.packetType];
			}
			if (Static1.anInt785 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static64.aClass25_36.method725(0, 1, Static1.in.data);
				Static1.anInt785 = Static1.in.data[0] & 0xFF;
				local13--;
			}
			if (Static1.anInt785 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static64.aClass25_36.method725(0, 2, Static1.in.data);
				local13 -= 2;
				Static1.in.pos = 0;
				Static1.anInt785 = Static1.in.g2();
			}
			if (local13 < Static1.anInt785) {
				return false;
			}
			Static1.in.pos = 0;
			Static64.aClass25_36.method725(0, Static1.anInt785, Static1.in.data);
			Static1.anInt231 = 0;
			Static1.anInt1986 = Static1.anInt2352;
			Static1.anInt2352 = Static1.anInt788;
			Static1.anInt788 = Static1.packetType;
			@Pc(125) int local125;
			if (Static1.packetType == 224) {
				local125 = Static1.in.g2_alt2();
				Static95.method1648(local125);
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = -1;
					Static1.aBoolean59 = true;
					Static1.aBoolean184 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				if (Static1.anInt1994 != local125) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = local125;
				}
				Static1.aBoolean40 = false;
				Static1.aBoolean144 = true;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 142) {
				Static87.baseX = Static1.in.g1();
				Static83.baseZ = Static1.in.g1_alt1();
				while (Static1.in.pos < Static1.anInt785) {
					Static1.packetType = Static1.in.g1();
					Static3.method26();
				}
				Static1.packetType = -1;
				return true;
			}
			@Pc(230) int local230;
			@Pc(234) ComType local234;
			if (Static1.packetType == 7) {
				local125 = Static1.in.g4s_alt2();
				local226 = Static1.in.g2_alt1();
				local230 = Static1.in.g2_alt1();
				local234 = Static73.method1340(local125);
				if (local230 == 65535) {
					Static1.packetType = -1;
					local234.anInt1607 = 0;
					return true;
				}
				@Pc(248) ObjType local248 = Static97.method1669(local230);
				local234.anInt1607 = 4;
				local234.anInt1579 = local248.anInt952;
				Static1.packetType = -1;
				local234.anInt1586 = local248.anInt926 * 100 / local226;
				local234.anInt1602 = local230;
				local234.anInt1614 = local248.anInt918;
				return true;
			}
			if (Static1.packetType == 249) {
				Static1.anInt808 = Static1.in.g2_alt2();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 157) {
				Static64.method1111(Static91.aClass7_2, Static1.anInt785, Static1.in);
				Static1.packetType = -1;
				return true;
			}
			@Pc(355) int local355;
			@Pc(364) int local364;
			@Pc(359) int local359;
			@Pc(376) int local376;
			if (Static1.packetType == 215) {
				Static1.aBoolean22 = true;
				Static71.anInt1867 = Static1.in.g1();
				Static72.anInt1914 = Static1.in.g1();
				Static75.anInt1963 = Static1.in.g2();
				Static21.anInt2586 = Static1.in.g1();
				Static69.anInt1832 = Static1.in.g1();
				if (Static69.anInt1832 >= 100) {
					local125 = Static71.anInt1867 * 128 + 64;
					local226 = Static72.anInt1914 * 128 + 64;
					local230 = Static78.method1383(Static1.currentLevel, local125, local226) - Static75.anInt1963;
					local355 = local125 - Static44.anInt1114;
					local359 = local226 - Static14.anInt1863;
					local364 = local230 - Static73.anInt1935;
					local376 = (int) Math.sqrt((double) (local355 * local355 + local359 * local359));
					Static33.anInt824 = (int) (Math.atan2((double) local364, (double) local376) * 325.949D) & 0x7FF;
					Static26.anInt686 = (int) (-325.949D * Math.atan2((double) local355, (double) local359)) & 0x7FF;
					if (Static33.anInt824 < 128) {
						Static33.anInt824 = 128;
					}
					if (Static33.anInt824 > 383) {
						Static33.anInt824 = 383;
					}
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 116) {
				Static1.aBoolean59 = true;
				local125 = Static1.in.g1_alt3();
				local226 = Static1.in.g4s_alt1();
				local230 = Static1.in.g1_alt2();
				Static1.anIntArray234[local230] = local226;
				Static1.anIntArray473[local230] = local125;
				Static1.anIntArray312[local230] = 1;
				for (local355 = 0; local355 < 98; local355++) {
					if (Static1.anIntArray80[local355] <= local226) {
						Static1.anIntArray312[local230] = local355 + 2;
					}
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 90) {
				Static1.anInt2139 = Static1.in.g1();
				if (Static1.anInt2139 == 1) {
					Static1.anInt1989 = Static1.in.g2();
				}
				if (Static1.anInt2139 >= 2 && Static1.anInt2139 <= 6) {
					if (Static1.anInt2139 == 2) {
						Static1.anInt441 = 64;
						Static1.anInt1493 = 64;
					}
					if (Static1.anInt2139 == 3) {
						Static1.anInt1493 = 64;
						Static1.anInt441 = 0;
					}
					if (Static1.anInt2139 == 4) {
						Static1.anInt441 = 128;
						Static1.anInt1493 = 64;
					}
					if (Static1.anInt2139 == 5) {
						Static1.anInt1493 = 0;
						Static1.anInt441 = 64;
					}
					if (Static1.anInt2139 == 6) {
						Static1.anInt1493 = 128;
						Static1.anInt441 = 64;
					}
					Static1.anInt2139 = 2;
					Static1.anInt410 = Static1.in.g2();
					Static1.anInt1952 = Static1.in.g2();
					Static1.anInt1917 = Static1.in.g1();
				}
				if (Static1.anInt2139 == 10) {
					Static1.anInt2353 = Static1.in.g2();
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 15) {
				local125 = Static1.in.g4s_alt1();
				local226 = Static1.in.g2s_alt2();
				local230 = Static1.in.g2s_alt1();
				local234 = Static73.method1340(local125);
				local234.anInt1588 = local234.anInt1616 + local226;
				local234.anInt1582 = local234.anInt1573 + local230;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 232) {
				for (local125 = 0; local125 < Static1.anIntArray339.length; local125++) {
					if (Static1.anIntArray288[local125] != Static1.anIntArray339[local125]) {
						Static1.anIntArray339[local125] = Static1.anIntArray288[local125];
						Static21.method1700(local125);
						Static1.aBoolean59 = true;
					}
				}
				Static1.packetType = -1;
				return true;
			}
			@Pc(650) long local650;
			@Pc(655) long local655;
			if (Static1.packetType == 103) {
				local650 = Static1.in.g8();
				local655 = Static1.in.g2();
				@Pc(660) long local660 = (long) Static1.in.g3();
				local376 = Static1.in.g1();
				@Pc(671) long local671 = (local655 << 32) + local660;
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < 100; local675++) {
					if (local671 == Static1.aLongArray3[local675]) {
						local673 = true;
						break;
					}
				}
				if (local376 <= 1) {
					for (@Pc(702) int local702 = 0; local702 < Static1.anInt121; local702++) {
						if (Static1.aLongArray4[local702] == local650) {
							local673 = true;
							break;
						}
					}
				}
				if (!local673 && Static1.anInt440 == 0) {
					Static1.aLongArray3[Static1.anInt2359] = local671;
					Static1.anInt2359 = (Static1.anInt2359 + 1) % 100;
					@Pc(738) JagString local738 = Static7.method192(Static1.in).method1166();
					if (local376 == 2 || local376 == 3) {
						Static53.method989(7, Static72.method1334(new JagString[] { JagString.aClass40_622, Static44.method819(local650).method1167() }), local738);
					} else if (local376 == 1) {
						Static53.method989(7, Static72.method1334(new JagString[] { JagString.aClass40_323, Static44.method819(local650).method1167() }), local738);
					} else {
						Static53.method989(3, Static44.method819(local650).method1167(), local738);
					}
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 216) {
				Static1.anInt1551 = Static1.in.g1_alt3();
				Static1.aBoolean59 = true;
				Static1.aBoolean184 = true;
				Static1.packetType = -1;
				return true;
			}
			@Pc(836) ComType local836;
			if (Static1.packetType == 84) {
				local125 = Static1.in.g4s_alt1();
				local836 = Static73.method1340(local125);
				local836.anInt1607 = 3;
				local836.anInt1602 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass33_2.method1006();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 74) {
				if (Static1.anInt1551 == 12) {
					Static1.aBoolean59 = true;
				}
				Static1.anInt2181 = Static1.in.g1();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 162) {
				Static1.aBoolean22 = true;
				Static70.anInt2149 = Static1.in.g1();
				Static34.anInt840 = Static1.in.g1();
				Static45.anInt2259 = Static1.in.g2();
				Static18.anInt439 = Static1.in.g1();
				Static51.anInt2325 = Static1.in.g1();
				if (Static51.anInt2325 >= 100) {
					Static44.anInt1114 = Static70.anInt2149 * 128 + 64;
					Static14.anInt1863 = Static34.anInt840 * 128 + 64;
					Static73.anInt1935 = Static78.method1383(Static1.currentLevel, Static44.anInt1114, Static14.anInt1863) - Static45.anInt2259;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 108) {
				for (local125 = 0; local125 < Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1.length; local125++) {
					if (Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125] != null) {
						Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125].anInt2307 = -1;
					}
				}
				for (local226 = 0; local226 < Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1.length; local226++) {
					if (Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226] != null) {
						Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226].anInt2307 = -1;
					}
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 126) {
				Static91.method58(true);
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 32) {
				Static1.anInt2399 = 1;
				Static1.packetType = -1;
				Static1.aBoolean144 = true;
				JagString.aClass40_444 = JagString.aClass40_445;
				Static1.aBoolean146 = false;
				return true;
			}
			if (Static1.packetType == 94) {
				local125 = Static1.in.g2s_alt2();
				if (local125 != Static1.anInt980) {
					Static75.method1350(Static1.anInt980);
					Static1.anInt980 = local125;
				}
				Static1.packetType = -1;
				Static1.aBoolean144 = true;
				return true;
			}
			if (Static1.packetType == 120) {
				if (Static1.anInt1551 == 12) {
					Static1.aBoolean59 = true;
				}
				Static1.anInt1813 = Static1.in.g2s();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 70) {
				local125 = Static1.in.g2_alt1();
				if (local125 == 65535) {
					local125 = -1;
				}
				if (local125 == -1 && Static1.anInt470 == 0) {
					Static86.method1497();
				} else if (local125 != -1 && local125 != Static1.anInt1977 && Static1.anInt239 != 0 && Static1.anInt470 == 0) {
					Static86.method1491(local125, Static1.anInt239, 0, Static77.midiSongsJs5);
				}
				Static1.anInt1977 = local125;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 62) {
				local125 = Static1.in.g3();
				local226 = Static1.in.g2_alt1();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Static1.anInt239 != 0 && local226 != -1) {
					Static86.method1499(1, local226, Static68.midiJinglesJs5, Static1.anInt239);
					Static1.anInt470 = local125;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 17) {
				Static1.aBoolean22 = false;
				for (local125 = 0; local125 < 5; local125++) {
					Static1.aBooleanArray35[local125] = false;
				}
				Static1.packetType = -1;
				return true;
			}
			@Pc(1170) ComType local1170;
			if (Static1.packetType == 241) {
				local125 = Static1.in.g4s_alt3();
				local226 = Static1.in.g2_alt3();
				local1170 = Static73.method1340(local125);
				Static1.packetType = -1;
				local1170.anInt1602 = local226;
				local1170.anInt1607 = 2;
				return true;
			}
			if (Static1.packetType == 97) {
				local125 = Static1.in.g2();
				local226 = Static1.in.g2_alt1();
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
					Static1.aBoolean144 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != local226) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = local226;
				}
				if (Static1.anInt1654 != local125) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = local125;
				}
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				Static1.packetType = -1;
				Static1.aBoolean59 = true;
				Static1.aBoolean184 = true;
				Static1.aBoolean40 = false;
				return true;
			}
			if (Static1.packetType == 153) {
				Static75.anInt1960 = Static1.in.g2_alt3();
				Static1.in.g2();
				Static51.anInt2272 = Static1.in.g2_alt1();
				Static61.anInt1664 = Static1.in.g2_alt1();
				Static46.anInt1167 = Static1.in.g2_alt2();
				Static53.anInt1494 = Static1.in.g2_alt3();
				Static35.anInt941 = Static1.in.g1();
				Static46.anInt1163 = Static1.in.g2_alt2();
				Static1.in.g2_alt3();
				Static78.anInt2035 = Static1.in.g2_alt1();
				Static53.anInt1487 = Static1.in.g4s_alt3();
				Static56.aClass48_6 = Static91.aClass7_2.method199(Static53.anInt1487);
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 11) {
				local125 = Static1.in.g2();
				local226 = Static1.in.g1();
				local230 = Static1.in.g2();
				if (Static1.anInt2372 != 0 && local226 != 0 && Static1.anInt131 < 50) {
					Static1.anIntArray497[Static1.anInt131] = local125;
					Static1.anIntArray79[Static1.anInt131] = local226;
					Static1.anIntArray36[Static1.anInt131] = local230;
					Static1.aClass43Array1[Static1.anInt131] = null;
					Static1.anInt131++;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 122) {
				Static91.method58(false);
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 136) {
				local125 = Static1.in.g4s();
				local836 = Static73.method1340(local125);
				for (local230 = 0; local230 < local836.anIntArray331.length; local230++) {
					local836.anIntArray331[local230] = -1;
					local836.anIntArray331[local230] = 0;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 28) {
				Static1.anInt2492 = Static1.in.g1_alt1();
				Static1.packetType = -1;
				if (Static1.anInt1551 == Static1.anInt2492) {
					Static1.aBoolean59 = true;
					if (Static1.anInt2492 == 3) {
						Static1.anInt1551 = 1;
					} else {
						Static1.anInt1551 = 3;
					}
				}
				return true;
			}
			if (Static1.packetType == 170) {
				Static20.method399();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 250) {
				@Pc(1474) boolean local1474 = Static1.in.g1() == 1;
				local226 = Static1.in.g4s();
				local1170 = Static73.method1340(local226);
				local1170.aBoolean125 = local1474;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 155) {
				local650 = Static1.in.g8();
				local230 = Static1.in.g2();
				@Pc(1508) JagString local1508 = Static44.method819(local650).method1167();
				for (local364 = 0; local364 < Static1.anInt2594; local364++) {
					if (local650 == Static1.aLongArray2[local364]) {
						if (local230 != Static1.anIntArray316[local364]) {
							Static1.anIntArray316[local364] = local230;
							Static1.aBoolean59 = true;
							if (local230 > 0) {
								Static53.method989(5, JagString.aClass40_445, Static72.method1334(new JagString[] { local1508, JagString.aClass40_505 }));
							}
							if (local230 == 0) {
								Static53.method989(5, JagString.aClass40_445, Static72.method1334(new JagString[] { local1508, JagString.aClass40_1 }));
							}
						}
						local1508 = null;
						break;
					}
				}
				@Pc(1581) boolean local1581 = false;
				if (local1508 != null && Static1.anInt2594 < 200) {
					Static1.aLongArray2[Static1.anInt2594] = local650;
					Static1.aClass40Array23[Static1.anInt2594] = local1508;
					Static1.anIntArray316[Static1.anInt2594] = local230;
					Static1.anInt2594++;
					Static1.aBoolean59 = true;
				}
				while (!local1581) {
					local1581 = true;
					for (local376 = 0; local376 < Static1.anInt2594 - 1; local376++) {
						if (Static1.anInt140 != Static1.anIntArray316[local376] && Static1.anIntArray316[local376 + 1] == Static1.anInt140 || Static1.anIntArray316[local376] == 0 && Static1.anIntArray316[local376 + 1] != 0) {
							local1581 = false;
							@Pc(1649) int local1649 = Static1.anIntArray316[local376];
							Static1.anIntArray316[local376] = Static1.anIntArray316[local376 + 1];
							Static1.anIntArray316[local376 + 1] = local1649;
							@Pc(1667) JagString local1667 = Static1.aClass40Array23[local376];
							Static1.aClass40Array23[local376] = Static1.aClass40Array23[local376 + 1];
							Static1.aClass40Array23[local376 + 1] = local1667;
							@Pc(1685) long local1685 = Static1.aLongArray2[local376];
							Static1.aLongArray2[local376] = Static1.aLongArray2[local376 + 1];
							Static1.aLongArray2[local376 + 1] = local1685;
							Static1.aBoolean59 = true;
						}
					}
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 197) {
				Static56.method1039();
				Static1.packetType = -1;
				return false;
			}
			if (Static1.packetType == 36) {
				local125 = Static1.in.g2_alt1();
				local226 = Static1.in.g4s_alt3();
				local1170 = Static73.method1340(local226);
				if (local1170 != null && local1170.anInt1613 == 0) {
					if (local125 < 0) {
						local125 = 0;
					}
					if (local125 > local1170.anInt1601 - local1170.anInt1609) {
						local125 = local1170.anInt1601 - local1170.anInt1609;
					}
					local1170.anInt1587 = local125;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 26) {
				Static1.packetType = -1;
				JagString.aClass40_444 = JagString.aClass40_445;
				Static1.anInt2399 = 2;
				Static1.aBoolean146 = false;
				Static1.aBoolean144 = true;
				return true;
			}
			@Pc(1801) JagString local1801;
			@Pc(1822) JagString local1822;
			if (Static1.packetType == 3) {
				local1801 = Static1.in.gjstr();
				@Pc(1813) boolean local1813;
				if (local1801.method1195(JagString.aClass40_728)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Static1.anInt121; local359++) {
						if (local655 == Static1.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static1.anInt440 == 0) {
						Static53.method989(4, local1822, JagString.aClass40_14);
					}
				} else if (local1801.method1195(JagString.aClass40_654)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Static1.anInt121; local359++) {
						if (Static1.aLongArray4[local359] == local655) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static1.anInt440 == 0) {
						Static53.method989(8, local1822, JagString.aClass40_708);
					}
				} else if (local1801.method1195(Static1.aClass40_542)) {
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.method1179();
					local1813 = false;
					for (local359 = 0; local359 < Static1.anInt121; local359++) {
						if (local655 == Static1.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static1.anInt440 == 0) {
						@Pc(1923) JagString local1923 = local1801.method1180(local1801.method1169() - 9, local1801.method1200(JagString.aClass40_673) + 1);
						Static53.method989(8, local1822, local1923);
					}
				} else {
					Static53.method989(0, JagString.aClass40_445, local1801);
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 85) {
				local125 = Static1.in.g1_alt1();
				local1822 = Static1.in.gjstr();
				local230 = Static1.in.g1_alt2();
				if (local230 >= 1 && local230 <= 5) {
					if (local1822.method1199(JagString.aClass40_359)) {
						local1822 = null;
					}
					Static1.aClass40Array6[local230 - 1] = local1822;
					Static1.aBooleanArray41[local230 - 1] = local125 == 0;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 110) {
				Static86.method1495();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 128) {
				Static1.aBoolean59 = true;
				local125 = Static1.in.g4s();
				local836 = Static73.method1340(local125);
				local230 = Static1.in.g2();
				for (local355 = 0; local355 < local230; local355++) {
					local364 = Static1.in.g1_alt1();
					if (local364 == 255) {
						local364 = Static1.in.g4s();
					}
					local836.anIntArray331[local355] = Static1.in.g2_alt3();
					local836.anIntArray327[local355] = local364;
				}
				for (local364 = local230; local364 < local836.anIntArray331.length; local364++) {
					local836.anIntArray331[local364] = 0;
					local836.anIntArray327[local364] = 0;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 133) {
				local125 = Static1.in.g4s_alt1();
				local226 = Static1.in.g2_alt3();
				local1170 = Static73.method1340(local125);
				Static1.packetType = -1;
				local1170.anInt1607 = 1;
				local1170.anInt1602 = local226;
				return true;
			}
			if (Static1.packetType == 54) {
				Static1.anInt121 = Static1.anInt785 / 8;
				for (local125 = 0; local125 < Static1.anInt121; local125++) {
					Static1.aLongArray4[local125] = Static1.in.g8();
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 38) {
				Static1.anInt1973 = Static1.in.g2_alt3() * 30;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 66) {
				Static1.anInt2328 = Static1.in.g1();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 118 || Static1.packetType == 63 || Static1.packetType == 21 || Static1.packetType == 46 || Static1.packetType == 135 || Static1.packetType == 69 || Static1.packetType == 221 || Static1.packetType == 56 || Static1.packetType == 129 || Static1.packetType == 35 || Static1.packetType == 244) {
				Static3.method26();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 195) {
				local125 = Static1.in.g2_alt2();
				Static95.method1648(local125);
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = -1;
					Static1.aBoolean184 = true;
					Static1.aBoolean59 = true;
				}
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
					Static1.aBoolean144 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != local125) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = local125;
				}
				Static1.aBoolean40 = false;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 144) {
				// UPDATE_ZONE_FULL_FOLLOWS
				Static83.baseZ = Static1.in.g1_alt2();
				Static87.baseX = Static1.in.g1_alt3();
				for (local125 = Static87.baseX; local125 < Static87.baseX + 8; local125++) {
					for (local226 = Static83.baseZ; local226 < Static83.baseZ + 8; local226++) {
						if (Static1.levelObjStacks[Static1.currentLevel][local125][local226] != null) {
							Static1.levelObjStacks[Static1.currentLevel][local125][local226] = null;
							Static75.sortObjStacks(local226, local125);
						}
					}
				}
				for (@Pc(2420) LocTemporary loc = (LocTemporary) Static1.spawnedLocations.head(); loc != null; loc = (LocTemporary) Static1.spawnedLocations.next()) {
					if (Static87.baseX <= loc.x && loc.x < Static87.baseX + 8 && loc.z >= Static83.baseZ && Static83.baseZ + 8 > loc.z && loc.level == Static1.currentLevel) {
						loc.anInt826 = 0;
					}
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 239) {
				local125 = Static1.in.g2s_alt3();
				if (local125 >= 0) {
					Static95.method1648(local125);
				}
				if (local125 != Static1.anInt51) {
					Static75.method1350(Static1.anInt51);
					Static1.anInt51 = local125;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 202) {
				local125 = Static1.in.g4s_alt2();
				local226 = Static1.in.g2_alt3();
				local230 = local226 >> 10 & 0x1F;
				local355 = local226 >> 5 & 0x1F;
				local364 = local226 & 0x1F;
				@Pc(2530) ComType local2530 = Static73.method1340(local125);
				Static1.packetType = -1;
				local2530.anInt1584 = (local355 << 11) + (local230 << 19) + (local364 << 3);
				return true;
			}
			if (Static1.packetType == 243) {
				for (local125 = 0; local125 < Static54.anInt1505; local125++) {
					@Pc(2561) VarpType local2561 = Static90.method1568(local125);
					if (local2561 != null && local2561.anInt1076 == 0) {
						Static1.anIntArray288[local125] = 0;
						Static1.anIntArray339[local125] = 0;
					}
				}
				Static1.aBoolean59 = true;
				Static1.packetType = -1;
				if (Static1.anInt980 != -1) {
					Static1.aBoolean144 = true;
				}
				return true;
			}
			if (Static1.packetType == 181) {
				Static1.anInt2505 = Static1.in.g1();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 180) {
				Static1.anInt583 = Static1.in.g1();
				Static1.anInt2515 = Static1.in.g1();
				Static1.anInt2491 = Static1.in.g1();
				Static1.aBoolean144 = true;
				Static1.packetType = -1;
				Static1.aBoolean95 = true;
				return true;
			}
			if (Static1.packetType == 121) {
				Static1.packetType = -1;
				Static1.anInt986 = 0;
				return true;
			}
			if (Static1.packetType == 53) {
				local1801 = Static1.in.gjstr();
				local226 = Static1.in.g4s_alt2();
				local1170 = Static73.method1340(local226);
				local1170.aClass40_466 = local1801;
				if (local226 >> 16 == Static1.anIntArray2[Static1.anInt1551]) {
					Static1.aBoolean59 = true;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 45) {
				Static1.aBoolean59 = true;
				local125 = Static1.in.g4s();
				local836 = Static73.method1340(local125);
				while (Static1.anInt785 > Static1.in.pos) {
					local230 = Static1.in.gSmart1or2();
					local355 = Static1.in.g2();
					local364 = Static1.in.g1();
					if (local364 == 255) {
						local364 = Static1.in.g4s();
					}
					if (local230 >= 0 && local230 < local836.anIntArray331.length) {
						local836.anIntArray331[local230] = local355;
						local836.anIntArray327[local230] = local364;
					}
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 58) {
				local125 = Static1.in.g2_alt2();
				local226 = Static1.in.g2_alt1();
				local230 = Static1.in.g4s_alt1();
				local355 = Static1.in.g2_alt1();
				@Pc(2761) ComType local2761 = Static73.method1340(local230);
				local2761.anInt1579 = local125;
				Static1.packetType = -1;
				local2761.anInt1586 = local226;
				local2761.anInt1614 = local355;
				return true;
			}
			if (Static1.packetType == 24) {
				local125 = Static1.in.g2_alt3();
				local226 = Static1.in.g2_alt1();
				local230 = Static1.in.g4s_alt3();
				local234 = Static73.method1340(local230);
				local234.anInt1617 = (local125 << 16) + local226;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 25) {
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.aBoolean59 = true;
					Static1.anInt1654 = -1;
					Static1.aBoolean184 = true;
				}
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
					Static1.aBoolean144 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				Static1.packetType = -1;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				Static1.aBoolean40 = false;
				return true;
			}
			if (Static1.packetType == 252) {
				local125 = Static1.in.g1_alt1();
				local226 = Static1.in.g2_alt3();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Static1.anIntArray2[local125] != local226) {
					Static75.method1350(Static1.anIntArray2[local125]);
					Static1.anIntArray2[local125] = local226;
				}
				Static1.aBoolean59 = true;
				Static1.aBoolean184 = true;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 203) {
				Static1.anInt1038 = Static1.in.g1();
				Static1.aBoolean59 = true;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 71) {
				local650 = Static1.in.g8();
				@Pc(2944) JagString local2944 = Static7.method192(Static1.in).method1166();
				Static53.method989(6, Static44.method819(local650).method1167(), local2944);
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 163) {
				local125 = Static1.in.g2_alt2();
				local226 = Static1.in.g2_alt3();
				Static95.method1648(local226);
				if (local125 != -1) {
					Static95.method1648(local125);
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = -1;
				}
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
				}
				if (Static1.anInt1971 != local226) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = local226;
					Static7.method187(35);
				}
				if (local226 != Static1.anInt2175) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = local125;
				}
				Static1.aBoolean40 = false;
				Static1.packetType = -1;
				Static1.anInt2399 = 0;
				return true;
			}
			if (Static1.packetType == 80) {
				local125 = Static1.in.g4s();
				local226 = Static1.in.g2();
				Static1.anIntArray288[local226] = local125;
				if (local125 != Static1.anIntArray339[local226]) {
					Static1.anIntArray339[local226] = local125;
					Static21.method1700(local226);
					if (Static1.anInt980 != -1) {
						Static1.aBoolean144 = true;
					}
					Static1.aBoolean59 = true;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 223) {
				Static83.baseZ = Static1.in.g1_alt3();
				Static87.baseX = Static1.in.g1();
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 102) {
				local125 = Static1.in.g2_alt2();
				Static95.method1648(local125);
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.aBoolean144 = true;
					Static1.anInt1994 = -1;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				if (local125 != Static1.anInt1654) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = local125;
				}
				Static1.aBoolean184 = true;
				Static1.aBoolean40 = false;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				Static1.packetType = -1;
				Static1.aBoolean59 = true;
				return true;
			}
			if (Static1.packetType == 194) {
				local125 = Static1.in.g2_alt2();
				@Pc(3171) byte local3171 = Static1.in.g1b_alt3();
				Static1.anIntArray288[local125] = local3171;
				if (local3171 != Static1.anIntArray339[local125]) {
					Static1.anIntArray339[local125] = local3171;
					Static21.method1700(local125);
					if (Static1.anInt980 != -1) {
						Static1.aBoolean144 = true;
					}
					Static1.aBoolean59 = true;
				}
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 255) {
				local125 = Static1.in.g1();
				local226 = Static1.in.g1();
				local230 = Static1.in.g1();
				local355 = Static1.in.g1();
				Static1.aBooleanArray35[local125] = true;
				Static1.anIntArray93[local125] = local226;
				Static1.anIntArray164[local125] = local230;
				Static1.anIntArray159[local125] = local355;
				Static1.anIntArray415[local125] = 0;
				Static1.packetType = -1;
				return true;
			}
			if (Static1.packetType == 213) {
				local125 = Static1.in.g4s_alt1();
				local226 = Static1.in.g2s_alt1();
				local1170 = Static73.method1340(local125);
				Static1.packetType = -1;
				if (local226 != local1170.anInt1574 || local226 == -1) {
					local1170.anInt1569 = 0;
					local1170.anInt1574 = local226;
					local1170.anInt1593 = 0;
				}
				return true;
			}
			Static36.method727("T1 - " + Static1.packetType + "," + Static1.anInt2352 + "," + Static1.anInt1986 + " - " + Static1.anInt785, null);
			Static56.method1039();
		} catch (@Pc(3308) IOException local3308) {
			Static32.method626();
		} catch (@Pc(3312) Exception local3312) {
			@Pc(3352) String local3352 = "T2 - " + Static1.packetType + "," + Static1.anInt2352 + "," + Static1.anInt1986 + " - " + Static1.anInt785 + "," + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] + Static79.anInt2058) + "," + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] + Static28.anInt725) + " - ";
			for (local226 = 0; local226 < Static1.anInt785 && local226 < 50; local226++) {
				local3352 = local3352 + Static1.in.data[local226] + ",";
			}
			Static36.method727(local3352, local3312);
			Static56.method1039();
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 1919)
	public static void method23() {
		Static1.aBoolean23 = true;
		Static85.method1486();
		if (Static1.aBoolean146) {
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(JagString.aClass40_453, 239, 40, 0);
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Static72.method1334(new JagString[] { JagString.aClass40_447, JagString.aClass40_116 }), 239, 60, 128);
		} else if (Static1.anInt2399 == 1) {
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(JagString.aClass40_60, 239, 40, 0);
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Static72.method1334(new JagString[] { JagString.aClass40_444, JagString.aClass40_116 }), 239, 60, 128);
		} else if (Static1.anInt2399 == 2) {
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(JagString.aClass40_695, 239, 40, 0);
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Static72.method1334(new JagString[] { JagString.aClass40_444, JagString.aClass40_116 }), 239, 60, 128);
		} else {
			@Pc(68) PixFont local68;
			@Pc(75) int local75;
			@Pc(87) int local87;
			if (Static1.anInt2399 == 3) {
				if (JagString.aClass40_444 != JagString.aClass40_452) {
					Static13.method264(JagString.aClass40_444);
					JagString.aClass40_452 = JagString.aClass40_444;
				}
				local68 = Static95.aClass2_Sub2_Sub2_Sub2_5;
				Static25.method1613(0, 0, 463, 77);
				for (local75 = 0; local75 < Static1.anInt2066; local75++) {
					local87 = local75 * 14 + 18 - Static1.anInt53;
					if (local87 > 0 && local87 < 110) {
						local68.method566(Static1.aClass40Array7[local75], 239, local87, 0);
					}
				}
				Static25.method1614();
				if (Static1.anInt2066 > 5) {
					Static35.method711(77, 463, Static1.anInt53, 0, Static1.anInt2066 * 14 + 7);
				}
				if (JagString.aClass40_444.method1169() == 0) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(JagString.aClass40_159, 239, 40, 255);
				} else if (Static1.anInt2066 == 0) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(JagString.aClass40_569, 239, 40, 0);
				}
				local68.method566(Static72.method1334(new JagString[] { JagString.aClass40_444, JagString.aClass40_116 }), 239, 90, 0);
				Static25.method1603(0, 77, 479, 0);
			} else if (JagString.aClass40_112 == null) {
				@Pc(781) boolean local781;
				if (Static1.anInt1994 != -1) {
					local781 = Static20.method403(0, -1, Static1.anInt1994, 2, 0, 96, 0, 479);
					if (!local781) {
						Static1.aBoolean144 = true;
					}
				} else if (Static1.anInt980 == -1) {
					local75 = 0;
					local68 = Static95.aClass2_Sub2_Sub2_Sub2_5;
					Static25.method1613(0, 0, 463, 77);
					for (local87 = 0; local87 < 100; local87++) {
						if (Static1.aClass40Array30[local87] != null) {
							@Pc(218) int local218 = Static1.anInt799 + 70 - local75 * 14;
							@Pc(222) int local222 = Static1.anIntArray469[local87];
							@Pc(224) byte local224 = 0;
							@Pc(228) JagString local228 = Static1.aClass40Array40[local87];
							if (local228 != null && local228.method1168(JagString.aClass40_323)) {
								local228 = local228.method1185(5);
								local224 = 1;
							}
							if (local228 != null && local228.method1168(JagString.aClass40_622)) {
								local228 = local228.method1185(5);
								local224 = 2;
							}
							if (local222 == 0) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static1.aClass40Array30[local87], 4, local218, 0);
								}
							}
							@Pc(306) int local306;
							if ((local222 == 1 || local222 == 2) && (local222 == 1 || Static1.anInt583 == 0 || Static1.anInt583 == 1 && Static36.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local306 = 4;
									if (local224 == 1) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(4, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.method575(Static72.method1334(new JagString[] { local228, JagString.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.method575(Static1.aClass40Array30[local87], local306, local218, 255);
								}
							}
							if ((local222 == 3 || local222 == 7) && Static1.anInt2473 == 0 && (local222 == 7 || Static1.anInt2515 == 0 || Static1.anInt2515 == 1 && Static36.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(JagString.aClass40_340, 4, local218, 0);
									local306 = local68.method568(JagString.aClass40_564) + 4;
									if (local224 == 1) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(local306, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.method575(Static72.method1334(new JagString[] { local228, JagString.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.method575(Static1.aClass40Array30[local87], local306, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 4 && (Static1.anInt2491 == 0 || Static1.anInt2491 == 1 && Static36.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static72.method1334(new JagString[] { local228, JagString.aClass40_716, Static1.aClass40Array30[local87] }), 4, local218, 8388736);
								}
							}
							if (local222 == 5 && Static1.anInt2473 == 0 && Static1.anInt2515 < 2) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static1.aClass40Array30[local87], 4, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 6 && Static1.anInt2473 == 0 && Static1.anInt2515 < 2) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static72.method1334(new JagString[] { JagString.aClass40_690, local228, JagString.aClass40_673 }), 4, local218, 0);
									local68.method575(Static1.aClass40Array30[local87], local68.method568(Static72.method1334(new JagString[] { JagString.aClass40_690, local228 })) + 12, local218, 8388608);
								}
							}
							if (local222 == 8 && (Static1.anInt2491 == 0 || Static1.anInt2491 == 1 && Static36.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static72.method1334(new JagString[] { local228, JagString.aClass40_716, Static1.aClass40Array30[local87] }), 4, local218, 8270336);
								}
								local75++;
							}
						}
					}
					Static25.method1614();
					Static1.anInt1506 = local75 * 14 + 7;
					if (Static1.anInt1506 < 78) {
						Static1.anInt1506 = 78;
					}
					Static35.method711(77, 463, Static1.anInt1506 - Static1.anInt799 - 77, 0, Static1.anInt1506);
					@Pc(709) JagString local709;
					if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1 == null || Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395 == null) {
						local709 = JagString.aClass40_591;
					} else {
						local709 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395;
					}
					local68.method575(Static72.method1334(new JagString[] { local709, JagString.aClass40_673 }), 4, 90, 0);
					local68.method575(Static72.method1334(new JagString[] { JagString.aClass40_451, JagString.aClass40_116 }), local68.method568(Static72.method1334(new JagString[] { local709, JagString.aClass40_4 })) + 6, 90, 255);
					Static25.method1603(0, 77, 479, 0);
				} else {
					local781 = Static20.method403(0, -1, Static1.anInt980, 3, 0, 96, 0, 479);
					if (!local781) {
						Static1.aBoolean144 = true;
					}
				}
			} else {
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(JagString.aClass40_112, 239, 40, 0);
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(JagString.aClass40_252, 239, 60, 128);
			}
		}
		if (Static1.aBoolean175 && Static1.anInt16 == 2) {
			Static22.method480();
		}
		Static4.method83(Static23.aGraphics1);
	}
}

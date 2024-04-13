import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ua", name = "Mc", descriptor = "Lclient!vb;")
	public static Pix24 aClass2_Sub2_Sub2_Sub4_9;

	@OriginalMember(owner = "client!ua", name = "ad", descriptor = "I")
	public static int anInt2341;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V", line = 52)
	public static void method1549(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static1.anIntArray287[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		@Pc(22) int local22 = Static1.anIntArray454[arg0];
		@Pc(26) int local26 = Static1.anIntArray161[arg0];
		@Pc(30) int local30 = Static1.anIntArray165[arg0];
		if (Static1.anInt2399 != 0 && local12 != 1003) {
			Static1.anInt2399 = 0;
			Static1.aBoolean144 = true;
		}
		@Pc(50) NpcEntity local50;
		@Pc(70) JagString local70;
		if (local12 == 1006) {
			local50 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				@Pc(55) NpcType local55 = local50.aClass2_Sub2_Sub7_1;
				if (local55.anIntArray154 != null) {
					local55 = local55.method611();
				}
				if (local55 != null) {
					if (local55.aClass40_237 == null) {
						local70 = Static72.method1334(new JagString[] { JagString.aClass40_318, local55.aClass40_238, JagString.aClass40_306 });
					} else {
						local70 = local55.aClass40_237;
					}
					Static53.method989(0, JagString.aClass40_445, local70);
				}
			}
		}
		if (local12 == 8) {
			local50 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static75.method1349(local50.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static1.anInt1096 = 2;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt2410 = 0;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(110);
				Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			}
		}
		if (local12 == 1005) {
			@Pc(161) int local161 = local22 >> 14 & 0x7FFF;
			@Pc(165) LocType local165 = Static83.method1470(local161);
			if (local165.aClass40_316 == null) {
				local70 = Static72.method1334(new JagString[] { JagString.aClass40_318, local165.aClass40_315, JagString.aClass40_306 });
			} else {
				local70 = local165.aClass40_316;
			}
			Static53.method989(0, JagString.aClass40_445, local70);
		}
		@Pc(225) boolean local225;
		if (local12 == 11) {
			local225 = Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local225) {
				Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static1.anInt2410 = 0;
			Static1.anInt1096 = 2;
			Static1.anInt2465 = Static1.anInt2133;
			Static1.anInt1554 = Static1.anInt2500;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(211);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static28.anInt724);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(Static91.anInt96);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local26 + Static79.anInt2058);
			Static1.aClass2_Sub3_Sub1_4.p2(Static28.anInt725 + local30);
			Static1.aClass2_Sub3_Sub1_4.p4_alt1(Static97.anInt2526);
			Static1.aClass2_Sub3_Sub1_4.p2(local22);
		}
		if (local12 == 56) {
			local50 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static75.method1349(local50.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt2410 = 0;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1096 = 2;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(212);
				Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			}
		}
		if (local12 == 55) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(79);
			Static1.aClass2_Sub3_Sub1_4.p4_alt2(local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			Static1.aClass2_Sub3_Sub1_4.p2(local26);
			Static1.anInt481 = 2;
			Static1.anInt1171 = local30;
			Static1.anInt1947 = local26;
			if (Static1.anInt2585 == local30 >> 16) {
				Static1.anInt481 = 1;
			}
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
			Static1.anInt719 = 0;
		}
		@Pc(407) JagString local407;
		@Pc(412) int local412;
		@Pc(427) long local427;
		if (local12 == 51 || local12 == 12 || local12 == 2 || local12 == 45) {
			local407 = Static1.aClass40Array8[arg0];
			local412 = local407.method1200(JagString.aClass40_229);
			if (local412 != -1) {
				local427 = local407.method1185(local412 + 5).method1178().method1179();
				if (local12 == 51) {
					Static58.method1062(local427);
				}
				if (local12 == 12) {
					Static14.method1254(local427);
				}
				if (local12 == 2) {
					Static64.method1115(local427);
				}
				if (local12 == 45) {
					Static74.method1345(local427);
				}
			}
		}
		@Pc(462) PlayerEntity local462;
		if (local12 == 15) {
			local462 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local462 != null) {
				Static75.method1349(local462.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local462.anIntArray492[0]);
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt2410 = 0;
				Static1.anInt1096 = 2;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(7);
				Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			}
		}
		@Pc(529) ComType local529;
		if (local12 == 49) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(184);
			Static1.aClass2_Sub3_Sub1_4.p4(local30);
			local529 = Static73.method1340(local30);
			if (local529.anIntArrayArray11 != null && local529.anIntArrayArray11[0][0] == 5) {
				local412 = local529.anIntArrayArray11[0][1];
				if (local529.anIntArray333[0] != Static1.anIntArray339[local412]) {
					Static1.anIntArray339[local412] = local529.anIntArray333[0];
					Static21.method1700(local412);
					Static1.aBoolean59 = true;
				}
			}
		}
		@Pc(600) int local600;
		if (local12 == 20) {
			local407 = Static1.aClass40Array8[arg0];
			local412 = local407.method1200(JagString.aClass40_229);
			if (local412 != -1) {
				local427 = local407.method1185(local412 + 5).method1178().method1179();
				@Pc(598) int local598 = -1;
				for (local600 = 0; local600 < Static1.anInt2594; local600++) {
					if (Static1.aLongArray2[local600] == local427) {
						local598 = local600;
						break;
					}
				}
				if (local598 != -1 && Static1.anIntArray316[local598] > 0) {
					Static1.anInt2180 = 3;
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
					Static1.aBoolean146 = true;
					JagString.aClass40_447 = JagString.aClass40_445;
					Static1.aLong136 = Static1.aLongArray2[local598];
					JagString.aClass40_453 = Static72.method1334(new JagString[] { JagString.aClass40_2, Static1.aClass40Array23[local598] });
				}
			}
		}
		if (local12 == 46) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(64);
			Static1.aClass2_Sub3_Sub1_4.p4(local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			Static1.anInt1171 = local30;
			Static1.anInt481 = 2;
			Static1.anInt719 = 0;
			Static1.anInt1947 = local26;
			if (local30 >> 16 == Static1.anInt2585) {
				Static1.anInt481 = 1;
			}
			if (local30 >> 16 == Static1.anInt1994) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 42) {
			local407 = Static1.aClass40Array8[arg0];
			local412 = local407.method1200(JagString.aClass40_229);
			if (local412 != -1) {
				if (Static1.anInt2585 == -1) {
					Static55.method998();
					if (Static1.anInt808 != -1) {
						JagString.aClass40_448 = local407.method1185(local412 + 5).method1178();
						Static1.anInt1826 = Static1.anInt2585 = Static1.anInt808;
						Static1.aBoolean103 = false;
					}
				} else {
					Static53.method989(0, JagString.aClass40_445, JagString.aClass40_628);
				}
			}
		}
		if (local12 == 31) {
			local50 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static75.method1349(local50.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt1096 = 2;
				Static1.anInt2410 = 0;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(133);
				Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			}
		}
		if (local12 == 40) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(184);
			Static1.aClass2_Sub3_Sub1_4.p4(local30);
			local529 = Static73.method1340(local30);
			if (local529.anIntArrayArray11 != null && local529.anIntArrayArray11[0][0] == 5) {
				local412 = local529.anIntArrayArray11[0][1];
				Static1.anIntArray339[local412] = 1 - Static1.anIntArray339[local412];
				Static21.method1700(local412);
				Static1.aBoolean59 = true;
			}
		}
		if (local12 == 4) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(220);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22);
			Static1.aClass2_Sub3_Sub1_4.p2(local26);
			Static1.aClass2_Sub3_Sub1_4.p4_alt2(local30);
			Static1.anInt481 = 2;
			Static1.anInt719 = 0;
			Static1.anInt1947 = local26;
			Static1.anInt1171 = local30;
			if (Static1.anInt2585 == local30 >> 16) {
				Static1.anInt481 = 1;
			}
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 33) {
			local462 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local462 != null) {
				Static75.method1349(local462.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local462.anIntArray492[0]);
				Static1.anInt1096 = 2;
				Static1.anInt2410 = 0;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(58);
				Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			}
		}
		if (local12 == 44) {
			local50 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local50 != null) {
				Static75.method1349(local50.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local50.anIntArray492[0]);
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt1096 = 2;
				Static1.anInt2410 = 0;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(101);
				Static1.aClass2_Sub3_Sub1_4.p4(Static77.anInt1992);
				Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			}
		}
		if (local12 == 3) {
			local225 = Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local225) {
				Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static1.anInt2465 = Static1.anInt2133;
			Static1.anInt1096 = 2;
			Static1.anInt1554 = Static1.anInt2500;
			Static1.anInt2410 = 0;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(131);
			Static1.aClass2_Sub3_Sub1_4.p2(local30 + Static28.anInt725);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			Static1.aClass2_Sub3_Sub1_4.p2(local26 + Static79.anInt2058);
		}
		if (local12 == 16) {
			local225 = Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local225) {
				Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static1.anInt1096 = 2;
			Static1.anInt1554 = Static1.anInt2500;
			Static1.anInt2465 = Static1.anInt2133;
			Static1.anInt2410 = 0;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(200);
			Static1.aClass2_Sub3_Sub1_4.p2(Static28.anInt725 + local30);
			Static1.aClass2_Sub3_Sub1_4.p2(Static79.anInt2058 + local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22);
		}
		@Pc(1208) boolean local1208;
		if (local12 == 54) {
			local529 = Static73.method1340(local30);
			local1208 = true;
			if (local529.anInt1610 > 0) {
				local1208 = Static34.method639(local529);
			}
			if (local1208) {
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(184);
				Static1.aClass2_Sub3_Sub1_4.p4(local30);
			}
		}
		if (local12 == 32) {
			Static55.method998();
		}
		if (local12 == 41) {
			Static39.method770(local30, local22, local26);
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(165);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local30 + Static28.anInt725);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static79.anInt2058 + local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22 >> 14 & 0x7FFF);
		}
		@Pc(1295) NpcEntity local1295;
		if (local12 == 17) {
			local1295 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local1295 != null) {
				Static75.method1349(local1295.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local1295.anIntArray492[0]);
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt1096 = 2;
				Static1.anInt2410 = 0;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(185);
				Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			}
		}
		if (local12 == 1) {
			Static1.anInt1874 = 1;
			Static28.anInt724 = local26;
			Static97.anInt2526 = local30;
			Static91.anInt96 = local22;
			JagString.aClass40_601 = Static97.method1669(local22).aClass40_290;
			if (JagString.aClass40_601 == null) {
				JagString.aClass40_601 = JagString.aClass40_359;
			}
			Static1.anInt641 = 0;
			Static1.aBoolean59 = true;
			return;
		}
		if (local12 == 39) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(135);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			Static1.aClass2_Sub3_Sub1_4.p4_alt2(local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local26);
			Static1.anInt481 = 2;
			Static1.anInt719 = 0;
			if (local30 >> 16 == Static1.anInt2585) {
				Static1.anInt481 = 1;
			}
			Static1.anInt1171 = local30;
			Static1.anInt1947 = local26;
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 22) {
			local1295 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local1295 != null) {
				Static75.method1349(local1295.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local1295.anIntArray492[0]);
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt2410 = 0;
				Static1.anInt1096 = 2;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(164);
				Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22);
			}
		}
		if (local12 == 14) {
			local1208 = Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static1.anInt1096 = 2;
			Static1.anInt2465 = Static1.anInt2133;
			Static1.anInt1554 = Static1.anInt2500;
			Static1.anInt2410 = 0;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(219);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(Static79.anInt2058 + local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local30 + Static28.anInt725);
		}
		@Pc(1556) ObjType local1556;
		if (local12 == 1001) {
			local1556 = Static97.method1669(local22);
			if (local1556.aClass40_289 == null) {
				local70 = Static72.method1334(new JagString[] { JagString.aClass40_318, local1556.aClass40_290, JagString.aClass40_306 });
			} else {
				local70 = local1556.aClass40_289;
			}
			Static53.method989(0, JagString.aClass40_445, local70);
		}
		if (local12 == 28) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(66);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local26);
			Static1.aClass2_Sub3_Sub1_4.p4_alt2(local30);
			Static1.aClass2_Sub3_Sub1_4.p2(local22);
			Static1.aClass2_Sub3_Sub1_4.p4(Static77.anInt1992);
			Static1.anInt481 = 2;
			Static1.anInt1947 = local26;
			if (local30 >> 16 == Static1.anInt2585) {
				Static1.anInt481 = 1;
			}
			Static1.anInt719 = 0;
			Static1.anInt1171 = local30;
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 35) {
			Static75.method1350(Static1.anInt980);
			Static1.anInt980 = -1;
			Static1.aBoolean144 = true;
		}
		if (local12 == 52) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(199);
			Static1.aClass2_Sub3_Sub1_4.p2(local26);
			Static1.aClass2_Sub3_Sub1_4.p4(local30);
			Static1.aClass2_Sub3_Sub1_4.p2(local22);
			Static1.anInt719 = 0;
			Static1.anInt1171 = local30;
			Static1.anInt481 = 2;
			if (Static1.anInt2585 == local30 >> 16) {
				Static1.anInt481 = 1;
			}
			if (local30 >> 16 == Static1.anInt1994) {
				Static1.anInt481 = 3;
			}
			Static1.anInt1947 = local26;
		}
		if (local12 == 53) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(193);
			Static1.aClass2_Sub3_Sub1_4.p4_alt3(local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			Static1.anInt1947 = local26;
			Static1.anInt481 = 2;
			if (Static1.anInt2585 == local30 >> 16) {
				Static1.anInt481 = 1;
			}
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
			Static1.anInt1171 = local30;
			Static1.anInt719 = 0;
		}
		if (local12 == 34) {
			Static39.method770(local30, local22, local26);
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(222);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(Static28.anInt725 + local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22 >> 14 & 0x7FFF);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static79.anInt2058 + local26);
		}
		if (local12 == 47) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(192);
			Static1.aClass2_Sub3_Sub1_4.p4_alt1(local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			Static1.anInt1171 = local30;
			Static1.anInt719 = 0;
			Static1.anInt481 = 2;
			Static1.anInt1947 = local26;
			if (Static1.anInt2585 == local30 >> 16) {
				Static1.anInt481 = 1;
			}
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 26) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(194);
			Static1.aClass2_Sub3_Sub1_4.p2(local22);
			Static1.aClass2_Sub3_Sub1_4.p4_alt2(local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local26);
			Static1.anInt719 = 0;
			Static1.anInt1947 = local26;
			Static1.anInt1171 = local30;
			Static1.anInt481 = 2;
			if (Static1.anInt2585 == local30 >> 16) {
				Static1.anInt481 = 1;
			}
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 1002) {
			local1556 = Static97.method1669(local22);
			@Pc(1908) ComType local1908 = Static73.method1340(local30);
			if (local1908 != null && local1908.anIntArray327[local26] >= 100000) {
				local70 = Static72.method1334(new JagString[] { Static48.method859(local1908.anIntArray327[local26]), JagString.aClass40_496, local1556.aClass40_290 });
			} else if (local1556.aClass40_289 == null) {
				local70 = Static72.method1334(new JagString[] { JagString.aClass40_318, local1556.aClass40_290, JagString.aClass40_306 });
			} else {
				local70 = local1556.aClass40_289;
			}
			Static53.method989(0, JagString.aClass40_445, local70);
		}
		if (local12 == 1004) {
			Static39.method770(local30, local22, local26);
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(33);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local30 + Static28.anInt725);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static79.anInt2058 + local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 10) {
			Static39.method770(local30, local22, local26);
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(3);
			Static1.aClass2_Sub3_Sub1_4.p2(Static79.anInt2058 + local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static28.anInt725 + local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 23) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(29);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local26);
			Static1.aClass2_Sub3_Sub1_4.p2(local22);
			Static1.aClass2_Sub3_Sub1_4.p4_alt1(local30);
			Static1.anInt481 = 2;
			Static1.anInt1171 = local30;
			Static1.anInt1947 = local26;
			if (Static1.anInt2585 == local30 >> 16) {
				Static1.anInt481 = 1;
			}
			Static1.anInt719 = 0;
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 18 && !Static1.aBoolean40) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(11);
			Static1.aBoolean40 = true;
		}
		@Pc(2157) JagString local2157;
		if (local12 == 21) {
			@Pc(2125) ComType local2125 = Static73.method1340(local30);
			Static1.anInt1874 = 0;
			local70 = local2125.aClass40_471;
			Static1.aBoolean59 = true;
			Static77.anInt1992 = local30;
			Static78.anInt2027 = local2125.anInt1599;
			Static1.anInt641 = 1;
			if (local70.method1200(JagString.aClass40_716) != -1) {
				local70 = local70.method1180(local70.method1200(JagString.aClass40_716), 0);
			}
			local2157 = local2125.aClass40_471;
			if (local2157.method1200(JagString.aClass40_716) != -1) {
				local2157 = local2157.method1185(local2157.method1200(JagString.aClass40_716) + 1);
			}
			JagString.aClass40_567 = Static72.method1334(new JagString[] { local70, JagString.aClass40_716, local2125.aClass40_464, JagString.aClass40_716, local2157 });
			if (Static78.anInt2027 == 16) {
				Static1.aBoolean59 = true;
				Static1.anInt1551 = 3;
				Static1.aBoolean184 = true;
			}
			return;
		}
		if (local12 == 24) {
			if (Static1.aBoolean175) {
				Static85.scene.method1450(local26 - 4, local30 + -4);
			} else {
				Static85.scene.method1450(Static1.anInt2500 - 4, Static1.anInt2133 + -4);
			}
		}
		if (local12 == 13) {
			local1208 = Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static1.anInt1096 = 2;
			Static1.anInt2465 = Static1.anInt2133;
			Static1.anInt2410 = 0;
			Static1.anInt1554 = Static1.anInt2500;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(156);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			Static1.aClass2_Sub3_Sub1_4.p2(Static79.anInt2058 + local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static28.anInt725 + local30);
		}
		if (local12 == 6 && Static39.method770(local30, local22, local26)) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(116);
			Static1.aClass2_Sub3_Sub1_4.p2(Static28.anInt725 + local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local26 + Static79.anInt2058);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22 >> 14 & 0x7FFF);
			Static1.aClass2_Sub3_Sub1_4.p4_alt2(Static77.anInt1992);
		}
		if (local12 == 29 || local12 == 37) {
			@Pc(2368) JagString local2368 = Static1.aClass40Array8[arg0];
			@Pc(2373) int local2373 = local2368.method1200(JagString.aClass40_229);
			if (local2373 != -1) {
				local2368 = local2368.method1185(local2373 + 5).method1178();
				local2157 = local2368.method1175().method1167();
				@Pc(2394) boolean local2394 = false;
				for (local600 = 0; local600 < Static1.anInt2067; local600++) {
					@Pc(2404) PlayerEntity local2404 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Static1.anIntArray408[local600]];
					if (local2404 != null && local2404.aClass40_395 != null && local2404.aClass40_395.method1199(local2157)) {
						local2394 = true;
						Static75.method1349(local2404.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2404.anIntArray492[0]);
						if (local12 == 29) {
							Static1.aClass2_Sub3_Sub1_4.pIsaac1(235);
							Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static1.anIntArray408[local600]);
						}
						if (local12 == 37) {
							Static1.aClass2_Sub3_Sub1_4.pIsaac1(7);
							Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static1.anIntArray408[local600]);
						}
						break;
					}
				}
				if (!local2394) {
					Static53.method989(0, JagString.aClass40_445, Static72.method1334(new JagString[] { JagString.aClass40_246, local2157 }));
				}
			}
		}
		@Pc(2510) PlayerEntity local2510;
		if (local12 == 30) {
			local2510 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static75.method1349(local2510.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static1.anInt1096 = 2;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt2410 = 0;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(36);
				Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			}
		}
		if (local12 == 9 && Static39.method770(local30, local22, local26)) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(44);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static91.anInt96);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22 >> 14 & 0x7FFF);
			Static1.aClass2_Sub3_Sub1_4.p2(Static28.anInt724);
			Static1.aClass2_Sub3_Sub1_4.p2(local30 + Static28.anInt725);
			Static1.aClass2_Sub3_Sub1_4.p4_alt3(Static97.anInt2526);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local26 + Static79.anInt2058);
		}
		if (local12 == 27) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(228);
			Static1.aClass2_Sub3_Sub1_4.p4_alt3(local30);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local26);
			Static1.aClass2_Sub3_Sub1_4.p2(local22);
			Static1.anInt1171 = local30;
			Static1.anInt481 = 2;
			Static1.anInt719 = 0;
			if (local30 >> 16 == Static1.anInt2585) {
				Static1.anInt481 = 1;
			}
			Static1.anInt1947 = local26;
			if (Static1.anInt1994 == local30 >> 16) {
				Static1.anInt481 = 3;
			}
		}
		if (local12 == 38) {
			local2510 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static75.method1349(local2510.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static1.anInt1096 = 2;
				Static1.anInt2410 = 0;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(235);
				Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			}
		}
		if (local12 == 19) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(142);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local26);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static91.anInt96);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static28.anInt724);
			Static1.aClass2_Sub3_Sub1_4.p4_alt3(local30);
			Static1.aClass2_Sub3_Sub1_4.p4_alt3(Static97.anInt2526);
			Static1.anInt1171 = local30;
			Static1.anInt481 = 2;
			if (local30 >> 16 == Static1.anInt2585) {
				Static1.anInt481 = 1;
			}
			Static1.anInt1947 = local26;
			if (local30 >> 16 == Static1.anInt1994) {
				Static1.anInt481 = 3;
			}
			Static1.anInt719 = 0;
		}
		if (local12 == 36) {
			local2510 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static75.method1349(local2510.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static1.anInt2410 = 0;
				Static1.anInt1096 = 2;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(147);
				Static1.aClass2_Sub3_Sub1_4.p4_alt2(Static77.anInt1992);
				Static1.aClass2_Sub3_Sub1_4.p2(local22);
			}
		}
		if (local12 == 48) {
			local1208 = Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static1.anInt2465 = Static1.anInt2133;
			Static1.anInt1096 = 2;
			Static1.anInt1554 = Static1.anInt2500;
			Static1.anInt2410 = 0;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(108);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static79.anInt2058 + local26);
			Static1.aClass2_Sub3_Sub1_4.p4_alt2(Static77.anInt1992);
			Static1.aClass2_Sub3_Sub1_4.p2(local22);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local30 + Static28.anInt725);
		}
		if (local12 == 50) {
			local1208 = Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local26);
			if (!local1208) {
				Static75.method1349(local30, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local26);
			}
			Static1.anInt1554 = Static1.anInt2500;
			Static1.anInt2465 = Static1.anInt2133;
			Static1.anInt1096 = 2;
			Static1.anInt2410 = 0;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(202);
			Static1.aClass2_Sub3_Sub1_4.p2(local30 + Static28.anInt725);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static79.anInt2058 + local26);
		}
		if (local12 == 7) {
			local1295 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			if (local1295 != null) {
				Static75.method1349(local1295.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local1295.anIntArray492[0]);
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt1096 = 2;
				Static1.anInt2410 = 0;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(4);
				Static1.aClass2_Sub3_Sub1_4.p2(local22);
				Static1.aClass2_Sub3_Sub1_4.p2(Static28.anInt724);
				Static1.aClass2_Sub3_Sub1_4.p4(Static97.anInt2526);
				Static1.aClass2_Sub3_Sub1_4.p2_alt1(Static91.anInt96);
			}
		}
		if (local12 == 43) {
			local2510 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static75.method1349(local2510.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static1.anInt1096 = 2;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt2410 = 0;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(190);
				Static1.aClass2_Sub3_Sub1_4.p2_alt3(local22);
			}
		}
		if (local12 == 5) {
			Static39.method770(local30, local22, local26);
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(139);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local30 + Static28.anInt725);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(local26 + Static79.anInt2058);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 25) {
			local2510 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local22];
			if (local2510 != null) {
				Static75.method1349(local2510.anIntArray496[0], 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 1, 0, 2, false, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 1, local2510.anIntArray492[0]);
				Static1.anInt1096 = 2;
				Static1.anInt2410 = 0;
				Static1.anInt2465 = Static1.anInt2133;
				Static1.anInt1554 = Static1.anInt2500;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(214);
				Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static91.anInt96);
				Static1.aClass2_Sub3_Sub1_4.p4_alt3(Static97.anInt2526);
				Static1.aClass2_Sub3_Sub1_4.p2(Static28.anInt724);
				Static1.aClass2_Sub3_Sub1_4.p2_alt1(local22);
			}
		}
		if (Static1.anInt1874 != 0) {
			Static1.aBoolean59 = true;
			Static1.anInt1874 = 0;
		}
		if (Static1.anInt641 != 0) {
			Static1.aBoolean59 = true;
			Static1.anInt641 = 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "(I)V", line = 1203)
	public static void method1550() {
		if (Static29.aClass25_48 != null) {
			Static29.aClass25_48.method730();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ud;ILclient!ud;Lclient!ud;)V", line = 1244)
	public static void method1551(@OriginalArg(0) Js5Index arg0, @OriginalArg(2) Js5Index arg1, @OriginalArg(3) Js5Index arg2) {
		Static68.aClass5_24 = arg2;
		Static35.aClass5_12 = arg1;
		Static77.aClass5_27 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)V", line = 1263)
	public static void method1552(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static45.method1537(JagString.aClass40_537, JagString.aClass40_586);
		} else if (arg0 == -2) {
			Static45.method1537(JagString.aClass40_445, JagString.aClass40_573);
		} else if (arg0 == -1) {
			Static45.method1537(JagString.aClass40_157, JagString.aClass40_586);
		} else if (arg0 == 3) {
			Static45.method1537(JagString.aClass40_445, JagString.aClass40_117);
		} else if (arg0 == 4) {
			Static45.method1537(JagString.aClass40_15, JagString.aClass40_488);
		} else if (arg0 == 5) {
			Static45.method1537(JagString.aClass40_732, JagString.aClass40_427);
		} else if (arg0 == 6) {
			Static45.method1537(JagString.aClass40_588, JagString.aClass40_192);
		} else if (arg0 == 7) {
			Static45.method1537(JagString.aClass40_141, JagString.aClass40_570);
		} else if (arg0 == 8) {
			Static45.method1537(JagString.aClass40_410, JagString.aClass40_529);
		} else if (arg0 == 9) {
			Static45.method1537(JagString.aClass40_645, JagString.aClass40_608);
		} else if (arg0 == 10) {
			Static45.method1537(JagString.aClass40_410, JagString.aClass40_713);
		} else if (arg0 == 11) {
			Static45.method1537(JagString.aClass40_341, JagString.aClass40_336);
		} else if (arg0 == 12) {
			Static45.method1537(JagString.aClass40_656, JagString.aClass40_631);
		} else if (arg0 == 13) {
			Static45.method1537(JagString.aClass40_84, JagString.aClass40_586);
		} else if (arg0 == 14) {
			Static45.method1537(JagString.aClass40_742, JagString.aClass40_518);
		} else if (arg0 == 16) {
			Static45.method1537(JagString.aClass40_575, JagString.aClass40_518);
		} else if (arg0 == 17) {
			Static45.method1537(JagString.aClass40_615, JagString.aClass40_338);
		} else if (arg0 == 18) {
			Static45.method1537(JagString.aClass40_406, JagString.aClass40_603);
		} else if (arg0 == 20) {
			Static45.method1537(JagString.aClass40_688, JagString.aClass40_586);
		} else if (arg0 == 22) {
			Static45.method1537(JagString.aClass40_257, JagString.aClass40_366);
		} else if (arg0 == 23) {
			Static45.method1537(JagString.aClass40_162, JagString.aClass40_518);
		} else if (arg0 == 24) {
			Static45.method1537(JagString.aClass40_559, JagString.aClass40_611);
		} else if (arg0 == 25) {
			Static45.method1537(JagString.aClass40_658, JagString.aClass40_586);
		} else if (arg0 == 26) {
			Static45.method1537(JagString.aClass40_104, JagString.aClass40_662);
		} else {
			Static45.method1537(Static72.method1334(new JagString[] { JagString.aClass40_585, Static48.method859(arg0) }), JagString.aClass40_586);
		}
		Static7.method187(10);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!ke;)V", line = 1421)
	public static void method1553(@OriginalArg(1) PathingEntity arg0) {
		arg0.aBoolean172 = false;
		@Pc(15) SeqType local15;
		if (arg0.anInt2318 != -1) {
			local15 = Static57.method1042(arg0.anInt2318);
			arg0.anInt2296++;
			if (arg0.anInt2295 < local15.anIntArray124.length && arg0.anInt2296 > local15.delay[arg0.anInt2295]) {
				arg0.anInt2295++;
				arg0.anInt2296 = 1;
			}
			if (arg0.anInt2295 >= local15.anIntArray124.length) {
				arg0.anInt2296 = 0;
				arg0.anInt2295 = 0;
			}
		}
		if (arg0.anInt2302 != -1 && arg0.anInt2320 <= Static1.anInt2511) {
			if (arg0.anInt2291 < 0) {
				arg0.anInt2291 = 0;
			}
			@Pc(81) int local81 = Static5.method116(arg0.anInt2302).anInt640;
			if (local81 == -1) {
				arg0.anInt2302 = -1;
			} else {
				@Pc(89) SeqType local89 = Static57.method1042(local81);
				arg0.anInt2268++;
				if (arg0.anInt2291 < local89.anIntArray124.length && arg0.anInt2268 > local89.delay[arg0.anInt2291]) {
					arg0.anInt2268 = 1;
					arg0.anInt2291++;
				}
				if (local89.anIntArray124.length <= arg0.anInt2291 && (arg0.anInt2291 < 0 || arg0.anInt2291 >= local89.anIntArray124.length)) {
					arg0.anInt2302 = -1;
				}
			}
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2313 <= 1) {
			local15 = Static57.method1042(arg0.anInt2307);
			if (local15.anInt663 == 1 && arg0.anInt2281 > 0 && arg0.anInt2277 <= Static1.anInt2511 && arg0.anInt2297 < Static1.anInt2511) {
				arg0.anInt2313 = 1;
				return;
			}
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2313 == 0) {
			local15 = Static57.method1042(arg0.anInt2307);
			arg0.anInt2267++;
			if (local15.anIntArray124.length > arg0.anInt2316 && arg0.anInt2267 > local15.delay[arg0.anInt2316]) {
				arg0.anInt2316++;
				arg0.anInt2267 = 1;
			}
			if (arg0.anInt2316 >= local15.anIntArray124.length) {
				arg0.anInt2316 -= local15.anInt669;
				arg0.anInt2300++;
				if (local15.anInt660 <= arg0.anInt2300) {
					arg0.anInt2307 = -1;
				}
				if (arg0.anInt2316 < 0 || arg0.anInt2316 >= local15.anIntArray124.length) {
					arg0.anInt2307 = -1;
				}
			}
			arg0.aBoolean172 = local15.aBoolean50;
		}
		if (arg0.anInt2313 > 0) {
			arg0.anInt2313--;
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V", line = 1542)
	public static void method1554() {
		JagString.aClass40_661 = null;
		JagString.aClass40_663 = null;
		JagString.aClass40_662 = null;
		Static1.anIntArray497 = null;
		Static1.aClass44_8 = null;
		aClass2_Sub2_Sub2_Sub4_9 = null;
	}

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "(I)[Lclient!qb;", line = 1567)
	public static Pix8[] method1555() {
		@Pc(4) Pix8[] local4 = new Pix8[Static28.anInt727];
		for (@Pc(10) int local10 = 0; local10 < Static28.anInt727; local10++) {
			@Pc(20) Pix8 local20 = local4[local10] = new Pix8();
			local20.anInt1908 = Static96.anInt2513;
			local20.anInt1909 = Static41.anInt1079;
			local20.anInt1907 = Static75.anIntArray430[local10];
			local20.anInt1906 = Static89.anIntArray503[local10];
			local20.anInt1905 = Static61.anIntArray338[local10];
			local20.anInt1910 = Static18.anIntArray86[local10];
			local20.anIntArray427 = Static19.anIntArray92;
			local20.aByteArray16 = Static83.aByteArrayArray10[local10];
		}
		Static85.method1485();
		return local4;
	}
}

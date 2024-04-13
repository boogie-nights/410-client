import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Lclient!ud;")
	public static Js5 aClass5_28;

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	public static int anInt2172;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!p;")
	public static Class45 aClass45_29;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 9)
	public static void method1479() {
		if (Static1.anInt1672 > 0) {
			Static1.anInt1672--;
		}
		if (Static1.anInt1973 > 1) {
			Static1.anInt1973--;
		}
		if (Static1.aBoolean164) {
			Static1.aBoolean164 = false;
			Static32.method626();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static2.method22(); local27++) {
		}
		if (Static1.anInt1075 != 30 && Static1.anInt1075 != 35) {
			return;
		}
		@Pc(66) int local66;
		if (Static1.aBoolean147 && Static1.anInt1075 == 30) {
			Static1.anInt2030 = 0;
			Static1.anInt2170 = 0;
			while (Static89.method1561()) {
			}
			for (local66 = 0; local66 < Static1.aBooleanArray37.length; local66++) {
				Static1.aBooleanArray37[local66] = false;
			}
		}
		Static63.method337(Static1.aClass2_Sub3_Sub1_4);
		@Pc(88) Object local88 = Static41.aClass52_1.anObject5;
		@Pc(115) int local115;
		@Pc(112) int local112;
		@Pc(117) int local117;
		@Pc(132) int local132;
		synchronized (Static41.aClass52_1.anObject5) {
			if (!Static1.aBoolean149) {
				Static41.aClass52_1.anInt1982 = 0;
			} else if (Static1.anInt2030 != 0 || Static41.aClass52_1.anInt1982 >= 40) {
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(94);
				Static1.aClass2_Sub3_Sub1_4.p1(0);
				local112 = 0;
				local115 = Static1.aClass2_Sub3_Sub1_4.pos;
				@Pc(150) int local150;
				for (local117 = 0; local117 < Static41.aClass52_1.anInt1982 && Static1.aClass2_Sub3_Sub1_4.pos - local115 < 240; local117++) {
					local112++;
					local132 = Static41.aClass52_1.anIntArray432[local117];
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 764) {
						local132 = 764;
					}
					local150 = Static41.aClass52_1.anIntArray433[local117];
					if (local150 < 0) {
						local150 = 0;
					} else if (local150 > 502) {
						local150 = 502;
					}
					@Pc(172) int local172 = local150 * 765 + local132;
					if (Static41.aClass52_1.anIntArray433[local117] == -1 && Static41.aClass52_1.anIntArray432[local117] == -1) {
						local132 = -1;
						local150 = -1;
						local172 = 524287;
					}
					if (local132 != Static1.anInt1871 || Static1.anInt442 != local150) {
						@Pc(215) int local215 = local132 - Static1.anInt1871;
						Static1.anInt1871 = local132;
						@Pc(222) int local222 = local150 - Static1.anInt442;
						Static1.anInt442 = local150;
						if (Static1.anInt1612 < 8 && local215 >= -32 && local215 <= 31 && local222 >= -32 && local222 <= 31) {
							local215 += 32;
							local222 += 32;
							Static1.aClass2_Sub3_Sub1_4.p2((Static1.anInt1612 << 12) + (local215 << 6) + local222);
							Static1.anInt1612 = 0;
						} else if (Static1.anInt1612 < 8) {
							Static1.aClass2_Sub3_Sub1_4.p3(local172 + (Static1.anInt1612 << 19) + 8388608);
							Static1.anInt1612 = 0;
						} else {
							Static1.aClass2_Sub3_Sub1_4.p4((Static1.anInt1612 << 19) + local172 - 1073741824);
							Static1.anInt1612 = 0;
						}
					} else if (Static1.anInt1612 < 2047) {
						Static1.anInt1612++;
					}
				}
				Static1.aClass2_Sub3_Sub1_4.psize1(Static1.aClass2_Sub3_Sub1_4.pos - local115);
				if (local112 < Static41.aClass52_1.anInt1982) {
					Static41.aClass52_1.anInt1982 -= local112;
					for (local150 = 0; local150 < Static41.aClass52_1.anInt1982; local150++) {
						Static41.aClass52_1.anIntArray432[local150] = Static41.aClass52_1.anIntArray432[local112 + local150];
						Static41.aClass52_1.anIntArray433[local150] = Static41.aClass52_1.anIntArray433[local150 + local112];
					}
				} else {
					Static41.aClass52_1.anInt1982 = 0;
				}
			}
		}
		if (Static1.anInt2030 != 0) {
			@Pc(380) long local380 = (Static1.aLong1 - Static1.aLong12) / 50L;
			if (local380 > 4095L) {
				local380 = 4095L;
			}
			Static1.aLong12 = Static1.aLong1;
			@Pc(394) byte local394 = 0;
			local115 = Static1.anInt2133;
			if (local115 < 0) {
				local115 = 0;
			} else if (local115 > 502) {
				local115 = 502;
			}
			if (Static1.anInt2030 == 2) {
				local394 = 1;
			}
			local112 = Static1.anInt2500;
			local132 = (int) local380;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(55);
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 764) {
				local112 = 764;
			}
			local117 = local115 * 765 + local112;
			Static1.aClass2_Sub3_Sub1_4.p4_alt1(local117 + (local132 << 20) + (local394 << 19));
		}
		if (Static1.anInt10 > 0) {
			Static1.anInt10--;
		}
		if (Static1.aBooleanArray37[96] || Static1.aBooleanArray37[97] || Static1.aBooleanArray37[98] || Static1.aBooleanArray37[99]) {
			Static1.aBoolean121 = true;
		}
		if (Static1.aBoolean121 && Static1.anInt10 <= 0) {
			Static1.anInt10 = 20;
			Static1.aBoolean121 = false;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(2);
			Static1.aClass2_Sub3_Sub1_4.p2_alt3(Static1.anInt1669);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(Static1.anInt2177);
		}
		if (Static89.aBoolean174 && !Static1.aBoolean27) {
			Static1.aBoolean27 = true;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(99);
			Static1.aClass2_Sub3_Sub1_4.p1(1);
		}
		if (!Static89.aBoolean174 && Static1.aBoolean27) {
			Static1.aBoolean27 = false;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(99);
			Static1.aClass2_Sub3_Sub1_4.p1(0);
		}
		Static71.method1277();
		if (Static1.anInt1075 != 30 && Static1.anInt1075 != 35) {
			return;
		}
		Static68.method1209();
		Static34.method637();
		Static1.anInt231++;
		if (Static1.anInt231 > 750) {
			Static32.method626();
			return;
		}
		Static66.method1197();
		Static69.method1227();
		Static2.method19();
		Static1.anInt1095++;
		if (Static1.anInt1096 != 0) {
			Static1.anInt2410 += 20;
			if (Static1.anInt2410 >= 400) {
				Static1.anInt1096 = 0;
			}
		}
		if (Static1.anInt481 != 0) {
			Static1.anInt719++;
			if (Static1.anInt719 >= 15) {
				if (Static1.anInt481 == 3) {
					Static1.aBoolean144 = true;
				}
				if (Static1.anInt481 == 2) {
					Static1.aBoolean59 = true;
				}
				Static1.anInt481 = 0;
			}
		}
		if (Static1.anInt2077 != 0) {
			Static1.anInt14++;
			if (Static1.anInt742 > Static1.anInt309 + 5 || Static1.anInt309 - 5 > Static1.anInt742 || Static1.anInt2394 > Static1.anInt1571 + 5 || Static1.anInt1571 - 5 > Static1.anInt2394) {
				Static1.aBoolean142 = true;
			}
			if (Static1.anInt2170 == 0) {
				if (Static1.anInt2077 == 2) {
					Static1.aBoolean59 = true;
				}
				if (Static1.anInt2077 == 3) {
					Static1.aBoolean144 = true;
				}
				Static1.anInt2077 = 0;
				if (Static1.aBoolean142 && Static1.anInt14 >= 5) {
					Static1.anInt390 = -1;
					Static19.method389();
					if (Static1.anInt1911 == Static1.anInt390 && Static1.anInt434 != Static1.anInt2239) {
						@Pc(753) byte local753 = 0;
						@Pc(757) ComType local757 = Static73.method1340(Static1.anInt1911);
						if (Static1.anInt182 == 1 && local757.anInt1610 == 206) {
							local753 = 1;
						}
						if (local757.anIntArray331[Static1.anInt434] <= 0) {
							local753 = 0;
						}
						if (local757.aBoolean126) {
							local115 = Static1.anInt2239;
							local112 = Static1.anInt434;
							local757.anIntArray331[local112] = local757.anIntArray331[local115];
							local757.anIntArray327[local112] = local757.anIntArray327[local115];
							local757.anIntArray331[local115] = -1;
							local757.anIntArray327[local115] = 0;
						} else if (local753 == 1) {
							local112 = Static1.anInt434;
							local115 = Static1.anInt2239;
							while (local115 != local112) {
								if (local112 < local115) {
									local757.method1054(local115 - 1, local115);
									local115--;
								} else if (local112 > local115) {
									local757.method1054(local115 + 1, local115);
									local115++;
								}
							}
						} else {
							local757.method1054(Static1.anInt434, Static1.anInt2239);
						}
						Static1.aClass2_Sub3_Sub1_4.pIsaac1(125);
						Static1.aClass2_Sub3_Sub1_4.p2_alt1(Static1.anInt2239);
						Static1.aClass2_Sub3_Sub1_4.p2_alt2(Static1.anInt434);
						Static1.aClass2_Sub3_Sub1_4.p4_alt1(Static1.anInt1911);
						Static1.aClass2_Sub3_Sub1_4.p1_alt3(local753);
					}
				} else if ((Static1.anInt263 == 1 || Static33.method634(Static1.anInt797 - 1)) && Static1.anInt797 > 2) {
					Static27.method583();
				} else if (Static1.anInt797 > 0) {
					Static88.method1549(Static1.anInt797 - 1);
				}
				Static1.anInt2030 = 0;
				Static1.anInt719 = 10;
			}
		}
		@Pc(890) int local890;
		if (World3D.anInt2100 != -1) {
			local890 = World3D.anInt2096;
			local66 = World3D.anInt2100;
			@Pc(912) boolean local912 = Static75.method1349(local890, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 0, true, 0, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, local66);
			World3D.anInt2100 = -1;
			if (local912) {
				Static1.anInt1554 = Static1.anInt2500;
				Static1.anInt1096 = 1;
				Static1.anInt2410 = 0;
				Static1.anInt2465 = Static1.anInt2133;
			}
		}
		if (Static1.anInt2030 == 1 && JagString.aClass40_112 != null) {
			Static1.anInt2030 = 0;
			Static1.aBoolean144 = true;
			JagString.aClass40_112 = null;
		}
		Static58.method1060();
		if (Static1.anInt1971 == -1) {
			Static78.method1386();
			Static73.method1337();
			Static72.method1331();
		}
		if (Static1.anInt2170 == 1 || Static1.anInt2030 == 1) {
			Static1.anInt2326++;
		}
		if (Static1.anInt1501 == -1 && Static1.anInt2340 == -1 && Static1.anInt1012 == -1) {
			if (Static1.anInt1645 > 0) {
				Static1.anInt1645--;
			}
		} else if (Static1.anInt1645 < 100) {
			Static1.anInt1645++;
			if (Static1.anInt1645 == 100) {
				if (Static1.anInt2340 != -1) {
					Static1.aBoolean59 = true;
				}
				if (Static1.anInt1501 != -1) {
					Static1.aBoolean144 = true;
				}
			}
		}
		Static17.method357();
		if (Static1.aBoolean22) {
			Static75.method1348();
		}
		for (local66 = 0; local66 < 5; local66++) {
			@Pc(1017) int local1017 = Static1.anIntArray415[local66]++;
		}
		Static98.method1740();
		local890 = Static32.method623();
		local115 = Static70.method1477();
		if (local890 > 4500 && local115 > 4500) {
			Static1.anInt1672 = 250;
			Static35.method722(4000);
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(247);
		}
		Static1.anInt2146++;
		Static1.anInt716++;
		Static1.anInt1966++;
		if (Static1.anInt716 > 500) {
			Static1.anInt716 = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x4) == 4) {
				Static1.anInt262 += Static1.anInt2299;
			}
			if ((local112 & 0x1) == 1) {
				Static1.anInt2518 += Static1.anInt1779;
			}
			if ((local112 & 0x2) == 2) {
				Static1.anInt2371 += Static1.anInt667;
			}
		}
		if (Static1.anInt1966 > 500) {
			Static1.anInt1966 = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x2) == 2) {
				Static1.anInt1857 += Static1.anInt798;
			}
			if ((local112 & 0x1) == 1) {
				Static1.anInt1978 += Static1.anInt804;
			}
		}
		if (Static1.anInt1857 < -20) {
			Static1.anInt798 = 1;
		}
		if (Static1.anInt262 < -40) {
			Static1.anInt2299 = 1;
		}
		if (Static1.anInt1978 < -60) {
			Static1.anInt804 = 2;
		}
		if (Static1.anInt1978 > 60) {
			Static1.anInt804 = -2;
		}
		if (Static1.anInt2518 < -50) {
			Static1.anInt1779 = 2;
		}
		if (Static1.anInt2371 < -55) {
			Static1.anInt667 = 2;
		}
		if (Static1.anInt2518 > 50) {
			Static1.anInt1779 = -2;
		}
		if (Static1.anInt1857 > 10) {
			Static1.anInt798 = -1;
		}
		if (Static1.anInt262 > 40) {
			Static1.anInt2299 = -1;
		}
		if (Static1.anInt2371 > 55) {
			Static1.anInt667 = -2;
		}
		if (Static1.anInt2146 > 50) {
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(217);
		}
		try {
			if (Static64.aClass25_36 != null && Static1.aClass2_Sub3_Sub1_4.pos > 0) {
				Static64.aClass25_36.method731(Static1.aClass2_Sub3_Sub1_4.data, Static1.aClass2_Sub3_Sub1_4.pos);
				Static1.aClass2_Sub3_Sub1_4.pos = 0;
				Static1.anInt2146 = 0;
			}
		} catch (@Pc(1235) IOException local1235) {
			Static32.method626();
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 645)
	public static void method1480() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
		System.exit(1);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V", line = 761)
	public static void method1482() {
		JagString.aClass40_617 = null;
		Static1.aClass44_7 = null;
		JagString.aClass40_620 = null;
		aClass5_28 = null;
		JagString.aClass40_619 = null;
		JagString.aClass40_622 = null;
		aClass45_29 = null;
		anIntArray472 = null;
		aBooleanArray31 = null;
		JagString.aClass40_618 = null;
		JagString.aClass40_621 = null;
		Static1.aClass47_21 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ud;Z)V", line = 783)
	public static void method1483(@OriginalArg(0) Js5 arg0) {
		Static26.aClass5_9 = arg0;
		Static54.anInt1505 = Static26.aClass5_9.method76(16);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ud;I)Z", line = 795)
	public static boolean method1484(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg1.method68(arg0, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static78.method1384(local9);
			return true;
		}
	}
}

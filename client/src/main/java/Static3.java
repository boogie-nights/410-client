import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 9)
	public static void method24() {
		aClass2_Sub2_Sub2_Sub3_2 = null;
		JagString.aClass40_17 = null;
		JagString.aClass40_18 = null;
		Static1.aClass47_2 = null;
		JagString.aClass40_16 = null;
		anIntArray4 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ke;)V", line = 23)
	public static void method25(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt2314 == 0) {
			arg0.anInt2283 = 1024;
		}
		arg0.anInt2282 = 0;
		if (arg0.anInt2314 == 1) {
			arg0.anInt2283 = 1536;
		}
		@Pc(24) int local24 = arg0.anInt2277 - Static1.anInt2511;
		if (arg0.anInt2314 == 2) {
			arg0.anInt2283 = 0;
		}
		if (arg0.anInt2314 == 3) {
			arg0.anInt2283 = 512;
		}
		@Pc(54) int local54 = arg0.anInt2317 * 128 + arg0.anInt2278 * 64;
		arg0.anInt2275 += (local54 - arg0.anInt2275) / local24;
		@Pc(82) int local82 = arg0.anInt2321 * 128 + arg0.anInt2278 * 64;
		arg0.anInt2284 += (local82 - arg0.anInt2284) / local24;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 65)
	public static void method26() {
		@Pc(12) int local12;
		@Pc(27) int local27;
		@Pc(19) int local19;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		if (client.packetType == 35) {
			local12 = client.in.g1();
			local19 = Static83.baseZ + (local12 & 0x7);
			local27 = Static87.baseX + (local12 >> 4 & 0x7);
			local31 = client.in.g1();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local43 = Static1.anIntArray416[local35];
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				Static21.method1727(0, Static1.currentLevel, local43, local39, local35, -1, local19, -1, local27);
			}
		} else if (client.packetType == 46) {
			local12 = client.in.g2_alt2();
			local27 = client.in.g2_alt1();
			local19 = client.in.g2_alt3();
			local31 = client.in.g1_alt2();
			local39 = Static83.baseZ + (local31 & 0x7);
			local35 = (local31 >> 4 & 0x7) + Static87.baseX;
			if (local35 >= 0 && local39 >= 0 && local35 < 104 && local39 < 104 && local27 != Static1.anInt1955) {
				@Pc(131) ObjStackEntity local131 = new ObjStackEntity();
				local131.anInt1495 = local12;
				local131.anInt1490 = local19;
				if (Static1.levelObjStacks[Static1.currentLevel][local35][local39] == null) {
					Static1.levelObjStacks[Static1.currentLevel][local35][local39] = new LinkList();
				}
				Static1.levelObjStacks[Static1.currentLevel][local35][local39].addTail(local131);
				Static75.sortObjStacks(local39, local35);
			}
		} else if (client.packetType == 63) {
			local12 = client.in.g1();
			local27 = (local12 >> 4 & 0x7) + Static87.baseX;
			local19 = Static83.baseZ + (local12 & 0x7);
			local31 = client.in.g2();
			local35 = client.in.g2();
			local39 = client.in.g2();
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				@Pc(230) LinkList local230 = Static1.levelObjStacks[Static1.currentLevel][local27][local19];
				if (local230 != null) {
					for (@Pc(237) ObjStackEntity local237 = (ObjStackEntity) local230.head(); local237 != null; local237 = (ObjStackEntity) local230.next()) {
						if ((local31 & 0x7FFF) == local237.anInt1490 && local237.anInt1495 == local35) {
							local237.anInt1495 = local39;
							break;
						}
					}
					Static75.sortObjStacks(local19, local27);
				}
			}
		} else {
			if (client.packetType == 118) {
				local12 = client.in.g1();
				local27 = (local12 >> 4 & 0x7) + Static87.baseX;
				local19 = Static83.baseZ + (local12 & 0x7);
				local31 = client.in.g2();
				local35 = client.in.g1();
				local39 = local35 >> 4 & 0xF;
				local43 = local35 & 0x7;
				if (local27 - local39 <= Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] && Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] <= local39 + local27 && Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] >= local19 - local39 && Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] <= local19 + local39 && Static1.anInt2372 != 0 && local43 > 0 && Static1.anInt131 < 50) {
					Static1.anIntArray497[Static1.anInt131] = local31;
					Static1.anIntArray79[Static1.anInt131] = local43;
					Static1.anIntArray36[Static1.anInt131] = 0;
					Static1.aClass43Array1[Static1.anInt131] = null;
					Static1.anInt131++;
				}
			}
			@Pc(425) int local425;
			if (client.packetType == 244) {
				local12 = client.in.g2_alt3();
				local27 = client.in.g1_alt3();
				local31 = Static83.baseZ + (local27 & 0x7);
				local19 = (local27 >> 4 & 0x7) + Static87.baseX;
				local35 = client.in.g1_alt2();
				local43 = local35 & 0x3;
				local39 = local35 >> 2;
				local425 = Static1.anIntArray416[local39];
				if (local19 >= 0 && local31 >= 0 && local19 < 104 && local31 < 104) {
					Static21.method1727(0, Static1.currentLevel, local425, local43, local39, local12, local31, -1, local19);
				}
			} else {
				@Pc(503) int local503;
				@Pc(523) int local523;
				if (client.packetType == 21) {
					local12 = client.in.g2_alt1();
					local27 = client.in.g1_alt1();
					local19 = (local27 >> 4 & 0x7) + Static87.baseX;
					local31 = Static83.baseZ + (local27 & 0x7);
					local35 = client.in.g2_alt2();
					local39 = client.in.g1_alt1();
					local43 = local39 >> 2;
					local425 = local39 & 0x3;
					local503 = Static1.anIntArray416[local43];
					@Pc(507) byte local507 = client.in.g1b_alt3();
					@Pc(511) byte local511 = client.in.g1b_alt2();
					@Pc(515) byte local515 = client.in.g1b();
					@Pc(519) byte local519 = client.in.g1b_alt2();
					local523 = client.in.g2_alt1();
					@Pc(527) int local527 = client.in.g2_alt3();
					@Pc(536) PlayerEntity local536;
					if (Static1.anInt1955 == local12) {
						local536 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1;
					} else {
						local536 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local12];
					}
					if (local536 != null) {
						@Pc(548) LocType local548 = Static83.method1470(local523);
						@Pc(558) int local558 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local19 + 1][local31];
						@Pc(566) int local566 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local19][local31];
						@Pc(578) int local578 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local19 + 1][local31 + 1];
						@Pc(588) int local588 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local19][local31 + 1];
						@Pc(598) Model local598 = local548.method765(local425, local558, local588, local566, local43, local578);
						if (local598 != null) {
							Static21.method1727(local35 + 1, Static1.currentLevel, local503, 0, 0, -1, local31, local527 + 1, local19);
							local536.aClass2_Sub2_Sub12_Sub4_1 = local598;
							@Pc(621) int local621 = local548.anInt1036;
							@Pc(624) int local624 = local548.anInt1040;
							@Pc(633) byte local633;
							if (local511 < local519) {
								local633 = local519;
								local519 = local511;
								local511 = local633;
							}
							local536.anInt1381 = Static1.anInt2511 + local527;
							if (local515 > local507) {
								local633 = local515;
								local515 = local507;
								local507 = local633;
							}
							if (local425 == 1 || local425 == 3) {
								local624 = local548.anInt1036;
								local621 = local548.anInt1040;
							}
							local536.anInt1387 = local621 * 64 + local19 * 128;
							local536.anInt1377 = local35 + Static1.anInt2511;
							local536.anInt1375 = local31 * 128 + local624 * 64;
							local536.anInt1384 = Static78.method1383(Static1.currentLevel, local536.anInt1387, local536.anInt1375);
							local536.anInt1386 = local31 + local507;
							local536.anInt1376 = local515 + local31;
							local536.anInt1369 = local511 + local19;
							local536.anInt1368 = local19 + local519;
						}
					}
				}
				@Pc(771) ObjStackEntity local771;
				if (client.packetType == 56) {
					local12 = client.in.g2_alt1();
					local27 = client.in.g1_alt2();
					local19 = Static87.baseX + (local27 >> 4 & 0x7);
					local31 = Static83.baseZ + (local27 & 0x7);
					local35 = client.in.g2_alt3();
					if (local19 >= 0 && local31 >= 0 && local19 < 104 && local31 < 104) {
						local771 = new ObjStackEntity();
						local771.anInt1495 = local35;
						local771.anInt1490 = local12;
						if (Static1.levelObjStacks[Static1.currentLevel][local19][local31] == null) {
							Static1.levelObjStacks[Static1.currentLevel][local19][local31] = new LinkList();
						}
						Static1.levelObjStacks[Static1.currentLevel][local19][local31].addTail(local771);
						Static75.sortObjStacks(local31, local19);
					}
				} else if (client.packetType == 135) {
					local12 = client.in.g1();
					local27 = Static87.baseX + (local12 >> 4 & 0x7);
					local19 = (local12 & 0x7) + Static83.baseZ;
					local31 = client.in.g2();
					local35 = client.in.g1();
					local39 = client.in.g2();
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						local19 = local19 * 128 + 64;
						local27 = local27 * 128 + 64;
						@Pc(893) SpotAnimEntity local893 = new SpotAnimEntity(local31, Static1.currentLevel, local27, local19, Static78.method1383(Static1.currentLevel, local27, local19) - local35, local39, Static1.anInt2511);
						Static1.aClass44_8.addTail(local893);
					}
				} else if (client.packetType == 221) {
					local12 = client.in.g1_alt1();
					local27 = (local12 >> 4 & 0x7) + Static87.baseX;
					local19 = (local12 & 0x7) + Static83.baseZ;
					local31 = client.in.g2();
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						@Pc(950) LinkList local950 = Static1.levelObjStacks[Static1.currentLevel][local27][local19];
						if (local950 != null) {
							for (local771 = (ObjStackEntity) local950.head(); local771 != null; local771 = (ObjStackEntity) local950.next()) {
								if (local771.anInt1490 == (local31 & 0x7FFF)) {
									local771.unlink();
									break;
								}
							}
							if (local950.head() == null) {
								Static1.levelObjStacks[Static1.currentLevel][local27][local19] = null;
							}
							Static75.sortObjStacks(local19, local27);
						}
					}
				} else {
					@Pc(1060) int local1060;
					@Pc(1064) int local1064;
					@Pc(1068) int local1068;
					if (client.packetType == 69) {
						local12 = client.in.g1();
						local27 = Static87.baseX + (local12 >> 4 & 0x7);
						local19 = (local12 & 0x7) + Static83.baseZ;
						local31 = local27 + client.in.g1b();
						local35 = local19 + client.in.g1b();
						local39 = client.in.g2s();
						local43 = client.in.g2();
						local425 = client.in.g1() * 4;
						local503 = client.in.g1() * 4;
						local1060 = client.in.g2();
						local1064 = client.in.g2();
						local1068 = client.in.g1();
						@Pc(1072) int local1072 = client.in.g1();
						if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local43 != 65535) {
							local35 = local35 * 128 + 64;
							local27 = local27 * 128 + 64;
							local31 = local31 * 128 + 64;
							local19 = local19 * 128 + 64;
							@Pc(1164) ProjectileEntity local1164 = new ProjectileEntity(local43, Static1.currentLevel, local27, local19, Static78.method1383(Static1.currentLevel, local27, local19) - local425, Static1.anInt2511 + local1060, local1064 + Static1.anInt2511, local1068, local1072, local39, local503);
							local1164.method939(local31, Static78.method1383(Static1.currentLevel, local31, local35) - local503, Static1.anInt2511 + local1060, local35);
							Static1.aClass44_4.addTail(local1164);
						}
					} else if (client.packetType == 129) {
						local12 = client.in.g2_alt3();
						local27 = client.in.g1_alt3();
						local19 = local27 >> 2;
						local31 = local27 & 0x3;
						local35 = Static1.anIntArray416[local19];
						local39 = client.in.g1_alt1();
						local425 = Static83.baseZ + (local39 & 0x7);
						local43 = Static87.baseX + (local39 >> 4 & 0x7);
						if (local43 >= 0 && local425 >= 0 && local43 < 103 && local425 < 103) {
							local503 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local43][local425];
							local1060 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local43 + 1][local425];
							local1064 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local43 + 1][local425 + 1];
							local1068 = Static1.anIntArrayArrayArray8[Static1.currentLevel][local43][local425 + 1];
							if (local35 == 0) {
								@Pc(1292) Wall local1292 = Static85.scene.method1412(Static1.currentLevel, local43, local425);
								if (local1292 != null) {
									local523 = local1292.anInt2369 >> 14 & 0x7FFF;
									if (local19 == 2) {
										local1292.aClass2_Sub2_Sub12_7 = new LocEntity(local523, 2, local31 + 4, local503, local1060, local1064, local1068, local12, false);
										local1292.aClass2_Sub2_Sub12_8 = new LocEntity(local523, 2, local31 + 1 & 0x3, local503, local1060, local1064, local1068, local12, false);
									} else {
										local1292.aClass2_Sub2_Sub12_7 = new LocEntity(local523, local19, local31, local503, local1060, local1064, local1068, local12, false);
									}
								}
							}
							if (local35 == 1) {
								@Pc(1365) WallDecoration local1365 = Static85.scene.method1428(Static1.currentLevel, local43, local425);
								if (local1365 != null) {
									local1365.aClass2_Sub2_Sub12_1 = new LocEntity(local1365.anInt17 >> 14 & 0x7FFF, 4, 0, local503, local1060, local1064, local1068, local12, false);
								}
							}
							if (local35 == 2) {
								@Pc(1397) Loc local1397 = Static85.scene.method1436(Static1.currentLevel, local43, local425);
								if (local19 == 11) {
									local19 = 10;
								}
								if (local1397 != null) {
									local1397.aClass2_Sub2_Sub12_3 = new LocEntity(local1397.anInt1644 >> 14 & 0x7FFF, local19, local31, local503, local1060, local1064, local1068, local12, false);
								}
							}
							if (local35 == 3) {
								@Pc(1432) GroundDecoration local1432 = Static85.scene.method1441(Static1.currentLevel, local43, local425);
								if (local1432 != null) {
									local1432.aClass2_Sub2_Sub12_2 = new LocEntity(local1432.anInt48 >> 14 & 0x7FFF, 22, local31, local503, local1060, local1064, local1068, local12, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ad;I)V", line = 591)
	public static void method27(@OriginalArg(1) Js5 arg0, @OriginalArg(2) int arg1) {
		if (Static39.aClass2_Sub3_3 != null) {
			Static39.aClass2_Sub3_3.pos = arg1 * 4 + 5;
			@Pc(16) int local16 = Static39.aClass2_Sub3_3.g4s();
			arg0.method92(local16);
		}
		Static45.method1535(255, null, 0, (byte) 0, true, 255);
		Static1.aClass5_Sub1Array1[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!ud;)Lclient!qb;", line = 654)
	public static Pix8 method28(@OriginalArg(0) int arg0, @OriginalArg(2) Js5Index arg1) {
		return Static64.method1113(arg1, arg0) ? Static63.method338() : null;
	}
}

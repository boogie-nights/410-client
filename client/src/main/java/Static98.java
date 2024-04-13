import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!wc", name = "Zb", descriptor = "Lclient!ib;")
	public static SongPcmStream aClass12_1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ud;I)[B", line = 27)
	public static byte[] method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Js5Index arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) (arg3 << 16) + ((long) arg0 << 32) + (long) (arg1 + arg3 * 37 & 0xFFFF);
		if (Static35.aClass47_9 != null) {
			@Pc(31) MidiSongRequest local31 = (MidiSongRequest) Static35.aClass47_9.method1325(local23);
			if (local31 != null) {
				return local31.aByteArray3;
			}
		}
		@Pc(42) byte[] local42 = arg2.fetchFile(arg1, arg3);
		if (local42 == null) {
			return null;
		} else {
			if (Static35.aClass47_9 != null) {
				Static35.aClass47_9.method1332(local23, new MidiSongRequest(local42));
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)V", line = 105)
	public static void method1738() {
		JagString.aClass40_742 = null;
		aClass12_1 = null;
		JagString.aClass40_740 = null;
		JagString.aClass40_739 = null;
		Static1.aClass40Array40 = null;
		JagString.aClass40_741 = null;
	}

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "(I)V", line = 148)
	public static void method1740() {
		while (Static89.method1561()) {
			if (Static1.anInt2585 != -1 && Static1.anInt1826 == Static1.anInt2585) {
				if (Static35.anInt935 == 85 && JagString.aClass40_448.method1169() > 0) {
					JagString.aClass40_448 = JagString.aClass40_448.method1180(JagString.aClass40_448.method1169() - 1, 0);
				}
				if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && JagString.aClass40_448.method1169() < 12) {
					JagString.aClass40_448 = JagString.aClass40_448.method1192(Static4.anInt135);
				}
			} else {
				@Pc(162) int local162;
				if (Static1.aBoolean146) {
					if (Static35.anInt935 == 85 && JagString.aClass40_447.method1169() > 0) {
						JagString.aClass40_447 = JagString.aClass40_447.method1180(JagString.aClass40_447.method1169() - 1, 0);
						Static1.aBoolean144 = true;
					}
					if (Static69.method1228(Static4.anInt135) && JagString.aClass40_447.method1169() < 80) {
						JagString.aClass40_447 = JagString.aClass40_447.method1192(Static4.anInt135);
						Static1.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84) {
						Static1.aBoolean144 = true;
						Static1.aBoolean146 = false;
						@Pc(117) long local117;
						if (Static1.anInt2180 == 1) {
							local117 = JagString.aClass40_447.method1179();
							Static58.method1062(local117);
						}
						if (Static1.anInt2180 == 2 && Static1.anInt2594 > 0) {
							local117 = JagString.aClass40_447.method1179();
							Static64.method1115(local117);
						}
						if (Static1.anInt2180 == 3 && JagString.aClass40_447.method1169() > 0) {
							Static1.aClass2_Sub3_Sub1_4.pIsaac1(22);
							Static1.aClass2_Sub3_Sub1_4.p1(0);
							local162 = Static1.aClass2_Sub3_Sub1_4.pos;
							Static1.aClass2_Sub3_Sub1_4.p8(Static1.aLong136);
							Static32.method624(JagString.aClass40_447, Static1.aClass2_Sub3_Sub1_4);
							Static1.aClass2_Sub3_Sub1_4.psize1(Static1.aClass2_Sub3_Sub1_4.pos - local162);
							if (Static1.anInt2515 == 2) {
								Static1.anInt2515 = 1;
								Static1.aBoolean95 = true;
								Static1.aClass2_Sub3_Sub1_4.pIsaac1(132);
								Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt583);
								Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2515);
								Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2491);
							}
						}
						if (Static1.anInt2180 == 4 && Static1.anInt121 < 100) {
							local117 = JagString.aClass40_447.method1179();
							Static14.method1254(local117);
						}
						if (Static1.anInt2180 == 5 && Static1.anInt121 > 0) {
							local117 = JagString.aClass40_447.method1179();
							Static74.method1345(local117);
						}
					}
				} else if (Static1.anInt2399 == 1) {
					if (Static35.anInt935 == 85 && JagString.aClass40_444.method1169() > 0) {
						JagString.aClass40_444 = JagString.aClass40_444.method1180(JagString.aClass40_444.method1169() - 1, 0);
						Static1.aBoolean144 = true;
					}
					if (Static61.method1094(Static4.anInt135) && JagString.aClass40_444.method1169() < 10) {
						JagString.aClass40_444 = JagString.aClass40_444.method1192(Static4.anInt135);
						Static1.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84) {
						if (JagString.aClass40_444.method1169() > 0) {
							local162 = 0;
							if (JagString.aClass40_444.method1176()) {
								local162 = JagString.aClass40_444.method1198();
							}
							Static1.aClass2_Sub3_Sub1_4.pIsaac1(122);
							Static1.aClass2_Sub3_Sub1_4.p4(local162);
						}
						Static1.aBoolean144 = true;
						Static1.anInt2399 = 0;
					}
				} else if (Static1.anInt2399 == 2) {
					if (Static35.anInt935 == 85 && JagString.aClass40_444.method1169() > 0) {
						JagString.aClass40_444 = JagString.aClass40_444.method1180(JagString.aClass40_444.method1169() - 1, 0);
						Static1.aBoolean144 = true;
					}
					if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && JagString.aClass40_444.method1169() < 12) {
						JagString.aClass40_444 = JagString.aClass40_444.method1192(Static4.anInt135);
						Static1.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84) {
						if (JagString.aClass40_444.method1169() > 0) {
							Static1.aClass2_Sub3_Sub1_4.pIsaac1(51);
							Static1.aClass2_Sub3_Sub1_4.p8(JagString.aClass40_444.method1179());
						}
						Static1.aBoolean144 = true;
						Static1.anInt2399 = 0;
					}
				} else if (Static1.anInt2399 == 3) {
					if (Static35.anInt935 == 85 && JagString.aClass40_444.method1169() > 0) {
						JagString.aClass40_444 = JagString.aClass40_444.method1180(JagString.aClass40_444.method1169() - 1, 0);
						Static1.aBoolean144 = true;
					}
					if (Static69.method1228(Static4.anInt135) && JagString.aClass40_444.method1169() < 40) {
						JagString.aClass40_444 = JagString.aClass40_444.method1192(Static4.anInt135);
						Static1.aBoolean144 = true;
					}
				} else if (Static1.anInt1994 == -1 && Static1.anInt1971 == -1) {
					if (Static35.anInt935 == 85 && JagString.aClass40_451.method1169() > 0) {
						JagString.aClass40_451 = JagString.aClass40_451.method1180(JagString.aClass40_451.method1169() - 1, 0);
						Static1.aBoolean144 = true;
					}
					if (Static69.method1228(Static4.anInt135) && JagString.aClass40_451.method1169() < 80) {
						JagString.aClass40_451 = JagString.aClass40_451.method1192(Static4.anInt135);
						Static1.aBoolean144 = true;
					}
					if (Static35.anInt935 == 84 && JagString.aClass40_451.method1169() > 0) {
						if (Static1.anInt1550 == 2) {
							if (JagString.aClass40_451.method1184(JagString.aClass40_494)) {
								Static32.method626();
							}
							if (JagString.aClass40_451.method1184(JagString.aClass40_560)) {
								Static1.aBoolean173 = true;
							}
							if (JagString.aClass40_451.method1184(JagString.aClass40_182)) {
								Static1.aBoolean173 = false;
							}
							if (JagString.aClass40_451.method1184(JagString.aClass40_480)) {
								for (local162 = 0; local162 < 4; local162++) {
									for (@Pc(435) int local435 = 1; local435 < 103; local435++) {
										for (@Pc(439) int local439 = 1; local439 < 103; local439++) {
											Static1.aClass20Array3[local162].anIntArrayArray9[local435][local439] = 0;
										}
									}
								}
							}
							if (JagString.aClass40_451.method1184(JagString.aClass40_62) && Static1.anInt2132 == 2) {
								throw new RuntimeException();
							}
							if (JagString.aClass40_451.method1184(JagString.aClass40_360)) {
								Static1.aBoolean143 = true;
							}
						}
						if (JagString.aClass40_451.method1168(JagString.aClass40_164)) {
							Static1.aClass2_Sub3_Sub1_4.pIsaac1(92);
							Static1.aClass2_Sub3_Sub1_4.p1(JagString.aClass40_451.method1169() - 1);
							Static1.aClass2_Sub3_Sub1_4.pjstr(JagString.aClass40_451.method1185(2));
						} else {
							@Pc(525) JagString local525 = JagString.aClass40_451.method1196();
							@Pc(527) byte local527 = 0;
							@Pc(529) byte local529 = 0;
							if (local525.method1168(JagString.aClass40_342)) {
								local527 = 0;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_230)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(4);
								local527 = 1;
							} else if (local525.method1168(JagString.aClass40_109)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
								local527 = 2;
							} else if (local525.method1168(JagString.aClass40_218)) {
								local527 = 3;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(5);
							} else if (local525.method1168(JagString.aClass40_566)) {
								local527 = 4;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_538)) {
								local527 = 5;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_132)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
								local527 = 6;
							} else if (local525.method1168(JagString.aClass40_355)) {
								local527 = 7;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_565)) {
								local527 = 8;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_610)) {
								local527 = 9;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_450)) {
								local527 = 10;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_568)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
								local527 = 11;
							}
							local525 = JagString.aClass40_451.method1196();
							if (local525.method1168(JagString.aClass40_472)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(5);
								local529 = 1;
							} else if (local525.method1168(JagString.aClass40_67)) {
								local529 = 2;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_334)) {
								local529 = 3;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_627)) {
								local529 = 4;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_519)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
								local529 = 5;
							}
							Static1.aClass2_Sub3_Sub1_4.pIsaac1(40);
							Static1.aClass2_Sub3_Sub1_4.p1(0);
							@Pc(794) int local794 = Static1.aClass2_Sub3_Sub1_4.pos;
							Static1.aClass2_Sub3_Sub1_4.p1(local527);
							Static1.aClass2_Sub3_Sub1_4.p1(local529);
							Static32.method624(JagString.aClass40_451, Static1.aClass2_Sub3_Sub1_4);
							Static1.aClass2_Sub3_Sub1_4.psize1(Static1.aClass2_Sub3_Sub1_4.pos - local794);
							if (Static1.anInt583 == 2) {
								Static1.anInt583 = 3;
								Static1.aBoolean95 = true;
								Static1.aClass2_Sub3_Sub1_4.pIsaac1(132);
								Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt583);
								Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2515);
								Static1.aClass2_Sub3_Sub1_4.p1(Static1.anInt2491);
							}
						}
						JagString.aClass40_451 = JagString.aClass40_445;
						Static1.aBoolean144 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BZ)V", line = 640)
	public static void method1741(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Js5Index arg1, @OriginalArg(3) boolean arg2) {
		Static51.aClass5_29 = arg0;
		Static40.aBoolean150 = arg2;
		Static38.aClass5_13 = arg1;
		Static36.anInt971 = Static38.aClass5_13.getGroupCapacity(10);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLclient!ud;ILclient!ud;I)Lclient!sb;", line = 702)
	public static SeqFrameset method1744(@OriginalArg(1) Js5Index arg0, @OriginalArg(3) Js5Index arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.getFileIds(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(27) byte[] local27 = arg0.fetchFileNoDiscard(arg2, local12[local14]);
			if (local27 == null) {
				local7 = false;
			} else {
				@Pc(47) int local47 = (local27[0] & 0xFF) << 8 | local27[1] & 0xFF;
				@Pc(55) byte[] local55 = arg1.fetchFileNoDiscard(local47, 0);
				if (local55 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new SeqFrameset(arg0, arg1, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}

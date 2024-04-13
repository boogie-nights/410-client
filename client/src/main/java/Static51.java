import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ke", name = "nb", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!ke", name = "Fb", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_29;

	@OriginalMember(owner = "client!ke", name = "Bc", descriptor = "I")
	public static int anInt2325;

	@OriginalMember(owner = "client!ke", name = "Dc", descriptor = "I")
	public static int anInt2327;

	@OriginalMember(owner = "client!ke", name = "Ec", descriptor = "[Lclient!qb;")
	public static Pix8[] aClass2_Sub2_Sub2_Sub3Array15;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V", line = 12)
	public static void method1538() {
		if (Static8.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static1.anIntArray549[186] = 57;
			Static1.anIntArray549[187] = 27;
			Static1.anIntArray549[188] = 71;
			Static1.anIntArray549[189] = 26;
			Static1.anIntArray549[190] = 72;
			Static1.anIntArray549[191] = 73;
			Static1.anIntArray549[192] = 58;
			Static1.anIntArray549[219] = 42;
			Static1.anIntArray549[220] = 74;
			Static1.anIntArray549[221] = 43;
			Static1.anIntArray549[222] = 59;
			Static1.anIntArray549[223] = 28;
			return;
		}
		Static1.anIntArray549[44] = 71;
		Static1.anIntArray549[45] = 26;
		Static1.anIntArray549[46] = 72;
		Static1.anIntArray549[47] = 73;
		Static1.anIntArray549[59] = 57;
		Static1.anIntArray549[61] = 27;
		Static1.anIntArray549[91] = 42;
		Static1.anIntArray549[92] = 74;
		Static1.anIntArray549[93] = 43;
		if (Static8.aMethod1 == null) {
			Static1.anIntArray549[192] = 58;
			Static1.anIntArray549[222] = 59;
		} else {
			Static1.anIntArray549[192] = 28;
			Static1.anIntArray549[222] = 58;
			Static1.anIntArray549[520] = 59;
		}
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)Lclient!pd;", line = 76)
	public static Timer method1539() {
		try {
			return (Timer) Class.forName("NanoTimer").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new MillisTimer();
		}
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V", line = 167)
	public static void method1541() {
		if (Static1.aClass62_1 != null) {
			@Pc(3) Mouse local3 = Static1.aClass62_1;
			synchronized (Static1.aClass62_1) {
				Static1.aClass62_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lclient!o;", line = 190)
	public static JagString method1542(@OriginalArg(0) int arg0) {
		@Pc(15) JagString local15 = Static48.method859(arg0);
		for (@Pc(21) int local21 = local15.method1169() - 3; local21 > 0; local21 -= 3) {
			local15 = Static72.method1334(new JagString[] { local15.method1180(local21, 0), JagString.aClass40_672, local15.method1185(local21) });
		}
		if (local15.method1169() > 8) {
			local15 = Static72.method1334(new JagString[] { JagString.aClass40_689, local15.method1180(local15.method1169() - 8, 0), JagString.aClass40_405, local15, JagString.aClass40_609 });
		} else if (local15.method1169() > 4) {
			local15 = Static72.method1334(new JagString[] { JagString.aClass40_678, local15.method1180(local15.method1169() - 4, 0), JagString.aClass40_221, local15, JagString.aClass40_609 });
		}
		return Static72.method1334(new JagString[] { JagString.aClass40_716, local15 });
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V", line = 401)
	public static void method1546() {
		JagString.aClass40_658 = null;
		JagString.aClass40_656 = null;
		aClass5_29 = null;
		JagString.aClass40_657 = null;
		Static1.aClass2_Sub3_Sub1_5 = null;
		aClass2_Sub2_Sub2_Sub3Array15 = null;
		JagString.aClass40_659 = null;
	}

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "(I)V", line = 516)
	public static void method1548() {
		Static38.method755();
		if (Static1.anInt1075 != 10) {
			return;
		}
		@Pc(20) int local20 = Static1.anInt2133 - 171;
		@Pc(22) int local22 = Static1.anInt2030;
		@Pc(26) int local26 = Static1.anInt2500 - 202;
		if (Static1.anInt2143 == 0) {
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 100 && local20 <= 140) {
				Static1.anInt2143 = 3;
				Static1.anInt91 = 0;
			}
			if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 100 && local20 <= 140) {
				Static1.anInt2143 = 2;
				JagString.aClass40_589 = JagString.aClass40_305;
				Static1.anInt91 = 0;
				JagString.aClass40_592 = JagString.aClass40_593;
			}
		} else if (Static1.anInt2143 == 2) {
			@Pc(70) byte local70 = 60;
			@Pc(73) int local73 = local70 + 30;
			if (local22 == 1 && local20 >= 75 && local20 < 90) {
				Static1.anInt91 = 0;
			}
			local73 += 15;
			if (local22 == 1 && local20 >= 90 && local20 < 105) {
				Static1.anInt91 = 1;
			}
			local73 += 15;
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 130 && local20 <= 170) {
				JagString.aClass40_591 = JagString.aClass40_591.method1175().method1167();
				Static45.method1537(JagString.aClass40_593, JagString.aClass40_120);
				Static7.method187(20);
			} else {
				if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 130 && local20 <= 170) {
					Static1.anInt2143 = 0;
					JagString.aClass40_591 = JagString.aClass40_593;
					JagString.aClass40_587 = JagString.aClass40_593;
				}
				while (true) {
					@Pc(211) boolean local211;
					label145: do {
						while (Static89.method1561()) {
							local211 = false;
							for (@Pc(213) int local213 = 0; JagString.aClass40_486.method1169() > local213; local213++) {
								if (Static4.anInt135 == JagString.aClass40_486.method1174(local213)) {
									local211 = true;
									break;
								}
							}
							if (Static1.anInt91 != 0) {
								continue label145;
							}
							if (Static35.anInt935 == 85 && JagString.aClass40_591.method1169() > 0) {
								JagString.aClass40_591 = JagString.aClass40_591.method1180(JagString.aClass40_591.method1169() - 1, 0);
							}
							if (Static35.anInt935 == 84 || Static35.anInt935 == 80) {
								Static1.anInt91 = 1;
							}
							if (local211 && JagString.aClass40_591.method1169() < 12) {
								JagString.aClass40_591 = JagString.aClass40_591.method1192(Static4.anInt135);
							}
						}
						return;
					} while (Static1.anInt91 != 1);
					if (Static35.anInt935 == 85 && JagString.aClass40_587.method1169() > 0) {
						JagString.aClass40_587 = JagString.aClass40_587.method1180(JagString.aClass40_587.method1169() - 1, 0);
					}
					if (Static35.anInt935 == 84 || Static35.anInt935 == 80) {
						Static1.anInt91 = 0;
					}
					if (local211 && JagString.aClass40_587.method1169() < 20) {
						JagString.aClass40_587 = JagString.aClass40_587.method1192(Static4.anInt135);
					}
				}
			}
		} else if (Static1.anInt2143 == 3 && local22 == 1 && local26 >= 105 && local26 <= 255 && local20 >= 130 && local20 <= 170) {
			Static1.anInt2143 = 0;
		}
	}
}

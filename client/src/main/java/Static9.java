import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!d;")
	public static BufferedFile legacyCacheDat;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!mc;)V", line = 3)
	public static void method227(@OriginalArg(1) ComType arg0) {
		@Pc(8) int local8 = arg0.anInt1610;
		@Pc(68) int local68;
		if (local8 >= 1 && local8 <= 100 || local8 >= 701 && local8 <= 800) {
			if (local8 == 1 && Static1.anInt1038 == 0) {
				arg0.aClass40_466 = JagString.aClass40_626;
				arg0.anInt1577 = 0;
			} else if (local8 == 1 && Static1.anInt1038 == 1) {
				arg0.anInt1577 = 0;
				arg0.aClass40_466 = JagString.aClass40_709;
			} else if (local8 == 2 && Static1.anInt1038 != 2) {
				arg0.anInt1577 = 0;
				arg0.aClass40_466 = JagString.aClass40_361;
			} else {
				local68 = Static1.anInt2594;
				if (local8 <= 700) {
					local8--;
				} else {
					local8 -= 601;
				}
				if (Static1.anInt1038 != 2) {
					local68 = 0;
				}
				if (local8 >= local68) {
					arg0.aClass40_466 = JagString.aClass40_445;
					arg0.anInt1577 = 0;
				} else {
					arg0.aClass40_466 = Static1.aClass40Array23[local8];
					arg0.anInt1577 = 1;
				}
			}
		} else if (local8 >= 101 && local8 <= 200 || !(local8 < 801 || local8 > 900)) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local68 = Static1.anInt2594;
			if (Static1.anInt1038 != 2) {
				local68 = 0;
			}
			if (local68 <= local8) {
				arg0.anInt1577 = 0;
				arg0.aClass40_466 = JagString.aClass40_445;
			} else {
				if (Static1.anIntArray316[local8] == 0) {
					arg0.aClass40_466 = JagString.aClass40_43;
				} else if (Static1.anIntArray316[local8] >= 5000) {
					if (client.worldId == Static1.anIntArray316[local8]) {
						arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_85, Static48.method859(Static1.anIntArray316[local8] - 5000) });
					} else {
						arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_514, Static48.method859(Static1.anIntArray316[local8] - 5000) });
					}
				} else if (client.worldId == Static1.anIntArray316[local8]) {
					arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_330, Static48.method859(Static1.anIntArray316[local8]) });
				} else {
					arg0.aClass40_466 = Static72.method1334(new JagString[] { Static1.aClass40_545, Static48.method859(Static1.anIntArray316[local8]) });
				}
				arg0.anInt1577 = 1;
			}
		} else if (local8 == 203) {
			local68 = Static1.anInt2594;
			if (Static1.anInt1038 != 2) {
				local68 = 0;
			}
			arg0.anInt1601 = local68 * 15 + 20;
			if (arg0.anInt1609 >= arg0.anInt1601) {
				arg0.anInt1601 = arg0.anInt1609 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static1.anInt1038 == 0) {
				arg0.aClass40_466 = JagString.aClass40_287;
				arg0.anInt1577 = 0;
			} else if (local8 == 1 && Static1.anInt1038 == 0) {
				arg0.anInt1577 = 0;
				arg0.aClass40_466 = JagString.aClass40_361;
			} else {
				local68 = Static1.anInt121;
				if (Static1.anInt1038 == 0) {
					local68 = 0;
				}
				if (local68 <= local8) {
					arg0.anInt1577 = 0;
					arg0.aClass40_466 = JagString.aClass40_445;
				} else {
					arg0.aClass40_466 = Static44.method819(Static1.aLongArray4[local8]).method1167();
					arg0.anInt1577 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt1601 = Static1.anInt121 * 15 + 20;
			if (arg0.anInt1609 >= arg0.anInt1601) {
				arg0.anInt1601 = arg0.anInt1609 + 1;
			}
		} else if (local8 == 327) {
			arg0.anInt1579 = 150;
			arg0.anInt1614 = (int) (Math.sin((double) Static1.anInt2511 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1607 = 5;
			arg0.anInt1602 = 0;
		} else if (local8 == 324) {
			if (Static1.anInt2356 == -1) {
				Static1.anInt139 = arg0.anInt1598;
				Static1.anInt2356 = arg0.anInt1585;
			}
			if (Static1.aClass33_1.aBoolean117) {
				arg0.anInt1585 = Static1.anInt2356;
			} else {
				arg0.anInt1585 = Static1.anInt139;
			}
		} else if (local8 == 325) {
			if (Static1.anInt2356 == -1) {
				Static1.anInt2356 = arg0.anInt1585;
				Static1.anInt139 = arg0.anInt1598;
			}
			if (Static1.aClass33_1.aBoolean117) {
				arg0.anInt1585 = Static1.anInt139;
			} else {
				arg0.anInt1585 = Static1.anInt2356;
			}
		} else if (local8 == 600) {
			arg0.aClass40_466 = JagString.aClass40_448;
			if (Static1.anInt2511 % 20 < 10) {
				arg0.aClass40_466 = arg0.aClass40_466.method1192(124);
			} else {
				arg0.aClass40_466 = arg0.aClass40_466.method1192(32);
			}
		} else {
			if (local8 == 620) {
				if (Static1.anInt1550 < 1) {
					arg0.aClass40_466 = JagString.aClass40_445;
				} else if (Static1.aBoolean103) {
					arg0.anInt1584 = 16711680;
					arg0.aClass40_466 = JagString.aClass40_540;
				} else {
					arg0.aClass40_466 = JagString.aClass40_646;
					arg0.anInt1584 = 16777215;
				}
			}
			@Pc(549) JagString local549;
			if (local8 == 660) {
				local68 = Static78.anInt2035 - Static46.anInt1163;
				if (local68 <= 0) {
					local549 = JagString.aClass40_515;
				} else if (local68 == 1) {
					local549 = JagString.aClass40_321;
				} else {
					local549 = Static72.method1334(new JagString[] { Static48.method859(local68), JagString.aClass40_107 });
				}
				@Pc(577) JagString local577 = JagString.aClass40_445;
				if (Static56.aClass48_6 != null) {
					local577 = Static2.method21(Static56.aClass48_6.anInt1926);
					try {
						if (Static56.aClass48_6.value != null) {
							@Pc(593) byte[] local593 = ((String) Static56.aClass48_6.value).getBytes("ISO-8859-1");
							local577 = Static64.method1114(local593.length, local593, 0);
						}
					} catch (@Pc(602) UnsupportedEncodingException local602) {
					}
				}
				arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_254, local549, JagString.aClass40_431, local577 });
			}
			if (local8 == 661) {
				if (Static61.anInt1664 == 0) {
					arg0.aClass40_466 = JagString.aClass40_523;
				} else if (Static61.anInt1664 <= Static78.anInt2035) {
					arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_179, Static1.method1(Static61.anInt1664) });
				} else {
					local68 = Static78.anInt2035 + 14 - Static61.anInt1664;
					if (local68 <= 0) {
						local549 = JagString.aClass40_512;
					} else if (local68 == 1) {
						local549 = JagString.aClass40_241;
					} else {
						local549 = Static72.method1334(new JagString[] { Static48.method859(local68), JagString.aClass40_107 });
					}
					arg0.aClass40_466 = Static72.method1334(new JagString[] { local549, JagString.aClass40_624, Static1.method1(Static61.anInt1664), JagString.aClass40_693 });
				}
			}
			if (local8 == 662) {
				@Pc(724) JagString local724;
				if (Static46.anInt1167 == 0) {
					local724 = JagString.aClass40_17;
				} else if (Static46.anInt1167 == 1) {
					local724 = JagString.aClass40_717;
				} else {
					local724 = Static72.method1334(new JagString[] { JagString.aClass40_689, Static48.method859(Static46.anInt1167), JagString.aClass40_317 });
				}
				arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_367, local724, JagString.aClass40_511 });
			}
			if (local8 == 663) {
				if (Static53.anInt1494 > 0 && Static78.anInt2035 + 10 >= Static53.anInt1494) {
					arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_337, Static1.method1(Static53.anInt1494) });
				} else {
					arg0.aClass40_466 = JagString.aClass40_600;
				}
			}
			if (local8 == 664) {
				if (Static35.anInt941 == 0) {
					arg0.aClass40_466 = JagString.aClass40_483;
				}
				if (Static35.anInt941 == 1) {
					arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_733, Static1.method1(Static75.anInt1960) });
				}
				if (Static35.anInt941 == 2) {
					arg0.aClass40_466 = JagString.aClass40_741;
				}
			}
			if (local8 == 665) {
				if (Static51.anInt2272 > 2 && !client.membersWorld) {
					arg0.aClass40_466 = JagString.aClass40_562;
				} else if (Static51.anInt2272 > 2) {
					arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_694, Static48.method859(Static51.anInt2272), JagString.aClass40_119 });
				} else if (Static51.anInt2272 > 0) {
					arg0.aClass40_466 = Static72.method1334(new JagString[] { JagString.aClass40_183, Static48.method859(Static51.anInt2272), JagString.aClass40_429 });
				} else {
					arg0.aClass40_466 = JagString.aClass40_614;
				}
			}
			if (local8 == 667) {
				if (Static51.anInt2272 > 2 && !client.membersWorld) {
					arg0.aClass40_466 = JagString.aClass40_621;
				} else if (Static51.anInt2272 > 0) {
					arg0.aClass40_466 = JagString.aClass40_485;
				} else {
					arg0.aClass40_466 = JagString.aClass40_408;
				}
			}
			if (local8 == 668) {
				if (Static78.anInt2035 < Static61.anInt1664) {
					arg0.aClass40_466 = JagString.aClass40_121;
				} else {
					arg0.aClass40_466 = JagString.aClass40_228;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I", line = 411)
	public static int method228() {
		return 19;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V", line = 423)
	public static void method229() {
		anIntArrayArray5 = null;
		Static1.anIntArrayArray6 = null;
		JagString.aClass40_64 = null;
		JagString.aClass40_66 = null;
		JagString.aClass40_62 = null;
		JagString.aClass40_63 = null;
		legacyCacheDat = null;
		Static1.aBigInteger1 = null;
		JagString.aClass40_65 = null;
		JagString.aClass40_67 = null;
	}
}

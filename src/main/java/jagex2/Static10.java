package jagex2;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

import jagex2.config.ComType;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!d;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger RSA_MODULUS = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_62 = Static13.method257("::errortest");

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_63 = Static13.method257("(X");

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public static int anInt261 = 0;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray6 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public static int anInt262 = 0;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_64 = Static13.method257("backbase2");

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Lclient!o;")
	private static Class40 aClass40_66 = Static13.method257("Members object");

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!o;")
	public static Class40 textMembersObject = aClass40_66;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public static int anInt263 = 0;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_67 = Static13.method257("wave2:");

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public static int anInt264 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!mc;)V")
	public static void updateInterfaceContent(@OriginalArg(1) ComType component) {
		@Pc(8) int clientCode = component.clientCode;
		@Pc(68) int local68;
		if (clientCode >= 1 && clientCode <= 100 || clientCode >= 701 && clientCode <= 800) {
			if (clientCode == 1 && Static42.anInt1038 == 0) {
				component.text = Static93.aClass40_626;
				component.buttonType = 0;
			} else if (clientCode == 1 && Static42.anInt1038 == 1) {
				component.buttonType = 0;
				component.text = Static102.aClass40_709;
			} else if (clientCode == 2 && Static42.anInt1038 != 2) {
				component.buttonType = 0;
				component.text = Static52.aClass40_361;
			} else {
				local68 = Static22.friendCount;
				if (clientCode <= 700) {
					clientCode--;
				} else {
					clientCode -= 601;
				}
				if (Static42.anInt1038 != 2) {
					local68 = 0;
				}
				if (clientCode >= local68) {
					component.text = Static61.aClass40_445;
					component.buttonType = 0;
				} else {
					component.text = Static51.friendName[clientCode];
					component.buttonType = 1;
				}
			}
		} else if (clientCode >= 101 && clientCode <= 200 || !(clientCode < 801 || clientCode > 900)) {
			if (clientCode > 800) {
				clientCode -= 701;
			} else {
				clientCode -= 101;
			}
			local68 = Static22.friendCount;
			if (Static42.anInt1038 != 2) {
				local68 = 0;
			}
			if (local68 <= clientCode) {
				component.buttonType = 0;
				component.text = Static61.aClass40_445;
			} else {
				if (Static62.anIntArray316[clientCode] == 0) {
					component.text = Static5.aClass40_43;
				} else if (Static62.anIntArray316[clientCode] >= 5000) {
					if (Static4.anInt140 == Static62.anIntArray316[clientCode]) {
						component.text = Static80.method1334(new Class40[] { Static14.aClass40_85, Static53.method859(Static62.anIntArray316[clientCode] - 5000) });
					} else {
						component.text = Static80.method1334(new Class40[] { Static73.aClass40_514, Static53.method859(Static62.anIntArray316[clientCode] - 5000) });
					}
				} else if (Static4.anInt140 == Static62.anIntArray316[clientCode]) {
					component.text = Static80.method1334(new Class40[] { Static44.aClass40_330, Static53.method859(Static62.anIntArray316[clientCode]) });
				} else {
					component.text = Static80.method1334(new Class40[] { Static79.aClass40_545, Static53.method859(Static62.anIntArray316[clientCode]) });
				}
				component.buttonType = 1;
			}
		} else if (clientCode == 203) {
			local68 = Static22.friendCount;
			if (Static42.anInt1038 != 2) {
				local68 = 0;
			}
			component.scroll = local68 * 15 + 20;
			if (component.height >= component.scroll) {
				component.scroll = component.height + 1;
			}
		} else if (clientCode >= 401 && clientCode <= 500) {
			clientCode -= 401;
			if (clientCode == 0 && Static42.anInt1038 == 0) {
				component.text = Static37.aClass40_287;
				component.buttonType = 0;
			} else if (clientCode == 1 && Static42.anInt1038 == 0) {
				component.buttonType = 0;
				component.text = Static52.aClass40_361;
			} else {
				local68 = Static99.ignoreCount;
				if (Static42.anInt1038 == 0) {
					local68 = 0;
				}
				if (local68 <= clientCode) {
					component.buttonType = 0;
					component.text = Static61.aClass40_445;
				} else {
					component.text = Static48.method819(Static84.aLongArray4[clientCode]).method1167();
					component.buttonType = 1;
				}
			}
		} else if (clientCode == 503) {
			component.scroll = Static99.ignoreCount * 15 + 20;
			if (component.height >= component.scroll) {
				component.scroll = component.height + 1;
			}
		} else if (clientCode == 327) {
			component.xan = 150;
			component.yan = (int) (Math.sin((double) Static107.loopCycle / 40.0D) * 256.0D) & 0x7FF;
			component.anInt1607 = 5;
			component.anInt1602 = 0;
		} else if (clientCode == 324) {
			if (Static97.anInt2356 == -1) {
				Static4.anInt139 = component.anInt1598;
				Static97.anInt2356 = component.anInt1585;
			}
			if (Static38.aClass33_1.aBoolean117) {
				component.anInt1585 = Static97.anInt2356;
			} else {
				component.anInt1585 = Static4.anInt139;
			}
		} else if (clientCode == 325) {
			if (Static97.anInt2356 == -1) {
				Static97.anInt2356 = component.anInt1585;
				Static4.anInt139 = component.anInt1598;
			}
			if (Static38.aClass33_1.aBoolean117) {
				component.anInt1585 = Static4.anInt139;
			} else {
				component.anInt1585 = Static97.anInt2356;
			}
		} else if (clientCode == 600) {
			component.text = Static61.reportAbuseInput;
			if (Static107.loopCycle % 20 < 10) {
				component.text = component.text.method1192(124);
			} else {
				component.text = component.text.method1192(32);
			}
		} else {
			if (clientCode == 620) {
				if (Static61.anInt1550 < 1) {
					component.text = Static61.aClass40_445;
				} else if (Static54.aBoolean103) {
					component.anInt1584 = 16711680;
					component.text = Static15.aClass40_540;
				} else {
					component.text = Static95.aClass40_646;
					component.anInt1584 = 16777215;
				}
			}
			@Pc(549) Class40 local549;
			if (clientCode == 660) {
				local68 = Static86.anInt2035 - Static51.anInt1163;
				if (local68 <= 0) {
					local549 = Static73.aClass40_515;
				} else if (local68 == 1) {
					local549 = Static42.aClass40_321;
				} else {
					local549 = Static80.method1334(new Class40[] { Static53.method859(local68), Static68.aClass40_107 });
				}
				@Pc(577) Class40 local577 = Static61.aClass40_445;
				if (Static61.aClass48_6 != null) {
					local577 = Static2.method21(Static61.aClass48_6.anInt1926);
					try {
						if (Static61.aClass48_6.anObject4 != null) {
							@Pc(593) byte[] local593 = ((String) Static61.aClass48_6.anObject4).getBytes("ISO-8859-1");
							local577 = Static70.method1114(local593.length, local593, 0);
						}
					} catch (@Pc(602) UnsupportedEncodingException local602) {
					}
				}
				component.text = Static80.method1334(new Class40[] { Static35.aClass40_254, local549, Static60.aClass40_431, local577 });
			}
			if (clientCode == 661) {
				if (Static66.anInt1664 == 0) {
					component.text = Static74.aClass40_523;
				} else if (Static66.anInt1664 <= Static86.anInt2035) {
					component.text = Static80.method1334(new Class40[] { Static24.aClass40_179, Static1.method1(Static66.anInt1664) });
				} else {
					local68 = Static86.anInt2035 + 14 - Static66.anInt1664;
					if (local68 <= 0) {
						local549 = Static73.aClass40_512;
					} else if (local68 == 1) {
						local549 = Static33.aClass40_241;
					} else {
						local549 = Static80.method1334(new Class40[] { Static53.method859(local68), Static68.aClass40_107 });
					}
					component.text = Static80.method1334(new Class40[] { local549, Static93.aClass40_624, Static1.method1(Static66.anInt1664), Static101.aClass40_693 });
				}
			}
			if (clientCode == 662) {
				@Pc(724) Class40 local724;
				if (Static51.anInt1167 == 0) {
					local724 = Static3.aClass40_17;
				} else if (Static51.anInt1167 == 1) {
					local724 = Static107.aClass40_717;
				} else {
					local724 = Static80.method1334(new Class40[] { Static100.aClass40_689, Static53.method859(Static51.anInt1167), Static42.aClass40_317 });
				}
				component.text = Static80.method1334(new Class40[] { Static53.aClass40_367, local724, Static73.aClass40_511 });
			}
			if (clientCode == 663) {
				if (Static58.anInt1494 > 0 && Static86.anInt2035 + 10 >= Static58.anInt1494) {
					component.text = Static80.method1334(new Class40[] { Static45.aClass40_337, Static1.method1(Static58.anInt1494) });
				} else {
					component.text = Static87.aClass40_600;
				}
			}
			if (clientCode == 664) {
				if (Static37.anInt941 == 0) {
					component.text = Static67.aClass40_483;
				}
				if (Static37.anInt941 == 1) {
					component.text = Static80.method1334(new Class40[] { Static31.aClass40_733, Static1.method1(Static83.anInt1960) });
				}
				if (Static37.anInt941 == 2) {
					component.text = Static106.aClass40_741;
				}
			}
			if (clientCode == 665) {
				if (Static56.anInt2272 > 2 && !Static18.aBoolean37) {
					component.text = Static82.aClass40_562;
				} else if (Static56.anInt2272 > 2) {
					component.text = Static80.method1334(new Class40[] { Static101.aClass40_694, Static53.method859(Static56.anInt2272), Static17.aClass40_119 });
				} else if (Static56.anInt2272 > 0) {
					component.text = Static80.method1334(new Class40[] { Static24.aClass40_183, Static53.method859(Static56.anInt2272), Static58.aClass40_429 });
				} else {
					component.text = Static76.aClass40_614;
				}
			}
			if (clientCode == 667) {
				if (Static56.anInt2272 > 2 && !Static18.aBoolean37) {
					component.text = Static92.aClass40_621;
				} else if (Static56.anInt2272 > 0) {
					component.text = Static67.aClass40_485;
				} else {
					component.text = Static55.aClass40_408;
				}
			}
			if (clientCode == 668) {
				if (Static86.anInt2035 < Static66.anInt1664) {
					component.text = Static18.aClass40_121;
				} else {
					component.text = Static32.aClass40_228;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
	public static int method228() {
		return 19;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	public static void method229() {
		anIntArrayArray5 = null;
		anIntArrayArray6 = null;
		aClass40_64 = null;
		aClass40_66 = null;
		aClass40_62 = null;
		aClass40_63 = null;
		aClass14_1 = null;
		RSA_MODULUS = null;
		textMembersObject = null;
		aClass40_67 = null;
	}
}

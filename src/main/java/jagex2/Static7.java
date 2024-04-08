package jagex2;

import java.awt.Component;

import jagex2.graphics.PixMap;
import jagex2.graphics.PixFont;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!p;")
	public static PixMap aClass45_5;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int anInt231 = 0;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public static int anInt239 = 255;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_60 = Static13.method257("Enter amount:");

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "B")
	public static byte aByte1 = 0;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_61 = Static13.method257(")3)3)3");

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "[B")
	public static byte[] aByteArray1 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method183() {
		if (Static80.aClass24_1 != null) {
			Static80.aClass24_1.method1656();
			Static80.aClass24_1 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Ljava/awt/Component;")
	public static Component method185() {
		if (Static105.viewBox == null) {
			return Static99.aClass7_2 == null ? null : Static99.aClass7_2.anApplet1;
		} else {
			return Static105.viewBox;
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public static void drawPrivateMessages() {
		if (Static102.splitPrivateChat == 0) {
			return;
		}
		@Pc(13) PixFont font = Static103.aClass2_Sub2_Sub2_Sub2_5;
		@Pc(15) int lineOffset = 0;
		if (Static84.systemUpdateTimer != 0) {
			lineOffset = 1;
		}
		for (@Pc(26) int i = 0; i < 100; i++) {
			if (Static63.messageText[i] != null) {
				@Pc(36) int type = Static76.messageType[i];
				@Pc(40) Class40 username = Static106.messageSender[i];
				@Pc(42) byte local42 = 0;
				if (username != null && username.method1168(Static42.aClass40_323)) {
					local42 = 1;
					username = username.method1185(5);
				}
				if (username != null && username.method1168(Static92.aClass40_622)) {
					local42 = 2;
					username = username.method1185(5);
				}
				@Pc(108) int y;
				if ((type == 3 || type == 7) && (type == 7 || Static104.privateChatSetting == 0 || Static104.privateChatSetting == 1 && Static38.isFriend(username))) {
					y = 329 - lineOffset * 13;
					lineOffset++;
					font.drawString(Static45.aClass40_340, 4, y, 0);
					font.drawString(Static45.aClass40_340, 4, y - 1, 65535);
					@Pc(131) int local131 = font.method568(Static82.aClass40_564) + 4;
					if (local42 == 1) {
						Static70.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(local131, y - 12);
						local131 += 14;
					}
					if (local42 == 2) {
						Static70.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local131, y - 12);
						local131 += 14;
					}
					font.drawString(Static80.method1334(new Class40[] { username, Static1.textFriendsChatColon, Static63.messageText[i] }), local131, y, 0);
					font.drawString(Static80.method1334(new Class40[] { username, Static1.textFriendsChatColon, Static63.messageText[i] }), local131, y - 1, 65535);
					if (lineOffset >= 5) {
						return;
					}
				}
				if (type == 5 && Static104.privateChatSetting < 2) {
					y = 329 - lineOffset * 13;
					lineOffset++;
					font.drawString(Static63.messageText[i], 4, y, 0);
					font.drawString(Static63.messageText[i], 4, y - 1, 65535);
					if (lineOffset >= 5) {
						return;
					}
				}
				if (type == 6 && Static104.privateChatSetting < 2) {
					y = 329 - lineOffset * 13;
					font.drawString(Static80.method1334(new Class40[] { Static100.textFriendsChatTo, username, Static1.textFriendsChatColon, Static63.messageText[i] }), 4, y, 0);
					font.drawString(Static80.method1334(new Class40[] { Static100.textFriendsChatTo, username, Static1.textFriendsChatColon, Static63.messageText[i] }), 4, y - 1, 65535);
					lineOffset++;
					if (lineOffset >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V")
	public static void method187(@OriginalArg(0) int arg0) {
		if (arg0 == Static44.anInt1075) {
			return;
		}
		if (Static44.anInt1075 == 0) {
			Static45.method801();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static66.anInt1649 = 0;
			Static86.anInt2039 = 0;
			Static27.anInt693 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static36.aClass25_20 != null) {
			Static36.aClass25_20.method730();
		}
		if (Static44.anInt1075 == 25 || Static44.anInt1075 == 40) {
			Static75.method1230();
			Static26.clear();
		}
		if (Static44.anInt1075 == 25) {
			Static34.anInt805 = 1;
			Static67.anInt1667 = 0;
			Static68.anInt375 = 0;
			Static46.anInt2455 = 1;
			Static44.anInt1080 = 0;
		}
		if (arg0 == 35) {
			Static2.method18();
			Static12.method252();
			if (Static29.aClass45_14 == null) {
				Static29.aClass45_14 = Static83.create(method185(), 765, 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static29.aClass45_14 = null;
			Static2.method18();
			Static15.method1263(Static82.aClass5_Sub1_16, method185(), Static81.aClass5_Sub1_15);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static29.aClass45_14 = null;
			Static12.method252();
			Static59.method997(Static82.aClass5_Sub1_16, method185());
		}
		Static44.anInt1075 = arg0;
		Static1.clearScreen = true;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	public static void method188() {
		Static89.lowMemory = false;
		Static1.lowMemory = false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIII)I")
	public static int method189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
	public static void method191() {
		aByteArray1 = null;
		aClass40_60 = null;
		aClass40_61 = null;
		aClass45_5 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!eb;)Lclient!o;")
	public static Class40 method192(@OriginalArg(1) Packet arg0) {
		return Static18.method360(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ud;II)[Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3[] method194(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		return Static92.method1484(arg0, arg1, arg2) ? Static96.method1555() : null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	public static void method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg2; local11 <= arg2 + arg0; local11++) {
			for (@Pc(15) int local15 = arg3; local15 <= arg3 + arg1; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static60.levelShademap[0][local15][local11] = 127;
					if (arg3 == local15 && local15 > 0) {
						Static91.levelHeightMap[0][local15][local11] = Static91.levelHeightMap[0][local15 - 1][local11];
					}
					if (local15 == arg3 + arg1 && local15 < 103) {
						Static91.levelHeightMap[0][local15][local11] = Static91.levelHeightMap[0][local15 + 1][local11];
					}
					if (arg2 == local11 && local11 > 0) {
						Static91.levelHeightMap[0][local15][local11] = Static91.levelHeightMap[0][local15][local11 - 1];
					}
					if (local11 == arg0 + arg2 && local11 < 103) {
						Static91.levelHeightMap[0][local15][local11] = Static91.levelHeightMap[0][local15][local11 + 1];
					}
				}
			}
		}
	}
}

package jagex2;

import java.awt.Graphics;

import jagex2.graphics.Draw3D;
import jagex2.graphics.FrameBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt1914;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!p;")
	public static FrameBuffer aClass45_27;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!wd;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!p;")
	public static FrameBuffer aClass45_28;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "Lclient!qd;")
	public static Class48 aClass48_7;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt1911 = 0;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!wc;")
	public static Class2_Sub3_Sub1 out = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt1917 = 0;

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_556 = Static13.method257(" (Xskill)2");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public static int anInt1919 = 0;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_557 = Static13.method257(")3");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)I")
	public static int interpolate(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Draw3D.cos[arg0 * 1024 / arg2] >> 1;
		return ((65536 - local12) * arg1 >> 16) + (local12 * arg3 >> 16);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method1328() {
		out = null;
		aClass48_7 = null;
		aClass40_557 = null;
		aClass40_556 = null;
		aClass24_1 = null;
		aClass45_27 = null;
		aClass45_28 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;I)V")
	public static void method1329(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		Static54.aClass5_18 = arg0;
		Static92.aClass5_28 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method1331() {
		if (Static86.anInt2030 != 1) {
			return;
		}
		if (Static107.anInt2500 >= 6 && Static107.anInt2500 <= 106 && Static90.anInt2133 >= 467 && Static90.anInt2133 <= 499) {
			Static52.redrawPrivacySettings = true;
			Static23.publicChatSetting = (Static23.publicChatSetting + 1) % 4;
			Static73.redrawChatback = true;
			out.p1isaac(132);
			out.p1(Static23.publicChatSetting);
			out.p1(Static104.privateChatSetting);
			out.p1(Static103.tradeChatSetting);
		}
		if (Static107.anInt2500 >= 135 && Static107.anInt2500 <= 235 && Static90.anInt2133 >= 467 && Static90.anInt2133 <= 499) {
			Static73.redrawChatback = true;
			Static52.redrawPrivacySettings = true;
			Static104.privateChatSetting = (Static104.privateChatSetting + 1) % 3;
			out.p1isaac(132);
			out.p1(Static23.publicChatSetting);
			out.p1(Static104.privateChatSetting);
			out.p1(Static103.tradeChatSetting);
		}
		if (Static107.anInt2500 >= 273 && Static107.anInt2500 <= 373 && Static90.anInt2133 >= 467 && Static90.anInt2133 <= 499) {
			Static103.tradeChatSetting = (Static103.tradeChatSetting + 1) % 3;
			Static52.redrawPrivacySettings = true;
			Static73.redrawChatback = true;
			out.p1isaac(132);
			out.p1(Static23.publicChatSetting);
			out.p1(Static104.privateChatSetting);
			out.p1(Static103.tradeChatSetting);
		}
		if (Static107.anInt2500 < 412 || Static107.anInt2500 > 512 || Static90.anInt2133 < 467 || Static90.anInt2133 > 499) {
			return;
		}
		if (Static22.anInt2585 != -1) {
			Static58.method989(0, Static61.aClass40_445, Static94.aClass40_628);
			return;
		}
		Static60.method998();
		if (Static34.anInt808 != -1) {
			Static54.aBoolean103 = false;
			Static61.reportAbuseInput = Static61.aClass40_445;
			Static75.anInt1826 = Static22.anInt2585 = Static34.anInt808;
			return;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/Graphics;)V")
	public static void method1333(@OriginalArg(1) Graphics arg0) {
		Static2.aClass45_2.draw(arg0, 4, 4);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[Lclient!o;)Lclient!o;")
	public static Class40 method1334(@OriginalArg(1) Class40[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static97.method1563(arg0, arg0.length);
	}
}

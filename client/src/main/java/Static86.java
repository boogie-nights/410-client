import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V", line = 164)
	public static synchronized void method1490() {
		if (Static64.method1110()) {
			Static30.method595();
			Static1.aBoolean151 = false;
			Static63.aClass5_6 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIZIIILclient!ud;)V", line = 198)
	public static synchronized void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Js5Index arg3) {
		if (!Static64.method1110()) {
			return;
		}
		Static43.anInt2458 = arg2;
		Static63.aClass5_6 = arg3;
		Static1.aBoolean151 = true;
		Static70.anInt2153 = -1;
		Static64.anInt1696 = arg1;
		Static90.anInt2370 = arg0;
		Static93.aBoolean179 = false;
		Static82.anInt2135 = 10;
		Static13.anInt310 = 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 256)
	public static synchronized void method1493() {
		Static10.method235();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZJ)V", line = 267)
	public static void sleep(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static97.sleep(arg0 - 1L);
			Static97.sleep(1L);
		} else {
			Static97.sleep(arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!o;Lclient!o;Lclient!ud;IZIII)V", line = 350)
	public static synchronized void method1496(@OriginalArg(0) JagString arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) Js5Index arg2, @OriginalArg(6) int arg3) {
		if (Static64.method1110()) {
			@Pc(12) int local12 = arg2.method80(arg0);
			@Pc(18) int local18 = arg2.method72(arg1, local12);
			method1491(local12, arg3, local18, arg2);
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 384)
	public static synchronized void method1497() {
		if (Static64.method1110()) {
			Static58.method1055();
			Static63.aClass5_6 = null;
			Static1.aBoolean151 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 404)
	public static void method1498() {
		JagString.aClass40_630 = null;
		JagString.aClass40_633 = null;
		JagString.aClass40_631 = null;
		JagString.aClass40_632 = null;
		JagString.aClass40_629 = null;
		JagString.aClass40_628 = null;
		client.skillLevel = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!ud;IZ)V", line = 421)
	public static synchronized void method1499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Js5Index arg2, @OriginalArg(5) int arg3) {
		if (!Static64.method1110()) {
			return;
		}
		Static13.anInt310 = arg0;
		Static70.anInt2153 = -1;
		Static82.anInt2135 = -1;
		Static64.anInt1696 = arg3;
		Static43.anInt2458 = 0;
		Static93.aBoolean179 = false;
		Static1.aBoolean151 = true;
		Static63.aClass5_6 = arg2;
		Static90.anInt2370 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V", line = 442)
	public static synchronized void method1500() {
		if (!Static64.method1110()) {
			return;
		}
		if (Static1.aBoolean151) {
			@Pc(22) byte[] local22 = Static98.method1735(Static13.anInt310, Static43.anInt2458, Static63.aClass5_6, Static90.anInt2370);
			if (local22 != null) {
				if (Static82.anInt2135 >= 0) {
					Static63.method335(Static93.aBoolean179, local22, Static64.anInt1696, Static82.anInt2135);
				} else if (Static70.anInt2153 < 0) {
					Static67.method1208(Static93.aBoolean179, Static64.anInt1696, local22);
				} else {
					Static43.method1634(Static93.aBoolean179, local22, Static70.anInt2153, Static64.anInt1696);
				}
				Static1.aBoolean151 = false;
				Static63.aClass5_6 = null;
			}
		}
		Static35.method719();
	}
}

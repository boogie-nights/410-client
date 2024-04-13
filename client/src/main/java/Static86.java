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

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 218)
	public static void method1492() {
		Static26.method533(Static1.anInt1971);
		if (Static1.anInt2175 != -1) {
			Static26.method533(Static1.anInt2175);
		}
		client.sceneDelta = 0;
		Static27.aClass45_14.bind();
		Static34.anIntArray162 = Static6.method175(Static34.anIntArray162);
		Static25.method1610();
		Static20.method403(0, -1, Static1.anInt1971, 0, 0, 503, 0, 765);
		if (Static1.anInt2175 != -1) {
			Static20.method403(0, -1, Static1.anInt2175, 0, 0, 503, 0, 765);
		}
		if (Static1.aBoolean175) {
			Static22.method480();
		} else {
			client.handleInput();
			Static5.method115();
		}
		Static27.aClass45_14.draw(client.graphics, 0, 0);
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
			Static97.method1672(arg0 - 1L);
			Static97.method1672(1L);
		} else {
			Static97.method1672(arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 289)
	public static void method1495() {
		Static1.anInt1190 = 0;
		Static1.anInt304 = 0;
		Static22.method477();
		Static24.method520();
		Static64.method1109();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static1.anInt304; local22++) {
			local28 = Static1.anIntArray258[local22];
			if (client.loopCycle != client.npcs[local28].anInt2274) {
				client.npcs[local28].type = null;
				client.npcs[local28] = null;
			}
		}
		if (client.in.pos != client.packetSize) {
			throw new RuntimeException("gnp1 pos:" + client.in.pos + " psize:" + client.packetSize);
		}
		for (local28 = 0; local28 < client.npcCount; local28++) {
			if (client.npcs[client.npcIds[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + client.npcCount);
			}
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
		Static1.anIntArray473 = null;
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

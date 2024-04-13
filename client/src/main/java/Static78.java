import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "I")
	public static int anInt2027;

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!sa", name = "Gb", descriptor = "I")
	public static int anInt2035;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V", line = 85)
	public static void method1382() {
		JagString.aClass40_586 = null;
		JagString.aClass40_591 = null;
		Static1.aByteArray17 = null;
		anIntArrayArray20 = null;
		JagString.aClass40_587 = null;
		JagString.aClass40_592 = null;
		JagString.aClass40_584 = null;
		JagString.aClass40_588 = null;
		JagString.aClass40_590 = null;
		JagString.aClass40_589 = null;
		JagString.aClass40_593 = null;
		JagString.aClass40_585 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[B)V", line = 144)
	public static void method1384(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Packet local10 = new Packet(arg0);
		local10.pos = arg0.length - 2;
		Static28.anInt727 = local10.g2();
		Static83.aByteArrayArray10 = new byte[Static28.anInt727][];
		Static61.anIntArray338 = new int[Static28.anInt727];
		Static89.anIntArray503 = new int[Static28.anInt727];
		Static18.anIntArray86 = new int[Static28.anInt727];
		Static75.anIntArray430 = new int[Static28.anInt727];
		local10.pos = arg0.length - Static28.anInt727 * 8 - 7;
		Static41.anInt1079 = local10.g2();
		Static96.anInt2513 = local10.g2();
		@Pc(64) int local64 = (local10.g1() & 0xFF) + 1;
		for (@Pc(66) int local66 = 0; local66 < Static28.anInt727; local66++) {
			Static75.anIntArray430[local66] = local10.g2();
		}
		for (@Pc(80) int local80 = 0; local80 < Static28.anInt727; local80++) {
			Static89.anIntArray503[local80] = local10.g2();
		}
		for (@Pc(98) int local98 = 0; local98 < Static28.anInt727; local98++) {
			Static61.anIntArray338[local98] = local10.g2();
		}
		for (@Pc(116) int local116 = 0; local116 < Static28.anInt727; local116++) {
			Static18.anIntArray86[local116] = local10.g2();
		}
		local10.pos = arg0.length - (local64 - 1) * 3 - Static28.anInt727 * 8 - 7;
		Static19.anIntArray92 = new int[local64];
		for (@Pc(154) int local154 = 1; local154 < local64; local154++) {
			Static19.anIntArray92[local154] = local10.g3();
			if (Static19.anIntArray92[local154] == 0) {
				Static19.anIntArray92[local154] = 1;
			}
		}
		local10.pos = 0;
		for (@Pc(179) int local179 = 0; local179 < Static28.anInt727; local179++) {
			@Pc(185) int local185 = Static61.anIntArray338[local179];
			@Pc(189) int local189 = Static18.anIntArray86[local179];
			@Pc(193) int local193 = local185 * local189;
			@Pc(196) byte[] local196 = new byte[local193];
			Static83.aByteArrayArray10[local179] = local196;
			@Pc(206) int local206 = local10.g1();
			@Pc(213) int local213;
			if (local206 == 0) {
				for (local213 = 0; local213 < local193; local213++) {
					local196[local213] = local10.g1b();
				}
			} else if (local206 == 1) {
				for (local213 = 0; local213 < local185; local213++) {
					for (@Pc(236) int local236 = 0; local236 < local189; local236++) {
						local196[local185 * local236 + local213] = local10.g1b();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)V", line = 284)
	public static void method1385() {
		if (Static1.anInt2473 == 0) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (client.systemUpdateTimer != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (client.aClass40Array30[local21] != null) {
				@Pc(31) int local31 = client.messageType[local21];
				@Pc(35) JagString local35 = client.aClass40Array40[local21];
				if (local35 != null && local35.method1168(JagString.aClass40_323)) {
					local35 = local35.method1185(5);
				}
				if (local35 != null && local35.method1168(JagString.aClass40_622)) {
					local35 = local35.method1185(5);
				}
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static1.anInt2515 == 0 || Static1.anInt2515 == 1 && Static36.method729(local35))) {
					@Pc(85) int local85 = 329 - local15 * 13;
					if (Mouse.x > 4 && local85 - 10 < Mouse.y + -4 && local85 + 3 >= Mouse.y + -4) {
						@Pc(129) int local129 = client.fontPlain12.method568(JagString.concatenate(new JagString[] { JagString.aClass40_18, local35, client.aClass40Array30[local21] })) + 25;
						if (local129 > 450) {
							local129 = 450;
						}
						if (local129 + 4 > Mouse.x) {
							if (Static1.anInt1550 >= 1) {
								client.method402(JagString.concatenate(new JagString[] { JagString.aClass40_111, local35 }), 2042, 0, 0, 0);
							}
							client.method402(JagString.concatenate(new JagString[] { JagString.aClass40_604, local35 }), 2012, 0, 0, 0);
							client.method402(JagString.concatenate(new JagString[] { JagString.aClass40_535, local35 }), 2051, 0, 0, 0);
						}
					}
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
				if ((local31 == 5 || local31 == 6) && Static1.anInt2515 < 2) {
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V", line = 400)
	public static void method1386() {
		if (Static1.anInt2328 != 0 || client.mouseClickButton != 1) {
			return;
		}
		@Pc(17) int local17 = Static1.anInt2133 - 9;
		@Pc(23) int local23 = Static1.anInt2500 - 25 - 550;
		if (local23 < 0 || local17 < 0 || local23 >= 146 || local17 >= 151) {
			return;
		}
		local23 -= 73;
		local17 -= 75;
		@Pc(45) int local45 = client.orbitCameraYaw + Static1.anInt1978 & 0x7FF;
		@Pc(49) int local49 = Draw3D.sin[local45];
		@Pc(57) int local57 = (Static1.anInt1857 + 256) * local49 >> 8;
		@Pc(61) int local61 = Draw3D.cos[local45];
		@Pc(69) int local69 = local61 * (Static1.anInt1857 + 256) >> 8;
		@Pc(79) int local79 = local23 * local69 + local17 * local57 >> 11;
		@Pc(90) int local90 = local69 * local17 - local57 * local23 >> 11;
		@Pc(98) int local98 = client.localPlayer.z - local90 >> 7;
		@Pc(106) int local106 = client.localPlayer.x + local79 >> 7;
		@Pc(126) boolean local126 = client.tryMove(local98, 0, client.localPlayer.pathTileX[0], 0, 0, 1, true, 0, client.localPlayer.pathTileZ[0], 0, local106);
		if (!local126) {
			return;
		}
		client.out.p1(local23);
		client.out.p1(local17);
		client.out.p2(client.orbitCameraYaw);
		client.out.p1(57);
		client.out.p1(Static1.anInt1978);
		client.out.p1(Static1.anInt1857);
		client.out.p1(89);
		client.out.p2(client.localPlayer.x);
		client.out.p2(client.localPlayer.z);
		client.out.p1(client.tryMoveNearest);
		client.out.p1(63);
		return;
	}
}

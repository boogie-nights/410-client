import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "J")
	public static long aLong24;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!p;")
	public static PixMap aClass45_6;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 16)
	public static void method250() {
		aClass45_6 = null;
		JagString.aClass40_78 = null;
		JagString.aClass40_80 = null;
		JagString.aClass40_81 = null;
		JagString.aClass40_79 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)I", line = 30)
	public static int hsl24to16(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return arg0 / 2 + (arg1 / 32 << 7) + (arg2 / 4 << 10);
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V", line = 76)
	public static void method252() {
		if (!Static68.aBoolean145) {
			return;
		}
		Static4.anIntArray17 = null;
		Static64.anIntArray355 = null;
		Static84.anIntArray472 = null;
		Static2.aClass45_3 = null;
		Static89.aClass2_Sub2_Sub2_Sub3_21 = null;
		Static35.anIntArray182 = null;
		Static45.aClass2_Sub2_Sub2_Sub3Array14 = null;
		Static99.aClass45_31 = null;
		Static62.aClass45_26 = null;
		Static56.aClass45_22 = null;
		Static30.aClass2_Sub2_Sub2_Sub3_8 = null;
		Static33.aClass45_16 = null;
		Static1.anIntArray1 = null;
		Static88.aClass2_Sub2_Sub2_Sub4_9 = null;
		Static14.anIntArray414 = null;
		Static20.aClass45_11 = null;
		Static90.aClass45_30 = null;
		Static56.aClass45_24 = null;
		Static66.anIntArray406 = null;
		Static95.anIntArray547 = null;
		Static72.aClass45_27 = null;
		Static10.aClass2_Sub2_Sub2_Sub4_1 = null;
		Static86.method1490();
		Static41.method787(true);
		Static68.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V", line = 140)
	public static void draw2DEntityElements() {
		Static1.anInt1974 = 0;
		@Pc(79) int local79;
		for (@Pc(9) int local9 = -1; local9 < client.npcCount + client.playerCount; local9++) {
			@Pc(31) PathingEntity local31;
			if (local9 == -1) {
				local31 = client.localPlayer;
			} else if (local9 >= client.playerCount) {
				local31 = client.npcs[client.npcIds[local9 - client.playerCount]];
			} else {
				local31 = client.players[client.playerIds[local9]];
			}
			if (local31 != null && local31.isVisible()) {
				@Pc(60) NpcType local60;
				if (local31 instanceof NpcEntity) {
					local60 = ((NpcEntity) local31).type;
					if (local60.anIntArray154 != null) {
						local60 = local60.method611();
					}
					if (local60 == null) {
						continue;
					}
				}
				if (local9 >= client.playerCount) {
					local60 = ((NpcEntity) local31).type;
					if (local60.anInt773 >= 0 && local60.anInt773 < Static53.aClass2_Sub2_Sub2_Sub4Array8.length) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Static1.anInt426 > -1) {
							Static53.aClass2_Sub2_Sub2_Sub4Array8[local60.anInt773].method1624(Static1.anInt426 - 12, Static1.anInt477 - 30);
						}
					}
					if (Static1.anInt2139 == 1 && Static1.anInt1989 == client.npcIds[local9 - client.playerCount] && client.loopCycle % 20 < 10) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Static1.anInt426 > -1) {
							Static93.aClass2_Sub2_Sub2_Sub4Array10[0].method1624(Static1.anInt426 - 12, Static1.anInt477 + -28);
						}
					}
				} else {
					@Pc(77) PlayerEntity local77 = (PlayerEntity) local31;
					local79 = 30;
					if (local77.anInt1380 != -1 || local77.anInt1370 != -1) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Static1.anInt426 > -1) {
							if (local77.anInt1380 != -1) {
								Static41.aClass2_Sub2_Sub2_Sub4Array6[local77.anInt1380].method1624(Static1.anInt426 - 12, Static1.anInt477 + -30);
								local79 += 25;
							}
							if (local77.anInt1370 != -1) {
								Static53.aClass2_Sub2_Sub2_Sub4Array8[local77.anInt1370].method1624(Static1.anInt426 - 12, Static1.anInt477 - local79);
								local79 += 25;
							}
						}
					}
					if (local9 >= 0 && Static1.anInt2139 == 10 && Static1.anInt2353 == client.playerIds[local9]) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Static1.anInt426 > -1) {
							Static93.aClass2_Sub2_Sub2_Sub4Array10[1].method1624(Static1.anInt426 - 12, -local79 + Static1.anInt477);
						}
					}
				}
				if (local31.aClass40_660 != null && (client.playerCount <= local9 || Static1.anInt583 == 0 || Static1.anInt583 == 3 || Static1.anInt583 == 1 && Static36.method729(((PlayerEntity) local31).name))) {
					Static95.method1649(local31.anInt2310, local31);
					if (Static1.anInt426 > -1 && Static1.anInt1974 < Static1.anInt2457) {
						Static1.anIntArray537[Static1.anInt1974] = Static13.aClass2_Sub2_Sub2_Sub2_1.method568(local31.aClass40_660) / 2;
						Static1.anIntArray539[Static1.anInt1974] = Static13.aClass2_Sub2_Sub2_Sub2_1.anInt715;
						Static1.anIntArray541[Static1.anInt1974] = Static1.anInt426;
						Static1.anIntArray535[Static1.anInt1974] = Static1.anInt477;
						Static1.anIntArray538[Static1.anInt1974] = local31.anInt2301;
						Static1.anIntArray542[Static1.anInt1974] = local31.anInt2271;
						Static1.anIntArray540[Static1.anInt1974] = local31.anInt2294;
						Static1.aClass40Array39[Static1.anInt1974] = local31.aClass40_660;
						Static1.anInt1974++;
					}
				}
				if (local31.anInt2315 > client.loopCycle) {
					Static95.method1649(local31.anInt2310 + 15, local31);
					if (Static1.anInt426 > -1) {
						local79 = local31.anInt2298 * 30 / local31.anInt2279;
						if (local79 > 30) {
							local79 = 30;
						}
						Static25.method1612(Static1.anInt426 - 15, Static1.anInt477 + -3, local79, 5, 65280);
						Static25.method1612(local79 + Static1.anInt426 - 15, Static1.anInt477 - 3, 30 - local79, 5, 16711680);
					}
				}
				for (local79 = 0; local79 < 4; local79++) {
					if (client.loopCycle < local31.anIntArray494[local79]) {
						Static95.method1649(local31.anInt2310 / 2, local31);
						if (Static1.anInt426 > -1) {
							if (local79 == 1) {
								Static1.anInt477 -= 20;
							}
							if (local79 == 2) {
								Static1.anInt477 -= 10;
								Static1.anInt426 -= 15;
							}
							if (local79 == 3) {
								Static1.anInt477 -= 10;
								Static1.anInt426 += 15;
							}
							Static27.aClass2_Sub2_Sub2_Sub4Array4[local31.anIntArray495[local79]].method1624(Static1.anInt426 - 12, Static1.anInt477 + -12);
							Static70.aClass2_Sub2_Sub2_Sub2_4.method566(Static48.method859(local31.anIntArray493[local79]), Static1.anInt426, Static1.anInt477 + 4, 0);
							Static70.aClass2_Sub2_Sub2_Sub2_4.method566(Static48.method859(local31.anIntArray493[local79]), Static1.anInt426 - 1, Static1.anInt477 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(498) int local498 = 0; local498 < Static1.anInt1974; local498++) {
			local79 = Static1.anIntArray541[local498];
			@Pc(508) int local508 = Static1.anIntArray535[local498];
			@Pc(512) int local512 = Static1.anIntArray537[local498];
			@Pc(516) int local516 = Static1.anIntArray539[local498];
			@Pc(518) boolean local518 = true;
			while (local518) {
				local518 = false;
				for (@Pc(524) int local524 = 0; local524 < local498; local524++) {
					if (Static1.anIntArray535[local524] - Static1.anIntArray539[local524] < local508 - -2 && local508 - local516 < Static1.anIntArray535[local524] + 2 && local79 - local512 < Static1.anIntArray541[local524] - -Static1.anIntArray537[local524] && Static1.anIntArray541[local524] - Static1.anIntArray537[local524] < local512 + local79 && Static1.anIntArray535[local524] - Static1.anIntArray539[local524] < local508) {
						local508 = Static1.anIntArray535[local524] - Static1.anIntArray539[local524];
						local518 = true;
					}
				}
			}
			Static1.anInt426 = Static1.anIntArray541[local498];
			Static1.anInt477 = Static1.anIntArray535[local498] = local508;
			@Pc(627) JagString local627 = Static1.aClass40Array39[local498];
			if (Static1.anInt1186 == 0) {
				@Pc(634) int local634 = 16776960;
				if (Static1.anIntArray538[local498] < 6) {
					local634 = Static1.anIntArray519[Static1.anIntArray538[local498]];
				}
				if (Static1.anIntArray538[local498] == 6) {
					local634 = client.sceneCycle % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static1.anIntArray538[local498] == 7) {
					local634 = client.sceneCycle % 20 >= 10 ? 65535 : 255;
				}
				if (Static1.anIntArray538[local498] == 8) {
					local634 = client.sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(703) int local703;
				if (Static1.anIntArray538[local498] == 9) {
					local703 = 150 - Static1.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 1280 + 16711680;
					} else if (local703 < 100) {
						local634 = 16776960 - (local703 - 50) * 327680;
					} else if (local703 < 150) {
						local634 = (local703 - 100) * 5 + 65280;
					}
				}
				if (Static1.anIntArray538[local498] == 10) {
					local703 = 150 - Static1.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 5 + 16711680;
					} else if (local703 < 100) {
						local634 = 16384000 + 16711935 - local703 * 327680;
					} else if (local703 < 150) {
						local634 = local703 * 327680 + 255 + 500 - local703 * 5 - 32768000;
					}
				}
				if (Static1.anIntArray538[local498] == 11) {
					local703 = 150 - Static1.anIntArray540[local498];
					if (local703 < 50) {
						local634 = 16777215 - local703 * 327685;
					} else if (local703 < 100) {
						local634 = local703 * 327685 - 16318970;
					} else if (local703 < 150) {
						local634 = 32768000 + 16777215 - local703 * 327680;
					}
				}
				if (Static1.anIntArray542[local498] == 0) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static1.anInt426, Static1.anInt477 + 1, 0);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static1.anInt426, Static1.anInt477, local634);
				}
				if (Static1.anIntArray542[local498] == 1) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method564(local627, Static1.anInt426, Static1.anInt477 + 1, 0, client.sceneCycle);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method564(local627, Static1.anInt426, Static1.anInt477, local634, client.sceneCycle);
				}
				if (Static1.anIntArray542[local498] == 2) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method570(local627, Static1.anInt426, Static1.anInt477 + 1, 0, client.sceneCycle);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method570(local627, Static1.anInt426, Static1.anInt477, local634, client.sceneCycle);
				}
				if (Static1.anIntArray542[local498] == 3) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method577(local627, Static1.anInt426, Static1.anInt477 + 1, 0, client.sceneCycle, 150 - Static1.anIntArray540[local498]);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method577(local627, Static1.anInt426, Static1.anInt477, local634, client.sceneCycle, 150 - Static1.anIntArray540[local498]);
				}
				@Pc(971) int local971;
				if (Static1.anIntArray542[local498] == 4) {
					local703 = Static13.aClass2_Sub2_Sub2_Sub2_1.method568(local627);
					local971 = (local703 + 100) * (150 - Static1.anIntArray540[local498]) / 150;
					Static25.method1613(Static1.anInt426 - 50, 0, Static1.anInt426 + 50, 334);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method575(local627, Static1.anInt426 + 50 - local971, Static1.anInt477 - -1, 0);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method575(local627, Static1.anInt426 + 50 - local971, Static1.anInt477, local634);
					Static25.method1614();
				}
				if (Static1.anIntArray542[local498] == 5) {
					local703 = 150 - Static1.anIntArray540[local498];
					Static25.method1613(0, Static1.anInt477 - Static13.aClass2_Sub2_Sub2_Sub2_1.anInt715 - 1, 512, Static1.anInt477 + 5);
					local971 = 0;
					if (local703 < 25) {
						local971 = local703 - 25;
					} else if (local703 > 125) {
						local971 = local703 - 125;
					}
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static1.anInt426, local971 + Static1.anInt477 + 1, 0);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static1.anInt426, Static1.anInt477 + local971, local634);
					Static25.method1614();
				}
			} else {
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static1.anInt426, Static1.anInt477 + 1, 0);
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static1.anInt426, Static1.anInt477, 16776960);
			}
		}
	}
}

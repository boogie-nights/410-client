import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!p;")
	public static PixMap areaViewport;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!p;")
	public static PixMap aClass45_3;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 5)
	public static void method18() {
		if (!Static1.aBoolean152) {
			return;
		}
		Static95.aClass2_Sub2_Sub2_Sub3_24 = null;
		Static3.aClass2_Sub2_Sub2_Sub3_2 = null;
		Static94.aClass2_Sub2_Sub2_Sub3_23 = null;
		Static1.aBoolean152 = false;
		Static89.aClass2_Sub2_Sub2_Sub3_22 = null;
		Static94.anIntArray544 = null;
		Static84.aClass45_29 = null;
		Static48.aClass2_Sub2_Sub2_Sub3_12 = null;
		Static38.aClass45_20 = null;
		Static1.aClass45_1 = null;
		Static31.aClass2_Sub2_Sub2_Sub3_9 = null;
		anIntArray3 = null;
		Static28.aClass45_15 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_17 = null;
		Static67.anIntArray407 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_19 = null;
		Static72.aClass45_28 = null;
		Static24.aClass45_12 = null;
		Static41.aClass45_21 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		Static11.aClass45_6 = null;
		Static46.aClass2_Sub2_Sub2_Sub3_10 = null;
		Static73.aClass2_Sub2_Sub2_Sub3Array10 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_18 = null;
		client.imageMapback = null;
		Static63.aClass45_8 = null;
		Static30.aClass2_Sub2_Sub2_Sub3_7 = null;
		Static56.aClass45_23 = null;
		Static4.aClass45_4 = null;
		Static48.aClass2_Sub2_Sub2_Sub3_13 = null;
		Static96.anIntArray548 = null;
		Static46.aClass2_Sub2_Sub2_Sub3_11 = null;
		Static76.anIntArray431 = null;
		Static75.aClass2_Sub2_Sub2_Sub3_20 = null;
		client.areaSidebar = null;
		Static3.anIntArray4 = null;
		Static18.aClass45_9 = null;
		Static19.aClass45_10 = null;
		Static42.anIntArray225 = null;
		areaViewport = null;
		Static27.aClass45_13 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 62)
	public static void method19() {
		@Pc(15) int local15;
		for (@Pc(8) int local8 = -1; local8 < client.playerCount; local8++) {
			if (local8 == -1) {
				local15 = 2047;
			} else {
				local15 = client.playerIds[local8];
			}
			@Pc(25) PlayerEntity local25 = client.players[local15];
			if (local25 != null && local25.anInt2294 > 0) {
				local25.anInt2294--;
				if (local25.anInt2294 == 0) {
					local25.aClass40_660 = null;
				}
			}
		}
		for (local15 = 0; local15 < client.npcCount; local15++) {
			@Pc(54) int local54 = client.npcIds[local15];
			@Pc(58) NpcEntity local58 = client.npcs[local54];
			if (local58 != null && local58.anInt2294 > 0) {
				local58.anInt2294--;
				if (local58.anInt2294 == 0) {
					local58.aClass40_660 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V", line = 128)
	public static void method20() {
		Static1.cacheIndex = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		aClass45_3 = null;
		LocType.aClass47_1 = null;
		JagString.aClass40_14 = null;
		areaViewport = null;
		JagString.aClass40_13 = null;
		client.npcs = null;
		client.tabInterfaceId = null;
		JagString.aClass40_15 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!o;", line = 150)
	public static JagString method21(@OriginalArg(0) int arg0) {
		return JagString.concatenate(new JagString[] { Static48.method859(arg0 >> 24 & 0xFF), JagString.aClass40_557, Static48.method859(arg0 >> 16 & 0xFF), JagString.aClass40_557, Static48.method859(arg0 >> 8 & 0xFF), JagString.aClass40_557, Static48.method859(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 1919)
	public static void method23() {
		Static1.aBoolean23 = true;
		Static85.method1486();
		if (client.showSocialInput) {
			client.fondBold12.method566(JagString.aClass40_453, 239, 40, 0);
			client.fondBold12.method566(JagString.concatenate(new JagString[] { client.socialInput, JagString.aClass40_116 }), 239, 60, 128);
		} else if (Static1.anInt2399 == 1) {
			client.fondBold12.method566(JagString.aClass40_60, 239, 40, 0);
			client.fondBold12.method566(JagString.concatenate(new JagString[] { JagString.aClass40_444, JagString.aClass40_116 }), 239, 60, 128);
		} else if (Static1.anInt2399 == 2) {
			client.fondBold12.method566(JagString.aClass40_695, 239, 40, 0);
			client.fondBold12.method566(JagString.concatenate(new JagString[] { JagString.aClass40_444, JagString.aClass40_116 }), 239, 60, 128);
		} else {
			@Pc(68) PixFont local68;
			@Pc(75) int local75;
			@Pc(87) int local87;
			if (Static1.anInt2399 == 3) {
				if (JagString.aClass40_444 != JagString.aClass40_452) {
					Static13.method264(JagString.aClass40_444);
					JagString.aClass40_452 = JagString.aClass40_444;
				}
				local68 = client.fontPlain12;
				Static25.method1613(0, 0, 463, 77);
				for (local75 = 0; local75 < Static1.anInt2066; local75++) {
					local87 = local75 * 14 + 18 - Static1.anInt53;
					if (local87 > 0 && local87 < 110) {
						local68.method566(Static1.aClass40Array7[local75], 239, local87, 0);
					}
				}
				Static25.method1614();
				if (Static1.anInt2066 > 5) {
					Static35.method711(77, 463, Static1.anInt53, 0, Static1.anInt2066 * 14 + 7);
				}
				if (JagString.aClass40_444.length() == 0) {
					client.fondBold12.method566(JagString.aClass40_159, 239, 40, 255);
				} else if (Static1.anInt2066 == 0) {
					client.fondBold12.method566(JagString.aClass40_569, 239, 40, 0);
				}
				local68.method566(JagString.concatenate(new JagString[] { JagString.aClass40_444, JagString.aClass40_116 }), 239, 90, 0);
				Static25.method1603(0, 77, 479, 0);
			} else if (client.modalMessage == null) {
				@Pc(781) boolean local781;
				if (client.chatInterfaceId != -1) {
					local781 = client.drawInterface(0, -1, client.chatInterfaceId, 2, 0, 96, 0, 479);
					if (!local781) {
						client.redrawChatback = true;
					}
				} else if (client.stickyChatInterfaceId == -1) {
					local75 = 0;
					local68 = client.fontPlain12;
					Static25.method1613(0, 0, 463, 77);
					for (local87 = 0; local87 < 100; local87++) {
						if (client.aClass40Array30[local87] != null) {
							@Pc(218) int local218 = Static1.anInt799 + 70 - local75 * 14;
							@Pc(222) int local222 = client.messageType[local87];
							@Pc(224) byte local224 = 0;
							@Pc(228) JagString local228 = client.aClass40Array40[local87];
							if (local228 != null && local228.method1168(JagString.aClass40_323)) {
								local228 = local228.method1185(5);
								local224 = 1;
							}
							if (local228 != null && local228.method1168(JagString.aClass40_622)) {
								local228 = local228.method1185(5);
								local224 = 2;
							}
							if (local222 == 0) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.drawString(client.aClass40Array30[local87], 4, local218, 0);
								}
							}
							@Pc(306) int local306;
							if ((local222 == 1 || local222 == 2) && (local222 == 1 || Static1.anInt583 == 0 || Static1.anInt583 == 1 && Static36.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local306 = 4;
									if (local224 == 1) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(4, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.drawString(JagString.concatenate(new JagString[] { local228, JagString.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.drawString(client.aClass40Array30[local87], local306, local218, 255);
								}
							}
							if ((local222 == 3 || local222 == 7) && Static1.anInt2473 == 0 && (local222 == 7 || Static1.anInt2515 == 0 || Static1.anInt2515 == 1 && Static36.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.drawString(JagString.aClass40_340, 4, local218, 0);
									local306 = local68.method568(JagString.aClass40_564) + 4;
									if (local224 == 1) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(local306, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.drawString(JagString.concatenate(new JagString[] { local228, JagString.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.drawString(client.aClass40Array30[local87], local306, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 4 && (Static1.anInt2491 == 0 || Static1.anInt2491 == 1 && Static36.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.drawString(JagString.concatenate(new JagString[] { local228, JagString.aClass40_716, client.aClass40Array30[local87] }), 4, local218, 8388736);
								}
							}
							if (local222 == 5 && Static1.anInt2473 == 0 && Static1.anInt2515 < 2) {
								if (local218 > 0 && local218 < 110) {
									local68.drawString(client.aClass40Array30[local87], 4, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 6 && Static1.anInt2473 == 0 && Static1.anInt2515 < 2) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.drawString(JagString.concatenate(new JagString[] { JagString.aClass40_690, local228, JagString.aClass40_673 }), 4, local218, 0);
									local68.drawString(client.aClass40Array30[local87], local68.method568(JagString.concatenate(new JagString[] { JagString.aClass40_690, local228 })) + 12, local218, 8388608);
								}
							}
							if (local222 == 8 && (Static1.anInt2491 == 0 || Static1.anInt2491 == 1 && Static36.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.drawString(JagString.concatenate(new JagString[] { local228, JagString.aClass40_716, client.aClass40Array30[local87] }), 4, local218, 8270336);
								}
								local75++;
							}
						}
					}
					Static25.method1614();
					Static1.anInt1506 = local75 * 14 + 7;
					if (Static1.anInt1506 < 78) {
						Static1.anInt1506 = 78;
					}
					Static35.method711(77, 463, Static1.anInt1506 - Static1.anInt799 - 77, 0, Static1.anInt1506);
					@Pc(709) JagString local709;
					if (client.localPlayer == null || client.localPlayer.name == null) {
						local709 = JagString.aClass40_591;
					} else {
						local709 = client.localPlayer.name;
					}
					local68.drawString(JagString.concatenate(new JagString[] { local709, JagString.aClass40_673 }), 4, 90, 0);
					local68.drawString(JagString.concatenate(new JagString[] { JagString.aClass40_451, JagString.aClass40_116 }), local68.method568(JagString.concatenate(new JagString[] { local709, JagString.aClass40_4 })) + 6, 90, 255);
					Static25.method1603(0, 77, 479, 0);
				} else {
					local781 = client.drawInterface(0, -1, client.stickyChatInterfaceId, 3, 0, 96, 0, 479);
					if (!local781) {
						client.redrawChatback = true;
					}
				}
			} else {
				client.fondBold12.method566(client.modalMessage, 239, 40, 0);
				client.fondBold12.method566(JagString.aClass40_252, 239, 60, 128);
			}
		}
		if (client.menuVisible && client.menuArea == 2) {
			client.drawMenu();
		}
		Static4.method83(client.graphics);
	}
}

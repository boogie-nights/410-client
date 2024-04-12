package jagex2;

import java.io.IOException;

import jagex2.config.ComType;
import jagex2.config.ObjType;
import jagex2.dash3d.entity.NpcEntity;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.dash3d.type.LocTemporary;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixMap;
import jagex2.graphics.PixFont;
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

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[Lclient!ua;")
	public static NpcEntity[] npcs = new NpcEntity[16384];

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_13 = Static13.method257("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
	public static int[] anIntArray2 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt34 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!o;")
	private static Class40 textWishesToTradeWithYou = Static13.method257("wishes to trade with you)3");

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[Lclient!d;")
	public static Class14[] aClass14Array1 = new Class14[12];

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!qc;")
	public static LruCache aClass47_1 = new LruCache(30);

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_15 = Static13.method257("Your account has been disabled)3");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method18() {
		if (!Static79.aBoolean152) {
			return;
		}
		Static103.aClass2_Sub2_Sub2_Sub3_24 = null;
		Static3.aClass2_Sub2_Sub2_Sub3_2 = null;
		Static102.aClass2_Sub2_Sub2_Sub3_23 = null;
		Static79.aBoolean152 = false;
		Static97.aClass2_Sub2_Sub2_Sub3_22 = null;
		Static102.compassMaskLineOffsets = null;
		Static92.aClass45_29 = null;
		Static53.aClass2_Sub2_Sub2_Sub3_12 = null;
		Static41.aClass45_20 = null;
		Static1.aClass45_1 = null;
		Static33.aClass2_Sub2_Sub2_Sub3_9 = null;
		anIntArray3 = null;
		Static30.aClass45_15 = null;
		Static15.aClass2_Sub2_Sub2_Sub3_17 = null;
		Static73.anIntArray407 = null;
		Static15.aClass2_Sub2_Sub2_Sub3_19 = null;
		Static80.aClass45_28 = null;
		Static25.aClass45_12 = null;
		Static44.aClass45_21 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		Static12.aClass45_6 = null;
		Static51.aClass2_Sub2_Sub2_Sub3_10 = null;
		Static81.aClass2_Sub2_Sub2_Sub3Array10 = null;
		Static15.aClass2_Sub2_Sub2_Sub3_18 = null;
		Static17.imageMapBack = null;
		Static68.aClass45_8 = null;
		Static32.aClass2_Sub2_Sub2_Sub3_7 = null;
		Static61.areaMapBack = null;
		Static4.aClass45_4 = null;
		Static53.aClass2_Sub2_Sub2_Sub3_13 = null;
		Static104.anIntArray548 = null;
		Static51.aClass2_Sub2_Sub2_Sub3_11 = null;
		Static84.anIntArray431 = null;
		Static83.aClass2_Sub2_Sub2_Sub3_20 = null;
		Static7.areaSidebar = null;
		Static3.anIntArray4 = null;
		Static19.aClass45_9 = null;
		Static20.aClass45_10 = null;
		Static45.compassMaskLineLengths = null;
		areaViewport = null;
		Static29.aClass45_13 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method19() {
		@Pc(15) int local15;
		for (@Pc(8) int local8 = -1; local8 < Static88.playerCount; local8++) {
			if (local8 == -1) {
				local15 = 2047;
			} else {
				local15 = Static73.playerIds[local8];
			}
			@Pc(25) PlayerEntity local25 = Static100.players[local15];
			if (local25 != null && local25.anInt2294 > 0) {
				local25.anInt2294--;
				if (local25.anInt2294 == 0) {
					local25.aClass40_660 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static73.anInt1800; local15++) {
			@Pc(54) int local54 = Static63.anIntArray326[local15];
			@Pc(58) NpcEntity local58 = npcs[local54];
			if (local58 != null && local58.anInt2294 > 0) {
				local58.anInt2294--;
				if (local58.anInt2294 == 0) {
					local58.aClass40_660 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
	public static void method20() {
		aClass14Array1 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		aClass45_3 = null;
		aClass47_1 = null;
		textWishesToTradeWithYou = null;
		areaViewport = null;
		aClass40_13 = null;
		npcs = null;
		anIntArray2 = null;
		aClass40_15 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!o;")
	public static Class40 method21(@OriginalArg(0) int arg0) {
		return Static80.method1334(new Class40[] { Static53.method859(arg0 >> 24 & 0xFF), Static80.aClass40_557, Static53.method859(arg0 >> 16 & 0xFF), Static80.aClass40_557, Static53.method859(arg0 >> 8 & 0xFF), Static80.aClass40_557, Static53.method859(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	public static boolean read() {
		if (Static70.stream == null) {
			return false;
		}
		@Pc(226) int local226;
		try {
			@Pc(13) int available = Static70.stream.available();
			if (available == 0) {
				return false;
			}
			if (Static88.packetType == -1) {
				available--;
				Static70.stream.read(0, 1, Static56.in.data);
				Static56.in.pos = 0;
				Static88.packetType = Static56.in.method1733();
				Static33.size = Static17.SERVERPROT_SIZES[Static88.packetType];
			}
			if (Static33.size == -1) {
				if (available <= 0) {
					return false;
				}
				Static70.stream.read(0, 1, Static56.in.data);
				Static33.size = Static56.in.data[0] & 0xFF;
				available--;
			}
			if (Static33.size == -2) {
				if (available <= 1) {
					return false;
				}
				Static70.stream.read(0, 2, Static56.in.data);
				available -= 2;
				Static56.in.pos = 0;
				Static33.size = Static56.in.g2();
			}
			if (available < Static33.size) {
				return false;
			}
			Static56.in.pos = 0;
			Static70.stream.read(0, Static33.size, Static56.in.data);
			Static7.anInt231 = 0;
			Static85.anInt1986 = Static97.anInt2352;
			Static97.anInt2352 = Static33.anInt788;
			Static33.anInt788 = Static88.packetType;
			@Pc(125) int local125;
			if (Static88.packetType == 224) {
				local125 = Static56.in.method1681();
				Static103.method1648(local125);
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = -1;
					Static33.redrawSidebar = true;
					Static22.aBoolean184 = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				if (Static85.anInt1994 != local125) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = local125;
				}
				Static20.aBoolean40 = false;
				Static73.redrawChatback = true;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 142) {
				Static95.anInt2237 = Static56.in.g1();
				Static91.anInt2138 = Static56.in.method1706();
				while (Static56.in.pos < Static33.size) {
					Static88.packetType = Static56.in.g1();
					Static3.readZonePacket();
				}
				Static88.packetType = -1;
				return true;
			}
			@Pc(230) int local230;
			@Pc(234) ComType local234;
			if (Static88.packetType == 7) {
				// IF_SETOBJECT
				int	com = Static56.in.method1732();
				int zoom = Static56.in.method1705();
				int objId = Static56.in.method1705();
				ComType comType = Static81.method1340(com);
				if (objId == 65535) {
					Static88.packetType = -1;
					comType.anInt1607 = 0;
					return true;
				}
				@Pc(248) ObjType obj = Static105.get(objId);
				comType.anInt1607 = 4;
				comType.xan = obj.xan2d;
				Static88.packetType = -1;
				comType.zoom = obj.zoom2d * 100 / zoom;
				comType.model = objId;
				comType.yan = obj.yan2d;
				return true;
			}
			if (Static88.packetType == 249) {
				Static34.anInt808 = Static56.in.method1681();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 157) {
				Static70.method1111(Static99.aClass7_2, Static33.size, Static56.in);
				Static88.packetType = -1;
				return true;
			}
			@Pc(355) int local355;
			@Pc(364) int local364;
			@Pc(359) int local359;
			@Pc(376) int local376;
			if (Static88.packetType == 215) {
				// CAM_MOVETO
				Static7.cutscene = true;
				Static79.anInt1867 = Static56.in.g1();
				Static80.anInt1914 = Static56.in.g1();
				Static83.anInt1963 = Static56.in.g2();
				Static22.anInt2586 = Static56.in.g1();
				Static75.cutsceneRotateAcceleration = Static56.in.g1();
				if (Static75.cutsceneRotateAcceleration >= 100) {
					local125 = Static79.anInt1867 * 128 + 64;
					local226 = Static80.anInt1914 * 128 + 64;
					local230 = Static86.method1383(Static1.currentLevel, local125, local226) - Static83.anInt1963;
					local355 = local125 - Static48.cameraX;
					local359 = local226 - Static15.cameraZ;
					local364 = local230 - Static81.cameraY;
					local376 = (int) Math.sqrt((double) (local355 * local355 + local359 * local359));
					Static35.cameraPitch = (int) (Math.atan2((double) local364, (double) local376) * 325.949D) & 0x7FF;
					Static27.cameraYaw = (int) (-325.949D * Math.atan2((double) local355, (double) local359)) & 0x7FF;
					if (Static35.cameraPitch < 128) {
						Static35.cameraPitch = 128;
					}
					if (Static35.cameraPitch > 383) {
						Static35.cameraPitch = 383;
					}
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 116) {
				// UPDATE_STAT
				Static33.redrawSidebar = true;
				int level = Static56.in.method1715();
				int xp = Static56.in.method1729();
				int stat = Static56.in.method1730();
				Static48.skillExperience[stat] = xp;
				Static94.skillLevel[stat] = level;
				Static59.skillBaseLevel[stat] = 1;
				for (int i = 0; i < 98; i++) {
					if (Class11.levelExperience[i] <= xp) {
						Static59.skillBaseLevel[stat] = i + 2;
					}
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 90) {
				// HINT_ARROW
				Static91.hintType = Static56.in.g1();
				if (Static91.hintType == 1) {
					Static85.hintNpc = Static56.in.g2();
				}
				if (Static91.hintType >= 2 && Static91.hintType <= 6) {
					if (Static91.hintType == 2) {
						Static19.hintOffsetX = 64;
						Static58.hintOffsetZ = 64;
					}
					if (Static91.hintType == 3) {
						Static58.hintOffsetZ = 64;
						Static19.hintOffsetX = 0;
					}
					if (Static91.hintType == 4) {
						Static19.hintOffsetX = 128;
						Static58.hintOffsetZ = 64;
					}
					if (Static91.hintType == 5) {
						Static58.hintOffsetZ = 0;
						Static19.hintOffsetX = 64;
					}
					if (Static91.hintType == 6) {
						Static58.hintOffsetZ = 128;
						Static19.hintOffsetX = 64;
					}
					Static91.hintType = 2;
					Static16.anInt410 = Static56.in.g2();
					Static83.anInt1952 = Static56.in.g2();
					Static80.hintHeight = Static56.in.g1();
				}
				if (Static91.hintType == 10) {
					Static97.hintPlayer = Static56.in.g2();
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 15) {
				local125 = Static56.in.method1729();
				local226 = Static56.in.method1693();
				local230 = Static56.in.method1719();
				local234 = Static81.method1340(local125);
				local234.anInt1588 = local234.anInt1616 + local226;
				local234.anInt1582 = local234.anInt1573 + local230;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 232) {
				// RESET_CLIENT_VARCACHE
				for (int i = 0; i < Static67.varps.length; i++) {
					if (Static54.varCache[i] != Static67.varps[i]) {
						Static67.varps[i] = Static54.varCache[i];
						Static22.updateVarp(i);
						Static33.redrawSidebar = true;
					}
				}
				Static88.packetType = -1;
				return true;
			}
			@Pc(650) long local650;
			@Pc(655) long local655;
			if (Static88.packetType == 103) {
				local650 = Static56.in.g8();
				local655 = Static56.in.g2();
				@Pc(660) long local660 = (long) Static56.in.method1718();
				local376 = Static56.in.g1();
				@Pc(671) long local671 = (local655 << 32) + local660;
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < 100; local675++) {
					if (local671 == Static35.aLongArray3[local675]) {
						local673 = true;
						break;
					}
				}
				if (local376 <= 1) {
					for (@Pc(702) int local702 = 0; local702 < Static99.ignoreCount; local702++) {
						if (Static84.ignoreName37[local702] == local650) {
							local673 = true;
							break;
						}
					}
				}
				if (!local673 && Static19.overrideChat == 0) {
					Static35.aLongArray3[Static97.privateMessageCount] = local671;
					Static97.privateMessageCount = (Static97.privateMessageCount + 1) % 100;
					@Pc(738) Class40 local738 = Static7.method192(Static56.in).method1166();
					if (local376 == 2 || local376 == 3) {
						Static58.method989(7, Static80.method1334(new Class40[] { Static92.aClass40_622, Static48.method819(local650).method1167() }), local738);
					} else if (local376 == 1) {
						Static58.method989(7, Static80.method1334(new Class40[] { Static42.aClass40_323, Static48.method819(local650).method1167() }), local738);
					} else {
						Static58.method989(3, Static48.method819(local650).method1167(), local738);
					}
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 216) {
				Static62.selectedTab = Static56.in.method1715();
				Static33.redrawSidebar = true;
				Static22.aBoolean184 = true;
				Static88.packetType = -1;
				return true;
			}
			@Pc(836) ComType local836;
			if (Static88.packetType == 84) {
				local125 = Static56.in.method1729();
				local836 = Static81.method1340(local125);
				local836.anInt1607 = 3;
				local836.model = Static88.localPlayer.aClass33_2.method1006();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 74) {
				// UPDATE_RUNENERGY
				if (Static62.selectedTab == 12) {
					Static33.redrawSidebar = true;
				}
				Static93.energy = Static56.in.g1();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 162) {
				// CAM_LOOKAT
				Static7.cutscene = true;
				Static76.anInt2149 = Static56.in.g1();
				Static36.anInt840 = Static56.in.g1();
				Static49.anInt2259 = Static56.in.g2();
				Static19.anInt439 = Static56.in.g1();
				Static56.anInt2325 = Static56.in.g1();
				if (Static56.anInt2325 >= 100) {
					Static48.cameraX = Static76.anInt2149 * 128 + 64;
					Static15.cameraZ = Static36.anInt840 * 128 + 64;
					Static81.cameraY = Static86.method1383(Static1.currentLevel, Static48.cameraX, Static15.cameraZ) - Static49.anInt2259;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 108) {
				// RESET_ANIMS
				for (int i = 0; i < Static100.players.length; i++) {
					if (Static100.players[i] != null) {
						Static100.players[i].primarySeqId = -1;
					}
				}
				for (int i = 0; i < npcs.length; i++) {
					if (npcs[i] != null) {
						npcs[i].primarySeqId = -1;
					}
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 126) {
				Static99.method58(true);
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 32) {
				Static101.anInt2399 = 1;
				Static88.packetType = -1;
				Static73.redrawChatback = true;
				Static61.aClass40_444 = Static61.aClass40_445;
				Static74.aBoolean146 = false;
				return true;
			}
			if (Static88.packetType == 94) {
				local125 = Static56.in.method1693();
				if (local125 != Static38.anInt980) {
					Static83.method1350(Static38.anInt980);
					Static38.anInt980 = local125;
				}
				Static88.packetType = -1;
				Static73.redrawChatback = true;
				return true;
			}
			if (Static88.packetType == 120) {
				// UPDATE_RUNWEIGHT
				if (Static62.selectedTab == 12) {
					Static33.redrawSidebar = true;
				}
				Static74.weightCarried = Static56.in.g2b();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 70) {
				local125 = Static56.in.method1705();
				if (local125 == 65535) {
					local125 = -1;
				}
				if (local125 == -1 && Static20.anInt470 == 0) {
					Static94.method1497();
				} else if (local125 != -1 && local125 != Static84.anInt1977 && Static7.anInt239 != 0 && Static20.anInt470 == 0) {
					Static94.method1491(local125, Static7.anInt239, 0, Static85.aClass5_Sub1_17);
				}
				Static84.anInt1977 = local125;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 62) {
				local125 = Static56.in.method1718();
				local226 = Static56.in.method1705();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Static7.anInt239 != 0 && local226 != -1) {
					Static94.method1499(1, local226, Static74.aClass5_Sub1_13, Static7.anInt239);
					Static20.anInt470 = local125;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 17) {
				// CAM_RESET
				Static7.cutscene = false;
				for (int i = 0; i < 5; i++) {
					Static98.cameraModifierEnabled[i] = false;
				}
				Static88.packetType = -1;
				return true;
			}
			@Pc(1170) ComType local1170;
			if (Static88.packetType == 241) {
				local125 = Static56.in.method1710();
				local226 = Static56.in.method1714();
				local1170 = Static81.method1340(local125);
				Static88.packetType = -1;
				local1170.model = local226;
				local1170.anInt1607 = 2;
				return true;
			}
			if (Static88.packetType == 97) {
				local125 = Static56.in.g2();
				local226 = Static56.in.method1705();
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
					Static73.redrawChatback = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != local226) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = local226;
				}
				if (Static66.anInt1654 != local125) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = local125;
				}
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.redrawChatback = true;
				}
				Static88.packetType = -1;
				Static33.redrawSidebar = true;
				Static22.aBoolean184 = true;
				Static20.aBoolean40 = false;
				return true;
			}
			if (Static88.packetType == 153) {
				Static83.anInt1960 = Static56.in.method1714();
				Static56.in.g2();
				Static56.anInt2272 = Static56.in.method1705();
				Static66.anInt1664 = Static56.in.method1705();
				Static51.anInt1167 = Static56.in.method1681();
				Static58.anInt1494 = Static56.in.method1714();
				Static37.anInt941 = Static56.in.g1();
				Static51.anInt1163 = Static56.in.method1681();
				Static56.in.method1714();
				Static86.anInt2035 = Static56.in.method1705();
				Static58.anInt1487 = Static56.in.method1710();
				Static61.aClass48_6 = Static99.aClass7_2.method199(Static58.anInt1487);
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 11) {
				// SYNTH_SOUND
				local125 = Static56.in.g2();
				int loop = Static56.in.g1();
				local230 = Static56.in.g2();
				if (Static98.wavevol != 0 && loop != 0 && Static4.waveCount < 50) {
					Static96.anIntArray497[Static4.waveCount] = local125;
					Static13.waveLoops[Static4.waveCount] = loop;
					Static5.anIntArray36[Static4.waveCount] = local230;
					Static75.aClass43Array1[Static4.waveCount] = null;
					Static4.waveCount++;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 122) {
				Static99.method58(false);
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 136) {
				// UPDATE_INV_STOP_TRANSMIT
				int comId = Static56.in.g4();
				ComType inv = Static81.method1340(comId);
				for (int i = 0; i < inv.invSlotObjId.length; i++) {
					inv.invSlotObjId[i] = -1;
					inv.invSlotObjId[i] = 0;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 28) {
				// TUTORIAL_FLASHSIDE
				Static103.flashingTab = Static56.in.method1706();
				Static88.packetType = -1;
				if (Static62.selectedTab == Static103.flashingTab) {
					Static33.redrawSidebar = true;
					if (Static103.flashingTab == 3) {
						Static62.selectedTab = 1;
					} else {
						Static62.selectedTab = 3;
					}
				}
				return true;
			}
			if (Static88.packetType == 170) {
				// PLAYER_INFO
				Static21.readPlayerInfo();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 250) {
				// IF_SETHIDE
				@Pc(1474) boolean hide = Static56.in.g1() == 1;
				int comId = Static56.in.g4();
				ComType com = Static81.method1340(comId);
				com.hide = hide;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 155) {
				// UPDATE_FRIENDLIST
				long username = Static56.in.g8();
				int world = Static56.in.g2();
				@Pc(1508) Class40 displayName = Static48.method819(username).method1167();
				for (int i = 0; i < Static22.friendCount; i++) {
					if (username == Static21.friendName37[i]) {
						if (world != Static62.friendWorld[i]) {
							Static62.friendWorld[i] = world;
							Static33.redrawSidebar = true;
							if (world > 0) {
								Static58.method989(5, Static61.aClass40_445, Static80.method1334(new Class40[] { displayName, Static72.textHasLoggedIn}));
							}
							if (world == 0) {
								Static58.method989(5, Static61.aClass40_445, Static80.method1334(new Class40[] { displayName, Static1.textHasLoggedOut}));
							}
						}
						displayName = null;
						break;
					}
				}
				if (displayName != null && Static22.friendCount < 200) {
					Static21.friendName37[Static22.friendCount] = username;
					Static51.friendName[Static22.friendCount] = displayName;
					Static62.friendWorld[Static22.friendCount] = world;
					Static22.friendCount++;
					Static33.redrawSidebar = true;
				}

				@Pc(1581) boolean sorted = false;
				while (!sorted) {
					sorted = true;
					for (int i = 0; i < Static22.friendCount - 1; i++) {
						if (Static4.nodeId != Static62.friendWorld[i] && Static62.friendWorld[i + 1] == Static4.nodeId || Static62.friendWorld[i] == 0 && Static62.friendWorld[i + 1] != 0) {
							sorted = false;
							@Pc(1649) int oldWorld = Static62.friendWorld[i];
							Static62.friendWorld[i] = Static62.friendWorld[i + 1];
							Static62.friendWorld[i + 1] = oldWorld;

							@Pc(1667) Class40 oldName = Static51.friendName[i];
							Static51.friendName[i] = Static51.friendName[i + 1];
							Static51.friendName[i + 1] = oldName;

							@Pc(1685) long oldName37 = Static21.friendName37[i];
							Static21.friendName37[i] = Static21.friendName37[i + 1];
							Static21.friendName37[i + 1] = oldName37;
							Static33.redrawSidebar = true;
						}
					}
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 197) {
				// LOGOUT
				Static61.logout();
				Static88.packetType = -1;
				return false;
			}
			if (Static88.packetType == 36) {
				local125 = Static56.in.method1705();
				local226 = Static56.in.method1710();
				local1170 = Static81.method1340(local226);
				if (local1170 != null && local1170.anInt1613 == 0) {
					if (local125 < 0) {
						local125 = 0;
					}
					if (local125 > local1170.scroll - local1170.height) {
						local125 = local1170.scroll - local1170.height;
					}
					local1170.anInt1587 = local125;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 26) {
				Static88.packetType = -1;
				Static61.aClass40_444 = Static61.aClass40_445;
				Static101.anInt2399 = 2;
				Static74.aBoolean146 = false;
				Static73.redrawChatback = true;
				return true;
			}
			@Pc(1801) Class40 local1801;
			@Pc(1822) Class40 local1822;
			if (Static88.packetType == 3) {
				local1801 = Static56.in.method1721();
				@Pc(1813) boolean local1813;
				if (local1801.method1195(Static105.textTradeReq)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(Static97.aClass40_673), 0);
					local655 = local1822.toBase37();
					for (int i = 0; i < Static99.ignoreCount; i++) {
						if (local655 == Static84.ignoreName37[i]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static19.overrideChat == 0) {
						Static58.method989(4, local1822, textWishesToTradeWithYou);
					}
				} else if (local1801.method1195(Static49.aClass40_654)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(Static97.aClass40_673), 0);
					local655 = local1822.toBase37();
					for (local359 = 0; local359 < Static99.ignoreCount; local359++) {
						if (Static84.ignoreName37[local359] == local655) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static19.overrideChat == 0) {
						Static58.method989(8, local1822, Static102.aClass40_708);
					}
				} else if (local1801.method1195(Static79.aClass40_542)) {
					local1822 = local1801.method1180(local1801.method1200(Static97.aClass40_673), 0);
					local655 = local1822.toBase37();
					local1813 = false;
					for (local359 = 0; local359 < Static99.ignoreCount; local359++) {
						if (local655 == Static84.ignoreName37[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static19.overrideChat == 0) {
						@Pc(1923) Class40 local1923 = local1801.method1180(local1801.method1169() - 9, local1801.method1200(Static97.aClass40_673) + 1);
						Static58.method989(8, local1822, local1923);
					}
				} else {
					Static58.method989(0, Static61.aClass40_445, local1801);
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 85) {
				local125 = Static56.in.method1706();
				local1822 = Static56.in.method1721();
				local230 = Static56.in.method1730();
				if (local230 >= 1 && local230 <= 5) {
					if (local1822.method1199(Static52.aClass40_359)) {
						local1822 = null;
					}
					Static13.aClass40Array6[local230 - 1] = local1822;
					Static46.aBooleanArray41[local230 - 1] = local125 == 0;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 110) {
				Static94.method1495();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 128) {
				// UPDATE_INV_FULL
				Static33.redrawSidebar = true;
				int com = Static56.in.g4();
				ComType inv = Static81.method1340(com);
				int size = Static56.in.g2();
				for (int i = 0; i < size; i++) {
					int count = Static56.in.method1706();
					if (count == 255) {
						count = Static56.in.g4();
					}
					inv.invSlotObjId[i] = Static56.in.method1714();
					inv.invSlotObjCount[i] = count;
				}
				for (int i = size; i < inv.invSlotObjId.length; i++) {
					inv.invSlotObjId[i] = 0;
					inv.invSlotObjCount[i] = 0;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 133) {
				local125 = Static56.in.method1729();
				local226 = Static56.in.method1714();
				local1170 = Static81.method1340(local125);
				Static88.packetType = -1;
				local1170.anInt1607 = 1;
				local1170.model = local226;
				return true;
			}
			if (Static88.packetType == 54) {
				// UPDATE_IGNORELIST
				Static99.ignoreCount = Static33.size / 8;
				for (int i = 0; i < Static99.ignoreCount; i++) {
					Static84.ignoreName37[i] = Static56.in.g8();
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 38) {
				// UPDATE_REBOOT_TIMER
				Static84.systemUpdateTimer = Static56.in.method1714() * 30;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 66) {
				Static96.anInt2328 = Static56.in.g1();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 118 || Static88.packetType == 63 || Static88.packetType == 21 || Static88.packetType == 46 || Static88.packetType == 135 || Static88.packetType == 69 || Static88.packetType == 221 || Static88.packetType == 56 || Static88.packetType == 129 || Static88.packetType == 35 || Static88.packetType == 244) {
				// ZONE_PROTOCOL
				Static3.readZonePacket();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 195) {
				local125 = Static56.in.method1681();
				Static103.method1648(local125);
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = -1;
					Static22.aBoolean184 = true;
					Static33.redrawSidebar = true;
				}
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
					Static73.redrawChatback = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != local125) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = local125;
				}
				Static20.aBoolean40 = false;
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.redrawChatback = true;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 144) {
				Static91.anInt2138 = Static56.in.method1730();
				Static95.anInt2237 = Static56.in.method1715();
				for (int x = Static95.anInt2237; x < Static95.anInt2237 + 8; x++) {
					for (int z = Static91.anInt2138; z < Static91.anInt2138 + 8; z++) {
						if (Static91.levelObjStacks[Static1.currentLevel][x][z] != null) {
							Static91.levelObjStacks[Static1.currentLevel][x][z] = null;
							Static83.method1356(z, x);
						}
					}
				}
				for (@Pc(2420) LocTemporary loc = (LocTemporary) Static92.spawnedLocations.peekFront(); loc != null; loc = (LocTemporary) Static92.spawnedLocations.prev()) {
					if (Static95.anInt2237 <= loc.x && loc.x < Static95.anInt2237 + 8 && loc.z >= Static91.anInt2138 && Static91.anInt2138 + 8 > loc.z && loc.level == Static1.currentLevel) {
						loc.anInt826 = 0;
					}
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 239) {
				local125 = Static56.in.method1723();
				if (local125 >= 0) {
					Static103.method1648(local125);
				}
				if (local125 != Static3.anInt51) {
					Static83.method1350(Static3.anInt51);
					Static3.anInt51 = local125;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 202) {
				// IF_SETCOLOUR
				int com = Static56.in.method1732();
				int color = Static56.in.method1714();
				int r = color >> 10 & 0x1F;
				int g = color >> 5 & 0x1F;
				int b = color & 0x1F;
				@Pc(2530) ComType compType = Static81.method1340(com);
				Static88.packetType = -1;
				compType.colour = (g << 11) + (r << 19) + (b << 3);
				return true;
			}
			if (Static88.packetType == 243) {
				for (int i = 0; i < Static59.anInt1505; i++) {
					@Pc(2561) Class2_Sub2_Sub11 local2561 = Static98.method1568(i);
					if (local2561 != null && local2561.anInt1076 == 0) {
						Static54.varCache[i] = 0;
						Static67.varps[i] = 0;
					}
				}
				Static33.redrawSidebar = true;
				Static88.packetType = -1;
				if (Static38.anInt980 != -1) {
					Static73.redrawChatback = true;
				}
				return true;
			}
			if (Static88.packetType == 181) {
				Static107.anInt2505 = Static56.in.g1();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 180) {
				// CHAT_FILTER_SETTINGS
				Static23.publicChatSetting = Static56.in.g1();
				Static104.privateChatSetting = Static56.in.g1();
				Static103.tradeChatSetting = Static56.in.g1();
				Static73.redrawChatback = true;
				Static88.packetType = -1;
				Static52.redrawPrivacySettings = true;
				return true;
			}
			if (Static88.packetType == 121) {
				// UPDATE_MAP_FLAG
				Static88.packetType = -1;
				Static38.flagSceneTileX = 0;
				return true;
			}
			if (Static88.packetType == 53) {
				local1801 = Static56.in.method1721();
				local226 = Static56.in.method1732();
				local1170 = Static81.method1340(local226);
				local1170.text = local1801;
				if (local226 >> 16 == anIntArray2[Static62.selectedTab]) {
					Static33.redrawSidebar = true;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 45) {
				// UPDATE_INV_PARTIAL
				Static33.redrawSidebar = true;
				int com = Static56.in.g4();
				ComType inv = Static81.method1340(com);
				while (Static33.size > Static56.in.pos) {
					int slot = Static56.in.gsmarts();
					int id = Static56.in.g2();
					int count = Static56.in.g1();
					if (count == 255) {
						count = Static56.in.g4();
					}
					if (slot >= 0 && slot < inv.invSlotObjId.length) {
						inv.invSlotObjId[slot] = id;
						inv.invSlotObjCount[slot] = count;
					}
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 58) {
				local125 = Static56.in.method1681();
				local226 = Static56.in.method1705();
				local230 = Static56.in.method1729();
				local355 = Static56.in.method1705();
				@Pc(2761) ComType local2761 = Static81.method1340(local230);
				local2761.xan = local125;
				Static88.packetType = -1;
				local2761.zoom = local226;
				local2761.yan = local355;
				return true;
			}
			if (Static88.packetType == 24) {
				local125 = Static56.in.method1714();
				local226 = Static56.in.method1705();
				local230 = Static56.in.method1710();
				local234 = Static81.method1340(local230);
				local234.anInt1617 = (local125 << 16) + local226;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 25) {
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static33.redrawSidebar = true;
					Static66.anInt1654 = -1;
					Static22.aBoolean184 = true;
				}
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
					Static73.redrawChatback = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				Static88.packetType = -1;
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.redrawChatback = true;
				}
				Static20.aBoolean40 = false;
				return true;
			}
			if (Static88.packetType == 252) {
				local125 = Static56.in.method1706();
				local226 = Static56.in.method1714();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (anIntArray2[local125] != local226) {
					Static83.method1350(anIntArray2[local125]);
					anIntArray2[local125] = local226;
				}
				Static33.redrawSidebar = true;
				Static22.aBoolean184 = true;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 203) {
				Static42.anInt1038 = Static56.in.g1();
				Static33.redrawSidebar = true;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 71) {
				local650 = Static56.in.g8();
				@Pc(2944) Class40 local2944 = Static7.method192(Static56.in).method1166();
				Static58.method989(6, Static48.method819(local650).method1167(), local2944);
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 163) {
				local125 = Static56.in.method1681();
				local226 = Static56.in.method1714();
				Static103.method1648(local226);
				if (local125 != -1) {
					Static103.method1648(local125);
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = -1;
				}
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
				}
				if (Static84.anInt1971 != local226) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = local226;
					Static7.method187(35);
				}
				if (local226 != Static93.anInt2175) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = local125;
				}
				Static20.aBoolean40 = false;
				Static88.packetType = -1;
				Static101.anInt2399 = 0;
				return true;
			}
			if (Static88.packetType == 80) {
				local125 = Static56.in.g4();
				local226 = Static56.in.g2();
				Static54.varCache[local226] = local125;
				if (local125 != Static67.varps[local226]) {
					Static67.varps[local226] = local125;
					Static22.updateVarp(local226);
					if (Static38.anInt980 != -1) {
						Static73.redrawChatback = true;
					}
					Static33.redrawSidebar = true;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 223) {
				Static91.anInt2138 = Static56.in.method1715();
				Static95.anInt2237 = Static56.in.g1();
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 102) {
				local125 = Static56.in.method1681();
				Static103.method1648(local125);
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static73.redrawChatback = true;
					Static85.anInt1994 = -1;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				if (local125 != Static66.anInt1654) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = local125;
				}
				Static22.aBoolean184 = true;
				Static20.aBoolean40 = false;
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.redrawChatback = true;
				}
				Static88.packetType = -1;
				Static33.redrawSidebar = true;
				return true;
			}
			if (Static88.packetType == 194) {
				local125 = Static56.in.method1681();
				@Pc(3171) byte local3171 = Static56.in.method1690();
				Static54.varCache[local125] = local3171;
				if (local3171 != Static67.varps[local125]) {
					Static67.varps[local125] = local3171;
					Static22.updateVarp(local125);
					if (Static38.anInt980 != -1) {
						Static73.redrawChatback = true;
					}
					Static33.redrawSidebar = true;
				}
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 255) {
				local125 = Static56.in.g1();
				local226 = Static56.in.g1();
				local230 = Static56.in.g1();
				local355 = Static56.in.g1();
				Static98.cameraModifierEnabled[local125] = true;
				Static20.anIntArray93[local125] = local226;
				Static36.anIntArray164[local125] = local230;
				Static35.anIntArray159[local125] = local355;
				Static79.anIntArray415[local125] = 0;
				Static88.packetType = -1;
				return true;
			}
			if (Static88.packetType == 213) {
				local125 = Static56.in.method1729();
				local226 = Static56.in.method1719();
				local1170 = Static81.method1340(local125);
				Static88.packetType = -1;
				if (local226 != local1170.anInt1574 || local226 == -1) {
					local1170.anInt1569 = 0;
					local1170.anInt1574 = local226;
					local1170.anInt1593 = 0;
				}
				return true;
			}
			Static38.method727("T1 - " + Static88.packetType + "," + Static97.anInt2352 + "," + Static85.anInt1986 + " - " + Static33.size, null);
			Static61.logout();
		} catch (@Pc(3308) IOException local3308) {
			Static34.method626();
		} catch (@Pc(3312) Exception local3312) {
			@Pc(3352) String local3352 = "T2 - " + Static88.packetType + "," + Static97.anInt2352 + "," + Static85.anInt1986 + " - " + Static33.size + "," + (Static88.localPlayer.pathTileX[0] + Static87.anInt2058) + "," + (Static88.localPlayer.pathTileZ[0] + Static30.anInt725) + " - ";
			for (local226 = 0; local226 < Static33.size && local226 < 50; local226++) {
				local3352 = local3352 + Static56.in.data[local226] + ",";
			}
			Static38.method727(local3352, local3312);
			Static61.logout();
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method23() {
		Static7.aBoolean23 = true;
		Static93.method1486();
		if (Static74.aBoolean146) {
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static61.aClass40_453, 239, 40, 0);
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static80.method1334(new Class40[] { Static61.aClass40_447, Static17.aClass40_116 }), 239, 60, 128);
		} else if (Static101.anInt2399 == 1) {
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static7.aClass40_60, 239, 40, 0);
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static80.method1334(new Class40[] { Static61.aClass40_444, Static17.aClass40_116 }), 239, 60, 128);
		} else if (Static101.anInt2399 == 2) {
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static101.aClass40_695, 239, 40, 0);
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static80.method1334(new Class40[] { Static61.aClass40_444, Static17.aClass40_116 }), 239, 60, 128);
		} else {
			@Pc(68) PixFont local68;
			@Pc(75) int local75;
			@Pc(87) int local87;
			if (Static101.anInt2399 == 3) {
				if (Static61.aClass40_444 != Static61.aClass40_452) {
					Static14.method264(Static61.aClass40_444);
					Static61.aClass40_452 = Static61.aClass40_444;
				}
				local68 = Static103.aClass2_Sub2_Sub2_Sub2_5;
				Static26.method1613(0, 0, 463, 77);
				for (local75 = 0; local75 < Static87.anInt2066; local75++) {
					local87 = local75 * 14 + 18 - Static3.anInt53;
					if (local87 > 0 && local87 < 110) {
						local68.method566(Static17.aClass40Array7[local75], 239, local87, 0);
					}
				}
				Static26.method1614();
				if (Static87.anInt2066 > 5) {
					Static37.method711(77, 463, Static3.anInt53, 0, Static87.anInt2066 * 14 + 7);
				}
				if (Static61.aClass40_444.method1169() == 0) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static23.aClass40_159, 239, 40, 255);
				} else if (Static87.anInt2066 == 0) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static84.aClass40_569, 239, 40, 0);
				}
				local68.method566(Static80.method1334(new Class40[] { Static61.aClass40_444, Static17.aClass40_116 }), 239, 90, 0);
				Static26.method1603(0, 77, 479, 0);
			} else if (Static17.aClass40_112 == null) {
				@Pc(781) boolean local781;
				if (Static85.anInt1994 != -1) {
					local781 = Static21.method403(0, -1, Static85.anInt1994, 2, 0, 96, 0, 479);
					if (!local781) {
						Static73.redrawChatback = true;
					}
				} else if (Static38.anInt980 == -1) {
					local75 = 0;
					local68 = Static103.aClass2_Sub2_Sub2_Sub2_5;
					Static26.method1613(0, 0, 463, 77);
					for (local87 = 0; local87 < 100; local87++) {
						if (Static63.messageText[local87] != null) {
							@Pc(218) int local218 = Static34.anInt799 + 70 - local75 * 14;
							@Pc(222) int local222 = Static76.messageType[local87];
							@Pc(224) byte local224 = 0;
							@Pc(228) Class40 local228 = Static106.messageSender[local87];
							if (local228 != null && local228.method1168(Static42.aClass40_323)) {
								local228 = local228.method1185(5);
								local224 = 1;
							}
							if (local228 != null && local228.method1168(Static92.aClass40_622)) {
								local228 = local228.method1185(5);
								local224 = 2;
							}
							if (local222 == 0) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.drawString(Static63.messageText[local87], 4, local218, 0);
								}
							}
							@Pc(306) int local306;
							if ((local222 == 1 || local222 == 2) && (local222 == 1 || Static23.publicChatSetting == 0 || Static23.publicChatSetting == 1 && Static38.isFriend(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local306 = 4;
									if (local224 == 1) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[0].draw(4, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[1].draw(local306, local218 - 12);
										local306 += 14;
									}
									local68.drawString(Static80.method1334(new Class40[] { local228, Static97.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.drawString(Static63.messageText[local87], local306, local218, 255);
								}
							}
							if ((local222 == 3 || local222 == 7) && Static102.splitPrivateChat == 0 && (local222 == 7 || Static104.privateChatSetting == 0 || Static104.privateChatSetting == 1 && Static38.isFriend(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.drawString(Static45.aClass40_340, 4, local218, 0);
									local306 = local68.method568(Static82.aClass40_564) + 4;
									if (local224 == 1) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[0].draw(local306, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[1].draw(local306, local218 - 12);
										local306 += 14;
									}
									local68.drawString(Static80.method1334(new Class40[] { local228, Static97.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.drawString(Static63.messageText[local87], local306, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 4 && (Static103.tradeChatSetting == 0 || Static103.tradeChatSetting == 1 && Static38.isFriend(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.drawString(Static80.method1334(new Class40[] { local228, Static107.aClass40_716, Static63.messageText[local87] }), 4, local218, 8388736);
								}
							}
							if (local222 == 5 && Static102.splitPrivateChat == 0 && Static104.privateChatSetting < 2) {
								if (local218 > 0 && local218 < 110) {
									local68.drawString(Static63.messageText[local87], 4, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 6 && Static102.splitPrivateChat == 0 && Static104.privateChatSetting < 2) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.drawString(Static80.method1334(new Class40[] { Static100.textFriendsChatTo, local228, Static97.aClass40_673 }), 4, local218, 0);
									local68.drawString(Static63.messageText[local87], local68.method568(Static80.method1334(new Class40[] { Static100.textFriendsChatTo, local228 })) + 12, local218, 8388608);
								}
							}
							if (local222 == 8 && (Static103.tradeChatSetting == 0 || Static103.tradeChatSetting == 1 && Static38.isFriend(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.drawString(Static80.method1334(new Class40[] { local228, Static107.aClass40_716, Static63.messageText[local87] }), 4, local218, 8270336);
								}
								local75++;
							}
						}
					}
					Static26.method1614();
					Static59.anInt1506 = local75 * 14 + 7;
					if (Static59.anInt1506 < 78) {
						Static59.anInt1506 = 78;
					}
					Static37.method711(77, 463, Static59.anInt1506 - Static34.anInt799 - 77, 0, Static59.anInt1506);
					@Pc(709) Class40 local709;
					if (Static88.localPlayer == null || Static88.localPlayer.aClass40_395 == null) {
						local709 = Static86.username;
					} else {
						local709 = Static88.localPlayer.aClass40_395;
					}
					local68.drawString(Static80.method1334(new Class40[] { local709, Static97.aClass40_673 }), 4, 90, 0);
					local68.drawString(Static80.method1334(new Class40[] { Static61.chatTyped, Static17.aClass40_116 }), local68.method568(Static80.method1334(new Class40[] { local709, Static1.textFriendsChatColon})) + 6, 90, 255);
					Static26.method1603(0, 77, 479, 0);
				} else {
					local781 = Static21.method403(0, -1, Static38.anInt980, 3, 0, 96, 0, 479);
					if (!local781) {
						Static73.redrawChatback = true;
					}
				}
			} else {
				Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static17.aClass40_112, 239, 40, 0);
				Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static35.aClass40_252, 239, 60, 128);
			}
		}
		if (Static97.aBoolean175 && Static1.anInt16 == 2) {
			Static23.method480();
		}
		Static4.method83(Static24.graphics);
	}
}

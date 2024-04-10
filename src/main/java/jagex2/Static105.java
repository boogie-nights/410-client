package jagex2;

import jagex2.client.ViewBox;
import jagex2.config.LocType;
import jagex2.config.ObjType;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.datastruct.HashTable;
import jagex2.datastruct.LinkedList;
import jagex2.graphics.Pix8;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!d;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt2526;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!k;")
	public static ViewBox viewBox;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_725 = Static13.method257("backleft1");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_726 = Static13.method257("p12_full");

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!ba;")
	public static HashTable aClass6_7 = new HashTable(4096);

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static volatile int anInt2520 = 0;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_727 = Static13.method257("mapdots");

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!o;")
	public static Class40 textTradeReq = Static13.method257(":tradereq:");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_729 = Static13.method257("attack");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZI)I")
	public static int method1668() {
		return Static96.anInt2333 + Static2.anInt34;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!hb;")
	public static ObjType get(@OriginalArg(1) int id) {
		@Pc(18) ObjType obj = (ObjType) Static81.aClass47_16.get((long) id);
		if (obj != null) {
			return obj;
		}
		@Pc(28) byte[] data = Static41.aClass5_13.method68(id, 10);
		obj = new ObjType();
		obj.anInt954 = id;
		if (data != null) {
			obj.decode(new Packet(data));
		}

		obj.method716();
		if (obj.certTemplate != -1) {
			obj.method721(get(obj.certlink), get(obj.certTemplate));
		}

		if (!Static43.membersWorld && obj.members) {
			obj.iops = null;
			obj.ops = null;
			obj.name = Static10.textMembersObject;
			obj.desc = Static24.textLoginToAMemberServerToUse;
			obj.anInt951 = 0;
		}
		Static81.aClass47_16.put((long) id, obj);
		return obj;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method1670() {
		viewBox = null;
		aClass40_726 = null;
		aClass6_7 = null;
		textTradeReq = null;
		aClass40_725 = null;
		aClass40_727 = null;
		aClass40_729 = null;
		aByteArrayArray12 = null;
		aClass14_5 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method1671() {
		Static12.aBoolean27 = true;
		Static5.aLong12 = 0L;
		Static63.anInt1612 = 0;
		Static97.aBoolean174 = true;
		Static44.aClass52_1.anInt1982 = 0;
		Static100.method1584();
		Static7.anInt231 = 0;
		Static85.anInt1986 = -1;
		Static80.out.pos = 0;
		Static88.packetType = -1;
		Static56.in.pos = 0;
		Static97.aBoolean175 = false;
		Static97.anInt2352 = -1;
		Static84.systemUpdateTimer = 0;
		Static67.anInt1672 = 0;
		Static34.menuSize = 0;
		Static33.anInt788 = -1;
		Static91.hintType = 0;
		Static37.method722(0);
		for (@Pc(1645) int local1645 = 0; local1645 < 100; local1645++) {
			Static63.messageText[local1645] = null;
		}
		Static22.anInt2590 = -1;
		Static104.anInt2518 = (int) (Math.random() * 100.0D) - 50;
		Static73.anInt1800 = 0;
		Static96.anInt2328 = 0;
		Static38.flagSceneTileX = 0;
		Static80.flagSceneTileZ = 0;
		Static10.anInt262 = (int) (Math.random() * 80.0D) - 40;
		Static67.anInt1669 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static15.anInt1857 = (int) (Math.random() * 30.0D) - 20;
		Static79.objSelected = 0;
		Static4.waveCount = 0;
		Static88.playerCount = 0;
		Static24.spellSelected = 0;
		Static98.anInt2371 = (int) (Math.random() * 110.0D) - 55;
		Static84.anInt1978 = (int) (Math.random() * 120.0D) - 60;
		for (@Pc(1726) int local1726 = 0; local1726 < 2048; local1726++) {
			Static100.players[local1726] = null;
			Static59.aPacketArray1[local1726] = null;
		}
		for (@Pc(1744) int local1744 = 0; local1744 < 16384; local1744++) {
			Static2.npcs[local1744] = null;
		}
		Static88.localPlayer = Static100.players[2047] = new PlayerEntity();
		Static24.aClass44_4.clear();
		Static96.aClass44_8.clear();
		@Pc(1776) int local1776;
		for (@Pc(1772) int local1772 = 0; local1772 < 4; local1772++) {
			for (local1776 = 0; local1776 < 104; local1776++) {
				for (@Pc(1780) int local1780 = 0; local1780 < 104; local1780++) {
					Static91.levelObjStacks[local1772][local1776][local1780] = null;
				}
			}
		}
		Static92.spawnedLocations = new LinkedList();
		Static22.friendCount = 0;
		Static42.anInt1038 = 0;
		Static83.method1350(Static38.anInt980);
		Static38.anInt980 = -1;
		Static83.method1350(Static85.anInt1994);
		Static85.anInt1994 = -1;
		Static83.method1350(Static22.anInt2585);
		Static22.anInt2585 = -1;
		Static83.method1350(Static84.anInt1971);
		Static84.anInt1971 = -1;
		Static83.method1350(Static93.anInt2175);
		Static93.anInt2175 = -1;
		Static83.method1350(Static66.anInt1654);
		Static66.anInt1654 = -1;
		Static83.method1350(Static3.anInt51);
		Static62.selectedTab = 3;
		Static101.anInt2399 = 0;
		Static20.aBoolean40 = false;
		Static103.flashingTab = -1;
		Static107.anInt2505 = 0;
		Static74.aBoolean146 = false;
		Static17.aClass40_112 = null;
		Static97.aBoolean175 = false;
		Static3.anInt51 = -1;
		Static38.aClass33_1.method1001(false, new int[5], -1, null);
		for (local1776 = 0; local1776 < 5; local1776++) {
			Static13.aClass40Array6[local1776] = null;
			Static46.aBooleanArray41[local1776] = false;
		}
		Static75.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI)V")
	public static void method1672(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public static void method1673() {
		@Pc(9) int local9;
		if (Static87.anInt2061 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static87.anInt2061 > 768) {
					Static92.anIntArray472[local9] = Static49.method1534(Static37.flameGradient0[local9], 1024 - Static87.anInt2061, Static70.flameGradient1[local9]);
				} else if (Static87.anInt2061 <= 256) {
					Static92.anIntArray472[local9] = Static49.method1534(Static70.flameGradient1[local9], 256 - Static87.anInt2061, Static37.flameGradient0[local9]);
				} else {
					Static92.anIntArray472[local9] = Static70.flameGradient1[local9];
				}
			}
		} else if (Static49.anInt2254 <= 0) {
			for (local9 = 0; local9 < 256; local9++) {
				Static92.anIntArray472[local9] = Static37.flameGradient0[local9];
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static49.anInt2254 > 768) {
					Static92.anIntArray472[local9] = Static49.method1534(Static37.flameGradient0[local9], 1024 - Static49.anInt2254, Static72.flameGradient2[local9]);
				} else if (Static49.anInt2254 > 256) {
					Static92.anIntArray472[local9] = Static72.flameGradient2[local9];
				} else {
					Static92.anIntArray472[local9] = Static49.method1534(Static72.flameGradient2[local9], 256 - Static49.anInt2254, Static37.flameGradient0[local9]);
				}
			}
		}
		for (local9 = 0; local9 < 33920; local9++) {
			Static61.pixMap.pixels[local9] = Static11.aClass2_Sub2_Sub2_Sub4_1.pixels[local9];
		}
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 1152;
		@Pc(181) int local181;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(205) int local205;
		@Pc(215) int local215;
		@Pc(219) int local219;
		@Pc(228) int local228;
		for (@Pc(168) int local168 = 1; local168 < 255; local168++) {
			local181 = (256 - local168) * Static33.anIntArray152[local168] / 256;
			local185 = local181 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			local164 += local185;
			for (local198 = local185; local198 < 128; local198++) {
				local205 = Static103.anIntArray547[local164++];
				if (local205 == 0) {
					local166++;
				} else {
					local215 = local205;
					local219 = 256 - local205;
					local205 = Static92.anIntArray472[local205];
					local228 = Static61.pixMap.pixels[local166];
					Static61.pixMap.pixels[local166++] = (local215 * (local205 & 0xFF00FF) + (local228 & 0xFF00FF) * local219 & 0xFF00FF00) + ((local228 & 0xFF00) * local219 + local215 * (local205 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local166 += local185;
		}
		local166 = 1176;
		for (local181 = 0; local181 < 33920; local181++) {
			Static98.aClass45_30.pixels[local181] = Static96.aClass2_Sub2_Sub2_Sub4_9.pixels[local181];
		}
		local164 = 0;
		for (local185 = 1; local185 < 255; local185++) {
			local198 = (256 - local185) * Static33.anIntArray152[local185] / 256;
			local166 += local198;
			local205 = 103 - local198;
			for (local215 = 0; local215 < local205; local215++) {
				local219 = Static103.anIntArray547[local164++];
				if (local219 == 0) {
					local166++;
				} else {
					local228 = local219;
					@Pc(357) int local357 = 256 - local219;
					local219 = Static92.anIntArray472[local219];
					@Pc(366) int local366 = Static98.aClass45_30.pixels[local166];
					Static98.aClass45_30.pixels[local166++] = (local228 * (local219 & 0xFF00) + local357 * (local366 & 0xFF00) & 0xFF0000) + (local228 * (local219 & 0xFF00FF) + ((local366 & 0xFF00FF) * local357) & 0xFF00FF00) >> 8;
				}
			}
			local164 += 128 - local205;
			local166 += 128 - local198 - local205;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIII)V")
	public static void drawMinimapLoc(@OriginalArg(0) int level, @OriginalArg(1) int wallRgb, @OriginalArg(3) int doorRgb, @OriginalArg(4) int tileZ, @OriginalArg(5) int tileX) {
		@Pc(7) int bitset = Static93.scene.getWallBitset(level, tileX, tileZ);
		@Pc(40) int info;
		@Pc(46) int angle;
		@Pc(53) int shape;
		@Pc(11) int rgb;
		@Pc(33) int offset;
		@Pc(59) int offsetX;
		if (bitset != 0) {
			rgb = wallRgb;
			if (bitset > 0) {
				rgb = doorRgb;
			}
			offset = (103 - tileZ) * 4 * 512 + tileX * 4 + 24624;
			info = Static93.scene.getInfo(level, tileX, tileZ, bitset);
			angle = info >> 6 & 0x3;
			@Pc(49) int[] dst = Static93.imageMinimap.pixels;
			shape = info & 0x1F;
			offsetX = bitset >> 14 & 0x7FFF;
			@Pc(63) LocType loc = Static91.method1470(offsetX);
			if (loc.mapscene == -1) {
				if (shape == 0 || shape == 2) {
					if (angle == 0) {
						dst[offset] = rgb;
						dst[offset + 512] = rgb;
						dst[offset + 1024] = rgb;
						dst[offset + 1536] = rgb;
					} else if (angle == 1) {
						dst[offset] = rgb;
						dst[offset + 1] = rgb;
						dst[offset + 2] = rgb;
						dst[offset + 3] = rgb;
					} else if (angle == 2) {
						dst[offset + 3] = rgb;
						dst[offset + 515] = rgb;
						dst[offset + 1027] = rgb;
						dst[offset + 1536 + 3] = rgb;
					} else if (angle == 3) {
						dst[offset + 1536] = rgb;
						dst[offset + 1 + 1536] = rgb;
						dst[offset + 2 + 1536] = rgb;
						dst[offset + 3 + 1536] = rgb;
					}
				}
				if (shape == 3) {
					if (angle == 0) {
						dst[offset] = rgb;
					} else if (angle == 1) {
						dst[offset + 3] = rgb;
					} else if (angle == 2) {
						dst[offset + 3 + 1536] = rgb;
					} else if (angle == 3) {
						dst[offset + 1536] = rgb;
					}
				}
				if (shape == 2) {
					if (angle == 3) {
						dst[offset] = rgb;
						dst[offset + 512] = rgb;
						dst[offset + 1024] = rgb;
						dst[offset + 1536] = rgb;
					} else if (angle == 0) {
						dst[offset] = rgb;
						dst[offset + 1] = rgb;
						dst[offset + 2] = rgb;
						dst[offset + 3] = rgb;
					} else if (angle == 1) {
						dst[offset + 3] = rgb;
						dst[offset + 515] = rgb;
						dst[offset + 1024 + 3] = rgb;
						dst[offset + 1536 + 3] = rgb;
					} else if (angle == 2) {
						dst[offset + 1536] = rgb;
						dst[offset + 1536 + 1] = rgb;
						dst[offset + 1538] = rgb;
						dst[offset + 1536 + 3] = rgb;
					}
				}
			} else {
				@Pc(73) Pix8 local73 = Static56.imageMapscene[loc.mapscene];
				if (local73 != null) {
					@Pc(85) int local85 = (loc.width * 4 - local73.width) / 2;
					@Pc(95) int local95 = (loc.length * 4 - local73.height) / 2;
					local73.draw(local85 + tileX * 4 + 48, local95 + (-loc.length + -tileZ + 104) * 4 + 48);
				}
			}
		}
		bitset = Static93.scene.getLocBitset(level, tileX, tileZ);
		if (bitset != 0) {
			info = Static93.scene.getInfo(level, tileX, tileZ, bitset);
			shape = info & 0x1F;
			angle = info >> 6 & 0x3;
			int locId = bitset >> 14 & 0x7FFF;
			@Pc(457) LocType loc = Static91.method1470(locId);
			@Pc(492) int offsetY;
			if (loc.mapscene != -1) {
				@Pc(565) Pix8 scene = Static56.imageMapscene[loc.mapscene];
				if (scene != null) {
					offsetX = (loc.width * 4 - scene.width) / 2;
					offsetY = (loc.length * 4 - scene.height) / 2;
					scene.draw(tileX * 4 + offsetX + 48, offsetY + (104 - tileZ - loc.length) * 4 + 48);
				}
			} else if (shape == 9) {
				int rgbColor = 15658734;
				if (bitset > 0) {
					rgbColor = 15597568;
				}
				@Pc(477) int[] dst = Static93.imageMinimap.pixels;
				int off = tileX * 4 + (-tileZ + 103) * 512 * 4 + 24624;
				if (angle == 0 || angle == 2) {
					dst[off + 1536] = rgbColor;
					dst[off + 1024 + 1] = rgbColor;
					dst[off + 2 + 512] = rgbColor;
					dst[off + 3] = rgbColor;
				} else {
					dst[off] = rgbColor;
					dst[off + 513] = rgbColor;
					dst[off + 1024 + 2] = rgbColor;
					dst[off + 3 + 1536] = rgbColor;
				}
			}
		}
		bitset = Static93.scene.getGroundDecorationBitset(level, tileX, tileZ);
		if (bitset == 0) {
			return;
		}
		int locId = bitset >> 14 & 0x7FFF;
		@Pc(633) LocType loc = Static91.method1470(locId);
		if (loc.mapscene == -1) {
			return;
		}
		@Pc(642) Pix8 scene = Static56.imageMapscene[loc.mapscene];
		if (scene != null) {
			rgb = (loc.width * 4 - scene.width) / 2;
			@Pc(665) int offsetY = (loc.length * 4 - scene.height) / 2;
			scene.draw(rgb + tileX * 4 + 48, offsetY + (-loc.length + 104 - tileZ) * 4 + 48);
		}
	}
}

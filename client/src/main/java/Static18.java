import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	public static int[] anIntArray86;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!p;")
	public static PixMap aClass45_9;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt439;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 22)
	public static void method368() {
		FloorUnderlayType.cache = null;
		aClass45_9 = null;
		JagString.aClass40_122 = null;
		anIntArray86 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V", line = 36)
	public static void method369(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static85.imageMinimap.pixels;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local38 = 4 * 512 * (103 - local25) + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((client.levelTileFlags[arg0][local40][local25] & 0x18) == 0) {
					client.scene.method1432(local8, local38, arg0, local40, local25);
				}
				if (arg0 < 3 && (client.levelTileFlags[arg0 + 1][local40][local25] & 0x8) != 0) {
					client.scene.method1432(local8, local38, arg0 + 1, local40, local25);
				}
				local38 += 4;
			}
		}
		Static85.imageMinimap.method1628();
		local38 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(150) int local150;
		for (@Pc(146) int local146 = 1; local146 < 103; local146++) {
			for (local150 = 1; local150 < 103; local150++) {
				if ((client.levelTileFlags[arg0][local150][local146] & 0x18) == 0) {
					client.drawMinimapLoc(arg0, local38, local40, local146, local150);
				}
				if (arg0 < 3 && (client.levelTileFlags[arg0 + 1][local150][local146] & 0x8) != 0) {
					client.drawMinimapLoc(arg0 + 1, local38, local40, local146, local150);
				}
			}
		}
		Static1.anInt2136 = 0;
		for (local150 = 0; local150 < 104; local150++) {
			for (@Pc(221) int local221 = 0; local221 < 104; local221++) {
				@Pc(229) int local229 = client.scene.method1458(client.currentLevel, local150, local221);
				if (local229 != 0) {
					local229 = local229 >> 14 & 0x7FFF;
					@Pc(242) int local242 = LocType.get(local229).anInt1034;
					if (local242 >= 0) {
						@Pc(249) int local249 = local150;
						@Pc(251) int local251 = local221;
						if (local242 != 22 && local242 != 29 && local242 != 34 && local242 != 36 && local242 != 46 && local242 != 47 && local242 != 48) {
							@Pc(287) int[][] local287 = client.levelCollisionMap[client.currentLevel].flags;
							for (@Pc(289) int local289 = 0; local289 < 10; local289++) {
								@Pc(296) int local296 = (int) (Math.random() * 4.0D);
								if (local296 == 0 && local249 > 0 && local249 > local150 - 3 && (local287[local249 - 1][local251] & 0x1280108) == 0) {
									local249--;
								}
								if (local296 == 1 && local249 < 103 && local249 < local150 + 3 && (local287[local249 + 1][local251] & 0x1280180) == 0) {
									local249++;
								}
								if (local296 == 2 && local251 > 0 && local251 > local221 - 3 && (local287[local249][local251 - 1] & 0x1280102) == 0) {
									local251--;
								}
								if (local296 == 3 && local251 < 103 && local251 < local221 + 3 && (local287[local249][local251 + 1] & 0x1280120) == 0) {
									local251++;
								}
							}
						}
						Static1.aClass2_Sub2_Sub2_Sub4Array9[Static1.anInt2136] = Static91.aClass2_Sub2_Sub2_Sub4Array2[local242];
						Static1.anIntArray500[Static1.anInt2136] = local249;
						Static1.anIntArray546[Static1.anInt2136] = local251;
						Static1.anInt2136++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 191)
	public static void method370() {
		Static40.method1247();
		@Pc(20) int local20;
		@Pc(22) int local22;
		if (Static1.anInt2328 == 2) {
			@Pc(14) int[] local14 = Static25.anIntArray533;
			@Pc(17) byte[] local17 = client.imageMapback.aByteArray16;
			local20 = local17.length;
			for (local22 = 0; local22 < local20; local22++) {
				if (local17[local22] == 0) {
					local14[local22] = 0;
				}
			}
			Static12.aClass2_Sub2_Sub2_Sub4_2.method1616(0, 0, 33, 33, 25, 25, client.orbitCameraYaw, 256, Static94.anIntArray544, Static42.anIntArray225);
			Static30.method594(client.graphics);
			return;
		}
		@Pc(62) int local62 = client.minimapAnticheatAngle + client.orbitCameraYaw & 0x7FF;
		local20 = 464 - client.localPlayer.z / 32;
		@Pc(77) int local77 = client.localPlayer.x / 32 + 48;
		Static85.imageMinimap.method1616(25, 5, 146, 151, local77, local20, local62, Static1.anInt1857 + 256, Static67.anIntArray407, Static2.anIntArray3);
		Static12.aClass2_Sub2_Sub2_Sub4_2.method1616(0, 0, 33, 33, 25, 25, client.orbitCameraYaw, 256, Static94.anIntArray544, Static42.anIntArray225);
		for (local22 = 0; local22 < Static1.anInt2136; local22++) {
			local77 = Static1.anIntArray500[local22] * 4 + 2 - client.localPlayer.x / 32;
			local20 = Static1.anIntArray546[local22] * 4 + 2 - client.localPlayer.z / 32;
			client.drawOnMinimap(local77, Static1.aClass2_Sub2_Sub2_Sub4Array9[local22], local20);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 0; local151 < 104; local151++) {
			for (local155 = 0; local155 < 104; local155++) {
				@Pc(165) LinkList local165 = client.levelObjStacks[client.currentLevel][local151][local155];
				if (local165 != null) {
					local77 = local151 * 4 + 2 - client.localPlayer.x / 32;
					local20 = local155 * 4 + 2 - client.localPlayer.z / 32;
					client.drawOnMinimap(local77, Static28.aClass2_Sub2_Sub2_Sub4Array5[0], local20);
				}
			}
		}
		for (local155 = 0; local155 < client.npcCount; local155++) {
			@Pc(215) NpcEntity local215 = client.npcs[client.npcIds[local155]];
			if (local215 != null && local215.isVisible()) {
				@Pc(224) NpcType local224 = local215.type;
				if (local224.anIntArray154 != null) {
					local224 = local224.method611();
				}
				if (local224 != null && local224.aBoolean56 && local224.aBoolean58) {
					local20 = local215.z / 32 - client.localPlayer.z / 32;
					local77 = local215.x / 32 - client.localPlayer.x / 32;
					client.drawOnMinimap(local77, Static28.aClass2_Sub2_Sub2_Sub4Array5[1], local20);
				}
			}
		}
		@Pc(288) PlayerEntity local288;
		for (@Pc(280) int local280 = 0; local280 < client.playerCount; local280++) {
			local288 = client.players[client.playerIds[local280]];
			if (local288 != null && local288.isVisible()) {
				local20 = local288.z / 32 - client.localPlayer.z / 32;
				local77 = local288.x / 32 - client.localPlayer.x / 32;
				@Pc(321) long local321 = local288.name.toBase37();
				@Pc(323) boolean local323 = false;
				for (@Pc(325) int local325 = 0; local325 < client.friendCount; local325++) {
					if (local321 == client.friendName37[local325] && client.friendWorld[local325] != 0) {
						local323 = true;
						break;
					}
				}
				@Pc(351) boolean local351 = false;
				if (client.localPlayer.anInt1382 != 0 && local288.anInt1382 != 0 && local288.anInt1382 == client.localPlayer.anInt1382) {
					local351 = true;
				}
				if (local323) {
					client.drawOnMinimap(local77, Static28.aClass2_Sub2_Sub2_Sub4Array5[3], local20);
				} else if (local351) {
					client.drawOnMinimap(local77, Static28.aClass2_Sub2_Sub2_Sub4Array5[4], local20);
				} else {
					client.drawOnMinimap(local77, Static28.aClass2_Sub2_Sub2_Sub4Array5[2], local20);
				}
			}
		}
		if (client.hintType != 0 && client.loopCycle % 20 < 10) {
			if (client.hintType == 1 && Static1.anInt1989 >= 0 && Static1.anInt1989 < client.npcs.length) {
				@Pc(427) NpcEntity local427 = client.npcs[Static1.anInt1989];
				if (local427 != null) {
					local77 = local427.x / 32 - client.localPlayer.x / 32;
					local20 = local427.z / 32 - client.localPlayer.z / 32;
					Static95.method1646(Static12.aClass2_Sub2_Sub2_Sub4Array3[1], local20, local77);
				}
			}
			if (client.hintType == 2) {
				local77 = (-client.sceneBaseTileX + client.hintTileX) * 4 + 2 - client.localPlayer.x / 32;
				local20 = (client.hintTileZ - client.sceneBaseTileZ) * 4 + 2 - client.localPlayer.z / 32;
				Static95.method1646(Static12.aClass2_Sub2_Sub2_Sub4Array3[1], local20, local77);
			}
			if (client.hintType == 10 && Static1.anInt2353 >= 0 && client.players.length > Static1.anInt2353) {
				local288 = client.players[Static1.anInt2353];
				if (local288 != null) {
					local20 = local288.z / 32 - client.localPlayer.z / 32;
					local77 = local288.x / 32 - client.localPlayer.x / 32;
					Static95.method1646(Static12.aClass2_Sub2_Sub2_Sub4Array3[1], local20, local77);
				}
			}
		}
		if (client.flagSceneTileX != 0) {
			local20 = client.flagSceneTileZ * 4 + 2 - client.localPlayer.z / 32;
			local77 = client.flagSceneTileX * 4 + 2 - client.localPlayer.x / 32;
			client.drawOnMinimap(local77, Static12.aClass2_Sub2_Sub2_Sub4Array3[0], local20);
		}
		Static25.method1612(97, 78, 3, 3, 16777215);
		Static30.method594(client.graphics);
	}

}

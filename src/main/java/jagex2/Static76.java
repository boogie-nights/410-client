package jagex2;

import jagex2.dash3d.entity.PlayerEntity;
import jagex2.datastruct.HashTable;
import jagex2.graphics.PixFont;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt2149;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "I")
	public static int anInt2153;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "I")
	public static int height;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "Lclient!fc;")
	public static PixFont aClass2_Sub2_Sub2_Sub2_4;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_613 = Static13.method257(" with @yel@");

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	public static int[] messageType = new int[100];

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
	public static int[] anIntArray470 = new int[128];

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_614 = Static13.method257("You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3");

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!ba;")
	public static HashTable aClass6_5 = new HashTable(32);

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_615 = Static13.method257("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_616 = Static13.method257("Loading config )2 ");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	public static void method1472() {
		aClass2_Sub2_Sub2_Sub2_4 = null;
		aClass40_613 = null;
		aClass40_615 = null;
		aClass6_5 = null;
		aClass40_616 = null;
		messageType = null;
		aClass40_614 = null;
		anIntArray470 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V")
	public static void pushPlayers(@OriginalArg(0) boolean arg0) {
		if (Static38.flagSceneTileX == Static88.localPlayer.x >> 7 && Static88.localPlayer.z >> 7 == Static80.flagSceneTileZ) {
			Static38.flagSceneTileX = 0;
		}
		@Pc(33) int local33 = Static88.playerCount;
		if (arg0) {
			local33 = 1;
		}
		for (@Pc(39) int i = 0; i < local33; i++) {
			@Pc(47) PlayerEntity player;
			@Pc(45) int local45;
			if (arg0) {
				local45 = 33538048;
				player = Static88.localPlayer;
			} else {
				player = Static100.players[Static73.playerIds[i]];
				local45 = Static73.playerIds[i] << 14;
			}
			if (player != null && player.method1544()) {
				@Pc(72) int local72 = player.x >> 7;
				player.aBoolean104 = false;
				if ((Static1.lowMemory && Static88.playerCount > 50 || Static88.playerCount > 200) && !arg0 && player.anInt2318 == player.anInt2290) {
					player.aBoolean104 = true;
				}
				@Pc(102) int local102 = player.z >> 7;
				if (local72 >= 0 && local72 < 104 && local102 >= 0 && local102 < 104) {
					if (player.aModel_1 == null || Static107.loopCycle < player.anInt1377 || Static107.loopCycle >= player.anInt1381) {
						if ((player.x & 0x7F) == 64 && (player.z & 0x7F) == 64) {
							if (Static22.sceneCycle == Static14.tileLastOccupiedCycle[local72][local102]) {
								continue;
							}
							Static14.tileLastOccupiedCycle[local72][local102] = Static22.sceneCycle;
						}
						player.anInt1379 = Static86.method1383(Static1.currentLevel, player.x, player.z);
						Static93.scene.addTemporary(Static1.currentLevel, player.x, player.z, player.anInt1379, 60, player, player.anInt2305, local45, player.aBoolean172);
					} else {
						player.aBoolean104 = false;
						player.anInt1379 = Static86.method1383(Static1.currentLevel, player.x, player.z);
						Static93.scene.addTemporary(Static1.currentLevel, player.x, player.z, player.anInt1379, player, player.anInt2305, local45, player.anInt1368, player.anInt1376, player.anInt1369, player.anInt1386);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
	public static int method1477() {
		return Static15.anInt1860++;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method1478() {
		Static20.aClass47_5.clear();
	}
}

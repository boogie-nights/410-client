package jagex2;

import jagex2.dash3d.entity.NpcEntity;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.dash3d.type.LocTemporary;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_16;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!ud;")
	public static Class5 aClass5_26;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_562 = Static13.method257("This is a non)2members*6nworld)3 To enjoy your*6nmembers benefits we*6nrecommend you play on a*6nmembers world instead)3");

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public static final int anInt1936 = 5063219;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_563 = Static13.method257("runes");

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public static int anInt1942 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_564 = Static13.method257("From ");

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public static int anInt1947 = 0;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_565 = Static13.method257("flash3:");

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_566 = Static13.method257("purple:");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method1342() {
		Static25.aClass47_7.clear();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIII)V")
	public static void method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int level, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Static1.lowMemory) {
			level = 0;
		}
		if (arg0 == Static56.anInt2327 && arg4 == Static49.anInt2262 && Static33.anInt786 == level) {
			return;
		}
		Static33.anInt786 = level;
		Static49.anInt2262 = arg4;
		Static56.anInt2327 = arg0;
		Static7.method187(25);
		Static66.method1095(false, null, Static98.aClass40_674);
		@Pc(43) int local43 = Static30.anInt725;
		Static30.anInt725 = (arg4 - 6) * 8;
		@Pc(54) int dz = Static30.anInt725 - local43;
		@Pc(58) int local58 = Static87.anInt2058;
		Static87.anInt2058 = arg0 * 8 - 48;
		@Pc(69) int dx = Static87.anInt2058 - local58;
		for (@Pc(73) int i = 0; i < 16384; i++) {
			@Pc(79) NpcEntity npc = Static2.npcs[i];
			if (npc != null) {
				for (@Pc(83) int j = 0; j < 10; j++) {
					npc.pathTileX[j] -= dx;
					npc.pathTileZ[j] -= dz;
				}
				npc.x -= dx * 128;
				npc.z -= dz * 128;
			}
		}
		for (@Pc(131) int i = 0; i < 2048; i++) {
			@Pc(137) PlayerEntity player = Static100.players[i];
			if (player != null) {
				for (@Pc(141) int j = 0; j < 10; j++) {
					player.pathTileX[j] -= dx;
					player.pathTileZ[j] -= dz;
				}
				player.x -= dx * 128;
				player.z -= dz * 128;
			}
		}
		@Pc(187) byte startTileX = 0;
		Static1.currentLevel = level;
		Static88.localPlayer.move(false, arg2, arg3);
		@Pc(197) byte endTileX = 104;
		@Pc(199) byte dirX = 1;
		@Pc(201) byte startTileZ = 0;
		if (dx < 0) {
			dirX = -1;
			startTileX = 103;
			endTileX = -1;
		}
		@Pc(211) byte dirZ = 1;
		@Pc(213) byte endTileZ = 104;
		if (dz < 0) {
			dirZ = -1;
			startTileZ = 103;
			endTileZ = -1;
		}
		for (@Pc(226) int x = startTileX; x != endTileX; x += dirX) {
			for (@Pc(230) int z = startTileZ; z != endTileZ; z += dirZ) {
				@Pc(236) int lastX = dx + x;
				@Pc(240) int lastZ = dz + z;
				for (@Pc(242) int l = 0; l < 4; l++) {
					if (lastX >= 0 && lastZ >= 0 && lastX < 104 && lastZ < 104) {
						Static91.levelObjStacks[l][x][z] = Static91.levelObjStacks[l][lastX][lastZ];
					} else {
						Static91.levelObjStacks[l][x][z] = null;
					}
				}
			}
		}
		for (@Pc(307) LocTemporary loc = (LocTemporary) Static92.spawnedLocations.peekFront(); loc != null; loc = (LocTemporary) Static92.spawnedLocations.prev()) {
			loc.z -= dz;
			loc.x -= dx;
			if (loc.x < 0 || loc.z < 0 || loc.x >= 104 || loc.z >= 104) {
				loc.unlink();
			}
		}
		Static7.cutscene = false;
		if (Static38.flagSceneTileX != 0) {
			Static38.flagSceneTileX -= dx;
			Static80.flagSceneTileZ -= dz;
		}
		Static22.anInt2590 = -1;
		Static96.spotanims.clear();
		Static24.aClass44_4.clear();
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
	public static void method1344() {
		Static41.aClass47_11.clear();
		Static92.aClass47_21.clear();
		Static41.aClass47_10.clear();
		Static2.aClass47_1.clear();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BJ)V")
	public static void method1345(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static99.ignoreCount; local17++) {
			if (arg0 == Static84.ignoreName37[local17]) {
				Static99.ignoreCount--;
				Static33.redrawSidebar = true;
				for (@Pc(37) int local37 = local17; local37 < Static99.ignoreCount; local37++) {
					Static84.ignoreName37[local37] = Static84.ignoreName37[local37 + 1];
				}
				Static80.out.p1isaac(168);
				Static80.out.p8(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1346() {
		aClass40_566 = null;
		aClass40_563 = null;
		aClass40_565 = null;
		aClass5_26 = null;
		aClass5_Sub1_16 = null;
		aClass40_564 = null;
		aClass40_562 = null;
	}
}

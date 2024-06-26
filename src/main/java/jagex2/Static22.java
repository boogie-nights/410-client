package jagex2;

import jagex2.dash3d.type.LocTemporary;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Static6;
import jagex2.graphics.Static71;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Lclient!qc;")
	public static LruCache aClass47_23 = new LruCache(64);

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lclient!o;")
	public static Class40 aClass40_734 = Static13.method257("backbase1");

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!eb", name = "rb", descriptor = "Lclient!o;")
	public static Class40 aClass40_735 = Static13.method257("Side panel redrawn");

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "Lclient!o;")
	public static Class40 textImportReady = Static13.method257("Import ready");

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "Lclient!o;")
	public static Class40 textLoadedInputHandler = Static13.method257("Loaded input handler");

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	public static int anInt2585 = -1;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
	public static int sceneCycle = 0;

	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "I")
	public static int anInt2590 = -1;

	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
	public static int friendCount = 0;

	@OriginalMember(owner = "client!eb", name = "Gb", descriptor = "Lclient!o;")
	public static Class40 aClass40_738 = Static13.method257("Jun");

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method1689() {
		aClass47_23 = null;
		aClass40_734 = null;
		aClass40_735 = null;
		textImportReady = null;
		textLoadedInputHandler = null;
		aClass40_738 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)V")
	public static void updateVarp(@OriginalArg(0) int id) {
		@Pc(15) int local15 = Static98.method1568(id).anInt1076;
		if (local15 == 0) {
			return;
		}
		@Pc(25) int local25 = Static67.varps[id];
		if (local15 == 1) {
			if (local25 == 1) {
				Static6.method168(0.9D);
				((Class19) Static6.anInterface4_1).method404(0.9D);
			}
			if (local25 == 2) {
				Static6.method168(0.8D);
				((Class19) Static6.anInterface4_1).method404(0.8D);
			}
			if (local25 == 3) {
				Static6.method168(0.7D);
				((Class19) Static6.anInterface4_1).method404(0.7D);
			}
			if (local25 == 4) {
				Static6.method168(0.6D);
				((Class19) Static6.anInterface4_1).method404(0.6D);
			}
			Static82.method1342();
			Static1.clearScreen = true;
		}
		if (local15 == 3) {
			@Pc(85) short local85 = 0;
			if (local25 == 0) {
				local85 = 255;
			}
			if (local25 == 1) {
				local85 = 192;
			}
			if (local25 == 2) {
				local85 = 128;
			}
			if (local25 == 3) {
				local85 = 64;
			}
			if (local25 == 4) {
				local85 = 0;
			}
			if (Static7.anInt239 != local85) {
				if (Static7.anInt239 == 0 && Static84.anInt1977 != -1) {
					Static94.method1499(0, Static84.anInt1977, Static85.aClass5_Sub1_17, local85);
					Static20.anInt470 = 0;
				} else if (local85 == 0) {
					Static94.method1497();
					Static20.anInt470 = 0;
				} else {
					Static36.method641(local85);
				}
				Static7.anInt239 = local85;
			}
		}
		if (local15 == 6) {
			Static53.anInt1186 = local25;
		}
		if (local15 == 9) {
			Static5.anInt182 = local25;
		}
		if (local15 == 8) {
			Static102.splitPrivateChat = local25;
			Static73.redrawChatback = true;
		}
		if (local15 == 4) {
			if (local25 == 0) {
				Static98.wavevol = 127;
			}
			if (local25 == 1) {
				Static98.wavevol = 96;
			}
			if (local25 == 2) {
				Static98.wavevol = 64;
			}
			if (local25 == 3) {
				Static98.wavevol = 32;
			}
			if (local25 == 4) {
				Static98.wavevol = 0;
			}
		}
		if (local15 == 5) {
			Static10.anInt263 = local25;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
	public static void drawScene() {
		sceneCycle++;
		Static76.pushPlayers(true);
		Static36.pushNpcs(true);
		Static76.pushPlayers(false);
		Static36.pushNpcs(false);
		Static54.pushProjectiles();
		Static1.pushSpotanims();

		@Pc(36) int local36;
		@Pc(34) int local34;
		if (!Static7.cutscene) {
			local34 = Static67.orbitCameraYaw + Static10.cameraAnticheatAngle & 0x7FF;
			local36 = Static93.anInt2177;
			if (local36 < Static13.anInt308 / 256) {
				local36 = Static13.anInt308 / 256;
			}
			if (Static98.cameraModifierEnabled[4] && Static36.anIntArray164[4] + 128 > local36) {
				local36 = Static36.anIntArray164[4] + 128;
			}
			Static41.method752(Static23.anInt577, local34, Static66.anInt1653, local36, Static86.method1383(Static1.currentLevel, Static88.localPlayer.x, Static88.localPlayer.z) - 50, local36 * 3 + 600);
		}
		if (Static7.cutscene) {
			local36 = Static18.getTopLevelCutscene();
		} else {
			local36 = Static59.getTopLevel();
		}
		local34 = Static48.cameraX;
		@Pc(96) int local96 = Static15.cameraZ;
		@Pc(98) int local98 = Static81.cameraY;
		@Pc(100) int local100 = Static35.cameraPitch;
		@Pc(102) int local102 = Static27.cameraYaw;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static98.cameraModifierEnabled[local104]) {
				@Pc(146) int jitter = (int) ((double) -Static20.anIntArray93[local104] + (double) (Static20.anIntArray93[local104] * 2 + 1) * Math.random() + Math.sin((double) Static79.anIntArray415[local104] * ((double) Static35.anIntArray159[local104] / 100.0D)) * (double) Static36.anIntArray164[local104]);
				if (local104 == 3) {
					Static27.cameraYaw = Static27.cameraYaw + jitter & 0x7FF;
				}
				if (local104 == 2) {
					Static15.cameraZ += jitter;
				}
				if (local104 == 4) {
					Static35.cameraPitch += jitter;
					if (Static35.cameraPitch < 128) {
						Static35.cameraPitch = 128;
					}
					if (Static35.cameraPitch > 383) {
						Static35.cameraPitch = 383;
					}
				}
				if (local104 == 1) {
					Static81.cameraY += jitter;
				}
				if (local104 == 0) {
					Static48.cameraX += jitter;
				}
			}
		}
		Static75.method1230();
		Static71.aBoolean140 = true;
		Static71.mouseZ = Static100.anInt2394 - 4;
		Static71.pickedCount = 0;
		Static71.mouseX = Static32.anInt742 - 4;
		Static26.clear();
		Static93.scene.method1430(Static48.cameraX, Static81.cameraY, Static15.cameraZ, Static35.cameraPitch, Static27.cameraYaw, local36);
		Static93.scene.clearTemporaryLocs();
		Static12.method253();
		Static67.method1099();
		((Class19) Static6.anInterface4_1).method405(Static45.sceneDelta);
		Static18.method359();
		if (Static75.aBoolean147 && Static105.method1668() == 0) {
			Static75.aBoolean147 = false;
		}
		if (Static75.aBoolean147) {
			Static75.method1230();
			Static26.clear();
			Static66.method1095(false, null, Static98.aClass40_674);
		}
		Static80.method1333(Static24.graphics);
		Static81.cameraY = local98;
		Static35.cameraPitch = local100;
		Static15.cameraZ = local96;
		Static48.cameraX = local34;
		Static27.cameraYaw = local102;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BZ)I")
	public static int method1726(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static19.method371(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int z, @OriginalArg(8) int arg7, @OriginalArg(9) int x) {
		@Pc(7) LocTemporary loc = null;
		for (@Pc(12) LocTemporary l = (LocTemporary) Static92.spawnedLocations.peekFront(); l != null; l = (LocTemporary) Static92.spawnedLocations.prev()) {
			if (l.level == arg1 && l.x == x && l.z == z && l.layer == arg2) {
				loc = l;
				break;
			}
		}
		if (loc == null) {
			loc = new LocTemporary();
			loc.level = arg1;
			loc.layer = arg2;
			loc.x = x;
			loc.z = z;
			Static4.method86(loc);
			Static92.spawnedLocations.pushBack(loc);
		}
		loc.anInt829 = arg3;
		loc.anInt828 = arg5;
		loc.anInt826 = arg7;
		loc.anInt827 = arg0;
		loc.anInt819 = arg4;
	}
}

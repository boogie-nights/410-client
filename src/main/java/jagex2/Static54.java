package jagex2;

import jagex2.config.ComType;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.entity.NpcEntity;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.dash3d.entity.ProjectileEntity;
import jagex2.graphics.Pix24;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!kc", name = "bd", descriptor = "Lclient!ud;")
	public static Class5 aClass5_17;

	@OriginalMember(owner = "client!kc", name = "cd", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array7;

	@OriginalMember(owner = "client!kc", name = "md", descriptor = "Lclient!ud;")
	public static Class5 aClass5_18;

	@OriginalMember(owner = "client!kc", name = "Sc", descriptor = "[I")
	public static int[] anIntArray287 = new int[500];

	@OriginalMember(owner = "client!kc", name = "Wc", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!kc", name = "ed", descriptor = "Lclient!o;")
	public static Class40 aClass40_396 = Static13.method257("Mar");

	@OriginalMember(owner = "client!kc", name = "hd", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!kc", name = "kd", descriptor = "[I")
	public static int[] varCache = new int[2000];

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "(I)V")
	public static void method916() {
		@Pc(5) Class62 local5 = Static81.aClass62_1;
		synchronized (Static81.aClass62_1) {
			Static92.anInt2170 = Static38.anInt969;
			Static32.anInt742 = Static99.anInt112;
			Static100.anInt2394 = Static66.anInt1663;
			Static86.anInt2030 = Static105.anInt2520;
			Static107.anInt2500 = Static51.anInt1166;
			Static90.anInt2133 = Static103.anInt2494;
			Static1.aLong1 = Static46.aLong149;
			Static105.anInt2520 = 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)V")
	public static void pushProjectiles() {
		for (@Pc(10) ProjectileEntity proj = (ProjectileEntity) Static24.aClass44_4.peekFront(); proj != null; proj = (ProjectileEntity) Static24.aClass44_4.prev()) {
			if (proj.level != Static1.currentLevel || proj.lastCycle < Static107.loopCycle) {
				proj.unlink();
			} else if (Static107.loopCycle >= proj.startCycle) {
				if (proj.target > 0) {
					@Pc(47) NpcEntity npc = Static2.npcs[proj.target - 1];
					if (npc != null && npc.x >= 0 && npc.x < 13312 && npc.z >= 0 && npc.z < 13312) {
						proj.updateVelocity(npc.x, Static86.method1383(proj.level, npc.x, npc.z) - proj.offsetY, Static107.loopCycle, npc.z);
					}
				}
				if (proj.target < 0) {
					@Pc(97) int index = -proj.target - 1;
					@Pc(104) PlayerEntity player;
					if (index == Static83.localPid) {
						player = Static88.localPlayer;
					} else {
						player = Static100.players[index];
					}
					if (player != null && player.x >= 0 && player.x < 13312 && player.z >= 0 && player.z < 13312) {
						proj.updateVelocity(player.x, Static86.method1383(proj.level, player.x, player.z) - proj.offsetY, Static107.loopCycle, player.z);
					}
				}
				proj.update(Static45.sceneDelta);
				Static93.scene.addTemporary(Static1.currentLevel, (int) proj.aDouble7, (int) proj.aDouble5, (int) proj.y, 60, proj, proj.anInt1436, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "(I)V")
	public static void method919() {
		aClass40_396 = null;
		anIntArray287 = null;
		aClass2_Sub2_Sub2_Sub4Array7 = null;
		varCache = null;
		aClass5_18 = null;
		aClass5_17 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!mc;IIIIIII)V")
	public static void method920(@OriginalArg(1) ComType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static46.aBoolean182) {
			Static5.anInt180 = 32;
		} else {
			Static5.anInt180 = 0;
		}
		Static46.aBoolean182 = false;
		if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 <= arg5 && arg7 + 16 > arg5) {
			arg0.anInt1587 -= Static56.anInt2326 * 4;
			if (arg4 == 1) {
				Static33.redrawSidebar = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static73.redrawChatback = true;
			}
		} else if (arg1 <= arg6 && arg1 + 16 > arg6 && arg3 + arg7 - 16 <= arg5 && arg3 + arg7 > arg5) {
			if (arg4 == 2 || arg4 == 3) {
				Static73.redrawChatback = true;
			}
			if (arg4 == 1) {
				Static33.redrawSidebar = true;
			}
			arg0.anInt1587 += Static56.anInt2326 * 4;
		} else if (arg1 - Static5.anInt180 <= arg6 && arg6 < arg1 + Static5.anInt180 + 16 && arg7 + 16 <= arg5 && arg5 < arg3 + arg7 - 16 && Static56.anInt2326 > 0) {
			if (arg4 == 1) {
				Static33.redrawSidebar = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static73.redrawChatback = true;
			}
			Static46.aBoolean182 = true;
			@Pc(147) int local147 = arg3 * (arg3 - 32) / arg2;
			if (local147 < 8) {
				local147 = 8;
			}
			@Pc(165) int local165 = arg5 - arg7 - local147 / 2 - 16;
			@Pc(172) int local172 = arg3 - local147 - 32;
			arg0.anInt1587 = (arg2 - arg3) * local165 / local172;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIIIIII[Lclient!fb;IB)V")
	public static void method921(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) CollisionMap[] arg7, @OriginalArg(8) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg4 > 0 && arg4 + local7 < 103 && arg1 + local11 > 0 && local11 + arg1 < 103) {
					arg7[arg8].flags[local7 + arg4][local11 + arg1] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(79) Packet local79 = new Packet(arg0);
		for (@Pc(81) int local81 = 0; local81 < 4; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
					if (arg5 == local81 && local85 >= arg2 && local85 < arg2 + 8 && arg6 <= local89 && local89 < arg6 + 8) {
						Static58.method990(Static7.method189(local89 & 0x7, arg3, local85 & 0x7) + arg1, arg8, arg3, 0, local79, 0, Static84.method1362(local85 & 0x7, local89 & 0x7, arg3) + arg4);
					} else {
						Static58.method990(-1, 0, 0, 0, local79, 0, -1);
					}
				}
			}
		}
	}
}

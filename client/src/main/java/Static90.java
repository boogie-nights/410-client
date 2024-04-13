import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!p;")
	public static PixMap aClass45_30;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIIII)V", line = 11)
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg2 < 1 || arg1 > 102 || arg2 > 102) {
			return;
		}
		if (client.lowMemory && client.currentLevel != arg4) {
			return;
		}
		@Pc(29) int local29 = 0;
		if (arg0 == 0) {
			local29 = client.scene.method1459(arg4, arg1, arg2);
		}
		if (arg0 == 1) {
			local29 = client.scene.method1419(arg4, arg1, arg2);
		}
		if (arg0 == 2) {
			local29 = client.scene.method1429(arg4, arg1, arg2);
		}
		if (arg0 == 3) {
			local29 = client.scene.method1458(arg4, arg1, arg2);
		}
		@Pc(92) int local92;
		if (local29 != 0) {
			@Pc(85) int local85 = local29 >> 14 & 0x7FFF;
			local92 = client.scene.getInfo(arg4, arg1, arg2, local29);
			@Pc(98) int local98 = local92 >> 6 & 0x3;
			@Pc(102) int local102 = local92 & 0x1F;
			@Pc(116) LocType local116;
			if (arg0 == 0) {
				client.scene.method1439(arg4, arg1, arg2);
				local116 = LocType.get(local85);
				if (local116.blockwalk) {
					client.levelCollisionMap[arg4].method532(local102, local116.blockrange, arg2, local98, arg1);
				}
			}
			if (arg0 == 1) {
				client.scene.method1415(arg4, arg1, arg2);
			}
			if (arg0 == 2) {
				client.scene.method1423(arg4, arg1, arg2);
				local116 = LocType.get(local85);
				if (arg1 + local116.anInt1036 > 103 || arg2 + local116.anInt1036 > 103 || arg1 + local116.anInt1040 > 103 || local116.anInt1040 + arg2 > 103) {
					return;
				}
				if (local116.blockwalk) {
					client.levelCollisionMap[arg4].method529(local116.anInt1036, local116.anInt1040, local98, local116.blockrange, arg1, arg2);
				}
			}
			if (arg0 == 3) {
				client.scene.method1413(arg4, arg1, arg2);
				local116 = LocType.get(local85);
				if (local116.blockwalk && local116.active == 1) {
					client.levelCollisionMap[arg4].method537(arg2, arg1);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local92 = arg4;
		if (arg4 < 3 && (client.levelTileFlags[1][arg1][arg2] & 0x2) == 2) {
			local92 = arg4 + 1;
		}
		World.addLoc(local92, arg2, arg3, client.levelCollisionMap[arg4], arg5, client.scene, arg6, arg4, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 257)
	public static void method1569() {
		client.entityUpdateIds = null;
		JagString.aClass40_676 = null;
		JagString.aClass40_679 = null;
		JagString.aClass40_674 = null;
		JagString.aClass40_675 = null;
		Static1.aClass2_Sub2_Sub12_Sub4Array1 = null;
		JagString.aClass40_680 = null;
		JagString.aClass40_681 = null;
		Static1.cameraModifierEnabled = null;
		JagString.FRIENDSLIST_ALREADY_ADDED = null;
		aClass45_30 = null;
		JagString.aClass40_678 = null;
	}
}

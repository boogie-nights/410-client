import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!p;")
	public static PixMap aClass45_22;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!qd;")
	public static PrivilegedRequest aClass48_6;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!p;")
	public static PixMap aClass45_23;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!p;")
	public static PixMap aClass45_24;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ke;)V", line = 91)
	public static void method1040(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt2285 == 0) {
			return;
		}
		@Pc(39) int local39;
		@Pc(32) int local32;
		if (arg0.anInt2324 != -1 && arg0.anInt2324 < 32768) {
			@Pc(23) NpcEntity local23 = client.npcs[arg0.anInt2324];
			if (local23 != null) {
				local32 = arg0.z - local23.z;
				local39 = arg0.x - local23.x;
				if (local39 != 0 || local32 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) local39, (double) local32) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2324 >= 32768) {
			local67 = arg0.anInt2324 - 32768;
			if (local67 == Static1.anInt1955) {
				local67 = 2047;
			}
			@Pc(76) PlayerEntity local76 = client.players[local67];
			if (local76 != null) {
				local32 = arg0.x - local76.x;
				@Pc(91) int local91 = arg0.z - local76.z;
				if (local32 != 0 || local91 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) local32, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2280 != 0 || arg0.anInt2292 != 0) && (arg0.pathLength == 0 || arg0.seqTrigger > 0)) {
			local39 = arg0.z - (arg0.anInt2292 - client.sceneBaseTileZ - client.sceneBaseTileZ) * 64;
			local67 = arg0.x - (arg0.anInt2280 - client.sceneBaseTileX - client.sceneBaseTileX) * 64;
			if (local67 != 0 || local39 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) local67, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt2280 = 0;
			arg0.anInt2292 = 0;
		}
		local67 = arg0.dstYaw - arg0.anInt2305 & 0x7FF;
		if (local67 == 0) {
			return;
		}
		if (local67 < arg0.anInt2285 || local67 > 2048 - arg0.anInt2285) {
			arg0.anInt2305 = arg0.dstYaw;
		} else if (local67 > 1024) {
			arg0.anInt2305 -= arg0.anInt2285;
		} else {
			arg0.anInt2305 += arg0.anInt2285;
		}
		arg0.anInt2305 &= 0x7FF;
		if (arg0.secondarySeqId != arg0.seqStandId || arg0.anInt2305 == arg0.dstYaw) {
			return;
		}
		if (arg0.anInt2276 == -1) {
			arg0.secondarySeqId = arg0.anInt2269;
			return;
		}
		arg0.secondarySeqId = arg0.anInt2276;
		return;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 188)
	public static void method1041() {
		aClass45_22 = null;
		JagString.aClass40_449 = null;
		JagString.aClass40_444 = null;
		JagString.aClass40_446 = null;
		JagString.aClass40_452 = null;
		JagString.aClass40_451 = null;
		JagString.EMPTY_STRING = null;
		client.levelTileFlags = null;
		client.socialInput = null;
		JagString.aClass40_448 = null;
		NpcType.aClass47_14 = null;
		JagString.aClass40_450 = null;
		aClass45_23 = null;
		aClass48_6 = null;
		aClass45_24 = null;
		JagString.aClass40_453 = null;
	}
}

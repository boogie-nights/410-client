import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
	public static int anInt1487;

	@OriginalMember(owner = "client!la", name = "qb", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array8;

	@OriginalMember(owner = "client!la", name = "sb", descriptor = "I")
	public static int anInt1494;

	@OriginalMember(owner = "client!la", name = "vb", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILclient!eb;IBI)V", line = 72)
	public static void method990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Packet arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(30) int local30;
		if (arg6 < 0 || arg6 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local30 = arg4.g1();
				if (local30 == 0) {
					return;
				}
				if (local30 == 1) {
					arg4.g1();
					return;
				}
				if (local30 <= 49) {
					arg4.g1();
				}
			}
		}

		client.levelTileFlags[arg1][arg6][arg0] = 0;
		while (true) {
			local30 = arg4.g1();
			if (local30 == 0) {
				if (arg1 == 0) {
					World.levelHeightmap[0][arg6][arg0] = -World.perlin(arg0 + arg3 + 556238, arg5 + 932731 + arg6) * 8;
					return;
				} else {
					World.levelHeightmap[arg1][arg6][arg0] = World.levelHeightmap[arg1 - 1][arg6][arg0] - 240;
					return;
				}
			}
			if (local30 == 1) {
				@Pc(129) int local129 = arg4.g1();
				if (local129 == 1) {
					local129 = 0;
				}
				if (arg1 == 0) {
					World.levelHeightmap[0][arg6][arg0] = -local129 * 8;
					return;
				}
				World.levelHeightmap[arg1][arg6][arg0] = World.levelHeightmap[arg1 - 1][arg6][arg0] - local129 * 8;
				return;
			}
			if (local30 <= 49) {
				World.levelTileOverlayIds[arg1][arg6][arg0] = arg4.g1b();
				World.levelTileOverlayShape[arg1][arg6][arg0] = (byte) ((local30 - 2) / 4);
				World.levelTileOverlayRotation[arg1][arg6][arg0] = (byte) (arg2 + local30 - 2 & 0x3);
			} else if (local30 <= 81) {
				client.levelTileFlags[arg1][arg6][arg0] = (byte) (local30 - 49);
			} else {
				World.levelTileUnderlayIds[arg1][arg6][arg0] = (byte) (local30 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V", line = 188)
	public static void method991() {
		aClass2_Sub2_Sub2_Sub4Array8 = null;
		JagString.aClass40_429 = null;
		JagString.aClass40_426 = null;
		JagString.aClass40_428 = null;
		anIntArray311 = null;
		JagString.aClass40_427 = null;
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V", line = 220)
	public static void method992() {
		@Pc(1) Object local1 = Static1.anObject2;
		synchronized (Static1.anObject2) {
			if (Static1.anInt1801 == 0) {
				GameShell.signlink.method207(5, new Js5CacheQueue());
			}
			Static1.anInt1801 = 600;
		}
	}
}

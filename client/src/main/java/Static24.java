import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!f", name = "O", descriptor = "Lclient!ad;")
	public static Js5 modelsJs5;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!p;")
	public static PixMap aClass45_12;

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 225)
	public static void method520() {
		while (true) {
			if (client.in.bitsAvailable(client.packetSize) >= 26) {
				@Pc(17) int local17 = client.in.gBit(14);
				if (local17 != 16383) {
					if (client.npcs[local17] == null) {
						client.npcs[local17] = new NpcEntity();
					}
					@Pc(34) NpcEntity local34 = client.npcs[local17];
					client.npcIds[client.npcCount++] = local17;
					local34.anInt2274 = client.loopCycle;
					@Pc(50) int local50 = client.in.gBit(5);
					if (local50 > 15) {
						local50 -= 32;
					}
					@Pc(61) int local61 = client.in.gBit(1);
					local34.type = NpcType.method640(client.in.gBit(13));
					@Pc(78) int local78 = client.in.gBit(5);
					@Pc(85) int local85 = client.in.gBit(1);
					if (local85 == 1) {
						Static1.anIntArray504[Static1.anInt1190++] = local17;
					}
					local34.anInt2290 = local34.type.anInt767;
					local34.anInt2303 = local34.type.anInt764;
					local34.anInt2322 = local34.type.anInt761;
					local34.anInt2304 = local34.type.anInt771;
					local34.anInt2285 = local34.type.anInt769;
					local34.size = local34.type.size;
					if (local78 > 15) {
						local78 -= 32;
					}
					local34.anInt2269 = local34.type.anInt777;
					local34.method1545(local61 == 1, client.localPlayer.pathTileZ[0] + local78, local50 + client.localPlayer.pathTileX[0]);
					continue;
				}
			}
			client.in.bytes();
			return;
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V", line = 398)
	public static void method524() {
		Static79.aClass18_1.method1280();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static1.aLongArray5[local6] = 0L;
		}
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static1.aLongArray6[local18] = 0L;
		}
		Static22.anInt587 = 0;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V", line = 441)
	public static void method525() {
		aClass45_12 = null;
		JagString.aClass40_192 = null;
		ObjType.aClass47_7 = null;
		aFontMetrics1 = null;
		modelsJs5 = null;
		JagString.aClass40_191 = null;
		World.blendSaturation = null;
	}
}

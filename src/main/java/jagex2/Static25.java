package jagex2;

import java.awt.FontMetrics;

import jagex2.dash3d.entity.NpcEntity;
import jagex2.datastruct.LruCache;
import jagex2.graphics.PixMap;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!f", name = "O", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_4;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!p;")
	public static PixMap aClass45_12;

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "[I")
	public static int[] anIntArray126;

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics boldMetrics;

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	public static int anInt667 = 2;

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "Lclient!qc;")
	public static LruCache aClass47_7 = new LruCache(100);

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_191 = Static13.method257("mapback");

	@OriginalMember(owner = "client!f", name = "sb", descriptor = "Lclient!o;")
	public static Class40 aClass40_192 = Static13.method257("Please reload this page)3");

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	public static void method520() {
		while (true) {
			if (Static56.in.method1742(Static33.size) >= 26) {
				@Pc(17) int local17 = Static56.in.gBit(14);
				if (local17 != 16383) {
					if (Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local17] == null) {
						Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local17] = new NpcEntity();
					}
					@Pc(34) NpcEntity local34 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local17];
					Static63.anIntArray326[Static73.anInt1800++] = local17;
					local34.cycle = Static107.loopCycle;
					@Pc(50) int local50 = Static56.in.gBit(5);
					if (local50 > 15) {
						local50 -= 32;
					}
					@Pc(61) int local61 = Static56.in.gBit(1);
					local34.type = Static36.method640(Static56.in.gBit(13));
					@Pc(78) int local78 = Static56.in.gBit(5);
					@Pc(85) int local85 = Static56.in.gBit(1);
					if (local85 == 1) {
						Static98.entityUpdateIds[Static53.entityUpdateCount++] = local17;
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
					local34.move(local61 == 1, Static88.localPlayer.anIntArray496[0] + local78, local50 + Static88.localPlayer.anIntArray492[0]);
					continue;
				}
			}
			Static56.in.method1739();
			return;
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public static void method524() {
		Static87.aClass18_1.method1280();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static88.aLongArray5[local6] = 0L;
		}
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static97.aLongArray6[local18] = 0L;
		}
		Static23.anInt587 = 0;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public static void method525() {
		aClass45_12 = null;
		aClass40_192 = null;
		aClass47_7 = null;
		boldMetrics = null;
		aClass5_Sub1_4 = null;
		aClass40_191 = null;
		anIntArray126 = null;
	}
}

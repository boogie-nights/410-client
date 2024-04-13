import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_6;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 4)
	public static void method345() {
		Static1.SERVER_PROT_LENGTHS = null;
		JagString.aClass40_113 = null;
		client.modalMessage = null;
		JagString.aClass40_115 = null;
		JagString.aClass40_116 = null;
		JagString.aClass40_114 = null;
		Static1.aClass40Array7 = null;
		JagString.aClass40_120 = null;
		JagString.aClass40_119 = null;
		JagString.aClass40_118 = null;
		aClass2_Sub2_Sub2_Sub3_6 = null;
		JagString.aClass40_117 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V", line = 53)
	public static void method347() {
		if (Static72.aClass24_1 == null) {
			return;
		}
		@Pc(12) long local12 = System.currentTimeMillis();
		if (Static93.aLong143 >= local12) {
			return;
		}
		Static72.aClass24_1.method1654(local12);
		@Pc(30) int local30 = (int) (local12 - Static93.aLong143);
		Static93.aLong143 = local12;
		@Pc(41) Class local41 = StubAudioChannel.class;
		synchronized (local41) {
			Static5.anInt173 += local30 * Static11.anInt291;
			@Pc(58) int local58 = (Static5.anInt173 - Static11.anInt291 * 2000) / 1000;
			if (local58 > 0) {
				if (Static20.aClass2_Sub10_1 != null) {
					Static20.aClass2_Sub10_1.method1287(local58);
				}
				Static5.anInt173 -= local58 * 1000;
			}
		}
	}
}

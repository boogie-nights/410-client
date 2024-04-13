import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!hc;")
	public static ClientStream aClass25_20;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public static int anInt840;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 56)
	public static void method637() {
		for (@Pc(7) int local7 = 0; local7 < Static1.anInt131; local7++) {
			@Pc(13) int local13 = Static1.anIntArray36[local7]--;
			if (Static1.anIntArray36[local7] >= -10) {
				@Pc(72) SoundTrack local72 = Static1.aClass43Array1[local7];
				if (local72 == null) {
					local72 = SoundTrack.method1214(client.synthSoundsJs5, Static1.anIntArray497[local7]);
					if (local72 == null) {
						continue;
					}
					Static1.anIntArray36[local7] += local72.method1215();
					Static1.aClass43Array1[local7] = local72;
				}
				if (Static1.anIntArray36[local7] < 0) {
					@Pc(109) PcmSound local109 = local72.method1216().method491(Static10.aClass56_1);
					@Pc(114) SoundPcmStream local114 = SoundPcmStream.method1032(local109, Static1.anInt2372);
					local114.method1027(Static1.anIntArray79[local7] - 1);
					Static80.aClass2_Sub10_Sub2_1.method1289(local114);
					Static1.anIntArray36[local7] = -100;
				}
			} else {
				Static1.anInt131--;
				for (@Pc(27) int local27 = local7; local27 < Static1.anInt131; local27++) {
					Static1.anIntArray497[local27] = Static1.anIntArray497[local27 + 1];
					Static1.aClass43Array1[local27] = Static1.aClass43Array1[local27 + 1];
					Static1.anIntArray79[local27] = Static1.anIntArray79[local27 + 1];
					Static1.anIntArray36[local27] = Static1.anIntArray36[local27 + 1];
				}
				local7--;
			}
		}
		if (Static1.anInt470 <= 0) {
			return;
		}
		Static1.anInt470 -= 20;
		if (Static1.anInt470 < 0) {
			Static1.anInt470 = 0;
		}
		if (Static1.anInt470 == 0 && Static1.anInt239 != 0 && Static1.anInt1977 != -1) {
			Static86.method1499(0, Static1.anInt1977, client.midiSongsJs5, Static1.anInt239);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ud;Lclient!o;Lclient!o;)[Lclient!vb;", line = 155)
	public static Pix24[] method638(@OriginalArg(1) Js5Index arg0, @OriginalArg(2) JagString arg1, @OriginalArg(3) JagString arg2) {
		@Pc(12) int local12 = arg0.method80(arg1);
		@Pc(18) int local18 = arg0.method72(arg2, local12);
		return Static91.method79(arg0, local18, local12);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V", line = 323)
	public static void method641(@OriginalArg(1) int arg0) {
		if (!Static64.method1110()) {
			return;
		}
		if (Static1.aBoolean151) {
			Static64.anInt1696 = arg0;
		} else {
			Static33.method632(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 349)
	public static void method642() {
		aClass25_20 = null;
		JagString.aClass40_258 = null;
		client.mapsJs5 = null;
		JagString.aClass40_256 = null;
		anIntArray162 = null;
		client.cameraModifierWobbleScale = null;
		Static1.anIntArray166 = null;
		JagString.aClass40_257 = null;
		Static1.aClass6_2 = null;
		client.bfsStepX = null;
		Static1.anIntArray165 = null;
	}
}

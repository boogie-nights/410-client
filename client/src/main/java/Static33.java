import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!ad;")
	public static Js5 texturesJs5;

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!ad;")
	public static Js5 synthSoundsJs5;

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!p;")
	public static PixMap aClass45_16;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 3)
	public static void method632(@OriginalArg(1) int arg0) {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Static1.anInt432 != 0) {
			if (Static23.aByteArray9 == null) {
				return;
			}
			Static26.anInt685 = arg0;
		} else if (Static1.anInt1548 >= 0) {
			Static1.anInt1548 = arg0;
			Static98.aClass12_1.method1244(0, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Z", line = 117)
	public static boolean method634(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = client.menuAction[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 51;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 141)
	public static void method635() {
		texturesJs5 = null;
		JagString.aClass40_252 = null;
		JagString.aClass40_255 = null;
		Static1.anIntArray161 = null;
		synthSoundsJs5 = null;
		client.cameraModifierWobbleSpeed = null;
		Static1.anIntArray160 = null;
		JagString.aClass40_254 = null;
		Static1.aLongArray3 = null;
		JagString.aClass40_253 = null;
		aClass45_16 = null;
	}
}

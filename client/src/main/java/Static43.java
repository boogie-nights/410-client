import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
	public static int anInt2458;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z[BBII)V", line = 18)
	public static void method1634(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Static1.anInt1548 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			Static1.anInt432 = arg2;
			if (Static1.anInt1548 == 0) {
				Static1.anInt1175 = 0;
			} else {
				@Pc(30) int local30 = Static40.method1248(Static1.anInt1548);
				@Pc(34) int local34 = local30 - Static1.anInt2474;
				Static1.anInt1175 = (Static1.anInt1175 + local34 + 3600 - 1) / Static1.anInt1175;
			}
			Static23.aByteArray9 = arg1;
			Static21.aBoolean185 = arg0;
			Static26.anInt685 = arg3;
		} else if (Static1.anInt432 == 0) {
			Static67.method1208(arg0, arg3, arg1);
		} else {
			Static23.aByteArray9 = arg1;
			Static21.aBoolean185 = arg0;
			Static26.anInt685 = arg3;
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 68)
	public static void method1635() {
		Static1.anIntArray542 = null;
		JagString.aClass40_706 = null;
		Static1.aClass40Array39 = null;
		Static1.anIntArray537 = null;
		Static1.anIntArray535 = null;
		World.blendLightness = null;
		JagString.aClass40_707 = null;
		Static1.anIntArray539 = null;
		anIntArray536 = null;
		Static1.anIntArray540 = null;
		Static1.aBooleanArray41 = null;
		Static1.anIntArray538 = null;
		Static1.anIntArray541 = null;
	}

}

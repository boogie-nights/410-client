import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public static int anInt310;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!fc;")
	public static PixFont aClass2_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 14)
	public static void method262() {
		Static1.aClass47_3.method1330();
		Static1.aClass47_15.method1330();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 30)
	public static void method263() {
		JagString.aClass40_85 = null;
		JagString.aClass40_84 = null;
		Static1.anIntArrayArray7 = null;
		aClass2_Sub2_Sub2_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!o;I)V", line = 57)
	public static void method264(@OriginalArg(0) JagString arg0) {
		if (arg0 == null || arg0.method1169() == 0) {
			Static1.anInt2066 = 0;
			return;
		}
		@Pc(27) JagString local27 = arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) JagString[] local32 = new JagString[100];
		while (true) {
			@Pc(37) int local37 = local27.method1182();
			if (local37 == -1) {
				local27 = local27.method1178();
				if (local27.method1169() > 0) {
					local32[local29++] = local27.method1196();
				}
				Static1.anInt2066 = 0;
				label46: for (local37 = 0; local37 < Static36.anInt971; local37++) {
					@Pc(98) ObjType local98 = Static97.method1669(local37);
					if (local98.anInt932 == -1 && local98.aClass40_290 != null) {
						@Pc(110) JagString local110 = local98.aClass40_290.method1196();
						for (@Pc(112) int local112 = 0; local112 < local29; local112++) {
							if (local110.method1200(local32[local112]) == -1) {
								continue label46;
							}
						}
						Static1.aClass40Array7[Static1.anInt2066] = local110;
						Static1.anIntArray166[Static1.anInt2066] = local37;
						Static1.anInt2066++;
						if (Static1.aClass40Array7.length <= Static1.anInt2066) {
							return;
						}
					}
				}
				return;
			}
			@Pc(49) JagString local49 = local27.method1180(local37, 0).method1178();
			if (local49.method1169() > 0) {
				local32[local29++] = local49.method1196();
			}
			local27 = local27.method1185(local37 + 1);
		}
	}
}

package jagex2;

import jagex2.config.ObjType;
import jagex2.graphics.PixFont;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public static int anInt310;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!fc;")
	public static PixFont aClass2_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static final int anInt311 = 7759444;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_84 = Static13.method257("Could not complete login)3");

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[104][104];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_85 = Static13.method257("@gre@Classic");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method262() {
		Static5.aClass47_3.clear();
		Static74.aClass47_15.clear();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method263() {
		aClass40_85 = null;
		aClass40_84 = null;
		anIntArrayArray7 = null;
		aClass2_Sub2_Sub2_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!o;I)V")
	public static void method264(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null || arg0.method1169() == 0) {
			Static87.anInt2066 = 0;
			return;
		}
		@Pc(27) Class40 local27 = arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) Class40[] local32 = new Class40[100];
		while (true) {
			@Pc(37) int local37 = local27.method1182();
			if (local37 == -1) {
				local27 = local27.method1178();
				if (local27.method1169() > 0) {
					local32[local29++] = local27.method1196();
				}
				Static87.anInt2066 = 0;
				label46: for (local37 = 0; local37 < Static38.anInt971; local37++) {
					@Pc(98) ObjType local98 = Static105.get(local37);
					if (local98.certTemplate == -1 && local98.name != null) {
						@Pc(110) Class40 local110 = local98.name.method1196();
						for (@Pc(112) int local112 = 0; local112 < local29; local112++) {
							if (local110.method1200(local32[local112]) == -1) {
								continue label46;
							}
						}
						Static17.aClass40Array7[Static87.anInt2066] = local110;
						Static36.anIntArray166[Static87.anInt2066] = local37;
						Static87.anInt2066++;
						if (Static17.aClass40Array7.length <= Static87.anInt2066) {
							return;
						}
					}
				}
				return;
			}
			@Pc(49) Class40 local49 = local27.method1180(local37, 0).method1178();
			if (local49.method1169() > 0) {
				local32[local29++] = local49.method1196();
			}
			local27 = local27.method1185(local37 + 1);
		}
	}
}

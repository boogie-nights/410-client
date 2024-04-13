import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!p;")
	public static PixMap aClass45_12;

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

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
		client.modelsJs5 = null;
		JagString.aClass40_191 = null;
		World.blendSaturation = null;
	}
}

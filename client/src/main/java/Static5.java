import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	public static int anInt173;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!ad;")
	public static Js5 configJs5;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 11)
	public static void method115() {
		if (Static1.anInt797 < 2 && Static1.anInt1874 == 0 && Static1.anInt641 == 0) {
			return;
		}
		@Pc(47) JagString local47;
		if (Static1.anInt1874 == 1 && Static1.anInt797 < 2) {
			local47 = Static72.method1334(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_333 });
		} else if (Static1.anInt641 == 1 && Static1.anInt797 < 2) {
			local47 = Static72.method1334(new JagString[] { JagString.aClass40_567, JagString.aClass40_61 });
		} else {
			local47 = Static1.aClass40Array8[Static1.anInt797 - 1];
		}
		if (Static1.anInt797 > 2) {
			local47 = Static72.method1334(new JagString[] { local47, JagString.aClass40_45, Static48.method859(Static1.anInt797 - 2), JagString.aClass40_455 });
		}
		Static13.aClass2_Sub2_Sub2_Sub2_1.method580(local47, 4, 16777215, Static1.anInt2511 / 1000);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lclient!ee;", line = 38)
	public static SpotAnimType method116(@OriginalArg(1) int arg0) {
		@Pc(15) SpotAnimType local15 = (SpotAnimType) Static1.aClass47_3.get((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static49.aClass5_18.fetchFile(arg0, 13);
		local15 = new SpotAnimType();
		local15.anInt634 = arg0;
		if (local25 != null) {
			local15.method504(new Packet(local25));
		}
		Static1.aClass47_3.put((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V", line = 85)
	public static void method118() {
		Static1.anIntArray36 = null;
		JagString.aClass40_47 = null;
		JagString.aClass40_43 = null;
		Static1.aClass44_1 = null;
		Static1.aClass47_3 = null;
		configJs5 = null;
		World.ROTATION_WALL_TYPE = null;
		JagString.aClass40_46 = null;
		JagString.aClass40_44 = null;
		JagString.aClass40_45 = null;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)I", line = 144)
	public static int method120() {
		return 5;
	}
}

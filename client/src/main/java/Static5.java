import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	public static int anInt173;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!ad;")
	public static Js5 configJs5;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 11)
	public static void method115() {
		if (client.menuSize < 2 && client.objSelected == 0 && client.spellSelected == 0) {
			return;
		}
		@Pc(47) JagString local47;
		if (client.objSelected == 1 && client.menuSize < 2) {
			local47 = JagString.concatenate(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_333 });
		} else if (client.spellSelected == 1 && client.menuSize < 2) {
			local47 = JagString.concatenate(new JagString[] { JagString.aClass40_567, JagString.aClass40_61 });
		} else {
			local47 = client.menuOption[client.menuSize - 1];
		}
		if (client.menuSize > 2) {
			local47 = JagString.concatenate(new JagString[] { local47, JagString.aClass40_45, Static48.method859(client.menuSize - 2), JagString.aClass40_455 });
		}
		Static13.aClass2_Sub2_Sub2_Sub2_1.method580(local47, 4, 16777215, client.loopCycle / 1000);
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V", line = 85)
	public static void method118() {
		Static1.anIntArray36 = null;
		JagString.aClass40_47 = null;
		JagString.aClass40_43 = null;
		Static1.aClass44_1 = null;
		SpotAnimType.aClass47_3 = null;
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

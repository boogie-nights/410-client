import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "Lclient!fc;")
	public static PixFont aClass2_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ia", name = "Pb", descriptor = "Lclient!eb;")
	public static Packet aClass2_Sub3_3;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 135)
	public static void method768(@OriginalArg(1) Graphics arg0) {
		Static38.aClass45_20.draw(arg0, 0, 4);
		Static28.aClass45_15.draw(arg0, 0, 357);
		Static72.aClass45_28.draw(arg0, 722, 4);
		Static27.aClass45_13.draw(arg0, 743, 205);
		Static84.aClass45_29.draw(arg0, 0, 0);
		Static19.aClass45_10.draw(arg0, 516, 4);
		Static1.aClass45_1.draw(arg0, 516, 205);
		Static41.aClass45_21.draw(arg0, 496, 357);
		Static18.aClass45_9.draw(arg0, 0, 338);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V", line = 528)
	public static void method774(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static84.aBooleanArray31[arg0]) {
			return;
		}
		Static49.aClass5_17.method67(arg0);
		if (ComType.instances[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < ComType.instances[arg0].length; local28++) {
			if (ComType.instances[arg0][local28] != null) {
				if (ComType.instances[arg0][local28].type == 2) {
					local26 = false;
				} else {
					ComType.instances[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			ComType.instances[arg0] = null;
		}
		Static84.aBooleanArray31[arg0] = false;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V", line = 589)
	public static void method775() {
		JagString.aClass40_320 = null;
		JagString.aClass40_323 = null;
		JagString.aClass40_317 = null;
		JagString.aClass40_322 = null;
		JagString.aClass40_321 = null;
		aClass2_Sub2_Sub2_Sub2_2 = null;
		JagString.aClass40_318 = null;
		aClass2_Sub3_3 = null;
		JagString.aClass40_319 = null;
		JagString.aClass40_314 = null;
	}
}

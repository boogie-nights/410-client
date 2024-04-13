import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lclient!cb;")
	public static Cache[] aClass11Array2;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_7;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_8;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "Lclient!ba;")
	public static HashTable aClass6_1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I", line = 22)
	public static int method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg1);
		return Static82.aClass2_Sub2_Sub9_1 != null && Static82.aClass2_Sub2_Sub9_1.key == local10 ? Static27.aClass2_Sub3_2.pos * 99 / (Static27.aClass2_Sub3_2.data.length - Static82.aClass2_Sub2_Sub9_1.trailerLen) + 1 : 0;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 107)
	public static void method593() {
		aClass11Array2 = null;
		aClass2_Sub2_Sub2_Sub3_7 = null;
		aClass6_1 = null;
		JagString.aClass40_229 = null;
		World.levelOccludemap = null;
		JagString.aClass40_230 = null;
		aClass2_Sub2_Sub2_Sub3_8 = null;
		JagString.aClass40_228 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 131)
	public static void method594(@OriginalArg(1) Graphics arg0) {
		Static11.aClass45_6.draw(arg0, 550, 4);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 152)
	public static void method595() {
		Static63.method335(false, null, 0, 10);
	}
}

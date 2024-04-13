import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lclient!p;")
	public static PixMap aClass45_4;

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
	public static int anInt135;

	@OriginalMember(owner = "client!ad", name = "Jb", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 5)
	public static void method83(@OriginalArg(1) Graphics arg0) {
		Static56.aClass45_23.draw(arg0, 17, 357);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ud;Lclient!o;BLclient!o;)[Lclient!qb;", line = 72)
	public static Pix8[] method85(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) JagString arg1, @OriginalArg(3) JagString arg2) {
		@Pc(9) int local9 = arg0.method80(arg1);
		@Pc(15) int local15 = arg0.method72(arg2, local9);
		return Static7.method194(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ge;I)V", line = 87)
	public static void method86(@OriginalArg(0) LocTemporary arg0) {
		@Pc(6) int local6 = 0;
		if (arg0.anInt823 == 0) {
			local6 = client.scene.method1459(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.anInt823 == 1) {
			local6 = client.scene.method1419(arg0.level, arg0.x, arg0.z);
		}
		@Pc(40) int local40 = -1;
		if (arg0.anInt823 == 2) {
			local6 = client.scene.method1429(arg0.level, arg0.x, arg0.z);
		}
		@Pc(55) int local55 = 0;
		if (arg0.anInt823 == 3) {
			local6 = client.scene.method1458(arg0.level, arg0.x, arg0.z);
		}
		@Pc(70) int local70 = 0;
		if (local6 != 0) {
			local40 = local6 >> 14 & 0x7FFF;
			@Pc(88) int local88 = client.scene.getInfo(arg0.level, arg0.x, arg0.z, local6);
			local70 = local88 >> 6 & 0x3;
			local55 = local88 & 0x1F;
		}
		arg0.anInt820 = local40;
		arg0.anInt825 = local70;
		arg0.anInt830 = local55;
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V", line = 563)
	public static void method96() {
		aClass45_4 = null;
		anIntArray17 = null;
		JagString.aClass40_30 = null;
		JagString.aClass40_29 = null;
	}
}

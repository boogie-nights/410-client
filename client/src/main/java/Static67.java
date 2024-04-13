import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 601)
	public static void method1206() {
		JagString.aClass40_519 = null;
		JagString.aClass40_516 = null;
		JagString.aClass40_513 = null;
		JagString.aClass40_515 = null;
		JagString.aClass40_512 = null;
		JagString.aClass40_517 = null;
		Static1.aBooleanArray27 = null;
		client.playerIds = null;
		JagString.aClass40_521 = null;
		Static1.aClass30_1 = null;
		JagString.aClass40_511 = null;
		LocType.aClass5_23 = null;
		JagString.aClass40_518 = null;
		JagString.aClass40_520 = null;
		anIntArray407 = null;
		JagString.aClass40_514 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 630)
	public static void method1207(@OriginalArg(1) Graphics arg0) {
		Static7.aClass45_5.draw(arg0, 553, 205);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII[B)V", line = 655)
	public static void method1208(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Static1.anInt1548 >= 0) {
			Static98.aClass12_1.method1241();
			Static1.anInt432 = 20;
			Static1.anInt2474 = 0;
			Static23.aByteArray9 = null;
			Static1.anInt1548 = -1;
		}
		if (arg2 == null) {
			return;
		}
		if (Static1.anInt432 > 0) {
			Static98.aClass12_1.method1251();
			Static1.anInt432 = 0;
		}
		Static1.anInt1548 = arg1;
		Static98.aClass12_1.method1250(arg0, arg2, arg1);
	}
}

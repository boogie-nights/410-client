import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!p;")
	public static PixMap aClass45_26;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 5)
	public static void method1096() {
		JagString.aClass40_486 = null;
		JagString.aClass40_488 = null;
		JagString.aClass40_482 = null;
		Static1.anIntArray339 = null;
		JagString.aClass40_487 = null;
		JagString.BUTTON_CONTINUE = null;
		aClass45_26 = null;
		JagString.aClass40_485 = null;
		JagString.aClass40_483 = null;
		JagString.aClass40_489 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 38)
	public static void method1097(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static1.aClass62_1);
		arg0.addMouseMotionListener(Static1.aClass62_1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V", line = 54)
	public static void method1098(@OriginalArg(0) boolean arg0) {
		client.heartbeatTimer++;
		if (client.heartbeatTimer < 50 && !arg0) {
			return;
		}
		client.heartbeatTimer = 0;
		if (Static1.aBoolean164 || client.stream == null) {
			return;
		}
		client.out.pIsaac1(217);
		try {
			client.stream.write(client.out.data, client.out.pos);
			client.out.pos = 0;
		} catch (@Pc(40) IOException local40) {
			Static1.aBoolean164 = true;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)I", line = 137)
	public static int method1100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 166)
	public static void method1101() {
		@Pc(7) Keyboard local7 = Static1.aClass30_1;
		synchronized (Static1.aClass30_1) {
			Static1.anInt1094 = Static1.anInt437;
			@Pc(20) int local20;
			if (Static1.anInt949 >= 0) {
				while (Static1.anInt949 != Static1.anInt2342) {
					local20 = Static1.anIntArray470[Static1.anInt2342];
					Static1.anInt2342 = Static1.anInt2342 + 1 & 0x7F;
					if (local20 >= 0) {
						client.actionKey[local20] = true;
					} else {
						client.actionKey[~local20] = false;
					}
				}
			} else {
				for (local20 = 0; local20 < 112; local20++) {
					client.actionKey[local20] = false;
				}
				Static1.anInt949 = Static1.anInt2342;
			}
			Static1.anInt437 = Static1.anInt2226;
		}
	}
}

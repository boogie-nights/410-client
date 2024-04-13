import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public static int baseZ;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 4)
	public static void method1466() {
		aByteArrayArray10 = null;
		World.levelHeightmap = null;
		JagString.aClass40_612 = null;
		client.levelObjStacks = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;Lclient!o;II)V", line = 32)
	public static void method1467(@OriginalArg(0) Color arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) int arg2) {
		if (Static20.aFont1 == null) {
			Static20.aFont1 = new Font("Helvetica", 1, 13);
			Static24.aFontMetrics1 = GameShell.method185().getFontMetrics(Static20.aFont1);
		}
		if (Static1.aBoolean1) {
			Static1.aBoolean1 = false;
			client.graphics.setColor(Color.black);
			client.graphics.fillRect(0, 0, Static77.anInt1991, Static70.anInt2154);
		}
		if (arg0 == null) {
			arg0 = new Color(140, 17, 17);
		}
		try {
			if (Static71.anImage4 == null) {
				Static71.anImage4 = GameShell.method185().createImage(304, 34);
			}
			@Pc(58) Graphics local58 = Static71.anImage4.getGraphics();
			local58.setColor(arg0);
			local58.drawRect(0, 0, 303, 33);
			local58.fillRect(2, 2, arg2 * 3, 30);
			local58.setColor(Color.black);
			local58.drawRect(1, 1, 301, 31);
			local58.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
			local58.setFont(Static20.aFont1);
			local58.setColor(Color.white);
			arg1.method1194(22, local58, (304 - arg1.method1181(Static24.aFontMetrics1)) / 2);
			client.graphics.drawImage(Static71.anImage4, Static77.anInt1991 / 2 - 152, Static70.anInt2154 / 2 + -18, null);
		} catch (@Pc(135) Exception local135) {
			@Pc(141) int local141 = Static77.anInt1991 / 2 - 152;
			@Pc(147) int local147 = Static70.anInt2154 / 2 - 18;
			client.graphics.setColor(arg0);
			client.graphics.drawRect(local141, local147, 303, 33);
			client.graphics.fillRect(local141 + 2, local147 - -2, arg2 * 3, 30);
			client.graphics.setColor(Color.black);
			client.graphics.drawRect(local141 + 1, local147 - -1, 301, 31);
			client.graphics.fillRect(local141 + arg2 * 3 + 2, local147 + 2, 300 - arg2 * 3, 30);
			client.graphics.setFont(Static20.aFont1);
			client.graphics.setColor(Color.white);
			arg1.method1194(local147 + 22, client.graphics, (304 - arg1.method1181(Static24.aFontMetrics1)) / 2 + local141);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ke;II)V", line = 97)
	public static void method1468(@OriginalArg(0) PathingEntity arg0, @OriginalArg(1) int arg1) {
		if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
			arg0.anInt2297 = 0;
			arg0.anInt2277 = 0;
			arg0.anInt2302 = -1;
			arg0.primarySeqId = -1;
			arg0.x = arg0.size * 64 + arg0.pathTileX[0] * 128;
			arg0.z = arg0.size * 64 + arg0.pathTileZ[0] * 128;
			arg0.method1543();
		}
		if (client.localPlayer == arg0 && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.anInt2302 = -1;
			arg0.anInt2277 = 0;
			arg0.primarySeqId = -1;
			arg0.anInt2297 = 0;
			arg0.x = arg0.pathTileX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.pathTileZ[0] * 128 + arg0.size * 64;
			arg0.method1543();
		}
		if (client.loopCycle < arg0.anInt2277) {
			Static3.method25(arg0);
		} else if (arg0.anInt2297 >= client.loopCycle) {
			client.startForceMovement(arg0);
		} else {
			client.updateMovement(arg0);
		}
		Static56.method1040(arg0);
		Static88.method1553(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BLclient!ud;)V", line = 248)
	public static void method1471(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Js5Index arg1, @OriginalArg(3) Js5Index arg2) {
		Static74.aClass5_26 = arg2;
		Static49.aClass5_17 = arg1;
		Static54.aClass5_20 = arg0;
		ComType.instances = new ComType[Static49.aClass5_17.method71()][];
		Static84.aBooleanArray31 = new boolean[Static49.aClass5_17.method71()];
	}
}

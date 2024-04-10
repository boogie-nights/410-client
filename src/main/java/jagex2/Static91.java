package jagex2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import jagex2.config.ComType;
import jagex2.config.IdkType;
import jagex2.config.LocType;
import jagex2.dash3d.entity.PathingEntity;
import jagex2.datastruct.LinkedList;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public static int anInt2138;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "[[[I")
	public static int[][][] levelHeightMap = new int[4][105][105];

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	public static int hintType = 0;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "[[[Lclient!od;")
	public static LinkedList[][][] levelObjStacks = new LinkedList[4][104][104];

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public static int anInt2143 = 0;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_612 = Static13.method257("_");

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	public static int anInt2146 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public static void method1466() {
		aByteArrayArray10 = null;
		levelHeightMap = null;
		aClass40_612 = null;
		levelObjStacks = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;Lclient!o;II)V")
	public static void drawProgress(@OriginalArg(0) Color color, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int percent) {
		if (Static21.bold == null) {
			Static21.bold = new Font("Helvetica", 1, 13);
			Static25.boldMetrics = Static7.method185().getFontMetrics(Static21.bold);
		}
		if (Static1.clearScreen) {
			Static1.clearScreen = false;
			Static24.graphics.setColor(Color.black);
			Static24.graphics.fillRect(0, 0, Static85.width, Static76.height);
		}
		if (color == null) {
			color = new Color(140, 17, 17);
		}
		try {
			if (Static79.anImage4 == null) {
				Static79.anImage4 = Static7.method185().createImage(304, 34);
			}
			@Pc(58) Graphics progress = Static79.anImage4.getGraphics();
			progress.setColor(color);
			progress.drawRect(0, 0, 303, 33);
			progress.fillRect(2, 2, percent * 3, 30);
			progress.setColor(Color.black);
			progress.drawRect(1, 1, 301, 31);
			progress.fillRect(percent * 3 + 2, 2, 300 - percent * 3, 30);
			progress.setFont(Static21.bold);
			progress.setColor(Color.white);
			arg1.method1194(22, progress, (304 - arg1.method1181(Static25.boldMetrics)) / 2);
			Static24.graphics.drawImage(Static79.anImage4, Static85.width / 2 - 152, Static76.height / 2 + -18, null);
		} catch (@Pc(135) Exception ex) {
			@Pc(141) int centerWidth = Static85.width / 2 - 152;
			@Pc(147) int centerHeight = Static76.height / 2 - 18;
			Static24.graphics.setColor(color);
			Static24.graphics.drawRect(centerWidth, centerHeight, 303, 33);
			Static24.graphics.fillRect(centerWidth + 2, centerHeight - -2, percent * 3, 30);
			Static24.graphics.setColor(Color.black);
			Static24.graphics.drawRect(centerWidth + 1, centerHeight - -1, 301, 31);
			Static24.graphics.fillRect(centerWidth + percent * 3 + 2, centerHeight + 2, 300 - percent * 3, 30);
			Static24.graphics.setFont(Static21.bold);
			Static24.graphics.setColor(Color.white);
			arg1.method1194(centerHeight + 22, Static24.graphics, (304 - arg1.method1181(Static25.boldMetrics)) / 2 + centerWidth);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ke;II)V")
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
		if (Static88.localPlayer == arg0 && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.anInt2302 = -1;
			arg0.anInt2277 = 0;
			arg0.primarySeqId = -1;
			arg0.anInt2297 = 0;
			arg0.x = arg0.pathTileX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.pathTileZ[0] * 128 + arg0.size * 64;
			arg0.method1543();
		}
		if (Static107.loopCycle < arg0.anInt2277) {
			Static3.method25(arg0);
		} else if (arg0.anInt2297 >= Static107.loopCycle) {
			Static1.method4(arg0);
		} else {
			Static43.method1240(arg0);
		}
		Static61.method1040(arg0);
		Static96.method1553(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Lclient!v;")
	public static IdkType method1469(@OriginalArg(1) int arg0) {
		@Pc(10) IdkType local10 = (IdkType) Static103.aClass47_22.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static68.aClass5_5.method68(arg0, 3);
		local10 = new IdkType();
		if (local20 != null) {
			local10.method1587(new Packet(local20));
		}
		Static103.aClass47_22.put((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Lclient!ia;")
	public static LocType method1470(@OriginalArg(1) int arg0) {
		@Pc(10) LocType local10 = (LocType) Static41.aClass47_11.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static73.aClass5_23.method68(arg0, 6);
		local10 = new LocType();
		local10.anInt1033 = arg0;
		if (local25 != null) {
			local10.method767(new Packet(local25));
		}
		local10.method772();
		if (local10.aBoolean83) {
			local10.blockwalk = false;
			local10.aBoolean79 = false;
		}
		Static41.aClass47_11.put((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BLclient!ud;)V")
	public static void method1471(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		Static82.aClass5_26 = arg2;
		Static54.aClass5_17 = arg1;
		Static59.aClass5_20 = arg0;
		Static51.aClass2_Sub2_Sub13ArrayArray1 = new ComType[Static54.aClass5_17.method71()][];
		Static92.aBooleanArray31 = new boolean[Static54.aClass5_17.method71()];
	}
}

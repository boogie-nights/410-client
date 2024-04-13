import java.awt.Image;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public static int anInt1867;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 377)
	public static void method1277() {
		if (client.lowMemory && client.currentLevel != Static1.anInt786) {
			Static74.method1343(Static51.anInt2327, client.currentLevel, client.localPlayer.pathTileZ[0], client.localPlayer.pathTileX[0], Static45.anInt2262);
		} else if (Static1.anInt2590 != client.currentLevel) {
			Static1.anInt2590 = client.currentLevel;
			Static18.method369(client.currentLevel);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 410)
	public static void method1278() {
		anImage4 = null;
		JagString.aClass40_544 = null;
		ByteArrayPool.maxPool = null;
		client.levelCollisionMap = null;
		JagString.aClass40_545 = null;
		JagString.aClass40_543 = null;
		client.cameraModifierCycle = null;
		client.anIntArray416 = null;
		JagString.aClass40_542 = null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 441)
	public static void method1279() {
		@Pc(1) Object local1 = Static1.anObject2;
		synchronized (local1) {
			if (Static1.anInt1801 != 0) {
				Static1.anInt1801 = 1;
				try {
					Static1.anObject2.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}
}

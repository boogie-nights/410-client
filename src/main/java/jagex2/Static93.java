package jagex2;

import java.awt.Graphics;

import jagex2.dash3d.World3D;
import jagex2.datastruct.HashTable;
import jagex2.graphics.Pix24;
import jagex2.graphics.Pix8;
import jagex2.graphics.Static6;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Z")
	public static boolean aBoolean166;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!sd;")
	public static World3D scene;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!vb;")
	public static Pix24 imageMinimap;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[Lclient!qb;")
	public static Pix8[] aClass2_Sub2_Sub2_Sub3Array12;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt2175 = -1;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!ba;")
	public static HashTable aClass6_6 = new HashTable(4096);

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt2177 = 128;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public static int anInt2179 = 256;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int anInt2180 = 0;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_623 = Static13.method257("Your profile will be transferred in: ");

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_624 = Static13.method257(" you requested@lre@ new recovery*6n@lre@questions)3@yel@ The requested change will occur*6non: @lre@");

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public static int energy = 0;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	public static int anInt2182 = 0;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!o;")
	public static Class40 textPreparedSoundEngine = Static13.method257("Prepared sound engine");

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_626 = Static13.method257("Loading friend list");

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_627 = Static13.method257("scroll:");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method1485() {
		Static19.anIntArray86 = null;
		Static97.anIntArray503 = null;
		Static91.aByteArrayArray10 = null;
		Static83.anIntArray430 = null;
		Static20.anIntArray92 = null;
		Static66.anIntArray338 = null;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method1486() {
		Static61.areaMapBack.bind();
		Static53.aClass2_Sub2_Sub2_Sub3_13.draw(0, 0);
		Static84.anIntArray431 = Static6.method175(Static84.anIntArray431);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[IIZILjava/awt/Graphics;)V")
	public static void method1487(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Graphics arg4) {
		Static25.aClass45_12.bind();
		Static102.aClass2_Sub2_Sub2_Sub3_23.draw(0, 0);
		if (arg3) {
			if (arg1[arg0] != -1) {
				if (arg0 == 0) {
					Static2.aClass2_Sub2_Sub2_Sub3_1.draw(22, 10);
				}
				if (arg0 == 1) {
					Static15.aClass2_Sub2_Sub2_Sub3_17.draw(54, 8);
				}
				if (arg0 == 2) {
					Static15.aClass2_Sub2_Sub2_Sub3_17.draw(82, 8);
				}
				if (arg0 == 3) {
					Static51.aClass2_Sub2_Sub2_Sub3_10.draw(110, 8);
				}
				if (arg0 == 4) {
					Static97.aClass2_Sub2_Sub2_Sub3_22.draw(153, 8);
				}
				if (arg0 == 5) {
					Static97.aClass2_Sub2_Sub2_Sub3_22.draw(181, 8);
				}
				if (arg0 == 6) {
					Static83.aClass2_Sub2_Sub2_Sub3_20.draw(209, 9);
				}
			}
			if (arg1[0] != -1 && arg2 != 0) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[0].draw(29, 13);
			}
			if (arg1[1] != -1 && arg2 != 1) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[1].draw(53, 11);
			}
			if (arg1[2] != -1 && arg2 != 2) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[2].draw(82, 11);
			}
			if (arg1[3] != -1 && arg2 != 3) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[3].draw(115, 12);
			}
			if (arg1[4] != -1 && arg2 != 4) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[4].draw(153, 13);
			}
			if (arg1[5] != -1 && arg2 != 5) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[5].draw(180, 11);
			}
			if (arg1[6] != -1 && arg2 != 6) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[6].draw(208, 13);
			}
		}
		Static25.aClass45_12.draw(arg4, 516, 160);
		Static68.aClass45_8.bind();
		Static15.aClass2_Sub2_Sub2_Sub3_18.draw(0, 0);
		if (arg3) {
			if (arg1[arg0] != -1) {
				if (arg0 == 7) {
					Static32.aClass2_Sub2_Sub2_Sub3_7.draw(42, 0);
				}
				if (arg0 == 8) {
					Static103.aClass2_Sub2_Sub2_Sub3_24.draw(74, 0);
				}
				if (arg0 == 9) {
					Static103.aClass2_Sub2_Sub2_Sub3_24.draw(102, 0);
				}
				if (arg0 == 10) {
					Static53.aClass2_Sub2_Sub2_Sub3_12.draw(130, 1);
				}
				if (arg0 == 11) {
					Static3.aClass2_Sub2_Sub2_Sub3_2.draw(173, 0);
				}
				if (arg0 == 12) {
					Static3.aClass2_Sub2_Sub2_Sub3_2.draw(201, 0);
				}
				if (arg0 == 13) {
					Static33.aClass2_Sub2_Sub2_Sub3_9.draw(229, 0);
				}
			}
			if (arg1[8] != -1 && arg2 != 8) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[7].draw(74, 2);
			}
			if (arg1[9] != -1 && arg2 != 9) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[8].draw(102, 3);
			}
			if (arg1[10] != -1 && arg2 != 10) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[9].draw(137, 4);
			}
			if (arg1[11] != -1 && arg2 != 11) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[10].draw(174, 2);
			}
			if (arg1[12] != -1 && arg2 != 12) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[11].draw(201, 2);
			}
			if (arg1[13] != -1 && arg2 != 13) {
				Static81.aClass2_Sub2_Sub2_Sub3Array10[12].draw(226, 2);
			}
		}
		Static68.aClass45_8.draw(arg4, 496, 466);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method1488() {
		aClass40_627 = null;
		textPreparedSoundEngine = null;
		aClass40_626 = null;
		aClass40_623 = null;
		aClass2_Sub2_Sub2_Sub3Array12 = null;
		imageMinimap = null;
		scene = null;
		aClass40_624 = null;
		aClass6_6 = null;
	}
}

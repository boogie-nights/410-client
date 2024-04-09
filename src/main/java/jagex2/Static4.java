package jagex2;

import java.awt.Graphics;

import jagex2.config.ComType;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixMap;
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

	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "I")
	public static int anInt131 = 0;

	@OriginalMember(owner = "client!ad", name = "xb", descriptor = "Lclient!o;")
	public static Class40 aClass40_29 = Static13.method257("backright2");

	@OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
	public static int anInt139 = -1;

	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
	public static int anInt140 = 1;

	@OriginalMember(owner = "client!ad", name = "Fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_30 = Static13.method257(" @whi@");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Graphics;)V")
	public static void method83(@OriginalArg(1) Graphics arg0) {
		Static61.areaMapBack.draw(arg0, 17, 357);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)I")
	public static int perlin(@OriginalArg(2) int x, @OriginalArg(1) int z) {
		@Pc(40) int value = Static107.perlin(4, x + 45365, z + 91923) + (Static107.perlin(2, x + 10294, z + 37821) - 128 >> 1) + (Static107.perlin(1, x, z) + -128 >> 2) - 128;
		value = (int) ((double) value * 0.3D) + 35;
		if (value < 10) {
			value = 10;
		} else if (value > 60) {
			value = 60;
		}
		return value;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ud;Lclient!o;BLclient!o;)[Lclient!qb;")
	public static Pix8[] method85(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(9) int local9 = arg0.method80(arg1);
		@Pc(15) int local15 = arg0.method72(arg2, local9);
		return Static7.method194(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ge;I)V")
	public static void method86(@OriginalArg(0) LocTemporary arg0) {
		@Pc(6) int local6 = 0;
		if (arg0.layer == 0) {
			local6 = Static93.scene.getWallBitset(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.layer == 1) {
			local6 = Static93.scene.getWallDecorationBitset(arg0.level, arg0.x, arg0.z);
		}
		@Pc(40) int local40 = -1;
		if (arg0.layer == 2) {
			local6 = Static93.scene.getLocBitset(arg0.level, arg0.x, arg0.z);
		}
		@Pc(55) int local55 = 0;
		if (arg0.layer == 3) {
			local6 = Static93.scene.getGroundDecorationBitset(arg0.level, arg0.x, arg0.z);
		}
		@Pc(70) int local70 = 0;
		if (local6 != 0) {
			local40 = local6 >> 14 & 0x7FFF;
			@Pc(88) int local88 = Static93.scene.getInfo(arg0.level, arg0.x, arg0.z, local6);
			local70 = local88 >> 6 & 0x3;
			local55 = local88 & 0x1F;
		}
		arg0.anInt820 = local40;
		arg0.anInt825 = local70;
		arg0.anInt830 = local55;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(III)I")
	public static int noise(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		@Pc(10) int n = x + y * 57;
		@Pc(16) int n1 = n ^ n << 13;
		@Pc(30) int n2 = Integer.MAX_VALUE & (n1 * n1 * 15731 + 789221) * n1 + 1376312589;
		return n2 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!mc;Lclient!o;I)Lclient!o;")
	public static Class40 method94(@OriginalArg(0) ComType arg0, @OriginalArg(1) Class40 arg1) {
		if (arg1.method1200(Static59.aClass40_430) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method1200(Static74.aClass40_525);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method1200(Static48.aClass40_344);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method1200(Static68.aClass40_102);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method1200(Static98.aClass40_681);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method1200(Static70.aClass40_495);
											if (local13 == -1) {
												return arg1;
											}
											arg1 = Static80.method1334(new Class40[] { arg1.method1180(local13, 0), Static100.method1581(Static107.method1660(4, arg0)), arg1.method1185(local13 + 2) });
										}
									}
									arg1 = Static80.method1334(new Class40[] { arg1.method1180(local13, 0), Static100.method1581(Static107.method1660(3, arg0)), arg1.method1185(local13 + 2) });
								}
							}
							arg1 = Static80.method1334(new Class40[] { arg1.method1180(local13, 0), Static100.method1581(Static107.method1660(2, arg0)), arg1.method1185(local13 + 2) });
						}
					}
					arg1 = Static80.method1334(new Class40[] { arg1.method1180(local13, 0), Static100.method1581(Static107.method1660(1, arg0)), arg1.method1185(local13 + 2) });
				}
			}
			arg1 = Static80.method1334(new Class40[] { arg1.method1180(local13, 0), Static100.method1581(Static107.method1660(0, arg0)), arg1.method1185(local13 + 2) });
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V")
	public static void method96() {
		aClass45_4 = null;
		anIntArray17 = null;
		aClass40_30 = null;
		aClass40_29 = null;
	}
}

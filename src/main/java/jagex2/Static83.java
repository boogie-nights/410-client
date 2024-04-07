package jagex2;

import java.awt.Component;

import jagex2.config.ComType;
import jagex2.config.ObjType;
import jagex2.dash3d.CollisionMap;
import jagex2.datastruct.LinkedList;
import jagex2.graphics.Class2_Sub2_Sub12;
import jagex2.graphics.GraphicsProducingBuffer;
import jagex2.graphics.GraphicsProducingBuffer_Sub1;
import jagex2.graphics.Model;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
	public static int[] anIntArray428;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public static int anInt1960;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt1963;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_20;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
	public static int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_567 = null;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	public static int anInt1955 = -1;

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
	public static int anInt1966 = 0;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Lclient!o;")
	public static Class40 aClass40_568 = Static13.method257("glow3:");

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "[Lclient!ad;")
	public static Class5_Sub1[] aClass5_Sub1Array1 = new Class5_Sub1[256];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIII)Lclient!o;")
	public static Class40 method1347(@OriginalArg(2) int arg0) {
		@Pc(5) int local5 = 1;
		@Pc(17) int local17 = arg0 / 10;
		while (local17 != 0) {
			local17 /= 10;
			local5++;
		}
		@Pc(30) int local30 = local5;
		if (arg0 < 0) {
			local30 = local5 + 1;
		}
		@Pc(38) byte[] local38 = new byte[local30];
		if (arg0 < 0) {
			local38[0] = 45;
		}
		for (@Pc(56) int local56 = 0; local56 < local5; local56++) {
			@Pc(61) int local61 = arg0 % 10;
			if (local61 < 0) {
				local61 = -local61;
			}
			if (local61 > 9) {
				local61 += 39;
			}
			local38[local30 - local56 - 1] = (byte) (local61 + 48);
			arg0 /= 10;
		}
		@Pc(101) Class40 local101 = new Class40();
		local101.aByteArray14 = local38;
		local101.anInt1783 = local30;
		return local101;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1348() {
		@Pc(16) int local16 = Static36.anInt840 * 128 + 64;
		@Pc(22) int local22 = Static76.anInt2149 * 128 + 64;
		@Pc(30) int local30 = Static86.method1383(Static1.currentLevel, local22, local16) - Static49.anInt2259;
		if (local16 > Static15.anInt1863) {
			Static15.anInt1863 += Static19.anInt439 + (local16 - Static15.anInt1863) * Static56.anInt2325 / 1000;
			if (local16 < Static15.anInt1863) {
				Static15.anInt1863 = local16;
			}
		}
		if (Static15.anInt1863 > local16) {
			Static15.anInt1863 -= (Static15.anInt1863 - local16) * Static56.anInt2325 / 1000 + Static19.anInt439;
			if (local16 > Static15.anInt1863) {
				Static15.anInt1863 = local16;
			}
		}
		if (Static81.anInt1935 < local30) {
			Static81.anInt1935 += (local30 - Static81.anInt1935) * Static56.anInt2325 / 1000 + Static19.anInt439;
			if (local30 < Static81.anInt1935) {
				Static81.anInt1935 = local30;
			}
		}
		local16 = Static80.anInt1914 * 128 + 64;
		if (Static81.anInt1935 > local30) {
			Static81.anInt1935 -= Static19.anInt439 + Static56.anInt2325 * (Static81.anInt1935 - local30) / 1000;
			if (Static81.anInt1935 < local30) {
				Static81.anInt1935 = local30;
			}
		}
		if (Static48.anInt1114 < local22) {
			Static48.anInt1114 += Static19.anInt439 + Static56.anInt2325 * (local22 - Static48.anInt1114) / 1000;
			if (local22 < Static48.anInt1114) {
				Static48.anInt1114 = local22;
			}
		}
		if (Static48.anInt1114 > local22) {
			Static48.anInt1114 -= (Static48.anInt1114 - local22) * Static56.anInt2325 / 1000 + Static19.anInt439;
			if (local22 > Static48.anInt1114) {
				Static48.anInt1114 = local22;
			}
		}
		local22 = Static79.anInt1867 * 128 + 64;
		local30 = Static86.method1383(Static1.currentLevel, local22, local16) - anInt1963;
		@Pc(214) int local214 = local22 - Static48.anInt1114;
		@Pc(219) int local219 = local30 - Static81.anInt1935;
		@Pc(224) int local224 = local16 - Static15.anInt1863;
		@Pc(236) int local236 = (int) Math.sqrt((double) (local214 * local214 + local224 * local224));
		@Pc(247) int local247 = (int) (Math.atan2((double) local219, (double) local236) * 325.949D) & 0x7FF;
		if (local247 < 128) {
			local247 = 128;
		}
		if (local247 > 383) {
			local247 = 383;
		}
		@Pc(270) int local270 = (int) (-325.949D * Math.atan2((double) local214, (double) local224)) & 0x7FF;
		@Pc(274) int local274 = local270 - Static27.anInt686;
		if (Static35.anInt824 < local247) {
			Static35.anInt824 += Static75.anInt1832 * (local247 - Static35.anInt824) / 1000 + Static22.anInt2586;
			if (Static35.anInt824 > local247) {
				Static35.anInt824 = local247;
			}
		}
		if (Static35.anInt824 > local247) {
			Static35.anInt824 -= (Static35.anInt824 - local247) * Static75.anInt1832 / 1000 + Static22.anInt2586;
			if (local247 > Static35.anInt824) {
				Static35.anInt824 = local247;
			}
		}
		if (local274 > 1024) {
			local274 -= 2048;
		}
		if (local274 < -1024) {
			local274 += 2048;
		}
		if (local274 > 0) {
			Static27.anInt686 += local274 * Static75.anInt1832 / 1000 + Static22.anInt2586;
			Static27.anInt686 &= 0x7FF;
		}
		if (local274 < 0) {
			Static27.anInt686 -= Static22.anInt2586 + Static75.anInt1832 * -local274 / 1000;
			Static27.anInt686 &= 0x7FF;
		}
		@Pc(370) int local370 = local270 - Static27.anInt686;
		if (local370 > 1024) {
			local370 -= 2048;
		}
		if (local370 < -1024) {
			local370 += 2048;
		}
		if (local370 < 0 && local274 > 0 || local370 > 0 && local274 < 0) {
			Static27.anInt686 = local270;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIIIIZIIII)Z")
	public static boolean method1349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 104; local15++) {
			for (local19 = 0; local19 < 104; local19++) {
				Static70.anIntArrayArray15[local15][local19] = 0;
				Static23.anIntArrayArray8[local15][local19] = 99999999;
			}
		}
		Static70.anIntArrayArray15[arg2][arg8] = 99;
		Static23.anIntArrayArray8[arg2][arg8] = 0;
		@Pc(55) int local55 = arg8;
		local19 = arg2;
		@Pc(59) byte local59 = 0;
		Static36.anIntArray163[0] = arg2;
		@Pc(66) int local66 = local59 + 1;
		Static23.anIntArray103[0] = arg8;
		@Pc(70) int local70 = 0;
		@Pc(72) boolean local72 = false;
		@Pc(75) int local75 = Static36.anIntArray163.length;
		@Pc(80) int[][] local80 = Static79.aClass20Array3[Static1.currentLevel].flags;
		@Pc(184) int local184;
		while (local70 != local66) {
			local55 = Static23.anIntArray103[local70];
			local19 = Static36.anIntArray163[local70];
			local70 = (local70 + 1) % local75;
			if (local19 == arg10 && local55 == arg0) {
				local72 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static79.aClass20Array3[Static1.currentLevel].method527(arg1, local55, arg0, arg10, local19, arg7 - 1)) {
					local72 = true;
					break;
				}
				if (arg7 < 10 && Static79.aClass20Array3[Static1.currentLevel].reachedWallDecoration(local55, arg1, arg7 - 1, arg10, arg0, local19)) {
					local72 = true;
					break;
				}
			}
			if (arg9 != 0 && arg3 != 0 && Static79.aClass20Array3[Static1.currentLevel].method538(arg4, local55, arg10, arg0, arg9, local19, arg3)) {
				local72 = true;
				break;
			}
			local184 = Static23.anIntArrayArray8[local19][local55] + 1;
			if (local19 > 0 && Static70.anIntArrayArray15[local19 - 1][local55] == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0) {
				Static36.anIntArray163[local66] = local19 - 1;
				Static23.anIntArray103[local66] = local55;
				Static70.anIntArrayArray15[local19 - 1][local55] = 2;
				local66 = (local66 + 1) % local75;
				Static23.anIntArrayArray8[local19 - 1][local55] = local184;
			}
			if (local19 < 103 && Static70.anIntArrayArray15[local19 + 1][local55] == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0) {
				Static36.anIntArray163[local66] = local19 + 1;
				Static23.anIntArray103[local66] = local55;
				Static70.anIntArrayArray15[local19 + 1][local55] = 8;
				local66 = (local66 + 1) % local75;
				Static23.anIntArrayArray8[local19 + 1][local55] = local184;
			}
			if (local55 > 0 && Static70.anIntArrayArray15[local19][local55 - 1] == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				Static36.anIntArray163[local66] = local19;
				Static23.anIntArray103[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				Static70.anIntArrayArray15[local19][local55 - 1] = 1;
				Static23.anIntArrayArray8[local19][local55 - 1] = local184;
			}
			if (local55 < 103 && Static70.anIntArrayArray15[local19][local55 + 1] == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				Static36.anIntArray163[local66] = local19;
				Static23.anIntArray103[local66] = local55 + 1;
				Static70.anIntArrayArray15[local19][local55 + 1] = 4;
				local66 = (local66 + 1) % local75;
				Static23.anIntArrayArray8[local19][local55 + 1] = local184;
			}
			if (local19 > 0 && local55 > 0 && Static70.anIntArrayArray15[local19 - 1][local55 - 1] == 0 && (local80[local19 - 1][local55 - 1] & 0x128010E) == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				Static36.anIntArray163[local66] = local19 - 1;
				Static23.anIntArray103[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				Static70.anIntArrayArray15[local19 - 1][local55 - 1] = 3;
				Static23.anIntArrayArray8[local19 - 1][local55 - 1] = local184;
			}
			if (local19 < 103 && local55 > 0 && Static70.anIntArrayArray15[local19 + 1][local55 - 1] == 0 && (local80[local19 + 1][local55 - 1] & 0x1280183) == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				Static36.anIntArray163[local66] = local19 + 1;
				Static23.anIntArray103[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				Static70.anIntArrayArray15[local19 + 1][local55 - 1] = 9;
				Static23.anIntArrayArray8[local19 + 1][local55 - 1] = local184;
			}
			if (local19 > 0 && local55 < 103 && Static70.anIntArrayArray15[local19 - 1][local55 + 1] == 0 && (local80[local19 - 1][local55 + 1] & 0x1280138) == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				Static36.anIntArray163[local66] = local19 - 1;
				Static23.anIntArray103[local66] = local55 + 1;
				Static70.anIntArrayArray15[local19 - 1][local55 + 1] = 6;
				Static23.anIntArrayArray8[local19 - 1][local55 + 1] = local184;
				local66 = (local66 + 1) % local75;
			}
			if (local19 < 103 && local55 < 103 && Static70.anIntArrayArray15[local19 + 1][local55 + 1] == 0 && (local80[local19 + 1][local55 + 1] & 0x12801E0) == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				Static36.anIntArray163[local66] = local19 + 1;
				Static23.anIntArray103[local66] = local55 + 1;
				Static70.anIntArrayArray15[local19 + 1][local55 + 1] = 12;
				local66 = (local66 + 1) % local75;
				Static23.anIntArrayArray8[local19 + 1][local55 + 1] = local184;
			}
		}
		Static101.anInt2400 = 0;
		@Pc(798) int local798;
		@Pc(805) int local805;
		@Pc(812) int local812;
		if (!local72) {
			if (!arg6) {
				return false;
			}
			local184 = 1000;
			local798 = 100;
			for (local805 = arg10 - 10; local805 <= arg10 + 10; local805++) {
				for (local812 = arg0 - 10; local812 <= arg0 + 10; local812++) {
					if (local805 >= 0 && local812 >= 0 && local805 < 104 && local812 < 104 && Static23.anIntArrayArray8[local805][local812] < 100) {
						@Pc(842) int local842 = 0;
						@Pc(844) int local844 = 0;
						if (arg10 > local805) {
							local844 = arg10 - local805;
						} else if (arg10 + arg9 - 1 < local805) {
							local844 = local805 + 1 - arg10 - arg9;
						}
						if (arg0 > local812) {
							local842 = arg0 - local812;
						} else if (local812 > arg3 + arg0 - 1) {
							local842 = local812 + 1 - arg0 - arg3;
						}
						@Pc(910) int local910 = local842 * local842 + local844 * local844;
						if (local910 < local184 || local184 == local910 && local798 > Static23.anIntArrayArray8[local805][local812]) {
							local798 = Static23.anIntArrayArray8[local805][local812];
							local55 = local812;
							local19 = local805;
							local184 = local910;
						}
					}
				}
			}
			if (local184 == 1000) {
				return false;
			}
			if (arg2 == local19 && local55 == arg8) {
				return false;
			}
			Static101.anInt2400 = 1;
		}
		@Pc(982) byte local982 = 0;
		Static36.anIntArray163[0] = local19;
		local70 = local982 + 1;
		Static23.anIntArray103[0] = local55;
		local184 = local798 = Static70.anIntArrayArray15[local19][local55];
		while (local19 != arg2 || arg8 != local55) {
			if (local184 != local798) {
				local798 = local184;
				Static36.anIntArray163[local70] = local19;
				Static23.anIntArray103[local70++] = local55;
			}
			if ((local184 & 0x2) != 0) {
				local19++;
			} else if ((local184 & 0x8) != 0) {
				local19--;
			}
			if ((local184 & 0x1) != 0) {
				local55++;
			} else if ((local184 & 0x4) != 0) {
				local55--;
			}
			local184 = Static70.anIntArrayArray15[local19][local55];
		}
		if (local70 > 0) {
			local75 = local70--;
			if (local75 > 25) {
				local75 = 25;
			}
			@Pc(1072) int local1072 = Static36.anIntArray163[local70];
			local805 = Static23.anIntArray103[local70];
			if (arg5 == 0) {
				Static80.out.p1isaac(130);
				Static80.out.p1(local75 + local75 + 3);
			}
			if (arg5 == 1) {
				Static80.out.p1isaac(136);
				Static80.out.p1(local75 + local75 + 3 + 14);
			}
			if (arg5 == 2) {
				Static80.out.p1isaac(89);
				Static80.out.p1(local75 + local75 + 3);
			}
			Static80.out.method1712(Static100.aBooleanArray37[82] ? 1 : 0);
			Static80.out.method1711(local1072 + Static87.anInt2058);
			Static80.out.ip2(local805 + Static30.anInt725);
			Static38.anInt986 = Static36.anIntArray163[0];
			Static80.anInt1919 = Static23.anIntArray103[0];
			for (local812 = 1; local812 < local75; local812++) {
				local70--;
				Static80.out.method1712(Static36.anIntArray163[local70] - local1072);
				Static80.out.method1702(Static23.anIntArray103[local70] - local805);
			}
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public static void method1350(@OriginalArg(1) int arg0) {
		Static42.method774(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!p;")
	public static GraphicsProducingBuffer method1351(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		@Pc(7) GraphicsProducingBuffer_Sub1 local7 = new GraphicsProducingBuffer_Sub1();
		local7.method1473(arg1, arg0, arg2);
		return local7;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1352() {
		aClass5_Sub1Array1 = null;
		anIntArray428 = null;
		anIntArray430 = null;
		aClass2_Sub2_Sub2_Sub3_20 = null;
		WALL_DECORATION_ROTATION_FORWARD_X = null;
		aClass40_567 = null;
		aClass40_568 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBLclient!fb;IILclient!sd;I)V")
	public static void method1353(@OriginalArg(0) int level, @OriginalArg(1) int arg1, @OriginalArg(2) int x, @OriginalArg(4) CollisionMap collision, @OriginalArg(5) int rotation, @OriginalArg(6) int shape, @OriginalArg(7) Class55 scene, @OriginalArg(8) int z) {
		if (Static1.lowMemory && (Static61.aByteArrayArrayArray7[0][x][z] & 0x2) == 0) {
			if ((Static61.aByteArrayArrayArray7[level][x][z] & 0x10) != 0) {
				return;
			}
			if (Static48.method821(z, x, level) != Static33.anInt786) {
				return;
			}
		}
		if (Static34.anInt807 > level) {
			Static34.anInt807 = level;
		}
		@Pc(57) int local57 = Static91.anIntArrayArrayArray8[level][x + 1][z];
		@Pc(65) int local65 = Static91.anIntArrayArrayArray8[level][x][z];
		@Pc(77) int local77 = Static91.anIntArrayArrayArray8[level][x + 1][z + 1];
		@Pc(87) int local87 = Static91.anIntArrayArrayArray8[level][x][z + 1];
		@Pc(91) Class2_Sub2_Sub10 loc = Static91.method1470(arg1);
		@Pc(102) int local102 = local87 + local57 + local65 + local77 >> 2;
		@Pc(109) int local109 = (rotation << 6) + shape;
		@Pc(121) int local121 = (arg1 << 14) + x + (z << 7) + 1073741824;
		if (loc.anInt1054 == 0) {
			local121 += Integer.MIN_VALUE;
		}
		if (loc.anInt1030 == 1) {
			local109 += 256;
		}
		@Pc(167) Class2_Sub2_Sub12 local167;
		if (shape != 22) {
			@Pc(267) int local267;
			if (shape == 10 || shape == 11) {
				if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
					local167 = loc.method765(rotation, local57, local87, local65, 10, local77);
				} else {
					local167 = new Class2_Sub2_Sub12_Sub5(arg1, 10, rotation, local65, local57, local77, local87, loc.anInt1048, true);
				}
				if (local167 != null) {
					@Pc(264) int local264;
					if (rotation == 1 || rotation == 3) {
						local264 = loc.anInt1036;
						local267 = loc.anInt1040;
					} else {
						local264 = loc.anInt1040;
						local267 = loc.anInt1036;
					}
					@Pc(277) int local277 = 0;
					if (shape == 11) {
						local277 += 256;
					}
					if (scene.method1410(level, x, z, local102, local267, local264, local167, local277, local121, local109) && loc.shadow) {
						@Pc(303) Model local303;
						if (local167 instanceof Model) {
							local303 = (Model) local167;
						} else {
							local303 = loc.method765(rotation, local57, local87, local65, 10, local77);
						}
						if (local303 != null) {
							for (@Pc(319) int local319 = 0; local319 <= local267; local319++) {
								for (@Pc(323) int local323 = 0; local323 <= local264; local323++) {
									@Pc(330) int local330 = local303.method1141() / 4;
									if (local330 > 30) {
										local330 = 30;
									}
									if (Static60.levelShademap[level][local319 + x][z + local323] < local330) {
										Static60.levelShademap[level][x + local319][z + local323] = (byte) local330;
									}
								}
							}
						}
					}
				}
				if (loc.blockwalk && collision != null) {
					collision.addLoc(loc.anInt1040, loc.aBoolean79, x, rotation, z, loc.anInt1036);
				}
			} else if (shape >= 12) {
				if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
					local167 = loc.method765(rotation, local57, local87, local65, shape, local77);
				} else {
					local167 = new Class2_Sub2_Sub12_Sub5(arg1, shape, rotation, local65, local57, local77, local87, loc.anInt1048, true);
				}
				scene.method1410(level, x, z, local102, 1, 1, local167, 0, local121, local109);
				if (shape >= 12 && shape <= 17 && shape != 13 && level > 0) {
					Static32.levelOccludemap[level][x][z] |= 0x924;
				}
				if (loc.blockwalk && collision != null) {
					collision.addLoc(loc.anInt1040, loc.aBoolean79, x, rotation, z, loc.anInt1036);
				}
			} else if (shape == 0) {
				if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
					local167 = loc.method765(rotation, local57, local87, local65, 0, local77);
				} else {
					local167 = new Class2_Sub2_Sub12_Sub5(arg1, 0, rotation, local65, local57, local77, local87, loc.anInt1048, true);
				}
				scene.method1440(level, x, z, local102, local167, null, Static5.ROTATION_WALL_TYPE[rotation], 0, local121, local109);
				if (rotation == 0) {
					if (loc.shadow) {
						Static60.levelShademap[level][x][z] = 50;
						Static60.levelShademap[level][x][z + 1] = 50;
					}
					if (loc.occlude) {
						Static32.levelOccludemap[level][x][z] |= 0x249;
					}
				} else if (rotation == 1) {
					if (loc.shadow) {
						Static60.levelShademap[level][x][z + 1] = 50;
						Static60.levelShademap[level][x + 1][z + 1] = 50;
					}
					if (loc.occlude) {
						Static32.levelOccludemap[level][x][z + 1] |= 0x492;
					}
				} else if (rotation == 2) {
					if (loc.shadow) {
						Static60.levelShademap[level][x + 1][z] = 50;
						Static60.levelShademap[level][x + 1][z + 1] = 50;
					}
					if (loc.occlude) {
						Static32.levelOccludemap[level][x + 1][z] |= 0x249;
					}
				} else if (rotation == 3) {
					if (loc.shadow) {
						Static60.levelShademap[level][x][z] = 50;
						Static60.levelShademap[level][x + 1][z] = 50;
					}
					if (loc.occlude) {
						Static32.levelOccludemap[level][x][z] |= 0x492;
					}
				}
				if (loc.blockwalk && collision != null) {
					collision.method528(loc.aBoolean79, rotation, z, x, shape);
				}
				if (loc.walloff != 16) {
					scene.method1411(level, x, z, loc.walloff);
				}
			} else if (shape == 1) {
				if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
					local167 = loc.method765(rotation, local57, local87, local65, 1, local77);
				} else {
					local167 = new Class2_Sub2_Sub12_Sub5(arg1, 1, rotation, local65, local57, local77, local87, loc.anInt1048, true);
				}
				scene.method1440(level, x, z, local102, local167, null, Static99.ROTATION_WALL_CORNER_TYPE[rotation], 0, local121, local109);
				if (loc.shadow) {
					if (rotation == 0) {
						Static60.levelShademap[level][x][z + 1] = 50;
					} else if (rotation == 1) {
						Static60.levelShademap[level][x + 1][z + 1] = 50;
					} else if (rotation == 2) {
						Static60.levelShademap[level][x + 1][z] = 50;
					} else if (rotation == 3) {
						Static60.levelShademap[level][x][z] = 50;
					}
				}
				if (loc.blockwalk && collision != null) {
					collision.method528(loc.aBoolean79, rotation, z, x, shape);
				}
			} else {
				@Pc(912) int local912;
				@Pc(942) Class2_Sub2_Sub12 local942;
				if (shape == 2) {
					local912 = rotation + 1 & 0x3;
					@Pc(932) Class2_Sub2_Sub12 local932;
					if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
						local932 = loc.method765(rotation + 4, local57, local87, local65, 2, local77);
						local942 = loc.method765(local912, local57, local87, local65, 2, local77);
					} else {
						local932 = new Class2_Sub2_Sub12_Sub5(arg1, 2, rotation + 4, local65, local57, local77, local87, loc.anInt1048, true);
						local942 = new Class2_Sub2_Sub12_Sub5(arg1, 2, local912, local65, local57, local77, local87, loc.anInt1048, true);
					}
					scene.method1440(level, x, z, local102, local932, local942, Static5.ROTATION_WALL_TYPE[rotation], Static5.ROTATION_WALL_TYPE[local912], local121, local109);
					if (loc.occlude) {
						if (rotation == 0) {
							Static32.levelOccludemap[level][x][z] |= 0x249;
							Static32.levelOccludemap[level][x][z + 1] |= 0x492;
						} else if (rotation == 1) {
							Static32.levelOccludemap[level][x][z + 1] |= 0x492;
							Static32.levelOccludemap[level][x + 1][z] |= 0x249;
						} else if (rotation == 2) {
							Static32.levelOccludemap[level][x + 1][z] |= 0x249;
							Static32.levelOccludemap[level][x][z] |= 0x492;
						} else if (rotation == 3) {
							Static32.levelOccludemap[level][x][z] |= 0x492;
							Static32.levelOccludemap[level][x][z] |= 0x249;
						}
					}
					if (loc.blockwalk && collision != null) {
						collision.method528(loc.aBoolean79, rotation, z, x, shape);
					}
					if (loc.walloff != 16) {
						scene.method1411(level, x, z, loc.walloff);
					}
				} else if (shape == 3) {
					if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
						local167 = loc.method765(rotation, local57, local87, local65, 3, local77);
					} else {
						local167 = new Class2_Sub2_Sub12_Sub5(arg1, 3, rotation, local65, local57, local77, local87, loc.anInt1048, true);
					}
					scene.method1440(level, x, z, local102, local167, null, Static99.ROTATION_WALL_CORNER_TYPE[rotation], 0, local121, local109);
					if (loc.shadow) {
						if (rotation == 0) {
							Static60.levelShademap[level][x][z + 1] = 50;
						} else if (rotation == 1) {
							Static60.levelShademap[level][x + 1][z + 1] = 50;
						} else if (rotation == 2) {
							Static60.levelShademap[level][x + 1][z] = 50;
						} else if (rotation == 3) {
							Static60.levelShademap[level][x][z] = 50;
						}
					}
					if (loc.blockwalk && collision != null) {
						collision.method528(loc.aBoolean79, rotation, z, x, shape);
					}
				} else if (shape == 9) {
					if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
						local167 = loc.method765(rotation, local57, local87, local65, shape, local77);
					} else {
						local167 = new Class2_Sub2_Sub12_Sub5(arg1, shape, rotation, local65, local57, local77, local87, loc.anInt1048, true);
					}
					scene.method1410(level, x, z, local102, 1, 1, local167, 0, local121, local109);
					if (loc.blockwalk && collision != null) {
						collision.addLoc(loc.anInt1040, loc.aBoolean79, x, rotation, z, loc.anInt1036);
					}
				} else {
					if (loc.aBoolean84) {
						if (rotation == 1) {
							local912 = local87;
							local87 = local77;
							local77 = local57;
							local57 = local65;
							local65 = local912;
						} else if (rotation == 2) {
							local912 = local87;
							local87 = local57;
							local57 = local912;
							local912 = local77;
							local77 = local65;
							local65 = local912;
						} else if (rotation == 3) {
							local912 = local87;
							local87 = local65;
							local65 = local57;
							local57 = local77;
							local77 = local912;
						}
					}
					if (shape == 4) {
						if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
							local167 = loc.method765(0, local57, local87, local65, 4, local77);
						} else {
							local167 = new Class2_Sub2_Sub12_Sub5(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
						}
						scene.method1446(level, x, z, local102, local167, Static5.ROTATION_WALL_TYPE[rotation], rotation * 512, 0, 0, local121, local109);
					} else if (shape == 5) {
						local912 = 16;
						local267 = scene.method1459(level, x, z);
						if (local267 > 0) {
							local912 = Static91.method1470(local267 >> 14 & 0x7FFF).walloff;
						}
						if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
							local942 = loc.method765(0, local57, local87, local65, 4, local77);
						} else {
							local942 = new Class2_Sub2_Sub12_Sub5(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
						}
						scene.method1446(level, x, z, local102, local942, Static5.ROTATION_WALL_TYPE[rotation], rotation * 512, WALL_DECORATION_ROTATION_FORWARD_X[rotation] * local912, Static55.WALL_DECORATION_ROTATION_FORWARD_Z[rotation] * local912, local121, local109);
					} else if (shape == 6) {
						if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
							local167 = loc.method765(0, local57, local87, local65, 4, local77);
						} else {
							local167 = new Class2_Sub2_Sub12_Sub5(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
						}
						scene.method1446(level, x, z, local102, local167, 256, rotation, 0, 0, local121, local109);
					} else if (shape == 7) {
						if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
							local167 = loc.method765(0, local57, local87, local65, 4, local77);
						} else {
							local167 = new Class2_Sub2_Sub12_Sub5(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
						}
						scene.method1446(level, x, z, local102, local167, 512, rotation, 0, 0, local121, local109);
					} else if (shape == 8) {
						if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
							local167 = loc.method765(0, local57, local87, local65, 4, local77);
						} else {
							local167 = new Class2_Sub2_Sub12_Sub5(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
						}
						scene.method1446(level, x, z, local102, local167, 768, rotation, 0, 0, local121, local109);
					}
				}
			}
		} else if (!Static1.lowMemory || loc.anInt1054 != 0 || loc.aBoolean76) {
			if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
				local167 = loc.method765(rotation, local57, local87, local65, 22, local77);
			} else {
				local167 = new Class2_Sub2_Sub12_Sub5(arg1, 22, rotation, local65, local57, local77, local87, loc.anInt1048, true);
			}
			scene.method1416(level, x, z, local102, local167, local121, local109);
			if (loc.blockwalk && loc.anInt1054 == 1 && collision != null) {
				collision.setBlocked(x, z);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mc;B)Z")
	public static boolean method1354(@OriginalArg(0) ComType arg0) {
		if (arg0.anIntArray332 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray332.length; local17++) {
			@Pc(24) int local24 = Static107.method1660(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray333[local17];
			if (arg0.anIntArray332[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray332[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray332[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BIILclient!cb;)V")
	public static void method1355(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.aClass11_3 = arg2;
		local7.id = arg1;
		local7.anInt1189 = 0;
		local7.aByteArray13 = arg0;
		@Pc(27) LinkedList local27 = Static20.aClass44_2;
		synchronized (Static20.aClass44_2) {
			Static20.aClass44_2.pushBack(local7);
		}
		Static58.method992();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	public static void method1356(@OriginalArg(0) int z, @OriginalArg(1) int x) {
		@Pc(11) LinkedList objStacks = Static91.levelObjStacks[Static1.currentLevel][x][z];
		if (objStacks == null) {
			Static93.scene.method1437(Static1.currentLevel, x, z);
			return;
		}
		@Pc(21) Class2_Sub2_Sub12_Sub3 topObj = null;
		@Pc(26) Class2_Sub2_Sub12_Sub3 obj = (Class2_Sub2_Sub12_Sub3) objStacks.peekFront();
		@Pc(28) int topCost = -99999999;
		while (obj != null) {
			@Pc(34) ObjType type = Static105.get(obj.anInt1490);
			@Pc(37) int cost = type.cost;
			if (type.stackable) {
				cost *= obj.count + 1;
			}
			if (cost > topCost) {
				topCost = cost;
				topObj = obj;
			}
			obj = (Class2_Sub2_Sub12_Sub3) objStacks.prev();
		}
		objStacks.pushFront(topObj);
		@Pc(71) Class2_Sub2_Sub12_Sub3 local71 = null;
		obj = (Class2_Sub2_Sub12_Sub3) objStacks.peekFront();
		@Pc(78) Class2_Sub2_Sub12_Sub3 local78 = null;
		while (obj != null) {
			if (topObj.anInt1490 != obj.anInt1490 && local71 == null) {
				local71 = obj;
			}
			if (obj.anInt1490 != topObj.anInt1490 && local71.anInt1490 != obj.anInt1490 && local78 == null) {
				local78 = obj;
			}
			obj = (Class2_Sub2_Sub12_Sub3) objStacks.prev();
		}
		@Pc(126) int bitset = x + (z << 7) + 1610612736;
		Static93.scene.method1427(Static1.currentLevel, x, z, Static86.method1383(Static1.currentLevel, x * 128 + 64, z * 128 + 64), topObj, bitset, local71, local78);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	public static void method1357() {
		Static55.aClass47_13.clear();
		Static3.aClass47_2.clear();
	}
}

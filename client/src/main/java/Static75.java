import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public static int anInt1960;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt1963;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_20;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIII)Lclient!o;", line = 18)
	public static JagString method1347(@OriginalArg(2) int arg0) {
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
		@Pc(101) JagString local101 = new JagString();
		local101.chars = local38;
		local101.length = local30;
		return local101;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 79)
	public static void method1348() {
		@Pc(16) int local16 = Static34.anInt840 * 128 + 64;
		@Pc(22) int local22 = Static70.anInt2149 * 128 + 64;
		@Pc(30) int local30 = Static78.method1383(Static1.currentLevel, local22, local16) - Static45.anInt2259;
		if (local16 > Static14.anInt1863) {
			Static14.anInt1863 += Static18.anInt439 + (local16 - Static14.anInt1863) * Static51.anInt2325 / 1000;
			if (local16 < Static14.anInt1863) {
				Static14.anInt1863 = local16;
			}
		}
		if (Static14.anInt1863 > local16) {
			Static14.anInt1863 -= (Static14.anInt1863 - local16) * Static51.anInt2325 / 1000 + Static18.anInt439;
			if (local16 > Static14.anInt1863) {
				Static14.anInt1863 = local16;
			}
		}
		if (Static73.anInt1935 < local30) {
			Static73.anInt1935 += (local30 - Static73.anInt1935) * Static51.anInt2325 / 1000 + Static18.anInt439;
			if (local30 < Static73.anInt1935) {
				Static73.anInt1935 = local30;
			}
		}
		local16 = Static72.anInt1914 * 128 + 64;
		if (Static73.anInt1935 > local30) {
			Static73.anInt1935 -= Static18.anInt439 + Static51.anInt2325 * (Static73.anInt1935 - local30) / 1000;
			if (Static73.anInt1935 < local30) {
				Static73.anInt1935 = local30;
			}
		}
		if (Static44.anInt1114 < local22) {
			Static44.anInt1114 += Static18.anInt439 + Static51.anInt2325 * (local22 - Static44.anInt1114) / 1000;
			if (local22 < Static44.anInt1114) {
				Static44.anInt1114 = local22;
			}
		}
		if (Static44.anInt1114 > local22) {
			Static44.anInt1114 -= (Static44.anInt1114 - local22) * Static51.anInt2325 / 1000 + Static18.anInt439;
			if (local22 > Static44.anInt1114) {
				Static44.anInt1114 = local22;
			}
		}
		local22 = Static71.anInt1867 * 128 + 64;
		local30 = Static78.method1383(Static1.currentLevel, local22, local16) - anInt1963;
		@Pc(214) int local214 = local22 - Static44.anInt1114;
		@Pc(219) int local219 = local30 - Static73.anInt1935;
		@Pc(224) int local224 = local16 - Static14.anInt1863;
		@Pc(236) int local236 = (int) Math.sqrt((double) (local214 * local214 + local224 * local224));
		@Pc(247) int local247 = (int) (Math.atan2((double) local219, (double) local236) * 325.949D) & 0x7FF;
		if (local247 < 128) {
			local247 = 128;
		}
		if (local247 > 383) {
			local247 = 383;
		}
		@Pc(270) int local270 = (int) (-325.949D * Math.atan2((double) local214, (double) local224)) & 0x7FF;
		@Pc(274) int local274 = local270 - Static26.anInt686;
		if (Static33.anInt824 < local247) {
			Static33.anInt824 += Static69.anInt1832 * (local247 - Static33.anInt824) / 1000 + Static21.anInt2586;
			if (Static33.anInt824 > local247) {
				Static33.anInt824 = local247;
			}
		}
		if (Static33.anInt824 > local247) {
			Static33.anInt824 -= (Static33.anInt824 - local247) * Static69.anInt1832 / 1000 + Static21.anInt2586;
			if (local247 > Static33.anInt824) {
				Static33.anInt824 = local247;
			}
		}
		if (local274 > 1024) {
			local274 -= 2048;
		}
		if (local274 < -1024) {
			local274 += 2048;
		}
		if (local274 > 0) {
			Static26.anInt686 += local274 * Static69.anInt1832 / 1000 + Static21.anInt2586;
			Static26.anInt686 &= 0x7FF;
		}
		if (local274 < 0) {
			Static26.anInt686 -= Static21.anInt2586 + Static69.anInt1832 * -local274 / 1000;
			Static26.anInt686 &= 0x7FF;
		}
		@Pc(370) int local370 = local270 - Static26.anInt686;
		if (local370 > 1024) {
			local370 -= 2048;
		}
		if (local370 < -1024) {
			local370 += 2048;
		}
		if (local370 < 0 && local274 > 0 || local370 > 0 && local274 < 0) {
			Static26.anInt686 = local270;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIIIIZIIII)Z", line = 227)
	public static boolean method1349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 104; local15++) {
			for (local19 = 0; local19 < 104; local19++) {
				Static1.anIntArrayArray15[local15][local19] = 0;
				Static1.anIntArrayArray8[local15][local19] = 99999999;
			}
		}
		Static1.anIntArrayArray15[arg2][arg8] = 99;
		Static1.anIntArrayArray8[arg2][arg8] = 0;
		@Pc(55) int local55 = arg8;
		local19 = arg2;
		@Pc(59) byte local59 = 0;
		Static1.anIntArray163[0] = arg2;
		@Pc(66) int local66 = local59 + 1;
		Static1.anIntArray103[0] = arg8;
		@Pc(70) int local70 = 0;
		@Pc(72) boolean local72 = false;
		@Pc(75) int local75 = Static1.anIntArray163.length;
		@Pc(80) int[][] local80 = Static1.aClass20Array3[Static1.currentLevel].anIntArrayArray9;
		@Pc(184) int local184;
		while (local70 != local66) {
			local55 = Static1.anIntArray103[local70];
			local19 = Static1.anIntArray163[local70];
			local70 = (local70 + 1) % local75;
			if (local19 == arg10 && local55 == arg0) {
				local72 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static1.aClass20Array3[Static1.currentLevel].method527(arg1, local55, arg0, arg10, local19, arg7 - 1)) {
					local72 = true;
					break;
				}
				if (arg7 < 10 && Static1.aClass20Array3[Static1.currentLevel].method535(local55, arg1, arg7 - 1, arg10, arg0, local19)) {
					local72 = true;
					break;
				}
			}
			if (arg9 != 0 && arg3 != 0 && Static1.aClass20Array3[Static1.currentLevel].method538(arg4, local55, arg10, arg0, arg9, local19, arg3)) {
				local72 = true;
				break;
			}
			local184 = Static1.anIntArrayArray8[local19][local55] + 1;
			if (local19 > 0 && Static1.anIntArrayArray15[local19 - 1][local55] == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0) {
				Static1.anIntArray163[local66] = local19 - 1;
				Static1.anIntArray103[local66] = local55;
				Static1.anIntArrayArray15[local19 - 1][local55] = 2;
				local66 = (local66 + 1) % local75;
				Static1.anIntArrayArray8[local19 - 1][local55] = local184;
			}
			if (local19 < 103 && Static1.anIntArrayArray15[local19 + 1][local55] == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0) {
				Static1.anIntArray163[local66] = local19 + 1;
				Static1.anIntArray103[local66] = local55;
				Static1.anIntArrayArray15[local19 + 1][local55] = 8;
				local66 = (local66 + 1) % local75;
				Static1.anIntArrayArray8[local19 + 1][local55] = local184;
			}
			if (local55 > 0 && Static1.anIntArrayArray15[local19][local55 - 1] == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				Static1.anIntArray163[local66] = local19;
				Static1.anIntArray103[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				Static1.anIntArrayArray15[local19][local55 - 1] = 1;
				Static1.anIntArrayArray8[local19][local55 - 1] = local184;
			}
			if (local55 < 103 && Static1.anIntArrayArray15[local19][local55 + 1] == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				Static1.anIntArray163[local66] = local19;
				Static1.anIntArray103[local66] = local55 + 1;
				Static1.anIntArrayArray15[local19][local55 + 1] = 4;
				local66 = (local66 + 1) % local75;
				Static1.anIntArrayArray8[local19][local55 + 1] = local184;
			}
			if (local19 > 0 && local55 > 0 && Static1.anIntArrayArray15[local19 - 1][local55 - 1] == 0 && (local80[local19 - 1][local55 - 1] & 0x128010E) == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				Static1.anIntArray163[local66] = local19 - 1;
				Static1.anIntArray103[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				Static1.anIntArrayArray15[local19 - 1][local55 - 1] = 3;
				Static1.anIntArrayArray8[local19 - 1][local55 - 1] = local184;
			}
			if (local19 < 103 && local55 > 0 && Static1.anIntArrayArray15[local19 + 1][local55 - 1] == 0 && (local80[local19 + 1][local55 - 1] & 0x1280183) == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				Static1.anIntArray163[local66] = local19 + 1;
				Static1.anIntArray103[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				Static1.anIntArrayArray15[local19 + 1][local55 - 1] = 9;
				Static1.anIntArrayArray8[local19 + 1][local55 - 1] = local184;
			}
			if (local19 > 0 && local55 < 103 && Static1.anIntArrayArray15[local19 - 1][local55 + 1] == 0 && (local80[local19 - 1][local55 + 1] & 0x1280138) == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				Static1.anIntArray163[local66] = local19 - 1;
				Static1.anIntArray103[local66] = local55 + 1;
				Static1.anIntArrayArray15[local19 - 1][local55 + 1] = 6;
				Static1.anIntArrayArray8[local19 - 1][local55 + 1] = local184;
				local66 = (local66 + 1) % local75;
			}
			if (local19 < 103 && local55 < 103 && Static1.anIntArrayArray15[local19 + 1][local55 + 1] == 0 && (local80[local19 + 1][local55 + 1] & 0x12801E0) == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				Static1.anIntArray163[local66] = local19 + 1;
				Static1.anIntArray103[local66] = local55 + 1;
				Static1.anIntArrayArray15[local19 + 1][local55 + 1] = 12;
				local66 = (local66 + 1) % local75;
				Static1.anIntArrayArray8[local19 + 1][local55 + 1] = local184;
			}
		}
		Static1.anInt2400 = 0;
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
					if (local805 >= 0 && local812 >= 0 && local805 < 104 && local812 < 104 && Static1.anIntArrayArray8[local805][local812] < 100) {
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
						if (local910 < local184 || local184 == local910 && local798 > Static1.anIntArrayArray8[local805][local812]) {
							local798 = Static1.anIntArrayArray8[local805][local812];
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
			Static1.anInt2400 = 1;
		}
		@Pc(982) byte local982 = 0;
		Static1.anIntArray163[0] = local19;
		local70 = local982 + 1;
		Static1.anIntArray103[0] = local55;
		local184 = local798 = Static1.anIntArrayArray15[local19][local55];
		while (local19 != arg2 || arg8 != local55) {
			if (local184 != local798) {
				local798 = local184;
				Static1.anIntArray163[local70] = local19;
				Static1.anIntArray103[local70++] = local55;
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
			local184 = Static1.anIntArrayArray15[local19][local55];
		}
		if (local70 > 0) {
			local75 = local70--;
			if (local75 > 25) {
				local75 = 25;
			}
			@Pc(1072) int local1072 = Static1.anIntArray163[local70];
			local805 = Static1.anIntArray103[local70];
			if (arg5 == 0) {
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(130);
				Static1.aClass2_Sub3_Sub1_4.p1(local75 + local75 + 3);
			}
			if (arg5 == 1) {
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(136);
				Static1.aClass2_Sub3_Sub1_4.p1(local75 + local75 + 3 + 14);
			}
			if (arg5 == 2) {
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(89);
				Static1.aClass2_Sub3_Sub1_4.p1(local75 + local75 + 3);
			}
			Static1.aClass2_Sub3_Sub1_4.p1_alt1(Static1.aBooleanArray37[82] ? 1 : 0);
			Static1.aClass2_Sub3_Sub1_4.p2_alt2(local1072 + Static79.anInt2058);
			Static1.aClass2_Sub3_Sub1_4.p2_alt1(local805 + Static28.anInt725);
			Static1.anInt986 = Static1.anIntArray163[0];
			Static1.anInt1919 = Static1.anIntArray103[0];
			for (local812 = 1; local812 < local75; local812++) {
				local70--;
				Static1.aClass2_Sub3_Sub1_4.p1_alt1(Static1.anIntArray163[local70] - local1072);
				Static1.aClass2_Sub3_Sub1_4.p1_alt2(Static1.anIntArray103[local70] - local805);
			}
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 572)
	public static void method1350(@OriginalArg(1) int arg0) {
		Static39.method774(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!p;", line = 584)
	public static PixMap method1351(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		@Pc(7) LegacyPixMap local7 = new LegacyPixMap();
		local7.create(arg0, arg1, arg2);
		return local7;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 600)
	public static void method1352() {
		Static1.aClass5_Sub1Array1 = null;
		World.blendLuminance = null;
		anIntArray430 = null;
		aClass2_Sub2_Sub2_Sub3_20 = null;
		World.WALL_DECORATION_ROTATION_FORWARD_X = null;
		JagString.aClass40_567 = null;
		JagString.aClass40_568 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mc;B)Z", line = 1134)
	public static boolean method1354(@OriginalArg(0) ComType arg0) {
		if (arg0.anIntArray332 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray332.length; local17++) {
			@Pc(24) int local24 = Static99.method1660(local17, arg0);
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

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BIILclient!cb;)V", line = 1191)
	public static void method1355(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Cache arg2) {
		@Pc(7) Js5CacheRequest local7 = new Js5CacheRequest();
		local7.cache = arg2;
		local7.key = arg1;
		local7.type = 0;
		local7.data = arg0;
		@Pc(27) LinkList local27 = Static1.aClass44_2;
		synchronized (Static1.aClass44_2) {
			Static1.aClass44_2.addTail(local7);
		}
		Static53.method992();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 1217)
	public static void sortObjStacks(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) LinkList local11 = Static1.levelObjStacks[Static1.currentLevel][arg1][arg0];
		if (local11 == null) {
			Static85.scene.method1437(Static1.currentLevel, arg1, arg0);
			return;
		}
		@Pc(21) ObjStackEntity local21 = null;
		@Pc(26) ObjStackEntity local26 = (ObjStackEntity) local11.head();
		@Pc(28) int local28 = -99999999;
		while (local26 != null) {
			@Pc(34) ObjType local34 = Static97.method1669(local26.anInt1490);
			@Pc(37) int local37 = local34.anInt938;
			if (local34.aBoolean67) {
				local37 *= local26.anInt1495 + 1;
			}
			if (local37 > local28) {
				local28 = local37;
				local21 = local26;
			}
			local26 = (ObjStackEntity) local11.next();
		}
		local11.method1229(local21);
		@Pc(71) ObjStackEntity local71 = null;
		local26 = (ObjStackEntity) local11.head();
		@Pc(78) ObjStackEntity local78 = null;
		while (local26 != null) {
			if (local21.anInt1490 != local26.anInt1490 && local71 == null) {
				local71 = local26;
			}
			if (local26.anInt1490 != local21.anInt1490 && local71.anInt1490 != local26.anInt1490 && local78 == null) {
				local78 = local26;
			}
			local26 = (ObjStackEntity) local11.next();
		}
		@Pc(126) int local126 = arg1 + (arg0 << 7) + 1610612736;
		Static85.scene.method1427(Static1.currentLevel, arg1, arg0, Static78.method1383(Static1.currentLevel, arg1 * 128 + 64, arg0 * 128 + 64), local21, local126, local71, local78);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 1282)
	public static void method1357() {
		Static1.aClass47_13.clear();
		Static1.aClass47_2.clear();
	}
}

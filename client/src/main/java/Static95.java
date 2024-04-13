import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_24;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_30;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
	public static int[] anIntArray547;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!fc;")
	public static PixFont aClass2_Sub2_Sub2_Sub2_5;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public static int anInt2495;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!o;Lclient!o;ILclient!ud;)Lclient!vb;", line = 36)
	public static Pix24 method1644(@OriginalArg(0) JagString arg0, @OriginalArg(1) JagString arg1, @OriginalArg(3) Js5Index arg2) {
		@Pc(8) int local8 = arg2.method80(arg0);
		@Pc(14) int local14 = arg2.method72(arg1, local8);
		return Static36.method732(arg2, local8, local14);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cc;", line = 59)
	public static JagException method1645(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) JagException local12;
		if (arg0 instanceof JagException) {
			local12 = (JagException) arg0;
			local12.aString7 = local12.aString7 + ' ' + arg1;
		} else {
			local12 = new JagException(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!vb;II)V", line = 121)
	public static void method1646(@OriginalArg(1) Pix24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
		if (local11 <= 4225 || local11 >= 90000) {
			Static82.method1461(arg2, arg0, arg1);
			return;
		}
		@Pc(32) int local32 = Static1.anInt1978 + Static1.anInt1669 & 0x7FF;
		@Pc(36) int local36 = Model.anIntArray386[local32];
		@Pc(44) int local44 = local36 * 256 / (Static1.anInt1857 + 256);
		@Pc(48) int local48 = Model.anIntArray402[local32];
		@Pc(56) int local56 = local48 * 256 / (Static1.anInt1857 + 256);
		@Pc(67) int local67 = local44 * arg1 + arg2 * local56 >> 16;
		@Pc(78) int local78 = local56 * arg1 - arg2 * local44 >> 16;
		@Pc(84) double local84 = Math.atan2((double) local67, (double) local78);
		@Pc(90) int local90 = (int) (Math.sin(local84) * 63.0D);
		@Pc(96) int local96 = (int) (Math.cos(local84) * 57.0D);
		Static96.aClass2_Sub2_Sub2_Sub4_10.method1623(local90 + 94 + 4 - 10, -20 + 83 + -local96, local84);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 167)
	public static void method1647() {
		@Pc(17) int local17;
		if (Static1.anInt1850 == 0) {
			Static85.scene = new World3D(4, 104, 104, World.levelHeightmap);
			for (local17 = 0; local17 < 4; local17++) {
				Static1.aClass20Array3[local17] = new CollisionMap(104, 104);
			}
			Static85.aClass2_Sub2_Sub2_Sub4_8 = new Pix24(512, 512);
			JagString.aClass40_680 = JagString.aClass40_446;
			Static1.anInt1850 = 20;
			Static1.anInt2194 = 5;
			return;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(72) int local72;
		@Pc(66) int local66;
		if (Static1.anInt1850 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local62 = local54 * 32 + 143;
				local66 = Draw3D.sin[local62];
				local72 = local62 * 3 + 600;
				local52[local54] = local72 * local66 >> 16;
			}
			Static81.method1422(local52);
			Static1.anInt1850 = 25;
			JagString.aClass40_680 = JagString.aClass40_721;
			Static1.anInt2194 = 10;
			return;
		}
		try {
			if (Static1.anInt1850 == 25) {
				if (Static9.legacyCacheDat != null && Static61.cacheDat != null && Static61.cacheDat.method351() < 60000L) {
					Static30.aClass11Array2 = new Cache[5];
					for (local17 = 0; local17 < 5; local17++) {
						Static30.aClass11Array2[local17] = new Cache(local17 + 1, Static9.legacyCacheDat, Static1.legacyCacheIndex[local17], 500000);
					}
					Static17.aClass11Array1 = new Cache[12];
					for (local54 = 0; local54 < 12; local54++) {
						Static17.aClass11Array1[local54] = new Cache(local54, Static61.cacheDat, Static1.cacheIndex[local54], 500000);
					}
					Static1.anInt2396 = 0;
					JagString.aClass40_680 = JagString.aClass40_736;
					Static1.anInt2194 = 15;
					Static1.anInt1850 = 26;
					return;
				}
				Static1.anInt2194 = 15;
				Static1.anInt1850 = 30;
				JagString.aClass40_680 = JagString.aClass40_140;
				return;
			}
			if (Static1.anInt1850 == 26) {
				while (Static1.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[1], Static17.aClass11Array1[7], Static1.anInt2396++);
					if ((Static1.anInt2396 & 0xFF) == 0) {
						JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_740, Static48.method859(Static1.anInt2396 * 100 / 65536), JagString.aClass40_430 });
						Static1.anInt2194 = 15;
						return;
					}
				}
				Static1.anInt2194 = 15;
				Static1.anInt1850 = 27;
				Static1.anInt2396 = 0;
				JagString.aClass40_680 = JagString.aClass40_139;
				return;
			}
			if (Static1.anInt1850 == 27) {
				while (Static1.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[3], Static17.aClass11Array1[6], Static1.anInt2396++);
					if ((Static1.anInt2396 & 0xFF) == 0) {
						JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_605, Static48.method859(Static1.anInt2396 * 100 / 65536), JagString.aClass40_430 });
						Static1.anInt2194 = 15;
						return;
					}
				}
				JagString.aClass40_680 = JagString.aClass40_507;
				Static1.anInt2194 = 15;
				Static1.anInt1850 = 28;
				Static1.anInt2396 = 0;
				return;
			}
			if (Static1.anInt1850 == 28) {
				while (Static1.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[4], Static17.aClass11Array1[5], Static1.anInt2396++);
					if ((Static1.anInt2396 & 0xFF) == 0) {
						JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_571, Static48.method859(Static1.anInt2396 * 100 / 65536), JagString.aClass40_430 });
						Static1.anInt2194 = 15;
						return;
					}
				}
				Static1.anInt1850 = 30;
				JagString.aClass40_680 = JagString.aClass40_105;
				Static1.anInt2194 = 15;
				return;
			}
		} catch (@Pc(368) Exception local368) {
			if (Static1.anInt1850 < 30) {
				Static1.anInt1850 = 30;
			}
		}
		if (Static1.anInt1850 == 30) {
			Static40.animsJs5 = Static66.method1188(false, 0, true, true);
			Static79.basesJs5 = Static66.method1188(false, 1, true, true);
			Static5.configJs5 = Static66.method1188(true, 2, true, false);
			Static26.interfacesJs5 = Static66.method1188(false, 3, true, true);
			Static33.synthSoundsJs5 = Static66.method1188(false, 4, true, true);
			Static34.mapsJs5 = Static66.method1188(true, 5, true, true);
			Static77.midiSongsJs5 = Static66.method1188(true, 6, false, true);
			Static24.modelsJs5 = Static66.method1188(false, 7, true, true);
			Static74.spritesJs5 = Static66.method1188(false, 8, true, true);
			Static33.texturesJs5 = Static66.method1188(false, 9, true, true);
			Static73.binaryJs5 = Static66.method1188(false, 10, true, true);
			Static68.midiJinglesJs5 = Static66.method1188(false, 11, true, true);
			JagString.aClass40_680 = JagString.aClass40_691;
			Static1.anInt2194 = 20;
			Static1.anInt1850 = 40;
		} else if (Static1.anInt1850 == 40) {
			local17 = Static40.animsJs5.method89() * 5 / 100;
			local17 += Static79.basesJs5.method89() * 5 / 100;
			local17 += Static5.configJs5.method89() * 5 / 100;
			local17 += Static26.interfacesJs5.method89() * 5 / 100;
			local17 += Static33.synthSoundsJs5.method89() * 5 / 100;
			local17 += Static34.mapsJs5.method89() * 5 / 100;
			local17 += Static77.midiSongsJs5.method89() * 5 / 100;
			local17 += Static24.modelsJs5.method89() * 45 / 100;
			local17 += Static74.spritesJs5.method89() * 5 / 100;
			local17 += Static33.texturesJs5.method89() * 5 / 100;
			local17 += Static73.binaryJs5.method89() * 5 / 100;
			local17 += Static68.midiJinglesJs5.method89() * 5 / 100;
			if (local17 == 100) {
				Static1.anInt2194 = 30;
				Static1.anInt1850 = 45;
				JagString.aClass40_680 = JagString.aClass40_584;
			} else {
				if (local17 != 0) {
					JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_558, Static48.method859(local17), JagString.aClass40_430 });
				}
				Static1.anInt2194 = 30;
			}
		} else if (Static1.anInt1850 == 45) {
			Static79.method1400(GameShell.signlink, !Static1.lowDetail);
			Static80.aClass2_Sub10_Sub2_1 = Static35.method717(GameShell.signlink, Static7.method185());
			Static10.aClass56_1 = new SampleRateConverter(22050, Static11.anInt291);
			Static1.anInt2194 = 35;
			Static1.anInt1850 = 50;
			JagString.aClass40_680 = JagString.aClass40_625;
		} else if (Static1.anInt1850 == 50) {
			local17 = 0;
			if (Static70.aClass2_Sub2_Sub2_Sub2_4 == null) {
				Static70.aClass2_Sub2_Sub2_Sub2_4 = Static50.method941(Static74.spritesJs5, JagString.aClass40_445, JagString.aClass40_620);
			} else {
				local17++;
			}
			if (aClass2_Sub2_Sub2_Sub2_5 == null) {
				aClass2_Sub2_Sub2_Sub2_5 = Static50.method941(Static74.spritesJs5, JagString.aClass40_445, JagString.aClass40_726);
			} else {
				local17++;
			}
			if (Static13.aClass2_Sub2_Sub2_Sub2_1 == null) {
				Static13.aClass2_Sub2_Sub2_Sub2_1 = Static50.method941(Static74.spritesJs5, JagString.aClass40_445, JagString.aClass40_69);
			} else {
				local17++;
			}
			if (Static39.aClass2_Sub2_Sub2_Sub2_2 == null) {
				Static39.aClass2_Sub2_Sub2_Sub2_2 = Static50.method941(Static74.spritesJs5, JagString.aClass40_445, Static1.aClass40_543);
			} else {
				local17++;
			}
			if (local17 < 4) {
				JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_47, Static48.method859(local17 * 100 / 4), JagString.aClass40_430 });
				Static1.anInt2194 = 40;
			} else {
				Static1.anInt1850 = 60;
				Static1.anInt2194 = 40;
				Static45.aClass2_Sub2_Sub2_Sub2Array9 = new PixFont[] { Static70.aClass2_Sub2_Sub2_Sub2_4, aClass2_Sub2_Sub2_Sub2_5, Static13.aClass2_Sub2_Sub2_Sub2_1, Static39.aClass2_Sub2_Sub2_Sub2_2 };
				JagString.aClass40_680 = JagString.aClass40_711;
			}
		} else if (Static1.anInt1850 == 60) {
			local17 = Static93.method1592(Static74.spritesJs5, Static73.binaryJs5);
			local54 = Static5.method120();
			if (local17 < local54) {
				JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_434, Static48.method859(local17 * 100 / local54), JagString.aClass40_430 });
				Static1.anInt2194 = 50;
			} else {
				JagString.aClass40_680 = JagString.aClass40_516;
				Static1.anInt2194 = 50;
				Static7.method187(5);
				Static1.anInt1850 = 70;
			}
		} else if (Static1.anInt1850 == 70) {
			if (Static5.configJs5.method78()) {
				Static91.method75(Static5.configJs5);
				FloorUnderlayType.method117(Static5.configJs5);
				Static30.method591(Static24.modelsJs5, Static5.configJs5);
				Static87.method1518(Static1.lowDetail, Static24.modelsJs5, Static5.configJs5);
				method1651(Static5.configJs5, Static24.modelsJs5);
				Static98.method1741(Static24.modelsJs5, Static5.configJs5, client.membersWorld);
				Static88.method1551(Static79.basesJs5, Static40.animsJs5, Static5.configJs5);
				Static72.method1329(Static5.configJs5, Static24.modelsJs5);
				Static15.method340(Static5.configJs5);
				Static84.method1483(Static5.configJs5);
				Static83.method1471(Static74.spritesJs5, Static26.interfacesJs5, Static24.modelsJs5);
				JagString.aClass40_680 = JagString.aClass40_469;
				Static1.anInt1850 = 80;
				Static1.anInt2194 = 60;
			} else {
				JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_616, Static48.method859(Static5.configJs5.method87()), JagString.aClass40_430 });
				Static1.anInt2194 = 60;
			}
		} else if (Static1.anInt1850 == 80) {
			local17 = 0;
			if (Static12.aClass2_Sub2_Sub2_Sub4_2 == null) {
				Static12.aClass2_Sub2_Sub2_Sub4_2 = method1644(JagString.aClass40_307, JagString.aClass40_445, Static74.spritesJs5);
			} else {
				local17++;
			}
			if (Static96.aClass2_Sub2_Sub2_Sub4_10 == null) {
				Static96.aClass2_Sub2_Sub2_Sub4_10 = method1644(JagString.aClass40_647, JagString.aClass40_445, Static74.spritesJs5);
			} else {
				local17++;
			}
			if (Static51.aClass2_Sub2_Sub2_Sub3Array15 == null) {
				Static51.aClass2_Sub2_Sub2_Sub3Array15 = Static4.method85(Static74.spritesJs5, JagString.aClass40_520, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static91.aClass2_Sub2_Sub2_Sub4Array2 == null) {
				Static91.aClass2_Sub2_Sub2_Sub4Array2 = Static34.method638(Static74.spritesJs5, JagString.aClass40_663, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static27.aClass2_Sub2_Sub2_Sub4Array4 == null) {
				Static27.aClass2_Sub2_Sub2_Sub4Array4 = Static34.method638(Static74.spritesJs5, JagString.aClass40_26, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static41.aClass2_Sub2_Sub2_Sub4Array6 == null) {
				Static41.aClass2_Sub2_Sub2_Sub4Array6 = Static34.method638(Static74.spritesJs5, JagString.aClass40_607, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static53.aClass2_Sub2_Sub2_Sub4Array8 == null) {
				Static53.aClass2_Sub2_Sub2_Sub4Array8 = Static34.method638(Static74.spritesJs5, JagString.aClass40_433, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static93.aClass2_Sub2_Sub2_Sub4Array10 == null) {
				Static93.aClass2_Sub2_Sub2_Sub4Array10 = Static34.method638(Static74.spritesJs5, JagString.aClass40_671, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static40.aClass2_Sub2_Sub2_Sub4_7 == null) {
				Static40.aClass2_Sub2_Sub2_Sub4_7 = method1644(JagString.aClass40_25, JagString.aClass40_445, Static74.spritesJs5);
			} else {
				local17++;
			}
			if (Static12.aClass2_Sub2_Sub2_Sub4Array3 == null) {
				Static12.aClass2_Sub2_Sub2_Sub4Array3 = Static34.method638(Static74.spritesJs5, JagString.aClass40_101, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static49.aClass2_Sub2_Sub2_Sub4Array7 == null) {
				Static49.aClass2_Sub2_Sub2_Sub4Array7 = Static34.method638(Static74.spritesJs5, JagString.aClass40_332, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static28.aClass2_Sub2_Sub2_Sub4Array5 == null) {
				Static28.aClass2_Sub2_Sub2_Sub4Array5 = Static34.method638(Static74.spritesJs5, JagString.aClass40_727, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static85.aClass2_Sub2_Sub2_Sub3Array12 == null) {
				Static85.aClass2_Sub2_Sub2_Sub3Array12 = Static4.method85(Static74.spritesJs5, JagString.aClass40_643, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (Static64.aClass2_Sub2_Sub2_Sub3Array8 == null) {
				Static64.aClass2_Sub2_Sub2_Sub3Array8 = Static4.method85(Static74.spritesJs5, JagString.aClass40_222, JagString.aClass40_445);
			} else {
				local17++;
			}
			if (local17 < 14) {
				JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_541, Static48.method859(local17 * 100 / 14), JagString.aClass40_430 });
				Static1.anInt2194 = 70;
			} else {
				Static96.aClass2_Sub2_Sub2_Sub4_10.method1620();
				local54 = (int) (Math.random() * 21.0D) - 10;
				local62 = (int) (Math.random() * 21.0D) - 10;
				local66 = (int) (Math.random() * 41.0D) - 20;
				local72 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1134) int local1134 = 0; local1134 < Static91.aClass2_Sub2_Sub2_Sub4Array2.length; local1134++) {
					Static91.aClass2_Sub2_Sub2_Sub4Array2[local1134].method1621(local54 + local66, local62 + local66, local66 + local72);
				}
				Static51.aClass2_Sub2_Sub2_Sub3Array15[0].method1321(local66 + local54, local62 + local66, local72 + local66);
				JagString.aClass40_680 = JagString.aClass40_465;
				Static1.anInt1850 = 85;
				Static1.anInt2194 = 70;
			}
		} else if (Static1.anInt1850 == 85) {
			local17 = Static17.method358(Static74.spritesJs5);
			local54 = Static9.method228();
			if (local54 > local17) {
				JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_68, Static48.method859(local17 * 100 / local54), JagString.aClass40_430 });
				Static1.anInt2194 = 80;
			} else {
				Static1.anInt2194 = 80;
				Static1.anInt1850 = 90;
				JagString.aClass40_680 = JagString.aClass40_114;
			}
		} else if (Static1.anInt1850 == 90) {
			if (Static33.texturesJs5.method78()) {
				@Pc(1269) Js5TextureProvider local1269 = new Js5TextureProvider(Static33.texturesJs5, Static74.spritesJs5, 20, 0.8D, Static1.lowDetail ? 64 : 128);
				Static6.method173(local1269);
				Static6.method168(0.8D);
				Static1.anInt2194 = 90;
				Static1.anInt1850 = 110;
				JagString.aClass40_680 = JagString.aClass40_513;
			} else {
				JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_527, Static48.method859(Static33.texturesJs5.method87()), JagString.aClass40_430 });
				Static1.anInt2194 = 90;
			}
		} else if (Static1.anInt1850 == 110) {
			Static41.aClass52_1 = new MouseRecorder();
			GameShell.signlink.method207(10, Static41.aClass52_1);
			Static1.anInt2194 = 94;
			Static1.anInt1850 = 120;
			JagString.aClass40_680 = JagString.aClass40_737;
		} else if (Static1.anInt1850 == 120) {
			if (Static73.binaryJs5.method73(JagString.aClass40_445, JagString.aClass40_131)) {
				@Pc(1325) Huffman local1325 = new Huffman(Static73.binaryJs5.method69(JagString.aClass40_131, JagString.aClass40_445));
				Static79.method1397(local1325);
				Static1.anInt1850 = 130;
				JagString.aClass40_680 = JagString.aClass40_470;
				Static1.anInt2194 = 96;
			} else {
				Static1.anInt2194 = 96;
				JagString.aClass40_680 = JagString.aClass40_180;
			}
		} else if (Static1.anInt1850 == 130) {
			if (Static26.interfacesJs5.method78()) {
				Static1.anInt2194 = 100;
				Static1.anInt1850 = 140;
				JagString.aClass40_680 = JagString.aClass40_517;
			} else {
				JagString.aClass40_680 = Static72.method1334(new JagString[] { JagString.aClass40_619, Static48.method859(Static26.interfacesJs5.method87()), JagString.aClass40_430 });
				Static1.anInt2194 = 100;
			}
		} else if (Static1.anInt1850 == 140) {
			Static7.method187(10);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 701)
	public static void method1648(@OriginalArg(0) int arg0) {
		if (!Static99.method1665(arg0)) {
			return;
		}
		@Pc(26) ComType[] local26 = Static46.aClass2_Sub2_Sub13ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) ComType local34 = local26[local28];
			if (local34 != null) {
				local34.anInt1593 = 0;
				local34.anInt1569 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ke;)V", line = 734)
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) PathingEntity arg1) {
		Static96.method1667(arg0, arg1.anInt2275, arg1.anInt2284);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I", line = 776)
	public static int method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg1;
			arg1 = local8;
		}
		@Pc(16) int local16 = arg3 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg2;
		} else if (local16 == 2) {
			return 8 - arg4 - arg0;
		} else {
			return 7 + 1 - arg2 - arg1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ud;BLclient!ud;)V", line = 808)
	private static void method1651(@OriginalArg(0) Js5Index arg0, @OriginalArg(2) Js5Index arg1) {
		aClass5_30 = arg1;
		Static32.aClass5_11 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 832)
	public static void method1652() {
		Static1.aClass47_22 = null;
		aClass2_Sub2_Sub2_Sub2_5 = null;
		JagString.aClass40_714 = null;
		JagString.aClass40_715 = null;
		aClass2_Sub2_Sub2_Sub3_24 = null;
		aClass5_30 = null;
		anIntArray547 = null;
	}
}

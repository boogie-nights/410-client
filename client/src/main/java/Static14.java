import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_17;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_18;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public static int anInt1856;

	@OriginalMember(owner = "client!cd", name = "E", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_19;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	public static int anInt1863;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BJ)V", line = 49)
	public static void method1254(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static1.anInt121 >= 100) {
			Static53.method989(0, JagString.aClass40_445, JagString.aClass40_432);
			return;
		}
		@Pc(27) JagString local27 = Static44.method819(arg0).method1167();
		for (@Pc(29) int local29 = 0; local29 < Static1.anInt121; local29++) {
			if (arg0 == Static1.aLongArray4[local29]) {
				Static53.method989(0, JagString.aClass40_445, Static72.method1334(new JagString[] { local27, JagString.aClass40_506 }));
				return;
			}
		}
		for (@Pc(60) int local60 = 0; local60 < Static1.anInt2594; local60++) {
			if (arg0 == Static1.aLongArray2[local60]) {
				Static53.method989(0, JagString.aClass40_445, Static72.method1334(new JagString[] { JagString.aClass40_357, local27, JagString.aClass40_426 }));
				return;
			}
		}
		if (!local27.method1184(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395)) {
			Static1.aLongArray4[Static1.anInt121++] = arg0;
			Static1.aBoolean59 = true;
			Static1.aClass2_Sub3_Sub1_4.pIsaac1(186);
			Static1.aClass2_Sub3_Sub1_4.p8(arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 107)
	public static void method1255() {
		for (@Pc(15) int local15 = 0; local15 < Static1.anInt1190; local15++) {
			@Pc(21) int local21 = Static1.anIntArray504[local15];
			@Pc(25) PlayerEntity local25 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local21];
			@Pc(31) int local31 = client.in.g1();
			if ((local31 & 0x4) != 0) {
				local31 += client.in.g1() << 8;
			}
			Static46.method846(local21, local25, local31);
		}
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)I", line = 228)
	public static int method1258(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static1.anIntArray257[arg0];
		@Pc(11) int local11 = (local3 * Static1.anInt2179 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)Lclient!o;", line = 266)
	public static JagString method1260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 - arg1;
		if (local12 < -9) {
			return JagString.aClass40_293;
		} else if (local12 < -6) {
			return JagString.aClass40_133;
		} else if (local12 < -3) {
			return JagString.aClass40_528;
		} else if (local12 < 0) {
			return JagString.aClass40_134;
		} else if (local12 > 9) {
			return JagString.aClass40_689;
		} else if (local12 > 6) {
			return JagString.aClass40_692;
		} else if (local12 > 3) {
			return JagString.aClass40_138;
		} else if (local12 > 0) {
			return JagString.aClass40_407;
		} else {
			return JagString.aClass40_730;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIBI)I", line = 316)
	public static int method1261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(13) int local13 = arg1;
			arg1 = arg4;
			arg4 = local13;
		}
		@Pc(25) int local25 = arg3 & 0x3;
		if (local25 == 0) {
			return arg5;
		} else if (local25 == 1) {
			return 7 + 1 - arg0 - arg1;
		} else if (local25 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ud;Ljava/awt/Component;Lclient!ud;B)V", line = 373)
	public static void method1263(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Js5Index arg2) {
		if (Static68.aBoolean145) {
			return;
		}
		Static56.aClass45_24 = Static75.method1351(128, arg1, 265);
		Static25.method1610();
		Static90.aClass45_30 = Static75.method1351(128, arg1, 265);
		Static25.method1610();
		Static56.aClass45_22 = Static75.method1351(509, arg1, 171);
		Static25.method1610();
		Static33.aClass45_16 = Static75.method1351(360, arg1, 132);
		Static25.method1610();
		Static99.aClass45_31 = Static75.method1351(360, arg1, 200);
		Static25.method1610();
		Static20.aClass45_11 = Static75.method1351(202, arg1, 238);
		Static25.method1610();
		Static72.aClass45_27 = Static75.method1351(203, arg1, 238);
		Static25.method1610();
		Static62.aClass45_26 = Static75.method1351(74, arg1, 94);
		Static25.method1610();
		Static2.aClass45_3 = Static75.method1351(75, arg1, 94);
		Static25.method1610();
		@Pc(77) byte[] local77 = arg2.method69(JagString.aClass40_463, JagString.aClass40_593);
		@Pc(83) Pix24 local83 = new Pix24(local77, arg1);
		Static56.aClass45_24.method1476();
		local83.method1619(0, 0);
		Static90.aClass45_30.method1476();
		local83.method1619(-637, 0);
		Static56.aClass45_22.method1476();
		local83.method1619(-128, 0);
		Static33.aClass45_16.method1476();
		local83.method1619(-202, -371);
		Static99.aClass45_31.method1476();
		local83.method1619(-202, -171);
		Static20.aClass45_11.method1476();
		local83.method1619(0, -265);
		Static72.aClass45_27.method1476();
		local83.method1619(-562, -265);
		Static62.aClass45_26.method1476();
		local83.method1619(-128, -171);
		Static2.aClass45_3.method1476();
		local83.method1619(-562, -171);
		@Pc(150) int[] local150 = new int[local83.anInt2446];
		@Pc(156) int local156;
		@Pc(187) int local187;
		for (@Pc(152) int local152 = 0; local152 < local83.anInt2442; local152++) {
			for (local156 = 0; local156 < local83.anInt2446; local156++) {
				local150[local156] = local83.anIntArray534[local152 * local83.anInt2446 + local83.anInt2446 - local156 - 1];
			}
			for (local187 = 0; local187 < local83.anInt2446; local187++) {
				local83.anIntArray534[local152 * local83.anInt2446 + local187] = local150[local187];
			}
		}
		Static56.aClass45_24.method1476();
		local83.method1619(382, 0);
		Static90.aClass45_30.method1476();
		local83.method1619(-255, 0);
		Static56.aClass45_22.method1476();
		local83.method1619(254, 0);
		Static33.aClass45_16.method1476();
		local83.method1619(180, -371);
		Static99.aClass45_31.method1476();
		local83.method1619(180, -171);
		Static20.aClass45_11.method1476();
		local83.method1619(382, -265);
		Static72.aClass45_27.method1476();
		local83.method1619(-180, -265);
		Static62.aClass45_26.method1476();
		local83.method1619(254, -171);
		Static2.aClass45_3.method1476();
		local83.method1619(-180, -171);
		local83 = Static95.method1644(JagString.aClass40_521, JagString.aClass40_593, arg0);
		Static56.aClass45_22.method1476();
		local83.method1624(382 - local83.anInt2446 / 2 - 128, 18);
		Static89.aClass2_Sub2_Sub2_Sub3_21 = Static91.method77(arg0, JagString.aClass40_593, JagString.aClass40_16);
		Static30.aClass2_Sub2_Sub2_Sub3_8 = Static91.method77(arg0, JagString.aClass40_593, JagString.aClass40_661);
		Static45.aClass2_Sub2_Sub2_Sub3Array14 = Static4.method85(arg0, JagString.aClass40_563, JagString.aClass40_593);
		Static10.aClass2_Sub2_Sub2_Sub4_1 = new Pix24(128, 265);
		Static88.aClass2_Sub2_Sub2_Sub4_9 = new Pix24(128, 265);
		for (local156 = 0; local156 < 33920; local156++) {
			Static10.aClass2_Sub2_Sub2_Sub4_1.anIntArray534[local156] = Static56.aClass45_24.anIntArray471[local156];
		}
		for (local187 = 0; local187 < 33920; local187++) {
			Static88.aClass2_Sub2_Sub2_Sub4_9.anIntArray534[local187] = Static90.aClass45_30.anIntArray471[local187];
		}
		Static35.anIntArray182 = new int[256];
		for (@Pc(366) int local366 = 0; local366 < 64; local366++) {
			Static35.anIntArray182[local366] = local366 * 262144;
		}
		for (@Pc(382) int local382 = 0; local382 < 64; local382++) {
			Static35.anIntArray182[local382 + 64] = local382 * 1024 + 16711680;
		}
		for (@Pc(403) int local403 = 0; local403 < 64; local403++) {
			Static35.anIntArray182[local403 + 128] = local403 * 4 + 16776960;
		}
		for (@Pc(421) int local421 = 0; local421 < 64; local421++) {
			Static35.anIntArray182[local421 + 192] = 16777215;
		}
		Static64.anIntArray355 = new int[256];
		for (@Pc(438) int local438 = 0; local438 < 64; local438++) {
			Static64.anIntArray355[local438] = local438 * 1024;
		}
		for (@Pc(452) int local452 = 0; local452 < 64; local452++) {
			Static64.anIntArray355[local452 + 64] = local452 * 4 + 65280;
		}
		for (@Pc(472) int local472 = 0; local472 < 64; local472++) {
			Static64.anIntArray355[local472 + 128] = local472 * 262144 + 65535;
		}
		for (@Pc(492) int local492 = 0; local492 < 64; local492++) {
			Static64.anIntArray355[local492 + 192] = 16777215;
		}
		Static66.anIntArray406 = new int[256];
		for (@Pc(513) int local513 = 0; local513 < 64; local513++) {
			Static66.anIntArray406[local513] = local513 * 4;
		}
		for (@Pc(529) int local529 = 0; local529 < 64; local529++) {
			Static66.anIntArray406[local529 + 64] = local529 * 262144 + 255;
		}
		for (@Pc(550) int local550 = 0; local550 < 64; local550++) {
			Static66.anIntArray406[local550 + 128] = local550 * 1024 + 16711935;
		}
		for (@Pc(570) int local570 = 0; local570 < 64; local570++) {
			Static66.anIntArray406[local570 + 192] = 16777215;
		}
		anIntArray414 = new int[32768];
		Static84.anIntArray472 = new int[256];
		Static4.anIntArray17 = new int[32768];
		Static23.method502(null);
		JagString.aClass40_591 = JagString.aClass40_593;
		JagString.aClass40_587 = JagString.aClass40_593;
		Static1.anInt2143 = 0;
		Static1.anIntArray1 = new int[32768];
		Static95.anIntArray547 = new int[32768];
		if (Static1.anInt239 == 0 || Static1.lowDetail) {
			Static86.method1490();
		} else {
			Static86.method1496(JagString.aClass40_80, JagString.aClass40_593, Static77.midiSongsJs5, Static1.anInt239);
		}
		Static41.method787(false);
		Static68.aBoolean145 = true;
		Static1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V", line = 604)
	public static void method1264() {
		JagString.aClass40_536 = null;
		aByteArrayArrayArray10 = null;
		aClass2_Sub2_Sub2_Sub3_17 = null;
		JagString.aClass40_540 = null;
		aClass2_Sub2_Sub2_Sub3_18 = null;
		JagString.aClass40_541 = null;
		JagString.aClass40_538 = null;
		JagString.aClass40_537 = null;
		anIntArray414 = null;
		JagString.aClass40_539 = null;
		aClass2_Sub2_Sub2_Sub3_19 = null;
		JagString.aClass40_535 = null;
	}
}

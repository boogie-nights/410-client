import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!kc", name = "bd", descriptor = "Lclient!ud;")
	public static Js5 aClass5_17;

	@OriginalMember(owner = "client!kc", name = "cd", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array7;

	@OriginalMember(owner = "client!kc", name = "md", descriptor = "Lclient!ud;")
	public static Js5 aClass5_18;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "(I)V", line = 4)
	public static void method916() {
		@Pc(5) Mouse local5 = Static1.aClass62_1;
		synchronized (Static1.aClass62_1) {
			Static1.anInt2170 = Static1.anInt969;
			Static1.anInt742 = Static1.anInt112;
			Static1.anInt2394 = Static1.anInt1663;
			Static1.anInt2030 = Static1.anInt2520;
			Static1.anInt2500 = Static1.anInt1166;
			Static1.anInt2133 = Static1.anInt2494;
			Static1.aLong1 = Static1.aLong149;
			Static1.anInt2520 = 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)V", line = 28)
	public static void method917() {
		for (@Pc(10) ProjectileEntity local10 = (ProjectileEntity) Static1.aClass44_4.method1224(); local10 != null; local10 = (ProjectileEntity) Static1.aClass44_4.method1231()) {
			if (local10.anInt1417 != Static1.anInt8 || local10.anInt1427 < Static1.anInt2511) {
				local10.method1677();
			} else if (Static1.anInt2511 >= local10.anInt1419) {
				if (local10.anInt1434 > 0) {
					@Pc(47) NpcEntity local47 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local10.anInt1434 - 1];
					if (local47 != null && local47.anInt2275 >= 0 && local47.anInt2275 < 13312 && local47.anInt2284 >= 0 && local47.anInt2284 < 13312) {
						local10.method939(local47.anInt2275, Static78.method1383(local10.anInt1417, local47.anInt2275, local47.anInt2284) - local10.anInt1416, Static1.anInt2511, local47.anInt2284);
					}
				}
				if (local10.anInt1434 < 0) {
					@Pc(97) int local97 = -local10.anInt1434 - 1;
					@Pc(104) PlayerEntity local104;
					if (local97 == Static1.anInt1955) {
						local104 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1;
					} else {
						local104 = Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local97];
					}
					if (local104 != null && local104.anInt2275 >= 0 && local104.anInt2275 < 13312 && local104.anInt2284 >= 0 && local104.anInt2284 < 13312) {
						local10.method939(local104.anInt2275, Static78.method1383(local10.anInt1417, local104.anInt2275, local104.anInt2284) - local10.anInt1416, Static1.anInt2511, local104.anInt2284);
					}
				}
				local10.method942(Static1.anInt1095);
				Static85.aClass55_1.method1425(Static1.anInt8, (int) local10.aDouble7, (int) local10.aDouble5, (int) local10.aDouble2, 60, local10, local10.anInt1436, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "(I)V", line = 220)
	public static void method919() {
		JagString.aClass40_396 = null;
		Static1.anIntArray287 = null;
		aClass2_Sub2_Sub2_Sub4Array7 = null;
		Static1.anIntArray288 = null;
		aClass5_18 = null;
		aClass5_17 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!mc;IIIIIII)V", line = 248)
	public static void method920(@OriginalArg(1) ComType arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static1.aBoolean182) {
			Static1.anInt180 = 32;
		} else {
			Static1.anInt180 = 0;
		}
		Static1.aBoolean182 = false;
		if (arg6 >= arg1 && arg6 < arg1 + 16 && arg7 <= arg5 && arg7 + 16 > arg5) {
			arg0.anInt1587 -= Static1.anInt2326 * 4;
			if (arg4 == 1) {
				Static1.aBoolean59 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static1.aBoolean144 = true;
			}
		} else if (arg1 <= arg6 && arg1 + 16 > arg6 && arg3 + arg7 - 16 <= arg5 && arg3 + arg7 > arg5) {
			if (arg4 == 2 || arg4 == 3) {
				Static1.aBoolean144 = true;
			}
			if (arg4 == 1) {
				Static1.aBoolean59 = true;
			}
			arg0.anInt1587 += Static1.anInt2326 * 4;
		} else if (arg1 - Static1.anInt180 <= arg6 && arg6 < arg1 + Static1.anInt180 + 16 && arg7 + 16 <= arg5 && arg5 < arg3 + arg7 - 16 && Static1.anInt2326 > 0) {
			if (arg4 == 1) {
				Static1.aBoolean59 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static1.aBoolean144 = true;
			}
			Static1.aBoolean182 = true;
			@Pc(147) int local147 = arg3 * (arg3 - 32) / arg2;
			if (local147 < 8) {
				local147 = 8;
			}
			@Pc(165) int local165 = arg5 - arg7 - local147 / 2 - 16;
			@Pc(172) int local172 = arg3 - local147 - 32;
			arg0.anInt1587 = (arg2 - arg3) * local165 / local172;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIIIIII[Lclient!fb;IB)V", line = 340)
	public static void method921(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) CollisionMap[] arg7, @OriginalArg(8) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg4 > 0 && arg4 + local7 < 103 && arg1 + local11 > 0 && local11 + arg1 < 103) {
					arg7[arg8].anIntArrayArray9[local7 + arg4][local11 + arg1] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(79) Packet local79 = new Packet(arg0);
		for (@Pc(81) int local81 = 0; local81 < 4; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
					if (arg5 == local81 && local85 >= arg2 && local85 < arg2 + 8 && arg6 <= local89 && local89 < arg6 + 8) {
						Static53.method990(Static7.method189(local89 & 0x7, arg3, local85 & 0x7) + arg1, arg8, arg3, 0, local79, 0, Static76.method1362(local85 & 0x7, local89 & 0x7, arg3) + arg4);
					} else {
						Static53.method990(-1, 0, 0, 0, local79, 0, -1);
					}
				}
			}
		}
	}
}

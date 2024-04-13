import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 5)
	public static void method998() {
		Static1.aClass2_Sub3_Sub1_4.pIsaac1(255);
		if (Static1.anInt1654 != -1) {
			Static75.method1350(Static1.anInt1654);
			Static1.aBoolean59 = true;
			Static1.aBoolean40 = false;
			Static1.aBoolean184 = true;
			Static1.anInt1654 = -1;
		}
		if (Static1.anInt1994 != -1) {
			Static75.method1350(Static1.anInt1994);
			Static1.aBoolean40 = false;
			Static1.anInt1994 = -1;
			Static1.aBoolean144 = true;
		}
		if (Static1.anInt1971 != -1) {
			Static75.method1350(Static1.anInt1971);
			Static1.anInt1971 = -1;
			Static7.method187(30);
		}
		if (Static1.anInt2175 != -1) {
			Static75.method1350(Static1.anInt2175);
			Static1.anInt2175 = -1;
		}
		if (Static1.anInt2585 != -1) {
			Static75.method1350(Static1.anInt2585);
			Static1.anInt2585 = -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Lclient!vb;", line = 159)
	public static Pix24 method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Pix24 local14;
		if (arg0 == 0) {
			local14 = (Pix24) Static1.aClass47_7.method1325((long) arg2);
			if (local14 != null && local14.anInt2443 != arg1 && local14.anInt2443 != -1) {
				local14.method1677();
				local14 = null;
			}
			if (local14 != null) {
				return local14;
			}
		}
		@Pc(40) ObjType local40 = Static97.method1669(arg2);
		if (local40.anIntArray183 == null) {
			arg1 = -1;
		}
		if (arg1 > 1) {
			@Pc(57) int local57 = -1;
			for (@Pc(59) int local59 = 0; local59 < 10; local59++) {
				if (arg1 >= local40.anIntArray180[local59] && local40.anIntArray180[local59] != 0) {
					local57 = local40.anIntArray183[local59];
				}
			}
			if (local57 != -1) {
				local40 = Static97.method1669(local57);
			}
		}
		@Pc(101) Model local101 = local40.method713(1, true);
		if (local101 == null) {
			return null;
		}
		@Pc(107) Pix24 local107 = null;
		if (local40.anInt932 != -1) {
			local107 = method1000(-1, 10, local40.anInt956);
			if (local107 == null) {
				return null;
			}
		}
		@Pc(125) int[] local125 = Static6.method167();
		@Pc(127) int local127 = Static25.anInt2440;
		@Pc(129) int[] local129 = Static25.anIntArray533;
		@Pc(131) int local131 = Static25.anInt2435;
		@Pc(133) int local133 = Draw2D.anInt2437;
		@Pc(135) int local135 = Draw2D.anInt2439;
		@Pc(137) int local137 = Draw2D.anInt2436;
		@Pc(139) int local139 = Draw2D.anInt2438;
		local14 = new Pix24(32, 32);
		Static25.method1604(local14.anIntArray534, 32, 32);
		Static43.anIntArray536 = Static6.method175(Static43.anIntArray536);
		Static25.method1612(0, 0, 32, 32, 0);
		Draw3D.aBoolean18 = false;
		@Pc(164) int local164 = local40.anInt926;
		if (arg0 == -1) {
			local164 = (int) ((double) local164 * 1.5D);
		}
		if (arg0 > 0) {
			local164 = (int) ((double) local164 * 1.04D);
		}
		@Pc(193) int local193 = Draw3D.anIntArray58[local40.anInt952] * local164 >> 16;
		@Pc(202) int local202 = local164 * Draw3D.anIntArray59[local40.anInt952] >> 16;
		local101.method1135();
		local101.method1151(local40.anInt918, local40.anInt937, local40.anInt952, local40.anInt946, local202 + local101.anInt2265 / 2 + local40.anInt960, local193 + local40.anInt960);
		for (@Pc(230) int local230 = 31; local230 >= 0; local230--) {
			for (local193 = 31; local193 >= 0; local193--) {
				if (local14.anIntArray534[local193 * 32 + local230] == 0) {
					if (local230 > 0 && local14.anIntArray534[local193 * 32 + local230 - 1] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					} else if (local193 > 0 && local14.anIntArray534[local193 * 32 + local230 - 32] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					} else if (local230 < 31 && local14.anIntArray534[local230 + local193 * 32 + 1] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					} else if (local193 < 31 && local14.anIntArray534[local230 + local193 * 32 + 32] > 1) {
						local14.anIntArray534[local193 * 32 + local230] = 1;
					}
				}
			}
		}
		@Pc(379) int local379;
		if (arg0 > 0) {
			for (local379 = 31; local379 >= 0; local379--) {
				for (local193 = 31; local193 >= 0; local193--) {
					if (local14.anIntArray534[local379 + local193 * 32] == 0) {
						if (local379 > 0 && local14.anIntArray534[local193 * 32 + local379 - 1] == 1) {
							local14.anIntArray534[local379 + local193 * 32] = arg0;
						} else if (local193 > 0 && local14.anIntArray534[(local193 - 1) * 32 + local379] == 1) {
							local14.anIntArray534[local193 * 32 + local379] = arg0;
						} else if (local379 < 31 && local14.anIntArray534[local193 * 32 + local379 + 1] == 1) {
							local14.anIntArray534[local193 * 32 + local379] = arg0;
						} else if (local193 < 31 && local14.anIntArray534[local193 * 32 + local379 + 32] == 1) {
							local14.anIntArray534[local193 * 32 + local379] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (local379 = 31; local379 >= 0; local379--) {
				for (local193 = 31; local193 >= 0; local193--) {
					if (local14.anIntArray534[local193 * 32 + local379] == 0 && local379 > 0 && local193 > 0 && local14.anIntArray534[local379 + local193 * 32 - 1 - 32] > 0) {
						local14.anIntArray534[local379 + local193 * 32] = 3153952;
					}
				}
			}
		}
		if (local40.anInt932 != -1) {
			local379 = local107.anInt2445;
			@Pc(586) int local586 = local107.anInt2443;
			local107.anInt2443 = 32;
			local107.anInt2445 = 32;
			local107.method1624(0, 0);
			local107.anInt2443 = local586;
			local107.anInt2445 = local379;
		}
		if (arg0 == 0) {
			Static1.aClass47_7.method1332((long) arg2, local14);
		}
		Static25.method1604(local129, local127, local131);
		Static25.method1613(local133, local135, local137, local139);
		Static6.method175(local125);
		Draw3D.aBoolean18 = true;
		if (local40.aBoolean67) {
			local14.anInt2445 = 33;
		} else {
			local14.anInt2445 = 32;
		}
		local14.anInt2443 = arg1;
		return local14;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 461)
	public static void method1003() {
		JagString.aClass40_431 = null;
		aByteArrayArrayArray6 = null;
		JagString.aClass40_434 = null;
		JagString.aClass40_435 = null;
		JagString.aClass40_432 = null;
		JagString.aClass40_433 = null;
	}
}

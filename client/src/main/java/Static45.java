import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "[Lclient!fc;")
	public static PixFont[] aClass2_Sub2_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "[Lclient!qb;")
	public static Pix8[] aClass2_Sub2_Sub2_Sub3Array14;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
	public static int cutsceneSrcHeight;

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V", line = 3)
	public static void method1530() {
		if (Static1.aClass30_1 != null) {
			@Pc(12) Keyboard local12 = Static1.aClass30_1;
			synchronized (local12) {
				Static1.aClass30_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V", line = 20)
	public static void method1531() {
		aClass2_Sub2_Sub2_Sub2Array9 = null;
		JagString.aClass40_655 = null;
		JagString.aClass40_654 = null;
		aClass2_Sub2_Sub2_Sub3Array14 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BIII)Z", line = 41)
	public static boolean method1532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(13) int local13 = -1;
		@Pc(18) Packet local18 = new Packet(arg0);
		label67: while (true) {
			@Pc(22) int local22 = local18.gSmart1or2();
			if (local22 == 0) {
				return local11;
			}
			@Pc(29) int local29 = 0;
			local13 += local22;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(72) int local72;
				@Pc(96) LocType local96;
				do {
					@Pc(66) int local66;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(41) int local41;
									while (local35) {
										local41 = local18.gSmart1or2();
										if (local41 == 0) {
											continue label67;
										}
										local18.g1();
									}
									local41 = local18.gSmart1or2();
									if (local41 == 0) {
										continue label67;
									}
									local29 += local41 - 1;
									@Pc(56) int local56 = local29 & 0x3F;
									@Pc(62) int local62 = local29 >> 6 & 0x3F;
									local66 = local62 + arg1;
									local72 = local18.g1() >> 2;
									local77 = local56 + arg2;
								} while (local66 <= 0);
							} while (local77 <= 0);
						} while (local66 >= 103);
					} while (local77 >= 103);
					local96 = LocType.get(local13);
				} while (local72 == 22 && client.lowMemory && local96.active == 0 && !local96.aBoolean76);
				if (!local96.method773()) {
					Static1.anInt1667++;
					local11 = false;
				}
				local35 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 148)
	public static int method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg1;
		return (arg1 * (arg2 & 0xFF00FF) + (arg0 & 0xFF00FF) * local13 & 0xFF00FF00) + ((arg0 & 0xFF00) * local13 + ((arg2 & 0xFF00) * arg1) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!ad;IBZI)V", line = 165)
	public static void method1535(@OriginalArg(0) int arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) ((arg5 << 16) + arg0);
		@Pc(16) Js5NetRequest local16 = (Js5NetRequest) Static1.aClass6_6.get(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Js5NetRequest) Static1.aClass6_5.get(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Js5NetRequest) Static1.aClass6_7.get(local6);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Js5NetRequest) Static1.aClass6_2.get(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Js5NetRequest();
			local16.js5 = arg1;
			local16.blockPosition = arg2;
			local16.trailerLen = arg3;
			if (arg4) {
				Static1.aClass6_6.put(local16, local6);
				Static1.anInt34++;
			} else {
				Static1.aClass41_1.push(local16);
				Static1.aClass6_7.put(local16, local6);
				Static1.anInt1077++;
			}
		} else if (arg4) {
			local16.uncache();
			Static1.aClass6_6.put(local16, local6);
			Static1.anInt34++;
			Static1.anInt1077--;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!o;Lclient!o;B)V", line = 276)
	public static void method1537(@OriginalArg(0) JagString arg0, @OriginalArg(1) JagString arg1) {
		JagString.aClass40_592 = arg0;
		JagString.aClass40_589 = arg1;
	}
}

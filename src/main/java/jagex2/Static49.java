package jagex2;

import jagex2.config.LocType;
import jagex2.graphics.Pix8;
import jagex2.graphics.PixFont;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "[Lclient!fc;")
	public static PixFont[] aClass2_Sub2_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "[Lclient!qb;")
	public static Pix8[] imageRunes;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
	public static int anInt2259;

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
	public static final int anInt2253 = 2301979;

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "Lclient!o;")
	public static Class40 aClass40_654 = Static13.method257(":duelreq:");

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	public static int flameGradientCycle1 = 0;

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lclient!o;")
	public static Class40 aClass40_655 = Static13.method257("(X100(U(Y");

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
	public static void method1530() {
		if (Static73.aClass30_1 != null) {
			@Pc(12) Class30 local12 = Static73.aClass30_1;
			synchronized (Static73.aClass30_1) {
				Static73.aClass30_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
	public static void method1531() {
		aClass2_Sub2_Sub2_Sub2Array9 = null;
		aClass40_655 = null;
		aClass40_654 = null;
		imageRunes = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BIII)Z")
	public static boolean method1532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(13) int local13 = -1;
		@Pc(18) Packet local18 = new Packet(arg0);
		label67: while (true) {
			@Pc(22) int local22 = local18.gsmarts();
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
										local41 = local18.gsmarts();
										if (local41 == 0) {
											continue label67;
										}
										local18.g1();
									}
									local41 = local18.gsmarts();
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
					local96 = Static91.method1470(local13);
				} while (local72 == 22 && Static1.lowMemory && local96.anInt1054 == 0 && !local96.aBoolean76);
				if (!local96.method773()) {
					Static67.anInt1667++;
					local11 = false;
				}
				local35 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I")
	public static int mix(@OriginalArg(0) int arg0, @OriginalArg(1) int alpha, @OriginalArg(3) int arg2) {
		@Pc(13) int invAlpha = 256 - alpha;
		return (alpha * (arg2 & 0xFF00FF) + (arg0 & 0xFF00FF) * invAlpha & 0xFF00FF00) + ((arg0 & 0xFF00) * invAlpha + ((arg2 & 0xFF00) * alpha) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!ad;IBZI)V")
	public static void method1535(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) ((arg5 << 16) + arg0);
		@Pc(16) Class2_Sub2_Sub9 local16 = (Class2_Sub2_Sub9) Static93.aClass6_6.get(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub9) Static76.aClass6_5.get(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub9) Static105.aClass6_7.get(local6);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class2_Sub2_Sub9) Static36.aClass6_2.get(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub2_Sub9();
			local16.aClass5_Sub1_9 = arg1;
			local16.anInt1013 = arg2;
			local16.aByte2 = arg3;
			if (arg4) {
				Static93.aClass6_6.put(local6, local16);
				Static2.anInt34++;
			} else {
				Static74.aClass41_1.push(local16);
				Static105.aClass6_7.put(local6, local16);
				Static44.anInt1077++;
			}
		} else if (arg4) {
			local16.uncache();
			Static93.aClass6_6.put(local6, local16);
			Static2.anInt34++;
			Static44.anInt1077--;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!o;Lclient!o;B)V")
	public static void method1537(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1) {
		Static86.aClass40_592 = arg0;
		Static86.aClass40_589 = arg1;
	}
}

package jagex2;

import jagex2.client.GameShell;
import jagex2.dash3d.entity.NpcEntity;
import jagex2.graphics.Pix8;
import jagex2.io.ClientStream;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!hc;")
	public static ClientStream stream;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
	public static int[] flameGradient1;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
	public static int anInt1696;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "[Lclient!qb;")
	public static Pix8[] aClass2_Sub2_Sub2_Sub3Array8;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_494 = Static13.method257("::clientdrop");

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[104][104];

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!o;")
	public static Class40 aClass40_495 = Static13.method257("(U5");

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_496 = Static13.method257(" x ");

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
	public static int anInt1695 = 0;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
	public static void method1109() {
		for (@Pc(16) int local16 = 0; local16 < Static53.entityUpdateCount; local16++) {
			@Pc(22) int local22 = Static98.entityUpdateIds[local16];
			@Pc(26) NpcEntity local26 = Static2.npcs[local22];
			@Pc(30) int local30 = Static56.in.g1();
			if ((local30 & 0x20) != 0) {
				local26.anInt2324 = Static56.in.g2();
				if (local26.anInt2324 == 65535) {
					local26.anInt2324 = -1;
				}
			}
			@Pc(57) int local57;
			@Pc(61) int local61;
			if ((local30 & 0x40) != 0) {
				local57 = Static56.in.method1730();
				local61 = Static56.in.method1706();
				local26.method1540(local57, Static107.loopCycle, local61);
				local26.anInt2315 = Static107.loopCycle + 300;
				local26.anInt2298 = Static56.in.method1715();
				local26.anInt2279 = Static56.in.method1730();
			}
			if ((local30 & 0x8) != 0) {
				local57 = Static56.in.method1681();
				local61 = Static56.in.g1();
				if (local57 == 65535) {
					local57 = -1;
				}
				if (local57 == local26.primarySeqId && local57 != -1) {
					@Pc(115) int local115 = Static62.method1042(local57).anInt662;
					if (local115 == 1) {
						local26.anInt2316 = 0;
						local26.anInt2267 = 0;
						local26.anInt2313 = local61;
						local26.anInt2300 = 0;
					}
					if (local115 == 2) {
						local26.anInt2300 = 0;
					}
				} else if (local57 == -1 || local26.primarySeqId == -1 || Static62.method1042(local57).anInt658 >= Static62.method1042(local26.primarySeqId).anInt658) {
					local26.anInt2316 = 0;
					local26.anInt2300 = 0;
					local26.anInt2267 = 0;
					local26.primarySeqId = local57;
					local26.anInt2281 = local26.anInt2309;
					local26.anInt2313 = local61;
				}
			}
			if ((local30 & 0x1) != 0) {
				local57 = Static56.in.method1730();
				local61 = Static56.in.method1706();
				local26.method1540(local57, Static107.loopCycle, local61);
				local26.anInt2315 = Static107.loopCycle + 300;
				local26.anInt2298 = Static56.in.g1();
				local26.anInt2279 = Static56.in.method1730();
			}
			if ((local30 & 0x80) != 0) {
				local26.anInt2302 = Static56.in.method1714();
				local57 = Static56.in.method1710();
				local26.anInt2320 = Static107.loopCycle + (local57 & 0xFFFF);
				local26.anInt2289 = local57 >> 16;
				local26.anInt2291 = 0;
				if (local26.anInt2320 > Static107.loopCycle) {
					local26.anInt2291 = -1;
				}
				if (local26.anInt2302 == 65535) {
					local26.anInt2302 = -1;
				}
				local26.anInt2268 = 0;
			}
			if ((local30 & 0x2) != 0) {
				local26.aClass40_660 = Static56.in.method1721();
				local26.anInt2294 = 100;
			}
			if ((local30 & 0x4) != 0) {
				local26.type = Static36.method640(Static56.in.g2());
				local26.anInt2290 = local26.type.anInt767;
				local26.anInt2269 = local26.type.anInt777;
				local26.anInt2304 = local26.type.anInt771;
				local26.anInt2285 = local26.type.anInt769;
				local26.size = local26.type.size;
				local26.anInt2322 = local26.type.anInt761;
				local26.anInt2303 = local26.type.anInt764;
			}
			if ((local30 & 0x10) != 0) {
				local26.anInt2280 = Static56.in.g2();
				local26.anInt2292 = Static56.in.method1705();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)Z")
	public static boolean method1110() {
		return Static106.aClass12_1 != null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!bb;IILclient!eb;)V")
	public static void method1111(@OriginalArg(0) GameShell arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Packet arg2) {
		if (Static58.aBoolean115) {
			return;
		}
		@Pc(12) Class2_Sub12 local12 = new Class2_Sub12();
		local12.anInt2350 = arg2.g1();
		local12.anInt2355 = arg2.g4();
		local12.aByteArrayArrayArray11 = new byte[local12.anInt2350][][];
		local12.aClass48Array2 = new Class48[local12.anInt2350];
		local12.anIntArray502 = new int[local12.anInt2350];
		local12.anIntArray499 = new int[local12.anInt2350];
		local12.anIntArray498 = new int[local12.anInt2350];
		local12.aClass48Array1 = new Class48[local12.anInt2350];
		for (@Pc(58) int local58 = 0; local58 < local12.anInt2350; local58++) {
			try {
				@Pc(64) int local64 = arg2.g1();
				@Pc(81) String local81;
				@Pc(92) String local92;
				@Pc(83) int local83;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local81 = new String(arg2.method1721().method1189());
					local83 = 0;
					local92 = new String(arg2.method1721().method1189());
					if (local64 == 1) {
						local83 = arg2.g4();
					}
					local12.anIntArray499[local58] = local64;
					local12.anIntArray502[local58] = local83;
					local12.aClass48Array2[local58] = arg0.method204(local92, Static100.method1583(local81));
				} else if (local64 == 3 || local64 == 4) {
					local81 = new String(arg2.method1721().method1189());
					local92 = new String(arg2.method1721().method1189());
					local83 = arg2.g1();
					@Pc(159) String[] local159 = new String[local83];
					for (@Pc(161) int local161 = 0; local161 < local83; local161++) {
						local159[local161] = new String(arg2.method1721().method1189());
					}
					@Pc(181) byte[][] local181 = new byte[local83][];
					@Pc(194) int local194;
					if (local64 == 3) {
						for (@Pc(188) int local188 = 0; local188 < local83; local188++) {
							local194 = arg2.g4();
							local181[local188] = new byte[local194];
							arg2.method1709(local194, local181[local188]);
						}
					}
					local12.anIntArray499[local58] = local64;
					@Pc(223) Class[] local223 = new Class[local83];
					for (local194 = 0; local194 < local83; local194++) {
						local223[local194] = Static100.method1583(local159[local194]);
					}
					local12.aClass48Array1[local58] = arg0.method201(Static100.method1583(local81), local92, local223);
					local12.aByteArrayArrayArray11[local58] = local181;
				}
			} catch (@Pc(258) ClassNotFoundException local258) {
				local12.anIntArray498[local58] = -1;
			} catch (@Pc(265) SecurityException local265) {
				local12.anIntArray498[local58] = -2;
			} catch (@Pc(272) NullPointerException local272) {
				local12.anIntArray498[local58] = -3;
			} catch (@Pc(279) Exception local279) {
				local12.anIntArray498[local58] = -4;
			} catch (@Pc(286) Throwable local286) {
				local12.anIntArray498[local58] = -5;
			}
		}
		Static104.aClass44_9.pushBack(local12);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public static void method1112() {
		aClass40_494 = null;
		stream = null;
		aClass2_Sub2_Sub2_Sub3Array8 = null;
		aClass40_496 = null;
		anIntArrayArray15 = null;
		aClass40_495 = null;
		flameGradient1 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!ud;I)Z")
	public static boolean method1113(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method65(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static86.method1384(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[BII)Lclient!o;")
	public static Class40 method1114(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class40 local7 = new Class40();
		local7.anInt1783 = arg0;
		local7.aByteArray14 = new byte[arg0];
		Static110.method993(arg1, arg2, local7.aByteArray14, 0, arg0);
		return local7;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V")
	public static void method1115(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static22.friendCount; local14++) {
			if (arg0 == Static21.friendName37[local14]) {
				Static22.friendCount--;
				Static33.redrawSidebar = true;
				for (@Pc(40) int local40 = local14; local40 < Static22.friendCount; local40++) {
					Static51.friendName[local40] = Static51.friendName[local40 + 1];
					Static62.friendWorld[local40] = Static62.friendWorld[local40 + 1];
					Static21.friendName37[local40] = Static21.friendName37[local40 + 1];
				}
				Static80.out.p1isaac(30);
				Static80.out.p8(arg0);
				return;
			}
		}
	}
}

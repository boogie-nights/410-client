import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
	public static int[] anIntArray355;

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
	public static int anInt1696;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "[Lclient!qb;")
	public static Pix8[] aClass2_Sub2_Sub2_Sub3Array8;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V", line = 17)
	public static void method1109() {
		for (@Pc(16) int local16 = 0; local16 < Static1.anInt1190; local16++) {
			@Pc(22) int local22 = Static1.anIntArray504[local16];
			@Pc(26) NpcEntity local26 = Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local22];
			@Pc(30) int local30 = client.in.g1();
			if ((local30 & 0x20) != 0) {
				local26.anInt2324 = client.in.g2();
				if (local26.anInt2324 == 65535) {
					local26.anInt2324 = -1;
				}
			}
			@Pc(57) int local57;
			@Pc(61) int local61;
			if ((local30 & 0x40) != 0) {
				local57 = client.in.g1_alt2();
				local61 = client.in.g1_alt1();
				local26.method1540(local57, Static1.anInt2511, local61);
				local26.anInt2315 = Static1.anInt2511 + 300;
				local26.anInt2298 = client.in.g1_alt3();
				local26.anInt2279 = client.in.g1_alt2();
			}
			if ((local30 & 0x8) != 0) {
				local57 = client.in.g2_alt2();
				local61 = client.in.g1();
				if (local57 == 65535) {
					local57 = -1;
				}
				if (local57 == local26.anInt2307 && local57 != -1) {
					@Pc(115) int local115 = Static57.method1042(local57).anInt662;
					if (local115 == 1) {
						local26.anInt2316 = 0;
						local26.anInt2267 = 0;
						local26.anInt2313 = local61;
						local26.anInt2300 = 0;
					}
					if (local115 == 2) {
						local26.anInt2300 = 0;
					}
				} else if (local57 == -1 || local26.anInt2307 == -1 || Static57.method1042(local57).anInt658 >= Static57.method1042(local26.anInt2307).anInt658) {
					local26.anInt2316 = 0;
					local26.anInt2300 = 0;
					local26.anInt2267 = 0;
					local26.anInt2307 = local57;
					local26.anInt2281 = local26.anInt2309;
					local26.anInt2313 = local61;
				}
			}
			if ((local30 & 0x1) != 0) {
				local57 = client.in.g1_alt2();
				local61 = client.in.g1_alt1();
				local26.method1540(local57, Static1.anInt2511, local61);
				local26.anInt2315 = Static1.anInt2511 + 300;
				local26.anInt2298 = client.in.g1();
				local26.anInt2279 = client.in.g1_alt2();
			}
			if ((local30 & 0x80) != 0) {
				local26.anInt2302 = client.in.g2_alt3();
				local57 = client.in.g4s_alt3();
				local26.anInt2320 = Static1.anInt2511 + (local57 & 0xFFFF);
				local26.anInt2289 = local57 >> 16;
				local26.anInt2291 = 0;
				if (local26.anInt2320 > Static1.anInt2511) {
					local26.anInt2291 = -1;
				}
				if (local26.anInt2302 == 65535) {
					local26.anInt2302 = -1;
				}
				local26.anInt2268 = 0;
			}
			if ((local30 & 0x2) != 0) {
				local26.aClass40_660 = client.in.gjstr();
				local26.anInt2294 = 100;
			}
			if ((local30 & 0x4) != 0) {
				local26.aClass2_Sub2_Sub7_1 = Static34.method640(client.in.g2());
				local26.anInt2290 = local26.aClass2_Sub2_Sub7_1.anInt767;
				local26.anInt2269 = local26.aClass2_Sub2_Sub7_1.anInt777;
				local26.anInt2304 = local26.aClass2_Sub2_Sub7_1.anInt771;
				local26.anInt2285 = local26.aClass2_Sub2_Sub7_1.anInt769;
				local26.anInt2278 = local26.aClass2_Sub2_Sub7_1.anInt758;
				local26.anInt2322 = local26.aClass2_Sub2_Sub7_1.anInt761;
				local26.anInt2303 = local26.aClass2_Sub2_Sub7_1.anInt764;
			}
			if ((local30 & 0x10) != 0) {
				local26.anInt2280 = client.in.g2();
				local26.anInt2292 = client.in.g2_alt1();
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)Z", line = 185)
	public static boolean method1110() {
		return Static98.aClass12_1 != null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!bb;IILclient!eb;)V", line = 196)
	public static void method1111(@OriginalArg(0) SignLink arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Packet arg2) {
		if (Static1.aBoolean115) {
			return;
		}
		@Pc(12) ReflectionCheckNode local12 = new ReflectionCheckNode();
		local12.size = arg2.g1();
		local12.id = arg2.g4s();
		local12.methodArguments = new byte[local12.size][][];
		local12.fieldRequests = new PrivilegedRequest[local12.size];
		local12.fieldValues = new int[local12.size];
		local12.types = new int[local12.size];
		local12.errors = new int[local12.size];
		local12.methodRequests = new PrivilegedRequest[local12.size];
		for (@Pc(58) int local58 = 0; local58 < local12.size; local58++) {
			try {
				@Pc(64) int local64 = arg2.g1();
				@Pc(81) String local81;
				@Pc(92) String local92;
				@Pc(83) int local83;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local81 = new String(arg2.gjstr().method1189());
					local83 = 0;
					local92 = new String(arg2.gjstr().method1189());
					if (local64 == 1) {
						local83 = arg2.g4s();
					}
					local12.types[local58] = local64;
					local12.fieldValues[local58] = local83;
					local12.fieldRequests[local58] = arg0.method204(local92, Static92.method1583(local81));
				} else if (local64 == 3 || local64 == 4) {
					local81 = new String(arg2.gjstr().method1189());
					local92 = new String(arg2.gjstr().method1189());
					local83 = arg2.g1();
					@Pc(159) String[] local159 = new String[local83];
					for (@Pc(161) int local161 = 0; local161 < local83; local161++) {
						local159[local161] = new String(arg2.gjstr().method1189());
					}
					@Pc(181) byte[][] local181 = new byte[local83][];
					@Pc(194) int local194;
					if (local64 == 3) {
						for (@Pc(188) int local188 = 0; local188 < local83; local188++) {
							local194 = arg2.g4s();
							local181[local188] = new byte[local194];
							arg2.gdata(local194, local181[local188]);
						}
					}
					local12.types[local58] = local64;
					@Pc(223) Class[] local223 = new Class[local83];
					for (local194 = 0; local194 < local83; local194++) {
						local223[local194] = Static92.method1583(local159[local194]);
					}
					local12.methodRequests[local58] = arg0.method201(Static92.method1583(local81), local92, local223);
					local12.methodArguments[local58] = local181;
				}
			} catch (@Pc(258) ClassNotFoundException local258) {
				local12.errors[local58] = -1;
			} catch (@Pc(265) SecurityException local265) {
				local12.errors[local58] = -2;
			} catch (@Pc(272) NullPointerException local272) {
				local12.errors[local58] = -3;
			} catch (@Pc(279) Exception local279) {
				local12.errors[local58] = -4;
			} catch (@Pc(286) Throwable local286) {
				local12.errors[local58] = -5;
			}
		}
		Static1.aClass44_9.addTail(local12);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 310)
	public static void method1112() {
		JagString.aClass40_494 = null;
		client.stream = null;
		aClass2_Sub2_Sub2_Sub3Array8 = null;
		JagString.aClass40_496 = null;
		Static1.anIntArrayArray15 = null;
		JagString.aClass40_495 = null;
		anIntArray355 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!ud;I)Z", line = 336)
	public static boolean method1113(@OriginalArg(1) Js5Index arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method65(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static78.method1384(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[BII)Lclient!o;", line = 354)
	public static JagString method1114(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) JagString local7 = new JagString();
		local7.anInt1783 = arg0;
		local7.aByteArray14 = new byte[arg0];
		Static107.method993(arg1, arg2, local7.aByteArray14, 0, arg0);
		return local7;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V", line = 380)
	public static void method1115(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static1.anInt2594; local14++) {
			if (arg0 == Static1.aLongArray2[local14]) {
				Static1.anInt2594--;
				Static1.aBoolean59 = true;
				for (@Pc(40) int local40 = local14; local40 < Static1.anInt2594; local40++) {
					Static1.aClass40Array23[local40] = Static1.aClass40Array23[local40 + 1];
					Static1.anIntArray316[local40] = Static1.anIntArray316[local40 + 1];
					Static1.aLongArray2[local40] = Static1.aLongArray2[local40 + 1];
				}
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(30);
				Static1.aClass2_Sub3_Sub1_4.p8(arg0);
				return;
			}
		}
	}
}

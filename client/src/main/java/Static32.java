import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_11;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lclient!ae;", line = 29)
	public static VarBitType method621(@OriginalArg(1) int arg0) {
		@Pc(10) VarBitType local10 = (VarBitType) Static1.aClass47_5.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static61.aClass5_21.method68(arg0, 14);
		local10 = new VarBitType();
		if (local20 != null) {
			local10.method121(new Packet(local20));
		}
		Static1.aClass47_5.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V", line = 56)
	public static void method622() {
		aClass5_11 = null;
		Static1.aClass14Array2 = null;
		JagString.aClass40_246 = null;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I", line = 68)
	public static int method623() {
		return Static1.anInt1497++;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!o;ILclient!eb;)I", line = 80)
	public static int method624(@OriginalArg(0) JagString arg0, @OriginalArg(2) Packet arg1) {
		@Pc(11) int local11 = arg1.pos;
		arg1.pSmart1or2(arg0.anInt1783);
		arg1.pos += Static89.aClass42_1.method1213(arg0.aByteArray14, arg0.anInt1783, arg1.data, 0, arg1.pos);
		return arg1.pos - local11;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Z", line = 97)
	public static boolean method625() {
		@Pc(3) long local3 = System.currentTimeMillis();
		@Pc(13) int local13 = (int) (local3 - Static29.aLong151);
		if (local13 > 200) {
			local13 = 200;
		}
		Static29.aLong151 = local3;
		Static1.anInt1510 += local13;
		if (Static1.anInt2182 == 0 && Static1.anInt2333 == 0 && Static1.anInt1077 == 0 && Static1.anInt34 == 0) {
			return true;
		} else if (Static29.aClass25_48 == null) {
			return false;
		} else {
			try {
				if (Static1.anInt1510 > 30000) {
					throw new IOException();
				}
				@Pc(58) Class2_Sub2_Sub9 local58;
				@Pc(63) Packet local63;
				while (Static1.anInt2333 < 20 && Static1.anInt34 > 0) {
					local58 = (Class2_Sub2_Sub9) Static1.aClass6_6.method184();
					local63 = new Packet(4);
					local63.p1(1);
					local63.p3((int) local58.aLong152);
					Static29.aClass25_48.method731(local63.data, 4);
					Static1.aClass6_5.method195(local58, local58.aLong152);
					Static1.anInt34--;
					Static1.anInt2333++;
				}
				while (Static1.anInt2182 < 20 && Static1.anInt1077 > 0) {
					local58 = (Class2_Sub2_Sub9) Static1.aClass41_1.method1203();
					local63 = new Packet(4);
					local63.p1(0);
					local63.p3((int) local58.aLong152);
					Static29.aClass25_48.method731(local63.data, 4);
					local58.method1637();
					Static1.aClass6_2.method195(local58, local58.aLong152);
					Static1.anInt1077--;
					Static1.anInt2182++;
				}
				for (@Pc(159) int local159 = 0; local159 < 100; local159++) {
					@Pc(165) int local165 = Static29.aClass25_48.method728();
					if (local165 < 0) {
						throw new IOException();
					}
					if (local165 == 0) {
						break;
					}
					Static1.anInt1510 = 0;
					@Pc(180) byte local180 = 0;
					if (Static82.aClass2_Sub2_Sub9_1 == null) {
						local180 = 8;
					} else if (Static1.anInt274 == 0) {
						local180 = 1;
					}
					@Pc(201) int local201;
					@Pc(218) int local218;
					@Pc(272) int local272;
					@Pc(280) int local280;
					if (local180 > 0) {
						local201 = local180 - Static1.aClass2_Sub3_5.pos;
						if (local165 < local201) {
							local201 = local165;
						}
						Static29.aClass25_48.method725(Static1.aClass2_Sub3_5.pos, local201, Static1.aClass2_Sub3_5.data);
						if (Static1.aByte1 != 0) {
							for (local218 = 0; local218 < local201; local218++) {
								Static1.aClass2_Sub3_5.data[local218 + Static1.aClass2_Sub3_5.pos] ^= Static1.aByte1;
							}
						}
						Static1.aClass2_Sub3_5.pos += local201;
						if (Static1.aClass2_Sub3_5.pos < local180) {
							break;
						}
						if (Static82.aClass2_Sub2_Sub9_1 == null) {
							Static1.aClass2_Sub3_5.pos = 0;
							local218 = Static1.aClass2_Sub3_5.g1();
							local272 = Static1.aClass2_Sub3_5.g2();
							@Pc(276) int local276 = Static1.aClass2_Sub3_5.g1();
							local280 = Static1.aClass2_Sub3_5.g4s();
							@Pc(287) long local287 = (long) ((local218 << 16) + local272);
							@Pc(293) Class2_Sub2_Sub9 local293 = (Class2_Sub2_Sub9) Static1.aClass6_5.method190(local287);
							Static85.aBoolean166 = true;
							if (local293 == null) {
								local293 = (Class2_Sub2_Sub9) Static1.aClass6_2.method190(local287);
								Static85.aBoolean166 = false;
							}
							if (local293 == null) {
								throw new IOException();
							}
							Static82.aClass2_Sub2_Sub9_1 = local293;
							@Pc(322) int local322 = local276 == 0 ? 5 : 9;
							Static27.aClass2_Sub3_2 = new Packet(Static82.aClass2_Sub2_Sub9_1.aByte2 + local322 + local280);
							Static27.aClass2_Sub3_2.p1(local276);
							Static27.aClass2_Sub3_2.p4(local280);
							Static1.aClass2_Sub3_5.pos = 0;
							Static1.anInt274 = 8;
						} else if (Static1.anInt274 == 0) {
							if (Static1.aClass2_Sub3_5.data[0] == -1) {
								Static1.anInt274 = 1;
								Static1.aClass2_Sub3_5.pos = 0;
							} else {
								Static82.aClass2_Sub2_Sub9_1 = null;
							}
						}
					} else {
						local201 = Static27.aClass2_Sub3_2.data.length - Static82.aClass2_Sub2_Sub9_1.aByte2;
						local218 = 512 - Static1.anInt274;
						if (local218 > local201 - Static27.aClass2_Sub3_2.pos) {
							local218 = local201 - Static27.aClass2_Sub3_2.pos;
						}
						if (local165 < local218) {
							local218 = local165;
						}
						Static29.aClass25_48.method725(Static27.aClass2_Sub3_2.pos, local218, Static27.aClass2_Sub3_2.data);
						if (Static1.aByte1 != 0) {
							for (local272 = 0; local272 < local218; local272++) {
								Static27.aClass2_Sub3_2.data[local272 + Static27.aClass2_Sub3_2.pos] ^= Static1.aByte1;
							}
						}
						Static27.aClass2_Sub3_2.pos += local218;
						Static1.anInt274 += local218;
						if (local201 == Static27.aClass2_Sub3_2.pos) {
							if (Static82.aClass2_Sub2_Sub9_1.aLong152 == 16711935L) {
								Static39.aClass2_Sub3_3 = Static27.aClass2_Sub3_2;
								for (local272 = 0; local272 < 256; local272++) {
									@Pc(482) Js5 local482 = Static1.aClass5_Sub1Array1[local272];
									if (local482 != null) {
										Static39.aClass2_Sub3_3.pos = local272 * 4 + 5;
										local280 = Static39.aClass2_Sub3_3.g4s();
										local482.method92(local280);
									}
								}
							} else {
								Static1.aCRC32_2.reset();
								Static1.aCRC32_2.update(Static27.aClass2_Sub3_2.data, 0, local201);
								local272 = (int) Static1.aCRC32_2.getValue();
								if (local272 != Static82.aClass2_Sub2_Sub9_1.anInt1013) {
									try {
										Static29.aClass25_48.method730();
									} catch (@Pc(530) Exception local530) {
									}
									Static1.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									Static29.aClass25_48 = null;
									Static1.anInt1792++;
									return false;
								}
								Static1.anInt1792 = 0;
								Static1.anInt2401 = 0;
								Static82.aClass2_Sub2_Sub9_1.aClass5_Sub1_9.method91(Static27.aClass2_Sub3_2.data, Static85.aBoolean166, (Static82.aClass2_Sub2_Sub9_1.aLong152 & 0xFF0000L) == 16711680L, (int) (Static82.aClass2_Sub2_Sub9_1.aLong152 & 0xFFFFL));
							}
							Static82.aClass2_Sub2_Sub9_1.method1677();
							Static27.aClass2_Sub3_2 = null;
							Static1.anInt274 = 0;
							Static82.aClass2_Sub2_Sub9_1 = null;
							if (Static85.aBoolean166) {
								Static1.anInt2333--;
							} else {
								Static1.anInt2182--;
							}
						} else {
							if (Static1.anInt274 != 512) {
								break;
							}
							Static1.anInt274 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(602) IOException local602) {
				try {
					Static29.aClass25_48.method730();
				} catch (@Pc(607) Exception local607) {
				}
				Static1.anInt2401++;
				Static29.aClass25_48 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 402)
	public static void method626() {
		if (Static1.anInt1672 > 0) {
			Static56.method1039();
		} else {
			Static7.method187(40);
			Static34.aClass25_20 = Static64.aClass25_36;
		}
	}
}

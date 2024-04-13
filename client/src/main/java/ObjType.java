import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class ObjType extends Hashable {

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_13;
	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!qc;")
	public static LruCache aClass47_16 = new LruCache(64);
	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!qc;")
	public static LruCache aClass47_18 = new LruCache(50);
	@OriginalMember(owner = "client!f", name = "jb", descriptor = "Lclient!qc;")
	public static LruCache aClass47_7 = new LruCache(100);
	@OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!hb", name = "ib", descriptor = "[I")
	public int[] anIntArray180;

	@OriginalMember(owner = "client!hb", name = "sb", descriptor = "Lclient!o;")
	public JagString aClass40_289;

	@OriginalMember(owner = "client!hb", name = "Lb", descriptor = "[I")
	private int[] anIntArray181;

	@OriginalMember(owner = "client!hb", name = "Nb", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!hb", name = "Sb", descriptor = "[I")
	public int[] anIntArray183;

	@OriginalMember(owner = "client!hb", name = "Zb", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
	private int anInt922 = -1;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
	public int anInt918 = 0;

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
	private int anInt925 = -1;

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
	private int anInt928 = -1;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
	private int anInt920 = 128;

	@OriginalMember(owner = "client!hb", name = "lb", descriptor = "I")
	private int anInt933 = -1;

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "[Lclient!o;")
	public JagString[] aClass40Array16 = new JagString[] { null, null, null, null, JagString.aClass40_642 };

	@OriginalMember(owner = "client!hb", name = "vb", descriptor = "I")
	public int anInt940 = 0;

	@OriginalMember(owner = "client!hb", name = "qb", descriptor = "I")
	public int anInt937 = 0;

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "Z")
	public boolean aBoolean66 = false;

	@OriginalMember(owner = "client!hb", name = "xb", descriptor = "I")
	public int anInt942 = 0;

	@OriginalMember(owner = "client!hb", name = "Kb", descriptor = "Lclient!o;")
	public JagString aClass40_290 = JagString.aClass40_253;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
	private int anInt923 = -1;

	@OriginalMember(owner = "client!hb", name = "Gb", descriptor = "I")
	public int anInt951 = 0;

	@OriginalMember(owner = "client!hb", name = "zb", descriptor = "I")
	private int anInt944 = -1;

	@OriginalMember(owner = "client!hb", name = "Cb", descriptor = "I")
	private int anInt947 = -1;

	@OriginalMember(owner = "client!hb", name = "Ub", descriptor = "I")
	private int anInt959 = 128;

	@OriginalMember(owner = "client!hb", name = "Bb", descriptor = "I")
	public int anInt946 = 0;

	@OriginalMember(owner = "client!hb", name = "ub", descriptor = "I")
	private int anInt939 = -1;

	@OriginalMember(owner = "client!hb", name = "rb", descriptor = "I")
	public int anInt938 = 1;

	@OriginalMember(owner = "client!hb", name = "Yb", descriptor = "I")
	private int anInt963 = -1;

	@OriginalMember(owner = "client!hb", name = "Qb", descriptor = "I")
	public int anInt956 = -1;

	@OriginalMember(owner = "client!hb", name = "kb", descriptor = "I")
	public int anInt932 = -1;

	@OriginalMember(owner = "client!hb", name = "Rb", descriptor = "I")
	private int anInt957 = 128;

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
	public int anInt926 = 2000;

	@OriginalMember(owner = "client!hb", name = "tb", descriptor = "[Lclient!o;")
	public JagString[] aClass40Array17 = new JagString[] { null, null, JagString.aClass40_163, null, null };

	@OriginalMember(owner = "client!hb", name = "ac", descriptor = "I")
	private int anInt964 = -1;

	@OriginalMember(owner = "client!hb", name = "Hb", descriptor = "I")
	public int anInt952 = 0;

	@OriginalMember(owner = "client!hb", name = "Wb", descriptor = "I")
	private int anInt961 = 0;

	@OriginalMember(owner = "client!hb", name = "Xb", descriptor = "I")
	private int anInt962 = 0;

	@OriginalMember(owner = "client!hb", name = "Jb", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!hb", name = "Vb", descriptor = "I")
	public int anInt960 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!hb;", line = 22)
    public static ObjType method1669(@OriginalArg(1) int arg0) {
        @Pc(18) ObjType local18 = (ObjType) aClass47_16.get((long) arg0);
        if (local18 != null) {
            return local18;
        }
        @Pc(28) byte[] local28 = aClass5_13.fetchFile(arg0, 10);
        local18 = new ObjType();
        local18.anInt954 = arg0;
        if (local28 != null) {
            local18.method724(new Packet(local28));
        }
        local18.method716();
        if (local18.anInt932 != -1) {
            local18.method721(method1669(local18.anInt956), method1669(local18.anInt932));
        }
        if (!Static40.aBoolean150 && local18.aBoolean66) {
            local18.aClass40Array16 = null;
            local18.aClass40Array17 = null;
            local18.aClass40_290 = JagString.aClass40_65;
            local18.aClass40_289 = JagString.aClass40_181;
            local18.anInt951 = 0;
        }
        aClass47_16.put((long) arg0, local18);
        return local18;
    }

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 11)
	public static void method1675() {
		aClass47_16.clear();
		aClass47_18.clear();
		aClass47_7.clear();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)Z", line = 5)
	public boolean method709(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt922;
		@Pc(9) int local9 = this.anInt933;
		@Pc(18) int local18 = this.anInt928;
		if (arg0) {
			local2 = this.anInt923;
			local18 = this.anInt925;
			local9 = this.anInt963;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static51.aClass5_29.method64(0, local2)) {
			local36 = false;
		}
		if (local9 != -1 && !Static51.aClass5_29.method64(0, local9)) {
			local36 = false;
		}
		if (local18 != -1 && !Static51.aClass5_29.method64(0, local18)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z", line = 49)
	public boolean method710(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt944;
		@Pc(9) int local9 = this.anInt939;
		if (arg0) {
			local6 = this.anInt964;
			local9 = this.anInt947;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static51.aClass5_29.method64(0, local6)) {
			local24 = false;
		}
		if (local9 != -1 && !Static51.aClass5_29.method64(0, local9)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)Lclient!ne;", line = 185)
	public Model method713(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15;
		if (this.anIntArray183 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray180[local15] <= arg0 && this.anIntArray180[local15] != 0) {
					local13 = this.anIntArray183[local15];
				}
			}
			if (local13 != -1) {
				return method1669(local13).method713(1, arg1);
			}
		}
		@Pc(65) Model local65;
		if (arg1) {
			local65 = (Model) aClass47_18.get((long) this.anInt954);
			if (local65 != null) {
				return local65;
			}
		}
		local65 = Static65.method1163(Static51.aClass5_29, this.anInt919);
		if (local65 == null) {
			return null;
		}
		if (this.anInt957 != 128 || this.anInt959 != 128 || this.anInt920 != 128) {
			local65.method1156(this.anInt957, this.anInt959, this.anInt920);
		}
		if (this.anIntArray181 != null) {
			for (local15 = 0; local15 < this.anIntArray181.length; local15++) {
				local65.method1140(this.anIntArray181[local15], this.anIntArray184[local15]);
			}
		}
		if (arg1) {
			local65.method1153(this.anInt942 + 64, this.anInt940 + 768, -50, -10, -50, true);
			local65.aBoolean139 = true;
			aClass47_18.put((long) this.anInt954, local65);
		}
		return local65;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZI)Lclient!ne;", line = 259)
	public Model method714(@OriginalArg(0) boolean arg0) {
		@Pc(16) int local16 = this.anInt944;
		@Pc(19) int local19 = this.anInt939;
		if (arg0) {
			local19 = this.anInt947;
			local16 = this.anInt964;
		}
		if (local16 == -1) {
			return null;
		}
		@Pc(37) Model local37 = Static65.method1163(Static51.aClass5_29, local16);
		if (local19 != -1) {
			@Pc(45) Model local45 = Static65.method1163(Static51.aClass5_29, local19);
			@Pc(56) Model[] local56 = new Model[] { local37, local45 };
			local37 = new Model(local56, 2);
		}
		if (this.anIntArray181 != null) {
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray181.length; local67++) {
				local37.method1140(this.anIntArray181[local67], this.anIntArray184[local67]);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V", line = 369)
	public void method716() {
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BZ)Lclient!ne;", line = 410)
	public Model method718(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt922;
		@Pc(11) int local11 = this.anInt933;
		@Pc(14) int local14 = this.anInt928;
		if (arg0) {
			local11 = this.anInt963;
			local8 = this.anInt923;
			local14 = this.anInt925;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Model local36 = Static65.method1163(Static51.aClass5_29, local8);
		if (local11 != -1) {
			@Pc(45) Model local45 = Static65.method1163(Static51.aClass5_29, local11);
			if (local14 == -1) {
				@Pc(59) Model[] local59 = new Model[] { local36, local45 };
				local36 = new Model(local59, 2);
			} else {
				@Pc(72) Model local72 = Static65.method1163(Static51.aClass5_29, local14);
				@Pc(87) Model[] local87 = new Model[] { local36, local45, local72 };
				local36 = new Model(local87, 3);
			}
		}
		if (!arg0 && this.anInt962 != 0) {
			local36.method1137(0, this.anInt962, 0);
		}
		if (arg0 && this.anInt961 != 0) {
			local36.method1137(0, this.anInt961, 0);
		}
		if (this.anIntArray181 != null) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArray181.length; local126++) {
				local36.method1140(this.anIntArray181[local126], this.anIntArray184[local126]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!hb;Lclient!hb;)V", line = 574)
	public void method721(@OriginalArg(1) ObjType arg0, @OriginalArg(2) ObjType arg1) {
		this.anInt937 = arg1.anInt937;
		this.anIntArray184 = arg1.anIntArray184;
		this.aClass40_289 = JagString.aClass40_719;
		this.aClass40_290 = arg0.aClass40_290;
		this.anIntArray181 = arg1.anIntArray181;
		this.anInt919 = arg1.anInt919;
		this.anInt918 = arg1.anInt918;
		this.aBoolean66 = arg0.aBoolean66;
		this.anInt960 = arg1.anInt960;
		this.anInt952 = arg1.anInt952;
		this.anInt938 = arg0.anInt938;
		this.aBoolean67 = true;
		this.anInt926 = arg1.anInt926;
		this.anInt946 = arg1.anInt946;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!eb;Z)V", line = 630)
	private void method723(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		if (arg0 == 1) {
			this.anInt919 = arg1.g2();
		} else if (arg0 == 2) {
			this.aClass40_290 = arg1.gjstr();
		} else if (arg0 == 3) {
			this.aClass40_289 = arg1.gjstr();
		} else if (arg0 == 4) {
			this.anInt926 = arg1.g2();
		} else if (arg0 == 5) {
			this.anInt952 = arg1.g2();
		} else if (arg0 == 6) {
			this.anInt918 = arg1.g2();
		} else if (arg0 == 7) {
			this.anInt946 = arg1.g2();
			if (this.anInt946 > 32767) {
				this.anInt946 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt960 = arg1.g2();
			if (this.anInt960 > 32767) {
				this.anInt960 -= 65536;
			}
		} else if (arg0 == 10) {
			arg1.g2();
		} else if (arg0 == 11) {
			this.aBoolean67 = true;
		} else if (arg0 == 12) {
			this.anInt938 = arg1.g4s();
		} else if (arg0 == 16) {
			this.aBoolean66 = true;
		} else if (arg0 == 23) {
			this.anInt922 = arg1.g2();
			this.anInt962 = arg1.g1();
		} else if (arg0 == 24) {
			this.anInt933 = arg1.g2();
		} else if (arg0 == 25) {
			this.anInt923 = arg1.g2();
			this.anInt961 = arg1.g1();
		} else if (arg0 == 26) {
			this.anInt963 = arg1.g2();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass40Array17[arg0 - 30] = arg1.gjstr();
			if (this.aClass40Array17[arg0 - 30].method1199(JagString.aClass40_346)) {
				this.aClass40Array17[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass40Array16[arg0 - 35] = arg1.gjstr();
		} else if (arg0 == 40) {
			@Pc(366) int local366 = arg1.g1();
			this.anIntArray181 = new int[local366];
			this.anIntArray184 = new int[local366];
			for (@Pc(376) int local376 = 0; local376 < local366; local376++) {
				this.anIntArray181[local376] = arg1.g2();
				this.anIntArray184[local376] = arg1.g2();
			}
		} else if (arg0 == 78) {
			this.anInt928 = arg1.g2();
		} else if (arg0 == 79) {
			this.anInt925 = arg1.g2();
		} else if (arg0 == 90) {
			this.anInt944 = arg1.g2();
		} else if (arg0 == 91) {
			this.anInt964 = arg1.g2();
		} else if (arg0 == 92) {
			this.anInt939 = arg1.g2();
		} else if (arg0 == 93) {
			this.anInt947 = arg1.g2();
		} else if (arg0 == 95) {
			this.anInt937 = arg1.g2();
		} else if (arg0 == 97) {
			this.anInt956 = arg1.g2();
		} else if (arg0 == 98) {
			this.anInt932 = arg1.g2();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray183 == null) {
				this.anIntArray183 = new int[10];
				this.anIntArray180 = new int[10];
			}
			this.anIntArray183[arg0 - 100] = arg1.g2();
			this.anIntArray180[arg0 - 100] = arg1.g2();
		} else if (arg0 == 110) {
			this.anInt957 = arg1.g2();
		} else if (arg0 == 111) {
			this.anInt959 = arg1.g2();
		} else if (arg0 == 112) {
			this.anInt920 = arg1.g2();
		} else if (arg0 == 113) {
			this.anInt942 = arg1.g1b();
		} else if (arg0 == 114) {
			this.anInt940 = arg1.g1b() * 5;
		} else if (arg0 == 115) {
			this.anInt951 = arg1.g1();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!eb;)V", line = 845)
	public void method724(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method723(local5, arg0);
		}
	}
}

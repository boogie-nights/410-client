import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class ObjType extends Class2_Sub2 {

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
	private int model;

	@OriginalMember(owner = "client!hb", name = "ib", descriptor = "[I")
	public int[] countco;

	@OriginalMember(owner = "client!hb", name = "sb", descriptor = "Lclient!o;")
	public Class40 desc;

	@OriginalMember(owner = "client!hb", name = "Lb", descriptor = "[I")
	private int[] recol_s;

	@OriginalMember(owner = "client!hb", name = "Nb", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!hb", name = "Sb", descriptor = "[I")
	public int[] countobj;

	@OriginalMember(owner = "client!hb", name = "Zb", descriptor = "[I")
	private int[] recol_d;

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
	private int manwear = -1;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
	public int yan2d = 0;

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
	private int womanwear3 = -1;

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
	private int manwear3 = -1;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
	private int anInt920 = 128;

	@OriginalMember(owner = "client!hb", name = "lb", descriptor = "I")
	private int manwear2 = -1;

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "[Lclient!o;")
	public Class40[] iops = new Class40[] { null, null, null, null, Static95.aClass40_642 };

	@OriginalMember(owner = "client!hb", name = "vb", descriptor = "I")
	public int anInt940 = 0;

	@OriginalMember(owner = "client!hb", name = "qb", descriptor = "I")
	public int zan2d = 0;

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "Z")
	public boolean members = false;

	@OriginalMember(owner = "client!hb", name = "xb", descriptor = "I")
	public int anInt942 = 0;

	@OriginalMember(owner = "client!hb", name = "Kb", descriptor = "Lclient!o;")
	public Class40 name = Static35.aClass40_253;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
	private int womanwear = -1;

	@OriginalMember(owner = "client!hb", name = "Gb", descriptor = "I")
	public int anInt951 = 0;

	@OriginalMember(owner = "client!hb", name = "zb", descriptor = "I")
	private int manhead = -1;

	@OriginalMember(owner = "client!hb", name = "Cb", descriptor = "I")
	private int womanhead2 = -1;

	@OriginalMember(owner = "client!hb", name = "Ub", descriptor = "I")
	private int anInt959 = 128;

	@OriginalMember(owner = "client!hb", name = "Bb", descriptor = "I")
	public int xoff2d = 0;

	@OriginalMember(owner = "client!hb", name = "ub", descriptor = "I")
	private int manhead2 = -1;

	@OriginalMember(owner = "client!hb", name = "rb", descriptor = "I")
	public int cost = 1;

	@OriginalMember(owner = "client!hb", name = "Yb", descriptor = "I")
	private int womanwear2 = -1;

	@OriginalMember(owner = "client!hb", name = "Qb", descriptor = "I")
	public int certlink = -1;

	@OriginalMember(owner = "client!hb", name = "kb", descriptor = "I")
	public int certTemplate = -1;

	@OriginalMember(owner = "client!hb", name = "Rb", descriptor = "I")
	private int anInt957 = 128;

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
	public int zoom2d = 2000;

	@OriginalMember(owner = "client!hb", name = "tb", descriptor = "[Lclient!o;")
	public Class40[] ops = new Class40[] { null, null, Static23.aClass40_163, null, null };

	@OriginalMember(owner = "client!hb", name = "ac", descriptor = "I")
	private int womanhead = -1;

	@OriginalMember(owner = "client!hb", name = "Hb", descriptor = "I")
	public int xan2d = 0;

	@OriginalMember(owner = "client!hb", name = "Wb", descriptor = "I")
	private int womanwearOffsetY = 0;

	@OriginalMember(owner = "client!hb", name = "Xb", descriptor = "I")
	private int manwearOffsetY = 0;

	@OriginalMember(owner = "client!hb", name = "Jb", descriptor = "Z")
	public boolean stackable = false;

	@OriginalMember(owner = "client!hb", name = "Vb", descriptor = "I")
	public int yoff2d = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)Z")
	public boolean method709(@OriginalArg(1) boolean isWoman) {
		@Pc(2) int id1 = this.manwear;
		@Pc(9) int id2 = this.manwear2;
		@Pc(18) int id3 = this.manwear3;
		if (isWoman) {
			id1 = this.womanwear;
			id3 = this.womanwear3;
			id2 = this.womanwear2;
		}
		if (id1 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static56.aClass5_29.method64(0, id1)) {
			local36 = false;
		}
		if (id2 != -1 && !Static56.aClass5_29.method64(0, id2)) {
			local36 = false;
		}
		if (id3 != -1 && !Static56.aClass5_29.method64(0, id3)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)Z")
	public boolean method710(@OriginalArg(0) boolean isWoman) {
		@Pc(6) int head1 = this.manhead;
		@Pc(9) int head2 = this.manhead2;
		if (isWoman) {
			head1 = this.womanhead;
			head2 = this.womanhead2;
		}
		if (head1 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static56.aClass5_29.method64(0, head1)) {
			local24 = false;
		}
		if (head2 != -1 && !Static56.aClass5_29.method64(0, head2)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)Lclient!ne;")
	public Class2_Sub2_Sub12_Sub4 method713(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15;
		if (this.countobj != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (this.countco[local15] <= arg0 && this.countco[local15] != 0) {
					local13 = this.countobj[local15];
				}
			}
			if (local13 != -1) {
				return Static105.get(local13).method713(1, arg1);
			}
		}
		@Pc(65) Class2_Sub2_Sub12_Sub4 model;
		if (arg1) {
			model = (Class2_Sub2_Sub12_Sub4) Static90.aClass47_18.method1325((long) this.anInt954);
			if (model != null) {
				return model;
			}
		}
		model = Static71.method1163(Static56.aClass5_29, this.model);
		if (model == null) {
			return null;
		}
		if (this.anInt957 != 128 || this.anInt959 != 128 || this.anInt920 != 128) {
			model.method1156(this.anInt957, this.anInt959, this.anInt920);
		}
		if (this.recol_s != null) {
			for (local15 = 0; local15 < this.recol_s.length; local15++) {
				model.method1140(this.recol_s[local15], this.recol_d[local15]);
			}
		}
		if (arg1) {
			model.calculateNormals(this.anInt942 + 64, this.anInt940 + 768, -50, -10, -50, true);
			model.aBoolean139 = true;
			Static90.aClass47_18.method1332((long) this.anInt954, model);
		}
		return model;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZI)Lclient!ne;")
	public Class2_Sub2_Sub12_Sub4 method714(@OriginalArg(0) boolean arg0) {
		@Pc(16) int local16 = this.manhead;
		@Pc(19) int local19 = this.manhead2;
		if (arg0) {
			local19 = this.womanhead2;
			local16 = this.womanhead;
		}
		if (local16 == -1) {
			return null;
		}
		@Pc(37) Class2_Sub2_Sub12_Sub4 local37 = Static71.method1163(Static56.aClass5_29, local16);
		if (local19 != -1) {
			@Pc(45) Class2_Sub2_Sub12_Sub4 local45 = Static71.method1163(Static56.aClass5_29, local19);
			@Pc(56) Class2_Sub2_Sub12_Sub4[] local56 = new Class2_Sub2_Sub12_Sub4[] { local37, local45 };
			local37 = new Class2_Sub2_Sub12_Sub4(local56, 2);
		}
		if (this.recol_s != null) {
			for (@Pc(67) int local67 = 0; local67 < this.recol_s.length; local67++) {
				local37.method1140(this.recol_s[local67], this.recol_d[local67]);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
	public void method716() {
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BZ)Lclient!ne;")
	public Class2_Sub2_Sub12_Sub4 method718(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.manwear;
		@Pc(11) int local11 = this.manwear2;
		@Pc(14) int local14 = this.manwear3;
		if (arg0) {
			local11 = this.womanwear2;
			local8 = this.womanwear;
			local14 = this.womanwear3;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class2_Sub2_Sub12_Sub4 local36 = Static71.method1163(Static56.aClass5_29, local8);
		if (local11 != -1) {
			@Pc(45) Class2_Sub2_Sub12_Sub4 local45 = Static71.method1163(Static56.aClass5_29, local11);
			if (local14 == -1) {
				@Pc(59) Class2_Sub2_Sub12_Sub4[] local59 = new Class2_Sub2_Sub12_Sub4[] { local36, local45 };
				local36 = new Class2_Sub2_Sub12_Sub4(local59, 2);
			} else {
				@Pc(72) Class2_Sub2_Sub12_Sub4 local72 = Static71.method1163(Static56.aClass5_29, local14);
				@Pc(87) Class2_Sub2_Sub12_Sub4[] local87 = new Class2_Sub2_Sub12_Sub4[] { local36, local45, local72 };
				local36 = new Class2_Sub2_Sub12_Sub4(local87, 3);
			}
		}
		if (!arg0 && this.manwearOffsetY != 0) {
			local36.method1137(0, this.manwearOffsetY, 0);
		}
		if (arg0 && this.womanwearOffsetY != 0) {
			local36.method1137(0, this.womanwearOffsetY, 0);
		}
		if (this.recol_s != null) {
			for (@Pc(126) int local126 = 0; local126 < this.recol_s.length; local126++) {
				local36.method1140(this.recol_s[local126], this.recol_d[local126]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!hb;Lclient!hb;)V")
	public void method721(@OriginalArg(1) ObjType arg0, @OriginalArg(2) ObjType arg1) {
		this.zan2d = arg1.zan2d;
		this.recol_d = arg1.recol_d;
		this.desc = Static107.aClass40_719;
		this.name = arg0.name;
		this.recol_s = arg1.recol_s;
		this.model = arg1.model;
		this.yan2d = arg1.yan2d;
		this.members = arg0.members;
		this.yoff2d = arg1.yoff2d;
		this.xan2d = arg1.xan2d;
		this.cost = arg0.cost;
		this.stackable = true;
		this.zoom2d = arg1.zoom2d;
		this.xoff2d = arg1.xoff2d;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!eb;Z)V")
	private void decode(@OriginalArg(0) int code, @OriginalArg(1) Packet dat) {
		if (code == 1) {
			this.model = dat.method1704();
		} else if (code == 2) {
			this.name = dat.method1721();
		} else if (code == 3) {
			this.desc = dat.method1721();
		} else if (code == 4) {
			this.zoom2d = dat.method1704();
		} else if (code == 5) {
			this.xan2d = dat.method1704();
		} else if (code == 6) {
			this.yan2d = dat.method1704();
		} else if (code == 7) {
			this.xoff2d = dat.method1704();
			if (this.xoff2d > 32767) {
				this.xoff2d -= 65536;
			}
		} else if (code == 8) {
			this.yoff2d = dat.method1704();
			if (this.yoff2d > 32767) {
				this.yoff2d -= 65536;
			}
		} else if (code == 10) {
			dat.method1704();
		} else if (code == 11) {
			this.stackable = true;
		} else if (code == 12) {
			this.cost = dat.method1728();
		} else if (code == 16) {
			this.members = true;
		} else if (code == 23) {
			this.manwear = dat.method1704();
			this.manwearOffsetY = dat.method1708();
		} else if (code == 24) {
			this.manwear2 = dat.method1704();
		} else if (code == 25) {
			this.womanwear = dat.method1704();
			this.womanwearOffsetY = dat.method1708();
		} else if (code == 26) {
			this.womanwear2 = dat.method1704();
		} else if (code >= 30 && code < 35) {
			this.ops[code - 30] = dat.method1721();
			if (this.ops[code - 30].method1199(Static48.aClass40_346)) {
				this.ops[code - 30] = null;
			}
		} else if (code >= 35 && code < 40) {
			this.iops[code - 35] = dat.method1721();
		} else if (code == 40) {
			@Pc(366) int count = dat.method1708();
			this.recol_s = new int[count];
			this.recol_d = new int[count];
			for (@Pc(376) int local376 = 0; local376 < count; local376++) {
				this.recol_s[local376] = dat.method1704();
				this.recol_d[local376] = dat.method1704();
			}
		} else if (code == 78) {
			this.manwear3 = dat.method1704();
		} else if (code == 79) {
			this.womanwear3 = dat.method1704();
		} else if (code == 90) {
			this.manhead = dat.method1704();
		} else if (code == 91) {
			this.womanhead = dat.method1704();
		} else if (code == 92) {
			this.manhead2 = dat.method1704();
		} else if (code == 93) {
			this.womanhead2 = dat.method1704();
		} else if (code == 95) {
			this.zan2d = dat.method1704();
		} else if (code == 97) {
			this.certlink = dat.method1704();
		} else if (code == 98) {
			this.certTemplate = dat.method1704();
		} else if (code >= 100 && code < 110) {
			if (this.countobj == null) {
				this.countobj = new int[10];
				this.countco = new int[10];
			}
			this.countobj[code - 100] = dat.method1704();
			this.countco[code - 100] = dat.method1704();
		} else if (code == 110) {
			this.anInt957 = dat.method1704();
		} else if (code == 111) {
			this.anInt959 = dat.method1704();
		} else if (code == 112) {
			this.anInt920 = dat.method1704();
		} else if (code == 113) {
			this.anInt942 = dat.method1696();
		} else if (code == 114) {
			this.anInt940 = dat.method1696() * 5;
		} else if (code == 115) {
			this.anInt951 = dat.method1708();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!eb;)V")
	public void method724(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1708();
			if (local5 == 0) {
				return;
			}
			this.decode(local5, arg0);
		}
	}
}

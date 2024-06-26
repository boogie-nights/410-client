package jagex2;

import jagex2.datastruct.Hashable;
import jagex2.graphics.Model;
import jagex2.graphics.Static71;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub2_Sub7 extends Hashable {

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "Lclient!o;")
	public Class40 aClass40_237;

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!gb", name = "tb", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!gb", name = "yb", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
	public int anInt764 = -1;

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
	public int anInt766 = -1;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	public int anInt761 = -1;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "[Lclient!o;")
	public final Class40[] aClass40Array14 = new Class40[5];

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
	public int anInt771 = -1;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
	private int anInt759 = 0;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
	private int anInt765 = -1;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
	public int anInt769 = 32;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
	public int anInt773 = -1;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
	private int anInt768 = -1;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "Z")
	public boolean aBoolean56 = true;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "I")
	public int anInt777 = -1;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
	private int anInt763 = 128;

	@OriginalMember(owner = "client!gb", name = "ub", descriptor = "Z")
	public boolean aBoolean58 = true;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
	public int anInt767 = -1;

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "I")
	private int anInt779 = 0;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!gb", name = "vb", descriptor = "Lclient!o;")
	public Class40 aClass40_238 = Static81.aClass40_561;

	@OriginalMember(owner = "client!gb", name = "zb", descriptor = "I")
	private int anInt782 = 128;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!f;Lclient!f;III)Lclient!ne;")
	public Model method605(@OriginalArg(0) Class2_Sub2_Sub6 arg0, @OriginalArg(1) Class2_Sub2_Sub6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray154 != null) {
			@Pc(12) Class2_Sub2_Sub7 local12 = this.method611();
			return local12 == null ? null : local12.method605(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Model local37 = (Model) Static90.aClass47_19.get((long) this.anInt762);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray155.length; local43++) {
				if (!Static103.aClass5_30.method64(0, this.anIntArray155[local43])) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(75) Model[] local75 = new Model[this.anIntArray155.length];
			for (@Pc(77) int local77 = 0; local77 < this.anIntArray155.length; local77++) {
				local75[local77] = Static71.method1163(Static103.aClass5_30, this.anIntArray155[local77]);
			}
			if (local75.length == 1) {
				local37 = local75[0];
			} else {
				local37 = new Model(local75, local75.length);
			}
			if (this.anIntArray156 != null) {
				for (@Pc(121) int local121 = 0; local121 < this.anIntArray156.length; local121++) {
					local37.recolor(this.anIntArray156[local121], this.anIntArray153[local121]);
				}
			}
			local37.method1160();
			local37.calculateNormals(this.anInt779 + 64, this.anInt759 + 850, -30, -50, -30, true);
			Static90.aClass47_19.put((long) this.anInt762, local37);
		}
		@Pc(179) Model local179;
		if (arg0 != null && arg1 != null) {
			local179 = arg0.method519(arg1, arg3, local37, arg2);
		} else if (arg0 != null) {
			local179 = arg0.method526(local37, arg2);
		} else if (arg1 == null) {
			local179 = local37.method1142(true);
		} else {
			local179 = arg1.method526(local37, arg3);
		}
		if (this.anInt782 != 128 || this.anInt763 != 128) {
			local179.scale(this.anInt782, this.anInt763, this.anInt782);
		}
		return local179;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)Z")
	public boolean method606() {
		if (this.anIntArray154 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt765 != -1) {
			local10 = Static107.method1662(this.anInt765);
		} else if (this.anInt768 != -1) {
			local10 = Static67.varps[this.anInt768];
		}
		return local10 >= 0 && this.anIntArray154.length > local10 && this.anIntArray154[local10] != -1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLclient!eb;)V")
	public void method608(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method610(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!eb;BI)V")
	private void method610(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local8 = arg0.g1();
			this.anIntArray155 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray155[local14] = arg0.g2();
			}
		} else if (arg1 == 2) {
			this.aClass40_238 = arg0.method1721();
		} else if (arg1 == 3) {
			this.aClass40_237 = arg0.method1721();
		} else if (arg1 == 12) {
			this.size = arg0.g1();
		} else if (arg1 == 13) {
			this.anInt767 = arg0.g2();
		} else if (arg1 == 14) {
			this.anInt777 = arg0.g2();
		} else if (arg1 == 17) {
			this.anInt777 = arg0.g2();
			this.anInt764 = arg0.g2();
			this.anInt771 = arg0.g2();
			this.anInt761 = arg0.g2();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass40Array14[arg1 - 30] = arg0.method1721();
			if (this.aClass40Array14[arg1 - 30].method1199(Static48.aClass40_346)) {
				this.aClass40Array14[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.g1();
			this.anIntArray156 = new int[local8];
			this.anIntArray153 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray156[local14] = arg0.g2();
				this.anIntArray153[local14] = arg0.g2();
			}
		} else if (arg1 == 60) {
			local8 = arg0.g1();
			this.anIntArray157 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray157[local14] = arg0.g2();
			}
		} else if (arg1 == 93) {
			this.aBoolean56 = false;
		} else if (arg1 == 95) {
			this.anInt766 = arg0.g2();
		} else if (arg1 == 97) {
			this.anInt782 = arg0.g2();
		} else if (arg1 == 98) {
			this.anInt763 = arg0.g2();
		} else if (arg1 == 99) {
			this.aBoolean57 = true;
		} else if (arg1 == 100) {
			this.anInt779 = arg0.g1b();
		} else if (arg1 == 101) {
			this.anInt759 = arg0.g1b() * 5;
		} else if (arg1 == 102) {
			this.anInt773 = arg0.g2();
		} else if (arg1 == 103) {
			this.anInt769 = arg0.g2();
		} else if (arg1 == 106) {
			this.anInt765 = arg0.g2();
			if (this.anInt765 == 65535) {
				this.anInt765 = -1;
			}
			this.anInt768 = arg0.g2();
			if (this.anInt768 == 65535) {
				this.anInt768 = -1;
			}
			local8 = arg0.g1();
			this.anIntArray154 = new int[local8 + 1];
			for (local14 = 0; local14 <= local8; local14++) {
				this.anIntArray154[local14] = arg0.g2();
				if (this.anIntArray154[local14] == 65535) {
					this.anIntArray154[local14] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean58 = false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)Lclient!gb;")
	public Class2_Sub2_Sub7 method611() {
		@Pc(13) int local13 = -1;
		if (this.anInt765 != -1) {
			local13 = Static107.method1662(this.anInt765);
		} else if (this.anInt768 != -1) {
			local13 = Static67.varps[this.anInt768];
		}
		return local13 < 0 || this.anIntArray154.length <= local13 || this.anIntArray154[local13] == -1 ? null : Static36.method640(this.anIntArray154[local13]);
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V")
	public void method612() {
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)Lclient!ne;")
	public Model method615() {
		if (this.anIntArray154 != null) {
			@Pc(12) Class2_Sub2_Sub7 local12 = this.method611();
			return local12 == null ? null : local12.method615();
		} else if (this.anIntArray157 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray157.length; local29++) {
				if (!Static103.aClass5_30.method64(0, this.anIntArray157[local29])) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Model[] local57 = new Model[this.anIntArray157.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray157.length; local59++) {
				local57[local59] = Static71.method1163(Static103.aClass5_30, this.anIntArray157[local59]);
			}
			@Pc(94) Model local94;
			if (local57.length == 1) {
				local94 = local57[0];
			} else {
				local94 = new Model(local57, local57.length);
			}
			if (this.anIntArray156 != null) {
				for (@Pc(105) int local105 = 0; local105 < this.anIntArray156.length; local105++) {
					local94.recolor(this.anIntArray156[local105], this.anIntArray153[local105]);
				}
			}
			return local94;
		}
	}
}

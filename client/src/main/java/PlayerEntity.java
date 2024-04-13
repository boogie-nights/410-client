import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class PlayerEntity extends PathingEntity {

	@OriginalMember(owner = "client!kc", name = "Gc", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!kc", name = "Hc", descriptor = "I")
	public int anInt1369;

	@OriginalMember(owner = "client!kc", name = "Mc", descriptor = "Lclient!ne;")
	public Model aClass2_Sub2_Sub12_Sub4_1;

	@OriginalMember(owner = "client!kc", name = "Oc", descriptor = "I")
	public int anInt1375;

	@OriginalMember(owner = "client!kc", name = "Pc", descriptor = "I")
	public int anInt1376;

	@OriginalMember(owner = "client!kc", name = "Tc", descriptor = "I")
	public int anInt1379;

	@OriginalMember(owner = "client!kc", name = "Yc", descriptor = "Lclient!o;")
	public JagString aClass40_395;

	@OriginalMember(owner = "client!kc", name = "ad", descriptor = "I")
	public int anInt1384;

	@OriginalMember(owner = "client!kc", name = "fd", descriptor = "I")
	public int anInt1386;

	@OriginalMember(owner = "client!kc", name = "gd", descriptor = "I")
	public int anInt1387;

	@OriginalMember(owner = "client!kc", name = "id", descriptor = "Lclient!le;")
	public PlayerAppearance aClass33_2;

	@OriginalMember(owner = "client!kc", name = "Ic", descriptor = "I")
	public int anInt1370 = -1;

	@OriginalMember(owner = "client!kc", name = "Qc", descriptor = "I")
	public int anInt1377 = 0;

	@OriginalMember(owner = "client!kc", name = "Vc", descriptor = "I")
	public int anInt1381 = 0;

	@OriginalMember(owner = "client!kc", name = "Uc", descriptor = "I")
	public int anInt1380 = -1;

	@OriginalMember(owner = "client!kc", name = "Xc", descriptor = "I")
	public int anInt1382 = 0;

	@OriginalMember(owner = "client!kc", name = "Lc", descriptor = "I")
	public int anInt1373 = 0;

	@OriginalMember(owner = "client!kc", name = "Rc", descriptor = "I")
	public int anInt1378 = 0;

	@OriginalMember(owner = "client!kc", name = "nd", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!eb;I)V", line = 88)
	public void method918(@OriginalArg(0) Packet buf) {
		buf.pos = 0;
		@Pc(14) int local14 = buf.g1();
		this.anInt1380 = buf.g1b();
		@Pc(23) int local23 = -1;
		this.anInt1370 = buf.g1b();
		@Pc(33) int[] local33 = new int[12];
		this.anInt1382 = 0;
		@Pc(59) int local59;
		@Pc(96) int local96;
		for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
			@Pc(44) int local44 = buf.g1();
			if (local44 == 0) {
				local33[local38] = 0;
			} else {
				local59 = buf.g1();
				local33[local38] = local59 + (local44 << 8);
				if (local38 == 0 && local33[0] == 65535) {
					local23 = buf.g2();
					break;
				}
				if (local33[local38] >= 512) {
					local96 = Static97.method1669(local33[local38] - 512).anInt951;
					if (local96 != 0) {
						this.anInt1382 = local96;
					}
				}
			}
		}
		@Pc(111) int[] local111 = new int[5];
		for (local59 = 0; local59 < 5; local59++) {
			local96 = buf.g1();
			if (local96 < 0 || local96 >= Static1.anIntArrayArray6[local59].length) {
				local96 = 0;
			}
			local111[local59] = local96;
		}
		super.anInt2290 = buf.g2();
		if (super.anInt2290 == 65535) {
			super.anInt2290 = -1;
		}
		super.anInt2276 = buf.g2();
		if (super.anInt2276 == 65535) {
			super.anInt2276 = -1;
		}
		super.anInt2269 = buf.g2();
		if (super.anInt2269 == 65535) {
			super.anInt2269 = -1;
		}
		super.anInt2303 = buf.g2();
		if (super.anInt2303 == 65535) {
			super.anInt2303 = -1;
		}
		super.anInt2304 = buf.g2();
		if (super.anInt2304 == 65535) {
			super.anInt2304 = -1;
		}
		super.anInt2322 = buf.g2();
		if (super.anInt2322 == 65535) {
			super.anInt2322 = -1;
		}
		super.anInt2273 = buf.g2();
		if (super.anInt2273 == 65535) {
			super.anInt2273 = -1;
		}
		this.aClass40_395 = Static44.fromBase37(buf.g8()).method1167();
		this.anInt1378 = buf.g1();
		this.anInt1373 = buf.g2();
		if (this.aClass33_2 == null) {
			this.aClass33_2 = new PlayerAppearance();
		}
		this.aClass33_2.method1001(local14 == 1, local111, local23, local33);
	}

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "(I)Z", line = 422)
	@Override
	public boolean method1544() {
		return this.aClass33_2 != null;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)Lclient!ne;", line = 437)
	@Override
	protected Model method1533() {
		if (this.aClass33_2 == null) {
			return null;
		}
		@Pc(28) SeqType local28 = super.anInt2307 != -1 && super.anInt2313 == 0 ? Static57.method1042(super.anInt2307) : null;
		@Pc(49) SeqType local49 = super.anInt2318 == -1 || this.aBoolean104 || super.anInt2290 == super.anInt2318 && local28 != null ? null : Static57.method1042(super.anInt2318);
		@Pc(60) Model local60 = this.aClass33_2.method1005(super.anInt2316, super.anInt2295, local28, local49);
		if (local60 == null) {
			return null;
		}
		local60.method1135();
		super.anInt2310 = local60.anInt2265;
		@Pc(91) Model local91;
		@Pc(111) Model[] local111;
		if (!this.aBoolean104 && super.anInt2302 != -1 && super.anInt2291 != -1) {
			local91 = Static5.method116(super.anInt2302).method501(super.anInt2291);
			if (local91 != null) {
				local91.method1137(0, -super.anInt2289, 0);
				local111 = new Model[] { local60, local91 };
				local60 = new Model(local111, 2, true);
			}
		}
		if (!this.aBoolean104 && this.aClass2_Sub2_Sub12_Sub4_1 != null) {
			if (this.anInt1381 <= Static1.anInt2511) {
				this.aClass2_Sub2_Sub12_Sub4_1 = null;
			}
			if (Static1.anInt2511 >= this.anInt1377 && Static1.anInt2511 < this.anInt1381) {
				local91 = this.aClass2_Sub2_Sub12_Sub4_1;
				local111 = new Model[] { local60, local91 };
				local91.method1137(this.anInt1387 - super.anInt2275, -this.anInt1379 + this.anInt1384, this.anInt1375 - super.anInt2284);
				if (super.anInt2283 == 512) {
					local91.method1148();
					local91.method1148();
					local91.method1148();
				} else if (super.anInt2283 == 1024) {
					local91.method1148();
					local91.method1148();
				} else if (super.anInt2283 == 1536) {
					local91.method1148();
				}
				local60 = new Model(local111, 2, true);
				if (super.anInt2283 == 512) {
					local91.method1148();
				} else if (super.anInt2283 == 1024) {
					local91.method1148();
					local91.method1148();
				} else if (super.anInt2283 == 1536) {
					local91.method1148();
					local91.method1148();
					local91.method1148();
				}
				local91.method1137(super.anInt2275 - this.anInt1387, this.anInt1379 + -this.anInt1384, super.anInt2284 - this.anInt1375);
			}
		}
		local60.aBoolean139 = true;
		return local60;
	}
}

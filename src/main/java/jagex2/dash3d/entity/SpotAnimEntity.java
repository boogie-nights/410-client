package jagex2.dash3d.entity;

import jagex2.Class2_Sub2_Sub5;
import jagex2.Class2_Sub2_Sub6;
import jagex2.Static5;
import jagex2.Static62;
import jagex2.graphics.Entity;
import jagex2.graphics.Model;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class SpotAnimEntity extends Entity {

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
	private int anInt2224 = 0;

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "Z")
	public boolean seqComplete = false;

	@OriginalMember(owner = "client!u", name = "Ab", descriptor = "I")
	private int anInt2236 = 0;

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
	public final int anInt2223;

	@OriginalMember(owner = "client!u", name = "yb", descriptor = "I")
	public final int level;

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "I")
	public final int startCycle;

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "I")
	public final int x;

	@OriginalMember(owner = "client!u", name = "wb", descriptor = "I")
	private final int anInt2233;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
	public final int z;

	@OriginalMember(owner = "client!u", name = "rb", descriptor = "Lclient!f;")
	private Class2_Sub2_Sub6 aClass2_Sub2_Sub6_3;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIII)V")
	public SpotAnimEntity(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2223 = arg4;
		this.level = arg1;
		this.startCycle = arg5 + arg6;
		this.x = arg2;
		this.anInt2233 = arg0;
		this.z = arg3;
		@Pc(36) int local36 = Static5.method116(this.anInt2233).anInt640;
		if (local36 == -1) {
			this.seqComplete = true;
		} else {
			this.seqComplete = false;
			this.aClass2_Sub2_Sub6_3 = Static62.method1042(local36);
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Model draw() {
		@Pc(4) Class2_Sub2_Sub5 local4 = Static5.method116(this.anInt2233);
		@Pc(12) Model local12;
		if (this.seqComplete) {
			local12 = local4.method501(-1);
		} else {
			local12 = local4.method501(this.anInt2236);
		}
		return local12 == null ? null : local12;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V")
	public void update(@OriginalArg(0) int arg0) {
		if (this.seqComplete) {
			return;
		}
		this.anInt2224 += arg0;
		while (this.anInt2224 > this.aClass2_Sub2_Sub6_3.anIntArray128[this.anInt2236]) {
			this.anInt2224 -= this.aClass2_Sub2_Sub6_3.anIntArray128[this.anInt2236];
			this.anInt2236++;
			if (this.anInt2236 >= this.aClass2_Sub2_Sub6_3.anIntArray124.length) {
				this.seqComplete = true;
				return;
			}
		}
	}
}

package jagex2.dash3d.entity;

import jagex2.Class2_Sub2_Sub6;
import jagex2.Class2_Sub2_Sub7;
import jagex2.Static5;
import jagex2.Static62;
import jagex2.graphics.Model;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class NpcEntity extends PathingEntity {

	@OriginalMember(owner = "client!ua", name = "Rc", descriptor = "Lclient!gb;")
	public Class2_Sub2_Sub7 type;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Model draw() {
		if (this.type == null) {
			return null;
		}
		@Pc(28) Class2_Sub2_Sub6 local28 = super.primarySeqId != -1 && super.anInt2313 == 0 ? Static62.method1042(super.primarySeqId) : null;
		@Pc(50) Class2_Sub2_Sub6 local50 = super.anInt2318 == -1 || super.anInt2318 == super.anInt2290 && local28 != null ? null : Static62.method1042(super.anInt2318);
		@Pc(61) Model local61 = this.type.method605(local28, local50, super.anInt2316, super.anInt2295);
		if (local61 == null) {
			return null;
		}
		local61.method1135();
		super.anInt2310 = local61.maxY;
		if (super.anInt2302 != -1 && super.anInt2291 != -1) {
			@Pc(89) Model local89 = Static5.method116(super.anInt2302).method501(super.anInt2291);
			if (local89 != null) {
				local89.translate(0, -super.anInt2289, 0);
				@Pc(109) Model[] local109 = new Model[] { local61, local89 };
				local61 = new Model(local109, 2, true);
			}
		}
		if (this.type.size == 1) {
			local61.pickable = true;
		}
		return local61;
	}

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "(I)Z")
	public boolean isVisible() {
		return this.type != null;
	}
}

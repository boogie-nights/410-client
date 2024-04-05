import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class41 {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!ja;")
	private final Hashable aClass2_Sub2_43 = new Hashable();

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class41() {
		this.aClass2_Sub2_43.nextHasable = this.aClass2_Sub2_43;
		this.aClass2_Sub2_43.prevHashable = this.aClass2_Sub2_43;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ja;B)V")
	public void method1201(@OriginalArg(0) Hashable arg0) {
		if (arg0.prevHashable != null) {
			arg0.uncache();
		}
		arg0.nextHasable = this.aClass2_Sub2_43;
		arg0.prevHashable = this.aClass2_Sub2_43.prevHashable;
		arg0.prevHashable.nextHasable = arg0;
		arg0.nextHasable.prevHashable = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!ja;")
	public Hashable method1202() {
		@Pc(7) Hashable local7 = this.aClass2_Sub2_43.nextHasable;
		if (this.aClass2_Sub2_43 == local7) {
			return null;
		} else {
			local7.uncache();
			return local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!ja;")
	public Hashable method1203() {
		@Pc(12) Hashable local12 = this.aClass2_Sub2_43.nextHasable;
		return local12 == this.aClass2_Sub2_43 ? null : local12;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!ja;)V")
	public void method1204(@OriginalArg(1) Hashable arg0) {
		if (arg0.prevHashable != null) {
			arg0.uncache();
		}
		arg0.prevHashable = this.aClass2_Sub2_43;
		arg0.nextHasable = this.aClass2_Sub2_43.nextHasable;
		arg0.prevHashable.nextHasable = arg0;
		arg0.nextHasable.prevHashable = arg0;
	}
}

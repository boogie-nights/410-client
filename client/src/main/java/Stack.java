import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Stack {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!ja;")
	private final Hashable aClass2_Sub2_43 = new Hashable();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ja;B)V", line = 3)
	public void method1201(@OriginalArg(0) Hashable arg0) {
		if (arg0.aClass2_Sub2_60 != null) {
			arg0.method1637();
		}
		arg0.aClass2_Sub2_59 = this.aClass2_Sub2_43;
		arg0.aClass2_Sub2_60 = this.aClass2_Sub2_43.aClass2_Sub2_60;
		arg0.aClass2_Sub2_60.aClass2_Sub2_59 = arg0;
		arg0.aClass2_Sub2_59.aClass2_Sub2_60 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!ja;", line = 22)
	public Hashable method1202() {
		@Pc(7) Hashable local7 = this.aClass2_Sub2_43.aClass2_Sub2_59;
		if (this.aClass2_Sub2_43 == local7) {
			return null;
		} else {
			local7.method1637();
			return local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!ja;", line = 59)
	public Hashable method1203() {
		@Pc(12) Hashable local12 = this.aClass2_Sub2_43.aClass2_Sub2_59;
		return local12 == this.aClass2_Sub2_43 ? null : local12;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!ja;)V", line = 113)
	public void method1204(@OriginalArg(1) Hashable arg0) {
		if (arg0.aClass2_Sub2_60 != null) {
			arg0.method1637();
		}
		arg0.aClass2_Sub2_60 = this.aClass2_Sub2_43;
		arg0.aClass2_Sub2_59 = this.aClass2_Sub2_43.aClass2_Sub2_59;
		arg0.aClass2_Sub2_60.aClass2_Sub2_59 = arg0;
		arg0.aClass2_Sub2_59.aClass2_Sub2_60 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 129)
	public Stack() {
		this.aClass2_Sub2_43.aClass2_Sub2_59 = this.aClass2_Sub2_43;
		this.aClass2_Sub2_43.aClass2_Sub2_60 = this.aClass2_Sub2_43;
	}
}

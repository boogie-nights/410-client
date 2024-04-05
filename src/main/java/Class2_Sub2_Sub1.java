import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub2_Sub1 extends Hashable {

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!eb;I)V")
	private void method119(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt174 = arg0.method1704();
			this.anInt171 = arg0.method1708();
			this.anInt170 = arg0.method1708();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!eb;B)V")
	public void method121(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1708();
			if (local9 == 0) {
				return;
			}
			this.method119(arg0, local9);
		}
	}
}

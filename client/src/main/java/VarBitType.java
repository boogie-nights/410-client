import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class VarBitType extends Hashable {

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!eb;I)V", line = 121)
	private void method119(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt174 = arg0.g2();
			this.anInt171 = arg0.g1();
			this.anInt170 = arg0.g1();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!eb;B)V", line = 159)
	public void method121(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.g1();
			if (local9 == 0) {
				return;
			}
			this.method119(arg0, local9);
		}
	}
}

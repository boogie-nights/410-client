import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class VarpType extends Hashable {

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	public int anInt1076 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!eb;Z)V", line = 57)
	public void method788(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method789(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!eb;II)V", line = 96)
	private void method789(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1076 = arg0.g2();
		}
	}
}

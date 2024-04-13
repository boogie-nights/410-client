import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class VarBitType extends Hashable {

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!qc;")
    public static LruCache aClass47_5 = new LruCache(64);
    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!ud;")
    public static Js5Index aClass5_21;
    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
	public int anInt174;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Lclient!ae;", line = 29)
	public static VarBitType method621(@OriginalArg(1) int arg0) {
		@Pc(10) VarBitType local10 = (VarBitType) aClass47_5.get((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = aClass5_21.fetchFile(arg0, 14);
		local10 = new VarBitType();
		if (local20 != null) {
			local10.method121(new Packet(local20));
		}
		aClass47_5.put((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ud;I)V", line = 78)
	public static void load(@OriginalArg(0) Js5Index arg0) {
		aClass5_21 = arg0;
	}

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

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class VarpType extends Hashable {

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!qc;")
	public static LruCache aClass47_12 = new LruCache(64);
	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_9;
	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	public int anInt1076 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lclient!ic;", line = 192)
    public static VarpType method1568(@OriginalArg(1) int arg0) {
        @Pc(10) VarpType local10 = (VarpType) aClass47_12.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(20) byte[] local20 = aClass5_9.fetchFile(arg0, 16);
        local10 = new VarpType();
        if (local20 != null) {
            local10.method788(new Packet(local20));
        }
        aClass47_12.put((long) arg0, local10);
        return local10;
    }

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V", line = 222)
	public static void clear() {
		aClass47_12.clear();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ud;Z)V", line = 783)
	public static void load(@OriginalArg(0) Js5Index arg0) {
		aClass5_9 = arg0;
		Static54.anInt1505 = aClass5_9.getGroupCapacity(16);
	}

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

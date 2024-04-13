import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lclient!pc;)I", line = 222)
	public static int method1293(@OriginalArg(0) PcmStream arg0) {
		return arg0.method1288() >> 5;
	}
}

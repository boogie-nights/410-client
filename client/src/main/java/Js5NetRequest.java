import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Js5NetRequest extends Hashable {

	@OriginalMember(owner = "client!i", name = "S", descriptor = "B")
	public byte trailerLen;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "Lclient!ad;")
	public Js5 js5;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "I")
	public int blockPosition;
}

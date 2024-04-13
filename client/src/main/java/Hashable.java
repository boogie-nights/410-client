import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class Hashable extends Linkable {

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!ja;")
	public Hashable nextHashable;

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "Lclient!ja;")
	public Hashable prevHashable;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 227)
	public final void uncache() {
		if (this.prevHashable != null) {
			this.prevHashable.nextHashable = this.nextHashable;
			this.nextHashable.prevHashable = this.prevHashable;
			this.nextHashable = null;
			this.prevHashable = null;
		}
	}
}

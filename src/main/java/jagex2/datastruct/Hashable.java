package jagex2.datastruct;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class Hashable extends Linkable {

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!ja;")
	public Hashable nextHasable;

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "Lclient!ja;")
	public Hashable prevHashable;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
	public final void uncache() {
		if (this.prevHashable != null) {
			this.prevHashable.nextHasable = this.nextHasable;
			this.nextHasable.prevHashable = this.prevHashable;
			this.nextHasable = null;
			this.prevHashable = null;
		}
	}
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class Linkable {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!g;")
	public Linkable prev;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "J")
	public long key;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!g;")
	public Linkable next;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 59)
	public final void unlink() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.prev = null;
			this.next = null;
		}
	}
}

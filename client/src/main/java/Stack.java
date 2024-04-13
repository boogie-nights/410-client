import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Stack {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!ja;")
	private final Hashable sentinel = new Hashable();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ja;B)V", line = 3)
	public void push(@OriginalArg(0) Hashable node) {
		if (node.prevHashable != null) {
			node.uncache();
		}
		node.nextHashable = this.sentinel;
		node.prevHashable = this.sentinel.prevHashable;
		node.prevHashable.nextHashable = node;
		node.nextHashable.prevHashable = node;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!ja;", line = 22)
	public Hashable pop() {
		@Pc(7) Hashable node = this.sentinel.nextHashable;
		if (this.sentinel == node) {
			return null;
		} else {
			node.uncache();
			return node;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!ja;", line = 59)
	public Hashable next() {
		@Pc(12) Hashable node = this.sentinel.nextHashable;
		return node == this.sentinel ? null : node;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!ja;)V", line = 113)
	public void addTail(@OriginalArg(1) Hashable node) {
		if (node.prevHashable != null) {
			node.uncache();
		}
		node.prevHashable = this.sentinel;
		node.nextHashable = this.sentinel.nextHashable;
		node.prevHashable.nextHashable = node;
		node.nextHashable.prevHashable = node;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 129)
	public Stack() {
		this.sentinel.nextHashable = this.sentinel;
		this.sentinel.prevHashable = this.sentinel;
	}
}

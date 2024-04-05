package jagex2.datastruct;

import jagex2.datastruct.Hashable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Stack {

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!ja;")
	private final Hashable head = new Hashable();

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Stack() {
		this.head.nextHashable = this.head;
		this.head.prevHashable = this.head;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ja;B)V")
	public void push(@OriginalArg(0) Hashable node) {
		if (node.prevHashable != null) {
			node.uncache();
		}
		node.nextHashable = this.head;
		node.prevHashable = this.head.prevHashable;
		node.prevHashable.nextHashable = node;
		node.nextHashable.prevHashable = node;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!ja;)V")
	public void method1204(@OriginalArg(1) Hashable node) {
		if (node.prevHashable != null) {
			node.uncache();
		}
		node.prevHashable = this.head;
		node.nextHashable = this.head.nextHashable;
		node.prevHashable.nextHashable = node;
		node.nextHashable.prevHashable = node;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!ja;")
	public Hashable pop() {
		@Pc(7) Hashable node = this.head.nextHashable;
		if (this.head == node) {
			return null;
		} else {
			node.uncache();
			return node;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!ja;")
	public Hashable method1203() {
		@Pc(12) Hashable local12 = this.head.nextHashable;
		return local12 == this.head ? null : local12;
	}
}

package jagex2.datastruct;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class LinkedList {

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!g;")
	private Linkable peeked;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!g;")
	public final Linkable head = new Linkable();

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public LinkedList() {
		this.head.next = this.head;
		this.head.prev = this.head;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lclient!g;")
	public Linkable pollLast() {
		@Pc(15) Linkable node = this.head.next;
		if (this.head == node) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lclient!g;")
	public Linkable pollFront() {
		@Pc(3) Linkable node = this.head.prev;
		if (this.head == node) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!g;)V")
	public void pushBack(@OriginalArg(1) Linkable node) {
		if (node.next != null) {
			node.unlink();
		}
		node.prev = this.head;
		node.next = this.head.next;
		node.next.prev = node;
		node.prev.next = node;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public void clear() {
		while (true) {
			@Pc(14) Linkable node = this.head.prev;
			if (this.head == node) {
				return;
			}
			node.unlink();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!g;Lclient!g;)V")
	public void insertBefore(@OriginalArg(1) Linkable existing, @OriginalArg(2) Linkable inserting) {
		if (inserting.next != null) {
			inserting.unlink();
		}
		inserting.prev = existing;
		inserting.next = existing.next;
		inserting.next.prev = inserting;
		inserting.prev.next = inserting;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lclient!g;")
	public Linkable peekFront() {
		@Pc(7) Linkable node = this.head.prev;
		if (node == this.head) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.prev;
			return node;
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lclient!g;")
	public Linkable next() {
		@Pc(13) Linkable node = this.peeked;
		if (node == this.head) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Lclient!g;")
	public Linkable peekBack() {
		@Pc(7) Linkable node = this.head.next;
		if (this.head == node) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.next;
			return node;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(BLclient!g;)V")
	public void pushFront(@OriginalArg(1) Linkable node) {
		if (node.next != null) {
			node.unlink();
		}
		node.next = this.head;
		node.prev = this.head.prev;
		node.next.prev = node;
		node.prev.next = node;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Lclient!g;")
	public Linkable prev() {
		@Pc(6) Linkable node = this.peeked;
		if (node == this.head) {
			this.peeked = null;
			return null;
		} else {
			this.peeked = node.prev;
			return node;
		}
	}
}

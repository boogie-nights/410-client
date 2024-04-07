package jagex2.datastruct;

import jagex2.datastruct.HashTable;
import jagex2.datastruct.Hashable;
import jagex2.datastruct.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class LruCache {

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!ja;")
	private final Hashable aClass2_Sub2_46 = new Hashable();

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!oa;")
	private final Stack history = new Stack();

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!ba;")
	private final HashTable hashTable;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public LruCache(@OriginalArg(0) int size) {
		this.available = size;
		this.capacity = size;
		@Pc(19) int i;
		for (i = 1; i + i < size; i += i) { }
		this.hashTable = new HashTable(i);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)Lclient!ja;")
	public Hashable get(@OriginalArg(0) long key) {
		@Pc(16) Hashable node = (Hashable) this.hashTable.get(key);
		if (node != null) {
			this.history.push(node);
		}
		return node;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V")
	public void method1327(@OriginalArg(1) long key) {
		@Pc(16) Hashable node = (Hashable) this.hashTable.get(key);
		if (node != null) {
			node.unlink();
			node.uncache();
			this.available++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public void clear() {
		while (true) {
			@Pc(22) Hashable node = this.history.pop();
			if (node == null) {
				this.available = this.capacity;
				return;
			}
			node.unlink();
			node.uncache();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJLclient!ja;)V")
	public void put(@OriginalArg(1) long key, @OriginalArg(2) Hashable value) {
		if (this.available == 0) {
			@Pc(19) Hashable node = this.history.pop();
			node.unlink();
			node.uncache();
			if (node == this.aClass2_Sub2_46) {
				node = this.history.pop();
				node.unlink();
				node.uncache();
			}
		} else {
			this.available--;
		}
		this.hashTable.put(key, value);
		this.history.push(value);
	}
}

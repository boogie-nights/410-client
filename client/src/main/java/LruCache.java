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
	private final HashTable hashtable;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)Lclient!ja;", line = 19)
	public Hashable get(@OriginalArg(0) long key) {
		@Pc(16) Hashable local16 = (Hashable) this.hashtable.get(key);
		if (local16 != null) {
			this.history.push(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V", line = 55)
	public void method1327(@OriginalArg(1) long key) {
		@Pc(16) Hashable local16 = (Hashable) this.hashtable.get(key);
		if (local16 != null) {
			local16.unlink();
			local16.uncache();
			this.available++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 119)
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

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJLclient!ja;)V", line = 232)
	public void put(@OriginalArg(1) long key, @OriginalArg(2) Hashable value) {
		if (this.available == 0) {
			@Pc(19) Hashable local19 = this.history.pop();
			local19.unlink();
			local19.uncache();
			if (local19 == this.aClass2_Sub2_46) {
				local19 = this.history.pop();
				local19.unlink();
				local19.uncache();
			}
		} else {
			this.available--;
		}
		this.hashtable.put(value, key);
		this.history.push(value);
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 320)
	public LruCache(@OriginalArg(0) int size) {
		this.available = size;
		this.capacity = size;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < size; local19 += local19) {
		}
		this.hashtable = new HashTable(local19);
	}
}

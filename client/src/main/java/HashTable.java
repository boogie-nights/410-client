import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class HashTable {

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!g;")
	private Linkable searchCursor;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "J")
	private long searchKey;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!g;")
	private Linkable iteratorCursor;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	private int iteratorBucket = 0;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[Lclient!g;")
	private final Linkable[] buckets;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	private final int bucketCount;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!g;", line = 14)
	public Linkable nextWithKey() {
		if (this.searchCursor == null) {
			return null;
		}
		@Pc(21) Linkable sentinel = this.buckets[(int) (this.searchKey & (long) (this.bucketCount - 1))];
		while (sentinel != this.searchCursor) {
			if (this.searchCursor.key == this.searchKey) {
				@Pc(32) Linkable value = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return value;
			}
			this.searchCursor = this.searchCursor.next;
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lclient!g;", line = 59)
	public Linkable head() {
		this.iteratorBucket = 0;
		return this.next();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Lclient!g;", line = 360)
	public Linkable get(@OriginalArg(1) long key) {
		this.searchKey = key;
		@Pc(23) Linkable sentinel = this.buckets[(int) ((long) (this.bucketCount - 1) & key)];
		for (this.searchCursor = sentinel.next; this.searchCursor != sentinel; this.searchCursor = this.searchCursor.next) {
			if (key == this.searchCursor.key) {
				@Pc(37) Linkable value = this.searchCursor;
				this.searchCursor = this.searchCursor.next;
				return value;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Lclient!g;", line = 416)
	private Linkable next() {
		@Pc(27) Linkable node;
		if (this.iteratorBucket > 0 && this.iteratorCursor != this.buckets[this.iteratorBucket - 1]) {
			node = this.iteratorCursor;
			this.iteratorCursor = node.next;
			return node;
		}
		while (this.iteratorBucket < this.bucketCount) {
			node = this.buckets[this.iteratorBucket++].next;
			if (this.buckets[this.iteratorBucket - 1] != node) {
				this.iteratorCursor = node.next;
				return node;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!g;J)V", line = 469)
	public void put(@OriginalArg(1) Linkable value, @OriginalArg(2) long key) {
		if (value.prev != null) {
			value.unlink();
		}
		@Pc(21) Linkable sentinel = this.buckets[(int) ((long) (this.bucketCount - 1) & key)];
		value.key = key;
		value.next = sentinel;
		value.prev = sentinel.prev;
		value.prev.next = value;
		value.next.prev = value;
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V", line = 570)
	public HashTable(@OriginalArg(0) int size) {
		this.buckets = new Linkable[size];
		this.bucketCount = size;
		for (@Pc(13) int i = 0; i < size; i++) {
			@Pc(23) Linkable sentinel = this.buckets[i] = new Linkable();
			sentinel.next = sentinel;
			sentinel.prev = sentinel;
		}
	}
}

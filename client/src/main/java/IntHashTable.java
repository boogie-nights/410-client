import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class IntHashTable {

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "[I")
	private final int[] buckets;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I", line = 28)
	public int get(@OriginalArg(1) int key) {
		@Pc(14) int mask = this.buckets.length - 2;
		@Pc(20) int hash = mask & key << 1;
		while (true) {
			@Pc(25) int value = this.buckets[hash];
			if (key == value) {
				return this.buckets[hash + 1];
			}
			if (value == -1) {
				return -1;
			}
			hash = hash + 2 & mask;
		}
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([I)V", line = 216)
	public IntHashTable(@OriginalArg(0) int[] keys) {
		@Pc(5) int bucketCount;
		for (bucketCount = 1; bucketCount <= keys.length + (keys.length >> 1); bucketCount <<= 0x1) {
		}
		this.buckets = new int[bucketCount + bucketCount];
		for (@Pc(32) int i = 0; i < bucketCount + bucketCount; i++) {
			this.buckets[i] = -1;
		}
		@Pc(47) int value = 0;
		while (value < keys.length) {
			@Pc(57) int hash;
			for (hash = keys[value] & bucketCount - 1; this.buckets[hash + hash + 1] != -1; hash = bucketCount - 1 & hash + 1) {
			}
			this.buckets[hash + hash] = keys[value];
			this.buckets[hash + hash + 1] = value++;
		}
	}
}

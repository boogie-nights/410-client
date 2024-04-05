package jagex2.datastruct;

import jagex2.datastruct.Linkable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class HashTable {

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!g;")
	private Linkable aClass2_13;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!g;")
	private Linkable aClass2_14;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	private int anInt247 = 0;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[Lclient!g;")
	private final Linkable[] nodes;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	private final int size;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public HashTable(@OriginalArg(0) int size) {
		this.nodes = new Linkable[size];
		this.size = size;
		for (@Pc(13) int i = 0; i < size; i++) {
			@Pc(23) Linkable node = this.nodes[i] = new Linkable();
			node.prev = node;
			node.next = node;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!g;")
	public Linkable method182() {
		if (this.aClass2_13 == null) {
			return null;
		}
		@Pc(21) Linkable node = this.nodes[(int) (this.aLong19 & (long) (this.size - 1))];
		while (node != this.aClass2_13) {
			if (this.aClass2_13.id == this.aLong19) {
				@Pc(32) Linkable local32 = this.aClass2_13;
				this.aClass2_13 = this.aClass2_13.prev;
				return local32;
			}
			this.aClass2_13 = this.aClass2_13.prev;
		}
		this.aClass2_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lclient!g;")
	public Linkable method184() {
		this.anInt247 = 0;
		return this.method193();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Lclient!g;")
	public Linkable get(@OriginalArg(1) long arg0) {
		this.aLong19 = arg0;
		@Pc(23) Linkable local23 = this.nodes[(int) ((long) (this.size - 1) & arg0)];
		for (this.aClass2_13 = local23.prev; this.aClass2_13 != local23; this.aClass2_13 = this.aClass2_13.prev) {
			if (arg0 == this.aClass2_13.id) {
				@Pc(37) Linkable local37 = this.aClass2_13;
				this.aClass2_13 = this.aClass2_13.prev;
				return local37;
			}
		}
		this.aClass2_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Lclient!g;")
	private Linkable method193() {
		@Pc(27) Linkable local27;
		if (this.anInt247 > 0 && this.aClass2_14 != this.nodes[this.anInt247 - 1]) {
			local27 = this.aClass2_14;
			this.aClass2_14 = local27.prev;
			return local27;
		}
		while (this.anInt247 < this.size) {
			local27 = this.nodes[this.anInt247++].prev;
			if (this.nodes[this.anInt247 - 1] != local27) {
				this.aClass2_14 = local27.prev;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!g;J)V")
	public void put(@OriginalArg(2) long key, @OriginalArg(1) Linkable value) {
		if (value.next != null) {
			value.unlink();
		}
		@Pc(21) Linkable node = this.nodes[(int) ((long) (this.size - 1) & key)];
		value.id = key;
		value.prev = node;
		value.next = node.next;
		value.next.prev = value;
		value.prev.next = value;
	}
}

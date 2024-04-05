package jagex2;

import jagex2.datastruct.Linkable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class6 {

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!g;")
	private Linkable aClass2_13;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!g;")
	private Linkable aClass2_14;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	private int anInt247 = 0;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "[Lclient!g;")
	private final Linkable[] aClass2Array1;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	private final int anInt236;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public Class6(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Linkable[arg0];
		this.anInt236 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Linkable local23 = this.aClass2Array1[local13] = new Linkable();
			local23.prev = local23;
			local23.next = local23;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!g;")
	public Linkable method182() {
		if (this.aClass2_13 == null) {
			return null;
		}
		@Pc(21) Linkable local21 = this.aClass2Array1[(int) (this.aLong19 & (long) (this.anInt236 - 1))];
		while (local21 != this.aClass2_13) {
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
	public Linkable method190(@OriginalArg(1) long arg0) {
		this.aLong19 = arg0;
		@Pc(23) Linkable local23 = this.aClass2Array1[(int) ((long) (this.anInt236 - 1) & arg0)];
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
		if (this.anInt247 > 0 && this.aClass2_14 != this.aClass2Array1[this.anInt247 - 1]) {
			local27 = this.aClass2_14;
			this.aClass2_14 = local27.prev;
			return local27;
		}
		while (this.anInt247 < this.anInt236) {
			local27 = this.aClass2Array1[this.anInt247++].prev;
			if (this.aClass2Array1[this.anInt247 - 1] != local27) {
				this.aClass2_14 = local27.prev;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!g;J)V")
	public void method195(@OriginalArg(1) Linkable arg0, @OriginalArg(2) long arg1) {
		if (arg0.next != null) {
			arg0.unlink();
		}
		@Pc(21) Linkable local21 = this.aClass2Array1[(int) ((long) (this.anInt236 - 1) & arg1)];
		arg0.id = arg1;
		arg0.prev = local21;
		arg0.next = local21.next;
		arg0.next.prev = arg0;
		arg0.prev.next = arg0;
	}
}

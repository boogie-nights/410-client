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
	private final Linkable[] aClass2Array1;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	private final int anInt236;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!g;", line = 14)
	public Linkable method182() {
		if (this.aClass2_13 == null) {
			return null;
		}
		@Pc(21) Linkable local21 = this.aClass2Array1[(int) (this.aLong19 & (long) (this.anInt236 - 1))];
		while (local21 != this.aClass2_13) {
			if (this.aClass2_13.aLong152 == this.aLong19) {
				@Pc(32) Linkable local32 = this.aClass2_13;
				this.aClass2_13 = this.aClass2_13.aClass2_94;
				return local32;
			}
			this.aClass2_13 = this.aClass2_13.aClass2_94;
		}
		this.aClass2_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lclient!g;", line = 59)
	public Linkable method184() {
		this.anInt247 = 0;
		return this.method193();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Lclient!g;", line = 360)
	public Linkable method190(@OriginalArg(1) long arg0) {
		this.aLong19 = arg0;
		@Pc(23) Linkable local23 = this.aClass2Array1[(int) ((long) (this.anInt236 - 1) & arg0)];
		for (this.aClass2_13 = local23.aClass2_94; this.aClass2_13 != local23; this.aClass2_13 = this.aClass2_13.aClass2_94) {
			if (arg0 == this.aClass2_13.aLong152) {
				@Pc(37) Linkable local37 = this.aClass2_13;
				this.aClass2_13 = this.aClass2_13.aClass2_94;
				return local37;
			}
		}
		this.aClass2_13 = null;
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Lclient!g;", line = 416)
	private Linkable method193() {
		@Pc(27) Linkable local27;
		if (this.anInt247 > 0 && this.aClass2_14 != this.aClass2Array1[this.anInt247 - 1]) {
			local27 = this.aClass2_14;
			this.aClass2_14 = local27.aClass2_94;
			return local27;
		}
		while (this.anInt247 < this.anInt236) {
			local27 = this.aClass2Array1[this.anInt247++].aClass2_94;
			if (this.aClass2Array1[this.anInt247 - 1] != local27) {
				this.aClass2_14 = local27.aClass2_94;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!g;J)V", line = 469)
	public void method195(@OriginalArg(1) Linkable arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_93 != null) {
			arg0.method1677();
		}
		@Pc(21) Linkable local21 = this.aClass2Array1[(int) ((long) (this.anInt236 - 1) & arg1)];
		arg0.aLong152 = arg1;
		arg0.aClass2_94 = local21;
		arg0.aClass2_93 = local21.aClass2_93;
		arg0.aClass2_93.aClass2_94 = arg0;
		arg0.aClass2_94.aClass2_93 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V", line = 570)
	public HashTable(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Linkable[arg0];
		this.anInt236 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Linkable local23 = this.aClass2Array1[local13] = new Linkable();
			local23.aClass2_94 = local23;
			local23.aClass2_93 = local23;
		}
	}
}

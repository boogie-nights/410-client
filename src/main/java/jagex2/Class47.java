package jagex2;

import jagex2.datastruct.Hashable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class47 {

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!ja;")
	private final Hashable aClass2_Sub2_46 = new Hashable();

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!oa;")
	private final Class41 aClass41_2 = new Class41();

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	private int anInt1925;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	private final int anInt1924;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!ba;")
	private final Class6 aClass6_4;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class47(@OriginalArg(0) int arg0) {
		this.anInt1925 = arg0;
		this.anInt1924 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass6_4 = new Class6(local19);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)Lclient!ja;")
	public Hashable method1325(@OriginalArg(0) long arg0) {
		@Pc(16) Hashable local16 = (Hashable) this.aClass6_4.method190(arg0);
		if (local16 != null) {
			this.aClass41_2.method1201(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V")
	public void method1327(@OriginalArg(1) long arg0) {
		@Pc(16) Hashable local16 = (Hashable) this.aClass6_4.method190(arg0);
		if (local16 != null) {
			local16.unlink();
			local16.uncache();
			this.anInt1925++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public void method1330() {
		while (true) {
			@Pc(22) Hashable local22 = this.aClass41_2.method1202();
			if (local22 == null) {
				this.anInt1925 = this.anInt1924;
				return;
			}
			local22.unlink();
			local22.uncache();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJLclient!ja;)V")
	public void method1332(@OriginalArg(1) long arg0, @OriginalArg(2) Hashable arg1) {
		if (this.anInt1925 == 0) {
			@Pc(19) Hashable local19 = this.aClass41_2.method1202();
			local19.unlink();
			local19.uncache();
			if (local19 == this.aClass2_Sub2_46) {
				local19 = this.aClass41_2.method1202();
				local19.unlink();
				local19.uncache();
			}
		} else {
			this.anInt1925--;
		}
		this.aClass6_4.method195(arg1, arg0);
		this.aClass41_2.method1201(arg1);
	}
}

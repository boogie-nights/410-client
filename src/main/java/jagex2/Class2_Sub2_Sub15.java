package jagex2;

import jagex2.datastruct.Hashable;
import jagex2.graphics.Model;
import jagex2.graphics.Static71;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub2_Sub15 extends Hashable {

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
	private int[] anIntArray516;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
	private final int[] anIntArray515 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
	private final int[] anIntArray514 = new int[6];

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
	public int anInt2386 = -1;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
	private final int[] anIntArray517 = new int[6];

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lclient!ne;")
	public Model method1579() {
		if (this.anIntArray516 == null) {
			return null;
		}
		@Pc(15) Model[] local15 = new Model[this.anIntArray516.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray516.length; local17++) {
			local15[local17] = Static71.method1163(Static72.aClass5_22, this.anIntArray516[local17]);
		}
		@Pc(45) Model local45;
		if (local15.length == 1) {
			local45 = local15[0];
		} else {
			local45 = new Model(local15, local15.length);
		}
		for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray514[local61] != 0; local61++) {
			local45.recolor(this.anIntArray514[local61], this.anIntArray517[local61]);
		}
		return local45;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
	public boolean method1582() {
		if (this.anIntArray516 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray516.length; local12++) {
			if (!Static72.aClass5_22.method64(0, this.anIntArray516[local12])) {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)Z")
	public boolean method1585() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray515[local9] != -1 && !Static72.aClass5_22.method64(0, this.anIntArray515[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)Lclient!ne;")
	public Model method1586() {
		@Pc(4) Model[] local4 = new Model[5];
		@Pc(6) int local6 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray515[local12] != -1) {
				local4[local6++] = Static71.method1163(Static72.aClass5_22, this.anIntArray515[local12]);
			}
		}
		@Pc(46) Model local46 = new Model(local4, local6);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray514[local48] != 0; local48++) {
			local46.recolor(this.anIntArray514[local48], this.anIntArray517[local48]);
		}
		return local46;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1587(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.g1();
			if (local13 == 0) {
				return;
			}
			this.method1588(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!eb;II)V")
	private void method1588(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2386 = arg0.g1();
		} else if (arg1 == 2) {
			@Pc(17) int local17 = arg0.g1();
			this.anIntArray516 = new int[local17];
			for (@Pc(23) int local23 = 0; local23 < local17; local23++) {
				this.anIntArray516[local23] = arg0.g2();
			}
		} else if (arg1 == 3) {
			this.aBoolean178 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray514[arg1 - 40] = arg0.g2();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray517[arg1 - 50] = arg0.g2();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray515[arg1 - 60] = arg0.g2();
		}
	}
}

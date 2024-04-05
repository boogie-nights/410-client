package jagex2;

import jagex2.datastruct.Hashable;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub2_Sub4 extends Hashable {

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
	public int anInt591;

	@OriginalMember(owner = "client!ec", name = "tb", descriptor = "I")
	public int anInt594;

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
	public int anInt581 = 0;

	@OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
	public int anInt593 = -1;

	@OriginalMember(owner = "client!ec", name = "rb", descriptor = "Z")
	public boolean aBoolean45 = true;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILclient!eb;I)V")
	private void method475(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt581 = arg1.method1718();
		} else if (arg0 == 2) {
			this.anInt582 = arg1.g1();
		} else if (arg0 == 5) {
			this.aBoolean45 = false;
		} else if (arg0 == 7) {
			this.anInt593 = arg1.method1718();
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
	public void method476() {
		if (this.anInt593 != -1) {
			this.method479(this.anInt593);
			this.anInt591 = this.anInt585;
			this.anInt578 = this.anInt594;
			this.anInt586 = this.anInt588;
		}
		this.method479(this.anInt581);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!eb;BI)V")
	public void method478(@OriginalArg(0) Packet arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.g1();
			if (local14 == 0) {
				return;
			}
			this.method475(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	private void method479(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local31;
		if (local10 < local31) {
			local40 = local10;
		}
		if (local40 > local38) {
			local40 = local38;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = local31;
		if (local31 < local10) {
			local56 = local10;
		}
		if (local56 < local38) {
			local56 = local38;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local56 + local40) / 2.0D;
		this.anInt594 = (int) (local76 * 256.0D);
		if (this.anInt594 < 0) {
			this.anInt594 = 0;
		} else if (this.anInt594 > 255) {
			this.anInt594 = 255;
		}
		if (local40 != local56) {
			if (local76 < 0.5D) {
				local70 = (local56 - local40) / (local56 + local40);
			}
			if (local76 >= 0.5D) {
				local70 = (local56 - local40) / (2.0D - local56 - local40);
			}
			if (local31 == local56) {
				local54 = (local10 - local38) / (local56 - local40);
			} else if (local56 == local10) {
				local54 = (local38 - local31) / (local56 - local40) + 2.0D;
			} else if (local56 == local38) {
				local54 = (local31 - local10) / (local56 - local40) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt585 = (int) (local70 * 256.0D);
		this.anInt588 = (int) (local54 * 256.0D);
		if (this.anInt585 < 0) {
			this.anInt585 = 0;
		} else if (this.anInt585 > 255) {
			this.anInt585 = 255;
			return;
		}
	}
}

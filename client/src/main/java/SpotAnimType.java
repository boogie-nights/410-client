import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class SpotAnimType extends Hashable {

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "I")
	private int anInt630 = 0;

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
	private int anInt633 = 128;

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
	private int anInt627 = 128;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "[I")
	private final int[] anIntArray113 = new int[6];

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
	public int anInt640 = -1;

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
	private int anInt636 = 0;

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "[I")
	private final int[] anIntArray114 = new int[6];

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
	private int anInt628 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Lclient!ne;", line = 6)
	public Model method501(@OriginalArg(1) int arg0) {
		@Pc(13) Model local13 = (Model) Static1.aClass47_15.method1325((long) this.anInt634);
		if (local13 == null) {
			local13 = Static65.method1163(Static84.aClass5_28, this.anInt639);
			if (local13 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.anIntArray113[0] != 0) {
					local13.method1140(this.anIntArray113[local27], this.anIntArray114[local27]);
				}
			}
			local13.method1160();
			local13.method1153(this.anInt636 + 64, this.anInt630 + 850, -30, -50, -30, true);
			Static1.aClass47_15.method1332((long) this.anInt634, local13);
		}
		@Pc(92) Model local92;
		if (this.anInt640 == -1 || arg0 == -1) {
			local92 = local13.method1147(true);
		} else {
			local92 = Static57.method1042(this.anInt640).method518(local13, arg0);
		}
		if (this.anInt627 != 128 || this.anInt633 != 128) {
			local92.method1156(this.anInt627, this.anInt633, this.anInt627);
		}
		if (this.anInt628 != 0) {
			if (this.anInt628 == 90) {
				local92.method1148();
			}
			if (this.anInt628 == 180) {
				local92.method1148();
				local92.method1148();
			}
			if (this.anInt628 == 270) {
				local92.method1148();
				local92.method1148();
				local92.method1148();
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!eb;)V", line = 937)
	public void method504(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method505(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!eb;)V", line = 967)
	private void method505(@OriginalArg(0) int arg0, @OriginalArg(2) Packet arg1) {
		if (arg0 == 1) {
			this.anInt639 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt640 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt627 = arg1.g2();
		} else if (arg0 == 5) {
			this.anInt633 = arg1.g2();
		} else if (arg0 == 6) {
			this.anInt628 = arg1.g2();
		} else if (arg0 == 7) {
			this.anInt636 = arg1.g1();
		} else if (arg0 == 8) {
			this.anInt630 = arg1.g1();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray113[arg0 - 40] = arg1.g2();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray114[arg0 - 50] = arg1.g2();
		}
	}
}
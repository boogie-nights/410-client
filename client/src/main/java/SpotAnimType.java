import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class SpotAnimType extends Hashable {

	@OriginalMember(owner = "client!kc", name = "md", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_18;
	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lclient!qc;")
	public static LruCache aClass47_3 = new LruCache(64);
	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!qc;")
	public static LruCache aClass47_15 = new LruCache(30);
	@OriginalMember(owner = "client!tb", name = "I", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_28;
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lclient!ee;", line = 38)
    public static SpotAnimType method116(@OriginalArg(1) int arg0) {
        @Pc(15) SpotAnimType local15 = (SpotAnimType) aClass47_3.get((long) arg0);
        if (local15 != null) {
            return local15;
        }
        @Pc(25) byte[] local25 = aClass5_18.fetchFile(arg0, 13);
        local15 = new SpotAnimType();
        local15.anInt634 = arg0;
        if (local25 != null) {
            local15.method504(new Packet(local25));
        }
        aClass47_3.put((long) arg0, local15);
        return local15;
    }

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 14)
	public static void method262() {
		aClass47_3.clear();
		aClass47_15.clear();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;I)V", line = 92)
	public static void method1329(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Js5Index arg1) {
		aClass5_18 = arg0;
		aClass5_28 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Lclient!ne;", line = 6)
	public Model method501(@OriginalArg(1) int arg0) {
		@Pc(13) Model local13 = (Model) aClass47_15.get((long) this.anInt634);
		if (local13 == null) {
			local13 = Model.method1163(aClass5_28, this.anInt639);
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
			aClass47_15.put((long) this.anInt634, local13);
		}
		@Pc(92) Model local92;
		if (this.anInt640 == -1 || arg0 == -1) {
			local92 = local13.method1147(true);
		} else {
			local92 = SeqType.method1042(this.anInt640).method518(local13, arg0);
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

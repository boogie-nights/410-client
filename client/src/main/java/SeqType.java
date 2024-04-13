import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class SeqType extends Hashable {

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!qc;")
	public static LruCache aClass47_13 = new LruCache(64);
	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!qc;")
	public static LruCache aClass47_2 = new LruCache(100);
    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!ud;")
    public static Js5Index aClass5_24;
    @OriginalMember(owner = "client!f", name = "Y", descriptor = "[I")
	public int[] anIntArray124;

	@OriginalMember(owner = "client!f", name = "db", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!f", name = "nb", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!f", name = "ob", descriptor = "[I")
	public int[] delay;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
	public int anInt664 = -1;

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
	public int anInt666 = -1;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
	public int anInt669 = -1;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "I")
	public int anInt663 = -1;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "I")
	public int anInt658 = 5;

	@OriginalMember(owner = "client!f", name = "W", descriptor = "I")
	public int anInt662 = 2;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	public int anInt660 = 99;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
	public int anInt668 = -1;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!f;", line = 65)
    public static SeqType method1042(@OriginalArg(0) int arg0) {
        @Pc(10) SeqType local10 = (SeqType) aClass47_13.get((long) arg0);
        if (local10 != null) {
            return local10;
        }
        @Pc(20) byte[] local20 = aClass5_24.fetchFile(arg0, 12);
        local10 = new SeqType();
        if (local20 != null) {
            local10.method523(new Packet(local20));
        }
        local10.method522();
        aClass47_13.put((long) arg0, local10);
        return local10;
    }

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 1282)
	public static void method1357() {
		aClass47_13.clear();
		aClass47_2.clear();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!ne;)Lclient!ne;", line = 3)
	public Model method516(@OriginalArg(0) int arg0, @OriginalArg(2) Model arg1) {
		@Pc(8) int local8 = this.anIntArray124[arg0];
		@Pc(16) SeqFrameset local16 = Static38.getSeqFrameset(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1142(true);
		}
		@Pc(28) SeqFrameset local28 = null;
		@Pc(30) int local30 = 0;
		if (this.anIntArray127 != null && this.anIntArray127.length > arg0) {
			local30 = this.anIntArray127[arg0];
			local28 = Static38.getSeqFrameset(local30 >> 16);
			local30 &= 0xFFFF;
		}
		@Pc(69) Model local69;
		if (local28 == null || local30 == 65535) {
			local69 = arg1.method1142(!local16.method1403(local20));
			local69.method1134(local16, local20);
			return local69;
		} else {
			local69 = arg1.method1142(!local16.method1403(local20) & !local28.method1403(local30));
			local69.method1134(local16, local20);
			local69.method1134(local28, local30);
			return local69;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BILclient!eb;)V", line = 54)
	private void method517(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(50) int local50;
		if (arg0 == 1) {
			local19 = arg1.g1();
			this.delay = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.delay[local25] = arg1.g2();
			}
			this.anIntArray124 = new int[local19];
			for (local50 = 0; local50 < local19; local50++) {
				this.anIntArray124[local50] = arg1.g2();
			}
			for (@Pc(69) int local69 = 0; local69 < local19; local69++) {
				this.anIntArray124[local69] = (arg1.g2() << 16) + this.anIntArray124[local69];
			}
		} else if (arg0 == 2) {
			this.anInt669 = arg1.g2();
		} else if (arg0 == 3) {
			local19 = arg1.g1();
			this.anIntArray125 = new int[local19 + 1];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray125[local25] = arg1.g1();
			}
			this.anIntArray125[local19] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean50 = true;
		} else if (arg0 == 5) {
			this.anInt658 = arg1.g1();
		} else if (arg0 == 6) {
			this.anInt668 = arg1.g2();
		} else if (arg0 == 7) {
			this.anInt664 = arg1.g2();
		} else if (arg0 == 8) {
			this.anInt660 = arg1.g1();
		} else if (arg0 == 9) {
			this.anInt663 = arg1.g1();
		} else if (arg0 == 10) {
			this.anInt666 = arg1.g1();
		} else if (arg0 == 11) {
			this.anInt662 = arg1.g1();
		} else if (arg0 == 12) {
			local19 = arg1.g1();
			this.anIntArray127 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray127[local25] = arg1.g2();
			}
			for (local50 = 0; local50 < local19; local50++) {
				this.anIntArray127[local50] = (arg1.g2() << 16) + this.anIntArray127[local50];
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ne;IB)Lclient!ne;", line = 170)
	public Model method518(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray124[arg1];
		@Pc(16) SeqFrameset local16 = Static38.getSeqFrameset(local8 >> 16);
		@Pc(20) int local20 = local8 & 0xFFFF;
		if (local16 == null) {
			return arg0.method1147(true);
		} else {
			@Pc(39) Model local39 = arg0.method1147(!local16.method1403(local20));
			local39.method1134(local16, local20);
			return local39;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!f;ILclient!ne;IZ)Lclient!ne;", line = 191)
	public Model method519(@OriginalArg(0) SeqType arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Model arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = this.anIntArray124[arg3];
		@Pc(14) SeqFrameset local14 = Static38.getSeqFrameset(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method526(arg2, arg1);
		}
		@Pc(31) int local31 = arg0.anIntArray124[arg1];
		@Pc(37) SeqFrameset local37 = Static38.getSeqFrameset(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Model local54;
		if (local37 == null) {
			local54 = arg2.method1142(!local14.method1403(local18));
			local54.method1134(local14, local18);
			return local54;
		} else {
			local54 = arg2.method1142(!local14.method1403(local18) & !local37.method1403(local41));
			local54.method1159(local14, local18, local37, local41, this.anIntArray125);
			return local54;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ne;IBI)Lclient!ne;", line = 287)
	public Model method521(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray124[arg1];
		@Pc(12) SeqFrameset local12 = Static38.getSeqFrameset(local6 >> 16);
		@Pc(16) int local16 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg0.method1142(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(43) Model local43 = arg0.method1142(!local12.method1403(local16));
		if (local30 == 1) {
			local43.method1146();
		} else if (local30 == 2) {
			local43.method1149();
		} else if (local30 == 3) {
			local43.method1148();
		}
		local43.method1134(local12, local16);
		if (local30 == 1) {
			local43.method1148();
		} else if (local30 == 2) {
			local43.method1149();
		} else if (local30 == 3) {
			local43.method1146();
		}
		return local43;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V", line = 341)
	public void method522() {
		if (this.anInt663 == -1) {
			if (this.anIntArray125 == null) {
				this.anInt663 = 0;
			} else {
				this.anInt663 = 2;
			}
		}
		if (this.anInt666 != -1) {
			return;
		}
		if (this.anIntArray125 == null) {
			this.anInt666 = 0;
		} else {
			this.anInt666 = 2;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!eb;)V", line = 373)
	public void method523(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.g1();
			if (local5 == 0) {
				return;
			}
			this.method517(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!ne;I)Lclient!ne;", line = 467)
	public Model method526(@OriginalArg(1) Model arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anIntArray124[arg1];
		@Pc(22) SeqFrameset local22 = Static38.getSeqFrameset(local16 >> 16);
		@Pc(26) int local26 = local16 & 0xFFFF;
		if (local22 == null) {
			return arg0.method1142(true);
		} else {
			@Pc(43) Model local43 = arg0.method1142(!local22.method1403(local26));
			local43.method1134(local22, local26);
			return local43;
		}
	}
}

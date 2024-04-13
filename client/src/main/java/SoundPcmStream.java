import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class SoundPcmStream extends PcmStream {

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	private int anInt1539;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "I")
	private int anInt1541;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	private int anInt1542;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Z")
	private boolean aBoolean120;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	private int loops;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "I")
	private int anInt1545;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	private final int start;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	private final int anInt1540;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	private int anInt1537;

	@OriginalMember(owner = "client!m", name = "B", descriptor = "I")
	public int anInt1544;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	public int anInt1538;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIILclient!m;)I", line = 6)
	public static int method1026(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) SoundPcmStream arg7) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg6 >> 8;
		@Pc(11) int local11 = arg4 << 8;
		@Pc(20) int local20;
		if ((local20 = arg3 + arg2 + 1 - local7) > arg5) {
			local20 = arg5;
		}
		local20 -= 3;
		@Pc(28) int local28;
		while (arg3 < local20) {
			local28 = arg3++;
			@Pc(31) int local31 = arg1[local28];
			@Pc(34) int local34 = arg2 - 1;
			arg1[local28] = local31 + arg0[arg2] * local11;
			@Pc(41) int local41 = arg3++;
			@Pc(44) int local44 = arg1[local41];
			@Pc(47) int local47 = local34 - 1;
			arg1[local41] = local44 + arg0[local34] * local11;
			@Pc(54) int local54 = arg3++;
			@Pc(57) int local57 = arg1[local54];
			@Pc(60) int local60 = local47 - 1;
			arg1[local54] = local57 + arg0[local47] * local11;
			@Pc(67) int local67 = arg3++;
			@Pc(70) int local70 = arg1[local67];
			arg2 = local60 - 1;
			arg1[local67] = local70 + arg0[local60] * local11;
		}
		local20 += 3;
		while (arg3 < local20) {
			local28 = arg3++;
			arg1[local28] += arg0[arg2--] * local11;
		}
		arg7.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIIIILclient!m;)I", line = 38)
	public static int method1028(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) SoundPcmStream arg9) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg8 >> 8;
		arg4 <<= 0x8;
		@Pc(20) int local20;
		if ((local20 = arg3 + arg2 + 1 - local7) > arg7) {
			local20 = arg7;
		}
		local20 -= 3;
		@Pc(28) int local28;
		while (arg3 < local20) {
			local28 = arg3++;
			@Pc(31) int local31 = arg1[local28];
			@Pc(34) int local34 = arg2 - 1;
			arg1[local28] = local31 + (arg0[arg2] * arg4 >> arg5);
			@Pc(45) int local45 = arg4 + arg6;
			@Pc(47) int local47 = arg3++;
			@Pc(50) int local50 = arg1[local47];
			@Pc(53) int local53 = local34 - 1;
			arg1[local47] = local50 + (arg0[local34] * local45 >> arg5);
			@Pc(64) int local64 = local45 + arg6;
			@Pc(66) int local66 = arg3++;
			@Pc(69) int local69 = arg1[local66];
			@Pc(72) int local72 = local53 - 1;
			arg1[local66] = local69 + (arg0[local53] * local64 >> arg5);
			@Pc(83) int local83 = local64 + arg6;
			@Pc(85) int local85 = arg3++;
			@Pc(88) int local88 = arg1[local85];
			arg2 = local72 - 1;
			arg1[local85] = local88 + (arg0[local72] * local83 >> arg5);
			arg4 = local83 + arg6;
		}
		local20 += 3;
		while (arg3 < local20) {
			local28 = arg3++;
			arg1[local28] += arg0[arg2--] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg9.anInt1544 = arg4 >> 8;
		arg9.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIILclient!m;II)I", line = 112)
	public static int method1030(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) SoundPcmStream arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 257) / arg8) > arg5) {
			local14 = arg5;
		}
		@Pc(27) byte local27;
		@Pc(29) int local29;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			local27 = arg0[local23];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg0[local23 + 1] - local27) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 1) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			local27 = arg0[arg2 >> 8];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg9 - local27) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		arg7.anInt1538 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ed;II)Lclient!m;", line = 180)
	public static SoundPcmStream method1032(@OriginalArg(0) PcmSound arg0, @OriginalArg(2) int arg1) {
		return arg0.aByteArray8 == null || arg0.aByteArray8.length == 0 ? null : new SoundPcmStream(arg0, (int) ((long) arg0.anInt611 * 256L * (long) 100 / (long) (Static11.anInt291 * 100)), arg1);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIIIILclient!m;)I", line = 188)
	public static int method1033(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) SoundPcmStream arg9) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg8 >> 8;
		arg4 <<= 0x8;
		@Pc(18) int local18;
		if ((local18 = arg3 + local7 - arg2) > arg7) {
			local18 = arg7;
		}
		local18 -= 3;
		@Pc(26) int local26;
		while (arg3 < local18) {
			local26 = arg3++;
			@Pc(29) int local29 = arg1[local26];
			@Pc(32) int local32 = arg2 + 1;
			arg1[local26] = local29 + (arg0[arg2] * arg4 >> arg5);
			@Pc(43) int local43 = arg4 + arg6;
			@Pc(45) int local45 = arg3++;
			@Pc(48) int local48 = arg1[local45];
			@Pc(51) int local51 = local32 + 1;
			arg1[local45] = local48 + (arg0[local32] * local43 >> arg5);
			@Pc(62) int local62 = local43 + arg6;
			@Pc(64) int local64 = arg3++;
			@Pc(67) int local67 = arg1[local64];
			@Pc(70) int local70 = local51 + 1;
			arg1[local64] = local67 + (arg0[local51] * local62 >> arg5);
			@Pc(81) int local81 = local62 + arg6;
			@Pc(83) int local83 = arg3++;
			@Pc(86) int local86 = arg1[local83];
			arg2 = local70 + 1;
			arg1[local83] = local86 + (arg0[local70] * local81 >> arg5);
			arg4 = local81 + arg6;
		}
		local18 += 3;
		while (arg3 < local18) {
			local26 = arg3++;
			arg1[local26] += arg0[arg2++] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg9.anInt1544 = arg4 >> 8;
		arg9.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIILclient!m;II)I", line = 219)
	public static int method1034(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) SoundPcmStream arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 + 256 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		@Pc(31) int local31;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			@Pc(29) byte local29 = arg0[local23 - 1];
			local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg0[local23] - local29) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			local31 = arg3++;
			arg1[local31] += ((arg9 << 8) + (arg0[arg2 >> 8] - arg9) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		arg7.anInt1538 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIIIILclient!m;II)I", line = 644)
	public static int method1035(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) SoundPcmStream arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
		@Pc(14) int local14;
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 - arg2 - 257) / arg10) > arg7) {
			local14 = arg7;
		}
		@Pc(27) byte local27;
		@Pc(29) int local29;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			local27 = arg0[local23];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg0[local23 + 1] - local27) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 - arg2 - 1) / arg10) > arg7) {
			local14 = arg7;
		}
		while (arg3 < local14) {
			local27 = arg0[arg2 >> 8];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg11 - local27) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		arg9.anInt1544 = arg4;
		arg9.anInt1538 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIILclient!m;)I", line = 673)
	public static int method1036(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) SoundPcmStream arg7) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg6 >> 8;
		@Pc(11) int local11 = arg4 << 8;
		@Pc(18) int local18;
		if ((local18 = arg3 + local7 - arg2) > arg5) {
			local18 = arg5;
		}
		local18 -= 3;
		@Pc(26) int local26;
		while (arg3 < local18) {
			local26 = arg3++;
			@Pc(29) int local29 = arg1[local26];
			@Pc(32) int local32 = arg2 + 1;
			arg1[local26] = local29 + arg0[arg2] * local11;
			@Pc(39) int local39 = arg3++;
			@Pc(42) int local42 = arg1[local39];
			@Pc(45) int local45 = local32 + 1;
			arg1[local39] = local42 + arg0[local32] * local11;
			@Pc(52) int local52 = arg3++;
			@Pc(55) int local55 = arg1[local52];
			@Pc(58) int local58 = local45 + 1;
			arg1[local52] = local55 + arg0[local45] * local11;
			@Pc(65) int local65 = arg3++;
			@Pc(68) int local68 = arg1[local65];
			arg2 = local58 + 1;
			arg1[local65] = local68 + arg0[local58] * local11;
		}
		local18 += 3;
		while (arg3 < local18) {
			local26 = arg3++;
			arg1[local26] += arg0[arg2++] * local11;
		}
		arg7.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIIIILclient!m;II)I", line = 700)
	public static int method1037(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) SoundPcmStream arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
		@Pc(14) int local14;
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 + 256 - arg2) / arg10) > arg7) {
			local14 = arg7;
		}
		@Pc(31) int local31;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			@Pc(29) byte local29 = arg0[local23 - 1];
			local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg0[local23] - local29) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 - arg2) / arg10) > arg7) {
			local14 = arg7;
		}
		while (arg3 < local14) {
			local31 = arg3++;
			arg1[local31] += ((arg11 << 8) + (arg0[arg2 >> 8] - arg11) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		arg9.anInt1544 = arg4;
		arg9.anInt1538 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 33)
	public synchronized void method1027(@OriginalArg(0) int arg0) {
		this.loops = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIII)I", line = 70)
	private int method1029(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1542 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1542;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1542 += arg1;
			if (this.anInt1537 == 256 && (this.anInt1538 & 0xFF) == 0) {
				arg1 = method1033(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this);
			} else {
				arg1 = method1035(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this, this.anInt1537, arg4);
			}
			this.anInt1542 -= arg1;
			if (this.anInt1542 != 0) {
				return arg1;
			}
			if (this.anInt1545 == Integer.MIN_VALUE) {
				this.unlink();
				return arg3;
			}
			this.anInt1544 = this.anInt1545;
		}
		return this.anInt1537 == 256 && (this.anInt1538 & 0xFF) == 0 ? method1036(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this) : method1030(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this, this.anInt1537, arg4);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([IIIII)I", line = 138)
	private int method1031(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1542 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1542;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1542 += arg1;
			if (this.anInt1537 == -256 && (this.anInt1538 & 0xFF) == 0) {
				arg1 = method1028(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this);
			} else {
				arg1 = method1037(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, this.anInt1541, this.anInt1539, local7, arg2, this, this.anInt1537, arg4);
			}
			this.anInt1542 -= arg1;
			if (this.anInt1542 != 0) {
				return arg1;
			}
			if (this.anInt1545 == Integer.MIN_VALUE) {
				this.unlink();
				return arg3;
			}
			this.anInt1544 = this.anInt1545;
		}
		return this.anInt1537 == -256 && (this.anInt1538 & 0xFF) == 0 ? method1026(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this) : method1034(((PcmSound) super.sound).aByteArray8, arg0, this.anInt1538, arg1, this.anInt1544, arg3, arg2, this, this.anInt1537, arg4);
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 245)
	@Override
	public synchronized void method1287(@OriginalArg(0) int arg0) {
		if (this.anInt1542 > 0) {
			if (arg0 >= this.anInt1542) {
				if (this.anInt1545 == Integer.MIN_VALUE) {
					this.unlink();
					arg0 = this.anInt1542;
				} else {
					this.anInt1544 = this.anInt1545;
				}
				this.anInt1542 = 0;
			} else {
				this.anInt1544 += this.anInt1539 * arg0;
				this.anInt1542 -= arg0;
			}
		}
		this.anInt1538 += this.anInt1537 * arg0;
		@Pc(53) PcmSound local53 = (PcmSound) super.sound;
		@Pc(58) int local58 = this.start << 8;
		@Pc(63) int local63 = this.anInt1540 << 8;
		@Pc(69) int local69 = local53.aByteArray8.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.loops = 0;
		}
		if (this.loops >= 0) {
			if (this.loops > 0) {
				if (this.aBoolean120) {
					label113: {
						if (this.anInt1537 < 0) {
							if (this.anInt1538 >= local58) {
								return;
							}
							this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.loops == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt1538 < local63) {
								return;
							}
							this.anInt1538 = local63 + local63 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.loops == 0) {
								break;
							}
							if (this.anInt1538 >= local58) {
								return;
							}
							this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
						} while (--this.loops != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt1537 < 0) {
						if (this.anInt1538 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt1538 - 1) / local73;
						if (local299 < this.loops) {
							this.anInt1538 += local73 * local299;
							this.loops -= local299;
							return;
						}
						this.anInt1538 += local73 * this.loops;
						this.loops = 0;
					} else if (this.anInt1538 >= local63) {
						local299 = (this.anInt1538 - local58) / local73;
						if (local299 < this.loops) {
							this.anInt1538 -= local73 * local299;
							this.loops -= local299;
							return;
						}
						this.anInt1538 -= local73 * this.loops;
						this.loops = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1537 < 0) {
				if (this.anInt1538 < 0) {
					this.anInt1538 = 0;
					this.unlink();
					return;
				}
			} else if (this.anInt1538 >= local69) {
				this.anInt1538 = local69 - 1;
				this.unlink();
			}
		} else if (this.aBoolean120) {
			if (this.anInt1537 < 0) {
				if (this.anInt1538 >= local58) {
					return;
				}
				this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
			while (this.anInt1538 >= local63) {
				this.anInt1538 = local63 + local63 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
				if (this.anInt1538 >= local58) {
					return;
				}
				this.anInt1538 = local58 + local58 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
		} else if (this.anInt1537 < 0) {
			if (this.anInt1538 < local58) {
				this.anInt1538 = local63 - (local63 - 1 - this.anInt1538) % local73 - 1;
			}
		} else if (this.anInt1538 >= local63) {
			this.anInt1538 = local58 + (this.anInt1538 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([III)I", line = 436)
	@Override
	public synchronized int method1286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1544 == 0 && (this.anInt1542 == 0 || this.anInt1545 == 0 || this.anInt1545 == Integer.MIN_VALUE)) {
			this.method1287(arg2);
			return 0;
		}
		@Pc(21) PcmSound local21 = (PcmSound) super.sound;
		@Pc(26) int local26 = this.start << 8;
		@Pc(31) int local31 = this.anInt1540 << 8;
		@Pc(37) int local37 = local21.aByteArray8.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.loops = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.loops >= 0) {
			if (this.loops > 0) {
				if (this.aBoolean120) {
					label118: {
						if (this.anInt1537 < 0) {
							local48 = this.method1031(arg0, arg1, local26, local52, local21.aByteArray8[this.start]);
							if (this.anInt1538 >= local26) {
								return 1;
							}
							this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.loops == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.anInt1540 - 1]);
							if (this.anInt1538 < local31) {
								return 1;
							}
							this.anInt1538 = local31 + local31 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
							if (--this.loops == 0) {
								break;
							}
							local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.start]);
							if (this.anInt1538 >= local26) {
								return 1;
							}
							this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
							this.anInt1537 = -this.anInt1537;
						} while (--this.loops != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt1537 < 0) {
						while (true) {
							local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.anInt1540 - 1]);
							if (this.anInt1538 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt1538 - 1) / local41;
							if (local398 >= this.loops) {
								this.anInt1538 += local41 * this.loops;
								this.loops = 0;
								break;
							}
							this.anInt1538 += local41 * local398;
							this.loops -= local398;
						}
					} else {
						while (true) {
							local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.start]);
							if (this.anInt1538 < local31) {
								return 1;
							}
							local398 = (this.anInt1538 - local26) / local41;
							if (local398 >= this.loops) {
								this.anInt1538 -= local41 * this.loops;
								this.loops = 0;
								break;
							}
							this.anInt1538 -= local41 * local398;
							this.loops -= local398;
						}
					}
				}
			}
			if (this.anInt1537 < 0) {
				this.method1031(arg0, local48, 0, local52, 0);
				if (this.anInt1538 < 0) {
					this.anInt1538 = 0;
					this.unlink();
				}
			} else {
				this.method1029(arg0, local48, local37, local52, 0);
				if (this.anInt1538 >= local37) {
					this.anInt1538 = local37 - 1;
					this.unlink();
				}
			}
			return 1;
		} else if (this.aBoolean120) {
			if (this.anInt1537 < 0) {
				local48 = this.method1031(arg0, arg1, local26, local52, local21.aByteArray8[this.start]);
				if (this.anInt1538 >= local26) {
					return 1;
				}
				this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
			while (true) {
				local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.anInt1540 - 1]);
				if (this.anInt1538 < local31) {
					return 1;
				}
				this.anInt1538 = local31 + local31 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
				local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.start]);
				if (this.anInt1538 >= local26) {
					return 1;
				}
				this.anInt1538 = local26 + local26 - this.anInt1538 - 1;
				this.anInt1537 = -this.anInt1537;
			}
		} else if (this.anInt1537 < 0) {
			while (true) {
				local48 = this.method1031(arg0, local48, local26, local52, local21.aByteArray8[this.anInt1540 - 1]);
				if (this.anInt1538 >= local26) {
					return 1;
				}
				this.anInt1538 = local31 - (local31 - 1 - this.anInt1538) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method1029(arg0, local48, local31, local52, local21.aByteArray8[this.start]);
				if (this.anInt1538 < local31) {
					return 1;
				}
				this.anInt1538 = local26 + (this.anInt1538 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()I", line = 732)
	@Override
	public int method1288() {
		@Pc(4) int local4 = this.anInt1544 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.loops == 0) {
			local4 -= local4 * this.anInt1538 / (((PcmSound) super.sound).aByteArray8.length << 8);
		} else if (this.loops >= 0) {
			local4 -= local4 * this.start / ((PcmSound) super.sound).aByteArray8.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ed;II)V", line = 746)
	public SoundPcmStream(@OriginalArg(0) PcmSound arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.sound = arg0;
		this.start = arg0.anInt613;
		this.anInt1540 = arg0.anInt612;
		this.anInt1537 = arg1;
		this.anInt1544 = arg2;
		this.anInt1538 = 0;
	}
}

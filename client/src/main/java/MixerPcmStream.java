import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class MixerPcmStream extends PcmStream {

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	private final int anInt1882 = 16;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[Lclient!od;")
	private final LinkList[] aClass44Array1 = new LinkList[8];

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!od;")
	private final LinkList aClass44_5 = new LinkList();

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	private int anInt1884 = -1;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
	private int anInt1883 = 0;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
	private int anInt1885 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lclient!pc;)I", line = 222)
    public static int method1293(@OriginalArg(0) PcmStream arg0) {
        return arg0.method1288() >> 5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pc;)V", line = 13)
	public synchronized void method1289(@OriginalArg(0) PcmStream arg0) {
		@Pc(5) LinkList local5 = this.aClass44Array1[method1293(arg0)];
		local5.method1229(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "([III)I", line = 17)
	private int method1290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1883 -= arg2;
		@Pc(18) int local18;
		@Pc(24) LinkList local24;
		@Pc(29) PcmStream local29;
		@Pc(33) int local33;
		if (this.anInt1883 <= 0) {
			this.anInt1883 += Static11.anInt291 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass44Array1[local18];
				for (local29 = (PcmStream) local24.head(); local29 != null; local29 = (PcmStream) local24.next()) {
					local33 = method1293(local29);
					if (local33 != local18) {
						this.aClass44Array1[local33].method1229(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass44Array1[local18];
			for (local29 = (PcmStream) local24.head(); local29 != null; local29 = (PcmStream) local24.next()) {
				local29.active = false;
				if (local29.sound != null) {
					local29.sound.pos = 0;
				}
			}
		}
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 255;
		local33 = 7;
		while (local93 != 0) {
			@Pc(102) int local102;
			@Pc(107) int local107;
			if (local33 < 0) {
				local102 = local33 & 0x3;
				local107 = -(local33 >> 2);
			} else {
				local102 = local33;
				local107 = 0;
			}
			for (@Pc(118) int local118 = local93 >>> local102 & 0x11111111; local118 != 0; local118 >>>= 0x4) {
				if ((local118 & 0x1) != 0) {
					local93 &= ~(0x1 << local102);
					@Pc(137) LinkList local137 = this.aClass44Array1[local102];
					for (@Pc(142) PcmStream local142 = (PcmStream) local137.head(); local142 != null; local142 = (PcmStream) local137.next()) {
						if (!local142.active) {
							@Pc(149) SoundPacket local149 = local142.sound;
							if (local149 == null || local149.pos <= local107) {
								if (local91 < this.anInt1882) {
									@Pc(172) int local172 = local142.method1286(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.pos += local172;
									}
								} else {
									local142.method1287(arg2);
								}
								local142.active = true;
							} else {
								local93 |= 0x1 << local102;
							}
						}
					}
				}
				local102 += 4;
				local107++;
			}
			local33--;
		}
		return local91;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 151)
	private void method1291() {
		if (this.anInt1885 <= 0) {
			return;
		}
		for (@Pc(8) MixerListener local8 = (MixerListener) this.aClass44_5.head(); local8 != null; local8 = (MixerListener) this.aClass44_5.next()) {
			local8.remaining -= this.anInt1885;
		}
		this.anInt1884 -= this.anInt1885;
		this.anInt1885 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V", line = 171)
	@Override
	public synchronized void method1287(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1884 < 0) {
				this.method1294(arg0);
				return;
			}
			if (this.anInt1885 + arg0 < this.anInt1884) {
				this.anInt1885 += arg0;
				this.method1294(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1884 - this.anInt1885;
			this.method1294(local29);
			arg0 -= local29;
			this.anInt1885 += local29;
			this.method1291();
			@Pc(50) MixerListener local50 = (MixerListener) this.aClass44_5.head();
			synchronized (local50) {
				@Pc(58) int local58 = local50.execute(this);
				if (local58 < 0) {
					local50.remaining = 0;
					this.method1295(local50);
				} else {
					local50.remaining = local58;
					this.method1292(local50.next, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!g;Lclient!aa;)V", line = 215)
	private void method1292(@OriginalArg(0) Linkable arg0, @OriginalArg(1) MixerListener arg1) {
		while (arg0 != this.aClass44_5.aClass2_71 && ((MixerListener) arg0).remaining <= arg1.remaining) {
			arg0 = arg0.next;
		}
		this.aClass44_5.method1223(arg0, arg1);
		this.anInt1884 = ((MixerListener) this.aClass44_5.aClass2_71.next).remaining;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V", line = 225)
	private void method1294(@OriginalArg(0) int arg0) {
		this.anInt1883 -= arg0;
		if (this.anInt1883 < 0) {
			this.anInt1883 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) LinkList local19 = this.aClass44Array1[local13];
			for (@Pc(24) PcmStream local24 = (PcmStream) local19.head(); local24 != null; local24 = (PcmStream) local19.next()) {
				local24.method1287(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([III)I", line = 256)
	@Override
	public synchronized int method1286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt1884 < 0) {
				return this.method1290(arg0, arg1, arg2);
			}
			if (this.anInt1885 + arg2 < this.anInt1884) {
				this.anInt1885 += arg2;
				return this.method1290(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt1884 - this.anInt1885;
			local39 = this.method1290(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1885 += local33;
			this.method1291();
			@Pc(61) MixerListener local61 = (MixerListener) this.aClass44_5.head();
			synchronized (local61) {
				@Pc(69) int local69 = local61.execute(this);
				if (local69 < 0) {
					local61.remaining = 0;
					this.method1295(local61);
				} else {
					local61.remaining = local69;
					this.method1292(local61.next, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!aa;)V", line = 298)
	private void method1295(@OriginalArg(0) MixerListener arg0) {
		arg0.unlink();
		arg0.onUnlink();
		@Pc(9) Linkable local9 = this.aClass44_5.aClass2_71.next;
		if (local9 == this.aClass44_5.aClass2_71) {
			this.anInt1884 = -1;
		} else {
			this.anInt1884 = ((MixerListener) local9).remaining;
		}
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 329)
	public MixerPcmStream() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass44Array1[local24] = new LinkList();
		}
	}
}

package jagex2;

import jagex2.datastruct.LinkedList;
import jagex2.datastruct.Linkable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	private final int anInt1882 = 16;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[Lclient!od;")
	private final LinkedList[] aClass44Array1 = new LinkedList[8];

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!od;")
	private final LinkedList aClass44_5 = new LinkedList();

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	private int anInt1884 = -1;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
	private int anInt1883 = 0;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
	private int anInt1885 = 0;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub2() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass44Array1[local24] = new LinkedList();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pc;)V")
	public synchronized void method1289(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(5) LinkedList local5 = this.aClass44Array1[Static113.method1293(arg0)];
		local5.pushFront(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "([III)I")
	private int method1290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1883 -= arg2;
		@Pc(18) int local18;
		@Pc(24) LinkedList local24;
		@Pc(29) Class2_Sub10 local29;
		@Pc(33) int local33;
		if (this.anInt1883 <= 0) {
			this.anInt1883 += Static12.anInt291 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass44Array1[local18];
				for (local29 = (Class2_Sub10) local24.peekFront(); local29 != null; local29 = (Class2_Sub10) local24.prev()) {
					local33 = Static113.method1293(local29);
					if (local33 != local18) {
						this.aClass44Array1[local33].pushFront(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass44Array1[local18];
			for (local29 = (Class2_Sub10) local24.peekFront(); local29 != null; local29 = (Class2_Sub10) local24.prev()) {
				local29.aBoolean153 = false;
				if (local29.aClass2_Sub4_3 != null) {
					local29.aClass2_Sub4_3.anInt610 = 0;
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
					@Pc(137) LinkedList local137 = this.aClass44Array1[local102];
					for (@Pc(142) Class2_Sub10 local142 = (Class2_Sub10) local137.peekFront(); local142 != null; local142 = (Class2_Sub10) local137.prev()) {
						if (!local142.aBoolean153) {
							@Pc(149) Class2_Sub4 local149 = local142.aClass2_Sub4_3;
							if (local149 == null || local149.anInt610 <= local107) {
								if (local91 < this.anInt1882) {
									@Pc(172) int local172 = local142.method1286(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt610 += local172;
									}
								} else {
									local142.method1287(arg2);
								}
								local142.aBoolean153 = true;
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

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	private void method1291() {
		if (this.anInt1885 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub1 local8 = (Class2_Sub1) this.aClass44_5.peekFront(); local8 != null; local8 = (Class2_Sub1) this.aClass44_5.prev()) {
			local8.anInt32 -= this.anInt1885;
		}
		this.anInt1884 -= this.anInt1885;
		this.anInt1885 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
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
			@Pc(50) Class2_Sub1 local50 = (Class2_Sub1) this.aClass44_5.peekFront();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method17(this);
				if (local58 < 0) {
					local50.anInt32 = 0;
					this.method1295(local50);
				} else {
					local50.anInt32 = local58;
					this.method1292(local50.prev, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!g;Lclient!aa;)V")
	private void method1292(@OriginalArg(0) Linkable arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		while (arg0 != this.aClass44_5.head && ((Class2_Sub1) arg0).anInt32 <= arg1.anInt32) {
			arg0 = arg0.prev;
		}
		this.aClass44_5.insertBefore(arg0, arg1);
		this.anInt1884 = ((Class2_Sub1) this.aClass44_5.head.prev).anInt32;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	private void method1294(@OriginalArg(0) int arg0) {
		this.anInt1883 -= arg0;
		if (this.anInt1883 < 0) {
			this.anInt1883 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) LinkedList local19 = this.aClass44Array1[local13];
			for (@Pc(24) Class2_Sub10 local24 = (Class2_Sub10) local19.peekFront(); local24 != null; local24 = (Class2_Sub10) local19.prev()) {
				local24.method1287(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([III)I")
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
			@Pc(61) Class2_Sub1 local61 = (Class2_Sub1) this.aClass44_5.peekFront();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method17(this);
				if (local69 < 0) {
					local61.anInt32 = 0;
					this.method1295(local61);
				} else {
					local61.anInt32 = local69;
					this.method1292(local61.prev, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!aa;)V")
	private void method1295(@OriginalArg(0) Class2_Sub1 arg0) {
		arg0.unlink();
		arg0.method16();
		@Pc(9) Linkable local9 = this.aClass44_5.head.prev;
		if (local9 == this.aClass44_5.head) {
			this.anInt1884 = -1;
		} else {
			this.anInt1884 = ((Class2_Sub1) local9).anInt32;
		}
	}
}

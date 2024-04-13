import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class BufferedFile {

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	private int anInt417;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	private int anInt414 = 0;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "J")
	private long aLong26 = -1L;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "J")
	private long aLong27 = -1L;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "Lclient!dc;")
	private final FileOnDisk file;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "J")
	private long virtualPosition;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)V", line = 36)
	public void method346(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.virtualPosition = arg0;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BIII)V", line = 120)
	public void method348(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong29 < this.virtualPosition + (long) arg1) {
				this.aLong29 = (long) arg1 + this.virtualPosition;
			}
			if (this.aLong26 != -1L && (this.aLong26 > this.virtualPosition || this.virtualPosition > this.aLong26 + (long) this.anInt414)) {
				this.method352();
			}
			if (this.aLong26 != -1L && this.virtualPosition + (long) arg1 > (long) this.aByteArray5.length + this.aLong26) {
				@Pc(92) int local92 = (int) (this.aLong26 + (long) this.aByteArray5.length - this.virtualPosition);
				arg1 -= local92;
				Static107.method993(arg0, arg2, this.aByteArray5, (int) (this.virtualPosition - this.aLong26), local92);
				arg2 += local92;
				this.virtualPosition += local92;
				this.anInt414 = this.aByteArray5.length;
				this.method352();
			}
			if (arg1 > this.aByteArray5.length) {
				if (this.aLong28 != this.virtualPosition) {
					this.file.seek(this.virtualPosition);
					this.aLong28 = this.virtualPosition;
				}
				@Pc(155) long local155 = -1L;
				this.file.write(arg2, arg1, arg0);
				@Pc(164) long local164 = -1L;
				if (this.aLong27 <= this.virtualPosition && (long) this.anInt417 + this.aLong27 > this.virtualPosition) {
					local164 = this.virtualPosition;
				} else if (this.aLong27 >= this.virtualPosition && this.virtualPosition + (long) arg1 > this.aLong27) {
					local164 = this.aLong27;
				}
				this.aLong28 += arg1;
				if (this.aLong27 < this.virtualPosition + (long) arg1 && (long) this.anInt417 + this.aLong27 >= this.virtualPosition + (long) arg1) {
					local155 = this.virtualPosition + (long) arg1;
				} else if (this.virtualPosition < this.aLong27 + (long) this.anInt417 && this.aLong27 + (long) this.anInt417 <= this.virtualPosition - -((long) arg1)) {
					local155 = (long) this.anInt417 + this.aLong27;
				}
				if (this.aLong28 > this.aLong30) {
					this.aLong30 = this.aLong28;
				}
				if (local164 > -1L && local164 < local155) {
					@Pc(325) int local325 = (int) (local155 - local164);
					Static107.method993(arg0, (int) (local164 + (long) arg2 - this.virtualPosition), this.aByteArray4, (int) (local164 - this.aLong27), local325);
				}
				this.virtualPosition += arg1;
			} else if (arg1 > 0) {
				if (this.aLong26 == -1L) {
					this.aLong26 = this.virtualPosition;
				}
				Static107.method993(arg0, arg2, this.aByteArray5, (int) (this.virtualPosition - this.aLong26), arg1);
				this.virtualPosition += arg1;
				if (this.virtualPosition - this.aLong26 > (long) this.anInt414) {
					this.anInt414 = (int) (this.virtualPosition - this.aLong26);
				}
			}
		} catch (@Pc(410) IOException local410) {
			this.aLong28 = -1L;
			throw local410;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V", line = 246)
	private void method349() throws IOException {
		this.anInt417 = 0;
		if (this.virtualPosition != this.aLong28) {
			this.file.seek(this.virtualPosition);
			this.aLong28 = this.virtualPosition;
		}
		this.aLong27 = this.virtualPosition;
		while (this.anInt417 < this.aByteArray4.length) {
			@Pc(53) int local53 = this.file.read(this.aByteArray4, this.aByteArray4.length - this.anInt417, this.anInt417);
			if (local53 == -1) {
				break;
			}
			this.aLong28 += local53;
			this.anInt417 += local53;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III[B)V", line = 314)
	public void method350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong26 != -1L && this.virtualPosition >= this.aLong26 && (long) arg1 + this.virtualPosition <= (long) this.anInt414 + this.aLong26) {
				Static107.method993(this.aByteArray5, (int) (this.virtualPosition - this.aLong26), arg2, 0, arg1);
				this.virtualPosition += arg1;
				return;
			}
			@Pc(86) long local86 = this.virtualPosition;
			@Pc(88) int local88 = arg1;
			@Pc(124) int local124;
			if (this.virtualPosition >= this.aLong27 && this.virtualPosition < (long) this.anInt417 + this.aLong27) {
				local124 = (int) ((long) this.anInt417 + this.aLong27 - this.virtualPosition);
				if (arg1 < local124) {
					local124 = arg1;
				}
				arg1 -= local124;
				Static107.method993(this.aByteArray4, (int) (this.virtualPosition - this.aLong27), arg2, 0, local124);
				this.virtualPosition += local124;
				arg0 = local124;
			}
			if (this.aByteArray4.length < arg1) {
				this.file.seek(this.virtualPosition);
				this.aLong28 = this.virtualPosition;
				while (arg1 > 0) {
					local124 = this.file.read(arg2, arg1, arg0);
					if (local124 == -1) {
						break;
					}
					this.virtualPosition += local124;
					arg1 -= local124;
					this.aLong28 += local124;
					arg0 += local124;
				}
			} else if (arg1 > 0) {
				this.method349();
				local124 = arg1;
				if (arg1 > this.anInt417) {
					local124 = this.anInt417;
				}
				arg1 -= local124;
				Static107.method993(this.aByteArray4, 0, arg2, arg0, local124);
				this.virtualPosition += local124;
				arg0 += local124;
			}
			if (this.aLong26 != -1L) {
				if (this.aLong26 > this.virtualPosition && arg1 > 0) {
					local124 = arg0 + (int) (this.aLong26 - this.virtualPosition);
					if (local124 > arg0 + arg1) {
						local124 = arg1 + arg0;
					}
					while (arg0 < local124) {
						arg2[arg0++] = 0;
						arg1--;
						this.virtualPosition++;
					}
				}
				@Pc(312) long local312 = -1L;
				@Pc(314) long local314 = -1L;
				if (this.aLong26 >= local86 && (long) local88 + local86 > this.aLong26) {
					local312 = this.aLong26;
				} else if (local86 >= this.aLong26 && local86 < this.aLong26 + (long) this.anInt414) {
					local312 = local86;
				}
				if (local86 < this.aLong26 + (long) this.anInt414 && local86 + (long) local88 >= this.aLong26 - -((long) this.anInt414)) {
					local314 = this.aLong26 + (long) this.anInt414;
				} else if (this.aLong26 < (long) local88 + local86 && (long) local88 + local86 <= (long) this.anInt414 + this.aLong26) {
					local314 = (long) local88 + local86;
				}
				if (local312 > -1L && local312 < local314) {
					@Pc(435) int local435 = (int) (local314 - local312);
					Static107.method993(this.aByteArray5, (int) (local312 - this.aLong26), arg2, (int) (local312 - local86), local435);
					if (local314 > this.virtualPosition) {
						arg1 = (int) ((long) arg1 + this.virtualPosition - local314);
						this.virtualPosition = local314;
					}
				}
			}
		} catch (@Pc(473) IOException local473) {
			this.aLong28 = -1L;
			throw local473;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)J", line = 500)
	public long method351() {
		return this.aLong29;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 535)
	private void method352() throws IOException {
		if (this.aLong26 == -1L) {
			return;
		}
		if (this.aLong28 != this.aLong26) {
			this.file.seek(this.aLong26);
			this.aLong28 = this.aLong26;
		}
		this.file.write(0, this.anInt414, this.aByteArray5);
		this.aLong28 += this.anInt414;
		@Pc(47) long local47 = -1L;
		@Pc(49) long local49 = -1L;
		if (this.aLong28 > this.aLong30) {
			this.aLong30 = this.aLong28;
		}
		if (this.aLong27 < (long) this.anInt414 + this.aLong26 && (long) this.anInt414 + this.aLong26 <= (long) this.anInt417 + this.aLong27) {
			local47 = this.aLong26 + (long) this.anInt414;
		} else if (this.aLong26 < this.aLong27 + (long) this.anInt417 && this.aLong26 + (long) this.anInt414 >= (long) this.anInt417 + this.aLong27) {
			local47 = this.aLong27 + (long) this.anInt417;
		}
		if (this.aLong27 <= this.aLong26 && (long) this.anInt417 + this.aLong27 > this.aLong26) {
			local49 = this.aLong26;
		} else if (this.aLong27 >= this.aLong26 && this.aLong27 < (long) this.anInt414 + this.aLong26) {
			local49 = this.aLong27;
		}
		if (local49 > -1L && local47 > local49) {
			@Pc(195) int local195 = (int) (local47 - local49);
			Static107.method993(this.aByteArray5, (int) (local49 - this.aLong26), this.aByteArray4, (int) (local49 - this.aLong27), local195);
		}
		this.anInt414 = 0;
		this.aLong26 = -1L;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 611)
	public void method353() throws IOException {
		this.method352();
		this.file.close();
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!dc;II)V", line = 641)
	public BufferedFile(@OriginalArg(0) FileOnDisk arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.file = arg0;
		this.aLong29 = this.aLong30 = arg0.length();
		this.virtualPosition = 0L;
		this.aByteArray5 = new byte[arg2];
		this.aByteArray4 = new byte[arg1];
	}
}

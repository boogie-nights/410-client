import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Packet extends Linkable {

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
	public int pos;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)V", line = 5)
	public final void p8(@OriginalArg(1) long arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 56);
		this.data[this.pos++] = (byte) (arg0 >> 48);
		this.data[this.pos++] = (byte) (arg0 >> 40);
		this.data[this.pos++] = (byte) (arg0 >> 32);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)I", line = 23)
	public final int g2_alt2() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) +
			(this.data[this.pos - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIBI)V", line = 34)
	public final void pdata(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.data[this.pos++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!o;B)V", line = 52)
	public final void pjstr(@OriginalArg(0) JagString arg0) {
		this.pos += arg0.method1191(this.data, arg0.method1169(), this.pos);
		this.data[this.pos++] = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[II)V", line = 69)
	public final void tinydec(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.pos;
		this.pos = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.g4s();
			@Pc(29) int local29 = this.g4s();
			@Pc(31) int local31 = 0xc6ef3720;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= local25 + (local25 << 4 ^ local25 >>> 5) ^ arg1[local31 >>> 11 & 0x3] + local31;
				local31 -= 0x9e3779b9;
				local25 -= local31 + arg1[local31 & 0x3] ^ (local29 << 4 ^ local29 >>> 5) + local29;
			}
			this.pos -= 8;
			this.p4(local25);
			this.p4(local29);
		}
		this.pos = local8;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V", line = 116)
	public final void rsaenc(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.pos;
		@Pc(9) byte[] local9 = new byte[local6];
		this.pos = 0;
		this.gdata(local6, local9);
		@Pc(27) BigInteger local27 = new BigInteger(local9);
		@Pc(32) BigInteger local32 = local27.modPow(arg0, arg1);
		@Pc(35) byte[] local35 = local32.toByteArray();
		this.pos = 0;
		this.p1(local35.length);
		this.pdata(local35, local35.length);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 143)
	public final void p4_alt3(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I", line = 158)
	public final int addcrc(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static18.getcrc(arg0, this.data, this.pos);
		this.p4(local16);
		return local16;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V", line = 172)
	public final void p3(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)B", line = 212)
	public final byte g1b_alt3() {
		return (byte) (128 - this.data[this.pos++]);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)B", line = 226)
	public final byte g1b_alt2() {
		return (byte) -this.data[this.pos++];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIII)V", line = 242)
	public final void gdata_alt1(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = arg1 - 1; local14 >= 0; local14--) {
			arg0[local14] = this.data[this.pos++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)I", line = 259)
	public final int g2s_alt2() {
		this.pos += 2;
		@Pc(33) int local33 = ((this.data[this.pos - 2] & 0xFF) << 8) +
			(this.data[this.pos - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)V", line = 282)
	public final void p2(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 292)
	public final void pSmart1or2(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.p1(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.p2(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)B", line = 329)
	public final byte g1b() {
		return this.data[this.pos++];
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)V", line = 344)
	public final void p4_alt1(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)I", line = 358)
	public final int gSmart1or2() {
		@Pc(12) int local12 = this.data[this.pos] & 0xFF;
		return local12 < 128 ? this.g1() : this.g2() - 32768;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I", line = 377)
	public final int gSmart1or2s() {
		@Pc(16) int local16 = this.data[this.pos] & 0xFF;
		return local16 >= 128 ? this.g2() - 49152 : this.g1() + -64;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I", line = 532)
	public final int g2s() {
		this.pos += 2;
		@Pc(36) int local36 = ((this.data[this.pos - 2] & 0xFF) << 8) +
			(this.data[this.pos - 1] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(II)V", line = 550)
	public final void p1_alt2(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(II)V", line = 562)
	public final void p1(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)I", line = 580)
	public final int g2() {
		this.pos += 2;
		return (this.data[this.pos - 1] & 0xFF) +
			((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)I", line = 593)
	public final int g2_alt1() {
		this.pos += 2;
		return (this.data[this.pos - 2] & 0xFF) +
			((this.data[this.pos - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(Z)I", line = 605)
	public final int g1_alt1() {
		return this.data[this.pos++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(II)V", line = 621)
	public final void p2_alt3(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)I", line = 633)
	public final int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)V", line = 650)
	public final void gdata(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.data[this.pos++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(I)I", line = 668)
	public final int g4s_alt3() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 16) +
			((this.data[this.pos - 3] & 0xFF) << 24) +
			(this.data[this.pos - 2] & 0xFF) +
			((this.data[this.pos - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(II)V", line = 682)
	public final void p2_alt2(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V", line = 695)
	public final void p1_alt1(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V", line = 831)
	public Packet(@OriginalArg(0) int size) {
		this.data = ByteArrayPool.alloc(size);
		this.pos = 0;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(I)I", line = 842)
	public final int g2_alt3() {
		this.pos += 2;
		return (this.data[this.pos - 2] - 128 & 0xFF) +
			((this.data[this.pos - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(I)I", line = 854)
	public final int g1_alt3() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(ZI)V", line = 864)
	public final void p1_alt3(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(I)J", line = 875)
	public final long g8() {
		@Pc(18) long local18 = (long) this.g4s() & 0xFFFFFFFFL;
		@Pc(25) long local25 = (long) this.g4s() & 0xFFFFFFFFL;
		return local25 + (local18 << 32);
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(I)I", line = 891)
	public final int g3() {
		this.pos += 3;
		return ((this.data[this.pos - 3] & 0xFF) << 16) +
			((this.data[this.pos - 2] & 0xFF) << 8) +
			(this.data[this.pos - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(Z)I", line = 904)
	public final int g2s_alt1() {
		this.pos += 2;
		@Pc(37) int local37 = (this.data[this.pos - 2] & 0xFF) +
			((this.data[this.pos - 1] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(II)V", line = 923)
	public final void p2_alt1(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)Lclient!o;", line = 935)
	public final JagString gjstr() {
		@Pc(13) int local13 = this.pos;
		while (this.data[this.pos++] != 0) {
		}
		return Static64.method1114(this.pos - local13 - 1, this.data, local13);
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V", line = 954)
	public Packet(@OriginalArg(0) byte[] arg0) {
		this.pos = 0;
		this.data = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(II)V", line = 965)
	public final void p4_alt2(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(Z)I", line = 983)
	public final int g2s_alt3() {
		this.pos += 2;
		@Pc(38) int local38 = (this.data[this.pos - 2] - 128 & 0xFF) +
			((this.data[this.pos - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(I)I", line = 1005)
	public final int gVarInt() {
		@Pc(12) byte local12 = this.data[this.pos++];
		@Pc(18) int local18 = 0;
		while (local12 < 0) {
			local18 = (local18 | local12 & 0x7F) << 7;
			local12 = this.data[this.pos++];
		}
		return local18 | local12;
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(II)V", line = 1028)
	public final void p4(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)I", line = 1109)
	public final int g4s() {
		this.pos += 4;
		return (this.data[this.pos - 1] & 0xFF) +
			((this.data[this.pos - 2] & 0xFF) << 8) +
			((this.data[this.pos - 4] & 0xFF) << 24) +
			((this.data[this.pos - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(I)I", line = 1122)
	public final int g4s_alt1() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) +
			((this.data[this.pos - 3] & 0xFF) << 8) +
			((this.data[this.pos - 2] & 0xFF) << 16) +
			((this.data[this.pos - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "(I)I", line = 1140)
	public final int g1_alt2() {
		return -this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(II)V", line = 1159)
	public final void psize1(@OriginalArg(1) int arg0) {
		this.data[this.pos - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "(I)I", line = 1181)
	public final int g4s_alt2() {
		this.pos += 4;
		return ((this.data[this.pos - 4] & 0xFF) << 8) +
			(this.data[this.pos - 3] & 0xFF) +
			((this.data[this.pos - 2] & 0xFF) << 24) +
			((this.data[this.pos - 1] & 0xFF) << 16);
	}
}

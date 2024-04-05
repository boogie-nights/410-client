package jagex2.io;

import java.math.BigInteger;

import jagex2.Class40;
import jagex2.Static45;
import jagex2.Static70;
import jagex2.Static19;
import jagex2.datastruct.Linkable;
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

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Packet(@OriginalArg(0) int arg0) {
		this.data = Static45.method803(arg0);
		this.pos = 0;
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([B)V")
	public Packet(@OriginalArg(0) byte[] arg0) {
		this.pos = 0;
		this.data = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)V")
	public final void p8(@OriginalArg(1) long value) {
		this.data[this.pos++] = (byte) (value >> 56);
		this.data[this.pos++] = (byte) (value >> 48);
		this.data[this.pos++] = (byte) (value >> 40);
		this.data[this.pos++] = (byte) (value >> 32);
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)I")
	public final int method1681() {
		this.pos += 2;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIBI)V")
	public final void pdata(@OriginalArg(0) byte[] src, @OriginalArg(3) int arg1) {
		for (@Pc(12) int i = 0; i < arg1; i++) {
			this.data[this.pos++] = src[i];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!o;B)V")
	public final void method1683(@OriginalArg(0) Class40 arg0) {
		this.pos += arg0.method1191(this.data, arg0.method1169(), this.pos);
		this.data[this.pos++] = 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[II)V")
	public final void method1684(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.pos;
		this.pos = 5;
		@Pc(17) int local17 = (arg0 - 5) / 8;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) int local25 = this.g4();
			@Pc(29) int local29 = this.g4();
			@Pc(31) int local31 = -957401312;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local29 -= local25 + (local25 << 4 ^ local25 >>> 5) ^ arg1[local31 >>> 11 & 0x3] + local31;
				local31 -= -1640531527;
				local25 -= local31 + arg1[local31 & 0x3] ^ (local29 << 4 ^ local29 >>> 5) + local29;
			}
			this.pos -= 8;
			this.p4(local25);
			this.p4(local29);
		}
		this.pos = local8;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void rsaenc(@OriginalArg(0) BigInteger exp, @OriginalArg(2) BigInteger mod) {
		@Pc(6) int length = this.pos;
		@Pc(9) byte[] temp = new byte[length];
		this.pos = 0;

		this.method1709(length, temp);

		@Pc(27) BigInteger bigRaw = new BigInteger(temp);
		@Pc(32) BigInteger bigEnc = bigRaw.modPow(exp, mod);
		@Pc(35) byte[] rawEnc = bigEnc.toByteArray();

		this.pos = 0;
		this.p1(rawEnc.length);
		this.pdata(rawEnc, rawEnc.length);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public final void method1686(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 24);
		this.data[this.pos++] = (byte) arg0;
		this.data[this.pos++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
	public final int method1687(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = Static19.method371(arg0, this.data, this.pos);
		this.p4(local16);
		return local16;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
	public final void method1688(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 16);
		this.data[this.pos++] = (byte) (arg0 >> 8);
		this.data[this.pos++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)B")
	public final byte method1690() {
		return (byte) (128 - this.data[this.pos++]);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)B")
	public final byte method1691() {
		return (byte) -this.data[this.pos++];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([BIII)V")
	public final void method1692(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(14) int local14 = arg1 - 1; local14 >= 0; local14--) {
			arg0[local14] = this.data[this.pos++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)I")
	public final int method1693() {
		this.pos += 2;
		@Pc(33) int local33 = (this.data[this.pos - 1] - 128 & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)V")
	public final void method1694(@OriginalArg(0) int arg0) {
		this.data[this.pos++] = (byte) (arg0 >> 769666216);
		this.data[this.pos++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	public final void method1695(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.p1(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1694(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)B")
	public final byte g1b() {
		return this.data[this.pos++];
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)V")
	public final void ip4(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 24);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I")
	public final int gsmart() {
		@Pc(16) int value = this.data[this.pos] & 0xFF;
		return value >= 128 ? this.g2() - 49152 : this.g1() + -64;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)I")
	public final int gsmarts() {
		@Pc(12) int value = this.data[this.pos] & 0xFF;
		return value < 128 ? this.g1() : this.g2() - 32768;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	public final int g2b() {
		this.pos += 2;
		@Pc(36) int value = (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(II)V")
	public final void method1702(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) -value;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(II)V")
	public final void p1(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)I")
	public final int g2() {
		this.pos += 2;
		return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(I)I")
	public final int method1705() {
		this.pos += 2;
		return ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(Z)I")
	public final int method1706() {
		return this.data[this.pos++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(II)V")
	public final void method1707(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value + 128);
		this.data[this.pos++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)I")
	public final int g1() {
		return this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BI)V")
	public final void method1709(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.data[this.pos++];
		}
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(I)I")
	public final int method1710() {
		this.pos += 4;
		return (this.data[this.pos - 2] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 24) + ((this.data[this.pos - 4] & 0xFF) << 16) + ((this.data[this.pos - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(II)V")
	public final void method1711(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) (value + 128);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V")
	public final void method1712(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(I)I")
	public final int method1714() {
		this.pos += 2;
		return (this.data[this.pos - 2] - 128 & 0xFF) + ((this.data[this.pos - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "(I)I")
	public final int method1715() {
		return 128 - this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(ZI)V")
	public final void method1716(@OriginalArg(1) int arg0) {
		this.data[this.pos++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "(I)J")
	public final long g8() {
		@Pc(18) long high = (long) this.g4() & 0xFFFFFFFFL;
		@Pc(25) long low = (long) this.g4() & 0xFFFFFFFFL;
		return low + (high << 32);
	}

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "(I)I")
	public final int method1718() {
		this.pos += 3;
		return ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 3] << 16 & 0xFF0000) + (this.data[this.pos + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(Z)I")
	public final int method1719() {
		this.pos += 2;
		@Pc(37) int local37 = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "(II)V")
	public final void ip2(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 8);
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)Lclient!o;")
	public final Class40 method1721() {
		@Pc(13) int local13 = this.pos;
		while (this.data[this.pos++] != 0) {
		}
		return Static70.method1114(this.pos - local13 - 1, this.data, local13);
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(II)V")
	public final void method1722(@OriginalArg(1) int value) {
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(Z)I")
	public final int method1723() {
		this.pos += 2;
		@Pc(38) int value = ((this.data[this.pos - 1] & 0xFF) << 8) + (this.data[this.pos - 2] - 128 & 0xFF);
		if (value > 32767) {
			value -= 65536;
		}
		return value;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(I)I")
	public final int method1724() {
		@Pc(12) byte local12 = this.data[this.pos++];
		@Pc(18) int local18 = 0;
		while (local12 < 0) {
			local18 = (local18 | local12 & 0x7F) << 7;
			local12 = this.data[this.pos++];
		}
		return local18 | local12;
	}

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "(II)V")
	public final void p4(@OriginalArg(0) int value) {
		this.data[this.pos++] = (byte) (value >> 24);
		this.data[this.pos++] = (byte) (value >> 16);
		this.data[this.pos++] = (byte) (value >> 8);
		this.data[this.pos++] = (byte) value;
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)I")
	public final int g4() {
		this.pos += 4;
		return (this.data[this.pos - 1] & 0xFF) + (((this.data[this.pos - 2] & 0xFF) << 8) + ((this.data[this.pos - 4] & 0xFF) << 24) + ((this.data[this.pos - 3] & 0xFF) << 16));
	}

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "(I)I")
	public final int method1729() {
		this.pos += 4;
		return (this.data[this.pos - 4] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 8) + ((this.data[-1 + this.pos] & 0xFF) << 24) + ((this.data[this.pos + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "(I)I")
	public final int method1730() {
		return -this.data[this.pos++] & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "(II)V")
	public final void psize1(@OriginalArg(1) int size) {
		this.data[this.pos - size - 1] = (byte) size;
	}

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "(I)I")
	public final int method1732() {
		this.pos += 4;
		return (this.data[this.pos - 3] & 0xFF) + ((this.data[this.pos - 2] & 0xFF) << 24) + ((this.data[this.pos + -1] & 0xFF) << 16) + ((this.data[this.pos + -4] & 0xFF) << 8);
	}
}

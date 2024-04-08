package jagex2;

import jagex2.io.Isaac;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub3_Sub1 extends Packet {

	@OriginalMember(owner = "client!wc", name = "Nb", descriptor = "I")
	private int bitPos;

	@OriginalMember(owner = "client!wc", name = "Wb", descriptor = "Lclient!be;")
	private Isaac random;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(B)I")
	public int method1733() {
		return super.data[super.pos++] - this.random.nextInt() & 0xFF;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([II)V")
	public void method1734(@OriginalArg(0) int[] seed) {
		this.random = new Isaac(seed);
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(II)V")
	public void p1isaac(@OriginalArg(1) int opcode) {
		super.data[super.pos++] = (byte) (this.random.nextInt() + opcode);
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(Z)V")
	public void accessBits() {
		this.bitPos = super.pos * 8;
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(B)V")
	public void method1739() {
		super.pos = (this.bitPos + 7) / 8;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(ZI)I")
	public int method1742(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.bitPos;
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(II)I")
	public int gBit(@OriginalArg(1) int n) {
		@Pc(10) int bytePos = this.bitPos >> 3;
		@Pc(26) int remainingBits = 8 - (this.bitPos & 0x7);
		this.bitPos += n;
		@Pc(34) int value = 0;
		while (remainingBits < n) {
			value += (super.data[bytePos++] & Static48.BITMASK[remainingBits]) << n - remainingBits;
			n -= remainingBits;
			remainingBits = 8;
		}
		if (n == remainingBits) {
			value += Static48.BITMASK[remainingBits] & super.data[bytePos];
		} else {
			value += super.data[bytePos] >> remainingBits - n & Static48.BITMASK[n];
		}
		return value;
	}
}

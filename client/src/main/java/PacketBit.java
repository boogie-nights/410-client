import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class PacketBit extends Packet {

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "[I")
	public static int[] anIntArray235 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wc", name = "Nb", descriptor = "I")
	private int bitPos;

	@OriginalMember(owner = "client!wc", name = "Wb", descriptor = "Lclient!be;")
	private Isaac isaac;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(B)I", line = 4)
	public int gIsaac1() {
		return super.data[super.pos++] - this.isaac.nextInt() & 0xFF;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([II)V", line = 16)
	public void setSeed(@OriginalArg(0) int[] arg0) {
		this.isaac = new Isaac(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(II)V", line = 58)
	public void pIsaac1(@OriginalArg(1) int arg0) {
		super.data[super.pos++] = (byte) (this.isaac.nextInt() + arg0);
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(Z)V", line = 75)
	public void bits() {
		this.bitPos = super.pos * 8;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V", line = 95)
	public PacketBit(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(B)V", line = 130)
	public void bytes() {
		super.pos = (this.bitPos + 7) / 8;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(ZI)I", line = 655)
	public int bitsAvailable(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.bitPos;
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(II)I", line = 671)
	public int gBit(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.bitPos >> 3;
		@Pc(26) int local26 = 8 - (this.bitPos & 0x7);
		this.bitPos += arg0;
		@Pc(34) int local34 = 0;
		while (local26 < arg0) {
			local34 += (super.data[local10++] & anIntArray235[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local34 += anIntArray235[local26] & super.data[local10];
		} else {
			local34 += super.data[local10] >> local26 - arg0 & anIntArray235[arg0];
		}
		return local34;
	}
}

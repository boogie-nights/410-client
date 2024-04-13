import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class LocEntity extends Entity {

	@OriginalMember(owner = "client!sa", name = "Cb", descriptor = "I")
	private final int anInt2032;

	@OriginalMember(owner = "client!sa", name = "Jb", descriptor = "I")
	private final int anInt2038;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
	private final int anInt2022;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	private final int anInt2021;

	@OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
	private final int anInt2028;

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
	private final int anInt2024;

	@OriginalMember(owner = "client!sa", name = "Eb", descriptor = "I")
	private final int anInt2034;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lclient!f;")
	private SeqType seq;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
	private int seqFrame;

	@OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
	private int seqCycle;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Lclient!ne;", line = 34)
	@Override
	protected Model method1533() {
		if (this.seq != null) {
			@Pc(13) int local13 = Static1.anInt2511 - this.seqCycle;
			if (local13 > 100 && this.seq.anInt669 > 0) {
				local13 = 100;
			}
			label37: {
				do {
					do {
						if (this.seq.delay[this.seqFrame] >= local13) {
							break label37;
						}
						local13 -= this.seq.delay[this.seqFrame];
						this.seqFrame++;
					} while (this.seq.anIntArray124.length > this.seqFrame);
					this.seqFrame -= this.seq.anInt669;
				} while (this.seqFrame >= 0 && this.seq.anIntArray124.length > this.seqFrame);
				this.seq = null;
			}
			this.seqCycle = Static1.anInt2511 - local13;
		}
		@Pc(104) LocType local104 = Static83.method1470(this.anInt2034);
		if (local104.anIntArray210 != null) {
			local104 = local104.method766();
		}
		return local104 == null ? null : local104.method777(this.anInt2021, this.anInt2028, this.anInt2024, this.seq, this.anInt2022, this.seqFrame, this.anInt2038, this.anInt2032);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 466)
	public LocEntity(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2032 = arg6;
		this.anInt2038 = arg3;
		this.anInt2022 = arg1;
		this.anInt2021 = arg2;
		this.anInt2028 = arg5;
		this.anInt2024 = arg4;
		this.anInt2034 = arg0;
		if (arg7 != -1) {
			this.seq = Static57.method1042(arg7);
			this.seqFrame = 0;
			this.seqCycle = Static1.anInt2511 - 1;
			if (arg8 && this.seq.anInt669 != -1) {
				this.seqFrame = (int) ((double) this.seq.anIntArray124.length * Math.random());
				this.seqCycle -= (int) ((double) this.seq.delay[this.seqFrame] * Math.random());
			}
		}
	}
}

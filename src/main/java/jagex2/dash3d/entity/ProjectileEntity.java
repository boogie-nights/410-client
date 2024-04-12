package jagex2.dash3d.entity;

import jagex2.Class2_Sub2_Sub5;
import jagex2.Class2_Sub2_Sub6;
import jagex2.Static5;
import jagex2.Static62;
import jagex2.graphics.Entity;
import jagex2.graphics.Model;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class ProjectileEntity extends Entity {

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "D")
	public double y;

	@OriginalMember(owner = "client!kd", name = "ob", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
	private int anInt1429;

	@OriginalMember(owner = "client!kd", name = "Gb", descriptor = "D")
	private double accelerationY;

	@OriginalMember(owner = "client!kd", name = "Ib", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!kd", name = "Nb", descriptor = "I")
	public int anInt1436;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "D")
	private double velocity;

	@OriginalMember(owner = "client!kd", name = "Sb", descriptor = "D")
	private double velocityY;

	@OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
	private int seqFrame = 0;

	@OriginalMember(owner = "client!kd", name = "Mb", descriptor = "I")
	private int seqCycle = 0;

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "Z")
	private boolean mobile = false;

	@OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
	public final int target;

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
	private final int anInt1420;

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
	public final int startCycle;

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
	private final int anInt1422;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "I")
	public final int lastCycle;

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
	public final int offsetY;

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
	private final int anInt1431;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
	private final int anInt1421;

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
	public final int level;

	@OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
	private final int srcY;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
	private final int anInt1423;

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "Lclient!f;")
	private final Class2_Sub2_Sub6 spotanim;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public ProjectileEntity(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.target = arg9;
		this.anInt1420 = arg7;
		this.mobile = false;
		this.startCycle = arg5;
		this.anInt1422 = arg0;
		this.lastCycle = arg6;
		this.offsetY = arg10;
		this.anInt1431 = arg2;
		this.anInt1421 = arg8;
		this.level = arg1;
		this.srcY = arg4;
		this.anInt1423 = arg3;
		@Pc(52) int local52 = Static5.method116(this.anInt1422).anInt640;
		if (local52 == -1) {
			this.spotanim = null;
		} else {
			this.spotanim = Static62.method1042(local52);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
	public void updateVelocity(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int cycle, @OriginalArg(4) int arg3) {

		if (!this.mobile) {
			@Pc(9) double dx = arg0 - this.anInt1431;
			@Pc(15) double dz = (double) (arg3 - this.anInt1423);
			@Pc(24) double d = Math.sqrt(dx * dx + dz * dz);
			this.aDouble7 = (double) this.anInt1421 * dx / d + (double) this.anInt1431;
			this.aDouble5 = (double) this.anInt1423 + dz * (double) this.anInt1421 / d;
			this.y = this.srcY;
		}

		double dt = this.lastCycle + 1 - cycle;
		this.aDouble4 = ((double) arg3 - this.aDouble5) / dt;
		this.aDouble3 = ((double) arg0 - this.aDouble7) / dt;
		this.velocity = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble4 * this.aDouble4);
		if (!this.mobile) {
			this.velocityY = -this.velocity * Math.tan((double) this.anInt1420 * 0.02454369D);
		}
		this.accelerationY = ((double) arg1 - this.velocityY * dt - this.y) * 2.0D / (dt * dt);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	public void update(@OriginalArg(1) int delta) {
		this.mobile = true;
		this.aDouble7 += (double) delta * this.aDouble3;
		this.aDouble5 += this.aDouble4 * (double) delta;
		this.y += this.velocityY * (double) delta + this.accelerationY * 0.5D * (double) delta * (double) delta;
		this.velocityY += (double) delta * this.accelerationY;
		this.anInt1436 = (int) (Math.atan2(this.aDouble3, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt1429 = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7FF;
		if (this.spotanim == null) {
			return;
		}
		this.seqCycle += delta;
		while (this.seqCycle > this.spotanim.anIntArray128[this.seqFrame]) {
			this.seqCycle -= this.spotanim.anIntArray128[this.seqFrame];
			this.seqFrame++;
			if (this.seqFrame >= this.spotanim.anIntArray124.length) {
				this.seqFrame = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Model draw() {
		@Pc(8) Class2_Sub2_Sub5 local8 = Static5.method116(this.anInt1422);
		@Pc(21) Model local21 = local8.method501(this.seqFrame);
		if (local21 == null) {
			return null;
		} else {
			local21.rotateX(this.anInt1429);
			return local21;
		}
	}
}

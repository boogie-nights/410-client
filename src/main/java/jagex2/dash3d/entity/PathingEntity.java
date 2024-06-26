package jagex2.dash3d.entity;

import jagex2.Class40;
import jagex2.Static62;
import jagex2.graphics.Entity;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public abstract class PathingEntity extends Entity {

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!ke", name = "tb", descriptor = "I")
	public int anInt2277;

	@OriginalMember(owner = "client!ke", name = "wb", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!ke", name = "Ab", descriptor = "I")
	public int anInt2283;

	@OriginalMember(owner = "client!ke", name = "Bb", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!ke", name = "Db", descriptor = "I")
	public int anInt2286;

	@OriginalMember(owner = "client!ke", name = "Ib", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!ke", name = "Vb", descriptor = "I")
	public int anInt2297;

	@OriginalMember(owner = "client!ke", name = "Wb", descriptor = "I")
	public int anInt2298;

	@OriginalMember(owner = "client!ke", name = "fc", descriptor = "I")
	public int anInt2305;

	@OriginalMember(owner = "client!ke", name = "lc", descriptor = "I")
	public int anInt2311;

	@OriginalMember(owner = "client!ke", name = "oc", descriptor = "I")
	public int anInt2314;

	@OriginalMember(owner = "client!ke", name = "rc", descriptor = "I")
	public int anInt2317;

	@OriginalMember(owner = "client!ke", name = "vc", descriptor = "I")
	public int anInt2320;

	@OriginalMember(owner = "client!ke", name = "wc", descriptor = "I")
	public int anInt2321;

	@OriginalMember(owner = "client!ke", name = "mb", descriptor = "I")
	public int anInt2271 = 0;

	@OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
	public int cycle = 0;

	@OriginalMember(owner = "client!ke", name = "kb", descriptor = "[I")
	public final int[] pathTileX = new int[10];

	@OriginalMember(owner = "client!ke", name = "xb", descriptor = "I")
	public int anInt2280 = 0;

	@OriginalMember(owner = "client!ke", name = "zb", descriptor = "I")
	public int anInt2282 = 0;

	@OriginalMember(owner = "client!ke", name = "yb", descriptor = "I")
	public int anInt2281 = 0;

	@OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
	public int anInt2267 = 0;

	@OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
	public int anInt2269 = -1;

	@OriginalMember(owner = "client!ke", name = "rb", descriptor = "I")
	public int anInt2276 = -1;

	@OriginalMember(owner = "client!ke", name = "ob", descriptor = "I")
	public int anInt2273 = -1;

	@OriginalMember(owner = "client!ke", name = "Sb", descriptor = "I")
	public int anInt2294 = 100;

	@OriginalMember(owner = "client!ke", name = "ub", descriptor = "I")
	public int size = 1;

	@OriginalMember(owner = "client!ke", name = "Ub", descriptor = "I")
	public int anInt2296 = 0;

	@OriginalMember(owner = "client!ke", name = "Cb", descriptor = "I")
	public int anInt2285 = 32;

	@OriginalMember(owner = "client!ke", name = "Ob", descriptor = "[I")
	public final int[] anIntArray494 = new int[4];

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "I")
	public int anInt2268 = 0;

	@OriginalMember(owner = "client!ke", name = "ac", descriptor = "Lclient!o;")
	public Class40 aClass40_660 = null;

	@OriginalMember(owner = "client!ke", name = "Yb", descriptor = "I")
	public int anInt2300 = 0;

	@OriginalMember(owner = "client!ke", name = "Qb", descriptor = "I")
	public int anInt2292 = 0;

	@OriginalMember(owner = "client!ke", name = "hb", descriptor = "[Z")
	public final boolean[] aBooleanArray34 = new boolean[10];

	@OriginalMember(owner = "client!ke", name = "ec", descriptor = "I")
	public int anInt2304 = -1;

	@OriginalMember(owner = "client!ke", name = "vb", descriptor = "[I")
	public final int[] anIntArray493 = new int[4];

	@OriginalMember(owner = "client!ke", name = "kc", descriptor = "I")
	public int anInt2310 = 200;

	@OriginalMember(owner = "client!ke", name = "Tb", descriptor = "I")
	public int anInt2295 = 0;

	@OriginalMember(owner = "client!ke", name = "cc", descriptor = "[I")
	public final int[] anIntArray495 = new int[4];

	@OriginalMember(owner = "client!ke", name = "bc", descriptor = "I")
	public int anInt2302 = -1;

	@OriginalMember(owner = "client!ke", name = "jc", descriptor = "I")
	public int anInt2309 = 0;

	@OriginalMember(owner = "client!ke", name = "dc", descriptor = "I")
	public int anInt2303 = -1;

	@OriginalMember(owner = "client!ke", name = "pc", descriptor = "I")
	public int anInt2315 = -1000;

	@OriginalMember(owner = "client!ke", name = "sc", descriptor = "I")
	public int anInt2318 = -1;

	@OriginalMember(owner = "client!ke", name = "Zb", descriptor = "I")
	public int anInt2301 = 0;

	@OriginalMember(owner = "client!ke", name = "uc", descriptor = "[I")
	public final int[] pathTileZ = new int[10];

	@OriginalMember(owner = "client!ke", name = "hc", descriptor = "I")
	public int primarySeqId = -1;

	@OriginalMember(owner = "client!ke", name = "qc", descriptor = "I")
	public int anInt2316 = 0;

	@OriginalMember(owner = "client!ke", name = "Lb", descriptor = "I")
	public int anInt2291 = 0;

	@OriginalMember(owner = "client!ke", name = "Jb", descriptor = "I")
	public int anInt2290 = -1;

	@OriginalMember(owner = "client!ke", name = "Ac", descriptor = "I")
	public int anInt2324 = -1;

	@OriginalMember(owner = "client!ke", name = "xc", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ke", name = "nc", descriptor = "I")
	public int anInt2313 = 0;

	@OriginalMember(owner = "client!ke", name = "yc", descriptor = "I")
	public int anInt2322 = -1;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIII)V")
	public final void method1540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			if (this.anIntArray494[local7] <= arg1) {
				this.anIntArray493[local7] = arg0;
				this.anIntArray495[local7] = arg2;
				this.anIntArray494[local7] = arg1 + 70;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "(I)V")
	public final void method1543() {
		this.anInt2309 = 0;
		this.anInt2281 = 0;
	}

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "(I)Z")
	public boolean method1544() {
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIBI)V")
	public final void move(@OriginalArg(0) boolean teleport, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.primarySeqId != -1 && Static62.method1042(this.primarySeqId).anInt666 == 1) {
			this.primarySeqId = -1;
		}
		if (!teleport) {
			@Pc(31) int local31 = arg1 - this.pathTileZ[0];
			@Pc(38) int local38 = arg2 - this.pathTileX[0];
			if (local38 >= -8 && local38 <= 8 && local31 >= -8 && local31 <= 8) {
				if (this.anInt2309 < 9) {
					this.anInt2309++;
				}
				for (@Pc(65) int local65 = this.anInt2309; local65 > 0; local65--) {
					this.pathTileX[local65] = this.pathTileX[local65 - 1];
					this.pathTileZ[local65] = this.pathTileZ[local65 - 1];
					this.aBooleanArray34[local65] = this.aBooleanArray34[local65 - 1];
				}
				this.pathTileX[0] = arg2;
				this.pathTileZ[0] = arg1;
				this.aBooleanArray34[0] = false;
				return;
			}
		}
		this.anInt2281 = 0;
		this.anInt2309 = 0;
		this.anInt2282 = 0;
		this.pathTileX[0] = arg2;
		this.pathTileZ[0] = arg1;
		this.x = this.size * 64 + this.pathTileX[0] * 128;
		this.z = this.size * 64 + this.pathTileZ[0] * 128;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBZ)V")
	public final void step(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = this.pathTileX[0];
		@Pc(15) int local15 = this.pathTileZ[0];
		if (this.primarySeqId != -1 && Static62.method1042(this.primarySeqId).anInt666 == 1) {
			this.primarySeqId = -1;
		}
		if (arg0 == 0) {
			local6--;
			local15++;
		}
		if (arg0 == 1) {
			local15++;
		}
		if (this.anInt2309 < 9) {
			this.anInt2309++;
		}
		for (@Pc(64) int local64 = this.anInt2309; local64 > 0; local64--) {
			this.pathTileX[local64] = this.pathTileX[local64 - 1];
			this.pathTileZ[local64] = this.pathTileZ[local64 - 1];
			this.aBooleanArray34[local64] = this.aBooleanArray34[local64 - 1];
		}
		if (arg0 == 2) {
			local6++;
			local15++;
		}
		if (arg0 == 3) {
			local6--;
		}
		if (arg0 == 4) {
			local6++;
		}
		if (arg0 == 5) {
			local6--;
			local15--;
		}
		if (arg0 == 6) {
			local15--;
		}
		if (arg0 == 7) {
			local6++;
			local15--;
		}
		this.pathTileX[0] = local6;
		this.pathTileZ[0] = local15;
		this.aBooleanArray34[0] = arg1;
	}
}

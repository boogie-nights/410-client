package jagex2;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub2_Sub2_Sub2 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!fc", name = "nb", descriptor = "I")
	public int height = 0;

	@OriginalMember(owner = "client!fc", name = "mb", descriptor = "[[B")
	private byte[][] charOffsetX = new byte[256][];

	@OriginalMember(owner = "client!fc", name = "ib", descriptor = "Ljava/util/Random;")
	private final Random random = new Random();

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "[I")
	private final int[] charOffsetY;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "[I")
	private final int[] anIntArray141;

	@OriginalMember(owner = "client!fc", name = "eb", descriptor = "[I")
	private final int[] anIntArray140;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class2_Sub2_Sub2_Sub2(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.charOffsetY = arg0;
		this.anIntArray141 = arg1;
		this.anIntArray140 = arg2;
		@Pc(27) byte local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < arg3.length; local29++) {
			if (arg3[local29] == 1) {
				local27 = (byte) local29;
			}
		}
		this.charOffsetX = arg4;
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			@Pc(54) byte[] local54 = this.charOffsetX[local48];
			@Pc(57) int local57 = local54.length;
			for (@Pc(59) int local59 = 0; local59 < local57; local59++) {
				local54[local59] = (byte) (local54[local59] == local27 ? 0 : 1);
			}
		}
		this.height = this.charOffsetY[32] + this.anIntArray140[32];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIII)V")
	public void method564(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method568(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.height;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1783; local17++) {
			@Pc(25) int local25 = arg0.aByteArray14[local17] & 0xFF;
			if (local25 != 32) {
				this.drawChar(this.charOffsetX[local25], arg1, local15 + this.charOffsetY[local25] + (int) (Math.sin((double) local17 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray141[local25], this.anIntArray140[local25], arg3);
			}
			arg1 += this.anIntArray141[local25];
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([I[BIIIIIII)V")
	private void drawMask(@OriginalArg(0) int[] dst, @OriginalArg(1) byte[] src, @OriginalArg(2) int rgb, @OriginalArg(3) int srcOff, @OriginalArg(4) int dstOff, @OriginalArg(5) int w, @OriginalArg(6) int h, @OriginalArg(7) int dstStep, @OriginalArg(8) int srcStep) {
		@Pc(4) int hw = -(w >> 2);
		@Pc(9) int local9 = -(w & 0x3);
		for (@Pc(12) int y = -h; y < 0; y++) {
			for (@Pc(15) int x = hw; x < 0; x++) {
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
			}
			for (@Pc(69) int x = local9; x < 0; x++) {
				if (src[srcOff++] == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
			}
			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;III)V")
	public void method566(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.drawString(arg0, arg1 - this.method568(arg0) / 2, arg2, arg3);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([I[BIIIIIIII)V")
	private void method567(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;)I")
	public int method568(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt1783; local7++) {
			local5 += this.anIntArray141[arg0.aByteArray14[local7] & 0xFF];
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIII)V")
	private void drawChar(@OriginalArg(0) byte[] data, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int w, @OriginalArg(4) int h, @OriginalArg(5) int rgb) {
		@Pc(5) int dstOff = x + y * Static26.width2d;
		@Pc(9) int dstStep = Static26.width2d - w;

		@Pc(11) int srcStep = 0;
		@Pc(13) int srcOff = 0;

		@Pc(20) int cutoff;

		if (y < Static26.top) {
			cutoff = Static26.top - y;
			h -= cutoff;
			y = Static26.top;
			srcOff = cutoff * w;
			dstOff += cutoff * Static26.width2d;
		}

		if (y + h > Static26.bottom) {
			h -= y + h - Static26.bottom;
		}

		if (x < Static26.right) {
			cutoff = Static26.right - x;
			w -= cutoff;
			x = Static26.right;
			srcOff += cutoff;
			dstOff += cutoff;
			srcStep = cutoff;
			dstStep += cutoff;
		}

		if (x + w > Static26.anInt2436) {
			cutoff = x + w - Static26.anInt2436;
			w -= cutoff;
			srcStep += cutoff;
			dstStep += cutoff;
		}

		if (w > 0 && h > 0) {
			this.drawMask(Static26.anIntArray533, data, rgb, srcOff, dstOff, w, h, dstStep, srcStep);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;IIII)V")
	public void method570(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		arg1 -= this.method568(arg0) / 2;
		@Pc(15) int local15 = arg2 - this.height;
		for (@Pc(17) int local17 = 0; local17 < arg0.method1169(); local17++) {
			@Pc(25) int local25 = arg0.aByteArray14[local17] & 0xFF;
			if (local25 != 32) {
				this.drawChar(this.charOffsetX[local25], arg1 + (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local15 + this.charOffsetY[local25] + (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray141[local25], this.anIntArray140[local25], arg3);
			}
			arg1 += this.anIntArray141[local25];
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;III)V")
	public void method572(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.drawString(arg0, 507 - this.method568(arg0), arg1, arg2);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIIIIII)V")
	private void method573(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static26.width2d;
		@Pc(9) int local9 = Static26.width2d - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static26.top) {
			local20 = Static26.top - arg2;
			arg4 -= local20;
			arg2 = Static26.top;
			local13 = local20 * arg3;
			local5 += local20 * Static26.width2d;
		}
		if (arg2 + arg4 > Static26.bottom) {
			arg4 -= arg2 + arg4 - Static26.bottom;
		}
		if (arg1 < Static26.right) {
			local20 = Static26.right - arg1;
			arg3 -= local20;
			arg1 = Static26.right;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static26.anInt2436) {
			local20 = arg1 + arg3 - Static26.anInt2436;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method567(Static26.anIntArray533, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIIZ)V")
	public void method574(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean53 = false;
		@Pc(4) int local4 = arg1;
		if (arg0 == null) {
			return;
		}
		@Pc(12) int local12 = arg2 - this.height;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1783; local14++) {
			@Pc(47) int local47;
			if (arg0.aByteArray14[local14] == 64 && local14 + 4 < arg0.anInt1783 && arg0.aByteArray14[local14 + 4] == 64) {
				local47 = this.method579(arg0.method1180(local14 + 4, local14 + 1));
				if (local47 != -1) {
					arg3 = local47;
				}
				local14 += 4;
			} else {
				local47 = arg0.aByteArray14[local14] & 0xFF;
				if (local47 != 32) {
					if (arg4) {
						this.drawChar(this.charOffsetX[local47], arg1 + 1, local12 + this.charOffsetY[local47] + 1, this.anIntArray141[local47], this.anIntArray140[local47], 0);
					}
					this.drawChar(this.charOffsetX[local47], arg1, local12 + this.charOffsetY[local47], this.anIntArray141[local47], this.anIntArray140[local47], arg3);
				}
				arg1 += this.anIntArray141[local47];
			}
		}
		if (this.aBoolean53) {
			Static26.method1603(local4, local12 + (int) ((double) this.height * 0.7D), arg1 - local4, 8388608);
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lclient!o;III)V")
	public void drawString(@OriginalArg(0) Class40 str, @OriginalArg(1) int x, @OriginalArg(2) int y, @OriginalArg(3) int arg3) {
		if (str == null) {
			return;
		}
		@Pc(7) int offY = y - this.height;
		for (@Pc(9) int i = 0; i < str.anInt1783; i++) {
			@Pc(17) int c = str.aByteArray14[i] & 0xFF;
			if (c != 32) {
				this.drawChar(this.charOffsetX[c], x, offY + this.charOffsetY[c], this.anIntArray141[c], this.anIntArray140[c], arg3);
			}
			x += this.anIntArray141[c];
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;)I")
	public int method576(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt1783; local7++) {
			if (arg0.aByteArray14[local7] == 64 && local7 + 4 < arg0.anInt1783 && arg0.aByteArray14[local7 + 4] == 64) {
				local7 += 4;
			} else {
				local5 += this.anIntArray141[arg0.aByteArray14[local7] & 0xFF];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIIII)V")
	public void method577(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) double local9 = 7.0D - (double) arg5 / 8.0D;
		if (local9 < 0.0D) {
			local9 = 0.0D;
		}
		arg1 -= this.method568(arg0) / 2;
		@Pc(28) int local28 = arg2 - this.height;
		for (@Pc(30) int local30 = 0; local30 < arg0.method1169(); local30++) {
			@Pc(38) int local38 = arg0.aByteArray14[local30] & 0xFF;
			if (local38 != 32) {
				this.drawChar(this.charOffsetX[local38], arg1, local28 + this.charOffsetY[local38] + (int) (Math.sin((double) local30 / 1.5D + (double) arg4) * local9), this.anIntArray141[local38], this.anIntArray140[local38], arg3);
			}
			arg1 += this.anIntArray141[local38];
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!o;IIIZ)V")
	public void method578(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.method574(arg0, arg1 - this.method576(arg0) / 2, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lclient!o;)I")
	private int method579(@OriginalArg(0) Class40 arg0) {
		if (arg0.method1184(Static28.aClass40_208)) {
			return 16711680;
		} else if (arg0.method1184(Static28.aClass40_201)) {
			return 65280;
		} else if (arg0.method1184(Static28.aClass40_211)) {
			return 255;
		} else if (arg0.method1184(Static28.aClass40_202)) {
			return 16776960;
		} else if (arg0.method1184(Static28.aClass40_207)) {
			return 65535;
		} else if (arg0.method1184(Static28.aClass40_209)) {
			return 16711935;
		} else if (arg0.method1184(Static28.aClass40_217)) {
			return 16777215;
		} else if (arg0.method1184(Static28.aClass40_214)) {
			return 0;
		} else if (arg0.method1184(Static28.aClass40_212)) {
			return 16748608;
		} else if (arg0.method1184(Static28.aClass40_203)) {
			return 8388608;
		} else if (arg0.method1184(Static28.aClass40_215)) {
			return 128;
		} else if (arg0.method1184(Static28.aClass40_213)) {
			return 16756736;
		} else if (arg0.method1184(Static28.aClass40_205)) {
			return 16740352;
		} else if (arg0.method1184(Static28.aClass40_206)) {
			return 16723968;
		} else if (arg0.method1184(Static28.aClass40_216)) {
			return 12648192;
		} else if (arg0.method1184(Static28.aClass40_204)) {
			return 8453888;
		} else if (arg0.method1184(Static28.aClass40_210)) {
			return 4259584;
		} else {
			if (arg0.method1184(Static28.aClass40_200)) {
				this.aBoolean53 = true;
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!o;IIIZI)V")
	public void drawStringTooltip(@OriginalArg(0) Class40 str, @OriginalArg(1) int x, @OriginalArg(3) int arg2, @OriginalArg(5) int seed) {
		if (str == null) {
			return;
		}
		this.random.setSeed((long) seed);
		@Pc(15) int rand = (this.random.nextInt() & 0x1F) + 192;
		@Pc(20) int offY = 15 - this.height;
		for (@Pc(22) int i = 0; i < str.anInt1783; i++) {
			@Pc(55) int local55;
			if (str.aByteArray14[i] == 64 && i + 4 < str.anInt1783 && str.aByteArray14[i + 4] == 64) {
				local55 = this.method579(str.method1180(i + 4, i + 1));
				if (local55 != -1) {
					arg2 = local55;
				}
				i += 4;
			} else {
				local55 = str.aByteArray14[i] & 0xFF;
				if (local55 != 32) {
					this.method573(this.charOffsetX[local55], x + 1, offY + this.charOffsetY[local55] + 1, this.anIntArray141[local55], this.anIntArray140[local55], 0, 192);
					this.method573(this.charOffsetX[local55], x, offY + this.charOffsetY[local55], this.anIntArray141[local55], this.anIntArray140[local55], arg2, rand);
				}
				x += this.anIntArray141[local55];
				if ((this.random.nextInt() & 0x3) == 0) {
					x++;
				}
			}
		}
	}
}

package jagex2.graphics;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

// Todo: Roll this into Pix24?
public final class Pix24Static {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIII)V")
	public static void copyPixelsAlt(@OriginalArg(0) int[] dst, @OriginalArg(1) int[] src, @OriginalArg(2) int srcOff, @OriginalArg(3) int dstOff, @OriginalArg(4) int w, @OriginalArg(5) int h, @OriginalArg(6) int dstStep, @OriginalArg(7) int srcStep) {
		for (@Pc(2) int y = -h; y < 0; y++) {
			@Pc(9) int qw = dstOff + w - 3;
			while (dstOff < qw) {
				dst[dstOff++] = src[srcOff++];
				dst[dstOff++] = src[srcOff++];
				dst[dstOff++] = src[srcOff++];
				dst[dstOff++] = src[srcOff++];
			}
			qw += 3;
			while (dstOff < qw) {
				dst[dstOff++] = src[srcOff++];
			}
			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII[B)V")
	public static void copyPixelsMasked(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] src, @OriginalArg(3) int srcOff, @OriginalArg(4) int dstOff, @OriginalArg(5) int w, @OriginalArg(6) int h, @OriginalArg(7) int dstStep, @OriginalArg(8) int srcStep, @OriginalArg(9) byte[] mask) {
		@Pc(4) int qw = -(w >> 2);
		@Pc(9) int w2 = -(w & 0x3);

		for (@Pc(12) int y = -h; y < 0; y++) {
			@Pc(21) int rgb;
			for (@Pc(15) int x = qw; x < 0; x++) {
				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					arg0[dstOff++] = rgb;
				} else {
					dstOff++;
				}
				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					arg0[dstOff++] = rgb;
				} else {
					dstOff++;
				}
				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					arg0[dstOff++] = rgb;
				} else {
					dstOff++;
				}
				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					arg0[dstOff++] = rgb;
				} else {
					dstOff++;
				}
			}
			for (@Pc(93) int x = w2; x < 0; x++) {
				rgb = src[srcOff++];
				if (rgb != 0 && mask[dstOff] == 0) {
					arg0[dstOff++] = rgb;
				} else {
					dstOff++;
				}
			}
			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIIII)V")
	public static void copyPixelsAlpha(@OriginalArg(0) int[] dst, @OriginalArg(1) int[] src, @OriginalArg(3) int srcOff, @OriginalArg(4) int dstOff, @OriginalArg(5) int w, @OriginalArg(6) int h, @OriginalArg(7) int dstStep, @OriginalArg(8) int srcStep) {
		for (@Pc(6) int y = -h; y < 0; y++) {
			for (@Pc(10) int x = -w; x < 0; x++) {
				@Pc(16) int rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					@Pc(22) int dstRgb = dst[dstOff];
					dst[dstOff++] = ((rgb & 0xFF00FF) * 128 + (dstRgb & 0xFF00FF) * 128 & 0xFF00FF00) + ((rgb & 0xFF00) * 128 + (dstRgb & 0xFF00) * 128 & 0xFF0000) >> 8;
				}
			}
			dstOff += dstStep;
			srcOff += srcStep;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII)V")
	public static void copyPixels(@OriginalArg(0) int[] dst, @OriginalArg(1) int[] src, @OriginalArg(3) int srcOff, @OriginalArg(4) int dstOff, @OriginalArg(5) int w, @OriginalArg(6) int h, @OriginalArg(7) int dstStep, @OriginalArg(8) int srcStep) {
		@Pc(4) int qw = -(w >> 2);
		@Pc(9) int w2 = -(w & 0x3);

		for (@Pc(12) int y = -h; y < 0; y++) {
			@Pc(21) int rgb;
			for (@Pc(15) int x = qw; x < 0; x++) {
				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
			}
			for (@Pc(77) int x = w2; x < 0; x++) {
				rgb = src[srcOff++];
				if (rgb == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = rgb;
				}
			}
			dstOff += dstStep;
			srcOff += srcStep;
		}
	}
}

package jagex2;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Pix8Static {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([I[B[IIIIIII)V")
	public static void copyPixels(@OriginalArg(0) int[] dst, @OriginalArg(1) byte[] src, @OriginalArg(2) int[] palette, @OriginalArg(3) int srcOff, @OriginalArg(4) int dstOff, @OriginalArg(5) int w, @OriginalArg(6) int arg6, @OriginalArg(7) int dstStep, @OriginalArg(8) int srcStep) {
		@Pc(4) int qw = -(w >> 2);
		@Pc(9) int w2 = -(w & 0x3);

		for (@Pc(12) int y = -arg6; y < 0; y++) {
			for (@Pc(15) int x = qw; x < 0; x++) {
				@Pc(21) byte palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = palette[palIndex & 0xFF];
				}
				palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = palette[palIndex & 0xFF];
				}
				palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = palette[palIndex & 0xFF];
				}
				palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = palette[palIndex & 0xFF];
				}
			}
			for (@Pc(93) int x = w2; x < 0; x++) {
				@Pc(99) byte palIndex = src[srcOff++];
				if (palIndex == 0) {
					dstOff++;
				} else {
					dst[dstOff++] = palette[palIndex & 0xFF];
				}
			}
			dstOff += dstStep;
			srcOff += srcStep;
		}
	}
}

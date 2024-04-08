package jagex2.graphics;

import jagex2.Pix8Static;
import jagex2.Static26;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Pix8 extends Draw2D {

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	public int cropY;

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "[B")
	public byte[] pixels;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
	public int cropX;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
	public int cropH;

	@OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
	public int cropW;

	@OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!qb", name = "cb", descriptor = "[I")
	public int[] palette;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Pix8() {
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III)V")
	private Pix8(@OriginalArg(0) int width, @OriginalArg(1) int height, @OriginalArg(2) int paletteCount) {
		this.cropW = this.width = width;
		this.cropH = this.height = height;
		this.cropX = this.cropY = 0;
		this.pixels = new byte[width * height];
		this.palette = new int[paletteCount];
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
	public void flipHorizontally() {
		@Pc(6) byte[] pixels = new byte[this.width * this.height];
		@Pc(8) int off = 0;
		for (@Pc(10) int y = 0; y < this.height; y++) {
			for (@Pc(16) int x = this.width - 1; x >= 0; x--) {
				pixels[off++] = this.pixels[x + y * this.width];
			}
		}
		this.pixels = pixels;
		this.cropX = this.cropW - this.width - this.cropX;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()Lclient!qb;")
	public Pix8 method1319() {
		@Pc(10) Pix8 pix = new Pix8(this.width, this.height, this.palette.length);
		pix.cropW = this.cropW;
		pix.cropH = this.cropH;
		pix.cropX = this.cropX;
		pix.cropY = this.cropY;
		@Pc(30) int local30 = this.pixels.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			pix.pixels[local32] = this.pixels[local32];
		}
		local30 = this.palette.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			pix.palette[local51] = this.palette[local51];
		}
		return pix;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	public void draw(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		x += this.cropX;
		y += this.cropY;
		@Pc(15) int distOff = x + y * Static26.width2d;
		@Pc(17) int srcOff = 0;
		@Pc(20) int h = this.height;
		@Pc(23) int w = this.width;
		@Pc(27) int dstStep = Static26.width2d - w;
		@Pc(29) int srcStep = 0;
		@Pc(36) int cutOff;

		if (y < Static26.top) {
			cutOff = Static26.top - y;
			h -= cutOff;
			y = Static26.top;
			srcOff = cutOff * w;
			distOff += cutOff * Static26.width2d;
		}
		if (y + h > Static26.bottom) {
			h -= y + h - Static26.bottom;
		}
		if (x < Static26.left) {
			cutOff = Static26.left - x;
			w -= cutOff;
			x = Static26.left;
			srcOff += cutOff;
			distOff += cutOff;
			srcStep = cutOff;
			dstStep += cutOff;
		}
		if (x + w > Static26.right) {
			cutOff = x + w - Static26.right;
			w -= cutOff;
			srcStep += cutOff;
			dstStep += cutOff;
		}
		if (w > 0 && h > 0) {
			Pix8Static.copyPixels(Static26.data, this.pixels, this.palette, srcOff, distOff, w, h, dstStep, srcStep);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public void translate(@OriginalArg(0) int r, @OriginalArg(1) int g, @OriginalArg(2) int b) {
		for (@Pc(1) int i = 0; i < this.palette.length; i++) {

			@Pc(11) int red = this.palette[i] >> 16 & 0xFF;
			red += r;
			if (red < 0) {
				red = 0;
			} else if (red > 255) {
				red = 255;
			}
			@Pc(34) int green = this.palette[i] >> 8 & 0xFF;
			green += g;
			if (green < 0) {
				green = 0;
			} else if (green > 255) {
				green = 255;
			}
			@Pc(55) int blue = this.palette[i] & 0xFF;
			blue += b;
			if (blue < 0) {
				blue = 0;
			} else if (blue > 255) {
				blue = 255;
			}
			this.palette[i] = (red << 16) + (green << 8) + blue;
		}
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "()V")
	public void flipVertically() {
		@Pc(6) byte[] pixels = new byte[this.width * this.height];
		@Pc(8) int off = 0;
		for (@Pc(13) int y = this.height - 1; y >= 0; y--) {
			for (@Pc(16) int x = 0; x < this.width; x++) {
				pixels[off++] = this.pixels[x + y * this.width];
			}
		}
		this.pixels = pixels;
		this.cropY = this.cropH - this.height - this.cropY;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "()V")
	public void crop() {
		if (this.width == this.cropW && this.height == this.cropH) {
			return;
		}
		@Pc(17) byte[] pixels = new byte[this.cropW * this.cropH];
		@Pc(19) int off = 0;
		for (@Pc(21) int y = 0; y < this.height; y++) {
			for (@Pc(24) int x = 0; x < this.width; x++) {
				pixels[x + this.cropX + (y + this.cropY) * this.cropW] = this.pixels[off++];
			}
		}
		this.pixels = pixels;
		this.width = this.cropW;
		this.height = this.cropH;
		this.cropX = 0;
		this.cropY = 0;
	}
}

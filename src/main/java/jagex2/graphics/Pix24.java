package jagex2.graphics;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

import jagex2.Static26;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Pix24 extends Draw2D {

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
	public int cropY;

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "[I")
	public int[] pixels;

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
	public int cropH;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
	public int cropX;

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
	public int cropW;

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
	public int width;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Pix24() {
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
	public Pix24(@OriginalArg(0) int width, @OriginalArg(1) int height) {
		this.pixels = new int[width * height];
		this.width = this.cropW = width;
		this.height = this.cropH = height;
		this.cropX = this.cropY = 0;
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Pix24(@OriginalArg(0) byte[] src, @OriginalArg(1) Component c) {
		try {
			@Pc(5) Image image = Toolkit.getDefaultToolkit().createImage(src);
			@Pc(10) MediaTracker tracker = new MediaTracker(c);
			tracker.addImage(image, 0);
			tracker.waitForAll();
			this.width = image.getWidth(c);
			this.height = image.getHeight(c);
			this.cropW = this.width;
			this.cropH = this.height;
			this.cropX = 0;
			this.cropY = 0;
			this.pixels = new int[this.width * this.height];
			@Pc(64) PixelGrabber grabber = new PixelGrabber(image, 0, 0, this.width, this.height, this.pixels, 0, this.width);
			grabber.grabPixels();
		} catch (@Pc(69) InterruptedException ignored) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII[I[I)V")
	public void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static26.width2d;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg8[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg9[local71]; local97 < 0; local97++) {
					Static26.data[local80++] = this.pixels[(local86 >> 16) + (local92 >> 16) * this.width];
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static26.width2d;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	public void drawAlpha(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		x += this.cropX;
		y += this.cropY;

		@Pc(15) int dstStep = x + y * Static26.width2d;
		@Pc(17) int srcStep = 0;
		@Pc(20) int h = this.height;
		@Pc(23) int w = this.width;
		@Pc(27) int dstoff = Static26.width2d - w;
		@Pc(29) int srcOff = 0;
		@Pc(36) int cutOff;

		if (y < Static26.top) {
			cutOff = Static26.top - y;
			h -= cutOff;
			y = Static26.top;
			srcStep = cutOff * w;
			dstStep += cutOff * Static26.width2d;
		}
		if (y + h > Static26.bottom) {
			h -= y + h - Static26.bottom;
		}
		if (x < Static26.left) {
			cutOff = Static26.left - x;
			w -= cutOff;
			x = Static26.left;
			srcStep += cutOff;
			dstStep += cutOff;
			srcOff = cutOff;
			dstoff += cutOff;
		}
		if (x + w > Static26.right) {
			cutOff = x + w - Static26.right;
			w -= cutOff;
			srcOff += cutOff;
			dstoff += cutOff;
		}
		if (w > 0 && h > 0) {
			Pix24Static.copyPixelsAlpha(Static26.data, this.pixels, srcStep, dstStep, w, h, dstoff, srcOff);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public void blitOpaque(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		x += this.cropX;
		y += this.cropY;

		@Pc(15) int dstOff = x + y * Static26.width2d;
		@Pc(17) int srcOff = 0;
		@Pc(20) int h = this.height;
		@Pc(23) int w = this.width;
		@Pc(27) int dstStep = Static26.width2d - w;
		@Pc(29) int srcStep = 0;
		@Pc(36) int cutoff;

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
		if (x < Static26.left) {
			cutoff = Static26.left - x;
			w -= cutoff;
			x = Static26.left;
			srcOff += cutoff;
			dstOff += cutoff;
			srcStep = cutoff;
			dstStep += cutoff;
		}
		if (x + w > Static26.right) {
			cutoff = x + w - Static26.right;
			w -= cutoff;
			srcStep += cutoff;
			dstStep += cutoff;
		}
		if (w > 0 && h > 0) {
			Pix24Static.copyPixelsAlt(Static26.data, this.pixels, srcOff, dstOff, w, h, dstStep, srcStep);
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()V")
	public void method1620() {
		if (this.width == this.cropW && this.height == this.cropH) {
			return;
		}
		@Pc(17) int[] pixels = new int[this.cropW * this.cropH];
		for (@Pc(19) int y = 0; y < this.height; y++) {
			for (@Pc(22) int x = 0; x < this.width; x++) {
				pixels[(y + this.cropY) * this.cropW + x + this.cropX] = this.pixels[y * this.width + x];
			}
		}
		this.pixels = pixels;
		this.width = this.cropW;
		this.height = this.cropH;
		this.cropX = 0;
		this.cropY = 0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	public void translate(@OriginalArg(0) int r, @OriginalArg(1) int g, @OriginalArg(2) int b) {
		for (@Pc(1) int i = 0; i < this.pixels.length; i++) {
			@Pc(7) int rgb = this.pixels[i];

			if (rgb != 0) {
				@Pc(15) int red = rgb >> 16 & 0xFF;
				red += r;
				if (red < 1) {
					red = 1;
				} else if (red > 255) {
					red = 255;
				}

				@Pc(36) int green = rgb >> 8 & 0xFF;
				green += g;
				if (green < 1) {
					green = 1;
				} else if (green > 255) {
					green = 255;
				}

				@Pc(55) int blue = rgb & 0xFF;
				blue += b;
				if (blue < 1) {
					blue = 1;
				} else if (blue > 255) {
					blue = 255;
				}
				this.pixels[i] = (red << 16) + (green << 8) + blue;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!qb;II)V")
	public void drawMasked(@OriginalArg(0) Pix8 mask, @OriginalArg(1) int x, @OriginalArg(2) int y) {
		x += this.cropX;
		y += this.cropY;

		@Pc(15) int dstOff = x + y * Static26.width2d;
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
			dstOff += cutOff * Static26.width2d;
		}
		if (y + h > Static26.bottom) {
			h -= y + h - Static26.bottom;
		}
		if (x < Static26.left) {
			cutOff = Static26.left - x;
			w -= cutOff;
			x = Static26.left;
			srcOff += cutOff;
			dstOff += cutOff;
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
			Pix24Static.copyPixelsMasked(Static26.data, this.pixels, srcOff, dstOff, w, h, dstStep, srcStep, mask.pixels);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIDI)V")
	public void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static26.width2d;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(68) int local68 = local63;
				@Pc(70) int local70 = local45;
				@Pc(72) int local72 = local57;
				for (@Pc(75) int local75 = -20; local75 < 0; local75++) {
					@Pc(90) int local90 = this.pixels[(local70 >> 16) + (local72 >> 16) * this.width];
					if (local90 == 0) {
						local68++;
					} else {
						Static26.data[local68++] = local90;
					}
					local70 += local33;
					local72 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static26.width2d;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public void draw(@OriginalArg(0) int x, @OriginalArg(1) int y) {
		x += this.cropX;
		y += this.cropY;

		@Pc(15) int dstOff = x + y * Static26.width2d;
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
			dstOff += cutOff * Static26.width2d;
		}
		if (y + h > Static26.bottom) {
			h -= y + h - Static26.bottom;
		}
		if (x < Static26.left) {
			cutOff = Static26.left - x;
			w -= cutOff;
			x = Static26.left;
			srcOff += cutOff;
			dstOff += cutOff;
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
			Pix24Static.copyPixels(Static26.data, this.pixels, srcOff, dstOff, w, h, dstStep, srcStep);
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "()V")
	public void bind() {
		Static26.bind(this.pixels, this.width, this.height);
	}
}

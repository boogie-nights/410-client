import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Pix24 extends Draw2D {

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
	public int anInt2441;

	@OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
	public int anInt2442;

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "[I")
	public int[] pixels;

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
	public int anInt2443;

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
	public int anInt2444;

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
	public int anInt2445;

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
	public int anInt2446;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIII)V", line = 67)
	public static void method1617(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(2) int local2 = -arg5; local2 < 0; local2++) {
			@Pc(9) int local9 = arg3 + arg4 - 3;
			while (arg3 < local9) {
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
				arg0[arg3++] = arg1[arg2++];
			}
			local9 += 3;
			while (arg3 < local9) {
				arg0[arg3++] = arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII[B)V", line = 478)
	public static void method1625(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(21) int local21;
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
			}
			for (@Pc(93) int local93 = local9; local93 < 0; local93++) {
				local21 = arg1[arg2++];
				if (local21 != 0 && arg8[arg3] == 0) {
					arg0[arg3++] = local21;
				} else {
					arg3++;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIIII)V", line = 542)
	public static void method1626(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
			for (@Pc(10) int local10 = -arg4; local10 < 0; local10++) {
				@Pc(16) int local16 = arg1[arg2++];
				if (local16 == 0) {
					arg3++;
				} else {
					@Pc(22) int local22 = arg0[arg3];
					arg0[arg3++] = ((local16 & 0xFF00FF) * 128 + (local22 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local16 & 0xFF00) * 128 + (local22 & 0xFF00) * 128 & 0xFF0000) >> 8;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([I[IIIIIIII)V", line = 577)
	public static void method1627(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(21) int local21;
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
			}
			for (@Pc(77) int local77 = local9; local77 < 0; local77++) {
				local21 = arg1[arg2++];
				if (local21 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local21;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII[I[I)V", line = 14)
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
			@Pc(69) int local69 = arg0 + arg1 * Static25.anInt2440;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg8[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg9[local71]; local97 < 0; local97++) {
					Static25.anIntArray533[local80++] = this.pixels[(local86 >> 16) + (local92 >> 16) * this.anInt2446];
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static25.anInt2440;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V", line = 94)
	public void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2444;
		arg1 += this.anInt2441;
		@Pc(15) int local15 = arg0 + arg1 * Static25.anInt2440;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2442;
		@Pc(23) int local23 = this.anInt2446;
		@Pc(27) int local27 = Static25.anInt2440 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Draw2D.anInt2439) {
			local36 = Draw2D.anInt2439 - arg1;
			local20 -= local36;
			arg1 = Draw2D.anInt2439;
			local17 = local36 * local23;
			local15 += local36 * Static25.anInt2440;
		}
		if (arg1 + local20 > Draw2D.anInt2438) {
			local20 -= arg1 + local20 - Draw2D.anInt2438;
		}
		if (arg0 < Draw2D.anInt2437) {
			local36 = Draw2D.anInt2437 - arg0;
			local23 -= local36;
			arg0 = Draw2D.anInt2437;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Draw2D.anInt2436) {
			local36 = arg0 + local23 - Draw2D.anInt2436;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			method1626(Static25.anIntArray533, this.pixels, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 150)
	public void method1619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2444;
		arg1 += this.anInt2441;
		@Pc(15) int local15 = arg0 + arg1 * Static25.anInt2440;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2442;
		@Pc(23) int local23 = this.anInt2446;
		@Pc(27) int local27 = Static25.anInt2440 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Draw2D.anInt2439) {
			local36 = Draw2D.anInt2439 - arg1;
			local20 -= local36;
			arg1 = Draw2D.anInt2439;
			local17 = local36 * local23;
			local15 += local36 * Static25.anInt2440;
		}
		if (arg1 + local20 > Draw2D.anInt2438) {
			local20 -= arg1 + local20 - Draw2D.anInt2438;
		}
		if (arg0 < Draw2D.anInt2437) {
			local36 = Draw2D.anInt2437 - arg0;
			local23 -= local36;
			arg0 = Draw2D.anInt2437;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Draw2D.anInt2436) {
			local36 = arg0 + local23 - Draw2D.anInt2436;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			method1617(Static25.anIntArray533, this.pixels, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "()V", line = 206)
	public void method1620() {
		if (this.anInt2446 == this.anInt2445 && this.anInt2442 == this.anInt2443) {
			return;
		}
		@Pc(17) int[] local17 = new int[this.anInt2445 * this.anInt2443];
		for (@Pc(19) int local19 = 0; local19 < this.anInt2442; local19++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2446; local22++) {
				local17[(local19 + this.anInt2441) * this.anInt2445 + local22 + this.anInt2444] = this.pixels[local19 * this.anInt2446 + local22];
			}
		}
		this.pixels = local17;
		this.anInt2446 = this.anInt2445;
		this.anInt2442 = this.anInt2443;
		this.anInt2444 = 0;
		this.anInt2441 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V", line = 238)
	public void method1621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.pixels.length; local1++) {
			@Pc(7) int local7 = this.pixels[local1];
			if (local7 != 0) {
				@Pc(15) int local15 = local7 >> 16 & 0xFF;
				local15 += arg0;
				if (local15 < 1) {
					local15 = 1;
				} else if (local15 > 255) {
					local15 = 255;
				}
				@Pc(36) int local36 = local7 >> 8 & 0xFF;
				local36 += arg1;
				if (local36 < 1) {
					local36 = 1;
				} else if (local36 > 255) {
					local36 = 255;
				}
				@Pc(55) int local55 = local7 & 0xFF;
				local55 += arg2;
				if (local55 < 1) {
					local55 = 1;
				} else if (local55 > 255) {
					local55 = 255;
				}
				this.pixels[local1] = (local15 << 16) + (local36 << 8) + local55;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!qb;II)V", line = 294)
	public void method1622(@OriginalArg(0) Pix8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg1 += this.anInt2444;
		arg2 += this.anInt2441;
		@Pc(15) int local15 = arg1 + arg2 * Static25.anInt2440;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2442;
		@Pc(23) int local23 = this.anInt2446;
		@Pc(27) int local27 = Static25.anInt2440 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg2 < Draw2D.anInt2439) {
			local36 = Draw2D.anInt2439 - arg2;
			local20 -= local36;
			arg2 = Draw2D.anInt2439;
			local17 = local36 * local23;
			local15 += local36 * Static25.anInt2440;
		}
		if (arg2 + local20 > Draw2D.anInt2438) {
			local20 -= arg2 + local20 - Draw2D.anInt2438;
		}
		if (arg1 < Draw2D.anInt2437) {
			local36 = Draw2D.anInt2437 - arg1;
			local23 -= local36;
			arg1 = Draw2D.anInt2437;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg1 + local23 > Draw2D.anInt2436) {
			local36 = arg1 + local23 - Draw2D.anInt2436;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			method1625(Static25.anIntArray533, this.pixels, local17, local15, local23, local20, local27, local29, arg0.aByteArray16);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIDI)V", line = 357)
	public void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static25.anInt2440;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(68) int local68 = local63;
				@Pc(70) int local70 = local45;
				@Pc(72) int local72 = local57;
				for (@Pc(75) int local75 = -20; local75 < 0; local75++) {
					@Pc(90) int local90 = this.pixels[(local70 >> 16) + (local72 >> 16) * this.anInt2446];
					if (local90 == 0) {
						local68++;
					} else {
						Static25.anIntArray533[local68++] = local90;
					}
					local70 += local33;
					local72 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static25.anInt2440;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V", line = 422)
	public void draw(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2444;
		arg1 += this.anInt2441;
		@Pc(15) int local15 = arg0 + arg1 * Static25.anInt2440;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2442;
		@Pc(23) int local23 = this.anInt2446;
		@Pc(27) int local27 = Static25.anInt2440 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Draw2D.anInt2439) {
			local36 = Draw2D.anInt2439 - arg1;
			local20 -= local36;
			arg1 = Draw2D.anInt2439;
			local17 = local36 * local23;
			local15 += local36 * Static25.anInt2440;
		}
		if (arg1 + local20 > Draw2D.anInt2438) {
			local20 -= arg1 + local20 - Draw2D.anInt2438;
		}
		if (arg0 < Draw2D.anInt2437) {
			local36 = Draw2D.anInt2437 - arg0;
			local23 -= local36;
			arg0 = Draw2D.anInt2437;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Draw2D.anInt2436) {
			local36 = arg0 + local23 - Draw2D.anInt2436;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			method1627(Static25.anIntArray533, this.pixels, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 636)
	public Pix24() {
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V", line = 638)
	public Pix24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.pixels = new int[arg0 * arg1];
		this.anInt2446 = this.anInt2445 = arg0;
		this.anInt2442 = this.anInt2443 = arg1;
		this.anInt2444 = this.anInt2441 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "()V", line = 645)
	public void method1628() {
		Static25.method1604(this.pixels, this.anInt2446, this.anInt2442);
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([BLjava/awt/Component;)V", line = 649)
	public Pix24(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(5) Image local5 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(10) MediaTracker local10 = new MediaTracker(arg1);
			local10.addImage(local5, 0);
			local10.waitForAll();
			this.anInt2446 = local5.getWidth(arg1);
			this.anInt2442 = local5.getHeight(arg1);
			this.anInt2445 = this.anInt2446;
			this.anInt2443 = this.anInt2442;
			this.anInt2444 = 0;
			this.anInt2441 = 0;
			this.pixels = new int[this.anInt2446 * this.anInt2442];
			@Pc(64) PixelGrabber local64 = new PixelGrabber(local5, 0, 0, this.anInt2446, this.anInt2442, this.pixels, 0, this.anInt2446);
			local64.grabPixels();
		} catch (@Pc(69) InterruptedException local69) {
		}
	}
}

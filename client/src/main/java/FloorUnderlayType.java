import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class FloorUnderlayType extends Hashable {

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!qc;")
	public static LruCache cache = new LruCache(64);

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!ud;")
	public static Js5Index config;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
	public int lightness;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
	public int saturation;

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
	public int luminance;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
	public int chroma;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
	private int rgb = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!vc;", line = 107)
	public static FloorUnderlayType get(@OriginalArg(1) int arg0) {
		@Pc(6) FloorUnderlayType local6 = (FloorUnderlayType) cache.get((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = config.fetchFile(arg0, 1);
		local6 = new FloorUnderlayType();
		if (local25 != null) {
			local6.decode(new Packet(local25), arg0);
		}
		local6.postDecode();
		cache.put((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ud;B)V", line = 63)
	public static void method117(@OriginalArg(0) Js5Index arg0) {
		config = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBLclient!eb;)V", line = 128)
	private void decode(@OriginalArg(0) int id, @OriginalArg(1) int code, @OriginalArg(3) Packet buf) {
		if (code == 1) {
			this.rgb = buf.g3();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!eb;II)V", line = 145)
	public void decode(@OriginalArg(0) Packet buf, @OriginalArg(2) int id) {
		while (true) {
			@Pc(9) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(id, code, buf);
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 176)
	public void postDecode() {
		this.setColour(this.rgb);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 190)
	private void setColour(@OriginalArg(1) int rgb) {
		@Pc(12) double blue = (double) (rgb & 0xFF) / 256.0D;
		@Pc(21) double green = (double) (rgb >> 8 & 0xFF) / 256.0D;
		@Pc(30) double red = (double) (rgb >> 16 & 0xFF) / 256.0D;

		@Pc(32) double min = red;
		if (green < red) {
			min = green;
		}
		if (min > blue) {
			min = blue;
		}

		@Pc(46) double max = red;
		if (red < green) {
			max = green;
		}
		if (blue > max) {
			max = blue;
		}

		@Pc(48) double h = 0.0D;
		@Pc(63) double s = 0.0D;
		@Pc(69) double l = (min + max) / 2.0D;
		if (min != max) {
			if (l < 0.5D) {
				s = (max - min) / (min + max);
			}
			if (l >= 0.5D) {
				s = (max - min) / (2.0D - max - min);
			}

			if (red == max) {
				h = (green - blue) / (max - min);
			} else if (max == green) {
				h = (blue - red) / (max - min) + 2.0D;
			} else if (blue == max) {
				h = (red - green) / (-min + max) + 4.0D;
			}
		}

		h /= 6.0D;

		this.lightness = (int) (l * 256.0D);
		this.saturation = (int) (s * 256.0D);

		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (l > 0.5D) {
			this.luminance = (int) (s * 512.0D * (1.0D - l));
		} else {
			this.luminance = (int) (s * 512.0D * l);
		}

		if (this.luminance < 1) {
			this.luminance = 1;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

		this.chroma = (int) ((double) this.luminance * h);
	}
}

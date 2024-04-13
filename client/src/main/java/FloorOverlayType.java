import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class FloorOverlayType extends Hashable {

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Lclient!qc;")
	public static LruCache cache = new LruCache(64);
	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ud;")
	public static Js5Index config;
	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	public int averageLightness;

	@OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
	public int saturation;

	@OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
	public int averageHue;

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
	public int hue;

	@OriginalMember(owner = "client!ec", name = "ob", descriptor = "I")
	public int averageSaturation;

	@OriginalMember(owner = "client!ec", name = "tb", descriptor = "I")
	public int lightness;

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
	public int texture = -1;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
	public int rgb = 0;

	@OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
	public int averageColour = -1;

	@OriginalMember(owner = "client!ec", name = "rb", descriptor = "Z")
	public boolean occlude = true;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!ec;", line = 234)
    public static FloorOverlayType get(@OriginalArg(0) int id) {
        @Pc(10) FloorOverlayType local10 = (FloorOverlayType) cache.get((long) id);
        if (local10 != null) {
            return local10;
        }
        @Pc(28) byte[] buf = config.fetchFile(id, 4);
        local10 = new FloorOverlayType();
        if (buf != null) {
            local10.decode(new Packet(buf), id);
        }
        local10.postDecode();
        cache.put((long) id, local10);
        return local10;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 49)
    public static void clear() {
        cache.clear();
    }

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ud;)V", line = 861)
	public static void load(@OriginalArg(1) Js5Index arg0) {
		config = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILclient!eb;I)V", line = 29)
	private void decode(@OriginalArg(1) int code, @OriginalArg(2) Packet buf, @OriginalArg(3) int id) {
		if (code == 1) {
			this.rgb = buf.g3();
		} else if (code == 2) {
			this.texture = buf.g1();
		} else if (code == 5) {
			this.occlude = false;
		} else if (code == 7) {
			this.averageColour = buf.g3();
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 66)
	public void postDecode() {
		if (this.averageColour != -1) {
			this.setColor(this.averageColour);
			this.averageSaturation = this.saturation;
			this.averageLightness = this.lightness;
			this.averageHue = this.hue;
		}
		this.setColor(this.rgb);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!eb;BI)V", line = 212)
	public void decode(@OriginalArg(0) Packet buf, @OriginalArg(2) int id) {
		while (true) {
			@Pc(14) int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(code, buf, id);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V", line = 234)
	private void setColor(@OriginalArg(1) int rgb) {
		@Pc(31) double red = (double) (rgb >> 16 & 0xFF) / 256.0D;
		@Pc(10) double green = (double) (rgb >> 8 & 0xFF) / 256.0D;
		@Pc(38) double blue = (double) (rgb & 0xFF) / 256.0D;

		@Pc(40) double min = red;
		if (green < red) {
			min = green;
		}
		if (min > blue) {
			min = blue;
		}

		@Pc(56) double max = red;
		if (red < green) {
			max = green;
		}
		if (max < blue) {
			max = blue;
		}

		@Pc(54) double h = 0.0D;
		@Pc(70) double s = 0.0D;
		@Pc(76) double l = (max + min) / 2.0D;
		if (min != max) {
			if (l < 0.5D) {
				s = (max - min) / (max + min);
			}
			if (l >= 0.5D) {
				s = (max - min) / (2.0D - max - min);
			}

			if (red == max) {
				h = (green - blue) / (max - min);
			} else if (max == green) {
				h = (blue - red) / (max - min) + 2.0D;
			} else if (max == blue) {
				h = (red - green) / (max - min) + 4.0D;
			}
		}

		h /= 6.0D;

		this.hue = (int) (h * 256.0D);
		this.saturation = (int) (s * 256.0D);
		this.lightness = (int) (l * 256.0D);

		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
	}
}

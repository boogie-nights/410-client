import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!p;")
	public static PixMap aClass45_5;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 42)
	public static void method183() {
		if (Static72.aClass24_1 != null) {
			Static72.aClass24_1.method1656();
			Static72.aClass24_1 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIII)I", line = 334)
	public static int method189(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 389)
	public static void method191() {
		Static1.BASE37_LOOKUP = null;
		JagString.aClass40_60 = null;
		JagString.aClass40_61 = null;
		aClass45_5 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!eb;)Lclient!o;", line = 401)
	public static JagString method192(@OriginalArg(1) Packet arg0) {
		return Static17.method360(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ud;II)[Lclient!qb;", line = 454)
	public static Pix8[] method194(@OriginalArg(0) int arg0, @OriginalArg(1) Js5Index arg1, @OriginalArg(2) int arg2) {
		return Static84.method1484(arg0, arg1, arg2) ? Static88.method1555() : null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V", line = 522)
	public static void method196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = arg2; local11 <= arg2 + arg0; local11++) {
			for (@Pc(15) int local15 = arg3; local15 <= arg3 + arg1; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					World.levelShademap[0][local15][local11] = 127;
					if (arg3 == local15 && local15 > 0) {
						World.levelHeightmap[0][local15][local11] = World.levelHeightmap[0][local15 - 1][local11];
					}
					if (local15 == arg3 + arg1 && local15 < 103) {
						World.levelHeightmap[0][local15][local11] = World.levelHeightmap[0][local15 + 1][local11];
					}
					if (arg2 == local11 && local11 > 0) {
						World.levelHeightmap[0][local15][local11] = World.levelHeightmap[0][local15][local11 - 1];
					}
					if (local11 == arg0 + arg2 && local11 < 103) {
						World.levelHeightmap[0][local15][local11] = World.levelHeightmap[0][local15][local11 + 1];
					}
				}
			}
		}
	}
}

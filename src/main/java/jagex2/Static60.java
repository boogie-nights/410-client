package jagex2;

import jagex2.config.ObjType;
import jagex2.graphics.Draw3D;
import jagex2.graphics.Model;
import jagex2.graphics.Pix24;
import jagex2.graphics.Static6;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[[[B")
	public static byte[][][] levelShademap;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public static int anInt1510 = 0;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_431 = Static13.method257("@bla@ from: @red@");

	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	public static final int anInt1519 = 3353893;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_432 = Static13.method257("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!le", name = "w", descriptor = "Lclient!o;")
	public static Class40 aClass40_433 = Static13.method257("headicons_prayer");

	@OriginalMember(owner = "client!le", name = "x", descriptor = "Lclient!o;")
	public static Class40 aClass40_434 = Static13.method257("Loading title screen )2 ");

	@OriginalMember(owner = "client!le", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_435 = Static13.method257("Icons redrawn");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method998() {
		Static80.out.p1isaac(255);
		if (Static66.anInt1654 != -1) {
			Static83.method1350(Static66.anInt1654);
			Static33.redrawSidebar = true;
			Static20.aBoolean40 = false;
			Static22.aBoolean184 = true;
			Static66.anInt1654 = -1;
		}
		if (Static85.anInt1994 != -1) {
			Static83.method1350(Static85.anInt1994);
			Static20.aBoolean40 = false;
			Static85.anInt1994 = -1;
			Static73.redrawChatback = true;
		}
		if (Static84.anInt1971 != -1) {
			Static83.method1350(Static84.anInt1971);
			Static84.anInt1971 = -1;
			Static7.method187(30);
		}
		if (Static93.anInt2175 != -1) {
			Static83.method1350(Static93.anInt2175);
			Static93.anInt2175 = -1;
		}
		if (Static22.anInt2585 != -1) {
			Static83.method1350(Static22.anInt2585);
			Static22.anInt2585 = -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Lclient!vb;")
	public static Pix24 method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int count, @OriginalArg(2) int arg2) {
		@Pc(14) Pix24 icon;
		if (arg0 == 0) {
			icon = (Pix24) Static25.aClass47_7.get((long) arg2);
			if (icon != null && icon.cropH != count && icon.cropH != -1) {
				icon.unlink();
				icon = null;
			}
			if (icon != null) {
				return icon;
			}
		}
		@Pc(40) ObjType obj = Static105.get(arg2);
		if (obj.countobj == null) {
			count = -1;
		}
		if (count > 1) {
			@Pc(57) int local57 = -1;
			for (@Pc(59) int local59 = 0; local59 < 10; local59++) {
				if (count >= obj.countco[local59] && obj.countco[local59] != 0) {
					local57 = obj.countobj[local59];
				}
			}
			if (local57 != -1) {
				obj = Static105.get(local57);
			}
		}
		@Pc(101) Model local101 = obj.method713(1, true);
		if (local101 == null) {
			return null;
		}
		@Pc(107) Pix24 local107 = null;
		if (obj.certTemplate != -1) {
			local107 = method1000(-1, 10, obj.certlink);
			if (local107 == null) {
				return null;
			}
		}
		@Pc(125) int[] local125 = Static6.method167();
		@Pc(127) int local127 = Static26.width2d;
		@Pc(129) int[] local129 = Static26.data;
		@Pc(131) int local131 = Static26.anInt2435;
		@Pc(133) int local133 = Static26.left;
		@Pc(135) int local135 = Static26.top;
		@Pc(137) int local137 = Static26.right;
		@Pc(139) int local139 = Static26.bottom;
		icon = new Pix24(32, 32);
		Static26.bind(icon.pixels, 32, 32);
		Static46.anIntArray536 = Static6.method175(Static46.anIntArray536);
		Static26.method1612(0, 0, 32, 32, 0);
		Static6.jagged = false;
		@Pc(164) int local164 = obj.zoom2d;
		if (arg0 == -1) {
			local164 = (int) ((double) local164 * 1.5D);
		}
		if (arg0 > 0) {
			local164 = (int) ((double) local164 * 1.04D);
		}
		@Pc(193) int y = Draw3D.cos[obj.xan2d] * local164 >> 16;
		@Pc(202) int local202 = local164 * Draw3D.sin[obj.xan2d] >> 16;
		local101.method1135();
		local101.method1151(obj.yan2d, obj.zan2d, obj.xan2d, obj.xoff2d, local202 + local101.maxY / 2 + obj.yoff2d, y + obj.yoff2d);
		for (@Pc(230) int local230 = 31; local230 >= 0; local230--) {
			for (y = 31; y >= 0; y--) {
				if (icon.pixels[y * 32 + local230] == 0) {
					if (local230 > 0 && icon.pixels[y * 32 + local230 - 1] > 1) {
						icon.pixels[y * 32 + local230] = 1;
					} else if (y > 0 && icon.pixels[y * 32 + local230 - 32] > 1) {
						icon.pixels[y * 32 + local230] = 1;
					} else if (local230 < 31 && icon.pixels[local230 + y * 32 + 1] > 1) {
						icon.pixels[y * 32 + local230] = 1;
					} else if (y < 31 && icon.pixels[local230 + y * 32 + 32] > 1) {
						icon.pixels[y * 32 + local230] = 1;
					}
				}
			}
		}
		@Pc(379) int x;
		if (arg0 > 0) {
			for (x = 31; x >= 0; x--) {
				for (y = 31; y >= 0; y--) {
					if (icon.pixels[x + y * 32] == 0) {
						if (x > 0 && icon.pixels[y * 32 + x - 1] == 1) {
							icon.pixels[x + y * 32] = arg0;
						} else if (y > 0 && icon.pixels[(y - 1) * 32 + x] == 1) {
							icon.pixels[y * 32 + x] = arg0;
						} else if (x < 31 && icon.pixels[y * 32 + x + 1] == 1) {
							icon.pixels[y * 32 + x] = arg0;
						} else if (y < 31 && icon.pixels[y * 32 + x + 32] == 1) {
							icon.pixels[y * 32 + x] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (x = 31; x >= 0; x--) {
				for (y = 31; y >= 0; y--) {
					if (icon.pixels[y * 32 + x] == 0 && x > 0 && y > 0 && icon.pixels[x + y * 32 - 1 - 32] > 0) {
						icon.pixels[x + y * 32] = 3153952;
					}
				}
			}
		}
		if (obj.certTemplate != -1) {
			x = local107.cropW;
			@Pc(586) int local586 = local107.cropH;
			local107.cropH = 32;
			local107.cropW = 32;
			local107.draw(0, 0);
			local107.cropH = local586;
			local107.cropW = x;
		}
		if (arg0 == 0) {
			Static25.aClass47_7.put((long) arg2, icon);
		}
		Static26.bind(local129, local127, local131);
		Static26.method1613(local133, local135, local137, local139);
		Static6.method175(local125);
		Static6.jagged = true;
		if (obj.stackable) {
			icon.cropW = 33;
		} else {
			icon.cropW = 32;
		}
		icon.cropH = count;
		return icon;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method1003() {
		aClass40_431 = null;
		levelShademap = null;
		aClass40_434 = null;
		aClass40_435 = null;
		aClass40_432 = null;
		aClass40_433 = null;
	}
}

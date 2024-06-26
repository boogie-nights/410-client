package jagex2;

import jagex2.dash3d.entity.NpcEntity;
import jagex2.dash3d.entity.PathingEntity;
import jagex2.dash3d.entity.PlayerEntity;
import jagex2.datastruct.LruCache;
import jagex2.graphics.PixMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!p;")
	public static PixMap aClass45_22;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!qd;")
	public static Class48 aClass48_6;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!p;")
	public static PixMap areaMapBack;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!p;")
	public static PixMap pixMap;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_445 = Static13.method257("");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_444 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!o;")
	public static Class40 textStartingGameEngine = Static13.method257("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_447 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "Lclient!o;")
	public static Class40 reportAbuseInput = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_449 = Static13.method257("Use @lre@");

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public static int anInt1548 = -1;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_450 = Static13.method257("glow2:");

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!qc;")
	public static LruCache aClass47_14 = new LruCache(64);

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!o;")
	public static Class40 chatTyped = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_452 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_453 = aClass40_445;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public static int anInt1550 = 0;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "[[[B")
	public static byte[][][] levelTileFlags = new byte[4][104][104];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void logout() {
		if (Static70.stream != null) {
			Static70.stream.method730();
		}
		Static70.stream = null;
		Static48.method820();
		Static93.scene.reset();
		for (@Pc(22) int level = 0; level < 4; level++) {
			Static79.levelCollisionMap[level].reset();
		}
		System.gc();
		Static94.method1490();
		Static20.anInt470 = 0;
		Static84.anInt1977 = -1;
		Static7.method187(10);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method1040(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt2285 == 0) {
			return;
		}
		@Pc(39) int local39;
		@Pc(32) int local32;
		if (arg0.anInt2324 != -1 && arg0.anInt2324 < 32768) {
			@Pc(23) NpcEntity local23 = Static2.npcs[arg0.anInt2324];
			if (local23 != null) {
				local32 = arg0.z - local23.z;
				local39 = arg0.x - local23.x;
				if (local39 != 0 || local32 != 0) {
					arg0.anInt2283 = (int) (Math.atan2((double) local39, (double) local32) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2324 >= 32768) {
			local67 = arg0.anInt2324 - 32768;
			if (local67 == Static83.localPid) {
				local67 = 2047;
			}
			@Pc(76) PlayerEntity local76 = Static100.players[local67];
			if (local76 != null) {
				local32 = arg0.x - local76.x;
				@Pc(91) int local91 = arg0.z - local76.z;
				if (local32 != 0 || local91 != 0) {
					arg0.anInt2283 = (int) (Math.atan2((double) local32, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2280 != 0 || arg0.anInt2292 != 0) && (arg0.anInt2309 == 0 || arg0.anInt2282 > 0)) {
			local39 = arg0.z - (arg0.anInt2292 - Static30.anInt725 - Static30.anInt725) * 64;
			local67 = arg0.x - (arg0.anInt2280 - Static87.anInt2058 - Static87.anInt2058) * 64;
			if (local67 != 0 || local39 != 0) {
				arg0.anInt2283 = (int) (Math.atan2((double) local67, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt2280 = 0;
			arg0.anInt2292 = 0;
		}
		local67 = arg0.anInt2283 - arg0.anInt2305 & 0x7FF;
		if (local67 == 0) {
			return;
		}
		if (local67 < arg0.anInt2285 || local67 > 2048 - arg0.anInt2285) {
			arg0.anInt2305 = arg0.anInt2283;
		} else if (local67 > 1024) {
			arg0.anInt2305 -= arg0.anInt2285;
		} else {
			arg0.anInt2305 += arg0.anInt2285;
		}
		arg0.anInt2305 &= 0x7FF;
		if (arg0.anInt2318 != arg0.anInt2290 || arg0.anInt2305 == arg0.anInt2283) {
			return;
		}
		if (arg0.anInt2276 == -1) {
			arg0.anInt2318 = arg0.anInt2269;
			return;
		}
		arg0.anInt2318 = arg0.anInt2276;
		return;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method1041() {
		aClass45_22 = null;
		aClass40_449 = null;
		aClass40_444 = null;
		textStartingGameEngine = null;
		aClass40_452 = null;
		chatTyped = null;
		aClass40_445 = null;
		levelTileFlags = null;
		aClass40_447 = null;
		reportAbuseInput = null;
		aClass47_14 = null;
		aClass40_450 = null;
		areaMapBack = null;
		aClass48_6 = null;
		pixMap = null;
		aClass40_453 = null;
	}
}

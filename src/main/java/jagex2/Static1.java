package jagex2;

import java.util.Calendar;
import java.util.Date;

import jagex2.dash3d.entity.PathingEntity;
import jagex2.dash3d.entity.SpotAnimEntity;
import jagex2.graphics.PixMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int currentLevel;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public static int anInt16;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!p;")
	public static PixMap aClass45_1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	public static volatile boolean clearScreen = true;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!o;")
	public static Class40 textHasLoggedOut = Static13.method257(" has logged out)3");

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public static int anInt10 = 0;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_2 = Static13.method257("Enter message to send to ");

	@OriginalMember(owner = "client!a", name = "s", descriptor = "J")
	public static long aLong1 = 0L;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	public static int anInt14 = 0;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_3 = Static13.method257("redstone1");

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Z")
	public static boolean lowMemory = false;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "Lclient!o;")
	public static Class40 textFriendsChatColon = Static13.method257(": ");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lclient!o;")
	public static Class40 method1(@OriginalArg(1) int arg0) {
		if (arg0 > Static86.anInt2035 + 10) {
			return Static17.aClass40_115;
		}
		@Pc(17) long local17 = ((long) arg0 + 11745L) * 86400000L;
		@Pc(19) Calendar local19 = Calendar.getInstance();
		local19.setTime(new Date(local17));
		@Pc(29) int local29 = local19.get(5);
		@Pc(38) int local38 = local19.get(2);
		@Pc(42) int local42 = local19.get(1);
		@Pc(93) Class40[] local93 = new Class40[] { Static98.aClass40_679, Static97.aClass40_670, Static54.aClass40_396, Static94.aClass40_633, Static38.aClass40_291, Static22.aClass40_738, Static11.aClass40_70, Static99.aClass40_24, Static102.aClass40_712, Static94.aClass40_630, Static42.aClass40_320, Static35.aClass40_255 };
		return Static80.method1334(new Class40[] { Static53.method859(local29), Static55.aClass40_409, local93[local38], Static55.aClass40_409, Static53.method859(local42) });
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	public static boolean method2(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void pushSpotanims() {
		for (@Pc(10) SpotAnimEntity entity = (SpotAnimEntity) Static96.spotanims.peekFront(); entity != null; entity = (SpotAnimEntity) Static96.spotanims.prev()) {
			if (entity.level != currentLevel || entity.seqComplete) {
				entity.unlink();
			} else if (Static107.loopCycle >= entity.startCycle) {
				entity.update(Static45.sceneDelta);
				if (entity.seqComplete) {
					entity.unlink();
				} else {
					Static93.scene.addTemporary(entity.level, entity.x, entity.z, entity.anInt2223, 60, entity, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ke;Z)V")
	public static void method4(@OriginalArg(0) PathingEntity arg0) {
		if (arg0.anInt2297 == Static107.loopCycle || arg0.primarySeqId == -1 || arg0.anInt2313 != 0 || arg0.anInt2267 + 1 > Static62.method1042(arg0.primarySeqId).anIntArray128[arg0.anInt2316]) {
			@Pc(38) int local38 = arg0.anInt2297 - arg0.anInt2277;
			@Pc(44) int local44 = Static107.loopCycle - arg0.anInt2277;
			@Pc(54) int local54 = arg0.size * 64 + arg0.anInt2321 * 128;
			@Pc(64) int local64 = arg0.size * 64 + arg0.anInt2311 * 128;
			@Pc(74) int local74 = arg0.anInt2286 * 128 + arg0.size * 64;
			@Pc(84) int local84 = arg0.size * 64 + arg0.anInt2317 * 128;
			arg0.x = ((local38 - local44) * local84 + local64 * local44) / local38;
			arg0.z = ((local38 - local44) * local54 + local74 * local44) / local38;
		}
		arg0.anInt2282 = 0;
		if (arg0.anInt2314 == 0) {
			arg0.anInt2283 = 1024;
		}
		if (arg0.anInt2314 == 1) {
			arg0.anInt2283 = 1536;
		}
		if (arg0.anInt2314 == 2) {
			arg0.anInt2283 = 0;
		}
		if (arg0.anInt2314 == 3) {
			arg0.anInt2283 = 512;
		}
		arg0.anInt2305 = arg0.anInt2283;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method5() {
		aClass40_3 = null;
		aClass40_2 = null;
		aClass45_1 = null;
		anIntArray1 = null;
		textFriendsChatColon = null;
		textHasLoggedOut = null;
	}
}

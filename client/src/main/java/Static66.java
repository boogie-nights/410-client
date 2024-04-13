import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!o", name = "F", descriptor = "[I")
	public static int[] anIntArray406;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_22;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 209)
	public static void method1170() {
		anIntArray406 = null;
		JagString.aClass40_509 = null;
		JagString.aClass40_508 = null;
		JagString.aClass40_507 = null;
		JagString.aClass40_510 = null;
		JagString.aClass40_506 = null;
		JagString.aClass40_505 = null;
		aClass5_22 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lclient!o;", line = 301)
	public static JagString method1172(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static48.method859(arg0);
		} else if (arg0 < 10000000) {
			return JagString.concatenate(new JagString[] { Static48.method859(arg0 / 1000), JagString.aClass40_669 });
		} else {
			return JagString.concatenate(new JagString[] { Static48.method859(arg0 / 1000000), JagString.aClass40_160 });
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIBZZ)Lclient!ad;", line = 945)
	public static Js5 method1188(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Cache local10 = null;
		if (Static61.cacheDat != null) {
			local10 = new Cache(arg1, Static61.cacheDat, Static1.cacheIndex[arg1], 1000000);
		}
		return new Js5(local10, Static68.masterCache, arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(III)I", line = 1044)
	public static int method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V", line = 1192)
	public static void method1197() {
		for (@Pc(7) int local7 = -1; local7 < client.playerCount; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = client.playerIds[local7];
			}
			@Pc(25) PlayerEntity local25 = client.players[local17];
			if (local25 != null) {
				Static83.method1468(local25, 1);
			}
		}
	}
}

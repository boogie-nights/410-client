import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt971;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!o;I)Z", line = 130)
	public static boolean method729(@OriginalArg(0) JagString arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < client.friendCount; local18++) {
			if (arg0.method1199(client.friendName[local18])) {
				return true;
			}
		}
		return arg0.method1199(client.localPlayer.name);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!ud;II)Lclient!vb;", line = 364)
	public static Pix24 method732(@OriginalArg(1) Js5Index arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static84.method1484(arg2, arg0, arg1) ? Static76.method1361() : null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 402)
	public static void method733() {
		JagString.aClass40_291 = null;
		JagString.aClass40_294 = null;
		JagString.aClass40_293 = null;
		JagString.aClass40_292 = null;
		Static1.aClass33_1 = null;
	}
}

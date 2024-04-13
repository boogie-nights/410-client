import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
	public static int anInt1960;

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
	public static int anInt1963;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_20;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZIII)Lclient!o;", line = 18)
	public static JagString method1347(@OriginalArg(2) int arg0) {
		@Pc(5) int local5 = 1;
		@Pc(17) int local17 = arg0 / 10;
		while (local17 != 0) {
			local17 /= 10;
			local5++;
		}
		@Pc(30) int local30 = local5;
		if (arg0 < 0) {
			local30 = local5 + 1;
		}
		@Pc(38) byte[] local38 = new byte[local30];
		if (arg0 < 0) {
			local38[0] = 45;
		}
		for (@Pc(56) int local56 = 0; local56 < local5; local56++) {
			@Pc(61) int local61 = arg0 % 10;
			if (local61 < 0) {
				local61 = -local61;
			}
			if (local61 > 9) {
				local61 += 39;
			}
			local38[local30 - local56 - 1] = (byte) (local61 + 48);
			arg0 /= 10;
		}
		@Pc(101) JagString local101 = new JagString();
		local101.chars = local38;
		local101.length = local30;
		return local101;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 572)
	public static void method1350(@OriginalArg(1) int arg0) {
		Static39.method774(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!p;", line = 584)
	public static PixMap method1351(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		@Pc(7) LegacyPixMap local7 = new LegacyPixMap();
		local7.create(arg0, arg1, arg2);
		return local7;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 600)
	public static void method1352() {
		Static1.aClass5_Sub1Array1 = null;
		World.blendLuminance = null;
		anIntArray430 = null;
		aClass2_Sub2_Sub2_Sub3_20 = null;
		World.WALL_DECORATION_ROTATION_FORWARD_X = null;
		JagString.aClass40_567 = null;
		JagString.aClass40_568 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mc;B)Z", line = 1134)
	public static boolean method1354(@OriginalArg(0) ComType arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.scriptComparator.length; local17++) {
			@Pc(24) int local24 = Static99.method1660(local17, arg0);
			@Pc(29) int local29 = arg0.scriptOperand[local17];
			if (arg0.scriptComparator[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.scriptComparator[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.scriptComparator[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([BIILclient!cb;)V", line = 1191)
	public static void method1355(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Cache arg2) {
		@Pc(7) Js5CacheRequest local7 = new Js5CacheRequest();
		local7.cache = arg2;
		local7.key = arg1;
		local7.type = 0;
		local7.data = arg0;
		@Pc(27) LinkList local27 = Static1.aClass44_2;
		synchronized (Static1.aClass44_2) {
			Static1.aClass44_2.addTail(local7);
		}
		Static53.method992();
	}

}

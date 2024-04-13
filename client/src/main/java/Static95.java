import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!qb;")
	public static Pix8 aClass2_Sub2_Sub2_Sub3_24;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	public static int anInt2495;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!o;Lclient!o;ILclient!ud;)Lclient!vb;", line = 36)
	public static Pix24 method1644(@OriginalArg(0) JagString arg0, @OriginalArg(1) JagString arg1, @OriginalArg(3) Js5Index arg2) {
		@Pc(8) int local8 = arg2.method80(arg0);
		@Pc(14) int local14 = arg2.method72(arg1, local8);
		return Static36.method732(arg2, local8, local14);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cc;", line = 59)
	public static JagException method1645(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) JagException local12;
		if (arg0 instanceof JagException) {
			local12 = (JagException) arg0;
			local12.aString7 = local12.aString7 + ' ' + arg1;
		} else {
			local12 = new JagException(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!vb;II)V", line = 121)
	public static void method1646(@OriginalArg(1) Pix24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 * arg1 + arg2 * arg2;
		if (local11 <= 4225 || local11 >= 90000) {
			client.drawOnMinimap(arg2, arg0, arg1);
			return;
		}
		@Pc(32) int local32 = client.minimapAnticheatAngle + client.orbitCameraYaw & 0x7FF;
		@Pc(36) int local36 = Model.sin[local32];
		@Pc(44) int local44 = local36 * 256 / (Static1.anInt1857 + 256);
		@Pc(48) int local48 = Model.cos[local32];
		@Pc(56) int local56 = local48 * 256 / (Static1.anInt1857 + 256);
		@Pc(67) int local67 = local44 * arg1 + arg2 * local56 >> 16;
		@Pc(78) int local78 = local56 * arg1 - arg2 * local44 >> 16;
		@Pc(84) double local84 = Math.atan2((double) local67, (double) local78);
		@Pc(90) int local90 = (int) (Math.sin(local84) * 63.0D);
		@Pc(96) int local96 = (int) (Math.cos(local84) * 57.0D);
		Static96.aClass2_Sub2_Sub2_Sub4_10.method1623(local90 + 94 + 4 - 10, -20 + 83 + -local96, local84);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 701)
	public static void method1648(@OriginalArg(0) int arg0) {
		if (!ComType.method1665(arg0)) {
			return;
		}
		@Pc(26) ComType[] local26 = ComType.instances[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) ComType local34 = local26[local28];
			if (local34 != null) {
				local34.anInt1593 = 0;
				local34.anInt1569 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ke;)V", line = 734)
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) PathingEntity arg1) {
		client.projectFromGround(arg0, arg1.x, arg1.z);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)I", line = 776)
	public static int method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(8) int local8 = arg4;
			arg4 = arg1;
			arg1 = local8;
		}
		@Pc(16) int local16 = arg3 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg2;
		} else if (local16 == 2) {
			return 8 - arg4 - arg0;
		} else {
			return 7 + 1 - arg2 - arg1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 832)
	public static void method1652() {
		IdkType.aClass47_22 = null;
		client.fontPlain12 = null;
		JagString.aClass40_714 = null;
		JagString.aClass40_715 = null;
		aClass2_Sub2_Sub2_Sub3_24 = null;
		NpcType.aClass5_30 = null;
		client.flameBuffer3 = null;
	}
}

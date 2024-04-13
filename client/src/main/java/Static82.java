import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!t", name = "q", descriptor = "I")
	public static int anInt2135;

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!i;")
	public static Js5NetRequest aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BII[Lclient!fb;[BII)V", line = 13)
	public static void method1460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) CollisionMap[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg4 + local7 > 0 && local7 + arg4 < 103 && arg0 + local11 > 0 && local11 + arg0 < 103) {
						arg2[local3].flags[local7 + arg4][local11 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(98) Packet local98 = new Packet(arg3);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
				for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
					Static53.method990(local108 + arg0, local11, 0, arg5, local98, arg1, local104 + arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 166)
	public static void method1464() {
		ObjType.aClass47_18 = null;
		JagString.aClass40_609 = null;
		JagString.aClass40_611 = null;
		JagString.aClass40_610 = null;
		ComType.aClass47_20 = null;
		PlayerAppearance.aClass47_17 = null;
		aClass2_Sub2_Sub9_1 = null;
		JagString.aClass40_608 = null;
		NpcType.aClass47_19 = null;
	}
}

import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!pc;")
	public static PcmStream aClass2_Sub10_1;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!p;")
	public static PixMap aClass45_11;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 16)
	public static void method398() {
		aFont1 = null;
		JagString.aClass40_138 = null;
		JagString.aClass40_136 = null;
		aClass2_Sub10_1 = null;
		JagString.aClass40_139 = null;
		aClass45_11 = null;
		JagString.aClass40_140 = null;
		client.friendName37 = null;
		JagString.aClass40_141 = null;
		JagString.FRIENDSLIST_PLEASE_REMOVE_2 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII[Lclient!fb;BIILclient!sd;I[B)V", line = 134)
	public static void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) CollisionMap[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) World3D arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(10) Packet local10 = new Packet(arg9);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.gSmart1or2();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.gSmart1or2();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local10.g1();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (local55 == arg1 && local51 >= arg2 && local51 < arg2 + 8 && arg6 <= local45 && arg6 + 8 > local45) {
					@Pc(94) LocType local94 = LocType.get(local17);
					@Pc(111) int local111 = Static95.method1650(local51 & 0x7, local94.anInt1040, local45 & 0x7, arg0, local94.anInt1036, local67) + arg3;
					@Pc(128) int local128 = Static14.method1261(local51 & 0x7, local94.anInt1036, local67, arg0, local94.anInt1040, local45 & 0x7) + arg5;
					if (local111 > 0 && local128 > 0 && local111 < 103 && local128 < 103) {
						@Pc(144) CollisionMap local144 = null;
						@Pc(146) int local146 = arg8;
						if ((client.levelTileFlags[1][local111][local128] & 0x2) == 2) {
							local146 = arg8 - 1;
						}
						if (local146 >= 0) {
							local144 = arg4[local146];
						}
						World.method1353(arg8, local17, local111, local144, arg0 + local67 & 0x3, local63, arg7, local128);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lclient!fc;", line = 856)
	public static PixFont method406() {
		@Pc(20) PixFont local20 = new PixFont(Static89.anIntArray503, Static61.anIntArray338, Static18.anIntArray86, Static19.anIntArray92, Static83.aByteArrayArray10);
		Static85.method1485();
		return local20;
	}
}

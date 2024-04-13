import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Ljava/awt/Graphics;")
	public static Graphics aGraphics1;

	@OriginalMember(owner = "client!ee", name = "nb", descriptor = "[B")
	public static byte[] aByteArray9;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!qb;)V", line = 73)
	public static void method502(@OriginalArg(1) Pix8 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static14.anIntArray414.length; local9++) {
			Static14.anIntArray414[local9] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * 128.0D * Math.random());
			Static14.anIntArray414[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local32 = 0; local32 < 20; local32++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = (local56 << 7) + local60;
					Static4.anIntArray17[local68] = (Static14.anIntArray414[local68 - 1] + Static14.anIntArray414[local68 + 1] + Static14.anIntArray414[local68 - 128] + Static14.anIntArray414[local68 + 128]) / 4;
				}
			}
			@Pc(109) int[] local109 = Static14.anIntArray414;
			Static14.anIntArray414 = Static4.anIntArray17;
			Static4.anIntArray17 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt1910; local60++) {
			for (local68 = 0; local68 < arg0.anInt1905; local68++) {
				if (arg0.aByteArray16[local56++] != 0) {
					@Pc(142) int local142 = local60 + arg0.anInt1906 + 16;
					@Pc(149) int local149 = arg0.anInt1907 + local68 + 16;
					@Pc(155) int local155 = (local142 << 7) + local149;
					Static14.anIntArray414[local155] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V", line = 1015)
	public static void method506() {
		JagString.aClass40_180 = null;
		aGraphics1 = null;
		JagString.aClass40_179 = null;
		JagString.aClass40_183 = null;
		aByteArrayArray6 = null;
		JagString.aClass40_184 = null;
		aByteArray9 = null;
		JagString.aClass40_182 = null;
		JagString.aClass40_181 = null;
		Static1.aClass44_4 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(JB)Lclient!o;", line = 17)
	public static JagString fromBase37(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		}

		if (arg0 % 37L == 0L) {
			return null;
		}

        @Pc(37) int local37 = 0;
        @Pc(39) long local39 = arg0;
        while (local39 != 0L) {
            local39 /= 37L;
            local37++;
        }

        @Pc(53) byte[] local53 = new byte[local37];
        while (arg0 != 0L) {
            @Pc(57) long local57 = arg0;
            arg0 /= 37L;
            local37--;
            local53[local37] = Static1.BASE37_LOOKUP[(int) (local57 - arg0 * 37L)];
        }

        @Pc(82) JagString str = new JagString();
        str.chars = local53;
        str.length = local53.length;
        return str;
    }

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 416)
	public static void method823() {
		JagString.aClass40_343 = null;
		JagString.aClass40_346 = null;
		JagString.aClass40_345 = null;
		JagString.aClass40_344 = null;
		client.skillExperience = null;
		PacketBit.anIntArray235 = null;
	}
}

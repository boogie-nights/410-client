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

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V", line = 97)
	public static void method820() {
		Static77.method1364();
		Static79.method1402();
		Static54.method996();
		Static74.method1344();
		Static68.method1210();
		ObjType.method1675();
		SeqType.method1357();
		SpotAnimType.method262();
		Static70.method1478();
		VarpType.method1242();
		PlayerAppearance.method850();
		Static27.method582();
		((Js5TextureProvider) Draw3D.getProvider).method401();
		Static40.animsJs5.method57();
		Static79.basesJs5.method57();
		Static26.interfacesJs5.method57();
		Static33.synthSoundsJs5.method57();
		Static34.mapsJs5.method57();
		Static77.midiSongsJs5.method57();
		Static24.modelsJs5.method57();
		Static74.spritesJs5.method57();
		Static33.texturesJs5.method57();
		Static73.binaryJs5.method57();
		Static68.midiJinglesJs5.method57();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIB)I", line = 193)
	public static int getDrawLevel(@OriginalArg(0) int stz, @OriginalArg(1) int stx, @OriginalArg(2) int level) {
		if ((client.levelTileFlags[level][stx][stz] & 0x8) == 0) {
			return level <= 0 || (client.levelTileFlags[1][stx][stz] & 0x2) == 0 ? level : level - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 416)
	public static void method823() {
		JagString.aClass40_343 = null;
		JagString.aClass40_346 = null;
		JagString.aClass40_345 = null;
		JagString.aClass40_344 = null;
		Static1.anIntArray234 = null;
		PacketBit.anIntArray235 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	public static int anInt1114;

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
		Static29.method1675();
		Static75.method1357();
		Static13.method262();
		Static70.method1478();
		Static40.method1242();
		Static47.method850();
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
		if ((World.levelTileFlags[level][stx][stz] & 0x8) == 0) {
			return level <= 0 || (World.levelTileFlags[1][stx][stz] & 0x2) == 0 ? level : level - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!gb;II)V", line = 265)
	public static void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NpcType arg2, @OriginalArg(4) int arg3) {
		if (Static1.anInt797 >= 400) {
			return;
		}
		if (arg2.anIntArray154 != null) {
			arg2 = arg2.method611();
		}
		if (arg2 == null || !arg2.aBoolean58) {
			return;
		}
		@Pc(30) JagString local30 = arg2.aClass40_238;
		if (arg2.anInt766 != 0) {
			local30 = Static72.method1334(new JagString[] { local30, Static14.method1260(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378, arg2.anInt766), JagString.aClass40_731, Static48.method859(arg2.anInt766), JagString.aClass40_609 });
		}
		if (Static1.anInt1874 == 1) {
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_613, local30 }), 7, arg3, arg1, arg0);
		} else if (Static1.anInt641 != 1) {
			@Pc(80) JagString[] local80 = arg2.aClass40Array14;
			if (Static1.aBoolean60) {
				local80 = Static79.method1404(local80);
			}
			@Pc(94) int local94;
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && !local80[local94].method1199(JagString.aClass40_729)) {
						@Pc(109) byte local109 = 0;
						if (local94 == 0) {
							local109 = 56;
						}
						if (local94 == 1) {
							local109 = 17;
						}
						if (local94 == 2) {
							local109 = 8;
						}
						if (local94 == 3) {
							local109 = 22;
						}
						if (local94 == 4) {
							local109 = 31;
						}
						Static20.method402(Static72.method1334(new JagString[] { local80[local94], JagString.aClass40_83, local30 }), local109, arg3, arg1, arg0);
					}
				}
			}
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && local80[local94].method1199(JagString.aClass40_729)) {
						@Pc(192) short local192 = 0;
						if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt1378 < arg2.anInt766) {
							local192 = 2000;
						}
						@Pc(201) int local201 = 0;
						if (local94 == 0) {
							local201 = local192 + 56;
						}
						if (local94 == 1) {
							local201 = local192 + 17;
						}
						if (local94 == 2) {
							local201 = local192 + 8;
						}
						if (local94 == 3) {
							local201 = local192 + 22;
						}
						if (local94 == 4) {
							local201 = local192 + 31;
						}
						Static20.method402(Static72.method1334(new JagString[] { local80[local94], JagString.aClass40_83, local30 }), local201, arg3, arg1, arg0);
					}
				}
			}
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_322, local30 }), 1006, arg3, arg1, arg0);
			return;
		} else if ((Static78.anInt2027 & 0x2) == 2) {
			Static20.method402(Static72.method1334(new JagString[] { JagString.aClass40_567, JagString.aClass40_83, local30 }), 44, arg3, arg1, arg0);
			return;
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

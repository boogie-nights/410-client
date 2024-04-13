import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!p;")
	public static PixMap aClass45_13;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!eb;")
	public static Packet aClass2_Sub3_2;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!p;")
	public static PixMap aClass45_14;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!hc;")
	public static ClientStream js5Stream;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 4)
	public static void method581() {
		aClass45_13 = null;
		aClass2_Sub2_Sub2_Sub4Array4 = null;
		aClass45_14 = null;
		aClass2_Sub3_2 = null;
		JagString.aClass40_218 = null;
		js5Stream = null;
		JagString.aClass40_219 = null;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 20)
	public static void method582() {
		ComType.aClass47_8.clear();
		ComType.aClass47_20.clear();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 63)
	public static void method583() {
		@Pc(9) int local9 = Static13.aClass2_Sub2_Sub2_Sub2_1.method568(JagString.aClass40_524);
		@Pc(24) int local24;
		for (@Pc(16) int local16 = 0; local16 < client.menuSize; local16++) {
			local24 = Static13.aClass2_Sub2_Sub2_Sub2_1.method576(client.menuOption[local16]);
			if (local24 > local9) {
				local9 = local24;
			}
		}
		local9 += 8;
		local24 = client.menuSize * 15 + 21;
		@Pc(87) int local87;
		@Pc(110) int local110;
		if (Static1.anInt2500 > 4 && Static1.anInt2133 > 4 && Static1.anInt2500 < 516 && Static1.anInt2133 < 338) {
			Static1.anInt16 = 0;
			Static91.anInt120 = client.menuSize * 15 + 22;
			Static14.anInt1856 = local9;
			local87 = Static1.anInt2500 - local9 / 2 - 4;
			Static1.aBoolean175 = true;
			if (local9 + local87 > 512) {
				local87 = 512 - local9;
			}
			if (local87 < 0) {
				local87 = 0;
			}
			local110 = Static1.anInt2133 - 4;
			if (local110 + local24 > 334) {
				local110 = 334 - local24;
			}
			if (local110 < 0) {
				local110 = 0;
			}
			Static99.anInt2497 = local110;
			Static44.anInt1110 = local87;
		}
		if (Static1.anInt2500 > 553 && Static1.anInt2133 > 205 && Static1.anInt2500 < 743 && Static1.anInt2133 < 466) {
			Static1.aBoolean175 = true;
			Static14.anInt1856 = local9;
			Static91.anInt120 = client.menuSize * 15 + 22;
			local110 = Static1.anInt2133 - 205;
			if (local110 < 0) {
				local110 = 0;
			} else if (local110 + local24 > 261) {
				local110 = 261 - local24;
			}
			local87 = Static1.anInt2500 - local9 / 2 - 553;
			Static99.anInt2497 = local110;
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 + local9 > 190) {
				local87 = 190 - local9;
			}
			Static1.anInt16 = 1;
			Static44.anInt1110 = local87;
		}
		if (Static1.anInt2500 <= 17 || Static1.anInt2133 <= 357 || Static1.anInt2500 >= 496 || Static1.anInt2133 >= 453) {
			return;
		}
		Static91.anInt120 = client.menuSize * 15 + 22;
		Static14.anInt1856 = local9;
		local87 = Static1.anInt2500 - local9 / 2 - 17;
		Static1.aBoolean175 = true;
		Static1.anInt16 = 2;
		if (local87 < 0) {
			local87 = 0;
		} else if (local87 + local9 > 479) {
			local87 = 479 - local9;
		}
		Static44.anInt1110 = local87;
		local110 = Static1.anInt2133 - 357;
		if (local110 < 0) {
			local110 = 0;
		} else if (local24 + local110 > 96) {
			local110 = 96 - local24;
		}
		Static99.anInt2497 = local110;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!i", name = "X", descriptor = "Lclient!p;")
	public static PixMap aClass45_20;

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "Lclient!bb;")
	public static SignLink aClass7_4;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 64)
	public static void method753() {
		JagString.aClass40_307 = null;
		JagString.aClass40_306 = null;
		aClass7_4 = null;
		aClass45_20 = null;
		ObjType.aClass5_13 = null;
		LocType.aClass47_10 = null;
		LocType.aClass47_11 = null;
		JagString.aClass40_305 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!sb;", line = 81)
	public static SeqFrameset getSeqFrameset(@OriginalArg(1) int arg0) {
		@Pc(14) SeqFrameset local14 = (SeqFrameset) SeqType.aClass47_2.get((long) arg0);
		if (local14 != null) {
			return local14;
		}
		local14 = Static98.method1744(Static35.aClass5_12, Static77.aClass5_27, arg0);
		if (local14 != null) {
			SeqType.aClass47_2.put((long) arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V", line = 121)
	public static void method755() {
		@Pc(12) int local12;
		for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
			local12 = (int) (Math.random() * 100.0D);
			if (local12 < 50) {
				Static95.anIntArray547[local5 + 32512] = 255;
			}
		}
		@Pc(50) int local50;
		@Pc(43) int local43;
		@Pc(57) int local57;
		for (local12 = 0; local12 < 100; local12++) {
			local43 = (int) (Math.random() * 128.0D) + 128;
			local50 = (int) (Math.random() * 124.0D) + 2;
			local57 = local50 + (local43 << 7);
			Static95.anIntArray547[local57] = 192;
		}
		for (local50 = 1; local50 < 255; local50++) {
			for (local43 = 1; local43 < 127; local43++) {
				local57 = local43 + (local50 << 7);
				Static1.anIntArray1[local57] = (Static95.anIntArray547[local57 + 128] + Static95.anIntArray547[local57 + 1] + Static95.anIntArray547[local57 - 1] + Static95.anIntArray547[local57 - 128]) / 4;
			}
		}
		Static1.anInt50 += 128;
		if (Static14.anIntArray414.length < Static1.anInt50) {
			Static1.anInt50 -= Static14.anIntArray414.length;
			local43 = (int) (Math.random() * 12.0D);
			Static23.method502(Static45.aClass2_Sub2_Sub2_Sub3Array14[local43]);
		}
		@Pc(166) int local166;
		for (local43 = 1; local43 < 255; local43++) {
			for (local57 = 1; local57 < 127; local57++) {
				local166 = local57 + (local43 << 7);
				@Pc(187) int local187 = Static1.anIntArray1[local166 + 128] - Static14.anIntArray414[Static14.anIntArray414.length - 1 & local166 - -Static1.anInt50] / 5;
				if (local187 < 0) {
					local187 = 0;
				}
				Static95.anIntArray547[local166] = local187;
			}
		}
		for (local57 = 0; local57 < 255; local57++) {
			Static1.anIntArray152[local57] = Static1.anIntArray152[local57 + 1];
		}
		Static1.anIntArray152[255] = (int) (Math.sin((double) client.loopCycle / 14.0D) * 16.0D + Math.sin((double) client.loopCycle / 15.0D) * 14.0D + Math.sin((double) client.loopCycle / 16.0D) * 12.0D);
		if (Static1.anInt2061 > 0) {
			Static1.anInt2061 -= 4;
		}
		if (Static1.anInt2254 > 0) {
			Static1.anInt2254 -= 4;
		}
		if (Static1.anInt2061 != 0 || Static1.anInt2254 != 0) {
			return;
		}
		local166 = (int) (Math.random() * 2000.0D);
		if (local166 == 0) {
			Static1.anInt2061 = 1024;
		}
		if (local166 == 1) {
			Static1.anInt2254 = 1024;
			return;
		}
	}
}

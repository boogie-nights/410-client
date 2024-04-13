import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 330)
	public static void method1055() {
		Static67.method1208(false, 0, null);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ad;Lclient!cb;ZI)V", line = 351)
	public static void method1056(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Cache arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) LinkList local9 = Static1.aClass44_2;
		synchronized (Static1.aClass44_2) {
			for (@Pc(16) Js5CacheRequest local16 = (Js5CacheRequest) Static1.aClass44_2.head(); local16 != null; local16 = (Js5CacheRequest) Static1.aClass44_2.method1231()) {
				if ((long) arg2 == local16.aLong152 && arg1 == local16.cache && local16.type == 0) {
					local7 = local16.data;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(75) byte[] local75 = arg1.read(arg2);
			arg0.method95(arg1, arg2, local75, true);
		} else {
			arg0.method95(arg1, arg2, local7, true);
		}
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V", line = 522)
	public static void method1058() {
		JagString.aClass40_463 = null;
		Static1.aClass40Array30 = null;
		Static1.anIntArray326 = null;
		JagString.aClass40_469 = null;
		JagString.aClass40_462 = null;
		JagString.aClass40_470 = null;
		JagString.aClass40_472 = null;
		JagString.aClass40_465 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 543)
	public static String method1059(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof JagException) {
			@Pc(7) JagException local7 = (JagException) arg0;
			arg0 = local7.aThrowable1;
			local20 = local7.aString7 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(50) String local50 = local28.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			while (true) {
				@Pc(64) String local64 = local58.readLine();
				if (local64 == null) {
					return local20 + "| " + local61;
				}
				@Pc(70) int local70 = local64.indexOf(40);
				@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
				if (local70 >= 0 && local77 >= 0) {
					@Pc(94) String local94 = local64.substring(local70 + 1, local77);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local20 = local20 + local94 + ' ';
						continue;
					}
					local64 = local64.substring(0, local70);
				}
				local64 = local64.trim();
				local64 = local64.substring(local64.lastIndexOf(32) + 1);
				local64 = local64.substring(local64.lastIndexOf(9) + 1);
				local20 = local20 + local64 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 626)
	public static void method1060() {
		if (Static1.anInt2077 != 0) {
			return;
		}
		@Pc(15) int local15 = Static1.anInt2030;
		if (Static1.anInt641 == 1 && Static1.anInt2500 >= 516 && Static1.anInt2133 >= 160 && Static1.anInt2500 <= 765 && Static1.anInt2133 <= 205) {
			local15 = 0;
		}
		@Pc(54) int local54;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (!Static1.aBoolean175) {
			if (local15 == 1 && Static1.anInt797 > 0) {
				local54 = Static1.anIntArray287[Static1.anInt797 - 1];
				if (local54 == 52 || local54 == 55 || local54 == 47 || local54 == 39 || local54 == 26 || local54 == 4 || local54 == 27 || local54 == 46 || local54 == 53 || local54 == 23 || local54 == 1 || local54 == 1002) {
					local108 = Static1.anIntArray161[Static1.anInt797 - 1];
					local114 = Static1.anIntArray165[Static1.anInt797 - 1];
					@Pc(118) ComType local118 = Static73.method1340(local114);
					if (local118.aBoolean129 || local118.aBoolean126) {
						Static1.anInt309 = Static1.anInt2500;
						Static1.anInt14 = 0;
						Static1.anInt2077 = 2;
						if (Static1.anInt2585 == local114 >> 16) {
							Static1.anInt2077 = 1;
						}
						if (Static1.anInt1994 == local114 >> 16) {
							Static1.anInt2077 = 3;
						}
						Static1.anInt1571 = Static1.anInt2133;
						Static1.anInt2239 = local108;
						Static1.anInt1911 = local114;
						Static1.aBoolean142 = false;
						return;
					}
				}
			}
			if (local15 == 1 && (Static1.anInt263 == 1 || Static33.method634(Static1.anInt797 - 1)) && Static1.anInt797 > 2) {
				local15 = 2;
			}
			if (local15 == 1 && Static1.anInt797 > 0) {
				Static88.method1549(Static1.anInt797 - 1);
			}
			if (local15 == 2 && Static1.anInt797 > 0) {
				Static27.method583();
			}
			return;
		}
		if (local15 != 1) {
			local54 = Mouse.x;
			local108 = Mouse.y;
			if (Static1.anInt16 == 0) {
				local54 -= 4;
				local108 -= 4;
			}
			if (Static1.anInt16 == 1) {
				local108 -= 205;
				local54 -= 553;
			}
			if (Static1.anInt16 == 2) {
				local54 -= 17;
				local108 -= 357;
			}
			if (local54 < Static44.anInt1110 - 10 || local54 > Static44.anInt1110 + Static14.anInt1856 + 10 || Static99.anInt2497 - 10 > local108 || local108 > Static99.anInt2497 + Static91.anInt120 + 10) {
				if (Static1.anInt16 == 1) {
					Static1.aBoolean59 = true;
				}
				Static1.aBoolean175 = false;
				if (Static1.anInt16 == 2) {
					Static1.aBoolean144 = true;
				}
			}
		}
		if (local15 != 1) {
			return;
		}
		local54 = Static44.anInt1110;
		local108 = Static99.anInt2497;
		local114 = Static14.anInt1856;
		@Pc(298) int local298 = Static1.anInt2133;
		@Pc(300) int local300 = Static1.anInt2500;
		if (Static1.anInt16 == 0) {
			local298 -= 4;
			local300 -= 4;
		}
		@Pc(309) int local309 = -1;
		if (Static1.anInt16 == 1) {
			local300 -= 553;
			local298 -= 205;
		}
		if (Static1.anInt16 == 2) {
			local298 -= 357;
			local300 -= 17;
		}
		for (@Pc(325) int local325 = 0; local325 < Static1.anInt797; local325++) {
			@Pc(340) int local340 = local108 + (-local325 + -1 + Static1.anInt797) * 15 + 31;
			if (local300 > local54 && local114 + local54 > local300 && local298 > local340 - 13 && local298 < local340 + 3) {
				local309 = local325;
			}
		}
		if (local309 != -1) {
			Static88.method1549(local309);
		}
		if (Static1.anInt16 == 2) {
			Static1.aBoolean144 = true;
		}
		Static1.aBoolean175 = false;
		if (Static1.anInt16 == 1) {
			Static1.aBoolean59 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V", line = 846)
	public static void method1062(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static1.anInt2594 >= 100 && Static1.anInt927 != 1) {
			Static53.method989(0, JagString.aClass40_445, JagString.aClass40_739);
		} else if (Static1.anInt2594 >= 200) {
			Static53.method989(0, JagString.aClass40_445, JagString.aClass40_739);
		} else {
			@Pc(41) JagString local41 = Static44.method819(arg0).method1167();
			for (@Pc(43) int local43 = 0; local43 < Static1.anInt2594; local43++) {
				if (arg0 == Static1.aLongArray2[local43]) {
					Static53.method989(0, JagString.aClass40_445, Static72.method1334(new JagString[] { local41, JagString.aClass40_677 }));
					return;
				}
			}
			for (@Pc(74) int local74 = 0; local74 < Static1.anInt121; local74++) {
				if (Static1.aLongArray4[local74] == arg0) {
					Static53.method989(0, JagString.aClass40_445, Static72.method1334(new JagString[] { JagString.aClass40_357, local41, JagString.aClass40_137 }));
					return;
				}
			}
			if (!local41.method1184(Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395)) {
				Static1.aClass40Array23[Static1.anInt2594] = local41;
				Static1.aLongArray2[Static1.anInt2594] = arg0;
				Static1.anIntArray316[Static1.anInt2594] = 0;
				Static1.aBoolean59 = true;
				Static1.anInt2594++;
				Static1.aClass2_Sub3_Sub1_4.pIsaac1(98);
				Static1.aClass2_Sub3_Sub1_4.p8(arg0);
			}
		}
	}
}

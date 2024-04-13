import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!hc;")
	public static ClientStream stream;
	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "Lclient!wc;")
	public static PacketBit in = new PacketBit(5000);
	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int packetType = 0;
	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	public static int packetSize = 0;
	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int idleNetCycles = 0;
	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int lastPacketType2 = 0;
	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public static int lastPacketType1 = 0;
	@OriginalMember(owner = "client!gb", name = "Lb", descriptor = "I")
	public static int lastPacketType0 = 0;
	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
	public static int worldId = 1;
	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public static int modeWhat = 0;
	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int modeWhere = 0;
	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	public static boolean membersWorld;
	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public static int state = 0;
	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public static int js5ConnectState = 0;
	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	public static int js5ErrorCount = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z", line = 163)
	public static boolean method22() {
		if (stream == null) {
			return false;
		}
		@Pc(226) int local226;
		try {
			@Pc(13) int available = stream.available();
			if (available == 0) {
				return false;
			}
			if (packetType == -1) {
				available--;
				stream.read(0, 1, in.data);
				in.pos = 0;
				packetType = in.gIsaac1();
				packetSize = Static1.SERVER_PROT_LENGTHS[packetType];
			}
			if (packetSize == -1) {
				if (available <= 0) {
					return false;
				}
				stream.read(0, 1, in.data);
				packetSize = in.data[0] & 0xFF;
				available--;
			}
			if (packetSize == -2) {
				if (available <= 1) {
					return false;
				}
				stream.read(0, 2, in.data);
				available -= 2;
				in.pos = 0;
				packetSize = in.g2();
			}
			if (available < packetSize) {
				return false;
			}
			in.pos = 0;
			stream.read(0, packetSize, in.data);
			idleNetCycles = 0;
			lastPacketType2 = lastPacketType1;
			lastPacketType1 = lastPacketType0;
			lastPacketType0 = packetType;
			@Pc(125) int local125;
			if (packetType == 224) {
				local125 = in.g2_alt2();
				Static95.method1648(local125);
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = -1;
					Static1.aBoolean59 = true;
					Static1.aBoolean184 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				if (Static1.anInt1994 != local125) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = local125;
				}
				Static1.aBoolean40 = false;
				Static1.aBoolean144 = true;
				packetType = -1;
				return true;
			}
			if (packetType == 142) {
				Static87.baseX = in.g1();
				Static83.baseZ = in.g1_alt1();
				while (in.pos < packetSize) {
					packetType = in.g1();
					Static3.method26();
				}
				packetType = -1;
				return true;
			}
			@Pc(230) int local230;
			@Pc(234) ComType local234;
			if (packetType == 7) {
				local125 = in.g4s_alt2();
				local226 = in.g2_alt1();
				local230 = in.g2_alt1();
				local234 = Static73.method1340(local125);
				if (local230 == 65535) {
					packetType = -1;
					local234.anInt1607 = 0;
					return true;
				}
				@Pc(248) ObjType local248 = Static97.method1669(local230);
				local234.anInt1607 = 4;
				local234.anInt1579 = local248.anInt952;
				packetType = -1;
				local234.anInt1586 = local248.anInt926 * 100 / local226;
				local234.anInt1602 = local230;
				local234.anInt1614 = local248.anInt918;
				return true;
			}
			if (packetType == 249) {
				Static1.anInt808 = in.g2_alt2();
				packetType = -1;
				return true;
			}
			if (packetType == 157) {
				Static64.method1111(GameShell.signlink, packetSize, in);
				packetType = -1;
				return true;
			}
			@Pc(355) int local355;
			@Pc(364) int local364;
			@Pc(359) int local359;
			@Pc(376) int local376;
			if (packetType == 215) {
				Static1.aBoolean22 = true;
				Static71.anInt1867 = in.g1();
				Static72.anInt1914 = in.g1();
				Static75.anInt1963 = in.g2();
				Static21.anInt2586 = in.g1();
				Static69.anInt1832 = in.g1();
				if (Static69.anInt1832 >= 100) {
					local125 = Static71.anInt1867 * 128 + 64;
					local226 = Static72.anInt1914 * 128 + 64;
					local230 = Static78.method1383(Static1.currentLevel, local125, local226) - Static75.anInt1963;
					local355 = local125 - Static44.anInt1114;
					local359 = local226 - Static14.anInt1863;
					local364 = local230 - Static73.anInt1935;
					local376 = (int) Math.sqrt((double) (local355 * local355 + local359 * local359));
					Static33.anInt824 = (int) (Math.atan2((double) local364, (double) local376) * 325.949D) & 0x7FF;
					Static26.anInt686 = (int) (-325.949D * Math.atan2((double) local355, (double) local359)) & 0x7FF;
					if (Static33.anInt824 < 128) {
						Static33.anInt824 = 128;
					}
					if (Static33.anInt824 > 383) {
						Static33.anInt824 = 383;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 116) {
				Static1.aBoolean59 = true;
				local125 = in.g1_alt3();
				local226 = in.g4s_alt1();
				local230 = in.g1_alt2();
				Static1.anIntArray234[local230] = local226;
				Static1.anIntArray473[local230] = local125;
				Static1.anIntArray312[local230] = 1;
				for (local355 = 0; local355 < 98; local355++) {
					if (Static1.anIntArray80[local355] <= local226) {
						Static1.anIntArray312[local230] = local355 + 2;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 90) {
				Static1.anInt2139 = in.g1();
				if (Static1.anInt2139 == 1) {
					Static1.anInt1989 = in.g2();
				}
				if (Static1.anInt2139 >= 2 && Static1.anInt2139 <= 6) {
					if (Static1.anInt2139 == 2) {
						Static1.anInt441 = 64;
						Static1.anInt1493 = 64;
					}
					if (Static1.anInt2139 == 3) {
						Static1.anInt1493 = 64;
						Static1.anInt441 = 0;
					}
					if (Static1.anInt2139 == 4) {
						Static1.anInt441 = 128;
						Static1.anInt1493 = 64;
					}
					if (Static1.anInt2139 == 5) {
						Static1.anInt1493 = 0;
						Static1.anInt441 = 64;
					}
					if (Static1.anInt2139 == 6) {
						Static1.anInt1493 = 128;
						Static1.anInt441 = 64;
					}
					Static1.anInt2139 = 2;
					Static1.anInt410 = in.g2();
					Static1.anInt1952 = in.g2();
					Static1.anInt1917 = in.g1();
				}
				if (Static1.anInt2139 == 10) {
					Static1.anInt2353 = in.g2();
				}
				packetType = -1;
				return true;
			}
			if (packetType == 15) {
				local125 = in.g4s_alt1();
				local226 = in.g2s_alt2();
				local230 = in.g2s_alt1();
				local234 = Static73.method1340(local125);
				local234.anInt1588 = local234.anInt1616 + local226;
				local234.anInt1582 = local234.anInt1573 + local230;
				packetType = -1;
				return true;
			}
			if (packetType == 232) {
				for (local125 = 0; local125 < Static1.anIntArray339.length; local125++) {
					if (Static1.anIntArray288[local125] != Static1.anIntArray339[local125]) {
						Static1.anIntArray339[local125] = Static1.anIntArray288[local125];
						Static21.method1700(local125);
						Static1.aBoolean59 = true;
					}
				}
				packetType = -1;
				return true;
			}
			@Pc(650) long local650;
			@Pc(655) long local655;
			if (packetType == 103) {
				local650 = in.g8();
				local655 = in.g2();
				@Pc(660) long local660 = (long) in.g3();
				local376 = in.g1();
				@Pc(671) long local671 = (local655 << 32) + local660;
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < 100; local675++) {
					if (local671 == Static1.aLongArray3[local675]) {
						local673 = true;
						break;
					}
				}
				if (local376 <= 1) {
					for (@Pc(702) int local702 = 0; local702 < Static1.anInt121; local702++) {
						if (Static1.aLongArray4[local702] == local650) {
							local673 = true;
							break;
						}
					}
				}
				if (!local673 && Static1.anInt440 == 0) {
					Static1.aLongArray3[Static1.anInt2359] = local671;
					Static1.anInt2359 = (Static1.anInt2359 + 1) % 100;
					@Pc(738) JagString local738 = Static7.method192(in).method1166();
					if (local376 == 2 || local376 == 3) {
						Static53.method989(7, Static72.method1334(new JagString[] { JagString.aClass40_622, Static44.method819(local650).method1167() }), local738);
					} else if (local376 == 1) {
						Static53.method989(7, Static72.method1334(new JagString[] { JagString.aClass40_323, Static44.method819(local650).method1167() }), local738);
					} else {
						Static53.method989(3, Static44.method819(local650).method1167(), local738);
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 216) {
				Static1.anInt1551 = in.g1_alt3();
				Static1.aBoolean59 = true;
				Static1.aBoolean184 = true;
				packetType = -1;
				return true;
			}
			@Pc(836) ComType local836;
			if (packetType == 84) {
				local125 = in.g4s_alt1();
				local836 = Static73.method1340(local125);
				local836.anInt1607 = 3;
				local836.anInt1602 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass33_2.method1006();
				packetType = -1;
				return true;
			}
			if (packetType == 74) {
				if (Static1.anInt1551 == 12) {
					Static1.aBoolean59 = true;
				}
				Static1.anInt2181 = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 162) {
				Static1.aBoolean22 = true;
				Static70.anInt2149 = in.g1();
				Static34.anInt840 = in.g1();
				Static45.anInt2259 = in.g2();
				Static18.anInt439 = in.g1();
				Static51.anInt2325 = in.g1();
				if (Static51.anInt2325 >= 100) {
					Static44.anInt1114 = Static70.anInt2149 * 128 + 64;
					Static14.anInt1863 = Static34.anInt840 * 128 + 64;
					Static73.anInt1935 = Static78.method1383(Static1.currentLevel, Static44.anInt1114, Static14.anInt1863) - Static45.anInt2259;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 108) {
				for (local125 = 0; local125 < Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1.length; local125++) {
					if (Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125] != null) {
						Static1.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125].anInt2307 = -1;
					}
				}
				for (local226 = 0; local226 < Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1.length; local226++) {
					if (Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226] != null) {
						Static1.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226].anInt2307 = -1;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 126) {
				Static91.method58(true);
				packetType = -1;
				return true;
			}
			if (packetType == 32) {
				Static1.anInt2399 = 1;
				packetType = -1;
				Static1.aBoolean144 = true;
				JagString.aClass40_444 = JagString.aClass40_445;
				Static1.aBoolean146 = false;
				return true;
			}
			if (packetType == 94) {
				local125 = in.g2s_alt2();
				if (local125 != Static1.anInt980) {
					Static75.method1350(Static1.anInt980);
					Static1.anInt980 = local125;
				}
				packetType = -1;
				Static1.aBoolean144 = true;
				return true;
			}
			if (packetType == 120) {
				if (Static1.anInt1551 == 12) {
					Static1.aBoolean59 = true;
				}
				Static1.anInt1813 = in.g2s();
				packetType = -1;
				return true;
			}
			if (packetType == 70) {
				local125 = in.g2_alt1();
				if (local125 == 65535) {
					local125 = -1;
				}
				if (local125 == -1 && Static1.anInt470 == 0) {
					Static86.method1497();
				} else if (local125 != -1 && local125 != Static1.anInt1977 && Static1.anInt239 != 0 && Static1.anInt470 == 0) {
					Static86.method1491(local125, Static1.anInt239, 0, Static77.midiSongsJs5);
				}
				Static1.anInt1977 = local125;
				packetType = -1;
				return true;
			}
			if (packetType == 62) {
				local125 = in.g3();
				local226 = in.g2_alt1();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Static1.anInt239 != 0 && local226 != -1) {
					Static86.method1499(1, local226, Static68.midiJinglesJs5, Static1.anInt239);
					Static1.anInt470 = local125;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 17) {
				Static1.aBoolean22 = false;
				for (local125 = 0; local125 < 5; local125++) {
					Static1.aBooleanArray35[local125] = false;
				}
				packetType = -1;
				return true;
			}
			@Pc(1170) ComType local1170;
			if (packetType == 241) {
				local125 = in.g4s_alt3();
				local226 = in.g2_alt3();
				local1170 = Static73.method1340(local125);
				packetType = -1;
				local1170.anInt1602 = local226;
				local1170.anInt1607 = 2;
				return true;
			}
			if (packetType == 97) {
				local125 = in.g2();
				local226 = in.g2_alt1();
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
					Static1.aBoolean144 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != local226) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = local226;
				}
				if (Static1.anInt1654 != local125) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = local125;
				}
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				packetType = -1;
				Static1.aBoolean59 = true;
				Static1.aBoolean184 = true;
				Static1.aBoolean40 = false;
				return true;
			}
			if (packetType == 153) {
				Static75.anInt1960 = in.g2_alt3();
				in.g2();
				Static51.anInt2272 = in.g2_alt1();
				Static61.anInt1664 = in.g2_alt1();
				Static46.anInt1167 = in.g2_alt2();
				Static53.anInt1494 = in.g2_alt3();
				Static35.anInt941 = in.g1();
				Static46.anInt1163 = in.g2_alt2();
				in.g2_alt3();
				Static78.anInt2035 = in.g2_alt1();
				Static53.anInt1487 = in.g4s_alt3();
				Static56.aClass48_6 = GameShell.signlink.method199(Static53.anInt1487);
				packetType = -1;
				return true;
			}
			if (packetType == 11) {
				local125 = in.g2();
				local226 = in.g1();
				local230 = in.g2();
				if (Static1.anInt2372 != 0 && local226 != 0 && Static1.anInt131 < 50) {
					Static1.anIntArray497[Static1.anInt131] = local125;
					Static1.anIntArray79[Static1.anInt131] = local226;
					Static1.anIntArray36[Static1.anInt131] = local230;
					Static1.aClass43Array1[Static1.anInt131] = null;
					Static1.anInt131++;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 122) {
				Static91.method58(false);
				packetType = -1;
				return true;
			}
			if (packetType == 136) {
				local125 = in.g4s();
				local836 = Static73.method1340(local125);
				for (local230 = 0; local230 < local836.anIntArray331.length; local230++) {
					local836.anIntArray331[local230] = -1;
					local836.anIntArray331[local230] = 0;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 28) {
				Static1.anInt2492 = in.g1_alt1();
				packetType = -1;
				if (Static1.anInt1551 == Static1.anInt2492) {
					Static1.aBoolean59 = true;
					if (Static1.anInt2492 == 3) {
						Static1.anInt1551 = 1;
					} else {
						Static1.anInt1551 = 3;
					}
				}
				return true;
			}
			if (packetType == 170) {
				Static20.method399();
				packetType = -1;
				return true;
			}
			if (packetType == 250) {
				@Pc(1474) boolean local1474 = in.g1() == 1;
				local226 = in.g4s();
				local1170 = Static73.method1340(local226);
				local1170.aBoolean125 = local1474;
				packetType = -1;
				return true;
			}
			if (packetType == 155) {
				local650 = in.g8();
				local230 = in.g2();
				@Pc(1508) JagString local1508 = Static44.method819(local650).method1167();
				for (local364 = 0; local364 < Static1.anInt2594; local364++) {
					if (local650 == Static1.aLongArray2[local364]) {
						if (local230 != Static1.anIntArray316[local364]) {
							Static1.anIntArray316[local364] = local230;
							Static1.aBoolean59 = true;
							if (local230 > 0) {
								Static53.method989(5, JagString.aClass40_445, Static72.method1334(new JagString[] { local1508, JagString.aClass40_505 }));
							}
							if (local230 == 0) {
								Static53.method989(5, JagString.aClass40_445, Static72.method1334(new JagString[] { local1508, JagString.aClass40_1 }));
							}
						}
						local1508 = null;
						break;
					}
				}
				@Pc(1581) boolean local1581 = false;
				if (local1508 != null && Static1.anInt2594 < 200) {
					Static1.aLongArray2[Static1.anInt2594] = local650;
					Static1.aClass40Array23[Static1.anInt2594] = local1508;
					Static1.anIntArray316[Static1.anInt2594] = local230;
					Static1.anInt2594++;
					Static1.aBoolean59 = true;
				}
				while (!local1581) {
					local1581 = true;
					for (local376 = 0; local376 < Static1.anInt2594 - 1; local376++) {
						if (worldId != Static1.anIntArray316[local376] && Static1.anIntArray316[local376 + 1] == worldId || Static1.anIntArray316[local376] == 0 && Static1.anIntArray316[local376 + 1] != 0) {
							local1581 = false;
							@Pc(1649) int local1649 = Static1.anIntArray316[local376];
							Static1.anIntArray316[local376] = Static1.anIntArray316[local376 + 1];
							Static1.anIntArray316[local376 + 1] = local1649;
							@Pc(1667) JagString local1667 = Static1.aClass40Array23[local376];
							Static1.aClass40Array23[local376] = Static1.aClass40Array23[local376 + 1];
							Static1.aClass40Array23[local376 + 1] = local1667;
							@Pc(1685) long local1685 = Static1.aLongArray2[local376];
							Static1.aLongArray2[local376] = Static1.aLongArray2[local376 + 1];
							Static1.aLongArray2[local376 + 1] = local1685;
							Static1.aBoolean59 = true;
						}
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 197) {
				Static56.method1039();
				packetType = -1;
				return false;
			}
			if (packetType == 36) {
				local125 = in.g2_alt1();
				local226 = in.g4s_alt3();
				local1170 = Static73.method1340(local226);
				if (local1170 != null && local1170.anInt1613 == 0) {
					if (local125 < 0) {
						local125 = 0;
					}
					if (local125 > local1170.anInt1601 - local1170.anInt1609) {
						local125 = local1170.anInt1601 - local1170.anInt1609;
					}
					local1170.anInt1587 = local125;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 26) {
				packetType = -1;
				JagString.aClass40_444 = JagString.aClass40_445;
				Static1.anInt2399 = 2;
				Static1.aBoolean146 = false;
				Static1.aBoolean144 = true;
				return true;
			}
			@Pc(1801) JagString local1801;
			@Pc(1822) JagString local1822;
			if (packetType == 3) {
				local1801 = in.gjstr();
				@Pc(1813) boolean local1813;
				if (local1801.method1195(JagString.aClass40_728)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Static1.anInt121; local359++) {
						if (local655 == Static1.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static1.anInt440 == 0) {
						Static53.method989(4, local1822, JagString.aClass40_14);
					}
				} else if (local1801.method1195(JagString.aClass40_654)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Static1.anInt121; local359++) {
						if (Static1.aLongArray4[local359] == local655) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static1.anInt440 == 0) {
						Static53.method989(8, local1822, JagString.aClass40_708);
					}
				} else if (local1801.method1195(Static1.aClass40_542)) {
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.method1179();
					local1813 = false;
					for (local359 = 0; local359 < Static1.anInt121; local359++) {
						if (local655 == Static1.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static1.anInt440 == 0) {
						@Pc(1923) JagString local1923 = local1801.method1180(local1801.method1169() - 9, local1801.method1200(JagString.aClass40_673) + 1);
						Static53.method989(8, local1822, local1923);
					}
				} else {
					Static53.method989(0, JagString.aClass40_445, local1801);
				}
				packetType = -1;
				return true;
			}
			if (packetType == 85) {
				local125 = in.g1_alt1();
				local1822 = in.gjstr();
				local230 = in.g1_alt2();
				if (local230 >= 1 && local230 <= 5) {
					if (local1822.method1199(JagString.aClass40_359)) {
						local1822 = null;
					}
					Static1.aClass40Array6[local230 - 1] = local1822;
					Static1.aBooleanArray41[local230 - 1] = local125 == 0;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 110) {
				Static86.method1495();
				packetType = -1;
				return true;
			}
			if (packetType == 128) {
				Static1.aBoolean59 = true;
				local125 = in.g4s();
				local836 = Static73.method1340(local125);
				local230 = in.g2();
				for (local355 = 0; local355 < local230; local355++) {
					local364 = in.g1_alt1();
					if (local364 == 255) {
						local364 = in.g4s();
					}
					local836.anIntArray331[local355] = in.g2_alt3();
					local836.anIntArray327[local355] = local364;
				}
				for (local364 = local230; local364 < local836.anIntArray331.length; local364++) {
					local836.anIntArray331[local364] = 0;
					local836.anIntArray327[local364] = 0;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 133) {
				local125 = in.g4s_alt1();
				local226 = in.g2_alt3();
				local1170 = Static73.method1340(local125);
				packetType = -1;
				local1170.anInt1607 = 1;
				local1170.anInt1602 = local226;
				return true;
			}
			if (packetType == 54) {
				Static1.anInt121 = packetSize / 8;
				for (local125 = 0; local125 < Static1.anInt121; local125++) {
					Static1.aLongArray4[local125] = in.g8();
				}
				packetType = -1;
				return true;
			}
			if (packetType == 38) {
				Static1.anInt1973 = in.g2_alt3() * 30;
				packetType = -1;
				return true;
			}
			if (packetType == 66) {
				Static1.anInt2328 = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 118 || packetType == 63 || packetType == 21 || packetType == 46 || packetType == 135 || packetType == 69 || packetType == 221 || packetType == 56 || packetType == 129 || packetType == 35 || packetType == 244) {
				Static3.method26();
				packetType = -1;
				return true;
			}
			if (packetType == 195) {
				local125 = in.g2_alt2();
				Static95.method1648(local125);
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = -1;
					Static1.aBoolean184 = true;
					Static1.aBoolean59 = true;
				}
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
					Static1.aBoolean144 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != local125) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = local125;
				}
				Static1.aBoolean40 = false;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 144) {
				// UPDATE_ZONE_FULL_FOLLOWS
				Static83.baseZ = in.g1_alt2();
				Static87.baseX = in.g1_alt3();
				for (local125 = Static87.baseX; local125 < Static87.baseX + 8; local125++) {
					for (local226 = Static83.baseZ; local226 < Static83.baseZ + 8; local226++) {
						if (Static1.levelObjStacks[Static1.currentLevel][local125][local226] != null) {
							Static1.levelObjStacks[Static1.currentLevel][local125][local226] = null;
							Static75.sortObjStacks(local226, local125);
						}
					}
				}
				for (@Pc(2420) LocTemporary loc = (LocTemporary) Static1.spawnedLocations.head(); loc != null; loc = (LocTemporary) Static1.spawnedLocations.next()) {
					if (Static87.baseX <= loc.x && loc.x < Static87.baseX + 8 && loc.z >= Static83.baseZ && Static83.baseZ + 8 > loc.z && loc.level == Static1.currentLevel) {
						loc.anInt826 = 0;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 239) {
				local125 = in.g2s_alt3();
				if (local125 >= 0) {
					Static95.method1648(local125);
				}
				if (local125 != Static1.anInt51) {
					Static75.method1350(Static1.anInt51);
					Static1.anInt51 = local125;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 202) {
				local125 = in.g4s_alt2();
				local226 = in.g2_alt3();
				local230 = local226 >> 10 & 0x1F;
				local355 = local226 >> 5 & 0x1F;
				local364 = local226 & 0x1F;
				@Pc(2530) ComType local2530 = Static73.method1340(local125);
				packetType = -1;
				local2530.anInt1584 = (local355 << 11) + (local230 << 19) + (local364 << 3);
				return true;
			}
			if (packetType == 243) {
				for (local125 = 0; local125 < Static54.anInt1505; local125++) {
					@Pc(2561) VarpType local2561 = Static90.method1568(local125);
					if (local2561 != null && local2561.anInt1076 == 0) {
						Static1.anIntArray288[local125] = 0;
						Static1.anIntArray339[local125] = 0;
					}
				}
				Static1.aBoolean59 = true;
				packetType = -1;
				if (Static1.anInt980 != -1) {
					Static1.aBoolean144 = true;
				}
				return true;
			}
			if (packetType == 181) {
				Static1.anInt2505 = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 180) {
				Static1.anInt583 = in.g1();
				Static1.anInt2515 = in.g1();
				Static1.anInt2491 = in.g1();
				Static1.aBoolean144 = true;
				packetType = -1;
				Static1.aBoolean95 = true;
				return true;
			}
			if (packetType == 121) {
				packetType = -1;
				Static1.anInt986 = 0;
				return true;
			}
			if (packetType == 53) {
				local1801 = in.gjstr();
				local226 = in.g4s_alt2();
				local1170 = Static73.method1340(local226);
				local1170.aClass40_466 = local1801;
				if (local226 >> 16 == Static1.anIntArray2[Static1.anInt1551]) {
					Static1.aBoolean59 = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 45) {
				Static1.aBoolean59 = true;
				local125 = in.g4s();
				local836 = Static73.method1340(local125);
				while (packetSize > in.pos) {
					local230 = in.gSmart1or2();
					local355 = in.g2();
					local364 = in.g1();
					if (local364 == 255) {
						local364 = in.g4s();
					}
					if (local230 >= 0 && local230 < local836.anIntArray331.length) {
						local836.anIntArray331[local230] = local355;
						local836.anIntArray327[local230] = local364;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 58) {
				local125 = in.g2_alt2();
				local226 = in.g2_alt1();
				local230 = in.g4s_alt1();
				local355 = in.g2_alt1();
				@Pc(2761) ComType local2761 = Static73.method1340(local230);
				local2761.anInt1579 = local125;
				packetType = -1;
				local2761.anInt1586 = local226;
				local2761.anInt1614 = local355;
				return true;
			}
			if (packetType == 24) {
				local125 = in.g2_alt3();
				local226 = in.g2_alt1();
				local230 = in.g4s_alt3();
				local234 = Static73.method1340(local230);
				local234.anInt1617 = (local125 << 16) + local226;
				packetType = -1;
				return true;
			}
			if (packetType == 25) {
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.aBoolean59 = true;
					Static1.anInt1654 = -1;
					Static1.aBoolean184 = true;
				}
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
					Static1.aBoolean144 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				packetType = -1;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				Static1.aBoolean40 = false;
				return true;
			}
			if (packetType == 252) {
				local125 = in.g1_alt1();
				local226 = in.g2_alt3();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Static1.anIntArray2[local125] != local226) {
					Static75.method1350(Static1.anIntArray2[local125]);
					Static1.anIntArray2[local125] = local226;
				}
				Static1.aBoolean59 = true;
				Static1.aBoolean184 = true;
				packetType = -1;
				return true;
			}
			if (packetType == 203) {
				Static1.anInt1038 = in.g1();
				Static1.aBoolean59 = true;
				packetType = -1;
				return true;
			}
			if (packetType == 71) {
				local650 = in.g8();
				@Pc(2944) JagString local2944 = Static7.method192(in).method1166();
				Static53.method989(6, Static44.method819(local650).method1167(), local2944);
				packetType = -1;
				return true;
			}
			if (packetType == 163) {
				local125 = in.g2_alt2();
				local226 = in.g2_alt3();
				Static95.method1648(local226);
				if (local125 != -1) {
					Static95.method1648(local125);
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				if (Static1.anInt1654 != -1) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = -1;
				}
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.anInt1994 = -1;
				}
				if (Static1.anInt1971 != local226) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = local226;
					Static7.method187(35);
				}
				if (local226 != Static1.anInt2175) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = local125;
				}
				Static1.aBoolean40 = false;
				packetType = -1;
				Static1.anInt2399 = 0;
				return true;
			}
			if (packetType == 80) {
				local125 = in.g4s();
				local226 = in.g2();
				Static1.anIntArray288[local226] = local125;
				if (local125 != Static1.anIntArray339[local226]) {
					Static1.anIntArray339[local226] = local125;
					Static21.method1700(local226);
					if (Static1.anInt980 != -1) {
						Static1.aBoolean144 = true;
					}
					Static1.aBoolean59 = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 223) {
				Static83.baseZ = in.g1_alt3();
				Static87.baseX = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 102) {
				local125 = in.g2_alt2();
				Static95.method1648(local125);
				if (Static1.anInt1994 != -1) {
					Static75.method1350(Static1.anInt1994);
					Static1.aBoolean144 = true;
					Static1.anInt1994 = -1;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (Static1.anInt2585 != -1) {
					Static75.method1350(Static1.anInt2585);
					Static1.anInt2585 = -1;
				}
				if (local125 != Static1.anInt1654) {
					Static75.method1350(Static1.anInt1654);
					Static1.anInt1654 = local125;
				}
				Static1.aBoolean184 = true;
				Static1.aBoolean40 = false;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					Static1.aBoolean144 = true;
				}
				packetType = -1;
				Static1.aBoolean59 = true;
				return true;
			}
			if (packetType == 194) {
				local125 = in.g2_alt2();
				@Pc(3171) byte local3171 = in.g1b_alt3();
				Static1.anIntArray288[local125] = local3171;
				if (local3171 != Static1.anIntArray339[local125]) {
					Static1.anIntArray339[local125] = local3171;
					Static21.method1700(local125);
					if (Static1.anInt980 != -1) {
						Static1.aBoolean144 = true;
					}
					Static1.aBoolean59 = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 255) {
				local125 = in.g1();
				local226 = in.g1();
				local230 = in.g1();
				local355 = in.g1();
				Static1.aBooleanArray35[local125] = true;
				Static1.anIntArray93[local125] = local226;
				Static1.anIntArray164[local125] = local230;
				Static1.anIntArray159[local125] = local355;
				Static1.anIntArray415[local125] = 0;
				packetType = -1;
				return true;
			}
			if (packetType == 213) {
				local125 = in.g4s_alt1();
				local226 = in.g2s_alt1();
				local1170 = Static73.method1340(local125);
				packetType = -1;
				if (local226 != local1170.anInt1574 || local226 == -1) {
					local1170.anInt1569 = 0;
					local1170.anInt1574 = local226;
					local1170.anInt1593 = 0;
				}
				return true;
			}
			JagException.report("T1 - " + packetType + "," + lastPacketType1 + "," + lastPacketType2 + " - " + packetSize, null);
			Static56.method1039();
		} catch (@Pc(3308) IOException local3308) {
			Static32.method626();
		} catch (@Pc(3312) Exception local3312) {
			@Pc(3352) String local3352 = "T2 - " + packetType + "," + lastPacketType1 + "," + lastPacketType2 + " - " + packetSize + "," + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] + Static79.anInt2058) + "," + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] + Static28.anInt725) + " - ";
			for (local226 = 0; local226 < packetSize && local226 < 50; local226++) {
				local3352 = local3352 + in.data[local226] + ",";
			}
			JagException.report(local3352, local3312);
			Static56.method1039();
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 39)
	public static void setLowMemory() {
		Static1.lowDetail = true;
		World3D.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 313)
	public static void setHighMemory() {
		World3D.aBoolean163 = false;
		Static1.lowDetail = false;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 645)
	public static void printUsage() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
		System.exit(1);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 4)
	@Override
	protected void method330() {
		if (state == 0) {
			Static83.method1467(null, JagString.aClass40_680, Static1.anInt2194);
		} else if (state == 5) {
			Static93.method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, Static23.aGraphics1, Static13.aClass2_Sub2_Sub2_Sub2_1);
		} else if (state == 10) {
			Static93.method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, Static23.aGraphics1, Static13.aClass2_Sub2_Sub2_Sub2_1);
		} else if (state == 20) {
			Static93.method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, Static23.aGraphics1, Static13.aClass2_Sub2_Sub2_Sub2_1);
		} else if (state == 25) {
			@Pc(97) int local97;
			if (Static1.anInt375 == 1) {
				if (Static1.anInt805 < Static1.anInt1080) {
					Static1.anInt805 = Static1.anInt1080;
				}
				local97 = (Static1.anInt805 - Static1.anInt1080) * 50 / Static1.anInt805;
				Static61.method1095(true, Static72.method1334(new JagString[] { JagString.aClass40_63, Static48.method859(local97), JagString.aClass40_335 }), JagString.aClass40_674);
			} else if (Static1.anInt375 == 2) {
				if (Static1.anInt2455 < Static1.anInt1667) {
					Static1.anInt2455 = Static1.anInt1667;
				}
				local97 = (Static1.anInt2455 - Static1.anInt1667) * 50 / Static1.anInt2455 + 50;
				Static61.method1095(true, Static72.method1334(new JagString[] { JagString.aClass40_63, Static48.method859(local97), JagString.aClass40_335 }), JagString.aClass40_674);
			} else {
				Static61.method1095(false, null, JagString.aClass40_674);
			}
		} else if (state == 30) {
			Static86.method1489();
		} else if (state == 35) {
			Static86.method1492();
		} else if (state == 40) {
			Static61.method1095(false, JagString.aClass40_13, JagString.aClass40_714);
		}
		Static1.anInt2326 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 92)
	private void setJs5ErrorState(@OriginalArg(1) int arg0) {
		js5ConnectState = 0;
		js5ErrorCount++;
		if (Static88.anInt2341 == Static54.anInt1500) {
			Static54.anInt1500 = Static47.anInt1173;
		} else {
			Static54.anInt1500 = Static88.anInt2341;
		}
		Static27.js5Stream = null;
		Static72.aClass48_7 = null;
		if (js5ErrorCount >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (state > 5) {
				Static1.anInt1097 = 3000;
			} else {
				this.error("js5connect_full");
				state = 1000;
			}
		} else if (js5ErrorCount >= 2 && arg0 == 6) {
			this.error("js5connect_outofdate");
			state = 1000;
		} else if (js5ErrorCount >= 4) {
			if (state <= 5) {
				this.error("js5connect");
				state = 1000;
			} else {
				Static1.anInt1097 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 150)
	@Override
	protected void method327() {
		Static88.anInt2341 = modeWhere == 0 ? 43594 : worldId + 40000;
		Static54.anInt1500 = Static88.anInt2341;
		Static47.anInt1173 = modeWhere == 0 ? 443 : worldId + 50000;
		Static51.method1538();
		Static35.method712(Static7.method185());
		Static62.method1097(Static7.method185());
		Static95.anInt2495 = Static1.anInt248;
		try {
			@Pc(55) int local55;
			if (GameShell.signlink.cacheData != null) {
				Static61.cacheDat = new BufferedFile(GameShell.signlink.cacheData, 5200, 0);
				for (int i = 0; i < 12; i++) {
					Static1.cacheIndex[i] = new BufferedFile(GameShell.signlink.cacheIndexes[i], 6000, 0);
				}
				Static97.cacheMasterIndex = new BufferedFile(GameShell.signlink.cacheMasterIndex, 6000, 0);
				Static68.masterCache = new Cache(255, Static61.cacheDat, Static97.cacheMasterIndex, 500000);
				GameShell.signlink.cacheMasterIndex = null;
				GameShell.signlink.cacheData = null;
				GameShell.signlink.cacheIndexes = null;
			}
			if (GameShell.signlink.legacyCacheData != null) {
				Static9.legacyCacheDat = new BufferedFile(GameShell.signlink.legacyCacheData, 5200, 0);
				for (local55 = 0; local55 < 5; local55++) {
					Static1.legacyCacheIndex[local55] = new BufferedFile(GameShell.signlink.legacyCacheIndex[local55], 6000, 0);
				}
				GameShell.signlink.legacyCacheData = null;
				GameShell.signlink.legacyCacheIndex = null;
			}
		} catch (@Pc(144) IOException local144) {
			Static61.cacheDat = null;
			Static9.legacyCacheDat = null;
			Static97.cacheMasterIndex = null;
			Static68.masterCache = null;
		}
		if (modeWhere != 0) {
			Static1.aBoolean173 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 221)
	private void method342() {
		if (state != 1000) {
			@Pc(10) boolean local10 = Static32.method625();
			if (!local10) {
				this.method343();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 293)
	@Override
	public void init() {
		if (!this.isValidHost()) {
			return;
		}
		worldId = Integer.parseInt(this.getParameter("worldid"));
		modeWhat = Integer.parseInt(this.getParameter("modewhat"));
		modeWhere = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String lowmem = this.getParameter("lowmem");
		if (lowmem != null && lowmem.equals("1")) {
			setLowMemory();
		} else {
			setHighMemory();
		}
		@Pc(45) String members = this.getParameter("members");
		if (members != null && members.equals("1")) {
			membersWorld = true;
		} else {
			membersWorld = false;
		}
		this.initApplet(modeWhat + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 334)
	private void method343() {
		if (Static1.anInt1792 >= 4) {
			this.error("js5crc");
			state = 1000;
			return;
		}
		if (Static1.anInt2401 >= 4) {
			if (state <= 5) {
				this.error("js5io");
				state = 1000;
				return;
			}
			Static1.anInt2401 = 3;
			Static1.anInt1097 = 3000;
		}
		if (Static1.anInt1097-- > 0) {
			return;
		}
		try {
			if (js5ConnectState == 0) {
				Static72.aClass48_7 = GameShell.signlink.method202(Static54.anInt1500);
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				if (Static72.aClass48_7.status == 2) {
					this.setJs5ErrorState(-1);
					return;
				}
				if (Static72.aClass48_7.status == 1) {
					js5ConnectState++;
				}
			}
			if (js5ConnectState == 2) {
				Static27.js5Stream = new ClientStream((Socket) Static72.aClass48_7.result, GameShell.signlink);
				@Pc(103) Packet buf = new Packet(5);
				buf.p1(15);
				buf.p4(410);
				Static27.js5Stream.write(buf.data, 5);
				js5ConnectState++;
				Static11.aLong24 = System.currentTimeMillis();
			}
			if (js5ConnectState == 3) {
				if (state <= 5 || Static27.js5Stream.available() > 0) {
					@Pc(142) int local142 = Static27.js5Stream.method726();
					if (local142 != 0) {
						this.setJs5ErrorState(local142);
						return;
					}
					js5ConnectState++;
				} else if (System.currentTimeMillis() - Static11.aLong24 > 30000L) {
					this.setJs5ErrorState(-2);
					return;
				}
			}
			if (js5ConnectState == 4) {
				Static73.method1336(Static27.js5Stream, state > 20);
				js5ErrorCount = 0;
				Static72.aClass48_7 = null;
				Static27.js5Stream = null;
				js5ConnectState = 0;
			}
		} catch (@Pc(196) IOException local196) {
			this.setJs5ErrorState(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 455)
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 5) {
				printUsage();
			}
			worldId = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				modeWhere = 0;
			} else if (arg0[1].equals("office")) {
				modeWhere = 1;
			} else if (arg0[1].equals("local")) {
				modeWhere = 2;
			} else {
				printUsage();
			}
			if (arg0[2].equals("live")) {
				modeWhat = 0;
			} else if (arg0[2].equals("rc")) {
				modeWhat = 1;
			} else if (arg0[2].equals("wip")) {
				modeWhat = 2;
			} else {
				printUsage();
			}
			if (arg0[3].equals("lowmem")) {
				setLowMemory();
			} else if (arg0[3].equals("highmem")) {
				setHighMemory();
			} else {
				printUsage();
			}
			if (arg0[4].equals("free")) {
				membersWorld = false;
			} else if (arg0[4].equals("members")) {
				membersWorld = true;
			} else {
				printUsage();
			}
			@Pc(124) client cl = new client();
			cl.initApplication("runescape", modeWhat + 32, InetAddress.getLocalHost());
		} catch (@Pc(138) Exception ex) {
			JagException.report(null, ex);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 569)
	@Override
	protected void unload() {
		Static15.method344();
		Static66.method1170();
		Static63.method325();
		Static83.method1466();
		Static71.method1278();
		Static70.method1472();
		Static46.method847();
		Static76.method1358();
		Static21.method1689();
		Static36.method733();
		Static4.method96();
		Static16.method345();
		Static12.method254();
		Static88.method1554();
		Static98.method1738();
		Static103.method571();
		Static81.method1431();
		Static26.method541();
		Static49.method919();
		Static69.method1219();
		Static58.method1058();
		Static82.method1464();
		Static55.method1003();
		Static51.method1546();
		Static33.method635();
		Static31.method613();
		Static7.method191();
		Static29.method1679();
		Static10.method234();
		Static34.method642();
		Static43.method1635();
		Static91.method70();
		Static72.method1328();
		Static24.method525();
		Static65.method1150();
		Static13.method263();
		Static64.method1112();
		Static61.method1093();
		Static80.method1405();
		Static45.method1531();
		Static90.method1569();
		Static1.method5();
		Static3.method24();
		Static74.method1346();
		Static109.method1102();
		Static47.method852();
		Static95.method1652();
		Static77.method1363();
		Static86.method1498();
		Static99.method1653();
		Static2.method20();
		Static96.method1666();
		Static67.method1206();
		Static38.method753();
		Static54.method994();
		Draw3D.unload();
		Static25.method1605();
		Static56.method1041();
		Static27.method581();
		Static62.method1096();
		Static22.method474();
		Static94.method1643();
		Static92.method1580();
		Static39.method775();
		Static35.method720();
		Static79.method1398();
		Static23.method506();
		Static5.method118();
		Static41.method790();
		Static20.method398();
		Static37.method740();
		Static68.method1211();
		Static28.method584();
		Static73.method1339();
		Static85.method1488();
		Static106.method842();
		Static9.method229();
		Static50.method940();
		Static87.method1520();
		Static18.method368();
		Static53.method991();
		Static78.method1382();
		Static57.method1043();
		Static32.method622();
		Static42.method802();
		Static19.method386();
		Static84.method1482();
		Static75.method1352();
		Static59.method1064();
		Static97.method1670();
		Static111.method1272();
		Static93.method1591();
		Static105.method804();
		Static30.method593();
		Static48.method858();
		Static40.method1245();
		Static11.method250();
		Static104.method1086();
		Static60.method1092();
		Static17.method356();
		Static89.method1562();
		Static14.method1264();
		Static100.method224();
		Static44.method823();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 686)
	@Override
	protected void mainQuit() {
		if (Static41.aClass52_1 != null) {
			Static41.aClass52_1.running = false;
		}
		Static41.aClass52_1 = null;
		if (stream != null) {
			stream.method730();
		}
		Static45.method1530();
		Static51.method1541();
		Static86.method1493();
		Static7.method183();
		Static88.method1550();
		Static71.method1279();
		try {
			if (Static61.cacheDat != null) {
				Static61.cacheDat.method353();
			}
			@Pc(43) int local43;
			if (Static1.cacheIndex != null) {
				for (local43 = 0; local43 < Static1.cacheIndex.length; local43++) {
					if (Static1.cacheIndex[local43] != null) {
						Static1.cacheIndex[local43].method353();
					}
				}
			}
			if (Static97.cacheMasterIndex != null) {
				Static97.cacheMasterIndex.method353();
			}
			if (Static9.legacyCacheDat != null) {
				Static9.legacyCacheDat.method353();
			}
			if (Static1.legacyCacheIndex != null) {
				for (local43 = 0; local43 < Static1.legacyCacheIndex.length; local43++) {
					if (Static1.legacyCacheIndex[local43] != null) {
						Static1.legacyCacheIndex[local43].method353();
					}
				}
			}
		} catch (@Pc(95) IOException local95) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 779)
	@Override
	protected void method329() {
		Static1.anInt2511++;
		this.method342();
		Static73.method1341();
		Static86.method1500();
		Static16.method347();
		Static62.method1101();
		Static49.method916();
		if (state == 0) {
			Static95.method1647();
			Static24.method524();
		} else if (state == 5) {
			Static95.method1647();
			Static24.method524();
		} else if (state == 10) {
			Static51.method1548();
		} else if (state == 20) {
			Static51.method1548();
			Static40.method1246();
		} else if (state == 25) {
			Static67.method1205();
		}
		if (state == 30) {
			Static84.method1479();
		} else if (state == 35) {
			Static84.method1479();
		} else if (state == 40) {
			Static40.method1246();
		}
	}
}

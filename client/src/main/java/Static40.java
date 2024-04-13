import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ad;")
	public static Js5 animsJs5;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt1849;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
	public static boolean aBoolean150;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 254)
	public static void method1245() {
		client.aClass2_Sub2_Sub2_Sub4_7 = null;
		FloorUnderlayType.config = null;
		animsJs5 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 271)
	public static void method1246() {
		try {
			if (Static1.anInt693 == 0) {
				Static1.aBoolean164 = false;
				Static1.anInt2039 = 0;
				Static48.aClass48_5 = null;
				Static1.anInt693 = 1;
				client.stream = null;
			}
			if (Static1.anInt693 == 1) {
				if (Static48.aClass48_5 == null) {
					Static48.aClass48_5 = GameShell.signlink.method202(Static54.anInt1500);
				}
				if (Static48.aClass48_5.status == 2) {
					throw new IOException();
				}
				if (Static48.aClass48_5.status == 1) {
					client.stream = new ClientStream((Socket) Static48.aClass48_5.result, GameShell.signlink);
					Static48.aClass48_5 = null;
					Static1.anInt693 = 2;
				}
			}
			if (Static1.anInt693 == 2) {
				@Pc(71) long local71 = Static94.aLong150 = JagString.aClass40_591.toBase37();
				client.out.pos = 0;
				@Pc(81) int local81 = (int) (local71 >> 16 & 0x1FL);
				client.out.p1(14);
				client.out.p1(local81);
				client.stream.write(client.out.data, 2);
				Static1.anInt693 = 3;
				client.in.pos = 0;
			}
			@Pc(108) int local108;
			if (Static1.anInt693 == 3) {
				local108 = client.stream.method726();
				if (local108 != 0) {
					Static88.method1552(local108);
					return;
				}
				Static1.anInt693 = 4;
				client.in.pos = 0;
			}
			if (Static1.anInt693 == 4) {
				if (client.in.pos < 8) {
					local108 = client.stream.available();
					if (local108 > 8 - client.in.pos) {
						local108 = 8 - client.in.pos;
					}
					if (local108 > 0) {
						client.stream.read(client.in.pos, local108, client.in.data);
						client.in.pos += local108;
					}
				}
				if (client.in.pos == 8) {
					client.in.pos = 0;
					Static1.aLong139 = client.in.g8();
					Static1.anInt693 = 5;
				}
			}
			if (Static1.anInt693 == 5) {
				@Pc(185) int[] local185 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static1.aLong139 >> 32), (int) Static1.aLong139 };
				client.out.pos = 0;
				client.out.p1(10);
				client.out.p4(local185[0]);
				client.out.p4(local185[1]);
				client.out.p4(local185[2]);
				client.out.p4(local185[3]);
				client.out.p4(GameShell.signlink.anInt249);
				client.out.p8(JagString.aClass40_591.toBase37());
				client.out.pjstr(JagString.aClass40_587);
				client.out.rsaenc(Static1.aBigInteger2, Static1.aBigInteger1);
				Static1.aClass2_Sub3_Sub1_3.pos = 0;
				if (client.state == 40) {
					Static1.aClass2_Sub3_Sub1_3.p1(18);
				} else {
					Static1.aClass2_Sub3_Sub1_3.p1(16);
				}
				Static1.aClass2_Sub3_Sub1_3.p1(client.out.pos + 53);
				Static1.aClass2_Sub3_Sub1_3.p4(410);
				Static1.aClass2_Sub3_Sub1_3.p1(client.lowMemory ? 1 : 0);
				Static1.aClass2_Sub3_Sub1_3.p4(animsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static79.basesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(client.configJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static26.interfacesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static33.synthSoundsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static34.mapsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static77.midiSongsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static24.modelsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static74.spritesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static33.texturesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static73.binaryJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(Static68.midiJinglesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.pdata(client.out.data, client.out.pos);
				client.stream.write(Static1.aClass2_Sub3_Sub1_3.data, Static1.aClass2_Sub3_Sub1_3.pos);
				client.out.setSeed(local185);
				for (@Pc(379) int local379 = 0; local379 < 4; local379++) {
					local185[local379] += 50;
				}
				client.in.setSeed(local185);
				Static1.anInt693 = 6;
			}
			if (Static1.anInt693 == 6 && client.stream.available() > 0) {
				local108 = client.stream.method726();
				if (local108 == 21 && client.state == 20) {
					Static1.anInt693 = 7;
				} else if (local108 == 2) {
					Static1.anInt693 = 9;
				} else if (local108 == 15 && client.state == 40) {
					Static80.method1406();
					return;
				} else if (local108 == 23 && Static1.anInt1649 < 1) {
					Static1.anInt1649++;
					Static1.anInt693 = 0;
				} else {
					Static88.method1552(local108);
					return;
				}
			}
			if (Static1.anInt693 == 7 && client.stream.available() > 0) {
				Static1.anInt261 = (client.stream.method726() + 3) * 60;
				Static1.anInt693 = 8;
			}
			if (Static1.anInt693 == 8) {
				Static1.anInt2039 = 0;
				Static45.method1537(JagString.aClass40_314, JagString.concatenate(new JagString[] { JagString.aClass40_623, Static48.method859(Static1.anInt261 / 60) }));
				if (--Static1.anInt261 <= 0) {
					Static1.anInt693 = 0;
				}
			} else {
				if (Static1.anInt693 == 9 && client.stream.available() >= 8) {
					Static1.anInt1550 = client.stream.method726();
					Static1.aBoolean149 = client.stream.method726() == 1;
					Static1.anInt1955 = client.stream.method726();
					Static1.anInt1955 <<= 0x8;
					Static1.anInt1955 += client.stream.method726();
					client.anInt927 = client.stream.method726();
					client.stream.read(0, 1, client.in.data);
					client.in.pos = 0;
					client.packetType = client.in.gIsaac1();
					client.stream.read(0, 2, client.in.data);
					client.in.pos = 0;
					client.packetSize = client.in.g2();
					Static1.anInt693 = 10;
				}
				if (Static1.anInt693 != 10) {
					Static1.anInt2039++;
					if (Static1.anInt2039 > 2000) {
						if (Static1.anInt1649 < 1) {
							Static1.anInt1649++;
							if (Static54.anInt1500 == Static88.anInt2341) {
								Static54.anInt1500 = Static47.anInt1173;
							} else {
								Static54.anInt1500 = Static88.anInt2341;
							}
							Static1.anInt693 = 0;
						} else {
							Static88.method1552(-3);
						}
					}
				} else if (client.stream.available() >= client.packetSize) {
					client.in.pos = 0;
					client.stream.read(0, client.packetSize, client.in.data);
					Static97.method1671();
					Static51.anInt2327 = -1;
					Static91.method58(false);
					client.packetType = -1;
				}
			}
		} catch (@Pc(661) IOException local661) {
			if (Static1.anInt1649 < 1) {
				if (Static54.anInt1500 == Static88.anInt2341) {
					Static54.anInt1500 = Static47.anInt1173;
				} else {
					Static54.anInt1500 = Static88.anInt2341;
				}
				Static1.anInt1649++;
				Static1.anInt693 = 0;
			} else {
				Static88.method1552(-2);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 590)
	public static void method1247() {
		Static11.aClass45_6.bind();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I", line = 602)
	public static int method1248(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}
}

import java.awt.event.KeyEvent;
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

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!vb;")
	public static Pix24 aClass2_Sub2_Sub2_Sub4_7;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Z")
	public static boolean aBoolean150;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 3)
	public static void method1239() {
		Static1.anInt440 = 0;
		@Pc(17) int local17 = (client.localPlayer.x >> 7) + Static79.anInt2058;
		@Pc(24) int local24 = Static28.anInt725 + (client.localPlayer.z >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static1.anInt440 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static1.anInt440 = 1;
		}
		if (Static1.anInt440 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static1.anInt440 = 0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!ke;)V", line = 32)
	public static void method1240(@OriginalArg(1) PathingEntity arg0) {
		arg0.anInt2318 = arg0.anInt2290;
		if (arg0.anInt2309 == 0) {
			arg0.anInt2282 = 0;
			return;
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2313 == 0) {
			@Pc(29) SeqType local29 = SeqType.method1042(arg0.anInt2307);
			if (arg0.anInt2281 > 0 && local29.anInt663 == 0) {
				arg0.anInt2282++;
				return;
			}
			if (arg0.anInt2281 <= 0 && local29.anInt666 == 0) {
				arg0.anInt2282++;
				return;
			}
		}
		@Pc(68) int local68 = arg0.z;
		@Pc(71) int local71 = arg0.x;
		@Pc(87) int local87 = arg0.pathTileX[arg0.anInt2309 - 1] * 128 + arg0.size * 64;
		@Pc(102) int local102 = arg0.size * 64 + arg0.pathTileZ[arg0.anInt2309 - 1] * 128;
		if (local87 - local71 > 256 || local87 - local71 < -256 || local102 - local68 > 256 || local102 - local68 < -256) {
			arg0.x = local87;
			arg0.z = local102;
			return;
		}
		if (local71 < local87) {
			if (local102 > local68) {
				arg0.anInt2283 = 1280;
			} else if (local102 >= local68) {
				arg0.anInt2283 = 1536;
			} else {
				arg0.anInt2283 = 1792;
			}
		} else if (local87 < local71) {
			if (local102 > local68) {
				arg0.anInt2283 = 768;
			} else if (local102 < local68) {
				arg0.anInt2283 = 256;
			} else {
				arg0.anInt2283 = 512;
			}
		} else if (local68 >= local102) {
			arg0.anInt2283 = 0;
		} else {
			arg0.anInt2283 = 1024;
		}
		@Pc(216) int local216 = arg0.anInt2283 - arg0.anInt2305 & 0x7FF;
		if (local216 > 1024) {
			local216 -= 2048;
		}
		@Pc(225) int local225 = arg0.anInt2303;
		@Pc(227) int local227 = 4;
		if (arg0.anInt2305 != arg0.anInt2283 && arg0.anInt2324 == -1 && arg0.anInt2285 != 0) {
			local227 = 2;
		}
		if (local216 >= -256 && local216 <= 256) {
			local225 = arg0.anInt2269;
		} else if (local216 >= 256 && local216 < 768) {
			local225 = arg0.anInt2322;
		} else if (local216 >= -768 && local216 <= -256) {
			local225 = arg0.anInt2304;
		}
		if (local225 == -1) {
			local225 = arg0.anInt2269;
		}
		arg0.anInt2318 = local225;
		if (arg0.anInt2309 > 2) {
			local227 = 6;
		}
		if (arg0.anInt2309 > 3) {
			local227 = 8;
		}
		if (arg0.anInt2282 > 0 && arg0.anInt2309 > 1) {
			arg0.anInt2282--;
			local227 = 8;
		}
		if (arg0.aBooleanArray34[arg0.anInt2309 - 1]) {
			local227 <<= 0x1;
		}
		if (local71 < local87) {
			arg0.x += local227;
			if (local87 < arg0.x) {
				arg0.x = local87;
			}
		} else if (local71 > local87) {
			arg0.x -= local227;
			if (local87 > arg0.x) {
				arg0.x = local87;
			}
		}
		if (local102 > local68) {
			arg0.z += local227;
			if (arg0.z > local102) {
				arg0.z = local102;
			}
		} else if (local68 > local102) {
			arg0.z -= local227;
			if (local102 > arg0.z) {
				arg0.z = local102;
			}
		}
		if (arg0.x == local87 && arg0.z == local102) {
			if (arg0.anInt2281 > 0) {
				arg0.anInt2281--;
			}
			arg0.anInt2309--;
		}
		if (local227 >= 8 && arg0.anInt2318 == arg0.anInt2269 && arg0.anInt2273 != -1) {
			arg0.anInt2318 = arg0.anInt2273;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 234)
	public static int method1243(@OriginalArg(0) KeyEvent arg0) {
		@Pc(10) int local10 = arg0.getKeyChar();
		if (local10 <= 0 || local10 >= 256) {
			local10 = -1;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 254)
	public static void method1245() {
		aClass2_Sub2_Sub2_Sub4_7 = null;
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
				Static1.aClass2_Sub3_Sub1_3.p4(Static5.configJs5.crc);
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

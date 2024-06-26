package jagex2;

import jagex2.config.ComType;
import jagex2.dash3d.entity.NpcEntity;
import jagex2.datastruct.HashTable;
import jagex2.graphics.Pix24;
import jagex2.io.ClientStream;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!hc;")
	public static ClientStream aClass25_20;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_8;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public static int anInt840;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!ba;")
	public static HashTable aClass6_2 = new HashTable(4096);

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_256 = Static13.method257("backhmid2");

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_257 = Static13.method257("Malformed login packet)3");

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_258 = Static13.method257("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "[I")
	public static int[] anIntArray163 = new int[4000];

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
	public static int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!h", name = "p", descriptor = "[I")
	public static int[] anIntArray165 = new int[500];

	@OriginalMember(owner = "client!h", name = "q", descriptor = "[I")
	public static int[] anIntArray166 = new int[100];

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
	public static final boolean aBoolean60 = false;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BZ)V")
	public static void pushNpcs(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int i = 0; i < Static73.anInt1800; i++) {
			@Pc(20) NpcEntity npc = Static2.npcs[Static63.anIntArray326[i]];
			@Pc(29) int bitset = (Static63.anIntArray326[i] << 14) + 536870912;
			if (npc != null && npc.isVisible() && npc.type.aBoolean57 == arg0 && npc.type.method606()) {
				@Pc(50) int x = npc.x >> 7;
				@Pc(55) int z = npc.z >> 7;
				if (x >= 0 && x < 104 && z >= 0 && z < 104) {
					if (npc.size == 1 && (npc.x & 0x7F) == 64 && (npc.z & 0x7F) == 64) {
						if (Static22.sceneCycle == Static14.tileLastOccupiedCycle[x][z]) {
							continue;
						}
						Static14.tileLastOccupiedCycle[x][z] = Static22.sceneCycle;
					}
					if (!npc.type.aBoolean58) {
						bitset += Integer.MIN_VALUE;
					}
					Static93.scene.addTemporary(Static1.currentLevel, npc.x, npc.z, Static86.method1383(Static1.currentLevel, npc.x, npc.z), npc.size * 64 + 60 - 64, npc, npc.anInt2305, bitset, npc.aBoolean172);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method637() {
		for (@Pc(7) int local7 = 0; local7 < Static4.waveCount; local7++) {
			@Pc(13) int local13 = Static5.anIntArray36[local7]--;
			if (Static5.anIntArray36[local7] >= -10) {
				@Pc(72) Class43 local72 = Static75.aClass43Array1[local7];
				if (local72 == null) {
					local72 = Static112.method1214(Static35.aClass5_Sub1_7, Static96.anIntArray497[local7]);
					if (local72 == null) {
						continue;
					}
					Static5.anIntArray36[local7] += local72.method1215();
					Static75.aClass43Array1[local7] = local72;
				}
				if (Static5.anIntArray36[local7] < 0) {
					@Pc(109) Class2_Sub4_Sub1 local109 = local72.method1216().method491(Static11.aClass56_1);
					@Pc(114) Class2_Sub10_Sub1 local114 = Static111.method1032(local109, Static98.wavevol);
					local114.method1027(Static13.waveLoops[local7] - 1);
					Static88.aClass2_Sub10_Sub2_1.method1289(local114);
					Static5.anIntArray36[local7] = -100;
				}
			} else {
				Static4.waveCount--;
				for (@Pc(27) int local27 = local7; local27 < Static4.waveCount; local27++) {
					Static96.anIntArray497[local27] = Static96.anIntArray497[local27 + 1];
					Static75.aClass43Array1[local27] = Static75.aClass43Array1[local27 + 1];
					Static13.waveLoops[local27] = Static13.waveLoops[local27 + 1];
					Static5.anIntArray36[local27] = Static5.anIntArray36[local27 + 1];
				}
				local7--;
			}
		}
		if (Static20.anInt470 <= 0) {
			return;
		}
		Static20.anInt470 -= 20;
		if (Static20.anInt470 < 0) {
			Static20.anInt470 = 0;
		}
		if (Static20.anInt470 == 0 && Static7.anInt239 != 0 && Static84.anInt1977 != -1) {
			Static94.method1499(0, Static84.anInt1977, Static85.aClass5_Sub1_17, Static7.anInt239);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ud;Lclient!o;Lclient!o;)[Lclient!vb;")
	public static Pix24[] method638(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(12) int local12 = arg0.method80(arg1);
		@Pc(18) int local18 = arg0.method72(arg2, local12);
		return Static99.method79(arg0, local18, local12);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mc;I)Z")
	public static boolean method639(@OriginalArg(0) ComType arg0) {
		@Pc(6) int local6 = arg0.clientCode;
		if (Static42.anInt1038 == 2) {
			if (local6 == 201) {
				Static61.aClass40_453 = Static12.aClass40_79;
				Static101.anInt2399 = 0;
				Static93.anInt2180 = 1;
				Static73.redrawChatback = true;
				Static61.aClass40_447 = Static61.aClass40_445;
				Static74.aBoolean146 = true;
			}
			if (local6 == 202) {
				Static93.anInt2180 = 2;
				Static74.aBoolean146 = true;
				Static61.aClass40_447 = Static61.aClass40_445;
				Static61.aClass40_453 = Static19.aClass40_122;
				Static101.anInt2399 = 0;
				Static73.redrawChatback = true;
			}
		}
		if (local6 == 205) {
			Static67.anInt1672 = 250;
			return true;
		}
		if (local6 == 501) {
			Static101.anInt2399 = 0;
			Static93.anInt2180 = 4;
			Static61.aClass40_453 = Static17.aClass40_113;
			Static74.aBoolean146 = true;
			Static61.aClass40_447 = Static61.aClass40_445;
			Static73.redrawChatback = true;
		}
		if (local6 == 502) {
			Static101.anInt2399 = 0;
			Static73.redrawChatback = true;
			Static61.aClass40_447 = Static61.aClass40_445;
			Static74.aBoolean146 = true;
			Static61.aClass40_453 = Static13.aClass40_82;
			Static93.anInt2180 = 5;
		}
		@Pc(98) int local98;
		@Pc(92) int local92;
		if (local6 >= 300 && local6 <= 313) {
			local92 = local6 & 0x1;
			local98 = (local6 - 300) / 2;
			Static38.aClass33_1.method1004(local92 == 1, local98);
		}
		if (local6 >= 314 && local6 <= 323) {
			local98 = (local6 - 314) / 2;
			local92 = local6 & 0x1;
			Static38.aClass33_1.method1009(local98, local92 == 1);
		}
		if (local6 == 324) {
			Static38.aClass33_1.method1002(false);
		}
		if (local6 == 325) {
			Static38.aClass33_1.method1002(true);
		}
		if (local6 == 326) {
			Static80.out.p1isaac(12);
			Static38.aClass33_1.method1007(Static80.out);
			return true;
		}
		if (local6 == 620) {
			Static54.aBoolean103 = !Static54.aBoolean103;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static60.method998();
			if (Static61.reportAbuseInput.method1169() > 0) {
				Static80.out.p1isaac(72);
				Static80.out.p8(Static61.reportAbuseInput.toBase37());
				Static80.out.p1(local6 - 601);
				Static80.out.p1(Static54.aBoolean103 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class2_Sub2_Sub7 method640(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub7 local18 = (Class2_Sub2_Sub7) Static61.aClass47_14.get((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static34.aClass5_11.method68(arg0, 9);
		local18 = new Class2_Sub2_Sub7();
		local18.anInt762 = arg0;
		if (local28 != null) {
			local18.method608(new Packet(local28));
		}
		local18.method612();
		Static61.aClass47_14.put((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	public static void method641(@OriginalArg(1) int arg0) {
		if (!Static70.method1110()) {
			return;
		}
		if (Static15.aBoolean151) {
			Static70.anInt1696 = arg0;
		} else {
			Static35.method632(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method642() {
		aClass25_20 = null;
		aClass40_258 = null;
		aClass5_Sub1_8 = null;
		aClass40_256 = null;
		anIntArray162 = null;
		anIntArray164 = null;
		anIntArray166 = null;
		aClass40_257 = null;
		aClass6_2 = null;
		anIntArray163 = null;
		anIntArray165 = null;
	}
}

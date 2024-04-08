package jagex2;

import jagex2.dash3d.entity.PlayerEntity;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
	public static int anInt2458;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "[I")
	public static int[] anIntArray543;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean183 = true;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public static int anInt2455 = 1;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
	public static final int anInt2457 = 50;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array39 = new Class40[anInt2457];

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "[I")
	public static int[] anIntArray535 = new int[anInt2457];

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray41 = new boolean[5];

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "[I")
	public static int[] anIntArray537 = new int[anInt2457];

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "[I")
	public static int[] anIntArray538 = new int[anInt2457];

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "J")
	public static volatile long aLong149 = 0L;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "[I")
	public static int[] anIntArray539 = new int[anInt2457];

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
	public static int[] anIntArray540 = new int[anInt2457];

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "Lclient!o;")
	public static Class40 aClass40_706 = Static13.method257("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "[I")
	public static int[] anIntArray541 = new int[anInt2457];

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "[I")
	public static int[] anIntArray542 = new int[anInt2457];

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "Lclient!o;")
	public static Class40 aClass40_707 = Static13.method257("backright1");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z[BBII)V")
	public static void method1634(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static106.aClass12_1 == null) {
			return;
		}
		if (Static61.anInt1548 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			Static18.anInt432 = arg2;
			if (Static61.anInt1548 == 0) {
				Static52.anInt1175 = 0;
			} else {
				@Pc(30) int local30 = Static43.method1248(Static61.anInt1548);
				@Pc(34) int local34 = local30 - Static102.anInt2474;
				Static52.anInt1175 = (Static52.anInt1175 + local34 + 3600 - 1) / Static52.anInt1175;
			}
			Static24.aByteArray9 = arg1;
			Static22.aBoolean185 = arg0;
			Static27.anInt685 = arg3;
		} else if (Static18.anInt432 == 0) {
			Static73.method1208(arg0, arg3, arg1);
		} else {
			Static24.aByteArray9 = arg1;
			Static22.aBoolean185 = arg0;
			Static27.anInt685 = arg3;
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	public static void method1635() {
		anIntArray542 = null;
		aClass40_706 = null;
		aClass40Array39 = null;
		anIntArray537 = null;
		anIntArray535 = null;
		anIntArray543 = null;
		aClass40_707 = null;
		anIntArray539 = null;
		anIntArray536 = null;
		anIntArray540 = null;
		aBooleanArray41 = null;
		anIntArray538 = null;
		anIntArray541 = null;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
	public static void method1636() {
		@Pc(10) int count = Static56.in.gBit(8);
		@Pc(20) int i;

		if (Static88.playerCount > count) {
			for (i = count; i < Static88.playerCount; i++) {
				Static52.entityRemovalIds[Static13.entityRemovalCount++] = Static73.playerIds[i];
			}
		}
		if (count > Static88.playerCount) {
			throw new RuntimeException("gppov1");
		}
		Static88.playerCount = 0;
		for (i = 0; i < count; i++) {
			@Pc(62) int index = Static73.playerIds[i];
			@Pc(66) PlayerEntity player = Static100.players[index];
			@Pc(71) int local71 = Static56.in.gBit(1);
			if (local71 == 0) {
				Static73.playerIds[Static88.playerCount++] = index;
				player.cycle = Static107.loopCycle;
			} else {
				@Pc(91) int local91 = Static56.in.gBit(2);
				if (local91 == 0) {
					Static73.playerIds[Static88.playerCount++] = index;
					player.cycle = Static107.loopCycle;
					Static98.entityUpdateIds[Static53.entityUpdateCount++] = index;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local91 == 1) {
						Static73.playerIds[Static88.playerCount++] = index;
						player.cycle = Static107.loopCycle;
						local138 = Static56.in.gBit(3);
						player.step(local138, false);
						local148 = Static56.in.gBit(1);
						if (local148 == 1) {
							Static98.entityUpdateIds[Static53.entityUpdateCount++] = index;
						}
					} else if (local91 == 2) {
						Static73.playerIds[Static88.playerCount++] = index;
						player.cycle = Static107.loopCycle;
						local138 = Static56.in.gBit(3);
						player.step(local138, true);
						local148 = Static56.in.gBit(3);
						player.step(local148, true);
						@Pc(206) int local206 = Static56.in.gBit(1);
						if (local206 == 1) {
							Static98.entityUpdateIds[Static53.entityUpdateCount++] = index;
						}
					} else if (local91 == 3) {
						Static52.entityRemovalIds[Static13.entityRemovalCount++] = index;
					}
				}
			}
		}
	}
}

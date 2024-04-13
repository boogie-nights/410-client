import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
	public static int anInt587;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 4)
	public static void method474() {
		JagString.aClass40_162 = null;
		LocType.aClass5_8 = null;
		JagString.aClass40_161 = null;
		JagString.aClass40_160 = null;
		client.bfsCost = null;
		JagString.aClass40_164 = null;
		JagString.aClass40_157 = null;
		client.bfsStepZ = null;
		JagString.aClass40_158 = null;
		JagString.aClass40_163 = null;
		JagString.aClass40_159 = null;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V", line = 104)
	public static void method477() {
		client.in.bits();
		@Pc(13) int local13 = client.in.gBit(8);
		if (client.npcCount > local13) {
			for (@Pc(18) int local18 = local13; local18 < client.npcCount; local18++) {
				Static1.anIntArray258[Static1.anInt304++] = client.npcIds[local18];
			}
		}
		if (client.npcCount < local13) {
			throw new RuntimeException("gnpov1");
		}
		client.npcCount = 0;
		for (@Pc(62) int local62 = 0; local62 < local13; local62++) {
			@Pc(68) int local68 = client.npcIds[local62];
			@Pc(72) NpcEntity local72 = client.npcs[local68];
			@Pc(77) int local77 = client.in.gBit(1);
			if (local77 == 0) {
				client.npcIds[client.npcCount++] = local68;
				local72.anInt2274 = client.loopCycle;
			} else {
				@Pc(97) int local97 = client.in.gBit(2);
				if (local97 == 0) {
					client.npcIds[client.npcCount++] = local68;
					local72.anInt2274 = client.loopCycle;
					Static1.anIntArray504[Static1.anInt1190++] = local68;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						client.npcIds[client.npcCount++] = local68;
						local72.anInt2274 = client.loopCycle;
						local139 = client.in.gBit(3);
						local72.method1547(local139, false);
						local149 = client.in.gBit(1);
						if (local149 == 1) {
							Static1.anIntArray504[Static1.anInt1190++] = local68;
						}
					} else if (local97 == 2) {
						client.npcIds[client.npcCount++] = local68;
						local72.anInt2274 = client.loopCycle;
						local139 = client.in.gBit(3);
						local72.method1547(local139, true);
						local149 = client.in.gBit(3);
						local72.method1547(local149, true);
						@Pc(203) int local203 = client.in.gBit(1);
						if (local203 == 1) {
							Static1.anIntArray504[Static1.anInt1190++] = local68;
						}
					} else if (local97 == 3) {
						Static1.anIntArray258[Static1.anInt304++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 349)
	public static void method480() {
		@Pc(3) int local3 = Static44.anInt1110;
		@Pc(9) int local9 = Static99.anInt2497;
		@Pc(11) int local11 = Static14.anInt1856;
		@Pc(18) int local18 = Static91.anInt120;
		Static25.method1612(local3, local9, local11, local18, 6116423);
		Static25.method1612(local3 + 1, local9 + 1, local11 - 2, 16, 0);
		Static25.method1607(local3 + 1, local9 + 18, local11 - 2, local18 - 19, 0);
		Static13.aClass2_Sub2_Sub2_Sub2_1.method575(JagString.aClass40_524, local3 + 3, local9 + 14, 6116423);
		@Pc(64) int local64 = Mouse.x;
		@Pc(66) int local66 = Mouse.y;
		if (Static1.anInt16 == 0) {
			local66 -= 4;
			local64 -= 4;
		}
		if (Static1.anInt16 == 1) {
			local66 -= 205;
			local64 -= 553;
		}
		if (Static1.anInt16 == 2) {
			local66 -= 357;
			local64 -= 17;
		}
		for (@Pc(84) int local84 = 0; local84 < client.menuSize; local84++) {
			@Pc(99) int local99 = (client.menuSize - local84 - 1) * 15 + local9 + 31;
			@Pc(101) int local101 = 16777215;
			if (local64 > local3 && local64 < local3 + local11 && local66 > local99 - 13 && local99 + 3 > local66) {
				local101 = 16776960;
			}
			Static13.aClass2_Sub2_Sub2_Sub2_1.method574(client.menuOption[local84], local3 + 3, local99, local101, true);
		}
	}
}

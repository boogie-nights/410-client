import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 197)
	public static void method1689() {
		FloorOverlayType.cache = null;
		JagString.aClass40_734 = null;
		JagString.aClass40_735 = null;
		JagString.aClass40_736 = null;
		JagString.aClass40_737 = null;
		JagString.aClass40_738 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)V", line = 399)
	public static void method1700(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = VarpType.method1568(arg0).anInt1076;
		if (local15 == 0) {
			return;
		}
		@Pc(25) int local25 = Static1.anIntArray339[arg0];
		if (local15 == 1) {
			if (local25 == 1) {
				Static6.method168(0.9D);
				((Js5TextureProvider) Draw3D.getProvider).method404(0.9D);
			}
			if (local25 == 2) {
				Static6.method168(0.8D);
				((Js5TextureProvider) Draw3D.getProvider).method404(0.8D);
			}
			if (local25 == 3) {
				Static6.method168(0.7D);
				((Js5TextureProvider) Draw3D.getProvider).method404(0.7D);
			}
			if (local25 == 4) {
				Static6.method168(0.6D);
				((Js5TextureProvider) Draw3D.getProvider).method404(0.6D);
			}
			Static74.method1342();
			Static1.aBoolean1 = true;
		}
		if (local15 == 3) {
			@Pc(85) short local85 = 0;
			if (local25 == 0) {
				local85 = 255;
			}
			if (local25 == 1) {
				local85 = 192;
			}
			if (local25 == 2) {
				local85 = 128;
			}
			if (local25 == 3) {
				local85 = 64;
			}
			if (local25 == 4) {
				local85 = 0;
			}
			if (Static1.anInt239 != local85) {
				if (Static1.anInt239 == 0 && Static1.anInt1977 != -1) {
					Static86.method1499(0, Static1.anInt1977, Static77.midiSongsJs5, local85);
					Static1.anInt470 = 0;
				} else if (local85 == 0) {
					Static86.method1497();
					Static1.anInt470 = 0;
				} else {
					Static34.method641(local85);
				}
				Static1.anInt239 = local85;
			}
		}
		if (local15 == 6) {
			Static1.anInt1186 = local25;
		}
		if (local15 == 9) {
			Static1.anInt182 = local25;
		}
		if (local15 == 8) {
			Static1.anInt2473 = local25;
			client.redrawChatback = true;
		}
		if (local15 == 4) {
			if (local25 == 0) {
				Static1.anInt2372 = 127;
			}
			if (local25 == 1) {
				Static1.anInt2372 = 96;
			}
			if (local25 == 2) {
				Static1.anInt2372 = 64;
			}
			if (local25 == 3) {
				Static1.anInt2372 = 32;
			}
			if (local25 == 4) {
				Static1.anInt2372 = 0;
			}
		}
		if (local15 == 5) {
			Static1.anInt263 = local25;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BZ)I", line = 1054)
	public static int method1726(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Packet.getcrc(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V", line = 1066)
	public static void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) LocTemporary local7 = null;
		for (@Pc(12) LocTemporary local12 = (LocTemporary) Static1.spawnedLocations.head(); local12 != null; local12 = (LocTemporary) Static1.spawnedLocations.next()) {
			if (local12.level == arg1 && local12.x == arg8 && local12.z == arg6 && local12.anInt823 == arg2) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new LocTemporary();
			local7.level = arg1;
			local7.anInt823 = arg2;
			local7.x = arg8;
			local7.z = arg6;
			Static4.method86(local7);
			Static1.spawnedLocations.addTail(local7);
		}
		local7.anInt829 = arg3;
		local7.anInt828 = arg5;
		local7.anInt826 = arg7;
		local7.anInt827 = arg0;
		local7.anInt819 = arg4;
	}
}

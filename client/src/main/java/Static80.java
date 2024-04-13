import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static80 {

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!kc;")
	public static PlayerEntity aClass2_Sub2_Sub12_Sub1_Sub1_1;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Lclient!qa;")
	public static MixerPcmStream aClass2_Sub10_Sub2_1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 13)
	public static void method1405() {
		Static1.aLongArray5 = null;
		JagString.aClass40_602 = null;
		Static1.anIntArray453 = null;
		JagString.aClass40_606 = null;
		aClass2_Sub2_Sub12_Sub1_Sub1_1 = null;
		aClass2_Sub10_Sub2_1 = null;
		JagString.aClass40_603 = null;
		JagString.aClass40_604 = null;
		JagString.aClass40_605 = null;
		Static1.anIntArray454 = null;
		JagString.aClass40_607 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 55)
	public static void method1406() {
		Static1.anInt2328 = 0;
		Static1.anInt986 = 0;
		client.lastPacketType0 = -1;
		client.lastPacketType1 = -1;
		Static1.aClass2_Sub3_Sub1_4.pos = 0;
		client.idleNetCycles = 0;
		client.packetType = -1;
		Static1.anInt1973 = 0;
		Static1.anInt797 = 0;
		client.packetSize = 0;
		client.lastPacketType2 = -1;
		Static1.aBoolean175 = false;
		client.in.pos = 0;
		Static7.method187(30);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!ud;I)Lclient!qb;", line = 97)
	public static Pix8 method1407(@OriginalArg(1) int arg0, @OriginalArg(2) Js5Index arg1, @OriginalArg(3) int arg2) {
		return Static84.method1484(arg2, arg1, arg0) ? Static63.method338() : null;
	}
}

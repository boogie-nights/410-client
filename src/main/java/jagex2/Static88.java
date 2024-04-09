package jagex2;

import jagex2.dash3d.entity.PlayerEntity;
import jagex2.graphics.Pix8;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static88 {

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!kc;")
	public static PlayerEntity localPlayer;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Lclient!qa;")
	public static Class2_Sub10_Sub2 aClass2_Sub10_Sub2_1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_602 = Static13.method257(" @cya@");

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public static int playerCount = 0;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_603 = Static13.method257("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public static int anInt2077 = 0;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	public static int[] anIntArray453 = new int[128];

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!o;")
	public static Class40 aClass40_604 = Static13.method257("Add ignore @whi@");

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!o;")
	public static Class40 aClass40_605 = Static13.method257("Importing music )2 ");

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int packetType = 0;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "Lclient!o;")
	public static Class40 aClass40_606 = Static13.method257("Select");

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "[I")
	public static int[] anIntArray454 = new int[500];

	@OriginalMember(owner = "client!sc", name = "G", descriptor = "Lclient!o;")
	public static Class40 aClass40_607 = Static13.method257("headicons_pk");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method1405() {
		aLongArray5 = null;
		aClass40_602 = null;
		anIntArray453 = null;
		aClass40_606 = null;
		localPlayer = null;
		aClass2_Sub10_Sub2_1 = null;
		aClass40_603 = null;
		aClass40_604 = null;
		aClass40_605 = null;
		anIntArray454 = null;
		aClass40_607 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1406() {
		Static96.anInt2328 = 0;
		Static38.flagSceneTileX = 0;
		Static33.anInt788 = -1;
		Static97.anInt2352 = -1;
		Static80.out.pos = 0;
		Static7.anInt231 = 0;
		packetType = -1;
		Static84.systemUpdateTimer = 0;
		Static34.menuSize = 0;
		Static33.size = 0;
		Static85.anInt1986 = -1;
		Static97.aBoolean175 = false;
		Static56.in.pos = 0;
		Static7.method187(30);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!ud;I)Lclient!qb;")
	public static Pix8 method1407(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		return Static92.method1484(arg2, arg1, arg0) ? Static68.method338() : null;
	}
}

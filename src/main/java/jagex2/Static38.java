package jagex2;

import java.io.DataInputStream;
import java.net.URL;

import jagex2.graphics.Pix24;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt971;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static volatile int anInt969 = 0;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!le;")
	public static Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_291 = Static13.method257("May");

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	public static int anInt980 = -1;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public static int anInt982 = -1;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "Lclient!o;")
	public static Class40 aClass40_292 = Static13.method257(" @gre@");

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	public static int flagSceneTileX = 0;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Lclient!o;")
	public static Class40 aClass40_293 = Static13.method257("@red@");

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Lclient!o;")
	public static Class40 aClass40_294 = Static13.method257("Create a free account");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method727(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(8) String local8 = "";
			if (arg1 != null) {
				local8 = Static63.method1059(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local8 = local8 + " | ";
				}
				local8 = local8 + arg0;
			}
			System.out.println("Error: " + local8);
			local8 = local8.replace(':', '.');
			local8 = local8.replace('@', '_');
			local8 = local8.replace('&', '_');
			local8 = local8.replace('#', '_');
			@Pc(98) Class48 local98 = Static41.aClass7_4.method209(new URL(Static41.aClass7_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static43.version + "&u=" + Static102.aLong150 + "&v1=" + Static8.javaVendor + "&v2=" + Static8.javaVersion + "&e=" + local8));
			while (local98.anInt1928 == 0) {
				Static94.method1494(1L);
			}
			if (local98.anInt1928 == 1) {
				@Pc(117) DataInputStream local117 = (DataInputStream) local98.anObject4;
				local117.read();
				local117.close();
			}
		} catch (@Pc(124) Exception local124) {
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!o;I)Z")
	public static boolean isFriend(@OriginalArg(0) Class40 username) {
		if (username == null) {
			return false;
		}
		for (@Pc(18) int i = 0; i < Static22.friendCount; i++) {
			if (username.method1199(Static51.friendName[i])) {
				return true;
			}
		}
		return username.method1199(Static88.localPlayer.aClass40_395);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!ud;II)Lclient!vb;")
	public static Pix24 method732(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static92.method1484(arg2, arg0, arg1) ? Static84.method1361() : null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	public static void method733() {
		aClass40_291 = null;
		aClass40_294 = null;
		aClass40_293 = null;
		aClass40_292 = null;
		aClass33_1 = null;
	}
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[Lclient!cb;")
	public static Cache[] aClass11Array1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 3)
	public static void method356() {
		JagString.aClass40_121 = null;
		Packet.crctable = null;
		client.menuOption = null;
		aClass11Array1 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ud;B)I", line = 134)
	public static int method358(@OriginalArg(0) Js5Index arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_223)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_544)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_191)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_734)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_64)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_220)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_725)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_718)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_707)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_29)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_319)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_632)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_487)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_288)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_256)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_3)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_720)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_136)) {
			local5++;
		}
		if (arg0.method73(JagString.aClass40_110, JagString.aClass40_78)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!eb;I)Lclient!o;", line = 347)
	public static JagString method360(@OriginalArg(1) Packet arg0) {
		try {
			@Pc(12) JagString local12 = new JagString();
			local12.length = arg0.gSmart1or2();
			if (local12.length > 32767) {
				local12.length = 32767;
			}
			local12.chars = new byte[local12.length];
			arg0.pos += Static89.aClass42_1.method1212(0, local12.length, arg0.pos, arg0.data, local12.chars);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return JagString.aClass40_574;
		}
	}

}

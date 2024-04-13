import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.DataInputStream;
import java.net.URL;

@OriginalClass("client!cc")
public final class JagException extends RuntimeException {

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 139)
	public JagException(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString7 = arg1;
		this.aThrowable1 = arg0;
	}

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 54)
    public static void report(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
        try {
            @Pc(8) String local8 = "";
            if (arg1 != null) {
                local8 = Static58.method1059(arg1);
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
            @Pc(98) PrivilegedRequest local98 = Static38.aClass7_4.method209(new URL(Static38.aClass7_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static40.anInt1849 + "&u=" + Static94.aLong150 + "&v1=" + Static8.aString4 + "&v2=" + Static8.aString1 + "&e=" + local8));
            while (local98.status == 0) {
                Static86.sleep(1L);
            }
            if (local98.status == 1) {
                @Pc(117) DataInputStream local117 = (DataInputStream) local98.result;
                local117.read();
                local117.close();
            }
        } catch (@Pc(124) Exception local124) {
        }
    }
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.*;
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
                local8 = method1059(arg1);
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
            @Pc(98) PrivilegedRequest local98 = Static38.aClass7_4.method209(new URL(Static38.aClass7_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static40.anInt1849 + "&u=" + Static94.aLong150 + "&v1=" + SignLink.aString4 + "&v2=" + SignLink.aString1 + "&e=" + local8));
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

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 543)
    public static String method1059(@OriginalArg(0) Throwable arg0) throws IOException {
        @Pc(20) String local20;
        if (arg0 instanceof JagException) {
            @Pc(7) JagException local7 = (JagException) arg0;
            arg0 = local7.aThrowable1;
            local20 = local7.aString7 + " | ";
        } else {
            local20 = "";
        }
        @Pc(28) StringWriter local28 = new StringWriter();
        @Pc(33) PrintWriter local33 = new PrintWriter(local28);
        arg0.printStackTrace(local33);
        local33.close();
        @Pc(50) String local50 = local28.toString();
        @Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
        @Pc(61) String local61 = local58.readLine();
        while (true) {
            while (true) {
                @Pc(64) String local64 = local58.readLine();
                if (local64 == null) {
                    return local20 + "| " + local61;
                }
                @Pc(70) int local70 = local64.indexOf(40);
                @Pc(77) int local77 = local64.indexOf(41, local70 + 1);
                if (local70 >= 0 && local77 >= 0) {
                    @Pc(94) String local94 = local64.substring(local70 + 1, local77);
                    @Pc(98) int local98 = local94.indexOf(".java:");
                    if (local98 >= 0) {
                        local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
                        local20 = local20 + local94 + ' ';
                        continue;
                    }
                    local64 = local64.substring(0, local70);
                }
                local64 = local64.trim();
                local64 = local64.substring(local64.lastIndexOf(32) + 1);
                local64 = local64.substring(local64.lastIndexOf(9) + 1);
                local20 = local20 + local64 + ' ';
            }
        }
    }
}

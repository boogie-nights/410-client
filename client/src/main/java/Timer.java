import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public abstract class Timer {

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)Lclient!pd;", line = 76)
    public static Timer method1539() {
        try {
            return (Timer) Class.forName("NanoTimer").getDeclaredConstructor().newInstance();
        } catch (@Pc(14) Throwable local14) {
            return new MillisTimer();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
	public abstract int method1274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public abstract void method1275();

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	public abstract void method1280();
}

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public abstract class Entity extends Hashable {

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
	public int anInt2265 = 1000;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Lclient!ne;", line = 126)
	protected Model method1533() {
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)V", line = 258)
	public void draw(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Model local7 = this.method1533();
		if (local7 != null) {
			this.anInt2265 = local7.anInt2265;
			local7.draw(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}

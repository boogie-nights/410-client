import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!qd")
public final class PrivilegedRequest {

	@OriginalMember(owner = "loader!qd", name = "e", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "loader!qd", name = "b", descriptor = "Ljava/lang/Object;")
	public Object objArg;

	@OriginalMember(owner = "loader!qd", name = "a", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "loader!qd", name = "d", descriptor = "Lloader!qd;")
	public PrivilegedRequest next;

	@OriginalMember(owner = "loader!qd", name = "f", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "loader!qd", name = "c", descriptor = "I")
	public volatile int status = 0;
}

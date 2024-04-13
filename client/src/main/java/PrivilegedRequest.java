import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class PrivilegedRequest {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int intArg1;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public int intArg2;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/lang/Object;")
	public Object objArg;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/lang/Object;")
	public volatile Object result;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!qd;")
	public PrivilegedRequest next;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public volatile int status = 0;
}

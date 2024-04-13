import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class ObjectRequest {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt1926;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public int anInt1927;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/lang/Object;")
	public Object objArg;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/lang/Object;")
	public volatile Object value;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!qd;")
	public ObjectRequest request;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public volatile int anInt1928 = 0;
}

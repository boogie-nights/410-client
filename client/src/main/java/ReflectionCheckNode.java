import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class ReflectionCheckNode extends Linkable {

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "[Lclient!qd;")
	public PrivilegedRequest[] methodRequests;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	public int id;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "[I")
	public int[] errors;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "[I")
	public int[] types;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "[[[B")
	public byte[][][] methodArguments;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
	public int[] fieldValues;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "[Lclient!qd;")
	public PrivilegedRequest[] fieldRequests;
}

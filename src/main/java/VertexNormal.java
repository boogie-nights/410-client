import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class VertexNormal {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public int w;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public int x;
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Js5CacheRequest extends Linkable {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "[B")
	public byte[] data;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Lclient!ad;")
	public Js5 js5;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Lclient!cb;")
	public Cache cache;
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public abstract class SoundPacket extends Linkable {

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int pos;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 3)
	protected SoundPacket() {
	}
}

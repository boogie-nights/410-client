import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class MixerListener extends Linkable {

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public int remaining;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
	public abstract void onUnlink();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!qa;)I")
	public abstract int execute(@OriginalArg(0) MixerPcmStream stream);
}

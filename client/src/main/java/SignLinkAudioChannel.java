import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class SignLinkAudioChannel extends AudioChannel {

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Lclient!c;")
    public static MonotonicClock clock;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "()V", line = 6)
	public static void method1092() {
		clock = null;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "()I", line = 3)
	@Override
	protected int method1090() {
		return clock.method236();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 9)
	@Override
	protected void method1089(@OriginalArg(0) int arg0) throws Exception {
		clock.method240(arg0);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()V", line = 12)
	@Override
	protected void method1087() {
		clock.method239();
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!bb;Ljava/awt/Component;)V", line = 15)
	public SignLinkAudioChannel(@OriginalArg(0) SignLink arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		clock = arg0.method198();
		clock.method238(arg1);
		this.method1088(arg0, 16384);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()V", line = 21)
	@Override
	protected void method1083() {
		clock.method237(AudioChannel.anIntArray337);
	}
}

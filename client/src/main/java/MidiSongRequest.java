import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class MidiSongRequest extends Hashable {

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V", line = 132)
	public MidiSongRequest(@OriginalArg(0) byte[] arg0) {
		this.aByteArray3 = arg0;
	}
}

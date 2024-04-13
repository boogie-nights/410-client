import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!wc", name = "Zb", descriptor = "Lclient!ib;")
	public static SongPcmStream aClass12_1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ud;I)[B", line = 27)
	public static byte[] method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Js5Index arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) (arg3 << 16) + ((long) arg0 << 32) + (long) (arg1 + arg3 * 37 & 0xFFFF);
		if (Static35.aClass47_9 != null) {
			@Pc(31) MidiSongRequest local31 = (MidiSongRequest) Static35.aClass47_9.get(local23);
			if (local31 != null) {
				return local31.aByteArray3;
			}
		}
		@Pc(42) byte[] local42 = arg2.fetchFile(arg1, arg3);
		if (local42 == null) {
			return null;
		} else {
			if (Static35.aClass47_9 != null) {
				Static35.aClass47_9.put(local23, new MidiSongRequest(local42));
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)V", line = 105)
	public static void method1738() {
		JagString.aClass40_742 = null;
		aClass12_1 = null;
		JagString.aClass40_740 = null;
		JagString.FRIENDSLIST_FULL = null;
		client.aClass40Array40 = null;
		JagString.aClass40_741 = null;
	}

}

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

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BZ)V", line = 640)
	public static void method1741(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Js5Index arg1, @OriginalArg(3) boolean arg2) {
		Static51.aClass5_29 = arg0;
		Static40.aBoolean150 = arg2;
		ObjType.aClass5_13 = arg1;
		Static36.anInt971 = ObjType.aClass5_13.getGroupCapacity(10);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLclient!ud;ILclient!ud;I)Lclient!sb;", line = 702)
	public static SeqFrameset method1744(@OriginalArg(1) Js5Index arg0, @OriginalArg(3) Js5Index arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.getFileIds(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(27) byte[] local27 = arg0.fetchFileNoDiscard(arg2, local12[local14]);
			if (local27 == null) {
				local7 = false;
			} else {
				@Pc(47) int local47 = (local27[0] & 0xFF) << 8 | local27[1] & 0xFF;
				@Pc(55) byte[] local55 = arg1.fetchFileNoDiscard(local47, 0);
				if (local55 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new SeqFrameset(arg0, arg1, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}

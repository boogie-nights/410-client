import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class SeqFrameset extends Hashable {

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "[Lclient!jb;")
	public final SeqFrame[] frames;

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

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Z", line = 158)
	public boolean method1403(@OriginalArg(1) int frame) {
		return this.frames[frame].aBoolean88;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ud;Lclient!ud;IZ)V", line = 205)
	public SeqFrameset(@OriginalArg(0) Js5Index js5, @OriginalArg(1) Js5Index arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) LinkList bases = new LinkList();
		@Pc(12) int capacity = js5.getGroupCapacity(arg2);
		this.frames = new SeqFrame[capacity];
		@Pc(21) int[] fileIds = js5.getFileIds(arg2);
		for (@Pc(23) int i = 0; i < fileIds.length; i++) {
			@Pc(33) byte[] data = js5.fetchFile(fileIds[i], arg2);
			@Pc(47) int baseId = (data[0] & 0xFF) << 8 | data[1] & 0xFF;
			@Pc(49) SeqBase base = null;
			for (@Pc(54) SeqBase b = (SeqBase) bases.head(); b != null; b = (SeqBase) bases.next()) {
				if (b.id == baseId) {
					base = b;
					break;
				}
			}
			if (base == null) {
				@Pc(80) byte[] baseData = arg1.fetchFileNoDiscard(baseId, 0);
				base = new SeqBase(baseId, baseData);
				bases.addTail(base);
			}
			this.frames[fileIds[i]] = new SeqFrame(data, base);
		}
	}
}

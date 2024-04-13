import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class SeqFrameset extends Hashable {

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "[Lclient!jb;")
	public final SeqFrame[] frames;

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

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class LinkList {

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!g;")
	private Linkable aClass2_72;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!g;")
	public final Linkable aClass2_71 = new Linkable();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lclient!g;", line = 6)
	public Linkable method1218() {
		@Pc(15) Linkable local15 = this.aClass2_71.prev;
		if (this.aClass2_71 == local15) {
			return null;
		} else {
			local15.unlink();
			return local15;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)Lclient!g;", line = 45)
	public Linkable method1220() {
		@Pc(3) Linkable local3 = this.aClass2_71.next;
		if (this.aClass2_71 == local3) {
			return null;
		} else {
			local3.unlink();
			return local3;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!g;)V", line = 72)
	public void addTail(@OriginalArg(1) Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.next = this.aClass2_71;
		arg0.prev = this.aClass2_71.prev;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 95)
	public void method1222() {
		while (true) {
			@Pc(14) Linkable local14 = this.aClass2_71.next;
			if (this.aClass2_71 == local14) {
				return;
			}
			local14.unlink();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!g;Lclient!g;)V", line = 122)
	public void method1223(@OriginalArg(1) Linkable arg0, @OriginalArg(2) Linkable arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		arg1.next = arg0;
		arg1.prev = arg0.prev;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lclient!g;", line = 140)
	public Linkable head() {
		@Pc(7) Linkable local7 = this.aClass2_71.next;
		if (local7 == this.aClass2_71) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local7.next;
			return local7;
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lclient!g;", line = 163)
	public Linkable method1225() {
		@Pc(13) Linkable local13 = this.aClass2_72;
		if (local13 == this.aClass2_71) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local13.prev;
			return local13;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Lclient!g;", line = 188)
	public Linkable method1226() {
		@Pc(7) Linkable local7 = this.aClass2_71.prev;
		if (this.aClass2_71 == local7) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local7.prev;
			return local7;
		}
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 289)
	public LinkList() {
		this.aClass2_71.prev = this.aClass2_71;
		this.aClass2_71.next = this.aClass2_71;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(BLclient!g;)V", line = 311)
	public void method1229(@OriginalArg(1) Linkable arg0) {
		if (arg0.prev != null) {
			arg0.unlink();
		}
		arg0.prev = this.aClass2_71;
		arg0.next = this.aClass2_71.next;
		arg0.prev.next = arg0;
		arg0.next.prev = arg0;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)Lclient!g;", line = 342)
	public Linkable next() {
		@Pc(6) Linkable local6 = this.aClass2_72;
		if (local6 == this.aClass2_71) {
			this.aClass2_72 = null;
			return null;
		} else {
			this.aClass2_72 = local6.next;
			return local6;
		}
	}
}

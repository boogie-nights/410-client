import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class Class24 {

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V", line = 4)
	public Class24(@OriginalArg(0) int arg0) {
		Static11.anInt291 = arg0;
		Static93.aLong143 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(J)V", line = 31)
	public void method1654(@OriginalArg(0) long arg0) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 70)
	public void method1656() {
	}
}

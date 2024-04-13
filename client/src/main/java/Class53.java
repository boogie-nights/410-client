import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class53 implements Runnable {

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V", line = 60)
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) LinkList local5 = Static1.aClass44_2;
				@Pc(12) Class2_Sub9 local12;
				synchronized (Static1.aClass44_2) {
					local12 = (Class2_Sub9) Static1.aClass44_2.head();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static86.sleep(100L);
					local25 = Static1.anObject2;
					synchronized (Static1.anObject2) {
						if (Static1.anInt1801 <= 1) {
							Static1.anInt1801 = 0;
							Static1.anObject2.notifyAll();
							return;
						}
						Static1.anInt1801--;
					}
				} else {
					if (local12.anInt1189 == 0) {
						local12.aClass11_3.method259(local12.aByteArray13.length, (int) local12.aLong152, local12.aByteArray13);
						local5 = Static1.aClass44_2;
						synchronized (Static1.aClass44_2) {
							local12.method1677();
						}
					} else if (local12.anInt1189 == 1) {
						local12.aByteArray13 = local12.aClass11_3.method261((int) local12.aLong152);
						local5 = Static1.aClass44_2;
						synchronized (Static1.aClass44_2) {
							Static1.aClass44_1.method1221(local12);
						}
					}
					local25 = Static1.anObject2;
					synchronized (Static1.anObject2) {
						if (Static1.anInt1801 <= 1) {
							Static1.anInt1801 = 0;
							Static1.anObject2.notifyAll();
							return;
						}
						Static1.anInt1801 = 600;
					}
				}
			}
		} catch (@Pc(128) Exception local128) {
			Static36.method727(null, local128);
		}
	}
}

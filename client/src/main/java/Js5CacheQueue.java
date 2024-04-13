import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Js5CacheQueue implements Runnable {

	@OriginalMember(owner = "client!s", name = "run", descriptor = "()V", line = 60)
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(5) LinkList local5 = Static1.aClass44_2;
				@Pc(12) Js5CacheRequest local12;
				synchronized (local5) {
					local12 = (Js5CacheRequest) Static1.aClass44_2.head();
				}
				@Pc(25) Object local25;
				if (local12 == null) {
					Static86.sleep(100L);
					local25 = Static1.anObject2;
					synchronized (local25) {
						if (Static1.anInt1801 <= 1) {
							Static1.anInt1801 = 0;
							Static1.anObject2.notifyAll();
							return;
						}
						Static1.anInt1801--;
					}
				} else {
					if (local12.type == 0) {
						local12.cache.write(local12.data.length, (int) local12.key, local12.data);
						local5 = Static1.aClass44_2;
						synchronized (local5) {
							local12.unlink();
						}
					} else if (local12.type == 1) {
						local12.data = local12.cache.read((int) local12.key);
						local5 = Static1.aClass44_2;
						synchronized (local5) {
							Static1.aClass44_1.addTail(local12);
						}
					}
					local25 = Static1.anObject2;
					synchronized (local25) {
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
			JagException.report(null, local128);
		}
	}
}

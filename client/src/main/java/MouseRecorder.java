import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class MouseRecorder implements Runnable {

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
	public boolean running = true;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljava/lang/Object;")
	public final Object lock = new Object();

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
	public final int[] x = new int[500];

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "[I")
	public final int[] y = new int[500];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	public int samples = 0;

	@OriginalMember(owner = "client!rd", name = "run", descriptor = "()V", line = 183)
	@Override
	public void run() {
		while (this.running) {
			synchronized (this.lock) {
				if (this.samples < 500) {
					this.x[this.samples] = Mouse.x;
					this.y[this.samples] = Mouse.y;
					this.samples++;
				}
			}
			Static86.sleep(50L);
		}
	}
}

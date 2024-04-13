import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Mouse implements MouseListener, MouseMotionListener {

	@OriginalMember(owner = "client!vd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
	@Override
	public synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (Static1.aClass62_1 != null) {
			Static1.anInt1497 = 0;
			Static1.anInt112 = arg0.getX();
			Static1.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 21)
	@Override
	public synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (Static1.aClass62_1 != null) {
			Static1.anInt1497 = 0;
			Static1.anInt112 = arg0.getX();
			Static1.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 80)
	@Override
	public synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (Static1.aClass62_1 != null) {
			Static1.anInt1497 = 0;
			Static1.anInt112 = -1;
			Static1.anInt1663 = -1;
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 101)
	@Override
	public synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (Static1.aClass62_1 != null) {
			Static1.anInt1497 = 0;
			Static1.anInt969 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 685)
	@Override
	public synchronized void mouseDragged(@OriginalArg(0) MouseEvent arg0) {
		if (Static1.aClass62_1 != null) {
			Static1.anInt1497 = 0;
			Static1.anInt112 = arg0.getX();
			Static1.anInt1663 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 747)
	@Override
	public synchronized void mousePressed(@OriginalArg(0) MouseEvent arg0) {
		if (Static1.aClass62_1 != null) {
			Static1.anInt1497 = 0;
			Static1.anInt1166 = arg0.getX();
			Static1.anInt2494 = arg0.getY();
			Static1.aLong149 = System.currentTimeMillis();
			if (arg0.isMetaDown()) {
				Static1.anInt2520 = 2;
				Static1.anInt969 = 2;
			} else {
				Static1.anInt2520 = 1;
				Static1.anInt969 = 1;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!vd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 821)
	@Override
	public void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}
}

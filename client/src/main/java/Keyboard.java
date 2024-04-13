import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Keyboard implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 234)
	public static int method1243(@OriginalArg(0) KeyEvent arg0) {
		@Pc(10) int local10 = arg0.getKeyChar();
		if (local10 <= 0 || local10 >= 256) {
			local10 = -1;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 48)
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!ka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 105)
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Static1.aClass30_1 != null) {
			Static1.anInt949 = -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Static1.aClass30_1 != null) {
			Static1.anInt1860 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Static1.anIntArray549.length > local10) {
				local10 = Static1.anIntArray549[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Static1.anInt949 >= 0 && local10 >= 0) {
				Static1.anIntArray470[Static1.anInt949] = ~local10;
				Static1.anInt949 = Static1.anInt949 + 1 & 0x7F;
				if (Static1.anInt949 == Static1.anInt2342) {
					Static1.anInt949 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 187)
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ka", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 265)
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Static1.aClass30_1 != null) {
			Static1.anInt1860 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && local8 < Static1.anIntArray549.length) {
				local8 = Static1.anIntArray549[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(49) int local49;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local49 = -1;
			} else {
				local49 = method1243(arg0);
			}
			if (Static1.anInt949 >= 0 && local8 >= 0) {
				Static1.anIntArray470[Static1.anInt949] = local8;
				Static1.anInt949 = Static1.anInt949 + 1 & 0x7F;
				if (Static1.anInt2342 == Static1.anInt949) {
					Static1.anInt949 = -1;
				}
			}
			if (local8 >= 0 || local49 >= 0) {
				@Pc(93) int local93 = Static1.anInt2226 + 1 & 0x7F;
				if (Static1.anInt1094 != local93) {
					Static1.anIntArray453[Static1.anInt2226] = local8;
					Static1.anIntArray545[Static1.anInt2226] = local49;
					Static1.anInt2226 = local93;
				}
			}
		}
		arg0.consume();
	}
}

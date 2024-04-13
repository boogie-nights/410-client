import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class GameShell extends Applet implements Runnable, FocusListener {

	@OriginalMember(owner = "client!la", name = "tb", descriptor = "Z")
	public static boolean shutdown = false;
	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "Lclient!bb;")
	public static SignLink signlink;
	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!k;")
	public static ViewBox frame;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Ljava/awt/Component;", line = 71)
	public static Component method185() {
		if (frame == null) {
			return signlink == null ? null : signlink.anApplet1;
		} else {
			return frame;
		}
	}

	@OriginalMember(owner = "client!nb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 3)
	@Override
	public final AppletContext getAppletContext() {
		if (frame == null) {
			return signlink == null || signlink.anApplet1 == this ? super.getAppletContext() : signlink.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 19)
	private synchronized void shutdown() {
		if (shutdown) {
			return;
		}
		shutdown = true;
		try {
			method185().removeFocusListener(this);
		} catch (@Pc(19) Exception local19) {
		}
		try {
			this.mainQuit();
		} catch (@Pc(24) Exception local24) {
		}
		if (frame != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (signlink != null) {
			try {
				signlink.stop();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.unload();
	}

	@OriginalMember(owner = "client!nb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 106)
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (frame == null) {
			return signlink == null || signlink.anApplet1 == this ? super.getParameter(arg0) : signlink.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 122)
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static1.aBoolean183 = true;
		Static1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V", line = 131)
	protected final void initApplet(@OriginalArg(0) int arg0) {
		try {
			if (Static1.anApplet_Sub1_1 == null) {
				Static77.anInt1991 = 765;
				Static40.anInt1849 = 410;
				Static70.anInt2154 = 503;
				Static1.anApplet_Sub1_1 = this;
				if (signlink == null) {
					Static38.aClass7_4 = signlink = new SignLink(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				signlink.method207(1, this);
			} else {
				this.error("alreadyloaded");
			}
		} catch (@Pc(50) Exception local50) {
			JagException.report(null, local50);
			this.error("crash");
		}
	}

	@OriginalMember(owner = "client!nb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 162)
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (Static1.anApplet_Sub1_1 == this && !shutdown) {
			Static1.aBoolean1 = true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "run", descriptor = "()V", line = 177)
	@Override
	public final void run() {
		try {
			if (SignLink.aString4 != null) {
				@Pc(10) String local10 = SignLink.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = SignLink.aString1;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.error("wrongjava");
						return;
					}
					Static1.anInt1552 = 5;
				} else if (local10.indexOf("ibm") != -1 && (SignLink.aString1 == null || SignLink.aString1.equals("1.4.2"))) {
					this.error("wrongjava");
					return;
				}
			}
			while (true) {
				client.graphics = method185().getGraphics();
				if (client.graphics != null) {
					Static27.aClass45_14 = Static75.method1351(Static77.anInt1991, method185(), Static70.anInt2154);
					method185().addFocusListener(this);
					method185().requestFocus();
					this.method327();
					Static79.aClass18_1 = Timer.method1539();
					Static79.aClass18_1.method1280();
					while (Static1.aLong132 == 0L || System.currentTimeMillis() < Static1.aLong132) {
						Static22.anInt587 = Static79.aClass18_1.method1274(Static1.anInt1660, Static1.anInt1552);
						for (@Pc(112) int local112 = 0; local112 < Static22.anInt587; local112++) {
							this.method328();
						}
						this.method336();
					}
					break;
				}
				try {
					method185().repaint();
				} catch (@Pc(74) Exception local74) {
				}
				Static86.sleep(100L);
			}
		} catch (@Pc(136) Exception local136) {
			JagException.report(null, local136);
			this.error("crash");
		}
		this.shutdown();
	}

	@OriginalMember(owner = "client!nb", name = "start", descriptor = "()V", line = 264)
	@Override
	public final void start() {
		if (Static1.anApplet_Sub1_1 == this && !shutdown) {
			Static1.aLong132 = 0L;
		}
	}

	@OriginalMember(owner = "client!nb", name = "destroy", descriptor = "()V", line = 275)
	@Override
	public final void destroy() {
		if (Static1.anApplet_Sub1_1 == this && !shutdown) {
			Static1.aLong132 = System.currentTimeMillis();
			Static86.sleep(5000L);
			Static38.aClass7_4 = null;
			this.shutdown();
		}
	}

	@OriginalMember(owner = "client!nb", name = "stop", descriptor = "()V", line = 295)
	@Override
	public final void stop() {
		if (Static1.anApplet_Sub1_1 == this && !shutdown) {
			Static1.aLong132 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!nb", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 307)
	@Override
	public final URL getCodeBase() {
		if (frame == null) {
			return signlink == null || signlink.anApplet1 == this ? super.getCodeBase() : signlink.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 337)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 346)
	private void method328() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(9) long local9 = Static1.aLongArray6[Static28.anInt723];
		Static1.aLongArray6[Static28.anInt723] = local5;
		@Pc(22) boolean local22;
		if (local9 == 0L || local9 >= local5) {
			local22 = false;
		} else {
			local22 = true;
		}
		Static28.anInt723 = Static28.anInt723 + 1 & 0x1F;
		synchronized (this) {
			Static89.aBoolean174 = Static1.aBoolean183;
		}
		this.update();
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Z", line = 379)
	protected final boolean isValidHost() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.endsWith("jagex.com")) {
			return true;
		} else if (local13.endsWith("runescape.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.error("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 417)
	protected final void error(@OriginalArg(1) String arg0) {
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!nb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 434)
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static1.aBoolean183 = false;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V", line = 498)
	private void method336() {
		@Pc(3) long local3 = Static1.aLongArray5[Static99.anInt2498];
		@Pc(13) long local13 = System.currentTimeMillis();
		Static1.aLongArray5[Static99.anInt2498] = local13;
		if (local3 != 0L && local13 > local3) {
			@Pc(33) int local33 = (int) (local13 - local3);
			Static1.anInt1695 = ((local33 >> 1) + 32000) / local33;
		}
		Static99.anInt2498 = Static99.anInt2498 + 1 & 0x1F;
		this.draw();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;ILjava/net/InetAddress;BIII)V", line = 741)
	protected final void initApplication(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) InetAddress arg2) {
		try {
			Static70.anInt2154 = 503;
			Static40.anInt1849 = 410;
			Static77.anInt1991 = 765;
			Static1.anApplet_Sub1_1 = this;
			frame = new ViewBox(this, Static77.anInt1991, Static70.anInt2154);
			Static38.aClass7_4 = signlink = new SignLink(true, null, arg2, arg1, arg0, 12);
			signlink.method207(1, this);
		} catch (@Pc(43) Exception local43) {
			JagException.report(null, local43);
		}
	}

	@OriginalMember(owner = "client!nb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 777)
	@Override
	public final URL getDocumentBase() {
		if (frame == null) {
			return signlink == null || signlink.anApplet1 == this ? super.getDocumentBase() : signlink.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	protected abstract void method327();

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	protected abstract void update();

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	protected abstract void draw();

	@OriginalMember(owner = "client!nb", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	protected abstract void unload();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	protected abstract void mainQuit();
}

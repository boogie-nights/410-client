package jagex2.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import jagex2.Static38;
import jagex2.Class48;
import jagex2.Static94;
import jagex2.client.GameShell;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class ClientStream implements Runnable {

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Lclient!qd;")
	private Class48 aClass48_3;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	private int anInt973 = 0;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
	private boolean closed = false;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	private int anInt975 = 0;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket socket;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "Lclient!bb;")
	private final GameShell shell;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Ljava/io/InputStream;")
	private final InputStream in;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream out;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!bb;)V")
	public ClientStream(@OriginalArg(0) Socket socket, @OriginalArg(1) GameShell shell) throws IOException {
		this.shell = shell;
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB[B)V")
	public void read(@OriginalArg(0) int off, @OriginalArg(1) int len, @OriginalArg(3) byte[] dst) throws IOException {
		if (this.closed) {
			return;
		}
		while (len > 0) {
			@Pc(19) int read = this.in.read(dst, off, len);
			if (read <= 0) {
				throw new EOFException();
			}
			len -= read;
			off += read;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	public int method726() throws IOException {
		return this.closed ? 0 : this.in.read();
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method730();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
	public int available() throws IOException {
		return this.closed ? 0 : this.in.available();
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public void method730() {
		if (this.closed) {
			return;
		}
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		if (this.aClass48_3 != null) {
			while (this.aClass48_3.anInt1928 == 0) {
				Static94.method1494(1L);
			}
			if (this.aClass48_3.anInt1928 == 1) {
				try {
					((Thread) this.aClass48_3.anObject4).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass48_3 = null;
	}

	@OriginalMember(owner = "client!hc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt975 == this.anInt973) {
							if (this.closed) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt975 < this.anInt973) {
							local36 = 5000 - this.anInt973;
						} else {
							local36 = this.anInt975 - this.anInt973;
						}
						local48 = this.anInt973;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.out.write(this.aByteArray11, local48, local36);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean69 = true;
					}
					this.anInt973 = (local36 + this.anInt973) % 5000;
					try {
						if (this.anInt973 == this.anInt975) {
							this.out.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean69 = true;
					}
					continue;
				}
				try {
					if (this.in != null) {
						this.in.close();
					}
					if (this.out != null) {
						this.out.close();
					}
					if (this.socket != null) {
						this.socket.close();
					}
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray11 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static38.method727(null, local118);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIZ)V")
	public void method731(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.closed) {
			return;
		}
		if (this.aBoolean69) {
			this.aBoolean69 = false;
			throw new IOException();
		}
		if (this.aByteArray11 == null) {
			this.aByteArray11 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray11[this.anInt975] = arg0[local36];
				this.anInt975 = (this.anInt975 + 1) % 5000;
				if ((this.anInt973 + 4900) % 5000 == this.anInt975) {
					throw new IOException();
				}
			}
			if (this.aClass48_3 == null) {
				this.aClass48_3 = this.shell.method207(3, this);
			}
			this.notifyAll();
		}
	}
}

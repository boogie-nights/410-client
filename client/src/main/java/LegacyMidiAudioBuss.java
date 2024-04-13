import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class LegacyMidiAudioBuss extends AudioBuss2 {

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!qd;")
	private ObjectRequest aClass48_4;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	private int anInt1116;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "Z")
	private boolean aBoolean92;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!bb;")
	private final SignLink aClass7_5;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V", line = 59)
	@Override
	public void method1251() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)V", line = 69)
	@Override
	public void method1244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			arg1 = 1;
		}
		@Pc(19) int local19 = Static40.method1248(arg1) - arg0;
		if (this.aClass48_4 != null) {
			this.anInt1116 = local19;
		} else if (this.aBoolean92) {
			try {
				Static101.method305("midibox.volume=" + local19 + ";", this.aClass7_5.anApplet1);
				return;
			} catch (@Pc(44) Throwable local44) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 132)
	@Override
	public void method1249() {
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V", line = 157)
	@Override
	public void method1252() {
		if (this.aClass48_4 == null || this.aClass48_4.anInt1928 == 0) {
			return;
		}
		if (this.aClass48_4.anInt1928 == 1) {
			@Pc(25) FileOnDisk local25 = (FileOnDisk) this.aClass48_4.value;
			try {
				local25.write(0, this.aByteArray12.length, this.aByteArray12);
				local25.close();
				try {
					Static101.method305("midibox.loop=" + (this.aBoolean91 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local25.getFile().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt1116 + ";", this.aClass7_5.anApplet1);
					this.aBoolean92 = true;
				} catch (@Pc(79) Throwable local79) {
				}
			} catch (@Pc(81) Exception local81) {
				try {
					local25.close();
				} catch (@Pc(86) Exception local86) {
				}
			}
		}
		this.aClass48_4 = null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V", line = 218)
	@Override
	public void method1241() {
		if (this.aBoolean92) {
			try {
				Static101.method305("midibox.src=\"c:/silence.mid\";", this.aClass7_5.anApplet1);
			} catch (@Pc(15) Throwable local15) {
			}
			this.aBoolean92 = false;
		}
		this.aClass48_4 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZB[BI)V", line = 237)
	@Override
	public void method1250(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.aClass48_4 = this.aClass7_5.method197();
		if (this.aClass48_4 == null) {
			return;
		}
		if (arg2 == 0) {
			arg2 = 1;
		}
		this.anInt1116 = Static40.method1248(arg2);
		this.aBoolean91 = arg0;
		this.aByteArray12 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!bb;)V", line = 431)
	public LegacyMidiAudioBuss(@OriginalArg(0) SignLink arg0) {
		this.aClass7_5 = arg0;
	}
}

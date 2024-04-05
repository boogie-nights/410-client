package jagex2.graphics;

import jagex2.Static47;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class28 {

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!ga;")
	public Class2_Sub5 aClass2_Sub5_1 = null;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	public int anInt1098 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
	public final int[] anIntArray226;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
	public final int[] anIntArray231;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	public final int[] anIntArray230;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[I")
	public final int[] anIntArray229;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLclient!ga;)V")
	public Class28(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		this.aClass2_Sub5_1 = arg1;
		@Pc(18) Packet local18 = new Packet(arg0);
		@Pc(23) Packet local23 = new Packet(arg0);
		local18.pos = 2;
		@Pc(30) int local30 = local18.g1();
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = 0;
		local23.pos = local18.pos + local30;
		@Pc(47) int flags;
		for (@Pc(42) int local42 = 0; local42 < local30; local42++) {
			flags = local18.g1();
			if (flags > 0) {
				if (this.aClass2_Sub5_1.anIntArray142[local42] != 0) {
					for (@Pc(59) int local59 = local42 - 1; local59 > local32; local59--) {
						if (this.aClass2_Sub5_1.anIntArray142[local59] == 0) {
							Static47.anIntArray227[local34] = local59;
							Static47.anIntArray228[local34] = 0;
							Static47.anIntArray233[local34] = 0;
							Static47.anIntArray232[local34] = 0;
							local34++;
							break;
						}
					}
				}
				Static47.anIntArray227[local34] = local42;
				@Pc(94) short local94 = 0;
				if (this.aClass2_Sub5_1.anIntArray142[local42] == 3) {
					local94 = 128;
				}
				if ((flags & 0x1) == 0) {
					Static47.anIntArray228[local34] = local94;
				} else {
					Static47.anIntArray228[local34] = local23.gsmart();
				}
				if ((flags & 0x2) == 0) {
					Static47.anIntArray233[local34] = local94;
				} else {
					Static47.anIntArray233[local34] = local23.gsmart();
				}
				if ((flags & 0x4) == 0) {
					Static47.anIntArray232[local34] = local94;
				} else {
					Static47.anIntArray232[local34] = local23.gsmart();
				}
				local32 = local42;
				local34++;
				if (this.aClass2_Sub5_1.anIntArray142[local42] == 5) {
					this.aBoolean88 = true;
				}
			}
		}
		if (local23.pos != arg0.length) {
			throw new RuntimeException();
		}
		this.anInt1098 = local34;
		this.anIntArray226 = new int[local34];
		this.anIntArray231 = new int[local34];
		this.anIntArray230 = new int[local34];
		this.anIntArray229 = new int[local34];
		for (flags = 0; flags < local34; flags++) {
			this.anIntArray226[flags] = Static47.anIntArray227[flags];
			this.anIntArray231[flags] = Static47.anIntArray228[flags];
			this.anIntArray230[flags] = Static47.anIntArray233[flags];
			this.anIntArray229[flags] = Static47.anIntArray232[flags];
		}
	}
}

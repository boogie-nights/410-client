package jagex2;

import jagex2.config.IdkType;
import jagex2.graphics.Model;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class33 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Lclient!ne;")
	public Model method999() {
		if (this.anInt1520 != -1) {
			return Static36.method640(this.anInt1520).method615();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(27) int local27 = this.anIntArray314[local20];
			if (local27 >= 256 && local27 < 512 && !Static91.method1469(local27 - 256).method1585()) {
				local18 = true;
			}
			if (local27 >= 512 && !Static105.get(local27 - 512).method710(this.aBoolean117)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(74) int local74 = 0;
		@Pc(77) Model[] local77 = new Model[12];
		for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
			@Pc(86) int local86 = this.anIntArray314[local79];
			@Pc(106) Model local106;
			if (local86 >= 256 && local86 < 512) {
				local106 = Static91.method1469(local86 - 256).getHeadModel();
				if (local106 != null) {
					local77[local74++] = local106;
				}
			}
			if (local86 >= 512) {
				local106 = Static105.get(local86 - 512).method714(this.aBoolean117);
				if (local106 != null) {
					local77[local74++] = local106;
				}
			}
		}
		@Pc(147) Model local147 = new Model(local77, local74);
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			if (this.anIntArray313[local149] != 0) {
				local147.recolor(Static10.DESIGN_BODY_COLOR[local149][0], Static10.DESIGN_BODY_COLOR[local149][this.anIntArray313[local149]]);
				if (local149 == 1) {
					local147.recolor(Static97.DESIGN_HAIR_COLOR[0], Static97.DESIGN_HAIR_COLOR[this.anIntArray313[local149]]);
				}
			}
		}
		return local147;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z[II[IB)V")
	public void method1001(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static103.anInt2493; local16++) {
					@Pc(22) IdkType local22 = Static91.method1469(local16);
					if (local22 != null && !local22.disable && local22.type == local12 + (arg0 ? 7 : 0)) {
						arg3[Static35.anIntArray160[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean117 = arg0;
		this.anIntArray313 = arg1;
		this.anInt1520 = arg2;
		this.anIntArray314 = arg3;
		this.method1008();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZ)V")
	public void method1002(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean117 != arg0) {
			this.method1001(arg0, this.anIntArray313, -1, null);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZII)V")
	public void method1004(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean117) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray314[Static35.anIntArray160[arg1]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(47) IdkType local47;
		do {
			if (arg0) {
				local19++;
				if (Static103.anInt2493 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static103.anInt2493 - 1;
				}
			}
			local47 = Static91.method1469(local19);
		} while (local47 == null || local47.disable || (this.aBoolean117 ? 7 : 0) + arg1 != local47.type);
		this.anIntArray314[Static35.anIntArray160[arg1]] = local19 + 256;
		this.method1008();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBLclient!f;Lclient!f;)Lclient!ne;")
	public Model method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub6 arg2, @OriginalArg(4) Class2_Sub2_Sub6 arg3) {
		if (this.anInt1520 != -1) {
			return Static36.method640(this.anInt1520).method605(arg2, arg3, arg0, arg1);
		}
		@Pc(27) int[] local27 = this.anIntArray314;
		@Pc(35) long local35 = this.aLong101;
		if (arg2 != null && (arg2.anInt668 >= 0 || arg2.anInt664 >= 0)) {
			local27 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local27[local54] = this.anIntArray314[local54];
			}
			if (arg2.anInt668 >= 0) {
				local35 += arg2.anInt668 - this.anIntArray314[5] << 8;
				local27[5] = arg2.anInt668;
			}
			if (arg2.anInt664 >= 0) {
				local35 += arg2.anInt664 - this.anIntArray314[3] << 16;
				local27[3] = arg2.anInt664;
			}
		}
		@Pc(125) Model local125 = (Model) Static90.aClass47_17.get(local35);
		if (local125 == null) {
			@Pc(129) boolean local129 = false;
			for (@Pc(131) int local131 = 0; local131 < 12; local131++) {
				@Pc(137) int local137 = local27[local131];
				if (local137 >= 256 && local137 < 512 && !Static91.method1469(local137 - 256).method1582()) {
					local129 = true;
				}
				if (local137 >= 512 && !Static105.get(local137 - 512).method709(this.aBoolean117)) {
					local129 = true;
				}
			}
			if (local129) {
				if (this.aLong100 != -1L) {
					local125 = (Model) Static90.aClass47_17.get(this.aLong100);
				}
				if (local125 == null) {
					return null;
				}
			}
			if (local125 == null) {
				@Pc(197) Model[] local197 = new Model[12];
				@Pc(199) int local199 = 0;
				@Pc(207) int local207;
				for (@Pc(201) int local201 = 0; local201 < 12; local201++) {
					local207 = local27[local201];
					@Pc(225) Model local225;
					if (local207 >= 256 && local207 < 512) {
						local225 = Static91.method1469(local207 - 256).getModel();
						if (local225 != null) {
							local197[local199++] = local225;
						}
					}
					if (local207 >= 512) {
						local225 = Static105.get(local207 - 512).method718(this.aBoolean117);
						if (local225 != null) {
							local197[local199++] = local225;
						}
					}
				}
				local125 = new Model(local197, local199);
				for (local207 = 0; local207 < 5; local207++) {
					if (this.anIntArray313[local207] != 0) {
						local125.recolor(Static10.DESIGN_BODY_COLOR[local207][0], Static10.DESIGN_BODY_COLOR[local207][this.anIntArray313[local207]]);
						if (local207 == 1) {
							local125.recolor(Static97.DESIGN_HAIR_COLOR[0], Static97.DESIGN_HAIR_COLOR[this.anIntArray313[local207]]);
						}
					}
				}
				local125.method1160();
				local125.calculateNormals(64, 850, -30, -50, -30, true);
				Static90.aClass47_17.put(local35, local125);
				this.aLong100 = local35;
			}
		}
		if (arg2 == null && arg3 == null) {
			return local125;
		}
		@Pc(340) Model local340;
		if (arg2 != null && arg3 != null) {
			local340 = arg2.method519(arg3, arg1, local125, arg0);
		} else if (arg2 == null) {
			local340 = arg3.method526(local125, arg1);
		} else {
			local340 = arg2.method526(local125, arg0);
		}
		return local340;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
	public int method1006() {
		return this.anInt1520 == -1 ? (this.anIntArray314[11] << 5) + (this.anIntArray314[8] << 10) + (this.anIntArray313[4] << 20) + (this.anIntArray313[0] << 25) + (this.anIntArray314[0] << 15) + this.anIntArray314[1] : 305419896 - -Static36.method640(this.anInt1520).anInt762;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1007(@OriginalArg(0) Packet arg0) {
		arg0.p1(this.aBoolean117 ? 1 : 0);
		@Pc(31) int local31;
		for (@Pc(22) int local22 = 0; local22 < 7; local22++) {
			local31 = this.anIntArray314[Static35.anIntArray160[local22]];
			if (local31 == 0) {
				arg0.p1(-1);
			} else {
				arg0.p1(local31 - 256);
			}
		}
		for (local31 = 0; local31 < 5; local31++) {
			arg0.p1(this.anIntArray313[local31]);
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	private void method1008() {
		@Pc(8) long local8 = this.aLong101;
		@Pc(13) int local13 = this.anIntArray314[5];
		@Pc(18) int local18 = this.anIntArray314[9];
		this.anIntArray314[5] = local18;
		this.anIntArray314[9] = local13;
		this.aLong101 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong101 <<= 0x4;
			if (this.anIntArray314[local33] >= 256) {
				this.aLong101 += this.anIntArray314[local33] - 256;
			}
		}
		if (this.anIntArray314[0] >= 256) {
			this.aLong101 += this.anIntArray314[0] - 256 >> 4;
		}
		if (this.anIntArray314[1] >= 256) {
			this.aLong101 += this.anIntArray314[1] - 256 >> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong101 <<= 0x3;
			this.aLong101 += this.anIntArray313[local109];
		}
		this.aLong101 <<= 0x1;
		this.aLong101 += this.aBoolean117 ? 1 : 0;
		this.anIntArray314[5] = local13;
		this.anIntArray314[9] = local18;
		if (local8 != 0L && local8 != this.aLong101) {
			Static90.aClass47_17.method1327(local8);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)V")
	public void method1009(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = this.anIntArray313[arg0];
		if (arg1) {
			local11++;
			if (local11 >= Static10.DESIGN_BODY_COLOR[arg0].length) {
				local11 = 0;
			}
		} else {
			local11--;
			if (local11 < 0) {
				local11 = Static10.DESIGN_BODY_COLOR[arg0].length - 1;
			}
		}
		this.anIntArray313[arg0] = local11;
		this.method1008();
	}
}

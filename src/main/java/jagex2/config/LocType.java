package jagex2.config;

import jagex2.*;
import jagex2.datastruct.Hashable;
import jagex2.graphics.Model;
import jagex2.graphics.Static71;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class LocType extends Hashable {

	@OriginalMember(owner = "client!ia", name = "S", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	public int anInt1033;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "Lclient!o;")
	public Class40 aClass40_316;

	@OriginalMember(owner = "client!ia", name = "qb", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!ia", name = "Gb", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!ia", name = "Mb", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!ia", name = "Ob", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!ia", name = "O", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!ia", name = "U", descriptor = "Lclient!o;")
	public Class40 aClass40_315 = Static58.aClass40_428;

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "Z")
	public boolean aBoolean79 = true;

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "Z")
	public boolean blockwalk = true;

	@OriginalMember(owner = "client!ia", name = "nb", descriptor = "I")
	private int anInt1042 = 128;

	@OriginalMember(owner = "client!ia", name = "xb", descriptor = "I")
	public int anInt1048 = -1;

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
	public int width = 1;

	@OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
	private int anInt1052 = 0;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
	private int anInt1032 = -1;

	@OriginalMember(owner = "client!ia", name = "Bb", descriptor = "Z")
	public boolean shadow = true;

	@OriginalMember(owner = "client!ia", name = "tb", descriptor = "I")
	private int anInt1044 = -1;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
	public int anInt1030 = -1;

	@OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
	public int mapscene = -1;

	@OriginalMember(owner = "client!ia", name = "rb", descriptor = "I")
	private int anInt1043 = 0;

	@OriginalMember(owner = "client!ia", name = "Ib", descriptor = "I")
	public int anInt1054 = -1;

	@OriginalMember(owner = "client!ia", name = "kb", descriptor = "I")
	public int length = 1;

	@OriginalMember(owner = "client!ia", name = "Eb", descriptor = "I")
	private int anInt1051 = 128;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
	public int anInt1034 = -1;

	@OriginalMember(owner = "client!ia", name = "Lb", descriptor = "I")
	public int anInt1057 = 0;

	@OriginalMember(owner = "client!ia", name = "Db", descriptor = "I")
	public int walloff = 16;

	@OriginalMember(owner = "client!ia", name = "Kb", descriptor = "I")
	private int anInt1056 = 0;

	@OriginalMember(owner = "client!ia", name = "ob", descriptor = "Z")
	public boolean occlude = false;

	@OriginalMember(owner = "client!ia", name = "Nb", descriptor = "I")
	private int anInt1058 = 128;

	@OriginalMember(owner = "client!ia", name = "Sb", descriptor = "[Lclient!o;")
	public final Class40[] aClass40Array20 = new Class40[5];

	@OriginalMember(owner = "client!ia", name = "Ub", descriptor = "I")
	private int anInt1060 = 0;

	@OriginalMember(owner = "client!ia", name = "Tb", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!ia", name = "Vb", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ia", name = "Wb", descriptor = "I")
	private int anInt1061 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)Lclient!ne;")
	public Model method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) long local17;
		if (this.anIntArray211 == null) {
			local17 = (this.anInt1033 << 10) + arg0;
		} else {
			local17 = (this.anInt1033 << 10) + (arg4 << 3) + arg0;
		}
		@Pc(38) Model local38 = (Model) Static41.aClass47_10.get(local17);
		if (local38 == null) {
			local38 = this.method771(!this.aBoolean80, arg4, false, arg0);
			if (local38 == null) {
				return null;
			}
			Static41.aClass47_10.put(local17, local38);
		}
		if (this.aBoolean84 || this.aBoolean80) {
			local38 = new Model(local38, this.aBoolean84, this.aBoolean80);
		}
		if (this.aBoolean84) {
			@Pc(99) int local99 = (arg2 + arg1 + arg3 + arg5) / 4;
			for (@Pc(101) int local101 = 0; local101 < local38.vertexCount; local101++) {
				@Pc(108) int local108 = local38.vertexZ[local101];
				@Pc(113) int local113 = local38.vertexX[local101];
				@Pc(126) int local126 = arg3 + (arg1 - arg3) * (local113 + 64) / 128;
				@Pc(138) int local138 = arg2 + (arg5 - arg2) * (local113 + 64) / 128;
				@Pc(151) int local151 = local126 + (local138 - local126) * (local108 + 64) / 128;
				local38.vertexY[local101] += local151 - local99;
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)Lclient!ia;")
	public LocType method766() {
		@Pc(10) int local10 = -1;
		if (this.anInt1032 != -1) {
			local10 = Static107.method1662(this.anInt1032);
		} else if (this.anInt1044 != -1) {
			local10 = Static67.varps[this.anInt1044];
		}
		return local10 < 0 || local10 >= this.anIntArray210.length || this.anIntArray210[local10] == -1 ? null : Static91.method1470(this.anIntArray210[local10]);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!eb;)V")
	public void method767(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.g1();
			if (local17 == 0) {
				return;
			}
			this.method776(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Z")
	public boolean method769(@OriginalArg(0) int arg0) {
		if (this.anIntArray211 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.anIntArray211.length; local52++) {
				if (arg0 == this.anIntArray211[local52]) {
					return Static23.aClass5_8.method64(0, this.anIntArray213[local52] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray213 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(25) boolean local25 = true;
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray213.length; local27++) {
				local25 &= Static23.aClass5_8.method64(0, this.anIntArray213[local27] & 0xFFFF);
			}
			return local25;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIZI)Lclient!ne;")
	private Model method771(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Model local9 = null;
		@Pc(20) int local20;
		@Pc(53) int local53;
		@Pc(124) boolean local124;
		@Pc(136) int local136;
		if (this.anIntArray211 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray213 == null) {
				return null;
			}
			local124 = arg3 > 3 ^ this.aBoolean78;
			local20 = this.anIntArray213.length;
			for (local53 = 0; local53 < local20; local53++) {
				local136 = this.anIntArray213[local53];
				if (local124) {
					local136 += 65536;
				}
				local9 = (Model) Static92.aClass47_21.get((long) local136);
				if (local9 == null) {
					local9 = Static71.method1163(Static23.aClass5_8, local136 & 0xFFFF);
					if (local9 == null) {
						return null;
					}
					if (local124) {
						local9.rotateY180();
					}
					Static92.aClass47_21.put((long) local136, local9);
				}
				if (local20 > 1) {
					Static98.aModelArray1[local53] = local9;
				}
			}
			if (local20 > 1) {
				local9 = new Model(Static98.aModelArray1, local20);
			}
		} else {
			@Pc(18) int local18 = -1;
			for (local20 = 0; local20 < this.anIntArray211.length; local20++) {
				if (arg1 == this.anIntArray211[local20]) {
					local18 = local20;
					break;
				}
			}
			if (local18 == -1) {
				return null;
			}
			local53 = this.anIntArray213[local18];
			@Pc(65) boolean local65 = arg3 > 3 ^ this.aBoolean78;
			if (local65) {
				local53 += 65536;
			}
			local9 = (Model) Static92.aClass47_21.get((long) local53);
			if (local9 == null) {
				local9 = Static71.method1163(Static23.aClass5_8, local53 & 0xFFFF);
				if (local9 == null) {
					return null;
				}
				if (local65) {
					local9.rotateY180();
				}
				Static92.aClass47_21.put((long) local53, local9);
			}
		}
		if (this.anInt1042 == 128 && this.anInt1058 == 128 && this.anInt1051 == 128) {
			local124 = false;
		} else {
			local124 = true;
		}
		@Pc(232) boolean local232;
		if (this.anInt1043 == 0 && this.anInt1056 == 0 && this.anInt1060 == 0) {
			local232 = false;
		} else {
			local232 = true;
		}
		@Pc(260) Model local260 = new Model(local9, arg3 == 0 && !local124 && !local232, this.anIntArray212 == null, true);
		@Pc(264) int local264 = arg3 & 0x3;
		if (local264 == 1) {
			local260.rotateY90();
		} else if (local264 == 2) {
			local260.method1149();
		} else if (local264 == 3) {
			local260.method1146();
		}
		if (this.anIntArray212 != null) {
			for (local136 = 0; local136 < this.anIntArray212.length; local136++) {
				local260.recolor(this.anIntArray212[local136], this.anIntArray209[local136]);
			}
		}
		if (local124) {
			local260.scale(this.anInt1042, this.anInt1058, this.anInt1051);
		}
		if (local232) {
			local260.translate(this.anInt1043, this.anInt1056, this.anInt1060);
		}
		if (arg2) {
			local260.method1160();
		}
		local260.calculateNormals(this.anInt1061 + 64, this.anInt1052 * 5 + 768, -50, -10, -50, arg0);
		return local260;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public void method772() {
		if (this.anInt1054 == -1) {
			this.anInt1054 = 0;
			if (this.anIntArray213 != null && (this.anIntArray211 == null || this.anIntArray211[0] == 10)) {
				this.anInt1054 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass40Array20[local27] != null) {
					this.anInt1054 = 1;
				}
			}
		}
		if (this.anInt1030 == -1) {
			this.anInt1030 = this.blockwalk ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)Z")
	public boolean method773() {
		if (this.anIntArray213 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray213.length; local19++) {
			local17 &= Static23.aClass5_8.method64(0, this.anIntArray213[local19] & 0xFFFF);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!eb;)V")
	private void method776(@OriginalArg(1) int arg0, @OriginalArg(2) Packet arg1) {
		@Pc(20) int local20;
		@Pc(40) int local40;
		if (arg0 == 1) {
			local20 = arg1.g1();
			if (local20 > 0) {
				if (this.anIntArray213 != null && !Static37.aBoolean65) {
					arg1.pos += local20 * 3;
					return;
				}
				this.anIntArray213 = new int[local20];
				this.anIntArray211 = new int[local20];
				for (local40 = 0; local40 < local20; local40++) {
					this.anIntArray213[local40] = arg1.g2();
					this.anIntArray211[local40] = arg1.g1();
				}
				return;
			}
		} else if (arg0 == 2) {
			this.aClass40_315 = arg1.method1721();
		} else if (arg0 == 3) {
			this.aClass40_316 = arg1.method1721();
			return;
		} else {
			if (arg0 == 5) {
				local20 = arg1.g1();
				if (local20 > 0) {
					if (this.anIntArray213 != null && !Static37.aBoolean65) {
						arg1.pos += local20 * 2;
						return;
					}
					this.anIntArray213 = new int[local20];
					this.anIntArray211 = null;
					for (local40 = 0; local40 < local20; local40++) {
						this.anIntArray213[local40] = arg1.g2();
					}
					return;
				}
			} else if (arg0 == 14) {
				this.width = arg1.g1();
			} else if (arg0 == 15) {
				this.length = arg1.g1();
				return;
			} else if (arg0 == 17) {
				this.blockwalk = false;
				return;
			} else if (arg0 == 18) {
				this.aBoolean79 = false;
				return;
			} else if (arg0 == 19) {
				this.anInt1054 = arg1.g1();
				return;
			} else if (arg0 == 21) {
				this.aBoolean84 = true;
				return;
			} else {
				if (arg0 == 22) {
					this.aBoolean80 = true;
				} else if (arg0 == 23) {
					this.occlude = true;
					return;
				} else if (arg0 == 24) {
					this.anInt1048 = arg1.g2();
					if (this.anInt1048 == 65535) {
						this.anInt1048 = -1;
						return;
					}
				} else if (arg0 == 28) {
					this.walloff = arg1.g1();
					return;
				} else if (arg0 == 29) {
					this.anInt1061 = arg1.g1b();
					return;
				} else if (arg0 == 39) {
					this.anInt1052 = arg1.g1b() * 5;
					return;
				} else {
					if (arg0 >= 30 && arg0 < 35) {
						this.aClass40Array20[arg0 - 30] = arg1.method1721();
						if (this.aClass40Array20[arg0 - 30].method1199(Static48.aClass40_346)) {
							this.aClass40Array20[arg0 - 30] = null;
							return;
						}
					} else if (arg0 == 40) {
						local20 = arg1.g1();
						this.anIntArray209 = new int[local20];
						this.anIntArray212 = new int[local20];
						for (local40 = 0; local40 < local20; local40++) {
							this.anIntArray212[local40] = arg1.g2();
							this.anIntArray209[local40] = arg1.g2();
						}
						return;
					} else if (arg0 == 60) {
						this.anInt1034 = arg1.g2();
						return;
					} else if (arg0 == 62) {
						this.aBoolean78 = true;
						return;
					} else if (arg0 == 64) {
						this.shadow = false;
					} else if (arg0 == 65) {
						this.anInt1042 = arg1.g2();
						return;
					} else if (arg0 == 66) {
						this.anInt1058 = arg1.g2();
						return;
					} else if (arg0 == 67) {
						this.anInt1051 = arg1.g2();
						return;
					} else if (arg0 == 68) {
						this.mapscene = arg1.g2();
						return;
					} else if (arg0 == 69) {
						this.anInt1057 = arg1.g1();
						return;
					} else if (arg0 == 70) {
						this.anInt1043 = arg1.g2b();
						return;
					} else if (arg0 == 71) {
						this.anInt1056 = arg1.g2b();
						return;
					} else if (arg0 == 72) {
						this.anInt1060 = arg1.g2b();
						return;
					} else if (arg0 == 73) {
						this.aBoolean76 = true;
						return;
					} else if (arg0 == 74) {
						this.aBoolean83 = true;
						return;
					} else {
						if (arg0 == 75) {
							this.anInt1030 = arg1.g1();
						} else if (arg0 == 77) {
							this.anInt1032 = arg1.g2();
							if (this.anInt1032 == 65535) {
								this.anInt1032 = -1;
							}
							this.anInt1044 = arg1.g2();
							if (this.anInt1044 == 65535) {
								this.anInt1044 = -1;
							}
							local20 = arg1.g1();
							this.anIntArray210 = new int[local20 + 1];
							for (local40 = 0; local40 <= local20; local40++) {
								this.anIntArray210[local40] = arg1.g2();
								if (this.anIntArray210[local40] == 65535) {
									this.anIntArray210[local40] = -1;
								}
							}
							return;
						}
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!f;IIIIB)Lclient!ne;")
	public Model method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub2_Sub6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(21) long local21;
		if (this.anIntArray211 == null) {
			local21 = arg0 + (this.anInt1033 << 10);
		} else {
			local21 = (this.anInt1033 << 10) + (arg4 << 3) + arg0;
		}
		@Pc(43) Model local43 = (Model) Static2.aClass47_1.get(local21);
		if (local43 == null) {
			local43 = this.method771(true, arg4, true, arg0);
			if (local43 == null) {
				return null;
			}
			Static2.aClass47_1.put(local21, local43);
		}
		if (arg3 == null && !this.aBoolean84) {
			return local43;
		}
		if (arg3 == null) {
			local43 = local43.method1142(true);
		} else {
			local43 = arg3.method521(local43, arg5, arg0);
		}
		if (this.aBoolean84) {
			@Pc(100) int local100 = (arg6 + arg2 + arg1 + arg7) / 4;
			for (@Pc(102) int local102 = 0; local102 < local43.vertexCount; local102++) {
				@Pc(109) int local109 = local43.vertexX[local102];
				@Pc(121) int local121 = (arg2 - arg6) * (local109 + 64) / 128 + arg6;
				@Pc(134) int local134 = arg7 + (arg1 - arg7) * (local109 + 64) / 128;
				@Pc(139) int local139 = local43.vertexZ[local102];
				@Pc(151) int local151 = local121 + (local134 - local121) * (local139 + 64) / 128;
				local43.vertexY[local102] += local151 - local100;
			}
		}
		return local43;
	}
}

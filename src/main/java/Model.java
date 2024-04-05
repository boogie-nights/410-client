import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Model extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!ne", name = "vc", descriptor = "[I")
	public static int[] anIntArray405 = new int[128];

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
	public int minX;

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
	private int[] faceColorC;

	@OriginalMember(owner = "client!ne", name = "jb", descriptor = "[I")
	private int[] faceColorB;

	@OriginalMember(owner = "client!ne", name = "nb", descriptor = "I")
	public int minZ;

	@OriginalMember(owner = "client!ne", name = "pb", descriptor = "I")
	public int minY;

	@OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
	private int anInt1739;

	@OriginalMember(owner = "client!ne", name = "rb", descriptor = "[[I")
	private int[][] labelVerticies;

	@OriginalMember(owner = "client!ne", name = "tb", descriptor = "[Lclient!bd;")
	public VertexNormal[] vertexNormal;

	@OriginalMember(owner = "client!ne", name = "vb", descriptor = "[Lclient!bd;")
	public VertexNormal[] vertexNormalOriginal;

	@OriginalMember(owner = "client!ne", name = "Bb", descriptor = "I")
	private int anInt1740;

	@OriginalMember(owner = "client!ne", name = "Cb", descriptor = "[[I")
	private int[][] labelFaces;

	@OriginalMember(owner = "client!ne", name = "Gb", descriptor = "I")
	public int maxX;

	@OriginalMember(owner = "client!ne", name = "Jb", descriptor = "[I")
	private int[] faceColorA;

	@OriginalMember(owner = "client!ne", name = "Nb", descriptor = "I")
	public int maxZ;

	@OriginalMember(owner = "client!ne", name = "ob", descriptor = "I")
	private int anInt1737 = 0;

	@OriginalMember(owner = "client!ne", name = "Kb", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!ne", name = "Db", descriptor = "I")
	private int anInt1741 = 0;

	@OriginalMember(owner = "client!ne", name = "Fb", descriptor = "I")
	public int vertexCount = 0;

	@OriginalMember(owner = "client!ne", name = "Lb", descriptor = "I")
	public int faceCount = 0;

	@OriginalMember(owner = "client!ne", name = "kb", descriptor = "[I")
	public int[] vertexX;

	@OriginalMember(owner = "client!ne", name = "sb", descriptor = "[I")
	public int[] vertexY;

	@OriginalMember(owner = "client!ne", name = "Hb", descriptor = "[I")
	public int[] vertexZ;

	@OriginalMember(owner = "client!ne", name = "xb", descriptor = "[I")
	public int[] faceVertexA;

	@OriginalMember(owner = "client!ne", name = "wb", descriptor = "[I")
	public int[] faceVertexB;

	@OriginalMember(owner = "client!ne", name = "ib", descriptor = "[I")
	public int[] faceVertexC;

	@OriginalMember(owner = "client!ne", name = "Eb", descriptor = "[I")
	private int[] texturedVertexA;

	@OriginalMember(owner = "client!ne", name = "zb", descriptor = "[I")
	private int[] texturedVertexB;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "[I")
	private int[] texturedVertexC;

	@OriginalMember(owner = "client!ne", name = "mb", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!ne", name = "Ab", descriptor = "[I")
	public int[] faceInfo;

	@OriginalMember(owner = "client!ne", name = "yb", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!ne", name = "lb", descriptor = "[I")
	private int[] faceAlpha;

	@OriginalMember(owner = "client!ne", name = "Ib", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!ne", name = "ub", descriptor = "[I")
	private int[] faceColor;

	static {
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 248;
		while (local93 < 9) {
			anIntArray405[local93++] = 255;
		}
		while (local93 < 16) {
			anIntArray405[local93++] = local95;
			local95 -= 8;
		}
		while (local93 < 32) {
			anIntArray405[local93++] = local95;
			local95 -= 4;
		}
		while (local93 < 64) {
			anIntArray405[local93++] = local95;
			local95 -= 2;
		}
		while (local93 < 128) {
			anIntArray405[local93++] = local95--;
		}
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
	public Model(@OriginalArg(0) byte[] arg0) {
		@Pc(21) Packet local21 = new Packet(arg0);
		@Pc(26) Packet local26 = new Packet(arg0);
		@Pc(31) Packet local31 = new Packet(arg0);
		@Pc(36) Packet local36 = new Packet(arg0);
		@Pc(41) Packet local41 = new Packet(arg0);
		local21.anInt2546 = arg0.length - 18;
		@Pc(51) int local51 = local21.method1704();
		@Pc(55) int local55 = local21.method1704();
		@Pc(59) int local59 = local21.method1708();
		@Pc(63) int local63 = local21.method1708();
		@Pc(67) int local67 = local21.method1708();
		@Pc(71) int local71 = local21.method1708();
		@Pc(75) int local75 = local21.method1708();
		@Pc(79) int local79 = local21.method1708();
		@Pc(83) int local83 = local21.method1704();
		@Pc(87) int local87 = local21.method1704();
		@Pc(91) int local91 = local21.method1704();
		@Pc(95) int local95 = local21.method1704();
		@Pc(97) byte local97 = 0;
		@Pc(103) int local103 = local97 + local51;
		@Pc(105) int local105 = local103;
		local103 += local55;
		@Pc(111) int local111 = local103;
		if (local67 == 255) {
			local103 += local55;
		} else {
			local111 = -local67 - 1;
		}
		@Pc(126) int local126 = local103;
		if (local75 == 1) {
			local103 += local55;
		} else {
			local126 = -1;
		}
		@Pc(138) int local138 = local103;
		if (local63 == 1) {
			local103 += local55;
		} else {
			local138 = -1;
		}
		@Pc(150) int local150 = local103;
		if (local79 == 1) {
			local103 += local51;
		} else {
			local150 = -1;
		}
		@Pc(162) int local162 = local103;
		if (local71 == 1) {
			local103 += local55;
		} else {
			local162 = -1;
		}
		@Pc(174) int local174 = local103;
		local103 += local95;
		@Pc(180) int local180 = local103;
		local103 += local55 * 2;
		@Pc(188) int local188 = local103;
		local103 += local59 * 6;
		@Pc(196) int local196 = local103;
		local103 += local83;
		@Pc(202) int local202 = local103;
		local103 += local87;
		this.vertexCount = local51;
		this.faceCount = local55;
		this.anInt1741 = local59;
		this.vertexX = new int[local51];
		this.vertexY = new int[local51];
		this.vertexZ = new int[local51];
		this.faceVertexA = new int[local55];
		this.faceVertexB = new int[local55];
		this.faceVertexC = new int[local55];
		this.texturedVertexA = new int[local59];
		this.texturedVertexB = new int[local59];
		this.texturedVertexC = new int[local59];
		if (local150 >= 0) {
			this.anIntArray372 = new int[local51];
		}
		if (local138 >= 0) {
			this.faceInfo = new int[local55];
		}
		if (local111 >= 0) {
			this.anIntArray377 = new int[local55];
		} else {
			this.anInt1737 = -local111 - 1;
		}
		if (local162 >= 0) {
			this.faceAlpha = new int[local55];
		}
		if (local126 >= 0) {
			this.anIntArray382 = new int[local55];
		}
		this.faceColor = new int[local55];
		local21.anInt2546 = local97;
		local26.anInt2546 = local196;
		local31.anInt2546 = local202;
		local36.anInt2546 = local103;
		local41.anInt2546 = local150;
		@Pc(315) int local315 = 0;
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(338) int local338;
		@Pc(348) int local348;
		for (@Pc(321) int local321 = 0; local321 < local51; local321++) {
			local326 = local21.method1708();
			local328 = 0;
			if ((local326 & 0x1) != 0) {
				local328 = local26.method1699();
			}
			local338 = 0;
			if ((local326 & 0x2) != 0) {
				local338 = local31.method1699();
			}
			local348 = 0;
			if ((local326 & 0x4) != 0) {
				local348 = local36.method1699();
			}
			this.vertexX[local321] = local315 + local328;
			this.vertexY[local321] = local317 + local338;
			this.vertexZ[local321] = local319 + local348;
			local315 = this.vertexX[local321];
			local317 = this.vertexY[local321];
			local319 = this.vertexZ[local321];
			if (this.anIntArray372 != null) {
				this.anIntArray372[local321] = local41.method1708();
			}
		}
		local21.anInt2546 = local180;
		local26.anInt2546 = local138;
		local31.anInt2546 = local111;
		local36.anInt2546 = local162;
		local41.anInt2546 = local126;
		for (local326 = 0; local326 < local55; local326++) {
			this.faceColor[local326] = local21.method1704();
			if (this.faceInfo != null) {
				this.faceInfo[local326] = local26.method1708();
			}
			if (this.anIntArray377 != null) {
				this.anIntArray377[local326] = local31.method1708();
			}
			if (this.faceAlpha != null) {
				this.faceAlpha[local326] = local36.method1708();
			}
			if (this.anIntArray382 != null) {
				this.anIntArray382[local326] = local41.method1708();
			}
		}
		local21.anInt2546 = local174;
		local26.anInt2546 = local105;
		local328 = 0;
		local338 = 0;
		local348 = 0;
		@Pc(489) int local489 = 0;
		@Pc(496) int local496;
		for (@Pc(491) int local491 = 0; local491 < local55; local491++) {
			local496 = local26.method1708();
			if (local496 == 1) {
				local328 = local21.method1699() + local489;
				local338 = local21.method1699() + local328;
				local348 = local21.method1699() + local338;
				local489 = local348;
				this.faceVertexA[local491] = local328;
				this.faceVertexB[local491] = local338;
				this.faceVertexC[local491] = local348;
			}
			if (local496 == 2) {
				local338 = local348;
				local348 = local21.method1699() + local489;
				local489 = local348;
				this.faceVertexA[local491] = local328;
				this.faceVertexB[local491] = local338;
				this.faceVertexC[local491] = local348;
			}
			if (local496 == 3) {
				local328 = local348;
				local348 = local21.method1699() + local489;
				local489 = local348;
				this.faceVertexA[local491] = local328;
				this.faceVertexB[local491] = local338;
				this.faceVertexC[local491] = local348;
			}
			if (local496 == 4) {
				@Pc(599) int local599 = local328;
				local328 = local338;
				local338 = local599;
				local348 = local21.method1699() + local489;
				local489 = local348;
				this.faceVertexA[local491] = local328;
				this.faceVertexB[local491] = local599;
				this.faceVertexC[local491] = local348;
			}
		}
		local21.anInt2546 = local188;
		for (local496 = 0; local496 < local59; local496++) {
			this.texturedVertexA[local496] = local21.method1704();
			this.texturedVertexB[local496] = local21.method1704();
			this.texturedVertexC[local496] = local21.method1704();
		}
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Model() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([Lclient!ne;I)V")
	public Model(@OriginalArg(0) Model[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.vertexCount = 0;
		this.faceCount = 0;
		this.anInt1741 = 0;
		this.anInt1737 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Model local43 = arg0[local38];
			if (local43 != null) {
				this.vertexCount += local43.vertexCount;
				this.faceCount += local43.faceCount;
				this.anInt1741 += local43.anInt1741;
				local18 |= local43.faceInfo != null;
				if (local43.anIntArray377 == null) {
					if (this.anInt1737 == -1) {
						this.anInt1737 = local43.anInt1737;
					}
					if (this.anInt1737 != local43.anInt1737) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.faceAlpha != null;
				local24 |= local43.anIntArray382 != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.anIntArray372 = new int[this.vertexCount];
		this.faceVertexA = new int[this.faceCount];
		this.faceVertexB = new int[this.faceCount];
		this.faceVertexC = new int[this.faceCount];
		this.texturedVertexA = new int[this.anInt1741];
		this.texturedVertexB = new int[this.anInt1741];
		this.texturedVertexC = new int[this.anInt1741];
		if (local18) {
			this.faceInfo = new int[this.faceCount];
		}
		if (local20) {
			this.anIntArray377 = new int[this.faceCount];
		}
		if (local22) {
			this.faceAlpha = new int[this.faceCount];
		}
		if (local24) {
			this.anIntArray382 = new int[this.faceCount];
		}
		this.faceColor = new int[this.faceCount];
		this.vertexCount = 0;
		this.faceCount = 0;
		this.anInt1741 = 0;
		@Pc(212) int local212 = 0;
		for (@Pc(214) int local214 = 0; local214 < arg1; local214++) {
			@Pc(219) Model local219 = arg0[local214];
			if (local219 != null) {
				@Pc(241) int local241;
				for (@Pc(223) int local223 = 0; local223 < local219.faceCount; local223++) {
					if (local18) {
						if (local219.faceInfo == null) {
							this.faceInfo[this.faceCount] = 0;
						} else {
							local241 = local219.faceInfo[local223];
							if ((local241 & 0x2) == 2) {
								local241 += local212 << 2;
							}
							this.faceInfo[this.faceCount] = local241;
						}
					}
					if (local20) {
						if (local219.anIntArray377 == null) {
							this.anIntArray377[this.faceCount] = local219.anInt1737;
						} else {
							this.anIntArray377[this.faceCount] = local219.anIntArray377[local223];
						}
					}
					if (local22) {
						if (local219.faceAlpha == null) {
							this.faceAlpha[this.faceCount] = 0;
						} else {
							this.faceAlpha[this.faceCount] = local219.faceAlpha[local223];
						}
					}
					if (local24 && local219.anIntArray382 != null) {
						this.anIntArray382[this.faceCount] = local219.anIntArray382[local223];
					}
					this.faceColor[this.faceCount] = local219.faceColor[local223];
					this.faceVertexA[this.faceCount] = this.method1145(local219, local219.faceVertexA[local223]);
					this.faceVertexB[this.faceCount] = this.method1145(local219, local219.faceVertexB[local223]);
					this.faceVertexC[this.faceCount] = this.method1145(local219, local219.faceVertexC[local223]);
					this.faceCount++;
				}
				for (local241 = 0; local241 < local219.anInt1741; local241++) {
					this.texturedVertexA[this.anInt1741] = this.method1145(local219, local219.texturedVertexA[local241]);
					this.texturedVertexB[this.anInt1741] = this.method1145(local219, local219.texturedVertexB[local241]);
					this.texturedVertexC[this.anInt1741] = this.method1145(local219, local219.texturedVertexC[local241]);
					this.anInt1741++;
				}
				local212 += local219.anInt1741;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([Lclient!ne;IZ)V")
	public Model(@OriginalArg(0) Model[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.vertexCount = 0;
		this.faceCount = 0;
		this.anInt1741 = 0;
		this.anInt1737 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Model local43 = arg0[local38];
			if (local43 != null) {
				this.vertexCount += local43.vertexCount;
				this.faceCount += local43.faceCount;
				this.anInt1741 += local43.anInt1741;
				local18 |= local43.faceInfo != null;
				if (local43.anIntArray377 == null) {
					if (this.anInt1737 == -1) {
						this.anInt1737 = local43.anInt1737;
					}
					if (this.anInt1737 != local43.anInt1737) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local22 |= local43.faceAlpha != null;
				local24 |= local43.faceColor != null;
			}
		}
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.faceVertexA = new int[this.faceCount];
		this.faceVertexB = new int[this.faceCount];
		this.faceVertexC = new int[this.faceCount];
		this.faceColorA = new int[this.faceCount];
		this.faceColorB = new int[this.faceCount];
		this.faceColorC = new int[this.faceCount];
		this.texturedVertexA = new int[this.anInt1741];
		this.texturedVertexB = new int[this.anInt1741];
		this.texturedVertexC = new int[this.anInt1741];
		if (local18) {
			this.faceInfo = new int[this.faceCount];
		}
		if (local20) {
			this.anIntArray377 = new int[this.faceCount];
		}
		if (local22) {
			this.faceAlpha = new int[this.faceCount];
		}
		if (local24) {
			this.faceColor = new int[this.faceCount];
		}
		this.vertexCount = 0;
		this.faceCount = 0;
		this.anInt1741 = 0;
		@Pc(217) int local217 = 0;
		for (@Pc(219) int local219 = 0; local219 < arg1; local219++) {
			@Pc(224) Model local224 = arg0[local219];
			if (local224 != null) {
				@Pc(229) int local229 = this.vertexCount;
				for (@Pc(231) int local231 = 0; local231 < local224.vertexCount; local231++) {
					this.vertexX[this.vertexCount] = local224.vertexX[local231];
					this.vertexY[this.vertexCount] = local224.vertexY[local231];
					this.vertexZ[this.vertexCount] = local224.vertexZ[local231];
					this.vertexCount++;
				}
				@Pc(350) int local350;
				for (@Pc(272) int local272 = 0; local272 < local224.faceCount; local272++) {
					this.faceVertexA[this.faceCount] = local224.faceVertexA[local272] + local229;
					this.faceVertexB[this.faceCount] = local224.faceVertexB[local272] + local229;
					this.faceVertexC[this.faceCount] = local224.faceVertexC[local272] + local229;
					this.faceColorA[this.faceCount] = local224.faceColorA[local272];
					this.faceColorB[this.faceCount] = local224.faceColorB[local272];
					this.faceColorC[this.faceCount] = local224.faceColorC[local272];
					if (local18) {
						if (local224.faceInfo == null) {
							this.faceInfo[this.faceCount] = 0;
						} else {
							local350 = local224.faceInfo[local272];
							if ((local350 & 0x2) == 2) {
								local350 += local217 << 2;
							}
							this.faceInfo[this.faceCount] = local350;
						}
					}
					if (local20) {
						if (local224.anIntArray377 == null) {
							this.anIntArray377[this.faceCount] = local224.anInt1737;
						} else {
							this.anIntArray377[this.faceCount] = local224.anIntArray377[local272];
						}
					}
					if (local22) {
						if (local224.faceAlpha == null) {
							this.faceAlpha[this.faceCount] = 0;
						} else {
							this.faceAlpha[this.faceCount] = local224.faceAlpha[local272];
						}
					}
					if (local24 && local224.faceColor != null) {
						this.faceColor[this.faceCount] = local224.faceColor[local272];
					}
					this.faceCount++;
				}
				for (local350 = 0; local350 < local224.anInt1741; local350++) {
					this.texturedVertexA[this.anInt1741] = local224.texturedVertexA[local350] + local229;
					this.texturedVertexB[this.anInt1741] = local224.texturedVertexB[local350] + local229;
					this.texturedVertexC[this.anInt1741] = local224.texturedVertexC[local350] + local229;
					this.anInt1741++;
				}
				local217 += local224.anInt1741;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!ne;ZZZ)V")
	public Model(@OriginalArg(0) Model arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.vertexCount = arg0.vertexCount;
		this.faceCount = arg0.faceCount;
		this.anInt1741 = arg0.anInt1741;
		@Pc(60) int local60;
		if (arg1) {
			this.vertexX = arg0.vertexX;
			this.vertexY = arg0.vertexY;
			this.vertexZ = arg0.vertexZ;
		} else {
			this.vertexX = new int[this.vertexCount];
			this.vertexY = new int[this.vertexCount];
			this.vertexZ = new int[this.vertexCount];
			for (local60 = 0; local60 < this.vertexCount; local60++) {
				this.vertexX[local60] = arg0.vertexX[local60];
				this.vertexY[local60] = arg0.vertexY[local60];
				this.vertexZ[local60] = arg0.vertexZ[local60];
			}
		}
		if (arg2) {
			this.faceColor = arg0.faceColor;
		} else {
			this.faceColor = new int[this.faceCount];
			for (local60 = 0; local60 < this.faceCount; local60++) {
				this.faceColor[local60] = arg0.faceColor[local60];
			}
		}
		this.faceAlpha = arg0.faceAlpha;
		this.anIntArray372 = arg0.anIntArray372;
		this.anIntArray382 = arg0.anIntArray382;
		this.faceInfo = arg0.faceInfo;
		this.faceVertexA = arg0.faceVertexA;
		this.faceVertexB = arg0.faceVertexB;
		this.faceVertexC = arg0.faceVertexC;
		this.anIntArray377 = arg0.anIntArray377;
		this.anInt1737 = arg0.anInt1737;
		this.texturedVertexA = arg0.texturedVertexA;
		this.texturedVertexB = arg0.texturedVertexB;
		this.texturedVertexC = arg0.texturedVertexC;
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!ne;ZZ)V")
	public Model(@OriginalArg(0) Model arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.vertexCount = arg0.vertexCount;
		this.faceCount = arg0.faceCount;
		this.anInt1741 = arg0.anInt1741;
		@Pc(37) int local37;
		if (arg1) {
			this.vertexY = new int[this.vertexCount];
			for (local37 = 0; local37 < this.vertexCount; local37++) {
				this.vertexY[local37] = arg0.vertexY[local37];
			}
		} else {
			this.vertexY = arg0.vertexY;
		}
		if (arg2) {
			this.faceColorA = new int[this.faceCount];
			this.faceColorB = new int[this.faceCount];
			this.faceColorC = new int[this.faceCount];
			for (local37 = 0; local37 < this.faceCount; local37++) {
				this.faceColorA[local37] = arg0.faceColorA[local37];
				this.faceColorB[local37] = arg0.faceColorB[local37];
				this.faceColorC[local37] = arg0.faceColorC[local37];
			}
			this.faceInfo = new int[this.faceCount];
			@Pc(115) int local115;
			if (arg0.faceInfo == null) {
				for (local115 = 0; local115 < this.faceCount; local115++) {
					this.faceInfo[local115] = 0;
				}
			} else {
				for (local115 = 0; local115 < this.faceCount; local115++) {
					this.faceInfo[local115] = arg0.faceInfo[local115];
				}
			}
			this.vertexNormal = new VertexNormal[this.vertexCount];
			for (local115 = 0; local115 < this.vertexCount; local115++) {
				@Pc(160) VertexNormal local160 = this.vertexNormal[local115] = new VertexNormal();
				@Pc(165) VertexNormal local165 = arg0.vertexNormal[local115];
				local160.x = local165.x;
				local160.y = local165.y;
				local160.z = local165.z;
				local160.w = local165.w;
			}
			this.vertexNormalOriginal = arg0.vertexNormalOriginal;
		} else {
			this.faceColorA = arg0.faceColorA;
			this.faceColorB = arg0.faceColorB;
			this.faceColorC = arg0.faceColorC;
			this.faceInfo = arg0.faceInfo;
		}
		this.vertexX = arg0.vertexX;
		this.vertexZ = arg0.vertexZ;
		this.faceColor = arg0.faceColor;
		this.faceAlpha = arg0.faceAlpha;
		this.anIntArray377 = arg0.anIntArray377;
		this.anInt1737 = arg0.anInt1737;
		this.faceVertexA = arg0.faceVertexA;
		this.faceVertexB = arg0.faceVertexB;
		this.faceVertexC = arg0.faceVertexC;
		this.texturedVertexA = arg0.texturedVertexA;
		this.texturedVertexB = arg0.texturedVertexB;
		this.texturedVertexC = arg0.texturedVertexC;
		this.anInt1739 = arg0.anInt1739;
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V")
	private void method1133(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static6.anInt225;
		@Pc(3) int local3 = Static6.anInt224;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.faceVertexA[arg0];
		@Pc(15) int local15 = this.faceVertexB[arg0];
		@Pc(20) int local20 = this.faceVertexC[arg0];
		@Pc(24) int local24 = Static71.anIntArray390[local10];
		@Pc(28) int local28 = Static71.anIntArray390[local15];
		@Pc(32) int local32 = Static71.anIntArray390[local20];
		if (this.faceAlpha == null) {
			Static6.alpha = 0;
		} else {
			Static6.alpha = this.faceAlpha[arg0];
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(93) int local93;
		if (local24 >= 50) {
			Static71.anIntArray393[0] = Static71.vertexScreenY[local10];
			Static71.anIntArray400[0] = Static71.vertexScreenX[local10];
			local5++;
			Static71.anIntArray404[0] = this.faceColorA[arg0];
		} else {
			local71 = Static71.vertexViewSpaceX[local10];
			local75 = Static71.anIntArray397[local10];
			local80 = this.faceColorA[arg0];
			if (local32 >= 50) {
				local93 = (50 - local24) * Static71.anIntArray395[local32 - local24];
				Static71.anIntArray393[0] = local1 + (local71 + ((Static71.vertexViewSpaceX[local20] - local71) * local93 >> 16) << 9) / 50;
				Static71.anIntArray400[0] = local3 + (local75 + ((Static71.anIntArray397[local20] - local75) * local93 >> 16) << 9) / 50;
				local5++;
				Static71.anIntArray404[0] = local80 + ((this.faceColorC[arg0] - local80) * local93 >> 16);
			}
			if (local28 >= 50) {
				local93 = (50 - local24) * Static71.anIntArray395[local28 - local24];
				Static71.anIntArray393[local5] = local1 + (local71 + ((Static71.vertexViewSpaceX[local15] - local71) * local93 >> 16) << 9) / 50;
				Static71.anIntArray400[local5] = local3 + (local75 + ((Static71.anIntArray397[local15] - local75) * local93 >> 16) << 9) / 50;
				Static71.anIntArray404[local5++] = local80 + ((this.faceColorB[arg0] - local80) * local93 >> 16);
			}
		}
		if (local28 >= 50) {
			Static71.anIntArray393[local5] = Static71.vertexScreenY[local15];
			Static71.anIntArray400[local5] = Static71.vertexScreenX[local15];
			Static71.anIntArray404[local5++] = this.faceColorB[arg0];
		} else {
			local71 = Static71.vertexViewSpaceX[local15];
			local75 = Static71.anIntArray397[local15];
			local80 = this.faceColorB[arg0];
			if (local24 >= 50) {
				local93 = (50 - local28) * Static71.anIntArray395[local24 - local28];
				Static71.anIntArray393[local5] = local1 + (local71 + ((Static71.vertexViewSpaceX[local10] - local71) * local93 >> 16) << 9) / 50;
				Static71.anIntArray400[local5] = local3 + (local75 + ((Static71.anIntArray397[local10] - local75) * local93 >> 16) << 9) / 50;
				Static71.anIntArray404[local5++] = local80 + ((this.faceColorA[arg0] - local80) * local93 >> 16);
			}
			if (local32 >= 50) {
				local93 = (50 - local28) * Static71.anIntArray395[local32 - local28];
				Static71.anIntArray393[local5] = local1 + (local71 + ((Static71.vertexViewSpaceX[local20] - local71) * local93 >> 16) << 9) / 50;
				Static71.anIntArray400[local5] = local3 + (local75 + ((Static71.anIntArray397[local20] - local75) * local93 >> 16) << 9) / 50;
				Static71.anIntArray404[local5++] = local80 + ((this.faceColorC[arg0] - local80) * local93 >> 16);
			}
		}
		if (local32 >= 50) {
			Static71.anIntArray393[local5] = Static71.vertexScreenY[local20];
			Static71.anIntArray400[local5] = Static71.vertexScreenX[local20];
			Static71.anIntArray404[local5++] = this.faceColorC[arg0];
		} else {
			local71 = Static71.vertexViewSpaceX[local20];
			local75 = Static71.anIntArray397[local20];
			local80 = this.faceColorC[arg0];
			if (local28 >= 50) {
				local93 = (50 - local32) * Static71.anIntArray395[local28 - local32];
				Static71.anIntArray393[local5] = local1 + (local71 + ((Static71.vertexViewSpaceX[local15] - local71) * local93 >> 16) << 9) / 50;
				Static71.anIntArray400[local5] = local3 + (local75 + ((Static71.anIntArray397[local15] - local75) * local93 >> 16) << 9) / 50;
				Static71.anIntArray404[local5++] = local80 + ((this.faceColorB[arg0] - local80) * local93 >> 16);
			}
			if (local24 >= 50) {
				local93 = (50 - local32) * Static71.anIntArray395[local24 - local32];
				Static71.anIntArray393[local5] = local1 + (local71 + ((Static71.vertexViewSpaceX[local10] - local71) * local93 >> 16) << 9) / 50;
				Static71.anIntArray400[local5] = local3 + (local75 + ((Static71.anIntArray397[local10] - local75) * local93 >> 16) << 9) / 50;
				Static71.anIntArray404[local5++] = local80 + ((this.faceColorA[arg0] - local80) * local93 >> 16);
			}
		}
		local71 = Static71.anIntArray393[0];
		local75 = Static71.anIntArray393[1];
		local80 = Static71.anIntArray393[2];
		local93 = Static71.anIntArray400[0];
		@Pc(588) int local588 = Static71.anIntArray400[1];
		@Pc(592) int local592 = Static71.anIntArray400[2];
		Static6.clipX = false;
		@Pc(619) int local619;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(688) int local688;
		if (local5 == 3) {
			if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static6.anInt222 || local75 > Static6.anInt222 || local80 > Static6.anInt222) {
				Static6.clipX = true;
			}
			if (this.faceInfo == null) {
				local619 = 0;
			} else {
				local619 = this.faceInfo[arg0] & 0x3;
			}
			if (local619 == 0) {
				Static6.fillGouraudTriangle(local93, local588, local592, local71, local75, local80, Static71.anIntArray404[0], Static71.anIntArray404[1], Static71.anIntArray404[2]);
			} else if (local619 == 1) {
				Static6.fillTriangle(local93, local588, local592, local71, local75, local80, Static71.anIntArray392[this.faceColorA[arg0]]);
			} else if (local619 == 2) {
				local673 = this.faceInfo[arg0] >> 2;
				local678 = this.texturedVertexA[local673];
				local683 = this.texturedVertexB[local673];
				local688 = this.texturedVertexC[local673];
				Static6.fillTexturedTriangle(local93, local588, local592, local71, local75, local80, Static71.anIntArray404[0], Static71.anIntArray404[1], Static71.anIntArray404[2], Static71.vertexViewSpaceX[local678], Static71.vertexViewSpaceX[local683], Static71.vertexViewSpaceX[local688], Static71.anIntArray397[local678], Static71.anIntArray397[local683], Static71.anIntArray397[local688], Static71.anIntArray390[local678], Static71.anIntArray390[local683], Static71.anIntArray390[local688], this.faceColor[arg0]);
			} else if (local619 == 3) {
				local673 = this.faceInfo[arg0] >> 2;
				local678 = this.texturedVertexA[local673];
				local683 = this.texturedVertexB[local673];
				local688 = this.texturedVertexC[local673];
				Static6.fillTexturedTriangle(local93, local588, local592, local71, local75, local80, this.faceColorA[arg0], this.faceColorA[arg0], this.faceColorA[arg0], Static71.vertexViewSpaceX[local678], Static71.vertexViewSpaceX[local683], Static71.vertexViewSpaceX[local688], Static71.anIntArray397[local678], Static71.anIntArray397[local683], Static71.anIntArray397[local688], Static71.anIntArray390[local678], Static71.anIntArray390[local683], Static71.anIntArray390[local688], this.faceColor[arg0]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local71 < 0 || local75 < 0 || local80 < 0 || local71 > Static6.anInt222 || local75 > Static6.anInt222 || local80 > Static6.anInt222 || Static71.anIntArray393[3] < 0 || Static71.anIntArray393[3] > Static6.anInt222) {
			Static6.clipX = true;
		}
		if (this.faceInfo == null) {
			local619 = 0;
		} else {
			local619 = this.faceInfo[arg0] & 0x3;
		}
		if (local619 == 0) {
			Static6.fillGouraudTriangle(local93, local588, local592, local71, local75, local80, Static71.anIntArray404[0], Static71.anIntArray404[1], Static71.anIntArray404[2]);
			Static6.fillGouraudTriangle(local93, local592, Static71.anIntArray400[3], local71, local80, Static71.anIntArray393[3], Static71.anIntArray404[0], Static71.anIntArray404[2], Static71.anIntArray404[3]);
			return;
		}
		if (local619 == 1) {
			local673 = Static71.anIntArray392[this.faceColorA[arg0]];
			Static6.fillTriangle(local93, local588, local592, local71, local75, local80, local673);
			Static6.fillTriangle(local93, local592, Static71.anIntArray400[3], local71, local80, Static71.anIntArray393[3], local673);
			return;
		}
		if (local619 == 2) {
			local673 = this.faceInfo[arg0] >> 2;
			local678 = this.texturedVertexA[local673];
			local683 = this.texturedVertexB[local673];
			local688 = this.texturedVertexC[local673];
			Static6.fillTexturedTriangle(local93, local588, local592, local71, local75, local80, Static71.anIntArray404[0], Static71.anIntArray404[1], Static71.anIntArray404[2], Static71.vertexViewSpaceX[local678], Static71.vertexViewSpaceX[local683], Static71.vertexViewSpaceX[local688], Static71.anIntArray397[local678], Static71.anIntArray397[local683], Static71.anIntArray397[local688], Static71.anIntArray390[local678], Static71.anIntArray390[local683], Static71.anIntArray390[local688], this.faceColor[arg0]);
			Static6.fillTexturedTriangle(local93, local592, Static71.anIntArray400[3], local71, local80, Static71.anIntArray393[3], Static71.anIntArray404[0], Static71.anIntArray404[2], Static71.anIntArray404[3], Static71.vertexViewSpaceX[local678], Static71.vertexViewSpaceX[local683], Static71.vertexViewSpaceX[local688], Static71.anIntArray397[local678], Static71.anIntArray397[local683], Static71.anIntArray397[local688], Static71.anIntArray390[local678], Static71.anIntArray390[local683], Static71.anIntArray390[local688], this.faceColor[arg0]);
			return;
		}
		if (local619 != 3) {
			return;
		}
		local673 = this.faceInfo[arg0] >> 2;
		local678 = this.texturedVertexA[local673];
		local683 = this.texturedVertexB[local673];
		local688 = this.texturedVertexC[local673];
		Static6.fillTexturedTriangle(local93, local588, local592, local71, local75, local80, this.faceColorA[arg0], this.faceColorA[arg0], this.faceColorA[arg0], Static71.vertexViewSpaceX[local678], Static71.vertexViewSpaceX[local683], Static71.vertexViewSpaceX[local688], Static71.anIntArray397[local678], Static71.anIntArray397[local683], Static71.anIntArray397[local688], Static71.anIntArray390[local678], Static71.anIntArray390[local683], Static71.anIntArray390[local688], this.faceColor[arg0]);
		Static6.fillTexturedTriangle(local93, local592, Static71.anIntArray400[3], local71, local80, Static71.anIntArray393[3], this.faceColorA[arg0], this.faceColorA[arg0], this.faceColorA[arg0], Static71.vertexViewSpaceX[local678], Static71.vertexViewSpaceX[local683], Static71.vertexViewSpaceX[local688], Static71.anIntArray397[local678], Static71.anIntArray397[local683], Static71.anIntArray397[local688], Static71.anIntArray390[local678], Static71.anIntArray390[local683], Static71.anIntArray390[local688], this.faceColor[arg0]);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!sb;I)V")
	public void method1134(@OriginalArg(0) Class2_Sub2_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (this.labelVerticies == null || arg1 == -1) {
			return;
		}
		this.vertexNormal = null;
		this.anInt1740 = 0;
		@Pc(18) Class28 local18 = arg0.aClass28Array1[arg1];
		@Pc(21) Class2_Sub5 local21 = local18.aClass2_Sub5_1;
		Static71.baseX = 0;
		Static71.baseY = 0;
		Static71.baseZ = 0;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt1098; local29++) {
			@Pc(35) int local35 = local18.anIntArray226[local29];
			this.applyTransform(local21.anIntArray142[local35], local21.anIntArrayArray10[local35], local18.anIntArray231[local29], local18.anIntArray230[local29], local18.anIntArray229[local29]);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public void method1135() {
		if (this.anInt1740 == 1) {
			return;
		}
		this.anInt1740 = 1;
		super.maxY = 0;
		this.minY = 0;
		this.minX = 0;
		for (@Pc(18) int local18 = 0; local18 < this.vertexCount; local18++) {
			@Pc(24) int local24 = this.vertexX[local18];
			@Pc(29) int local29 = this.vertexY[local18];
			@Pc(34) int local34 = this.vertexZ[local18];
			if (-local29 > super.maxY) {
				super.maxY = -local29;
			}
			if (local29 > this.minY) {
				this.minY = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.minX) {
				this.minX = local58;
			}
		}
		this.minX = (int) (Math.sqrt((double) this.minX) + 0.99D);
		this.maxZ = (int) (Math.sqrt((double) (this.minX * this.minX + super.maxY * super.maxY)) + 0.99D);
		this.maxX = this.maxZ + (int) (Math.sqrt((double) (this.minX * this.minX + this.minY * this.minY)) + 0.99D);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
	public void method1136() {
		this.vertexNormal = null;
		this.anInt1740 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.vertexCount; local7++) {
			this.vertexZ[local7] = -this.vertexZ[local7];
		}
		for (@Pc(24) int local24 = 0; local24 < this.faceCount; local24++) {
			@Pc(30) int local30 = this.faceVertexA[local24];
			this.faceVertexA[local24] = this.faceVertexC[local24];
			this.faceVertexC[local24] = local30;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public void method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1740 = 0;
		for (@Pc(4) int local4 = 0; local4 < this.vertexCount; local4++) {
			this.vertexX[local4] += arg0;
			this.vertexY[local4] += arg1;
			this.vertexZ[local4] += arg2;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZI)V")
	private void method1138(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.maxX >= 1500) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.maxX; local6++) {
			Static71.anIntArray391[local6] = 0;
		}
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(86) int local86;
		@Pc(90) int local90;
		@Pc(98) int local98;
		for (@Pc(18) int local18 = 0; local18 < this.faceCount; local18++) {
			if (this.faceInfo == null || this.faceInfo[local18] != -1) {
				local33 = this.faceVertexA[local18];
				local38 = this.faceVertexB[local18];
				local43 = this.faceVertexC[local18];
				local47 = Static71.vertexScreenY[local33];
				local51 = Static71.vertexScreenY[local38];
				local55 = Static71.vertexScreenY[local43];
				if (arg0 && (local47 == -5000 || local51 == -5000 || local55 == -5000)) {
					local70 = Static71.vertexViewSpaceX[local33];
					local74 = Static71.vertexViewSpaceX[local38];
					@Pc(78) int local78 = Static71.vertexViewSpaceX[local43];
					@Pc(82) int local82 = Static71.anIntArray397[local33];
					local86 = Static71.anIntArray397[local38];
					local90 = Static71.anIntArray397[local43];
					@Pc(94) int local94 = Static71.anIntArray390[local33];
					local98 = Static71.anIntArray390[local38];
					@Pc(102) int local102 = Static71.anIntArray390[local43];
					local70 -= local74;
					@Pc(110) int local110 = local78 - local74;
					@Pc(114) int local114 = local82 - local86;
					@Pc(118) int local118 = local90 - local86;
					@Pc(122) int local122 = local94 - local98;
					@Pc(126) int local126 = local102 - local98;
					@Pc(134) int local134 = local114 * local126 - local122 * local118;
					@Pc(142) int local142 = local122 * local110 - local70 * local126;
					@Pc(150) int local150 = local70 * local118 - local114 * local110;
					if (local74 * local134 + local86 * local142 + local98 * local150 > 0) {
						Static71.faceNearClipped[local18] = true;
						@Pc(183) int local183 = (Static71.anIntArray401[local33] + Static71.anIntArray401[local38] + Static71.anIntArray401[local43]) / 3 + this.maxZ;
						Static71.anIntArrayArray19[local183][Static71.anIntArray391[local183]++] = local18;
					}
				} else {
					if (arg1 && this.method1157(Static71.anInt1750, Static71.anInt1748, Static71.vertexScreenX[local33], Static71.vertexScreenX[local38], Static71.vertexScreenX[local43], local47, local51, local55)) {
						Static71.anIntArray387[Static71.anInt1747++] = arg2;
						arg1 = false;
					}
					if ((local47 - local51) * (Static71.vertexScreenX[local43] - Static71.vertexScreenX[local38]) - (Static71.vertexScreenX[local33] - Static71.vertexScreenX[local38]) * (local55 - local51) > 0) {
						Static71.faceNearClipped[local18] = false;
						if (local47 >= 0 && local51 >= 0 && local55 >= 0 && local47 <= Static6.anInt222 && local51 <= Static6.anInt222 && local55 <= Static6.anInt222) {
							Static71.faceClippedX[local18] = false;
						} else {
							Static71.faceClippedX[local18] = true;
						}
						local70 = (Static71.anIntArray401[local33] + Static71.anIntArray401[local38] + Static71.anIntArray401[local43]) / 3 + this.maxZ;
						Static71.anIntArrayArray19[local70][Static71.anIntArray391[local70]++] = local18;
					}
				}
			}
		}
		if (this.anIntArray377 == null) {
			for (local33 = this.maxX - 1; local33 >= 0; local33--) {
				local38 = Static71.anIntArray391[local33];
				if (local38 > 0) {
					@Pc(332) int[] local332 = Static71.anIntArrayArray19[local33];
					for (local47 = 0; local47 < local38; local47++) {
						this.drawFace(local332[local47]);
					}
				}
			}
			return;
		}
		for (local33 = 0; local33 < 12; local33++) {
			Static71.anIntArray385[local33] = 0;
			Static71.anIntArray398[local33] = 0;
		}
		for (local38 = this.maxX - 1; local38 >= 0; local38--) {
			local43 = Static71.anIntArray391[local38];
			if (local43 > 0) {
				@Pc(379) int[] local379 = Static71.anIntArrayArray19[local38];
				for (local51 = 0; local51 < local43; local51++) {
					local55 = local379[local51];
					local70 = this.anIntArray377[local55];
					local74 = Static71.anIntArray385[local70]++;
					Static71.anIntArrayArray18[local70][local74] = local55;
					if (local70 < 10) {
						Static71.anIntArray398[local70] += local38;
					} else if (local70 == 10) {
						Static71.anIntArray394[local74] = local38;
					} else {
						Static71.anIntArray403[local74] = local38;
					}
				}
			}
		}
		local43 = 0;
		if (Static71.anIntArray385[1] > 0 || Static71.anIntArray385[2] > 0) {
			local43 = (Static71.anIntArray398[1] + Static71.anIntArray398[2]) / (Static71.anIntArray385[1] + Static71.anIntArray385[2]);
		}
		local47 = 0;
		if (Static71.anIntArray385[3] > 0 || Static71.anIntArray385[4] > 0) {
			local47 = (Static71.anIntArray398[3] + Static71.anIntArray398[4]) / (Static71.anIntArray385[3] + Static71.anIntArray385[4]);
		}
		local51 = 0;
		if (Static71.anIntArray385[6] > 0 || Static71.anIntArray385[8] > 0) {
			local51 = (Static71.anIntArray398[6] + Static71.anIntArray398[8]) / (Static71.anIntArray385[6] + Static71.anIntArray385[8]);
		}
		local70 = 0;
		local74 = Static71.anIntArray385[10];
		@Pc(524) int[] local524 = Static71.anIntArrayArray18[10];
		@Pc(526) int[] local526 = Static71.anIntArray394;
		if (local74 == 0) {
			local70 = 0;
			local74 = Static71.anIntArray385[11];
			local524 = Static71.anIntArrayArray18[11];
			local526 = Static71.anIntArray403;
		}
		if (local74 > 0) {
			local55 = local526[0];
		} else {
			local55 = -1000;
		}
		for (local86 = 0; local86 < 10; local86++) {
			while (local86 == 0 && local55 > local43) {
				this.drawFace(local524[local70++]);
				if (local70 == local74 && local524 != Static71.anIntArrayArray18[11]) {
					local70 = 0;
					local74 = Static71.anIntArray385[11];
					local524 = Static71.anIntArrayArray18[11];
					local526 = Static71.anIntArray403;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 3 && local55 > local47) {
				this.drawFace(local524[local70++]);
				if (local70 == local74 && local524 != Static71.anIntArrayArray18[11]) {
					local70 = 0;
					local74 = Static71.anIntArray385[11];
					local524 = Static71.anIntArrayArray18[11];
					local526 = Static71.anIntArray403;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			while (local86 == 5 && local55 > local51) {
				this.drawFace(local524[local70++]);
				if (local70 == local74 && local524 != Static71.anIntArrayArray18[11]) {
					local70 = 0;
					local74 = Static71.anIntArray385[11];
					local524 = Static71.anIntArrayArray18[11];
					local526 = Static71.anIntArray403;
				}
				if (local70 < local74) {
					local55 = local526[local70];
				} else {
					local55 = -1000;
				}
			}
			local90 = Static71.anIntArray385[local86];
			@Pc(689) int[] local689 = Static71.anIntArrayArray18[local86];
			for (local98 = 0; local98 < local90; local98++) {
				this.drawFace(local689[local98]);
			}
		}
		while (local55 != -1000) {
			this.drawFace(local524[local70++]);
			if (local70 == local74 && local524 != Static71.anIntArrayArray18[11]) {
				local70 = 0;
				local524 = Static71.anIntArrayArray18[11];
				local74 = Static71.anIntArray385[11];
				local526 = Static71.anIntArray403;
			}
			if (local70 < local74) {
				local55 = local526[local70];
			} else {
				local55 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.faceCount; local1++) {
			if (this.faceColor[local1] == arg0) {
				this.faceColor[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()I")
	public int method1141() {
		this.method1135();
		return this.minX;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)Lclient!ne;")
	public Model method1142(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static71.anIntArray384.length < this.faceCount) {
			Static71.anIntArray384 = new int[this.faceCount + 100];
		}
		return this.method1162(arg0, Static71.aClass2_Sub2_Sub12_Sub4_2, Static71.anIntArray384);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()V")
	private void method1143() {
		if (this.anInt1740 == 2) {
			return;
		}
		this.anInt1740 = 2;
		this.minX = 0;
		for (@Pc(12) int local12 = 0; local12 < this.vertexCount; local12++) {
			@Pc(18) int local18 = this.vertexX[local12];
			@Pc(23) int local23 = this.vertexY[local12];
			@Pc(28) int local28 = this.vertexZ[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.minX) {
				this.minX = local40;
			}
		}
		this.minX = (int) (Math.sqrt((double) this.minX) + 0.99D);
		this.maxZ = this.minX;
		this.maxX = this.minX + this.minX;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt1740 != 1) {
			this.method1135();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.minX * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.minX << 9;
		if (local60 / local36 >= Static6.anInt223) {
			return;
		}
		@Pc(73) int local73 = local53 + this.minX << 9;
		if (local73 / local36 <= Static6.anInt221) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.minX * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static6.anInt227) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.maxY * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static6.anInt226) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.maxY * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt1741 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static71.aBoolean140) {
			local168 = local25 - local32;
			if (local168 <= 50) {
				local168 = 50;
			}
			if (local53 > 0) {
				local60 /= local36;
				local73 /= local168;
			} else {
				local73 /= local36;
				local60 /= local168;
			}
			if (local89 > 0) {
				local123 /= local36;
				local102 /= local168;
			} else {
				local102 /= local36;
				local123 /= local168;
			}
			local215 = Static71.anInt1750 - Static6.anInt225;
			local219 = Static71.anInt1748 - Static6.anInt224;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean139) {
					Static71.anIntArray387[Static71.anInt1747++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static6.anInt225;
		local215 = Static6.anInt224;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static71.sin[arg0];
			local253 = Static71.cos[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.vertexCount; local265++) {
			@Pc(271) int local271 = this.vertexX[local265];
			@Pc(276) int local276 = this.vertexY[local265];
			@Pc(281) int local281 = this.vertexZ[local265];
			@Pc(293) int local293;
			if (arg0 != 0) {
				local293 = local281 * local219 + local271 * local253 >> 16;
				local281 = local281 * local253 - local271 * local219 >> 16;
				local271 = local293;
			}
			local271 += arg5;
			local276 += arg6;
			local281 += arg7;
			local293 = local281 * arg3 + local271 * arg4 >> 16;
			local281 = local281 * arg4 - local271 * arg3 >> 16;
			local271 = local293;
			local293 = local276 * arg2 - local281 * arg1 >> 16;
			local281 = local276 * arg1 + local281 * arg2 >> 16;
			Static71.anIntArray401[local265] = local281 - local25;
			if (local281 >= 50) {
				Static71.vertexScreenY[local265] = local168 + (local271 << 9) / local281;
				Static71.vertexScreenX[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static71.vertexScreenY[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static71.vertexViewSpaceX[local265] = local271;
				Static71.anIntArray397[local265] = local293;
				Static71.anIntArray390[local265] = local281;
			}
		}
		try {
			this.method1138(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)V")
	public void method1144(@OriginalArg(0) int arg0) {
		this.vertexNormal = null;
		this.anInt1740 = 0;
		@Pc(9) int local9 = Static71.sin[arg0];
		@Pc(13) int local13 = Static71.cos[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.vertexCount; local15++) {
			@Pc(32) int local32 = this.vertexY[local15] * local13 - this.vertexZ[local15] * local9 >> 16;
			this.vertexZ[local15] = this.vertexY[local15] * local9 + this.vertexZ[local15] * local13 >> 16;
			this.vertexY[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ne;I)I")
	private int method1145(@OriginalArg(0) Model arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.vertexX[arg1];
		@Pc(11) int local11 = arg0.vertexY[arg1];
		@Pc(16) int local16 = arg0.vertexZ[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.vertexCount; local18++) {
			if (local6 == this.vertexX[local18] && local11 == this.vertexY[local18] && local16 == this.vertexZ[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.vertexX[this.vertexCount] = local6;
			this.vertexY[this.vertexCount] = local11;
			this.vertexZ[this.vertexCount] = local16;
			if (arg0.anIntArray372 != null) {
				this.anIntArray372[this.vertexCount] = arg0.anIntArray372[arg1];
			}
			local1 = this.vertexCount++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "()V")
	public void method1146() {
		this.vertexNormal = null;
		this.anInt1740 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.vertexCount; local7++) {
			@Pc(13) int local13 = this.vertexZ[local7];
			this.vertexZ[local7] = this.vertexX[local7];
			this.vertexX[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)Lclient!ne;")
	public Model method1147(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static71.anIntArray399.length < this.faceCount) {
			Static71.anIntArray399 = new int[this.faceCount + 100];
		}
		return this.method1162(arg0, Static71.aModel_3, Static71.anIntArray399);
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "()V")
	public void method1148() {
		this.vertexNormal = null;
		this.anInt1740 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.vertexCount; local7++) {
			@Pc(13) int local13 = this.vertexX[local7];
			this.vertexX[local7] = this.vertexZ[local7];
			this.vertexZ[local7] = -local13;
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()V")
	public void method1149() {
		this.vertexNormal = null;
		this.anInt1740 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.vertexCount; local7++) {
			this.vertexX[local7] = -this.vertexX[local7];
			this.vertexZ[local7] = -this.vertexZ[local7];
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)V")
	public void method1151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt1740 != 2 && this.anInt1740 != 1) {
			this.method1143();
		}
		@Pc(11) int local11 = Static6.anInt225;
		@Pc(13) int local13 = Static6.anInt224;
		@Pc(17) int local17 = Static71.sin[0];
		@Pc(21) int local21 = Static71.cos[0];
		@Pc(25) int local25 = Static71.sin[arg0];
		@Pc(29) int local29 = Static71.cos[arg0];
		@Pc(33) int local33 = Static71.sin[arg1];
		@Pc(37) int local37 = Static71.cos[arg1];
		@Pc(41) int local41 = Static71.sin[arg2];
		@Pc(45) int local45 = Static71.cos[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.vertexCount; local57++) {
			@Pc(63) int local63 = this.vertexX[local57];
			@Pc(68) int local68 = this.vertexY[local57];
			@Pc(73) int local73 = this.vertexZ[local57];
			@Pc(85) int local85;
			if (arg1 != 0) {
				local85 = local68 * local33 + local63 * local37 >> 16;
				local68 = local68 * local37 - local63 * local33 >> 16;
				local63 = local85;
			}
			if (arg0 != 0) {
				local85 = local73 * local25 + local63 * local29 >> 16;
				local73 = local73 * local29 - local63 * local25 >> 16;
				local63 = local85;
			}
			local63 += arg3;
			local68 += arg4;
			local73 += arg5;
			local85 = local68 * local45 - local73 * local41 >> 16;
			local73 = local68 * local41 + local73 * local45 >> 16;
			Static71.anIntArray401[local57] = local73 - local55;
			Static71.vertexScreenY[local57] = local11 + (local63 << 9) / local73;
			Static71.vertexScreenX[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt1741 > 0) {
				Static71.vertexViewSpaceX[local57] = local63;
				Static71.anIntArray397[local57] = local85;
				Static71.anIntArray390[local57] = local73;
			}
		}
		try {
			this.method1138(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[IIII)V")
	private void applyTransform(@OriginalArg(0) int type, @OriginalArg(1) int[] labels, @OriginalArg(2) int x, @OriginalArg(3) int y, @OriginalArg(4) int z) {
		@Pc(2) int labelCount = labels.length;

		if (type == 0) {
			int count = 0;
			Static71.baseX = 0;
			Static71.baseY = 0;
			Static71.baseZ = 0;
			for (int g = 0; g < labelCount; g++) {
				@Pc(19) int label = labels[g];
				if (label < this.labelVerticies.length) {
					@Pc(29) int[] verticies = this.labelVerticies[label];
					for (int i = 0; i < verticies.length; i++) {
						int v = verticies[i];
						Static71.baseX += this.vertexX[v];
						Static71.baseY += this.vertexY[v];
						Static71.baseZ += this.vertexZ[v];
						count++;
					}
				}
			}
			if (count > 0) {
				Static71.baseX = Static71.baseX / count + x;
				Static71.baseY = Static71.baseY / count + y;
				Static71.baseZ = Static71.baseZ / count + z;
			} else {
				Static71.baseX = x;
				Static71.baseY = y;
				Static71.baseZ = z;
			}
			return;
		}
		@Pc(115) int[] verticies;
		if (type == 1) {
			for (int count = 0; count < labelCount; count++) {
				int group = labels[count];
				if (group < this.labelVerticies.length) {
					verticies = this.labelVerticies[group];
					for (int i = 0; i < verticies.length; i++) {
						i = verticies[i];
						this.vertexX[i] += x;
						this.vertexY[i] += y;
						this.vertexZ[i] += z;
					}
				}
			}
		} else if (type == 2) {
			for (int group = 0; group < labelCount; group++) {
				int label = labels[group];
				if (label < this.labelVerticies.length) {
					verticies = this.labelVerticies[label];
					for (int i = 0; i < verticies.length; i++) {
						int v = verticies[i];
						this.vertexX[v] -= Static71.baseX;
						this.vertexY[v] -= Static71.baseY;
						this.vertexZ[v] -= Static71.baseZ;

						int pitch = (x & 0xFF) * 8;
						@Pc(219) int yaw = (y & 0xFF) * 8;
						@Pc(225) int roll = (z & 0xFF) * 8;

						@Pc(231) int sin;
						@Pc(235) int cos;
						if (roll != 0) {
							sin = Static71.sin[roll];
							cos = Static71.cos[roll];
							int x_ = this.vertexY[v] * sin + this.vertexX[v] * cos >> 16;
							this.vertexY[v] = this.vertexY[v] * cos - this.vertexX[v] * sin >> 16;
							this.vertexX[v] = x_;
						}
						if (pitch != 0) {
							sin = Static71.sin[pitch];
							cos = Static71.cos[pitch];
							int y_ = this.vertexY[v] * cos - this.vertexZ[v] * sin >> 16;
							this.vertexZ[v] = this.vertexY[v] * sin + this.vertexZ[v] * cos >> 16;
							this.vertexY[v] = y_;
						}
						if (yaw != 0) {
							sin = Static71.sin[yaw];
							cos = Static71.cos[yaw];
							int x_ = this.vertexZ[v] * sin + this.vertexX[v] * cos >> 16;
							this.vertexZ[v] = this.vertexZ[v] * cos - this.vertexX[v] * sin >> 16;
							this.vertexX[v] = x_;
						}
						this.vertexX[v] += Static71.baseX;
						this.vertexY[v] += Static71.baseY;
						this.vertexZ[v] += Static71.baseZ;
					}
				}
			}
		} else if (type == 3) {
			for (int g = 0; g < labelCount; g++) {
				int label = labels[g];
				if (label < this.labelVerticies.length) {
					verticies = this.labelVerticies[label];
					for (int i = 0; i < verticies.length; i++) {
						int v = verticies[i];
						this.vertexX[v] -= Static71.baseX;
						this.vertexY[v] -= Static71.baseY;
						this.vertexZ[v] -= Static71.baseZ;
						this.vertexX[v] = this.vertexX[v] * x / 128;
						this.vertexY[v] = this.vertexY[v] * y / 128;
						this.vertexZ[v] = this.vertexZ[v] * z / 128;
						this.vertexX[v] += Static71.baseX;
						this.vertexY[v] += Static71.baseY;
						this.vertexZ[v] += Static71.baseZ;
					}
				}
			}
		} else if (type == 5 && (this.labelFaces != null && this.faceAlpha != null)) {
			for (int g = 0; g < labelCount; g++) {
				int label = labels[g];
				if (label < this.labelFaces.length) {
					verticies = this.labelFaces[label];
					for (int i = 0; i < verticies.length; i++) {
						int v = verticies[i];
						this.faceAlpha[v] += x * 8;
						if (this.faceAlpha[v] < 0) {
							this.faceAlpha[v] = 0;
						}
						if (this.faceAlpha[v] > 255) {
							this.faceAlpha[v] = 255;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIZ)V")
	public void calculateNormals(@OriginalArg(0) int lightAmbient, @OriginalArg(1) int lightAttenuation, @OriginalArg(2) int lightSrcX, @OriginalArg(3) int lightSrcY, @OriginalArg(4) int lightSrcZ, @OriginalArg(5) boolean applyLighting) {
		@Pc(14) int lightMagnitude = (int) Math.sqrt((double) (lightSrcX * lightSrcX + lightSrcY * lightSrcY + lightSrcZ * lightSrcZ));
		@Pc(20) int attenuation = lightAttenuation * lightMagnitude >> 8;
		if (this.faceColorA == null) {
			this.faceColorA = new int[this.faceCount];
			this.faceColorB = new int[this.faceCount];
			this.faceColorC = new int[this.faceCount];
		}
		if (this.vertexNormal == null) {
			this.vertexNormal = new VertexNormal[this.vertexCount];
			for (int v = 0; v < this.vertexCount; v++) {
				this.vertexNormal[v] = new VertexNormal();
			}
		}
		for (int f = 0; f < this.faceCount; f++) {
			int a = this.faceVertexA[f];
			@Pc(74) int b = this.faceVertexB[f];
			@Pc(79) int c = this.faceVertexC[f];

			@Pc(89) int dxAB = this.vertexX[b] - this.vertexX[a];
			@Pc(99) int dyAB = this.vertexY[b] - this.vertexY[a];
			@Pc(109) int dzAB = this.vertexZ[b] - this.vertexZ[a];

			@Pc(119) int dxAC = this.vertexX[c] - this.vertexX[a];
			@Pc(129) int dyAC = this.vertexY[c] - this.vertexY[a];
			@Pc(139) int dzAC = this.vertexZ[c] - this.vertexZ[a];

			@Pc(147) int nx = dyAB * dzAC - dyAC * dzAB;
			@Pc(155) int ny = dzAB * dxAC - dzAC * dxAB;
			@Pc(163) int nz;
			for (nz = dxAB * dyAC - dxAC * dyAB; nx > 8192 || ny > 8192 || nz > 8192 || nx < -8192 || ny < -8192 || nz < -8192; nz >>= 0x1) {
				nx >>= 0x1;
				ny >>= 0x1;
			}
			@Pc(209) int length = (int) Math.sqrt((double) (nx * nx + ny * ny + nz * nz));
			if (length <= 0) {
				length = 1;
			}
			nx = nx * 256 / length;
			ny = ny * 256 / length;
			nz = nz * 256 / length;
			if (this.faceInfo == null || (this.faceInfo[f] & 0x1) == 0) {
				@Pc(246) VertexNormal nA = this.vertexNormal[a];
				nA.x += nx;
				nA.y += ny;
				nA.z += nz;
				nA.w++;
				@Pc(275) VertexNormal nB = this.vertexNormal[b];
				nB.x += nx;
				nB.y += ny;
				nB.z += nz;
				nB.w++;
				@Pc(304) VertexNormal nC = this.vertexNormal[c];
				nC.x += nx;
				nC.y += ny;
				nC.z += nz;
				nC.w++;
			} else {
				@Pc(349) int lightness = lightAmbient + (lightSrcX * nx + lightSrcY * ny + lightSrcZ * nz) / (attenuation + attenuation / 2);
				this.faceColorA[f] = Static71.method1139(this.faceColor[f], lightness, this.faceInfo[f]);
			}
		}
		if (applyLighting) {
			this.applyLighting(lightAmbient, attenuation, lightSrcX, lightSrcY, lightSrcZ);
			return;
		}
		this.vertexNormalOriginal = new VertexNormal[this.vertexCount];
		for (int v = 0; v < this.vertexCount; v++) {
			@Pc(391) VertexNormal normal = this.vertexNormal[v];
			@Pc(400) VertexNormal copy = this.vertexNormalOriginal[v] = new VertexNormal();
			copy.x = normal.x;
			copy.y = normal.y;
			copy.z = normal.z;
			copy.w = normal.w;
		}
		this.anInt1739 = (lightAmbient << 16) + (attenuation & 0xFFFF);
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "()V")
	public void method1154() {
		if (this.anInt1740 == 3) {
			return;
		}
		this.anInt1740 = 3;
		super.maxY = 0;
		this.minY = 0;
		this.minX = 999999;
		this.maxX = -999999;
		this.maxZ = -99999;
		this.minZ = 99999;
		for (@Pc(27) int v = 0; v < this.vertexCount; v++) {
			@Pc(33) int x = this.vertexX[v];
			@Pc(38) int y = this.vertexY[v];
			@Pc(43) int z = this.vertexZ[v];
			if (x < this.minX) {
				this.minX = x;
			}
			if (x > this.maxX) {
				this.maxX = x;
			}
			if (z < this.minZ) {
				this.minZ = z;
			}
			if (z > this.maxZ) {
				this.maxZ = z;
			}
			if (-y > super.maxY) {
				super.maxY = -y;
			}
			if (y > this.minY) {
				this.minY = y;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V")
	private void drawFace(@OriginalArg(0) int face) {
		if (Static71.faceNearClipped[face]) {
			this.method1133(face);
			return;
		}
		@Pc(12) int a = this.faceVertexA[face];
		@Pc(17) int b = this.faceVertexB[face];
		@Pc(22) int c = this.faceVertexC[face];

		Static6.clipX = Static71.faceClippedX[face];

		if (this.faceAlpha == null) {
			Static6.alpha = 0;
		} else {
			Static6.alpha = this.faceAlpha[face];
		}

		@Pc(42) int type;
		if (this.faceInfo == null) {
			type = 0;
		} else {
			type = this.faceInfo[face] & 0x3;
		}

		if (type == 0) {
			Static6.fillGouraudTriangle(Static71.vertexScreenX[a], Static71.vertexScreenX[b], Static71.vertexScreenX[c], Static71.vertexScreenY[a], Static71.vertexScreenY[b], Static71.vertexScreenY[c], this.faceColorA[face], this.faceColorB[face], this.faceColorC[face]);
		} else if (type == 1) {
			Static6.fillTriangle(Static71.vertexScreenX[a], Static71.vertexScreenX[b], Static71.vertexScreenX[c], Static71.vertexScreenY[a], Static71.vertexScreenY[b], Static71.vertexScreenY[c], Static71.anIntArray392[this.faceColorA[face]]);
		} else {
			@Pc(123) int texturedFace;
			@Pc(128) int tA;
			@Pc(133) int tB;
			@Pc(138) int tC;
			if (type == 2) {
				texturedFace = this.faceInfo[face] >> 2;
				tA = this.texturedVertexA[texturedFace];
				tB = this.texturedVertexB[texturedFace];
				tC = this.texturedVertexC[texturedFace];
				Static6.fillTexturedTriangle(Static71.vertexScreenX[a], Static71.vertexScreenX[b], Static71.vertexScreenX[c], Static71.vertexScreenY[a], Static71.vertexScreenY[b], Static71.vertexScreenY[c], this.faceColorA[face], this.faceColorB[face], this.faceColorC[face], Static71.vertexViewSpaceX[tA], Static71.vertexViewSpaceX[tB], Static71.vertexViewSpaceX[tC], Static71.anIntArray397[tA], Static71.anIntArray397[tB], Static71.anIntArray397[tC], Static71.anIntArray390[tA], Static71.anIntArray390[tB], Static71.anIntArray390[tC], this.faceColor[face]);
			} else if (type == 3) {
				texturedFace = this.faceInfo[face] >> 2;
				tA = this.texturedVertexA[texturedFace];
				tB = this.texturedVertexB[texturedFace];
				tC = this.texturedVertexC[texturedFace];
				Static6.fillTexturedTriangle(Static71.vertexScreenX[a], Static71.vertexScreenX[b], Static71.vertexScreenX[c], Static71.vertexScreenY[a], Static71.vertexScreenY[b], Static71.vertexScreenY[c], this.faceColorA[face], this.faceColorA[face], this.faceColorA[face], Static71.vertexViewSpaceX[tA], Static71.vertexViewSpaceX[tB], Static71.vertexViewSpaceX[tC], Static71.anIntArray397[tA], Static71.anIntArray397[tB], Static71.anIntArray397[tC], Static71.anIntArray390[tA], Static71.anIntArray390[tB], Static71.anIntArray390[tC], this.faceColor[face]);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)V")
	public void method1156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.vertexNormal = null;
		this.anInt1740 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.vertexCount; local7++) {
			this.vertexX[local7] = this.vertexX[local7] * arg0 / 128;
			this.vertexY[local7] = this.vertexY[local7] * arg1 / 128;
			this.vertexZ[local7] = this.vertexZ[local7] * arg2 / 128;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(III)V")
	public void method1158() {
		@Pc(4) int local4 = this.anInt1739 >> 16;
		@Pc(11) int local11 = this.anInt1739 << 16 >> 16;
		this.applyLighting(local4, local11, -50, -10, -50);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!sb;ILclient!sb;I[I)V")
	public void method1159(@OriginalArg(0) Class2_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1134(arg0, arg1);
			return;
		}
		this.vertexNormal = null;
		this.anInt1740 = 0;
		@Pc(24) Class28 local24 = arg0.aClass28Array1[arg1];
		@Pc(29) Class28 local29 = arg2.aClass28Array1[arg3];
		@Pc(32) Class2_Sub5 local32 = local24.aClass2_Sub5_1;
		Static71.baseX = 0;
		Static71.baseY = 0;
		Static71.baseZ = 0;
		@Pc(40) byte local40 = 0;
		@Pc(43) int local43 = local40 + 1;
		@Pc(45) int local45 = arg4[0];
		@Pc(53) int local53;
		for (@Pc(47) int local47 = 0; local47 < local24.anInt1098; local47++) {
			local53 = local24.anIntArray226[local47];
			while (local53 > local45) {
				local45 = arg4[local43++];
			}
			if (local53 != local45 || local32.anIntArray142[local53] == 0) {
				this.applyTransform(local32.anIntArray142[local53], local32.anIntArrayArray10[local53], local24.anIntArray231[local47], local24.anIntArray230[local47], local24.anIntArray229[local47]);
			}
		}
		Static71.baseX = 0;
		Static71.baseY = 0;
		Static71.baseZ = 0;
		local40 = 0;
		local43 = local40 + 1;
		local45 = arg4[0];
		for (local53 = 0; local53 < local29.anInt1098; local53++) {
			@Pc(118) int local118 = local29.anIntArray226[local53];
			while (local118 > local45) {
				local45 = arg4[local43++];
			}
			if (local118 == local45 || local32.anIntArray142[local118] == 0) {
				this.applyTransform(local32.anIntArray142[local118], local32.anIntArrayArray10[local118], local29.anIntArray231[local53], local29.anIntArray230[local53], local29.anIntArray229[local53]);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "()V")
	public void method1160() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray372 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.vertexCount; local9++) {
				local15 = this.anIntArray372[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.labelVerticies = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.labelVerticies[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.vertexCount) {
				local65 = this.anIntArray372[local59];
				this.labelVerticies[local65][local5[local65]++] = local59++;
			}
			this.anIntArray372 = null;
		}
		if (this.anIntArray382 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.faceCount; local9++) {
			local15 = this.anIntArray382[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.labelFaces = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.labelFaces[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.faceCount) {
			local65 = this.anIntArray382[local59];
			this.labelFaces[local65][local5[local65]++] = local59++;
		}
		this.anIntArray382 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	private void applyLighting(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.faceCount; local1++) {
			local7 = this.faceVertexA[local1];
			@Pc(12) int local12 = this.faceVertexB[local1];
			@Pc(17) int local17 = this.faceVertexC[local1];
			@Pc(30) VertexNormal local30;
			@Pc(52) int local52;
			@Pc(25) int local25;
			if (this.faceInfo == null) {
				local25 = this.faceColor[local1];
				local30 = this.vertexNormal[local7];
				local52 = arg0 + (arg2 * local30.x + arg3 * local30.y + arg4 * local30.z) / (arg1 * local30.w);
				this.faceColorA[local1] = Static71.method1139(local25, local52, 0);
				@Pc(65) VertexNormal local65 = this.vertexNormal[local12];
				@Pc(87) int local87 = arg0 + (arg2 * local65.x + arg3 * local65.y + arg4 * local65.z) / (arg1 * local65.w);
				this.faceColorB[local1] = Static71.method1139(local25, local87, 0);
				@Pc(100) VertexNormal local100 = this.vertexNormal[local17];
				@Pc(122) int local122 = arg0 + (arg2 * local100.x + arg3 * local100.y + arg4 * local100.z) / (arg1 * local100.w);
				this.faceColorC[local1] = Static71.method1139(local25, local122, 0);
			} else if ((this.faceInfo[local1] & 0x1) == 0) {
				local25 = this.faceColor[local1];
				@Pc(148) int local148 = this.faceInfo[local1];
				local30 = this.vertexNormal[local7];
				local52 = arg0 + (arg2 * local30.x + arg3 * local30.y + arg4 * local30.z) / (arg1 * local30.w);
				this.faceColorA[local1] = Static71.method1139(local25, local52, local148);
				local30 = this.vertexNormal[local12];
				local52 = arg0 + (arg2 * local30.x + arg3 * local30.y + arg4 * local30.z) / (arg1 * local30.w);
				this.faceColorB[local1] = Static71.method1139(local25, local52, local148);
				local30 = this.vertexNormal[local17];
				local52 = arg0 + (arg2 * local30.x + arg3 * local30.y + arg4 * local30.z) / (arg1 * local30.w);
				this.faceColorC[local1] = Static71.method1139(local25, local52, local148);
			}
		}
		this.vertexNormal = null;
		this.vertexNormalOriginal = null;
		this.anIntArray372 = null;
		this.anIntArray382 = null;
		if (this.faceInfo != null) {
			for (local7 = 0; local7 < this.faceCount; local7++) {
				if ((this.faceInfo[local7] & 0x2) == 2) {
					return;
				}
			}
		}
		this.faceColor = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLclient!ne;[I)Lclient!ne;")
	private Model method1162(@OriginalArg(0) boolean arg0, @OriginalArg(1) Model arg1, @OriginalArg(2) int[] arg2) {
		arg1.vertexCount = this.vertexCount;
		arg1.faceCount = this.faceCount;
		arg1.anInt1741 = this.anInt1741;
		if (arg1.vertexX == null || arg1.vertexX.length < this.vertexCount) {
			arg1.vertexX = new int[this.vertexCount + 100];
			arg1.vertexY = new int[this.vertexCount + 100];
			arg1.vertexZ = new int[this.vertexCount + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.vertexCount; local43++) {
			arg1.vertexX[local43] = this.vertexX[local43];
			arg1.vertexY[local43] = this.vertexY[local43];
			arg1.vertexZ[local43] = this.vertexZ[local43];
		}
		if (arg0) {
			arg1.faceAlpha = this.faceAlpha;
		} else {
			arg1.faceAlpha = arg2;
			@Pc(88) int local88;
			if (this.faceAlpha == null) {
				for (local88 = 0; local88 < this.faceCount; local88++) {
					arg1.faceAlpha[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.faceCount; local88++) {
					arg1.faceAlpha[local88] = this.faceAlpha[local88];
				}
			}
		}
		arg1.faceInfo = this.faceInfo;
		arg1.faceColor = this.faceColor;
		arg1.anIntArray377 = this.anIntArray377;
		arg1.anInt1737 = this.anInt1737;
		arg1.labelFaces = this.labelFaces;
		arg1.labelVerticies = this.labelVerticies;
		arg1.faceVertexA = this.faceVertexA;
		arg1.faceVertexB = this.faceVertexB;
		arg1.faceVertexC = this.faceVertexC;
		arg1.faceColorA = this.faceColorA;
		arg1.faceColorB = this.faceColorB;
		arg1.faceColorC = this.faceColorC;
		arg1.texturedVertexA = this.texturedVertexA;
		arg1.texturedVertexB = this.texturedVertexB;
		arg1.texturedVertexC = this.texturedVertexC;
		arg1.anInt1740 = 0;
		return arg1;
	}
}

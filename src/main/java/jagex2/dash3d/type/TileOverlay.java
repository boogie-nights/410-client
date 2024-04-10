package jagex2.dash3d.type;

import jagex2.Static69;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class TileOverlay {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public boolean flat = true;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public final int shape;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public final int anInt1678;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public final int anInt1679;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public final int anInt1677;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public final int[] vertexX;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "[I")
	public final int[] vertexY;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
	public final int[] vertexZ;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "[I")
	public final int[] triangleVertexA;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
	public final int[] triangleVertexB;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
	public final int[] triangleVertexC;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
	public final int[] triangleColorA;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "[I")
	public final int[] triangleColorB;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "[I")
	public final int[] triangleColorC;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
	public int[] triangleTextureIds;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(IIIIIIIIIIIIIIIIIII)V")
	public TileOverlay(@OriginalArg(0) int shape, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18) {
		if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
			this.flat = false;
		}
		this.shape = shape;
		this.anInt1678 = arg1;
		this.anInt1679 = arg17;
		this.anInt1677 = arg18;
		@Pc(30) short ONE = 128;
		@Pc(34) int HALF = ONE / 2;
		@Pc(38) int QUARTER = ONE / 4;
		@Pc(44) int THREE_QUARTER = ONE * 3 / 4;

		@Pc(48) int[] points = Static69.SHAPE_POINTS[shape];
		@Pc(51) int vertexCount = points.length;
		this.vertexX = new int[vertexCount];
		this.vertexY = new int[vertexCount];
		this.vertexZ = new int[vertexCount];
		@Pc(66) int[] local66 = new int[vertexCount];
		@Pc(69) int[] local69 = new int[vertexCount];

		@Pc(73) int local73 = arg3 * ONE;
		@Pc(77) int local77 = arg4 * ONE;

		@Pc(140) int local140;
		@Pc(142) int local142;
		@Pc(144) int t;
		@Pc(146) int local146;
		@Pc(148) int local148;
		for (@Pc(79) int v = 0; v < vertexCount; v++) {
			@Pc(84) int type = points[v];
			if ((type & 0x1) == 0 && type <= 8) {
				type = (type - arg1 - arg1 - 1 & 0x7) + 1;
			}
			if (type > 8 && type <= 12) {
				type = (type - arg1 - 9 & 0x3) + 9;
			}
			if (type > 12 && type <= 16) {
				type = (type - arg1 - 13 & 0x3) + 13;
			}
			if (type == 1) {
				local140 = local73;
				local142 = local77;
				t = arg5;
				local146 = arg9;
				local148 = arg13;
			} else if (type == 2) {
				local140 = local73 + HALF;
				local142 = local77;
				t = arg5 + arg6 >> 1;
				local146 = arg9 + arg10 >> 1;
				local148 = arg13 + arg14 >> 1;
			} else if (type == 3) {
				local140 = local73 + ONE;
				local142 = local77;
				t = arg6;
				local146 = arg10;
				local148 = arg14;
			} else if (type == 4) {
				local140 = local73 + ONE;
				local142 = local77 + HALF;
				t = arg6 + arg7 >> 1;
				local146 = arg10 + arg11 >> 1;
				local148 = arg14 + arg15 >> 1;
			} else if (type == 5) {
				local140 = local73 + ONE;
				local142 = local77 + ONE;
				t = arg7;
				local146 = arg11;
				local148 = arg15;
			} else if (type == 6) {
				local140 = local73 + HALF;
				local142 = local77 + ONE;
				t = arg7 + arg8 >> 1;
				local146 = arg11 + arg12 >> 1;
				local148 = arg15 + arg16 >> 1;
			} else if (type == 7) {
				local140 = local73;
				local142 = local77 + ONE;
				t = arg8;
				local146 = arg12;
				local148 = arg16;
			} else if (type == 8) {
				local140 = local73;
				local142 = local77 + HALF;
				t = arg8 + arg5 >> 1;
				local146 = arg12 + arg9 >> 1;
				local148 = arg16 + arg13 >> 1;
			} else if (type == 9) {
				local140 = local73 + HALF;
				local142 = local77 + QUARTER;
				t = arg5 + arg6 >> 1;
				local146 = arg9 + arg10 >> 1;
				local148 = arg13 + arg14 >> 1;
			} else if (type == 10) {
				local140 = local73 + THREE_QUARTER;
				local142 = local77 + HALF;
				t = arg6 + arg7 >> 1;
				local146 = arg10 + arg11 >> 1;
				local148 = arg14 + arg15 >> 1;
			} else if (type == 11) {
				local140 = local73 + HALF;
				local142 = local77 + THREE_QUARTER;
				t = arg7 + arg8 >> 1;
				local146 = arg11 + arg12 >> 1;
				local148 = arg15 + arg16 >> 1;
			} else if (type == 12) {
				local140 = local73 + QUARTER;
				local142 = local77 + HALF;
				t = arg8 + arg5 >> 1;
				local146 = arg12 + arg9 >> 1;
				local148 = arg16 + arg13 >> 1;
			} else if (type == 13) {
				local140 = local73 + QUARTER;
				local142 = local77 + QUARTER;
				t = arg5;
				local146 = arg9;
				local148 = arg13;
			} else if (type == 14) {
				local140 = local73 + THREE_QUARTER;
				local142 = local77 + QUARTER;
				t = arg6;
				local146 = arg10;
				local148 = arg14;
			} else if (type == 15) {
				local140 = local73 + THREE_QUARTER;
				local142 = local77 + THREE_QUARTER;
				t = arg7;
				local146 = arg11;
				local148 = arg15;
			} else {
				local140 = local73 + QUARTER;
				local142 = local77 + THREE_QUARTER;
				t = arg8;
				local146 = arg12;
				local148 = arg16;
			}
			this.vertexX[v] = local140;
			this.vertexY[v] = t;
			this.vertexZ[v] = local142;
			local66[v] = local146;
			local69[v] = local148;
		}

		@Pc(534) int[] paths = Static69.SHAPE_PATHS[shape];
		local140 = paths.length / 4;
		this.triangleVertexA = new int[local140];
		this.triangleVertexB = new int[local140];
		this.triangleVertexC = new int[local140];
		this.triangleColorA = new int[local140];
		this.triangleColorB = new int[local140];
		this.triangleColorC = new int[local140];
		if (arg2 != -1) {
			this.triangleTextureIds = new int[local140];
		}
		local142 = 0;
		for (t = 0; t < local140; t++) {
			local146 = paths[local142];
			local148 = paths[local142 + 1];
			@Pc(591) int local591 = paths[local142 + 2];
			@Pc(597) int local597 = paths[local142 + 3];
			local142 += 4;
			if (local148 < 4) {
				local148 = local148 - arg1 & 0x3;
			}
			if (local591 < 4) {
				local591 = local591 - arg1 & 0x3;
			}
			if (local597 < 4) {
				local597 = local597 - arg1 & 0x3;
			}
			this.triangleVertexA[t] = local148;
			this.triangleVertexB[t] = local591;
			this.triangleVertexC[t] = local597;
			if (local146 == 0) {
				this.triangleColorA[t] = local66[local148];
				this.triangleColorB[t] = local66[local591];
				this.triangleColorC[t] = local66[local597];
				if (this.triangleTextureIds != null) {
					this.triangleTextureIds[t] = -1;
				}
			} else {
				this.triangleColorA[t] = local69[local148];
				this.triangleColorB[t] = local69[local591];
				this.triangleColorC[t] = local69[local597];
				if (this.triangleTextureIds != null) {
					this.triangleTextureIds[t] = arg2;
				}
			}
		}
		local146 = arg5;
		local148 = arg6;
		if (arg6 < arg5) {
			local146 = arg6;
		}
		if (arg6 > arg6) {
			local148 = arg6;
		}
		if (arg7 < local146) {
			local146 = arg7;
		}
		if (arg7 > arg6) {
			local148 = arg7;
		}
		if (arg8 < local146) {
			;
		}
		if (arg8 > local148) {
			;
		}
	}
}

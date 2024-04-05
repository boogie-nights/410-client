package jagex2;

import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public abstract class Class5 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
	protected int[] anIntArray11;

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
	public int anInt95;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!ma;")
	private Class34 aClass34_2;

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[[B")
	protected byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	private int anInt97;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "[Lclient!ma;")
	private Class34[] aClass34Array2;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "[I")
	protected int[] anIntArray15;

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "[I")
	protected int[] anIntArray16;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "Z")
	private final boolean aBoolean6;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "Z")
	private final boolean aBoolean5;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ZZ)V")
	protected Class5(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean6 = arg0;
		this.aBoolean5 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	protected void method56(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public final void method57() {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray2.length; local7++) {
			if (this.aByteArrayArrayArray2[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.aByteArrayArrayArray2[local7].length; local16++) {
					this.aByteArrayArrayArray2[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Z")
	public final boolean method59(@OriginalArg(0) int arg0) {
		if (this.aByteArrayArray2[arg0] == null) {
			this.method62(arg0);
			return this.aByteArrayArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)[B")
	public final byte[] method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.aByteArrayArrayArray2.length <= arg0 || this.aByteArrayArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.aByteArrayArrayArray2[arg0].length) {
			return null;
		}
		if (this.aByteArrayArrayArray2[arg0][arg1] == null) {
			@Pc(50) boolean local50 = this.method74(arg0, null);
			if (!local50) {
				this.method62(arg0);
				local50 = this.method74(arg0, null);
				if (!local50) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)[B")
	public final byte[] method61(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray2.length == 1) {
			return this.method60(0, arg0);
		} else if (this.aByteArrayArrayArray2[arg0].length == 1) {
			return this.method60(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
	protected void method62(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!o;)V")
	public final void method63(@OriginalArg(1) Class40 arg0) {
		@Pc(7) Class40 local7 = arg0.method1196();
		@Pc(15) int local15 = this.aClass34_2.method1038(local7.method1190());
		if (local15 >= 0) {
			this.method56(local15);
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)Z")
	public final boolean method64(@OriginalArg(1) int arg0, @OriginalArg(2) int model) {
		if (model < 0 || this.aByteArrayArrayArray2.length <= model || this.aByteArrayArrayArray2[model] == null || arg0 < 0 || this.aByteArrayArrayArray2[model].length <= arg0) {
			return false;
		} else if (this.aByteArrayArrayArray2[model][arg0] != null) {
			return true;
		} else if (this.aByteArrayArray2[model] == null) {
			this.method62(model);
			return this.aByteArrayArray2[model] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(II)[B")
	public final byte[] method65(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray2.length == 1) {
			return this.method68(arg0, 0);
		} else if (this.aByteArrayArrayArray2[arg0].length == 1) {
			return this.method68(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([BI)V")
	protected final void method66(@OriginalArg(0) byte[] arg0) {
		this.anInt95 = Static22.method1726(arg0.length, arg0);
		@Pc(19) Packet packet = new Packet(Static84.method1359(arg0));
		@Pc(23) int local23 = packet.g1();
		if (local23 != 5) {
			return;
		}
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = 0;
		@Pc(37) int local37 = packet.g1();
		this.anInt97 = packet.g2();
		this.anIntArray14 = new int[this.anInt97];
		for (@Pc(49) int local49 = 0; local49 < this.anInt97; local49++) {
			this.anIntArray14[local49] = local33 += packet.g2();
			if (local31 < this.anIntArray14[local49]) {
				local31 = this.anIntArray14[local49];
			}
		}
		this.anIntArray11 = new int[local31 + 1];
		this.aByteArrayArrayArray2 = new byte[local31 + 1][][];
		this.aByteArrayArray2 = new byte[local31 + 1][];
		this.anIntArrayArray3 = new int[local31 + 1][];
		this.anIntArray16 = new int[local31 + 1];
		this.anIntArray15 = new int[local31 + 1];
		@Pc(124) int local124;
		if (local37 != 0) {
			this.anIntArray12 = new int[local31 + 1];
			for (local124 = 0; local124 < this.anInt97; local124++) {
				this.anIntArray12[this.anIntArray14[local124]] = packet.g4();
			}
			this.aClass34_2 = new Class34(this.anIntArray12);
		}
		for (local124 = 0; local124 < this.anInt97; local124++) {
			this.anIntArray16[this.anIntArray14[local124]] = packet.g4();
		}
		for (@Pc(169) int local169 = 0; local169 < this.anInt97; local169++) {
			this.anIntArray11[this.anIntArray14[local169]] = packet.g4();
		}
		for (@Pc(192) int local192 = 0; local192 < this.anInt97; local192++) {
			this.anIntArray15[this.anIntArray14[local192]] = packet.g2();
		}
		@Pc(220) int local220;
		@Pc(227) int local227;
		@Pc(222) int local222;
		@Pc(235) int local235;
		for (@Pc(211) int local211 = 0; local211 < this.anInt97; local211++) {
			local33 = 0;
			local220 = this.anIntArray14[local211];
			local222 = -1;
			local227 = this.anIntArray15[local220];
			this.anIntArrayArray3[local220] = new int[local227];
			for (local235 = 0; local235 < local227; local235++) {
				@Pc(254) int local254 = this.anIntArrayArray3[local220][local235] = local33 += packet.g2();
				if (local254 > local222) {
					local222 = local254;
				}
			}
			this.aByteArrayArrayArray2[local220] = new byte[local222 + 1][];
		}
		if (local37 == 0) {
			return;
		}
		this.anIntArrayArray4 = new int[local31 + 1][];
		this.aClass34Array2 = new Class34[local31 + 1];
		for (local220 = 0; local220 < this.anInt97; local220++) {
			local227 = this.anIntArray14[local220];
			local222 = this.anIntArray15[local227];
			this.anIntArrayArray4[local227] = new int[this.aByteArrayArrayArray2[local227].length];
			for (local235 = 0; local235 < local222; local235++) {
				this.anIntArrayArray4[local227][this.anIntArrayArray3[local227][local235]] = packet.g4();
			}
			this.aClass34Array2[local227] = new Class34(this.anIntArrayArray4[local227]);
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(II)V")
	public final void method67(@OriginalArg(0) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.aByteArrayArrayArray2[arg0].length; local7++) {
			this.aByteArrayArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)[B")
	public final byte[] method68(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method82(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!o;BLclient!o;)[B")
	public final byte[] method69(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(7) Class40 local7 = arg0.method1196();
		@Pc(11) Class40 local11 = arg1.method1196();
		@Pc(27) int local27 = this.aClass34_2.method1038(local7.method1190());
		@Pc(37) int local37 = this.aClass34Array2[local27].method1038(local11.method1190());
		return this.method68(local37, local27);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I")
	public final int method71() {
		return this.aByteArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!o;I)I")
	public final int method72(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class40 local12 = arg0.method1196();
		return this.aClass34Array2[arg1].method1038(local12.method1190());
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!o;ILclient!o;)Z")
	public final boolean method73(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(7) Class40 local7 = arg1.method1196();
		@Pc(13) Class40 local13 = arg0.method1196();
		@Pc(25) int local25 = this.aClass34_2.method1038(local7.method1190());
		@Pc(35) int local35 = this.aClass34Array2[local25].method1038(local13.method1190());
		return this.method64(local35, local25);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[I)Z")
	private boolean method74(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aByteArrayArray2[arg0] == null) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		@Pc(24) int[] local24 = this.anIntArrayArray3[arg0];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray2[arg0];
		@Pc(34) int local34 = this.anIntArray15[arg0];
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			if (local29[local24[local36]] == null) {
				local19 = false;
				break;
			}
		}
		if (local19) {
			return true;
		}
		@Pc(87) byte[] local87;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local87 = this.aByteArrayArray2[arg0];
		} else {
			local87 = new byte[this.aByteArrayArray2[arg0].length];
			Static110.method993(this.aByteArrayArray2[arg0], 0, local87, 0, local87.length);
			@Pc(102) Packet local102 = new Packet(local87);
			local102.method1684(local102.data.length, arg1);
		}
		@Pc(121) byte[] local121;
		try {
			local121 = Static84.method1359(local87);
		} catch (@Pc(123) RuntimeException local123) {
			throw Static103.method1645(local123, "T3 - " + (arg1 != null) + "," + arg0 + "," + local87.length + "," + Static22.method1726(local87.length, local87) + "," + Static22.method1726(local87.length - 2, local87) + "," + this.anIntArray16[arg0] + "," + this.anInt95);
		}
		if (this.aBoolean6) {
			this.aByteArrayArray2[arg0] = null;
		}
		if (local34 <= 1) {
			local29[local24[0]] = local121;
		} else {
			@Pc(200) int local200 = local121.length;
			@Pc(203) int local203 = local200 - 1;
			@Pc(207) int local207 = local121[local203] & 0xFF;
			@Pc(215) int local215 = local203 - local207 * 4 * local34;
			@Pc(220) Packet local220 = new Packet(local121);
			local220.pos = local215;
			@Pc(226) int[] local226 = new int[local34];
			@Pc(232) int local232;
			@Pc(234) int local234;
			for (@Pc(228) int local228 = 0; local228 < local207; local228++) {
				local232 = 0;
				for (local234 = 0; local234 < local34; local234++) {
					local232 += local220.g4();
					local226[local234] += local232;
				}
			}
			for (local232 = 0; local232 < local34; local232++) {
				if (local29[local24[local232]] == null) {
					local29[local24[local232]] = new byte[local226[local232]];
				}
				local226[local232] = 0;
			}
			local220.pos = local215;
			local234 = 0;
			for (@Pc(299) int local299 = 0; local299 < local207; local299++) {
				@Pc(303) int local303 = 0;
				for (@Pc(305) int local305 = 0; local305 < local34; local305++) {
					local303 += local220.g4();
					Static110.method993(local121, local234, local29[local24[local305]], local226[local305], local303);
					local226[local305] += local303;
					local234 += local303;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I")
	public final int method76(@OriginalArg(0) int arg0) {
		return this.aByteArrayArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)Z")
	public final boolean method78() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray14.length; local9++) {
			@Pc(16) int local16 = this.anIntArray14[local9];
			if (this.aByteArrayArray2[local16] == null) {
				this.method62(local16);
				if (this.aByteArrayArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!o;)I")
	public final int method80(@OriginalArg(1) Class40 arg0) {
		@Pc(14) Class40 local14 = arg0.method1196();
		return this.aClass34_2.method1038(local14.method1190());
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)[I")
	public final int[] method81(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray3[arg0];
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[II)[B")
	public final byte[] method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (arg1 < 0 || this.aByteArrayArrayArray2.length <= arg1 || this.aByteArrayArrayArray2[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray2[arg1][arg0] == null) {
			@Pc(49) boolean local49 = this.method74(arg1, arg2);
			if (!local49) {
				this.method62(arg1);
				local49 = this.method74(arg1, arg2);
				if (!local49) {
					return null;
				}
			}
		}
		@Pc(72) byte[] local72 = this.aByteArrayArrayArray2[arg1][arg0];
		if (this.aBoolean5) {
			this.aByteArrayArrayArray2[arg1][arg0] = null;
		}
		return local72;
	}
}

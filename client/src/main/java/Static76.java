import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
	public static int[] anIntArray431;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 7)
	public static void method1358() {
		JagString.aClass40_569 = null;
		JagString.aClass40_570 = null;
		anIntArray431 = null;
		client.ignoreName37 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[B)[B", line = 23)
	public static byte[] method1359(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Packet local8 = new Packet(arg0);
		@Pc(12) int local12 = local8.g1();
		@Pc(16) int local16 = local8.g4s();
		if (local16 < 0 || Static1.anInt2528 != 0 && Static1.anInt2528 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(40) byte[] local40 = new byte[local16];
			local8.gdata(local16, local40);
			return local40;
		} else {
			@Pc(52) int local52 = local8.g4s();
			if (local52 < 0 || Static1.anInt2528 != 0 && local52 > Static1.anInt2528) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local52];
			if (local12 == 1) {
				BZip2.method1265(local69, local52, arg0, local16);
			} else {
				try {
					@Pc(85) DataInputStream local85 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local16)));
					local85.readFully(local69);
					local85.close();
				} catch (@Pc(92) IOException local92) {
				}
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!vb;", line = 144)
	public static Pix24 method1361() {
		@Pc(9) Pix24 local9 = new Pix24();
		local9.anInt2445 = Static41.anInt1079;
		local9.anInt2443 = Static96.anInt2513;
		local9.anInt2444 = Static75.anIntArray430[0];
		local9.anInt2441 = Static89.anIntArray503[0];
		local9.anInt2446 = Static61.anIntArray338[0];
		local9.anInt2442 = Static18.anIntArray86[0];
		@Pc(50) int local50 = local9.anInt2442 * local9.anInt2446;
		@Pc(54) byte[] local54 = Static83.aByteArrayArray10[0];
		local9.anIntArray534 = new int[local50];
		for (@Pc(60) int local60 = 0; local60 < local50; local60++) {
			local9.anIntArray534[local60] = Static19.anIntArray92[local54[local60] & 0xFF];
		}
		Static85.method1485();
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I", line = 208)
	public static int method1362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}
}

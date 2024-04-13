import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt685;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!cb;Lclient!cb;BI)V", line = 1038)
	public static void method540(@OriginalArg(0) Cache arg0, @OriginalArg(1) Cache arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(10) byte[] local10 = arg0.read(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		@Pc(26) byte[] local26 = new byte[1000];
		@Pc(31) int local31 = local10.length - 2;
		@Pc(39) GZIPInputStream local39 = new GZIPInputStream(new ByteArrayInputStream(local10));
		while (true) {
			@Pc(46) int local46 = local39.read(local26, 0, local26.length);
			if (local46 == -1) {
				@Pc(61) byte[] local61 = new byte[local10.length + 9];
				Static107.copy(local10, 0, local61, 9, local10.length);
				@Pc(75) Packet local75 = new Packet(local61);
				local75.p1(2);
				local75.p4(local31);
				local75.p4(local23);
				local75.pos = local61.length - 2;
				@Pc(97) int local97 = local75.g2();
				local75.pos = local61.length - 2;
				local75.p2(local97 - 1);
				arg1.write(local61.length, arg2, local61);
				return;
			}
			local23 += local46;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 1091)
	public static void method541() {
		client.interfacesJs5 = null;
		JagString.aClass40_193 = null;
		VarpType.aClass5_9 = null;
	}
}

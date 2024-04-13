import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_6;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!p;")
	public static PixMap aClass45_8;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
	private static boolean aBoolean34;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 83)
	public static void method325() {
		aClass45_8 = null;
		JagString.aClass40_103 = null;
		JagString.aClass40_101 = null;
		IdkType.aClass5_5 = null;
		JagString.aClass40_107 = null;
		JagString.aClass40_105 = null;
		JagString.aClass40_104 = null;
		JagString.aClass40_106 = null;
		JagString.aClass40_102 = null;
		aClass5_6 = null;
		JagString.aClass40_108 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZB[BII)V", line = 445)
	public static void method335(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static98.aClass12_1 == null) {
			return;
		}
		if (Static1.anInt1548 >= 0) {
			Static1.anInt1175 = arg3;
			if (Static1.anInt1548 == 0) {
				Static1.anInt432 = 1;
			} else {
				@Pc(43) int local43 = Static40.method1248(Static1.anInt1548);
				@Pc(47) int local47 = local43 - Static1.anInt2474;
				Static1.anInt432 = (local47 + 3600) / arg3;
				if (Static1.anInt432 < 1) {
					Static1.anInt432 = 1;
				}
			}
			Static23.aByteArray9 = arg1;
			Static21.aBoolean185 = arg0;
			Static26.anInt685 = arg2;
		} else if (Static1.anInt432 == 0) {
			Static67.method1208(arg0, arg2, arg1);
		} else {
			Static23.aByteArray9 = arg1;
			Static26.anInt685 = arg2;
			Static21.aBoolean185 = arg0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!wc;BI)V", line = 523)
	public static void performCheck(@OriginalArg(0) PacketBit buf) {
		while (true) {
			@Pc(16) ReflectionCheckNode local16 = (ReflectionCheckNode) Static1.aClass44_9.head();
			if (local16 == null) {
				return;
			}
			@Pc(21) boolean local21 = false;
			for (@Pc(23) int local23 = 0; local23 < local16.size; local23++) {
				if (local16.fieldRequests[local23] != null) {
					if (local16.fieldRequests[local23].status == 2) {
						local16.errors[local23] = -5;
					}
					if (local16.fieldRequests[local23].status == 0) {
						local21 = true;
					}
				}
				if (local16.methodRequests[local23] != null) {
					if (local16.methodRequests[local23].status == 2) {
						local16.errors[local23] = -6;
					}
					if (local16.methodRequests[local23].status == 0) {
						local21 = true;
					}
				}
			}
			if (local21) {
				return;
			}
			buf.pIsaac1(149);
			buf.p1(0);
			@Pc(97) int local97 = buf.pos;
			buf.p4(local16.id);
			for (@Pc(104) int local104 = 0; local104 < local16.size; local104++) {
				if (local16.errors[local104] == 0) {
					try {
						@Pc(125) int local125 = local16.types[local104];
						@Pc(139) Field local139;
						@Pc(165) int local165;
						if (local125 == 0) {
							local139 = (Field) local16.fieldRequests[local104].result;
							local165 = local139.getInt(null);
							buf.p1(0);
							buf.p4(local165);
						} else if (local125 == 1) {
							local139 = (Field) local16.fieldRequests[local104].result;
							local139.setInt(null, local16.fieldValues[local104]);
							buf.p1(0);
						} else if (local125 == 2) {
							local139 = (Field) local16.fieldRequests[local104].result;
							local165 = local139.getModifiers();
							buf.p1(0);
							buf.p4(local165);
						}
						@Pc(209) Method local209;
						if (local125 == 3) {
							local209 = (Method) local16.methodRequests[local104].result;
							@Pc(234) byte[][] local234 = local16.methodArguments[local104];
							@Pc(238) Object[] local238 = new Object[local234.length];
							for (@Pc(240) int local240 = 0; local240 < local234.length; local240++) {
								@Pc(252) ObjectInputStream local252 = new ObjectInputStream(new ByteArrayInputStream(local234[local240]));
								local238[local240] = local252.readObject();
							}
							@Pc(271) Object local271 = local209.invoke(null, local238);
							if (local271 == null) {
								buf.p1(0);
							} else if (local271 instanceof Number) {
								buf.p1(1);
								buf.p8(((Number) local271).longValue());
							} else if (local271 instanceof JagString) {
								buf.p1(2);
								buf.pjstr((JagString) local271);
							} else {
								buf.p1(4);
							}
						} else if (local125 == 4) {
							local209 = (Method) local16.methodRequests[local104].result;
							local165 = local209.getModifiers();
							buf.p1(0);
							buf.p4(local165);
						}
					} catch (@Pc(318) ClassNotFoundException local318) {
						buf.p1(-10);
					} catch (@Pc(324) InvalidClassException local324) {
						buf.p1(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						buf.p1(-12);
					} catch (@Pc(340) OptionalDataException local340) {
						buf.p1(-13);
					} catch (@Pc(346) IllegalAccessException local346) {
						buf.p1(-14);
					} catch (@Pc(352) IllegalArgumentException local352) {
						buf.p1(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						buf.p1(-16);
					} catch (@Pc(366) SecurityException local366) {
						buf.p1(-17);
					} catch (@Pc(372) IOException local372) {
						buf.p1(-18);
					} catch (@Pc(380) NullPointerException local380) {
						buf.p1(-19);
					} catch (@Pc(386) Exception local386) {
						buf.p1(-20);
					} catch (@Pc(392) Throwable local392) {
						buf.p1(-21);
					}
				} else {
					buf.p1(local16.errors[local104]);
				}
			}
			buf.addcrc(local97);
			buf.psize1(buf.pos - local97);
			local16.unlink();
		}
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)Lclient!qb;", line = 719)
	public static Pix8 method338() {
		@Pc(3) Pix8 local3 = new Pix8();
		local3.anInt1909 = Static41.anInt1079;
		local3.anInt1908 = Static96.anInt2513;
		local3.anInt1907 = Static75.anIntArray430[0];
		local3.anInt1906 = Static89.anIntArray503[0];
		local3.anInt1905 = Static61.anIntArray338[0];
		local3.anInt1910 = Static18.anIntArray86[0];
		local3.anIntArray427 = Static19.anIntArray92;
		local3.aByteArray16 = Static83.aByteArrayArray10[0];
		Static85.method1485();
		return local3;
	}
}

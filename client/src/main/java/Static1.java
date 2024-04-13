import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!la", name = "mb", descriptor = "Z")
	public static final boolean aBoolean115 = false;
	@OriginalMember(owner = "client!l", name = "P", descriptor = "[I")
	public static final int[] anIntArray301 = new int[256];
	@OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
	public static final boolean aBoolean60 = false;
	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	public static final int anInt1519 = 3353893;
	@OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
	public static final int anInt2253 = 2301979;
	@OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
	public static final int anInt2457 = 50;
	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static final int anInt311 = 7759444;
	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static final int anInt2528 = 0;
	@OriginalMember(owner = "client!n", name = "t", descriptor = "I")
	public static final int anInt1660 = 20;
	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public static final int anInt248 = 3;
	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public static final int anInt1936 = 5063219;
	@OriginalMember(owner = "client!ja", name = "z", descriptor = "[I")
	public static int[] anIntArray537 = new int[anInt2457];
	@OriginalMember(owner = "client!ja", name = "A", descriptor = "[I")
	public static int[] anIntArray538 = new int[anInt2457];
	@OriginalMember(owner = "client!ja", name = "I", descriptor = "[I")
	public static int[] anIntArray541 = new int[anInt2457];
	@OriginalMember(owner = "client!ja", name = "u", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array39 = new JagString[anInt2457];
	@OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
	public static int[] anIntArray540 = new int[anInt2457];
	@OriginalMember(owner = "client!ja", name = "v", descriptor = "[I")
	public static int[] anIntArray535 = new int[anInt2457];
	@OriginalMember(owner = "client!ja", name = "K", descriptor = "[I")
	public static int[] anIntArray542 = new int[anInt2457];
	@OriginalMember(owner = "client!ja", name = "F", descriptor = "[I")
	public static int[] anIntArray539 = new int[anInt2457];
	@OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int anInt8;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public static int anInt16;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Lclient!p;")
	public static PixMap aClass45_1;
	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean1 = true;
	@OriginalMember(owner = "client!a", name = "s", descriptor = "J")
	public static long aLong1 = 0L;
	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	public static int anInt14 = 0;
	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public static int anInt10 = 0;
	@OriginalMember(owner = "client!a", name = "w", descriptor = "Z")
	public static boolean lowDetail = false;
	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "J")
	public static long aLong12 = 0L;
	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
	public static int anInt180 = 0;
	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!od;")
	public static LinkList aClass44_1 = new LinkList();
	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
	public static int[] anIntArray36 = new int[50];
	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "Z")
	public static boolean aBoolean13 = false;
	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lclient!qc;")
	public static LruCache aClass47_3 = new LruCache(64);
	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
	public static int[] anIntArray37 = new int[] { 1, 2, 4, 8 };
	@OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
	public static int anInt182 = 0;
	@OriginalMember(owner = "client!ca", name = "R", descriptor = "Z")
	public static boolean aBoolean27 = true;
	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "Lclient!od;")
	public static LinkList aClass44_4 = new LinkList();
	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
	public static int anInt641 = 0;
	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int anInt1012 = -1;
	@OriginalMember(owner = "client!i", name = "O", descriptor = "Lclient!qc;")
	public static LruCache aClass47_10 = new LruCache(10);
	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!qc;")
	public static LruCache aClass47_11 = new LruCache(64);
	@OriginalMember(owner = "client!la", name = "tb", descriptor = "Z")
	public static boolean aBoolean116 = false;
	@OriginalMember(owner = "client!la", name = "rb", descriptor = "I")
	public static int anInt1493 = 0;
	@OriginalMember(owner = "client!la", name = "xb", descriptor = "I")
	public static volatile int anInt1497 = 0;
	@OriginalMember(owner = "client!la", name = "wb", descriptor = "I")
	public static int anInt1496 = -1;
	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[520];
	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
	public static int anInt2030 = 0;
	@OriginalMember(owner = "client!sa", name = "Kb", descriptor = "I")
	public static int anInt2039 = 0;
	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	public static int anInt2061 = 0;
	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	public static int anInt2066 = 0;
	@OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
	public static int anInt2465 = 0;
	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	public static int anInt2466 = -1;
	@OriginalMember(owner = "client!vc", name = "P", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();
	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "[I")
	public static int[] anIntArray546 = new int[1000];
	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "I")
	public static int anInt2474 = 0;
	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "[I")
	public static int[] anIntArray545 = new int[128];
	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
	public static int anInt2473 = 0;
	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt737 = 0;
	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	public static int anInt797 = 0;
	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt798 = 1;
	@OriginalMember(owner = "client!gd", name = "D", descriptor = "[Lclient!d;")
	public static BufferedFile[] aClass14Array2 = new BufferedFile[5];
	@OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
	public static int anInt804 = 2;
	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	public static int anInt807 = 99;
	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	public static int anInt805 = 1;
	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public static int anInt799 = 0;
	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public static int anInt808 = -1;
	@OriginalMember(owner = "client!ge", name = "y", descriptor = "[I")
	public static int[] anIntArray160 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[I")
	public static int[] anIntArray159 = new int[5];
	@OriginalMember(owner = "client!ge", name = "C", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];
	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int anInt816 = 0;
	@OriginalMember(owner = "client!ge", name = "E", descriptor = "[I")
	public static int[] anIntArray161 = new int[500];
	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public static int anInt1186 = 0;
	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public static int anInt1190 = 0;
	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	public static int anInt2353 = 0;
	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public static int anInt2352 = 0;
	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	public static int anInt2356 = -1;
	@OriginalMember(owner = "client!ub", name = "J", descriptor = "[I")
	public static int[] anIntArray500 = new int[1000];
	@OriginalMember(owner = "client!ub", name = "K", descriptor = "[I")
	public static int[] anIntArray501 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Z")
	public static boolean aBoolean175 = false;
	@OriginalMember(owner = "client!ub", name = "y", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];
	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
	public static int anInt2359 = 0;
	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!eb;")
	public static Packet aClass2_Sub3_5 = new Packet(8);
	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
	public static int[] anIntArray2 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[Lclient!d;")
	public static BufferedFile[] aClass14Array1 = new BufferedFile[12];
	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt34 = 0;
	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[Lclient!ua;")
	public static NpcEntity[] aClass2_Sub2_Sub12_Sub1_Sub2Array1 = new NpcEntity[16384];
	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!qc;")
	public static LruCache aClass47_1 = new LruCache(30);
	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
	public static int anInt140 = 1;
	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "I")
	public static int anInt131 = 0;
	@OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
	public static int anInt139 = -1;
	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public static int anInt1850 = 0;
	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
	public static boolean aBoolean149 = false;
	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public static volatile int anInt1860 = 0;
	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public static int anInt1857 = 0;
	@OriginalMember(owner = "client!cd", name = "C", descriptor = "Z")
	public static boolean aBoolean151 = false;
	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[I")
	public static int[] anIntArray234 = new int[25];
	@OriginalMember(owner = "client!d", name = "B", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array7 = new JagString[100];
	@OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
	public static int[] anIntArray82 = new int[] { 0, 0, 0, -1, 0, 0, 0, 8, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0, 0, 14, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 6, 0, 2, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, -2, -2, 0, 5, 0, 10, 0, 0, 0, 5, 7, 0, 0, 1, 0, 0, 15, 2, -1, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -1, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 4, 0, 2, 0, -2, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 6, 0, 6, 4, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 10, 0, -2, 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 1, 0, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 4, 0, 0, 0, 0, 2, 5, 0, 3, 0, 0, 4 };
	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public static int anInt426 = -1;
	@OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
	public static int[] anIntArray85 = new int[256];
	@OriginalMember(owner = "client!db", name = "g", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array8;
	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt432;
	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	public static boolean aBoolean37;
	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public static int anInt434;
	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt437 = 0;
	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!qc;")
	public static LruCache aClass47_4 = new LruCache(64);
	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	public static int anInt441 = 0;
	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt442 = 0;
	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public static int anInt440 = 0;
	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lclient!fb;")
	public static CollisionMap[] aClass20Array3 = new CollisionMap[4];
	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
	public static int[] anIntArray415 = new int[5];
	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Z")
	public static boolean aBoolean152 = false;
	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!o;")
	public static JagString aClass40_542 = Static12.method257(":chalreq:");
	@OriginalMember(owner = "client!pd", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[50][];
	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Lclient!o;")
	public static JagString aClass40_545 = Static12.method257("@yel@World");
	@OriginalMember(owner = "client!pd", name = "m", descriptor = "Lclient!o;")
	public static JagString aClass40_544 = Static12.method257("chatback");
	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt1871 = 0;
	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int anInt1868 = 0;
	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!o;")
	public static JagString aClass40_543 = Static12.method257("q8_full");
	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
	public static int[] anIntArray416 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public static int anInt1874 = 0;
	@OriginalMember(owner = "client!e", name = "u", descriptor = "Lclient!qc;")
	public static LruCache aClass47_5 = new LruCache(64);
	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public static int anInt475 = 0;
	@OriginalMember(owner = "client!e", name = "G", descriptor = "I")
	public static int anInt470 = 0;
	@OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
	public static int[] anIntArray93 = new int[5];
	@OriginalMember(owner = "client!e", name = "F", descriptor = "Lclient!od;")
	public static LinkList aClass44_2 = new LinkList();
	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public static int anInt477 = -1;
	@OriginalMember(owner = "client!e", name = "W", descriptor = "Z")
	public static boolean aBoolean40 = false;
	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int anInt481 = 0;
	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];
	@OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
	public static int anInt716 = 0;
	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int anInt719 = 0;
	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt721 = -1;
	@OriginalMember(owner = "client!fe", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[250][];
	@OriginalMember(owner = "client!h", name = "l", descriptor = "[I")
	public static int[] anIntArray163 = new int[4000];
	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!ba;")
	public static HashTable aClass6_2 = new HashTable(4096);
	@OriginalMember(owner = "client!h", name = "q", descriptor = "[I")
	public static int[] anIntArray166 = new int[100];
	@OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
	public static int[] anIntArray164 = new int[5];
	@OriginalMember(owner = "client!h", name = "p", descriptor = "[I")
	public static int[] anIntArray165 = new int[500];
	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public static int anInt2500 = 0;
	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public static int anInt2505 = 0;
	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public static int anInt2511 = 0;
	@OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
	public static int[] anIntArray337 = new int[256];
	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public static int anInt1094 = 0;
	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!qc;")
	public static LruCache aClass47_12 = new LruCache(64);
	@OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
	public static boolean aBoolean87 = false;
	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public static int anInt1095 = 0;
	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static int anInt1096 = 0;
	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	public static int anInt1097 = 0;
	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt1171 = 0;
	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static int[] anIntArray257 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };
	@OriginalMember(owner = "client!ka", name = "m", descriptor = "[I")
	public static int[] anIntArray258 = new int[1000];
	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt1175 = 0;
	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Z")
	public static boolean aBoolean95 = false;
	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt1501 = -1;
	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[Lclient!eb;")
	public static Packet[] aClass2_Sub3Array1 = new Packet[2048];
	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	public static int[] anIntArray312 = new int[25];
	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static int anInt1506 = 78;
	@OriginalMember(owner = "client!le", name = "f", descriptor = "I")
	public static int anInt1510 = 0;
	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public static int anInt1548 = -1;
	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!qc;")
	public static LruCache aClass47_14 = new LruCache(64);
	@OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
	public static int anInt1550 = 0;
	@OriginalMember(owner = "client!ma", name = "u", descriptor = "Z")
	public static boolean aBoolean121 = false;
	@OriginalMember(owner = "client!ma", name = "v", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7 = new byte[4][104][104];
	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public static int anInt1552 = 1;
	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
	public static int[] anIntArray316 = new int[200];
	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt1551 = 3;
	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!mc;")
	public static ComType aClass2_Sub2_Sub13_1 = new ComType();
	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!wc;")
	public static PacketBit aClass2_Sub3_Sub1_3 = new PacketBit(5000);
	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public static int anInt1554 = 0;
	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt1669 = 0;
	@OriginalMember(owner = "client!na", name = "b", descriptor = "I")
	public static int anInt1667 = 0;
	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public static int anInt1675 = 0;
	@OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
	public static int[] anIntArray339 = new int[2000];
	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public static int anInt1672 = 0;
	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	public static int[] anIntArray469 = new int[100];
	@OriginalMember(owner = "client!p", name = "f", descriptor = "Z")
	public static boolean aBoolean164 = false;
	@OriginalMember(owner = "client!p", name = "j", descriptor = "[I")
	public static int[] anIntArray470 = new int[128];
	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!ba;")
	public static HashTable aClass6_5 = new HashTable(32);
	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!va;")
	public static BZip2State aClass61_1 = new BZip2State();
	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!qc;")
	public static LruCache aClass47_16 = new LruCache(64);
	@OriginalMember(owner = "client!r", name = "h", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();
	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!vd;")
	public static Mouse aClass62_1 = new Mouse();
	@OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
	public static int[] anIntArray429 = new int[] { 1, 0, -1, 0 };
	@OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
	public static int anInt1966 = 0;
	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	public static int anInt1955 = -1;
	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int anInt1952 = 0;
	@OriginalMember(owner = "client!rb", name = "C", descriptor = "[Lclient!ad;")
	public static Js5[] aClass5_Sub1Array1 = new Js5[256];
	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public static int anInt1971 = -1;
	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt1973 = 0;
	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public static int anInt1978 = 0;
	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];
	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	public static int anInt1974 = 0;
	@OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
	public static int anInt1977 = -1;
	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	public static int anInt1979 = -1;
	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int anInt1986 = 0;
	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt1989 = 0;
	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	public static int anInt1994 = -1;
	@OriginalMember(owner = "client!ta", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[4][105][105];
	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	public static int anInt2139 = 0;
	@OriginalMember(owner = "client!ta", name = "e", descriptor = "[[[Lclient!od;")
	public static LinkList[][][] aClass44ArrayArrayArray1 = new LinkList[4][104][104];
	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public static int anInt2143 = 0;
	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	public static int anInt2146 = 0;
	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int anInt2180 = 0;
	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public static int anInt2181 = 0;
	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt2175 = -1;
	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int anInt2177 = 128;
	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public static int anInt2179 = 256;
	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!ba;")
	public static HashTable aClass6_6 = new HashTable(4096);
	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	public static int anInt2182 = 0;
	@OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
	public static int[] anIntArray473 = new int[25];
	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public static int anInt2194 = 10;
	@OriginalMember(owner = "client!uc", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray35 = new boolean[5];
	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!nb;")
	public static GameShell anApplet_Sub1_1 = null;
	@OriginalMember(owner = "client!uc", name = "l", descriptor = "[Lclient!ne;")
	public static Model[] aClass2_Sub2_Sub12_Sub4Array1 = new Model[4];
	@OriginalMember(owner = "client!uc", name = "A", descriptor = "J")
	public static long aLong139 = 0L;
	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public static int[] anIntArray504 = new int[2048];
	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	public static int anInt2371 = 0;
	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	public static int anInt2372 = 127;
	@OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
	public static int[] anIntArray519 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public static int anInt2400 = 0;
	@OriginalMember(owner = "client!va", name = "g", descriptor = "[I")
	public static int[] anIntArray518 = new int[32];
	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	public static int anInt2410 = 0;
	@OriginalMember(owner = "client!va", name = "b", descriptor = "I")
	public static int anInt2399 = 0;
	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public static int anInt2401 = 0;
	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public static int anInt2515 = 0;
	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!od;")
	public static LinkList aClass44_9 = new LinkList();
	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	public static int anInt2518 = 0;
	@OriginalMember(owner = "client!wa", name = "m", descriptor = "[I")
	public static int[] anIntArray549 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static volatile int anInt2520 = 0;
	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!ba;")
	public static HashTable aClass6_7 = new HashTable(4096);
	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];
	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt410 = 0;
	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	public static volatile int anInt969 = 0;
	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public static int anInt982 = -1;
	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	public static int anInt980 = -1;
	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!le;")
	public static PlayerAppearance aClass33_1 = new PlayerAppearance();
	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	public static int anInt986 = 0;
	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public static int anInt693 = 0;
	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	public static int anInt695 = 0;
	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "[I")
	public static int[] anIntArray326 = new int[16384];
	@OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
	public static int anInt1571 = 0;
	@OriginalMember(owner = "client!mc", name = "Eb", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array30 = new JagString[100];
	@OriginalMember(owner = "client!mc", name = "hc", descriptor = "I")
	public static int anInt1612 = 0;
	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
	public static int[] anIntArray80 = new int[99];
	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	public static int[] anIntArray79 = new int[50];
	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt304 = 0;
	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public static int anInt308;
	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public static int anInt309;
	@OriginalMember(owner = "client!cb", name = "x", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array6;
	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	public static int anInt2254 = 0;
	@OriginalMember(owner = "client!ec", name = "db", descriptor = "[I")
	public static int[] anIntArray103 = new int[4000];
	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
	public static int anInt583 = 0;
	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[104][104];
	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt375 = 0;
	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public static int anInt390 = 0;
	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!qc;")
	public static LruCache aClass47_2 = new LruCache(100);
	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int anInt51 = -1;
	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	public static int anInt53 = 0;
	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public static int anInt50 = 0;
	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Z")
	public static boolean aBoolean182 = false;
	@OriginalMember(owner = "client!ja", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray41 = new boolean[5];
	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Z")
	public static volatile boolean aBoolean183 = true;
	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public static int anInt2455 = 1;
	@OriginalMember(owner = "client!ja", name = "B", descriptor = "J")
	public static volatile long aLong149 = 0L;
	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int anInt231 = 0;
	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Z")
	public static boolean aBoolean23 = false;
	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public static int anInt239 = 255;
	@OriginalMember(owner = "client!ba", name = "o", descriptor = "B")
	public static byte aByte1 = 0;
	@OriginalMember(owner = "client!ba", name = "A", descriptor = "[B")
	public static byte[] aByteArray1 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Z")
	public static boolean aBoolean22 = false;
	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
	public static boolean aBoolean146 = false;
	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!oa;")
	public static Stack aClass41_1 = new Stack();
	@OriginalMember(owner = "client!ob", name = "o", descriptor = "Lclient!qc;")
	public static LruCache aClass47_15 = new LruCache(30);
	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public static int anInt1813 = 0;
	@OriginalMember(owner = "client!v", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray37 = new boolean[112];
	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[Lclient!kc;")
	public static PlayerEntity[] aClass2_Sub2_Sub12_Sub1_Sub1Array1 = new PlayerEntity[2048];
	@OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
	public static int anInt2396 = 0;
	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public static int anInt274 = 0;
	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[104][104];
	@OriginalMember(owner = "client!o", name = "q", descriptor = "Z")
	public static boolean aBoolean142 = false;
	@OriginalMember(owner = "client!o", name = "L", descriptor = "I")
	public static int anInt1779 = 2;
	@OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
	public static boolean aBoolean143 = false;
	@OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
	public static int anInt1792 = 0;
	@OriginalMember(owner = "client!ud", name = "q", descriptor = "[I")
	public static int[] anIntArray13 = new int[] { 16, 32, 64, 128 };
	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt91 = 0;
	@OriginalMember(owner = "client!ud", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][13][13];
	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
	public static volatile int anInt112 = -1;
	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();
	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
	public static int anInt121 = 0;
	@OriginalMember(owner = "client!od", name = "s", descriptor = "[Lclient!oc;")
	public static SoundTrack[] aClass43Array1 = new SoundTrack[50];
	@OriginalMember(owner = "client!od", name = "r", descriptor = "Z")
	public static boolean aBoolean147 = true;
	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public static int anInt1826 = -1;
	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	public static int anInt1649 = 0;
	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	public static int anInt1645 = 0;
	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	public static int anInt1654 = -1;
	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	public static volatile int anInt1663 = -1;
	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "I")
	public static int anInt1038 = 0;
	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt1911 = 0;
	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt1917 = 0;
	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public static int anInt1919 = 0;
	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!wc;")
	public static PacketBit aClass2_Sub3_Sub1_4 = new PacketBit(5000);
	@OriginalMember(owner = "client!bc", name = "a", descriptor = "[B")
	public static byte[] aByteArray2 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!qc;")
	public static LruCache aClass47_22 = new LruCache(64);
	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	public static int anInt2491 = 0;
	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public static int anInt2492 = -1;
	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	public static volatile int anInt2494 = 0;
	@OriginalMember(owner = "client!ua", name = "Fc", descriptor = "I")
	public static int anInt2328 = 0;
	@OriginalMember(owner = "client!ua", name = "Lc", descriptor = "I")
	public static int anInt2333 = 0;
	@OriginalMember(owner = "client!ua", name = "Tc", descriptor = "Z")
	public static boolean aBoolean173 = false;
	@OriginalMember(owner = "client!ua", name = "Nc", descriptor = "[I")
	public static int[] anIntArray497 = new int[50];
	@OriginalMember(owner = "client!ua", name = "Hc", descriptor = "Lclient!od;")
	public static LinkList aClass44_8 = new LinkList();
	@OriginalMember(owner = "client!ua", name = "Zc", descriptor = "I")
	public static int anInt2340 = -1;
	@OriginalMember(owner = "client!ua", name = "bd", descriptor = "I")
	public static int anInt2342 = 0;
	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
	public static int[] anIntArray152 = new int[256];
	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lclient!qc;")
	public static LruCache aClass47_8 = new LruCache(200);
	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	public static int anInt785 = 0;
	@OriginalMember(owner = "client!gb", name = "Gb", descriptor = "Z")
	public static boolean aBoolean59 = false;
	@OriginalMember(owner = "client!gb", name = "Jb", descriptor = "I")
	public static int anInt786 = 0;
	@OriginalMember(owner = "client!gb", name = "Lb", descriptor = "I")
	public static int anInt788 = 0;
	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
	public static int anInt927 = 0;
	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Z")
	public static boolean aBoolean65 = false;
	@OriginalMember(owner = "client!hb", name = "bc", descriptor = "I")
	public static int anInt965 = 0;
	@OriginalMember(owner = "client!hb", name = "Eb", descriptor = "I")
	public static int anInt949 = 0;
	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public static int anInt2067 = 0;
	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	public static int[] anIntArray453 = new int[128];
	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int anInt2083 = 0;
	@OriginalMember(owner = "client!sc", name = "A", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];
	@OriginalMember(owner = "client!sc", name = "E", descriptor = "[I")
	public static int[] anIntArray454 = new int[500];
	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public static int anInt2077 = 0;
	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Lclient!qc;")
	public static LruCache aClass47_23 = new LruCache(64);
	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "Z")
	public static boolean aBoolean184 = false;
	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
	public static int anInt2587 = 0;
	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "I")
	public static int anInt2590 = -1;
	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	public static int anInt2585 = -1;
	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
	public static int anInt2594 = 0;
	@OriginalMember(owner = "client!wc", name = "Pb", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array40 = new JagString[100];
	@OriginalMember(owner = "client!ke", name = "Nb", descriptor = "J")
	public static long aLong136 = 0L;
	@OriginalMember(owner = "client!ke", name = "Xb", descriptor = "I")
	public static int anInt2299 = 1;
	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "Lclient!wc;")
	public static PacketBit aClass2_Sub3_Sub1_5 = new PacketBit(5000);
	@OriginalMember(owner = "client!ke", name = "Cc", descriptor = "I")
	public static int anInt2326 = 0;
	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!qc;")
	public static LruCache aClass47_21 = new LruCache(500);
	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Lclient!od;")
	public static LinkList aClass44_7 = new LinkList();
	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Z")
	public static boolean aBoolean165 = false;
	@OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
	public static int anInt2170 = 0;
	@OriginalMember(owner = "client!kc", name = "Sc", descriptor = "[I")
	public static int[] anIntArray287 = new int[500];
	@OriginalMember(owner = "client!kc", name = "Wc", descriptor = "Z")
	public static boolean aBoolean102 = false;
	@OriginalMember(owner = "client!kc", name = "hd", descriptor = "Z")
	public static boolean aBoolean103 = false;
	@OriginalMember(owner = "client!kc", name = "kd", descriptor = "[I")
	public static int[] anIntArray288 = new int[2000];
	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "[I")
	public static int[] anIntArray298 = new int[] { 0, -1, 0, 1 };
	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
	public static int anInt1430 = (int) (Math.random() * 33.0D) - 16;
	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!qc;")
	public static LruCache aClass47_13 = new LruCache(64);
	@OriginalMember(owner = "client!t", name = "j", descriptor = "Lclient!qc;")
	public static LruCache aClass47_17 = new LruCache(260);
	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int anInt2132 = 0;
	@OriginalMember(owner = "client!t", name = "o", descriptor = "I")
	public static int anInt2133 = 0;
	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!qc;")
	public static LruCache aClass47_18 = new LruCache(50);
	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	public static int anInt2136 = 0;
	@OriginalMember(owner = "client!t", name = "r", descriptor = "Lclient!qc;")
	public static LruCache aClass47_19 = new LruCache(50);
	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!qc;")
	public static LruCache aClass47_20 = new LruCache(50);
	@OriginalMember(owner = "client!u", name = "tb", descriptor = "J")
	public static long aLong132 = 0L;
	@OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
	public static int anInt2226 = 0;
	@OriginalMember(owner = "client!u", name = "zb", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array9 = new Pix24[1000];
	@OriginalMember(owner = "client!u", name = "nb", descriptor = "Lclient!eb;")
	public static Packet aClass2_Sub3_4 = new Packet(new byte[5000]);
	@OriginalMember(owner = "client!u", name = "Gb", descriptor = "I")
	public static int anInt2239 = 0;
	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	public static int anInt667 = 2;
	@OriginalMember(owner = "client!f", name = "jb", descriptor = "Lclient!qc;")
	public static LruCache aClass47_7 = new LruCache(100);
	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray27 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };
	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static int anInt1801 = 0;
	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
	public static boolean aBoolean144 = false;
	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public static int anInt1800 = 0;
	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!ka;")
	public static Keyboard aClass30_1 = new Keyboard();
	@OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
	public static int[] anIntArray408 = new int[2048];
	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[104][104];
	@OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
	public static int anInt1695 = 0;
	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[I")
	public static int[] anIntArray345 = new int[6];
	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[I")
	public static int[] anIntArray340 = new int[6];
	@OriginalMember(owner = "client!nc", name = "l", descriptor = "[I")
	public static int[] anIntArray348 = new int[6];
	@OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
	public static int[] anIntArray351 = new int[6];
	@OriginalMember(owner = "client!nc", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
	@OriginalMember(owner = "client!nc", name = "v", descriptor = "[I")
	public static int[] anIntArray354 = new int[6];
	@OriginalMember(owner = "client!nc", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public static int anInt1942 = (int) (Math.random() * 17.0D) - 8;
	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public static int anInt1947 = 0;
	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public static int anInt1075 = 0;
	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
	public static int anInt1080 = 0;
	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public static int anInt1077 = 0;
	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	@OriginalMember(owner = "client!bd", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray6 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public static int anInt262 = 0;
	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public static int anInt263 = 0;
	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public static int anInt261 = 0;
	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public static int anInt264 = 0;
	@OriginalMember(owner = "client!k", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	@OriginalMember(owner = "client!k", name = "x", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array23 = new JagString[200];
	@OriginalMember(owner = "client!k", name = "A", descriptor = "I")
	public static volatile int anInt1166 = 0;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray85[local8] = local11;
		}
		aClass40Array8 = new JagString[500];
		anInt432 = 0;
		aBoolean37 = false;
		anInt434 = 0;
	}

	static {
		@Pc(47) int local47 = 2;
		for (@Pc(49) int local49 = 0; local49 < 32; local49++) {
			anIntArray518[local49] = local47 - 1;
			local47 += local47;
		}
		JagString.aClass40_694 = Static12.method257("*6n*6nYou have @gre@");
		JagString.aClass40_695 = Static12.method257("Enter name:");
	}

	static {
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 99; local19++) {
			@Pc(24) int local24 = local19 + 1;
			@Pc(37) int local37 = (int) ((double) local24 + Math.pow(2.0D, (double) local24 / 7.0D) * 300.0D);
			local17 += local37;
			anIntArray80[local19] = local17 / 4;
		}
		anInt308 = 0;
		anInt309 = 0;
		aClass40Array6 = new JagString[5];
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lclient!o;", line = 16)
	public static JagString method1(@OriginalArg(1) int arg0) {
		if (arg0 > Static78.anInt2035 + 10) {
			return JagString.aClass40_115;
		}
		@Pc(17) long local17 = ((long) arg0 + 11745L) * 86400000L;
		@Pc(19) Calendar local19 = Calendar.getInstance();
		local19.setTime(new Date(local17));
		@Pc(29) int local29 = local19.get(5);
		@Pc(38) int local38 = local19.get(2);
		@Pc(42) int local42 = local19.get(1);
		@Pc(93) JagString[] local93 = new JagString[] { JagString.aClass40_679, JagString.aClass40_670, JagString.aClass40_396, JagString.aClass40_633, JagString.aClass40_291, JagString.aClass40_738, JagString.aClass40_70, JagString.aClass40_24, JagString.aClass40_712, JagString.aClass40_630, JagString.aClass40_320, JagString.aClass40_255 };
		return Static72.method1334(new JagString[] { Static48.method859(local29), JagString.aClass40_409, local93[local38], JagString.aClass40_409, Static48.method859(local42) });
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z", line = 43)
	public static boolean method2(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 99)
	public static void method3() {
		for (@Pc(10) SpotAnimEntity local10 = (SpotAnimEntity) aClass44_8.head(); local10 != null; local10 = (SpotAnimEntity) aClass44_8.method1231()) {
			if (local10.anInt2235 != anInt8 || local10.aBoolean169) {
				local10.method1677();
			} else if (anInt2511 >= local10.anInt2231) {
				local10.method1519(anInt1095);
				if (local10.aBoolean169) {
					local10.method1677();
				} else {
					Static85.aClass55_1.method1425(local10.anInt2235, local10.anInt2232, local10.anInt2230, local10.anInt2223, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ke;Z)V", line = 140)
	public static void method4(@OriginalArg(0) PathingEntity arg0) {
		if (arg0.anInt2297 == anInt2511 || arg0.anInt2307 == -1 || arg0.anInt2313 != 0 || arg0.anInt2267 + 1 > Static57.method1042(arg0.anInt2307).delay[arg0.anInt2316]) {
			@Pc(38) int local38 = arg0.anInt2297 - arg0.anInt2277;
			@Pc(44) int local44 = anInt2511 - arg0.anInt2277;
			@Pc(54) int local54 = arg0.anInt2278 * 64 + arg0.anInt2321 * 128;
			@Pc(64) int local64 = arg0.anInt2278 * 64 + arg0.anInt2311 * 128;
			@Pc(74) int local74 = arg0.anInt2286 * 128 + arg0.anInt2278 * 64;
			@Pc(84) int local84 = arg0.anInt2278 * 64 + arg0.anInt2317 * 128;
			arg0.anInt2275 = ((local38 - local44) * local84 + local64 * local44) / local38;
			arg0.anInt2284 = ((local38 - local44) * local54 + local74 * local44) / local38;
		}
		arg0.anInt2282 = 0;
		if (arg0.anInt2314 == 0) {
			arg0.anInt2283 = 1024;
		}
		if (arg0.anInt2314 == 1) {
			arg0.anInt2283 = 1536;
		}
		if (arg0.anInt2314 == 2) {
			arg0.anInt2283 = 0;
		}
		if (arg0.anInt2314 == 3) {
			arg0.anInt2283 = 512;
		}
		arg0.anInt2305 = arg0.anInt2283;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 192)
	public static void method5() {
		JagString.aClass40_3 = null;
		JagString.aClass40_2 = null;
		aClass45_1 = null;
		anIntArray1 = null;
		JagString.aClass40_4 = null;
		JagString.aClass40_1 = null;
	}
}

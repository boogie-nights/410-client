package jagex2;

import jagex2.dash3d.Occluder;
import jagex2.datastruct.LinkedList;
import jagex2.graphics.Static71;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public static int anInt2091;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt2093;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt2094;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public static int sinEyeYaw;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public static int cosEyeYaw;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	public static int anInt2102;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	public static int cosEyePitch;

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
	public static int anInt2108;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
	public static int anInt2109;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	public static int anInt2110;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	public static int sinEyePitch;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
	public static int anInt2115;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
	public static int anInt2117;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
	private static int viewportBottom;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
	private static int viewportCenterX;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	private static int viewportTop;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
	private static int viewportCenterY;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
	private static int viewportRight;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
	private static int viewportLeft;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt2092 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
	public static int[] WALL_DECORATION_INSET_X = new int[] { 53, -53, -53, 53 };

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
	public static int[] WALL_DECORATION_OUTSET_X = new int[] { -45, 45, 45, -45 };

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lclient!sc;")
	public static Occluder[] aClass54Array1 = new Occluder[500];

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt2096 = -1;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public static int anInt2097 = 0;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Z")
	public static boolean aBoolean163 = true;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!od;")
	public static LinkedList aClass44_6 = new LinkedList();

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public static int anInt2100 = -1;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "[I")
	public static int[] WALL_DECORATION_INSET_Z = new int[] { -53, -53, 53, 53 };

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "[Lclient!n;")
	public static Class37[] aClass37Array3 = new Class37[100];

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
	public static final int LEVEL_COUNT = 4;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "[I")
	public static int[] levelOccluderCount = new int[LEVEL_COUNT];

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
	public static int anInt2111 = 0;

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "[I")
	public static int[] WALL_DECORATION_OUTSET_Z = new int[] { 45, 45, -45, -45 };

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "[[Lclient!sc;")
	public static Occluder[][] levelOccluders = new Occluder[LEVEL_COUNT][500];

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
	public static int anInt2116 = 0;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "[I")
	public static int[] WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "[I")
	public static int[] DIRECTION_ALLOW_WALL_CORNER_TYPE = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "[I")
	public static int[] BACK_WALL_TYPES = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "[I")
	public static int[] WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "[I")
	public static int[] WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "[I")
	public static int[] WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "[I")
	public static int[] FRONT_WALL_TYPES = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "[[[[Z")
	public static boolean[][][][] visibilityMap = new boolean[8][32][51][51];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public static int method1420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (127 - arg1) * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIII)V")
	public static void init(@OriginalArg(0) int[] pitchDistance) {
		viewportLeft = 0;
		viewportTop = 0;
		viewportRight = 512;
		viewportBottom = 334;
		viewportCenterX = 256;
		viewportCenterY = 167;
		@Pc(21) boolean[][][][] matrix = new boolean[9][32][53][53];
		for (@Pc(23) int pitch = 128; pitch <= 384; pitch += 32) {
			for (int yaw = 0; yaw < 2048; yaw += 64) {
				sinEyePitch = Static71.sin[pitch];
				cosEyePitch = Static71.cos[pitch];
				sinEyeYaw = Static71.sin[yaw];
				cosEyeYaw = Static71.cos[yaw];

				int pitchLevel = (pitch - 128) / 32;
				int yawLevel = yaw / 64;
				for (int dx = -26; dx <= 26; dx++) {
					for (@Pc(58) int dz = -26; dz <= 26; dz++) {
						int x = dx * 128;
						int z = dz * 128;
						@Pc(69) boolean visible = false;
						for (@Pc(72) int y = -500; y <= 800; y += 128) {
							if (testPoint(x, pitchDistance[pitchLevel] + y, z)) {
								visible = true;
								break;
							}
						}
						matrix[pitchLevel][yawLevel][dx + 25 + 1][dz + 25 + 1] = visible;
					}
				}
			}
		}
		for (int pitchlevel = 0; pitchlevel < 8; pitchlevel++) {
			for (int yawLevel = 0; yawLevel < 32; yawLevel++) {
				for (int x = -25; x < 25; x++) {
					for (int z = -25; z < 25; z++) {
						@Pc(137) boolean visible = false;
						check_areas:
						for (int dx = -1; dx <= 1; dx++) {
							for (int dz = -1; dz <= 1; dz++) {
								if (matrix[pitchlevel][yawLevel][x + dx + 25 + 1][z + dz + 25 + 1]) {
									visible = true;
									break check_areas;
								}
								if (matrix[pitchlevel][(yawLevel + 1) % 31][x + dx + 25 + 1][z + dz + 25 + 1]) {
									visible = true;
									break check_areas;
								}
								if (matrix[pitchlevel + 1][yawLevel][x + dx + 25 + 1][z + dz + 25 + 1]) {
									visible = true;
									break check_areas;
								}
								if (matrix[pitchlevel + 1][(yawLevel + 1) % 31][x + dx + 25 + 1][z + dz + 25 + 1]) {
									visible = true;
									break check_areas;
								}
							}
						}
						visibilityMap[pitchlevel][yawLevel][x + 25][z + 25] = visible;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(III)Z")
	private static boolean testPoint(@OriginalArg(0) int x, @OriginalArg(1) int y, @OriginalArg(2) int z) {
		@Pc(9) int px = z * sinEyeYaw + x * cosEyeYaw >> 16;
		@Pc(19) int tmp = z * cosEyeYaw - x * sinEyeYaw >> 16;
		@Pc(29) int pz = y * sinEyePitch + tmp * cosEyePitch >> 16;
		@Pc(39) int py = y * cosEyePitch - tmp * sinEyePitch >> 16;
		if (pz >= 50 && pz <= 3500) {
			@Pc(55) int viewportX = viewportCenterX + (px << 9) / pz;
			@Pc(63) int viewportY = viewportCenterY + (py << 9) / pz;
			return viewportX >= viewportLeft && viewportX <= viewportRight && viewportY >= viewportTop && viewportY <= viewportBottom;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	public static void method1431() {
		aClass37Array3 = null;
		WALL_DECORATION_INSET_X = null;
		WALL_DECORATION_INSET_Z = null;
		WALL_DECORATION_OUTSET_X = null;
		WALL_DECORATION_OUTSET_Z = null;
		levelOccluderCount = null;
		levelOccluders = null;
		aClass54Array1 = null;
		aClass44_6 = null;
		FRONT_WALL_TYPES = null;
		DIRECTION_ALLOW_WALL_CORNER_TYPE = null;
		BACK_WALL_TYPES = null;
		WALL_CORNER_TYPE_16_BLOCK_LOC_SPANS = null;
		WALL_CORNER_TYPE_32_BLOCK_LOC_SPANS = null;
		WALL_CORNER_TYPE_64_BLOCK_LOC_SPANS = null;
		WALL_CORNER_TYPE_128_BLOCK_LOC_SPANS = null;
		visibilityMap = null;
		aBooleanArrayArray1 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1433(@OriginalArg(0) int level, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Occluder occluder = new Occluder();
		occluder.anInt2070 = arg2 / 128;
		occluder.anInt2072 = arg3 / 128;
		occluder.anInt2069 = arg4 / 128;
		occluder.anInt2071 = arg5 / 128;
		occluder.anInt2089 = arg1;
		occluder.anInt2074 = arg2;
		occluder.anInt2084 = arg3;
		occluder.anInt2076 = arg4;
		occluder.anInt2088 = arg5;
		occluder.anInt2090 = arg6;
		occluder.anInt2086 = arg7;
		levelOccluders[level][levelOccluderCount[level]++] = occluder;
	}
}

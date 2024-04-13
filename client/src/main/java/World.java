import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class World {

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[[[B")
    public static byte[][][] levelTileOverlayRotation;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[[[B")
    public static byte[][][] levelTileOverlayIds;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "[I")
    public static int[] blendMagnitude;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    public static int[] blendChroma;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "[[[B")
    public static byte[][][] levelTileOverlayShape;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "[[[B")
    public static byte[][][] levelTileUnderlayIds;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "[I")
    public static int[] blendLightness;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[[[B")
    public static byte[][][] levelShademap;

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "[I")
    public static int[] blendSaturation;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "[[[I")
    public static int[][][] levelOccludemap;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[[I")
    public static int[][] levelLightmap;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int anInt807 = 99;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
    public static int[] blendLuminance;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
    public static int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
    public static int randomLightnessOffset = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int randomHueOffset = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
    public static int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "[I")
    public static int[] WALL_DECORATION_ROTATION_FORWARD_Z = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[I")
    public static int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };
    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[[[I")
    public static int[][][] levelHeightmap = new int[4][105][105];

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILclient!fb;ILclient!sd;BIII)V", line = 6)
    public static void addLoc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) CollisionMap arg3, @OriginalArg(4) int arg4, @OriginalArg(5) World3D arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
        @Pc(13) int local13 = levelHeightmap[arg0][arg8][arg1];
        @Pc(23) int local23 = levelHeightmap[arg0][arg8 + 1][arg1];
        @Pc(35) int local35 = levelHeightmap[arg0][arg8 + 1][arg1 + 1];
        @Pc(45) int local45 = levelHeightmap[arg0][arg8][arg1 + 1];
        @Pc(55) int local55 = local45 + local35 + local13 + local23 >> 2;
        @Pc(59) LocType local59 = LocType.get(arg4);
        @Pc(65) int local65 = (arg6 << 6) + arg2;
        @Pc(77) int local77 = (arg1 << 7) + arg8 + (arg4 << 14) + 0x40000000;
        if (local59.active == 0) {
            local77 += Integer.MIN_VALUE;
        }
        if (local59.anInt1030 == 1) {
            local65 += 256;
        }
        @Pc(118) Entity local118;
        if (arg2 == 22) {
            if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                local118 = local59.method765(arg6, local23, local45, local13, 22, local35);
            } else {
                local118 = new LocEntity(arg4, 22, arg6, local13, local23, local35, local45, local59.anInt1048, true);
            }
            arg5.method1416(arg7, arg8, arg1, local55, local118, local77, local65);
            if (local59.blockwalk && local59.active == 1) {
                arg3.method536(arg1, arg8);
            }
            return;
        }
        @Pc(213) int local213;
        if (arg2 == 10 || arg2 == 11) {
            if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                local118 = local59.method765(arg6, local23, local45, local13, 10, local35);
            } else {
                local118 = new LocEntity(arg4, 10, arg6, local13, local23, local35, local45, local59.anInt1048, true);
            }
            if (local118 != null) {
                @Pc(198) int local198 = 0;
                if (arg2 == 11) {
                    local198 += 256;
                }
                @Pc(216) int local216;
                if (arg6 == 1 || arg6 == 3) {
                    local213 = local59.anInt1040;
                    local216 = local59.anInt1036;
                } else {
                    local213 = local59.anInt1036;
                    local216 = local59.anInt1040;
                }
                arg5.method1410(arg7, arg8, arg1, local55, local213, local216, local118, local198, local77, local65);
            }
            if (local59.blockwalk) {
                arg3.method531(local59.anInt1040, local59.blockrange, arg8, arg6, arg1, local59.anInt1036);
            }
        } else if (arg2 >= 12) {
            if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                local118 = local59.method765(arg6, local23, local45, local13, arg2, local35);
            } else {
                local118 = new LocEntity(arg4, arg2, arg6, local13, local23, local35, local45, local59.anInt1048, true);
            }
            arg5.method1410(arg7, arg8, arg1, local55, 1, 1, local118, 0, local77, local65);
            if (local59.blockwalk) {
                arg3.method531(local59.anInt1040, local59.blockrange, arg8, arg6, arg1, local59.anInt1036);
            }
        } else if (arg2 == 0) {
            if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                local118 = local59.method765(arg6, local23, local45, local13, 0, local35);
            } else {
                local118 = new LocEntity(arg4, 0, arg6, local13, local23, local35, local45, local59.anInt1048, true);
            }
            arg5.method1440(arg7, arg8, arg1, local55, local118, null, ROTATION_WALL_TYPE[arg6], 0, local77, local65);
            if (local59.blockwalk) {
                arg3.addWall(local59.blockrange, arg6, arg1, arg8, arg2);
            }
        } else if (arg2 == 1) {
            if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                local118 = local59.method765(arg6, local23, local45, local13, 1, local35);
            } else {
                local118 = new LocEntity(arg4, 1, arg6, local13, local23, local35, local45, local59.anInt1048, true);
            }
            arg5.method1440(arg7, arg8, arg1, local55, local118, null, ROTATION_WALL_CORNER_TYPE[arg6], 0, local77, local65);
            if (local59.blockwalk) {
                arg3.addWall(local59.blockrange, arg6, arg1, arg8, arg2);
            }
        } else {
            @Pc(468) int local468;
            @Pc(500) Entity local500;
            if (arg2 == 2) {
                local468 = arg6 + 1 & 0x3;
                @Pc(490) Entity local490;
                if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                    local490 = local59.method765(arg6 + 4, local23, local45, local13, 2, local35);
                    local500 = local59.method765(local468, local23, local45, local13, 2, local35);
                } else {
                    local490 = new LocEntity(arg4, 2, arg6 + 4, local13, local23, local35, local45, local59.anInt1048, true);
                    local500 = new LocEntity(arg4, 2, local468, local13, local23, local35, local45, local59.anInt1048, true);
                }
                arg5.method1440(arg7, arg8, arg1, local55, local490, local500, ROTATION_WALL_TYPE[arg6], ROTATION_WALL_TYPE[local468], local77, local65);
                if (local59.blockwalk) {
                    arg3.addWall(local59.blockrange, arg6, arg1, arg8, arg2);
                }
            } else if (arg2 == 3) {
                if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                    local118 = local59.method765(arg6, local23, local45, local13, 3, local35);
                } else {
                    local118 = new LocEntity(arg4, 3, arg6, local13, local23, local35, local45, local59.anInt1048, true);
                }
                arg5.method1440(arg7, arg8, arg1, local55, local118, null, ROTATION_WALL_CORNER_TYPE[arg6], 0, local77, local65);
                if (local59.blockwalk) {
                    arg3.addWall(local59.blockrange, arg6, arg1, arg8, arg2);
                }
            } else if (arg2 == 9) {
                if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                    local118 = local59.method765(arg6, local23, local45, local13, arg2, local35);
                } else {
                    local118 = new LocEntity(arg4, arg2, arg6, local13, local23, local35, local45, local59.anInt1048, true);
                }
                arg5.method1410(arg7, arg8, arg1, local55, 1, 1, local118, 0, local77, local65);
                if (local59.blockwalk) {
                    arg3.method531(local59.anInt1040, local59.blockrange, arg8, arg6, arg1, local59.anInt1036);
                }
            } else {
                if (local59.aBoolean84) {
                    if (arg6 == 1) {
                        local468 = local45;
                        local45 = local35;
                        local35 = local23;
                        local23 = local13;
                        local13 = local468;
                    } else if (arg6 == 2) {
                        local468 = local45;
                        local45 = local23;
                        local23 = local468;
                        local468 = local35;
                        local35 = local13;
                        local13 = local468;
                    } else if (arg6 == 3) {
                        local468 = local45;
                        local45 = local13;
                        local13 = local23;
                        local23 = local35;
                        local35 = local468;
                    }
                }
                if (arg2 == 4) {
                    if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                        local118 = local59.method765(0, local23, local45, local13, 4, local35);
                    } else {
                        local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
                    }
                    arg5.method1446(arg7, arg8, arg1, local55, local118, ROTATION_WALL_TYPE[arg6], arg6 * 512, 0, 0, local77, local65);
                } else if (arg2 == 5) {
                    local213 = arg5.method1459(arg7, arg8, arg1);
                    local468 = 16;
                    if (local213 > 0) {
                        local468 = LocType.get(local213 >> 14 & 0x7FFF).wallwidth;
                    }
                    if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                        local500 = local59.method765(0, local23, local45, local13, 4, local35);
                    } else {
                        local500 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
                    }
                    arg5.method1446(arg7, arg8, arg1, local55, local500, ROTATION_WALL_TYPE[arg6], arg6 * 512, WALL_DECORATION_ROTATION_FORWARD_X[arg6] * local468, local468 * WALL_DECORATION_ROTATION_FORWARD_Z[arg6], local77, local65);
                } else if (arg2 == 6) {
                    if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                        local118 = local59.method765(0, local23, local45, local13, 4, local35);
                    } else {
                        local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
                    }
                    arg5.method1446(arg7, arg8, arg1, local55, local118, 256, arg6, 0, 0, local77, local65);
                } else if (arg2 == 7) {
                    if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                        local118 = local59.method765(0, local23, local45, local13, 4, local35);
                    } else {
                        local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
                    }
                    arg5.method1446(arg7, arg8, arg1, local55, local118, 512, arg6, 0, 0, local77, local65);
                } else if (arg2 == 8) {
                    if (local59.anInt1048 == -1 && local59.anIntArray210 == null) {
                        local118 = local59.method765(0, local23, local45, local13, 4, local35);
                    } else {
                        local118 = new LocEntity(arg4, 4, 0, local13, local23, local35, local45, local59.anInt1048, true);
                    }
                    arg5.method1446(arg7, arg8, arg1, local55, local118, 768, arg6, 0, 0, local77, local65);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 65)
    public static void create() {
        levelTileOverlayRotation = new byte[4][104][104];
        levelTileOverlayIds = new byte[4][104][104];
        blendMagnitude = new int[104];
        blendChroma = new int[104];
        levelTileOverlayShape = new byte[4][104][104];
        levelTileUnderlayIds = new byte[4][104][104];
        blendLightness = new int[104];
        levelShademap = new byte[4][105][105];
        blendSaturation = new int[104];
        levelOccludemap = new int[4][105][105];
        levelLightmap = new int[105][105];
        anInt807 = 99;
        blendLuminance = new int[104];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBLclient!fb;IILclient!sd;I)V", line = 621)
    public static void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) CollisionMap collision, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) World3D arg6, @OriginalArg(8) int arg7) {
        if (client.lowMemory && (client.levelTileFlags[0][arg2][arg7] & 0x2) == 0) {
            if ((client.levelTileFlags[arg0][arg2][arg7] & 0x10) != 0) {
                return;
            }
            if (Static44.getDrawLevel(arg7, arg2, arg0) != Static1.anInt786) {
                return;
            }
        }
        if (anInt807 > arg0) {
            anInt807 = arg0;
        }
        @Pc(57) int local57 = levelHeightmap[arg0][arg2 + 1][arg7];
        @Pc(65) int local65 = levelHeightmap[arg0][arg2][arg7];
        @Pc(77) int local77 = levelHeightmap[arg0][arg2 + 1][arg7 + 1];
        @Pc(87) int local87 = levelHeightmap[arg0][arg2][arg7 + 1];
        @Pc(91) LocType loc = LocType.get(arg1);
        @Pc(102) int local102 = local87 + local57 + local65 + local77 >> 2;
        @Pc(109) int local109 = (arg4 << 6) + arg5;
        @Pc(121) int local121 = (arg1 << 14) + arg2 + (arg7 << 7) + 0x40000000;
        if (loc.active == 0) {
            local121 += Integer.MIN_VALUE;
        }
        if (loc.anInt1030 == 1) {
            local109 += 256;
        }
        @Pc(167) Entity local167;
        if (arg5 != 22) {
            @Pc(267) int local267;
            if (arg5 == 10 || arg5 == 11) {
                if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                    local167 = loc.method765(arg4, local57, local87, local65, 10, local77);
                } else {
                    local167 = new LocEntity(arg1, 10, arg4, local65, local57, local77, local87, loc.anInt1048, true);
                }
                if (local167 != null) {
                    @Pc(264) int local264;
                    if (arg4 == 1 || arg4 == 3) {
                        local264 = loc.anInt1036;
                        local267 = loc.anInt1040;
                    } else {
                        local264 = loc.anInt1040;
                        local267 = loc.anInt1036;
                    }
                    @Pc(277) int local277 = 0;
                    if (arg5 == 11) {
                        local277 += 256;
                    }
                    if (arg6.method1410(arg0, arg2, arg7, local102, local267, local264, local167, local277, local121, local109) && loc.shadow) {
                        @Pc(303) Model local303;
                        if (local167 instanceof Model) {
                            local303 = (Model) local167;
                        } else {
                            local303 = loc.method765(arg4, local57, local87, local65, 10, local77);
                        }
                        if (local303 != null) {
                            for (@Pc(319) int local319 = 0; local319 <= local267; local319++) {
                                for (@Pc(323) int local323 = 0; local323 <= local264; local323++) {
                                    @Pc(330) int local330 = local303.method1141() / 4;
                                    if (local330 > 30) {
                                        local330 = 30;
                                    }
                                    if (levelShademap[arg0][local319 + arg2][arg7 + local323] < local330) {
                                        levelShademap[arg0][arg2 + local319][arg7 + local323] = (byte) local330;
                                    }
                                }
                            }
                        }
                    }
                }
                if (loc.blockwalk && collision != null) {
                    collision.method531(loc.anInt1040, loc.blockrange, arg2, arg4, arg7, loc.anInt1036);
                }
            } else if (arg5 >= 12) {
                if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                    local167 = loc.method765(arg4, local57, local87, local65, arg5, local77);
                } else {
                    local167 = new LocEntity(arg1, arg5, arg4, local65, local57, local77, local87, loc.anInt1048, true);
                }
                arg6.method1410(arg0, arg2, arg7, local102, 1, 1, local167, 0, local121, local109);
                if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                    levelOccludemap[arg0][arg2][arg7] |= 0x924;
                }
                if (loc.blockwalk && collision != null) {
                    collision.method531(loc.anInt1040, loc.blockrange, arg2, arg4, arg7, loc.anInt1036);
                }
            } else if (arg5 == 0) {
                if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                    local167 = loc.method765(arg4, local57, local87, local65, 0, local77);
                } else {
                    local167 = new LocEntity(arg1, 0, arg4, local65, local57, local77, local87, loc.anInt1048, true);
                }
                arg6.method1440(arg0, arg2, arg7, local102, local167, null, ROTATION_WALL_TYPE[arg4], 0, local121, local109);
                if (arg4 == 0) {
                    if (loc.shadow) {
                        levelShademap[arg0][arg2][arg7] = 50;
                        levelShademap[arg0][arg2][arg7 + 1] = 50;
                    }
                    if (loc.occlude) {
                        levelOccludemap[arg0][arg2][arg7] |= 0x249;
                    }
                } else if (arg4 == 1) {
                    if (loc.shadow) {
                        levelShademap[arg0][arg2][arg7 + 1] = 50;
                        levelShademap[arg0][arg2 + 1][arg7 + 1] = 50;
                    }
                    if (loc.occlude) {
                        levelOccludemap[arg0][arg2][arg7 + 1] |= 0x492;
                    }
                } else if (arg4 == 2) {
                    if (loc.shadow) {
                        levelShademap[arg0][arg2 + 1][arg7] = 50;
                        levelShademap[arg0][arg2 + 1][arg7 + 1] = 50;
                    }
                    if (loc.occlude) {
                        levelOccludemap[arg0][arg2 + 1][arg7] |= 0x249;
                    }
                } else if (arg4 == 3) {
                    if (loc.shadow) {
                        levelShademap[arg0][arg2][arg7] = 50;
                        levelShademap[arg0][arg2 + 1][arg7] = 50;
                    }
                    if (loc.occlude) {
                        levelOccludemap[arg0][arg2][arg7] |= 0x492;
                    }
                }
                if (loc.blockwalk && collision != null) {
                    collision.addWall(loc.blockrange, arg4, arg7, arg2, arg5);
                }
                if (loc.wallwidth != 16) {
                    arg6.method1411(arg0, arg2, arg7, loc.wallwidth);
                }
            } else if (arg5 == 1) {
                if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                    local167 = loc.method765(arg4, local57, local87, local65, 1, local77);
                } else {
                    local167 = new LocEntity(arg1, 1, arg4, local65, local57, local77, local87, loc.anInt1048, true);
                }
                arg6.method1440(arg0, arg2, arg7, local102, local167, null, ROTATION_WALL_CORNER_TYPE[arg4], 0, local121, local109);
                if (loc.shadow) {
                    if (arg4 == 0) {
                        levelShademap[arg0][arg2][arg7 + 1] = 50;
                    } else if (arg4 == 1) {
                        levelShademap[arg0][arg2 + 1][arg7 + 1] = 50;
                    } else if (arg4 == 2) {
                        levelShademap[arg0][arg2 + 1][arg7] = 50;
                    } else if (arg4 == 3) {
                        levelShademap[arg0][arg2][arg7] = 50;
                    }
                }
                if (loc.blockwalk && collision != null) {
                    collision.addWall(loc.blockrange, arg4, arg7, arg2, arg5);
                }
            } else {
                @Pc(912) int local912;
                @Pc(942) Entity local942;
                if (arg5 == 2) {
                    local912 = arg4 + 1 & 0x3;
                    @Pc(932) Entity local932;
                    if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                        local932 = loc.method765(arg4 + 4, local57, local87, local65, 2, local77);
                        local942 = loc.method765(local912, local57, local87, local65, 2, local77);
                    } else {
                        local932 = new LocEntity(arg1, 2, arg4 + 4, local65, local57, local77, local87, loc.anInt1048, true);
                        local942 = new LocEntity(arg1, 2, local912, local65, local57, local77, local87, loc.anInt1048, true);
                    }
                    arg6.method1440(arg0, arg2, arg7, local102, local932, local942, ROTATION_WALL_TYPE[arg4], ROTATION_WALL_TYPE[local912], local121, local109);
                    if (loc.occlude) {
                        if (arg4 == 0) {
                            levelOccludemap[arg0][arg2][arg7] |= 0x249;
                            levelOccludemap[arg0][arg2][arg7 + 1] |= 0x492;
                        } else if (arg4 == 1) {
                            levelOccludemap[arg0][arg2][arg7 + 1] |= 0x492;
                            levelOccludemap[arg0][arg2 + 1][arg7] |= 0x249;
                        } else if (arg4 == 2) {
                            levelOccludemap[arg0][arg2 + 1][arg7] |= 0x249;
                            levelOccludemap[arg0][arg2][arg7] |= 0x492;
                        } else if (arg4 == 3) {
                            levelOccludemap[arg0][arg2][arg7] |= 0x492;
                            levelOccludemap[arg0][arg2][arg7] |= 0x249;
                        }
                    }
                    if (loc.blockwalk && collision != null) {
                        collision.addWall(loc.blockrange, arg4, arg7, arg2, arg5);
                    }
                    if (loc.wallwidth != 16) {
                        arg6.method1411(arg0, arg2, arg7, loc.wallwidth);
                    }
                } else if (arg5 == 3) {
                    if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                        local167 = loc.method765(arg4, local57, local87, local65, 3, local77);
                    } else {
                        local167 = new LocEntity(arg1, 3, arg4, local65, local57, local77, local87, loc.anInt1048, true);
                    }
                    arg6.method1440(arg0, arg2, arg7, local102, local167, null, ROTATION_WALL_CORNER_TYPE[arg4], 0, local121, local109);
                    if (loc.shadow) {
                        if (arg4 == 0) {
                            levelShademap[arg0][arg2][arg7 + 1] = 50;
                        } else if (arg4 == 1) {
                            levelShademap[arg0][arg2 + 1][arg7 + 1] = 50;
                        } else if (arg4 == 2) {
                            levelShademap[arg0][arg2 + 1][arg7] = 50;
                        } else if (arg4 == 3) {
                            levelShademap[arg0][arg2][arg7] = 50;
                        }
                    }
                    if (loc.blockwalk && collision != null) {
                        collision.addWall(loc.blockrange, arg4, arg7, arg2, arg5);
                    }
                } else if (arg5 == 9) {
                    if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                        local167 = loc.method765(arg4, local57, local87, local65, arg5, local77);
                    } else {
                        local167 = new LocEntity(arg1, arg5, arg4, local65, local57, local77, local87, loc.anInt1048, true);
                    }
                    arg6.method1410(arg0, arg2, arg7, local102, 1, 1, local167, 0, local121, local109);
                    if (loc.blockwalk && collision != null) {
                        collision.method531(loc.anInt1040, loc.blockrange, arg2, arg4, arg7, loc.anInt1036);
                    }
                } else {
                    if (loc.aBoolean84) {
                        if (arg4 == 1) {
                            local912 = local87;
                            local87 = local77;
                            local77 = local57;
                            local57 = local65;
                            local65 = local912;
                        } else if (arg4 == 2) {
                            local912 = local87;
                            local87 = local57;
                            local57 = local912;
                            local912 = local77;
                            local77 = local65;
                            local65 = local912;
                        } else if (arg4 == 3) {
                            local912 = local87;
                            local87 = local65;
                            local65 = local57;
                            local57 = local77;
                            local77 = local912;
                        }
                    }
                    if (arg5 == 4) {
                        if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                            local167 = loc.method765(0, local57, local87, local65, 4, local77);
                        } else {
                            local167 = new LocEntity(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
                        }
                        arg6.method1446(arg0, arg2, arg7, local102, local167, ROTATION_WALL_TYPE[arg4], arg4 * 512, 0, 0, local121, local109);
                    } else if (arg5 == 5) {
                        local912 = 16;
                        local267 = arg6.method1459(arg0, arg2, arg7);
                        if (local267 > 0) {
                            local912 = LocType.get(local267 >> 14 & 0x7FFF).wallwidth;
                        }
                        if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                            local942 = loc.method765(0, local57, local87, local65, 4, local77);
                        } else {
                            local942 = new LocEntity(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
                        }
                        arg6.method1446(arg0, arg2, arg7, local102, local942, ROTATION_WALL_TYPE[arg4], arg4 * 512, WALL_DECORATION_ROTATION_FORWARD_X[arg4] * local912, WALL_DECORATION_ROTATION_FORWARD_Z[arg4] * local912, local121, local109);
                    } else if (arg5 == 6) {
                        if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                            local167 = loc.method765(0, local57, local87, local65, 4, local77);
                        } else {
                            local167 = new LocEntity(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
                        }
                        arg6.method1446(arg0, arg2, arg7, local102, local167, 256, arg4, 0, 0, local121, local109);
                    } else if (arg5 == 7) {
                        if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                            local167 = loc.method765(0, local57, local87, local65, 4, local77);
                        } else {
                            local167 = new LocEntity(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
                        }
                        arg6.method1446(arg0, arg2, arg7, local102, local167, 512, arg4, 0, 0, local121, local109);
                    } else if (arg5 == 8) {
                        if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                            local167 = loc.method765(0, local57, local87, local65, 4, local77);
                        } else {
                            local167 = new LocEntity(arg1, 4, 0, local65, local57, local77, local87, loc.anInt1048, true);
                        }
                        arg6.method1446(arg0, arg2, arg7, local102, local167, 768, arg4, 0, 0, local121, local109);
                    }
                }
            }
        } else if (!client.lowMemory || loc.active != 0 || loc.aBoolean76) {
            if (loc.anInt1048 == -1 && loc.anIntArray210 == null) {
                local167 = loc.method765(arg4, local57, local87, local65, 22, local77);
            } else {
                local167 = new LocEntity(arg1, 22, arg4, local65, local57, local77, local87, loc.anInt1048, true);
            }
            arg6.method1416(arg0, arg2, arg7, local102, local167, local121, local109);
            if (loc.blockwalk && loc.active == 1 && collision != null) {
                collision.method536(arg7, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([Lclient!fb;Lclient!sd;I)V", line = 171)
    public static void method503(@OriginalArg(0) CollisionMap[] arg0, @OriginalArg(1) World3D arg1) {
        @Pc(15) int local15;
        @Pc(19) int local19;
        @Pc(36) int local36;
        for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
            for (local15 = 0; local15 < 104; local15++) {
                for (local19 = 0; local19 < 104; local19++) {
                    if ((client.levelTileFlags[local11][local15][local19] & 0x1) == 1) {
                        local36 = local11;
                        if ((client.levelTileFlags[1][local15][local19] & 0x2) == 2) {
                            local36 = local11 - 1;
                        }
                        if (local36 >= 0) {
                            arg0[local36].method536(local19, local15);
                        }
                    }
                }
            }
        }
        randomLightnessOffset += (int) (Math.random() * 5.0D) - 2;
        if (randomLightnessOffset < -16) {
            randomLightnessOffset = -16;
        }
        randomHueOffset += (int) (Math.random() * 5.0D) - 2;
        if (randomHueOffset < -8) {
            randomHueOffset = -8;
        }
        if (randomLightnessOffset > 16) {
            randomLightnessOffset = 16;
        }
        if (randomHueOffset > 8) {
            randomHueOffset = 8;
        }
        @Pc(138) int local138;
        @Pc(140) int local140;
        @Pc(144) int local144;
        @Pc(166) int local166;
        @Pc(187) int local187;
        @Pc(200) int local200;
        @Pc(210) int local210;
        @Pc(204) int local204;
        @Pc(216) int local216;
        @Pc(233) int local233;
        @Pc(283) int local283;
        @Pc(510) int local510;
        @Pc(551) int local551;
        @Pc(664) int local664;
        @Pc(654) int local654;
        @Pc(689) int local689;
        for (local15 = 0; local15 < 4; local15++) {
            @Pc(128) byte[][] local128 = levelShademap[local15];
            local36 = (int) Math.sqrt(5100.0D);
            local138 = local36 * 768 >> 8;
            for (local140 = 1; local140 < 103; local140++) {
                for (local144 = 1; local144 < 103; local144++) {
                    local166 = levelHeightmap[local15][local144 + 1][local140] - levelHeightmap[local15][local144 - 1][local140];
                    local187 = levelHeightmap[local15][local144][local140 + 1] - levelHeightmap[local15][local144][local140 - 1];
                    local200 = (int) Math.sqrt((double) (local187 * local187 + local166 * local166 + 65536));
                    local204 = 65536 / local200;
                    local210 = (local166 << 8) / local200;
                    local216 = (local187 << 8) / local200;
                    local233 = (local204 * -10 + local210 * -50 + local216 * -50) / local138 + 96;
                    local283 = (local128[local144][local140 + 1] >> 3) + (local128[local144 - 1][local140] >> 2) + (local128[local144 - -1][local140] >> 3) + (local128[local144][local140 + -1] >> 2) + (local128[local144][local140] >> 1);
                    levelLightmap[local144][local140] = local233 - local283;
                }
            }
            for (local144 = 0; local144 < 104; local144++) {
                blendChroma[local144] = 0;
                blendSaturation[local144] = 0;
                blendLightness[local144] = 0;
                blendLuminance[local144] = 0;
                blendMagnitude[local144] = 0;
            }
            for (local166 = -5; local166 < 109; local166++) {
                for (local187 = 0; local187 < 104; local187++) {
                    local200 = local166 + 5;
                    @Pc(402) int debugMag;
                    if (local200 >= 0 && local200 < 104) {
                        local210 = levelTileUnderlayIds[local15][local200][local187] & 0xFF;
                        if (local210 > 0) {
                            @Pc(366) FloorUnderlayType local366 = FloorUnderlayType.get(local210 - 1);
                            blendChroma[local187] += local366.chroma;
                            blendSaturation[local187] += local366.saturation;
                            blendLightness[local187] += local366.lightness;
                            blendLuminance[local187] += local366.luminance;
                            debugMag = blendMagnitude[local187]++;
                        }
                    }
                    local210 = local166 - 5;
                    if (local210 >= 0 && local210 < 104) {
                        local204 = levelTileUnderlayIds[local15][local210][local187] & 0xFF;
                        if (local204 > 0) {
                            @Pc(437) FloorUnderlayType local437 = FloorUnderlayType.get(local204 - 1);
                            blendChroma[local187] -= local437.chroma;
                            blendSaturation[local187] -= local437.saturation;
                            blendLightness[local187] -= local437.lightness;
                            blendLuminance[local187] -= local437.luminance;
                            debugMag = blendMagnitude[local187]--;
                        }
                    }
                }
                if (local166 >= 1 && local166 < 103) {
                    local210 = 0;
                    local204 = 0;
                    local216 = 0;
                    local233 = 0;
                    local200 = 0;
                    for (local283 = -5; local283 < 109; local283++) {
                        local510 = local283 + 5;
                        if (local510 >= 0 && local510 < 104) {
                            local210 += blendSaturation[local510];
                            local233 += blendMagnitude[local510];
                            local216 += blendLuminance[local510];
                            local204 += blendLightness[local510];
                            local200 += blendChroma[local510];
                        }
                        local551 = local283 - 5;
                        if (local551 >= 0 && local551 < 104) {
                            local233 -= blendMagnitude[local551];
                            local204 -= blendLightness[local551];
                            local216 -= blendLuminance[local551];
                            local210 -= blendSaturation[local551];
                            local200 -= blendChroma[local551];
                        }
                        if (local283 >= 1 && local283 < 103 && (!client.lowMemory || (client.levelTileFlags[0][local166][local283] & 0x2) != 0 || (client.levelTileFlags[local15][local166][local283] & 0x10) == 0 && Static44.getDrawLevel(local283, local166, local15) == Static1.anInt786)) {
                            if (anInt807 > local15) {
                                anInt807 = local15;
                            }
                            local654 = levelTileOverlayIds[local15][local166][local283] & 0xFF;
                            local664 = levelTileUnderlayIds[local15][local166][local283] & 0xFF;
                            if (local664 > 0 || local654 > 0) {
                                @Pc(681) int local681 = levelHeightmap[local15][local166 + 1][local283];
                                local689 = levelHeightmap[local15][local166][local283];
                                @Pc(701) int local701 = levelHeightmap[local15][local166 + 1][local283 + 1];
                                @Pc(707) int local707 = levelLightmap[local166][local283];
                                @Pc(715) int local715 = levelLightmap[local166 + 1][local283];
                                @Pc(725) int local725 = levelHeightmap[local15][local166][local283 + 1];
                                @Pc(727) int local727 = -1;
                                @Pc(729) int local729 = -1;
                                @Pc(737) int local737 = levelLightmap[local166][local283 + 1];
                                @Pc(747) int local747 = levelLightmap[local166 + 1][local283 + 1];
                                @Pc(758) int local758;
                                @Pc(762) int local762;
                                if (local664 > 0) {
                                    local758 = local200 * 256 / local216;
                                    local762 = local210 / local233;
                                    @Pc(766) int local766 = local204 / local233;
                                    local727 = hsl24to16(local766, local762, local758);
                                    local766 += randomLightnessOffset;
                                    @Pc(782) int local782 = randomHueOffset + local758 & 0xFF;
                                    if (local766 < 0) {
                                        local766 = 0;
                                    } else if (local766 > 255) {
                                        local766 = 255;
                                    }
                                    local729 = hsl24to16(local766, local762, local782);
                                }
                                if (local15 > 0) {
                                    @Pc(806) boolean local806 = true;
                                    if (local664 == 0 && levelTileOverlayShape[local15][local166][local283] != 0) {
                                        local806 = false;
                                    }
                                    if (local654 > 0 && !FloorOverlayType.get(local654 - 1).occlude) {
                                        local806 = false;
                                    }
                                    if (local806 && local689 == local681 && local689 == local701 && local689 == local725) {
                                        levelOccludemap[local15][local166][local283] |= 0x924;
                                    }
                                }
                                local758 = 0;
                                if (local729 != -1) {
                                    local758 = Draw3D.palette[mulHSL(96, local729)];
                                }
                                if (local654 == 0) {
                                    arg1.setTile(local15, local166, local283, 0, 0, -1, local689, local681, local701, local725, mulHSL(local707, local727), mulHSL(local715, local727), mulHSL(local747, local727), mulHSL(local737, local727), 0, 0, 0, 0, local758, 0);
                                } else {
                                    local762 = levelTileOverlayShape[local15][local166][local283] + 1;
                                    @Pc(898) byte local898 = levelTileOverlayRotation[local15][local166][local283];
                                    @Pc(904) FloorOverlayType local904 = FloorOverlayType.get(local654 - 1);
                                    @Pc(907) int local907 = local904.texture;
                                    @Pc(911) int local911;
                                    @Pc(916) int local916;
                                    @Pc(938) int local938;
                                    @Pc(943) int local943;
                                    if (local907 >= 0) {
                                        local911 = -1;
                                        local916 = Draw3D.getProvider.getAverageTextureRGB(local907);
                                    } else if (local904.rgb == 0xff00ff) {
                                        local916 = -2;
                                        local907 = -1;
                                        local911 = -2;
                                    } else {
                                        local911 = hsl24to16(local904.lightness, local904.saturation, local904.hue);
                                        local938 = randomHueOffset + local904.hue & 0xFF;
                                        local943 = local904.lightness + randomLightnessOffset;
                                        if (local943 < 0) {
                                            local943 = 0;
                                        } else if (local943 > 255) {
                                            local943 = 255;
                                        }
                                        local916 = hsl24to16(local943, local904.saturation, local938);
                                    }
                                    local938 = 0;
                                    if (local916 != -2) {
                                        local938 = Draw3D.palette[Static66.method1193(local916, 96)];
                                    }
                                    if (local904.averageColour != -1) {
                                        local943 = local904.averageHue + randomHueOffset & 0xFF;
                                        @Pc(1001) int local1001 = local904.averageLightness + randomLightnessOffset;
                                        if (local1001 < 0) {
                                            local1001 = 0;
                                        } else if (local1001 > 255) {
                                            local1001 = 255;
                                        }
                                        local916 = hsl24to16(local1001, local904.averageSaturation, local943);
                                        local938 = Draw3D.palette[Static66.method1193(local916, 96)];
                                    }
                                    arg1.setTile(local15, local166, local283, local762, local898, local907, local689, local681, local701, local725, mulHSL(local707, local727), mulHSL(local715, local727), mulHSL(local747, local727), mulHSL(local737, local727), Static66.method1193(local911, local707), Static66.method1193(local911, local715), Static66.method1193(local911, local747), Static66.method1193(local911, local737), local758, local938);
                                }
                            }
                        }
                    }
                }
            }
            for (local187 = 1; local187 < 103; local187++) {
                for (local200 = 1; local200 < 103; local200++) {
                    arg1.method1418(local15, local200, local187, Static44.getDrawLevel(local187, local200, local15));
                }
            }
            levelTileUnderlayIds[local15] = null;
            levelTileOverlayIds[local15] = null;
            levelTileOverlayShape[local15] = null;
            levelTileOverlayRotation[local15] = null;
            levelShademap[local15] = null;
        }
        arg1.method1434();
        for (local19 = 0; local19 < 104; local19++) {
            for (local36 = 0; local36 < 104; local36++) {
                if ((client.levelTileFlags[1][local19][local36] & 0x2) == 2) {
                    arg1.method1453(local19, local36);
                }
            }
        }
        local138 = 2;
        local36 = 1;
        local140 = 4;
        for (local144 = 0; local144 < 4; local144++) {
            if (local144 > 0) {
                local140 <<= 0x3;
                local36 <<= 0x3;
                local138 <<= 0x3;
            }
            for (local166 = 0; local166 <= local144; local166++) {
                for (local187 = 0; local187 <= 104; local187++) {
                    for (local200 = 0; local200 <= 104; local200++) {
                        if ((levelOccludemap[local166][local200][local187] & local36) != 0) {
                            for (local204 = local187; local204 < 104 && (local36 & levelOccludemap[local166][local200][local204 + 1]) != 0; local204++) {
                            }
                            local210 = local187;
                            local216 = local166;
                            local233 = local166;
                            while (local210 > 0 && (local36 & levelOccludemap[local166][local200][local210 - 1]) != 0) {
                                local210--;
                            }
                            label347: while (local216 > 0) {
                                for (local283 = local210; local283 <= local204; local283++) {
                                    if ((local36 & levelOccludemap[local216 - 1][local200][local283]) == 0) {
                                        break label347;
                                    }
                                }
                                local216--;
                            }
                            label336: while (local233 < local144) {
                                for (local283 = local210; local283 <= local204; local283++) {
                                    if ((local36 & levelOccludemap[local233 + 1][local200][local283]) == 0) {
                                        break label336;
                                    }
                                }
                                local233++;
                            }
                            local283 = (local233 + 1 - local216) * (local204 + 1 - local210);
                            if (local283 >= 8) {
                                local551 = levelHeightmap[local233][local200][local210] - 240;
                                local664 = levelHeightmap[local216][local200][local210];
                                World3D.method1433(local144, 1, local200 * 128, local200 * 128, local210 * 128, local204 * 128 + 128, local551, local664);
                                for (local654 = local216; local654 <= local233; local654++) {
                                    for (local689 = local210; local689 <= local204; local689++) {
                                        levelOccludemap[local654][local200][local689] &= ~local36;
                                    }
                                }
                            }
                        }
                        if ((levelOccludemap[local166][local200][local187] & local138) != 0) {
                            for (local210 = local200; local210 > 0 && (local138 & levelOccludemap[local166][local210 - 1][local187]) != 0; local210--) {
                            }
                            local204 = local200;
                            local216 = local166;
                            while (local204 < 104 && (local138 & levelOccludemap[local166][local204 + 1][local187]) != 0) {
                                local204++;
                            }
                            local233 = local166;
                            label401: while (local216 > 0) {
                                for (local283 = local210; local283 <= local204; local283++) {
                                    if ((levelOccludemap[local216 - 1][local283][local187] & local138) == 0) {
                                        break label401;
                                    }
                                }
                                local216--;
                            }
                            label390: while (local144 > local233) {
                                for (local283 = local210; local283 <= local204; local283++) {
                                    if ((levelOccludemap[local233 + 1][local283][local187] & local138) == 0) {
                                        break label390;
                                    }
                                }
                                local233++;
                            }
                            local283 = (local204 + 1 - local210) * ((local233 + 1) - local216);
                            if (local283 >= 8) {
                                local664 = levelHeightmap[local216][local210][local187];
                                local551 = levelHeightmap[local233][local210][local187] - 240;
                                World3D.method1433(local144, 2, local210 * 128, local204 * 128 + 128, local187 * 128, local187 * 128, local551, local664);
                                for (local654 = local216; local654 <= local233; local654++) {
                                    for (local689 = local210; local689 <= local204; local689++) {
                                        levelOccludemap[local654][local689][local187] &= ~local138;
                                    }
                                }
                            }
                        }
                        if ((local140 & levelOccludemap[local166][local200][local187]) != 0) {
                            local210 = local200;
                            local204 = local200;
                            local216 = local187;
                            for (local233 = local187; local233 < 104 && (levelOccludemap[local166][local200][local233 + 1] & local140) != 0; local233++) {
                            }
                            while (local216 > 0 && (levelOccludemap[local166][local200][local216 - 1] & local140) != 0) {
                                local216--;
                            }
                            label456: while (local210 > 0) {
                                for (local283 = local216; local283 <= local233; local283++) {
                                    if ((levelOccludemap[local166][local210 - 1][local283] & local140) == 0) {
                                        break label456;
                                    }
                                }
                                local210--;
                            }
                            label445: while (local204 < 104) {
                                for (local283 = local216; local283 <= local233; local283++) {
                                    if ((local140 & levelOccludemap[local166][local204 + 1][local283]) == 0) {
                                        break label445;
                                    }
                                }
                                local204++;
                            }
                            if ((local233 + 1 - local216) * (-local210 + (local204 - -1)) >= 4) {
                                local283 = levelHeightmap[local166][local210][local216];
                                World3D.method1433(local144, 4, local210 * 128, local204 * 128 + 128, local216 * 128, local233 * 128 + 128, local283, local283);
                                for (local510 = local210; local510 <= local204; local510++) {
                                    for (local551 = local216; local551 <= local233; local551++) {
                                        levelOccludemap[local166][local510][local551] &= ~local140;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I", line = 61)
    public static int mulHSL(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        if (arg1 == -1) {
            return 12345678;
        }
        arg0 = arg0 * (arg1 & 0x7F) / 128;
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0 + (arg1 & 0xFF80);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(III)I", line = 369)
    public static int noise(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(10) int local10 = arg0 + arg1 * 57;
        @Pc(16) int local16 = local10 ^ local10 << 13;
        @Pc(30) int local30 = Integer.MAX_VALUE & (local16 * local16 * 15731 + 789221) * local16 + 1376312589;
        return local30 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)I", line = 110)
    public static int smoothNoise(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
        @Pc(41) int local41 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 + -1) + noise(arg0 - 1, arg1 - -1) + noise(arg0 + 1, arg1 - -1);
        @Pc(74) int local74 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 + -1) + noise(arg0, arg1 + 1);
        @Pc(79) int local79 = noise(arg0, arg1);
        return local41 / 16 + local74 / 8 + local79 / 4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)I", line = 43)
    public static int interpolate(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
        @Pc(12) int local12 = 65536 - Draw3D.cos[arg0 * 1024 / arg2] >> 1;
        return ((65536 - local12) * arg1 >> 16) + (local12 * arg3 >> 16);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ)I", line = 38)
    public static int perlin(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
        @Pc(7) int local7 = arg1 / arg0;
        @Pc(13) int local13 = arg0 - 1 & arg1;
        @Pc(17) int local17 = arg2 / arg0;
        @Pc(23) int local23 = arg2 & arg0 - 1;
        @Pc(33) int local33 = smoothNoise(local7, local17);
        @Pc(40) int local40 = smoothNoise(local7 + 1, local17);
        @Pc(51) int local51 = smoothNoise(local7, local17 + 1);
        @Pc(60) int local60 = smoothNoise(local7 + 1, local17 + 1);
        @Pc(67) int local67 = interpolate(local13, local33, arg0, local40);
        @Pc(74) int local74 = interpolate(local13, local51, arg0, local60);
        return interpolate(local23, local67, arg0, local74);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)I", line = 38)
    public static int perlin(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
        @Pc(40) int local40 = perlin(4, arg1 + 45365, arg0 + 91923) + (perlin(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (perlin(1, arg1, arg0) + -128 >> 2) - 128;
        local40 = (int) ((double) local40 * 0.3D) + 35;
        if (local40 < 10) {
            local40 = 10;
        } else if (local40 > 60) {
            local40 = 60;
        }
        return local40;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I", line = 18)
    public static int getTopLevel() {
        @Pc(12) int local12 = 3;
        if (client.cameraPitch < 310) {
            @Pc(21) int local21 = client.cameraX >> 7;
            @Pc(25) int local25 = client.cameraZ >> 7;
            @Pc(30) int local30 = client.localPlayer.x >> 7;
            if ((client.levelTileFlags[client.currentLevel][local21][local25] & 0x4) != 0) {
                local12 = client.currentLevel;
            }
            @Pc(50) int local50 = client.localPlayer.z >> 7;
            @Pc(62) int local62;
            if (local30 > local21) {
                local62 = local30 - local21;
            } else {
                local62 = local21 - local30;
            }
            @Pc(77) int local77;
            if (local50 > local25) {
                local77 = local50 - local25;
            } else {
                local77 = local25 - local50;
            }
            @Pc(92) int local92;
            @Pc(94) int local94;
            if (local62 <= local77) {
                local92 = local62 * 65536 / local77;
                local94 = 32768;
                while (local50 != local25) {
                    if (local25 < local50) {
                        local25++;
                    } else if (local50 < local25) {
                        local25--;
                    }
                    if ((client.levelTileFlags[client.currentLevel][local21][local25] & 0x4) != 0) {
                        local12 = client.currentLevel;
                    }
                    local94 += local92;
                    if (local94 >= 65536) {
                        local94 -= 65536;
                        if (local21 < local30) {
                            local21++;
                        } else if (local21 > local30) {
                            local21--;
                        }
                        if ((client.levelTileFlags[client.currentLevel][local21][local25] & 0x4) != 0) {
                            local12 = client.currentLevel;
                        }
                    }
                }
            } else {
                local94 = 32768;
                local92 = local77 * 65536 / local62;
                while (local21 != local30) {
                    local94 += local92;
                    if (local21 < local30) {
                        local21++;
                    } else if (local30 < local21) {
                        local21--;
                    }
                    if ((client.levelTileFlags[client.currentLevel][local21][local25] & 0x4) != 0) {
                        local12 = client.currentLevel;
                    }
                    if (local94 >= 65536) {
                        if (local50 > local25) {
                            local25++;
                        } else if (local25 > local50) {
                            local25--;
                        }
                        if ((client.levelTileFlags[client.currentLevel][local21][local25] & 0x4) != 0) {
                            local12 = client.currentLevel;
                        }
                        local94 -= 65536;
                    }
                }
            }
        }
        if ((client.levelTileFlags[client.currentLevel][client.localPlayer.x >> 7][client.localPlayer.z >> 7] & 0x4) != 0) {
            local12 = client.currentLevel;
        }
        return local12;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)I", line = 30)
    public static int hsl24to16(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
        if (arg0 > 179) {
            arg1 /= 2;
        }
        if (arg0 > 192) {
            arg1 /= 2;
        }
        if (arg0 > 217) {
            arg1 /= 2;
        }
        if (arg0 > 243) {
            arg1 /= 2;
        }
        return arg0 / 2 + (arg1 / 32 << 7) + (arg2 / 4 << 10);
    }
}

import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!hc;")
	public static ClientStream stream;

	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "Lclient!wc;")
	public static PacketBit in = new PacketBit(5000);

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int packetType = 0;

	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	public static int packetSize = 0;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int idleNetCycles = 0;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int lastPacketType2 = 0;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public static int lastPacketType1 = 0;

	@OriginalMember(owner = "client!gb", name = "Lb", descriptor = "I")
	public static int lastPacketType0 = 0;

	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
	public static int worldId = 1;

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public static int modeWhat = 0;

	@OriginalMember(owner = "client!t", name = "m", descriptor = "I")
	public static int modeWhere = 0;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	public static boolean membersWorld;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public static int state = 0;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	public static int js5ConnectState = 0;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	public static int js5ErrorCount = 0;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!kc;")
	public static PlayerEntity localPlayer;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "[[[B")
	public static byte[][][] levelTileFlags = new byte[4][104][104];

	@OriginalMember(owner = "client!a", name = "k", descriptor = "I")
	public static int currentLevel;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
	public static int cameraPitch;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	public static int cameraX;

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
	public static int cameraZ;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int cameraY;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int cameraYaw;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
	public static int[] cameraModifierWobbleScale = new int[5];

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "[I")
	public static int[] cameraModifierWobbleSpeed = new int[5];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    public static int[] cameraModifierCycle = new int[5];

	@OriginalMember(owner = "client!e", name = "R", descriptor = "[I")
	public static int[] cameraModifierJitter = new int[5];

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "[I")
	public static int[] anIntArray416 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!sd;")
	public static World3D scene;

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Ljava/awt/Graphics;")
	public static Graphics graphics;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
	public static int sceneCycle = 0;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public static int cameraPitchClamp;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public static int npcCount = 0;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[Lclient!ua;")
	public static NpcEntity[] npcs = new NpcEntity[16384];

	@OriginalMember(owner = "client!mc", name = "eb", descriptor = "[I")
	public static int[] npcIds = new int[16384];

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[Lclient!kc;")
	public static PlayerEntity[] players = new PlayerEntity[2048];

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
	public static int[] playerIds = new int[2048];

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Z")
	public static boolean lowMemory = false;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public static int playerCount = 0;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public static int loopCycle = 0;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[[I")
	public static int[][] tileLastOccupiedCycle = new int[104][104];

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	public static int flagSceneTileX = 0;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public static int flagSceneTileZ = 0;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!wc;")
	public static PacketBit out = new PacketBit(5000);
	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	public static int idleTimeout = 0;
	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int systemUpdateTimer = 0;
	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public static int sceneDelta = 0;
	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public static int crossMode = 0;
	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	public static int crossCycle = 0;
	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public static int selectedArea = 0;
	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public static int selectedCycle = 0;
	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
	public static boolean redrawChatback = false;
	@OriginalMember(owner = "client!gb", name = "Gb", descriptor = "Z")
	public static boolean redrawSidebar = false;
	@OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
	public static int objDragArea = 0;
	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	public static int objDragCycles = 0;
	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public static int objGrabX;
	@OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
	public static int objGrabY = 0;
	@OriginalMember(owner = "client!o", name = "q", descriptor = "Z")
	public static boolean objGrabThreshold = false;
	@OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
	public static int mouseButton = 0;
	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public static int hoveredSlotParentId = 0;
	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int objDragInterfaceId = 0;
	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
	public static int mouseClickButton = 0;
	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!o;")
	public static JagString modalMessage = null;
	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[[I")
	public static int[][] bfsDirection = new int[104][104];
	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "[[I")
	public static int[][] bfsCost = new int[104][104];
	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[Lclient!fb;")
	public static CollisionMap[] levelCollisionMap = new CollisionMap[4];
	@OriginalMember(owner = "client!h", name = "l", descriptor = "[I")
	public static int[] bfsStepX = new int[4000];
	@OriginalMember(owner = "client!ec", name = "db", descriptor = "[I")
	public static int[] bfsStepZ = new int[4000];
	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public static int tryMoveNearest = 0;
	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Z")
	public static boolean cutscene = false;
	@OriginalMember(owner = "client!ke", name = "Cc", descriptor = "I")
	public static int dragCycles = 0;
	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	public static int cameraAnticheatOffsetX = 0;
	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	public static int cameraAnticheatOffsetZ = 0;
	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public static int oribtCameraZ;
	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public static int orbitCameraX;
	@OriginalMember(owner = "client!v", name = "P", descriptor = "[Z")
	public static boolean[] actionKey = new boolean[112];
	@OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
	public static int oribtCameraYawVelocity = 0;
	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int orbitCameraPitchVelocity = 0;
	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public static int orbitCameraPitch = 128;
	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int orbitCameraYaw = 0;
	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!o;")
	public static JagString socialInput = JagString.EMPTY_STRING;
	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
	public static boolean showSocialInput = false;
	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int socialAction = 0;
	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
	public static int friendCount = 0;
	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
	public static int anInt927 = 0;
	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[J")
	public static long[] friendName37 = new long[200];
	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[J")
	public static long[] ignoreName37 = new long[100];
	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
	public static int ignoreCount = 0;
	@OriginalMember(owner = "client!k", name = "x", descriptor = "[Lclient!o;")
	public static JagString[] friendName = new JagString[200];
	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[I")
	public static int[] friendWorld = new int[200];
	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	public static int stickyChatInterfaceId = -1;
	@OriginalMember(owner = "client!s", name = "r", descriptor = "I")
	public static int chatInterfaceId = -1;
	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	public static int[] messageType = new int[100];
	@OriginalMember(owner = "client!wc", name = "Pb", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array40 = new JagString[100];
	@OriginalMember(owner = "client!mc", name = "Eb", descriptor = "[Lclient!o;")
	public static JagString[] aClass40Array30 = new JagString[100];
	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public static int objSelected = 0;
	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
	public static int spellSelected = 0;
	@OriginalMember(owner = "client!db", name = "g", descriptor = "[Lclient!o;")
	public static JagString[] menuOption;
	@OriginalMember(owner = "client!kc", name = "Sc", descriptor = "[I")
	public static int[] menuAction = new int[500];
	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	public static int menuSize = 0;
	@OriginalMember(owner = "client!ke", name = "Xb", descriptor = "I")
	public static int cameraOffsetYawModifier = 1;
	@OriginalMember(owner = "client!o", name = "L", descriptor = "I")
	public static int anInt1779 = 2;
	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	public static int anInt667 = 2;
	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public static int cameraAnticheatAngle = 0;
	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	public static int heartbeatTimer = 0;
	@OriginalMember(owner = "client!u", name = "Bb", descriptor = "I")
	public static int baseX;
	@OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
	public static int sceneBaseTileX;
	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int sceneBaseTileZ;
	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public static int overrideChat = 0;
	@OriginalMember(owner = "client!ta", name = "e", descriptor = "[[[Lclient!od;")
	public static LinkList[][][] levelObjStacks = new LinkList[4][104][104];
	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!fc;")
	public static PixFont fondBold12;
	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!ad;")
	public static Js5 configJs5;
	@OriginalMember(owner = "client!kc", name = "cd", descriptor = "[Lclient!vb;")
	public static Pix24[] imageCrosses;
	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public static int viewportInterfaceId = -1;
	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Z")
	public static boolean menuVisible = false;
	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public static int menuArea;
	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	public static int anInt2585 = -1;
	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public static int anInt1554 = 0;
	@OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
	public static int anInt2465 = 0;
	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!fc;")
	public static PixFont fontPlain12;
	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!vb;")
	public static Pix24 aClass2_Sub2_Sub2_Sub4_7;
	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	public static int hintType = 0;
	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public static int projectX = -1;
	@OriginalMember(owner = "client!va", name = "i", descriptor = "[Lclient!vb;")
	public static Pix24[] aClass2_Sub2_Sub2_Sub4Array10;
	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public static int projectY = -1;
	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int hintHeight = 0;
	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	public static int hintOffsetX = 0;
	@OriginalMember(owner = "client!la", name = "rb", descriptor = "I")
	public static int hintOffsetY = 0;
	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int hintTileZ = 0;
	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int hintTileX = 0;
	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	public static int chatCount = 0;
	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public static int entityUpdateCount = 0;
	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int entityRemovalCount = 0;
	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public static int[] entityUpdateIds = new int[2048];
	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	public static int sidebarInterfaceId = -1;
	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
	public static int[] tabInterfaceId = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int selectedTab = 3;
	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!p;")
	public static PixMap areaSidebar;
	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ad;")
	public static Js5 animsJs5;
	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!ad;")
	public static Js5 basesJs5;
	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!ad;")
	public static Js5 interfacesJs5;
	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!ad;")
	public static Js5 synthSoundsJs5;
	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!ad;")
	public static Js5 texturesJs5;
	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!ad;")
	public static Js5 mapsJs5;
	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!ad;")
	public static Js5 midiSongsJs5;
	@OriginalMember(owner = "client!f", name = "O", descriptor = "Lclient!ad;")
	public static Js5 modelsJs5;
	@OriginalMember(owner = "client!ra", name = "l", descriptor = "Lclient!ad;")
	public static Js5 spritesJs5;
	@OriginalMember(owner = "client!r", name = "n", descriptor = "Lclient!ad;")
	public static Js5 binaryJs5;
	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!ad;")
	public static Js5 midiJinglesJs5;
	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public static int minimapAnticheatAngle = 0;
	@OriginalMember(owner = "client!d", name = "G", descriptor = "Lclient!qb;")
	public static Pix8 imageMapback;
	@OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
	public static int[] skillLevel = new int[25];
	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	public static int[] skillBaseLevel = new int[25];
	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[I")
	public static int[] skillExperience = new int[25];
	@OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
	public static int[] varps = new int[2000];
	@OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
	public static int[] levelExperience = new int[99];
	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[Z")
	public static boolean[] SKILL_ENABLED = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };
	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public static int energy = 0;
	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public static int weightCarried = 0;
	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public static int baseZ;
	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!hc;")
	public static ClientStream js5Stream;
	@OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
	public static int[] flameBuffer3;
	@OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
	public static int[] flameBuffer2;
	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public static int flameCycle0 = 0;
	@OriginalMember(owner = "client!cd", name = "s", descriptor = "[I")
	public static int[] flameBuffer0;
	@OriginalMember(owner = "client!jd", name = "W", descriptor = "[Lclient!qb;")
	public static Pix8[] imageRunes;
	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
	public static int[] flameLineOffset = new int[256];
	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	public static int flameGradientCycle0 = 0;
	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
	public static int flameGradientCycle1 = 0;
	@OriginalMember(owner = "client!ua", name = "ad", descriptor = "I")
	public static int anInt2341;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z", line = 163)
	public static boolean read() {
		if (stream == null) {
			return false;
		}
		@Pc(226) int local226;
		try {
			@Pc(13) int available = stream.available();
			if (available == 0) {
				return false;
			}
			if (packetType == -1) {
				available--;
				stream.read(0, 1, in.data);
				in.pos = 0;
				packetType = in.gIsaac1();
				packetSize = Static1.SERVER_PROT_LENGTHS[packetType];
			}
			if (packetSize == -1) {
				if (available <= 0) {
					return false;
				}
				stream.read(0, 1, in.data);
				packetSize = in.data[0] & 0xFF;
				available--;
			}
			if (packetSize == -2) {
				if (available <= 1) {
					return false;
				}
				stream.read(0, 2, in.data);
				available -= 2;
				in.pos = 0;
				packetSize = in.g2();
			}
			if (available < packetSize) {
				return false;
			}
			in.pos = 0;
			stream.read(0, packetSize, in.data);
			idleNetCycles = 0;
			lastPacketType2 = lastPacketType1;
			lastPacketType1 = lastPacketType0;
			lastPacketType0 = packetType;
			@Pc(125) int local125;
			if (packetType == 224) {
				local125 = in.g2_alt2();
				Static95.method1648(local125);
				if (sidebarInterfaceId != -1) {
					Static75.method1350(sidebarInterfaceId);
					sidebarInterfaceId = -1;
					redrawSidebar = true;
					Static1.aBoolean184 = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					setState(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (anInt2585 != -1) {
					Static75.method1350(anInt2585);
					anInt2585 = -1;
				}
				if (chatInterfaceId != local125) {
					Static75.method1350(chatInterfaceId);
					chatInterfaceId = local125;
				}
				Static1.aBoolean40 = false;
				redrawChatback = true;
				packetType = -1;
				return true;
			}
			if (packetType == 142) {
				baseX = in.g1();
				baseZ = in.g1_alt1();
				while (in.pos < packetSize) {
					packetType = in.g1();
					Static3.method26();
				}
				packetType = -1;
				return true;
			}
			@Pc(230) int local230;
			@Pc(234) ComType local234;
			if (packetType == 7) {
				local125 = in.g4s_alt2();
				local226 = in.g2_alt1();
				local230 = in.g2_alt1();
				local234 = ComType.get(local125);
				if (local230 == 65535) {
					packetType = -1;
					local234.anInt1607 = 0;
					return true;
				}
				@Pc(248) ObjType local248 = ObjType.method1669(local230);
				local234.anInt1607 = 4;
				local234.xan = local248.anInt952;
				packetType = -1;
				local234.zoom = local248.anInt926 * 100 / local226;
				local234.model = local230;
				local234.yan = local248.anInt918;
				return true;
			}
			if (packetType == 249) {
				Static1.anInt808 = in.g2_alt2();
				packetType = -1;
				return true;
			}
			if (packetType == 157) {
				// REFLECTION_CHECKER
				Static64.method1111(GameShell.signlink, packetSize, in);
				packetType = -1;
				return true;
			}
			@Pc(355) int local355;
			@Pc(364) int local364;
			@Pc(359) int local359;
			@Pc(376) int local376;
			if (packetType == 215) {
				cutscene = true;
				Static71.anInt1867 = in.g1();
				Static72.anInt1914 = in.g1();
				Static75.anInt1963 = in.g2();
				Static21.anInt2586 = in.g1();
				Static69.anInt1832 = in.g1();
				if (Static69.anInt1832 >= 100) {
					local125 = Static71.anInt1867 * 128 + 64;
					local226 = Static72.anInt1914 * 128 + 64;
					local230 = getHeightmapY(currentLevel, local125, local226) - Static75.anInt1963;
					local355 = local125 - cameraX;
					local359 = local226 - cameraZ;
					local364 = local230 - cameraY;
					local376 = (int) Math.sqrt((double) (local355 * local355 + local359 * local359));
					cameraPitch = (int) (Math.atan2((double) local364, (double) local376) * 325.949D) & 0x7FF;
					cameraYaw = (int) (-325.949D * Math.atan2((double) local355, (double) local359)) & 0x7FF;
					if (cameraPitch < 128) {
						cameraPitch = 128;
					}
					if (cameraPitch > 383) {
						cameraPitch = 383;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 116) {
				redrawSidebar = true;
				local125 = in.g1_alt3();
				local226 = in.g4s_alt1();
				local230 = in.g1_alt2();
				skillExperience[local230] = local226;
				skillLevel[local230] = local125;
				skillBaseLevel[local230] = 1;
				for (local355 = 0; local355 < 98; local355++) {
					if (levelExperience[local355] <= local226) {
						skillBaseLevel[local230] = local355 + 2;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 90) {
				hintType = in.g1();
				if (hintType == 1) {
					Static1.anInt1989 = in.g2();
				}
				if (hintType >= 2 && hintType <= 6) {
					if (hintType == 2) {
						hintOffsetX = 64;
						hintOffsetY = 64;
					}
					if (hintType == 3) {
						hintOffsetY = 64;
						hintOffsetX = 0;
					}
					if (hintType == 4) {
						hintOffsetX = 128;
						hintOffsetY = 64;
					}
					if (hintType == 5) {
						hintOffsetY = 0;
						hintOffsetX = 64;
					}
					if (hintType == 6) {
						hintOffsetY = 128;
						hintOffsetX = 64;
					}
					hintType = 2;
					hintTileX = in.g2();
					hintTileZ = in.g2();
					hintHeight = in.g1();
				}
				if (hintType == 10) {
					Static1.anInt2353 = in.g2();
				}
				packetType = -1;
				return true;
			}
			if (packetType == 15) {
				local125 = in.g4s_alt1();
				local226 = in.g2s_alt2();
				local230 = in.g2s_alt1();
				local234 = ComType.get(local125);
				local234.anInt1588 = local234.anInt1616 + local226;
				local234.anInt1582 = local234.anInt1573 + local230;
				packetType = -1;
				return true;
			}
			if (packetType == 232) {
				for (local125 = 0; local125 < varps.length; local125++) {
					if (Static1.anIntArray288[local125] != varps[local125]) {
						varps[local125] = Static1.anIntArray288[local125];
						Static21.method1700(local125);
						redrawSidebar = true;
					}
				}
				packetType = -1;
				return true;
			}
			@Pc(650) long local650;
			@Pc(655) long local655;
			if (packetType == 103) {
				local650 = in.g8();
				local655 = in.g2();
				@Pc(660) long local660 = (long) in.g3();
				local376 = in.g1();
				@Pc(671) long local671 = (local655 << 32) + local660;
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < 100; local675++) {
					if (local671 == Static1.aLongArray3[local675]) {
						local673 = true;
						break;
					}
				}
				if (local376 <= 1) {
					for (@Pc(702) int local702 = 0; local702 < ignoreCount; local702++) {
						if (ignoreName37[local702] == local650) {
							local673 = true;
							break;
						}
					}
				}
				if (!local673 && overrideChat == 0) {
					Static1.aLongArray3[Static1.anInt2359] = local671;
					Static1.anInt2359 = (Static1.anInt2359 + 1) % 100;
					@Pc(738) JagString local738 = Static7.method192(in).method1166();
					if (local376 == 2 || local376 == 3) {
						addMessage(7, JagString.concatenate(new JagString[] { JagString.aClass40_622, Static44.fromBase37(local650).formatName() }), local738);
					} else if (local376 == 1) {
						addMessage(7, JagString.concatenate(new JagString[] { JagString.aClass40_323, Static44.fromBase37(local650).formatName() }), local738);
					} else {
						addMessage(3, Static44.fromBase37(local650).formatName(), local738);
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 216) {
				selectedTab = in.g1_alt3();
				redrawSidebar = true;
				Static1.aBoolean184 = true;
				packetType = -1;
				return true;
			}
			@Pc(836) ComType local836;
			if (packetType == 84) {
				local125 = in.g4s_alt1();
				local836 = ComType.get(local125);
				local836.anInt1607 = 3;
				local836.model = localPlayer.aClass33_2.method1006();
				packetType = -1;
				return true;
			}
			if (packetType == 74) {
				if (selectedTab == 12) {
					redrawSidebar = true;
				}
				energy = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 162) {
				cutscene = true;
				Static70.anInt2149 = in.g1();
				Static34.anInt840 = in.g1();
				Static45.cutsceneSrcHeight = in.g2();
				Static18.anInt439 = in.g1();
				Static51.anInt2325 = in.g1();
				if (Static51.anInt2325 >= 100) {
					cameraX = Static70.anInt2149 * 128 + 64;
					cameraZ = Static34.anInt840 * 128 + 64;
					cameraY = getHeightmapY(currentLevel, cameraX, cameraZ) - Static45.cutsceneSrcHeight;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 108) {
				for (local125 = 0; local125 < players.length; local125++) {
					if (players[local125] != null) {
						players[local125].primarySeqId = -1;
					}
				}
				for (local226 = 0; local226 < npcs.length; local226++) {
					if (npcs[local226] != null) {
						npcs[local226].primarySeqId = -1;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 126) {
				Static91.method58(true);
				packetType = -1;
				return true;
			}
			if (packetType == 32) {
				Static1.anInt2399 = 1;
				packetType = -1;
				redrawChatback = true;
				JagString.aClass40_444 = JagString.EMPTY_STRING;
				showSocialInput = false;
				return true;
			}
			if (packetType == 94) {
				local125 = in.g2s_alt2();
				if (local125 != stickyChatInterfaceId) {
					Static75.method1350(stickyChatInterfaceId);
					stickyChatInterfaceId = local125;
				}
				packetType = -1;
				redrawChatback = true;
				return true;
			}
			if (packetType == 120) {
				if (selectedTab == 12) {
					redrawSidebar = true;
				}
				weightCarried = in.g2s();
				packetType = -1;
				return true;
			}
			if (packetType == 70) {
				local125 = in.g2_alt1();
				if (local125 == 65535) {
					local125 = -1;
				}
				if (local125 == -1 && Static1.anInt470 == 0) {
					Static86.method1497();
				} else if (local125 != -1 && local125 != Static1.anInt1977 && Static1.anInt239 != 0 && Static1.anInt470 == 0) {
					Static86.method1491(local125, Static1.anInt239, 0, midiSongsJs5);
				}
				Static1.anInt1977 = local125;
				packetType = -1;
				return true;
			}
			if (packetType == 62) {
				local125 = in.g3();
				local226 = in.g2_alt1();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Static1.anInt239 != 0 && local226 != -1) {
					Static86.method1499(1, local226, midiJinglesJs5, Static1.anInt239);
					Static1.anInt470 = local125;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 17) {
				cutscene = false;
				for (local125 = 0; local125 < 5; local125++) {
					Static1.cameraModifierEnabled[local125] = false;
				}
				packetType = -1;
				return true;
			}
			@Pc(1170) ComType local1170;
			if (packetType == 241) {
				local125 = in.g4s_alt3();
				local226 = in.g2_alt3();
				local1170 = ComType.get(local125);
				packetType = -1;
				local1170.model = local226;
				local1170.anInt1607 = 2;
				return true;
			}
			if (packetType == 97) {
				local125 = in.g2();
				local226 = in.g2_alt1();
				if (chatInterfaceId != -1) {
					Static75.method1350(chatInterfaceId);
					chatInterfaceId = -1;
					redrawChatback = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					setState(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (anInt2585 != local226) {
					Static75.method1350(anInt2585);
					anInt2585 = local226;
				}
				if (sidebarInterfaceId != local125) {
					Static75.method1350(sidebarInterfaceId);
					sidebarInterfaceId = local125;
				}
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					redrawChatback = true;
				}
				packetType = -1;
				redrawSidebar = true;
				Static1.aBoolean184 = true;
				Static1.aBoolean40 = false;
				return true;
			}
			if (packetType == 153) {
				Static75.anInt1960 = in.g2_alt3();
				in.g2();
				Static51.anInt2272 = in.g2_alt1();
				Static61.anInt1664 = in.g2_alt1();
				Static46.anInt1167 = in.g2_alt2();
				Static53.anInt1494 = in.g2_alt3();
				Static35.anInt941 = in.g1();
				Static46.anInt1163 = in.g2_alt2();
				in.g2_alt3();
				Static78.anInt2035 = in.g2_alt1();
				Static53.anInt1487 = in.g4s_alt3();
				Static56.aClass48_6 = GameShell.signlink.method199(Static53.anInt1487);
				packetType = -1;
				return true;
			}
			if (packetType == 11) {
				local125 = in.g2();
				local226 = in.g1();
				local230 = in.g2();
				if (Static1.anInt2372 != 0 && local226 != 0 && Static1.anInt131 < 50) {
					Static1.anIntArray497[Static1.anInt131] = local125;
					Static1.anIntArray79[Static1.anInt131] = local226;
					Static1.anIntArray36[Static1.anInt131] = local230;
					Static1.aClass43Array1[Static1.anInt131] = null;
					Static1.anInt131++;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 122) {
				Static91.method58(false);
				packetType = -1;
				return true;
			}
			if (packetType == 136) {
				local125 = in.g4s();
				local836 = ComType.get(local125);
				for (local230 = 0; local230 < local836.invSlotObjCount.length; local230++) {
					local836.invSlotObjCount[local230] = -1;
					local836.invSlotObjCount[local230] = 0;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 28) {
				Static1.anInt2492 = in.g1_alt1();
				packetType = -1;
				if (selectedTab == Static1.anInt2492) {
					redrawSidebar = true;
					if (Static1.anInt2492 == 3) {
						selectedTab = 1;
					} else {
						selectedTab = 3;
					}
				}
				return true;
			}
			if (packetType == 170) {
				// PLAYER_INFO
				readPlayerInfo();
				packetType = -1;
				return true;
			}
			if (packetType == 250) {
				@Pc(1474) boolean local1474 = in.g1() == 1;
				local226 = in.g4s();
				local1170 = ComType.get(local226);
				local1170.hide = local1474;
				packetType = -1;
				return true;
			}
			if (packetType == 155) {
				local650 = in.g8();
				local230 = in.g2();
				@Pc(1508) JagString local1508 = Static44.fromBase37(local650).formatName();
				for (local364 = 0; local364 < friendCount; local364++) {
					if (local650 == friendName37[local364]) {
						if (local230 != friendWorld[local364]) {
							friendWorld[local364] = local230;
							redrawSidebar = true;
							if (local230 > 0) {
								addMessage(5, JagString.EMPTY_STRING, JagString.concatenate(new JagString[] { local1508, JagString.aClass40_505 }));
							}
							if (local230 == 0) {
								addMessage(5, JagString.EMPTY_STRING, JagString.concatenate(new JagString[] { local1508, JagString.aClass40_1 }));
							}
						}
						local1508 = null;
						break;
					}
				}
				@Pc(1581) boolean local1581 = false;
				if (local1508 != null && friendCount < 200) {
					friendName37[friendCount] = local650;
					friendName[friendCount] = local1508;
					friendWorld[friendCount] = local230;
					friendCount++;
					redrawSidebar = true;
				}
				while (!local1581) {
					local1581 = true;
					for (local376 = 0; local376 < friendCount - 1; local376++) {
						if (worldId != friendWorld[local376] && friendWorld[local376 + 1] == worldId || friendWorld[local376] == 0 && friendWorld[local376 + 1] != 0) {
							local1581 = false;
							@Pc(1649) int local1649 = friendWorld[local376];
							friendWorld[local376] = friendWorld[local376 + 1];
							friendWorld[local376 + 1] = local1649;
							@Pc(1667) JagString local1667 = friendName[local376];
							friendName[local376] = friendName[local376 + 1];
							friendName[local376 + 1] = local1667;
							@Pc(1685) long local1685 = friendName37[local376];
							friendName37[local376] = friendName37[local376 + 1];
							friendName37[local376 + 1] = local1685;
							redrawSidebar = true;
						}
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 197) {
				logout();
				packetType = -1;
				return false;
			}
			if (packetType == 36) {
				local125 = in.g2_alt1();
				local226 = in.g4s_alt3();
				local1170 = ComType.get(local226);
				if (local1170 != null && local1170.type == 0) {
					if (local125 < 0) {
						local125 = 0;
					}
					if (local125 > local1170.scroll - local1170.height) {
						local125 = local1170.scroll - local1170.height;
					}
					local1170.anInt1587 = local125;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 26) {
				packetType = -1;
				JagString.aClass40_444 = JagString.EMPTY_STRING;
				Static1.anInt2399 = 2;
				showSocialInput = false;
				redrawChatback = true;
				return true;
			}
			@Pc(1801) JagString local1801;
			@Pc(1822) JagString local1822;
			if (packetType == 3) {
				local1801 = in.gjstr();
				@Pc(1813) boolean local1813;
				if (local1801.method1195(JagString.aClass40_728)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.toBase37();
					for (local359 = 0; local359 < ignoreCount; local359++) {
						if (local655 == ignoreName37[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && overrideChat == 0) {
						addMessage(4, local1822, JagString.aClass40_14);
					}
				} else if (local1801.method1195(JagString.aClass40_654)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.toBase37();
					for (local359 = 0; local359 < ignoreCount; local359++) {
						if (ignoreName37[local359] == local655) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && overrideChat == 0) {
						addMessage(8, local1822, JagString.aClass40_708);
					}
				} else if (local1801.method1195(JagString.aClass40_542)) {
					local1822 = local1801.method1180(local1801.method1200(JagString.aClass40_673), 0);
					local655 = local1822.toBase37();
					local1813 = false;
					for (local359 = 0; local359 < ignoreCount; local359++) {
						if (local655 == ignoreName37[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && overrideChat == 0) {
						@Pc(1923) JagString local1923 = local1801.method1180(local1801.length() - 9, local1801.method1200(JagString.aClass40_673) + 1);
						addMessage(8, local1822, local1923);
					}
				} else {
					addMessage(0, JagString.EMPTY_STRING, local1801);
				}
				packetType = -1;
				return true;
			}
			if (packetType == 85) {
				local125 = in.g1_alt1();
				local1822 = in.gjstr();
				local230 = in.g1_alt2();
				if (local230 >= 1 && local230 <= 5) {
					if (local1822.method1199(JagString.aClass40_359)) {
						local1822 = null;
					}
					Static1.aClass40Array6[local230 - 1] = local1822;
					Static1.aBooleanArray41[local230 - 1] = local125 == 0;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 110) {
				// NPC_INFO
				readNpcInfo();
				packetType = -1;
				return true;
			}
			if (packetType == 128) {
				redrawSidebar = true;
				local125 = in.g4s();
				local836 = ComType.get(local125);
				local230 = in.g2();
				for (local355 = 0; local355 < local230; local355++) {
					local364 = in.g1_alt1();
					if (local364 == 255) {
						local364 = in.g4s();
					}
					local836.invSlotObjCount[local355] = in.g2_alt3();
					local836.invSlotObjId[local355] = local364;
				}
				for (local364 = local230; local364 < local836.invSlotObjCount.length; local364++) {
					local836.invSlotObjCount[local364] = 0;
					local836.invSlotObjId[local364] = 0;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 133) {
				local125 = in.g4s_alt1();
				local226 = in.g2_alt3();
				local1170 = ComType.get(local125);
				packetType = -1;
				local1170.anInt1607 = 1;
				local1170.model = local226;
				return true;
			}
			if (packetType == 54) {
				ignoreCount = packetSize / 8;
				for (local125 = 0; local125 < ignoreCount; local125++) {
					ignoreName37[local125] = in.g8();
				}
				packetType = -1;
				return true;
			}
			if (packetType == 38) {
				systemUpdateTimer = in.g2_alt3() * 30;
				packetType = -1;
				return true;
			}
			if (packetType == 66) {
				Static1.anInt2328 = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 118 || packetType == 63 || packetType == 21 || packetType == 46 || packetType == 135 || packetType == 69 || packetType == 221 || packetType == 56 || packetType == 129 || packetType == 35 || packetType == 244) {
				Static3.method26();
				packetType = -1;
				return true;
			}
			if (packetType == 195) {
				local125 = in.g2_alt2();
				Static95.method1648(local125);
				if (sidebarInterfaceId != -1) {
					Static75.method1350(sidebarInterfaceId);
					sidebarInterfaceId = -1;
					Static1.aBoolean184 = true;
					redrawSidebar = true;
				}
				if (chatInterfaceId != -1) {
					Static75.method1350(chatInterfaceId);
					chatInterfaceId = -1;
					redrawChatback = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					setState(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (anInt2585 != local125) {
					Static75.method1350(anInt2585);
					anInt2585 = local125;
				}
				Static1.aBoolean40 = false;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					redrawChatback = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 144) {
				// UPDATE_ZONE_FULL_FOLLOWS
				baseZ = in.g1_alt2();
				baseX = in.g1_alt3();
				for (local125 = baseX; local125 < baseX + 8; local125++) {
					for (local226 = baseZ; local226 < baseZ + 8; local226++) {
						if (levelObjStacks[currentLevel][local125][local226] != null) {
							levelObjStacks[currentLevel][local125][local226] = null;
							sortObjStacks(local226, local125);
						}
					}
				}
				for (@Pc(2420) LocTemporary loc = (LocTemporary) Static1.spawnedLocations.head(); loc != null; loc = (LocTemporary) Static1.spawnedLocations.next()) {
					if (baseX <= loc.x && loc.x < baseX + 8 && loc.z >= baseZ && baseZ + 8 > loc.z && loc.level == currentLevel) {
						loc.anInt826 = 0;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 239) {
				local125 = in.g2s_alt3();
				if (local125 >= 0) {
					Static95.method1648(local125);
				}
				if (local125 != viewportInterfaceId) {
					Static75.method1350(viewportInterfaceId);
					viewportInterfaceId = local125;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 202) {
				local125 = in.g4s_alt2();
				local226 = in.g2_alt3();
				local230 = local226 >> 10 & 0x1F;
				local355 = local226 >> 5 & 0x1F;
				local364 = local226 & 0x1F;
				@Pc(2530) ComType local2530 = ComType.get(local125);
				packetType = -1;
				local2530.colour = (local355 << 11) + (local230 << 19) + (local364 << 3);
				return true;
			}
			if (packetType == 243) {
				for (local125 = 0; local125 < Static54.anInt1505; local125++) {
					@Pc(2561) VarpType local2561 = VarpType.method1568(local125);
					if (local2561 != null && local2561.anInt1076 == 0) {
						Static1.anIntArray288[local125] = 0;
						varps[local125] = 0;
					}
				}
				redrawSidebar = true;
				packetType = -1;
				if (stickyChatInterfaceId != -1) {
					redrawChatback = true;
				}
				return true;
			}
			if (packetType == 181) {
				Static1.inMultizone = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 180) {
				Static1.anInt583 = in.g1();
				Static1.anInt2515 = in.g1();
				Static1.anInt2491 = in.g1();
				redrawChatback = true;
				packetType = -1;
				Static1.aBoolean95 = true;
				return true;
			}
			if (packetType == 121) {
				packetType = -1;
				flagSceneTileX = 0;
				return true;
			}
			if (packetType == 53) {
				local1801 = in.gjstr();
				local226 = in.g4s_alt2();
				local1170 = ComType.get(local226);
				local1170.text = local1801;
				if (local226 >> 16 == tabInterfaceId[selectedTab]) {
					redrawSidebar = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 45) {
				redrawSidebar = true;
				local125 = in.g4s();
				local836 = ComType.get(local125);
				while (packetSize > in.pos) {
					local230 = in.gSmart1or2();
					local355 = in.g2();
					local364 = in.g1();
					if (local364 == 255) {
						local364 = in.g4s();
					}
					if (local230 >= 0 && local230 < local836.invSlotObjCount.length) {
						local836.invSlotObjCount[local230] = local355;
						local836.invSlotObjId[local230] = local364;
					}
				}
				packetType = -1;
				return true;
			}
			if (packetType == 58) {
				local125 = in.g2_alt2();
				local226 = in.g2_alt1();
				local230 = in.g4s_alt1();
				local355 = in.g2_alt1();
				@Pc(2761) ComType local2761 = ComType.get(local230);
				local2761.xan = local125;
				packetType = -1;
				local2761.zoom = local226;
				local2761.yan = local355;
				return true;
			}
			if (packetType == 24) {
				local125 = in.g2_alt3();
				local226 = in.g2_alt1();
				local230 = in.g4s_alt3();
				local234 = ComType.get(local230);
				local234.anInt1617 = (local125 << 16) + local226;
				packetType = -1;
				return true;
			}
			if (packetType == 25) {
				if (sidebarInterfaceId != -1) {
					Static75.method1350(sidebarInterfaceId);
					redrawSidebar = true;
					sidebarInterfaceId = -1;
					Static1.aBoolean184 = true;
				}
				if (chatInterfaceId != -1) {
					Static75.method1350(chatInterfaceId);
					chatInterfaceId = -1;
					redrawChatback = true;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					setState(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (anInt2585 != -1) {
					Static75.method1350(anInt2585);
					anInt2585 = -1;
				}
				packetType = -1;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					redrawChatback = true;
				}
				Static1.aBoolean40 = false;
				return true;
			}
			if (packetType == 252) {
				local125 = in.g1_alt1();
				local226 = in.g2_alt3();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (tabInterfaceId[local125] != local226) {
					Static75.method1350(tabInterfaceId[local125]);
					tabInterfaceId[local125] = local226;
				}
				redrawSidebar = true;
				Static1.aBoolean184 = true;
				packetType = -1;
				return true;
			}
			if (packetType == 203) {
				Static1.anInt1038 = in.g1();
				redrawSidebar = true;
				packetType = -1;
				return true;
			}
			if (packetType == 71) {
				local650 = in.g8();
				@Pc(2944) JagString local2944 = Static7.method192(in).method1166();
				addMessage(6, Static44.fromBase37(local650).formatName(), local2944);
				packetType = -1;
				return true;
			}
			if (packetType == 163) {
				local125 = in.g2_alt2();
				local226 = in.g2_alt3();
				Static95.method1648(local226);
				if (local125 != -1) {
					Static95.method1648(local125);
				}
				if (anInt2585 != -1) {
					Static75.method1350(anInt2585);
					anInt2585 = -1;
				}
				if (sidebarInterfaceId != -1) {
					Static75.method1350(sidebarInterfaceId);
					sidebarInterfaceId = -1;
				}
				if (chatInterfaceId != -1) {
					Static75.method1350(chatInterfaceId);
					chatInterfaceId = -1;
				}
				if (Static1.anInt1971 != local226) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = local226;
					setState(35);
				}
				if (local226 != Static1.anInt2175) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = local125;
				}
				Static1.aBoolean40 = false;
				packetType = -1;
				Static1.anInt2399 = 0;
				return true;
			}
			if (packetType == 80) {
				local125 = in.g4s();
				local226 = in.g2();
				Static1.anIntArray288[local226] = local125;
				if (local125 != varps[local226]) {
					varps[local226] = local125;
					Static21.method1700(local226);
					if (stickyChatInterfaceId != -1) {
						redrawChatback = true;
					}
					redrawSidebar = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 223) {
				baseZ = in.g1_alt3();
				baseX = in.g1();
				packetType = -1;
				return true;
			}
			if (packetType == 102) {
				local125 = in.g2_alt2();
				Static95.method1648(local125);
				if (chatInterfaceId != -1) {
					Static75.method1350(chatInterfaceId);
					redrawChatback = true;
					chatInterfaceId = -1;
				}
				if (Static1.anInt1971 != -1) {
					Static75.method1350(Static1.anInt1971);
					Static1.anInt1971 = -1;
					setState(30);
				}
				if (Static1.anInt2175 != -1) {
					Static75.method1350(Static1.anInt2175);
					Static1.anInt2175 = -1;
				}
				if (anInt2585 != -1) {
					Static75.method1350(anInt2585);
					anInt2585 = -1;
				}
				if (local125 != sidebarInterfaceId) {
					Static75.method1350(sidebarInterfaceId);
					sidebarInterfaceId = local125;
				}
				Static1.aBoolean184 = true;
				Static1.aBoolean40 = false;
				if (Static1.anInt2399 != 0) {
					Static1.anInt2399 = 0;
					redrawChatback = true;
				}
				packetType = -1;
				redrawSidebar = true;
				return true;
			}
			if (packetType == 194) {
				local125 = in.g2_alt2();
				@Pc(3171) byte local3171 = in.g1b_alt3();
				Static1.anIntArray288[local125] = local3171;
				if (local3171 != varps[local125]) {
					varps[local125] = local3171;
					Static21.method1700(local125);
					if (stickyChatInterfaceId != -1) {
						redrawChatback = true;
					}
					redrawSidebar = true;
				}
				packetType = -1;
				return true;
			}
			if (packetType == 255) {
				local125 = in.g1();
				local226 = in.g1();
				local230 = in.g1();
				local355 = in.g1();
				Static1.cameraModifierEnabled[local125] = true;
				cameraModifierJitter[local125] = local226;
				cameraModifierWobbleScale[local125] = local230;
				cameraModifierWobbleSpeed[local125] = local355;
				cameraModifierCycle[local125] = 0;
				packetType = -1;
				return true;
			}
			if (packetType == 213) {
				local125 = in.g4s_alt1();
				local226 = in.g2s_alt1();
				local1170 = ComType.get(local125);
				packetType = -1;
				if (local226 != local1170.anim || local226 == -1) {
					local1170.anInt1569 = 0;
					local1170.anim = local226;
					local1170.anInt1593 = 0;
				}
				return true;
			}
			JagException.report("T1 - " + packetType + "," + lastPacketType1 + "," + lastPacketType2 + " - " + packetSize, null);
			logout();
		} catch (@Pc(3308) IOException local3308) {
			tryReconnect();
		} catch (@Pc(3312) Exception local3312) {
			@Pc(3352) String local3352 = "T2 - " + packetType + "," + lastPacketType1 + "," + lastPacketType2 + " - " + packetSize + "," + (localPlayer.pathTileX[0] + sceneBaseTileX) + "," + (localPlayer.pathTileZ[0] + sceneBaseTileZ) + " - ";
			for (local226 = 0; local226 < packetSize && local226 < 50; local226++) {
				local3352 = local3352 + in.data[local226] + ",";
			}
			JagException.report(local3352, local3312);
			logout();
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 39)
	public static void setLowMemory() {
		lowMemory = true;
		World3D.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 313)
	public static void setHighMemory() {
		World3D.aBoolean163 = false;
		lowMemory = false;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 645)
	public static void printUsage() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members],");
		System.exit(1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!kc;II)V", line = 337)
	public static void method846(@OriginalArg(0) int arg0, @OriginalArg(1) PlayerEntity arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x80) != 0) {
			arg1.anInt2324 = in.g2_alt1();
			if (arg1.anInt2324 == 65535) {
				arg1.anInt2324 = -1;
			}
		}
		@Pc(27) int local27;
		if ((arg2 & 0x40) != 0) {
			local27 = in.g1_alt3();
			@Pc(30) byte[] local30 = new byte[local27];
			@Pc(35) Packet local35 = new Packet(local30);
			in.gdata_alt1(local30, local27);
			Static1.aClass2_Sub3Array1[arg0] = local35;
			arg1.method918(local35);
		}
		if ((arg2 & 0x10) != 0) {
			arg1.aClass40_660 = in.gjstr();
			if (arg1.aClass40_660.method1174(0) == 126) {
				arg1.aClass40_660 = arg1.aClass40_660.method1185(1);
				addMessage(2, arg1.name, arg1.aClass40_660);
			} else if (arg1 == localPlayer) {
				addMessage(2, arg1.name, arg1.aClass40_660);
			}
			arg1.anInt2301 = 0;
			arg1.anInt2294 = 150;
			arg1.anInt2271 = 0;
		}
		@Pc(124) int local124;
		@Pc(141) int local141;
		if ((arg2 & 0x8) != 0) {
			local27 = in.g2_alt1();
			local124 = in.g1_alt3();
			if (local27 == 65535) {
				local27 = -1;
			}
			if (local27 == arg1.primarySeqId && local27 != -1) {
				local141 = SeqType.method1042(local27).anInt662;
				if (local141 == 1) {
					arg1.anInt2300 = 0;
					arg1.anInt2267 = 0;
					arg1.anInt2316 = 0;
					arg1.primarySeqDelay = local124;
				}
				if (local141 == 2) {
					arg1.anInt2300 = 0;
				}
			} else if (local27 == -1 || arg1.primarySeqId == -1 || SeqType.method1042(local27).anInt658 >= SeqType.method1042(arg1.primarySeqId).anInt658) {
				arg1.anInt2267 = 0;
				arg1.primarySeqId = local27;
				arg1.anInt2316 = 0;
				arg1.primarySeqDelay = local124;
				arg1.anInt2281 = arg1.pathLength;
				arg1.anInt2300 = 0;
			}
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt2317 = in.g1_alt3();
			arg1.anInt2321 = in.g1_alt1();
			arg1.anInt2311 = in.g1_alt3();
			arg1.anInt2286 = in.g1_alt3();
			arg1.anInt2277 = in.g2_alt1() + loopCycle;
			arg1.anInt2297 = in.g2_alt2() + loopCycle;
			arg1.anInt2314 = in.g1_alt1();
			arg1.method1543();
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt2302 = in.g2_alt2();
			local27 = in.g4s();
			arg1.anInt2291 = 0;
			if (arg1.anInt2302 == 65535) {
				arg1.anInt2302 = -1;
			}
			arg1.anInt2320 = loopCycle + (local27 & 0xFFFF);
			if (arg1.anInt2320 > loopCycle) {
				arg1.anInt2291 = -1;
			}
			arg1.anInt2289 = local27 >> 16;
			arg1.anInt2268 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			local27 = in.g2_alt1();
			local124 = in.g1_alt3();
			local141 = in.g1_alt3();
			@Pc(332) int local332 = in.pos;
			if (arg1.name != null && arg1.aClass33_2 != null) {
				@Pc(340) boolean local340 = false;
				@Pc(345) long local345 = arg1.name.toBase37();
				if (local124 <= 1) {
					for (@Pc(350) int local350 = 0; local350 < ignoreCount; local350++) {
						if (ignoreName37[local350] == local345) {
							local340 = true;
							break;
						}
					}
				}
				if (!local340 && overrideChat == 0) {
					Static1.aClass2_Sub3_4.pos = 0;
					in.gdata_alt1(Static1.aClass2_Sub3_4.data, local141);
					Static1.aClass2_Sub3_4.pos = 0;
					@Pc(392) JagString local392 = Static7.method192(Static1.aClass2_Sub3_4).method1166();
					arg1.aClass40_660 = local392.method1178();
					arg1.anInt2294 = 150;
					arg1.anInt2301 = local27 >> 8;
					arg1.anInt2271 = local27 & 0xFF;
					if (local124 == 2 || local124 == 3) {
						addMessage(1, JagString.concatenate(new JagString[] { JagString.aClass40_622, arg1.name }), local392);
					} else if (local124 == 1) {
						addMessage(1, JagString.concatenate(new JagString[] { JagString.aClass40_323, arg1.name }), local392);
					} else {
						addMessage(2, arg1.name, local392);
					}
				}
			}
			in.pos = local332 + local141;
		}
		if ((arg2 & 0x200) != 0) {
			local27 = in.g1();
			local124 = in.g1();
			arg1.method1540(local27, loopCycle, local124);
			arg1.anInt2315 = loopCycle + 300;
			arg1.anInt2298 = in.g1_alt1();
			arg1.anInt2279 = in.g1_alt3();
		}
		if ((arg2 & 0x20) != 0) {
			local27 = in.g1_alt2();
			local124 = in.g1();
			arg1.method1540(local27, loopCycle, local124);
			arg1.anInt2315 = loopCycle + 300;
			arg1.anInt2298 = in.g1_alt1();
			arg1.anInt2279 = in.g1_alt1();
		}
		if ((arg2 & 0x2) != 0) {
			arg1.anInt2280 = in.g2_alt1();
			arg1.anInt2292 = in.g2_alt2();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!mc;Lclient!o;I)Lclient!o;", line = 385)
	public static JagString method94(@OriginalArg(0) ComType arg0, @OriginalArg(1) JagString arg1) {
		if (arg1.method1200(JagString.aClass40_430) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method1200(JagString.aClass40_525);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method1200(JagString.aClass40_344);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method1200(JagString.aClass40_102);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method1200(JagString.aClass40_681);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method1200(JagString.aClass40_495);
											if (local13 == -1) {
												return arg1;
											}
											arg1 = JagString.concatenate(new JagString[] { arg1.method1180(local13, 0), Static92.method1581(executeClientscript1(4, arg0)), arg1.method1185(local13 + 2) });
										}
									}
									arg1 = JagString.concatenate(new JagString[] { arg1.method1180(local13, 0), Static92.method1581(executeClientscript1(3, arg0)), arg1.method1185(local13 + 2) });
								}
							}
							arg1 = JagString.concatenate(new JagString[] { arg1.method1180(local13, 0), Static92.method1581(executeClientscript1(2, arg0)), arg1.method1185(local13 + 2) });
						}
					}
					arg1 = JagString.concatenate(new JagString[] { arg1.method1180(local13, 0), Static92.method1581(executeClientscript1(1, arg0)), arg1.method1185(local13 + 2) });
				}
			}
			arg1 = JagString.concatenate(new JagString[] { arg1.method1180(local13, 0), Static92.method1581(executeClientscript1(0, arg0)), arg1.method1185(local13 + 2) });
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 383)
	public static int getTopLevelCutscene() {
		@Pc(5) int local5 = getHeightmapY(currentLevel, cameraX, cameraZ);
		return local5 - cameraY >= 800 || (levelTileFlags[currentLevel][cameraX >> 7][cameraZ >> 7] & 0x4) == 0 ? 3 : currentLevel;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)I", line = 107)
	public static int getHeightmapY(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(29) int local29 = arg0;
		if (arg0 < 3 && (levelTileFlags[1][local11][local7] & 0x2) == 2) {
			local29 = arg0 + 1;
		}
		@Pc(50) int local50 = arg1 & 0x7F;
		@Pc(54) int local54 = arg2 & 0x7F;
		@Pc(81) int local81 = (128 - local50) * World.levelHeightmap[local29][local11][local7] + World.levelHeightmap[local29][local11 + 1][local7] * local50 >> 7;
		@Pc(113) int local113 = World.levelHeightmap[local29][local11][local7 + 1] * (128 - local50) + local50 * World.levelHeightmap[local29][local11 + 1][local7 + 1] >> 7;
		return local54 * local113 + local81 * (128 - local54) >> 7;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLjava/awt/Graphics;)V", line = 262)
	public static void drawViewport(@OriginalArg(1) Graphics arg0) {
		Static2.areaViewport.draw(arg0, 4, 4);
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V", line = 706)
	public static void drawScene() {
		sceneCycle++;

		pushPlayers(true);
		pushNpcs(true);
		pushPlayers(false);
		pushNpcs(false);
		pushProjectiles();
		pushSpotanims();

		@Pc(36) int local36;
		@Pc(34) int local34;
		if (!cutscene) {
			local34 = orbitCameraYaw + cameraAnticheatAngle & 0x7FF;
			local36 = orbitCameraPitch;
			if (local36 < cameraPitchClamp / 256) {
				local36 = cameraPitchClamp / 256;
			}
			if (Static1.cameraModifierEnabled[4] && cameraModifierWobbleScale[4] + 128 > local36) {
				local36 = cameraModifierWobbleScale[4] + 128;
			}
			method752(orbitCameraX, local34, oribtCameraZ, local36, getHeightmapY(currentLevel, localPlayer.x, localPlayer.z) - 50, local36 * 3 + 600);
		}
		if (cutscene) {
			local36 = getTopLevelCutscene();
		} else {
			local36 = World.getTopLevel();
		}
		local34 = cameraX;
		@Pc(96) int local96 = cameraZ;
		@Pc(98) int local98 = cameraY;
		@Pc(100) int local100 = cameraPitch;
		@Pc(102) int local102 = cameraYaw;
		for (@Pc(104) int type = 0; type < 5; type++) {
			if (Static1.cameraModifierEnabled[type]) {
				@Pc(146) int local146 = (int) ((double) -cameraModifierJitter[type] + (double) (cameraModifierJitter[type] * 2 + 1) * Math.random() + Math.sin((double) cameraModifierCycle[type] * ((double) cameraModifierWobbleSpeed[type] / 100.0D)) * (double) cameraModifierWobbleScale[type]);
				if (type == 3) {
					cameraYaw = cameraYaw + local146 & 0x7FF;
				}
				if (type == 2) {
					cameraZ += local146;
				}
				if (type == 4) {
					cameraPitch += local146;
					if (cameraPitch < 128) {
						cameraPitch = 128;
					}
					if (cameraPitch > 383) {
						cameraPitch = 383;
					}
				}
				if (type == 1) {
					cameraY += local146;
				}
				if (type == 0) {
					cameraX += local146;
				}
			}
		}
		Static69.method1230();
		Model.checkHover = true;
		Model.mouseY = Mouse.y - 4;
		Model.pickedCount = 0;
		Model.mouseX = Mouse.x - 4;
		Static25.method1610();
		scene.draw(cameraX, cameraY, cameraZ, cameraPitch, cameraYaw, local36);
		scene.clearTemporaryLocs();
		draw2DEntityElements();
		drawTileHint();
		((Js5TextureProvider) Draw3D.getProvider).updateTextures(sceneDelta);
		draw3DEntityElements();
		if (Static1.aBoolean147 && Static97.method1668() == 0) {
			Static1.aBoolean147 = false;
		}
		if (Static1.aBoolean147) {
			Static69.method1230();
			Static25.method1610();
			method1095(false, null, JagString.aClass40_674);
		}
		drawViewport(graphics);
		cameraY = local98;
		cameraPitch = local100;
		cameraZ = local96;
		cameraX = local34;
		cameraYaw = local102;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 4)
	public static void drawGame() {
		if (Static1.aBoolean1) {
			Static1.aBoolean1 = false;
			Static39.method768(graphics);
			Static1.aBoolean95 = true;
			Static1.aBoolean184 = true;
			redrawChatback = true;
			redrawSidebar = true;
		}
		drawScene();
		if (menuVisible && menuArea == 1) {
			redrawSidebar = true;
		}
		@Pc(32) boolean local32;
		if (sidebarInterfaceId != -1) {
			local32 = updateInterfaceAnimation(sidebarInterfaceId);
			if (local32) {
				redrawSidebar = true;
			}
		}
		if (selectedArea == 2) {
			redrawSidebar = true;
		}
		if (objDragArea == 2) {
			redrawSidebar = true;
		}
		if (redrawSidebar) {
			redrawSidebar = false;
			drawSidebar();
		}
		@Pc(101) int local101;
		if (chatInterfaceId == -1) {
			Static1.aClass2_Sub2_Sub13_1.anInt1587 = Static1.anInt1506 - Static1.anInt799 - 77;
			if (Mouse.x > 448 && Mouse.x < 560 && Mouse.y > 332) {
				Static49.method920(Static1.aClass2_Sub2_Sub13_1, 463, Static1.anInt1506, 77, -1, Mouse.y - 357, Mouse.x + -17, 0);
			}
			local101 = Static1.anInt1506 - Static1.aClass2_Sub2_Sub13_1.anInt1587 - 77;
			if (local101 < 0) {
				local101 = 0;
			}
			if (local101 > Static1.anInt1506 - 77) {
				local101 = Static1.anInt1506 - 77;
			}
			if (Static1.anInt799 != local101) {
				redrawChatback = true;
				Static1.anInt799 = local101;
			}
		}
		if (chatInterfaceId == -1 && Static1.anInt2399 == 3) {
			Static1.aClass2_Sub2_Sub13_1.anInt1587 = Static1.anInt53;
			local101 = Static1.anInt2066 * 14 + 7;
			if (Mouse.x > 448 && Mouse.x < 560 && Mouse.y > 332) {
				Static49.method920(Static1.aClass2_Sub2_Sub13_1, 463, local101, 77, -1, Mouse.y - 357, Mouse.x + -17, 0);
			}
			@Pc(168) int local168 = Static1.aClass2_Sub2_Sub13_1.anInt1587;
			if (local168 < 0) {
				local168 = 0;
			}
			if (local168 > local101 - 77) {
				local168 = local101 - 77;
			}
			if (local168 != Static1.anInt53) {
				Static1.anInt53 = local168;
				redrawChatback = true;
			}
		}
		if (chatInterfaceId != -1) {
			local32 = updateInterfaceAnimation(chatInterfaceId);
			if (local32) {
				redrawChatback = true;
			}
		}
		if (selectedArea == 3) {
			redrawChatback = true;
		}
		if (objDragArea == 3) {
			redrawChatback = true;
		}
		if (modalMessage != null) {
			redrawChatback = true;
		}
		if (menuVisible && menuArea == 2) {
			redrawChatback = true;
		}
		if (redrawChatback) {
			redrawChatback = false;
			Static2.method23();
		}
		Static18.method370();
		if (Static1.anInt2492 != -1) {
			Static1.aBoolean184 = true;
		}
		if (Static1.aBoolean184) {
			if (Static1.anInt2492 != -1 && selectedTab == Static1.anInt2492) {
				Static1.anInt2492 = -1;
				out.pIsaac1(145);
				out.p1(selectedTab);
			}
			Static1.aBoolean165 = true;
			Static1.aBoolean184 = false;
			Static85.method1487(selectedTab, tabInterfaceId, loopCycle % 20 < 10 ? -1 : Static1.anInt2492, sidebarInterfaceId == -1, graphics);
		}
		if (Static1.aBoolean95) {
			Static1.aBoolean165 = true;
			Static1.aBoolean95 = false;
			method1664(Static1.anInt2515, graphics, fontPlain12, Static1.anInt2491, Static1.anInt583);
		}
		sceneDelta = 0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V", line = 52)
	public static void pushPlayers(@OriginalArg(0) boolean self) {
		if (flagSceneTileX == localPlayer.x >> 7 && localPlayer.z >> 7 == flagSceneTileZ) {
			flagSceneTileX = 0;
		}
		@Pc(33) int count = playerCount;
		if (self) {
			count = 1;
		}
		for (@Pc(39) int i = 0; i < count; i++) {
			@Pc(47) PlayerEntity player;
			@Pc(45) int id;
			if (self) {
				id = 0x1ffc000; // todo: 2047 << 14
				player = localPlayer;
			} else {
				player = players[playerIds[i]];
				id = playerIds[i] << 14;
			}
			if (player != null && player.isVisible()) {
				@Pc(72) int local72 = player.x >> 7;
				player.lowMemory = false;
				if ((lowMemory && playerCount > 50 || playerCount > 200) && !self && player.secondarySeqId == player.seqStandId) {
					player.lowMemory = true;
				}
				@Pc(102) int local102 = player.z >> 7;
				if (local72 >= 0 && local72 < 104 && local102 >= 0 && local102 < 104) {
					if (player.aClass2_Sub2_Sub12_Sub4_1 == null || loopCycle < player.anInt1377 || loopCycle >= player.anInt1381) {
						if ((player.x & 0x7F) == 64 && (player.z & 0x7F) == 64) {
							if (sceneCycle == tileLastOccupiedCycle[local72][local102]) {
								continue;
							}
							tileLastOccupiedCycle[local72][local102] = sceneCycle;
						}
						player.y = getHeightmapY(currentLevel, player.x, player.z);
						scene.addTemporary(currentLevel, player.x, player.z, player.y, 60, player, player.anInt2305, id, player.aBoolean172);
					} else {
						player.lowMemory = false;
						player.y = getHeightmapY(currentLevel, player.x, player.z);
						scene.addTemporary(currentLevel, player.x, player.z, player.y, player, player.anInt2305, id, player.anInt1368, player.anInt1376, player.anInt1369, player.anInt1386);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BZ)V", line = 6)
	public static void pushNpcs(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int i = 0; i < npcCount; i++) {
			@Pc(20) NpcEntity npc = npcs[npcIds[i]];
			@Pc(29) int bitset = (npcIds[i] << 14) + 0x20000000;

            if (npc == null || !npc.isVisible() || npc.type.aBoolean57 != arg0 || !npc.type.method606()) {
                continue;
            }

            @Pc(50) int x = npc.x >> 7;
            @Pc(55) int z = npc.z >> 7;
            if (x >= 0 && x < 104 && z >= 0 && z < 104) {
                if (npc.size == 1 && (npc.x & 0x7F) == 64 && (npc.z & 0x7F) == 64) {
                    if (sceneCycle == tileLastOccupiedCycle[x][z]) {
                        continue;
                    }

                    tileLastOccupiedCycle[x][z] = sceneCycle;
                }

                if (!npc.type.aBoolean58) {
                    bitset += Integer.MIN_VALUE;
                }

                scene.addTemporary(currentLevel, npc.x, npc.z, getHeightmapY(currentLevel, npc.x, npc.z), npc.size * 64 + 60 - 64, npc, npc.anInt2305, bitset, npc.aBoolean172);
            }
        }
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)V", line = 28)
	public static void pushProjectiles() {
		for (@Pc(10) ProjectileEntity local10 = (ProjectileEntity) Static1.aClass44_4.head(); local10 != null; local10 = (ProjectileEntity) Static1.aClass44_4.next()) {
			if (local10.anInt1417 != currentLevel || local10.anInt1427 < loopCycle) {
				local10.unlink();
			} else if (loopCycle >= local10.anInt1419) {
				if (local10.anInt1434 > 0) {
					@Pc(47) NpcEntity local47 = npcs[local10.anInt1434 - 1];
					if (local47 != null && local47.x >= 0 && local47.x < 13312 && local47.z >= 0 && local47.z < 13312) {
						local10.method939(local47.x, getHeightmapY(local10.anInt1417, local47.x, local47.z) - local10.anInt1416, loopCycle, local47.z);
					}
				}
				if (local10.anInt1434 < 0) {
					@Pc(97) int local97 = -local10.anInt1434 - 1;
					@Pc(104) PlayerEntity local104;
					if (local97 == Static1.anInt1955) {
						local104 = localPlayer;
					} else {
						local104 = players[local97];
					}
					if (local104 != null && local104.x >= 0 && local104.x < 13312 && local104.z >= 0 && local104.z < 13312) {
						local10.method939(local104.x, getHeightmapY(local10.anInt1417, local104.x, local104.z) - local10.anInt1416, loopCycle, local104.z);
					}
				}
				local10.method942(sceneDelta);
				scene.addTemporary(currentLevel, (int) local10.aDouble7, (int) local10.aDouble5, (int) local10.aDouble2, 60, local10, local10.anInt1436, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 99)
	public static void pushSpotanims() {
		for (@Pc(10) SpotAnimEntity local10 = (SpotAnimEntity) Static1.aClass44_8.head(); local10 != null; local10 = (SpotAnimEntity) Static1.aClass44_8.next()) {
			if (local10.anInt2235 != currentLevel || local10.aBoolean169) {
				local10.unlink();
			} else if (loopCycle >= local10.anInt2231) {
				local10.method1519(sceneDelta);
				if (local10.aBoolean169) {
					local10.unlink();
				} else {
					scene.addTemporary(local10.anInt2235, local10.anInt2232, local10.anInt2230, local10.anInt2223, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V", line = 107)
	public static void readPlayerUpdates() {
		for (@Pc(15) int local15 = 0; local15 < entityUpdateCount; local15++) {
			@Pc(21) int local21 = entityUpdateIds[local15];
			@Pc(25) PlayerEntity local25 = players[local21];
			@Pc(31) int local31 = in.g1();
			if ((local31 & 0x4) != 0) {
				local31 += in.g1() << 8;
			}
			method846(local21, local25, local31);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 9)
	public static void updateGame() {
		if (idleTimeout > 0) {
			idleTimeout--;
		}
		if (systemUpdateTimer > 1) {
			systemUpdateTimer--;
		}
		if (Static1.aBoolean164) {
			Static1.aBoolean164 = false;
			tryReconnect();
			return;
		}
		for (@Pc(27) int i = 0; i < 100 && read(); i++) {
		}
		if (state != 30 && state != 35) {
			return;
		}
		@Pc(66) int local66;
		if (Static1.aBoolean147 && state == 30) {
			mouseClickButton = 0;
			mouseButton = 0;
			while (Static89.method1561()) {
			}
			for (local66 = 0; local66 < actionKey.length; local66++) {
				actionKey[local66] = false;
			}
		}
		Static63.performCheck(out);
		@Pc(88) Object local88 = Static41.aClass52_1.lock;
		@Pc(115) int local115;
		@Pc(112) int local112;
		@Pc(117) int local117;
		@Pc(132) int local132;
		synchronized (Static41.aClass52_1.lock) {
			if (!Static1.aBoolean149) {
				Static41.aClass52_1.samples = 0;
			} else if (mouseClickButton != 0 || Static41.aClass52_1.samples >= 40) {
				out.pIsaac1(94);
				out.p1(0);
				local112 = 0;
				local115 = out.pos;
				@Pc(150) int local150;
				for (local117 = 0; local117 < Static41.aClass52_1.samples && out.pos - local115 < 240; local117++) {
					local112++;
					local132 = Static41.aClass52_1.x[local117];
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 764) {
						local132 = 764;
					}
					local150 = Static41.aClass52_1.y[local117];
					if (local150 < 0) {
						local150 = 0;
					} else if (local150 > 502) {
						local150 = 502;
					}
					@Pc(172) int local172 = local150 * 765 + local132;
					if (Static41.aClass52_1.y[local117] == -1 && Static41.aClass52_1.x[local117] == -1) {
						local132 = -1;
						local150 = -1;
						local172 = 524287;
					}
					if (local132 != Static1.anInt1871 || Static1.anInt442 != local150) {
						@Pc(215) int local215 = local132 - Static1.anInt1871;
						Static1.anInt1871 = local132;
						@Pc(222) int local222 = local150 - Static1.anInt442;
						Static1.anInt442 = local150;
						if (Static1.anInt1612 < 8 && local215 >= -32 && local215 <= 31 && local222 >= -32 && local222 <= 31) {
							local215 += 32;
							local222 += 32;
							out.p2((Static1.anInt1612 << 12) + (local215 << 6) + local222);
							Static1.anInt1612 = 0;
						} else if (Static1.anInt1612 < 8) {
							out.p3(local172 + (Static1.anInt1612 << 19) + 0x800000);
							Static1.anInt1612 = 0;
						} else {
							out.p4((Static1.anInt1612 << 19) + local172 - 0x40000000);
							Static1.anInt1612 = 0;
						}
					} else if (Static1.anInt1612 < 2047) {
						Static1.anInt1612++;
					}
				}
				out.psize1(out.pos - local115);
				if (local112 < Static41.aClass52_1.samples) {
					Static41.aClass52_1.samples -= local112;
					for (local150 = 0; local150 < Static41.aClass52_1.samples; local150++) {
						Static41.aClass52_1.x[local150] = Static41.aClass52_1.x[local112 + local150];
						Static41.aClass52_1.y[local150] = Static41.aClass52_1.y[local150 + local112];
					}
				} else {
					Static41.aClass52_1.samples = 0;
				}
			}
		}
		if (mouseClickButton != 0) {
			@Pc(380) long local380 = (Static1.aLong1 - Static1.aLong12) / 50L;
			if (local380 > 4095L) {
				local380 = 4095L;
			}
			Static1.aLong12 = Static1.aLong1;
			@Pc(394) byte local394 = 0;
			local115 = Static1.anInt2133;
			if (local115 < 0) {
				local115 = 0;
			} else if (local115 > 502) {
				local115 = 502;
			}
			if (mouseClickButton == 2) {
				local394 = 1;
			}
			local112 = Static1.anInt2500;
			local132 = (int) local380;
			out.pIsaac1(55);
			if (local112 < 0) {
				local112 = 0;
			} else if (local112 > 764) {
				local112 = 764;
			}
			local117 = local115 * 765 + local112;
			out.p4_alt1(local117 + (local132 << 20) + (local394 << 19));
		}
		if (Static1.anInt10 > 0) {
			Static1.anInt10--;
		}
		if (actionKey[96] || actionKey[97] || actionKey[98] || actionKey[99]) {
			Static1.aBoolean121 = true;
		}
		if (Static1.aBoolean121 && Static1.anInt10 <= 0) {
			Static1.anInt10 = 20;
			Static1.aBoolean121 = false;
			out.pIsaac1(2);
			out.p2_alt3(orbitCameraYaw);
			out.p2_alt1(orbitCameraPitch);
		}
		if (Static89.aBoolean174 && !Static1.aBoolean27) {
			Static1.aBoolean27 = true;
			out.pIsaac1(99);
			out.p1(1);
		}
		if (!Static89.aBoolean174 && Static1.aBoolean27) {
			Static1.aBoolean27 = false;
			out.pIsaac1(99);
			out.p1(0);
		}
		Static71.method1277();
		if (state != 30 && state != 35) {
			return;
		}
		Static68.method1209();
		Static34.method637();
		idleNetCycles++;
		if (idleNetCycles > 750) {
			tryReconnect();
			return;
		}
		Static66.method1197();
		Static69.method1227();
		Static2.method19();
		sceneDelta++;
		if (crossMode != 0) {
			crossCycle += 20;
			if (crossCycle >= 400) {
				crossMode = 0;
			}
		}
		if (selectedArea != 0) {
			selectedCycle++;
			if (selectedCycle >= 15) {
				if (selectedArea == 3) {
					redrawChatback = true;
				}
				if (selectedArea == 2) {
					redrawSidebar = true;
				}
				selectedArea = 0;
			}
		}
		if (objDragArea != 0) {
			objDragCycles++;
			if (Mouse.x > objGrabX + 5 || objGrabX - 5 > Mouse.x || Mouse.y > objGrabY + 5 || objGrabY - 5 > Mouse.y) {
				objGrabThreshold = true;
			}
			if (mouseButton == 0) {
				if (objDragArea == 2) {
					redrawSidebar = true;
				}
				if (objDragArea == 3) {
					redrawChatback = true;
				}
				objDragArea = 0;
				if (objGrabThreshold && objDragCycles >= 5) {
					hoveredSlotParentId = -1;
					handleInput();
					if (objDragInterfaceId == hoveredSlotParentId && Static1.anInt434 != Static1.anInt2239) {
						@Pc(753) byte local753 = 0;
						@Pc(757) ComType com = ComType.get(objDragInterfaceId);
						if (Static1.anInt182 == 1 && com.clientCode == 206) {
							local753 = 1;
						}
						if (com.invSlotObjCount[Static1.anInt434] <= 0) {
							local753 = 0;
						}
						if (com.aBoolean126) {
							local115 = Static1.anInt2239;
							local112 = Static1.anInt434;
							com.invSlotObjCount[local112] = com.invSlotObjCount[local115];
							com.invSlotObjId[local112] = com.invSlotObjId[local115];
							com.invSlotObjCount[local115] = -1;
							com.invSlotObjId[local115] = 0;
						} else if (local753 == 1) {
							local112 = Static1.anInt434;
							local115 = Static1.anInt2239;
							while (local115 != local112) {
								if (local112 < local115) {
									com.method1054(local115 - 1, local115);
									local115--;
								} else if (local112 > local115) {
									com.method1054(local115 + 1, local115);
									local115++;
								}
							}
						} else {
							com.method1054(Static1.anInt434, Static1.anInt2239);
						}
						out.pIsaac1(125);
						out.p2_alt1(Static1.anInt2239);
						out.p2_alt2(Static1.anInt434);
						out.p4_alt1(objDragInterfaceId);
						out.p1_alt3(local753);
					}
				} else if ((Static1.anInt263 == 1 || Static33.method634(menuSize - 1)) && menuSize > 2) {
					Static27.method583();
				} else if (menuSize > 0) {
					useMenuOption(menuSize - 1);
				}
				mouseClickButton = 0;
				selectedCycle = 10;
			}
		}
		@Pc(890) int local890;
		if (World3D.clickTileX != -1) {
			local890 = World3D.clickTileZ;
			local66 = World3D.clickTileX;
			@Pc(912) boolean local912 = tryMove(local890, 0, localPlayer.pathTileX[0], 0, 0, 0, true, 0, localPlayer.pathTileZ[0], 0, local66);
			World3D.clickTileX = -1;
			if (local912) {
				anInt1554 = Static1.anInt2500;
				crossMode = 1;
				crossCycle = 0;
				anInt2465 = Static1.anInt2133;
			}
		}
		if (mouseClickButton == 1 && modalMessage != null) {
			mouseClickButton = 0;
			redrawChatback = true;
			modalMessage = null;
		}
		method1060();
		if (Static1.anInt1971 == -1) {
			Static78.method1386();
			Static73.method1337();
			handleChatSettingsInput();
		}
		if (mouseButton == 1 || mouseClickButton == 1) {
			dragCycles++;
		}
		if (Static1.anInt1501 == -1 && Static1.anInt2340 == -1 && Static1.anInt1012 == -1) {
			if (Static1.anInt1645 > 0) {
				Static1.anInt1645--;
			}
		} else if (Static1.anInt1645 < 100) {
			Static1.anInt1645++;
			if (Static1.anInt1645 == 100) {
				if (Static1.anInt2340 != -1) {
					redrawSidebar = true;
				}
				if (Static1.anInt1501 != -1) {
					redrawChatback = true;
				}
			}
		}
		updateOrbitCamera();
		if (cutscene) {
			applyCutscene();
		}
		for (int i = 0; i < 5; i++) {
			cameraModifierCycle[i]++;
		}
		handleInputKey();
		local890 = Static32.method623();
		local115 = Static70.method1477();
		if (local890 > 4500 && local115 > 4500) {
			idleTimeout = 250;
			Static35.method722(4000);
			out.pIsaac1(247);
		}
		heartbeatTimer++;
		Static1.cameraOffsetCycle++;
		Static1.anInt1966++;
		if (Static1.cameraOffsetCycle > 500) {
			Static1.cameraOffsetCycle = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x4) == 4) {
				cameraAnticheatAngle += cameraOffsetYawModifier;
			}
			if ((local112 & 0x1) == 1) {
				cameraAnticheatOffsetZ += anInt1779;
			}
			if ((local112 & 0x2) == 2) {
				cameraAnticheatOffsetX += anInt667;
			}
		}
		if (Static1.anInt1966 > 500) {
			Static1.anInt1966 = 0;
			local112 = (int) (Math.random() * 8.0D);
			if ((local112 & 0x2) == 2) {
				Static1.anInt1857 += Static1.anInt798;
			}
			if ((local112 & 0x1) == 1) {
				minimapAnticheatAngle += Static1.anInt804;
			}
		}
		if (Static1.anInt1857 < -20) {
			Static1.anInt798 = 1;
		}
		if (cameraAnticheatAngle < -40) {
			cameraOffsetYawModifier = 1;
		}
		if (minimapAnticheatAngle < -60) {
			Static1.anInt804 = 2;
		}
		if (minimapAnticheatAngle > 60) {
			Static1.anInt804 = -2;
		}
		if (cameraAnticheatOffsetZ < -50) {
			anInt1779 = 2;
		}
		if (cameraAnticheatOffsetX < -55) {
			anInt667 = 2;
		}
		if (cameraAnticheatOffsetZ > 50) {
			anInt1779 = -2;
		}
		if (Static1.anInt1857 > 10) {
			Static1.anInt798 = -1;
		}
		if (cameraAnticheatAngle > 40) {
			cameraOffsetYawModifier = -1;
		}
		if (cameraAnticheatOffsetX > 55) {
			anInt667 = -2;
		}
		if (heartbeatTimer > 50) {
			// NO_TIMEOUT
			out.pIsaac1(217);
		}
		try {
			if (stream != null && out.pos > 0) {
				stream.write(out.data, out.pos);
				out.pos = 0;
				heartbeatTimer = 0;
			}
		} catch (@Pc(1235) IOException local1235) {
			tryReconnect();
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 228)
	private static void handleViewportOptions() {
		@Pc(3) int local3 = -1;
		if (objSelected == 0 && spellSelected == 0) {
			method402(JagString.WALK_HERE, 24, Mouse.y, Mouse.x, 0);
		}
		for (@Pc(32) int local32 = 0; local32 < Model.pickedCount; local32++) {
			@Pc(38) int local38 = Model.anIntArray387[local32];
			@Pc(42) int local42 = local38 & 0x7F;
			@Pc(48) int local48 = local38 >> 7 & 0x7F;
			@Pc(54) int local54 = local38 >> 14 & 0x7FFF;
			@Pc(60) int local60 = local38 >> 29 & 0x3;
			if (local3 != local38) {
				local3 = local38;
				@Pc(119) int local119;
				if (local60 == 2 && scene.getInfo(currentLevel, local42, local48, local38) >= 0) {
					@Pc(83) LocType local83 = LocType.get(local54);
					if (local83.anIntArray210 != null) {
						local83 = local83.method766();
					}
					if (local83 == null) {
						continue;
					}
					if (objSelected == 1) {
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_659, local83.aClass40_315 }), 9, local48, local42, local38);
					} else if (spellSelected != 1) {
						@Pc(109) JagString[] local109 = local83.aClass40Array20;
						if (Static1.aBoolean60) {
							local109 = Static79.method1404(local109);
						}
						if (local109 != null) {
							for (local119 = 4; local119 >= 0; local119--) {
								if (local109[local119] != null) {
									@Pc(131) short local131 = 0;
									if (local119 == 0) {
										local131 = 34;
									}
									if (local119 == 1) {
										local131 = 41;
									}
									if (local119 == 2) {
										local131 = 10;
									}
									if (local119 == 3) {
										local131 = 5;
									}
									if (local119 == 4) {
										local131 = 1004;
									}
									method402(JagString.concatenate(new JagString[] { local109[local119], JagString.aClass40_602, local83.aClass40_315 }), local131, local48, local42, local38);
								}
							}
						}
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_286, local83.aClass40_315 }), 1005, local48, local42, local83.anInt1033 << 14);
					} else if ((Static78.anInt2027 & 0x4) == 4) {
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_567, JagString.aClass40_602, local83.aClass40_315 }), 6, local48, local42, local38);
					}
				}
				@Pc(316) int local316;
				@Pc(324) NpcEntity local324;
				@Pc(369) PlayerEntity local369;
				if (local60 == 1) {
					@Pc(293) NpcEntity local293 = npcs[local54];
					if (local293.type.size == 1 && (local293.x & 0x7F) == 64 && (local293.z & 0x7F) == 64) {
						for (local316 = 0; local316 < npcCount; local316++) {
							local324 = npcs[npcIds[local316]];
							if (local324 != null && local324 != local293 && local324.type.size == 1 && local324.x == local293.x && local324.z == local293.z) {
								addNpcOptions(npcIds[local316], local42, local324.type, local48);
							}
						}
						for (local119 = 0; local119 < playerCount; local119++) {
							local369 = players[playerIds[local119]];
							if (local369 != null && local369.x == local293.x && local369.z == local293.z) {
								addPlayerOptions(local48, local369, local42, playerIds[local119]);
							}
						}
					}
					addNpcOptions(local54, local42, local293.type, local48);
				}
				if (local60 == 0) {
					@Pc(414) PlayerEntity local414 = players[local54];
					if ((local414.x & 0x7F) == 64 && (local414.z & 0x7F) == 64) {
						for (local316 = 0; local316 < npcCount; local316++) {
							local324 = npcs[npcIds[local316]];
							if (local324 != null && local324.type.size == 1 && local324.x == local414.x && local414.z == local324.z) {
								addNpcOptions(npcIds[local316], local42, local324.type, local48);
							}
						}
						for (local119 = 0; local119 < playerCount; local119++) {
							local369 = players[playerIds[local119]];
							if (local369 != null && local369 != local414 && local414.x == local369.x && local369.z == local414.z) {
								addPlayerOptions(local48, local369, local42, playerIds[local119]);
							}
						}
					}
					addPlayerOptions(local48, local414, local42, local54);
				}
				if (local60 == 3) {
					@Pc(542) LinkList local542 = levelObjStacks[currentLevel][local42][local48];
					if (local542 != null) {
						for (@Pc(549) ObjStackEntity local549 = (ObjStackEntity) local542.method1226(); local549 != null; local549 = (ObjStackEntity) local542.method1225()) {
							@Pc(558) ObjType local558 = ObjType.method1669(local549.anInt1490);
							if (objSelected == 1) {
								method402(JagString.concatenate(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_590, local558.aClass40_290 }), 11, local48, local42, local549.anInt1490);
							} else if (spellSelected != 1) {
								@Pc(607) JagString[] local607 = local558.aClass40Array17;
								if (Static1.aBoolean60) {
									local607 = Static79.method1404(local607);
								}
								for (@Pc(615) int local615 = 4; local615 >= 0; local615--) {
									if (local607 != null && local607[local615] != null) {
										@Pc(660) byte local660 = 0;
										if (local615 == 0) {
											local660 = 50;
										}
										if (local615 == 1) {
											local660 = 13;
										}
										if (local615 == 2) {
											local660 = 16;
										}
										if (local615 == 3) {
											local660 = 14;
										}
										if (local615 == 4) {
											local660 = 3;
										}
										method402(JagString.concatenate(new JagString[] { local607[local615], JagString.aClass40_572, local558.aClass40_290 }), local660, local48, local42, local549.anInt1490);
									} else if (local615 == 2) {
										method402(JagString.concatenate(new JagString[] { JagString.aClass40_345, local558.aClass40_290 }), 16, local48, local42, local549.anInt1490);
									}
								}
								method402(JagString.concatenate(new JagString[] { JagString.aClass40_81, local558.aClass40_290 }), 1001, local48, local42, local549.anInt1490);
							} else if ((Static78.anInt2027 & 0x1) == 1) {
								method402(JagString.concatenate(new JagString[] { JagString.aClass40_567, JagString.aClass40_572, local558.aClass40_290 }), 48, local48, local42, local549.anInt1490);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 519)
	public static void handleInput() {
		if (objDragArea != 0) {
			return;
		}
		menuOption[0] = JagString.CANCEL;
		menuAction[0] = 1003;
		menuSize = 1;
		if (Static1.anInt1971 != -1) {
			Static1.anInt1979 = -1;
			Static1.anInt982 = -1;
			drawInterface(Mouse.y, 0, Static1.anInt1971, 765, 0, 0, Mouse.x, 503, -1, 0);
			Static1.anInt1012 = Static1.anInt1979;
			Static1.anInt721 = Static1.anInt982;
			return;
		}
		Static78.method1385();
		Static1.anInt982 = -1;
		Static1.anInt1979 = -1;
		if (Mouse.x > 4 && Mouse.y > 4 && Mouse.x < 516 && Mouse.y < 338) {
			if (anInt2585 == -1) {
				handleViewportOptions();
			} else {
				drawInterface(Mouse.y, 4, anInt2585, 516, 0, 0, Mouse.x, 338, -1, 4);
			}
		}
		Static1.anInt721 = Static1.anInt982;
		Static1.anInt1012 = Static1.anInt1979;
		Static1.anInt1979 = -1;
		Static1.anInt982 = -1;
		if (Mouse.x > 553 && Mouse.y > 205 && Mouse.x < 743 && Mouse.y < 466) {
			if (sidebarInterfaceId != -1) {
				drawInterface(Mouse.y, 553, sidebarInterfaceId, 743, 0, 1, Mouse.x, 466, -1, 205);
			} else if (tabInterfaceId[selectedTab] != -1) {
				drawInterface(Mouse.y, 553, tabInterfaceId[selectedTab], 743, 0, 1, Mouse.x, 466, -1, 205);
			}
		}
		if (Static1.anInt1496 != Static1.anInt982) {
			redrawSidebar = true;
			Static1.anInt1496 = Static1.anInt982;
		}
		Static1.anInt982 = -1;
		if (Static1.anInt2340 != Static1.anInt1979) {
			redrawSidebar = true;
			Static1.anInt2340 = Static1.anInt1979;
		}
		@Pc(175) boolean local175 = false;
		Static1.anInt1979 = -1;
		if (Mouse.x > 17 && Mouse.y > 357 && Mouse.x < 496 && Mouse.y < 453) {
			if (chatInterfaceId != -1) {
				drawInterface(Mouse.y, 17, chatInterfaceId, 496, 0, 2, Mouse.x, 453, -1, 357);
			} else if (stickyChatInterfaceId != -1) {
				drawInterface(Mouse.y, 17, stickyChatInterfaceId, 496, 0, 3, Mouse.x, 453, -1, 357);
			} else if (Mouse.y < 434 && Mouse.x < 426) {
				method1590(Mouse.y - 357, Mouse.x - 17);
			}
		}
		if ((chatInterfaceId != -1 || stickyChatInterfaceId != -1) && Static1.anInt982 != Static1.anInt2466) {
			redrawChatback = true;
			Static1.anInt2466 = Static1.anInt982;
		}
		if ((chatInterfaceId != -1 || stickyChatInterfaceId != -1) && Static1.anInt1501 != Static1.anInt1979) {
			Static1.anInt1501 = Static1.anInt1979;
			redrawChatback = true;
		}
		while (!local175) {
			local175 = true;
			for (@Pc(282) int local282 = 0; local282 < menuSize - 1; local282++) {
				if (menuAction[local282] < 1000 && menuAction[local282 + 1] > 1000) {
					@Pc(302) JagString local302 = menuOption[local282];
					local175 = false;
					menuOption[local282] = menuOption[local282 + 1];
					menuOption[local282 + 1] = local302;
					@Pc(322) int local322 = menuAction[local282];
					menuAction[local282] = menuAction[local282 + 1];
					menuAction[local282 + 1] = local322;
					@Pc(340) int local340 = Static1.anIntArray161[local282];
					Static1.anIntArray161[local282] = Static1.anIntArray161[local282 + 1];
					Static1.anIntArray161[local282 + 1] = local340;
					@Pc(358) int local358 = Static1.anIntArray165[local282];
					Static1.anIntArray165[local282] = Static1.anIntArray165[local282 + 1];
					Static1.anIntArray165[local282 + 1] = local358;
					@Pc(376) int local376 = Static1.anIntArray454[local282];
					Static1.anIntArray454[local282] = Static1.anIntArray454[local282 + 1];
					Static1.anIntArray454[local282 + 1] = local376;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIIIIIZIIII)Z", line = 227)
	public static boolean tryMove(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int x, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int z, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 104; local15++) {
			for (local19 = 0; local19 < 104; local19++) {
				bfsDirection[local15][local19] = 0;
				bfsCost[local15][local19] = 99999999;
			}
		}
		bfsDirection[x][z] = 99;
		bfsCost[x][z] = 0;
		@Pc(55) int local55 = z;
		local19 = x;
		@Pc(59) byte local59 = 0;
		bfsStepX[0] = x;
		@Pc(66) int local66 = local59 + 1;
		bfsStepZ[0] = z;
		@Pc(70) int local70 = 0;
		@Pc(72) boolean local72 = false;
		@Pc(75) int local75 = bfsStepX.length;
		@Pc(80) int[][] local80 = levelCollisionMap[currentLevel].flags;
		@Pc(184) int local184;
		while (local70 != local66) {
			local55 = bfsStepZ[local70];
			local19 = bfsStepX[local70];
			local70 = (local70 + 1) % local75;
			if (local19 == arg10 && local55 == arg0) {
				local72 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && levelCollisionMap[currentLevel].reachedWall(arg1, local55, arg0, arg10, local19, arg7 - 1)) {
					local72 = true;
					break;
				}
				if (arg7 < 10 && levelCollisionMap[currentLevel].reachedWallDecoration(local55, arg1, arg7 - 1, arg10, arg0, local19)) {
					local72 = true;
					break;
				}
			}
			if (arg9 != 0 && arg3 != 0 && levelCollisionMap[currentLevel].reachedLoc(arg4, local55, arg10, arg0, arg9, local19, arg3)) {
				local72 = true;
				break;
			}
			local184 = bfsCost[local19][local55] + 1;
			if (local19 > 0 && bfsDirection[local19 - 1][local55] == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0) {
				bfsStepX[local66] = local19 - 1;
				bfsStepZ[local66] = local55;
				bfsDirection[local19 - 1][local55] = 2;
				local66 = (local66 + 1) % local75;
				bfsCost[local19 - 1][local55] = local184;
			}
			if (local19 < 103 && bfsDirection[local19 + 1][local55] == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0) {
				bfsStepX[local66] = local19 + 1;
				bfsStepZ[local66] = local55;
				bfsDirection[local19 + 1][local55] = 8;
				local66 = (local66 + 1) % local75;
				bfsCost[local19 + 1][local55] = local184;
			}
			if (local55 > 0 && bfsDirection[local19][local55 - 1] == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				bfsStepX[local66] = local19;
				bfsStepZ[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				bfsDirection[local19][local55 - 1] = 1;
				bfsCost[local19][local55 - 1] = local184;
			}
			if (local55 < 103 && bfsDirection[local19][local55 + 1] == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				bfsStepX[local66] = local19;
				bfsStepZ[local66] = local55 + 1;
				bfsDirection[local19][local55 + 1] = 4;
				local66 = (local66 + 1) % local75;
				bfsCost[local19][local55 + 1] = local184;
			}
			if (local19 > 0 && local55 > 0 && bfsDirection[local19 - 1][local55 - 1] == 0 && (local80[local19 - 1][local55 - 1] & 0x128010E) == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				bfsStepX[local66] = local19 - 1;
				bfsStepZ[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				bfsDirection[local19 - 1][local55 - 1] = 3;
				bfsCost[local19 - 1][local55 - 1] = local184;
			}
			if (local19 < 103 && local55 > 0 && bfsDirection[local19 + 1][local55 - 1] == 0 && (local80[local19 + 1][local55 - 1] & 0x1280183) == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0 && (local80[local19][local55 - 1] & 0x1280102) == 0) {
				bfsStepX[local66] = local19 + 1;
				bfsStepZ[local66] = local55 - 1;
				local66 = (local66 + 1) % local75;
				bfsDirection[local19 + 1][local55 - 1] = 9;
				bfsCost[local19 + 1][local55 - 1] = local184;
			}
			if (local19 > 0 && local55 < 103 && bfsDirection[local19 - 1][local55 + 1] == 0 && (local80[local19 - 1][local55 + 1] & 0x1280138) == 0 && (local80[local19 - 1][local55] & 0x1280108) == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				bfsStepX[local66] = local19 - 1;
				bfsStepZ[local66] = local55 + 1;
				bfsDirection[local19 - 1][local55 + 1] = 6;
				bfsCost[local19 - 1][local55 + 1] = local184;
				local66 = (local66 + 1) % local75;
			}
			if (local19 < 103 && local55 < 103 && bfsDirection[local19 + 1][local55 + 1] == 0 && (local80[local19 + 1][local55 + 1] & 0x12801E0) == 0 && (local80[local19 + 1][local55] & 0x1280180) == 0 && (local80[local19][local55 + 1] & 0x1280120) == 0) {
				bfsStepX[local66] = local19 + 1;
				bfsStepZ[local66] = local55 + 1;
				bfsDirection[local19 + 1][local55 + 1] = 12;
				local66 = (local66 + 1) % local75;
				bfsCost[local19 + 1][local55 + 1] = local184;
			}
		}
		tryMoveNearest = 0;
		@Pc(798) int local798;
		@Pc(805) int local805;
		@Pc(812) int local812;
		if (!local72) {
			if (!arg6) {
				return false;
			}
			local184 = 1000;
			local798 = 100;
			for (local805 = arg10 - 10; local805 <= arg10 + 10; local805++) {
				for (local812 = arg0 - 10; local812 <= arg0 + 10; local812++) {
					if (local805 >= 0 && local812 >= 0 && local805 < 104 && local812 < 104 && bfsCost[local805][local812] < 100) {
						@Pc(842) int local842 = 0;
						@Pc(844) int local844 = 0;
						if (arg10 > local805) {
							local844 = arg10 - local805;
						} else if (arg10 + arg9 - 1 < local805) {
							local844 = local805 + 1 - arg10 - arg9;
						}
						if (arg0 > local812) {
							local842 = arg0 - local812;
						} else if (local812 > arg3 + arg0 - 1) {
							local842 = local812 + 1 - arg0 - arg3;
						}
						@Pc(910) int local910 = local842 * local842 + local844 * local844;
						if (local910 < local184 || local184 == local910 && local798 > bfsCost[local805][local812]) {
							local798 = bfsCost[local805][local812];
							local55 = local812;
							local19 = local805;
							local184 = local910;
						}
					}
				}
			}
			if (local184 == 1000) {
				return false;
			}
			if (x == local19 && local55 == z) {
				return false;
			}
			tryMoveNearest = 1;
		}
		@Pc(982) byte local982 = 0;
		bfsStepX[0] = local19;
		local70 = local982 + 1;
		bfsStepZ[0] = local55;
		local184 = local798 = bfsDirection[local19][local55];
		while (local19 != x || z != local55) {
			if (local184 != local798) {
				local798 = local184;
				bfsStepX[local70] = local19;
				bfsStepZ[local70++] = local55;
			}
			if ((local184 & 0x2) != 0) {
				local19++;
			} else if ((local184 & 0x8) != 0) {
				local19--;
			}
			if ((local184 & 0x1) != 0) {
				local55++;
			} else if ((local184 & 0x4) != 0) {
				local55--;
			}
			local184 = bfsDirection[local19][local55];
		}
		if (local70 > 0) {
			local75 = local70--;
			if (local75 > 25) {
				local75 = 25;
			}
			@Pc(1072) int local1072 = bfsStepX[local70];
			local805 = bfsStepZ[local70];
			if (arg5 == 0) {
				out.pIsaac1(130);
				out.p1(local75 + local75 + 3);
			}
			if (arg5 == 1) {
				out.pIsaac1(136);
				out.p1(local75 + local75 + 3 + 14);
			}
			if (arg5 == 2) {
				out.pIsaac1(89);
				out.p1(local75 + local75 + 3);
			}
			out.p1_alt1(actionKey[82] ? 1 : 0);
			out.p2_alt2(local1072 + sceneBaseTileX);
			out.p2_alt1(local805 + sceneBaseTileZ);
			flagSceneTileX = bfsStepX[0];
			flagSceneTileZ = bfsStepZ[0];
			for (local812 = 1; local812 < local75; local812++) {
				local70--;
				out.p1_alt1(bfsStepX[local70] - local1072);
				out.p1_alt2(bfsStepZ[local70] - local805);
			}
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 79)
	public static void applyCutscene() {
		@Pc(16) int local16 = Static34.anInt840 * 128 + 64;
		@Pc(22) int local22 = Static70.anInt2149 * 128 + 64;
		@Pc(30) int local30 = getHeightmapY(currentLevel, local22, local16) - Static45.cutsceneSrcHeight;
		if (local16 > cameraZ) {
			cameraZ += Static18.anInt439 + (local16 - cameraZ) * Static51.anInt2325 / 1000;
			if (local16 < cameraZ) {
				cameraZ = local16;
			}
		}
		if (cameraZ > local16) {
			cameraZ -= (cameraZ - local16) * Static51.anInt2325 / 1000 + Static18.anInt439;
			if (local16 > cameraZ) {
				cameraZ = local16;
			}
		}
		if (cameraY < local30) {
			cameraY += (local30 - cameraY) * Static51.anInt2325 / 1000 + Static18.anInt439;
			if (local30 < cameraY) {
				cameraY = local30;
			}
		}
		local16 = Static72.anInt1914 * 128 + 64;
		if (cameraY > local30) {
			cameraY -= Static18.anInt439 + Static51.anInt2325 * (cameraY - local30) / 1000;
			if (cameraY < local30) {
				cameraY = local30;
			}
		}
		if (cameraX < local22) {
			cameraX += Static18.anInt439 + Static51.anInt2325 * (local22 - cameraX) / 1000;
			if (local22 < cameraX) {
				cameraX = local22;
			}
		}
		if (cameraX > local22) {
			cameraX -= (cameraX - local22) * Static51.anInt2325 / 1000 + Static18.anInt439;
			if (local22 > cameraX) {
				cameraX = local22;
			}
		}
		local22 = Static71.anInt1867 * 128 + 64;
		local30 = getHeightmapY(currentLevel, local22, local16) - Static75.anInt1963;
		@Pc(214) int local214 = local22 - cameraX;
		@Pc(219) int local219 = local30 - cameraY;
		@Pc(224) int local224 = local16 - cameraZ;
		@Pc(236) int local236 = (int) Math.sqrt((double) (local214 * local214 + local224 * local224));
		@Pc(247) int local247 = (int) (Math.atan2((double) local219, (double) local236) * 325.949D) & 0x7FF;
		if (local247 < 128) {
			local247 = 128;
		}
		if (local247 > 383) {
			local247 = 383;
		}
		@Pc(270) int local270 = (int) (-325.949D * Math.atan2((double) local214, (double) local224)) & 0x7FF;
		@Pc(274) int local274 = local270 - cameraYaw;
		if (cameraPitch < local247) {
			cameraPitch += Static69.anInt1832 * (local247 - cameraPitch) / 1000 + Static21.anInt2586;
			if (cameraPitch > local247) {
				cameraPitch = local247;
			}
		}
		if (cameraPitch > local247) {
			cameraPitch -= (cameraPitch - local247) * Static69.anInt1832 / 1000 + Static21.anInt2586;
			if (local247 > cameraPitch) {
				cameraPitch = local247;
			}
		}
		if (local274 > 1024) {
			local274 -= 2048;
		}
		if (local274 < -1024) {
			local274 += 2048;
		}
		if (local274 > 0) {
			cameraYaw += local274 * Static69.anInt1832 / 1000 + Static21.anInt2586;
			cameraYaw &= 0x7FF;
		}
		if (local274 < 0) {
			cameraYaw -= Static21.anInt2586 + Static69.anInt1832 * -local274 / 1000;
			cameraYaw &= 0x7FF;
		}
		@Pc(370) int local370 = local270 - cameraYaw;
		if (local370 > 1024) {
			local370 -= 2048;
		}
		if (local370 < -1024) {
			local370 += 2048;
		}
		if (local370 < 0 && local274 > 0 || local370 > 0 && local274 < 0) {
			cameraYaw = local270;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 18)
	public static void updateOrbitCamera() {
		@Pc(10) int orbitX = cameraAnticheatOffsetX + localPlayer.z;
		@Pc(15) int orbitZ = cameraAnticheatOffsetZ + localPlayer.x;
		if (oribtCameraZ - orbitZ < -500 || oribtCameraZ - orbitZ > 500 || orbitCameraX - orbitX < -500 || orbitCameraX - orbitX > 500) {
			oribtCameraZ = orbitZ;
			orbitCameraX = orbitX;
		}
		if (orbitZ != oribtCameraZ) {
			oribtCameraZ += (orbitZ - oribtCameraZ) / 16;
		}
		@Pc(67) int local67 = oribtCameraZ >> 7;
		if (orbitX != orbitCameraX) {
			orbitCameraX += (orbitX - orbitCameraX) / 16;
		}
		if (actionKey[96]) {
			oribtCameraYawVelocity += (-oribtCameraYawVelocity - 24) / 2;
		} else if (actionKey[97]) {
			oribtCameraYawVelocity += (24 - oribtCameraYawVelocity) / 2;
		} else {
			oribtCameraYawVelocity /= 2;
		}
		@Pc(119) int local119 = orbitCameraX >> 7;
		if (actionKey[98]) {
			orbitCameraPitchVelocity += (12 - orbitCameraPitchVelocity) / 2;
		} else if (actionKey[99]) {
			orbitCameraPitchVelocity += (-orbitCameraPitchVelocity - 12) / 2;
		} else {
			orbitCameraPitchVelocity /= 2;
		}
		orbitCameraPitch += orbitCameraPitchVelocity / 2;
		orbitCameraYaw = oribtCameraYawVelocity / 2 + orbitCameraYaw & 0x7FF;
		if (orbitCameraPitch < 128) {
			orbitCameraPitch = 128;
		}
		@Pc(184) int local184 = 0;
		if (orbitCameraPitch > 383) {
			orbitCameraPitch = 383;
		}
		@Pc(197) int local197 = getHeightmapY(currentLevel, oribtCameraZ, orbitCameraX);
		@Pc(213) int local213;
		if (local67 > 3 && local119 > 3 && local67 < 100 && local119 < 100) {
			for (local213 = local67 - 4; local213 <= local67 + 4; local213++) {
				for (@Pc(219) int local219 = local119 - 4; local219 <= local119 + 4; local219++) {
					@Pc(223) int local223 = currentLevel;
					if (local223 < 3 && (levelTileFlags[1][local213][local219] & 0x2) == 2) {
						local223++;
					}
					@Pc(249) int local249 = local197 - World.levelHeightmap[local223][local213][local219];
					if (local184 < local249) {
						local184 = local249;
					}
				}
			}
		}
		local213 = local184 * 192;
		if (local213 > 98048) {
			local213 = 98048;
		}
		if (local213 < 32768) {
			local213 = 32768;
		}
		if (cameraPitchClamp < local213) {
			cameraPitchClamp += (local213 - cameraPitchClamp) / 24;
		} else if (local213 < cameraPitchClamp) {
			cameraPitchClamp += (local213 - cameraPitchClamp) / 80;
		}
	}

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "(I)V", line = 148)
	public static void handleInputKey() {
		while (Static89.method1561()) {
			if (anInt2585 != -1 && Static1.anInt1826 == anInt2585) {
				if (Static35.anInt935 == 85 && JagString.aClass40_448.length() > 0) {
					JagString.aClass40_448 = JagString.aClass40_448.method1180(JagString.aClass40_448.length() - 1, 0);
				}
				if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && JagString.aClass40_448.length() < 12) {
					JagString.aClass40_448 = JagString.aClass40_448.method1192(Static4.anInt135);
				}
			} else {
				@Pc(162) int local162;
				if (showSocialInput) {
					if (Static35.anInt935 == 85 && socialInput.length() > 0) {
						socialInput = socialInput.method1180(socialInput.length() - 1, 0);
						redrawChatback = true;
					}
					if (Static69.method1228(Static4.anInt135) && socialInput.length() < 80) {
						socialInput = socialInput.method1192(Static4.anInt135);
						redrawChatback = true;
					}
					if (Static35.anInt935 == 84) {
						redrawChatback = true;
						showSocialInput = false;
						@Pc(117) long local117;
						if (socialAction == 1) {
							local117 = socialInput.toBase37();
							addFriend(local117);
						}
						if (socialAction == 2 && friendCount > 0) {
							local117 = socialInput.toBase37();
							removeFriend(local117);
						}
						if (socialAction == 3 && socialInput.length() > 0) {
							out.pIsaac1(22);
							out.p1(0);
							local162 = out.pos;
							out.p8(Static1.aLong136);
							Static32.method624(socialInput, out);
							out.psize1(out.pos - local162);
							if (Static1.anInt2515 == 2) {
								Static1.anInt2515 = 1;
								Static1.aBoolean95 = true;
								out.pIsaac1(132);
								out.p1(Static1.anInt583);
								out.p1(Static1.anInt2515);
								out.p1(Static1.anInt2491);
							}
						}
						if (socialAction == 4 && ignoreCount < 100) {
							local117 = socialInput.toBase37();
							Static14.method1254(local117);
						}
						if (socialAction == 5 && ignoreCount > 0) {
							local117 = socialInput.toBase37();
							Static74.method1345(local117);
						}
					}
				} else if (Static1.anInt2399 == 1) {
					if (Static35.anInt935 == 85 && JagString.aClass40_444.length() > 0) {
						JagString.aClass40_444 = JagString.aClass40_444.method1180(JagString.aClass40_444.length() - 1, 0);
						redrawChatback = true;
					}
					if (Static61.method1094(Static4.anInt135) && JagString.aClass40_444.length() < 10) {
						JagString.aClass40_444 = JagString.aClass40_444.method1192(Static4.anInt135);
						redrawChatback = true;
					}
					if (Static35.anInt935 == 84) {
						if (JagString.aClass40_444.length() > 0) {
							local162 = 0;
							if (JagString.aClass40_444.method1176()) {
								local162 = JagString.aClass40_444.method1198();
							}
							out.pIsaac1(122);
							out.p4(local162);
						}
						redrawChatback = true;
						Static1.anInt2399 = 0;
					}
				} else if (Static1.anInt2399 == 2) {
					if (Static35.anInt935 == 85 && JagString.aClass40_444.length() > 0) {
						JagString.aClass40_444 = JagString.aClass40_444.method1180(JagString.aClass40_444.length() - 1, 0);
						redrawChatback = true;
					}
					if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && JagString.aClass40_444.length() < 12) {
						JagString.aClass40_444 = JagString.aClass40_444.method1192(Static4.anInt135);
						redrawChatback = true;
					}
					if (Static35.anInt935 == 84) {
						if (JagString.aClass40_444.length() > 0) {
							out.pIsaac1(51);
							out.p8(JagString.aClass40_444.toBase37());
						}
						redrawChatback = true;
						Static1.anInt2399 = 0;
					}
				} else if (Static1.anInt2399 == 3) {
					if (Static35.anInt935 == 85 && JagString.aClass40_444.length() > 0) {
						JagString.aClass40_444 = JagString.aClass40_444.method1180(JagString.aClass40_444.length() - 1, 0);
						redrawChatback = true;
					}
					if (Static69.method1228(Static4.anInt135) && JagString.aClass40_444.length() < 40) {
						JagString.aClass40_444 = JagString.aClass40_444.method1192(Static4.anInt135);
						redrawChatback = true;
					}
				} else if (chatInterfaceId == -1 && Static1.anInt1971 == -1) {
					if (Static35.anInt935 == 85 && JagString.aClass40_451.length() > 0) {
						JagString.aClass40_451 = JagString.aClass40_451.method1180(JagString.aClass40_451.length() - 1, 0);
						redrawChatback = true;
					}
					if (Static69.method1228(Static4.anInt135) && JagString.aClass40_451.length() < 80) {
						JagString.aClass40_451 = JagString.aClass40_451.method1192(Static4.anInt135);
						redrawChatback = true;
					}
					if (Static35.anInt935 == 84 && JagString.aClass40_451.length() > 0) {
						if (Static1.anInt1550 == 2) {
							if (JagString.aClass40_451.compare(JagString.aClass40_494)) {
								tryReconnect();
							}
							if (JagString.aClass40_451.compare(JagString.aClass40_560)) {
								Static1.aBoolean173 = true;
							}
							if (JagString.aClass40_451.compare(JagString.aClass40_182)) {
								Static1.aBoolean173 = false;
							}
							if (JagString.aClass40_451.compare(JagString.aClass40_480)) {
								for (local162 = 0; local162 < 4; local162++) {
									for (@Pc(435) int local435 = 1; local435 < 103; local435++) {
										for (@Pc(439) int local439 = 1; local439 < 103; local439++) {
											levelCollisionMap[local162].flags[local435][local439] = 0;
										}
									}
								}
							}
							if (JagString.aClass40_451.compare(JagString.aClass40_62) && modeWhere == 2) {
								throw new RuntimeException();
							}
							if (JagString.aClass40_451.compare(JagString.aClass40_360)) {
								Static1.aBoolean143 = true;
							}
						}
						if (JagString.aClass40_451.method1168(JagString.aClass40_164)) {
							out.pIsaac1(92);
							out.p1(JagString.aClass40_451.length() - 1);
							out.pjstr(JagString.aClass40_451.method1185(2));
						} else {
							@Pc(525) JagString local525 = JagString.aClass40_451.method1196();
							@Pc(527) byte local527 = 0;
							@Pc(529) byte local529 = 0;
							if (local525.method1168(JagString.aClass40_342)) {
								local527 = 0;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_230)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(4);
								local527 = 1;
							} else if (local525.method1168(JagString.aClass40_109)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
								local527 = 2;
							} else if (local525.method1168(JagString.aClass40_218)) {
								local527 = 3;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(5);
							} else if (local525.method1168(JagString.aClass40_566)) {
								local527 = 4;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_538)) {
								local527 = 5;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_132)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
								local527 = 6;
							} else if (local525.method1168(JagString.aClass40_355)) {
								local527 = 7;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_565)) {
								local527 = 8;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_610)) {
								local527 = 9;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_450)) {
								local527 = 10;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_568)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
								local527 = 11;
							}
							local525 = JagString.aClass40_451.method1196();
							if (local525.method1168(JagString.aClass40_472)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(5);
								local529 = 1;
							} else if (local525.method1168(JagString.aClass40_67)) {
								local529 = 2;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_334)) {
								local529 = 3;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
							} else if (local525.method1168(JagString.aClass40_627)) {
								local529 = 4;
								JagString.aClass40_451 = JagString.aClass40_451.method1185(7);
							} else if (local525.method1168(JagString.aClass40_519)) {
								JagString.aClass40_451 = JagString.aClass40_451.method1185(6);
								local529 = 5;
							}
							out.pIsaac1(40);
							out.p1(0);
							@Pc(794) int local794 = out.pos;
							out.p1(local527);
							out.p1(local529);
							Static32.method624(JagString.aClass40_451, out);
							out.psize1(out.pos - local794);
							if (Static1.anInt583 == 2) {
								Static1.anInt583 = 3;
								Static1.aBoolean95 = true;
								out.pIsaac1(132);
								out.p1(Static1.anInt583);
								out.p1(Static1.anInt2515);
								out.p1(Static1.anInt2491);
							}
						}
						JagString.aClass40_451 = JagString.EMPTY_STRING;
						redrawChatback = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V", line = 846)
	public static void addFriend(@OriginalArg(0) long username) {
		if (username == 0L) {
			return;
		}
		if (friendCount >= 100 && anInt927 != 1) {
			addMessage(0, JagString.EMPTY_STRING, JagString.FRIENDSLIST_FULL);
		} else if (friendCount >= 200) {
			addMessage(0, JagString.EMPTY_STRING, JagString.FRIENDSLIST_FULL);
		} else {
			@Pc(41) JagString displayName = Static44.fromBase37(username).formatName();
			for (@Pc(43) int local43 = 0; local43 < friendCount; local43++) {
				if (username == friendName37[local43]) {
					addMessage(0, JagString.EMPTY_STRING, JagString.concatenate(new JagString[] { displayName, JagString.FRIENDSLIST_ALREADY_ADDED }));
					return;
				}
			}
			for (@Pc(74) int local74 = 0; local74 < ignoreCount; local74++) {
				if (ignoreName37[local74] == username) {
					addMessage(0, JagString.EMPTY_STRING, JagString.concatenate(new JagString[] { JagString.FRIENDSLIST_PLEASE_REMOVE, displayName, JagString.FRIENDSLIST_PLEASE_REMOVE_2 }));
					return;
				}
			}
			if (!displayName.compare(localPlayer.name)) {
				friendName[friendCount] = displayName;
				friendName37[friendCount] = username;
				friendWorld[friendCount] = 0;
				redrawSidebar = true;
				friendCount++;
				out.pIsaac1(98);
				out.p8(username);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IJ)V", line = 380)
	public static void removeFriend(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < friendCount; local14++) {
			if (arg0 == friendName37[local14]) {
				friendCount--;
				redrawSidebar = true;
				for (@Pc(40) int local40 = local14; local40 < friendCount; local40++) {
					friendName[local40] = friendName[local40 + 1];
					friendWorld[local40] = friendWorld[local40 + 1];
					friendName37[local40] = friendName37[local40 + 1];
				}
				out.pIsaac1(30);
				out.p8(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!o;Lclient!o;Z)V", line = 17)
	public static void addMessage(@OriginalArg(0) int type, @OriginalArg(1) JagString arg1, @OriginalArg(2) JagString arg2) {
		if (type == 0 && stickyChatInterfaceId != -1) {
			modalMessage = arg2;
			mouseClickButton = 0;
		}
		if (chatInterfaceId == -1) {
			redrawChatback = true;
		}
		for (@Pc(34) int local34 = 99; local34 > 0; local34--) {
			messageType[local34] = messageType[local34 - 1];
			aClass40Array40[local34] = aClass40Array40[local34 - 1];
			aClass40Array30[local34] = aClass40Array30[local34 - 1];
		}
		messageType[0] = type;
		aClass40Array40[0] = arg1;
		aClass40Array30[0] = arg2;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!gb;II)V", line = 265)
	public static void addNpcOptions(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NpcType arg2, @OriginalArg(4) int arg3) {
		if (menuSize >= 400) {
			return;
		}
		if (arg2.anIntArray154 != null) {
			arg2 = arg2.method611();
		}
		if (arg2 == null || !arg2.aBoolean58) {
			return;
		}
		@Pc(30) JagString local30 = arg2.aClass40_238;
		if (arg2.anInt766 != 0) {
			local30 = JagString.concatenate(new JagString[] { local30, Static14.method1260(localPlayer.anInt1378, arg2.anInt766), JagString.aClass40_731, Static48.method859(arg2.anInt766), JagString.aClass40_609 });
		}
		if (objSelected == 1) {
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_613, local30 }), 7, arg3, arg1, arg0);
		} else if (spellSelected != 1) {
			@Pc(80) JagString[] local80 = arg2.aClass40Array14;
			if (Static1.aBoolean60) {
				local80 = Static79.method1404(local80);
			}
			@Pc(94) int local94;
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && !local80[local94].method1199(JagString.aClass40_729)) {
						@Pc(109) byte local109 = 0;
						if (local94 == 0) {
							local109 = 56;
						}
						if (local94 == 1) {
							local109 = 17;
						}
						if (local94 == 2) {
							local109 = 8;
						}
						if (local94 == 3) {
							local109 = 22;
						}
						if (local94 == 4) {
							local109 = 31;
						}
						method402(JagString.concatenate(new JagString[] { local80[local94], JagString.aClass40_83, local30 }), local109, arg3, arg1, arg0);
					}
				}
			}
			if (local80 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local80[local94] != null && local80[local94].method1199(JagString.aClass40_729)) {
						@Pc(192) short local192 = 0;
						if (localPlayer.anInt1378 < arg2.anInt766) {
							local192 = 2000;
						}
						@Pc(201) int local201 = 0;
						if (local94 == 0) {
							local201 = local192 + 56;
						}
						if (local94 == 1) {
							local201 = local192 + 17;
						}
						if (local94 == 2) {
							local201 = local192 + 8;
						}
						if (local94 == 3) {
							local201 = local192 + 22;
						}
						if (local94 == 4) {
							local201 = local192 + 31;
						}
						method402(JagString.concatenate(new JagString[] { local80[local94], JagString.aClass40_83, local30 }), local201, arg3, arg1, arg0);
					}
				}
			}
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_322, local30 }), 1006, arg3, arg1, arg0);
			return;
		} else if ((Static78.anInt2027 & 0x2) == 2) {
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_567, JagString.aClass40_83, local30 }), 44, arg3, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!kc;III)V", line = 11)
	public static void addPlayerOptions(@OriginalArg(0) int arg0, @OriginalArg(1) PlayerEntity arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (localPlayer == arg1 || menuSize >= 400) {
			return;
		}
		@Pc(44) JagString local44;
		if (arg1.anInt1373 == 0) {
			local44 = JagString.concatenate(new JagString[] { arg1.name, Static14.method1260(localPlayer.anInt1378, arg1.anInt1378), JagString.aClass40_731, Static48.method859(arg1.anInt1378), JagString.aClass40_609 });
		} else {
			local44 = JagString.concatenate(new JagString[] { arg1.name, JagString.aClass40_556, Static48.method859(arg1.anInt1373), JagString.aClass40_609 });
		}
		@Pc(122) int local122;
		if (objSelected == 1) {
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_657, local44 }), 25, arg0, arg2, arg3);
		} else if (spellSelected != 1) {
			for (local122 = 4; local122 >= 0; local122--) {
				if (Static1.aClass40Array6[local122] != null) {
					@Pc(134) short local134 = 0;
					@Pc(136) int local136 = 0;
					if (Static1.aClass40Array6[local122].method1199(JagString.aClass40_729)) {
						if (localPlayer.anInt1378 < arg1.anInt1378) {
							local134 = 2000;
						}
						if (localPlayer.anInt1382 != 0 && arg1.anInt1382 != 0) {
							if (arg1.anInt1382 == localPlayer.anInt1382) {
								local134 = 2000;
							} else {
								local134 = 0;
							}
						}
					} else if (Static1.aBooleanArray41[local122]) {
						local134 = 2000;
					}
					if (local122 == 0) {
						local136 = local134 + 15;
					}
					if (local122 == 1) {
						local136 = local134 + 30;
					}
					if (local122 == 2) {
						local136 = local134 + 43;
					}
					if (local122 == 3) {
						local136 = local134 + 38;
					}
					if (local122 == 4) {
						local136 = local134 + 33;
					}
					method402(JagString.concatenate(new JagString[] { Static1.aClass40Array6[local122], JagString.aClass40_30, local44 }), local136, arg0, arg2, arg3);
				}
			}
		} else if ((Static78.anInt2027 & 0x8) == 8) {
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_567, JagString.aClass40_30, local44 }), 36, arg0, arg2, arg3);
		}
		for (local122 = 0; local122 < menuSize; local122++) {
			if (menuAction[local122] == 24) {
				menuOption[local122] = JagString.concatenate(new JagString[] { JagString.aClass40_526, local44 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 163)
	public static void handleChatSettingsInput() {
		if (mouseClickButton != 1) {
			return;
		}
		if (Static1.anInt2500 >= 6 && Static1.anInt2500 <= 106 && Static1.anInt2133 >= 467 && Static1.anInt2133 <= 499) {
			Static1.aBoolean95 = true;
			Static1.anInt583 = (Static1.anInt583 + 1) % 4;
			redrawChatback = true;
			out.pIsaac1(132);
			out.p1(Static1.anInt583);
			out.p1(Static1.anInt2515);
			out.p1(Static1.anInt2491);
		}
		if (Static1.anInt2500 >= 135 && Static1.anInt2500 <= 235 && Static1.anInt2133 >= 467 && Static1.anInt2133 <= 499) {
			redrawChatback = true;
			Static1.aBoolean95 = true;
			Static1.anInt2515 = (Static1.anInt2515 + 1) % 3;
			out.pIsaac1(132);
			out.p1(Static1.anInt583);
			out.p1(Static1.anInt2515);
			out.p1(Static1.anInt2491);
		}
		if (Static1.anInt2500 >= 273 && Static1.anInt2500 <= 373 && Static1.anInt2133 >= 467 && Static1.anInt2133 <= 499) {
			Static1.anInt2491 = (Static1.anInt2491 + 1) % 3;
			Static1.aBoolean95 = true;
			redrawChatback = true;
			out.pIsaac1(132);
			out.p1(Static1.anInt583);
			out.p1(Static1.anInt2515);
			out.p1(Static1.anInt2491);
		}
		if (Static1.anInt2500 < 412 || Static1.anInt2500 > 512 || Static1.anInt2133 < 467 || Static1.anInt2133 > 499) {
			return;
		}
		if (anInt2585 != -1) {
			addMessage(0, JagString.EMPTY_STRING, JagString.aClass40_628);
			return;
		}
		closeInterfaces();
		if (Static1.anInt808 != -1) {
			Static1.aBoolean103 = false;
			JagString.aClass40_448 = JagString.EMPTY_STRING;
			Static1.anInt1826 = anInt2585 = Static1.anInt808;
			return;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 62)
	public static void logout() {
		if (stream != null) {
			stream.close();
		}
		stream = null;
		method820();
		scene.method1414();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			levelCollisionMap[local22].reset();
		}
		System.gc();
		Static86.method1490();
		Static1.anInt470 = 0;
		Static1.anInt1977 = -1;
		setState(10);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z", line = 220)
	public static boolean interactWithLoc(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 >> 14 & 0x7FFF;
		@Pc(23) int local23 = scene.getInfo(currentLevel, arg2, arg0, arg1);
		if (local23 == -1) {
			return false;
		}
		@Pc(34) int local34 = local23 >> 6 & 0x3;
		@Pc(38) int local38 = local23 & 0x1F;
		if (local38 == 10 || local38 == 11 || local38 == 22) {
			@Pc(53) LocType local53 = LocType.get(local16);
			@Pc(66) int local66;
			@Pc(63) int local63;
			if (local34 == 0 || local34 == 2) {
				local66 = local53.anInt1036;
				local63 = local53.anInt1040;
			} else {
				local63 = local53.anInt1036;
				local66 = local53.anInt1040;
			}
			@Pc(77) int local77 = local53.anInt1057;
			if (local34 != 0) {
				local77 = (local77 << local34 & 0xF) + (local77 >> 4 - local34);
			}
			tryMove(arg0, 0, localPlayer.pathTileX[0], local63, local77, 2, true, 0, localPlayer.pathTileZ[0], local66, arg2);
		} else {
			tryMove(arg0, local34, localPlayer.pathTileX[0], 0, 0, 2, true, local38 + 1, localPlayer.pathTileZ[0], 0, arg2);
		}
		anInt1554 = Static1.anInt2500;
		crossMode = 2;
		anInt2465 = Static1.anInt2133;
		crossCycle = 0;
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZIIII)V", line = 4)
	public static void method752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg1 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 2048 - arg3 & 0x7FF;
		@Pc(21) int local21 = 0;
		@Pc(28) int local28 = arg5;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(49) int local49;
		if (local19 != 0) {
			local34 = Model.sin[local19];
			local38 = Model.cos[local19];
			local49 = local38 * 0 - arg5 * local34 >> 16;
			local28 = local38 * arg5 + local34 * 0 >> 16;
			local21 = local49;
		}
		if (local10 != 0) {
			local34 = Model.sin[local10];
			local38 = Model.cos[local10];
			local49 = local38 * 0 + local28 * local34 >> 16;
			local28 = local28 * local38 - local34 * 0 >> 16;
			local12 = local49;
		}
		cameraPitch = arg3;
		cameraY = arg4 - local21;
		cameraZ = arg0 - local28;
		cameraX = arg2 - local12;
		cameraYaw = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!mc;B)Z", line = 140)
	public static boolean updateInterfaceButtonContent(@OriginalArg(0) ComType com) {
		@Pc(13) int clientCode = com.clientCode;
		if (clientCode >= 1 && clientCode <= 200 || !(clientCode < 701 || clientCode > 900)) {
			if (clientCode >= 801) {
				clientCode -= 701;
			} else if (clientCode >= 701) {
				clientCode -= 601;
			} else if (clientCode >= 101) {
				clientCode -= 101;
			} else {
				clientCode--;
			}
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_240, friendName[clientCode] }), 2, 0, 0, 0);
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_108, friendName[clientCode] }), 20, 0, 0, 0);
			return true;
		} else if (clientCode >= 401 && clientCode <= 500) {
			method402(JagString.concatenate(new JagString[] { JagString.aClass40_240, com.text }), 45, 0, 0, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V", line = 402)
	public static void tryReconnect() {
		if (idleTimeout > 0) {
			logout();
		} else {
			setState(40);
			Static34.aClass25_20 = stream;
		}
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 626)
	public static void method1060() {
		if (objDragArea != 0) {
			return;
		}
		@Pc(15) int local15 = mouseClickButton;
		if (spellSelected == 1 && Static1.anInt2500 >= 516 && Static1.anInt2133 >= 160 && Static1.anInt2500 <= 765 && Static1.anInt2133 <= 205) {
			local15 = 0;
		}
		@Pc(54) int local54;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (!menuVisible) {
			if (local15 == 1 && menuSize > 0) {
				local54 = menuAction[menuSize - 1];
				if (local54 == 52 || local54 == 55 || local54 == 47 || local54 == 39 || local54 == 26 || local54 == 4 || local54 == 27 || local54 == 46 || local54 == 53 || local54 == 23 || local54 == 1 || local54 == 1002) {
					local108 = Static1.anIntArray161[menuSize - 1];
					local114 = Static1.anIntArray165[menuSize - 1];
					@Pc(118) ComType local118 = ComType.get(local114);
					if (local118.draggable || local118.aBoolean126) {
						objGrabX = Static1.anInt2500;
						objDragCycles = 0;
						objDragArea = 2;
						if (anInt2585 == local114 >> 16) {
							objDragArea = 1;
						}
						if (chatInterfaceId == local114 >> 16) {
							objDragArea = 3;
						}
						objGrabY = Static1.anInt2133;
						Static1.anInt2239 = local108;
						objDragInterfaceId = local114;
						objGrabThreshold = false;
						return;
					}
				}
			}
			if (local15 == 1 && (Static1.anInt263 == 1 || Static33.method634(menuSize - 1)) && menuSize > 2) {
				local15 = 2;
			}
			if (local15 == 1 && menuSize > 0) {
				useMenuOption(menuSize - 1);
			}
			if (local15 == 2 && menuSize > 0) {
				Static27.method583();
			}
			return;
		}
		if (local15 != 1) {
			local54 = Mouse.x;
			local108 = Mouse.y;
			if (menuArea == 0) {
				local54 -= 4;
				local108 -= 4;
			}
			if (menuArea == 1) {
				local108 -= 205;
				local54 -= 553;
			}
			if (menuArea == 2) {
				local54 -= 17;
				local108 -= 357;
			}
			if (local54 < Static44.anInt1110 - 10 || local54 > Static44.anInt1110 + Static14.anInt1856 + 10 || Static99.anInt2497 - 10 > local108 || local108 > Static99.anInt2497 + Static91.anInt120 + 10) {
				if (menuArea == 1) {
					redrawSidebar = true;
				}
				menuVisible = false;
				if (menuArea == 2) {
					redrawChatback = true;
				}
			}
		}
		if (local15 != 1) {
			return;
		}
		local54 = Static44.anInt1110;
		local108 = Static99.anInt2497;
		local114 = Static14.anInt1856;
		@Pc(298) int local298 = Static1.anInt2133;
		@Pc(300) int local300 = Static1.anInt2500;
		if (menuArea == 0) {
			local298 -= 4;
			local300 -= 4;
		}
		@Pc(309) int local309 = -1;
		if (menuArea == 1) {
			local300 -= 553;
			local298 -= 205;
		}
		if (menuArea == 2) {
			local298 -= 357;
			local300 -= 17;
		}
		for (@Pc(325) int local325 = 0; local325 < menuSize; local325++) {
			@Pc(340) int local340 = local108 + (-local325 + -1 + menuSize) * 15 + 31;
			if (local300 > local54 && local114 + local54 > local300 && local298 > local340 - 13 && local298 < local340 + 3) {
				local309 = local325;
			}
		}
		if (local309 != -1) {
			useMenuOption(local309);
		}
		if (menuArea == 2) {
			redrawChatback = true;
		}
		menuVisible = false;
		if (menuArea == 1) {
			redrawSidebar = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 3)
	public static void drawWildyLevel() {
		overrideChat = 0;
		@Pc(17) int local17 = (localPlayer.x >> 7) + sceneBaseTileX;
		@Pc(24) int local24 = sceneBaseTileZ + (localPlayer.z >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			overrideChat = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			overrideChat = 1;
		}
		if (overrideChat == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			overrideChat = 0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!ke;)V", line = 32)
	public static void updateMovement(@OriginalArg(1) PathingEntity arg0) {
		arg0.secondarySeqId = arg0.seqStandId;
		if (arg0.pathLength == 0) {
			arg0.seqTrigger = 0;
			return;
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			@Pc(29) SeqType local29 = SeqType.method1042(arg0.primarySeqId);
			if (arg0.anInt2281 > 0 && local29.anInt663 == 0) {
				arg0.seqTrigger++;
				return;
			}
			if (arg0.anInt2281 <= 0 && local29.anInt666 == 0) {
				arg0.seqTrigger++;
				return;
			}
		}
		@Pc(68) int local68 = arg0.z;
		@Pc(71) int local71 = arg0.x;
		@Pc(87) int local87 = arg0.pathTileX[arg0.pathLength - 1] * 128 + arg0.size * 64;
		@Pc(102) int local102 = arg0.size * 64 + arg0.pathTileZ[arg0.pathLength - 1] * 128;
		if (local87 - local71 > 256 || local87 - local71 < -256 || local102 - local68 > 256 || local102 - local68 < -256) {
			arg0.x = local87;
			arg0.z = local102;
			return;
		}
		if (local71 < local87) {
			if (local102 > local68) {
				arg0.dstYaw = 1280;
			} else if (local102 >= local68) {
				arg0.dstYaw = 1536;
			} else {
				arg0.dstYaw = 1792;
			}
		} else if (local87 < local71) {
			if (local102 > local68) {
				arg0.dstYaw = 768;
			} else if (local102 < local68) {
				arg0.dstYaw = 256;
			} else {
				arg0.dstYaw = 512;
			}
		} else if (local68 >= local102) {
			arg0.dstYaw = 0;
		} else {
			arg0.dstYaw = 1024;
		}
		@Pc(216) int local216 = arg0.dstYaw - arg0.anInt2305 & 0x7FF;
		if (local216 > 1024) {
			local216 -= 2048;
		}
		@Pc(225) int local225 = arg0.anInt2303;
		@Pc(227) int local227 = 4;
		if (arg0.anInt2305 != arg0.dstYaw && arg0.anInt2324 == -1 && arg0.anInt2285 != 0) {
			local227 = 2;
		}
		if (local216 >= -256 && local216 <= 256) {
			local225 = arg0.anInt2269;
		} else if (local216 >= 256 && local216 < 768) {
			local225 = arg0.anInt2322;
		} else if (local216 >= -768 && local216 <= -256) {
			local225 = arg0.anInt2304;
		}
		if (local225 == -1) {
			local225 = arg0.anInt2269;
		}
		arg0.secondarySeqId = local225;
		if (arg0.pathLength > 2) {
			local227 = 6;
		}
		if (arg0.pathLength > 3) {
			local227 = 8;
		}
		if (arg0.seqTrigger > 0 && arg0.pathLength > 1) {
			arg0.seqTrigger--;
			local227 = 8;
		}
		if (arg0.aBooleanArray34[arg0.pathLength - 1]) {
			local227 <<= 0x1;
		}
		if (local71 < local87) {
			arg0.x += local227;
			if (local87 < arg0.x) {
				arg0.x = local87;
			}
		} else if (local71 > local87) {
			arg0.x -= local227;
			if (local87 > arg0.x) {
				arg0.x = local87;
			}
		}
		if (local102 > local68) {
			arg0.z += local227;
			if (arg0.z > local102) {
				arg0.z = local102;
			}
		} else if (local68 > local102) {
			arg0.z -= local227;
			if (local102 > arg0.z) {
				arg0.z = local102;
			}
		}
		if (arg0.x == local87 && arg0.z == local102) {
			if (arg0.anInt2281 > 0) {
				arg0.anInt2281--;
			}
			arg0.pathLength--;
		}
		if (local227 >= 8 && arg0.secondarySeqId == arg0.anInt2269 && arg0.anInt2273 != -1) {
			arg0.secondarySeqId = arg0.anInt2273;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 1217)
	public static void sortObjStacks(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) LinkList local11 = levelObjStacks[currentLevel][arg1][arg0];
		if (local11 == null) {
			scene.method1437(currentLevel, arg1, arg0);
			return;
		}
		@Pc(21) ObjStackEntity local21 = null;
		@Pc(26) ObjStackEntity local26 = (ObjStackEntity) local11.head();
		@Pc(28) int local28 = -99999999;
		while (local26 != null) {
			@Pc(34) ObjType local34 = ObjType.method1669(local26.anInt1490);
			@Pc(37) int local37 = local34.anInt938;
			if (local34.aBoolean67) {
				local37 *= local26.anInt1495 + 1;
			}
			if (local37 > local28) {
				local28 = local37;
				local21 = local26;
			}
			local26 = (ObjStackEntity) local11.next();
		}
		local11.method1229(local21);
		@Pc(71) ObjStackEntity local71 = null;
		local26 = (ObjStackEntity) local11.head();
		@Pc(78) ObjStackEntity local78 = null;
		while (local26 != null) {
			if (local21.anInt1490 != local26.anInt1490 && local71 == null) {
				local71 = local26;
			}
			if (local26.anInt1490 != local21.anInt1490 && local71.anInt1490 != local26.anInt1490 && local78 == null) {
				local78 = local26;
			}
			local26 = (ObjStackEntity) local11.next();
		}
		@Pc(126) int local126 = arg1 + (arg0 << 7) + 0x60000000;
		scene.method1427(currentLevel, arg1, arg0, getHeightmapY(currentLevel, arg1 * 128 + 64, arg0 * 128 + 64), local21, local126, local71, local78);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V", line = 142)
	public static void method1205() {
		Static62.method1098(false);
		@Pc(10) boolean local10 = true;
		Static1.anInt1080 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static97.aByteArrayArray12.length; local14++) {
			if (Static50.anIntArray299[local14] != -1 && Static97.aByteArrayArray12[local14] == null) {
				Static97.aByteArrayArray12[local14] = mapsJs5.fetchFile(0, Static50.anIntArray299[local14]);
				if (Static97.aByteArrayArray12[local14] == null) {
					local10 = false;
					Static1.anInt1080++;
				}
			}
			if (Static46.anIntArray256[local14] != -1 && Static23.aByteArrayArray6[local14] == null) {
				Static23.aByteArrayArray6[local14] = mapsJs5.method82(0, Static46.anIntArray256[local14], Static78.anIntArrayArray20[local14]);
				if (Static23.aByteArrayArray6[local14] == null) {
					Static1.anInt1080++;
					local10 = false;
				}
			}
		}
		if (!local10) {
			Static1.anInt375 = 1;
			return;
		}
		local10 = true;
		Static1.anInt1667 = 0;
		@Pc(127) int local127;
		@Pc(117) int local117;
		for (@Pc(98) int local98 = 0; local98 < Static97.aByteArrayArray12.length; local98++) {
			@Pc(104) byte[] local104 = Static23.aByteArrayArray6[local98];
			if (local104 != null) {
				local117 = (Static53.anIntArray311[local98] & 0xFF) * 64 - sceneBaseTileZ;
				local127 = (Static53.anIntArray311[local98] >> 8) * 64 - sceneBaseTileX;
				if (Static1.aBoolean87) {
					local117 = 10;
					local127 = 10;
				}
				local10 &= Static45.method1532(local104, local127, local117);
			}
		}
		if (!local10) {
			Static1.anInt375 = 2;
			return;
		}
		if (Static1.anInt375 != 0) {
			method1095(true, JagString.aClass40_655, JagString.aClass40_674);
		}
		method820();
		scene.method1414();
		System.gc();
		for (@Pc(176) int local176 = 0; local176 < 4; local176++) {
			levelCollisionMap[local176].reset();
		}
		@Pc(199) int local199;
		for (local127 = 0; local127 < 4; local127++) {
			for (local117 = 0; local117 < 104; local117++) {
				for (local199 = 0; local199 < 104; local199++) {
					levelTileFlags[local127][local117][local199] = 0;
				}
			}
		}
		World.create();
		local117 = Static97.aByteArrayArray12.length;
		Static62.method1098(true);
		@Pc(250) int local250;
		@Pc(261) int local261;
		@Pc(375) int local375;
		@Pc(321) int local321;
		@Pc(364) int local364;
		if (!Static1.aBoolean87) {
			@Pc(265) byte[] local265;
			for (local199 = 0; local199 < local117; local199++) {
				local250 = (Static53.anIntArray311[local199] >> 8) * 64 - sceneBaseTileX;
				local261 = (Static53.anIntArray311[local199] & 0xFF) * 64 - sceneBaseTileZ;
				local265 = Static97.aByteArrayArray12[local199];
				if (local265 != null) {
					Static82.method1460(local261, (Static51.anInt2327 - 6) * 8, levelCollisionMap, local265, local250, (Static45.anInt2262 - 6) * 8);
				}
			}
			for (local250 = 0; local250 < local117; local250++) {
				local261 = (Static53.anIntArray311[local250] >> 8) * 64 - sceneBaseTileX;
				@Pc(310) byte[] local310 = Static97.aByteArrayArray12[local250];
				local321 = (Static53.anIntArray311[local250] & 0xFF) * 64 - sceneBaseTileZ;
				if (local310 == null && Static45.anInt2262 < 800) {
					World.method196(64, 64, local321, local261);
				}
			}
			Static62.method1098(true);
			for (local261 = 0; local261 < local117; local261++) {
				local265 = Static23.aByteArrayArray6[local261];
				if (local265 != null) {
					local364 = (Static53.anIntArray311[local261] >> 8) * 64 - sceneBaseTileX;
					local375 = (Static53.anIntArray311[local261] & 0xFF) * 64 - sceneBaseTileZ;
					Static89.method1565(local375, local364, scene, local265, levelCollisionMap);
				}
			}
		}
		@Pc(451) int local451;
		@Pc(429) int local429;
		if (Static1.aBoolean87) {
			@Pc(435) int local435;
			@Pc(445) int local445;
			@Pc(453) int local453;
			for (local199 = 0; local199 < 4; local199++) {
				for (local250 = 0; local250 < 13; local250++) {
					for (local261 = 0; local261 < 13; local261++) {
						local364 = Static1.anIntArrayArrayArray2[local199][local250][local261];
						@Pc(414) boolean local414 = false;
						if (local364 != -1) {
							local375 = local364 >> 24 & 0x3;
							local429 = local364 >> 14 & 0x3FF;
							local435 = local364 >> 3 & 0x7FF;
							local445 = (local429 / 8 << 8) + local435 / 8;
							local451 = local364 >> 1 & 0x3;
							for (local453 = 0; local453 < Static53.anIntArray311.length; local453++) {
								if (Static53.anIntArray311[local453] == local445 && Static97.aByteArrayArray12[local453] != null) {
									Static49.method921(Static97.aByteArrayArray12[local453], local261 * 8, (local429 & 0x7) * 8, local451, local250 * 8, local375, (local435 & 0x7) * 8, levelCollisionMap, local199);
									local414 = true;
									break;
								}
							}
						}
						if (!local414) {
							Static31.method609(local250 * 8, local199, local261 * 8);
						}
					}
				}
			}
			for (local250 = 0; local250 < 13; local250++) {
				for (local261 = 0; local261 < 13; local261++) {
					local321 = Static1.anIntArrayArrayArray2[0][local250][local261];
					if (local321 == -1) {
						World.method196(8, 8, local261 * 8, local250 * 8);
					}
				}
			}
			Static62.method1098(true);
			for (local261 = 0; local261 < 4; local261++) {
				for (local321 = 0; local321 < 13; local321++) {
					for (local364 = 0; local364 < 13; local364++) {
						local375 = Static1.anIntArrayArrayArray2[local261][local321][local364];
						if (local375 != -1) {
							local451 = local375 >> 24 & 0x3;
							local429 = local375 >> 1 & 0x3;
							local435 = local375 >> 14 & 0x3FF;
							local445 = local375 >> 3 & 0x7FF;
							local453 = local445 / 8 + (local435 / 8 << 8);
							for (@Pc(635) int local635 = 0; local635 < Static53.anIntArray311.length; local635++) {
								if (Static53.anIntArray311[local635] == local453 && Static23.aByteArrayArray6[local635] != null) {
									Static20.method400(local429, local451, (local435 & 0x7) * 8, local321 * 8, levelCollisionMap, local364 * 8, (local445 & 0x7) * 8, scene, local261, Static23.aByteArrayArray6[local635]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static62.method1098(true);
		method820();
		World.method503(levelCollisionMap, scene);
		Static62.method1098(true);
		local199 = World.anInt807;
		if (local199 > currentLevel) {
			local199 = currentLevel;
		}
		if (currentLevel - 1 > local199) {
		}
		if (lowMemory) {
			scene.method1421(World.anInt807);
		} else {
			scene.method1421(0);
		}
		for (local250 = 0; local250 < 104; local250++) {
			for (local261 = 0; local261 < 104; local261++) {
				sortObjStacks(local261, local250);
			}
		}
		Static12.method255();
		LocType.modelCacheStatic.clear();
		if (frame != null) {
			out.pIsaac1(153);
			out.p4(1057001181);
		}
		if (!Static1.aBoolean87) {
			local261 = (Static51.anInt2327 - 6) / 8;
			local321 = (Static51.anInt2327 + 6) / 8;
			local364 = (Static45.anInt2262 - 6) / 8;
			local375 = (Static45.anInt2262 + 6) / 8;
			for (local451 = local261 - 1; local451 <= local321 + 1; local451++) {
				for (local429 = local364 - 1; local429 <= local375 + 1; local429++) {
					if (local261 > local451 || local451 > local321 || local429 < local364 || local375 < local429) {
						mapsJs5.method63(JagString.concatenate(new JagString[] { JagString.aClass40_723, Static48.method859(local451), JagString.aClass40_612, Static48.method859(local429) }));
						mapsJs5.method63(JagString.concatenate(new JagString[] { JagString.aClass40_356, Static48.method859(local451), JagString.aClass40_612, Static48.method859(local429) }));
					}
				}
			}
		}
		if (Static1.anInt1971 == -1) {
			setState(30);
		} else {
			setState(35);
		}
		Static29.method1678();
		out.pIsaac1(91);
		method1659();
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V", line = 11)
	public static void drawTooltip() {
		if (menuSize < 2 && objSelected == 0 && spellSelected == 0) {
			return;
		}
		@Pc(47) JagString local47;
		if (objSelected == 1 && menuSize < 2) {
			local47 = JagString.concatenate(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_333 });
		} else if (spellSelected == 1 && menuSize < 2) {
			local47 = JagString.concatenate(new JagString[] { JagString.aClass40_567, JagString.aClass40_61 });
		} else {
			local47 = menuOption[menuSize - 1];
		}
		if (menuSize > 2) {
			local47 = JagString.concatenate(new JagString[] { local47, JagString.aClass40_45, Static48.method859(menuSize - 2), JagString.aClass40_455 });
		}
		fondBold12.drawStringTooltip(local47, 4, 16777215, loopCycle / 1000);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!ke;Z)V", line = 140)
	public static void startForceMovement(@OriginalArg(0) PathingEntity arg0) {
		if (arg0.anInt2297 == loopCycle || arg0.primarySeqId == -1 || arg0.primarySeqDelay != 0 || arg0.anInt2267 + 1 > SeqType.method1042(arg0.primarySeqId).delay[arg0.anInt2316]) {
			@Pc(38) int local38 = arg0.anInt2297 - arg0.anInt2277;
			@Pc(44) int local44 = loopCycle - arg0.anInt2277;
			@Pc(54) int local54 = arg0.size * 64 + arg0.anInt2321 * 128;
			@Pc(64) int local64 = arg0.size * 64 + arg0.anInt2311 * 128;
			@Pc(74) int local74 = arg0.anInt2286 * 128 + arg0.size * 64;
			@Pc(84) int local84 = arg0.size * 64 + arg0.anInt2317 * 128;
			arg0.x = ((local38 - local44) * local84 + local64 * local44) / local38;
			arg0.z = ((local38 - local44) * local54 + local74 * local44) / local38;
		}
		arg0.seqTrigger = 0;
		if (arg0.anInt2314 == 0) {
			arg0.dstYaw = 1024;
		}
		if (arg0.anInt2314 == 1) {
			arg0.dstYaw = 1536;
		}
		if (arg0.anInt2314 == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.anInt2314 == 3) {
			arg0.dstYaw = 512;
		}
		arg0.anInt2305 = arg0.dstYaw;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!mc;)V", line = 3)
	public static void updateInterfaceContent(@OriginalArg(1) ComType com) {
		@Pc(8) int clientCode = com.clientCode;
		@Pc(68) int local68;
		if (clientCode >= 1 && clientCode <= 100 || clientCode >= 701 && clientCode <= 800) {
			if (clientCode == 1 && Static1.anInt1038 == 0) {
				com.text = JagString.aClass40_626;
				com.buttonType = 0;
			} else if (clientCode == 1 && Static1.anInt1038 == 1) {
				com.buttonType = 0;
				com.text = JagString.aClass40_709;
			} else if (clientCode == 2 && Static1.anInt1038 != 2) {
				com.buttonType = 0;
				com.text = JagString.aClass40_361;
			} else {
				local68 = friendCount;
				if (clientCode <= 700) {
					clientCode--;
				} else {
					clientCode -= 601;
				}
				if (Static1.anInt1038 != 2) {
					local68 = 0;
				}
				if (clientCode >= local68) {
					com.text = JagString.EMPTY_STRING;
					com.buttonType = 0;
				} else {
					com.text = friendName[clientCode];
					com.buttonType = 1;
				}
			}
		} else if (clientCode >= 101 && clientCode <= 200 || !(clientCode < 801 || clientCode > 900)) {
			if (clientCode > 800) {
				clientCode -= 701;
			} else {
				clientCode -= 101;
			}
			local68 = friendCount;
			if (Static1.anInt1038 != 2) {
				local68 = 0;
			}
			if (local68 <= clientCode) {
				com.buttonType = 0;
				com.text = JagString.EMPTY_STRING;
			} else {
				if (friendWorld[clientCode] == 0) {
					com.text = JagString.aClass40_43;
				} else if (friendWorld[clientCode] >= 5000) {
					if (worldId == friendWorld[clientCode]) {
						com.text = JagString.concatenate(new JagString[] { JagString.aClass40_85, Static48.method859(friendWorld[clientCode] - 5000) });
					} else {
						com.text = JagString.concatenate(new JagString[] { JagString.aClass40_514, Static48.method859(friendWorld[clientCode] - 5000) });
					}
				} else if (worldId == friendWorld[clientCode]) {
					com.text = JagString.concatenate(new JagString[] { JagString.aClass40_330, Static48.method859(friendWorld[clientCode]) });
				} else {
					com.text = JagString.concatenate(new JagString[] { JagString.aClass40_545, Static48.method859(friendWorld[clientCode]) });
				}
				com.buttonType = 1;
			}
		} else if (clientCode == 203) {
			local68 = friendCount;
			if (Static1.anInt1038 != 2) {
				local68 = 0;
			}
			com.scroll = local68 * 15 + 20;
			if (com.height >= com.scroll) {
				com.scroll = com.height + 1;
			}
		} else if (clientCode >= 401 && clientCode <= 500) {
			clientCode -= 401;
			if (clientCode == 0 && Static1.anInt1038 == 0) {
				com.text = JagString.aClass40_287;
				com.buttonType = 0;
			} else if (clientCode == 1 && Static1.anInt1038 == 0) {
				com.buttonType = 0;
				com.text = JagString.aClass40_361;
			} else {
				local68 = ignoreCount;
				if (Static1.anInt1038 == 0) {
					local68 = 0;
				}
				if (local68 <= clientCode) {
					com.buttonType = 0;
					com.text = JagString.EMPTY_STRING;
				} else {
					com.text = Static44.fromBase37(ignoreName37[clientCode]).formatName();
					com.buttonType = 1;
				}
			}
		} else if (clientCode == 503) {
			com.scroll = ignoreCount * 15 + 20;
			if (com.height >= com.scroll) {
				com.scroll = com.height + 1;
			}
		} else if (clientCode == 327) {
			com.xan = 150;
			com.yan = (int) (Math.sin((double) loopCycle / 40.0D) * 256.0D) & 0x7FF;
			com.anInt1607 = 5;
			com.model = 0;
		} else if (clientCode == 324) {
			if (Static1.anInt2356 == -1) {
				Static1.anInt139 = com.activeGraphic;
				Static1.anInt2356 = com.graphic;
			}
			if (Static1.aClass33_1.aBoolean117) {
				com.graphic = Static1.anInt2356;
			} else {
				com.graphic = Static1.anInt139;
			}
		} else if (clientCode == 325) {
			if (Static1.anInt2356 == -1) {
				Static1.anInt2356 = com.graphic;
				Static1.anInt139 = com.activeGraphic;
			}
			if (Static1.aClass33_1.aBoolean117) {
				com.graphic = Static1.anInt139;
			} else {
				com.graphic = Static1.anInt2356;
			}
		} else if (clientCode == 600) {
			com.text = JagString.aClass40_448;
			if (loopCycle % 20 < 10) {
				com.text = com.text.method1192(124);
			} else {
				com.text = com.text.method1192(32);
			}
		} else {
			if (clientCode == 620) {
				if (Static1.anInt1550 < 1) {
					com.text = JagString.EMPTY_STRING;
				} else if (Static1.aBoolean103) {
					com.colour = 16711680;
					com.text = JagString.aClass40_540;
				} else {
					com.text = JagString.aClass40_646;
					com.colour = 16777215;
				}
			}
			@Pc(549) JagString local549;
			if (clientCode == 660) {
				local68 = Static78.anInt2035 - Static46.anInt1163;
				if (local68 <= 0) {
					local549 = JagString.aClass40_515;
				} else if (local68 == 1) {
					local549 = JagString.aClass40_321;
				} else {
					local549 = JagString.concatenate(new JagString[] { Static48.method859(local68), JagString.aClass40_107 });
				}
				@Pc(577) JagString local577 = JagString.EMPTY_STRING;
				if (Static56.aClass48_6 != null) {
					local577 = Static2.method21(Static56.aClass48_6.intArg1);
					try {
						if (Static56.aClass48_6.result != null) {
							@Pc(593) byte[] local593 = ((String) Static56.aClass48_6.result).getBytes("ISO-8859-1");
							local577 = Static64.method1114(local593.length, local593, 0);
						}
					} catch (@Pc(602) UnsupportedEncodingException local602) {
					}
				}
				com.text = JagString.concatenate(new JagString[] { JagString.aClass40_254, local549, JagString.aClass40_431, local577 });
			}
			if (clientCode == 661) {
				if (Static61.anInt1664 == 0) {
					com.text = JagString.aClass40_523;
				} else if (Static61.anInt1664 <= Static78.anInt2035) {
					com.text = JagString.concatenate(new JagString[] { JagString.aClass40_179, Static1.method1(Static61.anInt1664) });
				} else {
					local68 = Static78.anInt2035 + 14 - Static61.anInt1664;
					if (local68 <= 0) {
						local549 = JagString.aClass40_512;
					} else if (local68 == 1) {
						local549 = JagString.aClass40_241;
					} else {
						local549 = JagString.concatenate(new JagString[] { Static48.method859(local68), JagString.aClass40_107 });
					}
					com.text = JagString.concatenate(new JagString[] { local549, JagString.aClass40_624, Static1.method1(Static61.anInt1664), JagString.aClass40_693 });
				}
			}
			if (clientCode == 662) {
				@Pc(724) JagString local724;
				if (Static46.anInt1167 == 0) {
					local724 = JagString.aClass40_17;
				} else if (Static46.anInt1167 == 1) {
					local724 = JagString.aClass40_717;
				} else {
					local724 = JagString.concatenate(new JagString[] { JagString.aClass40_689, Static48.method859(Static46.anInt1167), JagString.aClass40_317 });
				}
				com.text = JagString.concatenate(new JagString[] { JagString.aClass40_367, local724, JagString.aClass40_511 });
			}
			if (clientCode == 663) {
				if (Static53.anInt1494 > 0 && Static78.anInt2035 + 10 >= Static53.anInt1494) {
					com.text = JagString.concatenate(new JagString[] { JagString.aClass40_337, Static1.method1(Static53.anInt1494) });
				} else {
					com.text = JagString.aClass40_600;
				}
			}
			if (clientCode == 664) {
				if (Static35.anInt941 == 0) {
					com.text = JagString.aClass40_483;
				}
				if (Static35.anInt941 == 1) {
					com.text = JagString.concatenate(new JagString[] { JagString.aClass40_733, Static1.method1(Static75.anInt1960) });
				}
				if (Static35.anInt941 == 2) {
					com.text = JagString.aClass40_741;
				}
			}
			if (clientCode == 665) {
				if (Static51.anInt2272 > 2 && !membersWorld) {
					com.text = JagString.aClass40_562;
				} else if (Static51.anInt2272 > 2) {
					com.text = JagString.concatenate(new JagString[] { JagString.aClass40_694, Static48.method859(Static51.anInt2272), JagString.aClass40_119 });
				} else if (Static51.anInt2272 > 0) {
					com.text = JagString.concatenate(new JagString[] { JagString.aClass40_183, Static48.method859(Static51.anInt2272), JagString.aClass40_429 });
				} else {
					com.text = JagString.aClass40_614;
				}
			}
			if (clientCode == 667) {
				if (Static51.anInt2272 > 2 && !membersWorld) {
					com.text = JagString.aClass40_621;
				} else if (Static51.anInt2272 > 0) {
					com.text = JagString.aClass40_485;
				} else {
					com.text = JagString.aClass40_408;
				}
			}
			if (clientCode == 668) {
				if (Static78.anInt2035 < Static61.anInt1664) {
					com.text = JagString.aClass40_121;
				} else {
					com.text = JagString.aClass40_228;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBIIIIIIII)V", line = 30)
	public static void drawInterface(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!ComType.method1665(arg2) || (arg1 > arg6 || arg0 < arg9 || arg6 >= arg3 || arg7 <= arg0)) {
			return;
		}
		@Pc(40) ComType[] local40 = ComType.instances[arg2];
		for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
			@Pc(48) ComType local48 = local40[local42];
			if (local48 != null && arg8 == local48.anInt1611) {
				@Pc(66) int local66 = local48.anInt1582 + arg1;
				@Pc(75) int local75 = local48.anInt1588 + arg9 - arg4;
				if (local48.type == 8 && local66 <= arg6 && local75 <= arg0 && arg6 < local48.anInt1605 + local66 && local48.height + local75 > arg0) {
					Static1.anInt1979 = local42;
				}
				if ((local48.anInt1594 >= 0 || local48.overColour != 0) && local66 <= arg6 && arg0 >= local75 && arg6 < local66 + local48.anInt1605 && local48.height + local75 > arg0) {
					if (local48.anInt1594 >= 0) {
						Static1.anInt982 = local48.anInt1594;
					} else {
						Static1.anInt982 = local42;
					}
				}
				if (local48.type != 0) {
					if (local48.buttonType == 1 && local66 <= arg6 && local75 <= arg0 && arg6 < local48.anInt1605 + local66 && arg0 < local48.height + local75) {
						@Pc(236) boolean local236 = false;
						if (local48.clientCode != 0) {
							local236 = updateInterfaceButtonContent(local48);
						}
						if (!local236) {
							method402(local48.option, 54, local42 + (arg2 << 16), 0, 0);
						}
					}
					if (local48.buttonType == 2 && spellSelected == 0 && arg6 >= local66 && local75 <= arg0 && local48.anInt1605 + local66 > arg6 && local75 + local48.height > arg0) {
						@Pc(300) JagString local300 = local48.actionVerb;
						if (local300.method1200(JagString.aClass40_716) != -1) {
							local300 = local300.method1180(local300.method1200(JagString.aClass40_716), 0);
						}
						method402(JagString.concatenate(new JagString[] { local300, JagString.aClass40_292, local48.action }), 21, local42 + (arg2 << 16), 0, 0);
					}
					if (local48.buttonType == 3 && arg6 >= local66 && arg0 >= local75 && local66 + local48.anInt1605 > arg6 && local48.height + local75 > arg0) {
						@Pc(385) byte local385;
						if (arg5 == 3) {
							local385 = 35;
						} else {
							local385 = 32;
						}
						method402(JagString.aClass40_509, local385, (arg2 << 16) + local42, 0, 0);
					}
					if (local48.buttonType == 4 && arg6 >= local66 && local75 <= arg0 && arg6 < local48.anInt1605 + local66 && local48.height + local75 > arg0) {
						method402(local48.option, 40, (arg2 << 16) + local42, 0, 0);
					}
					if (local48.buttonType == 5 && arg6 >= local66 && arg0 >= local75 && local66 + local48.anInt1605 > arg6 && local48.height + local75 > arg0) {
						method402(local48.option, 49, (arg2 << 16) + local42, 0, 0);
					}
					if (local48.buttonType == 6 && !Static1.aBoolean40 && local66 <= arg6 && local75 <= arg0 && arg6 < local66 + local48.anInt1605 && arg0 < local48.height + local75) {
						method402(local48.option, 18, local42 + (arg2 << 16), 0, 0);
					}
					if (local48.type == 2) {
						@Pc(551) int local551 = 0;
						for (@Pc(553) int local553 = 0; local553 < local48.height; local553++) {
							for (@Pc(557) int local557 = 0; local557 < local48.anInt1605; local557++) {
								@Pc(569) int local569 = local75 + (local48.marginY + 32) * local553;
								@Pc(578) int local578 = local557 * (local48.marginX + 32) + local66;
								if (local551 < 20) {
									local578 += local48.invSlotOffsetX[local551];
									local569 += local48.invSlotOffsetY[local551];
								}
								if (local578 <= arg6 && local569 <= arg0 && local578 + 32 > arg6 && arg0 < local569 + 32) {
									Static1.anInt434 = local551;
									hoveredSlotParentId = local42 + (arg2 << 16);
									if (local48.invSlotObjCount[local551] > 0) {
										@Pc(643) ObjType local643 = ObjType.method1669(local48.invSlotObjCount[local551] - 1);
										if (objSelected == 1 && local48.interactable) {
											if (Static97.anInt2526 != (arg2 << 16) + local42 || Static28.anInt724 != local551) {
												method402(JagString.concatenate(new JagString[] { JagString.aClass40_193, JagString.aClass40_601, JagString.aClass40_590, local643.aClass40_290 }), 19, (arg2 << 16) + local42, local551, local643.anInt954);
											}
										} else if (spellSelected != 1 || !local48.interactable) {
											@Pc(662) JagString[] local662 = local643.aClass40Array16;
											if (Static1.aBoolean60) {
												local662 = Static79.method1404(local662);
											}
											@Pc(677) int local677;
											@Pc(694) byte local694;
											if (local48.interactable) {
												for (local677 = 4; local677 >= 3; local677--) {
													if (local662 != null && local662[local677] != null) {
														if (local677 == 3) {
															local694 = 53;
														} else {
															local694 = 23;
														}
														method402(JagString.concatenate(new JagString[] { local662[local677], JagString.aClass40_572, local643.aClass40_290 }), local694, local42 + (arg2 << 16), local551, local643.anInt954);
													} else if (local677 == 4) {
														method402(JagString.concatenate(new JagString[] { JagString.aClass40_158, local643.aClass40_290 }), 23, local42 + (arg2 << 16), local551, local643.anInt954);
													}
												}
											}
											if (local48.usable) {
												method402(JagString.concatenate(new JagString[] { JagString.aClass40_449, local643.aClass40_290 }), 1, local42 + (arg2 << 16), local551, local643.anInt954);
											}
											if (local48.interactable && local662 != null) {
												for (local677 = 2; local677 >= 0; local677--) {
													if (local662[local677] != null) {
														local694 = 0;
														if (local677 == 0) {
															local694 = 4;
														}
														if (local677 == 1) {
															local694 = 27;
														}
														if (local677 == 2) {
															local694 = 46;
														}
														method402(JagString.concatenate(new JagString[] { local662[local677], JagString.aClass40_572, local643.aClass40_290 }), local694, (arg2 << 16) + local42, local551, local643.anInt954);
													}
												}
											}
											local662 = local48.iop;
											if (Static1.aBoolean60) {
												local662 = Static79.method1404(local662);
											}
											if (local662 != null) {
												for (local677 = 4; local677 >= 0; local677--) {
													if (local662[local677] != null) {
														local694 = 0;
														if (local677 == 0) {
															local694 = 52;
														}
														if (local677 == 1) {
															local694 = 55;
														}
														if (local677 == 2) {
															local694 = 47;
														}
														if (local677 == 3) {
															local694 = 39;
														}
														if (local677 == 4) {
															local694 = 26;
														}
														method402(JagString.concatenate(new JagString[] { local662[local677], JagString.aClass40_572, local643.aClass40_290 }), local694, (arg2 << 16) + local42, local551, local643.anInt954);
													}
												}
											}
											method402(JagString.concatenate(new JagString[] { JagString.aClass40_81, local643.aClass40_290 }), 1002, local42 + (arg2 << 16), local551, local643.anInt954);
										} else if ((Static78.anInt2027 & 0x10) == 16) {
											method402(JagString.concatenate(new JagString[] { JagString.aClass40_567, JagString.aClass40_572, local643.aClass40_290 }), 28, (arg2 << 16) + local42, local551, local643.anInt954);
										}
									}
								}
								local551++;
							}
						}
					}
				} else if (!local48.hide || Static31.method614(arg5, local42) || Static1.aBoolean143) {
					drawInterface(arg0, local66, arg2, local66 + local48.anInt1605, local48.anInt1587, arg5, arg6, local75 + local48.height, local42, local75);
					if (local48.height < local48.scroll) {
						Static49.method920(local48, local66 + local48.anInt1605, local48.scroll, local48.height, arg5, arg0, arg6, local75);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V", line = 140)
	public static void draw2DEntityElements() {
		chatCount = 0;
		@Pc(79) int local79;
		for (@Pc(9) int local9 = -1; local9 < npcCount + playerCount; local9++) {
			@Pc(31) PathingEntity local31;
			if (local9 == -1) {
				local31 = localPlayer;
			} else if (local9 >= playerCount) {
				local31 = npcs[npcIds[local9 - playerCount]];
			} else {
				local31 = players[playerIds[local9]];
			}
			if (local31 != null && local31.isVisible()) {
				@Pc(60) NpcType local60;
				if (local31 instanceof NpcEntity) {
					local60 = ((NpcEntity) local31).type;
					if (local60.anIntArray154 != null) {
						local60 = local60.method611();
					}
					if (local60 == null) {
						continue;
					}
				}
				if (local9 >= playerCount) {
					local60 = ((NpcEntity) local31).type;
					if (local60.anInt773 >= 0 && local60.anInt773 < Static53.aClass2_Sub2_Sub2_Sub4Array8.length) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (projectX > -1) {
							Static53.aClass2_Sub2_Sub2_Sub4Array8[local60.anInt773].draw(projectX - 12, projectY - 30);
						}
					}
					if (hintType == 1 && Static1.anInt1989 == npcIds[local9 - playerCount] && loopCycle % 20 < 10) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (projectX > -1) {
							aClass2_Sub2_Sub2_Sub4Array10[0].draw(projectX - 12, projectY + -28);
						}
					}
				} else {
					@Pc(77) PlayerEntity local77 = (PlayerEntity) local31;
					local79 = 30;
					if (local77.anInt1380 != -1 || local77.anInt1370 != -1) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (projectX > -1) {
							if (local77.anInt1380 != -1) {
								Static41.aClass2_Sub2_Sub2_Sub4Array6[local77.anInt1380].draw(projectX - 12, projectY + -30);
								local79 += 25;
							}
							if (local77.anInt1370 != -1) {
								Static53.aClass2_Sub2_Sub2_Sub4Array8[local77.anInt1370].draw(projectX - 12, projectY - local79);
								local79 += 25;
							}
						}
					}
					if (local9 >= 0 && hintType == 10 && Static1.anInt2353 == playerIds[local9]) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (projectX > -1) {
							aClass2_Sub2_Sub2_Sub4Array10[1].draw(projectX - 12, -local79 + projectY);
						}
					}
				}
				if (local31.aClass40_660 != null && (playerCount <= local9 || Static1.anInt583 == 0 || Static1.anInt583 == 3 || Static1.anInt583 == 1 && Static36.method729(((PlayerEntity) local31).name))) {
					Static95.method1649(local31.anInt2310, local31);
					if (projectX > -1 && chatCount < Static1.anInt2457) {
						Static1.anIntArray537[chatCount] = fondBold12.method568(local31.aClass40_660) / 2;
						Static1.anIntArray539[chatCount] = fondBold12.anInt715;
						Static1.anIntArray541[chatCount] = projectX;
						Static1.anIntArray535[chatCount] = projectY;
						Static1.anIntArray538[chatCount] = local31.anInt2301;
						Static1.anIntArray542[chatCount] = local31.anInt2271;
						Static1.anIntArray540[chatCount] = local31.anInt2294;
						Static1.aClass40Array39[chatCount] = local31.aClass40_660;
						chatCount++;
					}
				}
				if (local31.anInt2315 > loopCycle) {
					Static95.method1649(local31.anInt2310 + 15, local31);
					if (projectX > -1) {
						local79 = local31.anInt2298 * 30 / local31.anInt2279;
						if (local79 > 30) {
							local79 = 30;
						}
						Static25.method1612(projectX - 15, projectY + -3, local79, 5, 65280);
						Static25.method1612(local79 + projectX - 15, projectY - 3, 30 - local79, 5, 16711680);
					}
				}
				for (local79 = 0; local79 < 4; local79++) {
					if (loopCycle < local31.anIntArray494[local79]) {
						Static95.method1649(local31.anInt2310 / 2, local31);
						if (projectX > -1) {
							if (local79 == 1) {
								projectY -= 20;
							}
							if (local79 == 2) {
								projectY -= 10;
								projectX -= 15;
							}
							if (local79 == 3) {
								projectY -= 10;
								projectX += 15;
							}
							Static27.aClass2_Sub2_Sub2_Sub4Array4[local31.anIntArray495[local79]].draw(projectX - 12, projectY + -12);
							Static70.aClass2_Sub2_Sub2_Sub2_4.method566(Static48.method859(local31.anIntArray493[local79]), projectX, projectY + 4, 0);
							Static70.aClass2_Sub2_Sub2_Sub2_4.method566(Static48.method859(local31.anIntArray493[local79]), projectX - 1, projectY + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(498) int local498 = 0; local498 < chatCount; local498++) {
			local79 = Static1.anIntArray541[local498];
			@Pc(508) int local508 = Static1.anIntArray535[local498];
			@Pc(512) int local512 = Static1.anIntArray537[local498];
			@Pc(516) int local516 = Static1.anIntArray539[local498];
			@Pc(518) boolean local518 = true;
			while (local518) {
				local518 = false;
				for (@Pc(524) int local524 = 0; local524 < local498; local524++) {
					if (Static1.anIntArray535[local524] - Static1.anIntArray539[local524] < local508 - -2 && local508 - local516 < Static1.anIntArray535[local524] + 2 && local79 - local512 < Static1.anIntArray541[local524] - -Static1.anIntArray537[local524] && Static1.anIntArray541[local524] - Static1.anIntArray537[local524] < local512 + local79 && Static1.anIntArray535[local524] - Static1.anIntArray539[local524] < local508) {
						local508 = Static1.anIntArray535[local524] - Static1.anIntArray539[local524];
						local518 = true;
					}
				}
			}
			projectX = Static1.anIntArray541[local498];
			projectY = Static1.anIntArray535[local498] = local508;
			@Pc(627) JagString local627 = Static1.aClass40Array39[local498];
			if (Static1.anInt1186 == 0) {
				@Pc(634) int local634 = 16776960;
				if (Static1.anIntArray538[local498] < 6) {
					local634 = Static1.anIntArray519[Static1.anIntArray538[local498]];
				}
				if (Static1.anIntArray538[local498] == 6) {
					local634 = sceneCycle % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static1.anIntArray538[local498] == 7) {
					local634 = sceneCycle % 20 >= 10 ? 65535 : 255;
				}
				if (Static1.anIntArray538[local498] == 8) {
					local634 = sceneCycle % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(703) int local703;
				if (Static1.anIntArray538[local498] == 9) {
					local703 = 150 - Static1.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 1280 + 16711680;
					} else if (local703 < 100) {
						local634 = 16776960 - (local703 - 50) * 327680;
					} else if (local703 < 150) {
						local634 = (local703 - 100) * 5 + 65280;
					}
				}
				if (Static1.anIntArray538[local498] == 10) {
					local703 = 150 - Static1.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 5 + 16711680;
					} else if (local703 < 100) {
						local634 = 16384000 + 16711935 - local703 * 327680;
					} else if (local703 < 150) {
						local634 = local703 * 327680 + 255 + 500 - local703 * 5 - 32768000;
					}
				}
				if (Static1.anIntArray538[local498] == 11) {
					local703 = 150 - Static1.anIntArray540[local498];
					if (local703 < 50) {
						local634 = 16777215 - local703 * 327685;
					} else if (local703 < 100) {
						local634 = local703 * 327685 - 16318970;
					} else if (local703 < 150) {
						local634 = 32768000 + 16777215 - local703 * 327680;
					}
				}
				if (Static1.anIntArray542[local498] == 0) {
					fondBold12.method566(local627, projectX, projectY + 1, 0);
					fondBold12.method566(local627, projectX, projectY, local634);
				}
				if (Static1.anIntArray542[local498] == 1) {
					fondBold12.method564(local627, projectX, projectY + 1, 0, sceneCycle);
					fondBold12.method564(local627, projectX, projectY, local634, sceneCycle);
				}
				if (Static1.anIntArray542[local498] == 2) {
					fondBold12.method570(local627, projectX, projectY + 1, 0, sceneCycle);
					fondBold12.method570(local627, projectX, projectY, local634, sceneCycle);
				}
				if (Static1.anIntArray542[local498] == 3) {
					fondBold12.method577(local627, projectX, projectY + 1, 0, sceneCycle, 150 - Static1.anIntArray540[local498]);
					fondBold12.method577(local627, projectX, projectY, local634, sceneCycle, 150 - Static1.anIntArray540[local498]);
				}
				@Pc(971) int local971;
				if (Static1.anIntArray542[local498] == 4) {
					local703 = fondBold12.method568(local627);
					local971 = (local703 + 100) * (150 - Static1.anIntArray540[local498]) / 150;
					Static25.method1613(projectX - 50, 0, projectX + 50, 334);
					fondBold12.drawString(local627, projectX + 50 - local971, projectY - -1, 0);
					fondBold12.drawString(local627, projectX + 50 - local971, projectY, local634);
					Static25.method1614();
				}
				if (Static1.anIntArray542[local498] == 5) {
					local703 = 150 - Static1.anIntArray540[local498];
					Static25.method1613(0, projectY - fondBold12.anInt715 - 1, 512, projectY + 5);
					local971 = 0;
					if (local703 < 25) {
						local971 = local703 - 25;
					} else if (local703 > 125) {
						local971 = local703 - 125;
					}
					fondBold12.method566(local627, projectX, local971 + projectY + 1, 0);
					fondBold12.method566(local627, projectX, projectY + local971, local634);
					Static25.method1614();
				}
			} else {
				fondBold12.method566(local627, projectX, projectY + 1, 0);
				fondBold12.method566(local627, projectX, projectY, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 79)
	public static void drawTileHint() {
		if (hintType == 2) {
			projectFromGround(hintHeight * 2, (hintTileX - sceneBaseTileX << 7) + hintOffsetX, hintOffsetY + (-sceneBaseTileZ + hintTileZ << 7));
			if (projectX > -1 && loopCycle % 20 < 10) {
				aClass2_Sub2_Sub2_Sub4Array10[0].draw(projectX - 12, projectY + -28);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 222)
	public static void draw3DEntityElements() {
		drawPrivateMessages();
		if (crossMode == 1) {
			imageCrosses[crossCycle / 100].draw(anInt1554 - 8 - 4, anInt2465 - 8 + -4);
		}
		if (crossMode == 2) {
			imageCrosses[crossCycle / 100 + 4].draw(anInt1554 - 8 - 4, anInt2465 + -8 + -4);
		}
		if (viewportInterfaceId != -1) {
			updateInterfaceAnimation(viewportInterfaceId);
			drawInterface(0, -1, viewportInterfaceId, 4, 0, 334, 0, 512);
		}
		if (anInt2585 != -1) {
			updateInterfaceAnimation(anInt2585);
			drawInterface(0, -1, anInt2585, 0, 0, 334, 0, 512);
		}
		drawWildyLevel();
		if (!menuVisible) {
			handleInput();
			drawTooltip();
		} else if (menuArea == 0) {
			drawMenu();
		}
		if (Static1.inMultizone == 1) {
			aClass2_Sub2_Sub2_Sub4_7.draw(472, 296);
		}
		@Pc(158) int local158;
		if (Static1.aBoolean173) {
			@Pc(118) byte local118 = 20;
			@Pc(120) int local120 = 16776960;
			if (Static1.anInt1695 < 30 && lowMemory) {
				local120 = 16711680;
			}
			if (Static1.anInt1695 < 20 && !lowMemory) {
				local120 = 16711680;
			}
			fontPlain12.method572(JagString.concatenate(new JagString[] { JagString.aClass40_676, Static48.method859(Static1.anInt1695) }), 20, local120);
			local120 = 16776960;
			local158 = local118 + 15;
			@Pc(160) Runtime local160 = Runtime.getRuntime();
			@Pc(170) int local170 = (int) ((local160.totalMemory() - local160.freeMemory()) / 1024L);
			if (local170 > 32768 && lowMemory) {
				local120 = 16711680;
			}
			if (local170 > 65536 && !lowMemory) {
				local120 = 16711680;
			}
			fontPlain12.method572(JagString.concatenate(new JagString[] { JagString.aClass40_44, Static48.method859(local170), JagString.aClass40_668 }), 35, local120);
			local158 += 15;
			if (Static1.aBoolean13) {
				fontPlain12.method572(JagString.aClass40_735, 50, 16711680);
				local158 += 15;
				Static1.aBoolean13 = false;
			}
			if (Static1.aBoolean23) {
				fontPlain12.method572(JagString.aClass40_481, local158, 16711680);
				Static1.aBoolean23 = false;
				local158 += 15;
			}
			if (Static1.aBoolean165) {
				fontPlain12.method572(JagString.aClass40_435, local158, 16711680);
				local158 += 15;
				Static1.aBoolean165 = false;
			}
		}

        if (systemUpdateTimer != 0) {
            @Pc(254) int local254 = systemUpdateTimer / 50;
            local158 = local254 / 60;
            @Pc(262) int local262 = local254 % 60;
            if (local262 >= 10) {
                fontPlain12.drawString(JagString.concatenate(new JagString[] { JagString.SYSTEM_UPDATE_IN, Static48.method859(local158), JagString.aClass40_673, Static48.method859(local262) }), 4, 329, 16776960);
            } else {
                fontPlain12.drawString(JagString.concatenate(new JagString[] { JagString.SYSTEM_UPDATE_IN, Static48.method859(local158), JagString.aClass40_135, Static48.method859(local262) }), 4, 329, 16776960);
            }
        }
    }

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 94)
	public static void drawPrivateMessages() {
		if (Static1.anInt2473 == 0) {
			return;
		}
		@Pc(13) PixFont local13 = fontPlain12;
		@Pc(15) int local15 = 0;
		if (systemUpdateTimer != 0) {
			local15 = 1;
		}
		for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
			if (aClass40Array30[local26] != null) {
				@Pc(36) int local36 = messageType[local26];
				@Pc(40) JagString local40 = aClass40Array40[local26];
				@Pc(42) byte local42 = 0;
				if (local40 != null && local40.method1168(JagString.aClass40_323)) {
					local42 = 1;
					local40 = local40.method1185(5);
				}
				if (local40 != null && local40.method1168(JagString.aClass40_622)) {
					local42 = 2;
					local40 = local40.method1185(5);
				}
				@Pc(108) int local108;
				if ((local36 == 3 || local36 == 7) && (local36 == 7 || Static1.anInt2515 == 0 || Static1.anInt2515 == 1 && Static36.method729(local40))) {
					local108 = 329 - local15 * 13;
					local15++;
					local13.drawString(JagString.aClass40_340, 4, local108, 0);
					local13.drawString(JagString.aClass40_340, 4, local108 - 1, 65535);
					@Pc(131) int local131 = local13.method568(JagString.aClass40_564) + 4;
					if (local42 == 1) {
						Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(local131, local108 - 12);
						local131 += 14;
					}
					if (local42 == 2) {
						Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local131, local108 - 12);
						local131 += 14;
					}
					local13.drawString(JagString.concatenate(new JagString[] { local40, JagString.aClass40_4, aClass40Array30[local26] }), local131, local108, 0);
					local13.drawString(JagString.concatenate(new JagString[] { local40, JagString.aClass40_4, aClass40Array30[local26] }), local131, local108 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local36 == 5 && Static1.anInt2515 < 2) {
					local108 = 329 - local15 * 13;
					local15++;
					local13.drawString(aClass40Array30[local26], 4, local108, 0);
					local13.drawString(aClass40Array30[local26], 4, local108 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local36 == 6 && Static1.anInt2515 < 2) {
					local108 = 329 - local15 * 13;
					local13.drawString(JagString.concatenate(new JagString[] { JagString.aClass40_690, local40, JagString.aClass40_4, aClass40Array30[local26] }), 4, local108, 0);
					local13.drawString(JagString.concatenate(new JagString[] { JagString.aClass40_690, local40, JagString.aClass40_4, aClass40Array30[local26] }), 4, local108 - 1, 65535);
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZ)V", line = 233)
	public static void setState(@OriginalArg(0) int arg0) {
		if (arg0 == state) {
			return;
		}
		if (state == 0) {
			Static42.method801();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static1.anInt1649 = 0;
			Static1.anInt2039 = 0;
			Static1.anInt693 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static34.aClass25_20 != null) {
			Static34.aClass25_20.close();
		}
		if (state == 25 || state == 40) {
			Static69.method1230();
			Static25.method1610();
		}
		if (state == 25) {
			Static1.anInt805 = 1;
			Static1.anInt1667 = 0;
			Static1.anInt375 = 0;
			Static1.anInt2455 = 1;
			Static1.anInt1080 = 0;
		}
		if (arg0 == 35) {
			Static2.method18();
			Static11.method252();
			if (Static27.aClass45_14 == null) {
				Static27.aClass45_14 = Static75.method1351(765, method185(), 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static27.aClass45_14 = null;
			Static2.method18();
			Static14.method1263(spritesJs5, method185(), binaryJs5);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static27.aClass45_14 = null;
			Static11.method252();
			Static54.method997(spritesJs5, method185());
		}
		state = arg0;
		Static1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z", line = 736)
	public static boolean updateInterfaceAnimation(@OriginalArg(0) int arg0) {
		if (!ComType.method1665(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) ComType[] local17 = ComType.instances[arg0];
		for (@Pc(24) int local24 = 0; local24 < local17.length; local24++) {
			@Pc(30) ComType local30 = local17[local24];
			if (local30 != null && local30.type == 6) {
				@Pc(56) int local56;
				if (local30.anim != -1 || local30.activeAnim != -1) {
					@Pc(51) boolean local51 = executeInterfaceScript(local30);
					if (local51) {
						local56 = local30.activeAnim;
					} else {
						local56 = local30.anim;
					}
					if (local56 != -1) {
						@Pc(71) SeqType local71 = SeqType.method1042(local56);
						local30.anInt1593 += sceneDelta;
						label50: while (true) {
							do {
								do {
									if (local71.delay[local30.anInt1569] >= local30.anInt1593) {
										break label50;
									}
									local13 = true;
									local30.anInt1593 -= local71.delay[local30.anInt1569];
									local30.anInt1569++;
								} while (local30.anInt1569 < local71.anIntArray124.length);
								local30.anInt1569 -= local71.anInt669;
							} while (local30.anInt1569 >= 0 && local30.anInt1569 < local71.anIntArray124.length);
							local30.anInt1569 = 0;
						}
					}
				}
				if (local30.anInt1617 != 0) {
					@Pc(152) int local152 = local30.anInt1617 >> 16;
					local13 = true;
					@Pc(158) int local158 = local152 * sceneDelta;
					local30.xan = local30.xan + local158 & 0x7FF;
					local56 = local30.anInt1617 << 16 >> 16;
					local56 *= sceneDelta;
					local30.yan = local30.yan + local56 & 0x7FF;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)Z", line = 284)
	public static boolean drawInterface(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!ComType.method1665(arg2)) {
			return false;
		}
		Static25.method1613(arg6, arg0, arg7, arg5);
		@Pc(18) boolean local18 = true;
		@Pc(27) ComType[] local27 = ComType.instances[arg2];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(35) ComType local35 = local27[local29];
			if (local35 != null && local35.anInt1611 == arg1) {
				if (local35.clientCode > 0) {
					updateInterfaceContent(local35);
				}
				@Pc(60) int local60 = arg0 + local35.anInt1588 - arg4;
				@Pc(65) int local65 = arg6 + local35.anInt1582;
				if (local35.type == 0) {
					if (local35.hide && !Static31.method614(arg3, local29)) {
						continue;
					}
					if (local35.scroll - local35.height < local35.anInt1587) {
						local35.anInt1587 = local35.scroll - local35.height;
					}
					if (local35.anInt1587 < 0) {
						local35.anInt1587 = 0;
					}
					local18 &= drawInterface(local60, local29, arg2, arg3, local35.anInt1587, local60 + local35.height, local65, local65 + local35.anInt1605);
					Static25.method1613(arg6, arg0, arg7, arg5);
					if (local35.height < local35.scroll) {
						Static35.method711(local35.height, local65 + local35.anInt1605, local35.anInt1587, local60, local35.scroll);
					}
				}
				if (local35.type != 1) {
					@Pc(162) int local162;
					@Pc(166) int local166;
					@Pc(177) int local177;
					@Pc(213) int local213;
					@Pc(222) int local222;
					@Pc(257) int local257;
					@Pc(160) int local160;
					@Pc(215) int local215;
					@Pc(186) int local186;
					if (local35.type == 2) {
						local160 = 0;
						for (local162 = 0; local162 < local35.height; local162++) {
							for (local166 = 0; local166 < local35.anInt1605; local166++) {
								local177 = local166 * (local35.marginX + 32) + local65;
								local186 = (local35.marginY + 32) * local162 + local60;
								if (local160 < 20) {
									local186 += local35.invSlotOffsetY[local160];
									local177 += local35.invSlotOffsetX[local160];
								}
								if (local35.invSlotObjCount[local160] > 0) {
									local213 = 0;
									local215 = 0;
									local222 = local35.invSlotObjCount[local160] - 1;
									if (local177 > Draw2D.anInt2437 - 32 && local177 < Draw2D.anInt2436 && Draw2D.anInt2439 - 32 < local186 && Draw2D.anInt2438 > local186 || objDragArea != 0 && local160 == Static1.anInt2239) {
										local257 = 0;
										if (objSelected == 1 && local160 == Static28.anInt724 && Static97.anInt2526 == (arg2 << 16) + local29) {
											local257 = 16777215;
										}
										@Pc(282) Pix24 local282 = Static55.method1000(local257, local35.invSlotObjId[local160], local222);
										if (local282 == null) {
											local18 = false;
										} else {
											if (objDragArea != 0 && Static1.anInt2239 == local160 && local29 + (arg2 << 16) == objDragInterfaceId) {
												local213 = Mouse.y - objGrabY;
												if (local213 < 5 && local213 > -5) {
													local213 = 0;
												}
												local215 = Mouse.x - objGrabX;
												if (local215 < 5 && local215 > -5) {
													local215 = 0;
												}
												if (objDragCycles < 5) {
													local213 = 0;
													local215 = 0;
												}
												local282.method1618(local177 + local215, local213 + local186);
												if (arg1 != -1) {
													@Pc(395) ComType local395 = local27[arg1];
													@Pc(415) int local415;
													if (Draw2D.anInt2439 > local186 + local213 && local395.anInt1587 > 0) {
														local415 = sceneDelta * (Draw2D.anInt2439 - local186 - local213) / 3;
														if (local415 > sceneDelta * 10) {
															local415 = sceneDelta * 10;
														}
														if (local415 > local395.anInt1587) {
															local415 = local395.anInt1587;
														}
														objGrabY += local415;
														local395.anInt1587 -= local415;
													}
													if (local186 + local213 + 32 > Draw2D.anInt2438 && local395.scroll - local395.height > local395.anInt1587) {
														local415 = sceneDelta * (local213 + local186 + 32 - Draw2D.anInt2438) / 3;
														if (local415 > sceneDelta * 10) {
															local415 = sceneDelta * 10;
														}
														if (local415 > local395.scroll - local395.anInt1587 - local395.height) {
															local415 = local395.scroll - local395.height - local395.anInt1587;
														}
														local395.anInt1587 += local415;
														objGrabY -= local415;
													}
												}
											} else if (selectedArea != 0 && local160 == Static1.anInt1947 && Static1.anInt1171 == local29 + (arg2 << 16)) {
												local282.method1618(local177, local186);
											} else {
												local282.draw(local177, local186);
											}
											if (local282.anInt2445 == 33 || local35.invSlotObjId[local160] != 1) {
												@Pc(543) int local543 = local35.invSlotObjId[local160];
												Static70.aClass2_Sub2_Sub2_Sub2_4.drawString(Static66.method1172(local543), local177 + local215 + 1, local213 + local186 + 10, 0);
												Static70.aClass2_Sub2_Sub2_Sub2_4.drawString(Static66.method1172(local543), local177 + local215, local186 + (9 - -local213), 16776960);
											}
										}
									}
								} else if (local35.invSlotSprite != null && local160 < 20) {
									@Pc(595) Pix24 local595 = local35.method1063(local160);
									if (local595 != null) {
										local595.draw(local177, local186);
									} else if (Static1.aBoolean102) {
										local18 = false;
									}
								}
								local160++;
							}
						}
					} else if (local35.type == 3) {
						if (executeInterfaceScript(local35)) {
							local160 = local35.activeColour;
							if (Static31.method614(arg3, local29) && local35.anInt1583 != 0) {
								local160 = local35.anInt1583;
							}
						} else {
							local160 = local35.colour;
							if (Static31.method614(arg3, local29) && local35.overColour != 0) {
								local160 = local35.overColour;
							}
						}
						if (local35.anInt1604 == 0) {
							if (local35.fill) {
								Static25.method1612(local65, local60, local35.anInt1605, local35.height, local160);
							} else {
								Static25.method1607(local65, local60, local35.anInt1605, local35.height, local160);
							}
						} else if (local35.fill) {
							Static25.method1615(local65, local60, local35.anInt1605, local35.height, local160, 256 - (local35.anInt1604 & 0xFF));
						} else {
							Static25.method1609(local65, local60, local35.anInt1605, local35.height, local160, 256 - (local35.anInt1604 & 0xFF));
						}
					} else {
						@Pc(739) PixFont local739;
						@Pc(843) JagString local843;
						if (local35.type == 4) {
							local739 = Static45.aClass2_Sub2_Sub2_Sub2Array9[local35.font];
							@Pc(742) JagString local742 = local35.text;
							if (executeInterfaceScript(local35)) {
								local162 = local35.activeColour;
								if (Static31.method614(arg3, local29) && local35.anInt1583 != 0) {
									local162 = local35.anInt1583;
								}
								if (local35.activeText.length() > 0) {
									local742 = local35.activeText;
								}
							} else {
								local162 = local35.colour;
								if (Static31.method614(arg3, local29) && local35.overColour != 0) {
									local162 = local35.overColour;
								}
							}
							if (local35.buttonType == 6 && Static1.aBoolean40) {
								local742 = JagString.aClass40_361;
								local162 = local35.colour;
							}
							if (Static25.anInt2440 == 479) {
								if (local162 == 16776960) {
									local162 = 255;
								}
								if (local162 == 49152) {
									local162 = 16777215;
								}
							}
							local742 = method94(local35, local742);
							local186 = local739.anInt715 + local60;
							while (local742.length() > 0) {
								local215 = local742.method1200(JagString.aClass40_710);
								if (local215 == -1) {
									local843 = local742;
									local742 = JagString.EMPTY_STRING;
								} else {
									local843 = local742.method1180(local215, 0);
									local742 = local742.method1185(local215 + 2);
								}
								if (local35.center) {
									local739.method578(local843, local35.anInt1605 / 2 + local65, local186, local162, local35.shadowed);
								} else {
									local739.method574(local843, local65, local186, local162, local35.shadowed);
								}
								local186 += local739.anInt715;
							}
						} else if (local35.type == 5) {
							@Pc(913) Pix24 local913 = local35.method1061(executeInterfaceScript(local35));
							if (local913 != null) {
								local913.draw(local65, local60);
							} else if (Static1.aBoolean102) {
								local18 = false;
							}
						} else if (local35.type == 6) {
							Static6.method177(local35.anInt1605 / 2 + local65, local60 + local35.height / 2);
							local160 = local35.zoom * Draw3D.sin[local35.xan] >> 16;
							local162 = Draw3D.cos[local35.xan] * local35.zoom >> 16;
							@Pc(970) boolean local970 = executeInterfaceScript(local35);
							if (local970) {
								local177 = local35.activeAnim;
							} else {
								local177 = local35.anim;
							}
							@Pc(992) Model local992;
							if (local35.anInt1607 == 5) {
								local992 = Static1.aClass33_1.method1005(-1, -1, null, null);
							} else if (local177 == -1) {
								local992 = local35.method1057(null, local970, localPlayer.aClass33_2, -1);
								if (local992 == null && Static1.aBoolean102) {
									local18 = false;
								}
							} else {
								@Pc(1002) SeqType local1002 = SeqType.method1042(local177);
								local992 = local35.method1057(local1002, local970, localPlayer.aClass33_2, local35.anInt1569);
								if (local992 == null && Static1.aBoolean102) {
									local18 = false;
								}
							}
							if (local992 != null) {
								local992.method1151(local35.yan, 0, local35.xan, 0, local160, local162);
							}
							Static6.method178();
						} else {
							if (local35.type == 7) {
								local739 = Static45.aClass2_Sub2_Sub2_Sub2Array9[local35.font];
								local162 = 0;
								for (local166 = 0; local166 < local35.height; local166++) {
									for (local177 = 0; local177 < local35.anInt1605; local177++) {
										if (local35.invSlotObjCount[local162] > 0) {
											@Pc(1088) ObjType local1088 = ObjType.method1669(local35.invSlotObjCount[local162] - 1);
											@Pc(1091) JagString local1091 = local1088.aClass40_290;
											if (local1091 == null) {
												local1091 = JagString.aClass40_359;
											}
											if (local1088.aBoolean67 || local35.invSlotObjId[local162] != 1) {
												local1091 = JagString.concatenate(new JagString[] { local1091, JagString.aClass40_454, Static51.method1542(local35.invSlotObjId[local162]) });
											}
											local213 = local65 + (local35.marginX + 115) * local177;
											local222 = local60 + local166 * (local35.marginY + 12);
											if (local35.center) {
												local739.method578(local1091, local213 + local35.anInt1605 / 2, local222, local35.colour, local35.shadowed);
											} else {
												local739.method574(local1091, local213, local222, local35.colour, local35.shadowed);
											}
										}
										local162++;
									}
								}
							}
							if (local35.type == 8 && Static89.method1564(arg3, local29) && Static1.anInt1645 == 100) {
								local160 = 0;
								local162 = 0;
								@Pc(1210) PixFont local1210 = fontPlain12;
								local843 = local35.text;
								local843 = method94(local35, local843);
								@Pc(1231) JagString local1231;
								while (local843.length() > 0) {
									local215 = local843.method1200(JagString.aClass40_710);
									if (local215 == -1) {
										local1231 = local843;
										local843 = JagString.EMPTY_STRING;
									} else {
										local1231 = local843.method1180(local215, 0);
										local843 = local843.method1185(local215 + 2);
									}
									local213 = local1210.method576(local1231);
									local162 += local1210.anInt715 + 1;
									if (local213 > local160) {
										local160 = local213;
									}
								}
								local162 += 7;
								local160 += 6;
								local213 = local35.height + local60 + 5;
								if (arg5 < local213 + local162) {
									local213 = arg5 - local162;
								}
								local215 = local65 + local35.anInt1605 - local160 - 5;
								if (local215 < local65 + 5) {
									local215 = local65 + 5;
								}
								if (local215 + local160 > arg7) {
									local215 = arg7 - local160;
								}
								Static25.method1612(local215, local213, local160, local162, 16777120);
								Static25.method1607(local215, local213, local160, local162, 0);
								local222 = local1210.anInt715 + local213 + 2;
								local843 = local35.text;
								local843 = method94(local35, local843);
								while (local843.length() > 0) {
									local257 = local843.method1200(JagString.aClass40_710);
									if (local257 == -1) {
										local1231 = local843;
										local843 = JagString.EMPTY_STRING;
									} else {
										local1231 = local843.method1180(local257, 0);
										local843 = local843.method1185(local257 + 2);
									}
									local1210.method574(local1231, local215 + 3, local222, 0, false);
									local222 += local1210.anInt715 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!o;IIIZI)V", line = 240)
	public static void method402(@OriginalArg(0) JagString arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (menuSize >= 500) {
			return;
		}
		menuOption[menuSize] = arg0;
		menuAction[menuSize] = arg1;
		Static1.anIntArray454[menuSize] = arg4;
		Static1.anIntArray161[menuSize] = arg3;
		Static1.anIntArray165[menuSize] = arg2;
		menuSize++;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 349)
	public static void drawMenu() {
		@Pc(3) int local3 = Static44.anInt1110;
		@Pc(9) int local9 = Static99.anInt2497;
		@Pc(11) int local11 = Static14.anInt1856;
		@Pc(18) int local18 = Static91.anInt120;
		Static25.method1612(local3, local9, local11, local18, 6116423);
		Static25.method1612(local3 + 1, local9 + 1, local11 - 2, 16, 0);
		Static25.method1607(local3 + 1, local9 + 18, local11 - 2, local18 - 19, 0);
		fondBold12.drawString(JagString.aClass40_524, local3 + 3, local9 + 14, 6116423);
		@Pc(64) int local64 = Mouse.x;
		@Pc(66) int local66 = Mouse.y;
		if (menuArea == 0) {
			local66 -= 4;
			local64 -= 4;
		}
		if (menuArea == 1) {
			local66 -= 205;
			local64 -= 553;
		}
		if (menuArea == 2) {
			local66 -= 357;
			local64 -= 17;
		}
		for (@Pc(84) int local84 = 0; local84 < menuSize; local84++) {
			@Pc(99) int local99 = (menuSize - local84 - 1) * 15 + local9 + 31;
			@Pc(101) int local101 = 16777215;
			if (local64 > local3 && local64 < local3 + local11 && local66 > local99 - 13 && local99 + 3 > local66) {
				local101 = 16776960;
			}
			fondBold12.method574(menuOption[local84], local3 + 3, local99, local101, true);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)V", line = 55)
	public static void projectFromGround(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			projectX = -1;
			projectY = -1;
			return;
		}
		@Pc(34) int local34 = getHeightmapY(currentLevel, arg1, arg2) - arg0;
		@Pc(38) int local38 = arg1 - cameraX;
		@Pc(42) int local42 = arg2 - cameraZ;
		@Pc(46) int local46 = Model.sin[cameraPitch];
		@Pc(50) int local50 = Model.cos[cameraPitch];
		@Pc(54) int local54 = local34 - cameraY;
		@Pc(58) int local58 = Model.sin[cameraYaw];
		@Pc(62) int local62 = Model.cos[cameraYaw];
		@Pc(73) int local73 = local58 * local42 + local38 * local62 >> 16;
		@Pc(84) int local84 = local62 * local42 - local58 * local38 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(97) int local97 = local54 * local50 - local84 * local46 >> 16;
		@Pc(108) int local108 = local54 * local46 + local84 * local50 >> 16;
		if (local108 < 50) {
			projectY = -1;
			projectX = -1;
		} else {
			projectY = (local97 << 9) / local108 + 167;
			projectX = (local86 << 9) / local108 + 256;
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V", line = 104)
	public static void readNpcs() {
		in.bits();
		@Pc(13) int local13 = in.gBit(8);
		if (npcCount > local13) {
			for (@Pc(18) int local18 = local13; local18 < npcCount; local18++) {
				Static1.entityRemovalIds[entityRemovalCount++] = npcIds[local18];
			}
		}
		if (npcCount < local13) {
			throw new RuntimeException("gnpov1");
		}
		npcCount = 0;
		for (@Pc(62) int local62 = 0; local62 < local13; local62++) {
			@Pc(68) int local68 = npcIds[local62];
			@Pc(72) NpcEntity local72 = npcs[local68];
			@Pc(77) int local77 = in.gBit(1);
			if (local77 == 0) {
				npcIds[npcCount++] = local68;
				local72.anInt2274 = loopCycle;
			} else {
				@Pc(97) int local97 = in.gBit(2);
				if (local97 == 0) {
					npcIds[npcCount++] = local68;
					local72.anInt2274 = loopCycle;
					entityUpdateIds[entityUpdateCount++] = local68;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						npcIds[npcCount++] = local68;
						local72.anInt2274 = loopCycle;
						local139 = in.gBit(3);
						local72.method1547(local139, false);
						local149 = in.gBit(1);
						if (local149 == 1) {
							entityUpdateIds[entityUpdateCount++] = local68;
						}
					} else if (local97 == 2) {
						npcIds[npcCount++] = local68;
						local72.anInt2274 = loopCycle;
						local139 = in.gBit(3);
						local72.method1547(local139, true);
						local149 = in.gBit(3);
						local72.method1547(local149, true);
						@Pc(203) int local203 = in.gBit(1);
						if (local203 == 1) {
							entityUpdateIds[entityUpdateCount++] = local68;
						}
					} else if (local97 == 3) {
						Static1.entityRemovalIds[entityRemovalCount++] = local68;
					}
				}
			}
		}
	}

	// todo: rename to getNpcPos (gnp)
	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V", line = 289)
	public static void readNpcInfo() {
		entityUpdateCount = 0;
		entityRemovalCount = 0;
		readNpcs();
		readNewNpcs();
		readNpcUpdates();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < entityRemovalCount; local22++) {
			local28 = Static1.entityRemovalIds[local22];
			if (loopCycle != npcs[local28].anInt2274) {
				npcs[local28].type = null;
				npcs[local28] = null;
			}
		}
		if (in.pos != packetSize) {
			throw new RuntimeException("gnp1 pos:" + in.pos + " psize:" + packetSize);
		}
		for (local28 = 0; local28 < npcCount; local28++) {
			if (npcs[npcIds[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + npcCount);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 225)
	public static void readNewNpcs() {
		while (true) {
			if (in.bitsAvailable(packetSize) >= 26) {
				@Pc(17) int local17 = in.gBit(14);
				if (local17 != 16383) {
					if (npcs[local17] == null) {
						npcs[local17] = new NpcEntity();
					}
					@Pc(34) NpcEntity local34 = npcs[local17];
					npcIds[npcCount++] = local17;
					local34.anInt2274 = loopCycle;
					@Pc(50) int local50 = in.gBit(5);
					if (local50 > 15) {
						local50 -= 32;
					}
					@Pc(61) int local61 = in.gBit(1);
					local34.type = NpcType.method640(in.gBit(13));
					@Pc(78) int local78 = in.gBit(5);
					@Pc(85) int local85 = in.gBit(1);
					if (local85 == 1) {
						entityUpdateIds[entityUpdateCount++] = local17;
					}
					local34.seqStandId = local34.type.anInt767;
					local34.anInt2303 = local34.type.anInt764;
					local34.anInt2322 = local34.type.anInt761;
					local34.anInt2304 = local34.type.anInt771;
					local34.anInt2285 = local34.type.anInt769;
					local34.size = local34.type.size;
					if (local78 > 15) {
						local78 -= 32;
					}
					local34.anInt2269 = local34.type.anInt777;
					local34.method1545(local61 == 1, localPlayer.pathTileZ[0] + local78, local50 + localPlayer.pathTileX[0]);
					continue;
				}
			}
			in.bytes();
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V", line = 17)
	public static void readNpcUpdates() {
		for (@Pc(16) int local16 = 0; local16 < entityUpdateCount; local16++) {
			@Pc(22) int local22 = entityUpdateIds[local16];
			@Pc(26) NpcEntity local26 = npcs[local22];
			@Pc(30) int local30 = in.g1();
			if ((local30 & 0x20) != 0) {
				local26.anInt2324 = in.g2();
				if (local26.anInt2324 == 65535) {
					local26.anInt2324 = -1;
				}
			}
			@Pc(57) int local57;
			@Pc(61) int local61;
			if ((local30 & 0x40) != 0) {
				local57 = in.g1_alt2();
				local61 = in.g1_alt1();
				local26.method1540(local57, loopCycle, local61);
				local26.anInt2315 = loopCycle + 300;
				local26.anInt2298 = in.g1_alt3();
				local26.anInt2279 = in.g1_alt2();
			}
			if ((local30 & 0x8) != 0) {
				local57 = in.g2_alt2();
				local61 = in.g1();
				if (local57 == 65535) {
					local57 = -1;
				}
				if (local57 == local26.primarySeqId && local57 != -1) {
					@Pc(115) int local115 = SeqType.method1042(local57).anInt662;
					if (local115 == 1) {
						local26.anInt2316 = 0;
						local26.anInt2267 = 0;
						local26.primarySeqDelay = local61;
						local26.anInt2300 = 0;
					}
					if (local115 == 2) {
						local26.anInt2300 = 0;
					}
				} else if (local57 == -1 || local26.primarySeqId == -1 || SeqType.method1042(local57).anInt658 >= SeqType.method1042(local26.primarySeqId).anInt658) {
					local26.anInt2316 = 0;
					local26.anInt2300 = 0;
					local26.anInt2267 = 0;
					local26.primarySeqId = local57;
					local26.anInt2281 = local26.pathLength;
					local26.primarySeqDelay = local61;
				}
			}
			if ((local30 & 0x1) != 0) {
				local57 = in.g1_alt2();
				local61 = in.g1_alt1();
				local26.method1540(local57, loopCycle, local61);
				local26.anInt2315 = loopCycle + 300;
				local26.anInt2298 = in.g1();
				local26.anInt2279 = in.g1_alt2();
			}
			if ((local30 & 0x80) != 0) {
				local26.anInt2302 = in.g2_alt3();
				local57 = in.g4s_alt3();
				local26.anInt2320 = loopCycle + (local57 & 0xFFFF);
				local26.anInt2289 = local57 >> 16;
				local26.anInt2291 = 0;
				if (local26.anInt2320 > loopCycle) {
					local26.anInt2291 = -1;
				}
				if (local26.anInt2302 == 65535) {
					local26.anInt2302 = -1;
				}
				local26.anInt2268 = 0;
			}
			if ((local30 & 0x2) != 0) {
				local26.aClass40_660 = in.gjstr();
				local26.anInt2294 = 100;
			}
			if ((local30 & 0x4) != 0) {
				local26.type = NpcType.method640(in.g2());
				local26.seqStandId = local26.type.anInt767;
				local26.anInt2269 = local26.type.anInt777;
				local26.anInt2304 = local26.type.anInt771;
				local26.anInt2285 = local26.type.anInt769;
				local26.size = local26.type.size;
				local26.anInt2322 = local26.type.anInt761;
				local26.anInt2303 = local26.type.anInt764;
			}
			if ((local30 & 0x10) != 0) {
				local26.anInt2280 = in.g2();
				local26.anInt2292 = in.g2_alt1();
			}
		}
	}

	// todo: rename to getPlayerPos (gpp)
	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 84)
	public static void readPlayerInfo() {
		entityRemovalCount = 0;
		entityUpdateCount = 0;
		readLocalPlayer();
		readPlayers();
		readNewPlayers();
		readPlayerUpdates();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < entityRemovalCount; local23++) {
			local29 = Static1.entityRemovalIds[local23];
			if (players[local29].anInt2274 != loopCycle) {
				players[local29] = null;
			}
		}
		if (packetSize != in.pos) {
			throw new RuntimeException("gpp1 pos:" + in.pos + " psize:" + packetSize);
		}
		for (local29 = 0; local29 < playerCount; local29++) {
			if (players[playerIds[local29]] == null) {
				throw new RuntimeException("gpp2 pos:" + local29 + " size:" + playerCount);
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 463)
	public static void readLocalPlayer() {
		in.bits();
		@Pc(11) int local11 = in.gBit(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = in.gBit(2);
		if (local19 == 0) {
			entityUpdateIds[entityUpdateCount++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local19 == 1) {
			local41 = in.gBit(3);
			localPlayer.method1547(local41, false);
			local51 = in.gBit(1);
			if (local51 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local19 == 2) {
			local41 = in.gBit(3);
			localPlayer.method1547(local41, true);
			local51 = in.gBit(3);
			localPlayer.method1547(local51, true);
			local93 = in.gBit(1);
			if (local93 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
		} else if (local19 == 3) {
			local41 = in.gBit(7);
			currentLevel = in.gBit(2);
			local51 = in.gBit(1);
			if (local51 == 1) {
				entityUpdateIds[entityUpdateCount++] = 2047;
			}
			local93 = in.gBit(1);
			@Pc(149) int local149 = in.gBit(7);
			localPlayer.method1545(local93 == 1, local41, local149);
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 120)
	public static void readPlayers() {
		@Pc(10) int local10 = in.gBit(8);
		@Pc(20) int local20;
		if (playerCount > local10) {
			for (local20 = local10; local20 < playerCount; local20++) {
				Static1.entityRemovalIds[entityRemovalCount++] = playerIds[local20];
			}
		}
		if (local10 > playerCount) {
			throw new RuntimeException("gppov1");
		}
		playerCount = 0;
		for (local20 = 0; local20 < local10; local20++) {
			@Pc(62) int local62 = playerIds[local20];
			@Pc(66) PlayerEntity local66 = players[local62];
			@Pc(71) int local71 = in.gBit(1);
			if (local71 == 0) {
				playerIds[playerCount++] = local62;
				local66.anInt2274 = loopCycle;
			} else {
				@Pc(91) int local91 = in.gBit(2);
				if (local91 == 0) {
					playerIds[playerCount++] = local62;
					local66.anInt2274 = loopCycle;
					entityUpdateIds[entityUpdateCount++] = local62;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local91 == 1) {
						playerIds[playerCount++] = local62;
						local66.anInt2274 = loopCycle;
						local138 = in.gBit(3);
						local66.method1547(local138, false);
						local148 = in.gBit(1);
						if (local148 == 1) {
							entityUpdateIds[entityUpdateCount++] = local62;
						}
					} else if (local91 == 2) {
						playerIds[playerCount++] = local62;
						local66.anInt2274 = loopCycle;
						local138 = in.gBit(3);
						local66.method1547(local138, true);
						local148 = in.gBit(3);
						local66.method1547(local148, true);
						@Pc(206) int local206 = in.gBit(1);
						if (local206 == 1) {
							entityUpdateIds[entityUpdateCount++] = local62;
						}
					} else if (local91 == 3) {
						Static1.entityRemovalIds[entityRemovalCount++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 117)
	public static void readNewPlayers() {
		while (true) {
			if (in.bitsAvailable(packetSize) >= 11) {
				@Pc(14) int local14 = in.gBit(11);
				if (local14 != 2047) {
					if (players[local14] == null) {
						players[local14] = new PlayerEntity();
						if (Static1.aClass2_Sub3Array1[local14] != null) {
							players[local14].method918(Static1.aClass2_Sub3Array1[local14]);
						}
					}
					playerIds[playerCount++] = local14;
					@Pc(51) PlayerEntity local51 = players[local14];
					local51.anInt2274 = loopCycle;
					@Pc(59) int local59 = in.gBit(5);
					if (local59 > 15) {
						local59 -= 32;
					}
					@Pc(68) int local68 = in.gBit(5);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(79) int local79 = in.gBit(1);
					if (local79 == 1) {
						entityUpdateIds[entityUpdateCount++] = local14;
					}
					@Pc(97) int local97 = in.gBit(1);
					local51.method1545(local97 == 1, localPlayer.pathTileZ[0] + local59, local68 + localPlayer.pathTileX[0]);
					continue;
				}
			}
			in.bytes();
			return;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 9)
	private static void method1396() {
		areaSidebar.bind();
		Static14.aClass2_Sub2_Sub2_Sub3_19.method1320(0, 0);
		Static3.anIntArray4 = Static6.method175(Static3.anIntArray4);
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V", line = 95)
	public static void drawSidebar() {
		Static1.aBoolean13 = true;
		method1396();
		@Pc(29) boolean local29;
		if (sidebarInterfaceId != -1) {
			local29 = drawInterface(0, -1, sidebarInterfaceId, 1, 0, 261, 0, 190);
			if (!local29) {
				redrawSidebar = true;
			}
		} else if (tabInterfaceId[selectedTab] != -1) {
			local29 = drawInterface(0, -1, tabInterfaceId[selectedTab], 1, 0, 261, 0, 190);
			if (!local29) {
				redrawSidebar = true;
			}
		}
		if (menuVisible && menuArea == 1) {
			drawMenu();
		}
		drawAreaSidebar(graphics);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Graphics;)V", line = 630)
	public static void drawAreaSidebar(@OriginalArg(1) Graphics arg0) {
		areaSidebar.draw(arg0, 553, 205);
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V", line = 97)
	public static void method820() {
		FloorOverlayType.clear();
		FloorUnderlayType.clear();
		IdkType.clear();
		LocType.clear();
		NpcType.clear();
		ObjType.clear();
		SeqType.clear();
		SpotAnimType.clear();
		Static70.clear();
		VarpType.clear();
		PlayerAppearance.clear();
		ComType.clear();
		((Js5TextureProvider) Draw3D.getProvider).clear();
		animsJs5.method57();
		basesJs5.method57();
		interfacesJs5.method57();
		synthSoundsJs5.method57();
		mapsJs5.method57();
		midiSongsJs5.method57();
		modelsJs5.method57();
		spritesJs5.method57();
		texturesJs5.method57();
		binaryJs5.method57();
		midiJinglesJs5.method57();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 55)
	public static void method1406() {
		Static1.anInt2328 = 0;
		flagSceneTileX = 0;
		lastPacketType0 = -1;
		lastPacketType1 = -1;
		out.pos = 0;
		idleNetCycles = 0;
		packetType = -1;
		systemUpdateTimer = 0;
		menuSize = 0;
		packetSize = 0;
		lastPacketType2 = -1;
		menuVisible = false;
		in.pos = 0;
		setState(30);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!vb;I)V", line = 82)
	public static void drawOnMinimap(@OriginalArg(0) int arg0, @OriginalArg(2) Pix24 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = minimapAnticheatAngle + orbitCameraYaw & 0x7FF;
		@Pc(20) int local20 = arg2 * arg2 + arg0 * arg0;
		if (local20 > 6400) {
			return;
		}
		@Pc(35) int local35 = Model.cos[local12];
		@Pc(43) int local43 = local35 * 256 / (Static1.anInt1857 + 256);
		@Pc(47) int local47 = Model.sin[local12];
		@Pc(55) int local55 = local47 * 256 / (Static1.anInt1857 + 256);
		@Pc(66) int local66 = arg2 * local43 - arg0 * local55 >> 16;
		@Pc(76) int local76 = arg2 * local55 + arg0 * local43 >> 16;
		if (local20 <= 2500) {
			arg1.draw(local76 + 94 + 4 - arg1.anInt2445 / 2, -local66 + -4 + (83 - arg1.anInt2443 / 2));
		} else {
			arg1.method1622(imageMapback, local76 + 4 + 94 - arg1.anInt2445 / 2, -(arg1.anInt2443 / 2) + -4 + 83 + -local66);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 167)
	public static void method1647() {
		@Pc(17) int local17;
		if (Static1.anInt1850 == 0) {
			scene = new World3D(4, 104, 104, World.levelHeightmap);
			for (local17 = 0; local17 < 4; local17++) {
				levelCollisionMap[local17] = new CollisionMap(104, 104);
			}
			Static85.imageMinimap = new Pix24(512, 512);
			JagString.aClass40_680 = JagString.aClass40_446;
			Static1.anInt1850 = 20;
			Static1.anInt2194 = 5;
			return;
		}
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(72) int local72;
		@Pc(66) int local66;
		if (Static1.anInt1850 == 20) {
			@Pc(52) int[] distance = new int[9];
			for (int x = 0; x < 9; x++) {
				int angle = x * 32 + 143;
				int sin = Draw3D.sin[angle];
				int offset = angle * 3 + 600;
				distance[x] = offset * sin >> 16;
			}
			World3D.init(distance);
			Static1.anInt1850 = 25;
			JagString.aClass40_680 = JagString.aClass40_721;
			Static1.anInt2194 = 10;
			return;
		}
		try {
			if (Static1.anInt1850 == 25) {
				if (Static9.legacyCacheDat != null && Static61.cacheDat != null && Static61.cacheDat.method351() < 60000L) {
					Static30.aClass11Array2 = new Cache[5];
					for (local17 = 0; local17 < 5; local17++) {
						Static30.aClass11Array2[local17] = new Cache(local17 + 1, Static9.legacyCacheDat, Static1.legacyCacheIndex[local17], 500000);
					}
					Static17.aClass11Array1 = new Cache[12];
					for (local54 = 0; local54 < 12; local54++) {
						Static17.aClass11Array1[local54] = new Cache(local54, Static61.cacheDat, Static1.cacheIndex[local54], 500000);
					}
					Static1.anInt2396 = 0;
					JagString.aClass40_680 = JagString.aClass40_736;
					Static1.anInt2194 = 15;
					Static1.anInt1850 = 26;
					return;
				}
				Static1.anInt2194 = 15;
				Static1.anInt1850 = 30;
				JagString.aClass40_680 = JagString.aClass40_140;
				return;
			}
			if (Static1.anInt1850 == 26) {
				while (Static1.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[1], Static17.aClass11Array1[7], Static1.anInt2396++);
					if ((Static1.anInt2396 & 0xFF) == 0) {
						JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_740, Static48.method859(Static1.anInt2396 * 100 / 65536), JagString.aClass40_430 });
						Static1.anInt2194 = 15;
						return;
					}
				}
				Static1.anInt2194 = 15;
				Static1.anInt1850 = 27;
				Static1.anInt2396 = 0;
				JagString.aClass40_680 = JagString.aClass40_139;
				return;
			}
			if (Static1.anInt1850 == 27) {
				while (Static1.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[3], Static17.aClass11Array1[6], Static1.anInt2396++);
					if ((Static1.anInt2396 & 0xFF) == 0) {
						JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_605, Static48.method859(Static1.anInt2396 * 100 / 65536), JagString.aClass40_430 });
						Static1.anInt2194 = 15;
						return;
					}
				}
				JagString.aClass40_680 = JagString.aClass40_507;
				Static1.anInt2194 = 15;
				Static1.anInt1850 = 28;
				Static1.anInt2396 = 0;
				return;
			}
			if (Static1.anInt1850 == 28) {
				while (Static1.anInt2396 < 65535) {
					Static26.method540(Static30.aClass11Array2[4], Static17.aClass11Array1[5], Static1.anInt2396++);
					if ((Static1.anInt2396 & 0xFF) == 0) {
						JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_571, Static48.method859(Static1.anInt2396 * 100 / 65536), JagString.aClass40_430 });
						Static1.anInt2194 = 15;
						return;
					}
				}
				Static1.anInt1850 = 30;
				JagString.aClass40_680 = JagString.aClass40_105;
				Static1.anInt2194 = 15;
				return;
			}
		} catch (@Pc(368) Exception local368) {
			if (Static1.anInt1850 < 30) {
				Static1.anInt1850 = 30;
			}
		}
		if (Static1.anInt1850 == 30) {
			animsJs5 = Static66.method1188(false, 0, true, true);
			basesJs5 = Static66.method1188(false, 1, true, true);
			configJs5 = Static66.method1188(true, 2, true, false);
			interfacesJs5 = Static66.method1188(false, 3, true, true);
			synthSoundsJs5 = Static66.method1188(false, 4, true, true);
			mapsJs5 = Static66.method1188(true, 5, true, true);
			midiSongsJs5 = Static66.method1188(true, 6, false, true);
			modelsJs5 = Static66.method1188(false, 7, true, true);
			spritesJs5 = Static66.method1188(false, 8, true, true);
			texturesJs5 = Static66.method1188(false, 9, true, true);
			binaryJs5 = Static66.method1188(false, 10, true, true);
			midiJinglesJs5 = Static66.method1188(false, 11, true, true);
			JagString.aClass40_680 = JagString.aClass40_691;
			Static1.anInt2194 = 20;
			Static1.anInt1850 = 40;
		} else if (Static1.anInt1850 == 40) {
			local17 = animsJs5.method89() * 5 / 100;
			local17 += basesJs5.method89() * 5 / 100;
			local17 += configJs5.method89() * 5 / 100;
			local17 += interfacesJs5.method89() * 5 / 100;
			local17 += synthSoundsJs5.method89() * 5 / 100;
			local17 += mapsJs5.method89() * 5 / 100;
			local17 += midiSongsJs5.method89() * 5 / 100;
			local17 += modelsJs5.method89() * 45 / 100;
			local17 += spritesJs5.method89() * 5 / 100;
			local17 += texturesJs5.method89() * 5 / 100;
			local17 += binaryJs5.method89() * 5 / 100;
			local17 += midiJinglesJs5.method89() * 5 / 100;
			if (local17 == 100) {
				Static1.anInt2194 = 30;
				Static1.anInt1850 = 45;
				JagString.aClass40_680 = JagString.aClass40_584;
			} else {
				if (local17 != 0) {
					JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_558, Static48.method859(local17), JagString.aClass40_430 });
				}
				Static1.anInt2194 = 30;
			}
		} else if (Static1.anInt1850 == 45) {
			Static79.method1400(signlink, !lowMemory);
			Static80.aClass2_Sub10_Sub2_1 = Static35.method717(signlink, method185());
			Static10.aClass56_1 = new SampleRateConverter(22050, Static11.anInt291);
			Static1.anInt2194 = 35;
			Static1.anInt1850 = 50;
			JagString.aClass40_680 = JagString.aClass40_625;
		} else if (Static1.anInt1850 == 50) {
			local17 = 0;
			if (Static70.aClass2_Sub2_Sub2_Sub2_4 == null) {
				Static70.aClass2_Sub2_Sub2_Sub2_4 = Static50.method941(spritesJs5, JagString.EMPTY_STRING, JagString.aClass40_620);
			} else {
				local17++;
			}
			if (fontPlain12 == null) {
				fontPlain12 = Static50.method941(spritesJs5, JagString.EMPTY_STRING, JagString.aClass40_726);
			} else {
				local17++;
			}
			if (fondBold12 == null) {
				fondBold12 = Static50.method941(spritesJs5, JagString.EMPTY_STRING, JagString.aClass40_69);
			} else {
				local17++;
			}
			if (Static39.aClass2_Sub2_Sub2_Sub2_2 == null) {
				Static39.aClass2_Sub2_Sub2_Sub2_2 = Static50.method941(spritesJs5, JagString.EMPTY_STRING, JagString.aClass40_543);
			} else {
				local17++;
			}
			if (local17 < 4) {
				JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_47, Static48.method859(local17 * 100 / 4), JagString.aClass40_430 });
				Static1.anInt2194 = 40;
			} else {
				Static1.anInt1850 = 60;
				Static1.anInt2194 = 40;
				Static45.aClass2_Sub2_Sub2_Sub2Array9 = new PixFont[] { Static70.aClass2_Sub2_Sub2_Sub2_4, fontPlain12, fondBold12, Static39.aClass2_Sub2_Sub2_Sub2_2 };
				JagString.aClass40_680 = JagString.aClass40_711;
			}
		} else if (Static1.anInt1850 == 60) {
			local17 = Static93.method1592(spritesJs5, binaryJs5);
			local54 = Static5.method120();
			if (local17 < local54) {
				JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_434, Static48.method859(local17 * 100 / local54), JagString.aClass40_430 });
				Static1.anInt2194 = 50;
			} else {
				JagString.aClass40_680 = JagString.aClass40_516;
				Static1.anInt2194 = 50;
				setState(5);
				Static1.anInt1850 = 70;
			}
		} else if (Static1.anInt1850 == 70) {
			if (configJs5.method78()) {
				FloorOverlayType.load(configJs5);
				FloorUnderlayType.load(configJs5);
				IdkType.load(modelsJs5, configJs5);
				LocType.load(lowMemory, modelsJs5, configJs5);
				NpcType.load(configJs5, modelsJs5);
				ObjType.load(modelsJs5, configJs5, membersWorld);
				SeqType.load(basesJs5, animsJs5, configJs5);
				SpotAnimType.load(configJs5, modelsJs5);
				VarBitType.load(configJs5);
				VarpType.load(configJs5);
				ComType.load(spritesJs5, interfacesJs5, modelsJs5);
				JagString.aClass40_680 = JagString.aClass40_469;
				Static1.anInt1850 = 80;
				Static1.anInt2194 = 60;
			} else {
				JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_616, Static48.method859(configJs5.method87()), JagString.aClass40_430 });
				Static1.anInt2194 = 60;
			}
		} else if (Static1.anInt1850 == 80) {
			local17 = 0;
			if (Static12.aClass2_Sub2_Sub2_Sub4_2 == null) {
				Static12.aClass2_Sub2_Sub2_Sub4_2 = Static95.method1644(JagString.aClass40_307, JagString.EMPTY_STRING, spritesJs5);
			} else {
				local17++;
			}
			if (Static96.aClass2_Sub2_Sub2_Sub4_10 == null) {
				Static96.aClass2_Sub2_Sub2_Sub4_10 = Static95.method1644(JagString.aClass40_647, JagString.EMPTY_STRING, spritesJs5);
			} else {
				local17++;
			}
			if (Static51.aClass2_Sub2_Sub2_Sub3Array15 == null) {
				Static51.aClass2_Sub2_Sub2_Sub3Array15 = Static4.method85(spritesJs5, JagString.aClass40_520, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (Static91.aClass2_Sub2_Sub2_Sub4Array2 == null) {
				Static91.aClass2_Sub2_Sub2_Sub4Array2 = Static34.method638(spritesJs5, JagString.aClass40_663, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (Static27.aClass2_Sub2_Sub2_Sub4Array4 == null) {
				Static27.aClass2_Sub2_Sub2_Sub4Array4 = Static34.method638(spritesJs5, JagString.aClass40_26, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (Static41.aClass2_Sub2_Sub2_Sub4Array6 == null) {
				Static41.aClass2_Sub2_Sub2_Sub4Array6 = Static34.method638(spritesJs5, JagString.aClass40_607, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (Static53.aClass2_Sub2_Sub2_Sub4Array8 == null) {
				Static53.aClass2_Sub2_Sub2_Sub4Array8 = Static34.method638(spritesJs5, JagString.aClass40_433, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (aClass2_Sub2_Sub2_Sub4Array10 == null) {
				aClass2_Sub2_Sub2_Sub4Array10 = Static34.method638(spritesJs5, JagString.aClass40_671, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (aClass2_Sub2_Sub2_Sub4_7 == null) {
				aClass2_Sub2_Sub2_Sub4_7 = Static95.method1644(JagString.aClass40_25, JagString.EMPTY_STRING, spritesJs5);
			} else {
				local17++;
			}
			if (Static12.aClass2_Sub2_Sub2_Sub4Array3 == null) {
				Static12.aClass2_Sub2_Sub2_Sub4Array3 = Static34.method638(spritesJs5, JagString.aClass40_101, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (imageCrosses == null) {
				imageCrosses = Static34.method638(spritesJs5, JagString.aClass40_332, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (Static28.aClass2_Sub2_Sub2_Sub4Array5 == null) {
				Static28.aClass2_Sub2_Sub2_Sub4Array5 = Static34.method638(spritesJs5, JagString.aClass40_727, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (Static85.aClass2_Sub2_Sub2_Sub3Array12 == null) {
				Static85.aClass2_Sub2_Sub2_Sub3Array12 = Static4.method85(spritesJs5, JagString.aClass40_643, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (Static64.aClass2_Sub2_Sub2_Sub3Array8 == null) {
				Static64.aClass2_Sub2_Sub2_Sub3Array8 = Static4.method85(spritesJs5, JagString.aClass40_222, JagString.EMPTY_STRING);
			} else {
				local17++;
			}
			if (local17 < 14) {
				JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_541, Static48.method859(local17 * 100 / 14), JagString.aClass40_430 });
				Static1.anInt2194 = 70;
			} else {
				Static96.aClass2_Sub2_Sub2_Sub4_10.method1620();
				local54 = (int) (Math.random() * 21.0D) - 10;
				local62 = (int) (Math.random() * 21.0D) - 10;
				local66 = (int) (Math.random() * 41.0D) - 20;
				local72 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(1134) int local1134 = 0; local1134 < Static91.aClass2_Sub2_Sub2_Sub4Array2.length; local1134++) {
					Static91.aClass2_Sub2_Sub2_Sub4Array2[local1134].method1621(local54 + local66, local62 + local66, local66 + local72);
				}
				Static51.aClass2_Sub2_Sub2_Sub3Array15[0].method1321(local66 + local54, local62 + local66, local72 + local66);
				JagString.aClass40_680 = JagString.aClass40_465;
				Static1.anInt1850 = 85;
				Static1.anInt2194 = 70;
			}
		} else if (Static1.anInt1850 == 85) {
			local17 = Static17.method358(spritesJs5);
			local54 = Static9.method228();
			if (local54 > local17) {
				JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_68, Static48.method859(local17 * 100 / local54), JagString.aClass40_430 });
				Static1.anInt2194 = 80;
			} else {
				Static1.anInt2194 = 80;
				Static1.anInt1850 = 90;
				JagString.aClass40_680 = JagString.aClass40_114;
			}
		} else if (Static1.anInt1850 == 90) {
			if (texturesJs5.method78()) {
				@Pc(1269) Js5TextureProvider local1269 = new Js5TextureProvider(texturesJs5, spritesJs5, 20, 0.8D, lowMemory ? 64 : 128);
				Static6.method173(local1269);
				Static6.method168(0.8D);
				Static1.anInt2194 = 90;
				Static1.anInt1850 = 110;
				JagString.aClass40_680 = JagString.aClass40_513;
			} else {
				JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_527, Static48.method859(texturesJs5.method87()), JagString.aClass40_430 });
				Static1.anInt2194 = 90;
			}
		} else if (Static1.anInt1850 == 110) {
			Static41.aClass52_1 = new MouseRecorder();
			signlink.method207(10, Static41.aClass52_1);
			Static1.anInt2194 = 94;
			Static1.anInt1850 = 120;
			JagString.aClass40_680 = JagString.aClass40_737;
		} else if (Static1.anInt1850 == 120) {
			if (binaryJs5.method73(JagString.EMPTY_STRING, JagString.aClass40_131)) {
				@Pc(1325) Huffman local1325 = new Huffman(binaryJs5.method69(JagString.aClass40_131, JagString.EMPTY_STRING));
				Static79.method1397(local1325);
				Static1.anInt1850 = 130;
				JagString.aClass40_680 = JagString.aClass40_470;
				Static1.anInt2194 = 96;
			} else {
				Static1.anInt2194 = 96;
				JagString.aClass40_680 = JagString.aClass40_180;
			}
		} else if (Static1.anInt1850 == 130) {
			if (interfacesJs5.method78()) {
				Static1.anInt2194 = 100;
				Static1.anInt1850 = 140;
				JagString.aClass40_680 = JagString.aClass40_517;
			} else {
				JagString.aClass40_680 = JagString.concatenate(new JagString[] { JagString.aClass40_619, Static48.method859(interfacesJs5.method87()), JagString.aClass40_430 });
				Static1.anInt2194 = 100;
			}
		} else if (Static1.anInt1850 == 140) {
			setState(10);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!fc;Ljava/awt/Graphics;ILclient!fc;)V", line = 32)
	public static void method1589(@OriginalArg(0) PixFont arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) PixFont arg2) {
		Static99.aClass45_31.bind();
		if (state == 0 || state == 5) {
			arg2.method566(JagString.aClass40_724, 180, 54, 16777215);
			Static25.method1607(28, 62, 304, 34, 9179409);
			Static25.method1607(29, 63, 302, 32, 0);
			Static25.method1612(30, 64, Static1.anInt2194 * 3, 30, 9179409);
			Static25.method1612(Static1.anInt2194 * 3 + 30, 64, 300 - Static1.anInt2194 * 3, 30, 0);
			arg2.method566(JagString.aClass40_680, 180, 85, 16777215);
			Static99.aClass45_31.draw(arg1, 202, 171);
		}
		@Pc(106) byte local106;
		@Pc(130) int local130;
		if (state == 20) {
			Static89.aClass2_Sub2_Sub2_Sub3_21.method1320(0, 0);
			local106 = 60;
			if (JagString.aClass40_592.length() > 0) {
				arg2.method578(JagString.aClass40_592, 180, 45, 16776960, true);
				arg2.method578(JagString.aClass40_589, 180, 60, 16776960, true);
				local130 = local106 + 30;
			} else {
				arg2.method578(JagString.aClass40_589, 180, 53, 16776960, true);
				local130 = local106 + 30;
			}
			arg2.method574(JagString.concatenate(new JagString[] { JagString.aClass40_482, JagString.aClass40_591 }), 90, 90, 16777215, true);
			local130 += 15;
			arg2.method574(JagString.concatenate(new JagString[] { JagString.aClass40_118, JagString.aClass40_587.method1177() }), 92, 105, 16777215, true);
			local130 += 15;
		}
		if (state == 10) {
			Static89.aClass2_Sub2_Sub2_Sub3_21.method1320(0, 0);
			if (Static1.anInt2143 == 0) {
				local106 = 80;
				arg2.method578(JagString.aClass40_331, 180, 80, 16776960, true);
				Static30.aClass2_Sub2_Sub2_Sub3_8.method1320(27, 100);
				arg2.method578(JagString.aClass40_508, 100, 125, 16777215, true);
				local130 = local106 + 30;
				Static30.aClass2_Sub2_Sub2_Sub3_8.method1320(187, 100);
				arg2.method578(JagString.aClass40_103, 260, 125, 16777215, true);
			} else if (Static1.anInt2143 == 2) {
				local106 = 60;
				if (JagString.aClass40_592.length() <= 0) {
					arg2.method578(JagString.aClass40_589, 180, 53, 16776960, true);
					local130 = local106 + 30;
				} else {
					arg2.method578(JagString.aClass40_592, 180, 45, 16776960, true);
					arg2.method578(JagString.aClass40_589, 180, 60, 16776960, true);
					local130 = local106 + 30;
				}
				arg2.method574(JagString.concatenate(new JagString[] { JagString.aClass40_482, JagString.aClass40_591, loopCycle % 40 < 20 & Static1.anInt91 == 0 ? JagString.aClass40_339 : JagString.aClass40_593 }), 90, 90, 16777215, true);
				local130 += 15;
				arg2.method574(JagString.concatenate(new JagString[] { JagString.aClass40_118, JagString.aClass40_587.method1177(), Static1.anInt91 == 1 & loopCycle % 40 < 20 ? JagString.aClass40_339 : JagString.aClass40_593 }), 92, 105, 16777215, true);
				Static30.aClass2_Sub2_Sub2_Sub3_8.method1320(27, 130);
				arg2.method578(JagString.aClass40_536, 100, 155, 16777215, true);
				Static30.aClass2_Sub2_Sub2_Sub3_8.method1320(187, 130);
				arg2.method578(JagString.aClass40_27, 260, 155, 16777215, true);
				local130 += 15;
			} else if (Static1.anInt2143 == 3) {
				arg2.method578(JagString.aClass40_294, 180, 40, 16776960, true);
				local106 = 65;
				arg2.method578(JagString.aClass40_71, 180, 65, 16777215, true);
				local130 = local106 + 15;
				arg2.method578(JagString.aClass40_258, 180, 80, 16777215, true);
				local130 += 15;
				arg2.method578(JagString.aClass40_706, 180, 95, 16777215, true);
				local130 += 15;
				arg2.method578(JagString.aClass40_539, 180, 110, 16777215, true);
				local130 += 15;
				Static30.aClass2_Sub2_Sub2_Sub3_8.method1320(107, 130);
				arg2.method578(JagString.aClass40_27, 180, 155, 16777215, true);
			}
		}
		Static99.aClass45_31.draw(arg1, 202, 171);
		method1673();
		Static56.aClass45_24.draw(arg1, 0, 0);
		Static90.aClass45_30.draw(arg1, 637, 0);
		if (!Static1.aBoolean1) {
			return;
		}
		Static1.aBoolean1 = false;
		Static56.aClass45_22.draw(arg1, 128, 0);
		Static33.aClass45_16.draw(arg1, 202, 371);
		Static20.aClass45_11.draw(arg1, 0, 265);
		Static72.aClass45_27.draw(arg1, 562, 265);
		Static62.aClass45_26.draw(arg1, 128, 171);
		Static2.aClass45_3.draw(arg1, 562, 171);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V", line = 175)
	public static void method1590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
			if (aClass40Array30[local17] != null) {
				@Pc(27) int local27 = messageType[local17];
				@Pc(38) int local38 = Static1.anInt799 + 4 + 70 - local3 * 14;
				if (local38 < -20) {
					break;
				}
				if (local27 == 0) {
					local3++;
				}
				@Pc(48) JagString local48 = aClass40Array40[local17];
				if (local48 != null && local48.method1168(JagString.aClass40_323)) {
					local48 = local48.method1185(5);
				}
				if (local48 != null && local48.method1168(JagString.aClass40_622)) {
					local48 = local48.method1185(5);
				}
				if ((local27 == 1 || local27 == 2) && (local27 == 1 || Static1.anInt583 == 0 || Static1.anInt583 == 1 && Static36.method729(local48))) {
					if (local38 - 14 < arg0 && arg0 <= local38 && !local48.compare(localPlayer.name)) {
						if (Static1.anInt1550 >= 1) {
							method402(JagString.concatenate(new JagString[] { JagString.aClass40_111, local48 }), 42, 0, 0, 0);
						}
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_604, local48 }), 12, 0, 0, 0);
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_535, local48 }), 51, 0, 0, 0);
					}
					local3++;
				}
				if ((local27 == 3 || local27 == 7) && Static1.anInt2473 == 0 && (local27 == 7 || Static1.anInt2515 == 0 || Static1.anInt2515 == 1 && Static36.method729(local48))) {
					local3++;
					if (local38 - 14 < arg0 && local38 >= arg0) {
						if (Static1.anInt1550 >= 1) {
							method402(JagString.concatenate(new JagString[] { JagString.aClass40_111, local48 }), 42, 0, 0, 0);
						}
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_604, local48 }), 12, 0, 0, 0);
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_535, local48 }), 51, 0, 0, 0);
					}
				}
				if (local27 == 4 && (Static1.anInt2491 == 0 || Static1.anInt2491 == 1 && Static36.method729(local48))) {
					local3++;
					if (local38 - 14 < arg0 && arg0 <= local38) {
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_28, local48 }), 29, 0, 0, 0);
					}
				}
				if ((local27 == 5 || local27 == 6) && Static1.anInt2473 == 0 && Static1.anInt2515 < 2) {
					local3++;
				}
				if (local27 == 8 && (Static1.anInt2491 == 0 || Static1.anInt2491 == 1 && Static36.method729(local48))) {
					if (arg0 > local38 - 14 && arg0 <= local38) {
						method402(JagString.concatenate(new JagString[] { JagString.aClass40_510, local48 }), 37, 0, 0, 0);
					}
					local3++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!mc;)I", line = 145)
	public static int executeClientscript1(@OriginalArg(0) int arg0, @OriginalArg(2) ComType com) {
		if (com.scripts == null || arg0 >= com.scripts.length) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(22) int[] local22 = com.scripts[arg0];
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(31) int local31 = local22[local17++];
				@Pc(33) int local33 = 0;
				@Pc(35) byte local35 = 0;
				if (local31 == 0) {
					return local24;
				}
				if (local31 == 1) {
					local33 = skillLevel[local22[local17++]];
				}
				if (local31 == 15) {
					local35 = 1;
				}
				if (local31 == 16) {
					local35 = 2;
				}
				if (local31 == 17) {
					local35 = 3;
				}
				if (local31 == 2) {
					local33 = skillBaseLevel[local22[local17++]];
				}
				if (local31 == 3) {
					local33 = skillExperience[local22[local17++]];
				}
				@Pc(103) int local103;
				@Pc(116) ComType local116;
				@Pc(121) int local121;
				@Pc(133) int local133;
				if (local31 == 4) {
					local103 = local22[local17++] << 16;
					@Pc(110) int local110 = local103 + local22[local17++];
					local116 = ComType.get(local110);
					local121 = local22[local17++];
					if (local121 != -1 && (!ObjType.method1669(local121).aBoolean66 || membersWorld)) {
						for (local133 = 0; local133 < local116.invSlotObjCount.length; local133++) {
							if (local121 + 1 == local116.invSlotObjCount[local133]) {
								local33 += local116.invSlotObjId[local133];
							}
						}
					}
				}
				if (local31 == 5) {
					local33 = varps[local22[local17++]];
				}
				if (local31 == 6) {
					local33 = levelExperience[skillBaseLevel[local22[local17++]] - 1];
				}
				if (local31 == 7) {
					local33 = varps[local22[local17++]] * 100 / 46875;
				}
				if (local31 == 8) {
					local33 = localPlayer.anInt1378;
				}
				if (local31 == 9) {
					for (local103 = 0; local103 < 25; local103++) {
						if (SKILL_ENABLED[local103]) {
							local33 += skillBaseLevel[local103];
						}
					}
				}
				if (local31 == 10) {
					local103 = local22[local17++] << 16;
					local103 += local22[local17++];
					local116 = ComType.get(local103);
					local121 = local22[local17++];
					if (local121 != -1 && (!ObjType.method1669(local121).aBoolean66 || membersWorld)) {
						for (local133 = 0; local133 < local116.invSlotObjCount.length; local133++) {
							if (local121 + 1 == local116.invSlotObjCount[local133]) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local31 == 11) {
					local33 = energy;
				}
				if (local31 == 12) {
					local33 = weightCarried;
				}
				if (local31 == 13) {
					local103 = varps[local22[local17++]];
					@Pc(315) int local315 = local22[local17++];
					local33 = (0x1 << local315 & local103) == 0 ? 0 : 1;
				}
				if (local31 == 14) {
					local103 = local22[local17++];
					local33 = Static99.method1662(local103);
				}
				if (local31 == 18) {
					local33 = (localPlayer.x >> 7) + sceneBaseTileX;
				}
				if (local31 == 19) {
					local33 = sceneBaseTileZ + (localPlayer.z >> 7);
				}
				if (local31 == 20) {
					local33 = local22[local17++];
				}
				if (local35 == 0) {
					if (local26 == 0) {
						local24 += local33;
					}
					if (local26 == 1) {
						local24 -= local33;
					}
					if (local26 == 2 && local33 != 0) {
						local24 /= local33;
					}
					if (local26 == 3) {
						local24 *= local33;
					}
					local26 = 0;
				} else {
					local26 = local35;
				}
			}
		} catch (@Pc(419) Exception local419) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mc;B)Z", line = 1134)
	public static boolean executeInterfaceScript(@OriginalArg(0) ComType arg0) {
		if (arg0.scriptComparator == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.scriptComparator.length; local17++) {
			@Pc(24) int local24 = executeClientscript1(local17, arg0);
			@Pc(29) int local29 = arg0.scriptOperand[local17];
			if (arg0.scriptComparator[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.scriptComparator[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.scriptComparator[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;Lclient!o;II)V", line = 32)
	public static void drawProgress(@OriginalArg(0) Color arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) int arg2) {
		if (Static20.aFont1 == null) {
			Static20.aFont1 = new Font("Helvetica", 1, 13);
			Static24.aFontMetrics1 = method185().getFontMetrics(Static20.aFont1);
		}
		if (Static1.aBoolean1) {
			Static1.aBoolean1 = false;
			graphics.setColor(Color.black);
			graphics.fillRect(0, 0, Static77.anInt1991, Static70.anInt2154);
		}
		if (arg0 == null) {
			arg0 = new Color(140, 17, 17);
		}
		try {
			if (Static71.anImage4 == null) {
				Static71.anImage4 = method185().createImage(304, 34);
			}
			@Pc(58) Graphics local58 = Static71.anImage4.getGraphics();
			local58.setColor(arg0);
			local58.drawRect(0, 0, 303, 33);
			local58.fillRect(2, 2, arg2 * 3, 30);
			local58.setColor(Color.black);
			local58.drawRect(1, 1, 301, 31);
			local58.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
			local58.setFont(Static20.aFont1);
			local58.setColor(Color.white);
			arg1.method1194(22, local58, (304 - arg1.method1181(Static24.aFontMetrics1)) / 2);
			graphics.drawImage(Static71.anImage4, Static77.anInt1991 / 2 - 152, Static70.anInt2154 / 2 + -18, null);
		} catch (@Pc(135) Exception local135) {
			@Pc(141) int local141 = Static77.anInt1991 / 2 - 152;
			@Pc(147) int local147 = Static70.anInt2154 / 2 - 18;
			graphics.setColor(arg0);
			graphics.drawRect(local141, local147, 303, 33);
			graphics.fillRect(local141 + 2, local147 - -2, arg2 * 3, 30);
			graphics.setColor(Color.black);
			graphics.drawRect(local141 + 1, local147 - -1, 301, 31);
			graphics.fillRect(local141 + arg2 * 3 + 2, local147 + 2, 300 - arg2 * 3, 30);
			graphics.setFont(Static20.aFont1);
			graphics.setColor(Color.white);
			arg1.method1194(local147 + 22, graphics, (304 - arg1.method1181(Static24.aFontMetrics1)) / 2 + local141);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ke;)V", line = 91)
	public static void updateFacingDirection(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt2285 == 0) {
			return;
		}
		@Pc(39) int local39;
		@Pc(32) int local32;
		if (arg0.anInt2324 != -1 && arg0.anInt2324 < 32768) {
			@Pc(23) NpcEntity local23 = npcs[arg0.anInt2324];
			if (local23 != null) {
				local32 = arg0.z - local23.z;
				local39 = arg0.x - local23.x;
				if (local39 != 0 || local32 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) local39, (double) local32) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(67) int local67;
		if (arg0.anInt2324 >= 32768) {
			local67 = arg0.anInt2324 - 32768;
			if (local67 == Static1.anInt1955) {
				local67 = 2047;
			}
			@Pc(76) PlayerEntity local76 = players[local67];
			if (local76 != null) {
				local32 = arg0.x - local76.x;
				@Pc(91) int local91 = arg0.z - local76.z;
				if (local32 != 0 || local91 != 0) {
					arg0.dstYaw = (int) (Math.atan2((double) local32, (double) local91) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2280 != 0 || arg0.anInt2292 != 0) && (arg0.pathLength == 0 || arg0.seqTrigger > 0)) {
			local39 = arg0.z - (arg0.anInt2292 - sceneBaseTileZ - sceneBaseTileZ) * 64;
			local67 = arg0.x - (arg0.anInt2280 - sceneBaseTileX - sceneBaseTileX) * 64;
			if (local67 != 0 || local39 != 0) {
				arg0.dstYaw = (int) (Math.atan2((double) local67, (double) local39) * 325.949D) & 0x7FF;
			}
			arg0.anInt2280 = 0;
			arg0.anInt2292 = 0;
		}
		local67 = arg0.dstYaw - arg0.anInt2305 & 0x7FF;
		if (local67 == 0) {
			return;
		}
		if (local67 < arg0.anInt2285 || local67 > 2048 - arg0.anInt2285) {
			arg0.anInt2305 = arg0.dstYaw;
		} else if (local67 > 1024) {
			arg0.anInt2305 -= arg0.anInt2285;
		} else {
			arg0.anInt2305 += arg0.anInt2285;
		}
		arg0.anInt2305 &= 0x7FF;
		if (arg0.secondarySeqId != arg0.seqStandId || arg0.anInt2305 == arg0.dstYaw) {
			return;
		}
		if (arg0.anInt2276 == -1) {
			arg0.secondarySeqId = arg0.anInt2269;
			return;
		}
		arg0.secondarySeqId = arg0.anInt2276;
		return;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!ke;)V", line = 1421)
	public static void updateSequences(@OriginalArg(1) PathingEntity arg0) {
		arg0.aBoolean172 = false;
		@Pc(15) SeqType local15;
		if (arg0.secondarySeqId != -1) {
			local15 = SeqType.method1042(arg0.secondarySeqId);
			arg0.anInt2296++;
			if (arg0.anInt2295 < local15.anIntArray124.length && arg0.anInt2296 > local15.delay[arg0.anInt2295]) {
				arg0.anInt2295++;
				arg0.anInt2296 = 1;
			}
			if (arg0.anInt2295 >= local15.anIntArray124.length) {
				arg0.anInt2296 = 0;
				arg0.anInt2295 = 0;
			}
		}
		if (arg0.anInt2302 != -1 && arg0.anInt2320 <= loopCycle) {
			if (arg0.anInt2291 < 0) {
				arg0.anInt2291 = 0;
			}
			@Pc(81) int local81 = SpotAnimType.method116(arg0.anInt2302).anInt640;
			if (local81 == -1) {
				arg0.anInt2302 = -1;
			} else {
				@Pc(89) SeqType local89 = SeqType.method1042(local81);
				arg0.anInt2268++;
				if (arg0.anInt2291 < local89.anIntArray124.length && arg0.anInt2268 > local89.delay[arg0.anInt2291]) {
					arg0.anInt2268 = 1;
					arg0.anInt2291++;
				}
				if (local89.anIntArray124.length <= arg0.anInt2291 && (arg0.anInt2291 < 0 || arg0.anInt2291 >= local89.anIntArray124.length)) {
					arg0.anInt2302 = -1;
				}
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay <= 1) {
			local15 = SeqType.method1042(arg0.primarySeqId);
			if (local15.anInt663 == 1 && arg0.anInt2281 > 0 && arg0.anInt2277 <= loopCycle && arg0.anInt2297 < loopCycle) {
				arg0.primarySeqDelay = 1;
				return;
			}
		}
		if (arg0.primarySeqId != -1 && arg0.primarySeqDelay == 0) {
			local15 = SeqType.method1042(arg0.primarySeqId);
			arg0.anInt2267++;
			if (local15.anIntArray124.length > arg0.anInt2316 && arg0.anInt2267 > local15.delay[arg0.anInt2316]) {
				arg0.anInt2316++;
				arg0.anInt2267 = 1;
			}
			if (arg0.anInt2316 >= local15.anIntArray124.length) {
				arg0.anInt2316 -= local15.anInt669;
				arg0.anInt2300++;
				if (local15.anInt660 <= arg0.anInt2300) {
					arg0.primarySeqId = -1;
				}
				if (arg0.anInt2316 < 0 || arg0.anInt2316 >= local15.anIntArray124.length) {
					arg0.primarySeqId = -1;
				}
			}
			arg0.aBoolean172 = local15.aBoolean50;
		}
		if (arg0.primarySeqDelay > 0) {
			arg0.primarySeqDelay--;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ke;)V", line = 23)
	public static void updateForceMovement(@OriginalArg(1) PathingEntity arg0) {
		if (arg0.anInt2314 == 0) {
			arg0.dstYaw = 1024;
		}
		arg0.seqTrigger = 0;
		if (arg0.anInt2314 == 1) {
			arg0.dstYaw = 1536;
		}
		@Pc(24) int local24 = arg0.anInt2277 - loopCycle;
		if (arg0.anInt2314 == 2) {
			arg0.dstYaw = 0;
		}
		if (arg0.anInt2314 == 3) {
			arg0.dstYaw = 512;
		}
		@Pc(54) int local54 = arg0.anInt2317 * 128 + arg0.size * 64;
		arg0.x += (local54 - arg0.x) / local24;
		@Pc(82) int local82 = arg0.anInt2321 * 128 + arg0.size * 64;
		arg0.z += (local82 - arg0.z) / local24;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ke;II)V", line = 97)
	public static void updateEntity(@OriginalArg(0) PathingEntity arg0, @OriginalArg(1) int arg1) {
		if (arg0.x < 128 || arg0.z < 128 || arg0.x >= 13184 || arg0.z >= 13184) {
			arg0.anInt2297 = 0;
			arg0.anInt2277 = 0;
			arg0.anInt2302 = -1;
			arg0.primarySeqId = -1;
			arg0.x = arg0.size * 64 + arg0.pathTileX[0] * 128;
			arg0.z = arg0.size * 64 + arg0.pathTileZ[0] * 128;
			arg0.method1543();
		}
		if (localPlayer == arg0 && (arg0.x < 1536 || arg0.z < 1536 || arg0.x >= 11776 || arg0.z >= 11776)) {
			arg0.anInt2302 = -1;
			arg0.anInt2277 = 0;
			arg0.primarySeqId = -1;
			arg0.anInt2297 = 0;
			arg0.x = arg0.pathTileX[0] * 128 + arg0.size * 64;
			arg0.z = arg0.pathTileZ[0] * 128 + arg0.size * 64;
			arg0.method1543();
		}
		if (loopCycle < arg0.anInt2277) {
			updateForceMovement(arg0);
		} else if (arg0.anInt2297 >= loopCycle) {
			startForceMovement(arg0);
		} else {
			updateMovement(arg0);
		}
		updateFacingDirection(arg0);
		updateSequences(arg0);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 218)
	public static void method1492() {
		updateInterfaceAnimation(Static1.anInt1971);
		if (Static1.anInt2175 != -1) {
			updateInterfaceAnimation(Static1.anInt2175);
		}
		sceneDelta = 0;
		Static27.aClass45_14.bind();
		Static34.anIntArray162 = Static6.method175(Static34.anIntArray162);
		Static25.method1610();
		drawInterface(0, -1, Static1.anInt1971, 0, 0, 503, 0, 765);
		if (Static1.anInt2175 != -1) {
			drawInterface(0, -1, Static1.anInt2175, 0, 0, 503, 0, 765);
		}
		if (menuVisible) {
			drawMenu();
		} else {
			handleInput();
			drawTooltip();
		}
		Static27.aClass45_14.draw(graphics, 0, 0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!o;Lclient!o;I)V", line = 100)
	public static void method1095(@OriginalArg(0) boolean arg0, @OriginalArg(1) JagString arg1, @OriginalArg(2) JagString arg2) {
		@Pc(5) short local5 = 151;
		@Pc(6) int local6 = local5 - 3;
		if (Static1.aBoolean1) {
			Static1.aBoolean1 = false;
			Static39.method768(graphics);
			Static4.method83(graphics);
			drawAreaSidebar(graphics);
			Static30.method594(graphics);
			method1664(Static1.anInt2515, graphics, fontPlain12, Static1.anInt2491, Static1.anInt583);
			Static85.method1487(selectedTab, tabInterfaceId, -1, sidebarInterfaceId == -1, graphics);
			Static1.aBoolean23 = true;
			Static1.aBoolean165 = true;
			Static1.aBoolean13 = true;
		}
		Static69.method1230();
		fontPlain12.method566(arg2, 257, 148, 0);
		fontPlain12.method566(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local6 += 15;
			if (arg0) {
				@Pc(81) int local81 = fontPlain12.method568(arg1) + 4;
				Static25.method1612(257 - local81 / 2, 152, local81, 11, 0);
			}
			fontPlain12.method566(arg1, 257, 163, 0);
			fontPlain12.method566(arg1, 256, 162, 16777215);
		}
		drawViewport(graphics);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 5)
	public static void closeInterfaces() {
		// CLOSE_MODAL
		out.pIsaac1(255);
		if (sidebarInterfaceId != -1) {
			Static75.method1350(sidebarInterfaceId);
			redrawSidebar = true;
			Static1.aBoolean40 = false;
			Static1.aBoolean184 = true;
			sidebarInterfaceId = -1;
		}
		if (chatInterfaceId != -1) {
			Static75.method1350(chatInterfaceId);
			Static1.aBoolean40 = false;
			chatInterfaceId = -1;
			redrawChatback = true;
		}
		if (Static1.anInt1971 != -1) {
			Static75.method1350(Static1.anInt1971);
			Static1.anInt1971 = -1;
			setState(30);
		}
		if (Static1.anInt2175 != -1) {
			Static75.method1350(Static1.anInt2175);
			Static1.anInt2175 = -1;
		}
		if (anInt2585 != -1) {
			Static75.method1350(anInt2585);
			anInt2585 = -1;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mc;I)Z", line = 173)
	public static boolean handleInterfaceAction(@OriginalArg(0) ComType com) {
		@Pc(6) int clientCode = com.clientCode;
		if (Static1.anInt1038 == 2) {
			if (clientCode == 201) {
				JagString.aClass40_453 = JagString.aClass40_79;
				Static1.anInt2399 = 0;
				socialAction = 1;
				redrawChatback = true;
				socialInput = JagString.EMPTY_STRING;
				showSocialInput = true;
			}
			if (clientCode == 202) {
				socialAction = 2;
				showSocialInput = true;
				socialInput = JagString.EMPTY_STRING;
				JagString.aClass40_453 = JagString.aClass40_122;
				Static1.anInt2399 = 0;
				redrawChatback = true;
			}
		}
		if (clientCode == 205) {
			idleTimeout = 250;
			return true;
		}
		if (clientCode == 501) {
			Static1.anInt2399 = 0;
			socialAction = 4;
			JagString.aClass40_453 = JagString.aClass40_113;
			showSocialInput = true;
			socialInput = JagString.EMPTY_STRING;
			redrawChatback = true;
		}
		if (clientCode == 502) {
			Static1.anInt2399 = 0;
			redrawChatback = true;
			socialInput = JagString.EMPTY_STRING;
			showSocialInput = true;
			JagString.aClass40_453 = JagString.aClass40_82;
			socialAction = 5;
		}
		@Pc(98) int local98;
		@Pc(92) int local92;
		if (clientCode >= 300 && clientCode <= 313) {
			local92 = clientCode & 0x1;
			local98 = (clientCode - 300) / 2;
			Static1.aClass33_1.method1004(local92 == 1, local98);
		}
		if (clientCode >= 314 && clientCode <= 323) {
			local98 = (clientCode - 314) / 2;
			local92 = clientCode & 0x1;
			Static1.aClass33_1.method1009(local98, local92 == 1);
		}
		if (clientCode == 324) {
			Static1.aClass33_1.method1002(false);
		}
		if (clientCode == 325) {
			Static1.aClass33_1.method1002(true);
		}
		if (clientCode == 326) {
			// IF_DESIGN
			out.pIsaac1(12);
			Static1.aClass33_1.method1007(out);
			return true;
		}
		if (clientCode == 620) {
			Static1.aBoolean103 = !Static1.aBoolean103;
		}
		if (clientCode >= 601 && clientCode <= 613) {
			closeInterfaces();
			if (JagString.aClass40_448.length() > 0) {
				// BUG_REPORT
				out.pIsaac1(72);
				out.p8(JagString.aClass40_448.toBase37());
				out.p1(clientCode - 601);
				out.p1(Static1.aBoolean103 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Graphics;Lclient!fc;III)V", line = 450)
	public static void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) PixFont arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static4.aClass45_4.bind();
		Static46.aClass2_Sub2_Sub2_Sub3_11.method1320(0, 0);
		arg2.method578(JagString.aClass40_219, 55, 28, 16777215, true);
		if (arg4 == 0) {
			arg2.method578(JagString.aClass40_715, 55, 41, 65280, true);
		}
		if (arg4 == 1) {
			arg2.method578(JagString.aClass40_106, 55, 41, 16776960, true);
		}
		if (arg4 == 2) {
			arg2.method578(JagString.aClass40_629, 55, 41, 16711680, true);
		}
		if (arg4 == 3) {
			arg2.method578(JagString.aClass40_46, 55, 41, 65535, true);
		}
		arg2.method578(JagString.aClass40_368, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method578(JagString.aClass40_715, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method578(JagString.aClass40_106, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method578(JagString.aClass40_629, 184, 41, 16711680, true);
		}
		arg2.method578(JagString.aClass40_530, 324, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method578(JagString.aClass40_715, 324, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method578(JagString.aClass40_106, 324, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method578(JagString.aClass40_629, 324, 41, 16711680, true);
		}
		arg2.method578(JagString.aClass40_522, 458, 33, 16777215, true);
		Static4.aClass45_4.draw(arg1, 0, 453);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 111)
	public static void method1659() {
		Static79.aClass18_1.method1275();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static1.aLongArray5[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static1.aLongArray6[local29] = 0L;
		}
		Static22.anInt587 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 82)
	public static void method1671() {
		Static1.aBoolean27 = true;
		Static1.aLong12 = 0L;
		Static1.anInt1612 = 0;
		Static89.aBoolean174 = true;
		Static41.aClass52_1.samples = 0;
		Static92.method1584();
		idleNetCycles = 0;
		lastPacketType2 = -1;
		out.pos = 0;
		packetType = -1;
		in.pos = 0;
		menuVisible = false;
		lastPacketType1 = -1;
		systemUpdateTimer = 0;
		idleTimeout = 0;
		menuSize = 0;
		lastPacketType0 = -1;
		hintType = 0;
		Static35.method722(0);
		for (@Pc(1645) int local1645 = 0; local1645 < 100; local1645++) {
			aClass40Array30[local1645] = null;
		}
		Static1.anInt2590 = -1;
		cameraAnticheatOffsetZ = (int) (Math.random() * 100.0D) - 50;
		npcCount = 0;
		Static1.anInt2328 = 0;
		flagSceneTileX = 0;
		flagSceneTileZ = 0;
		cameraAnticheatAngle = (int) (Math.random() * 80.0D) - 40;
		orbitCameraYaw = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static1.anInt1857 = (int) (Math.random() * 30.0D) - 20;
		objSelected = 0;
		Static1.anInt131 = 0;
		playerCount = 0;
		spellSelected = 0;
		cameraAnticheatOffsetX = (int) (Math.random() * 110.0D) - 55;
		minimapAnticheatAngle = (int) (Math.random() * 120.0D) - 60;
		for (@Pc(1726) int local1726 = 0; local1726 < 2048; local1726++) {
			players[local1726] = null;
			Static1.aClass2_Sub3Array1[local1726] = null;
		}
		for (@Pc(1744) int local1744 = 0; local1744 < 16384; local1744++) {
			npcs[local1744] = null;
		}
		localPlayer = players[2047] = new PlayerEntity();
		Static1.aClass44_4.method1222();
		Static1.aClass44_8.method1222();
		@Pc(1776) int local1776;
		for (@Pc(1772) int local1772 = 0; local1772 < 4; local1772++) {
			for (local1776 = 0; local1776 < 104; local1776++) {
				for (@Pc(1780) int local1780 = 0; local1780 < 104; local1780++) {
					levelObjStacks[local1772][local1776][local1780] = null;
				}
			}
		}
		Static1.spawnedLocations = new LinkList();
		friendCount = 0;
		Static1.anInt1038 = 0;
		Static75.method1350(stickyChatInterfaceId);
		stickyChatInterfaceId = -1;
		Static75.method1350(chatInterfaceId);
		chatInterfaceId = -1;
		Static75.method1350(anInt2585);
		anInt2585 = -1;
		Static75.method1350(Static1.anInt1971);
		Static1.anInt1971 = -1;
		Static75.method1350(Static1.anInt2175);
		Static1.anInt2175 = -1;
		Static75.method1350(sidebarInterfaceId);
		sidebarInterfaceId = -1;
		Static75.method1350(viewportInterfaceId);
		selectedTab = 3;
		Static1.anInt2399 = 0;
		Static1.aBoolean40 = false;
		Static1.anInt2492 = -1;
		Static1.inMultizone = 0;
		showSocialInput = false;
		modalMessage = null;
		menuVisible = false;
		viewportInterfaceId = -1;
		Static1.aClass33_1.method1001(false, new int[5], -1, null);
		for (local1776 = 0; local1776 < 5; local1776++) {
			Static1.aClass40Array6[local1776] = null;
			Static1.aBooleanArray41[local1776] = false;
		}
		Static1.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 1055)
	public static void method1673() {
		@Pc(9) int local9;
		if (flameGradientCycle0 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (flameGradientCycle0 > 768) {
					Static84.anIntArray472[local9] = Static45.method1534(Static35.anIntArray182[local9], 1024 - flameGradientCycle0, Static64.anIntArray355[local9]);
				} else if (flameGradientCycle0 <= 256) {
					Static84.anIntArray472[local9] = Static45.method1534(Static64.anIntArray355[local9], 256 - flameGradientCycle0, Static35.anIntArray182[local9]);
				} else {
					Static84.anIntArray472[local9] = Static64.anIntArray355[local9];
				}
			}
		} else if (flameGradientCycle1 <= 0) {
			for (local9 = 0; local9 < 256; local9++) {
				Static84.anIntArray472[local9] = Static35.anIntArray182[local9];
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				if (flameGradientCycle1 > 768) {
					Static84.anIntArray472[local9] = Static45.method1534(Static35.anIntArray182[local9], 1024 - flameGradientCycle1, Static66.anIntArray406[local9]);
				} else if (flameGradientCycle1 > 256) {
					Static84.anIntArray472[local9] = Static66.anIntArray406[local9];
				} else {
					Static84.anIntArray472[local9] = Static45.method1534(Static66.anIntArray406[local9], 256 - flameGradientCycle1, Static35.anIntArray182[local9]);
				}
			}
		}
		for (local9 = 0; local9 < 33920; local9++) {
			Static56.aClass45_24.pixels[local9] = Static10.aClass2_Sub2_Sub2_Sub4_1.pixels[local9];
		}
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 1152;
		@Pc(181) int local181;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(205) int local205;
		@Pc(215) int local215;
		@Pc(219) int local219;
		@Pc(228) int local228;
		for (@Pc(168) int local168 = 1; local168 < 255; local168++) {
			local181 = (256 - local168) * flameLineOffset[local168] / 256;
			local185 = local181 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			local164 += local185;
			for (local198 = local185; local198 < 128; local198++) {
				local205 = flameBuffer3[local164++];
				if (local205 == 0) {
					local166++;
				} else {
					local215 = local205;
					local219 = 256 - local205;
					local205 = Static84.anIntArray472[local205];
					local228 = Static56.aClass45_24.pixels[local166];
					Static56.aClass45_24.pixels[local166++] = (local215 * (local205 & 0xFF00FF) + (local228 & 0xFF00FF) * local219 & 0xFF00FF00) + ((local228 & 0xFF00) * local219 + local215 * (local205 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local166 += local185;
		}
		local166 = 1176;
		for (local181 = 0; local181 < 33920; local181++) {
			Static90.aClass45_30.pixels[local181] = Static88.aClass2_Sub2_Sub2_Sub4_9.pixels[local181];
		}
		local164 = 0;
		for (local185 = 1; local185 < 255; local185++) {
			local198 = (256 - local185) * flameLineOffset[local185] / 256;
			local166 += local198;
			local205 = 103 - local198;
			for (local215 = 0; local215 < local205; local215++) {
				local219 = flameBuffer3[local164++];
				if (local219 == 0) {
					local166++;
				} else {
					local228 = local219;
					@Pc(357) int local357 = 256 - local219;
					local219 = Static84.anIntArray472[local219];
					@Pc(366) int local366 = Static90.aClass45_30.pixels[local166];
					Static90.aClass45_30.pixels[local166++] = (local228 * (local219 & 0xFF00) + local357 * (local366 & 0xFF00) & 0xFF0000) + (local228 * (local219 & 0xFF00FF) + ((local366 & 0xFF00FF) * local357) & 0xFF00FF00) >> 8;
				}
			}
			local164 += 128 - local205;
			local166 += 128 - local198 - local205;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIII)V", line = 1222)
	public static void drawMinimapLoc(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = scene.getWallBitset(arg0, arg4, arg3);
		@Pc(40) int local40;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(11) int local11;
		@Pc(33) int local33;
		@Pc(59) int local59;
		if (local7 != 0) {
			local11 = arg1;
			if (local7 > 0) {
				local11 = arg2;
			}
			local33 = (103 - arg3) * 4 * 512 + arg4 * 4 + 24624;
			local40 = scene.getInfo(arg0, arg4, arg3, local7);
			local46 = local40 >> 6 & 0x3;
			@Pc(49) int[] local49 = Static85.imageMinimap.pixels;
			local53 = local40 & 0x1F;
			local59 = local7 >> 14 & 0x7FFF;
			@Pc(63) LocType local63 = LocType.get(local59);
			if (local63.mapscene == -1) {
				if (local53 == 0 || local53 == 2) {
					if (local46 == 0) {
						local49[local33] = local11;
						local49[local33 + 512] = local11;
						local49[local33 + 1024] = local11;
						local49[local33 + 1536] = local11;
					} else if (local46 == 1) {
						local49[local33] = local11;
						local49[local33 + 1] = local11;
						local49[local33 + 2] = local11;
						local49[local33 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 3] = local11;
						local49[local33 + 515] = local11;
						local49[local33 + 1027] = local11;
						local49[local33 + 1536 + 3] = local11;
					} else if (local46 == 3) {
						local49[local33 + 1536] = local11;
						local49[local33 + 1 + 1536] = local11;
						local49[local33 + 2 + 1536] = local11;
						local49[local33 + 3 + 1536] = local11;
					}
				}
				if (local53 == 3) {
					if (local46 == 0) {
						local49[local33] = local11;
					} else if (local46 == 1) {
						local49[local33 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 3 + 1536] = local11;
					} else if (local46 == 3) {
						local49[local33 + 1536] = local11;
					}
				}
				if (local53 == 2) {
					if (local46 == 3) {
						local49[local33] = local11;
						local49[local33 + 512] = local11;
						local49[local33 + 1024] = local11;
						local49[local33 + 1536] = local11;
					} else if (local46 == 0) {
						local49[local33] = local11;
						local49[local33 + 1] = local11;
						local49[local33 + 2] = local11;
						local49[local33 + 3] = local11;
					} else if (local46 == 1) {
						local49[local33 + 3] = local11;
						local49[local33 + 515] = local11;
						local49[local33 + 1024 + 3] = local11;
						local49[local33 + 1536 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 1536] = local11;
						local49[local33 + 1536 + 1] = local11;
						local49[local33 + 1538] = local11;
						local49[local33 + 1536 + 3] = local11;
					}
				}
			} else {
				@Pc(73) Pix8 local73 = Static51.aClass2_Sub2_Sub2_Sub3Array15[local63.mapscene];
				if (local73 != null) {
					@Pc(85) int local85 = (local63.anInt1036 * 4 - local73.anInt1905) / 2;
					@Pc(95) int local95 = (local63.anInt1040 * 4 - local73.anInt1910) / 2;
					local73.method1320(local85 + arg4 * 4 + 48, local95 + (-local63.anInt1040 + -arg3 + 104) * 4 + 48);
				}
			}
		}
		local7 = scene.method1429(arg0, arg4, arg3);
		if (local7 != 0) {
			local40 = scene.getInfo(arg0, arg4, arg3, local7);
			local53 = local40 & 0x1F;
			local46 = local40 >> 6 & 0x3;
			local11 = local7 >> 14 & 0x7FFF;
			@Pc(457) LocType local457 = LocType.get(local11);
			@Pc(492) int local492;
			if (local457.mapscene != -1) {
				@Pc(565) Pix8 local565 = Static51.aClass2_Sub2_Sub2_Sub3Array15[local457.mapscene];
				if (local565 != null) {
					local59 = (local457.anInt1036 * 4 - local565.anInt1905) / 2;
					local492 = (local457.anInt1040 * 4 - local565.anInt1910) / 2;
					local565.method1320(arg4 * 4 + local59 + 48, local492 + (104 - arg3 - local457.anInt1040) * 4 + 48);
				}
			} else if (local53 == 9) {
				local33 = 15658734;
				if (local7 > 0) {
					local33 = 15597568;
				}
				@Pc(477) int[] local477 = Static85.imageMinimap.pixels;
				local492 = arg4 * 4 + (-arg3 + 103) * 512 * 4 + 24624;
				if (local46 == 0 || local46 == 2) {
					local477[local492 + 1536] = local33;
					local477[local492 + 1024 + 1] = local33;
					local477[local492 + 2 + 512] = local33;
					local477[local492 + 3] = local33;
				} else {
					local477[local492] = local33;
					local477[local492 + 513] = local33;
					local477[local492 + 1024 + 2] = local33;
					local477[local492 + 3 + 1536] = local33;
				}
			}
		}
		local7 = scene.method1458(arg0, arg4, arg3);
		if (local7 == 0) {
			return;
		}
		local40 = local7 >> 14 & 0x7FFF;
		@Pc(633) LocType local633 = LocType.get(local40);
		if (local633.mapscene == -1) {
			return;
		}
		@Pc(642) Pix8 local642 = Static51.aClass2_Sub2_Sub2_Sub3Array15[local633.mapscene];
		if (local642 != null) {
			local11 = (local633.anInt1036 * 4 - local642.anInt1905) / 2;
			@Pc(665) int local665 = (local633.anInt1040 * 4 - local642.anInt1910) / 2;
			local642.method1320(local11 + arg4 * 4 + 48, local665 + (-local633.anInt1040 + 104 - arg3) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V", line = 121)
	public static void updateFlames() {
		@Pc(12) int local12;
		for (@Pc(5) int local5 = 10; local5 < 117; local5++) {
			local12 = (int) (Math.random() * 100.0D);
			if (local12 < 50) {
				flameBuffer3[local5 + 32512] = 255;
			}
		}
		@Pc(50) int local50;
		@Pc(43) int local43;
		@Pc(57) int local57;
		for (local12 = 0; local12 < 100; local12++) {
			local43 = (int) (Math.random() * 128.0D) + 128;
			local50 = (int) (Math.random() * 124.0D) + 2;
			local57 = local50 + (local43 << 7);
			flameBuffer3[local57] = 192;
		}
		for (local50 = 1; local50 < 255; local50++) {
			for (local43 = 1; local43 < 127; local43++) {
				local57 = local43 + (local50 << 7);
				flameBuffer2[local57] = (flameBuffer3[local57 + 128] + flameBuffer3[local57 + 1] + flameBuffer3[local57 - 1] + flameBuffer3[local57 - 128]) / 4;
			}
		}
		flameCycle0 += 128;
		if (flameBuffer0.length < flameCycle0) {
			flameCycle0 -= flameBuffer0.length;
			local43 = (int) (Math.random() * 12.0D);
			updateFlameBuffer(imageRunes[local43]);
		}
		@Pc(166) int local166;
		for (local43 = 1; local43 < 255; local43++) {
			for (local57 = 1; local57 < 127; local57++) {
				local166 = local57 + (local43 << 7);
				@Pc(187) int local187 = flameBuffer2[local166 + 128] - flameBuffer0[flameBuffer0.length - 1 & local166 - -flameCycle0] / 5;
				if (local187 < 0) {
					local187 = 0;
				}
				flameBuffer3[local166] = local187;
			}
		}
		for (local57 = 0; local57 < 255; local57++) {
			flameLineOffset[local57] = flameLineOffset[local57 + 1];
		}
		flameLineOffset[255] = (int) (Math.sin((double) loopCycle / 14.0D) * 16.0D + Math.sin((double) loopCycle / 15.0D) * 14.0D + Math.sin((double) loopCycle / 16.0D) * 12.0D);
		if (flameGradientCycle0 > 0) {
			flameGradientCycle0 -= 4;
		}
		if (flameGradientCycle1 > 0) {
			flameGradientCycle1 -= 4;
		}
        if (flameGradientCycle0 == 0 && flameGradientCycle1 == 0) {
            local166 = (int) (Math.random() * 2000.0D);
            if (local166 == 0) {
                flameGradientCycle0 = 1024;
            }
            if (local166 == 1) {
                flameGradientCycle1 = 1024;
            }
        }
    }

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!qb;)V", line = 73)
	public static void updateFlameBuffer(@OriginalArg(1) Pix8 arg0) {
		for (@Pc(9) int local9 = 0; local9 < flameBuffer0.length; local9++) {
			flameBuffer0[local9] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * 128.0D * Math.random());
			flameBuffer0[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local32 = 0; local32 < 20; local32++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = (local56 << 7) + local60;
					Static4.anIntArray17[local68] = (flameBuffer0[local68 - 1] + flameBuffer0[local68 + 1] + flameBuffer0[local68 - 128] + flameBuffer0[local68 + 128]) / 4;
				}
			}
			@Pc(109) int[] local109 = flameBuffer0;
			flameBuffer0 = Static4.anIntArray17;
			Static4.anIntArray17 = local109;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt1910; local60++) {
			for (local68 = 0; local68 < arg0.anInt1905; local68++) {
				if (arg0.aByteArray16[local56++] != 0) {
					@Pc(142) int local142 = local60 + arg0.anInt1906 + 16;
					@Pc(149) int local149 = arg0.anInt1907 + local68 + 16;
					@Pc(155) int local155 = (local142 << 7) + local149;
					flameBuffer0[local155] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "(I)V", line = 516)
	public static void method1548() {
		updateFlames();
		if (state != 10) {
			return;
		}
		@Pc(20) int local20 = Static1.anInt2133 - 171;
		@Pc(22) int local22 = mouseClickButton;
		@Pc(26) int local26 = Static1.anInt2500 - 202;
		if (Static1.anInt2143 == 0) {
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 100 && local20 <= 140) {
				Static1.anInt2143 = 3;
				Static1.anInt91 = 0;
			}
			if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 100 && local20 <= 140) {
				Static1.anInt2143 = 2;
				JagString.aClass40_589 = JagString.aClass40_305;
				Static1.anInt91 = 0;
				JagString.aClass40_592 = JagString.aClass40_593;
			}
		} else if (Static1.anInt2143 == 2) {
			@Pc(70) byte local70 = 60;
			@Pc(73) int local73 = local70 + 30;
			if (local22 == 1 && local20 >= 75 && local20 < 90) {
				Static1.anInt91 = 0;
			}
			local73 += 15;
			if (local22 == 1 && local20 >= 90 && local20 < 105) {
				Static1.anInt91 = 1;
			}
			local73 += 15;
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 130 && local20 <= 170) {
				JagString.aClass40_591 = JagString.aClass40_591.method1175().formatName();
				Static45.method1537(JagString.aClass40_593, JagString.aClass40_120);
				setState(20);
			} else {
				if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 130 && local20 <= 170) {
					Static1.anInt2143 = 0;
					JagString.aClass40_591 = JagString.aClass40_593;
					JagString.aClass40_587 = JagString.aClass40_593;
				}
				while (true) {
					@Pc(211) boolean local211;
					label145: do {
						while (Static89.method1561()) {
							local211 = false;
							for (@Pc(213) int local213 = 0; JagString.aClass40_486.length() > local213; local213++) {
								if (Static4.anInt135 == JagString.aClass40_486.method1174(local213)) {
									local211 = true;
									break;
								}
							}
							if (Static1.anInt91 != 0) {
								continue label145;
							}
							if (Static35.anInt935 == 85 && JagString.aClass40_591.length() > 0) {
								JagString.aClass40_591 = JagString.aClass40_591.method1180(JagString.aClass40_591.length() - 1, 0);
							}
							if (Static35.anInt935 == 84 || Static35.anInt935 == 80) {
								Static1.anInt91 = 1;
							}
							if (local211 && JagString.aClass40_591.length() < 12) {
								JagString.aClass40_591 = JagString.aClass40_591.method1192(Static4.anInt135);
							}
						}
						return;
					} while (Static1.anInt91 != 1);
					if (Static35.anInt935 == 85 && JagString.aClass40_587.length() > 0) {
						JagString.aClass40_587 = JagString.aClass40_587.method1180(JagString.aClass40_587.length() - 1, 0);
					}
					if (Static35.anInt935 == 84 || Static35.anInt935 == 80) {
						Static1.anInt91 = 0;
					}
					if (local211 && JagString.aClass40_587.length() < 20) {
						JagString.aClass40_587 = JagString.aClass40_587.method1192(Static4.anInt135);
					}
				}
			}
		} else if (Static1.anInt2143 == 3 && local22 == 1 && local26 >= 105 && local26 <= 255 && local20 >= 130 && local20 <= 170) {
			Static1.anInt2143 = 0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V", line = 12)
	public static void method1538() {
		if (SignLink.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static1.anIntArray549[186] = 57;
			Static1.anIntArray549[187] = 27;
			Static1.anIntArray549[188] = 71;
			Static1.anIntArray549[189] = 26;
			Static1.anIntArray549[190] = 72;
			Static1.anIntArray549[191] = 73;
			Static1.anIntArray549[192] = 58;
			Static1.anIntArray549[219] = 42;
			Static1.anIntArray549[220] = 74;
			Static1.anIntArray549[221] = 43;
			Static1.anIntArray549[222] = 59;
			Static1.anIntArray549[223] = 28;
			return;
		}
		Static1.anIntArray549[44] = 71;
		Static1.anIntArray549[45] = 26;
		Static1.anIntArray549[46] = 72;
		Static1.anIntArray549[47] = 73;
		Static1.anIntArray549[59] = 57;
		Static1.anIntArray549[61] = 27;
		Static1.anIntArray549[91] = 42;
		Static1.anIntArray549[92] = 74;
		Static1.anIntArray549[93] = 43;
		if (SignLink.aMethod1 == null) {
			Static1.anIntArray549[192] = 58;
			Static1.anIntArray549[222] = 59;
		} else {
			Static1.anIntArray549[192] = 28;
			Static1.anIntArray549[222] = 58;
			Static1.anIntArray549[520] = 59;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V", line = 52)
	public static void useMenuOption(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = menuAction[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		@Pc(22) int local22 = Static1.anIntArray454[arg0];
		@Pc(26) int local26 = Static1.anIntArray161[arg0];
		@Pc(30) int local30 = Static1.anIntArray165[arg0];
		if (Static1.anInt2399 != 0 && local12 != 1003) {
			Static1.anInt2399 = 0;
			redrawChatback = true;
		}
		@Pc(50) NpcEntity local50;
		@Pc(70) JagString local70;
		if (local12 == 1006) {
			local50 = npcs[local22];
			if (local50 != null) {
				@Pc(55) NpcType local55 = local50.type;
				if (local55.anIntArray154 != null) {
					local55 = local55.method611();
				}
				if (local55 != null) {
					if (local55.aClass40_237 == null) {
						local70 = JagString.concatenate(new JagString[] { JagString.aClass40_318, local55.aClass40_238, JagString.aClass40_306 });
					} else {
						local70 = local55.aClass40_237;
					}
					addMessage(0, JagString.EMPTY_STRING, local70);
				}
			}
		}
		if (local12 == 8) {
			local50 = npcs[local22];
			if (local50 != null) {
				tryMove(local50.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local50.pathTileX[0]);
				crossMode = 2;
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				crossCycle = 0;
				out.pIsaac1(110);
				out.p2_alt2(local22);
			}
		}
		if (local12 == 1005) {
			@Pc(161) int local161 = local22 >> 14 & 0x7FFF;
			@Pc(165) LocType local165 = LocType.get(local161);
			if (local165.aClass40_316 == null) {
				local70 = JagString.concatenate(new JagString[] { JagString.aClass40_318, local165.aClass40_315, JagString.aClass40_306 });
			} else {
				local70 = local165.aClass40_316;
			}
			addMessage(0, JagString.EMPTY_STRING, local70);
		}
		@Pc(225) boolean local225;
		if (local12 == 11) {
			local225 = tryMove(local30, 0, localPlayer.pathTileX[0], 0, 0, 2, false, 0, localPlayer.pathTileZ[0], 0, local26);
			if (!local225) {
				tryMove(local30, 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local26);
			}
			crossCycle = 0;
			crossMode = 2;
			anInt2465 = Static1.anInt2133;
			anInt1554 = Static1.anInt2500;
			out.pIsaac1(211);
			out.p2_alt2(Static28.anInt724);
			out.p2_alt1(Static91.anInt96);
			out.p2_alt1(local26 + sceneBaseTileX);
			out.p2(sceneBaseTileZ + local30);
			out.p4_alt1(Static97.anInt2526);
			out.p2(local22);
		}
		if (local12 == 56) {
			local50 = npcs[local22];
			if (local50 != null) {
				tryMove(local50.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local50.pathTileX[0]);
				anInt1554 = Static1.anInt2500;
				crossCycle = 0;
				anInt2465 = Static1.anInt2133;
				crossMode = 2;
				out.pIsaac1(212);
				out.p2_alt2(local22);
			}
		}
		if (local12 == 55) {
			out.pIsaac1(79);
			out.p4_alt2(local30);
			out.p2_alt3(local22);
			out.p2(local26);
			selectedArea = 2;
			Static1.anInt1171 = local30;
			Static1.anInt1947 = local26;
			if (anInt2585 == local30 >> 16) {
				selectedArea = 1;
			}
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
			selectedCycle = 0;
		}
		@Pc(407) JagString local407;
		@Pc(412) int local412;
		@Pc(427) long local427;
		if (local12 == 51 || local12 == 12 || local12 == 2 || local12 == 45) {
			local407 = menuOption[arg0];
			local412 = local407.method1200(JagString.aClass40_229);
			if (local412 != -1) {
				local427 = local407.method1185(local412 + 5).method1178().toBase37();
				if (local12 == 51) {
					addFriend(local427);
				}
				if (local12 == 12) {
					Static14.method1254(local427);
				}
				if (local12 == 2) {
					removeFriend(local427);
				}
				if (local12 == 45) {
					Static74.method1345(local427);
				}
			}
		}
		@Pc(462) PlayerEntity local462;
		if (local12 == 15) {
			local462 = players[local22];
			if (local462 != null) {
				tryMove(local462.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local462.pathTileX[0]);
				anInt2465 = Static1.anInt2133;
				crossCycle = 0;
				crossMode = 2;
				anInt1554 = Static1.anInt2500;
				out.pIsaac1(7);
				out.p2_alt3(local22);
			}
		}
		@Pc(529) ComType local529;
		if (local12 == 49) {
			out.pIsaac1(184);
			out.p4(local30);
			local529 = ComType.get(local30);
			if (local529.scripts != null && local529.scripts[0][0] == 5) {
				local412 = local529.scripts[0][1];
				if (local529.scriptOperand[0] != varps[local412]) {
					varps[local412] = local529.scriptOperand[0];
					Static21.method1700(local412);
					redrawSidebar = true;
				}
			}
		}
		@Pc(600) int local600;
		if (local12 == 20) {
			local407 = menuOption[arg0];
			local412 = local407.method1200(JagString.aClass40_229);
			if (local412 != -1) {
				local427 = local407.method1185(local412 + 5).method1178().toBase37();
				@Pc(598) int local598 = -1;
				for (local600 = 0; local600 < friendCount; local600++) {
					if (friendName37[local600] == local427) {
						local598 = local600;
						break;
					}
				}
				if (local598 != -1 && friendWorld[local598] > 0) {
					socialAction = 3;
					Static1.anInt2399 = 0;
					redrawChatback = true;
					showSocialInput = true;
					socialInput = JagString.EMPTY_STRING;
					Static1.aLong136 = friendName37[local598];
					JagString.aClass40_453 = JagString.concatenate(new JagString[] { JagString.aClass40_2, friendName[local598] });
				}
			}
		}
		if (local12 == 46) {
			out.pIsaac1(64);
			out.p4(local30);
			out.p2_alt3(local26);
			out.p2_alt3(local22);
			Static1.anInt1171 = local30;
			selectedArea = 2;
			selectedCycle = 0;
			Static1.anInt1947 = local26;
			if (local30 >> 16 == anInt2585) {
				selectedArea = 1;
			}
			if (local30 >> 16 == chatInterfaceId) {
				selectedArea = 3;
			}
		}
		if (local12 == 42) {
			local407 = menuOption[arg0];
			local412 = local407.method1200(JagString.aClass40_229);
			if (local412 != -1) {
				if (anInt2585 == -1) {
					closeInterfaces();
					if (Static1.anInt808 != -1) {
						JagString.aClass40_448 = local407.method1185(local412 + 5).method1178();
						Static1.anInt1826 = anInt2585 = Static1.anInt808;
						Static1.aBoolean103 = false;
					}
				} else {
					addMessage(0, JagString.EMPTY_STRING, JagString.aClass40_628);
				}
			}
		}
		if (local12 == 31) {
			local50 = npcs[local22];
			if (local50 != null) {
				tryMove(local50.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local50.pathTileX[0]);
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				crossMode = 2;
				crossCycle = 0;
				out.pIsaac1(133);
				out.p2_alt2(local22);
			}
		}
		if (local12 == 40) {
			out.pIsaac1(184);
			out.p4(local30);
			local529 = ComType.get(local30);
			if (local529.scripts != null && local529.scripts[0][0] == 5) {
				local412 = local529.scripts[0][1];
				varps[local412] = 1 - varps[local412];
				Static21.method1700(local412);
				redrawSidebar = true;
			}
		}
		if (local12 == 4) {
			out.pIsaac1(220);
			out.p2_alt1(local22);
			out.p2(local26);
			out.p4_alt2(local30);
			selectedArea = 2;
			selectedCycle = 0;
			Static1.anInt1947 = local26;
			Static1.anInt1171 = local30;
			if (anInt2585 == local30 >> 16) {
				selectedArea = 1;
			}
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
		}
		if (local12 == 33) {
			local462 = players[local22];
			if (local462 != null) {
				tryMove(local462.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local462.pathTileX[0]);
				crossMode = 2;
				crossCycle = 0;
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				out.pIsaac1(58);
				out.p2_alt2(local22);
			}
		}
		if (local12 == 44) {
			local50 = npcs[local22];
			if (local50 != null) {
				tryMove(local50.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local50.pathTileX[0]);
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				crossMode = 2;
				crossCycle = 0;
				out.pIsaac1(101);
				out.p4(Static77.anInt1992);
				out.p2_alt3(local22);
			}
		}
		if (local12 == 3) {
			local225 = tryMove(local30, 0, localPlayer.pathTileX[0], 0, 0, 2, false, 0, localPlayer.pathTileZ[0], 0, local26);
			if (!local225) {
				tryMove(local30, 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local26);
			}
			anInt2465 = Static1.anInt2133;
			crossMode = 2;
			anInt1554 = Static1.anInt2500;
			crossCycle = 0;
			out.pIsaac1(131);
			out.p2(local30 + sceneBaseTileZ);
			out.p2_alt2(local22);
			out.p2(local26 + sceneBaseTileX);
		}
		if (local12 == 16) {
			local225 = tryMove(local30, 0, localPlayer.pathTileX[0], 0, 0, 2, false, 0, localPlayer.pathTileZ[0], 0, local26);
			if (!local225) {
				tryMove(local30, 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local26);
			}
			crossMode = 2;
			anInt1554 = Static1.anInt2500;
			anInt2465 = Static1.anInt2133;
			crossCycle = 0;
			out.pIsaac1(200);
			out.p2(sceneBaseTileZ + local30);
			out.p2(sceneBaseTileX + local26);
			out.p2_alt1(local22);
		}
		@Pc(1208) boolean local1208;
		if (local12 == 54) {
			local529 = ComType.get(local30);
			local1208 = true;
			if (local529.clientCode > 0) {
				local1208 = handleInterfaceAction(local529);
			}
			if (local1208) {
				out.pIsaac1(184);
				out.p4(local30);
			}
		}
		if (local12 == 32) {
			closeInterfaces();
		}
		if (local12 == 41) {
			interactWithLoc(local30, local22, local26);
			out.pIsaac1(165);
			out.p2_alt3(local30 + sceneBaseTileZ);
			out.p2_alt2(sceneBaseTileX + local26);
			out.p2_alt1(local22 >> 14 & 0x7FFF);
		}
		@Pc(1295) NpcEntity local1295;
		if (local12 == 17) {
			local1295 = npcs[local22];
			if (local1295 != null) {
				tryMove(local1295.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local1295.pathTileX[0]);
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				crossMode = 2;
				crossCycle = 0;
				out.pIsaac1(185);
				out.p2_alt3(local22);
			}
		}
		if (local12 == 1) {
			objSelected = 1;
			Static28.anInt724 = local26;
			Static97.anInt2526 = local30;
			Static91.anInt96 = local22;
			JagString.aClass40_601 = ObjType.method1669(local22).aClass40_290;
			if (JagString.aClass40_601 == null) {
				JagString.aClass40_601 = JagString.aClass40_359;
			}
			spellSelected = 0;
			redrawSidebar = true;
			return;
		}
		if (local12 == 39) {
			out.pIsaac1(135);
			out.p2_alt3(local22);
			out.p4_alt2(local30);
			out.p2_alt2(local26);
			selectedArea = 2;
			selectedCycle = 0;
			if (local30 >> 16 == anInt2585) {
				selectedArea = 1;
			}
			Static1.anInt1171 = local30;
			Static1.anInt1947 = local26;
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
		}
		if (local12 == 22) {
			local1295 = npcs[local22];
			if (local1295 != null) {
				tryMove(local1295.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local1295.pathTileX[0]);
				anInt1554 = Static1.anInt2500;
				crossCycle = 0;
				crossMode = 2;
				anInt2465 = Static1.anInt2133;
				out.pIsaac1(164);
				out.p2_alt1(local22);
			}
		}
		if (local12 == 14) {
			local1208 = tryMove(local30, 0, localPlayer.pathTileX[0], 0, 0, 2, false, 0, localPlayer.pathTileZ[0], 0, local26);
			if (!local1208) {
				tryMove(local30, 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local26);
			}
			crossMode = 2;
			anInt2465 = Static1.anInt2133;
			anInt1554 = Static1.anInt2500;
			crossCycle = 0;
			out.pIsaac1(219);
			out.p2_alt1(sceneBaseTileX + local26);
			out.p2_alt1(local22);
			out.p2_alt1(local30 + sceneBaseTileZ);
		}
		@Pc(1556) ObjType local1556;
		if (local12 == 1001) {
			local1556 = ObjType.method1669(local22);
			if (local1556.aClass40_289 == null) {
				local70 = JagString.concatenate(new JagString[] { JagString.aClass40_318, local1556.aClass40_290, JagString.aClass40_306 });
			} else {
				local70 = local1556.aClass40_289;
			}
			addMessage(0, JagString.EMPTY_STRING, local70);
		}
		if (local12 == 28) {
			out.pIsaac1(66);
			out.p2_alt2(local26);
			out.p4_alt2(local30);
			out.p2(local22);
			out.p4(Static77.anInt1992);
			selectedArea = 2;
			Static1.anInt1947 = local26;
			if (local30 >> 16 == anInt2585) {
				selectedArea = 1;
			}
			selectedCycle = 0;
			Static1.anInt1171 = local30;
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
		}
		if (local12 == 35) {
			Static75.method1350(stickyChatInterfaceId);
			stickyChatInterfaceId = -1;
			redrawChatback = true;
		}
		if (local12 == 52) {
			out.pIsaac1(199);
			out.p2(local26);
			out.p4(local30);
			out.p2(local22);
			selectedCycle = 0;
			Static1.anInt1171 = local30;
			selectedArea = 2;
			if (anInt2585 == local30 >> 16) {
				selectedArea = 1;
			}
			if (local30 >> 16 == chatInterfaceId) {
				selectedArea = 3;
			}
			Static1.anInt1947 = local26;
		}
		if (local12 == 53) {
			out.pIsaac1(193);
			out.p4_alt3(local30);
			out.p2_alt1(local26);
			out.p2_alt2(local22);
			Static1.anInt1947 = local26;
			selectedArea = 2;
			if (anInt2585 == local30 >> 16) {
				selectedArea = 1;
			}
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
			Static1.anInt1171 = local30;
			selectedCycle = 0;
		}
		if (local12 == 34) {
			interactWithLoc(local30, local22, local26);
			out.pIsaac1(222);
			out.p2_alt1(sceneBaseTileZ + local30);
			out.p2_alt3(local22 >> 14 & 0x7FFF);
			out.p2_alt2(sceneBaseTileX + local26);
		}
		if (local12 == 47) {
			out.pIsaac1(192);
			out.p4_alt1(local30);
			out.p2_alt2(local26);
			out.p2_alt3(local22);
			Static1.anInt1171 = local30;
			selectedCycle = 0;
			selectedArea = 2;
			Static1.anInt1947 = local26;
			if (anInt2585 == local30 >> 16) {
				selectedArea = 1;
			}
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
		}
		if (local12 == 26) {
			out.pIsaac1(194);
			out.p2(local22);
			out.p4_alt2(local30);
			out.p2_alt3(local26);
			selectedCycle = 0;
			Static1.anInt1947 = local26;
			Static1.anInt1171 = local30;
			selectedArea = 2;
			if (anInt2585 == local30 >> 16) {
				selectedArea = 1;
			}
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
		}
		if (local12 == 1002) {
			local1556 = ObjType.method1669(local22);
			@Pc(1908) ComType local1908 = ComType.get(local30);
			if (local1908 != null && local1908.invSlotObjId[local26] >= 100000) {
				local70 = JagString.concatenate(new JagString[] { Static48.method859(local1908.invSlotObjId[local26]), JagString.aClass40_496, local1556.aClass40_290 });
			} else if (local1556.aClass40_289 == null) {
				local70 = JagString.concatenate(new JagString[] { JagString.aClass40_318, local1556.aClass40_290, JagString.aClass40_306 });
			} else {
				local70 = local1556.aClass40_289;
			}
			addMessage(0, JagString.EMPTY_STRING, local70);
		}
		if (local12 == 1004) {
			interactWithLoc(local30, local22, local26);
			out.pIsaac1(33);
			out.p2_alt3(local30 + sceneBaseTileZ);
			out.p2_alt2(sceneBaseTileX + local26);
			out.p2_alt2(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 10) {
			interactWithLoc(local30, local22, local26);
			out.pIsaac1(3);
			out.p2(sceneBaseTileX + local26);
			out.p2_alt3(sceneBaseTileZ + local30);
			out.p2_alt1(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 23) {
			out.pIsaac1(29);
			out.p2_alt1(local26);
			out.p2(local22);
			out.p4_alt1(local30);
			selectedArea = 2;
			Static1.anInt1171 = local30;
			Static1.anInt1947 = local26;
			if (anInt2585 == local30 >> 16) {
				selectedArea = 1;
			}
			selectedCycle = 0;
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
		}
		if (local12 == 18 && !Static1.aBoolean40) {
			out.pIsaac1(11);
			Static1.aBoolean40 = true;
		}
		@Pc(2157) JagString local2157;
		if (local12 == 21) {
			@Pc(2125) ComType local2125 = ComType.get(local30);
			objSelected = 0;
			local70 = local2125.actionVerb;
			redrawSidebar = true;
			Static77.anInt1992 = local30;
			Static78.anInt2027 = local2125.actionTarget;
			spellSelected = 1;
			if (local70.method1200(JagString.aClass40_716) != -1) {
				local70 = local70.method1180(local70.method1200(JagString.aClass40_716), 0);
			}
			local2157 = local2125.actionVerb;
			if (local2157.method1200(JagString.aClass40_716) != -1) {
				local2157 = local2157.method1185(local2157.method1200(JagString.aClass40_716) + 1);
			}
			JagString.aClass40_567 = JagString.concatenate(new JagString[] { local70, JagString.aClass40_716, local2125.action, JagString.aClass40_716, local2157 });
			if (Static78.anInt2027 == 16) {
				redrawSidebar = true;
				selectedTab = 3;
				Static1.aBoolean184 = true;
			}
			return;
		}
		if (local12 == 24) {
			if (menuVisible) {
				scene.method1450(local26 - 4, local30 + -4);
			} else {
				scene.method1450(Static1.anInt2500 - 4, Static1.anInt2133 + -4);
			}
		}
		if (local12 == 13) {
			local1208 = tryMove(local30, 0, localPlayer.pathTileX[0], 0, 0, 2, false, 0, localPlayer.pathTileZ[0], 0, local26);
			if (!local1208) {
				tryMove(local30, 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local26);
			}
			crossMode = 2;
			anInt2465 = Static1.anInt2133;
			crossCycle = 0;
			anInt1554 = Static1.anInt2500;
			out.pIsaac1(156);
			out.p2_alt2(local22);
			out.p2(sceneBaseTileX + local26);
			out.p2_alt2(sceneBaseTileZ + local30);
		}
		if (local12 == 6 && interactWithLoc(local30, local22, local26)) {
			out.pIsaac1(116);
			out.p2(sceneBaseTileZ + local30);
			out.p2_alt1(local26 + sceneBaseTileX);
			out.p2_alt1(local22 >> 14 & 0x7FFF);
			out.p4_alt2(Static77.anInt1992);
		}
		if (local12 == 29 || local12 == 37) {
			@Pc(2368) JagString local2368 = menuOption[arg0];
			@Pc(2373) int local2373 = local2368.method1200(JagString.aClass40_229);
			if (local2373 != -1) {
				local2368 = local2368.method1185(local2373 + 5).method1178();
				local2157 = local2368.method1175().formatName();
				@Pc(2394) boolean local2394 = false;
				for (local600 = 0; local600 < playerCount; local600++) {
					@Pc(2404) PlayerEntity local2404 = players[playerIds[local600]];
					if (local2404 != null && local2404.name != null && local2404.name.method1199(local2157)) {
						local2394 = true;
						tryMove(local2404.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local2404.pathTileX[0]);
						if (local12 == 29) {
							out.pIsaac1(235);
							out.p2_alt2(playerIds[local600]);
						}
						if (local12 == 37) {
							out.pIsaac1(7);
							out.p2_alt3(playerIds[local600]);
						}
						break;
					}
				}
				if (!local2394) {
					addMessage(0, JagString.EMPTY_STRING, JagString.concatenate(new JagString[] { JagString.aClass40_246, local2157 }));
				}
			}
		}
		@Pc(2510) PlayerEntity local2510;
		if (local12 == 30) {
			local2510 = players[local22];
			if (local2510 != null) {
				tryMove(local2510.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local2510.pathTileX[0]);
				crossMode = 2;
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				crossCycle = 0;
				out.pIsaac1(36);
				out.p2_alt3(local22);
			}
		}
		if (local12 == 9 && interactWithLoc(local30, local22, local26)) {
			out.pIsaac1(44);
			out.p2_alt3(Static91.anInt96);
			out.p2_alt1(local22 >> 14 & 0x7FFF);
			out.p2(Static28.anInt724);
			out.p2(local30 + sceneBaseTileZ);
			out.p4_alt3(Static97.anInt2526);
			out.p2_alt3(local26 + sceneBaseTileX);
		}
		if (local12 == 27) {
			out.pIsaac1(228);
			out.p4_alt3(local30);
			out.p2_alt3(local26);
			out.p2(local22);
			Static1.anInt1171 = local30;
			selectedArea = 2;
			selectedCycle = 0;
			if (local30 >> 16 == anInt2585) {
				selectedArea = 1;
			}
			Static1.anInt1947 = local26;
			if (chatInterfaceId == local30 >> 16) {
				selectedArea = 3;
			}
		}
		if (local12 == 38) {
			local2510 = players[local22];
			if (local2510 != null) {
				tryMove(local2510.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local2510.pathTileX[0]);
				crossMode = 2;
				crossCycle = 0;
				anInt1554 = Static1.anInt2500;
				anInt2465 = Static1.anInt2133;
				out.pIsaac1(235);
				out.p2_alt2(local22);
			}
		}
		if (local12 == 19) {
			out.pIsaac1(142);
			out.p2_alt2(local26);
			out.p2_alt2(Static91.anInt96);
			out.p2_alt2(local22);
			out.p2_alt3(Static28.anInt724);
			out.p4_alt3(local30);
			out.p4_alt3(Static97.anInt2526);
			Static1.anInt1171 = local30;
			selectedArea = 2;
			if (local30 >> 16 == anInt2585) {
				selectedArea = 1;
			}
			Static1.anInt1947 = local26;
			if (local30 >> 16 == chatInterfaceId) {
				selectedArea = 3;
			}
			selectedCycle = 0;
		}
		if (local12 == 36) {
			local2510 = players[local22];
			if (local2510 != null) {
				tryMove(local2510.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local2510.pathTileX[0]);
				crossCycle = 0;
				crossMode = 2;
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				out.pIsaac1(147);
				out.p4_alt2(Static77.anInt1992);
				out.p2(local22);
			}
		}
		if (local12 == 48) {
			local1208 = tryMove(local30, 0, localPlayer.pathTileX[0], 0, 0, 2, false, 0, localPlayer.pathTileZ[0], 0, local26);
			if (!local1208) {
				tryMove(local30, 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local26);
			}
			anInt2465 = Static1.anInt2133;
			crossMode = 2;
			anInt1554 = Static1.anInt2500;
			crossCycle = 0;
			out.pIsaac1(108);
			out.p2_alt3(sceneBaseTileX + local26);
			out.p4_alt2(Static77.anInt1992);
			out.p2(local22);
			out.p2_alt1(local30 + sceneBaseTileZ);
		}
		if (local12 == 50) {
			local1208 = tryMove(local30, 0, localPlayer.pathTileX[0], 0, 0, 2, false, 0, localPlayer.pathTileZ[0], 0, local26);
			if (!local1208) {
				tryMove(local30, 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local26);
			}
			anInt1554 = Static1.anInt2500;
			anInt2465 = Static1.anInt2133;
			crossMode = 2;
			crossCycle = 0;
			out.pIsaac1(202);
			out.p2(local30 + sceneBaseTileZ);
			out.p2_alt2(local22);
			out.p2_alt3(sceneBaseTileX + local26);
		}
		if (local12 == 7) {
			local1295 = npcs[local22];
			if (local1295 != null) {
				tryMove(local1295.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local1295.pathTileX[0]);
				anInt1554 = Static1.anInt2500;
				crossMode = 2;
				crossCycle = 0;
				anInt2465 = Static1.anInt2133;
				out.pIsaac1(4);
				out.p2(local22);
				out.p2(Static28.anInt724);
				out.p4(Static97.anInt2526);
				out.p2_alt1(Static91.anInt96);
			}
		}
		if (local12 == 43) {
			local2510 = players[local22];
			if (local2510 != null) {
				tryMove(local2510.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local2510.pathTileX[0]);
				crossMode = 2;
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				crossCycle = 0;
				out.pIsaac1(190);
				out.p2_alt3(local22);
			}
		}
		if (local12 == 5) {
			interactWithLoc(local30, local22, local26);
			out.pIsaac1(139);
			out.p2_alt1(local30 + sceneBaseTileZ);
			out.p2_alt3(local26 + sceneBaseTileX);
			out.p2_alt2(local22 >> 14 & 0x7FFF);
		}
		if (local12 == 25) {
			local2510 = players[local22];
			if (local2510 != null) {
				tryMove(local2510.pathTileZ[0], 0, localPlayer.pathTileX[0], 1, 0, 2, false, 0, localPlayer.pathTileZ[0], 1, local2510.pathTileX[0]);
				crossMode = 2;
				crossCycle = 0;
				anInt2465 = Static1.anInt2133;
				anInt1554 = Static1.anInt2500;
				out.pIsaac1(214);
				out.p2_alt3(Static91.anInt96);
				out.p4_alt3(Static97.anInt2526);
				out.p2(Static28.anInt724);
				out.p2_alt1(local22);
			}
		}
		if (objSelected != 0) {
			redrawSidebar = true;
			objSelected = 0;
		}
		if (spellSelected != 0) {
			redrawSidebar = true;
			spellSelected = 0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 271)
	public static void method1246() {
		try {
			if (Static1.anInt693 == 0) {
				Static1.aBoolean164 = false;
				Static1.anInt2039 = 0;
				Static48.aClass48_5 = null;
				Static1.anInt693 = 1;
				stream = null;
			}
			if (Static1.anInt693 == 1) {
				if (Static48.aClass48_5 == null) {
					Static48.aClass48_5 = signlink.method202(Static54.anInt1500);
				}
				if (Static48.aClass48_5.status == 2) {
					throw new IOException();
				}
				if (Static48.aClass48_5.status == 1) {
					stream = new ClientStream((Socket) Static48.aClass48_5.result, signlink);
					Static48.aClass48_5 = null;
					Static1.anInt693 = 2;
				}
			}
			if (Static1.anInt693 == 2) {
				@Pc(71) long local71 = Static94.aLong150 = JagString.aClass40_591.toBase37();
				out.pos = 0;
				@Pc(81) int local81 = (int) (local71 >> 16 & 0x1FL);
				out.p1(14);
				out.p1(local81);
				stream.write(out.data, 2);
				Static1.anInt693 = 3;
				in.pos = 0;
			}
			@Pc(108) int local108;
			if (Static1.anInt693 == 3) {
				local108 = stream.method726();
				if (local108 != 0) {
					Static88.method1552(local108);
					return;
				}
				Static1.anInt693 = 4;
				in.pos = 0;
			}
			if (Static1.anInt693 == 4) {
				if (in.pos < 8) {
					local108 = stream.available();
					if (local108 > 8 - in.pos) {
						local108 = 8 - in.pos;
					}
					if (local108 > 0) {
						stream.read(in.pos, local108, in.data);
						in.pos += local108;
					}
				}
				if (in.pos == 8) {
					in.pos = 0;
					Static1.aLong139 = in.g8();
					Static1.anInt693 = 5;
				}
			}
			if (Static1.anInt693 == 5) {
				@Pc(185) int[] local185 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static1.aLong139 >> 32), (int) Static1.aLong139 };
				out.pos = 0;
				out.p1(10);
				out.p4(local185[0]);
				out.p4(local185[1]);
				out.p4(local185[2]);
				out.p4(local185[3]);
				out.p4(signlink.anInt249);
				out.p8(JagString.aClass40_591.toBase37());
				out.pjstr(JagString.aClass40_587);
				out.rsaenc(Static1.aBigInteger2, Static1.aBigInteger1);
				Static1.aClass2_Sub3_Sub1_3.pos = 0;
				if (state == 40) {
					Static1.aClass2_Sub3_Sub1_3.p1(18);
				} else {
					Static1.aClass2_Sub3_Sub1_3.p1(16);
				}
				Static1.aClass2_Sub3_Sub1_3.p1(out.pos + 53);
				Static1.aClass2_Sub3_Sub1_3.p4(410);
				Static1.aClass2_Sub3_Sub1_3.p1(lowMemory ? 1 : 0);
				Static1.aClass2_Sub3_Sub1_3.p4(animsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(basesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(configJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(interfacesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(synthSoundsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(mapsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(midiSongsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(modelsJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(spritesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(texturesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(binaryJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.p4(midiJinglesJs5.crc);
				Static1.aClass2_Sub3_Sub1_3.pdata(out.data, out.pos);
				stream.write(Static1.aClass2_Sub3_Sub1_3.data, Static1.aClass2_Sub3_Sub1_3.pos);
				out.setSeed(local185);
				for (@Pc(379) int local379 = 0; local379 < 4; local379++) {
					local185[local379] += 50;
				}
				in.setSeed(local185);
				Static1.anInt693 = 6;
			}
			if (Static1.anInt693 == 6 && stream.available() > 0) {
				local108 = stream.method726();
				if (local108 == 21 && state == 20) {
					Static1.anInt693 = 7;
				} else if (local108 == 2) {
					Static1.anInt693 = 9;
				} else if (local108 == 15 && state == 40) {
					method1406();
					return;
				} else if (local108 == 23 && Static1.anInt1649 < 1) {
					Static1.anInt1649++;
					Static1.anInt693 = 0;
				} else {
					Static88.method1552(local108);
					return;
				}
			}
			if (Static1.anInt693 == 7 && stream.available() > 0) {
				Static1.anInt261 = (stream.method726() + 3) * 60;
				Static1.anInt693 = 8;
			}
			if (Static1.anInt693 == 8) {
				Static1.anInt2039 = 0;
				Static45.method1537(JagString.aClass40_314, JagString.concatenate(new JagString[] { JagString.aClass40_623, Static48.method859(Static1.anInt261 / 60) }));
				if (--Static1.anInt261 <= 0) {
					Static1.anInt693 = 0;
				}
			} else {
				if (Static1.anInt693 == 9 && stream.available() >= 8) {
					Static1.anInt1550 = stream.method726();
					Static1.aBoolean149 = stream.method726() == 1;
					Static1.anInt1955 = stream.method726();
					Static1.anInt1955 <<= 0x8;
					Static1.anInt1955 += stream.method726();
					anInt927 = stream.method726();
					stream.read(0, 1, in.data);
					in.pos = 0;
					packetType = in.gIsaac1();
					stream.read(0, 2, in.data);
					in.pos = 0;
					packetSize = in.g2();
					Static1.anInt693 = 10;
				}
				if (Static1.anInt693 != 10) {
					Static1.anInt2039++;
					if (Static1.anInt2039 > 2000) {
						if (Static1.anInt1649 < 1) {
							Static1.anInt1649++;
							if (Static54.anInt1500 == anInt2341) {
								Static54.anInt1500 = Static47.anInt1173;
							} else {
								Static54.anInt1500 = anInt2341;
							}
							Static1.anInt693 = 0;
						} else {
							Static88.method1552(-3);
						}
					}
				} else if (stream.available() >= packetSize) {
					in.pos = 0;
					stream.read(0, packetSize, in.data);
					method1671();
					Static51.anInt2327 = -1;
					Static91.method58(false);
					packetType = -1;
				}
			}
		} catch (@Pc(661) IOException local661) {
			if (Static1.anInt1649 < 1) {
				if (Static54.anInt1500 == anInt2341) {
					Static54.anInt1500 = Static47.anInt1173;
				} else {
					Static54.anInt1500 = anInt2341;
				}
				Static1.anInt1649++;
				Static1.anInt693 = 0;
			} else {
				Static88.method1552(-2);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 4)
	@Override
	protected void draw() {
		if (state == 0) {
			drawProgress(null, JagString.aClass40_680, Static1.anInt2194);
		} else if (state == 5) {
			method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, graphics, fondBold12);
		} else if (state == 10) {
			method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, graphics, fondBold12);
		} else if (state == 20) {
			method1589(Static70.aClass2_Sub2_Sub2_Sub2_4, graphics, fondBold12);
		} else if (state == 25) {
			@Pc(97) int local97;
			if (Static1.anInt375 == 1) {
				if (Static1.anInt805 < Static1.anInt1080) {
					Static1.anInt805 = Static1.anInt1080;
				}
				local97 = (Static1.anInt805 - Static1.anInt1080) * 50 / Static1.anInt805;
				method1095(true, JagString.concatenate(new JagString[] { JagString.aClass40_63, Static48.method859(local97), JagString.aClass40_335 }), JagString.aClass40_674);
			} else if (Static1.anInt375 == 2) {
				if (Static1.anInt2455 < Static1.anInt1667) {
					Static1.anInt2455 = Static1.anInt1667;
				}
				local97 = (Static1.anInt2455 - Static1.anInt1667) * 50 / Static1.anInt2455 + 50;
				method1095(true, JagString.concatenate(new JagString[] { JagString.aClass40_63, Static48.method859(local97), JagString.aClass40_335 }), JagString.aClass40_674);
			} else {
				method1095(false, null, JagString.aClass40_674);
			}
		} else if (state == 30) {
			drawGame();
		} else if (state == 35) {
			method1492();
		} else if (state == 40) {
			method1095(false, JagString.aClass40_13, JagString.aClass40_714);
		}
		dragCycles = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 92)
	private void setJs5ErrorState(@OriginalArg(1) int arg0) {
		js5ConnectState = 0;
		js5ErrorCount++;
		if (anInt2341 == Static54.anInt1500) {
			Static54.anInt1500 = Static47.anInt1173;
		} else {
			Static54.anInt1500 = anInt2341;
		}
		js5Stream = null;
		Static72.aClass48_7 = null;
		if (js5ErrorCount >= 2 && (arg0 == 7 || arg0 == 9)) {
			if (state > 5) {
				Static1.anInt1097 = 3000;
			} else {
				this.error("js5connect_full");
				state = 1000;
			}
		} else if (js5ErrorCount >= 2 && arg0 == 6) {
			this.error("js5connect_outofdate");
			state = 1000;
		} else if (js5ErrorCount >= 4) {
			if (state <= 5) {
				this.error("js5connect");
				state = 1000;
			} else {
				Static1.anInt1097 = 3000;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 150)
	@Override
	protected void method327() {
		anInt2341 = modeWhere == 0 ? 43594 : worldId + 40000;
		Static54.anInt1500 = anInt2341;
		Static47.anInt1173 = modeWhere == 0 ? 443 : worldId + 50000;
		method1538();
		Static35.method712(GameShell.method185());
		Static62.method1097(GameShell.method185());
		Static95.anInt2495 = Static1.anInt248;
		try {
			@Pc(55) int local55;
			if (GameShell.signlink.cacheData != null) {
				Static61.cacheDat = new BufferedFile(GameShell.signlink.cacheData, 5200, 0);
				for (int i = 0; i < 12; i++) {
					Static1.cacheIndex[i] = new BufferedFile(GameShell.signlink.cacheIndexes[i], 6000, 0);
				}
				Static97.cacheMasterIndex = new BufferedFile(GameShell.signlink.cacheMasterIndex, 6000, 0);
				Static68.masterCache = new Cache(255, Static61.cacheDat, Static97.cacheMasterIndex, 500000);
				GameShell.signlink.cacheMasterIndex = null;
				GameShell.signlink.cacheData = null;
				GameShell.signlink.cacheIndexes = null;
			}
			if (GameShell.signlink.legacyCacheData != null) {
				Static9.legacyCacheDat = new BufferedFile(GameShell.signlink.legacyCacheData, 5200, 0);
				for (local55 = 0; local55 < 5; local55++) {
					Static1.legacyCacheIndex[local55] = new BufferedFile(GameShell.signlink.legacyCacheIndex[local55], 6000, 0);
				}
				GameShell.signlink.legacyCacheData = null;
				GameShell.signlink.legacyCacheIndex = null;
			}
		} catch (@Pc(144) IOException local144) {
			Static61.cacheDat = null;
			Static9.legacyCacheDat = null;
			Static97.cacheMasterIndex = null;
			Static68.masterCache = null;
		}
		if (modeWhere != 0) {
			Static1.aBoolean173 = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 221)
	private void method342() {
		if (state != 1000) {
			@Pc(10) boolean local10 = Static32.method625();
			if (!local10) {
				this.method343();
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 293)
	@Override
	public void init() {
		if (!this.isValidHost()) {
			return;
		}
		worldId = Integer.parseInt(this.getParameter("worldid"));
		modeWhat = Integer.parseInt(this.getParameter("modewhat"));
		modeWhere = Integer.parseInt(this.getParameter("modewhere"));
		@Pc(29) String lowmem = this.getParameter("lowmem");
		if (lowmem != null && lowmem.equals("1")) {
			setLowMemory();
		} else {
			setHighMemory();
		}
		@Pc(45) String members = this.getParameter("members");
		if (members != null && members.equals("1")) {
			membersWorld = true;
		} else {
			membersWorld = false;
		}
		this.initApplet(modeWhat + 32);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 334)
	private void method343() {
		if (Static1.anInt1792 >= 4) {
			this.error("js5crc");
			state = 1000;
			return;
		}
		if (Static1.anInt2401 >= 4) {
			if (state <= 5) {
				this.error("js5io");
				state = 1000;
				return;
			}
			Static1.anInt2401 = 3;
			Static1.anInt1097 = 3000;
		}
		if (Static1.anInt1097-- > 0) {
			return;
		}
		try {
			if (js5ConnectState == 0) {
				Static72.aClass48_7 = GameShell.signlink.method202(Static54.anInt1500);
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				if (Static72.aClass48_7.status == 2) {
					this.setJs5ErrorState(-1);
					return;
				}
				if (Static72.aClass48_7.status == 1) {
					js5ConnectState++;
				}
			}
			if (js5ConnectState == 2) {
				js5Stream = new ClientStream((Socket) Static72.aClass48_7.result, GameShell.signlink);
				@Pc(103) Packet buf = new Packet(5);
				buf.p1(15);
				buf.p4(410);
				js5Stream.write(buf.data, 5);
				js5ConnectState++;
				Static11.aLong24 = System.currentTimeMillis();
			}
			if (js5ConnectState == 3) {
				if (state <= 5 || js5Stream.available() > 0) {
					@Pc(142) int local142 = js5Stream.method726();
					if (local142 != 0) {
						this.setJs5ErrorState(local142);
						return;
					}
					js5ConnectState++;
				} else if (System.currentTimeMillis() - Static11.aLong24 > 30000L) {
					this.setJs5ErrorState(-2);
					return;
				}
			}
			if (js5ConnectState == 4) {
				Static73.method1336(js5Stream, state > 20);
				js5ErrorCount = 0;
				Static72.aClass48_7 = null;
				js5Stream = null;
				js5ConnectState = 0;
			}
		} catch (@Pc(196) IOException local196) {
			this.setJs5ErrorState(-3);
		}
	}

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 455)
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 5) {
				printUsage();
			}
			worldId = Integer.parseInt(arg0[0]);
			if (arg0[1].equals("live")) {
				modeWhere = 0;
			} else if (arg0[1].equals("office")) {
				modeWhere = 1;
			} else if (arg0[1].equals("local")) {
				modeWhere = 2;
			} else {
				printUsage();
			}
			if (arg0[2].equals("live")) {
				modeWhat = 0;
			} else if (arg0[2].equals("rc")) {
				modeWhat = 1;
			} else if (arg0[2].equals("wip")) {
				modeWhat = 2;
			} else {
				printUsage();
			}
			if (arg0[3].equals("lowmem")) {
				setLowMemory();
			} else if (arg0[3].equals("highmem")) {
				setHighMemory();
			} else {
				printUsage();
			}
			if (arg0[4].equals("free")) {
				membersWorld = false;
			} else if (arg0[4].equals("members")) {
				membersWorld = true;
			} else {
				printUsage();
			}
			@Pc(124) client cl = new client();
			cl.initApplication("runescape", modeWhat + 32, InetAddress.getLocalHost());
		} catch (@Pc(138) Exception ex) {
			JagException.report(null, ex);
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 569)
	@Override
	protected void unload() {
		Static15.method344();
		Static66.method1170();
		Static63.method325();
		Static83.method1466();
		Static71.method1278();
		Static70.method1472();
		Static46.method847();
		Static76.method1358();
		Static21.method1689();
		Static36.method733();
		Static4.method96();
		Static16.method345();
		Static12.method254();
		Static88.method1554();
		Static98.method1738();
		PixFont.method571();
		World3D.method1431();
		Static26.method541();
		Static49.method919();
		Static69.method1219();
		Static58.method1058();
		Static82.method1464();
		Static55.method1003();
		Static51.method1546();
		Static33.method635();
		Static31.method613();
		Static7.method191();
		Static29.method1679();
		Static10.method234();
		Static34.method642();
		Static43.method1635();
		Static91.method70();
		Static72.method1328();
		Static24.method525();
		Model.method1150();
		Static13.method263();
		Static64.method1112();
		Static61.method1093();
		Static80.method1405();
		Static45.method1531();
		Static90.method1569();
		Static1.method5();
		Static3.method24();
		Static74.method1346();
		Static109.method1102();
		Static47.method852();
		Static95.method1652();
		Static77.method1363();
		Static86.method1498();
		Static99.method1653();
		Static2.method20();
		Static96.method1666();
		Static67.method1206();
		Static38.method753();
		Static54.method994();
		Draw3D.unload();
		Static25.method1605();
		Static56.method1041();
		Static27.method581();
		Static62.method1096();
		Static22.method474();
		Static94.method1643();
		Static92.method1580();
		Static39.method775();
		Static35.method720();
		Static79.method1398();
		Static23.method506();
		Static5.method118();
		Static41.method790();
		Static20.method398();
		Static37.method740();
		Static68.method1211();
		Static28.method584();
		Static73.method1339();
		Static85.method1488();
		SoundTone.method842();
		Static9.method229();
		Static50.method940();
		Static87.method1520();
		Static18.method368();
		Static53.method991();
		Static78.method1382();
		Static57.method1043();
		Static32.method622();
		Static42.method802();
		Static19.method386();
		Static84.method1482();
		Static75.method1352();
		SoundFilter.method1064();
		Static97.method1670();
		BZip2.method1272();
		Static93.method1591();
		SeqFrame.method804();
		Static30.method593();
		Static48.method858();
		Static40.method1245();
		Static11.method250();
		AudioChannel.method1086();
		SignLinkAudioChannel.method1092();
		Static17.method356();
		Static89.method1562();
		Static14.method1264();
		MidiDecoder.method224();
		Static44.method823();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 686)
	@Override
	protected void mainQuit() {
		if (Static41.aClass52_1 != null) {
			Static41.aClass52_1.running = false;
		}
		Static41.aClass52_1 = null;
		if (stream != null) {
			stream.close();
		}
		Static45.method1530();
		Static51.method1541();
		Static86.method1493();
		Static7.method183();
		Static88.method1550();
		Static71.method1279();
		try {
			if (Static61.cacheDat != null) {
				Static61.cacheDat.method353();
			}
			@Pc(43) int local43;
			if (Static1.cacheIndex != null) {
				for (local43 = 0; local43 < Static1.cacheIndex.length; local43++) {
					if (Static1.cacheIndex[local43] != null) {
						Static1.cacheIndex[local43].method353();
					}
				}
			}
			if (Static97.cacheMasterIndex != null) {
				Static97.cacheMasterIndex.method353();
			}
			if (Static9.legacyCacheDat != null) {
				Static9.legacyCacheDat.method353();
			}
			if (Static1.legacyCacheIndex != null) {
				for (local43 = 0; local43 < Static1.legacyCacheIndex.length; local43++) {
					if (Static1.legacyCacheIndex[local43] != null) {
						Static1.legacyCacheIndex[local43].method353();
					}
				}
			}
		} catch (@Pc(95) IOException local95) {
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 779)
	@Override
	protected void update() {
		loopCycle++;
		this.method342();
		Static73.method1341();
		Static86.method1500();
		Static16.method347();
		Static62.method1101();
		Static49.method916();
		if (state == 0) {
			method1647();
			Static24.method524();
		} else if (state == 5) {
			method1647();
			Static24.method524();
		} else if (state == 10) {
			method1548();
		} else if (state == 20) {
			method1548();
			method1246();
		} else if (state == 25) {
			method1205();
		}
		if (state == 30) {
			updateGame();
		} else if (state == 35) {
			updateGame();
		} else if (state == 40) {
			method1246();
		}
	}
}

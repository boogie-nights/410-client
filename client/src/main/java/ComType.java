import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

// Actually Component, but we'll clash with AWT's names in the default package
@OriginalClass("client!mc")
public final class ComType extends Hashable {

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lclient!qc;")
	public static LruCache aClass47_8 = new LruCache(200);
	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!qc;")
	public static LruCache aClass47_20 = new LruCache(50);
	@OriginalMember(owner = "client!k", name = "v", descriptor = "[[Lclient!mc;")
	public static ComType[][] instances;
	@OriginalMember(owner = "client!ra", name = "v", descriptor = "Lclient!ud;")
	public static Js5Index aClass5_26;
	@OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
	public int font;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "Z")
	public boolean center;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "Z")
	public boolean hide;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
	public int anInt1573;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
	public int anim;

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "Z")
	public boolean shadowed;

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
	public int buttonType;

	@OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
	private int activeModel;

	@OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
	public int xan;

	@OriginalMember(owner = "client!mc", name = "ib", descriptor = "Lclient!o;")
	public JagString action;

	@OriginalMember(owner = "client!mc", name = "jb", descriptor = "[I")
	public int[] invSlotObjId;

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "[[I")
	public int[][] scripts;

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
	public int anInt1582;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "[I")
	public int[] invSlotOffsetX;

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "I")
	public int anInt1583;

	@OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
	public int colour;

	@OriginalMember(owner = "client!mc", name = "rb", descriptor = "[I")
	public int[] invSlotSprite;

	@OriginalMember(owner = "client!mc", name = "sb", descriptor = "Lclient!o;")
	public JagString text;

	@OriginalMember(owner = "client!mc", name = "tb", descriptor = "I")
	public int graphic;

	@OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
	public int zoom;

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "I")
	public int anInt1587;

	@OriginalMember(owner = "client!mc", name = "wb", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
	public int activeColour;

	@OriginalMember(owner = "client!mc", name = "yb", descriptor = "I")
	private int anInt1590;

	@OriginalMember(owner = "client!mc", name = "Ab", descriptor = "I")
	public int activeAnim;

	@OriginalMember(owner = "client!mc", name = "Bb", descriptor = "[Lclient!o;")
	public JagString[] iop;

	@OriginalMember(owner = "client!mc", name = "Cb", descriptor = "Lclient!o;")
	public JagString option;

	@OriginalMember(owner = "client!mc", name = "Fb", descriptor = "I")
	public int anInt1594;

	@OriginalMember(owner = "client!mc", name = "Ib", descriptor = "Z")
	public boolean interactable;

	@OriginalMember(owner = "client!mc", name = "Jb", descriptor = "Lclient!o;")
	public JagString activeText;

	@OriginalMember(owner = "client!mc", name = "Lb", descriptor = "I")
	public int activeGraphic;

	@OriginalMember(owner = "client!mc", name = "Mb", descriptor = "I")
	public int actionTarget;

	@OriginalMember(owner = "client!mc", name = "Nb", descriptor = "[I")
	public int[] invSlotOffsetY;

	@OriginalMember(owner = "client!mc", name = "Qb", descriptor = "I")
	public int scroll;

	@OriginalMember(owner = "client!mc", name = "Rb", descriptor = "I")
	public int model;

	@OriginalMember(owner = "client!mc", name = "Tb", descriptor = "I")
	public int anInt1604;

	@OriginalMember(owner = "client!mc", name = "Ub", descriptor = "I")
	public int anInt1605;

	@OriginalMember(owner = "client!mc", name = "Vb", descriptor = "[I")
	public int[] invSlotObjCount;

	@OriginalMember(owner = "client!mc", name = "Wb", descriptor = "Z")
	public boolean draggable;

	@OriginalMember(owner = "client!mc", name = "Yb", descriptor = "I")
	public int anInt1607;

	@OriginalMember(owner = "client!mc", name = "Zb", descriptor = "[I")
	public int[] scriptComparator;

	@OriginalMember(owner = "client!mc", name = "bc", descriptor = "[I")
	public int[] scriptOperand;

	@OriginalMember(owner = "client!mc", name = "dc", descriptor = "Lclient!o;")
	public JagString actionVerb;

	@OriginalMember(owner = "client!mc", name = "ec", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!mc", name = "fc", descriptor = "I")
	public int clientCode;

	@OriginalMember(owner = "client!mc", name = "gc", descriptor = "I")
	public int anInt1611;

	@OriginalMember(owner = "client!mc", name = "ic", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!mc", name = "jc", descriptor = "I")
	public int yan;

	@OriginalMember(owner = "client!mc", name = "lc", descriptor = "Z")
	public boolean usable;

	@OriginalMember(owner = "client!mc", name = "mc", descriptor = "Z")
	public boolean fill;

	@OriginalMember(owner = "client!mc", name = "nc", descriptor = "I")
	public int overColour;

	@OriginalMember(owner = "client!mc", name = "oc", descriptor = "I")
	public int anInt1616;

	@OriginalMember(owner = "client!mc", name = "pc", descriptor = "I")
	public int anInt1617;

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
	public int marginY = 0;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
	public int anInt1569 = 0;

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	public int marginX = 0;

	@OriginalMember(owner = "client!mc", name = "Db", descriptor = "I")
	public int anInt1593 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lclient!mc;", line = 275)
    public static ComType get(@OriginalArg(0) int arg0) {
        @Pc(3) int local3 = arg0 >> 16;
        @Pc(11) int local11 = arg0 & 0xFFFF;
        if (instances[local3] == null || instances[local3][local11] == null) {
            @Pc(30) boolean local30 = method1665(local3);
            if (!local30) {
                return null;
            }
        }
        return instances[local3][local11];
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 20)
    public static void clear() {
        aClass47_8.clear();
        aClass47_20.clear();
    }

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BLclient!ud;)V", line = 248)
	public static void load(@OriginalArg(0) Js5Index arg0, @OriginalArg(1) Js5Index arg1, @OriginalArg(3) Js5Index arg2) {
		aClass5_26 = arg2;
		Static49.aClass5_17 = arg1;
		Static54.aClass5_20 = arg0;
		instances = new ComType[Static49.aClass5_17.method71()][];
		Static84.aBooleanArray31 = new boolean[Static49.aClass5_17.method71()];
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Z", line = 503)
	public static boolean method1665(@OriginalArg(0) int arg0) {
		if (Static84.aBooleanArray31[arg0]) {
			return true;
		} else if (Static49.aClass5_17.method59(arg0)) {
			@Pc(25) int local25 = Static49.aClass5_17.getGroupCapacity(arg0);
			if (local25 == 0) {
				Static84.aBooleanArray31[arg0] = true;
				return true;
			}
			if (instances[arg0] == null) {
				instances[arg0] = new ComType[local25];
			}
			for (@Pc(47) int local47 = 0; local47 < local25; local47++) {
				if (instances[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static49.aClass5_17.fetchFile(local47, arg0);
					if (local61 != null) {
						instances[arg0][local47] = new ComType();
						instances[arg0][local47].method1053(new Packet(local61));
					}
				}
			}
			Static84.aBooleanArray31[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!eb;I)V", line = 26)
	public void method1053(@OriginalArg(0) Packet buf) {
		this.type = buf.g1();
		this.buttonType = buf.g1();
		this.clientCode = buf.g2();
		this.anInt1573 = this.anInt1582 = buf.g2s();
		this.anInt1616 = this.anInt1588 = buf.g2s();
		this.anInt1605 = buf.g2();
		this.height = buf.g2();
		this.anInt1604 = buf.g1();
		this.anInt1611 = buf.g2();
		if (this.anInt1611 == 65535) {
			this.anInt1611 = -1;
		}
		this.anInt1594 = buf.g2();
		if (this.anInt1594 == 65535) {
			this.anInt1594 = -1;
		}
		@Pc(85) int local85 = buf.g1();
		@Pc(97) int local97;
		if (local85 > 0) {
			this.scriptComparator = new int[local85];
			this.scriptOperand = new int[local85];
			for (local97 = 0; local97 < local85; local97++) {
				this.scriptComparator[local97] = buf.g1();
				this.scriptOperand[local97] = buf.g2();
			}
		}
		local97 = buf.g1();
		@Pc(138) int local138;
		@Pc(146) int local146;
		if (local97 > 0) {
			this.scripts = new int[local97][];
			for (local138 = 0; local138 < local97; local138++) {
				local146 = buf.g2();
				this.scripts[local138] = new int[local146];
				for (@Pc(154) int local154 = 0; local154 < local146; local154++) {
					this.scripts[local138][local154] = buf.g2();
					if (this.scripts[local138][local154] == 65535) {
						this.scripts[local138][local154] = -1;
					}
				}
			}
		}
		if (this.type == 0) {
			this.scroll = buf.g2();
			this.hide = buf.g1() == 1;
		}
		if (this.type == 1) {
			buf.g2();
			buf.g1();
		}
		if (this.type == 2) {
			this.invSlotObjId = new int[this.height * this.anInt1605];
			this.invSlotObjCount = new int[this.anInt1605 * this.height];
			this.draggable = buf.g1() == 1;
			this.interactable = buf.g1() == 1;
			this.usable = buf.g1() == 1;
			this.aBoolean126 = buf.g1() == 1;
			this.marginX = buf.g1();
			this.marginY = buf.g1();
			this.invSlotOffsetX = new int[20];
			this.invSlotSprite = new int[20];
			this.invSlotOffsetY = new int[20];
			for (local138 = 0; local138 < 20; local138++) {
				local146 = buf.g1();
				if (local146 == 1) {
					this.invSlotOffsetX[local138] = buf.g2s();
					this.invSlotOffsetY[local138] = buf.g2s();
					this.invSlotSprite[local138] = buf.g4s();
				} else {
					this.invSlotSprite[local138] = -1;
				}
			}
			this.iop = new JagString[5];
			for (local146 = 0; local146 < 5; local146++) {
				this.iop[local146] = buf.gjstr();
				if (this.iop[local146].length() == 0) {
					this.iop[local146] = null;
				}
			}
		}
		if (this.type == 3) {
			this.fill = buf.g1() == 1;
		}
		if (this.type == 4 || this.type == 1) {
			this.center = buf.g1() == 1;
			this.font = buf.g1();
			this.shadowed = buf.g1() == 1;
		}
		if (this.type == 4) {
			this.text = buf.gjstr();
			this.activeText = buf.gjstr();
		}
		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.colour = buf.g4s();
		}
		if (this.type == 3 || this.type == 4) {
			this.activeColour = buf.g4s();
			this.overColour = buf.g4s();
			this.anInt1583 = buf.g4s();
		}
		if (this.type == 5) {
			this.graphic = buf.g4s();
			this.activeGraphic = buf.g4s();
		}
		if (this.type == 6) {
			this.anInt1607 = 1;
			this.model = buf.g2();
			this.anInt1590 = 1;
			if (this.model == 65535) {
				this.model = -1;
			}
			this.activeModel = buf.g2();
			if (this.activeModel == 65535) {
				this.activeModel = -1;
			}
			this.anim = buf.g2();
			if (this.anim == 65535) {
				this.anim = -1;
			}
			this.activeAnim = buf.g2();
			if (this.activeAnim == 65535) {
				this.activeAnim = -1;
			}
			this.zoom = buf.g2();
			this.xan = buf.g2();
			this.yan = buf.g2();
		}
		if (this.type == 7) {
			this.invSlotObjId = new int[this.height * this.anInt1605];
			this.invSlotObjCount = new int[this.anInt1605 * this.height];
			this.center = buf.g1() == 1;
			this.font = buf.g1();
			this.shadowed = buf.g1() == 1;
			this.colour = buf.g4s();
			this.marginX = buf.g2s();
			this.marginY = buf.g2s();
			this.interactable = buf.g1() == 1;
			this.iop = new JagString[5];
			for (local138 = 0; local138 < 5; local138++) {
				this.iop[local138] = buf.gjstr();
				if (this.iop[local138].length() == 0) {
					this.iop[local138] = null;
				}
			}
		}
		if (this.type == 8) {
			this.text = buf.gjstr();
		}
		if (this.buttonType == 2 || this.type == 2) {
			this.actionVerb = buf.gjstr();
			this.action = buf.gjstr();
			this.actionTarget = buf.g2();
		}
        if (this.buttonType == 1 || this.buttonType == 4 || this.buttonType == 5 || this.buttonType == 6) {
            this.option = buf.gjstr();
            if (this.option.length() == 0) {
                if (this.buttonType == 1) {
                    this.option = JagString.BUTTON_OK;
                }
                if (this.buttonType == 4) {
                    this.option = JagString.BUTTON_SELECT;
                }
                if (this.buttonType == 5) {
                    this.option = JagString.BUTTON_SELECT;
                }
                if (this.buttonType == 6) {
                    this.option = JagString.BUTTON_CONTINUE;
                }
            }
        }
    }

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZI)V", line = 313)
	public void method1054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.invSlotObjCount[arg1];
		this.invSlotObjCount[arg1] = this.invSlotObjCount[arg0];
		this.invSlotObjCount[arg0] = local9;
		@Pc(31) int local31 = this.invSlotObjId[arg1];
		this.invSlotObjId[arg1] = this.invSlotObjId[arg0];
		this.invSlotObjId[arg0] = local31;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!f;ZLclient!le;I)Lclient!ne;", line = 410)
	public Model method1057(@OriginalArg(1) SeqType arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) PlayerAppearance arg2, @OriginalArg(4) int arg3) {
		Static1.aBoolean102 = false;
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (arg1) {
			local16 = this.anInt1590;
			local19 = this.activeModel;
		} else {
			local16 = this.anInt1607;
			local19 = this.model;
		}
		if (local16 == 0) {
			return null;
		} else if (local16 == 1 && local19 == -1) {
			return null;
		} else {
			@Pc(50) Model local50 = (Model) aClass47_20.get((long) ((local16 << 16) + local19));
			if (local50 == null) {
				if (local16 == 1) {
					local50 = Model.method1163(aClass5_26, local19);
					if (local50 == null) {
						Static1.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.method1153(64, 768, -50, -10, -50, true);
				}
				if (local16 == 2) {
					local50 = NpcType.method640(local19).method615();
					if (local50 == null) {
						Static1.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.method1153(64, 768, -50, -10, -50, true);
				}
				if (local16 == 3) {
					if (arg2 == null) {
						return null;
					}
					local50 = arg2.method999();
					if (local50 == null) {
						Static1.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.method1153(64, 768, -50, -10, -50, true);
				}
				if (local16 == 4) {
					@Pc(137) ObjType local137 = ObjType.method1669(local19);
					local50 = local137.method713(10, false);
					if (local50 == null) {
						Static1.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.method1153(local137.anInt942 + 64, 768 - -local137.anInt940, -50, -10, -50, true);
				}
				aClass47_20.put((long) ((local16 << 16) + local19), local50);
			}
			if (arg0 != null) {
				local50 = arg0.method516(arg3, local50);
			}
			return local50;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Lclient!vb;", line = 806)
	public Pix24 method1061(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10;
		if (arg0) {
			local10 = this.activeGraphic;
		} else {
			local10 = this.graphic;
		}
		Static1.aBoolean102 = false;
		if (local10 == -1) {
			return null;
		}
		@Pc(29) Pix24 local29 = (Pix24) aClass47_8.get((long) local10);
		if (local29 != null) {
			return local29;
		}
		local29 = Static36.method732(Static54.aClass5_20, local10, 0);
		if (local29 == null) {
			Static1.aBoolean102 = true;
		} else {
			aClass47_8.put((long) local10, local29);
		}
		return local29;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)Lclient!vb;", line = 919)
	public Pix24 method1063(@OriginalArg(0) int arg0) {
		Static1.aBoolean102 = false;
		if (arg0 < 0 || arg0 >= this.invSlotSprite.length) {
			return null;
		}
		@Pc(26) int local26 = this.invSlotSprite[arg0];
		if (local26 == -1) {
			return null;
		}
		@Pc(38) Pix24 local38 = (Pix24) aClass47_8.get((long) local26);
		if (local38 != null) {
			return local38;
		}
		local38 = Static36.method732(Static54.aClass5_20, local26, 0);
		if (local38 == null) {
			Static1.aBoolean102 = true;
		} else {
			aClass47_8.put((long) local26, local38);
		}
		return local38;
	}
}

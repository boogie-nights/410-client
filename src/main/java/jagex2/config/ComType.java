package jagex2.config;

import jagex2.*;
import jagex2.datastruct.Hashable;
import jagex2.graphics.Model;
import jagex2.graphics.Pix24;
import jagex2.graphics.Static71;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class ComType extends Hashable {

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
	public int anInt1568;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "Z")
	public boolean aBoolean124;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "Z")
	public boolean hide;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
	public int anInt1573;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
	public int anInt1574;

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
	public int buttonType;

	@OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
	private int anInt1578;

	@OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
	public int xan;

	@OriginalMember(owner = "client!mc", name = "ib", descriptor = "Lclient!o;")
	public Class40 aClass40_464;

	@OriginalMember(owner = "client!mc", name = "jb", descriptor = "[I")
	public int[] invSlotObjCount;

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
	public int anInt1582;

	@OriginalMember(owner = "client!mc", name = "ob", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "I")
	public int anInt1583;

	@OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
	public int colour;

	@OriginalMember(owner = "client!mc", name = "rb", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!mc", name = "sb", descriptor = "Lclient!o;")
	public Class40 text;

	@OriginalMember(owner = "client!mc", name = "tb", descriptor = "I")
	public int anInt1585;

	@OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
	public int zoom;

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "I")
	public int anInt1587;

	@OriginalMember(owner = "client!mc", name = "wb", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
	public int anInt1589;

	@OriginalMember(owner = "client!mc", name = "yb", descriptor = "I")
	private int anInt1590;

	@OriginalMember(owner = "client!mc", name = "Ab", descriptor = "I")
	public int anInt1592;

	@OriginalMember(owner = "client!mc", name = "Bb", descriptor = "[Lclient!o;")
	public Class40[] aClass40Array29;

	@OriginalMember(owner = "client!mc", name = "Cb", descriptor = "Lclient!o;")
	public Class40 aClass40_467;

	@OriginalMember(owner = "client!mc", name = "Fb", descriptor = "I")
	public int anInt1594;

	@OriginalMember(owner = "client!mc", name = "Ib", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!mc", name = "Jb", descriptor = "Lclient!o;")
	public Class40 aClass40_468;

	@OriginalMember(owner = "client!mc", name = "Lb", descriptor = "I")
	public int anInt1598;

	@OriginalMember(owner = "client!mc", name = "Mb", descriptor = "I")
	public int anInt1599;

	@OriginalMember(owner = "client!mc", name = "Nb", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!mc", name = "Qb", descriptor = "I")
	public int scroll;

	@OriginalMember(owner = "client!mc", name = "Rb", descriptor = "I")
	public int model;

	@OriginalMember(owner = "client!mc", name = "Tb", descriptor = "I")
	public int anInt1604;

	@OriginalMember(owner = "client!mc", name = "Ub", descriptor = "I")
	public int anInt1605;

	@OriginalMember(owner = "client!mc", name = "Vb", descriptor = "[I")
	public int[] invSlotObjId;

	@OriginalMember(owner = "client!mc", name = "Wb", descriptor = "Z")
	public boolean aBoolean129;

	@OriginalMember(owner = "client!mc", name = "Yb", descriptor = "I")
	public int anInt1607;

	@OriginalMember(owner = "client!mc", name = "Zb", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!mc", name = "bc", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!mc", name = "dc", descriptor = "Lclient!o;")
	public Class40 aClass40_471;

	@OriginalMember(owner = "client!mc", name = "ec", descriptor = "I")
	public int height;

	@OriginalMember(owner = "client!mc", name = "fc", descriptor = "I")
	public int clientCode;

	@OriginalMember(owner = "client!mc", name = "gc", descriptor = "I")
	public int anInt1611;

	@OriginalMember(owner = "client!mc", name = "ic", descriptor = "I")
	public int anInt1613;

	@OriginalMember(owner = "client!mc", name = "jc", descriptor = "I")
	public int yan;

	@OriginalMember(owner = "client!mc", name = "lc", descriptor = "Z")
	public boolean aBoolean130;

	@OriginalMember(owner = "client!mc", name = "mc", descriptor = "Z")
	public boolean aBoolean131;

	@OriginalMember(owner = "client!mc", name = "nc", descriptor = "I")
	public int anInt1615;

	@OriginalMember(owner = "client!mc", name = "oc", descriptor = "I")
	public int anInt1616;

	@OriginalMember(owner = "client!mc", name = "pc", descriptor = "I")
	public int anInt1617;

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
	public int anInt1580 = 0;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
	public int anInt1569 = 0;

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	public int anInt1572 = 0;

	@OriginalMember(owner = "client!mc", name = "Db", descriptor = "I")
	public int anInt1593 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1053(@OriginalArg(0) Packet arg0) {
		this.anInt1613 = arg0.g1();
		this.buttonType = arg0.g1();
		this.clientCode = arg0.g2();
		this.anInt1573 = this.anInt1582 = arg0.g2b();
		this.anInt1616 = this.anInt1588 = arg0.g2b();
		this.anInt1605 = arg0.g2();
		this.height = arg0.g2();
		this.anInt1604 = arg0.g1();
		this.anInt1611 = arg0.g2();
		if (this.anInt1611 == 65535) {
			this.anInt1611 = -1;
		}
		this.anInt1594 = arg0.g2();
		if (this.anInt1594 == 65535) {
			this.anInt1594 = -1;
		}
		@Pc(85) int local85 = arg0.g1();
		@Pc(97) int local97;
		if (local85 > 0) {
			this.anIntArray332 = new int[local85];
			this.anIntArray333 = new int[local85];
			for (local97 = 0; local97 < local85; local97++) {
				this.anIntArray332[local97] = arg0.g1();
				this.anIntArray333[local97] = arg0.g2();
			}
		}
		local97 = arg0.g1();
		@Pc(138) int local138;
		@Pc(146) int local146;
		if (local97 > 0) {
			this.anIntArrayArray11 = new int[local97][];
			for (local138 = 0; local138 < local97; local138++) {
				local146 = arg0.g2();
				this.anIntArrayArray11[local138] = new int[local146];
				for (@Pc(154) int local154 = 0; local154 < local146; local154++) {
					this.anIntArrayArray11[local138][local154] = arg0.g2();
					if (this.anIntArrayArray11[local138][local154] == 65535) {
						this.anIntArrayArray11[local138][local154] = -1;
					}
				}
			}
		}
		if (this.anInt1613 == 0) {
			this.scroll = arg0.g2();
			this.hide = arg0.g1() == 1;
		}
		if (this.anInt1613 == 1) {
			arg0.g2();
			arg0.g1();
		}
		if (this.anInt1613 == 2) {
			this.invSlotObjCount = new int[this.height * this.anInt1605];
			this.invSlotObjId = new int[this.anInt1605 * this.height];
			this.aBoolean129 = arg0.g1() == 1;
			this.aBoolean128 = arg0.g1() == 1;
			this.aBoolean130 = arg0.g1() == 1;
			this.aBoolean126 = arg0.g1() == 1;
			this.anInt1572 = arg0.g1();
			this.anInt1580 = arg0.g1();
			this.anIntArray328 = new int[20];
			this.anIntArray329 = new int[20];
			this.anIntArray330 = new int[20];
			for (local138 = 0; local138 < 20; local138++) {
				local146 = arg0.g1();
				if (local146 == 1) {
					this.anIntArray328[local138] = arg0.g2b();
					this.anIntArray330[local138] = arg0.g2b();
					this.anIntArray329[local138] = arg0.g4();
				} else {
					this.anIntArray329[local138] = -1;
				}
			}
			this.aClass40Array29 = new Class40[5];
			for (local146 = 0; local146 < 5; local146++) {
				this.aClass40Array29[local146] = arg0.method1721();
				if (this.aClass40Array29[local146].method1169() == 0) {
					this.aClass40Array29[local146] = null;
				}
			}
		}
		if (this.anInt1613 == 3) {
			this.aBoolean131 = arg0.g1() == 1;
		}
		if (this.anInt1613 == 4 || this.anInt1613 == 1) {
			this.aBoolean124 = arg0.g1() == 1;
			this.anInt1568 = arg0.g1();
			this.aBoolean127 = arg0.g1() == 1;
		}
		if (this.anInt1613 == 4) {
			this.text = arg0.method1721();
			this.aClass40_468 = arg0.method1721();
		}
		if (this.anInt1613 == 1 || this.anInt1613 == 3 || this.anInt1613 == 4) {
			this.colour = arg0.g4();
		}
		if (this.anInt1613 == 3 || this.anInt1613 == 4) {
			this.anInt1589 = arg0.g4();
			this.anInt1615 = arg0.g4();
			this.anInt1583 = arg0.g4();
		}
		if (this.anInt1613 == 5) {
			this.anInt1585 = arg0.g4();
			this.anInt1598 = arg0.g4();
		}
		if (this.anInt1613 == 6) {
			this.anInt1607 = 1;
			this.model = arg0.g2();
			this.anInt1590 = 1;
			if (this.model == 65535) {
				this.model = -1;
			}
			this.anInt1578 = arg0.g2();
			if (this.anInt1578 == 65535) {
				this.anInt1578 = -1;
			}
			this.anInt1574 = arg0.g2();
			if (this.anInt1574 == 65535) {
				this.anInt1574 = -1;
			}
			this.anInt1592 = arg0.g2();
			if (this.anInt1592 == 65535) {
				this.anInt1592 = -1;
			}
			this.zoom = arg0.g2();
			this.xan = arg0.g2();
			this.yan = arg0.g2();
		}
		if (this.anInt1613 == 7) {
			this.invSlotObjCount = new int[this.height * this.anInt1605];
			this.invSlotObjId = new int[this.anInt1605 * this.height];
			this.aBoolean124 = arg0.g1() == 1;
			this.anInt1568 = arg0.g1();
			this.aBoolean127 = arg0.g1() == 1;
			this.colour = arg0.g4();
			this.anInt1572 = arg0.g2b();
			this.anInt1580 = arg0.g2b();
			this.aBoolean128 = arg0.g1() == 1;
			this.aClass40Array29 = new Class40[5];
			for (local138 = 0; local138 < 5; local138++) {
				this.aClass40Array29[local138] = arg0.method1721();
				if (this.aClass40Array29[local138].method1169() == 0) {
					this.aClass40Array29[local138] = null;
				}
			}
		}
		if (this.anInt1613 == 8) {
			this.text = arg0.method1721();
		}
		if (this.buttonType == 2 || this.anInt1613 == 2) {
			this.aClass40_471 = arg0.method1721();
			this.aClass40_464 = arg0.method1721();
			this.anInt1599 = arg0.g2();
		}
		if (this.buttonType != 1 && this.buttonType != 4 && this.buttonType != 5 && this.buttonType != 6) {
			return;
		}
		this.aClass40_467 = arg0.method1721();
		if (this.aClass40_467.method1169() != 0) {
			return;
		}
		if (this.buttonType == 1) {
			this.aClass40_467 = Static92.aClass40_617;
		}
		if (this.buttonType == 4) {
			this.aClass40_467 = Static88.aClass40_606;
		}
		if (this.buttonType == 5) {
			this.aClass40_467 = Static88.aClass40_606;
		}
		if (this.buttonType == 6) {
			this.aClass40_467 = Static67.aClass40_484;
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZI)V")
	public void method1054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.invSlotObjId[arg1];
		this.invSlotObjId[arg1] = this.invSlotObjId[arg0];
		this.invSlotObjId[arg0] = local9;
		@Pc(31) int local31 = this.invSlotObjCount[arg1];
		this.invSlotObjCount[arg1] = this.invSlotObjCount[arg0];
		this.invSlotObjCount[arg0] = local31;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!f;ZLclient!le;I)Lclient!ne;")
	public Model method1057(@OriginalArg(1) Class2_Sub2_Sub6 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3) {
		Static54.aBoolean102 = false;
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (arg1) {
			local16 = this.anInt1590;
			local19 = this.anInt1578;
		} else {
			local16 = this.anInt1607;
			local19 = this.model;
		}
		if (local16 == 0) {
			return null;
		} else if (local16 == 1 && local19 == -1) {
			return null;
		} else {
			@Pc(50) Model local50 = (Model) Static90.aClass47_20.get((long) ((local16 << 16) + local19));
			if (local50 == null) {
				if (local16 == 1) {
					local50 = Static71.method1163(Static82.aClass5_26, local19);
					if (local50 == null) {
						Static54.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.calculateNormals(64, 768, -50, -10, -50, true);
				}
				if (local16 == 2) {
					local50 = Static36.method640(local19).method615();
					if (local50 == null) {
						Static54.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.calculateNormals(64, 768, -50, -10, -50, true);
				}
				if (local16 == 3) {
					if (arg2 == null) {
						return null;
					}
					local50 = arg2.method999();
					if (local50 == null) {
						Static54.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.calculateNormals(64, 768, -50, -10, -50, true);
				}
				if (local16 == 4) {
					@Pc(137) ObjType local137 = Static105.get(local19);
					local50 = local137.method713(10, false);
					if (local50 == null) {
						Static54.aBoolean102 = true;
						return null;
					}
					local50.method1160();
					local50.calculateNormals(local137.anInt942 + 64, 768 - -local137.anInt940, -50, -10, -50, true);
				}
				Static90.aClass47_20.put((long) ((local16 << 16) + local19), local50);
			}
			if (arg0 != null) {
				local50 = arg0.method516(arg3, local50);
			}
			return local50;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Lclient!vb;")
	public Pix24 method1061(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10;
		if (arg0) {
			local10 = this.anInt1598;
		} else {
			local10 = this.anInt1585;
		}
		Static54.aBoolean102 = false;
		if (local10 == -1) {
			return null;
		}
		@Pc(29) Pix24 local29 = (Pix24) Static33.aClass47_8.get((long) local10);
		if (local29 != null) {
			return local29;
		}
		local29 = Static38.method732(Static59.aClass5_20, local10, 0);
		if (local29 == null) {
			Static54.aBoolean102 = true;
		} else {
			Static33.aClass47_8.put((long) local10, local29);
		}
		return local29;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)Lclient!vb;")
	public Pix24 method1063(@OriginalArg(0) int arg0) {
		Static54.aBoolean102 = false;
		if (arg0 < 0 || arg0 >= this.anIntArray329.length) {
			return null;
		}
		@Pc(26) int local26 = this.anIntArray329[arg0];
		if (local26 == -1) {
			return null;
		}
		@Pc(38) Pix24 local38 = (Pix24) Static33.aClass47_8.get((long) local26);
		if (local38 != null) {
			return local38;
		}
		local38 = Static38.method732(Static59.aClass5_20, local26, 0);
		if (local38 == null) {
			Static54.aBoolean102 = true;
		} else {
			Static33.aClass47_8.put((long) local26, local38);
		}
		return local38;
	}
}

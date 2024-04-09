package jagex2.config;

import jagex2.Static72;
import jagex2.datastruct.Hashable;
import jagex2.graphics.Model;
import jagex2.graphics.Static71;
import jagex2.io.Packet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class IdkType extends Hashable {

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
	private int[] models;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Z")
	public boolean disable = false;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
	private final int[] heads = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
	private final int[] recol_s = new int[6];

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
	public int type = -1;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
	private final int[] recol_d = new int[6];

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lclient!ne;")
	public Model getModel() {
		if (this.models == null) {
			return null;
		}
		@Pc(15) Model[] models = new Model[this.models.length];
		for (@Pc(17) int i = 0; i < this.models.length; i++) {
			models[i] = Static71.method1163(Static72.aClass5_22, this.models[i]);
		}
		@Pc(45) Model model;
		if (models.length == 1) {
			model = models[0];
		} else {
			model = new Model(models, models.length);
		}
		for (@Pc(61) int i = 0; i < 6 && this.recol_s[i] != 0; i++) {
			model.recolor(this.recol_s[i], this.recol_d[i]);
		}
		return model;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z")
	public boolean method1582() {
		if (this.models == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < this.models.length; local12++) {
			if (!Static72.aClass5_22.method64(0, this.models[local12])) {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)Z")
	public boolean method1585() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.heads[local9] != -1 && !Static72.aClass5_22.method64(0, this.heads[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)Lclient!ne;")
	public Model getHeadModel() {
		@Pc(4) Model[] models = new Model[5];
		@Pc(6) int count = 0;
		for (@Pc(12) int i = 0; i < 5; i++) {
			if (this.heads[i] != -1) {
				models[count++] = Static71.method1163(Static72.aClass5_22, this.heads[i]);
			}
		}
		@Pc(46) Model model = new Model(models, count);
		for (@Pc(48) int i = 0; i < 6 && this.recol_s[i] != 0; i++) {
			model.recolor(this.recol_s[i], this.recol_d[i]);
		}
		return model;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1587(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.g1();
			if (local13 == 0) {
				return;
			}
			this.decode(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!eb;II)V")
	private void decode(@OriginalArg(0) Packet dat, @OriginalArg(1) int code) {
		if (code == 1) {
			this.type = dat.g1();
		} else if (code == 2) {
			@Pc(17) int count = dat.g1();
			this.models = new int[count];
			for (@Pc(23) int i = 0; i < count; i++) {
				this.models[i] = dat.g2();
			}
		} else if (code == 3) {
			this.disable = true;
		} else if (code >= 40 && code < 50) {
			this.recol_s[code - 40] = dat.g2();
		} else if (code >= 50 && code < 60) {
			this.recol_d[code - 50] = dat.g2();
		} else if (code >= 60 && code < 70) {
			this.heads[code - 60] = dat.g2();
		}
	}
}

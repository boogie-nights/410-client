package jagex2.graphics;

import jagex2.datastruct.Hashable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public abstract class Entity extends Hashable {

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
	public int maxY = 1000;

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Lclient!ne;")
	protected Model draw() {
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)V")
	public void draw(@OriginalArg(0) int yaw, @OriginalArg(1) int sinEyePitch, @OriginalArg(2) int cosEyePitch, @OriginalArg(3) int sinEyeYaw, @OriginalArg(4) int cosEyeYaw, @OriginalArg(5) int relativeX, @OriginalArg(6) int relativeY, @OriginalArg(7) int relativeZ, @OriginalArg(8) int bitset) {
		@Pc(7) Model model = this.draw();
		if (model != null) {
			this.maxY = model.maxY;
			model.draw(yaw, sinEyePitch, cosEyePitch, sinEyeYaw, cosEyeYaw, relativeX, relativeY, relativeZ, bitset);
		}
	}
}

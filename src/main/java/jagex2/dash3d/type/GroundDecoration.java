package jagex2.dash3d.type;

import jagex2.graphics.Entity;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class GroundDecoration {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public int y;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public int info;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!jd;")
	public Entity entity;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	public int bitset;
}

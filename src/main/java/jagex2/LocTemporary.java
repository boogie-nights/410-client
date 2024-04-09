package jagex2;

import jagex2.datastruct.Linkable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class LocTemporary extends Linkable {

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public int x;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
	public int anInt819;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	public int anInt820;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public int z;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
	public int layer;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
	public int anInt825;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
	public int anInt830;

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
	public int anInt826 = -1;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	public int anInt827 = 0;
}

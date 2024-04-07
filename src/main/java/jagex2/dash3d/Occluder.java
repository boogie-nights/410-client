package jagex2.dash3d;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Occluder {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int minDeltaZ;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int minTileZ;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public int minTileX;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public int maxTileZ;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public int anInt2072;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public int minX;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int mode;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public int minZ;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	public int maxDeltaY;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	public int minDeltaY;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
	public int maxDeltaZ;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	public int maxX;

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
	public int minDeltaX;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
	public int maxY;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
	public int maxDeltaX;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	public int maxZ;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
	public int type;

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
	public int minY;
}

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class PixMap {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image image;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	protected int width;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	protected int height;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
	public int[] pixels;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 136)
	public final void bind() {
		Static25.method1604(this.pixels, this.width, this.height);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void create(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void draw(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}

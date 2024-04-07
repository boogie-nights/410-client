package jagex2.graphics;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import jagex2.Static26;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class FrameBuffer {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Ljava/awt/Image;")
	protected Image image;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	protected int width;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	protected int height;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "[I")
	public int[] pixels;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	public abstract void method1473(@OriginalArg(2) Component component, @OriginalArg(0) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public abstract void draw(@OriginalArg(1) Graphics graphics, @OriginalArg(2) int width, @OriginalArg(3) int height);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public final void bind() {
		Static26.bind(this.pixels, this.width, this.height);
	}
}

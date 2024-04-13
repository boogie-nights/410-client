import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class LegacyPixMap extends PixMap implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel colorModel;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer consumer;

	@OriginalMember(owner = "client!tb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 589)
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.consumer;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 602)
	@Override
	public void create(@OriginalArg(0) int width, @OriginalArg(2) Component c, @OriginalArg(3) int height) {
		super.height = height;
		super.pixels = new int[width * height + 1];
		super.width = width;
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		super.image = c.createImage(this);
		this.setPixels();
		c.prepareImage(super.image, this);
		this.setPixels();
		c.prepareImage(super.image, this);
		this.setPixels();
		c.prepareImage(super.image, this);
		this.bind();
	}

	@OriginalMember(owner = "client!tb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 633)
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer arg0) {
		this.consumer = arg0;
		arg0.setDimensions(super.width, super.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 659)
	private synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, super.width, super.height, this.colorModel, super.pixels, 0, super.width);
			this.consumer.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 675)
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 691)
	@Override
	public void draw(@OriginalArg(1) Graphics g, @OriginalArg(2) int x, @OriginalArg(3) int y) {
		this.setPixels();
		g.drawImage(super.image, x, y, this);
	}

	@OriginalMember(owner = "client!tb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 711)
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.consumer == arg0) {
			this.consumer = null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 733)
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 748)
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}

package jagex2.graphics;

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
public final class Class45_Sub1 extends Class45 implements ImageProducer, ImageObserver {

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
	private ColorModel colorModel;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Ljava/awt/image/ImageConsumer;")
	private ImageConsumer imageConsumer;

	@OriginalMember(owner = "client!tb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
	@Override
	public synchronized boolean isConsumer(@OriginalArg(0) ImageConsumer arg0) {
		return arg0 == this.imageConsumer;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1473(@OriginalArg(2) Component comp, @OriginalArg(0) int width, @OriginalArg(3) int height) {
		super.width = width;
		super.height = height;
		super.pixels = new int[width * height + 1];
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		super.image = comp.createImage(this);

		this.setPixels();
		comp.prepareImage(super.image, this);

		this.setPixels();
		comp.prepareImage(super.image, this);

		this.setPixels();
		comp.prepareImage(super.image, this);

		this.bind();
	}

	@OriginalMember(owner = "client!tb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void addConsumer(@OriginalArg(0) ImageConsumer consumer) {
		this.imageConsumer = consumer;
		consumer.setDimensions(super.width, super.height);
		consumer.setProperties(null);
		consumer.setColorModel(this.colorModel);
		consumer.setHints(14);
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	private synchronized void setPixels() {
		if (this.imageConsumer != null) {
			this.imageConsumer.setPixels(0, 0, super.width, super.height, this.colorModel, super.pixels, 0, super.width);
			this.imageConsumer.imageComplete(2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void requestTopDownLeftRightResend(@OriginalArg(0) ImageConsumer arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void draw(@OriginalArg(1) Graphics graphics, @OriginalArg(2) int x, @OriginalArg(3) int y) {
		this.setPixels();
		graphics.drawImage(super.image, x, y, this);
	}

	@OriginalMember(owner = "client!tb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public synchronized void removeConsumer(@OriginalArg(0) ImageConsumer arg0) {
		if (this.imageConsumer == arg0) {
			this.imageConsumer = null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
	@Override
	public void startProduction(@OriginalArg(0) ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
	@Override
	public boolean imageUpdate(@OriginalArg(0) Image image, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return true;
	}
}

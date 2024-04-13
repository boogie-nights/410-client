import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class FileOnDisk {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
	private RandomAccessFile randomAccessFile;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "J")
	private final long capacity;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljava/io/File;")
	private final File file;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "J")
	private long pos;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 3)
	public void close() throws IOException {
		this.randomAccessFile.close();
		this.randomAccessFile = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII[B)V", line = 17)
	public void write(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.pos + (long) arg1 > this.capacity) {
			this.randomAccessFile.seek(this.capacity + 1L);
			this.randomAccessFile.write(1);
			throw new EOFException();
		} else {
			this.randomAccessFile.write(arg2, arg0, arg1);
			this.pos += arg1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIII)I", line = 34)
	public int read(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(6) int local6 = this.randomAccessFile.read(arg0, arg2, arg1);
		if (local6 > 0) {
			this.pos += local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)J", line = 50)
	public long length() throws IOException {
		return this.randomAccessFile.length();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Ljava/io/File;", line = 60)
	public File getFile() {
		return this.file;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IJ)V", line = 70)
	public void seek(@OriginalArg(1) long arg0) throws IOException {
		this.randomAccessFile.seek(arg0);
		this.pos = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 82)
	public FileOnDisk(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() >= arg2) {
			arg0.delete();
		}
		this.randomAccessFile = new RandomAccessFile(arg0, arg1);
		this.capacity = arg2;
		this.file = arg0;
		this.pos = 0L;
	}
}

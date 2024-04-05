package jagex2.io;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Isaac {

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	private int count;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	private int c;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	private int b;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	private int a;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
	private final int[] mem = new int[256];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
	private final int[] rsl = new int[256];

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "([I)V")
	public Isaac(@OriginalArg(0) int[] seed) {
		for (@Pc(13) int i = 0; i < seed.length; i++) {
			this.rsl[i] = seed[i];
		}
		this.init();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
	public int nextInt() {
		if (this.count-- == 0) {
			this.isaac();
			this.count = 255;
		}
		return this.rsl[this.count];
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	private void isaac() {
		this.b += ++this.c;
		for (@Pc(24) int i = 0; i < 256; i++) {
			@Pc(31) int x = this.mem[i];
			if ((i & 0x2) == 0) {
				if ((i & 0x1) == 0) {
					this.a ^= this.a << 13;
				} else {
					this.a ^= this.a >>> 6;
				}
			} else if ((i & 0x1) == 0) {
				this.a ^= this.a << 2;
			} else {
				this.a ^= this.a >>> 16;
			}
			this.a += this.mem[i + 128 & 0xFF];
			@Pc(120) int y;
			this.mem[i] = y = this.a + this.mem[x >> 2 & 0xFF] + this.b;
			this.rsl[i] = this.b = this.mem[y >> 8 >> 2 & 0xFF] + x;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	private void init() {
		@Pc(14) int h = -1640531527;
		@Pc(16) int g = -1640531527;
		@Pc(18) int f = -1640531527;
		@Pc(20) int e = -1640531527;
		@Pc(22) int d = -1640531527;
		@Pc(24) int c = -1640531527;
		@Pc(26) int b = -1640531527;
		@Pc(27) int a = -1640531527;

		@Pc(29) int i;
		for (i = 0; i < 4; i++) {
			a ^= b << 11;
			d += a;
			b += c;
			b ^= c >>> 2;
			c += d;
			c ^= d << 8;
			e += b;
			f += c;
			d += e;
			d ^= e >>> 16;
			g += d;
			e += f;
			e ^= f << 10;
			f += g;
			h += e;
			f ^= g >>> 4;
			g += h;
			a += f;
			g ^= h << 8;
			h += a;
			b += g;
			h ^= a >>> 9;
			a += b;
			c += h;
		}
		for (i = 0; i < 256; i += 8) {
			f += this.rsl[i + 5];
			h += this.rsl[i + 7];
			d += this.rsl[i + 3];
			c += this.rsl[i + 2];
			g += this.rsl[i + 6];
			b += this.rsl[i + 1];
			a += this.rsl[i];
			a ^= b << 11;
			d += a;
			b += c;
			e += this.rsl[i + 4];
			b ^= c >>> 2;
			c += d;
			e += b;
			c ^= d << 8;
			f += c;
			d += e;
			d ^= e >>> 16;
			e += f;
			g += d;
			e ^= f << 10;
			f += g;
			f ^= g >>> 4;
			h += e;
			a += f;
			g += h;
			g ^= h << 8;
			h += a;
			h ^= a >>> 9;
			b += g;
			c += h;
			a += b;
			this.mem[i] = a;
			this.mem[i + 1] = b;
			this.mem[i + 2] = c;
			this.mem[i + 3] = d;
			this.mem[i + 4] = e;
			this.mem[i + 5] = f;
			this.mem[i + 6] = g;
			this.mem[i + 7] = h;
		}
		for (i = 0; i < 256; i += 8) {
			b += this.mem[i + 1];
			d += this.mem[i + 3];
			f += this.mem[i + 5];
			g += this.mem[i + 6];
			a += this.mem[i];
			c += this.mem[i + 2];
			h += this.mem[i + 7];
			e += this.mem[i + 4];
			a ^= b << 11;
			b += c;
			d += a;
			b ^= c >>> 2;
			c += d;
			e += b;
			c ^= d << 8;
			f += c;
			d += e;
			d ^= e >>> 16;
			g += d;
			e += f;
			e ^= f << 10;
			h += e;
			f += g;
			f ^= g >>> 4;
			a += f;
			g += h;
			g ^= h << 8;
			h += a;
			h ^= a >>> 9;
			b += g;
			c += h;
			a += b;
			this.mem[i] = a;
			this.mem[i + 1] = b;
			this.mem[i + 2] = c;
			this.mem[i + 3] = d;
			this.mem[i + 4] = e;
			this.mem[i + 5] = f;
			this.mem[i + 6] = g;
			this.mem[i + 7] = h;
		}
		this.isaac();
		this.count = 256;
	}
}

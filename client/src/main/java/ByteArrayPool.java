import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class ByteArrayPool {

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int minCount = 0;

    @OriginalMember(owner = "client!hb", name = "bc", descriptor = "I")
    public static int midCount = 0;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int maxCount = 0;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[[B")
    public static byte[][] minPool = new byte[1000][];

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "[[B")
    public static byte[][] midPool = new byte[250][];

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[[B")
    public static byte[][] maxPool = new byte[50][];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[B", line = 79)
    public static synchronized byte[] alloc(@OriginalArg(0) int size) {
        @Pc(19) byte[] data;
        if (size == 100 && minCount > 0) {
            data = minPool[--minCount];
            minPool[minCount] = null;
            return data;
        } else if (size == 5000 && midCount > 0) {
            data = midPool[--midCount];
            midPool[midCount] = null;
            return data;
        } else if (size == 30000 && maxCount > 0) {
            data = maxPool[--maxCount];
            maxPool[maxCount] = null;
            return data;
        } else {
            return new byte[size];
        }
    }
}

package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00OOOoO.o0000O;
import o00OOOoO.o000O0Oo;

/* loaded from: classes.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final o0000O fileSystem;
    private final o000O0Oo path;
    private final OkioSerializer<T> serializer;

    @OooO(m13471c = "androidx.datastore.core.okio.OkioReadScope", m13472f = "OkioStorage.kt", m13473l = {180, 187}, m13474m = "readData$suspendImpl")
    /* renamed from: androidx.datastore.core.okio.OkioReadScope$readData$1 */
    public static final class C03281<T> extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03281(OkioReadScope<T> okioReadScope, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = okioReadScope;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public OkioReadScope(o0000O fileSystem, o000O0Oo path, OkioSerializer<T> serializer) {
        OooOo.OooO0o0(fileSystem, "fileSystem");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e A[Catch: FileNotFoundException -> 0x0088, TryCatch #8 {FileNotFoundException -> 0x0088, blocks: (B:46:0x008e, B:47:0x0092, B:42:0x0084, B:39:0x007f), top: B:80:0x007f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092 A[Catch: FileNotFoundException -> 0x0088, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x0088, blocks: (B:46:0x008e, B:47:0x0092, B:42:0x0084, B:39:0x007f), top: B:80:0x007f, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope<T> r7, o00O0O0O.OooO0OO r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope.readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final o0000O getFileSystem() {
        return this.fileSystem;
    }

    public final o000O0Oo getPath() {
        return this.path;
    }

    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(o00O0O0O.OooO0OO oooO0OO) {
        return readData$suspendImpl(this, oooO0OO);
    }
}

package androidx.datastore.core;

import com.ironsource.InterfaceC3173h3;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final OooO0O0 onClose;
    private final Serializer<T> serializer;
    private final o00OO0O0.OooO00o transactionMutex;

    @OooO(m13471c = "androidx.datastore.core.FileStorageConnection", m13472f = "FileStorage.kt", m13473l = {InterfaceC3173h3.d.b.f8819b}, m13474m = "readScope")
    /* renamed from: androidx.datastore.core.FileStorageConnection$readScope$1 */
    public static final class C03091<R> extends OooO0OO {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03091(FileStorageConnection<T> fileStorageConnection, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = fileStorageConnection;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.FileStorageConnection", m13472f = "FileStorage.kt", m13473l = {214, 118}, m13474m = "writeScope")
    /* renamed from: androidx.datastore.core.FileStorageConnection$writeScope$1 */
    public static final class C03101 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03101(FileStorageConnection<T> fileStorageConnection, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = fileStorageConnection;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator coordinator, OooO0O0 onClose) {
        OooOo.OooO0o0(file, "file");
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(coordinator, "coordinator");
        OooOo.OooO0o0(onClose, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = o00OO0O0.OooO.OooO00o();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007b, blocks: (B:31:0x007a, B:40:0x008b, B:39:0x0088, B:36:0x0083), top: B:50:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.FileStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.FileStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o00O0Oo.o00Oo0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object readScope(o00O0Oo.o00Oo0 r8, o00O0O0O.OooO0OO r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.FileStorageConnection.C03091
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection.C03091) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            boolean r8 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.FileStorageConnection r0 = (androidx.datastore.core.FileStorageConnection) r0
            o00O0.o000OOo.OooOO0O(r9)     // Catch: java.lang.Throwable -> L32
            goto L6b
        L32:
            r9 = move-exception
            goto L83
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            o00O0.o000OOo.OooOO0O(r9)
            r7.checkNotClosed()
            o00OO0O0.OooO00o r9 = r7.transactionMutex
            o00OO0O0.OooO0o r9 = (o00OO0O0.OooO0o) r9
            boolean r9 = r9.OooO0o0(r3)
            androidx.datastore.core.FileReadScope r2 = new androidx.datastore.core.FileReadScope     // Catch: java.lang.Throwable -> L8c
            java.io.File r5 = r7.file     // Catch: java.lang.Throwable -> L8c
            androidx.datastore.core.Serializer<T> r6 = r7.serializer     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7d
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7d
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7d
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L7d
            r0.label = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r8 = r8.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7d
            if (r8 != r1) goto L66
            return r1
        L66:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            goto L70
        L6f:
            r3 = move-exception
        L70:
            if (r3 != 0) goto L7a
            if (r8 == 0) goto L79
            o00OO0O0.OooO00o r8 = r0.transactionMutex
            o00OO0O0.OooO.OooO0O0(r8)
        L79:
            return r9
        L7a:
            throw r3     // Catch: java.lang.Throwable -> L7b
        L7b:
            r9 = move-exception
            goto L91
        L7d:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            r1 = r2
        L83:
            r1.close()     // Catch: java.lang.Throwable -> L87
            goto L8b
        L87:
            r1 = move-exception
            com.google.android.gms.internal.measurement.o0OO0O0.OooO00o(r9, r1)     // Catch: java.lang.Throwable -> L7b
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L7b
        L8c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r7
        L91:
            if (r8 == 0) goto L98
            o00OO0O0.OooO00o r8 = r0.transactionMutex
            o00OO0O0.OooO.OooO0O0(r8)
        L98:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.readScope(o00O0Oo.o00Oo0, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[Catch: all -> 0x00eb, IOException -> 0x00ed, TRY_ENTER, TryCatch #4 {all -> 0x00eb, blocks: (B:34:0x00bb, B:36:0x00c1, B:39:0x00ca, B:40:0x00ea, B:47:0x00f8, B:56:0x0107, B:58:0x010d, B:59:0x0110, B:54:0x0105, B:53:0x0102, B:24:0x007c, B:25:0x0098), top: B:70:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[Catch: all -> 0x00eb, IOException -> 0x00ed, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00eb, blocks: (B:34:0x00bb, B:36:0x00c1, B:39:0x00ca, B:40:0x00ea, B:47:0x00f8, B:56:0x0107, B:58:0x010d, B:59:0x0110, B:54:0x0105, B:53:0x0102, B:24:0x007c, B:25:0x0098), top: B:70:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeScope(o00O0Oo.o00O0O r11, o00O0O0O.OooO0OO r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.writeScope(o00O0Oo.o00O0O, o00O0O0O.OooO0OO):java.lang.Object");
    }
}

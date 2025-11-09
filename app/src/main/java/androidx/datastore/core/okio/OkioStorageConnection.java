package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0Oo.OooO0O0;
import o00OO0O0.OooO00o;
import o00OOOoO.o0000O;
import o00OOOoO.o000O0Oo;

/* loaded from: classes.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final o0000O fileSystem;
    private final OooO0O0 onClose;
    private final o000O0Oo path;
    private final OkioSerializer<T> serializer;
    private final OooO00o transactionMutex;

    @OooO(m13471c = "androidx.datastore.core.okio.OkioStorageConnection", m13472f = "OkioStorage.kt", m13473l = {113}, m13474m = "readScope")
    /* renamed from: androidx.datastore.core.okio.OkioStorageConnection$readScope$1 */
    public static final class C03311<R> extends OooO0OO {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03311(OkioStorageConnection<T> okioStorageConnection, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = okioStorageConnection;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.okio.OkioStorageConnection", m13472f = "OkioStorage.kt", m13473l = {236, 137}, m13474m = "writeScope")
    /* renamed from: androidx.datastore.core.okio.OkioStorageConnection$writeScope$1 */
    public static final class C03321 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioStorageConnection<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03321(OkioStorageConnection<T> okioStorageConnection, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = okioStorageConnection;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(o0000O fileSystem, o000O0Oo path, OkioSerializer<T> serializer, InterProcessCoordinator coordinator, OooO0O0 onClose) {
        OooOo.OooO0o0(fileSystem, "fileSystem");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(coordinator, "coordinator");
        OooOo.OooO0o0(onClose, "onClose");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.coordinator = coordinator;
        this.onClose = onClose;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = o00OO0O0.OooO.OooO00o();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
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
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:31:0x007c, B:40:0x008d, B:39:0x008a, B:36:0x0085), top: B:52:0x0020, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$readScope$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o00O0Oo.o00Oo0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <R> java.lang.Object readScope(o00O0Oo.o00Oo0 r9, o00O0O0O.OooO0OO r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.okio.OkioStorageConnection.C03311
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection.C03311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            boolean r9 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.okio.OkioStorageConnection r0 = (androidx.datastore.core.okio.OkioStorageConnection) r0
            o00O0.o000OOo.OooOO0O(r10)     // Catch: java.lang.Throwable -> L32
            goto L6d
        L32:
            r10 = move-exception
            goto L85
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            o00O0.o000OOo.OooOO0O(r10)
            r8.checkNotClosed()
            o00OO0O0.OooO00o r10 = r8.transactionMutex
            o00OO0O0.OooO0o r10 = (o00OO0O0.OooO0o) r10
            boolean r10 = r10.OooO0o0(r3)
            androidx.datastore.core.okio.OkioReadScope r2 = new androidx.datastore.core.okio.OkioReadScope     // Catch: java.lang.Throwable -> L8e
            o00OOOoO.o0000O r5 = r8.fileSystem     // Catch: java.lang.Throwable -> L8e
            o00OOOoO.o000O0Oo r6 = r8.path     // Catch: java.lang.Throwable -> L8e
            androidx.datastore.core.okio.OkioSerializer<T> r7 = r8.serializer     // Catch: java.lang.Throwable -> L8e
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L7f
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7f
            r0.Z$0 = r10     // Catch: java.lang.Throwable -> L7f
            r0.label = r4     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7f
            if (r9 != r1) goto L68
            return r1
        L68:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L71
            goto L72
        L71:
            r3 = move-exception
        L72:
            if (r3 != 0) goto L7c
            if (r9 == 0) goto L7b
            o00OO0O0.OooO00o r9 = r0.transactionMutex
            o00OO0O0.OooO.OooO0O0(r9)
        L7b:
            return r10
        L7c:
            throw r3     // Catch: java.lang.Throwable -> L7d
        L7d:
            r10 = move-exception
            goto L93
        L7f:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L85:
            r1.close()     // Catch: java.lang.Throwable -> L89
            goto L8d
        L89:
            r1 = move-exception
            com.google.android.gms.internal.measurement.o0OO0O0.OooO00o(r10, r1)     // Catch: java.lang.Throwable -> L7d
        L8d:
            throw r10     // Catch: java.lang.Throwable -> L7d
        L8e:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
        L93:
            if (r9 == 0) goto L9a
            o00OO0O0.OooO00o r9 = r0.transactionMutex
            o00OO0O0.OooO.OooO0O0(r9)
        L9a:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.readScope(o00O0Oo.o00Oo0, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TryCatch #9 {IOException -> 0x010e, all -> 0x010b, blocks: (B:45:0x00fb, B:47:0x0103, B:55:0x011b, B:62:0x012a, B:61:0x0127, B:58:0x0122), top: B:79:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x010e, all -> 0x010b, blocks: (B:45:0x00fb, B:47:0x0103, B:55:0x011b, B:62:0x012a, B:61:0x0127, B:58:0x0122), top: B:79:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.datastore.core.okio.OkioStorageConnection] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.okio.OkioStorageConnection$writeScope$1, java.lang.Object, o00O0OO0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v7, types: [o00O0Oo.o00O0O] */
    /* JADX WARN: Type inference failed for: r11v10, types: [o00OO0O0.OooO0o] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o00O0O0o.OooOo00] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [o00OOOoO.o000O0Oo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v16, types: [o00OO0O0.OooO00o] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeScope(o00O0Oo.o00O0O r10, o00O0O0O.OooO0OO r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.writeScope(o00O0Oo.o00O0O, o00O0O0O.OooO0OO):java.lang.Object");
    }
}

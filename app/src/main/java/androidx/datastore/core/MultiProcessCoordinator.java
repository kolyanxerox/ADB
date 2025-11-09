package androidx.datastore.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.OooOO0O;
import o00O0.o000OOo;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.o0OoOoOo;
import oo00o.OooO0OO;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final OooOOO0 context;
    private final File file;
    private final o00OO0O0.OooO00o inMemoryMutex;
    private final OooO0OO lazySharedCounter;
    private final OooO0OO lockFile$delegate;
    private final o0OoOoOo updateNotifications;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:27:0x007a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r13, o00O0O0O.OooO0OO r14) throws java.io.IOException {
            /*
                r12 = this;
                boolean r0 = r14 instanceof androidx.datastore.core.C0313xe413854a
                if (r0 == 0) goto L13
                r0 = r14
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.C0313xe413854a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r12, r14)
            L18:
                java.lang.Object r14 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                long r4 = r0.J$0
                java.lang.Object r13 = r0.L$0
                java.io.FileOutputStream r13 = (java.io.FileOutputStream) r13
                o00O0.o000OOo.OooOO0O(r14)
                r14 = r0
                goto L7a
            L2e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L36:
                o00O0.o000OOo.OooOO0O(r14)
                long r4 = androidx.datastore.core.MultiProcessCoordinator.access$getINITIAL_WAIT_MILLIS$cp()
                r14 = r0
            L3e:
                long r6 = androidx.datastore.core.MultiProcessCoordinator.access$getMAX_WAIT_MILLIS$cp()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r0 > 0) goto L7f
                java.nio.channels.FileChannel r6 = r13.getChannel()     // Catch: java.io.IOException -> L5c
                r11 = 0
                r7 = 0
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L5c
                kotlin.jvm.internal.OooOo.OooO0Oo(r0, r2)     // Catch: java.io.IOException -> L5c
                return r0
            L5c:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L7e
                java.lang.String r6 = androidx.datastore.core.MultiProcessCoordinator.access$getDEADLOCK_ERROR_MESSAGE$cp()
                boolean r2 = o00O0oO.o000000.Oooo0o(r6, r2)
                if (r2 != r3) goto L7e
                r14.L$0 = r13
                r14.J$0 = r4
                r14.label = r3
                java.lang.Object r0 = o00O0oOo.o0000OO0.OooOO0O(r4, r14)
                if (r0 != r1) goto L7a
                return r1
            L7a:
                r0 = 2
                long r6 = (long) r0
                long r4 = r4 * r6
                goto L3e
            L7e:
                throw r0
            L7f:
                java.nio.channels.FileChannel r6 = r13.getChannel()
                r11 = 0
                r7 = 0
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.nio.channels.FileLock r13 = r6.lock(r7, r9, r11)
                kotlin.jvm.internal.OooOo.OooO0Oo(r13, r2)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, o00O0O0O.OooO0OO):java.lang.Object");
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "androidx.datastore.core.MultiProcessCoordinator", m13472f = "MultiProcessCoordinator.android.kt", m13473l = {211, 47, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE}, m13474m = "lock")
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1 */
    public static final class C03151<T> extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C03151(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.MultiProcessCoordinator", m13472f = "MultiProcessCoordinator.android.kt", m13473l = {IronSourceConstants.RETRY_LIMIT, 87}, m13474m = "tryLock")
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1 */
    public static final class C03161<T> extends o00O0OO0.OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C03161(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", m13472f = "MultiProcessCoordinator.android.kt", m13473l = {163}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2 */
    public static final class C03172 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03172(o00O0O o00o0o, MultiProcessCoordinator multiProcessCoordinator, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$block = o00o0o;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C03172(this.$block, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            o00O0O o00o0o = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = o00o0o.invoke(sharedCounter, this);
            return objInvoke == oooOo00 ? oooOo00 : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C03172) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public MultiProcessCoordinator(OooOOO0 context, File file) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.Companion.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = o00OO0O0.OooO.OooO00o();
        this.lockFile$delegate = o0OOO0.OooO0oo(new MultiProcessCoordinator$lockFile$2(this));
        this.lazySharedCounter = o0OOO0.OooO0oo(new MultiProcessCoordinator$lazySharedCounter$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String str) {
        return new File(this.file.getAbsolutePath() + str);
    }

    private final File getLockFile() {
        return (File) this.lockFile$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return (SharedCounter) this.lazySharedCounter.getValue();
    }

    private final <T> Object withLazyCounter(o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) {
        if (this.lazySharedCounter.isInitialized()) {
            return o00o0o.invoke(getSharedCounter(), oooO0OO);
        }
        return o0000OO0.Oooo00O(new C03172(o00o0o, this, null), this.context, oooO0OO);
    }

    public final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public o0OoOoOo getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(o00O0O0O.OooO0OO oooO0OO) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().getValue());
        }
        return o0000OO0.Oooo00O(new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), this.context, oooO0OO);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(o00O0O0O.OooO0OO oooO0OO) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().incrementAndGetValue());
        }
        return o0000OO0.Oooo00O(new C0312xb55e9682(this, null), this.context, oooO0OO);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00db, B:57:0x00de), top: B:78:0x0022, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:42:0x00bb, B:56:0x00db, B:57:0x00de), top: B:78:0x0022, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object, o00O0O0o.OooOo00] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object lock(o00O0Oo.Oooo000 r9, o00O0O0O.OooO0OO r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.lock(o00O0Oo.Oooo000, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7 A[Catch: all -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00eb, blocks: (B:60:0x00e7, B:72:0x0104, B:73:0x0107), top: B:91:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104 A[Catch: all -> 0x00eb, TRY_ENTER, TryCatch #7 {all -> 0x00eb, blocks: (B:60:0x00e7, B:72:0x0104, B:73:0x0107), top: B:91:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0113  */
    /* JADX WARN: Type inference failed for: r2v0, types: [o00O0Oo.o00O0O] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object tryLock(o00O0Oo.o00O0O r19, o00O0O0O.OooO0OO r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.tryLock(o00O0Oo.o00O0O, o00O0O0O.OooO0OO):java.lang.Object");
    }
}

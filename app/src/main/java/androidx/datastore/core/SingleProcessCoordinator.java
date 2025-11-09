package androidx.datastore.core;

import kotlin.jvm.internal.OooOo;
import o00O.o0OoOo0;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final o00OO0O0.OooO00o mutex;
    private final o0OoOoOo updateNotifications;
    private final AtomicInt version;

    @OooO(m13471c = "androidx.datastore.core.SingleProcessCoordinator", m13472f = "SingleProcessCoordinator.kt", m13473l = {66, 41}, m13474m = "lock")
    /* renamed from: androidx.datastore.core.SingleProcessCoordinator$lock$1 */
    public static final class C03241<T> extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03241(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.lock(null, this);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.SingleProcessCoordinator", m13472f = "SingleProcessCoordinator.kt", m13473l = {50}, m13474m = "tryLock")
    /* renamed from: androidx.datastore.core.SingleProcessCoordinator$tryLock$1 */
    public static final class C03251<T> extends OooO0OO {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C03251(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(String filePath) {
        OooOo.OooO0o0(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = o00OO0O0.OooO.OooO00o();
        this.version = new AtomicInt(0);
        this.updateNotifications = new o0OoOo0(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public o0OoOoOo getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(o00O0O0O.OooO0OO oooO0OO) {
        return new Integer(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(o00O0O0O.OooO0OO oooO0OO) {
        return new Integer(this.version.incrementAndGet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /* JADX WARN: Type inference failed for: r8v11, types: [o00OO0O0.OooO00o] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object lock(o00O0Oo.Oooo000 r8, o00O0O0O.OooO0OO r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.SingleProcessCoordinator.C03241
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator.C03241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$0
            o00OO0O0.OooO00o r8 = (o00OO0O0.OooO00o) r8
            o00O0.o000OOo.OooOO0O(r9)     // Catch: java.lang.Throwable -> L2f
            goto L6b
        L2f:
            r9 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$1
            o00OO0O0.OooO00o r8 = (o00OO0O0.OooO00o) r8
            java.lang.Object r2 = r0.L$0
            o00O0Oo.Oooo000 r2 = (o00O0Oo.Oooo000) r2
            o00O0.o000OOo.OooOO0O(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L47:
            o00O0.o000OOo.OooOO0O(r9)
            o00OO0O0.OooO00o r9 = r7.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            o00OO0O0.OooO0o r9 = (o00OO0O0.OooO0o) r9
            java.lang.Object r2 = r9.OooO0Oo(r0)
            if (r2 != r1) goto L5b
            goto L67
        L5b:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L71
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L71
            r0.label = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L71
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            o00OO0O0.OooO0o r8 = (o00OO0O0.OooO0o) r8
            r8.OooO0o(r5)
            return r9
        L71:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            o00OO0O0.OooO0o r8 = (o00OO0O0.OooO0o) r8
            r8.OooO0o(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.lock(o00O0Oo.Oooo000, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0065  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object tryLock(o00O0Oo.o00O0O r7, o00O0O0O.OooO0OO r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessCoordinator.C03251
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator.C03251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r7 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            o00OO0O0.OooO00o r0 = (o00OO0O0.OooO00o) r0
            o00O0.o000OOo.OooOO0O(r8)     // Catch: java.lang.Throwable -> L2e
            goto L57
        L2e:
            r8 = move-exception
            goto L63
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            o00O0.o000OOo.OooOO0O(r8)
            o00OO0O0.OooO00o r8 = r6.mutex
            o00OO0O0.OooO0o r8 = (o00OO0O0.OooO0o) r8
            boolean r2 = r8.OooO0o0(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L5f
            r0.Z$0 = r2     // Catch: java.lang.Throwable -> L5f
            r0.label = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5e
            o00OO0O0.OooO0o r0 = (o00OO0O0.OooO0o) r0
            r0.OooO0o(r4)
        L5e:
            return r8
        L5f:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L63:
            if (r7 == 0) goto L6a
            o00OO0O0.OooO0o r0 = (o00OO0O0.OooO0o) r0
            r0.OooO0o(r4)
        L6a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.tryLock(o00O0Oo.o00O0O, o00O0O0O.OooO0OO):java.lang.Object");
    }
}

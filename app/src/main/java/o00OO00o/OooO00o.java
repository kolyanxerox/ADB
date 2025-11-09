package o00OO00o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.o0Oo0oo;

/* loaded from: classes3.dex */
public final class OooO00o extends Thread {

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31973OooOooO = AtomicIntegerFieldUpdater.newUpdater(OooO00o.class, "workerCtl$volatile");

    /* renamed from: OooOo, reason: collision with root package name */
    public OooO0O0 f31974OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Oooo000 f31975OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o0Oo0oo f31976OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f31977OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f31978OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f31979OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f31980OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public boolean f31981OooOoo0;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public OooO00o(OooO0OO oooO0OO, int i) {
        this.f31980OooOoo = oooO0OO;
        setDaemon(true);
        setContextClassLoader(oooO0OO.getClass().getClassLoader());
        this.f31975OooOo0O = new Oooo000();
        this.f31976OooOo0o = new o0Oo0oo();
        this.f31974OooOo = OooO0O0.f31986OooOoO0;
        this.nextParkedWorker = OooO0OO.f31991Oooo000;
        int iNanoTime = (int) System.nanoTime();
        this.f31979OooOoOO = iNanoTime == 0 ? 42 : iNanoTime;
        OooO0o(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00OO00o.OooOOO OooO(int r26) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO00o.OooO00o.OooO(int):o00OO00o.OooOOO");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = o00OO00o.Oooo000.f32015OooO0Oo.get(r3);
        r0 = o00OO00o.Oooo000.f32014OooO0OO.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (o00OO00o.Oooo000.f32016OooO0o0.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.OooO0OO(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00OO00o.OooOOO OooO00o(boolean r13) {
        /*
            r12 = this;
            o00OO00o.OooO0O0 r0 = r12.f31974OooOo
            o00OO00o.OooO0O0 r1 = o00OO00o.OooO0O0.f31983OooOo0O
            r2 = 0
            o00OO00o.Oooo000 r3 = r12.f31975OooOo0O
            r4 = 1
            o00OO00o.OooO0OO r5 = r12.f31980OooOoo
            if (r0 != r1) goto Le
            goto L88
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = o00OO00o.OooO0OO.f31989OooOooO
        L10:
            o00OO00o.OooO0OO r7 = r12.f31980OooOoo
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r1 = 42
            long r10 = r10 >> r1
            int r1 = (int) r10
            if (r1 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = o00OO00o.Oooo000.f32013OooO0O0
            java.lang.Object r0 = r13.get(r3)
            o00OO00o.OooOOO r0 = (o00OO00o.OooOOO) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.f32003OooOo0o
            if (r1 != r4) goto L43
        L34:
            boolean r1 = r13.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r13.get(r3)
            if (r1 == r0) goto L34
            goto L25
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = o00OO00o.Oooo000.f32015OooO0Oo
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o00OO00o.Oooo000.f32014OooO0OO
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = o00OO00o.Oooo000.f32016OooO0o0
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            o00OO00o.OooOOO r1 = r3.OooO0OO(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            o00OO00o.OooOO0 r13 = r5.f31997OooOoOO
            java.lang.Object r13 = r13.OooO0Oo()
            o00OO00o.OooOOO r13 = (o00OO00o.OooOOO) r13
            if (r13 != 0) goto L73
            o00OO00o.OooOOO r13 = r12.OooO(r4)
        L73:
            return r13
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = o00OO00o.OooO0OO.f31989OooOooO
            boolean r1 = r6.compareAndSet(r7, r8, r10)
            if (r1 == 0) goto L10
            o00OO00o.OooO0O0 r0 = o00OO00o.OooO0O0.f31983OooOo0O
            r12.f31974OooOo = r0
        L88:
            if (r13 == 0) goto Lbc
            int r13 = r5.f31993OooOo0O
            int r13 = r13 * 2
            int r13 = r12.OooO0Oo(r13)
            if (r13 != 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L9f
            o00OO00o.OooOOO r13 = r12.OooO0o0()
            if (r13 == 0) goto L9f
            return r13
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = o00OO00o.Oooo000.f32013OooO0O0
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            o00OO00o.OooOOO r13 = (o00OO00o.OooOOO) r13
            if (r13 != 0) goto Lb0
            o00OO00o.OooOOO r13 = r3.OooO0O0()
        Lb0:
            if (r13 == 0) goto Lb3
            return r13
        Lb3:
            if (r4 != 0) goto Lc3
            o00OO00o.OooOOO r13 = r12.OooO0o0()
            if (r13 == 0) goto Lc3
            return r13
        Lbc:
            o00OO00o.OooOOO r13 = r12.OooO0o0()
            if (r13 == 0) goto Lc3
            return r13
        Lc3:
            r13 = 3
            o00OO00o.OooOOO r13 = r12.OooO(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO00o.OooO00o.OooO00o(boolean):o00OO00o.OooOOO");
    }

    public final int OooO0O0() {
        return this.indexInArray;
    }

    public final Object OooO0OO() {
        return this.nextParkedWorker;
    }

    public final int OooO0Oo(int i) {
        int i2 = this.f31979OooOoOO;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f31979OooOoOO = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final void OooO0o(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31980OooOoo.f31996OooOoO0);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final OooOOO OooO0o0() {
        int iOooO0Oo = OooO0Oo(2);
        OooO0OO oooO0OO = this.f31980OooOoo;
        if (iOooO0Oo == 0) {
            OooOOO oooOOO = (OooOOO) oooO0OO.f31995OooOoO.OooO0Oo();
            return oooOOO != null ? oooOOO : (OooOOO) oooO0OO.f31997OooOoOO.OooO0Oo();
        }
        OooOOO oooOOO2 = (OooOOO) oooO0OO.f31997OooOoOO.OooO0Oo();
        return oooOOO2 != null ? oooOOO2 : (OooOOO) oooO0OO.f31995OooOoO.OooO0Oo();
    }

    public final void OooO0oO(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean OooO0oo(OooO0O0 oooO0O0) {
        OooO0O0 oooO0O02 = this.f31974OooOo;
        boolean z = oooO0O02 == OooO0O0.f31983OooOo0O;
        if (z) {
            OooO0OO.f31989OooOooO.addAndGet(this.f31980OooOoo, 4398046511104L);
        }
        if (oooO0O02 != oooO0O0) {
            this.f31974OooOo = oooO0O0;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO00o.OooO00o.run():void");
    }
}

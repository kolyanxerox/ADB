package o00OO00o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import o00O0oOo.o0000OO0;
import o00OO000.o00O0O;

/* loaded from: classes3.dex */
public final class OooO0OO implements Executor, Closeable, AutoCloseable {

    /* renamed from: OooOoo */
    public static final /* synthetic */ AtomicLongFieldUpdater f31988OooOoo = AtomicLongFieldUpdater.newUpdater(OooO0OO.class, "parkedWorkersStack$volatile");

    /* renamed from: OooOooO */
    public static final /* synthetic */ AtomicLongFieldUpdater f31989OooOooO = AtomicLongFieldUpdater.newUpdater(OooO0OO.class, "controlState$volatile");

    /* renamed from: OooOooo */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31990OooOooo = AtomicIntegerFieldUpdater.newUpdater(OooO0OO.class, "_isTerminated$volatile");

    /* renamed from: Oooo000 */
    public static final o000O0O0.OooO0O0 f31991Oooo000 = new o000O0O0.OooO0O0("NOT_IN_STACK", 3);

    /* renamed from: OooOo */
    public final long f31992OooOo;

    /* renamed from: OooOo0O */
    public final int f31993OooOo0O;

    /* renamed from: OooOo0o */
    public final int f31994OooOo0o;

    /* renamed from: OooOoO */
    public final OooOO0 f31995OooOoO;

    /* renamed from: OooOoO0 */
    public final String f31996OooOoO0;

    /* renamed from: OooOoOO */
    public final OooOO0 f31997OooOoOO;

    /* renamed from: OooOoo0 */
    public final o00O0O f31998OooOoo0;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public OooO0OO(int i, int i2, String str, long j) {
        this.f31993OooOo0O = i;
        this.f31994OooOo0o = i2;
        this.f31992OooOo = j;
        this.f31996OooOoO0 = str;
        if (i < 1) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f31995OooOoO = new OooOO0();
        this.f31997OooOoOO = new OooOO0();
        this.f31998OooOoo0 = new o00O0O((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void OooO0OO(OooO0OO oooO0OO, Runnable runnable, int i) {
        oooO0OO.OooO0O0(runnable, false, (i & 4) == 0);
    }

    public final int OooO00o() {
        synchronized (this.f31998OooOoo0) {
            try {
                if (f31990OooOooo.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f31989OooOooO;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f31993OooOo0O) {
                    return 0;
                }
                if (i >= this.f31994OooOo0o) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f31998OooOoo0.OooO0O0(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                OooO00o oooO00o = new OooO00o(this, i3);
                this.f31998OooOoo0.OooO0OO(i3, oooO00o);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                oooO00o.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(Runnable runnable, boolean z, boolean z2) {
        OooOOO oooOOOO;
        OooO0O0 oooO0O0;
        OooOo00.f32011OooO0o.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof OooOOO) {
            oooOOOO = (OooOOO) runnable;
            oooOOOO.f32002OooOo0O = jNanoTime;
            oooOOOO.f32003OooOo0o = z;
        } else {
            oooOOOO = new OooOOOO(jNanoTime, runnable, z);
        }
        boolean z3 = oooOOOO.f32003OooOo0o;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31989OooOooO;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        OooO00o oooO00o = threadCurrentThread instanceof OooO00o ? (OooO00o) threadCurrentThread : null;
        if (oooO00o == null || !kotlin.jvm.internal.OooOo.OooO00o(oooO00o.f31980OooOoo, this)) {
            oooO00o = null;
        }
        if (oooO00o != null && (oooO0O0 = oooO00o.f31974OooOo) != OooO0O0.f31985OooOoO && (oooOOOO.f32003OooOo0o || oooO0O0 != OooO0O0.f31984OooOo0o)) {
            oooO00o.f31981OooOoo0 = true;
            Oooo000 oooo000 = oooO00o.f31975OooOo0O;
            if (z2) {
                oooOOOO = oooo000.OooO00o(oooOOOO);
            } else {
                oooo000.getClass();
                OooOOO oooOOO = (OooOOO) Oooo000.f32013OooO0O0.getAndSet(oooo000, oooOOOO);
                oooOOOO = oooOOO == null ? null : oooo000.OooO00o(oooOOO);
            }
        }
        if (oooOOOO != null) {
            if (!(oooOOOO.f32003OooOo0o ? this.f31997OooOoOO.OooO00o(oooOOOO) : this.f31995OooOoO.OooO00o(oooOOOO))) {
                throw new RejectedExecutionException(OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f31996OooOoO0, " was terminated"));
            }
        }
        boolean z4 = z2 && oooO00o != null;
        if (z3) {
            if (z4 || OooO0o() || OooO0o0(jAddAndGet)) {
                return;
            }
            OooO0o();
            return;
        }
        if (z4 || OooO0o() || OooO0o0(atomicLongFieldUpdater.get(this))) {
            return;
        }
        OooO0o();
    }

    public final void OooO0Oo(OooO00o oooO00o, int i, int i2) {
        while (true) {
            long j = f31988OooOoo.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objOooO0OO = oooO00o.OooO0OO();
                    while (true) {
                        if (objOooO0OO == f31991Oooo000) {
                            i3 = -1;
                            break;
                        }
                        if (objOooO0OO == null) {
                            i3 = 0;
                            break;
                        }
                        OooO00o oooO00o2 = (OooO00o) objOooO0OO;
                        int iOooO0O0 = oooO00o2.OooO0O0();
                        if (iOooO0O0 != 0) {
                            i3 = iOooO0O0;
                            break;
                        }
                        objOooO0OO = oooO00o2.OooO0OO();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f31988OooOoo.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean OooO0o() {
        o000O0O0.OooO0O0 oooO0O0;
        int iOooO0O0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f31988OooOoo;
            long j = atomicLongFieldUpdater.get(this);
            OooO00o oooO00o = (OooO00o) this.f31998OooOoo0.OooO0O0((int) (2097151 & j));
            if (oooO00o == null) {
                oooO00o = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objOooO0OO = oooO00o.OooO0OO();
                while (true) {
                    oooO0O0 = f31991Oooo000;
                    if (objOooO0OO == oooO0O0) {
                        iOooO0O0 = -1;
                        break;
                    }
                    if (objOooO0OO == null) {
                        iOooO0O0 = 0;
                        break;
                    }
                    OooO00o oooO00o2 = (OooO00o) objOooO0OO;
                    iOooO0O0 = oooO00o2.OooO0O0();
                    if (iOooO0O0 != 0) {
                        break;
                    }
                    objOooO0OO = oooO00o2.OooO0OO();
                }
                if (iOooO0O0 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | iOooO0O0)) {
                    oooO00o.OooO0oO(oooO0O0);
                }
            }
            if (oooO00o == null) {
                return false;
            }
            if (OooO00o.f31973OooOooO.compareAndSet(oooO00o, -1, 0)) {
                LockSupport.unpark(oooO00o);
                return true;
            }
        }
    }

    public final boolean OooO0o0(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f31993OooOo0O;
        if (i < i2) {
            int iOooO00o = OooO00o();
            if (iOooO00o == 1 && i2 > 1) {
                OooO00o();
            }
            if (iOooO00o > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o00OO00o.OooO0OO.f31990OooOooo
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof o00OO00o.OooO00o
            r3 = 0
            if (r1 == 0) goto L17
            o00OO00o.OooO00o r0 = (o00OO00o.OooO00o) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            o00OO00o.OooO0OO r1 = r0.f31980OooOoo
            boolean r1 = kotlin.jvm.internal.OooOo.OooO00o(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            o00OO000.o00O0O r1 = r8.f31998OooOoo0
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = o00OO00o.OooO0OO.f31989OooOooO     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            o00OO000.o00O0O r5 = r8.f31998OooOoo0
            java.lang.Object r5 = r5.OooO0O0(r1)
            kotlin.jvm.internal.OooOo.OooO0O0(r5)
            o00OO00o.OooO00o r5 = (o00OO00o.OooO00o) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            o00OO00o.Oooo000 r5 = r5.f31975OooOo0O
            o00OO00o.OooOO0 r6 = r8.f31997OooOoOO
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = o00OO00o.Oooo000.f32013OooO0O0
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            o00OO00o.OooOOO r7 = (o00OO00o.OooOOO) r7
            if (r7 == 0) goto L68
            r6.OooO00o(r7)
        L68:
            o00OO00o.OooOOO r7 = r5.OooO0O0()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.OooO00o(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            o00OO00o.OooOO0 r1 = r8.f31997OooOoOO
            r1.OooO0O0()
            o00OO00o.OooOO0 r1 = r8.f31995OooOoO
            r1.OooO0O0()
        L82:
            if (r0 == 0) goto L8a
            o00OO00o.OooOOO r1 = r0.OooO00o(r2)
            if (r1 != 0) goto Lb2
        L8a:
            o00OO00o.OooOO0 r1 = r8.f31995OooOoO
            java.lang.Object r1 = r1.OooO0Oo()
            o00OO00o.OooOOO r1 = (o00OO00o.OooOOO) r1
            if (r1 != 0) goto Lb2
            o00OO00o.OooOO0 r1 = r8.f31997OooOoOO
            java.lang.Object r1 = r1.OooO0Oo()
            o00OO00o.OooOOO r1 = (o00OO00o.OooOOO) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            o00OO00o.OooO0O0 r1 = o00OO00o.OooO0O0.f31985OooOoO
            r0.OooO0oo(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = o00OO00o.OooO0OO.f31988OooOoo
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = o00OO00o.OooO0OO.f31989OooOooO
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO00o.OooO0OO.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooO0OO(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o00O0O o00o0o = this.f31998OooOoo0;
        int iOooO00o = o00o0o.OooO00o();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iOooO00o; i6++) {
            OooO00o oooO00o = (OooO00o) o00o0o.OooO0O0(i6);
            if (oooO00o != null) {
                Oooo000 oooo000 = oooO00o.f31975OooOo0O;
                oooo000.getClass();
                int i7 = Oooo000.f32013OooO0O0.get(oooo000) != null ? (Oooo000.f32014OooO0OO.get(oooo000) - Oooo000.f32015OooO0Oo.get(oooo000)) + 1 : Oooo000.f32014OooO0OO.get(oooo000) - Oooo000.f32015OooO0Oo.get(oooo000);
                int iOrdinal = oooO00o.f31974OooOo.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new OooOOO0.OooO00o();
                    }
                    i5++;
                }
            }
        }
        long j = f31989OooOooO.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f31996OooOoO0);
        sb4.append('@');
        sb4.append(o0000OO0.OooOOOo(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f31993OooOo0O;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f31994OooOo0o);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f31995OooOoO.OooO0OO());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f31997OooOoOO.OooO0OO());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

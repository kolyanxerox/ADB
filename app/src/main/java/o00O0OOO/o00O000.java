package o00O0oOo;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.OooOo;
import o000O0O0.OooO0O0;
import o00O0O0O.OooOOO0;
import o00OO000.Oooo000;

/* loaded from: classes3.dex */
public abstract class o00O000 extends o00O000o implements o000O00 {

    /* renamed from: OooOoO */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31524OooOoO = AtomicReferenceFieldUpdater.newUpdater(o00O000.class, Object.class, "_queue$volatile");

    /* renamed from: OooOoOO */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31525OooOoOO = AtomicReferenceFieldUpdater.newUpdater(o00O000.class, Object.class, "_delayed$volatile");

    /* renamed from: OooOoo0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31526OooOoo0 = AtomicIntegerFieldUpdater.newUpdater(o00O000.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // o00O0oOo.o000O00
    public final void OooO(long j, oo0o0Oo oo0o0oo) {
        long j2 = j > 0 ? j >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            o00 o00Var = new o00(this, j2 + jNanoTime, oo0o0oo);
            OooOoO0(jNanoTime, o00Var);
            oo0o0oo.OooOo0(new o0ooOOo(o00Var, 2));
        }
    }

    public o000OO00 OooO0Oo(long j, Runnable runnable, OooOOO0 oooOOO0) {
        return o000O000.f31511OooO00o.OooO0Oo(j, runnable, oooOOO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0018, code lost:
    
        r7 = null;
     */
    @Override // o00O0oOo.o00O000o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooOOo() {
        /*
            r10 = this;
            boolean r0 = r10.OooOOoo()
            r1 = 0
            if (r0 == 0) goto La
            goto Lb1
        La:
            r10.OooOo0O()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o00O0oOo.o00O000.f31524OooOoO
            java.lang.Object r3 = r0.get(r10)
            o000O0O0.OooO0O0 r4 = o00O0oOo.o0000OO0.f31499OooO0OO
            r5 = 0
            if (r3 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r3 instanceof o00OO000.Oooo000
            if (r6 == 0) goto L3e
            r6 = r3
            o00OO000.Oooo000 r6 = (o00OO000.Oooo000) r6
            java.lang.Object r7 = r6.OooO0Oo()
            o000O0O0.OooO0O0 r8 = o00OO000.Oooo000.f31954OooO0oO
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            o00OO000.Oooo000 r6 = r6.OooO0OO()
        L30:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L37
            goto Ld
        L37:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L30
            goto Ld
        L3e:
            if (r3 != r4) goto L41
            goto L18
        L41:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb7
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r1
        L50:
            o00O0.OooOOO0 r3 = r10.f31529OooOo
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L62
            goto L59
        L62:
            r8 = r1
        L63:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L68
            goto Lb1
        L68:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L90
            boolean r3 = r0 instanceof o00OO000.Oooo000
            if (r3 == 0) goto L8d
            o00OO000.Oooo000 r0 = (o00OO000.Oooo000) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = o00OO000.Oooo000.f31952OooO0o
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto L8c
            goto L90
        L8c:
            return r1
        L8d:
            if (r0 != r4) goto Lb1
            goto Lb6
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o00O0oOo.o00O000.f31525OooOoOO
            java.lang.Object r0 = r0.get(r10)
            o00O0oOo.o00oOoo r0 = (o00O0oOo.o00oOoo) r0
            if (r0 == 0) goto Lb6
            monitor-enter(r0)
            o00O0oOo.o0O0ooO[] r3 = r0.f31970OooO00o     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La2
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La2:
            monitor-exit(r0)
            if (r5 != 0) goto La6
            goto Lb6
        La6:
            long r3 = r5.f31563OooOo0O
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r3
        Lb3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb6:
            return r6
        Lb7:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L41
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oOo.o00O000.OooOOo():long");
    }

    public final boolean OooOo() {
        o00oOoo o00oooo;
        o00O0.OooOOO0 oooOOO0 = this.f31529OooOo;
        if (!(oooOOO0 != null ? oooOOO0.isEmpty() : true) || ((o00oooo = (o00oOoo) f31525OooOoOO.get(this)) != null && o00OO000.o0ooOOo.f31969OooO0O0.get(o00oooo) != 0)) {
            return false;
        }
        Object obj = f31524OooOoO.get(this);
        if (obj != null) {
            if (obj instanceof Oooo000) {
                long j = Oooo000.f31952OooO0o.get((Oooo000) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != o0000OO0.f31499OooO0OO) {
                return false;
            }
        }
        return true;
    }

    public void OooOo0(Runnable runnable) {
        OooOo0O();
        if (!OooOo0o(runnable)) {
            o000.f31479OooOoo.OooOo0(runnable);
            return;
        }
        Thread threadOooOOOO = OooOOOO();
        if (Thread.currentThread() != threadOooOOOO) {
            LockSupport.unpark(threadOooOOOO);
        }
    }

    public final void OooOo0O() {
        o0O0ooO o0o0oooOooO0O0;
        o00oOoo o00oooo = (o00oOoo) f31525OooOoOO.get(this);
        if (o00oooo == null || o00OO000.o0ooOOo.f31969OooO0O0.get(o00oooo) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (o00oooo) {
                try {
                    o0O0ooO[] o0o0oooArr = o00oooo.f31970OooO00o;
                    o0O0ooO o0o0ooo = o0o0oooArr != null ? o0o0oooArr[0] : null;
                    if (o0o0ooo != null) {
                        o0o0oooOooO0O0 = ((jNanoTime - o0o0ooo.f31563OooOo0O) > 0L ? 1 : ((jNanoTime - o0o0ooo.f31563OooOo0O) == 0L ? 0 : -1)) >= 0 ? OooOo0o(o0o0ooo) : false ? o00oooo.OooO0O0(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (o0o0oooOooO0O0 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0050, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOo0o(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o00O0oOo.o00O000.f31524OooOoO
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = o00O0oOo.o00O000.f31526OooOoo0
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L50
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L67
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof o00OO000.Oooo000
            if (r2 == 0) goto L4c
            r2 = r1
            o00OO000.Oooo000 r2 = (o00OO000.Oooo000) r2
            int r5 = r2.OooO00o(r7)
            if (r5 == 0) goto L67
            if (r5 == r4) goto L3a
            r0 = 2
            if (r5 == r0) goto L50
            goto L0
        L3a:
            o00OO000.Oooo000 r2 = r2.OooO0OO()
        L3e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L45
            goto L0
        L45:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L3e
            goto L0
        L4c:
            o000O0O0.OooO0O0 r2 = o00O0oOo.o0000OO0.f31499OooO0OO
            if (r1 != r2) goto L51
        L50:
            return r3
        L51:
            o00OO000.Oooo000 r2 = new o00OO000.Oooo000
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.OooO00o(r3)
            r2.OooO00o(r7)
        L61:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L68
        L67:
            return r4
        L68:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L61
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oOo.o00O000.OooOo0o(java.lang.Runnable):boolean");
    }

    public final void OooOoO0(long j, o0O0ooO o0o0ooo) {
        int iOooO0O0;
        Thread threadOooOOOO;
        boolean z = f31526OooOoo0.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31525OooOoOO;
        if (z) {
            iOooO0O0 = 1;
        } else {
            o00oOoo o00oooo = (o00oOoo) atomicReferenceFieldUpdater.get(this);
            if (o00oooo == null) {
                o00oOoo o00oooo2 = new o00oOoo();
                o00oooo2.f31558OooO0OO = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, o00oooo2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                OooOo.OooO0O0(obj);
                o00oooo = (o00oOoo) obj;
            }
            iOooO0O0 = o0o0ooo.OooO0O0(j, o00oooo, this);
        }
        if (iOooO0O0 != 0) {
            if (iOooO0O0 == 1) {
                OooOo00(j, o0o0ooo);
                return;
            } else {
                if (iOooO0O0 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        o00oOoo o00oooo3 = (o00oOoo) atomicReferenceFieldUpdater.get(this);
        if (o00oooo3 != null) {
            synchronized (o00oooo3) {
                o0O0ooO[] o0o0oooArr = o00oooo3.f31970OooO00o;
                o0o0ooo = o0o0oooArr != null ? o0o0oooArr[0] : null;
            }
        }
        if (o0o0ooo != o0o0ooo || Thread.currentThread() == (threadOooOOOO = OooOOOO())) {
            return;
        }
        LockSupport.unpark(threadOooOOOO);
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(OooOOO0 oooOOO0, Runnable runnable) {
        OooOo0(runnable);
    }

    @Override // o00O0oOo.o00O000o
    public void shutdown() {
        o0O0ooO o0o0oooOooO0O0;
        o0o0Oo.f31568OooO00o.set(null);
        f31526OooOoo0.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31524OooOoO;
            Object obj = atomicReferenceFieldUpdater.get(this);
            OooO0O0 oooO0O0 = o0000OO0.f31499OooO0OO;
            if (obj != null) {
                if (!(obj instanceof Oooo000)) {
                    if (obj != oooO0O0) {
                        Oooo000 oooo000 = new Oooo000(8, true);
                        oooo000.OooO00o((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oooo000)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((Oooo000) obj).OooO0O0();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oooO0O0)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (OooOOo() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            o00oOoo o00oooo = (o00oOoo) f31525OooOoOO.get(this);
            if (o00oooo == null) {
                return;
            }
            synchronized (o00oooo) {
                o0o0oooOooO0O0 = o00OO000.o0ooOOo.f31969OooO0O0.get(o00oooo) > 0 ? o00oooo.OooO0O0(0) : null;
            }
            if (o0o0oooOooO0O0 == null) {
                return;
            } else {
                OooOo00(jNanoTime, o0o0oooOooO0O0);
            }
        }
    }
}

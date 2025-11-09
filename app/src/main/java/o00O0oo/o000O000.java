package o00O0oo;

import OooO0oO.OooOo;
import Oooo0o0.OooO;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o0O0O00;
import o000O0O0.OooO0O0;
import o000Ooo.o00oO0o;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0Oo.Oooo000;
import o00O0oOo.o0Oo0oo;
import o00O0oOo.o0oOOo;
import o00O0oOo.oo0o0Oo;
import o00OO0.OooOO0;
import o00OO0.OooOOO;
import o00OO000.OooO00o;
import o00OO000.o00Ooo;
import o00OO000.oo000o;

/* loaded from: classes3.dex */
public class o000O000 implements o000O00O {

    /* renamed from: OooOo0O */
    public final int f31621OooOo0O;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: OooOo0o */
    public static final /* synthetic */ AtomicLongFieldUpdater f31613OooOo0o = AtomicLongFieldUpdater.newUpdater(o000O000.class, "sendersAndCloseStatus$volatile");

    /* renamed from: OooOo */
    public static final /* synthetic */ AtomicLongFieldUpdater f31612OooOo = AtomicLongFieldUpdater.newUpdater(o000O000.class, "receivers$volatile");

    /* renamed from: OooOoO0 */
    public static final /* synthetic */ AtomicLongFieldUpdater f31615OooOoO0 = AtomicLongFieldUpdater.newUpdater(o000O000.class, "bufferEnd$volatile");

    /* renamed from: OooOoO */
    public static final /* synthetic */ AtomicLongFieldUpdater f31614OooOoO = AtomicLongFieldUpdater.newUpdater(o000O000.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: OooOoOO */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31616OooOoOO = AtomicReferenceFieldUpdater.newUpdater(o000O000.class, Object.class, "sendSegment$volatile");

    /* renamed from: OooOoo0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31618OooOoo0 = AtomicReferenceFieldUpdater.newUpdater(o000O000.class, Object.class, "receiveSegment$volatile");

    /* renamed from: OooOoo */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31617OooOoo = AtomicReferenceFieldUpdater.newUpdater(o000O000.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: OooOooO */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31619OooOooO = AtomicReferenceFieldUpdater.newUpdater(o000O000.class, Object.class, "_closeCause$volatile");

    /* renamed from: OooOooo */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31620OooOooo = AtomicReferenceFieldUpdater.newUpdater(o000O000.class, Object.class, "closeHandler$volatile");

    public o000O000(int i) {
        this.f31621OooOo0O = i;
        if (i < 0) {
            throw new IllegalArgumentException(OooOo.OooO0oO(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        o000O0O0 o000o0o02 = o000Oo0.f31631OooO00o;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : LocationRequestCompat.PASSIVE_INTERVAL : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f31615OooOoO0.get(this);
        o000O0O0 o000o0o03 = new o000O0O0(0L, null, this, 3);
        this.sendSegment$volatile = o000o0o03;
        this.receiveSegment$volatile = o000o0o03;
        if (OooOoOO()) {
            o000o0o03 = o000Oo0.f31631OooO00o;
            kotlin.jvm.internal.OooOo.OooO0OO(o000o0o03, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = o000o0o03;
        this._closeCause$volatile = o000Oo0.f31647OooOOoo;
    }

    public static final o000O0O0 OooO0O0(o000O000 o000o0002, long j, o000O0O0 o000o0o02) {
        Object objOooO0O0;
        o000O000 o000o0003;
        o000o0002.getClass();
        o000O0O0 o000o0o03 = o000Oo0.f31631OooO00o;
        o000O0o o000o0o2 = o000O0o.f31625OooOo0O;
        loop0: while (true) {
            objOooO0O0 = OooO00o.OooO0O0(o000o0o02, j, o000o0o2);
            if (!OooO00o.OooO0o0(objOooO0O0)) {
                o00Ooo o00oooOooO0OO = OooO00o.OooO0OO(objOooO0O0);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31616OooOoOO;
                    o00Ooo o00ooo2 = (o00Ooo) atomicReferenceFieldUpdater.get(o000o0002);
                    if (o00ooo2.f31964OooOo >= o00oooOooO0OO.f31964OooOo) {
                        break loop0;
                    }
                    if (!o00oooOooO0OO.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(o000o0002, o00ooo2, o00oooOooO0OO)) {
                        if (atomicReferenceFieldUpdater.get(o000o0002) != o00ooo2) {
                            if (o00oooOooO0OO.OooO0o()) {
                                o00oooOooO0OO.OooO0o0();
                            }
                        }
                    }
                    if (o00ooo2.OooO0o()) {
                        o00ooo2.OooO0o0();
                    }
                }
            } else {
                break;
            }
        }
        boolean zOooO0o0 = OooO00o.OooO0o0(objOooO0O0);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31612OooOo;
        if (zOooO0o0) {
            o000o0002.OooOoO0();
            if (o000o0o02.f31964OooOo * o000Oo0.f31632OooO0O0 < atomicLongFieldUpdater.get(o000o0002)) {
                o000o0o02.OooO0O0();
                return null;
            }
        } else {
            o000O0O0 o000o0o04 = (o000O0O0) OooO00o.OooO0OO(objOooO0O0);
            long j2 = o000o0o04.f31964OooOo;
            if (j2 <= j) {
                return o000o0o04;
            }
            long j3 = o000Oo0.f31632OooO0O0 * j2;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f31613OooOo0o;
                long j4 = atomicLongFieldUpdater2.get(o000o0002);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    o000o0003 = o000o0002;
                    break;
                }
                o000o0003 = o000o0002;
                if (atomicLongFieldUpdater2.compareAndSet(o000o0003, j4, j5 + (((int) (j4 >> 60)) << 60))) {
                    break;
                }
                o000o0002 = o000o0003;
            }
            if (j2 * o000Oo0.f31632OooO0O0 < atomicLongFieldUpdater.get(o000o0003)) {
                o000o0o04.OooO0O0();
            }
        }
        return null;
    }

    public static final void OooO0OO(o000O000 o000o0002, Object obj, oo0o0Oo oo0o0oo) {
        o000o0002.getClass();
        oo0o0oo.resumeWith(o000OOo.OooO0O0(o000o0002.OooOo00()));
    }

    public static final int OooO0o0(o000O000 o000o0002, o000O0O0 o000o0o02, int i, Object obj, long j, Object obj2, boolean z) {
        o000o0002.getClass();
        o000o0o02.OooOOO(i, obj);
        if (z) {
            return o000o0002.Oooo0O0(o000o0o02, i, obj, j, obj2, z);
        }
        Object objOooOO0o = o000o0o02.OooOO0o(i);
        if (objOooOO0o == null) {
            if (o000o0002.OooO0o(j)) {
                if (o000o0o02.OooOO0O(i, null, o000Oo0.f31634OooO0Oo)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (o000o0o02.OooOO0O(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objOooOO0o instanceof o0oOOo) {
            o000o0o02.OooOOO(i, null);
            if (o000o0002.Oooo00O(objOooOO0o, obj)) {
                o000o0o02.OooOOOO(i, o000Oo0.f31630OooO);
                return 0;
            }
            OooO0O0 oooO0O0 = o000Oo0.f31640OooOO0O;
            if (o000o0o02.f31624OooOoOO.getAndSet((i * 2) + 1, oooO0O0) == oooO0O0) {
                return 5;
            }
            o000o0o02.OooOOO0(i, true);
            return 5;
        }
        return o000o0002.Oooo0O0(o000o0o02, i, obj, j, obj2, z);
    }

    public static void OooOo0O(o000O000 o000o0002) {
        o000o0002.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31614OooOoO;
        if ((atomicLongFieldUpdater.addAndGet(o000o0002, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(o000o0002) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object OooOooO(o00O0oo.o000O000 r13, o00O0OO0.OooO0OO r14) {
        /*
            boolean r0 = r14 instanceof o00O0oo.o0000OO0
            if (r0 == 0) goto L14
            r0 = r14
            o00O0oo.o0000OO0 r0 = (o00O0oo.o0000OO0) r0
            int r1 = r0.f31598OooOo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f31598OooOo = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            o00O0oo.o0000OO0 r0 = new o00O0oo.o0000OO0
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f31599OooOo0O
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r6.f31598OooOo
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            o00O0.o000OOo.OooOO0O(r14)
            o00O0oo.o000OO0O r14 = (o00O0oo.o000OO0O) r14
            java.lang.Object r13 = r14.f31628OooO00o
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            o00O0.o000OOo.OooOO0O(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = o00O0oo.o000O000.f31618OooOoo0
            java.lang.Object r14 = r14.get(r13)
            o00O0oo.o000O0O0 r14 = (o00O0oo.o000O0O0) r14
        L40:
            boolean r1 = r13.OooOo()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.OooOOo()
            o00O0oo.o000O0 r14 = new o00O0oo.o000O0
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o00O0oo.o000O000.f31612OooOo
            long r4 = r1.getAndIncrement(r13)
            int r1 = o00O0oo.o000Oo0.f31632OooO0O0
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f31964OooOo
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            o00O0oo.o000O0O0 r1 = r13.OooOOo0(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.Oooo0(r8, r9, r10, r12)
            r1 = r7
            o000O0O0.OooO0O0 r14 = o00O0oo.o000Oo0.f31642OooOOO0
            if (r13 == r14) goto La0
            o000O0O0.OooO0O0 r14 = o00O0oo.o000Oo0.f31643OooOOOO
            if (r13 != r14) goto L8d
            long r13 = r1.OooOo0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.OooO0O0()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            o000O0O0.OooO0O0 r14 = o00O0oo.o000Oo0.f31641OooOOO
            if (r13 != r14) goto L9c
            r6.f31598OooOo = r2
            r2 = r8
            java.lang.Object r13 = r1.OooOooo(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.OooO0O0()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooOooO(o00O0oo.o000O000, o00O0OO0.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0068  */
    @Override // o00O0oo.o00O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object OooO(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = o00O0oo.o000O000.f31613OooOo0o
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.OooOo0o(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.OooO0o(r1)
            r1 = r1 ^ r10
        L1b:
            o00O0oo.o000O0Oo r13 = o00O0oo.o000OO0O.f31627OooO0O0
            if (r1 == 0) goto L20
            return r13
        L20:
            o000O0O0.OooO0O0 r6 = o00O0oo.o000Oo0.f31639OooOO0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o00O0oo.o000O000.f31616OooOoOO
            java.lang.Object r1 = r1.get(r15)
            o00O0oo.o000O0O0 r1 = (o00O0oo.o000O0O0) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.OooOo0o(r2, r9)
            int r14 = o00O0oo.o000Oo0.f31632OooO0O0
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f31964OooOo
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            o00O0oo.o000O0O0 r3 = OooO0O0(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.OooOo00()
            o00O0oo.o000O0 r2 = new o00O0oo.o000O0
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = OooO0o0(r0, r1, r2, r3, r4, r6, r7)
            oo00o.OooOo r3 = oo00o.OooOo.f33195OooO00o
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.OooO0O0()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = o00O0oo.o000O000.f31612OooOo
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.OooO0O0()
        L8a:
            java.lang.Throwable r1 = r15.OooOo00()
            o00O0oo.o000O0 r2 = new o00O0oo.o000O0
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.OooO()
            java.lang.Throwable r1 = r15.OooOo00()
            o00O0oo.o000O0 r2 = new o00O0oo.o000O0
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof o00O0oOo.o0oOOo
            if (r3 == 0) goto Lb2
            o00O0oOo.o0oOOo r6 = (o00O0oOo.o0oOOo) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.OooO0O0(r1, r2)
        Lb9:
            r1.OooO()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.OooO0O0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooO(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0oo.o00O000o
    public final void OooO00o(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        OooO0oO(true, cancellationException);
    }

    @Override // o00O0oo.o00O000o
    public final Object OooO0Oo(OooO0OO oooO0OO) throws Throwable {
        o000O0O0 o000o0o02;
        Throwable th;
        o000O0O0 o000o0o03;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31618OooOoo0;
        o000O0O0 o000o0o04 = (o000O0O0) atomicReferenceFieldUpdater.get(this);
        while (!OooOo()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f31612OooOo;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = o000Oo0.f31632OooO0O0;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (o000o0o04.f31964OooOo != j2) {
                o000O0O0 o000o0o0OooOOo0 = OooOOo0(j2, o000o0o04);
                if (o000o0o0OooOOo0 == null) {
                    continue;
                } else {
                    o000o0o02 = o000o0o0OooOOo0;
                }
            } else {
                o000o0o02 = o000o0o04;
            }
            Object objOooo0 = Oooo0(o000o0o02, i, andIncrement, null);
            OooO0O0 oooO0O0 = o000Oo0.f31642OooOOO0;
            if (objOooo0 == oooO0O0) {
                throw new IllegalStateException("unexpected");
            }
            OooO0O0 oooO0O02 = o000Oo0.f31643OooOOOO;
            if (objOooo0 == oooO0O02) {
                if (andIncrement < OooOo0()) {
                    o000o0o02.OooO0O0();
                }
                o000o0o04 = o000o0o02;
            } else {
                if (objOooo0 != o000Oo0.f31641OooOOO) {
                    o000o0o02.OooO0O0();
                    return objOooo0;
                }
                oo0o0Oo oo0o0ooOooOOo0 = o00O0oOo.o0000OO0.OooOOo0(OooO.OooOOOO(oooO0OO));
                o000O000 o000o0002 = this;
                try {
                    Object objOooo02 = o000o0002.Oooo0(o000o0o02, i, andIncrement, oo0o0ooOooOOo0);
                    if (objOooo02 == oooO0O0) {
                        oo0o0ooOooOOo0.OooO0O0(o000o0o02, i);
                    } else {
                        if (objOooo02 == oooO0O02) {
                            if (andIncrement < OooOo0()) {
                                o000o0o02.OooO0O0();
                            }
                            o000O0O0 o000o0o05 = (o000O0O0) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (OooOo()) {
                                    oo0o0ooOooOOo0.resumeWith(o000OOo.OooO0O0(OooOOoo()));
                                    break;
                                }
                                oo0o0Oo oo0o0oo = oo0o0ooOooOOo0;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j3 = o000Oo0.f31632OooO0O0;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (o000o0o05.f31964OooOo != j4) {
                                        try {
                                            o000O0O0 o000o0o0OooOOo02 = OooOOo0(j4, o000o0o05);
                                            if (o000o0o0OooOOo02 == null) {
                                                oo0o0ooOooOOo0 = oo0o0oo;
                                            } else {
                                                o000o0o03 = o000o0o0OooOOo02;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            oo0o0ooOooOOo0 = oo0o0oo;
                                            oo0o0ooOooOOo0.OooOoO0();
                                            throw th;
                                        }
                                    } else {
                                        o000o0o03 = o000o0o05;
                                    }
                                    objOooo02 = o000o0002.Oooo0(o000o0o03, i2, andIncrement2, oo0o0oo);
                                    o000O0O0 o000o0o06 = o000o0o03;
                                    oo0o0ooOooOOo0 = oo0o0oo;
                                    if (objOooo02 == o000Oo0.f31642OooOOO0) {
                                        oo0o0ooOooOOo0.OooO0O0(o000o0o06, i2);
                                        break;
                                    }
                                    if (objOooo02 == o000Oo0.f31643OooOOOO) {
                                        if (andIncrement2 < OooOo0()) {
                                            o000o0o06.OooO0O0();
                                        }
                                        o000o0002 = this;
                                        o000o0o05 = o000o0o06;
                                    } else {
                                        if (objOooo02 == o000Oo0.f31641OooOOO) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        o000o0o06.OooO0O0();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    oo0o0ooOooOOo0 = oo0o0oo;
                                    th = th;
                                    oo0o0ooOooOOo0.OooOoO0();
                                    throw th;
                                }
                            }
                        } else {
                            o000o0o02.OooO0O0();
                        }
                        oo0o0ooOooOOo0.OooOoO(objOooo02, null);
                    }
                    Object objOooOOOo = oo0o0ooOooOOo0.OooOOOo();
                    OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                    return objOooOOOo;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thOooOOoo = OooOOoo();
        int i3 = oo000o.f31971OooO00o;
        throw thOooOOoo;
    }

    public final boolean OooO0o(long j) {
        return j < f31615OooOoO0.get(this) || j < f31612OooOo.get(this) + ((long) this.f31621OooOo0O);
    }

    public final boolean OooO0oO(boolean z, Throwable th) {
        o000O000 o000o0002;
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31613OooOo0o;
        if (!z) {
            o000o0002 = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                o000o0002 = this;
                break;
            }
            o000O0O0 o000o0o02 = o000Oo0.f31631OooO00o;
            o000o0002 = this;
        } while (!atomicLongFieldUpdater.compareAndSet(o000o0002, j5, (j5 & 1152921504606846975L) + (1 << 60)));
        OooO0O0 oooO0O0 = o000Oo0.f31647OooOOoo;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31619OooOooO;
            if (atomicReferenceFieldUpdater.compareAndSet(this, oooO0O0, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != oooO0O0) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(o000o0002, j4, (3 << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(o000o0002, j, (j3 << 60) + j2));
        }
        OooOoO0();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31620OooOooo;
                obj = atomicReferenceFieldUpdater2.get(this);
                OooO0O0 oooO0O02 = obj == null ? o000Oo0.f31646OooOOo0 : o000Oo0.f31645OooOOo;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, oooO0O02)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                o0O0O00.OooO0O0(1, obj);
                ((Oooo000) obj).invoke(OooOOo());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x008f, code lost:
    
        r1 = (o00O0oo.o000O0O0) ((o00OO000.OooO0O0) o00OO000.OooO0O0.f31930OooOo0o.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00O0oo.o000O0O0 OooO0oo(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooO0oo(long):o00O0oo.o000O0O0");
    }

    @Override // o00O0oo.o00O000o
    public final o00oO0o OooOO0() {
        o0O0O00.OooO0O0(3, o000OO.f31626OooOo0O);
        o0O0O00.OooO0O0(3, o0000O.f31594OooOo0O);
        return new o00oO0o(this, (o0000O0) null);
    }

    public final void OooOO0O(long j) {
        o000O0O0 o000o0o02 = (o000O0O0) f31618OooOoo0.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f31612OooOo;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f31621OooOo0O + j2, f31615OooOoO0.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = o000Oo0.f31632OooO0O0;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (o000o0o02.f31964OooOo != j4) {
                    o000O0O0 o000o0o0OooOOo0 = OooOOo0(j4, o000o0o02);
                    if (o000o0o0OooOOo0 != null) {
                        o000o0o02 = o000o0o0OooOOo0;
                    }
                }
                o000O0O0 o000o0o03 = o000o0o02;
                if (Oooo0(o000o0o03, i, j2, null) != o000Oo0.f31643OooOOOO || j2 < OooOo0()) {
                    o000o0o03.OooO0O0();
                }
                o000o0o02 = o000o0o03;
            }
        }
    }

    @Override // o00O0oo.o00O000o
    public final Object OooOO0o() {
        o000O0O0 o000o0o02;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31612OooOo;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f31613OooOo0o.get(this);
        if (OooOo0o(j2, true)) {
            return new o000O0(OooOOo());
        }
        long j3 = j2 & 1152921504606846975L;
        o000O0Oo o000o0oo2 = o000OO0O.f31627OooO0O0;
        if (j >= j3) {
            return o000o0oo2;
        }
        Object obj = o000Oo0.f31640OooOO0O;
        o000O0O0 o000o0o03 = (o000O0O0) f31618OooOoo0.get(this);
        while (!OooOo()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = o000Oo0.f31632OooO0O0;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (o000o0o03.f31964OooOo != j5) {
                o000O0O0 o000o0o0OooOOo0 = OooOOo0(j5, o000o0o03);
                if (o000o0o0OooOOo0 == null) {
                    continue;
                } else {
                    o000o0o02 = o000o0o0OooOOo0;
                }
            } else {
                o000o0o02 = o000o0o03;
            }
            Object objOooo0 = Oooo0(o000o0o02, i, andIncrement, obj);
            o000O0O0 o000o0o04 = o000o0o02;
            if (objOooo0 == o000Oo0.f31642OooOOO0) {
                o0oOOo o0oooo = obj instanceof o0oOOo ? (o0oOOo) obj : null;
                if (o0oooo != null) {
                    o0oooo.OooO0O0(o000o0o04, i);
                }
                Oooo0OO(andIncrement);
                o000o0o04.OooO();
                return o000o0oo2;
            }
            if (objOooo0 != o000Oo0.f31643OooOOOO) {
                if (objOooo0 == o000Oo0.f31641OooOOO) {
                    throw new IllegalStateException("unexpected");
                }
                o000o0o04.OooO0O0();
                return objOooo0;
            }
            if (andIncrement < OooOo0()) {
                o000o0o04.OooO0O0();
            }
            o000o0o03 = o000o0o04;
        }
        return new o000O0(OooOOo());
    }

    @Override // o00O0oo.o00O00
    public final boolean OooOOO(Throwable th) {
        return OooO0oO(false, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x00c6, code lost:
    
        OooO0OO(r1, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0173 A[RETURN] */
    @Override // o00O0oo.o00O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object OooOOO0(java.lang.Object r24, o00O0O0O.OooO0OO r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooOOO0(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x018e, code lost:
    
        OooOo0O(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOOO() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooOOOO():void");
    }

    @Override // o00O0oo.o00O000o
    public final Object OooOOOo(o00O.Oooo000 oooo000) {
        return OooOooO(this, oooo000);
    }

    public final Throwable OooOOo() {
        return (Throwable) f31619OooOooO.get(this);
    }

    public final o000O0O0 OooOOo0(long j, o000O0O0 o000o0o02) {
        Object objOooO0O0;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        o000O0O0 o000o0o03 = o000Oo0.f31631OooO00o;
        o000O0o o000o0o2 = o000O0o.f31625OooOo0O;
        loop0: while (true) {
            objOooO0O0 = OooO00o.OooO0O0(o000o0o02, j, o000o0o2);
            if (!OooO00o.OooO0o0(objOooO0O0)) {
                o00Ooo o00oooOooO0OO = OooO00o.OooO0OO(objOooO0O0);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31618OooOoo0;
                    o00Ooo o00ooo2 = (o00Ooo) atomicReferenceFieldUpdater.get(this);
                    if (o00ooo2.f31964OooOo >= o00oooOooO0OO.f31964OooOo) {
                        break loop0;
                    }
                    if (!o00oooOooO0OO.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, o00ooo2, o00oooOooO0OO)) {
                        if (atomicReferenceFieldUpdater.get(this) != o00ooo2) {
                            if (o00oooOooO0OO.OooO0o()) {
                                o00oooOooO0OO.OooO0o0();
                            }
                        }
                    }
                    if (o00ooo2.OooO0o()) {
                        o00ooo2.OooO0o0();
                    }
                }
            } else {
                break;
            }
        }
        if (OooO00o.OooO0o0(objOooO0O0)) {
            OooOoO0();
            if (o000o0o02.f31964OooOo * o000Oo0.f31632OooO0O0 < OooOo0()) {
                o000o0o02.OooO0O0();
                return null;
            }
        } else {
            o000O0O0 o000o0o04 = (o000O0O0) OooO00o.OooO0OO(objOooO0O0);
            boolean zOooOoOO = OooOoOO();
            long j3 = o000o0o04.f31964OooOo;
            if (!zOooOoOO && j <= f31615OooOoO0.get(this) / o000Oo0.f31632OooO0O0) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31617OooOoo;
                    o00Ooo o00ooo3 = (o00Ooo) atomicReferenceFieldUpdater2.get(this);
                    if (o00ooo3.f31964OooOo >= j3 || !o000o0o04.OooOO0()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, o00ooo3, o000o0o04)) {
                        if (atomicReferenceFieldUpdater2.get(this) != o00ooo3) {
                            if (o000o0o04.OooO0o()) {
                                o000o0o04.OooO0o0();
                            }
                        }
                    }
                    if (o00ooo3.OooO0o()) {
                        o00ooo3.OooO0o0();
                    }
                }
            }
            if (j3 <= j) {
                return o000o0o04;
            }
            long j4 = j3 * o000Oo0.f31632OooO0O0;
            do {
                atomicLongFieldUpdater = f31612OooOo;
                j2 = atomicLongFieldUpdater.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
            if (j3 * o000Oo0.f31632OooO0O0 < OooOo0()) {
                o000o0o04.OooO0O0();
            }
        }
        return null;
    }

    public final Throwable OooOOoo() {
        Throwable thOooOOo = OooOOo();
        return thOooOOo == null ? new o000OO00("Channel was closed") : thOooOOo;
    }

    public final boolean OooOo() {
        return OooOo0o(f31613OooOo0o.get(this), true);
    }

    public final long OooOo0() {
        return f31613OooOo0o.get(this) & 1152921504606846975L;
    }

    public final Throwable OooOo00() {
        Throwable thOooOOo = OooOOo();
        return thOooOOo == null ? new com.google.android.gms.internal.ads.o0O0O00("Channel was closed") : thOooOOo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x00a2, code lost:
    
        r0 = (o00O0oo.o000O0O0) ((o00OO000.OooO0O0) o00OO000.OooO0O0.f31930OooOo0o.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0162, code lost:
    
        o00O0oo.o000O000.f31612OooOo.compareAndSet(r14, r7, r7 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOo0o(long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooOo0o(long, boolean):boolean");
    }

    public boolean OooOoO() {
        return false;
    }

    public final boolean OooOoO0() {
        return OooOo0o(f31613OooOo0o.get(this), false);
    }

    public final boolean OooOoOO() {
        long j = f31615OooOoO0.get(this);
        return j == 0 || j == LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public final Object OooOoo(Object obj, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        oo0o0oo.resumeWith(o000OOo.OooO0O0(OooOo00()));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : oo00o.OooOo.f33195OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOoo0(long r5, o00O0oo.o000O0O0 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f31964OooOo
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            o00OO000.OooO0O0 r0 = r7.OooO0OO()
            o00O0oo.o000O0O0 r0 = (o00O0oo.o000O0O0) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.OooO0Oo()
            if (r5 == 0) goto L22
            o00OO000.OooO0O0 r5 = r7.OooO0OO()
            o00O0oo.o000O0O0 r5 = (o00O0oo.o000O0O0) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o00O0oo.o000O000.f31617OooOoo
            java.lang.Object r6 = r5.get(r4)
            o00OO000.o00Ooo r6 = (o00OO000.o00Ooo) r6
            long r0 = r6.f31964OooOo
            long r2 = r7.f31964OooOo
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.OooOO0()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.OooO0o()
            if (r5 == 0) goto L49
            r6.OooO0o0()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.OooO0o()
            if (r5 == 0) goto L22
            r7.OooO0o0()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooOoo0(long, o00O0oo.o000O0O0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooOooo(o00O0oo.o000O0O0 r15, int r16, long r17, o00O0OO0.OooO0OO r19) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.OooOooo(o00O0oo.o000O0O0, int, long, o00O0OO0.OooO0OO):java.lang.Object");
    }

    public final Object Oooo0(o000O0O0 o000o0o02, int i, long j, Object obj) {
        Object objOooOO0o = o000o0o02.OooOO0o(i);
        AtomicReferenceArray atomicReferenceArray = o000o0o02.f31624OooOoOO;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31613OooOo0o;
        if (objOooOO0o == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return o000Oo0.f31641OooOOO;
                }
                if (o000o0o02.OooOO0O(i, objOooOO0o, obj)) {
                    OooOOOO();
                    return o000Oo0.f31642OooOOO0;
                }
            }
        } else if (objOooOO0o == o000Oo0.f31634OooO0Oo && o000o0o02.OooOO0O(i, objOooOO0o, o000Oo0.f31630OooO)) {
            OooOOOO();
            Object obj2 = atomicReferenceArray.get(i * 2);
            o000o0o02.OooOOO(i, null);
            return obj2;
        }
        while (true) {
            Object objOooOO0o2 = o000o0o02.OooOO0o(i);
            if (objOooOO0o2 == null || objOooOO0o2 == o000Oo0.f31636OooO0o0) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (o000o0o02.OooOO0O(i, objOooOO0o2, o000Oo0.f31638OooO0oo)) {
                        OooOOOO();
                        return o000Oo0.f31643OooOOOO;
                    }
                } else {
                    if (obj == null) {
                        return o000Oo0.f31641OooOOO;
                    }
                    if (o000o0o02.OooOO0O(i, objOooOO0o2, obj)) {
                        OooOOOO();
                        return o000Oo0.f31642OooOOO0;
                    }
                }
            } else if (objOooOO0o2 != o000Oo0.f31634OooO0Oo) {
                OooO0O0 oooO0O0 = o000Oo0.f31639OooOO0;
                if (objOooOO0o2 == oooO0O0) {
                    return o000Oo0.f31643OooOOOO;
                }
                if (objOooOO0o2 == o000Oo0.f31638OooO0oo) {
                    return o000Oo0.f31643OooOOOO;
                }
                if (objOooOO0o2 == o000Oo0.OooOO0o) {
                    OooOOOO();
                    return o000Oo0.f31643OooOOOO;
                }
                if (objOooOO0o2 != o000Oo0.f31637OooO0oO && o000o0o02.OooOO0O(i, objOooOO0o2, o000Oo0.f31635OooO0o)) {
                    boolean z = objOooOO0o2 instanceof o00O00O;
                    if (z) {
                        objOooOO0o2 = ((o00O00O) objOooOO0o2).f31650OooO00o;
                    }
                    if (Oooo00o(objOooOO0o2, o000o0o02, i)) {
                        o000o0o02.OooOOOO(i, o000Oo0.f31630OooO);
                        OooOOOO();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        o000o0o02.OooOOO(i, null);
                        return obj3;
                    }
                    o000o0o02.OooOOOO(i, oooO0O0);
                    o000o0o02.OooO();
                    if (z) {
                        OooOOOO();
                    }
                    return o000Oo0.f31643OooOOOO;
                }
            } else if (o000o0o02.OooOO0O(i, objOooOO0o2, o000Oo0.f31630OooO)) {
                OooOOOO();
                Object obj4 = atomicReferenceArray.get(i * 2);
                o000o0o02.OooOOO(i, null);
                return obj4;
            }
        }
    }

    public final void Oooo000(o0oOOo o0oooo, boolean z) {
        if (o0oooo instanceof o0Oo0oo) {
            ((OooO0OO) o0oooo).resumeWith(o000OOo.OooO0O0(z ? OooOOoo() : OooOo00()));
            return;
        }
        if (o0oooo instanceof o00O000) {
            ((o00O000) o0oooo).f31648OooOo0O.resumeWith(new o000OO0O(new o000O0(OooOOo())));
            return;
        }
        if (!(o0oooo instanceof o0000O0O)) {
            if (o0oooo instanceof OooOO0) {
                ((o00OO0.OooO) ((OooOO0) o0oooo)).OooO0oO(this, o000Oo0.OooOO0o);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + o0oooo).toString());
            }
        }
        o0000O0O o0000o0o2 = (o0000O0O) o0oooo;
        oo0o0Oo oo0o0oo = o0000o0o2.f31597OooOo0o;
        kotlin.jvm.internal.OooOo.OooO0O0(oo0o0oo);
        o0000o0o2.f31597OooOo0o = null;
        o0000o0o2.f31596OooOo0O = o000Oo0.OooOO0o;
        Throwable thOooOOo = o0000o0o2.f31595OooOo.OooOOo();
        if (thOooOOo == null) {
            oo0o0oo.resumeWith(Boolean.FALSE);
        } else {
            oo0o0oo.resumeWith(o000OOo.OooO0O0(thOooOOo));
        }
    }

    public final boolean Oooo00O(Object obj, Object obj2) {
        if (obj instanceof OooOO0) {
            return ((o00OO0.OooO) ((OooOO0) obj)).OooO0oO(this, obj2);
        }
        if (obj instanceof o00O000) {
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return o000Oo0.OooO00o(((o00O000) obj).f31648OooOo0O, new o000OO0O(obj2), null);
        }
        if (!(obj instanceof o0000O0O)) {
            if (obj instanceof o0Oo0oo) {
                kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return o000Oo0.OooO00o((o0Oo0oo) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        o0000O0O o0000o0o2 = (o0000O0O) obj;
        oo0o0Oo oo0o0oo = o0000o0o2.f31597OooOo0o;
        kotlin.jvm.internal.OooOo.OooO0O0(oo0o0oo);
        o0000o0o2.f31597OooOo0o = null;
        o0000o0o2.f31596OooOo0O = obj2;
        Boolean bool = Boolean.TRUE;
        o0000o0o2.f31595OooOo.getClass();
        return o000Oo0.OooO00o(oo0o0oo, bool, null);
    }

    public final boolean Oooo00o(Object obj, o000O0O0 o000o0o02, int i) {
        OooOOO oooOOO;
        boolean z = obj instanceof o0Oo0oo;
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        if (z) {
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return o000Oo0.OooO00o((o0Oo0oo) obj, oooOo, null);
        }
        if (!(obj instanceof OooOO0)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iOooO0oo = ((o00OO0.OooO) obj).OooO0oo(this, oooOo);
        if (iOooO0oo == 0) {
            oooOOO = OooOOO.f31912OooOo0O;
        } else if (iOooO0oo == 1) {
            oooOOO = OooOOO.f31913OooOo0o;
        } else if (iOooO0oo == 2) {
            oooOOO = OooOOO.f31911OooOo;
        } else {
            if (iOooO0oo != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iOooO0oo).toString());
            }
            oooOOO = OooOOO.f31915OooOoO0;
        }
        if (oooOOO == OooOOO.f31913OooOo0o) {
            o000o0o02.OooOOO(i, null);
        }
        return oooOOO == OooOOO.f31912OooOo0O;
    }

    public final int Oooo0O0(o000O0O0 o000o0o02, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objOooOO0o = o000o0o02.OooOO0o(i);
            if (objOooOO0o == null) {
                if (!OooO0o(j) || z) {
                    if (z) {
                        if (o000o0o02.OooOO0O(i, null, o000Oo0.f31639OooOO0)) {
                            o000o0o02.OooO();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (o000o0o02.OooOO0O(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (o000o0o02.OooOO0O(i, null, o000Oo0.f31634OooO0Oo)) {
                    break;
                }
            } else {
                if (objOooOO0o != o000Oo0.f31636OooO0o0) {
                    OooO0O0 oooO0O0 = o000Oo0.f31640OooOO0O;
                    if (objOooOO0o == oooO0O0) {
                        o000o0o02.OooOOO(i, null);
                        return 5;
                    }
                    if (objOooOO0o == o000Oo0.f31638OooO0oo) {
                        o000o0o02.OooOOO(i, null);
                        return 5;
                    }
                    if (objOooOO0o == o000Oo0.OooOO0o) {
                        o000o0o02.OooOOO(i, null);
                        OooOoO0();
                        return 4;
                    }
                    o000o0o02.OooOOO(i, null);
                    if (objOooOO0o instanceof o00O00O) {
                        objOooOO0o = ((o00O00O) objOooOO0o).f31650OooO00o;
                    }
                    if (Oooo00O(objOooOO0o, obj)) {
                        o000o0o02.OooOOOO(i, o000Oo0.f31630OooO);
                        return 0;
                    }
                    if (o000o0o02.f31624OooOoOO.getAndSet((i * 2) + 1, oooO0O0) != oooO0O0) {
                        o000o0o02.OooOOO0(i, true);
                    }
                    return 5;
                }
                if (o000o0o02.OooOO0O(i, objOooOO0o, o000Oo0.f31634OooO0Oo)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void Oooo0OO(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        o000O000 o000o0002 = this;
        if (o000o0002.OooOoOO()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f31615OooOoO0;
            if (atomicLongFieldUpdater.get(o000o0002) > j) {
                break;
            } else {
                o000o0002 = this;
            }
        }
        int i = o000Oo0.f31633OooO0OO;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f31614OooOoO;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(o000o0002);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(o000o0002)) && j2 == atomicLongFieldUpdater.get(o000o0002)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(o000o0002);
                    if (atomicLongFieldUpdater2.compareAndSet(o000o0002, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        o000o0002 = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(o000o0002);
                    long j5 = atomicLongFieldUpdater2.get(o000o0002);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(o000o0002)) {
                        break;
                    }
                    if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, 4611686018427387904L + j6);
                    }
                    o000o0002 = this;
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(o000o0002);
                    if (atomicLongFieldUpdater2.compareAndSet(o000o0002, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        o000o0002 = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x01b7, code lost:
    
        r16 = r7;
        r3 = (o00O0oo.o000O0O0) r3.OooO0OO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01c0, code lost:
    
        if (r3 != null) goto L214;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oo.o000O000.toString():java.lang.String");
    }
}

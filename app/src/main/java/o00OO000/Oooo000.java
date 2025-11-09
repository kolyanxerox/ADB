package o00OO000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class Oooo000 {

    /* renamed from: OooO00o */
    public final int f31955OooO00o;

    /* renamed from: OooO0O0 */
    public final boolean f31956OooO0O0;

    /* renamed from: OooO0OO */
    public final int f31957OooO0OO;

    /* renamed from: OooO0Oo */
    public final /* synthetic */ AtomicReferenceArray f31958OooO0Oo;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: OooO0o0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31953OooO0o0 = AtomicReferenceFieldUpdater.newUpdater(Oooo000.class, Object.class, "_next$volatile");

    /* renamed from: OooO0o */
    public static final /* synthetic */ AtomicLongFieldUpdater f31952OooO0o = AtomicLongFieldUpdater.newUpdater(Oooo000.class, "_state$volatile");

    /* renamed from: OooO0oO */
    public static final o000O0O0.OooO0O0 f31954OooO0oO = new o000O0O0.OooO0O0("REMOVE_FROZEN", 3);

    public Oooo000(int i, boolean z) {
        this.f31955OooO00o = i;
        this.f31956OooO0O0 = z;
        int i2 = i - 1;
        this.f31957OooO0OO = i2;
        this.f31958OooO0Oo = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int OooO00o(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f31952OooO0o;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f31957OooO0OO;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f31958OooO0Oo;
            if (!this.f31956OooO0O0 && atomicReferenceArray.get(i2 & i3) != null) {
                int i4 = this.f31955OooO00o;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i2 & i3, runnable);
                Oooo000 oooo000OooO0OO = this;
                while ((atomicLongFieldUpdater.get(oooo000OooO0OO) & 1152921504606846976L) != 0) {
                    oooo000OooO0OO = oooo000OooO0OO.OooO0OO();
                    AtomicReferenceArray atomicReferenceArray2 = oooo000OooO0OO.f31958OooO0Oo;
                    int i5 = oooo000OooO0OO.f31957OooO0OO & i2;
                    Object obj = atomicReferenceArray2.get(i5);
                    if ((obj instanceof OooOo) && ((OooOo) obj).f31949OooO00o == i2) {
                        atomicReferenceArray2.set(i5, runnable);
                    } else {
                        oooo000OooO0OO = null;
                    }
                    if (oooo000OooO0OO == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean OooO0O0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f31952OooO0o;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final Oooo000 OooO0OO() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        Oooo000 oooo000;
        while (true) {
            atomicLongFieldUpdater = f31952OooO0o;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                oooo000 = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            oooo000 = this;
            if (atomicLongFieldUpdater.compareAndSet(oooo000, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31953OooO0o0;
            Oooo000 oooo0002 = (Oooo000) atomicReferenceFieldUpdater.get(this);
            if (oooo0002 != null) {
                return oooo0002;
            }
            Oooo000 oooo0003 = new Oooo000(oooo000.f31955OooO00o * 2, oooo000.f31956OooO0O0);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = oooo000.f31957OooO0OO;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object oooOo = oooo000.f31958OooO0Oo.get(i4);
                if (oooOo == null) {
                    oooOo = new OooOo(i);
                }
                oooo0003.f31958OooO0Oo.set(oooo0003.f31957OooO0OO & i, oooOo);
                i++;
            }
            atomicLongFieldUpdater.set(oooo0003, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oooo0003) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object OooO0Oo() {
        Oooo000 oooo000OooO0OO = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f31952OooO0o;
            long j = atomicLongFieldUpdater.get(oooo000OooO0OO);
            if ((j & 1152921504606846976L) != 0) {
                return f31954OooO0oO;
            }
            int i = (int) (j & 1073741823);
            int i2 = oooo000OooO0OO.f31957OooO0OO;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = oooo000OooO0OO.f31958OooO0Oo;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = oooo000OooO0OO.f31956OooO0O0;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof OooOo) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(oooo000OooO0OO, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                oooo000OooO0OO = this;
                if (z) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f31952OooO0o;
                        long j3 = atomicLongFieldUpdater2.get(oooo000OooO0OO);
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            oooo000OooO0OO = oooo000OooO0OO.OooO0OO();
                        } else {
                            Oooo000 oooo000 = oooo000OooO0OO;
                            oooo000OooO0OO = oooo000;
                            if (atomicLongFieldUpdater2.compareAndSet(oooo000, j3, (j3 & (-1073741824)) | j2)) {
                                oooo000OooO0OO.f31958OooO0Oo.set(oooo000OooO0OO.f31957OooO0OO & i5, null);
                                oooo000OooO0OO = null;
                            } else {
                                continue;
                            }
                        }
                        if (oooo000OooO0OO == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}

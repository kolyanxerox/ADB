package o00O0oOo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o000O0O0.OooO0O0;

/* loaded from: classes3.dex */
public abstract class o0O0ooO implements Runnable, Comparable, o000OO00 {

    /* renamed from: OooOo0O */
    public long f31563OooOo0O;

    /* renamed from: OooOo0o */
    public int f31564OooOo0o = -1;
    private volatile Object _heap;

    public o0O0ooO(long j) {
        this.f31563OooOo0O = j;
    }

    public final int OooO0O0(long j, o00oOoo o00oooo, o00O000 o00o000) {
        synchronized (this) {
            if (this._heap == o0000OO0.f31498OooO0O0) {
                return 2;
            }
            synchronized (o00oooo) {
                try {
                    o0O0ooO[] o0o0oooArr = o00oooo.f31970OooO00o;
                    o0O0ooO o0o0ooo = o0o0oooArr != null ? o0o0oooArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o00O000.f31524OooOoO;
                    o00o000.getClass();
                    if (o00O000.f31526OooOoo0.get(o00o000) != 0) {
                        return 1;
                    }
                    if (o0o0ooo == null) {
                        o00oooo.f31558OooO0OO = j;
                    } else {
                        long j2 = o0o0ooo.f31563OooOo0O;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - o00oooo.f31558OooO0OO > 0) {
                            o00oooo.f31558OooO0OO = j;
                        }
                    }
                    long j3 = this.f31563OooOo0O;
                    long j4 = o00oooo.f31558OooO0OO;
                    if (j3 - j4 < 0) {
                        this.f31563OooOo0O = j4;
                    }
                    o00oooo.OooO00o(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void OooO0OO(o00oOoo o00oooo) {
        if (this._heap == o0000OO0.f31498OooO0O0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = o00oooo;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f31563OooOo0O - ((o0O0ooO) obj).f31563OooOo0O;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // o00O0oOo.o000OO00
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                OooO0O0 oooO0O0 = o0000OO0.f31498OooO0O0;
                if (obj == oooO0O0) {
                    return;
                }
                o00oOoo o00oooo = obj instanceof o00oOoo ? (o00oOoo) obj : null;
                if (o00oooo != null) {
                    synchronized (o00oooo) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof o00OO000.o0ooOOo ? (o00OO000.o0ooOOo) obj2 : null) != null) {
                            o00oooo.OooO0O0(this.f31564OooOo0o);
                        }
                    }
                }
                this._heap = oooO0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f31563OooOo0O + ']';
    }
}

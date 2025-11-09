package o00OO000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o00O0oOo.o0000O00;
import o00O0oOo.o000O00;
import o00O0oOo.o000O000;
import o00O0oOo.o000OO00;
import o00O0oOo.oo0o0Oo;

/* loaded from: classes3.dex */
public final class OooOO0O extends o0000O00 implements o000O00 {

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31938OooOoo0 = AtomicIntegerFieldUpdater.newUpdater(OooOO0O.class, "runningWorkers$volatile");

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f31939OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ o000O00 f31940OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o0000O00 f31941OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final OooOo00 f31942OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final String f31943OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final Object f31944OooOoOO;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(o0000O00 o0000o00, int i, String str) {
        o000O00 o000o002 = o0000o00 instanceof o000O00 ? (o000O00) o0000o00 : null;
        this.f31940OooOo0O = o000o002 == null ? o000O000.f31511OooO00o : o000o002;
        this.f31941OooOo0o = o0000o00;
        this.f31939OooOo = i;
        this.f31943OooOoO0 = str;
        this.f31942OooOoO = new OooOo00();
        this.f31944OooOoOO = new Object();
    }

    @Override // o00O0oOo.o000O00
    public final void OooO(long j, oo0o0Oo oo0o0oo) {
        this.f31940OooOo0O.OooO(j, oo0o0oo);
    }

    @Override // o00O0oOo.o000O00
    public final o000OO00 OooO0Oo(long j, Runnable runnable, o00O0O0O.OooOOO0 oooOOO0) {
        return this.f31940OooOo0O.OooO0Oo(j, runnable, oooOOO0);
    }

    public final boolean OooOOO() {
        synchronized (this.f31944OooOoOO) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31938OooOoo0;
            if (atomicIntegerFieldUpdater.get(this) >= this.f31939OooOo) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public final Runnable OooOOO0() {
        while (true) {
            Runnable runnable = (Runnable) this.f31942OooOoO.OooO0Oo();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f31944OooOoOO) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31938OooOoo0;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f31942OooOoO.OooO0OO() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        Runnable runnableOooOOO0;
        this.f31942OooOoO.OooO00o(runnable);
        if (f31938OooOoo0.get(this) >= this.f31939OooOo || !OooOOO() || (runnableOooOOO0 = OooOOO0()) == null) {
            return;
        }
        this.f31941OooOo0o.dispatch(this, new o00000oO.OooOOO0(this, false, runnableOooOOO0, 28));
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatchYield(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        Runnable runnableOooOOO0;
        this.f31942OooOoO.OooO00o(runnable);
        if (f31938OooOoo0.get(this) >= this.f31939OooOo || !OooOOO() || (runnableOooOOO0 = OooOOO0()) == null) {
            return;
        }
        this.f31941OooOo0o.dispatchYield(this, new o00000oO.OooOOO0(this, false, runnableOooOOO0, 28));
    }

    @Override // o00O0oOo.o0000O00
    public final o0000O00 limitedParallelism(int i, String str) {
        OooO00o.OooO00o(i);
        return i >= this.f31939OooOo ? str != null ? new o000oOoO(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        String str = this.f31943OooOoO0;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31941OooOo0o);
        sb.append(".limitedParallelism(");
        return OooO0oO.OooOo.OooOOO0(sb, this.f31939OooOo, ')');
    }
}

package o00O0oOo;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class oo00o extends oo0o0O0 {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31575OooOoOO = AtomicIntegerFieldUpdater.newUpdater(oo00o.class, "_invoked$volatile");

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o00O0OO0 f31576OooOoO;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    public oo00o(o00O0OO0 o00o0oo0) {
        this.f31576OooOoO = o00o0oo0;
    }

    @Override // o00O0oOo.oo0o0O0
    public final boolean OooO() {
        return true;
    }

    @Override // o00O0oOo.oo0o0O0
    public final void OooOO0(Throwable th) {
        if (f31575OooOoOO.compareAndSet(this, 0, 1)) {
            this.f31576OooOoO.invoke(th);
        }
    }
}

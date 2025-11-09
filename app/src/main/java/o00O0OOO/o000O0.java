package o00O0oOo;

import Oooo0o0.OooO;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o00OO000.OooO00o;

/* loaded from: classes3.dex */
public final class o000O0 extends o00OO000.o00Oo0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31510OooOoO = AtomicIntegerFieldUpdater.newUpdater(o000O0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // o00OO000.o00Oo0, o00O0oOo.o00O
    public final void OooOOoo(Object obj) {
        OooOo00(obj);
    }

    @Override // o00OO000.o00Oo0, o00O0oOo.o00O
    public final void OooOo00(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f31510OooOoO;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                OooO00o.OooO0oo(o0000OO0.OooOo(obj), OooO.OooOOOO(this.f31962OooOoO0));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}

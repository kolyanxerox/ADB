package o00OO000;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o00O0oOo.oo0O;

/* loaded from: classes3.dex */
public abstract class o00Ooo extends OooO0O0 implements oo0O {

    /* renamed from: OooOoO0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31963OooOoO0 = AtomicIntegerFieldUpdater.newUpdater(o00Ooo.class, "cleanedAndPointers$volatile");

    /* renamed from: OooOo */
    public final long f31964OooOo;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public o00Ooo(long j, o00Ooo o00ooo2, int i) {
        super(o00ooo2);
        this.f31964OooOo = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final void OooO() {
        if (f31963OooOoO0.incrementAndGet(this) == OooO0oO()) {
            OooO0o0();
        }
    }

    @Override // o00OO000.OooO0O0
    public final boolean OooO0Oo() {
        return f31963OooOoO0.get(this) == OooO0oO() && OooO0OO() != null;
    }

    public final boolean OooO0o() {
        return f31963OooOoO0.addAndGet(this, SupportMenu.CATEGORY_MASK) == OooO0oO() && OooO0OO() != null;
    }

    public abstract int OooO0oO();

    public abstract void OooO0oo(int i, o00O0O0O.OooOOO0 oooOOO0);

    public final boolean OooOO0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f31963OooOoO0;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == OooO0oO() && OooO0OO() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}

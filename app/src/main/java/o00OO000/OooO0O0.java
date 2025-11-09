package o00OO000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public abstract class OooO0O0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31929OooOo0O = AtomicReferenceFieldUpdater.newUpdater(OooO0O0.class, Object.class, "_next$volatile");

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31930OooOo0o = AtomicReferenceFieldUpdater.newUpdater(OooO0O0.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public OooO0O0(o00Ooo o00ooo2) {
        this._prev$volatile = o00ooo2;
    }

    public final void OooO0O0() {
        f31930OooOo0o.set(this, null);
    }

    public final OooO0O0 OooO0OO() {
        Object obj = f31929OooOo0O.get(this);
        if (obj == OooO00o.f31922OooO00o) {
            return null;
        }
        return (OooO0O0) obj;
    }

    public abstract boolean OooO0Oo();

    public final void OooO0o0() {
        OooO0O0 oooO0O0OooO0OO;
        if (OooO0OO() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31930OooOo0o;
            OooO0O0 oooO0O0 = (OooO0O0) atomicReferenceFieldUpdater.get(this);
            while (oooO0O0 != null && oooO0O0.OooO0Oo()) {
                oooO0O0 = (OooO0O0) atomicReferenceFieldUpdater.get(oooO0O0);
            }
            OooO0O0 oooO0O0OooO0OO2 = OooO0OO();
            kotlin.jvm.internal.OooOo.OooO0O0(oooO0O0OooO0OO2);
            while (oooO0O0OooO0OO2.OooO0Oo() && (oooO0O0OooO0OO = oooO0O0OooO0OO2.OooO0OO()) != null) {
                oooO0O0OooO0OO2 = oooO0O0OooO0OO;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(oooO0O0OooO0OO2);
                OooO0O0 oooO0O02 = ((OooO0O0) obj) == null ? null : oooO0O0;
                while (!atomicReferenceFieldUpdater.compareAndSet(oooO0O0OooO0OO2, obj, oooO0O02)) {
                    if (atomicReferenceFieldUpdater.get(oooO0O0OooO0OO2) != obj) {
                        break;
                    }
                }
            }
            if (oooO0O0 != null) {
                f31929OooOo0O.set(oooO0O0, oooO0O0OooO0OO2);
            }
            if (!oooO0O0OooO0OO2.OooO0Oo() || oooO0O0OooO0OO2.OooO0OO() == null) {
                if (oooO0O0 == null || !oooO0O0.OooO0Oo()) {
                    return;
                }
            }
        }
    }
}

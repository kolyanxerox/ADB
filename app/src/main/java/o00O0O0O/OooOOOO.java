package o00O0O0O;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o00O0O0o.OooOo00;

/* loaded from: classes3.dex */
public final class OooOOOO implements OooO0OO, o00O0OO0.OooO0o {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31359OooOo0o = AtomicReferenceFieldUpdater.newUpdater(OooOOOO.class, Object.class, "result");

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooO0OO f31360OooOo0O;
    private volatile Object result;

    public OooOOOO(OooO0OO oooO0OO) {
        OooOo00 oooOo00 = OooOo00.f31366OooOo0o;
        this.f31360OooOo0O = oooO0OO;
        this.result = oooOo00;
    }

    public final Object OooO00o() throws Throwable {
        Object obj = this.result;
        OooOo00 oooOo00 = OooOo00.f31366OooOo0o;
        if (obj == oooOo00) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31359OooOo0o;
            OooOo00 oooOo002 = OooOo00.f31365OooOo0O;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oooOo00, oooOo002)) {
                if (atomicReferenceFieldUpdater.get(this) != oooOo00) {
                    obj = this.result;
                }
            }
            return OooOo00.f31365OooOo0O;
        }
        if (obj == OooOo00.f31364OooOo) {
            return OooOo00.f31365OooOo0O;
        }
        if (obj instanceof oo00o.OooOO0O) {
            throw ((oo00o.OooOO0O) obj).f33187OooOo0O;
        }
        return obj;
    }

    @Override // o00O0OO0.OooO0o
    public final o00O0OO0.OooO0o getCallerFrame() {
        OooO0OO oooO0OO = this.f31360OooOo0O;
        if (oooO0OO instanceof o00O0OO0.OooO0o) {
            return (o00O0OO0.OooO0o) oooO0OO;
        }
        return null;
    }

    @Override // o00O0O0O.OooO0OO
    public final OooOOO0 getContext() {
        return this.f31360OooOo0O.getContext();
    }

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            OooOo00 oooOo00 = OooOo00.f31366OooOo0o;
            if (obj2 == oooOo00) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31359OooOo0o;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oooOo00, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != oooOo00) {
                        break;
                    }
                }
                return;
            }
            OooOo00 oooOo002 = OooOo00.f31365OooOo0O;
            if (obj2 != oooOo002) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31359OooOo0o;
            OooOo00 oooOo003 = OooOo00.f31364OooOo;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, oooOo002, oooOo003)) {
                if (atomicReferenceFieldUpdater2.get(this) != oooOo002) {
                    break;
                }
            }
            this.f31360OooOo0O.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f31360OooOo0O;
    }
}

package oo00o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class OooOOO implements OooO0OO, Serializable {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f33188OooOo = AtomicReferenceFieldUpdater.newUpdater(OooOOO.class, Object.class, "OooOo0o");

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile o00O0Oo.OooO0O0 f33189OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile Object f33190OooOo0o;

    @Override // oo00o.OooO0OO
    public final Object getValue() {
        Object obj = this.f33190OooOo0o;
        OooOo00 oooOo00 = OooOo00.f33196OooO00o;
        if (obj != oooOo00) {
            return obj;
        }
        o00O0Oo.OooO0O0 oooO0O0 = this.f33189OooOo0O;
        if (oooO0O0 != null) {
            Object objInvoke = oooO0O0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33188OooOo;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oooOo00, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != oooOo00) {
                }
            }
            this.f33189OooOo0O = null;
            return objInvoke;
        }
        return this.f33190OooOo0o;
    }

    @Override // oo00o.OooO0OO
    public final boolean isInitialized() {
        return this.f33190OooOo0o != OooOo00.f33196OooO00o;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

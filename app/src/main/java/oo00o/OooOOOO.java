package oo00o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OooOOOO implements OooO0OO, Serializable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f33192OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public o00O0Oo.OooO0O0 f33193OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile Object f33194OooOo0o;

    public OooOOOO(o00O0Oo.OooO0O0 initializer) {
        kotlin.jvm.internal.OooOo.OooO0o0(initializer, "initializer");
        this.f33193OooOo0O = initializer;
        this.f33194OooOo0o = OooOo00.f33196OooO00o;
        this.f33192OooOo = this;
    }

    @Override // oo00o.OooO0OO
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f33194OooOo0o;
        OooOo00 oooOo00 = OooOo00.f33196OooO00o;
        if (obj != oooOo00) {
            return obj;
        }
        synchronized (this.f33192OooOo) {
            objInvoke = this.f33194OooOo0o;
            if (objInvoke == oooOo00) {
                o00O0Oo.OooO0O0 oooO0O0 = this.f33193OooOo0O;
                kotlin.jvm.internal.OooOo.OooO0O0(oooO0O0);
                objInvoke = oooO0O0.invoke();
                this.f33194OooOo0o = objInvoke;
                this.f33193OooOo0O = null;
            }
        }
        return objInvoke;
    }

    @Override // oo00o.OooO0OO
    public final boolean isInitialized() {
        return this.f33194OooOo0o != OooOo00.f33196OooO00o;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package oo00o;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class Oooo000 implements OooO0OO, Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public o00O0Oo.OooO0O0 f33197OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Object f33198OooOo0o;

    @Override // oo00o.OooO0OO
    public final Object getValue() {
        if (this.f33198OooOo0o == OooOo00.f33196OooO00o) {
            o00O0Oo.OooO0O0 oooO0O0 = this.f33197OooOo0O;
            kotlin.jvm.internal.OooOo.OooO0O0(oooO0O0);
            this.f33198OooOo0o = oooO0O0.invoke();
            this.f33197OooOo0O = null;
        }
        return this.f33198OooOo0o;
    }

    @Override // oo00o.OooO0OO
    public final boolean isInitialized() {
        return this.f33198OooOo0o != OooOo00.f33196OooO00o;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

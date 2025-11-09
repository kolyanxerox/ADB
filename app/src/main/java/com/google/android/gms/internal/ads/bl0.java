package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class bl0 extends yk0 {

    /* renamed from: OooOo0O */
    public final Object f17520OooOo0O;

    public bl0(Object obj) {
        this.f17520OooOo0O = obj;
    }

    @Override // com.google.android.gms.internal.ads.yk0
    public final yk0 OooO00o(wk0 wk0Var) {
        Object objApply = wk0Var.apply(this.f17520OooOo0O);
        ii0.Oooo0oo(objApply, "the Function passed to Optional.transform() must not return null.");
        return new bl0(objApply);
    }

    @Override // com.google.android.gms.internal.ads.yk0
    public final Object OooO0O0() {
        return this.f17520OooOo0O;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bl0) {
            return this.f17520OooOo0O.equals(((bl0) obj).f17520OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17520OooOo0O.hashCode() + 1502476572;
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOO0O("Optional.of(", this.f17520OooOo0O.toString(), ")");
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class xu0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f25804OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Class f25805OooO0O0;

    public /* synthetic */ xu0(Class cls, Class cls2) {
        this.f25804OooO00o = cls;
        this.f25805OooO0O0 = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        return xu0Var.f25804OooO00o.equals(this.f25804OooO00o) && xu0Var.f25805OooO0O0.equals(this.f25805OooO0O0);
    }

    public final int hashCode() {
        return Objects.hash(this.f25804OooO00o, this.f25805OooO0O0);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOoo(this.f25804OooO00o.getSimpleName(), " with serialization type: ", this.f25805OooO0O0.getSimpleName());
    }
}

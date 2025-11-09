package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class nu0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f21610OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Class f21611OooO0O0;

    public /* synthetic */ nu0(Class cls, Class cls2) {
        this.f21610OooO00o = cls;
        this.f21611OooO0O0 = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        return nu0Var.f21610OooO00o.equals(this.f21610OooO00o) && nu0Var.f21611OooO0O0.equals(this.f21611OooO0O0);
    }

    public final int hashCode() {
        return Objects.hash(this.f21610OooO00o, this.f21611OooO0O0);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOoo(this.f21610OooO00o.getSimpleName(), " with primitive type: ", this.f21611OooO0O0.getSimpleName());
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class wu0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f25409OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final az0 f25410OooO0O0;

    public /* synthetic */ wu0(Class cls, az0 az0Var) {
        this.f25409OooO00o = cls;
        this.f25410OooO0O0 = az0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wu0)) {
            return false;
        }
        wu0 wu0Var = (wu0) obj;
        return wu0Var.f25409OooO00o.equals(this.f25409OooO00o) && wu0Var.f25410OooO0O0.equals(this.f25410OooO0O0);
    }

    public final int hashCode() {
        return Objects.hash(this.f25409OooO00o, this.f25410OooO0O0);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOoo(this.f25409OooO00o.getSimpleName(), ", object identifier: ", String.valueOf(this.f25410OooO0O0));
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class u91 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f24611OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f24612OooO0O0;

    public u91(int i, boolean z) {
        this.f24611OooO00o = i;
        this.f24612OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u91.class != obj.getClass()) {
            return false;
        }
        u91 u91Var = (u91) obj;
        return this.f24611OooO00o == u91Var.f24611OooO00o && this.f24612OooO0O0 == u91Var.f24612OooO0O0;
    }

    public final int hashCode() {
        return (this.f24611OooO00o * 31) + (this.f24612OooO0O0 ? 1 : 0);
    }
}

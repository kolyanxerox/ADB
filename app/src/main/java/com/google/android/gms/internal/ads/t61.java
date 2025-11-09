package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class t61 {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final t61 f24254OooO0Oo = new o0O0OO0().OooO00o();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f24255OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f24256OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f24257OooO0OO;

    public /* synthetic */ t61(o0O0OO0 o0o0oo0) {
        this.f24255OooO00o = o0o0oo0.f21958OooO00o;
        this.f24256OooO0O0 = o0o0oo0.f21959OooO0O0;
        this.f24257OooO0OO = o0o0oo0.f21960OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t61.class != obj.getClass()) {
            return false;
        }
        t61 t61Var = (t61) obj;
        return this.f24255OooO00o == t61Var.f24255OooO00o && this.f24256OooO0O0 == t61Var.f24256OooO0O0 && this.f24257OooO0OO == t61Var.f24257OooO0OO;
    }

    public final int hashCode() {
        int i = (this.f24255OooO00o ? 1 : 0) << 2;
        boolean z = this.f24256OooO0O0;
        return (z ? 1 : 0) + (z ? 1 : 0) + i + (this.f24257OooO0OO ? 1 : 0);
    }
}

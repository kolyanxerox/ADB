package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f51 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f18788OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final float f18789OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f18790OooO0OO;

    public /* synthetic */ f51(e51 e51Var) {
        this.f18788OooO00o = e51Var.f18498OooO00o;
        this.f18789OooO0O0 = e51Var.f18499OooO0O0;
        this.f18790OooO0OO = e51Var.f18500OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f51)) {
            return false;
        }
        f51 f51Var = (f51) obj;
        return this.f18788OooO00o == f51Var.f18788OooO00o && this.f18789OooO0O0 == f51Var.f18789OooO0O0 && this.f18790OooO0OO == f51Var.f18790OooO0OO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18788OooO00o), Float.valueOf(this.f18789OooO0O0), Long.valueOf(this.f18790OooO0OO)});
    }
}

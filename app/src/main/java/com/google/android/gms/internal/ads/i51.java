package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i51 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final h91 f19954OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f19955OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f19956OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19957OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f19958OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f19959OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f19960OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f19961OooO0oo;

    public i51(h91 h91Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        af0.OoooO0(!z3 || z);
        af0.OoooO0(!z2 || z);
        this.f19954OooO00o = h91Var;
        this.f19955OooO0O0 = j;
        this.f19956OooO0OO = j2;
        this.f19957OooO0Oo = j3;
        this.f19959OooO0o0 = j4;
        this.f19958OooO0o = z;
        this.f19960OooO0oO = z2;
        this.f19961OooO0oo = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i51.class == obj.getClass()) {
            i51 i51Var = (i51) obj;
            if (this.f19955OooO0O0 == i51Var.f19955OooO0O0 && this.f19956OooO0OO == i51Var.f19956OooO0OO && this.f19957OooO0Oo == i51Var.f19957OooO0Oo && this.f19959OooO0o0 == i51Var.f19959OooO0o0 && this.f19958OooO0o == i51Var.f19958OooO0o && this.f19960OooO0oO == i51Var.f19960OooO0oO && this.f19961OooO0oo == i51Var.f19961OooO0oo && Objects.equals(this.f19954OooO00o, i51Var.f19954OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f19954OooO00o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f19955OooO0O0)) * 31) + ((int) this.f19956OooO0OO)) * 31) + ((int) this.f19957OooO0Oo)) * 31) + ((int) this.f19959OooO0o0)) * 961) + (this.f19958OooO0o ? 1 : 0)) * 31) + (this.f19960OooO0oO ? 1 : 0)) * 31) + (this.f19961OooO0oo ? 1 : 0);
    }
}

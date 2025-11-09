package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d61 {

    /* renamed from: OooO */
    public final long f18177OooO;

    /* renamed from: OooO00o */
    public final long f18178OooO00o;

    /* renamed from: OooO0O0 */
    public final AbstractC1787lf f18179OooO0O0;

    /* renamed from: OooO0OO */
    public final int f18180OooO0OO;

    /* renamed from: OooO0Oo */
    public final h91 f18181OooO0Oo;

    /* renamed from: OooO0o */
    public final AbstractC1787lf f18182OooO0o;

    /* renamed from: OooO0o0 */
    public final long f18183OooO0o0;

    /* renamed from: OooO0oO */
    public final int f18184OooO0oO;

    /* renamed from: OooO0oo */
    public final h91 f18185OooO0oo;

    /* renamed from: OooOO0 */
    public final long f18186OooOO0;

    public d61(long j, AbstractC1787lf abstractC1787lf, int i, h91 h91Var, long j2, AbstractC1787lf abstractC1787lf2, int i2, h91 h91Var2, long j3, long j4) {
        this.f18178OooO00o = j;
        this.f18179OooO0O0 = abstractC1787lf;
        this.f18180OooO0OO = i;
        this.f18181OooO0Oo = h91Var;
        this.f18183OooO0o0 = j2;
        this.f18182OooO0o = abstractC1787lf2;
        this.f18184OooO0oO = i2;
        this.f18185OooO0oo = h91Var2;
        this.f18177OooO = j3;
        this.f18186OooOO0 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d61.class == obj.getClass()) {
            d61 d61Var = (d61) obj;
            if (this.f18178OooO00o == d61Var.f18178OooO00o && this.f18180OooO0OO == d61Var.f18180OooO0OO && this.f18183OooO0o0 == d61Var.f18183OooO0o0 && this.f18184OooO0oO == d61Var.f18184OooO0oO && this.f18177OooO == d61Var.f18177OooO && this.f18186OooOO0 == d61Var.f18186OooOO0 && ii0.OooOOoo(this.f18179OooO0O0, d61Var.f18179OooO0O0) && ii0.OooOOoo(this.f18181OooO0Oo, d61Var.f18181OooO0Oo) && ii0.OooOOoo(this.f18182OooO0o, d61Var.f18182OooO0o) && ii0.OooOOoo(this.f18185OooO0oo, d61Var.f18185OooO0oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18178OooO00o), this.f18179OooO0O0, Integer.valueOf(this.f18180OooO0OO), this.f18181OooO0Oo, Long.valueOf(this.f18183OooO0o0), this.f18182OooO0o, Integer.valueOf(this.f18184OooO0oO), this.f18185OooO0oo, Long.valueOf(this.f18177OooO), Long.valueOf(this.f18186OooOO0)});
    }
}

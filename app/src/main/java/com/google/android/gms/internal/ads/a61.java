package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;

/* loaded from: classes2.dex */
public final class a61 {

    /* renamed from: OooO0OO */
    public static final a61 f16917OooO0OO;

    /* renamed from: OooO00o */
    public final long f16918OooO00o;

    /* renamed from: OooO0O0 */
    public final long f16919OooO0O0;

    static {
        a61 a61Var = new a61(0L, 0L);
        new a61(LocationRequestCompat.PASSIVE_INTERVAL, LocationRequestCompat.PASSIVE_INTERVAL);
        new a61(LocationRequestCompat.PASSIVE_INTERVAL, 0L);
        new a61(0L, LocationRequestCompat.PASSIVE_INTERVAL);
        f16917OooO0OO = a61Var;
    }

    public a61(long j, long j2) {
        af0.OoooO0(j >= 0);
        af0.OoooO0(j2 >= 0);
        this.f16918OooO00o = j;
        this.f16919OooO0O0 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a61.class == obj.getClass()) {
            a61 a61Var = (a61) obj;
            if (this.f16918OooO00o == a61Var.f16918OooO00o && this.f16919OooO0O0 == a61Var.f16919OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16918OooO00o) * 31) + ((int) this.f16919OooO0O0);
    }
}

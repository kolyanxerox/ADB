package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ia1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f20007OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f20008OooO0O0;

    public ia1(long j, long j2) {
        this.f20007OooO00o = j;
        this.f20008OooO0O0 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia1)) {
            return false;
        }
        ia1 ia1Var = (ia1) obj;
        return this.f20007OooO00o == ia1Var.f20007OooO00o && this.f20008OooO0O0 == ia1Var.f20008OooO0O0;
    }

    public final int hashCode() {
        return (((int) this.f20007OooO00o) * 31) + ((int) this.f20008OooO0O0);
    }
}

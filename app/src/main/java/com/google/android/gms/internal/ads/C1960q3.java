package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.q3 */
/* loaded from: classes2.dex */
public final class C1960q3 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f23495OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f23496OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f23497OooO0OO;

    public C1960q3(int i, long j, String str) {
        this.f23495OooO00o = j;
        this.f23496OooO0O0 = str;
        this.f23497OooO0OO = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1960q3)) {
            C1960q3 c1960q3 = (C1960q3) obj;
            if (c1960q3.f23495OooO00o == this.f23495OooO00o && c1960q3.f23497OooO0OO == this.f23497OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f23495OooO00o;
    }
}

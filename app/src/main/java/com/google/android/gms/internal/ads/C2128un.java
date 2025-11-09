package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.un */
/* loaded from: classes2.dex */
public final class C2128un implements d51 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f24666OooO0o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f24668OooO0oO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final eb1 f24662OooO00o = new eb1();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f24663OooO0O0 = 15000000;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f24664OooO0OO = 30000000;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f24665OooO0Oo = 2500000;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f24667OooO0o0 = 5000000;

    @Override // com.google.android.gms.internal.ads.d51
    public final boolean OooO00o(c51 c51Var) {
        int i;
        long j = c51Var.f17698OooO0O0;
        boolean z = true;
        char c = j > this.f24664OooO0OO ? (char) 0 : j < this.f24663OooO0O0 ? (char) 2 : (char) 1;
        eb1 eb1Var = this.f24662OooO00o;
        synchronized (eb1Var) {
            i = eb1Var.f18558OooO0O0 * 65536;
        }
        int i2 = this.f24666OooO0o;
        if (c != 2 && (c != 1 || !this.f24668OooO0oO || i >= i2)) {
            z = false;
        }
        this.f24668OooO0oO = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0O0(o61 o61Var) {
        this.f24666OooO0o = 0;
        this.f24668OooO0oO = false;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0OO(o61 o61Var) {
        this.f24666OooO0o = 0;
        this.f24668OooO0oO = false;
        eb1 eb1Var = this.f24662OooO00o;
        synchronized (eb1Var) {
            eb1Var.OooO00o(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final boolean OooO0Oo(c51 c51Var) {
        long j = c51Var.f17700OooO0Oo ? this.f24667OooO0o0 : this.f24665OooO0Oo;
        return j <= 0 || c51Var.f17698OooO0O0 >= j;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0o(c51 c51Var, za1[] za1VarArr) {
        int i;
        this.f24666OooO0o = 0;
        for (za1 za1Var : za1VarArr) {
            if (za1Var != null) {
                int i2 = this.f24666OooO0o;
                int i3 = za1Var.zzg().f17494OooO0OO;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.f24666OooO0o = i2 + i;
            }
        }
        this.f24662OooO00o.OooO00o(this.f24666OooO0o);
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final void OooO0o0(o61 o61Var) {
        this.f24666OooO0o = 0;
        this.f24668OooO0oO = false;
        eb1 eb1Var = this.f24662OooO00o;
        synchronized (eb1Var) {
            eb1Var.OooO00o(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final long zzb() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final /* synthetic */ boolean zzi() {
        AbstractC1641hg.OooOOo0("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d51
    public final eb1 zzk() {
        return this.f24662OooO00o;
    }
}

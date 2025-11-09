package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final /* synthetic */ class e40 implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f18487OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ C2197wi f18488OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ int f18489OooO0OO;

    /* renamed from: OooO0Oo */
    public final /* synthetic */ Object f18490OooO0Oo;

    public /* synthetic */ e40(Object obj, C2197wi c2197wi, int i, int i2) {
        this.f18487OooO00o = i2;
        this.f18490OooO0Oo = obj;
        this.f18488OooO0O0 = c2197wi;
        this.f18489OooO0OO = i;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) {
        Bundle bundle;
        switch (this.f18487OooO00o) {
            case 0:
                C2051sk c2051sk = (C2051sk) this.f18490OooO0Oo;
                C2197wi c2197wi = this.f18488OooO0O0;
                if (c2197wi != null && (bundle = c2197wi.zzm) != null) {
                    bundle.putBoolean("ls", true);
                }
                return ii0.ooOO(((d50) ((n31) c2051sk.f24099OooOoO).zzb()).o000O0o0(c2197wi, this.f18489OooO0OO), new d40(c2197wi, 0), (C2163vl) c2051sk.f24096OooOo);
            default:
                h40 h40Var = (h40) this.f18490OooO0Oo;
                C2197wi c2197wi2 = this.f18488OooO0O0;
                if (c2197wi2 != null) {
                    h40Var.getClass();
                    Bundle bundle2 = c2197wi2.zzm;
                    if (bundle2 != null) {
                        bundle2.putBoolean("ls", true);
                    }
                }
                return ii0.ooOO(((d50) h40Var.f19547OooO0o0.zzb()).o000O0oO(c2197wi2, this.f18489OooO0OO), new d40(c2197wi2, 1), h40Var.f19544OooO0O0);
        }
    }
}

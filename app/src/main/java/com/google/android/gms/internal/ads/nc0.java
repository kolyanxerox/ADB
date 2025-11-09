package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* loaded from: classes2.dex */
public final class nc0 implements wk0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21469OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ de0 f21470OooO0O0;

    public /* synthetic */ nc0(de0 de0Var, int i) {
        this.f21469OooO00o = i;
        this.f21470OooO0O0 = de0Var;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.f21469OooO00o) {
            case 0:
                zzo.zzh("", (v40) obj);
                zze.zza("Failed to get a cache key, reverting to legacy flow.");
                de0 de0Var = this.f21470OooO0O0;
                oc0 oc0Var = new oc0(null, de0Var.OooOo00());
                de0Var.f18243OooOoO0 = oc0Var;
                return oc0Var;
            default:
                C2197wi c2197wi = (C2197wi) obj;
                oc0 oc0Var2 = new oc0(c2197wi, new re0(c2197wi.zzj));
                this.f21470OooO0O0.f18243OooOoO0 = oc0Var2;
                return oc0Var2;
        }
    }
}

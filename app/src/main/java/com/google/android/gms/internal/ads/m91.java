package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class m91 implements za1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final za1 f21151OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1421bg f21152OooO0O0;

    public m91(za1 za1Var, C1421bg c1421bg) {
        this.f21151OooO00o = za1Var;
        this.f21152OooO0O0 = c1421bg;
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int OooO00o(int i) {
        return this.f21151OooO00o.OooO00o(i);
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int OooO0O0(int i) {
        return this.f21151OooO00o.OooO0O0(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m91)) {
            return false;
        }
        m91 m91Var = (m91) obj;
        return this.f21151OooO00o.equals(m91Var.f21151OooO00o) && this.f21152OooO0O0.equals(m91Var.f21152OooO0O0);
    }

    public final int hashCode() {
        return this.f21151OooO00o.hashCode() + ((this.f21152OooO0O0.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int zzb() {
        return this.f21151OooO00o.zzb();
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int zzd() {
        return this.f21151OooO00o.zzd();
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final o0OoOo0 zze(int i) {
        return this.f21152OooO0O0.f17495OooO0Oo[this.f21151OooO00o.OooO00o(i)];
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final o0OoOo0 zzf() {
        return this.f21152OooO0O0.f17495OooO0Oo[this.f21151OooO00o.zzb()];
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final C1421bg zzg() {
        return this.f21152OooO0O0;
    }
}

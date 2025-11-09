package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class w30 implements vp0 {

    /* renamed from: OooOo */
    public final /* synthetic */ x30 f25177OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f25178OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ String f25179OooOo0o;

    public /* synthetic */ w30(x30 x30Var, String str, int i) {
        this.f25178OooOo0O = i;
        this.f25179OooOo0o = str;
        this.f25177OooOo = x30Var;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        int i = this.f25178OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final void mo13705zzb(Object obj) {
        switch (this.f25178OooOo0O) {
            case 0:
                ((i30) obj).f19930Oooo00o = true;
                this.f25177OooOo.f25503OooOoO0.OooO0O0(this.f25179OooOo0o);
                break;
            default:
                ((i30) obj).f19927Oooo0 = true;
                this.f25177OooOo.f25503OooOoO0.OooO0O0(this.f25179OooOo0o);
                break;
        }
    }

    private final void OooO00o(Throwable th) {
    }

    private final void OooO0O0(Throwable th) {
    }
}

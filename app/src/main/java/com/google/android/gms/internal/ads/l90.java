package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class l90 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20829OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f20830OooO0O0;

    public /* synthetic */ l90(boolean z, int i) {
        this.f20829OooO00o = i;
        this.f20830OooO0O0 = z;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f20829OooO00o) {
            case 2:
                ((C1581fu) obj).f19126OooO0O0.putBoolean("is_gbid", this.f20830OooO0O0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        switch (this.f20829OooO00o) {
            case 0:
                ((C1581fu) obj).f19125OooO00o.putString("adid_p", true != this.f20830OooO0O0 ? "0" : "1");
                break;
            case 1:
                ((C1581fu) obj).f19125OooO00o.putBoolean("ibrr", this.f20830OooO0O0);
                break;
            case 2:
                ((C1581fu) obj).f19125OooO00o.putBoolean("is_gbid", this.f20830OooO0O0);
                break;
            default:
                C1581fu c1581fu = (C1581fu) obj;
                if (this.f20830OooO0O0) {
                    c1581fu.f19125OooO00o.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }

    private final /* synthetic */ void OooO0OO(Object obj) {
    }
}

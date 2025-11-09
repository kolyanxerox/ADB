package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qo */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1981qo implements InterfaceC1466cp {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23668OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1776l4 f23669OooOo0o;

    public /* synthetic */ C1981qo(C1776l4 c1776l4, int i) {
        this.f23668OooOo0O = i;
        this.f23669OooOo0o = c1776l4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1466cp
    public final void zza(boolean z, int i, String str, String str2) {
        switch (this.f23668OooOo0O) {
            case 0:
                this.f23669OooOo0o.OooO0O0();
                break;
            default:
                C1776l4 c1776l4 = this.f23669OooOo0o;
                if (!z) {
                    c1776l4.zzd(new z70(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
                    break;
                } else {
                    c1776l4.OooO0O0();
                    break;
                }
        }
    }
}

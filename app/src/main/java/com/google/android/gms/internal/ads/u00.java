package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class u00 implements vp0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2042sb f24544OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24545OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f24546OooOo0o;

    public /* synthetic */ u00(String str, InterfaceC2042sb interfaceC2042sb, int i) {
        this.f24545OooOo0O = i;
        this.f24546OooOo0o = str;
        this.f24544OooOo = interfaceC2042sb;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        int i = this.f24545OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo13705zzb(Object obj) {
        switch (this.f24545OooOo0O) {
            case 0:
                ((InterfaceC1722jo) obj).Oooo0OO(this.f24546OooOo0o, this.f24544OooOo);
                break;
            default:
                ((InterfaceC1722jo) obj).OooOoo(this.f24546OooOo0o, this.f24544OooOo);
                break;
        }
    }

    private final void OooO00o(Throwable th) {
    }

    private final void OooO0O0(Throwable th) {
    }
}

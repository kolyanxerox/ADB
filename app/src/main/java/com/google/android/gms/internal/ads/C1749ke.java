package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.ke */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1749ke implements InterfaceC1427bm, vp0 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ C2274yl f20558OooOo0O;

    public /* synthetic */ C1749ke(C2274yl c2274yl) {
        this.f20558OooOo0O = c2274yl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427bm
    /* renamed from: zza */
    public void mo13708zza(Object obj) {
        this.f20558OooOo0O.zzc((InterfaceC2266yd) obj);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
        C2274yl c2274yl = this.f20558OooOo0O;
        if (interfaceC1722jo == null) {
            c2274yl.zzd(new z70(1, "Missing webview from video view future."));
        } else {
            interfaceC1722jo.Oooo0OO("/video", new C1709jb(new og0(c2274yl, 4), 6));
            interfaceC1722jo.zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        zzo.zzg("Failed to load media data due to video view load failure.");
        this.f20558OooOo0O.zzd(th);
    }
}

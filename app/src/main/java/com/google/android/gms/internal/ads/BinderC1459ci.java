package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ci */
/* loaded from: classes2.dex */
public final class BinderC1459ci extends AbstractBinderC2233xh {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18000OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List f18001OooOo0o;

    public /* synthetic */ BinderC1459ci(List list, int i) {
        this.f18000OooOo0O = i;
        this.f18001OooOo0o = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2270yh
    public final void Oooo000(List list) {
        switch (this.f18000OooOo0O) {
            case 0:
                zzo.zzi("Recorded impression urls: ".concat(this.f18001OooOo0o.toString()));
                break;
            default:
                zzo.zzi("Recorded click: ".concat(this.f18001OooOo0o.toString()));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2270yh
    public final void zze(String str) {
        switch (this.f18000OooOo0O) {
            case 0:
                zzo.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
                break;
            default:
                zzo.zzg("Error recording click: ".concat(String.valueOf(str)));
                break;
        }
    }
}

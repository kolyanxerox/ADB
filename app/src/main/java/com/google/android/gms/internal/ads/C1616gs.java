package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzm;

/* renamed from: com.google.android.gms.internal.ads.gs */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1616gs implements InterfaceC2321zv {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19449OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f19450OooOo0o;

    public /* synthetic */ C1616gs(Object obj, int i) {
        this.f19449OooOo0O = i;
        this.f19450OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2321zv
    public final void zza() {
        zzm zzmVarZzL;
        switch (this.f19449OooOo0O) {
            case 0:
                ((C2099tv) this.f19450OooOo0o).zza();
                break;
            default:
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f19450OooOo0o;
                if (interfaceC1722jo != null && (zzmVarZzL = interfaceC1722jo.zzL()) != null) {
                    zzmVarZzL.zzb();
                    break;
                }
                break;
        }
    }
}

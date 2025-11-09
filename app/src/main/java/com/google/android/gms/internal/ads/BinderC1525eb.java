package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzf;

/* renamed from: com.google.android.gms.internal.ads.eb */
/* loaded from: classes2.dex */
public final class BinderC1525eb extends AbstractBinderC1672ia {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ de0 f18545OooOo0O;

    public /* synthetic */ BinderC1525eb(de0 de0Var) {
        this.f18545OooOo0O = de0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1708ja
    public final void o0000OOO(InterfaceC1415ba interfaceC1415ba, String str) {
        C1451ca c1451ca;
        de0 de0Var = this.f18545OooOo0O;
        zzf zzfVar = (zzf) de0Var.f18240OooOo;
        if (zzfVar == null) {
            return;
        }
        synchronized (de0Var) {
            c1451ca = (C1451ca) de0Var.f18243OooOoO0;
            if (c1451ca == null) {
                c1451ca = new C1451ca(interfaceC1415ba);
                de0Var.f18243OooOoO0 = c1451ca;
            }
        }
        zzfVar.zzb(c1451ca, str);
    }
}

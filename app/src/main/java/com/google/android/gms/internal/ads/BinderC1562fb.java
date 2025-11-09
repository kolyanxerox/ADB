package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzg;

/* renamed from: com.google.android.gms.internal.ads.fb */
/* loaded from: classes2.dex */
public final class BinderC1562fb extends AbstractBinderC1782la {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ de0 f18911OooOo0O;

    public /* synthetic */ BinderC1562fb(de0 de0Var) {
        this.f18911OooOo0O = de0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1819ma
    public final void o000oOoO(InterfaceC1415ba interfaceC1415ba) {
        C1451ca c1451ca;
        de0 de0Var = this.f18911OooOo0O;
        zzg zzgVar = (zzg) de0Var.f18242OooOo0o;
        synchronized (de0Var) {
            c1451ca = (C1451ca) de0Var.f18243OooOoO0;
            if (c1451ca == null) {
                c1451ca = new C1451ca(interfaceC1415ba);
                de0Var.f18243OooOoO0 = c1451ca;
            }
        }
        zzgVar.zzc(c1451ca);
    }
}

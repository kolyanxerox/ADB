package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzga;

/* loaded from: classes2.dex */
public final /* synthetic */ class f00 implements InterfaceC1466cp {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1722jo f18742OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18743OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ j00 f18744OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C1776l4 f18745OooOoO0;

    public /* synthetic */ f00(j00 j00Var, InterfaceC1722jo interfaceC1722jo, C1776l4 c1776l4, int i) {
        this.f18743OooOo0O = i;
        this.f18744OooOo0o = j00Var;
        this.f18742OooOo = interfaceC1722jo;
        this.f18745OooOoO0 = c1776l4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1466cp
    public final void zza(boolean z, int i, String str, String str2) {
        switch (this.f18743OooOo0O) {
            case 0:
                j00 j00Var = this.f18744OooOo0o;
                j00Var.getClass();
                boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17910o00Oo)).booleanValue();
                C1776l4 c1776l4 = this.f18745OooOoO0;
                vd0 vd0Var = j00Var.f20138OooO00o;
                InterfaceC1722jo interfaceC1722jo = this.f18742OooOo;
                if (!zBooleanValue) {
                    zzga zzgaVar = vd0Var.f24951OooO00o;
                    if (zzgaVar != null && interfaceC1722jo.zzq() != null) {
                        interfaceC1722jo.zzq().o000O0o0(zzgaVar);
                    }
                    c1776l4.OooO0O0();
                    break;
                } else if (!z) {
                    c1776l4.zzd(new z70(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
                    break;
                } else {
                    zzga zzgaVar2 = vd0Var.f24951OooO00o;
                    if (zzgaVar2 != null && interfaceC1722jo.zzq() != null) {
                        interfaceC1722jo.zzq().o000O0o0(zzgaVar2);
                    }
                    c1776l4.OooO0O0();
                    break;
                }
                break;
            default:
                C1776l4 c1776l42 = this.f18745OooOoO0;
                j00 j00Var2 = this.f18744OooOo0o;
                if (!z) {
                    j00Var2.getClass();
                    c1776l42.zzd(new z70(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
                    break;
                } else {
                    zzga zzgaVar3 = j00Var2.f20138OooO00o.f24951OooO00o;
                    if (zzgaVar3 != null) {
                        InterfaceC1722jo interfaceC1722jo2 = this.f18742OooOo;
                        if (interfaceC1722jo2.zzq() != null) {
                            interfaceC1722jo2.zzq().o000O0o0(zzgaVar3);
                        }
                    }
                    c1776l42.OooO0O0();
                    break;
                }
        }
    }
}

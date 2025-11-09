package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.zzb;

/* loaded from: classes2.dex */
public final /* synthetic */ class a00 implements lp0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f16861OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ zzs f16862OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ kd0 f16863OooO0OO;

    /* renamed from: OooO0Oo */
    public final /* synthetic */ md0 f16864OooO0Oo;

    /* renamed from: OooO0o */
    public final /* synthetic */ String f16865OooO0o;

    /* renamed from: OooO0o0 */
    public final /* synthetic */ String f16866OooO0o0;

    /* renamed from: OooO0oO */
    public final /* synthetic */ Object f16867OooO0oO;

    public /* synthetic */ a00(Object obj, zzs zzsVar, kd0 kd0Var, md0 md0Var, String str, String str2, int i) {
        this.f16861OooO00o = i;
        this.f16867OooO0oO = obj;
        this.f16862OooO0O0 = zzsVar;
        this.f16863OooO0OO = kd0Var;
        this.f16864OooO0Oo = md0Var;
        this.f16866OooO0o0 = str;
        this.f16865OooO0o = str2;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final o00000oO.OooOOO zza(Object obj) {
        switch (this.f16861OooO00o) {
            case 0:
                b00 b00Var = (b00) this.f16867OooO0oO;
                zzs zzsVar = this.f16862OooO0O0;
                kd0 kd0Var = this.f16863OooO0OO;
                md0 md0Var = this.f16864OooO0Oo;
                String str = this.f16866OooO0o0;
                String str2 = this.f16865OooO0o;
                InterfaceC1722jo interfaceC1722joOooO00o = b00Var.f17152OooOO0.OooO00o(zzsVar, kd0Var, md0Var);
                C1776l4 c1776l4 = new C1776l4(interfaceC1722joOooO00o);
                a10 a10Var = b00Var.OooOO0o.f17646OooO00o;
                interfaceC1722joOooO00o.zzN().OooOOO(a10Var, a10Var, a10Var, a10Var, a10Var, false, null, new zzb(b00Var.f17144OooO00o, null, null), null, null, b00Var.f17156OooOOOO, b00Var.f17154OooOOO, b00Var.f17155OooOOO0, null, a10Var, null, null, null, null);
                interfaceC1722joOooO00o.Oooo0OO("/getNativeAdViewSignals", AbstractC2005rb.f23833OooOOoo);
                interfaceC1722joOooO00o.Oooo0OO("/getNativeClickMeta", AbstractC2005rb.f23835OooOo00);
                AbstractC1870no abstractC1870noZzN = interfaceC1722joOooO00o.zzN();
                synchronized (abstractC1870noZzN.f21530OooOoO0) {
                    abstractC1870noZzN.f21545Oooo0oO = true;
                }
                interfaceC1722joOooO00o.zzN().f21533OooOoo0 = new C1981qo(c1776l4, 1);
                interfaceC1722joOooO00o.OooOoo0(str, str2);
                return c1776l4;
            default:
                j00 j00Var = (j00) this.f16867OooO0oO;
                InterfaceC1722jo interfaceC1722joOooO00o2 = j00Var.f20140OooO0OO.OooO00o(this.f16862OooO0O0, this.f16863OooO0OO, this.f16864OooO0Oo);
                C1776l4 c1776l42 = new C1776l4(interfaceC1722joOooO00o2);
                if (j00Var.f20138OooO00o.f24952OooO0O0 != null) {
                    j00Var.OooO00o(interfaceC1722joOooO00o2);
                    interfaceC1722joOooO00o2.o0OoOo0(new Oooo0oO.o0O0O00(5, 0, 0));
                } else {
                    a10 a10Var2 = j00Var.f20141OooO0Oo.f17646OooO00o;
                    interfaceC1722joOooO00o2.zzN().OooOOO(a10Var2, a10Var2, a10Var2, a10Var2, a10Var2, false, null, new zzb(j00Var.f20143OooO0o0, null, null), null, null, j00Var.f20145OooO0oo, j00Var.f20144OooO0oO, j00Var.f20142OooO0o, null, a10Var2, null, null, null, null);
                    j00.OooO0O0(interfaceC1722joOooO00o2);
                }
                interfaceC1722joOooO00o2.zzN().f21533OooOoo0 = new f00(j00Var, interfaceC1722joOooO00o2, c1776l42, 1);
                interfaceC1722joOooO00o2.OooOoo0(this.f16866OooO0o0, this.f16865OooO0o);
                return c1776l42;
        }
    }
}

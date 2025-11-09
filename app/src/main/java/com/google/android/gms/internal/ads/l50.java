package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzj;

/* loaded from: classes2.dex */
public final class l50 implements InterfaceC1656hv, InterfaceC2135uu {

    /* renamed from: OooOo */
    public static final Object f20803OooOo = new Object();

    /* renamed from: OooOoO0 */
    public static int f20804OooOoO0;

    /* renamed from: OooOo0O */
    public final zzj f20805OooOo0O;

    /* renamed from: OooOo0o */
    public final o50 f20806OooOo0o;

    public l50(o50 o50Var, zzj zzjVar) {
        this.f20806OooOo0o = o50Var;
        this.f20805OooOo0O = zzjVar;
    }

    public final void OooO00o(boolean z) {
        int i;
        int iIntValue;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue() && !this.f20805OooOo0O.zzN()) {
            Object obj = f20803OooOo;
            synchronized (obj) {
                i = f20804OooOoO0;
                iIntValue = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooo00)).intValue();
            }
            if (i < iIntValue) {
                o50 o50Var = this.f20806OooOo0o;
                df0 df0VarOooO00o = o50Var.f22338OooO0Oo.OooO00o(new Bundle());
                df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, new OooO0oO.Oooo000(o50Var, z)), AbstractC2200wl.f25327OooO0oO);
                synchronized (obj) {
                    f20804OooOoO0++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        OooO00o(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        OooO00o(false);
    }
}

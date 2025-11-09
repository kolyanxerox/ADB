package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zd0 {

    /* renamed from: OooO00o */
    public final kd0 f26149OooO00o;

    /* renamed from: OooO0O0 */
    public final md0 f26150OooO0O0;

    /* renamed from: OooO0OO */
    public final hg0 f26151OooO0OO;

    /* renamed from: OooO0Oo */
    public final eg0 f26152OooO0Oo;

    /* renamed from: OooO0o */
    public final C1468cr f26153OooO0o;

    /* renamed from: OooO0o0 */
    public final mf0 f26154OooO0o0;

    public zd0(hg0 hg0Var, eg0 eg0Var, kd0 kd0Var, md0 md0Var, C1468cr c1468cr, mf0 mf0Var) {
        this.f26149OooO00o = kd0Var;
        this.f26150OooO0O0 = md0Var;
        this.f26151OooO0OO = hg0Var;
        this.f26152OooO0Oo = eg0Var;
        this.f26153OooO0o = c1468cr;
        this.f26154OooO0o0 = mf0Var;
    }

    public final void OooO00o(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            kd0 kd0Var = this.f26149OooO00o;
            if (kd0Var.f20543OoooooO) {
                String str2 = this.f26150OooO0O0.f21205OooO0O0;
                eg0 eg0Var = this.f26152OooO0Oo;
                eg0Var.getClass();
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                O0O0 o0o0 = new O0O0(System.currentTimeMillis(), str2, str, 2);
                s50 s50Var = eg0Var.f18606OooO00o;
                s50Var.getClass();
                s50Var.OooO0O0(new C1548ey(12, s50Var, o0o0));
            } else {
                this.f26151OooO0OO.OooO0O0(str, kd0Var.f20552o0OOO0o, this.f26154OooO0o0);
            }
        }
    }

    public final void OooO0O0(int i, ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            o00000oO.OooOOO oooOOOOooO00o = (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOooOo)).booleanValue() && C1468cr.OooO0O0(str)) ? this.f26153OooO0o.OooO00o(str, zzbc.zze()) : ii0.OooooOO(str);
            oooOOOOooO00o.addListener(new wp0(0, oooOOOOooO00o, new OooO0oO.Oooo0(this, i, 6)), AbstractC2200wl.f25321OooO00o);
        }
    }
}

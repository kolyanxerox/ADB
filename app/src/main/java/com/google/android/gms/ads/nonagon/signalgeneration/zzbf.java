package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.C2248xw;
import com.google.android.gms.internal.ads.InterfaceC1584fx;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.q31;
import com.google.android.gms.internal.ads.z31;

/* loaded from: classes2.dex */
public final class zzbf implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final z31 f16560OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final z31 f16561OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final z31 f16562OooO0OO;

    public zzbf(z31 z31Var, z31 z31Var2, z31 z31Var3, z31 z31Var4) {
        this.f16560OooO00o = z31Var;
        this.f16561OooO0O0 = z31Var2;
        this.f16562OooO0OO = z31Var4;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        InterfaceC1584fx interfaceC1584fx = (zzw) this.f16560OooO00o.zzb();
        InterfaceC1584fx interfaceC1584fx2 = (zzbm) this.f16561OooO0O0.zzb();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        if (((Integer) this.f16562OooO0OO.zzb()).intValue() == 2) {
            interfaceC1584fx = interfaceC1584fx2;
        }
        return new C2248xw(interfaceC1584fx, c2163vl);
    }
}

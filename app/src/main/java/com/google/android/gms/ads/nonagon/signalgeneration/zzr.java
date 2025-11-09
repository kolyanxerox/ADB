package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1834mp;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.k20;
import com.google.android.gms.internal.ads.q31;
import com.google.android.gms.internal.ads.z31;

/* loaded from: classes2.dex */
public final class zzr implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final z31 f16623OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final z31 f16624OooO0O0;

    public zzr(z31 z31Var, z31 z31Var2, z31 z31Var3) {
        this.f16623OooO00o = z31Var;
        this.f16624OooO0O0 = z31Var2;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        Context contextOooO00o = ((C1834mp) this.f16623OooO00o).OooO00o();
        k20 k20Var = (k20) this.f16624OooO0O0.zzb();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new zzo(contextOooO00o, k20Var, c2163vl);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class i70 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f19972OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final p31 f19973OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r31 f19974OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1982qp f19975OooO0Oo;

    public i70(p31 p31Var, C1982qp c1982qp, r31 r31Var) {
        this.f19973OooO0O0 = p31Var;
        this.f19975OooO0Oo = c1982qp;
        this.f19974OooO0OO = r31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f19972OooO00o) {
            case 0:
                Context context = (Context) this.f19973OooO0O0.zzb();
                VersionInfoParcel versionInfoParcelOooO00o = this.f19975OooO0Oo.OooO00o();
                AbstractC1990qx abstractC1990qx = (AbstractC1990qx) this.f19974OooO0OO.f23738OooO00o;
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new a70(context, versionInfoParcelOooO00o, abstractC1990qx, c2163vl);
            default:
                return new a70((Context) this.f19973OooO0O0.zzb(), (AbstractC2323zx) this.f19974OooO0OO.f23738OooO00o, this.f19975OooO0Oo.OooO00o());
        }
    }

    public i70(p31 p31Var, r31 r31Var, C1982qp c1982qp) {
        this.f19973OooO0O0 = p31Var;
        this.f19974OooO0OO = r31Var;
        this.f19975OooO0Oo = c1982qp;
    }
}

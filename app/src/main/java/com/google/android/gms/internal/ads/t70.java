package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class t70 extends s70 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2130up f24261OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1765ku f24262OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1804lw f24263OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final x70 f24264OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o60 f24265OooO0o0;

    public t70(C2130up c2130up, C1765ku c1765ku, C1804lw c1804lw, x70 x70Var, o60 o60Var) {
        this.f24261OooO00o = c2130up;
        this.f24262OooO0O0 = c1765ku;
        this.f24263OooO0OO = c1804lw;
        this.f24264OooO0Oo = x70Var;
        this.f24265OooO0o0 = o60Var;
    }

    @Override // com.google.android.gms.internal.ads.s70
    public final df0 OooO0OO(vd0 vd0Var, Bundle bundle, kd0 kd0Var, rd0 rd0Var) {
        C1765ku c1765ku = this.f24262OooO0O0;
        c1765ku.f20684OooO0OO = vd0Var;
        c1765ku.f20685OooO0Oo = bundle;
        c1765ku.f20686OooO0o = new de0(rd0Var, kd0Var, this.f24264OooO0Oo, false, 16);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17905o00OOOo0)).booleanValue()) {
            c1765ku.f20688OooO0oO = this.f24265OooO0o0;
        }
        C2130up c2130up = this.f24261OooO00o.f24676OooO0O0;
        C1802lu c1802lu = new C1802lu(c1765ku);
        C1804lw c1804lw = this.f24263OooO0OO;
        ii0.Oooo0oO(C1804lw.class, c1804lw);
        C1875nt c1875ntZzb = new C2241xp(c2130up, new C1658hx(4, (byte) 0), c1804lw, c1802lu, new sj0(23, false), null, null).zzb();
        return c1875ntZzb.OooO00o(c1875ntZzb.OooO0O0());
    }
}

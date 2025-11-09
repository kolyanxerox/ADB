package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class u70 extends s70 {

    /* renamed from: OooO, reason: collision with root package name */
    public final x70 f24576OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2130up f24577OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1765ku f24578OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p80 f24579OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1804lw f24580OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final C2099tv f24581OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C2249xx f24582OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final FrameLayout f24583OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final C1509dw f24584OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final o60 f24585OooOO0;

    public u70(C2130up c2130up, C1765ku c1765ku, p80 p80Var, C1804lw c1804lw, C2249xx c2249xx, C2099tv c2099tv, FrameLayout frameLayout, C1509dw c1509dw, x70 x70Var, o60 o60Var) {
        this.f24577OooO00o = c2130up;
        this.f24578OooO0O0 = c1765ku;
        this.f24579OooO0OO = p80Var;
        this.f24580OooO0Oo = c1804lw;
        this.f24582OooO0o0 = c2249xx;
        this.f24581OooO0o = c2099tv;
        this.f24583OooO0oO = frameLayout;
        this.f24584OooO0oo = c1509dw;
        this.f24576OooO = x70Var;
        this.f24585OooOO0 = o60Var;
    }

    @Override // com.google.android.gms.internal.ads.s70
    public final df0 OooO0OO(vd0 vd0Var, Bundle bundle, kd0 kd0Var, rd0 rd0Var) {
        C1765ku c1765ku = this.f24578OooO0O0;
        c1765ku.f20684OooO0OO = vd0Var;
        c1765ku.f20685OooO0Oo = bundle;
        c1765ku.f20686OooO0o = new de0(rd0Var, kd0Var, this.f24576OooO, false, 16);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17905o00OOOo0)).booleanValue()) {
            c1765ku.f20688OooO0oO = this.f24585OooOO0;
        }
        C2130up c2130up = this.f24577OooO00o.f24676OooO0O0;
        C1802lu c1802lu = new C1802lu(c1765ku);
        C2249xx c2249xx = new C2249xx(28, this.f24581OooO0o, this.f24584OooO0oo);
        wj0 wj0Var = new wj0(this.f24583OooO0oO, 13);
        C1804lw c1804lw = this.f24580OooO0Oo;
        ii0.Oooo0oO(C1804lw.class, c1804lw);
        p80 p80Var = this.f24579OooO0OO;
        ii0.Oooo0oO(p80.class, p80Var);
        sj0 sj0Var = new sj0(23, false);
        C2249xx c2249xx2 = this.f24582OooO0o0;
        ii0.Oooo0oO(C2249xx.class, c2249xx2);
        C1875nt c1875nt = (C1875nt) new C2315zp(c2130up, wj0Var, c2249xx2, new C1658hx(4, (byte) 0), c1804lw, c1802lu, sj0Var, p80Var, c2249xx, null, null).f26303o00000O0.zzb();
        return c1875nt.OooO00o(c1875nt.OooO0O0());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class r60 implements i60 {

    /* renamed from: OooO, reason: collision with root package name */
    public final f20 f23773OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC2243xr f23774OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final n10 f23775OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final vd0 f23776OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f23777OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final C2116ub f23778OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final VersionInfoParcel f23779OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f23780OooO0oO = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0)).booleanValue();

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final x50 f23781OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final h20 f23782OooOO0;

    public r60(AbstractC2243xr abstractC2243xr, Context context, Executor executor, n10 n10Var, vd0 vd0Var, VersionInfoParcel versionInfoParcel, C2116ub c2116ub, x50 x50Var, f20 f20Var, h20 h20Var) {
        this.f23774OooO00o = abstractC2243xr;
        this.f23777OooO0Oo = executor;
        this.f23775OooO0O0 = n10Var;
        this.f23776OooO0OO = vd0Var;
        this.f23779OooO0o0 = versionInfoParcel;
        this.f23778OooO0o = c2116ub;
        this.f23781OooO0oo = x50Var;
        this.f23773OooO = f20Var;
        this.f23782OooOO0 = h20Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) {
        od0 od0Var = kd0Var.f20503OooOOoo;
        return (od0Var == null || od0Var.f22973OooO00o == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) {
        C1658hx c1658hx = new C1658hx(3, (byte) 0);
        yp0 yp0Var = yp0.f25991OooOo0o;
        C1617gt c1617gt = new C1617gt(this, kd0Var, rd0Var, c1658hx, 2);
        Executor executor = this.f23777OooO0Oo;
        dp0 dp0VarOoOO = ii0.ooOO(yp0Var, c1617gt, executor);
        dp0VarOoOO.addListener(new RunnableC2105u0(c1658hx, 3), executor);
        return dp0VarOoOO;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class g70 implements i60 {

    /* renamed from: OooO, reason: collision with root package name */
    public final x50 f19247OooO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f19249OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final n10 f19250OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final vd0 f19251OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final VersionInfoParcel f19252OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f19253OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final C2116ub f19254OooO0oO;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final f20 f19256OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final h20 f19257OooOO0O;
    public final Object OooOO0o;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f19248OooO00o = 1;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f19255OooO0oo = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0)).booleanValue();

    public g70(Context context, VersionInfoParcel versionInfoParcel, vd0 vd0Var, Executor executor, AbstractC1990qx abstractC1990qx, n10 n10Var, C2116ub c2116ub, x50 x50Var, f20 f20Var, h20 h20Var) {
        this.f19249OooO0O0 = context;
        this.f19251OooO0Oo = vd0Var;
        this.OooOO0o = abstractC1990qx;
        this.f19253OooO0o0 = executor;
        this.f19252OooO0o = versionInfoParcel;
        this.f19250OooO0OO = n10Var;
        this.f19254OooO0oO = c2116ub;
        this.f19247OooO = x50Var;
        this.f19256OooOO0 = f20Var;
        this.f19257OooOO0O = h20Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) {
        switch (this.f19248OooO00o) {
            case 0:
                od0 od0Var = kd0Var.f20503OooOOoo;
                if (od0Var == null || od0Var.f22973OooO00o == null) {
                }
                break;
            default:
                od0 od0Var2 = kd0Var.f20503OooOOoo;
                if (od0Var2 == null || od0Var2.f22973OooO00o == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) {
        switch (this.f19248OooO00o) {
            case 0:
                C1658hx c1658hx = new C1658hx(3, (byte) 0);
                yp0 yp0Var = yp0.f25991OooOo0o;
                C1617gt c1617gt = new C1617gt(this, kd0Var, rd0Var, c1658hx, 6);
                Executor executor = this.f19253OooO0o0;
                dp0 dp0VarOoOO = ii0.ooOO(yp0Var, c1617gt, executor);
                dp0VarOoOO.addListener(new RunnableC2105u0(c1658hx, 4), executor);
                return dp0VarOoOO;
            default:
                C1658hx c1658hx2 = new C1658hx(3, (byte) 0);
                yp0 yp0Var2 = yp0.f25991OooOo0o;
                C1617gt c1617gt2 = new C1617gt(this, kd0Var, rd0Var, c1658hx2, 8);
                Executor executor2 = this.f19253OooO0o0;
                dp0 dp0VarOoOO2 = ii0.ooOO(yp0Var2, c1617gt2, executor2);
                dp0VarOoOO2.addListener(new RunnableC2105u0(c1658hx2, 5), executor2);
                return dp0VarOoOO2;
        }
    }

    public g70(Context context, VersionInfoParcel versionInfoParcel, vd0 vd0Var, Executor executor, i10 i10Var, n10 n10Var, C2116ub c2116ub, x50 x50Var, f20 f20Var, h20 h20Var) {
        this.f19249OooO0O0 = context;
        this.f19251OooO0Oo = vd0Var;
        this.OooOO0o = i10Var;
        this.f19253OooO0o0 = executor;
        this.f19252OooO0o = versionInfoParcel;
        this.f19250OooO0OO = n10Var;
        this.f19254OooO0oO = c2116ub;
        this.f19247OooO = x50Var;
        this.f19256OooOO0 = f20Var;
        this.f19257OooOO0O = h20Var;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class s60 implements q31 {

    /* renamed from: OooO, reason: collision with root package name */
    public final p31 f24010OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24011OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final p31 f24012OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1982qp f24013OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1876nu f24014OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final r31 f24015OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final p31 f24016OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final p31 f24017OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final p31 f24018OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final p31 f24019OooOO0;

    public /* synthetic */ s60(p31 p31Var, C1982qp c1982qp, C1876nu c1876nu, p31 p31Var2, r31 r31Var, p31 p31Var3, p31 p31Var4, p31 p31Var5, p31 p31Var6, int i) {
        this.f24011OooO00o = i;
        this.f24012OooO0O0 = p31Var;
        this.f24013OooO0OO = c1982qp;
        this.f24014OooO0Oo = c1876nu;
        this.f24016OooO0o0 = p31Var2;
        this.f24015OooO0o = r31Var;
        this.f24017OooO0oO = p31Var3;
        this.f24018OooO0oo = p31Var4;
        this.f24010OooO = p31Var5;
        this.f24019OooOO0 = p31Var6;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f24011OooO00o) {
            case 0:
                return new r60((AbstractC2243xr) this.f24015OooO0o.f23738OooO00o, (Context) this.f24012OooO0O0.zzb(), (Executor) this.f24016OooO0o0.zzb(), (n10) this.f24017OooO0oO.zzb(), this.f24014OooO0Oo.OooO00o(), this.f24013OooO0OO.OooO00o(), new C2116ub(), (x50) this.f24018OooO0oo.zzb(), (f20) this.f24010OooO.zzb(), (h20) this.f24019OooOO0.zzb());
            case 1:
                return new g70((Context) this.f24012OooO0O0.zzb(), this.f24013OooO0OO.OooO00o(), this.f24014OooO0Oo.OooO00o(), (Executor) this.f24016OooO0o0.zzb(), (AbstractC1990qx) this.f24015OooO0o.f23738OooO00o, (n10) this.f24017OooO0oO.zzb(), new C2116ub(), (x50) this.f24018OooO0oo.zzb(), (f20) this.f24010OooO.zzb(), (h20) this.f24019OooOO0.zzb());
            default:
                return new g70((Context) this.f24012OooO0O0.zzb(), this.f24013OooO0OO.OooO00o(), this.f24014OooO0Oo.OooO00o(), (Executor) this.f24016OooO0o0.zzb(), (i10) this.f24015OooO0o.f23738OooO00o, (n10) this.f24017OooO0oO.zzb(), new C2116ub(), (x50) this.f24018OooO0oo.zzb(), (f20) this.f24010OooO.zzb(), (h20) this.f24019OooOO0.zzb());
        }
    }

    public s60(r31 r31Var, p31 p31Var, p31 p31Var2, p31 p31Var3, C1876nu c1876nu, C1982qp c1982qp, p31 p31Var4, p31 p31Var5, p31 p31Var6) {
        this.f24011OooO00o = 0;
        this.f24015OooO0o = r31Var;
        this.f24012OooO0O0 = p31Var;
        this.f24016OooO0o0 = p31Var2;
        this.f24017OooO0oO = p31Var3;
        this.f24014OooO0Oo = c1876nu;
        this.f24013OooO0OO = c1982qp;
        this.f24018OooO0oo = p31Var4;
        this.f24010OooO = p31Var5;
        this.f24019OooOO0 = p31Var6;
    }
}

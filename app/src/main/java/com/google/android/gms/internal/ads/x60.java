package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class x60 implements i60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC1837ms f25529OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f25530OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final n10 f25531OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final vd0 f25532OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final wk0 f25533OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f25534OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final f20 f25535OooO0oO;

    public x60(AbstractC1837ms abstractC1837ms, Context context, Executor executor, n10 n10Var, vd0 vd0Var, wk0 wk0Var, f20 f20Var) {
        this.f25530OooO0O0 = context;
        this.f25529OooO00o = abstractC1837ms;
        this.f25534OooO0o0 = executor;
        this.f25531OooO0OO = n10Var;
        this.f25532OooO0Oo = vd0Var;
        this.f25533OooO0o = wk0Var;
        this.f25535OooO0oO = f20Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) {
        od0 od0Var = kd0Var.f20503OooOOoo;
        return (od0Var == null || od0Var.f22973OooO00o == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) {
        return ii0.ooOO(yp0.f25991OooOo0o, new C1617gt(this, rd0Var, kd0Var, 3), this.f25534OooO0o0);
    }
}

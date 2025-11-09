package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nx */
/* loaded from: classes2.dex */
public final class C1879nx implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21612OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C2249xx f21613OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f21614OooO0OO;

    public /* synthetic */ C1879nx(C2249xx c2249xx, p31 p31Var, int i) {
        this.f21612OooO00o = i;
        this.f21613OooO0O0 = c2249xx;
        this.f21614OooO0OO = p31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f21612OooO00o) {
            case 0:
                Set setOooOO0O = this.f21613OooO0O0.OooOO0O((C1435bu) this.f21614OooO0OO.zzb());
                ii0.Oooo000(setOooOO0O);
                return setOooOO0O;
            default:
                return new C2248xw(new C1616gs((InterfaceC1722jo) this.f21613OooO0O0.f25813OooOo, 1), (Executor) this.f21614OooO0OO.zzb());
        }
    }
}

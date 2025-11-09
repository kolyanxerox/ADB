package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.u7 */
/* loaded from: classes2.dex */
public final class C2112u7 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24572OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1834mp f24573OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f24574OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f24575OooO0Oo;

    public /* synthetic */ C2112u7(C1834mp c1834mp, p31 p31Var, p31 p31Var2, int i) {
        this.f24572OooO00o = i;
        this.f24573OooO0O0 = c1834mp;
        this.f24574OooO0OO = p31Var;
        this.f24575OooO0Oo = p31Var2;
    }

    public t90 OooO00o() {
        return new t90((ApplicationInfo) this.f24574OooO0OO.zzb(), (PackageInfo) this.f24575OooO0Oo.zzb(), this.f24573OooO0O0.OooO00o(), 2);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f24572OooO00o) {
            case 0:
                this.f24573OooO0O0.OooO00o();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f24574OooO0OO.zzb();
                return new C2075t7(scheduledExecutorService);
            case 1:
                Context contextOooO00o = this.f24573OooO0O0.OooO00o();
                C1978ql c1978ql = (C1978ql) this.f24574OooO0OO.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f24575OooO0Oo.zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new ca0(contextOooO00o, c1978ql, scheduledExecutorService2, c2163vl);
            default:
                return OooO00o();
        }
    }

    public C2112u7(p31 p31Var, p31 p31Var2, C1834mp c1834mp) {
        this.f24572OooO00o = 2;
        this.f24574OooO0OO = p31Var;
        this.f24575OooO0Oo = p31Var2;
        this.f24573OooO0O0 = c1834mp;
    }
}

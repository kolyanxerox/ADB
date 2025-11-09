package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class bc0 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C1978ql f17473OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f17474OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f17475OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ScheduledExecutorService f17476OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final C2163vl f17477OooO0o0;

    public bc0(C1978ql c1978ql, boolean z, boolean z2, C2163vl c2163vl, ScheduledExecutorService scheduledExecutorService) {
        this.f17473OooO00o = c1978ql;
        this.f17474OooO0O0 = z;
        this.f17475OooO0OO = z2;
        this.f17477OooO0o0 = c2163vl;
        this.f17476OooO0Oo = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        String str = null;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0O0O)).booleanValue() && this.f17475OooO0OO) {
            return ii0.OooooOO(new r90(str, 5));
        }
        if (!this.f17474OooO0O0) {
            return ii0.OooooOO(new r90(str, 5));
        }
        yp0 yp0Var = yp0.f25991OooOo0o;
        o0O0o00O o0o0o00o = new o0O0o00O(14);
        C2163vl c2163vl = this.f17477OooO0o0;
        return ii0.OoooOOO(ii0.o00Oo0(ii0.Ooooooo(yp0Var, o0o0o00o, c2163vl), ((Long) AbstractC2076t8.f24268OooO0O0.OooOOO()).longValue(), TimeUnit.MILLISECONDS, this.f17476OooO0Oo), Exception.class, new C2123ui(this, 6), c2163vl);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ca0 implements kb0 {

    /* renamed from: OooO00o */
    public final C1978ql f17978OooO00o;

    /* renamed from: OooO0O0 */
    public final AppSetIdClient f17979OooO0O0;

    /* renamed from: OooO0OO */
    public final ScheduledExecutorService f17980OooO0OO;

    /* renamed from: OooO0Oo */
    public final C2163vl f17981OooO0Oo;

    /* renamed from: OooO0o0 */
    public final Context f17982OooO0o0;

    public ca0(Context context, C1978ql c1978ql, ScheduledExecutorService scheduledExecutorService, C2163vl c2163vl) {
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17880o00O0o0O)).booleanValue()) {
            this.f17979OooO0O0 = AppSet.getClient(context);
        }
        this.f17982OooO0o0 = context;
        this.f17978OooO00o = c1978ql;
        this.f17980OooO0OO = scheduledExecutorService;
        this.f17981OooO0Oo = c2163vl;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00O0Ooo)).booleanValue()) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17881o00O0o0o)).booleanValue()) {
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17879o00O0o00)).booleanValue()) {
                    return ii0.Ooooooo(ii0.OooO0o(this.f17979OooO0O0.getAppSetIdInfo()), new o0O0o00O(11), AbstractC2200wl.f25327OooO0oO);
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17880o00O0o0O)).booleanValue()) {
                    AbstractC1641hg.OooO0o(this.f17982OooO0o0, false);
                    synchronized (AbstractC1641hg.f19770OooooO0) {
                        appSetIdInfo = AbstractC1641hg.f19768Ooooo00;
                    }
                } else {
                    appSetIdInfo = this.f17979OooO0O0.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return ii0.OooooOO(new da0(null, -1, 0));
                }
                o00000oO.OooOOO oooOOOOoOO = ii0.ooOO(ii0.OooO0o(appSetIdInfo), new C2094tq(11), AbstractC2200wl.f25327OooO0oO);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17922o00oOOo)).booleanValue()) {
                    oooOOOOoOO = ii0.o00Oo0(oooOOOOoOO, ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17878o00O0o0)).longValue(), TimeUnit.MILLISECONDS, this.f17980OooO0OO);
                }
                return ii0.OoooOOO(oooOOOOoOO, Exception.class, new C2123ui(this, 4), this.f17981OooO0Oo);
            }
        }
        return ii0.OooooOO(new da0(null, -1, 0));
    }
}

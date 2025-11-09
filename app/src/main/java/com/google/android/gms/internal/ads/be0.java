package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.security.GeneralSecurityException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class be0 implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f17491OooO00o;

    public /* synthetic */ be0(int i) {
        this.f17491OooO00o = i;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        cq0 hq0Var;
        switch (this.f17491OooO00o) {
            case 0:
                ae0 ae0Var = new ae0();
                try {
                    er0.OooO00o();
                } catch (GeneralSecurityException e) {
                    zze.zza("Failed to Configure Aead. ".concat(e.toString()));
                    zzv.zzp().OooO0oo("CryptoUtils.registerAead", e);
                }
                return ae0Var;
            case 1:
                return new ce0();
            case 2:
                return Oooo0OO.oo000o.f13855OooO00o;
            case 3:
                he0 he0Var = new he0();
                he0Var.f19717OooO00o = null;
                return he0Var;
            case 4:
                return new te0();
            case 5:
                C2163vl c2163vl = AbstractC2200wl.f25325OooO0o;
                ii0.Oooo000(c2163vl);
                return c2163vl;
            case 6:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                if (executorServiceUnconfigurableExecutorService instanceof cq0) {
                    hq0Var = (cq0) executorServiceUnconfigurableExecutorService;
                } else {
                    hq0Var = executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new hq0((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new C2163vl(executorServiceUnconfigurableExecutorService);
                }
                ii0.Oooo000(hq0Var);
                return hq0Var;
            case 7:
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return c2163vl2;
            case 8:
                hq0 hq0Var2 = AbstractC2200wl.f25326OooO0o0;
                ii0.Oooo000(hq0Var2);
                return hq0Var2;
            case 9:
                C2163vl c2163vl3 = AbstractC2200wl.f25325OooO0o;
                ii0.Oooo000(c2163vl3);
                return c2163vl3;
            default:
                return new ThreadFactoryC2125uk(1);
        }
    }
}

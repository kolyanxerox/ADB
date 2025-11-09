package com.google.android.gms.internal.ads;

import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ul */
/* loaded from: classes2.dex */
public final class ExecutorC2126ul implements Executor {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f24654OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f24655OooOo0o;

    public ExecutorC2126ul(ExecutorService executorService, g61 g61Var) {
        this.f24654OooOo0O = 1;
        this.f24655OooOo0o = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f24654OooOo0O) {
            case 0:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((zzf) this.f24655OooOo0o).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    zzv.zzq();
                    zzs.zzN(zzv.zzp().f23633OooO0o0, th);
                    throw th;
                }
            default:
                ((ExecutorService) this.f24655OooOo0o).execute(runnable);
                return;
        }
    }

    public ExecutorC2126ul() {
        this.f24654OooOo0O = 0;
        this.f24655OooOo0o = new zzf(Looper.getMainLooper());
    }
}

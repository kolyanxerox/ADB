package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class kh0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooOo, reason: collision with root package name */
    public jh0 f20606OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f20607OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f20608OooOo0o;

    public void OooO00o(boolean z) {
    }

    public boolean OooO0O0() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f20608OooOo0o) {
            this.f20608OooOo0o = true;
            if (this.f20607OooOo0O) {
                OooO00o(true);
                jh0 jh0Var = this.f20606OooOo;
                if (jh0Var != null) {
                    jh0Var.OooO00o(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = runningAppProcessInfo.importance == 100 || OooO0O0();
        if (this.f20608OooOo0o != z) {
            this.f20608OooOo0o = z;
            if (this.f20607OooOo0O) {
                OooO00o(z);
                jh0 jh0Var = this.f20606OooOo;
                if (jh0Var != null) {
                    jh0Var.OooO00o(z);
                }
            }
        }
    }
}

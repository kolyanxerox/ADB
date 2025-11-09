package com.iab.omid.library.unity3d.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.unity3d.internal.d */
/* loaded from: classes2.dex */
public class C2591d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f3755a;

    /* renamed from: b */
    protected boolean f3756b;

    /* renamed from: c */
    private a f3757c;

    /* renamed from: com.iab.omid.library.unity3d.internal.d$a */
    public interface a {
        /* renamed from: a */
        void mo4532a(boolean z);
    }

    /* renamed from: a */
    public void m4547a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public ActivityManager.RunningAppProcessInfo m4549b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m4550c() {
        return this.f3756b;
    }

    /* renamed from: d */
    public boolean mo4537d() {
        return false;
    }

    /* renamed from: e */
    public void m4551e() {
        this.f3755a = true;
        boolean zM4546a = m4546a();
        this.f3756b = zM4546a;
        mo4536b(zM4546a);
    }

    /* renamed from: f */
    public void m4552f() {
        this.f3755a = false;
        this.f3757c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m4545a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m4545a(m4546a());
    }

    /* renamed from: a */
    public void m4548a(a aVar) {
        this.f3757c = aVar;
    }

    /* renamed from: b */
    public void mo4536b(boolean z) {
    }

    /* renamed from: a */
    private void m4545a(boolean z) {
        if (this.f3756b != z) {
            this.f3756b = z;
            if (this.f3755a) {
                mo4536b(z);
                a aVar = this.f3757c;
                if (aVar != null) {
                    aVar.mo4532a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m4546a() {
        return m4549b().importance == 100 || mo4537d();
    }
}

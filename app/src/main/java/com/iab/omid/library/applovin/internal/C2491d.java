package com.iab.omid.library.applovin.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.applovin.internal.d */
/* loaded from: classes2.dex */
public class C2491d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f3484a;

    /* renamed from: b */
    protected boolean f3485b;

    /* renamed from: c */
    private a f3486c;

    /* renamed from: com.iab.omid.library.applovin.internal.d$a */
    public interface a {
        /* renamed from: a */
        void mo4023a(boolean z);
    }

    /* renamed from: a */
    public void m4038a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public ActivityManager.RunningAppProcessInfo m4040b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m4041c() {
        return this.f3485b;
    }

    /* renamed from: d */
    public boolean mo4028d() {
        return false;
    }

    /* renamed from: e */
    public void m4042e() {
        this.f3484a = true;
        boolean zM4037a = m4037a();
        this.f3485b = zM4037a;
        mo4027b(zM4037a);
    }

    /* renamed from: f */
    public void m4043f() {
        this.f3484a = false;
        this.f3486c = null;
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
        m4036a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m4036a(m4037a());
    }

    /* renamed from: a */
    public void m4039a(a aVar) {
        this.f3486c = aVar;
    }

    /* renamed from: b */
    public void mo4027b(boolean z) {
    }

    /* renamed from: a */
    private void m4036a(boolean z) {
        if (this.f3485b != z) {
            this.f3485b = z;
            if (this.f3484a) {
                mo4027b(z);
                a aVar = this.f3486c;
                if (aVar != null) {
                    aVar.mo4023a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m4037a() {
        return m4040b().importance == 100 || mo4028d();
    }
}

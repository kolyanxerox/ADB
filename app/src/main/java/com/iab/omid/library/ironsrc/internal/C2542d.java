package com.iab.omid.library.ironsrc.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.iab.omid.library.ironsrc.internal.d */
/* loaded from: classes2.dex */
public class C2542d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f3619a;

    /* renamed from: b */
    protected boolean f3620b;

    /* renamed from: c */
    private a f3621c;

    /* renamed from: com.iab.omid.library.ironsrc.internal.d$a */
    public interface a {
        /* renamed from: a */
        void mo4276a(boolean z);
    }

    /* renamed from: a */
    public void m4291a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @VisibleForTesting
    /* renamed from: b */
    public ActivityManager.RunningAppProcessInfo m4293b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    /* renamed from: c */
    public boolean m4294c() {
        return this.f3620b;
    }

    /* renamed from: d */
    public boolean mo4281d() {
        return false;
    }

    /* renamed from: e */
    public void m4295e() {
        this.f3619a = true;
        boolean zM4290a = m4290a();
        this.f3620b = zM4290a;
        mo4280b(zM4290a);
    }

    /* renamed from: f */
    public void m4296f() {
        this.f3619a = false;
        this.f3621c = null;
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
        m4289a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m4289a(m4290a());
    }

    /* renamed from: a */
    public void m4292a(a aVar) {
        this.f3621c = aVar;
    }

    /* renamed from: b */
    public void mo4280b(boolean z) {
    }

    /* renamed from: a */
    private void m4289a(boolean z) {
        if (this.f3620b != z) {
            this.f3620b = z;
            if (this.f3619a) {
                mo4280b(z);
                a aVar = this.f3621c;
                if (aVar != null) {
                    aVar.mo4276a(z);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m4290a() {
        return m4293b().importance == 100 || mo4281d();
    }
}

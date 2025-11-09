package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class OooO0OO implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final OooO0OO f16689OooOoO = new OooO0OO();

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final AtomicBoolean f16691OooOo0O = new AtomicBoolean();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicBoolean f16692OooOo0o = new AtomicBoolean();

    /* renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f16690OooOo = new ArrayList();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f16693OooOoO0 = false;

    public static void OooO0O0(Application application) {
        OooO0OO oooO0OO = f16689OooOoO;
        synchronized (oooO0OO) {
            try {
                if (!oooO0OO.f16693OooOoO0) {
                    application.registerActivityLifecycleCallbacks(oooO0OO);
                    application.registerComponentCallbacks(oooO0OO);
                    oooO0OO.f16693OooOoO0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO00o(OooO0O0 oooO0O0) {
        synchronized (f16689OooOoO) {
            this.f16690OooOo.add(oooO0O0);
        }
    }

    public final void OooO0OO(boolean z) {
        synchronized (f16689OooOoO) {
            try {
                ArrayList arrayList = this.f16690OooOo;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((OooO0O0) obj).OooO00o(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f16692OooOo0o;
        boolean zCompareAndSet = this.f16691OooOo0O.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            OooO0OO(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f16692OooOo0o;
        boolean zCompareAndSet = this.f16691OooOo0O.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            OooO0OO(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f16691OooOo0O.compareAndSet(false, true)) {
            this.f16692OooOo0o.set(true);
            OooO0OO(true);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.j3 */
/* loaded from: classes2.dex */
public final class C1701j3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Activity f20162OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Application f20163OooOo0o;

    /* renamed from: OooOoo, reason: collision with root package name */
    public RunnableC1442c1 f20167OooOoo;

    /* renamed from: OooOooo, reason: collision with root package name */
    public long f20170OooOooo;

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f20161OooOo = new Object();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f20165OooOoO0 = true;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f20164OooOoO = false;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final ArrayList f20166OooOoOO = new ArrayList();

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayList f20168OooOoo0 = new ArrayList();

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f20169OooOooO = false;

    public final void OooO00o(Activity activity) {
        synchronized (this.f20161OooOo) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.f20162OooOo0O = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f20161OooOo) {
            try {
                Activity activity2 = this.f20162OooOo0O;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f20162OooOo0O = null;
                }
                ArrayList arrayList = this.f20168OooOoo0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                    } catch (Exception e) {
                        zzv.zzp().OooO0oo("AppActivityTracker.ActivityListener.onActivityDestroyed", e);
                        zzo.zzh("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        OooO00o(activity);
        synchronized (this.f20161OooOo) {
            ArrayList arrayList = this.f20168OooOoo0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (Exception e) {
                    zzv.zzp().OooO0oo("AppActivityTracker.ActivityListener.onActivityPaused", e);
                    zzo.zzh("", e);
                }
            }
        }
        this.f20164OooOoO = true;
        RunnableC1442c1 runnableC1442c1 = this.f20167OooOoo;
        if (runnableC1442c1 != null) {
            zzs.zza.removeCallbacks(runnableC1442c1);
        }
        pj0 pj0Var = zzs.zza;
        RunnableC1442c1 runnableC1442c12 = new RunnableC1442c1(this, 5);
        this.f20167OooOoo = runnableC1442c12;
        pj0Var.postDelayed(runnableC1442c12, this.f20170OooOooo);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        OooO00o(activity);
        int i = 0;
        this.f20164OooOoO = false;
        boolean z = this.f20165OooOoO0;
        this.f20165OooOoO0 = true;
        RunnableC1442c1 runnableC1442c1 = this.f20167OooOoo;
        if (runnableC1442c1 != null) {
            zzs.zza.removeCallbacks(runnableC1442c1);
        }
        synchronized (this.f20161OooOo) {
            ArrayList arrayList = this.f20168OooOoo0;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                } catch (Exception e) {
                    zzv.zzp().OooO0oo("AppActivityTracker.ActivityListener.onActivityResumed", e);
                    zzo.zzh("", e);
                }
            }
            if (z) {
                zzo.zze("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.f20166OooOoOO;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        ((InterfaceC1738k3) obj2).zza(true);
                    } catch (Exception e2) {
                        zzo.zzh("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        OooO00o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

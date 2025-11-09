package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.q1 */
/* loaded from: classes2.dex */
public final class C1958q1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooOo */
    public final WeakReference f23475OooOo;

    /* renamed from: OooOo0o */
    public final Application f23477OooOo0o;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f23476OooOo0O = 0;

    /* renamed from: OooOoO0 */
    public boolean f23478OooOoO0 = false;

    public C1958q1(Application application, ViewOnAttachStateChangeListenerC1370a2 viewOnAttachStateChangeListenerC1370a2) {
        this.f23475OooOo = new WeakReference(viewOnAttachStateChangeListenerC1370a2);
        this.f23477OooOo0o = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f23476OooOo0O) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception e) {
                    zzo.zzh("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f23476OooOo0O) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception e) {
                    zzo.zzh("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f23476OooOo0O) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception e) {
                    zzo.zzh("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f23476OooOo0O) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception e) {
                    zzo.zzh("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f23476OooOo0O) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception e) {
                    zzo.zzh("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f23476OooOo0O) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception e) {
                    zzo.zzh("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f23476OooOo0O) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f23475OooOo.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f23478OooOoO0) {
                        this.f23477OooOo0o.unregisterActivityLifecycleCallbacks(this);
                        this.f23478OooOoO0 = true;
                    }
                    break;
                } catch (Exception e) {
                    zzo.zzh("Error while dispatching lifecycle callback.", e);
                    return;
                }
        }
    }

    public C1958q1(Application application, ViewOnAttachStateChangeListenerC1517e3 viewOnAttachStateChangeListenerC1517e3) {
        this.f23475OooOo = new WeakReference(viewOnAttachStateChangeListenerC1517e3);
        this.f23477OooOo0o = application;
    }
}

package OoooO0O;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.ump.ConsentForm;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o0Oo0oo implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooOo0O */
    public final Activity f14050OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ oo0o0Oo f14051OooOo0o;

    public o0Oo0oo(oo0o0Oo oo0o0oo, Activity activity) {
        this.f14051OooOo0o = oo0o0oo;
        this.f14050OooOo0O = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        oo0o0Oo oo0o0oo = this.f14051OooOo0o;
        Dialog dialog = oo0o0oo.f14070OooO0o;
        if (dialog == null || !oo0o0oo.OooOO0o) {
            return;
        }
        dialog.setOwnerActivity(activity);
        o00000O o00000o = oo0o0oo.f14067OooO0O0;
        if (o00000o != null) {
            o00000o.f13914OooO00o = activity;
        }
        AtomicReference atomicReference = oo0o0oo.f14075OooOO0O;
        o0Oo0oo o0oo0oo = (o0Oo0oo) atomicReference.getAndSet(null);
        if (o0oo0oo != null) {
            o0oo0oo.f14051OooOo0o.f14066OooO00o.unregisterActivityLifecycleCallbacks(o0oo0oo);
            o0Oo0oo o0oo0oo2 = new o0Oo0oo(oo0o0oo, activity);
            oo0o0oo.f14066OooO00o.registerActivityLifecycleCallbacks(o0oo0oo2);
            atomicReference.set(o0oo0oo2);
        }
        Dialog dialog2 = oo0o0oo.f14070OooO0o;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f14050OooOo0O) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        oo0o0Oo oo0o0oo = this.f14051OooOo0o;
        if (zIsChangingConfigurations && oo0o0oo.OooOO0o && (dialog = oo0o0oo.f14070OooO0o) != null) {
            dialog.dismiss();
            return;
        }
        o00O00 o00o00 = new o00O00(3, "Activity is destroyed.");
        Dialog dialog2 = oo0o0oo.f14070OooO0o;
        if (dialog2 != null) {
            dialog2.dismiss();
            oo0o0oo.f14070OooO0o = null;
        }
        oo0o0oo.f14067OooO0O0.f13914OooO00o = null;
        o0Oo0oo o0oo0oo = (o0Oo0oo) oo0o0oo.f14075OooOO0O.getAndSet(null);
        if (o0oo0oo != null) {
            o0oo0oo.f14051OooOo0o.f14066OooO00o.unregisterActivityLifecycleCallbacks(o0oo0oo);
        }
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) oo0o0oo.f14074OooOO0.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        onConsentFormDismissedListener.onConsentFormDismissed(o00o00.OooO00o());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

package o000o00o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes2.dex */
public final class o00oOoo implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o00O0O00 f30867OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f30868OooOo0o;

    public o00oOoo(o00O0O00 sharedSessionRepository) {
        kotlin.jvm.internal.OooOo.OooO0o0(sharedSessionRepository, "sharedSessionRepository");
        this.f30867OooOo0O = sharedSessionRepository;
        this.f30868OooOo0o = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        if (this.f30868OooOo0o) {
            this.f30867OooOo0O.OooO0O0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        if (this.f30868OooOo0o) {
            o00O0O00 o00o0o00 = this.f30867OooOo0O;
            o00o0o00.f30849OooO = true;
            o000O0o o000o0o2 = o00o0o00.f30857OooO0oo;
            if (o000o0o2 == null) {
                Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
                return;
            }
            if (o000o0o2 == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("localSessionData");
                throw null;
            }
            Log.d("FirebaseSessions", "App foregrounded on " + o00o0o00.f30854OooO0o.OooO00o());
            if (o00o0o00.OooO0Oo(o000o0o2) || o00o0o00.OooO0OO(o000o0o2)) {
                o00O0oOo.o0000OO0.OooOo0(o00O0oOo.o0000OO0.OooO0O0(o00o0o00.f30856OooO0oO), null, new oo00o(o00o0o00, o000o0o2, null), 3);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
    }
}

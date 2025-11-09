package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oOO00O implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooOo0O */
    public final /* synthetic */ o00O00OO f26848OooOo0O;

    public oOO00O(o00O00OO o00o00oo) {
        Objects.requireNonNull(o00o00oo);
        this.f26848OooOo0O = o00o00oo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f26848OooOo0O.OooO0OO(new o000OOo0(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f26848OooOo0O.OooO0OO(new o00O00O(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f26848OooOo0O.OooO0OO(new o00O00O(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f26848OooOo0O.OooO0OO(new o00O00O(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o00000O o00000o = new o00000O();
        this.f26848OooOo0O.OooO0OO(new o000OOo0(this, activity, o00000o));
        Bundle bundleO000OO0O = o00000o.o000OO0O(50L);
        if (bundleO000OO0O != null) {
            bundle.putAll(bundleO000OO0O);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f26848OooOo0O.OooO0OO(new o00O00O(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f26848OooOo0O.OooO0OO(new o00O00O(this, activity, 3));
    }
}

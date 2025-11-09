package o000o00o;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0.Oooo0 f30878OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000o0O.oo000o f30879OooO0O0;

    public o0OOO0o(o0000o0.Oooo0 firebaseApp, o000o0O.oo000o settings, o00O0O0O.OooOOO0 backgroundDispatcher, o00oOoo sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.OooOo.OooO0o0(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.OooOo.OooO0o0(settings, "settings");
        kotlin.jvm.internal.OooOo.OooO0o0(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f30878OooO00o = firebaseApp;
        this.f30879OooO0O0 = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.0.");
        firebaseApp.OooO00o();
        Context applicationContext = firebaseApp.f29588OooO00o.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            o00O0oOo.o0000OO0.OooOo0(o00O0oOo.o0000OO0.OooO0O0(backgroundDispatcher), null, new o0ooOOo(this, sessionsActivityLifecycleCallbacks, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}

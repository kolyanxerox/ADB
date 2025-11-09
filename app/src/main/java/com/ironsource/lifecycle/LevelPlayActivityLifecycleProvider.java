package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class LevelPlayActivityLifecycleProvider extends ContentProvider {
    public static final C3328a Companion = new C3328a(null);

    /* renamed from: a */
    private static WeakReference<Activity> f9371a = new WeakReference<>(null);

    /* renamed from: com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider$a */
    public static final class C3328a {
        private C3328a() {
        }

        public /* synthetic */ C3328a(OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider$b */
    public static final class C3329b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            OooOo.OooO0o0(activity, "activity");
            C3328a c3328a = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f9371a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            OooOo.OooO0o0(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            OooOo.OooO0o0(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            OooOo.OooO0o0(activity, "activity");
            C3328a c3328a = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f9371a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            OooOo.OooO0o0(activity, "activity");
            OooOo.OooO0o0(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            OooOo.OooO0o0(activity, "activity");
            C3328a c3328a = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f9371a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            OooOo.OooO0o0(activity, "activity");
        }
    }

    /* renamed from: a */
    private final void m9788a(Application application) {
        application.registerActivityLifecycleCallbacks(new C3329b());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        OooOo.OooO0o0(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        OooOo.OooO0o0(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        OooOo.OooO0o0(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() == null) {
            IronLog.INTERNAL.verbose("context is null");
            return true;
        }
        if (!(getContext() instanceof Application)) {
            IronLog.INTERNAL.verbose("context is not application");
            return true;
        }
        Context context = getContext();
        OooOo.OooO0OO(context, "null cannot be cast to non-null type android.app.Application");
        m9788a((Application) context);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        OooOo.OooO0o0(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        OooOo.OooO0o0(uri, "uri");
        return 0;
    }
}

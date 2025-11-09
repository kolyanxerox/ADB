package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ContextProvider {

    /* renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContextProvider f8424d;

    /* renamed from: a */
    private Activity f8425a;

    /* renamed from: b */
    private Context f8426b;

    /* renamed from: c */
    private ConcurrentHashMap<String, InterfaceC3084a> f8427c = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.environment.ContextProvider$a */
    public interface InterfaceC3084a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f8424d == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (f8424d == null) {
                        f8424d = new ContextProvider();
                    }
                } finally {
                }
            }
        }
        return f8424d;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f8426b;
        return (context != null || (activity = this.f8425a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f8425a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<InterfaceC3084a> it = this.f8427c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f8425a = activity;
            Iterator<InterfaceC3084a> it = this.f8427c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f8425a);
            }
        }
    }

    public void registerLifeCycleListener(InterfaceC3084a interfaceC3084a) {
        this.f8427c.put(interfaceC3084a.getClass().getSimpleName(), interfaceC3084a);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f8425a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f8426b = context;
        }
    }
}

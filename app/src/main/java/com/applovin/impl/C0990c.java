package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.c */
/* loaded from: classes.dex */
public class C0990c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final List f450a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private WeakReference f451b;

    /* renamed from: c */
    private WeakReference f452c;

    public C0990c(Context context) {
        this.f451b = new WeakReference(null);
        this.f452c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f451b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f452c = this.f451b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity m437a() {
        return (Activity) this.f452c.get();
    }

    /* renamed from: b */
    public Activity m439b() {
        return (Activity) this.f451b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ArrayList arrayList = new ArrayList(this.f450a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC0980b) obj).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ArrayList arrayList = new ArrayList(this.f450a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC0980b) obj).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f452c = new WeakReference(null);
        ArrayList arrayList = new ArrayList(this.f450a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC0980b) obj).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f451b = weakReference;
        this.f452c = weakReference;
        ArrayList arrayList = new ArrayList(this.f450a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC0980b) obj).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ArrayList arrayList = new ArrayList(this.f450a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC0980b) obj).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ArrayList arrayList = new ArrayList(this.f450a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC0980b) obj).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ArrayList arrayList = new ArrayList(this.f450a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC0980b) obj).onActivityStopped(activity);
        }
    }

    /* renamed from: a */
    public void m438a(AbstractC0980b abstractC0980b) {
        this.f450a.add(abstractC0980b);
    }

    /* renamed from: b */
    public void m440b(AbstractC0980b abstractC0980b) {
        this.f450a.remove(abstractC0980b);
    }
}

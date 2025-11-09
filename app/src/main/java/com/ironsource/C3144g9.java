package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.g9 */
/* loaded from: classes2.dex */
public class C3144g9 {

    /* renamed from: a */
    MutableContextWrapper f8713a;

    /* renamed from: a */
    public Activity m8925a() {
        return (Activity) this.f8713a.getBaseContext();
    }

    /* renamed from: b */
    public synchronized void m8927b() {
        this.f8713a = null;
    }

    /* renamed from: a */
    public synchronized void m8926a(Activity activity) {
        try {
            if (this.f8713a == null) {
                this.f8713a = new MutableContextWrapper(activity);
            }
            this.f8713a.setBaseContext(activity);
        } catch (Throwable th) {
            throw th;
        }
    }
}

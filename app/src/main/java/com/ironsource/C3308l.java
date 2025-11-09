package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.l */
/* loaded from: classes2.dex */
public class C3308l implements InterfaceC2988bx {

    /* renamed from: a */
    private WeakReference<Activity> f9290a;

    public C3308l(Activity activity) {
        this.f9290a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.InterfaceC2988bx
    /* renamed from: a */
    public void mo8057a() {
        Activity activity = this.f9290a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}

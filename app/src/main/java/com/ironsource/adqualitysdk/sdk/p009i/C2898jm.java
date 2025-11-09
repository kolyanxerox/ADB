package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jm */
/* loaded from: classes2.dex */
public final class C2898jm {

    /* renamed from: ﾒ */
    private InterfaceC2900jo f7105;

    /* renamed from: ﻛ */
    private boolean f7102 = false;

    /* renamed from: ﾇ */
    private Handler f7104 = new Handler(Looper.getMainLooper());

    /* renamed from: ｋ */
    private InterfaceC2893jh f7103 = new AbstractC2891jf() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.4
        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2898jm.m7301(C2898jm.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C2898jm.m7301(C2898jm.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C2898jm.m7300(C2898jm.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C2898jm.m7303(C2898jm.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C2898jm.m7301(C2898jm.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C2898jm.m7301(C2898jm.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C2898jm.m7301(C2898jm.this);
        }
    };

    public C2898jm(InterfaceC2900jo interfaceC2900jo) {
        this.f7105 = interfaceC2900jo;
        AbstractC2894ji.m7268().m7271(this.f7103);
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m7300(C2898jm c2898jm, final Activity activity) {
        c2898jm.f7104.postDelayed(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2898jm.m7304(C2898jm.this);
                if (C2898jm.this.f7105 != null) {
                    C2898jm.this.f7105.mo5064(activity);
                }
            }
        }, 500L);
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m7301(C2898jm c2898jm) {
        c2898jm.f7104.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ boolean m7304(C2898jm c2898jm) {
        c2898jm.f7102 = true;
        return true;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7303(C2898jm c2898jm, Activity activity) {
        if (c2898jm.f7102) {
            c2898jm.f7102 = false;
            InterfaceC2900jo interfaceC2900jo = c2898jm.f7105;
            if (interfaceC2900jo != null) {
                interfaceC2900jo.mo5065(activity);
            }
        }
        c2898jm.f7104.removeCallbacksAndMessages(null);
    }

    /* renamed from: ﾇ */
    public final void m7305() {
        this.f7104.removeCallbacksAndMessages(null);
        if (this.f7103 != null) {
            AbstractC2894ji.m7268().m7270(this.f7103);
            this.f7103 = null;
        }
    }
}

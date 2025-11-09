package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.ironsource.bi */
/* loaded from: classes2.dex */
public interface InterfaceC2973bi {

    /* renamed from: com.ironsource.bi$a */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(C3905zh c3905zh);

        void onNativeAdShown();
    }

    /* renamed from: a */
    a mo7927a();

    /* renamed from: a */
    void mo7928a(Activity activity, JSONObject jSONObject);

    /* renamed from: a */
    void mo7929a(a aVar);

    /* renamed from: a */
    void mo7930a(C3008ci c3008ci);

    /* renamed from: b */
    C3905zh mo7931b();

    void destroy();
}

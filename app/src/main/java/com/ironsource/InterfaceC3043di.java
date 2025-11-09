package com.ironsource;

import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.di */
/* loaded from: classes2.dex */
public interface InterfaceC3043di {

    /* renamed from: com.ironsource.di$a */
    public interface a {
        /* renamed from: a */
        void mo8317a(String str);

        /* renamed from: b */
        void mo8318b(String str);
    }

    /* renamed from: a */
    void mo8312a(String str, String str2);

    /* renamed from: a */
    void mo8313a(String str, String str2, String str3);

    /* renamed from: a */
    void mo8314a(JSONObject jSONObject, String str, String str2);

    /* renamed from: b */
    void mo8315b(JSONObject jSONObject, String str, String str2);

    /* renamed from: c */
    void mo8316c(JSONObject jSONObject, String str, String str2) throws JSONException;

    WebView getPresentingView();
}

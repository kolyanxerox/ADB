package com.ironsource;

import android.os.Bundle;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.core.webview.WebView;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.io.InputStream;
import java.util.Map;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.external.ExternalParser;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0000O0O implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f28531OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f28532OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f28533OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f28534OooOoO0;

    public /* synthetic */ o0000O0O(Object obj, Object obj2, Object obj3, int i) {
        this.f28532OooOo0O = i;
        this.f28533OooOo0o = obj;
        this.f28531OooOo = obj2;
        this.f28534OooOoO0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        switch (this.f28532OooOo0O) {
            case 0:
                C3825x5.m13018a((C3825x5) this.f28533OooOo0o, (View) this.f28531OooOo, (FrameLayout.LayoutParams) this.f28534OooOoO0);
                return;
            case 1:
                ((LoadOperationState) this.f28533OooOo0o).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) this.f28531OooOo, (String) this.f28534OooOoO0);
                return;
            case 2:
                ((IUnityAdsInitializationListener) this.f28533OooOo0o).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.f28531OooOo, (String) this.f28534OooOoO0);
                return;
            case 3:
                WebView.evaluateJavascript$lambda$1((WebView) this.f28533OooOo0o, (String) this.f28531OooOo, (ValueCallback) this.f28534OooOoO0);
                return;
            case 4:
                FlutterFirebaseAnalyticsPlugin.handleSetUserId$lambda$4((FlutterFirebaseAnalyticsPlugin) this.f28533OooOo0o, (String) this.f28531OooOo, (TaskCompletionSource) this.f28534OooOoO0);
                return;
            case 5:
                ((FlutterFirebaseCorePlugin) this.f28533OooOo0o).lambda$firebaseAppToMap$0((o0000o0.Oooo0) this.f28531OooOo, (TaskCompletionSource) this.f28534OooOoO0);
                return;
            case 6:
                ((FlutterFirebaseCrashlyticsPlugin) this.f28533OooOo0o).lambda$getPluginConstantsForFirebaseApp$11((TaskCompletionSource) this.f28531OooOo, (o0000o0.Oooo0) this.f28534OooOoO0);
                return;
            case 7:
                FirebaseRemoteConfigPlugin.setCustomSignals$lambda$2((Map) this.f28533OooOo0o, (o000OooO.o00O0O) this.f28531OooOo, (TaskCompletionSource) this.f28534OooOoO0);
                return;
            case 8:
                FirebaseRemoteConfigPlugin.getPluginConstantsForFirebaseApp$lambda$0((o0000o0.Oooo0) this.f28533OooOo0o, (FirebaseRemoteConfigPlugin) this.f28531OooOo, (TaskCompletionSource) this.f28534OooOoO0);
                return;
            case 9:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f28533OooOo0o).lambda$onReceivedClientCertRequest$25((android.webkit.WebView) this.f28531OooOo, (ClientCertRequest) this.f28534OooOoO0);
                return;
            case 10:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f28533OooOo0o).lambda$shouldOverrideUrlLoading$11((android.webkit.WebView) this.f28531OooOo, (WebResourceRequest) this.f28534OooOoO0);
                return;
            case 11:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f28533OooOo0o).lambda$shouldOverrideUrlLoading$11((android.webkit.WebView) this.f28531OooOo, (WebResourceRequest) this.f28534OooOoO0);
                return;
            case 12:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f28533OooOo0o).lambda$onReceivedClientCertRequest$25((android.webkit.WebView) this.f28531OooOo, (ClientCertRequest) this.f28534OooOoO0);
                return;
            case 13:
                o000OooO.o0OOO0o o0ooo0o = (o000OooO.o0OOO0o) this.f28533OooOo0o;
                String str = (String) this.f28531OooOo;
                o000Oooo.o000000 o000000Var = (o000Oooo.o000000) this.f28534OooOoO0;
                o000Oo0O.OooOo00 oooOo00 = o0ooo0o.f30567OooO00o;
                o0000oO0.Oooo0 oooo0 = (o0000oO0.Oooo0) ((o000Oo00.OooOOO) oooOo00.f30372OooOo0o).get();
                if (oooo0 == null) {
                    return;
                }
                JSONObject jSONObject = o000000Var.f30598OooO0o0;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = o000000Var.f30594OooO0O0;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) oooOo00.f30370OooOo)) {
                        try {
                            if (!strOptString.equals(((Map) oooOo00.f30370OooOo).get(str))) {
                                ((Map) oooOo00.f30370OooOo).put(str, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                o0000oO0.o000oOoO o000oooo2 = (o0000oO0.o000oOoO) oooo0;
                                o000oooo2.OooO00o("fp", bundle, "personalization_assignment");
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                o000oooo2.OooO00o("fp", bundle2, "_fpc");
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                ((ExternalParser) this.f28533OooOo0o).lambda$extractMetadata$2((InputStream) this.f28531OooOo, (Metadata) this.f28534OooOoO0);
                return;
        }
    }
}

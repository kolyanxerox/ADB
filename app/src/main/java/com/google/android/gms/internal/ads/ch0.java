package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ch0 implements WebViewCompat.WebMessageListener {

    /* renamed from: OooO00o */
    public final /* synthetic */ dh0 f17999OooO00o;

    public ch0(dh0 dh0Var) {
        this.f17999OooO00o = dh0Var;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) throws JSONException {
        yg0 yg0Var;
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            boolean zEquals = string.equals("startSession");
            dh0 dh0Var = this.f17999OooO00o;
            if (zEquals) {
                dh0.OooO00o(dh0Var, string2);
            } else if (string.equals("finishSession") && (yg0Var = (yg0) dh0Var.f18255OooO0Oo.get(string2)) != null) {
                yg0Var.OooO00o();
                dh0Var.f18255OooO0Oo.remove(string2);
            }
        } catch (JSONException e) {
            ze0.OooOOO(e, "Error parsing JS message in JavaScriptSessionService.");
        }
    }
}

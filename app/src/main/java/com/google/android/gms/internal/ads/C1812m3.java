package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3034d9;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.m3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1812m3 implements ValueCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f21038OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C1665i3 f21039OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ WebView f21040OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f21041OooO0Oo;

    public /* synthetic */ C1812m3(o000oOoO o000oooo2, C1665i3 c1665i3, WebView webView, boolean z) {
        this.f21038OooO00o = o000oooo2;
        this.f21039OooO0O0 = c1665i3;
        this.f21040OooO0OO = webView;
        this.f21041OooO0Oo = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        boolean z;
        C1849n3 c1849n3 = (C1849n3) this.f21038OooO00o.f21734OooOoO0;
        C1665i3 c1665i3 = this.f21039OooO0O0;
        WebView webView = this.f21040OooO0OO;
        String str = (String) obj;
        boolean z2 = this.f21041OooO0Oo;
        c1849n3.getClass();
        synchronized (c1665i3.f19908OooO0oO) {
            c1665i3.f19913OooOOO0--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString(C3034d9.h.f8077K0);
                if (c1849n3.f21403Oooo0 || TextUtils.isEmpty(webView.getTitle())) {
                    c1665i3.OooO00o(strOptString, z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    c1665i3.OooO00o(webView.getTitle() + "\n" + strOptString, z2, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (c1665i3.f19908OooO0oO) {
                z = c1665i3.f19913OooOOO0 == 0;
            }
            if (z) {
                c1849n3.f21397OooOoO0.OooO0oo(c1665i3);
            }
        } catch (JSONException unused) {
            zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            zzo.zzf("Failed to get webview content.", th);
            zzv.zzp().OooO0oo("ContentFetchTask.processWebViewContent", th);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vh0 extends sh0 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public Long f24978OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public WebView f24979OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Map f24980OooO0oO;

    public vh0(String str, Map map) {
        super(str);
        this.f24978OooO0o = null;
        this.f24980OooO0oO = map;
    }

    @Override // com.google.android.gms.internal.ads.sh0
    public final void OooO0O0() {
        super.OooO0O0();
        new Handler().postDelayed(new b30(this), Math.max(4000 - (this.f24978OooO0o == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f24978OooO0o.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f24979OooO0o0 = null;
    }

    @Override // com.google.android.gms.internal.ads.sh0
    public final void OooO0Oo(yg0 yg0Var, oO000O0O oo000o0o) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap((HashMap) oo000o0o.f22432OooOoO0);
        Iterator it = mapUnmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            mapUnmodifiableMap.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        OooO0o0(yg0Var, oo000o0o, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.sh0
    public final void OooO0o() {
        WebView webView = new WebView(nh0.f21489OooOo.f21491OooOo0o);
        this.f24979OooO0o0 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f24979OooO0o0.getSettings().setAllowContentAccess(false);
        this.f24979OooO0o0.getSettings().setAllowFileAccess(false);
        this.f24979OooO0o0.setWebViewClient(new uh0());
        this.f24088OooO0O0 = new fi0(this.f24979OooO0o0);
        ze0.OoooOoO(this.f24979OooO0o0, null);
        Map map = this.f24980OooO0oO;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            map.get((String) it.next()).getClass();
            throw new ClassCastException();
        }
        this.f24978OooO0o = Long.valueOf(System.nanoTime());
    }
}

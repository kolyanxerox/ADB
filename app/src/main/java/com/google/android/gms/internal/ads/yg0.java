package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C3034d9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class yg0 {

    /* renamed from: OooO00o */
    public final oO000O0O f25906OooO00o;

    /* renamed from: OooO0Oo */
    public sh0 f25909OooO0Oo;

    /* renamed from: OooO0oO */
    public final String f25912OooO0oO;

    /* renamed from: OooO0O0 */
    public final mh0 f25907OooO0O0 = new mh0();

    /* renamed from: OooO0o0 */
    public boolean f25911OooO0o0 = false;

    /* renamed from: OooO0o */
    public boolean f25910OooO0o = false;

    /* renamed from: OooO0OO */
    public fi0 f25908OooO0OO = new fi0(null);

    public yg0(fj0 fj0Var, oO000O0O oo000o0o, String str) throws JSONException {
        this.f25906OooO00o = oo000o0o;
        this.f25912OooO0oO = str;
        xg0 xg0Var = xg0.HTML;
        xg0 xg0Var2 = (xg0) oo000o0o.f22434OooOoo0;
        if (xg0Var2 == xg0Var || xg0Var2 == xg0.JAVASCRIPT) {
            th0 th0Var = new th0(str);
            WebView webView = (WebView) oo000o0o.f22430OooOo0o;
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            th0Var.f24088OooO0O0 = new fi0(webView);
            this.f25909OooO0Oo = th0Var;
        } else {
            this.f25909OooO0Oo = new vh0(str, Collections.unmodifiableMap((HashMap) oo000o0o.f22432OooOoO0));
        }
        this.f25909OooO0Oo.OooO0o();
        ih0.f20045OooO0OO.f20046OooO00o.add(this);
        sh0 sh0Var = this.f25909OooO0Oo;
        WebView webViewOooO00o = sh0Var.OooO00o();
        JSONObject jSONObject = new JSONObject();
        wh0.OooO0OO(jSONObject, "impressionOwner", (eh0) fj0Var.f18956OooOo0o);
        wh0.OooO0OO(jSONObject, "mediaEventsOwner", (eh0) fj0Var.f18954OooOo);
        wh0.OooO0OO(jSONObject, "creativeType", (zg0) fj0Var.f18958OooOoO0);
        wh0.OooO0OO(jSONObject, "impressionType", (bh0) fj0Var.f18957OooOoO);
        wh0.OooO0OO(jSONObject, "isolateVerificationScripts", Boolean.valueOf(fj0Var.f18955OooOo0O));
        ze0.OooOooo(webViewOooO00o, C3034d9.a.f7919f, jSONObject, sh0Var.f24087OooO00o);
    }

    public final void OooO00o() {
        if (this.f25910OooO0o) {
            return;
        }
        this.f25908OooO0OO.clear();
        if (!this.f25910OooO0o) {
            this.f25907OooO0O0.f21254OooO00o.clear();
        }
        this.f25910OooO0o = true;
        sh0 sh0Var = this.f25909OooO0Oo;
        ze0.OooOooo(sh0Var.OooO00o(), "finishSession", sh0Var.f24087OooO00o);
        ih0 ih0Var = ih0.f20045OooO0OO;
        ArrayList arrayList = ih0Var.f20046OooO00o;
        ArrayList arrayList2 = ih0Var.f20047OooO0O0;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            oh0 oh0VarOooO0O0 = oh0.OooO0O0();
            oh0VarOooO0O0.getClass();
            zh0 zh0Var = zh0.f26170OooO0oO;
            zh0Var.getClass();
            Handler handler = zh0.f26169OooO;
            if (handler != null) {
                handler.removeCallbacks(zh0.f26173OooOO0O);
                zh0.f26169OooO = null;
            }
            zh0Var.f26174OooO00o.clear();
            zh0.f26171OooO0oo.post(new b30(zh0Var, 14));
            hh0 hh0Var = hh0.f19779OooOoO0;
            hh0Var.f20607OooOo0O = false;
            hh0Var.f20606OooOo = null;
            fh0 fh0Var = oh0VarOooO0O0.f22996OooO0O0;
            fh0Var.f18948OooO00o.getContentResolver().unregisterContentObserver(fh0Var);
        }
        this.f25909OooO0Oo.OooO0O0();
        this.f25909OooO0Oo = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(View view) {
        if (this.f25910OooO0o || ((View) this.f25908OooO0OO.get()) == view) {
            return;
        }
        this.f25908OooO0OO = new fi0(view);
        sh0 sh0Var = this.f25909OooO0Oo;
        sh0Var.getClass();
        sh0Var.f24089OooO0OO = System.nanoTime();
        sh0Var.f24090OooO0Oo = 1;
        Collection<yg0> collectionUnmodifiableCollection = Collections.unmodifiableCollection(ih0.f20045OooO0OO.f20046OooO00o);
        if (collectionUnmodifiableCollection == null || collectionUnmodifiableCollection.isEmpty()) {
            return;
        }
        for (yg0 yg0Var : collectionUnmodifiableCollection) {
            if (yg0Var != this && ((View) yg0Var.f25908OooO0OO.get()) == view) {
                yg0Var.f25908OooO0OO.clear();
            }
        }
    }

    public final void OooO0OO() {
        if (this.f25911OooO0o0 || this.f25909OooO0Oo == null) {
            return;
        }
        this.f25911OooO0o0 = true;
        ArrayList arrayList = ih0.f20045OooO0OO.f20047OooO0O0;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            oh0 oh0VarOooO0O0 = oh0.OooO0O0();
            oh0VarOooO0O0.getClass();
            hh0 hh0Var = hh0.f19779OooOoO0;
            hh0Var.f20606OooOo = oh0VarOooO0O0;
            hh0Var.f20607OooOo0O = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z2 = runningAppProcessInfo.importance == 100 || hh0Var.OooO0O0();
            hh0Var.f20608OooOo0o = z2;
            hh0Var.OooO00o(z2);
            zh0.f26170OooO0oO.getClass();
            zh0.OooO0O0();
            fh0 fh0Var = oh0VarOooO0O0.f22996OooO0O0;
            fh0Var.f18950OooO0OO = fh0Var.OooO00o();
            fh0Var.OooO0O0();
            fh0Var.f18948OooO00o.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, fh0Var);
        }
        float f = oh0.OooO0O0().f22995OooO00o;
        sh0 sh0Var = this.f25909OooO0Oo;
        ze0.OooOooo(sh0Var.OooO00o(), "setDeviceVolume", Float.valueOf(f), sh0Var.f24087OooO00o);
        sh0 sh0Var2 = this.f25909OooO0Oo;
        Date date = (Date) gh0.f19347OooO0o0.f19350OooO0OO;
        sh0Var2.OooO0OO(date != null ? (Date) date.clone() : null);
        this.f25909OooO0Oo.OooO0Oo(this, this.f25906OooO00o);
    }
}

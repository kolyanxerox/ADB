package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class sh0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f24087OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f24089OooO0OO = System.nanoTime();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f24090OooO0Oo = 1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public fi0 f24088OooO0O0 = new fi0(null);

    public sh0(String str) {
        this.f24087OooO00o = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView OooO00o() {
        return (WebView) this.f24088OooO0O0.get();
    }

    public void OooO0O0() {
        this.f24088OooO0O0.clear();
    }

    public final void OooO0OO(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        wh0.OooO0OO(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        ze0.OooOooo(OooO00o(), "setLastActivity", jSONObject);
    }

    public void OooO0Oo(yg0 yg0Var, oO000O0O oo000o0o) {
        OooO0o0(yg0Var, oo000o0o, null);
    }

    public void OooO0o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0(com.google.android.gms.internal.ads.yg0 r7, com.google.android.gms.internal.ads.oO000O0O r8, org.json.JSONObject r9) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sh0.OooO0o0(com.google.android.gms.internal.ads.yg0, com.google.android.gms.internal.ads.oO000O0O, org.json.JSONObject):void");
    }
}

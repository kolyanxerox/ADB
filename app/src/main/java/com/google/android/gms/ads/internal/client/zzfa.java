package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfa {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f16083OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f16084OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f16085OooO0OO;

    public zzfa(String str, Bundle bundle, String str2) {
        this.f16083OooO00o = str;
        this.f16084OooO0O0 = bundle;
        this.f16085OooO0OO = str2;
    }

    public final Bundle zza() {
        return this.f16084OooO0O0;
    }

    public final String zzb() {
        return this.f16083OooO00o;
    }

    public final String zzc() {
        String str = this.f16085OooO0OO;
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("request_id", "");
            } catch (JSONException unused) {
            }
        }
        return "";
    }
}

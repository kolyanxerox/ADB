package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdError {

    @NonNull
    public static final String UNDEFINED_DOMAIN = "undefined";

    /* renamed from: OooO00o */
    public final int f15876OooO00o;

    /* renamed from: OooO0O0 */
    public final String f15877OooO0O0;

    /* renamed from: OooO0OO */
    public final String f15878OooO0OO;

    /* renamed from: OooO0Oo */
    public final AdError f15879OooO0Oo;

    public AdError(int i, @NonNull String str, @NonNull String str2, @Nullable AdError adError) {
        this.f15876OooO00o = i;
        this.f15877OooO0O0 = str;
        this.f15878OooO0OO = str2;
        this.f15879OooO0Oo = adError;
    }

    @Nullable
    public AdError getCause() {
        return this.f15879OooO0Oo;
    }

    public int getCode() {
        return this.f15876OooO00o;
    }

    @NonNull
    public String getDomain() {
        return this.f15878OooO0OO;
    }

    @NonNull
    public String getMessage() {
        return this.f15877OooO0O0;
    }

    @NonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @NonNull
    public final com.google.android.gms.ads.internal.client.zze zza() {
        AdError adError = this.f15879OooO0Oo;
        return new com.google.android.gms.ads.internal.client.zze(this.f15876OooO00o, this.f15877OooO0O0, this.f15878OooO0OO, adError == null ? null : new com.google.android.gms.ads.internal.client.zze(adError.f15876OooO00o, adError.f15877OooO0O0, adError.f15878OooO0OO, null, null), null);
    }

    @NonNull
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f15876OooO00o);
        jSONObject.put("Message", this.f15877OooO0O0);
        jSONObject.put("Domain", this.f15878OooO0OO);
        AdError adError = this.f15879OooO0Oo;
        if (adError == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", adError.zzb());
        return jSONObject;
    }

    public AdError(int i, @NonNull String str, @NonNull String str2) {
        this(i, str, str2, null);
    }
}

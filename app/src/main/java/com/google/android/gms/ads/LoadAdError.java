package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LoadAdError extends AdError {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ResponseInfo f15902OooO0o0;

    public LoadAdError(int i, @NonNull String str, @NonNull String str2, @Nullable AdError adError, @Nullable ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.f15902OooO0o0 = responseInfo;
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.f15902OooO0o0;
    }

    @Override // com.google.android.gms.ads.AdError
    @NonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    @NonNull
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObjectZzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            jSONObjectZzb.put("Response Info", "null");
            return jSONObjectZzb;
        }
        jSONObjectZzb.put("Response Info", responseInfo.zzd());
        return jSONObjectZzb;
    }
}

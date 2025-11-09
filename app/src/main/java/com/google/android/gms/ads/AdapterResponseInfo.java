package com.google.android.gms.ads;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzw;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AdapterResponseInfo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzw f15899OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AdError f15900OooO0O0;

    public AdapterResponseInfo(zzw zzwVar) {
        this.f15899OooO00o = zzwVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzwVar.zzc;
        this.f15900OooO0O0 = zzeVar == null ? null : zzeVar.zza();
    }

    @Nullable
    public static AdapterResponseInfo zza(@Nullable zzw zzwVar) {
        if (zzwVar != null) {
            return new AdapterResponseInfo(zzwVar);
        }
        return null;
    }

    @Nullable
    public AdError getAdError() {
        return this.f15900OooO0O0;
    }

    @NonNull
    public String getAdSourceId() {
        return this.f15899OooO00o.zzf;
    }

    @NonNull
    public String getAdSourceInstanceId() {
        return this.f15899OooO00o.zzh;
    }

    @NonNull
    public String getAdSourceInstanceName() {
        return this.f15899OooO00o.zzg;
    }

    @NonNull
    public String getAdSourceName() {
        return this.f15899OooO00o.zze;
    }

    @NonNull
    public String getAdapterClassName() {
        return this.f15899OooO00o.zza;
    }

    @NonNull
    public Bundle getCredentials() {
        return this.f15899OooO00o.zzd;
    }

    public long getLatencyMillis() {
        return this.f15899OooO00o.zzb;
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
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzw zzwVar = this.f15899OooO00o;
        jSONObject.put("Adapter", zzwVar.zza);
        jSONObject.put("Latency", zzwVar.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : zzwVar.zzd.keySet()) {
            jSONObject2.put(str, zzwVar.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.f15900OooO0O0;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", adError.zzb());
        return jSONObject;
    }
}

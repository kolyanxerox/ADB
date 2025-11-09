package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ub0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final JSONObject f24620OooO00o;

    public ub0(JSONObject jSONObject) {
        this.f24620OooO00o = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("cache_state", this.f24620OooO00o);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}

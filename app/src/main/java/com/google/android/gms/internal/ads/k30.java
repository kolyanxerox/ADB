package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k30 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f20425OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f20426OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f20427OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f20428OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f20429OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f20430OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f20431OooO0oO;

    public k30(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.f20425OooO00o = str;
        this.f20426OooO0O0 = str2;
        this.f20427OooO0OO = str3;
        this.f20428OooO0Oo = i;
        this.f20430OooO0o0 = str4;
        this.f20429OooO0o = i2;
        this.f20431OooO0oO = z;
    }

    public final JSONObject OooO00o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f20425OooO00o);
        jSONObject.put("version", this.f20427OooO0OO);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f20426OooO0O0);
        }
        jSONObject.put("status", this.f20428OooO0Oo);
        jSONObject.put("description", this.f20430OooO0o0);
        jSONObject.put("initializationLatencyMillis", this.f20429OooO0o);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO0)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f20431OooO0oO);
        }
        return jSONObject;
    }
}

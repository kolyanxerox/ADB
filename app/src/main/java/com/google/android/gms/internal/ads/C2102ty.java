package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import com.ironsource.C3069e9;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ty */
/* loaded from: classes2.dex */
public final class C2102ty extends C2139uy {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f24527OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f24528OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f24529OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f24530OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f24531OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f24532OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final JSONObject f24533OooO0oo;

    public C2102ty(kd0 kd0Var, JSONObject jSONObject) {
        super(kd0Var);
        this.f24527OooO0O0 = zzbs.zzh(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f24528OooO0OO = zzbs.zzl(false, jSONObject, "allow_pub_owned_ad_view");
        this.f24529OooO0Oo = zzbs.zzl(false, jSONObject, C3069e9.f8386c, "allow_pub_rendering");
        this.f24531OooO0o0 = zzbs.zzl(false, jSONObject, "enable_omid");
        this.f24532OooO0oO = zzbs.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f24530OooO0o = jSONObject.optJSONObject("overlay") != null;
        this.f24533OooO0oo = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO00o)).booleanValue() ? jSONObject.optJSONObject("omid_settings") : null;
    }

    @Override // com.google.android.gms.internal.ads.C2139uy
    public final wd0 OooO00o() {
        JSONObject jSONObject = this.f24533OooO0oo;
        return jSONObject != null ? new wd0(jSONObject) : this.f24790OooO00o.o000oOoO;
    }

    @Override // com.google.android.gms.internal.ads.C2139uy
    public final String OooO0O0() {
        return this.f24532OooO0oO;
    }

    @Override // com.google.android.gms.internal.ads.C2139uy
    public final boolean OooO0OO() {
        return this.f24531OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.C2139uy
    public final boolean OooO0Oo() {
        return this.f24528OooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.C2139uy
    public final boolean OooO0o() {
        return this.f24530OooO0o;
    }

    @Override // com.google.android.gms.internal.ads.C2139uy
    public final boolean OooO0o0() {
        return this.f24529OooO0Oo;
    }
}

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tr */
/* loaded from: classes2.dex */
public final class C2095tr implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f24485OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1764kt f24486OooO0O0;

    public /* synthetic */ C2095tr(C1764kt c1764kt, int i) {
        this.f24485OooO00o = i;
        this.f24486OooO0O0 = c1764kt;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f24485OooO00o) {
            case 0:
                try {
                    return new JSONObject(this.f24486OooO0O0.OooO00o().f20508OooOoO);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new C2139uy(this.f24486OooO0O0.OooO00o());
        }
    }
}

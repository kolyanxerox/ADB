package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fy */
/* loaded from: classes2.dex */
public final class C1585fy implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f19134OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1548ey f19135OooO0O0;

    public /* synthetic */ C1585fy(C1548ey c1548ey, int i) {
        this.f19134OooO00o = i;
        this.f19135OooO0O0 = c1548ey;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f19134OooO00o) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f19135OooO0O0.f18708OooOo0o;
                ii0.Oooo000(jSONObject);
                return jSONObject;
            default:
                z00 z00Var = (z00) this.f19135OooO0O0.f18706OooOo;
                ii0.Oooo000(z00Var);
                return z00Var;
        }
    }
}

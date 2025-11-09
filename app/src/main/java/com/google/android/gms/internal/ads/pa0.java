package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class pa0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f23257OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f23258OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f23259OooO0OO;

    public /* synthetic */ pa0(int i, Object obj, Object obj2) {
        this.f23257OooO00o = i;
        this.f23258OooO0O0 = obj;
        this.f23259OooO0OO = obj2;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f23257OooO00o) {
            case 0:
                C1581fu c1581fu = (C1581fu) obj;
                JSONObject jSONObject = (JSONObject) this.f23259OooO0OO;
                if (jSONObject != null) {
                    c1581fu.f19126OooO0O0.putString("fwd_common_cld", jSONObject.toString());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        switch (this.f23257OooO00o) {
            case 0:
                Bundle bundle = ((C1581fu) obj).f19125OooO00o;
                JSONObject jSONObject = (JSONObject) this.f23258OooO0O0;
                if (jSONObject != null) {
                    bundle.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f23259OooO0OO;
                if (jSONObject2 != null) {
                    bundle.putString("fwd_common_cld", jSONObject2.toString());
                    break;
                }
                break;
            case 1:
                C1581fu c1581fu = (C1581fu) obj;
                c1581fu.f19125OooO00o.putString("rtb", (String) this.f23258OooO0O0);
                Bundle bundle2 = (Bundle) this.f23259OooO0OO;
                if (!bundle2.isEmpty()) {
                    c1581fu.f19125OooO00o.putBundle("adapter_initialization_status", bundle2);
                    break;
                }
                break;
            default:
                try {
                    JSONObject jSONObjectZzg = zzbs.zzg((JSONObject) obj, "pii");
                    jSONObjectZzg.put("doritos", (String) this.f23258OooO0O0);
                    jSONObjectZzg.put("doritos_v2", (String) this.f23259OooO0OO);
                    break;
                } catch (JSONException unused) {
                    zze.zza("Failed putting doritos string.");
                }
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }
}

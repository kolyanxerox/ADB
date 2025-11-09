package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class wa0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f25270OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f25271OooO0O0;

    public /* synthetic */ wa0(Object obj, int i) {
        this.f25270OooO00o = i;
        this.f25271OooO0O0 = obj;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        int i = this.f25270OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void zzb(Object obj) throws JSONException {
        boolean z;
        boolean z2;
        switch (this.f25270OooO00o) {
            case 0:
                C1581fu c1581fu = (C1581fu) obj;
                if (((jd0) this.f25271OooO0O0) != null) {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000O)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = c1581fu.f19125OooO00o;
                    jd0 jd0Var = (jd0) this.f25271OooO0O0;
                    synchronized (jd0Var.f20288OooO0OO) {
                        jd0Var.OooO0O0();
                        z = jd0Var.f20290OooO0o0 == 2;
                    }
                    bundle.putBoolean("render_in_browser", z);
                    Bundle bundle2 = c1581fu.f19125OooO00o;
                    jd0 jd0Var2 = (jd0) this.f25271OooO0O0;
                    synchronized (jd0Var2.f20288OooO0OO) {
                        jd0Var2.OooO0O0();
                        z2 = jd0Var2.f20290OooO0o0 == 3;
                    }
                    bundle2.putBoolean("disable_ml", z2);
                    return;
                }
                return;
            case 1:
                JSONObject jSONObject = (JSONObject) obj;
                wb0 wb0Var = (wb0) this.f25271OooO0O0;
                wb0Var.getClass();
                try {
                    jSONObject.put("gms_sdk_env", wb0Var.f25290OooO00o);
                    return;
                } catch (JSONException unused) {
                    zze.zza("Failed putting version constants.");
                    return;
                }
            case 2:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f25271OooO0O0));
                    return;
                } catch (JSONException unused2) {
                    zze.zza("Failed putting experiment ids.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", zzbc.zzb().zzj((HashMap) this.f25271OooO0O0));
                    return;
                } catch (JSONException e) {
                    zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
                    return;
                }
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }

    private final /* synthetic */ void OooO0OO(Object obj) {
    }

    private final /* synthetic */ void OooO0Oo(Object obj) {
    }
}

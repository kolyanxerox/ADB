package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.C3034d9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class x90 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f25570OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f25571OooO0O0;

    public /* synthetic */ x90(int i, Bundle bundle) {
        this.f25570OooO00o = i;
        this.f25571OooO0O0 = bundle;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f25570OooO00o) {
            case 2:
                C1581fu c1581fu = (C1581fu) obj;
                Bundle bundle = this.f25571OooO0O0;
                if (bundle != null) {
                    c1581fu.f19126OooO0O0.putAll(bundle);
                    break;
                }
                break;
            case 3:
                C1581fu c1581fu2 = (C1581fu) obj;
                Bundle bundle2 = this.f25571OooO0O0;
                if (!bundle2.isEmpty()) {
                    c1581fu2.f19126OooO0O0.putBundle("shared_pref", bundle2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        switch (this.f25570OooO00o) {
            case 0:
                C1581fu c1581fu = (C1581fu) obj;
                Bundle bundle = this.f25571OooO0O0;
                if (!bundle.isEmpty()) {
                    c1581fu.f19125OooO00o.putBundle("installed_adapter_data", bundle);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = ((C1581fu) obj).f19125OooO00o;
                Bundle bundleOooO0o = af0.OooO0o(bundle2, C3034d9.h.f8068G);
                bundleOooO0o.putBundle("android_mem_info", this.f25571OooO0O0);
                bundle2.putBundle(C3034d9.h.f8068G, bundleOooO0o);
                break;
            case 2:
                C1581fu c1581fu2 = (C1581fu) obj;
                Bundle bundle3 = this.f25571OooO0O0;
                if (bundle3 != null) {
                    c1581fu2.f19125OooO00o.putAll(bundle3);
                    break;
                }
                break;
            case 3:
                C1581fu c1581fu3 = (C1581fu) obj;
                Bundle bundle4 = this.f25571OooO0O0;
                if (!bundle4.isEmpty()) {
                    c1581fu3.f19125OooO00o.putBundle("shared_pref", bundle4);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle5 = this.f25571OooO0O0;
                if (bundle5 != null) {
                    try {
                        zzbs.zzg(zzbs.zzg(jSONObject, C3034d9.h.f8068G), "play_store").put("parental_controls", zzbc.zzb().zzi(bundle5));
                        break;
                    } catch (JSONException unused) {
                        zze.zza("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }

    private final /* synthetic */ void OooO00o(Object obj) {
    }

    private final /* synthetic */ void OooO0O0(Object obj) {
    }

    private final /* synthetic */ void OooO0OO(Object obj) {
    }
}

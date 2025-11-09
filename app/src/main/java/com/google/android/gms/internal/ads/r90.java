package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r90 implements jb0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f23808OooO00o;

    /* renamed from: OooO0O0 */
    public final String f23809OooO0O0;

    public /* synthetic */ r90(String str, int i) {
        this.f23808OooO00o = i;
        this.f23809OooO0O0 = str;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        int i = this.f23808OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        switch (this.f23808OooO00o) {
            case 0:
                C1581fu c1581fu = (C1581fu) obj;
                String str = this.f23809OooO0O0;
                if (str != null) {
                    c1581fu.f19125OooO00o.putString("arek", str);
                    break;
                }
                break;
            case 1:
                ((C1581fu) obj).f19125OooO00o.putString("ms", this.f23809OooO0O0);
                break;
            case 2:
                af0.OooOooo("key_schema", ((C1581fu) obj).f19125OooO00o, this.f23809OooO0O0);
                break;
            case 3:
                af0.OooOooo("omid_v", ((C1581fu) obj).f19125OooO00o, this.f23809OooO0O0);
                break;
            case 4:
                try {
                    ((JSONObject) obj).put("ms", this.f23809OooO0O0);
                    break;
                } catch (JSONException e) {
                    zze.zzb("Failed putting Ad ID.", e);
                    return;
                }
            default:
                String str2 = this.f23809OooO0O0;
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        zzbs.zzg(jSONObject, "pii").put("adsid", str2);
                        break;
                    }
                } catch (JSONException e2) {
                    zzo.zzk("Failed putting trustless token.", e2);
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

    private final /* synthetic */ void OooO0Oo(Object obj) {
    }

    private final /* synthetic */ void OooO0o(Object obj) {
    }

    private final /* synthetic */ void OooO0o0(Object obj) {
    }
}

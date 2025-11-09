package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class da0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f18218OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f18219OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f18220OooO0OO;

    public /* synthetic */ da0(String str, int i, int i2) {
        this.f18218OooO00o = i2;
        this.f18219OooO0O0 = str;
        this.f18220OooO0OO = i;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        switch (this.f18218OooO00o) {
            case 1:
                ((C1581fu) obj).f19126OooO0O0.putString("request_id", this.f18219OooO0O0);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws JSONException {
        int i;
        int i2;
        switch (this.f18218OooO00o) {
            case 0:
                Bundle bundle = ((C1581fu) obj).f19125OooO00o;
                String str = this.f18219OooO0O0;
                if (!TextUtils.isEmpty(str) && (i = this.f18220OooO0OO) != -1) {
                    Bundle bundleOooO0o = af0.OooO0o(bundle, "pii");
                    bundle.putBundle("pii", bundleOooO0o);
                    bundleOooO0o.putString("pvid", str);
                    bundleOooO0o.putInt("pvid_s", i);
                    break;
                }
                break;
            case 1:
                C1581fu c1581fu = (C1581fu) obj;
                c1581fu.f19125OooO00o.putString("request_id", this.f18219OooO0O0);
                if (this.f18220OooO0OO == 2) {
                    c1581fu.f19125OooO00o.putInt("sod", 1);
                    break;
                }
                break;
            case 2:
                C1581fu c1581fu2 = (C1581fu) obj;
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOo0o0)).booleanValue()) {
                    String str2 = this.f18219OooO0O0;
                    if (!TextUtils.isEmpty(str2)) {
                        c1581fu2.f19125OooO00o.putString("topics", str2);
                    }
                    int i3 = this.f18220OooO0OO;
                    if (i3 != -1) {
                        c1581fu2.f19125OooO00o.putInt("atps", i3);
                        break;
                    }
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f18219OooO0O0;
                if (!TextUtils.isEmpty(str3) && (i2 = this.f18220OooO0OO) != -1) {
                    try {
                        JSONObject jSONObjectZzg = zzbs.zzg(jSONObject, "pii");
                        jSONObjectZzg.put("pvid", str3);
                        jSONObjectZzg.put("pvid_s", i2);
                        break;
                    } catch (JSONException e) {
                        zze.zzb("Failed putting gms core app set ID info.", e);
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

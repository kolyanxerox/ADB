package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class tb0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AdvertisingIdClient.Info f24293OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f24294OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OoooOOO.o0O0O0O f24295OooO0OO;

    public tb0(AdvertisingIdClient.Info info, String str, OoooOOO.o0O0O0O o0o0o0o) {
        this.f24293OooO00o = info;
        this.f24294OooO0O0 = str;
        this.f24295OooO0OO = o0o0o0o;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void zzb(Object obj) throws JSONException {
        OoooOOO.o0O0O0O o0o0o0o = this.f24295OooO0OO;
        try {
            JSONObject jSONObjectZzg = zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f24293OooO00o;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f24294OooO0O0;
                if (str != null) {
                    jSONObjectZzg.put("pdid", str);
                    jSONObjectZzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzg.put("rdid", info.getId());
            jSONObjectZzg.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzg.put("idtype", "adid");
            String str2 = (String) o0o0o0o.f14388OooOo0o;
            long j = o0o0o0o.f14387OooOo0O;
            if (str2 != null && j > 0) {
                jSONObjectZzg.put("paidv1_id_android_3p", str2);
                jSONObjectZzg.put("paidv1_creation_time_android_3p", j);
            }
        } catch (JSONException e) {
            zze.zzb("Failed putting Ad ID.", e);
        }
    }
}

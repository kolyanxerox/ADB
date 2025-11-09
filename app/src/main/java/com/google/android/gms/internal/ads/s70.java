package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzm;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class s70 implements i60 {
    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) {
        return !TextUtils.isEmpty(kd0Var.f20506OooOo0O.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) {
        JSONObject jSONObject = kd0Var.f20506OooOo0O;
        String strOptString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        vd0 vd0Var = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
        ud0 ud0Var = new ud0();
        ud0Var.f24637OooOOOO.f13884OooOo0o = vd0Var.f24963OooOOOO.f13884OooOo0o;
        zzm zzmVar = vd0Var.f24954OooO0Oo;
        ud0Var.f24625OooO00o = zzmVar;
        ud0Var.f24626OooO0O0 = vd0Var.f24956OooO0o0;
        ud0Var.OooOo0 = vd0Var.f24968OooOo00;
        ud0Var.f24627OooO0OO = vd0Var.f24955OooO0o;
        ud0Var.f24628OooO0Oo = vd0Var.f24951OooO00o;
        ud0Var.f24629OooO0o = vd0Var.f24957OooO0oO;
        ud0Var.f24631OooO0oO = vd0Var.f24958OooO0oo;
        ud0Var.f24632OooO0oo = vd0Var.f24950OooO;
        ud0Var.f24624OooO = vd0Var.f24959OooOO0;
        AdManagerAdViewOptions adManagerAdViewOptions = vd0Var.OooOO0o;
        ud0Var.f24633OooOO0 = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            ud0Var.f24630OooO0o0 = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        PublisherAdViewOptions publisherAdViewOptions = vd0Var.f24962OooOOO0;
        ud0Var.f24634OooOO0O = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            ud0Var.f24630OooO0o0 = publisherAdViewOptions.zzc();
            ud0Var.OooOO0o = publisherAdViewOptions.zza();
        }
        ud0Var.f24638OooOOOo = vd0Var.f24964OooOOOo;
        ud0Var.f24640OooOOo0 = vd0Var.f24966OooOOo0;
        ud0Var.f24639OooOOo = vd0Var.f24953OooO0OO;
        ud0Var.f24641OooOOoo = vd0Var.f24965OooOOo;
        ud0Var.f24642OooOo00 = vd0Var.f24967OooOOoo;
        ud0Var.f24627OooO0OO = strOptString;
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = kd0Var.f20513OooOooO;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        Bundle bundle5 = bundle2;
        ud0Var.f24625OooO00o = new zzm(zzmVar.zza, zzmVar.zzb, bundle4, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundle5, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz);
        vd0 vd0VarOooO00o = ud0Var.OooO00o();
        Bundle bundle6 = new Bundle();
        C2051sk c2051sk = rd0Var.f23849OooO0O0;
        Bundle bundle7 = new Bundle();
        md0 md0Var = (md0) c2051sk.f24096OooOo;
        bundle7.putStringArrayList("nofill_urls", new ArrayList<>(md0Var.f21204OooO00o));
        bundle7.putInt("refresh_interval", md0Var.f21206OooO0OO);
        bundle7.putString("gws_query_id", md0Var.f21205OooO0O0);
        bundle6.putBundle("parent_common_config", bundle7);
        vd0 vd0Var2 = (vd0) rd0Var.f23848OooO00o.f23325OooOo0o;
        Bundle bundle8 = new Bundle();
        bundle8.putString("initial_ad_unit_id", vd0Var2.f24955OooO0o);
        bundle8.putString("allocation_id", kd0Var.f20507OooOo0o);
        bundle8.putString("ad_source_name", kd0Var.f20517Oooo000);
        bundle8.putStringArrayList("click_urls", new ArrayList<>(kd0Var.f20489OooO0OO));
        bundle8.putStringArrayList("imp_urls", new ArrayList<>(kd0Var.f20490OooO0Oo));
        bundle8.putStringArrayList("manual_tracking_urls", new ArrayList<>(kd0Var.f20500OooOOOo));
        bundle8.putStringArrayList("fill_urls", new ArrayList<>(kd0Var.f20498OooOOO0));
        bundle8.putStringArrayList("video_start_urls", new ArrayList<>(kd0Var.f20493OooO0oO));
        bundle8.putStringArrayList("video_reward_urls", new ArrayList<>(kd0Var.f20494OooO0oo));
        bundle8.putStringArrayList("video_complete_urls", new ArrayList<>(kd0Var.f20486OooO));
        bundle8.putString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, kd0Var.f20495OooOO0);
        bundle8.putString("valid_from_timestamp", kd0Var.f20496OooOO0O);
        bundle8.putBoolean("is_closable_area_disabled", kd0Var.f20515Oooo);
        bundle8.putString("recursive_server_response_data", kd0Var.f20547o00Ooo);
        bundle8.putBoolean("is_analytics_logging_enabled", kd0Var.f20531OoooOOO);
        C1865nj c1865nj = kd0Var.OooOO0o;
        if (c1865nj != null) {
            Bundle bundle9 = new Bundle();
            bundle9.putInt("rb_amount", c1865nj.zzb);
            bundle9.putString("rb_type", c1865nj.zza);
            bundle8.putParcelableArray("rewards", new Bundle[]{bundle9});
        }
        bundle6.putBundle("parent_ad_config", bundle8);
        return OooO0OO(vd0VarOooO00o, bundle6, kd0Var, rd0Var);
    }

    public abstract df0 OooO0OO(vd0 vd0Var, Bundle bundle, kd0 kd0Var, rd0 rd0Var);
}

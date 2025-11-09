package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.ironsource.C3451ne;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class p90 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final vd0 f23248OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f23249OooO0O0;

    public p90(vd0 vd0Var, long j) {
        this.f23248OooO00o = vd0Var;
        this.f23249OooO0O0 = j;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void zza(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19126OooO0O0;
        vd0 vd0Var = this.f23248OooO00o;
        bundle.putString("slotname", vd0Var.f24955OooO0o);
        zzm zzmVar = vd0Var.f24954OooO0Oo;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.zzg;
        af0.o000oOoO(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzmVar.zza >= 8) {
            int i2 = zzmVar.zzt;
            af0.o000oOoO(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        af0.OooOooo("url", bundle, zzmVar.zzl);
        af0.Oooo0oo(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = (Bundle) zzmVar.zzc.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0Ooo0)).split(",", -1)));
        for (String str : zzmVar.zzc.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        vd0 vd0Var = this.f23248OooO00o;
        zzm zzmVar = vd0Var.f24954OooO0Oo;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", vd0Var.f24955OooO0o);
        int i = vd0Var.f24963OooOOOO.f13884OooOo0o;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f23249OooO0O0);
        af0.Oooooo0(bundle, "is_sdk_preload", true, zzmVar.zzb());
        af0.Ooooo0o(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzmVar.zzb)), zzmVar.zzb != -1);
        Bundle bundle2 = zzmVar.zzc;
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i3 = zzmVar.zzd;
        af0.o000oOoO(bundle, "cust_gender", i3, i3 != -1);
        af0.Oooo0oo(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        af0.o000oOoO(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        af0.o000oOoO(bundle, "d_imp_hdr", 1, zzmVar.zza >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        af0.Ooooo0o(bundle, "ppid", str, zzmVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong(C3451ne.f10511s, (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        af0.OooOooo("url", bundle, zzmVar.zzl);
        af0.Oooo0oo(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle4 = zzmVar.zzn;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        af0.Oooo0oo(bundle, "category_exclusions", zzmVar.zzo);
        af0.OooOooo("request_agent", bundle, zzmVar.zzp);
        af0.OooOooo("request_pkg", bundle, zzmVar.zzq);
        af0.Oooooo0(bundle, "is_designed_for_families", zzmVar.zzr, zzmVar.zza >= 7);
        if (zzmVar.zza >= 8) {
            int i5 = zzmVar.zzt;
            af0.o000oOoO(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            af0.OooOooo("max_ad_content_rating", bundle, zzmVar.zzu);
        }
    }
}

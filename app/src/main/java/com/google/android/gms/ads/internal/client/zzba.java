package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.p008h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.C1452cb;
import com.google.android.gms.internal.ads.C1489db;
import com.google.android.gms.internal.ads.C1498dk;
import com.google.android.gms.internal.ads.C1752kh;
import com.google.android.gms.internal.ads.InterfaceC1499dl;
import com.google.android.gms.internal.ads.InterfaceC1605gh;
import com.google.android.gms.internal.ads.InterfaceC1674ic;
import com.google.android.gms.internal.ads.InterfaceC1863nh;
import com.google.android.gms.internal.ads.InterfaceC1892o9;
import com.google.android.gms.internal.ads.InterfaceC2050sj;
import com.google.android.gms.internal.ads.InterfaceC2114u9;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzba {

    /* renamed from: OooO00o */
    public final zzk f16001OooO00o;

    /* renamed from: OooO0O0 */
    public final zzi f16002OooO0O0;

    /* renamed from: OooO0OO */
    public final zzfe f16003OooO0OO;

    /* renamed from: OooO0Oo */
    public final C1452cb f16004OooO0Oo;

    /* renamed from: OooO0o */
    public final C1489db f16005OooO0o;

    /* renamed from: OooO0o0 */
    public final C1752kh f16006OooO0o0;

    /* renamed from: OooO0oO */
    public final zzl f16007OooO0oO;

    public zzba(zzk zzkVar, zzi zziVar, zzfe zzfeVar, C1452cb c1452cb, C1498dk c1498dk, C1752kh c1752kh, C1489db c1489db, zzl zzlVar) {
        this.f16001OooO00o = zzkVar;
        this.f16002OooO0O0 = zziVar;
        this.f16003OooO0OO = zzfeVar;
        this.f16004OooO0Oo = c1452cb;
        this.f16006OooO0o0 = c1752kh;
        this.f16005OooO0o = c1489db;
        this.f16007OooO0oO = zzlVar;
    }

    public static /* bridge */ /* synthetic */ void OooO00o(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbc.zzb().zzn(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zzd(Context context, String str, InterfaceC2156ve interfaceC2156ve) {
        return (zzbu) new zzar(this, context, str, interfaceC2156ve).zzd(context, false);
    }

    public final zzby zze(Context context, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve) {
        return (zzby) new zzan(this, context, zzsVar, str, interfaceC2156ve).zzd(context, false);
    }

    public final zzby zzf(Context context, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve) {
        return (zzby) new zzap(this, context, zzsVar, str, interfaceC2156ve).zzd(context, false);
    }

    public final zzci zzg(Context context, InterfaceC2156ve interfaceC2156ve) {
        return (zzci) new zzat(this, context, interfaceC2156ve).zzd(context, false);
    }

    @Nullable
    public final zzdu zzh(Context context, InterfaceC2156ve interfaceC2156ve) {
        return (zzdu) new zzaf(context, interfaceC2156ve).zzd(context, false);
    }

    public final InterfaceC1892o9 zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (InterfaceC1892o9) new zzax(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final InterfaceC2114u9 zzk(View view, HashMap map, HashMap map2) {
        return (InterfaceC2114u9) new zzaz(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final InterfaceC1674ic zzn(Context context, InterfaceC2156ve interfaceC2156ve, OnH5AdsEventListener onH5AdsEventListener) {
        return (InterfaceC1674ic) new zzal(context, interfaceC2156ve, onH5AdsEventListener).zzd(context, false);
    }

    @Nullable
    public final InterfaceC1605gh zzo(Context context, InterfaceC2156ve interfaceC2156ve) {
        return (InterfaceC1605gh) new zzaj(context, interfaceC2156ve).zzd(context, false);
    }

    @Nullable
    public final InterfaceC1863nh zzq(Activity activity) {
        zzad zzadVar = new zzad(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (InterfaceC1863nh) zzadVar.zzd(activity, booleanExtra);
    }

    public final InterfaceC2050sj zzs(Context context, String str, InterfaceC2156ve interfaceC2156ve) {
        return (InterfaceC2050sj) new zzab(context, str, interfaceC2156ve).zzd(context, false);
    }

    @Nullable
    public final InterfaceC1499dl zzt(Context context, InterfaceC2156ve interfaceC2156ve) {
        return (InterfaceC1499dl) new zzah(context, interfaceC2156ve).zzd(context, false);
    }
}

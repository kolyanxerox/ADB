package com.google.android.gms.ads.internal;

import Oooo0OO.oo000o;
import Oooo0o0.OooOO0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1565fe;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1548ey;
import com.google.android.gms.internal.ads.C1602ge;
import com.google.android.gms.internal.ads.C1676ie;
import com.google.android.gms.internal.ads.C1867nl;
import com.google.android.gms.internal.ads.C2007rd;
import com.google.android.gms.internal.ads.C2148v6;
import com.google.android.gms.internal.ads.C2163vl;
import com.google.android.gms.internal.ads.dp0;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.lp0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.or0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.yp0;
import com.google.android.gms.internal.ads.ze0;
import o00000oO.OooOOO;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzf {

    /* renamed from: OooO00o, reason: collision with root package name */
    public Context f16325OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f16326OooO0O0 = 0;

    public static final void OooO0O0(h20 h20Var, String str, long j) {
        if (h20Var != null) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O0O)).booleanValue()) {
                C1548ey c1548eyOooO00o = h20Var.OooO00o();
                c1548eyOooO00o.OooO0oO("action", "lat_init");
                c1548eyOooO00o.OooO0oO(str, Long.toString(j));
                c1548eyOooO00o.OooOOO0();
            }
        }
    }

    public final void OooO00o(Context context, VersionInfoParcel versionInfoParcel, boolean z, C1867nl c1867nl, String str, String str2, Runnable runnable, final nf0 nf0Var, final h20 h20Var, final Long l) throws JSONException {
        jf0 jf0Var;
        Exception exc;
        JSONObject jSONObject;
        PackageInfo packageInfoOooO0OO;
        int i = 0;
        ((oo000o) zzv.zzC()).getClass();
        if (SystemClock.elapsedRealtime() - this.f16326OooO0O0 < 5000) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        ((oo000o) zzv.zzC()).getClass();
        this.f16326OooO0O0 = SystemClock.elapsedRealtime();
        if (c1867nl != null && !TextUtils.isEmpty(c1867nl.f21508OooO0o0)) {
            long j = c1867nl.f21507OooO0o;
            ((oo000o) zzv.zzC()).getClass();
            if (System.currentTimeMillis() - j <= ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoOo)).longValue() && c1867nl.f21510OooO0oo) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f16325OooO00o = applicationContext;
        final jf0 jf0VarOooO0oO = ze0.OooO0oO(context, 4);
        jf0VarOooO0oO.zzi();
        C1602ge c1602geOooO00o = zzv.zzg().OooO00o(this.f16325OooO00o, versionInfoParcel, nf0Var);
        C2007rd c2007rd = AbstractC1565fe.f18933OooO0O0;
        C1676ie c1676ieOooO00o = c1602geOooO00o.OooO00o("google.afma.config.fetchAppSettings", c2007rd, c2007rd);
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
            jf0Var = jf0VarOooO0oO;
            exc = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", exc);
            jf0Var.OooO0Oo(exc);
            jf0Var.OooOO0(false);
            nf0Var.OooO0O0(jf0Var.zzm());
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            C2148v6 c2148v6 = AbstractC1448c7.f17710OooO00o;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbe.zza().OooO00o()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.f16325OooO00o.getApplicationInfo();
                if (applicationInfo != null && (packageInfoOooO0OO = OooOO0.OooO00o(context).OooO0OO(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoOooO0OO.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            OooOOO oooOOOOooO00o = c1676ieOooO00o.OooO00o(jSONObject);
            try {
                lp0 lp0Var = new lp0(this) { // from class: com.google.android.gms.ads.internal.zzd
                    @Override // com.google.android.gms.internal.ads.lp0
                    public final OooOOO zza(Object obj) throws JSONException {
                        Long l2 = l;
                        h20 h20Var2 = h20Var;
                        nf0 nf0Var2 = nf0Var;
                        jf0 jf0Var2 = jf0VarOooO0oO;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (zOptBoolean) {
                            zzv.zzp().OooO0Oo().zzs(jSONObject2.getString("appSettingsJson"));
                            if (l2 != null) {
                                ((oo000o) zzv.zzC()).getClass();
                                zzf.OooO0O0(h20Var2, "cld_s", SystemClock.elapsedRealtime() - l2.longValue());
                            }
                        }
                        jf0Var2.OooOO0(zOptBoolean);
                        nf0Var2.OooO0O0(jf0Var2.zzm());
                        return yp0.f25991OooOo0o;
                    }
                };
                jf0Var = jf0VarOooO0oO;
                try {
                    C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
                    dp0 dp0VarOoOO = ii0.ooOO(oooOOOOooO00o, lp0Var, c2163vl);
                    if (runnable != null) {
                        oooOOOOooO00o.addListener(runnable, c2163vl);
                    }
                    if (l != null) {
                        oooOOOOooO00o.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                            @Override // java.lang.Runnable
                            public final void run() {
                                h20 h20Var2 = h20Var;
                                Long l2 = l;
                                ((oo000o) zzv.zzC()).getClass();
                                zzf.OooO0O0(h20Var2, "cld_r", SystemClock.elapsedRealtime() - l2.longValue());
                            }
                        }, c2163vl);
                    }
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o0Oo)).booleanValue()) {
                        dp0VarOoOO.addListener(new wp0(i, dp0VarOoOO, new or0("ConfigLoader.maybeFetchNewAppSettings", 3)), c2163vl);
                    } else {
                        ze0.OooOOo0(dp0VarOoOO, "ConfigLoader.maybeFetchNewAppSettings");
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", exc);
                    jf0Var.OooO0Oo(exc);
                    jf0Var.OooOO0(false);
                    nf0Var.OooO0O0(jf0Var.zzm());
                }
            } catch (Exception e3) {
                e = e3;
                jf0Var = jf0VarOooO0oO;
            }
        } catch (Exception e4) {
            exc = e4;
            jf0Var = jf0VarOooO0oO;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", exc);
            jf0Var.OooO0Oo(exc);
            jf0Var.OooOO0(false);
            nf0Var.OooO0O0(jf0Var.zzm());
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, nf0 nf0Var, @Nullable h20 h20Var, @Nullable Long l) {
        OooO00o(context, versionInfoParcel, true, null, str, null, runnable, nf0Var, h20Var, l);
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, C1867nl c1867nl, nf0 nf0Var) throws JSONException {
        OooO00o(context, versionInfoParcel, false, c1867nl, c1867nl != null ? c1867nl.f21506OooO0Oo : null, str, null, nf0Var, null, null);
    }
}

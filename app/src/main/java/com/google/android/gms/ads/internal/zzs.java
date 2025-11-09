package com.google.android.gms.ads.internal;

import Oooo0o0.OooOO0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.internal.ads.AbstractC2149v7;
import com.ironsource.C3034d9;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class zzs {

    /* renamed from: OooO00o */
    public final Context f16347OooO00o;

    /* renamed from: OooO0O0 */
    public final String f16348OooO0O0;

    /* renamed from: OooO0OO */
    public final TreeMap f16349OooO0OO = new TreeMap();

    /* renamed from: OooO0Oo */
    public String f16350OooO0Oo;

    /* renamed from: OooO0o */
    public final String f16351OooO0o;

    /* renamed from: OooO0o0 */
    public String f16352OooO0o0;

    public zzs(Context context, String str) {
        String strConcat;
        this.f16347OooO00o = context.getApplicationContext();
        this.f16348OooO0O0 = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + OooOO0.OooO00o(context).OooO0OO(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f16351OooO0o = strConcat;
    }

    public final String zza() {
        return this.f16351OooO0o;
    }

    public final String zzb() {
        return this.f16352OooO0o0;
    }

    public final String zzc() {
        return this.f16348OooO0O0;
    }

    public final String zzd() {
        return this.f16350OooO0Oo;
    }

    public final Map zze() {
        return this.f16349OooO0OO;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, VersionInfoParcel versionInfoParcel) {
        TreeMap treeMap;
        this.f16350OooO0Oo = zzmVar.zzj.zza;
        Bundle bundle = zzmVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) AbstractC2149v7.f24869OooO0OO.OooOOO();
        Iterator<String> it = bundle2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            treeMap = this.f16349OooO0OO;
            if (!zHasNext) {
                break;
            }
            String next = it.next();
            if (str.equals(next)) {
                this.f16352OooO0o0 = bundle2.getString(next);
            } else if (next.startsWith("csa_")) {
                treeMap.put(next.substring(4), bundle2.getString(next));
            }
        }
        treeMap.put(C3034d9.i.f8203q, versionInfoParcel.afmaVersion);
        if (((Boolean) AbstractC2149v7.f24867OooO00o.OooOOO()).booleanValue()) {
            Bundle bundleZzb = zzad.zzb(this.f16347OooO00o, (String) AbstractC2149v7.f24868OooO0O0.OooOOO());
            for (String str2 : bundleZzb.keySet()) {
                treeMap.put(str2, bundleZzb.get(str2).toString());
            }
        }
    }
}

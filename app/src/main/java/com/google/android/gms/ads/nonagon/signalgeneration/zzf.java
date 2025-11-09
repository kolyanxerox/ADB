package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0o0.OooOO0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzf {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f16595OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ApplicationInfo f16596OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f16597OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final VersionInfoParcel f16598OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final JSONObject f16600OooO0o0 = new JSONObject();

    /* renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f16599OooO0o = new AtomicBoolean(false);

    public zzf(Context context, ArrayList arrayList, VersionInfoParcel versionInfoParcel) {
        this.f16595OooO00o = context;
        this.f16596OooO0O0 = context.getApplicationInfo();
        this.f16597OooO0OO = arrayList;
        this.f16598OooO0Oo = versionInfoParcel;
    }

    public final JSONObject zza() {
        if (!this.f16599OooO0o.get()) {
            zzb();
        }
        return this.f16600OooO0o0;
    }

    public final void zzb() {
        if (this.f16599OooO0o.getAndSet(true)) {
            return;
        }
        ApplicationInfo applicationInfo = this.f16596OooO0O0;
        PackageInfo packageInfoOooO0OO = null;
        if (applicationInfo != null) {
            try {
                packageInfoOooO0OO = OooOO0.OooO00o(this.f16595OooO00o).OooO0OO(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f16600OooO0o0;
        if (packageInfoOooO0OO != null) {
            try {
                jSONObject.put("vc", packageInfoOooO0OO.versionCode);
                jSONObject.put("vnm", packageInfoOooO0OO.versionName);
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("PawAppSignalGenerator.initialize", e);
                return;
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f16597OooO0OO;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoO0O)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f16598OooO0Oo.afmaVersion);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}

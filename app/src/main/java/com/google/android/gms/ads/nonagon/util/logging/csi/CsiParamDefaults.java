package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C2148v6;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class CsiParamDefaults {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f16644OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f16645OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f16646OooO0OO;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        this.f16644OooO00o = context;
        this.f16645OooO0O0 = context.getPackageName();
        this.f16646OooO0OO = versionInfoParcel.afmaVersion;
    }

    public void set(@NonNull Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(C3451ne.f10411E, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzv.zzq();
        map.put(C3034d9.h.f8068G, zzs.zzs());
        map.put("app", this.f16645OooO0O0);
        zzv.zzq();
        Context context = this.f16644OooO00o;
        map.put("is_lite_sdk", true != zzs.zzF(context) ? "0" : "1");
        C2148v6 c2148v6 = AbstractC1448c7.f17710OooO00o;
        ArrayList arrayListOooO0O0 = zzbe.zza().OooO0O0();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oO0Ooo)).booleanValue()) {
            arrayListOooO0O0.addAll(zzv.zzp().OooO0Oo().zzg().f21502OooO);
        }
        map.put("e", TextUtils.join(",", arrayListOooO0O0));
        map.put("sdkVersion", this.f16646OooO0OO);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo00)).booleanValue()) {
            zzv.zzq();
            map.put("is_bstar", true != zzs.zzC(context) ? "0" : "1");
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoo0)).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17854o000oooo)).booleanValue()) {
                String str = zzv.zzp().f23634OooO0oO;
                if (str == null) {
                    str = "";
                }
                map.put(C3451ne.f10425K, str);
            }
        }
    }
}

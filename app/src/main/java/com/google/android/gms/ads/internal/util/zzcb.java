package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzcb {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f16257OooO00o = new HashMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f16258OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Context f16259OooO0OO;

    public zzcb(Context context) {
        this.f16259OooO0OO = context;
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0oOo0o0)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            Map mapZzw = zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0OoO));
            for (String str : mapZzw.keySet()) {
                synchronized (this) {
                    try {
                        if (!this.f16257OooO00o.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f16259OooO0OO) : this.f16259OooO0OO.getSharedPreferences(str, 0);
                            zzca zzcaVar = new zzca(this, str);
                            this.f16257OooO00o.put(str, zzcaVar);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzbz zzbzVar = new zzbz(mapZzw);
            synchronized (this) {
                this.f16258OooO0O0.add(zzbzVar);
            }
        }
    }
}

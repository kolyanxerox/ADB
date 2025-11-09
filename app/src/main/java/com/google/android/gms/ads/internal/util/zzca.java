package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzca implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: OooO00o */
    public final String f16255OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ zzcb f16256OooO0O0;

    public zzca(zzcb zzcbVar, String str) {
        this.f16256OooO0O0 = zzcbVar;
        this.f16255OooO00o = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f16256OooO0O0) {
            try {
                ArrayList arrayList = this.f16256OooO0O0.f16258OooO0O0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str2 = this.f16255OooO00o;
                    Map map = ((zzbz) obj).zza;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        com.google.android.gms.ads.internal.zzv.zzp().OooO0Oo().zzE(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

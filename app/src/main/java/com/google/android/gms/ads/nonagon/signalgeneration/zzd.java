package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzd {

    /* renamed from: OooO00o, reason: collision with root package name */
    public SharedPreferences f16590OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public SharedPreferences.Editor f16591OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Context f16592OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f16593OooO0Oo = new Object();

    public zzd(Context context) {
        this.f16592OooO0OO = context;
    }

    public final void OooO00o() {
        synchronized (this.f16593OooO0Oo) {
            try {
                if (this.f16590OooO00o != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f16592OooO0OO.getSharedPreferences("query_info_shared_prefs", 0);
                this.f16590OooO00o = sharedPreferences;
                this.f16591OooO0O0 = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        int i;
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            i = this.f16590OooO00o.getInt("aav", -1);
        }
        return i;
    }

    public final int zzb() {
        int i;
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            i = this.f16590OooO00o.getInt("vc", -1);
        }
        return i;
    }

    @Nullable
    public final String zzc(String str) {
        String string;
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            string = this.f16590OooO00o.getString(str, null);
            this.f16591OooO0O0.remove(str).commit();
        }
        return string;
    }

    @Nullable
    public final String zzd() {
        String string;
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            string = this.f16590OooO00o.getString("dm", null);
        }
        return string;
    }

    @Nullable
    public final String zze() {
        String string;
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            string = this.f16590OooO00o.getString("pn", null);
        }
        return string;
    }

    public final Map zzf() {
        HashMap map;
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            try {
                Map<String, ?> all = this.f16590OooO00o.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public final void zzg() {
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            this.f16591OooO0O0.clear().commit();
        }
    }

    public final void zzh(String str, String str2) {
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            this.f16591OooO0O0.putString(str, str2).commit();
        }
    }

    public final void zzi(String str, int i, String str2, int i2) {
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            this.f16591OooO0O0.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i2).commit();
        }
    }

    public final boolean zzj(String str) {
        boolean zContains;
        OooO00o();
        synchronized (this.f16593OooO0Oo) {
            zContains = this.f16590OooO00o.contains(str);
        }
        return zContains;
    }
}

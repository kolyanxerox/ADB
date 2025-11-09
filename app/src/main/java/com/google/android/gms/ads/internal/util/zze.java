package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC1706j8;
import com.google.android.gms.internal.ads.gl0;
import com.google.android.gms.internal.ads.hl0;
import com.google.android.gms.internal.ads.ni0;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static void zza(String str) {
        if (!zzc()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        ni0 ni0Var = com.google.android.gms.ads.internal.util.client.zzo.f16190OooO00o;
        Iterator itOooO0Oo = ((hl0) ni0Var.f21493OooOo0o).OooO0Oo(ni0Var, str);
        boolean z = true;
        while (true) {
            gl0 gl0Var = (gl0) itOooO0Oo;
            if (!gl0Var.hasNext()) {
                return;
            }
            String str2 = (String) gl0Var.next();
            if (z) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzb(String str, Throwable th) {
        if (zzc()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean zzc() {
        return com.google.android.gms.ads.internal.util.client.zzo.zzm(2) && ((Boolean) AbstractC1706j8.f20223OooO00o.OooOOO()).booleanValue();
    }
}

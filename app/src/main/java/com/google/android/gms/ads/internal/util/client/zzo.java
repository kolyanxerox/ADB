package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.el0;
import com.google.android.gms.internal.ads.gl0;
import com.google.android.gms.internal.ads.hl0;
import com.google.android.gms.internal.ads.ni0;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class zzo {

    /* renamed from: OooO00o */
    public static final ni0 f16190OooO00o = new ni0(new el0(0), 1);

    public static String OooO00o(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void zze(String str) {
        if (!zzm(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        ni0 ni0Var = f16190OooO00o;
        Iterator itOooO0Oo = ((hl0) ni0Var.f21493OooOo0o).OooO0Oo(ni0Var, str);
        boolean z = true;
        while (true) {
            gl0 gl0Var = (gl0) itOooO0Oo;
            if (!gl0Var.hasNext()) {
                return;
            }
            String str2 = (String) gl0Var.next();
            if (z) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzf(String str, Throwable th) {
        if (zzm(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void zzg(String str) {
        if (!zzm(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        ni0 ni0Var = f16190OooO00o;
        Iterator itOooO0Oo = ((hl0) ni0Var.f21493OooOo0o).OooO0Oo(ni0Var, str);
        boolean z = true;
        while (true) {
            gl0 gl0Var = (gl0) itOooO0Oo;
            if (!gl0Var.hasNext()) {
                return;
            }
            String str2 = (String) gl0Var.next();
            if (z) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzh(String str, Throwable th) {
        if (zzm(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void zzi(String str) {
        if (!zzm(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        ni0 ni0Var = f16190OooO00o;
        Iterator itOooO0Oo = ((hl0) ni0Var.f21493OooOo0o).OooO0Oo(ni0Var, str);
        boolean z = true;
        while (true) {
            gl0 gl0Var = (gl0) itOooO0Oo;
            if (!gl0Var.hasNext()) {
                return;
            }
            String str2 = (String) gl0Var.next();
            if (z) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzj(String str) {
        if (!zzm(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        ni0 ni0Var = f16190OooO00o;
        Iterator itOooO0Oo = ((hl0) ni0Var.f21493OooOo0o).OooO0Oo(ni0Var, str);
        boolean z = true;
        while (true) {
            gl0 gl0Var = (gl0) itOooO0Oo;
            if (!gl0Var.hasNext()) {
                return;
            }
            String str2 = (String) gl0Var.next();
            if (z) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z = false;
        }
    }

    public static void zzk(String str, Throwable th) {
        if (zzm(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void zzl(String str, @Nullable Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(OooO00o(str), th);
            } else {
                zzj(OooO00o(str));
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}

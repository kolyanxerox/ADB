package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.p30;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o00000oO.OooOOO;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzay {

    /* renamed from: OooO0oO */
    public p30 f16220OooO0oO;

    /* renamed from: OooO00o */
    public final Object f16214OooO00o = new Object();

    /* renamed from: OooO0O0 */
    public String f16215OooO0O0 = "";

    /* renamed from: OooO0OO */
    public String f16216OooO0OO = "";

    /* renamed from: OooO0Oo */
    public boolean f16217OooO0Oo = false;

    /* renamed from: OooO0o0 */
    public boolean f16219OooO0o0 = false;

    /* renamed from: OooO0o */
    public String f16218OooO0o = "";

    public static void OooO00o(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzax(context, str, z, z2));
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
        }
    }

    public static final String OooO0O0(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str2));
        OooOOO oooOOOZzb = new zzbo(context).zzb(0, str, map, null);
        try {
            return (String) oooOOOZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o0OOO)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            oooOOOZzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            oooOOOZzb.cancel(true);
            return null;
        } catch (Exception e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x006e A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:36:0x000b, B:38:0x0013, B:39:0x0018, B:44:0x003a, B:46:0x0042, B:48:0x0057, B:51:0x0069, B:43:0x0033, B:52:0x006e, B:53:0x0070), top: B:58:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri OooO0OO(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.f16214OooO00o
            monitor-enter(r0)
            java.lang.String r1 = r5.f16215OooO0O0     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L6e
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r4 = 1
            Oooo0OO.o00oO0o.OooO0o0(r1, r3, r4)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            goto L3a
        L31:
            r6 = move-exception
            goto L85
        L33:
            java.lang.String r1 = "Error reading from internal storage."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = ""
        L3a:
            r5.f16215OooO0O0 = r2     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L6e
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: java.lang.Throwable -> L31
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r5.f16215OooO0O0 = r1     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r5.f16215OooO0O0     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            r6.write(r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            r6.close()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L68
            goto L6e
        L68:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r1, r6)     // Catch: java.lang.Throwable -> L31
        L6e:
            java.lang.String r6 = r5.f16215OooO0O0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "linkedDeviceId"
            r7.appendQueryParameter(r0, r6)
            java.lang.String r6 = "adSlotPath"
            r7.appendQueryParameter(r6, r8)
            java.lang.String r6 = "afmaVersion"
            r7.appendQueryParameter(r6, r9)
            android.net.Uri r6 = r7.build()
            return r6
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.OooO0OO(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final p30 zza() {
        return this.f16220OooO0oO;
    }

    public final String zzb() {
        String str;
        synchronized (this.f16214OooO00o) {
            str = this.f16216OooO0OO;
        }
        return str;
    }

    public final void zzc(Context context) {
        p30 p30Var;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue() || (p30Var = this.f16220OooO0oO) == null) {
            return;
        }
        p30Var.OooO0Oo(new zzav(this, context), o30.f22326OooOoO0);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(context, OooO0OO(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o0O0), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = OooO0OO(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o0OO), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzM(context, str, builderBuildUpon.build().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:32:0x0003, B:34:0x0017, B:36:0x0026, B:39:0x002c, B:41:0x0032, B:44:0x0037, B:45:0x003b, B:47:0x0041, B:50:0x0047), top: B:54:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0041 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:32:0x0003, B:34:0x0017, B:36:0x0026, B:39:0x002c, B:41:0x0032, B:44:0x0037, B:45:0x003b, B:47:0x0041, B:50:0x0047), top: B:54:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16214OooO00o
            monitor-enter(r0)
            r3.f16219OooO0o0 = r4     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OOOOOo     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r2.OooO00o(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            com.google.android.gms.internal.ads.ql r1 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.ads.internal.util.zzj r1 = r1.OooO0Oo()     // Catch: java.lang.Throwable -> L45
            r1.zzx(r4)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.p30 r1 = r3.f16220OooO0oO     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L47
            boolean r2 = r1.OooOo0     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L30
            if (r4 == 0) goto L3b
            r1.OooO0oo()     // Catch: java.lang.Throwable -> L45
            goto L32
        L30:
            if (r4 == 0) goto L3b
        L32:
            boolean r4 = r1.f23206OooOOoo     // Catch: java.lang.Throwable -> L45
            if (r4 == 0) goto L37
            goto L3b
        L37:
            r1.OooOOO0()     // Catch: java.lang.Throwable -> L45
            goto L47
        L3b:
            boolean r4 = r1.OooO0o()     // Catch: java.lang.Throwable -> L45
            if (r4 != 0) goto L47
            r1.OooOO0o()     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r4 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.zzf(boolean):void");
    }

    public final void zzg(p30 p30Var) {
        this.f16220OooO0oO = p30Var;
    }

    public final void zzh(boolean z) {
        synchronized (this.f16214OooO00o) {
            this.f16217OooO0Oo = z;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strOooO0O0 = OooO0O0(context, OooO0OO(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00o0OO0), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strOooO0O0)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strOooO0O0.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOOOo)).booleanValue()) {
                zzj zzjVarOooO0Oo = com.google.android.gms.ads.internal.zzv.zzp().OooO0Oo();
                if (true != zEquals) {
                    str = "";
                }
                zzjVarOooO0Oo.zzw(str);
            }
            return zEquals;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.f16214OooO00o) {
            z = this.f16219OooO0o0;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.f16214OooO00o) {
            z = this.f16217OooO0Oo;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}

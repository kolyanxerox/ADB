package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: com.google.android.gms.internal.ads.yi */
/* loaded from: classes2.dex */
public final class C2271yi {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f25915OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f25916OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public int f25917OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f25918OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f25919OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f25920OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final String f25921OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f25922OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f25923OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final String f25924OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final float f25925OooOO0O;
    public final int OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final String f25926OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final int f25927OooOOO0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2271yi(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.AbstractC1448c7.OooO00o(r7)
            r6.OooO0OO(r7)
            r6.OooO0o0(r7)
            r6.OooO0Oo(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = OooO0O0(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.f25918OooO0OO = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = OooO0O0(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.f25919OooO0Oo = r3
            java.lang.String r2 = r1.getCountry()
            r6.f25921OooO0o0 = r2
            com.google.android.gms.ads.internal.zzv.zzq()
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            boolean r2 = com.google.android.gms.ads.internal.util.client.zzf.zzr()
            r6.f25920OooO0o = r2
            boolean r2 = Oooo0OO.o00oO0o.OooOO0O(r7)
            r6.f25922OooO0oO = r2
            boolean r2 = Oooo0OO.o00oO0o.OooOOOo(r7)
            r6.f25923OooO0oo = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f25915OooO = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = OooO0O0(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L63
        L61:
            r0 = r2
            goto L8a
        L63:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L68
            goto L61
        L68:
            OooOOo0.Oooo000 r3 = Oooo0o0.OooOO0.OooO00o(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.PackageInfo r3 = r3.OooO0OO(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            if (r3 == 0) goto L61
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
        L8a:
            r6.f25924OooOO0 = r0
            OooOOo0.Oooo000 r0 = Oooo0o0.OooOO0.OooO00o(r7)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.OooO0OO(r4, r3)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Lb0
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r4.<init>()     // Catch: java.lang.Exception -> Lb0
            r4.append(r3)     // Catch: java.lang.Exception -> Lb0
            r4.append(r1)     // Catch: java.lang.Exception -> Lb0
            r4.append(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb0
        Lb0:
            r6.f25926OooOOO = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lb9
            goto Lcb
        Lb9:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcb
            float r0 = r7.density
            r6.f25925OooOO0O = r0
            int r0 = r7.widthPixels
            r6.OooOO0o = r0
            int r7 = r7.heightPixels
            r6.f25927OooOOO0 = r7
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2271yi.<init>(android.content.Context):void");
    }

    public static ResolveInfo OooO0O0(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzv.zzp().OooO0oo("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final C2308zi OooO00o() {
        return new C2308zi(this.f25918OooO0OO, this.f25919OooO0Oo, this.f25921OooO0o0, this.f25920OooO0o, this.f25922OooO0oO, this.f25923OooO0oo, this.f25915OooO, this.f25924OooOO0, this.f25926OooOOO, this.f25916OooO00o, this.f25917OooO0O0, this.f25925OooOO0O, this.OooOO0o, this.f25927OooOOO0);
    }

    public final void OooO0OO(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                zzv.zzp().OooO0oo("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    public final void OooO0Oo(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOoO)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.getNetworkOperator()
            boolean r2 = Oooo0OO.o00oO0o.OooO()
            r3 = 0
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0OO0o0O
            com.google.android.gms.internal.ads.a7 r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r4.OooO00o(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            goto L31
        L2d:
            int r3 = r0.getNetworkType()
        L31:
            r5.f25917OooO0O0 = r3
            r0.getPhoneType()
            r0 = -2
            r5.f25916OooO00o = r0
            r0 = -1
            com.google.android.gms.ads.internal.zzv.zzq()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzs.zzB(r6, r2)
            if (r6 == 0) goto L5e
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L59
            int r0 = r6.getType()
            r5.f25916OooO00o = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            r6.ordinal()
            goto L5b
        L59:
            r5.f25916OooO00o = r0
        L5b:
            r1.isActiveNetworkMetered()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2271yi.OooO0o0(android.content.Context):void");
    }

    public C2271yi(Context context, C2308zi c2308zi) {
        AbstractC1448c7.OooO00o(context);
        OooO0OO(context);
        OooO0o0(context);
        OooO0Oo(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        C1927p7.OooO00o(context);
        this.f25918OooO0OO = c2308zi.f26181OooO00o;
        this.f25919OooO0Oo = c2308zi.f26182OooO0O0;
        this.f25921OooO0o0 = c2308zi.f26183OooO0OO;
        this.f25920OooO0o = c2308zi.f26184OooO0Oo;
        this.f25922OooO0oO = c2308zi.f26186OooO0o0;
        this.f25923OooO0oo = c2308zi.f26185OooO0o;
        this.f25915OooO = c2308zi.f26187OooO0oO;
        this.f25924OooOO0 = c2308zi.f26188OooO0oo;
        this.f25926OooOOO = c2308zi.f26180OooO;
        this.f25925OooOO0O = c2308zi.OooOO0o;
        this.OooOO0o = c2308zi.f26192OooOOO0;
        this.f25927OooOOO0 = c2308zi.f26191OooOOO;
    }
}

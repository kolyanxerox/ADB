package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.ironsource.C3824x4;

/* renamed from: com.google.android.gms.internal.ads.mk */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1829mk implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f21257OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final SharedPreferences f21258OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final zzg f21259OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public String f21260OooO0Oo = C3824x4.f12571f;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21261OooO0o0 = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1829mk(Context context, zzg zzgVar) {
        this.f21258OooO0O0 = PreferenceManager.getDefaultSharedPreferences(context);
        this.f21259OooO0OO = zzgVar;
        this.f21257OooO00o = context;
    }

    public final void OooO00o(int i, String str) {
        Context context;
        boolean z = true;
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17777o00000OO)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals(C3824x4.f12571f)))) {
            z = false;
        }
        this.f21259OooO0OO.zzD(z);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooOoo)).booleanValue() && z && (context = this.f21257OooO00o) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.f17779o00000o0     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r2.OooO00o(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L38
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L38
            r2 = 1
            java.lang.String r3 = "-1"
            r4 = -1
            java.lang.String r5 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L5b
            boolean r0 = java.util.Objects.equals(r10, r5)     // Catch: java.lang.Throwable -> L38
            android.content.Context r1 = r8.f21257OooO00o
            com.google.android.gms.ads.internal.util.zzg r6 = r8.f21259OooO0OO
            if (r0 == 0) goto L3b
            int r9 = r9.getInt(r5, r4)     // Catch: java.lang.Throwable -> L38
            int r10 = r6.zzb()     // Catch: java.lang.Throwable -> L38
            if (r9 == r10) goto L34
            r6.zzD(r2)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.ads.internal.util.zzad.zzc(r1)     // Catch: java.lang.Throwable -> L38
        L34:
            r6.zzA(r9)     // Catch: java.lang.Throwable -> L38
            return
        L38:
            r9 = move-exception
            goto Lbe
        L3b:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto Lbd
            java.lang.String r9 = r9.getString(r10, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = r6.zzm()     // Catch: java.lang.Throwable -> L38
            boolean r10 = java.util.Objects.equals(r9, r10)     // Catch: java.lang.Throwable -> L38
            if (r10 != 0) goto L57
            r6.zzD(r2)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.ads.internal.util.zzad.zzc(r1)     // Catch: java.lang.Throwable -> L38
        L57:
            r6.zzJ(r9)     // Catch: java.lang.Throwable -> L38
            return
        L5b:
            java.lang.String r1 = r9.getString(r0, r3)     // Catch: java.lang.Throwable -> L38
            int r9 = r9.getInt(r5, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L38
            int r6 = r10.hashCode()     // Catch: java.lang.Throwable -> L38
            r7 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            if (r6 == r7) goto L7e
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r6 == r0) goto L76
            goto L86
        L76:
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L86
            r10 = r2
            goto L87
        L7e:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L86
            r10 = 0
            goto L87
        L86:
            r10 = r4
        L87:
            if (r10 == 0) goto Laa
            if (r10 == r2) goto L8c
            goto Lbd
        L8c:
            com.google.android.gms.internal.ads.v6 r10 = com.google.android.gms.internal.ads.AbstractC1448c7.f17777o00000OO     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.a7 r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r0.OooO00o(r10)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L38
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto Lbd
            if (r9 == r4) goto Lbd
            int r10 = r8.f21261OooO0o0     // Catch: java.lang.Throwable -> L38
            if (r10 == r9) goto Lbd
            r8.f21261OooO0o0 = r9     // Catch: java.lang.Throwable -> L38
            r8.OooO00o(r9, r1)     // Catch: java.lang.Throwable -> L38
            return
        Laa:
            boolean r10 = r1.equals(r3)     // Catch: java.lang.Throwable -> L38
            if (r10 != 0) goto Lbd
            java.lang.String r10 = r8.f21260OooO0Oo     // Catch: java.lang.Throwable -> L38
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> L38
            if (r10 != 0) goto Lbd
            r8.f21260OooO0Oo = r1     // Catch: java.lang.Throwable -> L38
            r8.OooO00o(r9, r1)     // Catch: java.lang.Throwable -> L38
        Lbd:
            return
        Lbe:
            java.lang.String r10 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            com.google.android.gms.internal.ads.ql r0 = com.google.android.gms.ads.internal.zzv.zzp()
            r0.OooO0oo(r10, r9)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1829mk.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}

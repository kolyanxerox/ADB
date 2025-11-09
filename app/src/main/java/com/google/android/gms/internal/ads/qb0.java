package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class qb0 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzj f23566OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f23567OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C2163vl f23568OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ScheduledExecutorService f23569OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final vd0 f23570OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final h60 f23571OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final VersionInfoParcel f23572OooO0oO;

    public qb0(zzj zzjVar, Context context, C2163vl c2163vl, ScheduledExecutorService scheduledExecutorService, h60 h60Var, vd0 vd0Var, VersionInfoParcel versionInfoParcel) {
        this.f23566OooO00o = zzjVar;
        this.f23567OooO0O0 = context;
        this.f23568OooO0OO = c2163vl;
        this.f23569OooO0Oo = scheduledExecutorService;
        this.f23571OooO0o0 = h60Var;
        this.f23570OooO0o = vd0Var;
        this.f23572OooO0oO = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (java.util.Arrays.asList(r1.split(",")).contains(r5.f23567OooO0O0.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    @Override // com.google.android.gms.internal.ads.kb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00000oO.OooOOO zzb() {
        /*
            r5 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r5.f23569OooO0Oo
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0oOo0o0
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.OooO00o(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lfc
            com.google.android.gms.ads.internal.util.zzj r1 = r5.f23566OooO00o
            boolean r1 = r1.zzO()
            if (r1 == 0) goto Lfc
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0Oo0Oo
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.OooO00o(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3c
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.internal.ads.vd0 r2 = r5.f23570OooO0o
            com.google.android.gms.ads.internal.client.zzm r2 = r2.f24954OooO0Oo
            int r2 = r2.zzy
            if (r2 == r1) goto Lfc
        L3c:
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r5.f23572OooO0oO
            int r1 = r1.clientJarVersion
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0oOo000
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.OooO00o(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 < r2) goto Lfc
            int r1 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0Oo0OOO
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.OooO00o(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 < r2) goto Lfc
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0oOooO0
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.OooO00o(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L79
            goto La2
        L79:
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0ooOOOO
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.OooO00o(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L8c
            goto Lfc
        L8c:
            java.lang.String r2 = ","
            java.lang.String[] r1 = r1.split(r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            android.content.Context r2 = r5.f23567OooO0O0
            java.lang.String r2 = r2.getPackageName()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Lfc
        La2:
            com.google.android.gms.internal.ads.h60 r1 = r5.f23571OooO0o0     // Catch: java.lang.Exception -> Lc1
            r2 = 0
            o00000oO.OooOOO r1 = r1.OooO00o(r2)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0Oo0OOo     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r2 = r3.OooO00o(r2)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> Lc1
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> Lc1
            long r2 = (long) r2     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            o00000oO.OooOOO r1 = com.google.android.gms.internal.ads.ii0.o00Oo0(r1, r2, r4, r0)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r1 = move-exception
            com.google.android.gms.internal.ads.xp0 r1 = com.google.android.gms.internal.ads.ii0.Ooooo00(r1)
        Lc6:
            com.google.android.gms.internal.ads.tp0 r1 = com.google.android.gms.internal.ads.tp0.OooOOo(r1)
            com.google.android.gms.internal.ads.tq r2 = new com.google.android.gms.internal.ads.tq
            r3 = 12
            r2.<init>(r3)
            com.google.android.gms.internal.ads.vl r3 = r5.f23568OooO0OO
            com.google.android.gms.internal.ads.dp0 r1 = com.google.android.gms.internal.ads.ii0.ooOO(r1, r2, r3)
            com.google.android.gms.internal.ads.sc r2 = new com.google.android.gms.internal.ads.sc
            r4 = 12
            r2.<init>(r5, r4)
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.ko0 r1 = com.google.android.gms.internal.ads.ii0.OoooOoO(r1, r4, r2, r3)
            com.google.android.gms.internal.ads.v6 r2 = com.google.android.gms.internal.ads.AbstractC1448c7.o0Oo0OOo
            com.google.android.gms.internal.ads.a7 r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.OooO00o(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            o00000oO.OooOOO r0 = com.google.android.gms.internal.ads.ii0.o00Oo0(r1, r2, r4, r0)
            return r0
        Lfc:
            com.google.android.gms.internal.ads.da0 r0 = new com.google.android.gms.internal.ads.da0
            r1 = -1
            java.lang.String r2 = ""
            r3 = 2
            r0.<init>(r2, r1, r3)
            com.google.android.gms.internal.ads.yp0 r0 = com.google.android.gms.internal.ads.ii0.OooooOO(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qb0.zzb():o00000oO.OooOOO");
    }
}

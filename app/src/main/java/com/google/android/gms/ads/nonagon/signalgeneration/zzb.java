package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0OO.oo000o;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzb {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f16550OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zzd f16551OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f16552OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ScheduledExecutorService f16553OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final PackageInfo f16554OooO0o0;

    public zzb(Context context, long j, PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.f16550OooO00o = context;
        this.f16552OooO0OO = j;
        this.f16554OooO0o0 = packageInfo;
        this.f16551OooO0O0 = zzdVar;
        this.f16553OooO0Oo = scheduledExecutorService;
    }

    public static final void OooO0O0(int i, Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o00)).booleanValue()) {
            OooO00o.OooOo0O((oo000o) com.google.android.gms.ads.internal.zzv.zzC(), bundle, AbstractC2183w4.OooO0Oo(i));
        }
    }

    public static final void OooO0OO(int i, Bundle bundle) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    public static String zzb(@Nullable String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555));
        }
        return new String(charArray);
    }

    public final boolean OooO00o() {
        return this.f16551OooO0O0.zzf().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o000)).intValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|(2:91|23)|(1:25)(7:26|d8|31|32|33|(2:37|(1:101))|42)|93|41|99|42|20) */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zza(com.google.android.gms.internal.ads.C1646hl r20, final com.google.android.gms.ads.nonagon.signalgeneration.zzau r21, android.os.Bundle r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zza(com.google.android.gms.internal.ads.hl, com.google.android.gms.ads.nonagon.signalgeneration.zzau, android.os.Bundle):com.google.android.gms.ads.nonagon.signalgeneration.zzbk");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(@androidx.annotation.Nullable java.lang.String r6, @androidx.annotation.Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbk r7) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L7f
            boolean r0 = r5.OooO00o()
            if (r0 == 0) goto Ld
            goto L7f
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r1.<init>()     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.zza     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "signal_dictionary"
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L3d
            android.os.Bundle r4 = r7.zzf     // Catch: org.json.JSONException -> L3d
            org.json.JSONObject r3 = r3.zzi(r4)     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = r7.zzc     // Catch: org.json.JSONException -> L3d
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L3d
            if (r1 == 0) goto L3f
            java.lang.String r7 = ""
            goto L74
        L3d:
            r7 = move-exception
            goto L67
        L3f:
            java.lang.String r7 = zzb(r7)     // Catch: org.json.JSONException -> L3d
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L3d
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L3d
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "ts_ms"
            Oooo0OO.o00Ooo r1 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch: org.json.JSONException -> L3d
            Oooo0OO.oo000o r1 = (Oooo0OO.oo000o) r1     // Catch: org.json.JSONException -> L3d
            r1.getClass()     // Catch: org.json.JSONException -> L3d
            long r1 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L3d
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L3d
            goto L70
        L67:
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.ql r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.OooO0oo(r1, r7)
        L70:
            java.lang.String r7 = r0.toString()
        L74:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L7f
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r5.f16551OooO0O0
            r0.zzh(r6, r7)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zzd(java.lang.String, com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }
}

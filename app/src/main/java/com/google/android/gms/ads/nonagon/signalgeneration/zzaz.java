package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.C1646hl;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzaz {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f16547OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f16548OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1646hl f16549OooO0OO;

    public /* synthetic */ zzaz(zzax zzaxVar) {
        this.f16547OooO00o = zzaxVar.f16544OooO00o;
        this.f16548OooO0O0 = zzaxVar.f16545OooO0O0;
        this.f16549OooO0OO = zzaxVar.f16546OooO0OO;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.EnumC2035s4 zza() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f16547OooO00o
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            r4 = 3
            switch(r1) {
                case -1999289321: goto L2b;
                case -1372958932: goto L21;
                case 543046670: goto L17;
                case 1951953708: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L17:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L21:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r3
            goto L36
        L2b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L47
            if (r0 == r2) goto L44
            if (r0 == r4) goto L41
            com.google.android.gms.internal.ads.s4 r0 = com.google.android.gms.internal.ads.EnumC2035s4.AD_INITIATER_UNSPECIFIED
            return r0
        L41:
            com.google.android.gms.internal.ads.s4 r0 = com.google.android.gms.internal.ads.EnumC2035s4.REWARD_BASED_VIDEO_AD
            return r0
        L44:
            com.google.android.gms.internal.ads.s4 r0 = com.google.android.gms.internal.ads.EnumC2035s4.AD_LOADER
            return r0
        L47:
            com.google.android.gms.internal.ads.s4 r0 = com.google.android.gms.internal.ads.EnumC2035s4.INTERSTITIAL
            return r0
        L4a:
            com.google.android.gms.internal.ads.s4 r0 = com.google.android.gms.internal.ads.EnumC2035s4.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaz.zza():com.google.android.gms.internal.ads.s4");
    }

    public final String zzc() {
        return this.f16547OooO00o.toLowerCase(Locale.ROOT);
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f16547OooO00o.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}

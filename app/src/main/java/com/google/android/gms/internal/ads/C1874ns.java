package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* renamed from: com.google.android.gms.internal.ads.ns */
/* loaded from: classes2.dex */
public final class C1874ns implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21576OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1876nu f21577OooO0O0;

    public /* synthetic */ C1874ns(C1876nu c1876nu, int i) {
        this.f21576OooO00o = i;
        this.f21577OooO0O0 = c1876nu;
    }

    public Boolean OooO00o() {
        boolean z = true;
        if (this.f21577OooO0O0.OooO00o().OooO00o() == null) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOoO0)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    @Override // com.google.android.gms.internal.ads.z31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb() throws org.json.JSONException {
        /*
            r4 = this;
            int r0 = r4.f21576OooO00o
            switch(r0) {
                case 0: goto La9;
                case 1: goto L96;
                case 2: goto L83;
                case 3: goto L24;
                case 4: goto L17;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.vl r0 = com.google.android.gms.internal.ads.AbstractC2200wl.f25321OooO00o
            com.google.android.gms.internal.ads.ii0.Oooo000(r0)
            com.google.android.gms.internal.ads.nu r1 = r4.f21577OooO0O0
            com.google.android.gms.internal.ads.vd0 r1 = r1.OooO00o()
            com.google.android.gms.internal.ads.q90 r2 = new com.google.android.gms.internal.ads.q90
            r3 = 1
            r2.<init>(r0, r1, r3)
            return r2
        L17:
            com.google.android.gms.internal.ads.nu r0 = r4.f21577OooO0O0
            com.google.android.gms.internal.ads.vd0 r0 = r0.OooO00o()
            com.google.android.gms.internal.ads.k90 r1 = new com.google.android.gms.internal.ads.k90
            r2 = 2
            r1.<init>(r0, r2)
            return r1
        L24:
            com.google.android.gms.internal.ads.nu r0 = r4.f21577OooO0O0
            com.google.android.gms.internal.ads.vd0 r0 = r0.OooO00o()
            com.google.android.gms.internal.ads.v6 r1 = com.google.android.gms.internal.ads.AbstractC1448c7.o0O0OO
            com.google.android.gms.internal.ads.a7 r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.OooO00o(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
            com.google.android.gms.ads.internal.client.zzm r0 = r0.f24954OooO0Oo
            java.lang.String r1 = r0.zzx
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L58
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L58
            r2.<init>(r1)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L58
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L58
            if (r2 != 0) goto L58
            goto L7f
        L58:
            com.google.android.gms.ads.internal.client.zzc r1 = r0.zzs
            if (r1 == 0) goto L6f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6f
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs     // Catch: org.json.JSONException -> L6f
            java.lang.String r0 = r0.zza     // Catch: org.json.JSONException -> L6f
            r1.<init>(r0)     // Catch: org.json.JSONException -> L6f
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L6f
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L6f
            if (r0 == 0) goto L7f
        L6f:
            java.util.Random r0 = com.google.android.gms.ads.internal.client.zzbc.zze()
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L7f:
            com.google.android.gms.internal.ads.ii0.Oooo000(r1)
            return r1
        L83:
            com.google.android.gms.internal.ads.nu r0 = r4.f21577OooO0O0
            com.google.android.gms.internal.ads.vd0 r0 = r0.OooO00o()
            Oooo0oO.o0000Ooo r0 = r0.f24963OooOOOO
            int r0 = r0.f13884OooOo0o
            r1 = 3
            if (r0 != r1) goto L93
            java.lang.String r0 = "rewarded_interstitial"
            goto L95
        L93:
            java.lang.String r0 = "rewarded"
        L95:
            return r0
        L96:
            com.google.android.gms.internal.ads.nu r0 = r4.f21577OooO0O0
            com.google.android.gms.internal.ads.vd0 r0 = r0.OooO00o()
            Oooo0oO.o0000Ooo r0 = r0.f24963OooOOOO
            int r0 = r0.f13884OooOo0o
            r1 = 3
            if (r0 != r1) goto La6
            com.google.android.gms.internal.ads.s4 r0 = com.google.android.gms.internal.ads.EnumC2035s4.REWARDED_INTERSTITIAL
            goto La8
        La6:
            com.google.android.gms.internal.ads.s4 r0 = com.google.android.gms.internal.ads.EnumC2035s4.REWARD_BASED_VIDEO_AD
        La8:
            return r0
        La9:
            java.lang.Boolean r0 = r4.OooO00o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1874ns.zzb():java.lang.Object");
    }
}

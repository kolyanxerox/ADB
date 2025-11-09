package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class za0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OoooOOO.o0O0O0O f26134OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OoooOOO.o0O0O0O f26135OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f26136OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f26137OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f26138OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f26139OooO0o0 = false;

    public za0(OoooOOO.o0O0O0O o0o0o0o, OoooOOO.o0O0O0O o0o0o0o2, boolean z, boolean z2, boolean z3) {
        this.f26134OooO00o = o0o0o0o;
        this.f26135OooO0O0 = o0o0o0o2;
        this.f26136OooO0OO = z;
        this.f26137OooO0Oo = z2;
        this.f26138OooO0o = z3;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.google.android.gms.internal.ads.jb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.fu r10 = (com.google.android.gms.internal.ads.C1581fu) r10
            android.os.Bundle r10 = r10.f19125OooO00o
            boolean r0 = r9.f26139OooO0o0
            if (r0 == 0) goto La
            goto Lab
        La:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.af0.OooO0o(r10, r0)
            r2 = 0
            boolean r4 = r9.f26138OooO0o
            if (r4 != 0) goto L28
            com.google.android.gms.internal.ads.v6 r5 = com.google.android.gms.internal.ads.AbstractC1448c7.f17882o00O0oO
            com.google.android.gms.internal.ads.a7 r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.OooO00o(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3c
        L28:
            if (r4 == 0) goto L54
            com.google.android.gms.internal.ads.v6 r5 = com.google.android.gms.internal.ads.AbstractC1448c7.f17884o00O0oOo
            com.google.android.gms.internal.ads.a7 r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.OooO00o(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L54
        L3c:
            OoooOOO.o0O0O0O r5 = r9.f26134OooO00o
            java.lang.Object r6 = r5.f14388OooOo0o
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L54
            long r7 = r5.f14387OooOo0O
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 <= 0) goto L54
            java.lang.String r5 = "paidv1_id_android"
            r1.putString(r5, r6)
            java.lang.String r5 = "paidv1_creation_time_android"
            r1.putLong(r5, r7)
        L54:
            if (r4 != 0) goto L68
            com.google.android.gms.internal.ads.v6 r5 = com.google.android.gms.internal.ads.AbstractC1448c7.f17883o00O0oOO
            com.google.android.gms.internal.ads.a7 r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r6.OooO00o(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L7c
        L68:
            if (r4 == 0) goto La2
            com.google.android.gms.internal.ads.v6 r4 = com.google.android.gms.internal.ads.AbstractC1448c7.f17886o00O0oo0
            com.google.android.gms.internal.ads.a7 r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.OooO00o(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La2
        L7c:
            OoooOOO.o0O0O0O r4 = r9.f26135OooO0O0
            java.lang.Object r5 = r4.f14388OooOo0o
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L94
            long r6 = r4.f14387OooOo0O
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L94
            java.lang.String r2 = "paidv2_id_android"
            r1.putString(r2, r5)
            java.lang.String r2 = "paidv2_creation_time_android"
            r1.putLong(r2, r6)
        L94:
            boolean r2 = r9.f26136OooO0OO
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r9.f26137OooO0Oo
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        La2:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lab
            r10.putBundle(r0, r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.za0.zzb(java.lang.Object):void");
    }

    public za0(boolean z) {
        this.f26138OooO0o = z;
    }
}

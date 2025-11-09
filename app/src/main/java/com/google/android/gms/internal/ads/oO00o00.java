package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oO00o00 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public CharSequence f22526OooO0OO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f22524OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f22525OooO0O0 = 0;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22527OooO0Oo = 2;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public float f22529OooO0o0 = -3.4028235E38f;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f22528OooO0o = 1;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f22530OooO0oO = 0;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public float f22531OooO0oo = -3.4028235E38f;

    /* renamed from: OooO, reason: collision with root package name */
    public int f22523OooO = Integer.MIN_VALUE;

    /* renamed from: OooOO0, reason: collision with root package name */
    public float f22532OooOO0 = 1.0f;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f22533OooOO0O = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C2279yq OooO00o() {
        /*
            r13 = this;
            float r0 = r13.f22531OooO0oo
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 5
            r6 = 4
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L11
            goto L1c
        L11:
            int r0 = r13.f22527OooO0Oo
            if (r0 == r6) goto L1b
            if (r0 == r5) goto L19
            r0 = r4
            goto L1c
        L19:
            r0 = r7
            goto L1c
        L1b:
            r0 = r3
        L1c:
            int r2 = r13.f22523OooO
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r2 == r8) goto L26
            goto L35
        L26:
            int r2 = r13.f22527OooO0Oo
            if (r2 == r11) goto L34
            if (r2 == r9) goto L32
            if (r2 == r6) goto L34
            if (r2 == r5) goto L32
            r2 = r11
            goto L35
        L32:
            r2 = r10
            goto L35
        L34:
            r2 = 0
        L35:
            com.google.android.gms.internal.ads.yq r8 = new com.google.android.gms.internal.ads.yq
            r8.<init>()
            int r12 = r13.f22527OooO0Oo
            if (r12 == r11) goto L55
            if (r12 == r10) goto L52
            if (r12 == r9) goto L4f
            if (r12 == r6) goto L55
            if (r12 == r5) goto L4f
            java.lang.String r5 = "Unknown textAlignment: "
            java.lang.String r6 = "WebvttCueParser"
            androidx.datastore.preferences.protobuf.OooO00o.OooOo00(r12, r5, r6)
            r5 = 0
            goto L57
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L57
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L57
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L57:
            r8.f25996OooO0OO = r5
            float r5 = r13.f22529OooO0o0
            int r6 = r13.f22528OooO0o
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 == 0) goto L6d
            if (r6 != 0) goto L6d
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L6b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L6d
        L6b:
            r1 = r7
            goto L73
        L6d:
            if (r9 != 0) goto L72
            if (r6 != 0) goto L73
            goto L6b
        L72:
            r1 = r5
        L73:
            r8.f25999OooO0o0 = r1
            r8.f25998OooO0o = r6
            int r1 = r13.f22530OooO0oO
            r8.f26000OooO0oO = r1
            r8.f26001OooO0oo = r0
            r8.f25993OooO = r2
            float r1 = r13.f22532OooOO0
            if (r2 == 0) goto L9c
            if (r2 == r11) goto L92
            if (r2 != r10) goto L88
            goto L9e
        L88:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        L92:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L98
            float r0 = r0 + r0
            goto L9e
        L98:
            float r7 = r7 - r0
            float r0 = r7 + r7
            goto L9e
        L9c:
            float r0 = r7 - r0
        L9e:
            float r0 = java.lang.Math.min(r1, r0)
            r8.OooOO0o = r0
            int r0 = r13.f22533OooOO0O
            r8.f26004OooOOO = r0
            java.lang.CharSequence r0 = r13.f22526OooO0OO
            if (r0 == 0) goto Lae
            r8.f25994OooO00o = r0
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO00o00.OooO00o():com.google.android.gms.internal.ads.yq");
    }
}

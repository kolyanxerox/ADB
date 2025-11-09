package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fd */
/* loaded from: classes2.dex */
public final class C2781fd extends AbstractC2756ef {

    /* renamed from: ﻛ */
    private static int f6338 = 1;

    /* renamed from: ﾇ */
    private static int f6339;

    /* renamed from: ﾒ */
    private static int[] f6340 = {157822940, 140848806, 769652177, -1918744382, -916689888, -1095108688, -105142993, -1596767769, 507829862, -844264215, -743920771, 715680362, 108893299, 632655647, -958221877, 182036771, -963384138, -84021013};

    public C2781fd(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        f6339 = (f6338 + 11) % 128;
        String strIntern = m6794(new int[]{-248223439, -1179483682}, Color.green(0) + 1).intern();
        int i = f6339 + 23;
        f6338 = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if ((r4 instanceof java.lang.Double) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if ((r4 instanceof java.lang.Double) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if ((r5 instanceof java.lang.Long) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if ((r4 instanceof java.lang.Long) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.p009i.C2744du(java.lang.Integer.valueOf(r4.intValue() + r5.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        r0 = new com.ironsource.adqualitysdk.sdk.p009i.C2744du(java.lang.Long.valueOf(r4.longValue() + r5.longValue()));
        r4 = com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6339 + 31;
        com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6338 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if ((r4 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        throw null;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ironsource.adqualitysdk.sdk.p009i.C2744du mo6724(com.ironsource.adqualitysdk.sdk.p009i.C2741dr r4, com.ironsource.adqualitysdk.sdk.p009i.C2712cp r5) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6339
            int r0 = r0 + 117
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6338 = r0
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r3.m6765()
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m6760(r4, r5)
            com.ironsource.adqualitysdk.sdk.i.ee r1 = r3.m6764()
            com.ironsource.adqualitysdk.sdk.i.du r4 = r1.m6760(r4, r5)
            java.lang.Object r5 = r0.m6717()
            boolean r5 = r5 instanceof java.lang.String
            if (r5 != 0) goto La0
            java.lang.Object r5 = r4.m6717()
            boolean r5 = r5 instanceof java.lang.String
            if (r5 == 0) goto L2a
            goto La0
        L2a:
            java.lang.Number r5 = r0.m6722()
            java.lang.Number r4 = r4.m6722()
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 != 0) goto L8d
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6339
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6338 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L4b
            boolean r0 = r4 instanceof java.lang.Double
            r1 = 38
            int r1 = r1 / 0
            if (r0 == 0) goto L50
            goto L8d
        L4b:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L50
            goto L8d
        L50:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L6c
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L59
            goto L6c
        L59:
            com.ironsource.adqualitysdk.sdk.i.du r0 = new com.ironsource.adqualitysdk.sdk.i.du
            int r5 = r5.intValue()
            int r4 = r4.intValue()
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r4)
            return r0
        L6c:
            com.ironsource.adqualitysdk.sdk.i.du r0 = new com.ironsource.adqualitysdk.sdk.i.du
            long r1 = r5.longValue()
            long r4 = r4.longValue()
            long r4 = r4 + r1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.<init>(r4)
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6339
            int r4 = r4 + 31
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2781fd.f6338 = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L8b
            return r0
        L8b:
            r4 = 0
            throw r4
        L8d:
            com.ironsource.adqualitysdk.sdk.i.du r0 = new com.ironsource.adqualitysdk.sdk.i.du
            double r1 = r5.doubleValue()
            double r4 = r4.doubleValue()
            double r4 = r4 + r1
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r0.<init>(r4)
            return r0
        La0:
            com.ironsource.adqualitysdk.sdk.i.du r5 = new com.ironsource.adqualitysdk.sdk.i.du
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r0 = r0.m6717()
            r1.append(r0)
            java.lang.Object r4 = r4.m6717()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2781fd.mo6724(com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }

    /* renamed from: ｋ */
    private static String m6794(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6340.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

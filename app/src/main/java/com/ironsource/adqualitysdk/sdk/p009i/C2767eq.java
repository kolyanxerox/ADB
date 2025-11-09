package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.eq */
/* loaded from: classes2.dex */
public final class C2767eq extends AbstractC2765eo {

    /* renamed from: ﻐ */
    private static int f6287 = 1;

    /* renamed from: ﾇ */
    private static int[] f6288 = {797656759, 1562401224, 1784676952, 735941736, 1706411476, -182344892, 1896746434, -1455156712, 1431824416, 1593043335, 3458233, 674547778, 776961446, -327616408, 1079281396, 1927882278, 1075014869, -1975634407};

    /* renamed from: ﾒ */
    private static int f6289;

    public C2767eq(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ﾒ */
    private static String m6782(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6288.clone();
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2756ef
    /* renamed from: ﻐ */
    public final String mo6763() {
        f6289 = (f6287 + 87) % 128;
        String strIntern = m6782(new int[]{242588460, 632900173}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3).intern();
        f6287 = (f6289 + 113) % 128;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 >= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2767eq.f6287 = (r1 + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return true;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2761ek
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo6773(int r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2767eq.f6287
            int r0 = r0 + 53
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2767eq.f6289 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L13
            r0 = 25
            int r0 = r0 / r2
            if (r4 < 0) goto L1d
            goto L15
        L13:
            if (r4 < 0) goto L1d
        L15:
            int r1 = r1 + 17
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2767eq.f6287 = r1
            r4 = 1
            return r4
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2767eq.mo6773(int):boolean");
    }
}

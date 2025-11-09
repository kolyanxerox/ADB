package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.view.ViewConfiguration;
import io.bidmachine.BidMachine;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gg */
/* loaded from: classes2.dex */
public final class C2811gg extends AbstractC2813gi {

    /* renamed from: ﻛ */
    private static int[] f6457 = {1580033455, -1826060177, 1303643798, -1204573656, -59520090, 596212055, 540757174, 817319823, -206749844, 1933460606, -876767580, -1671368541, 255193907, 2047951978, 2003472233, 808431614, -1053883232, 1015266156};

    /* renamed from: ｋ */
    private static int f6458 = 1;

    /* renamed from: ﾒ */
    private static int f6459;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6458 + 113;
        f6459 = i % 128;
        int[] iArr = {-2033005804, -564609164, -760683524, -1479076214, -1879828469, -351045342, 283195529, 523624329, -1639578310, 1924544090, 1272289186, 842186065};
        return (i % 2 != 0 ? m6828(iArr, (Process.myTid() / 58) * 80) : m6828(iArr, (Process.myTid() >> 22) + 24)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6458 + 65;
        f6459 = i % 128;
        int[] iArr = {-1470622330, -1172998804, -1957802814, 659705156, 1763368839, -381090811};
        return (i % 2 != 0 ? m6828(iArr, (ViewConfiguration.getTapTimeout() - 66) * 7) : m6828(iArr, (ViewConfiguration.getTapTimeout() >> 16) + 10)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6458 + 73;
        int i2 = i % 128;
        f6459 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        f6458 = (i2 + 29) % 128;
        return BidMachine.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2681bl c2681bl = new C2681bl(mo6813());
        int i = f6458 + 75;
        f6459 = i % 128;
        if (i % 2 == 0) {
            return c2681bl;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m6828(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6457.clone();
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

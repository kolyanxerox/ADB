package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import net.pubnative.lite.sdk.HyBid;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gs */
/* loaded from: classes2.dex */
public final class C2823gs extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6511 = 0;

    /* renamed from: ﻛ */
    private static int f6512 = 1;

    /* renamed from: ﾇ */
    private static int[] f6513 = {2013760218, 934759908, 1557682066, -308299489, -1257502641, 224526825, -471246202, -213778916, 1753786807, -1794159897, -766658886, -764257837, -2048462426, 890836688, 702450842, 264781632, 2082252847, 76831733};

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        f6511 = (f6512 + 53) % 128;
        String strIntern = m6842(new int[]{-2124760158, 111146802, 565358376, -483624199, 1281634192, -1276368609, 1146758292, 1037720993, -338308489, 416421076, 2008065100, 1445628070, 1037282153, 776900434}, 28 - TextUtils.indexOf("", "", 0, 0)).intern();
        f6511 = (f6512 + 123) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6511 = (f6512 + 43) % 128;
        String strIntern = m6842(new int[]{565358376, -483624199, 1281634192, -1276368609, -353276556, 828725604}, 9 - ExpandableListView.getPackedPositionType(0L)).intern();
        int i = f6511 + 35;
        f6512 = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6511 + 79;
        f6512 = i % 128;
        if (i % 2 != 0) {
            return HyBid.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2695bz c2695bz = new C2695bz(mo6813());
        int i = f6512 + 15;
        f6511 = i % 128;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
        return c2695bz;
    }

    /* renamed from: ﾇ */
    private static String m6842(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6513.clone();
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

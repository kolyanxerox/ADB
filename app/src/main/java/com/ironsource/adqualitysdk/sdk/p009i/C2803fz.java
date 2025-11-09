package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.widget.ExpandableListView;
import com.applovin.sdk.AppLovinSdk;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fz */
/* loaded from: classes2.dex */
public final class C2803fz extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6418 = 1;

    /* renamed from: ﻛ */
    private static int f6419;

    /* renamed from: ﾒ */
    private static int[] f6420 = {876899140, 1146927188, -1953054979, -719796811, -388021839, -1976701550, -1063637205, 1057734438, -1403009777, -1848047982, -1721802586, -713304591, -63562722, 259654117, -1477532573, 1953018498, -200411879, -189040390};

    /* renamed from: ﾒ */
    private static String m6819(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6420.clone();
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6419 + 71;
        f6418 = i % 128;
        int[] iArr = {79751219, 1750554455, -1503082718, 277275941, 402294054, 132018325, 973782822, -769394259, 2043948706, -756067783, 1939264458, 1943427811, -1706348852, -1451493715};
        return (i % 2 == 0 ? m6819(iArr, 13 >> ExpandableListView.getPackedPositionGroup(1L)) : m6819(iArr, ExpandableListView.getPackedPositionGroup(0L) + 28)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6419 + 95;
        f6418 = i % 128;
        return (i % 2 == 0 ? m6819(new int[]{-1503082718, 277275941, 402294054, 132018325}, 16777224 >> Color.rgb(0, 1, 0)) : m6819(new int[]{-1503082718, 277275941, 402294054, 132018325}, Color.rgb(0, 0, 0) + 16777224)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6418 + 95;
        f6419 = i % 128;
        if (i % 2 == 0) {
            return AppLovinSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2678bi c2678bi = new C2678bi(mo6813());
        int i = f6418 + 43;
        f6419 = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
        return c2678bi;
    }
}

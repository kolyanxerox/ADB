package com.ironsource.adqualitysdk.sdk.p009i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.f */
/* loaded from: classes2.dex */
public final class C2777f {

    /* renamed from: ﻛ */
    public static int f6320;

    /* renamed from: ﾇ */
    public static int f6321;

    /* renamed from: ﾒ */
    public static final Object f6322 = new Object();

    /* renamed from: ﾒ */
    public static char[] m6790(long j, char[] cArr, int i) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if ((((j >>> i4) & 1) != i || i2 >= 4) && i3 < length) {
                cArr2[i3] = cArr[i4];
                i3++;
            } else {
                cArr2[i2] = cArr[i4];
                i2++;
            }
        }
        return cArr2;
    }
}

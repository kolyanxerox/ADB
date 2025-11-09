package com.ironsource.adqualitysdk.sdk.p009i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.d */
/* loaded from: classes2.dex */
public final class C2723d {

    /* renamed from: ﻛ */
    public static int f5951;

    /* renamed from: ｋ */
    public static int f5952;

    /* renamed from: ﾇ */
    public static final Object f5953 = new Object();

    /* renamed from: ﾒ */
    public static int f5954;

    /* renamed from: ｋ */
    public static int m6461(int i) {
        int[][] iArr = C2696c.f5531.f5534;
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    /* renamed from: ﾒ */
    public static void m6462(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}

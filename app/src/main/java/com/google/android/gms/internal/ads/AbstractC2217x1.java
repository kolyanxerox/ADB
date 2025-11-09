package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* renamed from: com.google.android.gms.internal.ads.x1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2217x1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f25494OooO00o = "0123456789abcdef".toCharArray();

    public static long OooO00o(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    public static byte[] OooO0O0(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }
}

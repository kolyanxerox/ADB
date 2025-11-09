package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ju */
/* loaded from: classes2.dex */
public class C2906ju {

    /* renamed from: ﱡ */
    private static int f7151 = 1;

    /* renamed from: ﻏ */
    private static int f7152 = 0;

    /* renamed from: ﻐ */
    private static int f7153 = -1197894392;

    /* renamed from: ﻛ */
    private static int f7154 = 38;

    /* renamed from: ｋ */
    private static int f7155 = -1116802513;

    /* renamed from: ﾇ */
    private static byte[] f7156 = {-21, -17, 25, -13, 48, -23, -25, 17, -25, 0, -56, 1, -49, 84, -66, 65, -8, 17, 89, 89, -86, -66, -19, 21, 85, -87, 89, 83, -66, 82, 65, -65, -23, 2, -81, 81, -84, -127, 35, -33, -33, -38, -39, -53, -63, 56, -54, 34, 33, -5, 54, -37, 37, -50, 6, -44, -34, 5, -4, -7, -11, 9, -3, -34, 22, -3, 3, -22, 38, -14, -8, 17, -9, -5, -16, -3, -1, 18, 10, -15, -16, 13, 11, -7, 8, -9, 14, -18, -1, 14, 33, -44, 56, 45, 32, -17, 19, -31, -24, 23, 69, -81, -17, 19, -29, 18, -31, 17, 25, -24, 23, 82, -72, 21, -21, 22, 59, 110, -99, 109, 39, -54, 98, -111, 97, 105, -104, 103, 34, -33, -97, 99, -109, 117, -102, -107, 105, 37, -56, 101, -101, 102, 75, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﾒ */
    private static short[] f7157;

    /* renamed from: ﻐ */
    public static void m7337(AbstractRunnableC2878it abstractRunnableC2878it) {
        int i = f7152 + 77;
        f7151 = i % 128;
        try {
            if (i % 2 == 0) {
                Executors.newSingleThreadExecutor().execute(abstractRunnableC2878it);
                throw null;
            }
            Executors.newSingleThreadExecutor().execute(abstractRunnableC2878it);
            f7151 = (f7152 + 59) % 128;
        } catch (Throwable th) {
            C2914kb.m7426(m7341((byte) (Color.alpha(0) - 20), (short) Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0) - 23, TextUtils.indexOf((CharSequence) "", '0', 0) + 1197894393, 1116802578 - View.MeasureSpec.getSize(0)).intern(), m7341((byte) ((-85) - ImageFormat.getBitsPerPixel(0)), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-13) - TextUtils.lastIndexOf("", '0', 0, 0), 1197894405 - TextUtils.getCapsMode("", 0, 0), 1116802581 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), th, false);
        }
    }

    /* renamed from: ｋ */
    public static long m7339() {
        f7151 = (f7152 + 93) % 128;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f7151 = (f7152 + 95) % 128;
        return jElapsedRealtime;
    }

    /* renamed from: ﾇ */
    public static long m7340() {
        f7151 = (f7152 + 59) % 128;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f7152 = (f7151 + InterfaceC3173h3.d.b.f8826i) % 128;
        return timeInMillis;
    }

    /* renamed from: ﾒ */
    public static List m7343(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            f7152 = (f7151 + 77) % 128;
            hashSet.addAll(list2);
            f7152 = (f7151 + 35) % 128;
        }
        return new ArrayList(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01da A[Catch: all -> 0x025b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x025b, blocks: (B:19:0x015c, B:35:0x01da), top: B:65:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x026a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026b  */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.InputStream, javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.InputStream] */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m7342(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2906ju.m7342(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: ﻐ */
    private static byte[] m7338(String str) {
        f7151 = (f7152 + 67) % 128;
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            f7151 = (f7152 + 77) % 128;
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
            i += 2;
            f7151 = (f7152 + 15) % 128;
        }
        return bArr;
    }

    /* renamed from: ﾇ */
    private static String m7341(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f7154;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f7156;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f7153 + i2] + i4);
                    } else {
                        i5 = (short) (f7157[f7153 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f7153 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f7155);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f7156;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f7157;
                            int i8 = C2912k.f7203;
                            C2912k.f7203 = i8 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                        }
                        sb.append(C2912k.f7204);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}

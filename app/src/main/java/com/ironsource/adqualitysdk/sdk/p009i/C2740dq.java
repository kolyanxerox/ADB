package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dq */
/* loaded from: classes2.dex */
public final class C2740dq {

    /* renamed from: 爫 */
    private static int f6113 = 1;

    /* renamed from: ﬤ */
    private static char f6114;

    /* renamed from: טּ */
    private static int f6115;

    /* renamed from: סּ */
    private static char f6116;

    /* renamed from: ףּ */
    private static char f6117;

    /* renamed from: ﭖ */
    private static char f6118;

    /* renamed from: ﭴ */
    private static short[] f6119;

    /* renamed from: ﭸ */
    private static byte[] f6120;

    /* renamed from: ﮉ */
    private static int f6121;

    /* renamed from: ﮌ */
    private static int f6122;

    /* renamed from: ﮐ */
    private static int f6123;

    /* renamed from: ﱟ */
    private static final Pattern f6124;

    /* renamed from: ﱡ */
    private static final Pattern f6125;

    /* renamed from: ﺙ */
    private static final List<String> f6126;

    /* renamed from: ﻏ */
    private static final Pattern f6127;

    /* renamed from: ﻐ */
    private static final Pattern f6128;

    /* renamed from: ﻛ */
    private static final Pattern f6129;

    /* renamed from: ｋ */
    private static final Pattern f6130;

    /* renamed from: ﾇ */
    private static final Pattern f6131;

    /* renamed from: ﾒ */
    private static final Pattern f6132;

    static {
        m6650();
        f6132 = Pattern.compile(m6649((byte) (23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 89, Color.alpha(0) + 1779841674, 1185008128 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
        f6128 = Pattern.compile(m6647("⼋㵿䮺嘪쓁㖧㘍온ᵶ鵞⼋㵿ꥺ픯ߡ戮", 15 - Process.getGidForName("")).intern());
        f6129 = Pattern.compile(m6647("ۛ霍䮺嘪쓁㖧뀥ऻᵶ鵞ۛ霍ꥺ픯财\u0f6e", (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern());
        f6131 = Pattern.compile(m6649((byte) ((-5) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (39 - TextUtils.getTrimmedLength("")), View.resolveSizeAndState(0, 0, 0) - 99, 1779841697 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1185008128).intern());
        f6130 = Pattern.compile(m6649((byte) (View.resolveSizeAndState(0, 0, 0) + 32), (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 15), 65477 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1779841712, 1185008127 - Process.getGidForName("")).intern());
        f6124 = Pattern.compile(m6649((byte) (MotionEvent.axisFromString("") - 62), (short) ((-16) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-81) - Gravity.getAbsoluteGravity(0, 0), 1779841717 - TextUtils.indexOf((CharSequence) "", '0'), 1185008129 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        f6125 = Pattern.compile(m6649((byte) ((-120) - ExpandableListView.getPackedPositionType(0L)), (short) ((-20) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (-111) - (ViewConfiguration.getJumpTapTimeout() >> 16), 1779841750 - View.MeasureSpec.getMode(0), 1185008128 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        f6127 = Pattern.compile(m6647("થᤸ\ue26d㎦平Ĳ", 5 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
        f6126 = Arrays.asList(m6649((byte) (63 - TextUtils.indexOf((CharSequence) "", '0')), (short) (85 - (ViewConfiguration.getJumpTapTimeout() >> 16)), KeyEvent.getDeadChar(0, 0) - 112, (ViewConfiguration.getLongPressTimeout() >> 16) + 1779841752, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1185008139).intern(), m6649((byte) ((-62) - View.MeasureSpec.getSize(0)), (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 70), (ViewConfiguration.getPressedStateDuration() >> 16) - 110, (KeyEvent.getMaxKeyCode() >> 16) + 1779841753, 1185008135 - Color.red(0)).intern(), m6649((byte) ((-75) - KeyEvent.getDeadChar(0, 0)), (short) (104 - View.resolveSize(0, 0)), (-110) - Color.blue(0), 1779841756 - View.resolveSizeAndState(0, 0, 0), 1185008144 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m6649((byte) (40 - TextUtils.indexOf((CharSequence) "", '0')), (short) ((Process.myPid() >> 22) - 64), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 108, View.MeasureSpec.getMode(0) + 1779841759, 1185008148 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m6649((byte) (Gravity.getAbsoluteGravity(0, 0) + 26), (short) (TextUtils.getTrimmedLength("") + 82), ExpandableListView.getPackedPositionType(0L) - 109, 1779841765 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1185008148 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m6647("ຍᧀㄚ糭", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3).intern(), m6647("﨣벷礠꧟㿀\uf640", 4 - TextUtils.lastIndexOf("", '0')).intern());
        int i = f6113 + 39;
        f6115 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c A[PHI: r8 r10
  0x011c: PHI (r8v32 com.ironsource.adqualitysdk.sdk.i.dy$e) = (r8v31 com.ironsource.adqualitysdk.sdk.i.dy$e), (r8v57 com.ironsource.adqualitysdk.sdk.i.dy$e) binds: [B:34:0x0086, B:36:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x011c: PHI (r10v9 java.lang.String) = (r10v8 java.lang.String), (r10v21 java.lang.String) binds: [B:34:0x0086, B:36:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0399  */
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.ironsource.adqualitysdk.sdk.p009i.C2748dy> m6648(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2740dq.m6648(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: ﾇ */
    public static void m6650() {
        f6123 = -1779841669;
        f6122 = 114;
        f6121 = -1185008034;
        f6120 = new byte[]{-90, 122, -49, -45, -125, -39, -24, 43, -5, 26, -23, -64, 57, -6, -49, 89, -38, 16, -24, -24, 43, -36, 57, -6, -49, 89, -38, 16, -23, 14, -72, -48, -33, 7, -81, 2, -93, 14, -72, -48, -33, 7, -33, -3, 19, 59, -20, 4, -20, -47, -29, 68, -40, 4, 35, 3, 28, -2, 30, 10, 58, -35, 76, 39, -4, 61, 22, -100, 29, -41, 79, 79, 10, 27, -4, 61, 22, -100, 29, -41, 76, -100, 84, 104, 118, 11, 11, 77, -38, 74, 21, 20, 104, 102, 26, -59, -99, -113, -58, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        f6116 = (char) 7150;
        f6114 = (char) 7725;
        f6117 = (char) 38058;
        f6118 = (char) 27504;
    }

    /* renamed from: ﾒ */
    private static String m6651(String str) {
        f6113 = (f6115 + 35) % 128;
        String strSubstring = str.substring(1, str.length() - 1);
        int i = f6115 + 119;
        f6113 = i % 128;
        if (i % 2 != 0) {
            return strSubstring;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6649(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f6122;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f6120;
                    i5 = bArr != null ? (byte) (bArr[f6123 + i2] + i4) : (short) (f6119[f6123 + i2] + i4);
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f6123 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f6121);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f6120;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f6119;
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

    /* renamed from: ﾒ */
    private static String m6652(Pattern pattern, String str) {
        f6115 = (f6113 + 95) % 128;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        f6113 = (f6115 + 35) % 128;
        return strSubstring;
    }

    /* renamed from: ﻛ */
    private static String m6647(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2920m.f7237) {
            try {
                char[] cArr2 = new char[cArr.length];
                C2920m.f7236 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = C2920m.f7236;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f6116)) ^ ((c2 >>> 5) + f6117)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f6114) ^ ((c3 + i3) ^ ((c3 << 4) + f6118))));
                            i3 -= 40503;
                        }
                        int i5 = C2920m.f7236;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        C2920m.f7236 = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

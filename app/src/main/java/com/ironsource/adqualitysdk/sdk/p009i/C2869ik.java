package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ik */
/* loaded from: classes2.dex */
public final class C2869ik {

    /* renamed from: ᔱ */
    private static int f6781 = 0;

    /* renamed from: ᔲ */
    private static char[] f6782 = null;

    /* renamed from: ᔹ */
    private static char[] f6783 = null;

    /* renamed from: ᔺ */
    private static char f6784 = 0;

    /* renamed from: ᔽ */
    private static int f6785 = 1;

    /* renamed from: ᕂ */
    public static String f6786;

    /* renamed from: ᕃ */
    public static String f6787;

    /* renamed from: ᕄ */
    public static String f6788;

    /* renamed from: ᕆ */
    public static String f6789;

    /* renamed from: ᖅ */
    public static String f6790;

    /* renamed from: ᖩ */
    public static String f6791;

    /* renamed from: ᖫ */
    public static String f6792;

    /* renamed from: ᖭ */
    public static String f6793;

    /* renamed from: ᖸ */
    public static String f6794;

    /* renamed from: ᖺ */
    public static String f6795;

    /* renamed from: ᗀ */
    public static String f6796;

    /* renamed from: ᘥ */
    public static String f6797;

    /* renamed from: ᵆ */
    public static String f6798;

    /* renamed from: Ḟ */
    public static String f6799;

    /* renamed from: Ḹ */
    public static String f6800;

    /* renamed from: Ḽ */
    public static String f6801;

    /* renamed from: Ṿ */
    public static String f6802;

    /* renamed from: Ὑ */
    public static String f6803;

    /* renamed from: Ῠ */
    public static String f6804;

    /* renamed from: Ῡ */
    public static String f6805;

    /* renamed from: Ὺ */
    public static String f6806;

    /* renamed from: Ύ */
    public static String f6807;

    /* renamed from: K */
    public static String f6808;

    /* renamed from: Ⅽ */
    public static String f6809;

    /* renamed from: Ↄ */
    public static String f6810;

    /* renamed from: く */
    public static String f6811;

    /* renamed from: っ */
    public static String f6812;

    /* renamed from: へ */
    public static String f6813;

    /* renamed from: ゥ */
    public static String f6814;

    /* renamed from: ト */
    public static String f6815;

    /* renamed from: リ */
    public static String f6816;

    /* renamed from: ヮ */
    public static String f6817;

    /* renamed from: ヶ */
    public static String f6818;

    /* renamed from: 丫 */
    public static String f6819;

    /* renamed from: 乁 */
    public static String f6820;

    /* renamed from: 爫 */
    public static String f6821;

    /* renamed from: ﬤ */
    public static String f6822;

    /* renamed from: טּ */
    public static String f6823;

    /* renamed from: סּ */
    public static String f6824;

    /* renamed from: ףּ */
    public static String f6825;

    /* renamed from: ﭖ */
    public static String f6826;

    /* renamed from: ﭴ */
    public static String f6827;

    /* renamed from: ﭸ */
    public static String f6828;

    /* renamed from: ﮉ */
    public static String f6829;

    /* renamed from: ﮌ */
    public static String f6830;

    /* renamed from: ﮐ */
    public static String f6831;

    /* renamed from: ﱟ */
    public static String f6832;

    /* renamed from: ﱡ */
    public static String f6833;

    /* renamed from: ﺙ */
    public static String f6834;

    /* renamed from: ﻏ */
    public static String f6835;

    /* renamed from: ﻐ */
    public static String f6836;

    /* renamed from: ﻛ */
    public static String f6837;

    /* renamed from: ｋ */
    public static String f6838;

    /* renamed from: ﾇ */
    public static String f6839;

    /* renamed from: ﾒ */
    public static String f6840;

    static {
        m7115();
        f6838 = m7114(false, new int[]{0, 11, 0, 3}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern();
        f6839 = m7113((byte) (View.getDefaultSize(0, 0) + 81), "\u0001\u0002\u0003\u0004", TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern();
        f6840 = m7114(true, new int[]{11, 4, 192, 0}, "\u0000\u0001\u0001\u0000").intern();
        f6837 = m7113((byte) (View.MeasureSpec.getMode(0) + 33), "\u0005\u0000\u0007\b\t\n", 5 - TextUtils.lastIndexOf("", '0', 0)).intern();
        f6836 = m7113((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + InterfaceC3173h3.d.b.f8823f), "\u0005\u0000\u0010\n\u0006\u0011", 6 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        f6832 = m7113((byte) (ExpandableListView.getPackedPositionType(0L) + 94), "\u0005\b", Color.rgb(0, 0, 0) + 16777218).intern();
        f6831 = m7113((byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27), "\u000e\u000f\u0010\u0011\f\u0017", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6).intern();
        f6834 = m7113((byte) (4 - View.getDefaultSize(0, 0)), "\u000f\u000b\u0000\u0001\u000f\u000b\u0014\u0001", TextUtils.getOffsetAfter("", 0) + 8).intern();
        f6835 = m7113((byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0013\u0019\u0014\u0015\u0005\u0010\u0003\u0016s", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9).intern();
        f6833 = m7114(false, new int[]{15, 7, 118, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000").intern();
        f6829 = m7113((byte) (48 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\u001b\u000f\u0000\u000e\u0011\u0003", Color.green(0) + 6).intern();
        f6830 = m7113((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 51), "\r\u0003\u0017\n\u0017\u000e\u0015\u001b\u000e\b", 10 - TextUtils.indexOf("", "", 0, 0)).intern();
        f6827 = m7114(true, new int[]{22, 5, 0, 0}, "\u0000\u0001\u0001\u0000\u0001").intern();
        f6828 = m7114(false, new int[]{27, 5, 0, 0}, "\u0001\u0001\u0000\u0001\u0001").intern();
        f6826 = m7114(true, new int[]{32, 5, 66, 0}, "\u0001\u0000\u0001\u0000\u0001").intern();
        f6822 = m7113((byte) ((-16777145) - Color.rgb(0, 0, 0)), "\u0003\u000b\b\u0005\u001d\u0017³", Color.rgb(0, 0, 0) + 16777223).intern();
        f6825 = m7114(false, new int[]{37, 8, 0, 4}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001").intern();
        f6823 = m7113((byte) (Color.alpha(0) + 9), "\u0014\u0013\u0001\u0012\u001d\u0012\f\u0017", View.MeasureSpec.makeMeasureSpec(0, 0) + 8).intern();
        f6824 = m7114(true, new int[]{45, 6, 0, 2}, "\u0000\u0001\u0000\u0001\u0001\u0000").intern();
        f6821 = m7113((byte) (ExpandableListView.getPackedPositionGroup(0L) + 24), "\u0014\u0001\f\b\b\t}", 6 - TextUtils.indexOf((CharSequence) "", '0')).intern();
        f6818 = m7113((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 53), "\u0007\u0015\u0007\b\t\n", 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
        f6820 = m7113((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 77), "\u0014\u0001\u0011\u0014\f\u0017À", 7 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f6819 = m7114(false, new int[]{51, 7, 156, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001").intern();
        f6816 = m7113((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24), "\f\u0002\u0004\u0011\f\u0017\u008c", 7 - View.resolveSize(0, 0)).intern();
        f6817 = m7114(false, new int[]{58, 7, 0, 6}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern();
        f6814 = m7114(true, new int[]{65, 7, 94, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0000").intern();
        f6812 = m7113((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 88), "\u0007\u0015\u0011\f\u0017\u0006", 6 - (Process.myPid() >> 22)).intern();
        f6813 = m7113((byte) ((Process.myTid() >> 22) + 41), "\u0001\u0000\u0014\u0001\u009f", 5 - Color.blue(0)).intern();
        f6815 = m7114(true, new int[]{72, 5, 0, 0}, "\u0000\u0000\u0001\u0001\u0001").intern();
        f6811 = m7114(false, new int[]{77, 5, 0, 0}, "\u0001\u0001\u0001\u0001\u0000").intern();
        f6807 = m7113((byte) (39 - TextUtils.lastIndexOf("", '0', 0, 0)), "\u0001\u0000\u000f\u000b\u0099", 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
        f6808 = m7114(false, new int[]{82, 4, 187, 0}, "\u0000\u0001\u0001\u0001").intern();
        f6810 = m7113((byte) (124 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0001\u0000\u0005\u0000ñ", 5 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
        f6809 = m7113((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15), "\u0001\u0000\u0006\t", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3).intern();
        f6806 = m7114(true, new int[]{86, 8, 149, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001").intern();
        f6804 = m7113((byte) (98 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0001\u0000\u0014\u0007\u0002\u0000\u0006\t", 8 - KeyEvent.normalizeMetaState(0)).intern();
        f6805 = m7113((byte) (KeyEvent.keyCodeFromString("") + 53), "\u0012\u0003\b\u001b\u0003\u001d\r\u0017¨", Color.alpha(0) + 9).intern();
        f6801 = m7114(false, new int[]{94, 13, 12, 11}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001").intern();
        f6803 = m7114(false, new int[]{107, 10, 0, 0}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001").intern();
        f6802 = m7114(true, new int[]{117, 11, 0, 10}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000").intern();
        f6798 = m7113((byte) (23 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\b\u001c\u0014\u0001\u001d\u0010\n\u0003\u0003\b{", 11 - TextUtils.indexOf("", "")).intern();
        f6797 = m7113((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 25), "\b\u001c\u0014\u0001\u001a\u0003\u0005\u0010\u0003\b|", Color.green(0) + 11).intern();
        f6800 = m7114(false, new int[]{128, 11, 24, 9}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern();
        f6799 = m7114(true, new int[]{139, 13, 192, 5}, null).intern();
        f6796 = m7113((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 114), "\b\u001c\u0014\u0001\u001c\u0003\u000f\b\u0003\u001d\u0003\u0005\u0003\b", Gravity.getAbsoluteGravity(0, 0) + 14).intern();
        f6795 = m7114(true, new int[]{152, 8, 98, 2}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001").intern();
        f6792 = m7113((byte) (19 - ImageFormat.getBitsPerPixel(0)), "\u0011\u001b!\u0006\u0014\u0001\u0016\u0011\u0001\u0000", TextUtils.getOffsetBefore("", 0) + 10).intern();
        f6793 = m7114(false, new int[]{160, 2, 144, 2}, "\u0000\u0000").intern();
        f6791 = m7113((byte) (TextUtils.lastIndexOf("", '0') + 120), "\u0006\u0005í", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2).intern();
        f6794 = m7113((byte) (25 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0005\u0003\u0090", 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
        f6787 = m7114(false, new int[]{162, 14, 93, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern();
        f6788 = m7113((byte) (96 - KeyEvent.getDeadChar(0, 0)), "\u001b\u000f\u0000\u0001\"\u0001\u0003\u0005", '8' - AndroidCharacter.getMirror('0')).intern();
        f6786 = m7114(false, new int[]{176, 3, 190, 0}, "\u0000\u0001\u0001").intern();
        f6789 = m7113((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 99), "\u0006\u0014Æ", 3 - (Process.myTid() >> 22)).intern();
        f6790 = m7114(false, new int[]{179, 4, 0, 0}, "\u0001\u0000\u0001\u0001").intern();
        f6785 = (f6781 + 51) % 128;
    }

    /* renamed from: ﻐ */
    private static String m7113(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6783;
                char c = f6784;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ */
    public static void m7115() {
        f6782 = new char[]{'4', 'l', 'n', 'k', 'k', 'q', 'l', 'f', 'l', 'i', 'j', 151, 298, 297, 302, 'q', 223, 226, 233, 224, 218, 220, '2', 'f', 'o', 'm', 'b', '0', 'b', 'm', 'o', 'n', 'Z', 176, 177, 175, 164, '6', '`', 'c', 'o', 'i', 'g', 'k', 'g', '6', 'g', 'c', 'j', 'r', 'o', 135, 270, 262, 248, 255, 267, 267, '1', 'i', 'r', 's', 'o', 'o', 'n', 'h', 205, 205, 209, 204, 200, 201, '7', 'o', 'i', 'c', 'f', '4', 'f', 'e', 'l', 'q', 146, 289, 285, 285, 130, 262, 256, 258, 266, 256, 248, 251, '8', 'u', '}', 'o', 'g', 'p', 'p', 's', '{', 'y', 'p', '`', 'i', '$', 'D', 'R', 'k', 'b', 'X', 'k', 't', 'l', 'd', '2', 'i', 'q', 't', 'l', '[', 'c', 'k', 'R', 'D', 'V', C3037dc.f8244T, 131, '{', '{', 137, 135, 136, 130, '|', 'n', '\\', 260, 308, 291, 257, 264, 292, 293, 313, 303, 306, 308, 307, 293, 'j', 214, 212, 204, 204, 189, 191, 205, 129, 260, '`', 198, 187, 187, 206, 192, 185, 198, 198, 177, 186, 202, 198, 206, 152, 297, 299, '4', 'f', 'k', 'p'};
        f6784 = (char) 6;
        f6783 = new char[]{'i', 'n', 't', 'g', 'a', 'd', 'T', 'y', 'p', 'e', 'H', 's', 'h', 'w', 'v', 'o', 'u', 'r', 'l', 'c', 'P', 'm', 'J', 'U', 'k', 'q', 'A', 'S', 'C', 'b', 'j', 'D', 'x', 'z', '{', '|'};
    }

    /* renamed from: ﻛ */
    private static String m7114(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (C2831h.f6553) {
            try {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f6782, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        C2831h.f6552 = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2831h.f6552 = 0;
                    while (true) {
                        int i7 = C2831h.f6552;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        C2831h.f6552 = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C2831h.f6552 = 0;
                    while (true) {
                        int i8 = C2831h.f6552;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        C2831h.f6552 = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

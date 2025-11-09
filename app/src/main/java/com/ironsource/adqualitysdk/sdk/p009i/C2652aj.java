package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.aj */
/* loaded from: classes2.dex */
public final class C2652aj {

    /* renamed from: ﱟ */
    private static int f4641 = 1;

    /* renamed from: ﺙ */
    private static int f4642;

    /* renamed from: ﻐ */
    private static char[] f4643;

    /* renamed from: ﻛ */
    private static char f4644;

    /* renamed from: ｋ */
    private String f4645 = m5071((byte) (28 - View.MeasureSpec.getMode(0)), "\u0001\u0002\u0002\u0003\u0004\u0005KK\u0007\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\r\u0089", 34 - Process.getGidForName("")).intern();

    /* renamed from: ﾇ */
    private String f4646 = m5071((byte) (79 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0001\u0002\u0002\u0003\u0004\u0005~~\r\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\r¼", (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 34).intern();

    /* renamed from: ﾒ */
    private String f4647 = m5071((byte) (TextUtils.indexOf((CharSequence) "", '0') + 33), "\u0001\u0002\u0002\u0003\u0004\u0005OO\t\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\r\u008d", 35 - TextUtils.indexOf("", "")).intern();

    static {
        m5072();
        m5071((byte) (((Process.getThreadPriority(0) + 20) >> 6) + InterfaceC3173h3.d.b.f8827j), "\u001b\u0006\u001a\u0007\b\u001b\u000f\u001a\u001d\u0018\u001f !\"\u009c", 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
        f4642 = (f4641 + 91) % 128;
    }

    public C2652aj() {
        m5071((byte) (60 - View.resolveSize(0, 0)), "\u0002\u0013\u0007\u0014\u000f\u0013\u0007\u0014\u0017\n\u0017\u0012\u0006\n\u009e", 14 - ImageFormat.getBitsPerPixel(0)).intern();
    }

    /* renamed from: ﻛ */
    private static String m5071(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f4643;
                char c = f4644;
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

    /* renamed from: ｋ */
    public static void m5072() {
        f4644 = (char) 6;
        f4643 = new char[]{'h', 't', 'p', 's', ':', '/', 'i', '-', 'a', 'd', 'q', '.', 'm', 'e', 'o', 'n', 'u', 'y', '3', 'c', 'r', 'b', 'k', 'v', '1', 'E', 'C', 'w', C3037dc.f8244T, 'O', 'R', '7', 'D', '!', ',', 'j'};
    }

    /* renamed from: ﻐ */
    public final String m5075() {
        int i = f4642 + 113;
        f4641 = i % 128;
        if (i % 2 != 0) {
            return this.f4645;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final String m5077(String str) {
        int i = f4641 + 89;
        f4642 = i % 128;
        if (i % 2 != 0) {
            m5073(this.f4646, str);
            throw null;
        }
        String strM5073 = m5073(this.f4646, str);
        f4642 = (f4641 + 97) % 128;
        return strM5073;
    }

    /* renamed from: ﾒ */
    public final String m5078(String str) {
        int i = f4641 + 113;
        f4642 = i % 128;
        if (i % 2 != 0) {
            m5073(this.f4645, str);
            throw null;
        }
        String strM5073 = m5073(this.f4645, str);
        int i2 = f4642 + 49;
        f4641 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return strM5073;
    }

    /* renamed from: ﾇ */
    private static String m5073(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            f4642 = (f4641 + 81) % 128;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(m5071((byte) (116 - TextUtils.getTrimmedLength("")), "£", -Process.getGidForName("")).intern());
        int i = f4642;
        if (str2 != null) {
            f4641 = (i + InterfaceC3173h3.d.b.f8823f) % 128;
        } else {
            f4641 = (i + 19) % 128;
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: ﾒ */
    public static String m5074() {
        f4641 = (f4642 + InterfaceC3173h3.d.b.f8823f) % 128;
        String strIntern = m5071((byte) (60 - Gravity.getAbsoluteGravity(0, 0)), "\u0002\u0013\u0007\u0014\u000f\u0013\u0007\u0014\u0017\n\u0017\u0012\u0006\n\u009e", 15 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        int i = f4642 + 53;
        f4641 = i % 128;
        if (i % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public final String m5076() {
        int i = f4642 + InterfaceC3173h3.d.b.f8826i;
        f4641 = i % 128;
        if (i % 2 != 0) {
            return this.f4647;
        }
        throw null;
    }
}

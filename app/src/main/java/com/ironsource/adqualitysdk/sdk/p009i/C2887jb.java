package com.ironsource.adqualitysdk.sdk.p009i;

import OooO0oO.OooOo;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jb */
/* loaded from: classes2.dex */
public class C2887jb {

    /* renamed from: ﮐ */
    private static int f6973 = 0;

    /* renamed from: ﱡ */
    private static int f6974 = 27;

    /* renamed from: ﺙ */
    private static int f6975 = 1;

    /* renamed from: ﻐ */
    private String f6976;

    /* renamed from: ﻛ */
    private String f6977;

    /* renamed from: ｋ */
    private String f6978;

    /* renamed from: ﾇ */
    private String f6979;

    /* renamed from: ﾒ */
    private boolean f6980;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jb$b */
    public static class b extends C2887jb {

        /* renamed from: ﾒ */
        private static char[] f6982 = {'c', 55795, 45910, 36018, 'j', 55791, 45911, 36026, 26206, 16489, 6598, 62247};

        /* renamed from: ﻛ */
        private static long f6981 = 8586098408368626076L;

        public b(String str, String str2) {
            super(str, m7207(4 - (ViewConfiguration.getEdgeSlop() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) View.resolveSize(0, 0)).intern(), str2, m7207(TextUtils.lastIndexOf("", '0', 0, 0) + 9, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), (byte) 0);
        }

        /* renamed from: ﾇ */
        private static String m7207(int i, int i2, char c) {
            String str;
            synchronized (C2642a.f4435) {
                try {
                    char[] cArr = new char[i];
                    C2642a.f4436 = 0;
                    while (true) {
                        int i3 = C2642a.f4436;
                        if (i3 < i) {
                            cArr[i3] = (char) ((f6982[i2 + i3] ^ (i3 * f6981)) ^ c);
                            C2642a.f4436 = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jb$e */
    public static class e extends C2887jb {

        /* renamed from: ﾇ */
        private static long f6983 = 699219486559424016L;

        public e(String str, String str2) {
            super(str, m7208("칳︪껔庁", (ViewConfiguration.getScrollBarSize() >> 8) + 12373).intern(), str2, m7208("칺ゴ㏑㋻㕢㑆㝴㦒", (Process.myTid() >> 22) + 65239).intern(), (byte) 0);
        }

        /* renamed from: ﾒ */
        private static String m7208(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2804g.f6422) {
                try {
                    C2804g.f6423 = i;
                    char[] cArr2 = new char[cArr.length];
                    C2804g.f6421 = 0;
                    while (true) {
                        int i2 = C2804g.f6421;
                        if (i2 < cArr.length) {
                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6983);
                            C2804g.f6421++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    public /* synthetic */ C2887jb(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
    }

    /* renamed from: ﻏ */
    private static String m7200() {
        f6975 = (f6973 + InterfaceC3173h3.d.b.f8819b) % 128;
        String strMo5156 = AbstractC2661as.m5141().mo5156();
        f6973 = (f6975 + 3) % 128;
        return strMo5156;
    }

    /* renamed from: ﻐ */
    public final String m7202() {
        f6975 = (f6973 + 81) % 128;
        String strReplace = m7206().replace(m7201(-TextUtils.lastIndexOf("", '0', 0), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.argb(0, 0, 0, 0) + 74, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false).intern(), m7201(TextUtils.indexOf("", "") + 1, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 73, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false).intern());
        int i = f6975 + 123;
        f6973 = i % 128;
        if (i % 2 == 0) {
            return strReplace;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public final String m7203() {
        int i = (f6973 + 83) % 128;
        f6975 = i;
        String str = this.f6978;
        int i2 = i + 95;
        f6973 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return str;
    }

    /* renamed from: ｋ */
    public final void m7204() {
        int i = f6975 + 49;
        f6973 = i % 128;
        this.f6980 = i % 2 != 0;
    }

    /* renamed from: ﾇ */
    public final String m7205() {
        int i = (f6975 + 95) % 128;
        f6973 = i;
        String str = this.f6979;
        f6975 = (i + 57) % 128;
        return str;
    }

    /* renamed from: ﾒ */
    public final String m7206() {
        f6975 = (f6973 + 5) % 128;
        String strIntern = m7201(8 - TextUtils.getOffsetAfter("", 0), 8 - TextUtils.lastIndexOf("", '0', 0, 0), 126 - (ViewConfiguration.getTouchSlop() >> 8), "\u0002\n\f\u0011\u0002\u0001\uffffￌ\u000f", false).intern();
        String strM7200 = m7200();
        if (!(!this.f6980)) {
            f6975 = (f6973 + 113) % 128;
            if (!TextUtils.isEmpty(strM7200)) {
                StringBuilder sbOooOo0O = OooOo.OooOo0O(strIntern);
                sbOooOo0O.append(m7201(ExpandableListView.getPackedPositionType(0L) + 4, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, 121 - TextUtils.getOffsetBefore("", 0), "\uffd1\u0018\u0010\u0007", true).intern());
                sbOooOo0O.append(strM7200);
                strIntern = AbstractC2183w4.OooOO0O(sbOooOo0O, m7201(1 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, 74 - (ViewConfiguration.getTouchSlop() >> 8), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false));
            }
        }
        StringBuilder sbOooOo0O2 = OooOo.OooOo0O(strIntern);
        sbOooOo0O2.append(this.f6978);
        sbOooOo0O2.append(m7201(1 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 1, 74 - Color.argb(0, 0, 0, 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false).intern());
        sbOooOo0O2.append(this.f6976);
        sbOooOo0O2.append(m7201(2 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0, 0) + 5, Color.alpha(0) + 106, "\u0012\uffdf\uffdf\u0015\u001f", true).intern());
        sbOooOo0O2.append(this.f6979);
        sbOooOo0O2.append(m7201((ViewConfiguration.getEdgeSlop() >> 16) + 1, KeyEvent.keyCodeFromString("") + 1, TextUtils.lastIndexOf("", '0') + 74, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false).intern());
        sbOooOo0O2.append(this.f6977);
        String string = sbOooOo0O2.toString();
        int i = f6973 + 123;
        f6975 = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    private C2887jb(String str, String str2, String str3, String str4) {
        this.f6978 = str;
        this.f6976 = str2;
        this.f6979 = str3;
        this.f6977 = str4;
        this.f6980 = true;
    }

    /* renamed from: ﾒ */
    private static String m7201(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f6974);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}

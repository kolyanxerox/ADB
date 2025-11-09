package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.js */
/* loaded from: classes2.dex */
public final class C2904js {

    /* renamed from: ﮐ */
    private static boolean f7138 = true;

    /* renamed from: ﱟ */
    private static int f7139 = 0;

    /* renamed from: ﱡ */
    private static int f7140 = 1;

    /* renamed from: ﻏ */
    private static boolean f7141 = true;

    /* renamed from: ﻐ */
    private static char[] f7142 = {142, 156, 153, 141, 160, 174, '|', 175, 171, 165, 170, 166, 169, 'W', 158, 'z', 163, 159, 164};

    /* renamed from: ﾇ */
    private static int f7143 = 55;

    /* renamed from: ﻛ */
    private WeakReference<C2671bb.e> f7144;

    /* renamed from: ｋ */
    private boolean f7145;

    /* renamed from: ﾒ */
    private WeakReference<WebView> f7146;

    public C2904js(WebView webView) {
        this.f7146 = new WeakReference<>(webView);
    }

    /* renamed from: ﻛ */
    private static void m7328(C2671bb.e eVar) {
        new WeakReference(eVar);
        f7140 = (f7139 + 53) % 128;
    }

    /* renamed from: ﾒ */
    private void m7329(C2671bb.e eVar) {
        this.f7144 = new WeakReference<>(eVar);
        f7139 = (f7140 + 99) % 128;
    }

    /* renamed from: ﻐ */
    public final C2671bb.e m7330() {
        WeakReference<C2671bb.e> weakReference = this.f7144;
        if (weakReference == null) {
            return null;
        }
        f7140 = (f7139 + 61) % 128;
        C2671bb.e eVar = weakReference.get();
        int i = f7140 + 21;
        f7139 = i % 128;
        if (i % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final boolean m7332() {
        int i = f7140;
        boolean z = this.f7145;
        f7139 = (i + 41) % 128;
        return z;
    }

    /* renamed from: ﾇ */
    public final WebView m7333() {
        WebView webView;
        int i = f7139 + 21;
        f7140 = i % 128;
        if (i % 2 == 0) {
            webView = this.f7146.get();
            int i2 = 90 / 0;
        } else {
            webView = this.f7146.get();
        }
        int i3 = f7139 + 59;
        f7140 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return webView;
    }

    /* renamed from: ﾒ */
    public final void m7334(WebChromeClient webChromeClient) {
        WebView webViewM7333 = m7333();
        if (webViewM7333 != null) {
            f7140 = (f7139 + 85) % 128;
            try {
                WebChromeClient webChromeClientM7481 = C2918kh.m7481(webViewM7333);
                if (webChromeClientM7481 != null) {
                    f7139 = (f7140 + 73) % 128;
                    if (webChromeClientM7481 == null) {
                        C2843hl c2843hl = new C2843hl(webChromeClientM7481, webChromeClient);
                        m7328(c2843hl);
                        webViewM7333.setWebChromeClient(c2843hl);
                        f7140 = (f7139 + 45) % 128;
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e) {
                C2914kb.m7426(m7327(null, null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, "\u008a\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m7327(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u0089\u008a\u0082\u0085\u0091\u0090\u0082\u0093\u008c\u008d\u0092\u0090\u0083\u0082\u0081\u008e\u008f\u008a\u0085\u0089\u0089\u0082\u008f\u008e\u008d\u008c\u008d\u008d\u0087").intern(), (Throwable) e, false);
            }
        }
        f7140 = (f7139 + InterfaceC3173h3.d.b.f8826i) % 128;
    }

    /* renamed from: ﻐ */
    public final void m7331(WebViewClient webViewClient) {
        int i = f7140 + 123;
        f7139 = i % 128;
        if (i % 2 == 0) {
            WebView webViewM7333 = m7333();
            if (webViewM7333 != null) {
                try {
                    C2839hh c2839hh = new C2839hh(C2918kh.m7486(webViewM7333), webViewClient);
                    m7329(c2839hh);
                    webViewM7333.setWebViewClient(c2839hh);
                    this.f7145 = true;
                    int i2 = f7139 + 69;
                    f7140 = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    return;
                } catch (Exception e) {
                    C2914kb.m7426(m7327(null, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, "\u008a\u008c\u0085\u008b\u008a\u0082\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m7327(null, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0089\u008a\u0082\u0085\u0091\u0090\u0086\u0082\u0085\u0084\u0083\u0082\u0081\u008e\u008f\u008a\u0085\u0089\u0089\u0082\u008f\u008e\u008d\u008c\u008d\u008d\u0087").intern(), (Throwable) e, false);
                }
            }
            this.f7145 = false;
            return;
        }
        m7333();
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m7327(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f7142;
                int i2 = f7143;
                if (f7138) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f7141) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

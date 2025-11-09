package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.ironsource.InterfaceC3173h3;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.kh */
/* loaded from: classes2.dex */
public final class C2918kh {

    /* renamed from: ﮐ */
    private static int f7223 = 0;

    /* renamed from: ﱟ */
    private static d f7224 = null;

    /* renamed from: ﱡ */
    private static int f7225 = 1;

    /* renamed from: ﺙ */
    private static d f7226;

    /* renamed from: ﻏ */
    private static int f7227;

    /* renamed from: ﻐ */
    private static boolean f7228;

    /* renamed from: ﻛ */
    private static boolean f7229;

    /* renamed from: ｋ */
    private static boolean f7230;

    /* renamed from: ﾇ */
    private static boolean f7231;

    /* renamed from: ﾒ */
    private static boolean f7232;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$1 */
    public class AnonymousClass1 extends WebChromeClient {
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$2 */
    public class AnonymousClass2 extends WebChromeClient {
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$3 */
    public class AnonymousClass3 extends WebViewClient {
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$4 */
    public class AnonymousClass4 extends WebViewClient {
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$5 */
    public class AnonymousClass5 implements InterfaceC2848hq {

        /* renamed from: ﻛ */
        private /* synthetic */ List f7233;

        public AnonymousClass5(List list) {
            list = list;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2848hq
        /* renamed from: ﾒ */
        public final Field[] mo6915(Object obj) {
            C2849hr.m6916().m6918();
            return C2846ho.m6888(obj.getClass(), true, -1, list);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$6 */
    public class AnonymousClass6 implements InterfaceC2856hy {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
        /* renamed from: ﾇ */
        public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
            return WebViewClient.class.equals(interfaceC2851ht.mo6935().getType());
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$9 */
    public class AnonymousClass9 implements InterfaceC2856hy {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
        /* renamed from: ﾇ */
        public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
            return WebChromeClient.class.equals(interfaceC2851ht.mo6935().getType());
        }
    }

    static {
        m7480();
        f7229 = true;
        f7228 = true;
        f7231 = true;
        f7232 = false;
        f7230 = false;
        f7224 = new d((byte) 0);
        f7226 = new d((byte) 0);
        int i = f7227 + 107;
        f7225 = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    /* renamed from: ﻐ */
    public static boolean m7478(WebView webView) {
        f7227 = (f7225 + 51) % 128;
        boolean z = m7486(webView) instanceof C2839hh;
        int i = f7225 + 25;
        f7227 = i % 128;
        if (i % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static void m7480() {
        f7223 = 71;
    }

    /* renamed from: ｋ */
    public static void m7485(WebView webView, String str) {
        int i = f7227;
        f7225 = (i + InterfaceC3173h3.d.b.f8823f) % 128;
        if (webView != null) {
            f7225 = (i + 11) % 128;
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m7484((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, 22 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 166, "\r\u0002\u0017\u0006ￛ\u0015\u0011\n\u0013\u0004\u0014\u0002\u0017\u0002\u000bￃ\uffc9\u0003\u0010\u0015\u0002\uffc9", true).intern());
            sb.append(str);
            sb.append(m7484(3 - TextUtils.getOffsetAfter("", 0), 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 113, "\ufffe\ufffe\ufff7\u0010", true).intern());
            webView.loadUrl(sb.toString());
        }
    }

    /* renamed from: ﾇ */
    private static synchronized C2664av m7487() {
        C2664av c2664avMo5154;
        f7225 = (f7227 + 43) % 128;
        c2664avMo5154 = AbstractC2661as.m5141().mo5154();
        f7225 = (f7227 + 61) % 128;
        return c2664avMo5154;
    }

    /* renamed from: ﾒ */
    private static InterfaceC2851ht<WebChromeClient> m7489(WebView webView) {
        int i = f7227 + 15;
        f7225 = i % 128;
        if (i % 2 != 0) {
            m7488(webView.getContext());
            return m7490(webView, m7483(), f7226);
        }
        m7488(webView.getContext());
        m7490(webView, m7483(), f7226);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x002d  */
    @androidx.annotation.RequiresApi(api = 26)
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m7477(android.content.Context r9) {
        /*
            boolean r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7228
            if (r0 == 0) goto L7c
            r0 = 1
            r1 = 0
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7228 = r1     // Catch: java.lang.Throwable -> L33
            android.webkit.WebView r2 = new android.webkit.WebView     // Catch: java.lang.Throwable -> L33
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L33
            com.ironsource.adqualitysdk.sdk.i.hh r9 = new com.ironsource.adqualitysdk.sdk.i.hh     // Catch: java.lang.Throwable -> L33
            com.ironsource.adqualitysdk.sdk.i.kh$4 r3 = new com.ironsource.adqualitysdk.sdk.i.kh$4     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            r4 = 0
            r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> L33
            r2.setWebViewClient(r9)     // Catch: java.lang.Throwable -> L33
            android.webkit.WebViewClient r2 = r2.getWebViewClient()     // Catch: java.lang.Throwable -> L33
            if (r9 != r2) goto L2d
            int r9 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225
            int r9 = r9 + 95
            int r2 = r9 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227 = r2
            int r9 = r9 % 2
            if (r9 == 0) goto L2f
        L2d:
            r9 = r1
            goto L30
        L2f:
            r9 = r0
        L30:
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7232 = r9     // Catch: java.lang.Throwable -> L33
            goto L7c
        L33:
            r9 = move-exception
            int r2 = android.graphics.ImageFormat.getBitsPerPixel(r1)
            int r2 = 4 - r2
            int r3 = android.view.ViewConfiguration.getTouchSlop()
            int r3 = r3 >> 8
            int r3 = 12 - r3
            float r4 = android.media.AudioTrack.getMaxVolume()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            int r4 = 174 - r4
            java.lang.String r5 = "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011"
            java.lang.String r2 = m7484(r2, r3, r4, r5, r1)
            java.lang.String r2 = r2.intern()
            int r3 = android.os.Process.getThreadPriority(r1)
            int r3 = r3 + 20
            int r3 = r3 >> 6
            int r3 = r3 + 24
            r4 = 0
            int r6 = android.widget.ExpandableListView.getPackedPositionGroup(r4)
            int r6 = r6 + 36
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            int r4 = r4 + 164
            java.lang.String r5 = "\ufff9ￂ\u0007\u000f\u0003\u0015ￂ\b\u000bￂ\t\u0010\u000b\r\u0005\u0007\n\u0005ￂ\u0014\u0011\u0014\u0014\uffe7\u0016\u0010\u0007\u000b\u000e￥\u0019\u0007\u000b\ufff8\u0004\u0007"
            java.lang.String r0 = m7484(r3, r6, r4, r5, r0)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2914kb.m7426(r2, r0, r9, r1)
        L7c:
            boolean r9 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7232
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225
            int r0 = r0 + 101
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227 = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2918kh.m7477(android.content.Context):boolean");
    }

    /* renamed from: ﻛ */
    private static InterfaceC2851ht<WebViewClient> m7479(WebView webView) {
        f7227 = (f7225 + 91) % 128;
        m7488(webView.getContext());
        InterfaceC2851ht<WebViewClient> interfaceC2851htM7490 = m7490(webView, m7475(), f7224);
        int i = f7225 + 47;
        f7227 = i % 128;
        if (i % 2 == 0) {
            return interfaceC2851htM7490;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.webkit.WebViewClient m7486(android.webkit.WebView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 < r1) goto L43
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L21
            com.ironsource.adqualitysdk.sdk.i.av r0 = m7487()
            boolean r0 = r0.m5231()
            r1 = 57
            int r1 = r1 / r2
            if (r0 == 0) goto L43
            goto L2c
        L21:
            com.ironsource.adqualitysdk.sdk.i.av r0 = m7487()
            boolean r0 = r0.m5231()
            if (r0 != 0) goto L2c
            goto L43
        L2c:
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225
            int r0 = r0 + 33
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227 = r0
            android.content.Context r0 = r7.getContext()
            boolean r0 = m7477(r0)
            if (r0 == 0) goto L43
            android.webkit.WebViewClient r7 = r7.getWebViewClient()
            goto L4f
        L43:
            com.ironsource.adqualitysdk.sdk.i.ht r7 = m7479(r7)
            if (r7 == 0) goto L58
            java.lang.Object r7 = r7.mo6934()
            android.webkit.WebViewClient r7 = (android.webkit.WebViewClient) r7
        L4f:
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227
            int r0 = r0 + 33
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225 = r0
            return r7
        L58:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = ""
            r1 = 48
            int r0 = android.text.TextUtils.lastIndexOf(r0, r1, r2)
            int r0 = 11 - r0
            int r1 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r1 = r1 >> 8
            int r1 = 33 - r1
            long r3 = android.os.SystemClock.uptimeMillis()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 165 - r3
            java.lang.String r4 = "￦\u000f\f\b\u0011\u0017ￃ\t\f\b\u000f\u0007￦\u0012\u0018\u000f\u0007\u0011ￊ\u0017ￃ\t\f\u0011\u0007ￃ\ufffa\b\u0005\ufff9\f\b\u001a"
            java.lang.String r0 = m7484(r0, r1, r3, r4, r2)
            java.lang.String r0 = r0.intern()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2918kh.m7486(android.webkit.WebView):android.webkit.WebViewClient");
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.kh$d */
    public static class d {

        /* renamed from: ﻐ */
        private boolean f7234;

        /* renamed from: ｋ */
        private boolean f7235;

        private d() {
            this.f7235 = false;
            this.f7234 = false;
        }

        /* renamed from: ﾇ */
        private boolean m7494() {
            return this.f7235;
        }

        /* renamed from: ﻐ */
        public final void m7495() {
            this.f7235 = true;
        }

        /* renamed from: ﻛ */
        public final boolean m7496() {
            return this.f7234;
        }

        /* renamed from: ｋ */
        public final boolean m7497() {
            return m7494() || m7496();
        }

        /* renamed from: ﾒ */
        public final void m7498() {
            this.f7234 = true;
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.webkit.WebChromeClient m7481(android.webkit.WebView r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225
            int r0 = r0 + 15
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L32
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225
            int r0 = r0 + 101
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227 = r0
            com.ironsource.adqualitysdk.sdk.i.av r0 = m7487()
            boolean r0 = r0.m5226()
            if (r0 == 0) goto L32
            android.content.Context r0 = r5.getContext()
            boolean r0 = m7493(r0)
            if (r0 == r2) goto L2d
            goto L32
        L2d:
            android.webkit.WebChromeClient r5 = r5.getWebChromeClient()
            goto L3e
        L32:
            com.ironsource.adqualitysdk.sdk.i.ht r5 = m7489(r5)
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.mo6934()
            android.webkit.WebChromeClient r5 = (android.webkit.WebChromeClient) r5
        L3e:
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7227
            int r0 = r0 + 117
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2918kh.f7225 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L4d
            r0 = 87
            int r0 = r0 / r3
        L4d:
            return r5
        L4e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            int r0 = android.view.View.MeasureSpec.getSize(r3)
            int r0 = r0 + 29
            int r1 = android.view.KeyEvent.getDeadChar(r3, r3)
            int r1 = r1 + 35
            java.lang.String r3 = ""
            int r3 = android.os.Process.getGidForName(r3)
            int r3 = r3 + 166
            java.lang.String r4 = "\u0016\u0010\u0007\u000b\u000e￥\u0007\u000f\u0011\u0014\n￥\u0004\u0007\ufff9ￂ\u0006\u0010\u000b\bￂ\u0016\uffc9\u0010\u0006\u000e\u0017\u0011￥\u0006\u000e\u0007\u000b\bￂ"
            java.lang.String r0 = m7484(r0, r1, r3, r4, r2)
            java.lang.String r0 = r0.intern()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2918kh.m7481(android.webkit.WebView):android.webkit.WebChromeClient");
    }

    @RequiresApi(api = 26)
    /* renamed from: ﾒ */
    private static boolean m7493(Context context) {
        if (f7231) {
            boolean z = false;
            f7231 = false;
            WebView webView = new WebView(context);
            C2843hl c2843hl = new C2843hl(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.2
            });
            webView.setWebChromeClient(c2843hl);
            if (c2843hl == webView.getWebChromeClient()) {
                f7227 = (f7225 + 21) % 128;
                z = true;
            } else {
                f7225 = (f7227 + 85) % 128;
            }
            f7230 = z;
        }
        return f7230;
    }

    /* renamed from: ﻐ */
    private static <T> d m7476(WebView webView, T t, InterfaceC2856hy interfaceC2856hy) {
        d dVar = new d((byte) 0);
        InterfaceC2851ht interfaceC2851htM7491 = m7491(webView, interfaceC2856hy, m7487().m5230(), m7487().m5228());
        if (interfaceC2851htM7491 != null) {
            f7225 = (f7227 + 59) % 128;
            Object objMo6934 = interfaceC2851htM7491.mo6934();
            if (objMo6934 == t) {
                int i = f7225 + 95;
                f7227 = i % 128;
                if (i % 2 == 0) {
                    dVar.m7495();
                    return dVar;
                }
                dVar.m7495();
                throw null;
            }
            InterfaceC2851ht interfaceC2851htM7482 = m7482(objMo6934, interfaceC2856hy, m7487().m5229(), m7487().m5227());
            if (interfaceC2851htM7482 != null && interfaceC2851htM7482.mo6934() == t) {
                f7225 = (f7227 + 89) % 128;
                dVar.m7498();
            }
        }
        return dVar;
    }

    /* renamed from: ﾇ */
    private static void m7488(Context context) {
        f7225 = (f7227 + 67) % 128;
        if (f7229) {
            f7229 = false;
            try {
                WebView webView = new WebView(context);
                C2839hh c2839hh = new C2839hh(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.3
                });
                webView.setWebViewClient(c2839hh);
                C2843hl c2843hl = new C2843hl(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.1
                });
                webView.setWebChromeClient(c2843hl);
                f7224 = m7476(webView, c2839hh, m7475());
                f7226 = m7476(webView, c2843hl, m7483());
                f7225 = (f7227 + 43) % 128;
            } catch (Throwable th) {
                C2914kb.m7426(m7484(5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollBarSize() >> 8) + 12, ImageFormat.getBitsPerPixel(0) + 174, "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011", false).intern(), m7484((ViewConfiguration.getWindowTouchSlop() >> 8) + 11, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31, Gravity.getAbsoluteGravity(0, 0) + 167, "\u000b\u0003\u0005\b\u0003\uffc0\u0012\u000f\u0012\u0012￥\u0013\u0014\u000e\u0005\t\f\u0003\uffc0\u0012\u0005\u000e\u000e\t\uffc0\u0012\u000f\u0006\uffc0\u0007\u000e\t", true).intern(), th, false);
            }
        }
    }

    /* renamed from: ｋ */
    private static <T> InterfaceC2851ht<T> m7482(T t, InterfaceC2856hy interfaceC2856hy, List<String> list, int i) {
        f7227 = (f7225 + 87) % 128;
        InterfaceC2851ht<T> interfaceC2851htM7492 = m7492(t, interfaceC2856hy, list, i);
        int i2 = f7227 + 57;
        f7225 = i2 % 128;
        if (i2 % 2 != 0) {
            return interfaceC2851htM7492;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static InterfaceC2856hy m7483() {
        AnonymousClass9 anonymousClass9 = new InterfaceC2856hy() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
            /* renamed from: ﾇ */
            public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
                return WebChromeClient.class.equals(interfaceC2851ht.mo6935().getType());
            }
        };
        int i = f7227 + 65;
        f7225 = i % 128;
        if (i % 2 != 0) {
            return anonymousClass9;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static <T> InterfaceC2851ht<T> m7490(WebView webView, InterfaceC2856hy interfaceC2856hy, d dVar) {
        int i = f7227 + 115;
        f7225 = i % 128;
        try {
        } catch (Throwable th) {
            C2914kb.m7426(m7484((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, 12 - TextUtils.getOffsetAfter("", 0), 173 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\uffef\u000e\u0003\u0006\r\ufff1\uffff￼\ufff0\u0003\uffff\u0011", false).intern(), m7484(1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 26 - (ViewConfiguration.getTouchSlop() >> 8), 169 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "￤\u0003\u000b\u0004\b\u0005\uffbf\u0013\r\u0004\b\u000b\u0002\uffbf\u0006\r\b\u0013\u0013\u0004\u0006\uffbf\u0011\u000e\u0011\u0011", true).intern(), th, false);
        }
        if (i % 2 != 0) {
            if (dVar.m7497()) {
                int i2 = f7225 + 107;
                f7227 = i2 % 128;
                if (i2 % 2 == 0) {
                    InterfaceC2851ht<T> interfaceC2851htM7491 = m7491(webView, interfaceC2856hy, m7487().m5230(), m7487().m5228());
                    if (dVar.m7496() && interfaceC2851htM7491 != null) {
                        T tMo6934 = interfaceC2851htM7491.mo6934();
                        if (tMo6934 == null || tMo6934.getClass().equals(interfaceC2851htM7491.mo6935().getType())) {
                            return interfaceC2851htM7491;
                        }
                        interfaceC2851htM7491 = m7482(tMo6934, interfaceC2856hy, m7487().m5229(), m7487().m5227());
                    }
                    int i3 = f7225 + 71;
                    f7227 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return interfaceC2851htM7491;
                    }
                    throw null;
                }
                m7491(webView, interfaceC2856hy, m7487().m5230(), m7487().m5228());
                dVar.m7496();
                throw null;
            }
            int i4 = f7225 + 37;
            f7227 = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        dVar.m7497();
        throw null;
    }

    /* renamed from: ｋ */
    private static String m7484(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f7223);
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

    /* renamed from: ﻐ */
    private static InterfaceC2856hy m7475() {
        AnonymousClass6 anonymousClass6 = new InterfaceC2856hy() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2856hy
            /* renamed from: ﾇ */
            public final boolean mo6496(InterfaceC2851ht interfaceC2851ht) {
                return WebViewClient.class.equals(interfaceC2851ht.mo6935().getType());
            }
        };
        int i = f7225 + 67;
        f7227 = i % 128;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
        return anonymousClass6;
    }

    /* renamed from: ﾒ */
    private static <T> InterfaceC2851ht<T> m7491(WebView webView, InterfaceC2856hy interfaceC2856hy, List<String> list, int i) {
        f7225 = (f7227 + 77) % 128;
        InterfaceC2851ht<T> interfaceC2851htM7492 = m7492((Object) webView, interfaceC2856hy, list, i);
        int i2 = f7225 + 89;
        f7227 = i2 % 128;
        if (i2 % 2 == 0) {
            return interfaceC2851htM7492;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static <T> InterfaceC2851ht<T> m7492(Object obj, InterfaceC2856hy interfaceC2856hy, List<String> list, int i) {
        InterfaceC2851ht<T> interfaceC2851htM6987 = C2849hr.m6916().m6919().m6987(obj, interfaceC2856hy, new InterfaceC2848hq() { // from class: com.ironsource.adqualitysdk.sdk.i.kh.5

            /* renamed from: ﻛ */
            private /* synthetic */ List f7233;

            public AnonymousClass5(List list2) {
                list = list2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2848hq
            /* renamed from: ﾒ */
            public final Field[] mo6915(Object obj2) {
                C2849hr.m6916().m6918();
                return C2846ho.m6888(obj2.getClass(), true, -1, list);
            }
        }, list2, i);
        f7225 = (f7227 + 55) % 128;
        return interfaceC2851htM6987;
    }
}

package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jp */
/* loaded from: classes2.dex */
public final class C2901jp {

    /* renamed from: ﻏ */
    private static int f7109 = 1;

    /* renamed from: ﻐ */
    private static int[] f7110 = {481618742, -1992493149, -1543981164, 2137764664, 909590099, -159416780, -1952219431, -892850102, 511220144, -1578360094, -666249927, 1908781044, -1479897535, -1760740347, 466408711, -2043762378, -1458578909, 2141109333};

    /* renamed from: ｋ */
    private static int f7111;

    /* renamed from: ﾇ */
    private static C2735dl f7112;

    /* renamed from: ﻛ */
    private final boolean f7113;

    /* renamed from: ﾒ */
    private final String f7114;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jp$4 */
    public class AnonymousClass4 extends AbstractRunnableC2878it {

        /* renamed from: ｋ */
        final /* synthetic */ WebView f7116;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.jp$4$2 */
        public class AnonymousClass2 extends AbstractRunnableC2878it {

            /* renamed from: ﾒ */
            private /* synthetic */ String f7118;

            public AnonymousClass2(String str) {
                str = str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2918kh.m7485(webView, str);
            }
        }

        public AnonymousClass4(WebView webView) {
            webView = webView;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4.2

                /* renamed from: ﾒ */
                private /* synthetic */ String f7118;

                public AnonymousClass2(String str) {
                    str = str;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2918kh.m7485(webView, str);
                }
            });
        }
    }

    public C2901jp(String str, boolean z) {
        this.f7114 = str;
        this.f7113 = z;
    }

    /* renamed from: ﻛ */
    private String m7306() {
        String strReplace;
        String strIntern;
        String strM6619;
        f7111 = (f7109 + 69) % 128;
        String strM6618 = f7112.m6618();
        try {
            String strReplace2 = strM6618.replace(m7310(new int[]{-1391708161, 1543160593, 1542168729, 1469155789, 414217413, 370187654, -424331145, 1391160371, 459907415, 1858228775}, 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m7311()).replace(m7310(new int[]{-1703012173, 437792301, 1353744754, -827507533, -532477314, 396514407, 575067373, 1871828301}, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), f7112.m6620());
            if (this.f7113) {
                int i = f7111 + 21;
                f7109 = i % 128;
                if (i % 2 == 0) {
                    strIntern = m7310(new int[]{-459371356, 1131659677, -1044885616, 879201657, -1351254707, 560875220}, InterfaceC3173h3.d.b.f8821d >> TextUtils.indexOf((CharSequence) "", 'G')).intern();
                    strM6619 = f7112.m6619();
                } else {
                    strIntern = m7310(new int[]{-459371356, 1131659677, -1044885616, 879201657, -1351254707, 560875220}, TextUtils.indexOf((CharSequence) "", '0') + 13).intern();
                    strM6619 = f7112.m6619();
                }
                strReplace = strReplace2.replace(strIntern, strM6619);
            } else {
                strReplace = strReplace2.replace(m7310(new int[]{-459371356, 1131659677, -1044885616, 879201657, -1351254707, 560875220}, 12 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), "");
            }
            strM6618 = strReplace;
            String strReplace3 = strM6618.replace(m7310(new int[]{-1703012173, 437792301, 1618068520, 83758290, -122614866, -2006595252, -1351254707, 560875220}, 15 - ImageFormat.getBitsPerPixel(0)).intern(), this.f7114);
            f7111 = (f7109 + 15) % 128;
            return strReplace3;
        } catch (Throwable th) {
            String strIntern2 = m7310(new int[]{1730225077, -1054717173, 166300695, -948343902, 716255996, 470723579, -1553951824, 1374230367, 1920944411, -1717524408}, 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7310(new int[]{2106615906, -1664464282, -56817269, 1493860791, -1946981590, 634445952, -1479632753, -259144010, 1208914898, 2008353439, -1868778903, -612075272}, Process.getGidForName("") + 25).intern());
            sb.append(th.getLocalizedMessage());
            C2921n.m7509(strIntern2, sb.toString());
            return strM6618;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m7307(C2901jp c2901jp) {
        f7111 = (f7109 + 119) % 128;
        String strM7309 = c2901jp.m7309();
        int i = f7109 + 93;
        f7111 = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
        return strM7309;
    }

    /* renamed from: ﾇ */
    private String m7309() {
        f7111 = (f7109 + 49) % 128;
        String strM7071 = C2861ic.m7071(m7306().getBytes());
        int i = f7111 + 23;
        f7109 = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
        return strM7071;
    }

    /* renamed from: ﾒ */
    public final void m7312(WebView webView) {
        try {
            C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4

                /* renamed from: ｋ */
                final /* synthetic */ WebView f7116;

                /* renamed from: com.ironsource.adqualitysdk.sdk.i.jp$4$2 */
                public class AnonymousClass2 extends AbstractRunnableC2878it {

                    /* renamed from: ﾒ */
                    private /* synthetic */ String f7118;

                    public AnonymousClass2(String str) {
                        str = str;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2918kh.m7485(webView, str);
                    }
                }

                public AnonymousClass4(WebView webView2) {
                    webView = webView2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4.2

                        /* renamed from: ﾒ */
                        private /* synthetic */ String f7118;

                        public AnonymousClass2(String str) {
                            str = str;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2918kh.m7485(webView, str);
                        }
                    });
                }
            });
            f7109 = (f7111 + 31) % 128;
        } catch (Exception e) {
            String strIntern = m7310(new int[]{1730225077, -1054717173, 166300695, -948343902, 716255996, 470723579, -1553951824, 1374230367, 1920944411, -1717524408}, 17 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7310(new int[]{2106615906, -1664464282, -56817269, 1493860791, 1191023041, 1135828305, -1975227241, -1923634356, 20172812, 1460068266, -148649119, 1014286643, 1228306089, 2132832352, 923780387, 342093958}, 31 - Color.red(0)).intern());
            sb.append(e.getLocalizedMessage());
            C2921n.m7509(strIntern, sb.toString());
        }
    }

    /* renamed from: ｋ */
    public static void m7308(C2735dl c2735dl) {
        int i = (f7109 + 47) % 128;
        f7111 = i;
        f7112 = c2735dl;
        f7109 = (i + 43) % 128;
    }

    /* renamed from: ﾒ */
    private static String m7311() {
        int i = f7111 + 25;
        f7109 = i % 128;
        if (i % 2 != 0) {
            return AbstractC2661as.m5141().mo5152().m5128();
        }
        AbstractC2661as.m5141().mo5152().m5128();
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m7310(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f7110.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

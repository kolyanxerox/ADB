package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2835hd;
import com.ironsource.adqualitysdk.sdk.p009i.C2836he;
import com.ironsource.adqualitysdk.sdk.p009i.C2837hf;
import com.ironsource.adqualitysdk.sdk.p009i.C2841hj;
import com.ironsource.adqualitysdk.sdk.p009i.C2913ka;
import com.ironsource.adqualitysdk.sdk.p009i.ViewOnClickListenerC2834hc;
import com.ironsource.adqualitysdk.sdk.p009i.ViewOnTouchListenerC2842hk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cy */
/* loaded from: classes2.dex */
public final class C2721cy extends C2722cz {

    /* renamed from: ﻐ */
    private static int f5839 = 1;

    /* renamed from: ﻛ */
    private static char f5840 = 6;

    /* renamed from: ｋ */
    private static char[] f5841 = {'E', 'r', 'o', ' ', 'c', 'e', 'a', 't', 'i', 'n', 'g', 'M', 'd', 'P', 'l', 'y', 'O', 'I', 'f', 'L', 's', 'S', 'k', 'C', 'm', 'p', 'u', 'h', 'A', 'F', 'G', 'H', 'J', 'K', 'N', 'Q'};

    /* renamed from: ﾇ */
    private static int f5842 = 0;

    /* renamed from: ﾒ */
    private static long f5843 = -4213525505828552577L;

    /* renamed from: 爫 */
    public static WebChromeClient m6411(List<Object> list) {
        int i = f5842 + 121;
        f5839 = i % 128;
        WebChromeClient webChromeClientM7481 = C2918kh.m7481((WebView) C2722cz.m6459(list, i % 2 == 0 ? 1 : 0, WebView.class));
        int i2 = f5839 + 77;
        f5842 = i2 % 128;
        if (i2 % 2 == 0) {
            return webChromeClientM7481;
        }
        throw null;
    }

    /* renamed from: ףּ */
    public static WebViewClient m6412(List<Object> list) {
        f5839 = (f5842 + 119) % 128;
        WebViewClient webViewClientM7486 = C2918kh.m7486((WebView) C2722cz.m6459(list, 0, WebView.class));
        f5842 = (f5839 + 55) % 128;
        return webViewClientM7486;
    }

    /* renamed from: ﭖ */
    public static Object m6413(List<Object> list) {
        f5842 = (f5839 + 55) % 128;
        ((C2902jq) C2722cz.m6459(list, 0, C2902jq.class)).m7321();
        int i = f5839 + 47;
        f5842 = i % 128;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
        return null;
    }

    /* renamed from: ﭴ */
    public static C2902jq m6414(List<Object> list) {
        WebView webView;
        String strM6421;
        int i = f5839 + 17;
        f5842 = i % 128;
        if (i % 2 != 0) {
            webView = (WebView) C2722cz.m6459(list, 0, WebView.class);
            strM6421 = m6421("Ղ䍠ꟳဣԣ썻Ꝯ鄲Ӝ셰ꔳ鍵ڕ", 1 % (Process.myTid() / 95));
        } else {
            webView = (WebView) C2722cz.m6459(list, 0, WebView.class);
            strM6421 = m6421("Ղ䍠ꟳဣԣ썻Ꝯ鄲Ӝ셰ꔳ鍵ڕ", (Process.myTid() >> 22) + 1);
        }
        return C2902jq.m7313(webView, strM6421.intern());
    }

    /* renamed from: ﭸ */
    public static boolean m6415(List<Object> list) {
        int i = f5839 + 125;
        f5842 = i % 128;
        boolean zM7411 = C2913ka.m7411(C2722cz.m6459(list, i % 2 != 0 ? 1 : 0, Object.class));
        f5839 = (f5842 + 27) % 128;
        return zM7411;
    }

    /* renamed from: ﮉ */
    public static Object m6416(List<Object> list) {
        InterfaceC2838hg interfaceC2838hg;
        int i = f5839 + 33;
        f5842 = i % 128;
        if (i % 2 != 0) {
            interfaceC2838hg = (InterfaceC2838hg) C2722cz.m6459(list, 1, InterfaceC2838hg.class);
            if (interfaceC2838hg == null) {
                return null;
            }
        } else {
            interfaceC2838hg = (InterfaceC2838hg) C2722cz.m6459(list, 0, InterfaceC2838hg.class);
            if (interfaceC2838hg == null) {
                return null;
            }
        }
        Object objMo5387 = interfaceC2838hg.mo5387();
        f5839 = (f5842 + 71) % 128;
        return objMo5387;
    }

    /* renamed from: ﮌ */
    public static Object m6417(List<Object> list) {
        int i = f5839 + 125;
        f5842 = i % 128;
        ((C2902jq) C2722cz.m6459(list, i % 2 != 0 ? 1 : 0, C2902jq.class)).m7317();
        f5839 = (f5842 + InterfaceC3173h3.d.b.f8819b) % 128;
        return null;
    }

    /* renamed from: ﱡ */
    public static View.OnTouchListener m6418(List<Object> list) {
        int i = f5842 + 41;
        f5839 = i % 128;
        int i2 = i % 2;
        View.OnTouchListener onTouchListenerM7365 = C2909jx.m7365((View) C2722cz.m6459(list, 0, View.class));
        int i3 = f5839 + 69;
        f5842 = i3 % 128;
        if (i3 % 2 == 0) {
            return onTouchListenerM7365;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static Object m6419(List<Object> list) {
        f5842 = (f5839 + InterfaceC3173h3.d.b.f8823f) % 128;
        C2888jc.m7212().m7222((InterfaceC2870il) C2722cz.m6459(list, 0, InterfaceC2870il.class));
        int i = f5839 + 97;
        f5842 = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
        return null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ List m6420(List list, Object[] objArr) {
        f5842 = (f5839 + 25) % 128;
        List<Object> listM6425 = m6425((List<Object>) list, objArr);
        int i = f5839 + 119;
        f5842 = i % 128;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
        return listM6425;
    }

    /* renamed from: ﾇ */
    public static Object m6422(List<Object> list) {
        f5842 = (f5839 + 71) % 128;
        C2888jc.m7212().m7220((InterfaceC2870il) C2722cz.m6459(list, 0, InterfaceC2870il.class));
        int i = f5842 + 47;
        f5839 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static View.OnClickListener m6423(List<Object> list) {
        int i = f5842 + 125;
        f5839 = i % 128;
        return C2909jx.m7359((View) C2722cz.m6459(list, i % 2 == 0 ? 1 : 0, View.class));
    }

    /* renamed from: ﮐ */
    public final Object m6427(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        try {
            final C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            final List<Object> listM6460 = C2722cz.m6460(list, 1);
            c2712cp2 = c2712cp;
            try {
                C2841hj.a aVar = new C2841hj.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.17
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2841hj.a
                    /* renamed from: ﾒ */
                    public final void mo6452(C2841hj c2841hj, MediaPlayer mediaPlayer) {
                        c2743dt.m6711(c2741dr, c2712cp2, C2721cy.m6420(listM6460, new Object[]{this, c2841hj, mediaPlayer}));
                    }
                };
                int i = f5839 + 77;
                f5842 = i % 128;
                if (i % 2 == 0) {
                    return aVar;
                }
                throw null;
            } catch (Exception e) {
                e = e;
                C2713cq.m6350(c2712cp2.m6290(), m6424((byte) (KeyEvent.keyCodeFromString("") + 125), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0005\t\u0000\u0011\t\u0007\u000e\u000f\t\f\u0000\u0002\u000f\n\u0017\u0003\u0004\u0017\u0014\u0005\u0019\u001a\u0011\u0002\u000b\u0001\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", (ViewConfiguration.getTapTimeout() >> 16) + 48).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c2712cp2 = c2712cp;
        }
    }

    /* renamed from: ﱟ */
    public final Object m6429(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        try {
            final C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            final List<Object> listM6460 = C2722cz.m6460(list, 1);
            final boolean zM6426 = m6426(list, 2);
            c2712cp2 = c2712cp;
            try {
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.5

                    /* renamed from: ﮐ */
                    private static int f5913 = 185;

                    /* renamed from: ﱡ */
                    private static int f5914 = 1;

                    /* renamed from: ﻏ */
                    private static int f5915;

                    /* renamed from: ﻐ */
                    private static String m6455(int i, int i2, int i3, String str, boolean z) {
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
                                    cArr2[i5] = (char) (cArr2[i5] - f5913);
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

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        f5914 = (f5915 + 115) % 128;
                        try {
                            final List<Object> listM6420 = C2721cy.m6420(listM6460, new Object[]{this, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)});
                            if (!zM6426) {
                                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.5.1
                                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                    /* renamed from: ﾒ */
                                    public final void mo4950() {
                                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                        c2743dt.m6711(c2741dr, c2712cp2, listM6420);
                                    }
                                });
                                return;
                            }
                            f5915 = (f5914 + 37) % 128;
                            c2743dt.m6711(c2741dr, c2712cp2, listM6420);
                            f5915 = (f5914 + 65) % 128;
                        } catch (Throwable th) {
                            String strM6290 = c2712cp2.m6290();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m6455(View.MeasureSpec.getMode(0) + 15, 38 - TextUtils.lastIndexOf("", '0', 0), 281 - (KeyEvent.getMaxKeyCode() >> 16), "\u000f\u0019\u0001￬\u000e\uffef\uffc0\u000e\t\uffc0\u0012\u000f\u0012\u0012￥\uffc0\u0005\u0004\t\u0013\u000e\t\uffc0\u0012\u0005\u000e\u0005\u0014\u0013\t￬\u0005\u0007\u000e\u0001\b￣\u0014\u0015", true).intern());
                            sb.append(c2743dt.m6712());
                            C2713cq.m6350(strM6290, sb.toString(), th);
                        }
                    }
                };
                f5842 = (f5839 + 87) % 128;
                return onLayoutChangeListener;
            } catch (Exception e) {
                e = e;
                C2713cq.m6350(c2712cp2.m6290(), m6424((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0004\u000f\u0007\u0015\t\f\b \u000b\u0013\u0018\t\n\u000b\u0001\u0017\u000e\u001a\u000b\u0001\u000b\u0003{", 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c2712cp2 = c2712cp;
        }
    }

    /* renamed from: ﺙ */
    public final Object m6432(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        try {
            final C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            final C2743dt c2743dt2 = (C2743dt) C2722cz.m6459(list, 1, C2743dt.class);
            final List<Object> listM6460 = C2722cz.m6460(list, 2);
            final boolean zM6426 = m6426(list, 3);
            c2712cp2 = c2712cp;
            try {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.1

                    /* renamed from: ﭖ */
                    private static int f5844 = 1;

                    /* renamed from: ﭴ */
                    private static char f5845 = 8667;

                    /* renamed from: ﭸ */
                    private static int f5846 = 0;

                    /* renamed from: ﱟ */
                    private static char f5847 = 54072;

                    /* renamed from: ﱡ */
                    private static char f5848 = 42212;

                    /* renamed from: ﺙ */
                    private static char f5849 = 44826;

                    /* renamed from: ﾇ */
                    private void m6444(final C2743dt c2743dt3, View view) {
                        try {
                            final List<Object> listM6420 = C2721cy.m6420(listM6460, new Object[]{this, view});
                            if (!zM6426) {
                                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.1.2
                                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                    /* renamed from: ﾒ */
                                    public final void mo4950() {
                                        C2743dt c2743dt4 = c2743dt3;
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c2743dt4.m6711(c2741dr, c2712cp2, listM6420);
                                    }
                                });
                                f5846 = (f5844 + 35) % 128;
                                return;
                            }
                            c2743dt3.m6711(c2741dr, c2712cp2, listM6420);
                            int i = f5846 + 97;
                            f5844 = i % 128;
                            if (i % 2 == 0) {
                                int i2 = 47 / 0;
                            }
                        } catch (Throwable th) {
                            String strM6290 = c2712cp2.m6290();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m6445("䏼뗼圁\u009f뜉夀⤫氣\ue4ea濳瓸ꐩ䑮ረ\ue2c8ꝱﻝ殴䘙⫃帥ण譸繯\ue6e4ꭘ\ue88a꼈ፅ䟯ᐈ䒍덋罞ᜣ㬔텕膸䙂㐉ಐ퉿柪骮", Color.rgb(0, 0, 0) + 16777260).intern());
                            sb.append(c2743dt3.m6712());
                            C2713cq.m6350(strM6290, sb.toString(), th);
                        }
                    }

                    /* renamed from: ﾒ */
                    private static String m6445(String str, int i) {
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
                                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5848)) ^ ((c2 >>> 5) + f5845)));
                                            cArr3[1] = c3;
                                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5847) ^ ((c3 + i3) ^ ((c3 << 4) + f5849))));
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

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        f5846 = (f5844 + 13) % 128;
                        m6444(c2743dt, view);
                        f5844 = (f5846 + 19) % 128;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        f5846 = (f5844 + 107) % 128;
                        m6444(c2743dt2, view);
                        int i = f5846 + 27;
                        f5844 = i % 128;
                        if (i % 2 == 0) {
                            throw null;
                        }
                    }
                };
                int i = f5839 + 67;
                f5842 = i % 128;
                if (i % 2 == 0) {
                    return onAttachStateChangeListener;
                }
                throw null;
            } catch (Exception e) {
                e = e;
                C2713cq.m6350(c2712cp2.m6290(), m6424((byte) (90 - ((Process.getThreadPriority(0) + 20) >> 6)), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0004\u000f\n\u001bÎÎ\n\u0000!\u001b\b\u0007\u000b\u0001\u0015\u001d\u0007\n\u000b\u0004\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c2712cp2 = c2712cp;
        }
    }

    /* renamed from: ﻏ */
    public final Object m6434(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        final C2743dt c2743dt;
        final List<Object> listM6460;
        try {
            c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            listM6460 = C2722cz.m6460(list, 1);
            c2712cp2 = c2712cp;
        } catch (Exception e) {
            e = e;
            c2712cp2 = c2712cp;
        }
        try {
            C2836he.a aVar = new C2836he.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.18
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2836he.a
                /* renamed from: ﻛ */
                public final void mo6453(C2836he c2836he, MediaPlayer mediaPlayer) {
                    c2743dt.m6711(c2741dr, c2712cp2, C2721cy.m6420(listM6460, new Object[]{this, c2836he, mediaPlayer}));
                }
            };
            f5842 = (f5839 + 109) % 128;
            return aVar;
        } catch (Exception e2) {
            e = e2;
            C2713cq.m6350(c2712cp2.m6290(), m6421("䱹횎鱘커䰼嚃鳔俶䷷哕黁䷯俤劘飚䯸䧣傚骊䧘䯬庅铟䟨䗅岉雓䗴䟴媛郱䏯䇞墂鋗䇵䏵䚴賲忐巊䒻軎巔忒䊭裫察姈䂯", 1 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2909jx.m7357(r0, new com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass12());
        com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5842 = (com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5839 + 95) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if ((!m6426(r7, 3)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (m6426(r7, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2909jx.m7357(r0, r1);
     */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6441(java.util.List<java.lang.Object> r7) {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5842
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5839 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hc$d> r2 = com.ironsource.adqualitysdk.sdk.p009i.ViewOnClickListenerC2834hc.d.class
            r3 = 0
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r5 = 1
            if (r0 != 0) goto L27
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r7, r5, r4)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r7, r3, r2)
            com.ironsource.adqualitysdk.sdk.i.hc$d r1 = (com.ironsource.adqualitysdk.sdk.p009i.ViewOnClickListenerC2834hc.d) r1
            r2 = 3
            boolean r7 = m6426(r7, r2)
            r7 = r7 ^ r5
            if (r7 == r5) goto L3e
            goto L3a
        L27:
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r7, r3, r4)
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r7, r5, r2)
            com.ironsource.adqualitysdk.sdk.i.hc$d r2 = (com.ironsource.adqualitysdk.sdk.p009i.ViewOnClickListenerC2834hc.d) r2
            boolean r7 = m6426(r7, r1)
            r1 = r2
            if (r7 == 0) goto L3e
        L3a:
            com.ironsource.adqualitysdk.sdk.p009i.C2909jx.m7357(r0, r1)
            goto L4e
        L3e:
            com.ironsource.adqualitysdk.sdk.i.cy$12 r7 = new com.ironsource.adqualitysdk.sdk.i.cy$12
            r7.<init>()
            com.ironsource.adqualitysdk.sdk.p009i.C2909jx.m7357(r0, r7)
            int r7 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5839
            int r7 = r7 + 95
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5842 = r7
        L4e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2721cy.m6441(java.util.List):java.lang.Object");
    }

    /* renamed from: ﻛ */
    public final InterfaceC2870il m6437(final C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            f5842 = (f5839 + 55) % 128;
            arrayList.addAll((Collection) C2722cz.m6459(list, 1, List.class));
        }
        if (c2743dt != null) {
            return new InterfaceC2870il() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.3
                @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2870il
                /* renamed from: ｋ */
                public final void mo6454() {
                    arrayList.add(0, this);
                    c2743dt.m6711(c2741dr, c2712cp, arrayList);
                    arrayList.remove(0);
                }
            };
        }
        f5839 = (f5842 + 9) % 128;
        return null;
    }

    /* renamed from: ﱡ */
    public final Object m6431(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        try {
            final C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            final List<Object> listM6460 = C2722cz.m6460(list, 1);
            final boolean zM6426 = m6426(list, 2);
            c2712cp2 = c2712cp;
            try {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.8
                    /* renamed from: ｋ */
                    public static /* synthetic */ void m6456(AnonymousClass8 anonymousClass8, C2743dt c2743dt2, C2741dr c2741dr2, C2712cp c2712cp3, List list2, Context context, Intent intent) {
                        c2743dt2.m6711(c2741dr2, c2712cp3, C2721cy.m6420(list2, new Object[]{anonymousClass8, context, intent}));
                    }

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(final Context context, final Intent intent) {
                        if (zM6426) {
                            c2743dt.m6711(c2741dr, c2712cp2, C2721cy.m6420(listM6460, new Object[]{this, context, intent}));
                        } else {
                            C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.8.5
                                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                /* renamed from: ﾒ */
                                public final void mo4950() {
                                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                    AnonymousClass8.m6456(anonymousClass8, c2743dt, c2741dr, c2712cp2, listM6460, context, intent);
                                }
                            });
                        }
                    }
                };
                int i = f5842 + 41;
                f5839 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 8 / 0;
                }
                return broadcastReceiver;
            } catch (Exception e) {
                e = e;
                C2713cq.m6350(c2712cp2.m6290(), m6421("ᜭ쓽╺ࢍᝨ䓰◶覟ᚣ䚦⟣讆ᒰ䃫⇸趑\u12b7䋩⎨达Ⴏ䳽ⷵ膄Ả价\u2fe3莐Თ䣿⧿薍᪠䫨⯽螞", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c2712cp2 = c2712cp;
        }
    }

    /* renamed from: ﾒ */
    public final Object m6443(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        final C2743dt c2743dt;
        final List<Object> listM6460;
        try {
            c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            listM6460 = C2722cz.m6460(list, 1);
            c2712cp2 = c2712cp;
        } catch (Exception e) {
            e = e;
            c2712cp2 = c2712cp;
        }
        try {
            C2835hd.e eVar = new C2835hd.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.13
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2835hd.e
                /* renamed from: ﻛ */
                public final boolean mo6450(C2835hd c2835hd, MediaPlayer mediaPlayer, int i, int i2) {
                    return c2743dt.m6711(c2741dr, c2712cp2, C2721cy.m6420(listM6460, new Object[]{this, c2835hd, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)})).m6721();
                }
            };
            f5839 = (f5842 + 79) % 128;
            return eVar;
        } catch (Exception e2) {
            e = e2;
            C2713cq.m6350(c2712cp2.m6290(), m6424((byte) (TextUtils.lastIndexOf("", '0', 0) + 40), "\u0001\u0002\u0002\u0003\u0002\u0004\u0005\u0002\u0000\u000b\b\t\n\u000b\u0005\t\u0000\u0011\t\u0007\u000e\u000f\t\f\u0000\u0002\u000f\n\u000f\u000b\u0014\u0000\u0014\u0007\u0013\b\u0003\u000b\u0000\u0002", View.MeasureSpec.getMode(0) + 40).intern(), e);
            return null;
        }
    }

    /* renamed from: ﻐ */
    public final Object m6436(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        final C2743dt c2743dt;
        final List<Object> listM6460;
        try {
            c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            listM6460 = C2722cz.m6460(list, 1);
            c2712cp2 = c2712cp;
        } catch (Exception e) {
            e = e;
            c2712cp2 = c2712cp;
        }
        try {
            ViewOnTouchListenerC2842hk.d dVar = new ViewOnTouchListenerC2842hk.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.15
                @Override // com.ironsource.adqualitysdk.sdk.p009i.ViewOnTouchListenerC2842hk.d
                /* renamed from: ﾒ */
                public final boolean mo6451(ViewOnTouchListenerC2842hk viewOnTouchListenerC2842hk, View view, MotionEvent motionEvent) {
                    return c2743dt.m6711(c2741dr, c2712cp2, C2721cy.m6420(listM6460, new Object[]{this, viewOnTouchListenerC2842hk, view, motionEvent})).m6721();
                }
            };
            f5842 = (f5839 + 65) % 128;
            return dVar;
        } catch (Exception e2) {
            e = e2;
            C2713cq.m6350(c2712cp2.m6290(), m6421("ᨶ獪撬\ue1f0ᩳ\uf367搠惢᮸\uf131昵拻ᦫ\uf77c怮擬ᾬ\uf57e找曗ᶯﭠ氵棒Ꮄ凌温櫬ᆽ･栆泼ឡﵽ樫滿ᖳ\ue347", 1 - TextUtils.getOffsetAfter("", 0)).intern(), e);
            return null;
        }
    }

    /* renamed from: ﾇ */
    public final Object m6442(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        try {
            final C2743dt c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            final List<Object> listM6460 = C2722cz.m6460(list, 1);
            c2712cp2 = c2712cp;
            try {
                ViewOnClickListenerC2834hc.d dVar = new ViewOnClickListenerC2834hc.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.9
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.ViewOnClickListenerC2834hc.d
                    /* renamed from: ﻛ */
                    public final void mo6449(ViewOnClickListenerC2834hc viewOnClickListenerC2834hc, View view) {
                        c2743dt.m6711(c2741dr, c2712cp2, C2721cy.m6420(listM6460, new Object[]{this, viewOnClickListenerC2834hc, view}));
                    }
                };
                int i = f5839 + 21;
                f5842 = i % 128;
                if (i % 2 == 0) {
                    return dVar;
                }
                throw null;
            } catch (Exception e) {
                e = e;
                C2713cq.m6350(c2712cp2.m6290(), m6421("\ud95bꃑ耨\uffd0\ud91e⃜肤绂\ud8d5⊊花糛\udac6Ⓡ蒪竌\udcc1⛅蛺磷\udec2⣛袱盲탙⫹誮瓐틐ⳝ貂狜퓌⻆躯烟훞ー", -MotionEvent.axisFromString("")).intern(), e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            c2712cp2 = c2712cp;
        }
    }

    /* renamed from: ﮐ */
    public final Object m6428(List<Object> list) throws IllegalAccessException, IllegalArgumentException {
        MediaPlayer mediaPlayer = (MediaPlayer) C2722cz.m6459(list, 0, MediaPlayer.class);
        final C2835hd.e eVar = (C2835hd.e) C2722cz.m6459(list, 1, C2835hd.e.class);
        if (m6426(list, 2)) {
            C2909jx.m7360(mediaPlayer, eVar);
            f5842 = (f5839 + 1) % 128;
        } else {
            C2909jx.m7360(mediaPlayer, new C2835hd.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.7
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2835hd.e
                /* renamed from: ﻛ */
                public final boolean mo6450(final C2835hd c2835hd, final MediaPlayer mediaPlayer2, final int i, final int i2) {
                    C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.7.2
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            eVar.mo6450(c2835hd, mediaPlayer2, i, i2);
                        }
                    });
                    return false;
                }
            });
        }
        f5839 = (f5842 + 39) % 128;
        return null;
    }

    /* renamed from: ﻏ */
    public final Object m6435(List<Object> list) throws IllegalAccessException, IllegalArgumentException {
        f5842 = (f5839 + 47) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) C2722cz.m6459(list, 0, MediaPlayer.class);
        final C2837hf.c cVar = (C2837hf.c) C2722cz.m6459(list, 1, C2837hf.c.class);
        if (!(!m6426(list, 2))) {
            f5842 = (f5839 + 49) % 128;
            C2909jx.m7362(mediaPlayer, cVar);
        } else {
            C2909jx.m7362(mediaPlayer, new C2837hf.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.4
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2837hf.c
                /* renamed from: ﾒ */
                public final void mo6448(final C2837hf c2837hf, final MediaPlayer mediaPlayer2) {
                    C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.4.2
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            cVar.mo6448(c2837hf, mediaPlayer2);
                        }
                    });
                }
            });
            f5839 = (f5842 + 59) % 128;
        }
        f5839 = (f5842 + 31) % 128;
        return null;
    }

    /* renamed from: ﱟ */
    public final Object m6430(List<Object> list) throws IllegalAccessException, IllegalArgumentException {
        f5842 = (f5839 + InterfaceC3173h3.d.b.f8819b) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) C2722cz.m6459(list, 0, MediaPlayer.class);
        final C2841hj.a aVar = (C2841hj.a) C2722cz.m6459(list, 1, C2841hj.a.class);
        if (m6426(list, 2)) {
            C2909jx.m7364(mediaPlayer, aVar);
        } else {
            C2909jx.m7364(mediaPlayer, new C2841hj.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.2
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2841hj.a
                /* renamed from: ﾒ */
                public final void mo6452(final C2841hj c2841hj, final MediaPlayer mediaPlayer2) {
                    C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.2.5
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            aVar.mo6452(c2841hj, mediaPlayer2);
                        }
                    });
                }
            });
        }
        int i = f5839 + 23;
        f5842 = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[PHI: r0 r1
  0x003d: PHI (r0v6 android.media.MediaPlayer) = (r0v4 android.media.MediaPlayer), (r0v8 android.media.MediaPlayer) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r1v4 com.ironsource.adqualitysdk.sdk.i.he$a) = (r1v2 com.ironsource.adqualitysdk.sdk.i.he$a), (r1v6 com.ironsource.adqualitysdk.sdk.i.he$a) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r0 r1
  0x0039: PHI (r0v5 android.media.MediaPlayer) = (r0v4 android.media.MediaPlayer), (r0v8 android.media.MediaPlayer) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r1v3 com.ironsource.adqualitysdk.sdk.i.he$a) = (r1v2 com.ironsource.adqualitysdk.sdk.i.he$a), (r1v6 com.ironsource.adqualitysdk.sdk.i.he$a) binds: [B:8:0x0037, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﺙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m6433(java.util.List<java.lang.Object> r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5842
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5839 = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.he$a> r2 = com.ironsource.adqualitysdk.sdk.p009i.C2836he.a.class
            java.lang.Class<android.media.MediaPlayer> r3 = android.media.MediaPlayer.class
            r4 = 0
            if (r0 != 0) goto L25
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r6, r4, r3)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r6, r4, r2)
            com.ironsource.adqualitysdk.sdk.i.he$a r1 = (com.ironsource.adqualitysdk.sdk.p009i.C2836he.a) r1
            r2 = 4
            boolean r6 = m6426(r6, r2)
            if (r6 == 0) goto L3d
            goto L39
        L25:
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r6, r4, r3)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            r3 = 1
            java.lang.Object r2 = com.ironsource.adqualitysdk.sdk.p009i.C2722cz.m6459(r6, r3, r2)
            com.ironsource.adqualitysdk.sdk.i.he$a r2 = (com.ironsource.adqualitysdk.sdk.p009i.C2836he.a) r2
            boolean r6 = m6426(r6, r1)
            r1 = r2
            if (r6 == 0) goto L3d
        L39:
            com.ironsource.adqualitysdk.sdk.p009i.C2909jx.m7361(r0, r1)
            goto L45
        L3d:
            com.ironsource.adqualitysdk.sdk.i.cy$6 r6 = new com.ironsource.adqualitysdk.sdk.i.cy$6
            r6.<init>()
            com.ironsource.adqualitysdk.sdk.p009i.C2909jx.m7361(r0, r6)
        L45:
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5842
            int r6 = r6 + 111
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2721cy.f5839 = r6
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2721cy.m6433(java.util.List):java.lang.Object");
    }

    /* renamed from: ﾒ */
    private static List<Object> m6425(List<Object> list, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            f5839 = (f5842 + 81) % 128;
            arrayList.addAll(list);
        }
        int i = f5839 + 97;
        f5842 = i % 128;
        if (i % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public final Object m6439(List<Object> list) {
        f5839 = (f5842 + 77) % 128;
        View view = (View) C2722cz.m6459(list, 0, View.class);
        final ViewOnTouchListenerC2842hk.d dVar = (ViewOnTouchListenerC2842hk.d) C2722cz.m6459(list, 1, ViewOnTouchListenerC2842hk.d.class);
        if (m6426(list, 2)) {
            C2909jx.m7358(view, dVar);
            f5842 = (f5839 + 115) % 128;
        } else {
            C2909jx.m7358(view, new ViewOnTouchListenerC2842hk.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.14
                @Override // com.ironsource.adqualitysdk.sdk.p009i.ViewOnTouchListenerC2842hk.d
                /* renamed from: ﾒ */
                public final boolean mo6451(final ViewOnTouchListenerC2842hk viewOnTouchListenerC2842hk, final View view2, final MotionEvent motionEvent) {
                    C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.14.3
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            dVar.mo6451(viewOnTouchListenerC2842hk, view2, motionEvent);
                        }
                    });
                    return false;
                }
            });
        }
        int i = f5842 + 65;
        f5839 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final Object m6440(C2712cp c2712cp, List<Object> list, final C2741dr c2741dr) {
        final C2712cp c2712cp2;
        final C2743dt c2743dt;
        final List<Object> listM6460;
        try {
            c2743dt = (C2743dt) C2722cz.m6459(list, 0, C2743dt.class);
            listM6460 = C2722cz.m6460(list, 1);
            c2712cp2 = c2712cp;
        } catch (Exception e) {
            e = e;
            c2712cp2 = c2712cp;
        }
        try {
            C2837hf.c cVar = new C2837hf.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.11
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2837hf.c
                /* renamed from: ﾒ */
                public final void mo6448(C2837hf c2837hf, MediaPlayer mediaPlayer) {
                    c2743dt.m6711(c2741dr, c2712cp2, C2721cy.m6420(listM6460, new Object[]{this, c2837hf, mediaPlayer}));
                }
            };
            f5839 = (f5842 + 21) % 128;
            return cVar;
        } catch (Exception e2) {
            e = e2;
            C2713cq.m6350(c2712cp2.m6290(), m6421("扉眻㥚媮戌\uf736㧖\udbbc揇\uf560㯃\ud9a5懔\uf32d㷘\udfb2染\uf12f㾈\udd92旜Ｐ㇝펢毵ﴼ㏑톾槄אַ㗳\ud7a5濽浪㟝햿淈\ue716⧡쮗珙\ue509⯳즃燴\ue302ⷩ쾉", -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), e);
            return null;
        }
    }

    /* renamed from: ﾒ */
    private static boolean m6426(List<Object> list, int i) {
        if (list.size() > i) {
            int i2 = f5842 + 15;
            f5839 = i2 % 128;
            int i3 = i2 % 2;
            Boolean bool = (Boolean) C2722cz.m6459(list, i, Boolean.class);
            if (i3 == 0) {
                bool.booleanValue();
                throw null;
            }
            if (bool.booleanValue()) {
                int i4 = f5842 + 99;
                f5839 = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }
        }
        f5839 = (f5842 + 71) % 128;
        return false;
    }

    /* renamed from: ﾒ */
    private static String m6424(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f5841;
                char c = f5840;
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
    private static String m6421(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5843, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5843));
                        C2777f.f6321 = i2 + 1;
                    } else {
                        str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ */
    public final Object m6438(final C2712cp c2712cp, List<Object> list) {
        final String simpleName;
        f5839 = (f5842 + InterfaceC3173h3.d.b.f8823f) % 128;
        Class cls = (Class) C2722cz.m6459(list, 0, Class.class);
        Object objM6459 = C2722cz.m6459(list, 1, Object.class);
        final boolean zBooleanValue = list.size() > 2 ? ((Boolean) C2722cz.m6459(list, 2, Boolean.class)).booleanValue() : false;
        if (list.size() > 3) {
            simpleName = (String) C2722cz.m6459(list, 3, String.class);
            f5842 = (f5839 + 17) % 128;
        } else {
            simpleName = cls.getSimpleName();
        }
        return C2913ka.m7412(cls, objM6459, new C2913ka.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cy.10

            /* renamed from: ﱟ */
            private static int f5860 = 0;

            /* renamed from: ﻏ */
            private static int f5861 = 1;

            /* renamed from: ｋ */
            private static char[] f5862 = {23, 128, 278, 301, 299, 299, 260, 255, 294, 301, 301, 296, 293, 294, 293, 254, 16, ' ', 'G', 'n', 'G', 'B', 'i', 'k', 'n', 'l', 'i', 'A', 137, 144, 139, 135, 'c', 'f', 136, 134};

            /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #1 {Exception -> 0x0016, blocks: (B:5:0x0010, B:13:0x001a, B:15:0x0044, B:17:0x004e, B:20:0x0067, B:22:0x0073, B:16:0x0049), top: B:30:0x0010 }] */
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2913ka.e
            /* renamed from: ﻐ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void mo6447(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
                /*
                    r5 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5861
                    int r0 = r0 + 77
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5860 = r1
                    int r0 = r0 % 2
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L18
                    r0 = 47
                    int r0 = r0 / r2
                    if (r7 == 0) goto Lde
                    goto L1a
                L14:
                    r6 = move-exception
                    throw r6
                L16:
                    r6 = move-exception
                    goto L7d
                L18:
                    if (r7 == 0) goto Lde
                L1a:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
                    r0.<init>()     // Catch: java.lang.Exception -> L16
                    java.lang.String r3 = r2     // Catch: java.lang.Exception -> L16
                    r0.append(r3)     // Catch: java.lang.Exception -> L16
                    int[] r3 = new int[]{r2, r1, r2, r2}     // Catch: java.lang.Exception -> L16
                    java.lang.String r4 = "\u0000"
                    java.lang.String r3 = m6446(r2, r3, r4)     // Catch: java.lang.Exception -> L16
                    java.lang.String r3 = r3.intern()     // Catch: java.lang.Exception -> L16
                    r0.append(r3)     // Catch: java.lang.Exception -> L16
                    java.lang.String r3 = r7.getName()     // Catch: java.lang.Exception -> L16
                    r0.append(r3)     // Catch: java.lang.Exception -> L16
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L16
                    com.ironsource.adqualitysdk.sdk.i.hg r6 = (com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2838hg) r6     // Catch: java.lang.Exception -> L16
                    if (r8 == 0) goto L49
                    java.util.List r8 = java.util.Arrays.asList(r8)     // Catch: java.lang.Exception -> L16
                    goto L4e
                L49:
                    java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L16
                    r8.<init>()     // Catch: java.lang.Exception -> L16
                L4e:
                    java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L16
                    java.util.List r6 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.m6420(r8, r6)     // Catch: java.lang.Exception -> L16
                    java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L16
                    r8.<init>()     // Catch: java.lang.Exception -> L16
                    boolean r3 = r3     // Catch: java.lang.Exception -> L16
                    if (r3 == 0) goto L73
                    int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5860
                    int r3 = r3 + 113
                    int r3 = r3 % 128
                    com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5861 = r3
                    r8.add(r6)     // Catch: java.lang.Exception -> L16
                    int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5860
                    int r6 = r6 + 97
                    int r6 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5861 = r6
                    r6 = r8
                L73:
                    com.ironsource.adqualitysdk.sdk.i.cp r8 = r4     // Catch: java.lang.Exception -> L16
                    com.ironsource.adqualitysdk.sdk.i.ch r8 = r8.m6289()     // Catch: java.lang.Exception -> L16
                    r8.mo6153(r0, r6)     // Catch: java.lang.Exception -> L16
                    goto Lde
                L7d:
                    com.ironsource.adqualitysdk.sdk.i.cp r8 = r4
                    java.lang.String r8 = r8.m6290()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r3 = 15
                    r4 = 187(0xbb, float:2.62E-43)
                    int[] r3 = new int[]{r1, r3, r4, r2}
                    java.lang.String r4 = "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001"
                    java.lang.String r3 = m6446(r2, r3, r4)
                    java.lang.String r3 = r3.intern()
                    r0.append(r3)
                    java.lang.String r7 = r7.getName()
                    r0.append(r7)
                    r7 = 16
                    r3 = 11
                    int[] r7 = new int[]{r7, r3, r2, r1}
                    java.lang.String r2 = "\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000"
                    java.lang.String r7 = m6446(r1, r7, r2)
                    java.lang.String r7 = r7.intern()
                    r0.append(r7)
                    java.lang.String r7 = r2
                    r0.append(r7)
                    r7 = 29
                    r2 = 6
                    r3 = 27
                    r4 = 9
                    int[] r7 = new int[]{r3, r4, r7, r2}
                    java.lang.String r2 = "\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001"
                    java.lang.String r7 = m6446(r1, r7, r2)
                    java.lang.String r7 = r7.intern()
                    r0.append(r7)
                    java.lang.String r7 = r0.toString()
                    com.ironsource.adqualitysdk.sdk.p009i.C2713cq.m6350(r8, r7, r6)
                    return
                Lde:
                    int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5860
                    int r6 = r6 + 125
                    int r7 = r6 % 128
                    com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.f5861 = r7
                    int r6 = r6 % 2
                    if (r6 != 0) goto Led
                    r6 = 18
                    int r6 = r6 / r2
                Led:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2721cy.AnonymousClass10.mo6447(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
            }

            /* renamed from: ﻐ */
            private static String m6446(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                        System.arraycopy(f5862, i, cArr, 0, i2);
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
        });
    }
}

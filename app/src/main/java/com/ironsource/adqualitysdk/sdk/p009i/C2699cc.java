package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cc */
/* loaded from: classes2.dex */
public final class C2699cc extends AbstractC2676bg {

    /* renamed from: ﱡ */
    private static int f5552 = 1;

    /* renamed from: ﻏ */
    private static int f5554 = 0;

    /* renamed from: ﻐ */
    private static int f5555 = 29;

    /* renamed from: ｋ */
    private static boolean f5557 = true;

    /* renamed from: ﾒ */
    private static boolean f5559 = true;

    /* renamed from: ﻛ */
    private static char[] f5556 = {'J', 'r', 139, 134, 145, 150, '^', 129, 144, 'f', 'i', 130, 143, 'b', 149, 'q', '_', 't', 127, 's', 148, 141, 'o', 142, 146, 147, 'j', 140, 151, '~', '`', 138, 128, 'p', 133, 'e', 137, 131, 132, 'm', 'l', 'd', 'a', 'v', 'n', 'c'};

    /* renamed from: ﱟ */
    private static char f5551 = 11262;

    /* renamed from: ﺙ */
    private static char f5553 = 13939;

    /* renamed from: ﮐ */
    private static char f5550 = 41215;

    /* renamed from: ﾇ */
    private static char f5558 = 1009;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cc$a */
    public class a extends WebViewApp implements InterfaceC2838hg<WebViewApp> {

        /* renamed from: ﮌ */
        private static int f5568 = 1;

        /* renamed from: ﮐ */
        private static char f5569 = 16526;

        /* renamed from: ﱟ */
        private static int f5570 = 0;

        /* renamed from: ﱡ */
        private static char f5571 = 43528;

        /* renamed from: ﺙ */
        private static char f5572 = 6;

        /* renamed from: ﻏ */
        private static char[] f5573 = {'W', 'e', 'b', 'V', 'i', 'w', 'A', 'p', '.', 's', 't', 'F', 'a', 'l', 'u', 'r', 'M', 'g', 'C', 'o', 'd', 'I', 'n', 'z', 'v', 'k', 'h', 'c', 'm', 'E', 'S', 'X', 'Y', 'Z', '[', '\\'};

        /* renamed from: ﻐ */
        private static char f5574 = 58902;

        /* renamed from: ﾒ */
        private static char f5575 = 5570;

        /* renamed from: ｋ */
        private WebViewApp f5577;

        /* renamed from: ﾇ */
        private InterfaceC2704ch f5578;

        public a(WebViewApp webViewApp, InterfaceC2704ch interfaceC2704ch) {
            this.f5577 = webViewApp;
            this.f5578 = interfaceC2704ch;
        }

        /* renamed from: ﻐ */
        private WebViewApp m6095() {
            int i = f5570 + InterfaceC3173h3.d.b.f8823f;
            f5568 = i % 128;
            if (i % 2 != 0) {
                return this.f5577;
            }
            throw null;
        }

        /* renamed from: ﾒ */
        private static String m6097(byte b, String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2858i.f6710) {
                try {
                    char[] cArr2 = f5573;
                    char c = f5572;
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

        /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void addCallback(com.unity3d.services.core.webview.bridge.NativeCallback r7) {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570
                int r0 = r0 + 21
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bßß\u0006\u000eÓÓ\u0018\u0012ÛÛ\u0000\u000e\u001c\u001a"
                r2 = 0
                if (r0 != 0) goto L36
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                r4 = 22
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
                int r4 = r4 << r5
                byte r4 = (byte) r4
                int r5 = android.view.KeyEvent.getModifierMetaStateMask()
                byte r5 = (byte) r5
                int r5 = r5 * 113
                java.lang.String r1 = m6097(r4, r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r4[r2] = r7
                r0.m5464(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L60
                goto L5b
            L36:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
                int r2 = r2 + 111
                byte r2 = (byte) r2
                int r4 = android.view.KeyEvent.getModifierMetaStateMask()
                byte r4 = (byte) r4
                int r4 = r4 + 23
                java.lang.String r1 = m6097(r2, r1, r4)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r2 = new java.lang.Object[]{r7}
                r0.m5464(r6, r3, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L60
            L5b:
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                r0.addCallback(r7)
            L60:
                int r7 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570
                int r7 = r7 + 59
                int r0 = r7 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = r0
                int r7 = r7 % 2
                if (r7 == 0) goto L6d
                return
            L6d:
                r7 = 0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.addCallback(com.unity3d.services.core.webview.bridge.NativeCallback):void");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public NativeCallback getCallback(String str) {
            int i = f5570 + 25;
            f5568 = i % 128;
            if (i % 2 == 0) {
                C2699cc c2699cc = C2699cc.this;
                InterfaceC2704ch interfaceC2704ch = this.f5578;
                String strIntern = m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆鈒퇑ꐇ⠢\ueb4c⪕㓀늏", 117 / (TypedValue.complexToFloat(0) > 1.0f ? 1 : (TypedValue.complexToFloat(0) == 1.0f ? 0 : -1))).intern();
                Object[] objArr = new Object[1];
                objArr[1] = str;
                c2699cc.m5464(this, interfaceC2704ch, strIntern, objArr);
                if (this.f5577 == null) {
                    return null;
                }
            } else {
                C2699cc.this.m5464(this, this.f5578, m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆鈒퇑ꐇ⠢\ueb4c⪕㓀늏", 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), str);
                if (this.f5577 == null) {
                    return null;
                }
            }
            f5568 = (f5570 + 93) % 128;
            NativeCallback callback = this.f5577.getCallback(str);
            int i2 = f5568 + 51;
            f5570 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 18 / 0;
            }
            return callback;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public Configuration getConfiguration() {
            C2699cc.this.m5464(this, this.f5578, m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆\ue894렶櫤\u0992枖뙹㡢李挫ᕕꧪ圪꿌럥", Color.rgb(0, 0, 0) + 16777243).intern(), new Object[0]);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                f5568 = (f5570 + 27) % 128;
                return webViewApp.getConfiguration();
            }
            f5568 = (f5570 + 69) % 128;
            return null;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public ErrorState getErrorStateFromWebAppCode() {
            f5568 = (f5570 + 51) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (22 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0085\u0085\u000b\u000e\u0004\u0007\u001b\u0011\r\u0015\f!\u0006\u0010\u0007\u0004\t\u0011\u0016\u0019\u0001\u0002\u0000\b\u0085\u0085\u0013\u0014\u0013\u0002", 38 - KeyEvent.getDeadChar(0, 0)).intern(), new Object[0]);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp == null) {
                int i = f5570 + 67;
                f5568 = i % 128;
                if (i % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i2 = f5570 + 17;
            f5568 = i2 % 128;
            if (i2 % 2 != 0) {
                return webViewApp.getErrorStateFromWebAppCode();
            }
            webViewApp.getErrorStateFromWebAppCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
        
            return 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
        
            if (r6.f5577 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
        
            if (r6.f5577 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
        
            com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = (com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 + 39) % 128;
            r0 = r6.f5577.getWebAppFailureCode();
            com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 = (com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 + 91) % 128;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getWebAppFailureCode() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570
                int r0 = r0 + 15
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李贘ȫ\uf7d6\uf4d0\uea28捔"
                r2 = 0
                if (r0 != 0) goto L2e
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                int r4 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                int r4 = r4 >> 10
                r5 = 41
                int r5 = r5 / r4
                java.lang.String r1 = m6096(r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m5464(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L62
                goto L4b
            L2e:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                int r4 = android.view.ViewConfiguration.getKeyRepeatTimeout()
                int r4 = r4 >> 16
                int r4 = 31 - r4
                java.lang.String r1 = m6096(r1, r4)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m5464(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L62
            L4b:
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570
                int r0 = r0 + 39
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = r0
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                int r0 = r0.getWebAppFailureCode()
                int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568
                int r1 = r1 + 91
                int r1 = r1 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 = r1
                return r0
            L62:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.getWebAppFailureCode():int");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public String getWebAppFailureMessage() {
            int i = f5570 + 71;
            f5568 = i % 128;
            if (i % 2 == 0) {
                C2699cc.this.m5464(this, this.f5578, m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李펿▋渴\ue99c䧍㣻銥뎼", 19 >> Gravity.getAbsoluteGravity(1, 0)).intern(), new Object[1]);
                if (this.f5577 == null) {
                    return null;
                }
            } else {
                C2699cc.this.m5464(this, this.f5578, m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891艐蚋絉盆者뭇䌤\ue822ﭶ\uf891衍鋣裊鞹㡢李펿▋渴\ue99c䧍㣻銥뎼", Gravity.getAbsoluteGravity(0, 0) + 34).intern(), new Object[0]);
                if (this.f5577 == null) {
                    return null;
                }
            }
            int i2 = f5570 + 45;
            f5568 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.f5577.getWebAppFailureMessage();
            }
            int i3 = 21 / 0;
            return this.f5577.getWebAppFailureMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
        
            return r6.f5577.getWebView();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
        
            r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 + 13;
            com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
        
            if ((r0 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
        
            if (r6.f5577 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
        
            if (r6.f5577 != null) goto L9;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.unity3d.services.core.webview.WebView getWebView() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568
                int r0 = r0 + 49
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bàà\u000b\u000e\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002ç"
                r2 = 0
                if (r0 == 0) goto L37
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                float r4 = android.media.AudioTrack.getMaxVolume()
                r5 = 1065353216(0x3f800000, float:1.0)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                int r4 = 105 - r4
                byte r4 = (byte) r4
                int r2 = android.view.KeyEvent.normalizeMetaState(r2)
                int r2 = 96 - r2
                java.lang.String r1 = m6097(r4, r1, r2)
                java.lang.String r1 = r1.intern()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.m5464(r6, r3, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L63
                goto L5c
            L37:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                float r4 = android.media.AudioTrack.getMaxVolume()
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                int r4 = r4 + 111
                byte r4 = (byte) r4
                int r5 = android.view.KeyEvent.normalizeMetaState(r2)
                int r5 = 21 - r5
                java.lang.String r1 = m6097(r4, r1, r5)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.m5464(r6, r3, r1, r2)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L63
            L5c:
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                com.unity3d.services.core.webview.WebView r0 = r0.getWebView()
                return r0
            L63:
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570
                int r0 = r0 + 13
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = r1
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L71
                return r1
            L71:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.getWebView():com.unity3d.services.core.webview.WebView");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean invokeCallback(Invocation invocation) {
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b||\n\u0002\u0012\u001c\u0019\u001f\u0000\u0013\r\u000e\u000e\u0001\u000f\u0018w", ((byte) KeyEvent.getModifierMetaStateMask()) + 26).intern(), invocation);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp == null) {
                return false;
            }
            int i = f5570 + 113;
            f5568 = i % 128;
            if (i % 2 == 0) {
                webViewApp.invokeCallback(invocation);
                throw null;
            }
            boolean zInvokeCallback = webViewApp.invokeCallback(invocation);
            f5570 = (f5568 + 85) % 128;
            return zInvokeCallback;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
        public boolean invokeMethod(String str, String str2, Method method, Object... objArr) {
            f5570 = (f5568 + 57) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (56 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b¨¨\n\u0002\u0012\u001c\u0019\u001f\u0004\r\u0004\u0007\u0019\u0014\u009c", 23 - Color.blue(0)).intern(), str, str2, method, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f5577;
            if (webViewApp == null) {
                return false;
            }
            f5568 = (f5570 + InterfaceC3173h3.d.b.f8819b) % 128;
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        
            if (r6.f5577 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
        
            if (r6.f5577 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
        
            r0 = r6.f5577.isWebAppInitialized();
            r1 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 + com.ironsource.InterfaceC3173h3.d.b.f8826i;
            com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 = r1 % 128;
         */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isWebAppInitialized() {
            /*
                r6 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568
                int r0 = r0 + 77
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891\ud97d᱀ꌭ鉌淬顧ꫯ浡⩍촻\ud84dᾘ澝凒㢆ᥠ棙ₓἥ騦"
                r2 = 0
                if (r0 == 0) goto L2c
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                r4 = 24
                int r5 = android.graphics.ImageFormat.getBitsPerPixel(r2)
                int r4 = r4 >>> r5
                java.lang.String r1 = m6096(r1, r4)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m5464(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L5c
                goto L47
            L2c:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r3 = r6.f5578
                int r4 = android.graphics.ImageFormat.getBitsPerPixel(r2)
                int r4 = r4 + 31
                java.lang.String r1 = m6096(r1, r4)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r0.m5464(r6, r3, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                if (r0 == 0) goto L5c
            L47:
                com.unity3d.services.core.webview.WebViewApp r0 = r6.f5577
                boolean r0 = r0.isWebAppInitialized()
                int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568
                int r1 = r1 + 111
                int r2 = r1 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 = r2
                int r1 = r1 % 2
                if (r1 != 0) goto L5a
                return r0
            L5a:
                r0 = 0
                throw r0
            L5c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.isWebAppInitialized():boolean");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean isWebAppLoaded() {
            f5568 = (f5570 + 65) % 128;
            C2699cc.this.m5464(this, this.f5578, m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891\ud97d᱀ꌭ鉌淬顧ꫯ浡₤િ䂶频㸂菒曡\uede7", (ViewConfiguration.getLongPressTimeout() >> 16) + 25).intern(), new Object[0]);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp == null) {
                int i = f5568 + 97;
                f5570 = i % 128;
                if (i % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i2 = f5570 + InterfaceC3173h3.d.b.f8819b;
            f5568 = i2 % 128;
            if (i2 % 2 == 0) {
                webViewApp.isWebAppLoaded();
                throw null;
            }
            boolean zIsWebAppLoaded = webViewApp.isWebAppLoaded();
            int i3 = f5570 + 9;
            f5568 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 0;
            }
            return zIsWebAppLoaded;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void removeCallback(NativeCallback nativeCallback) {
            f5568 = (f5570 + InterfaceC3173h3.d.b.f8821d) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (125 - TextUtils.indexOf("", "")), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bíí\t\u000e\u0004\u0019\u0012\u0019\u0000\u0013\r\u000e\u000e\u0001\u000f\u0018è", 25 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), nativeCallback);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                webViewApp.removeCallback(nativeCallback);
                f5568 = (f5570 + 113) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void resetWebViewAppInitialization() {
            f5570 = (f5568 + 61) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 92), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bËË\t\u000e\u0003\u0007\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bËË\u0016\u0017\n\u0010\u0000\u0010\u0010\u0001\u0012\u0011\u0010\n\u0014\u0017", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40).intern(), new Object[0]);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                webViewApp.resetWebViewAppInitialization();
                f5568 = (f5570 + 53) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public boolean sendEvent(Enum r6, Enum r7, Object... objArr) {
            f5568 = (f5570 + 75) % 128;
            C2699cc.this.m5464(this, this.f5578, m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681礃뙰\uf479漨쏎扸ﶳ럥", 20 - Drawable.resolveOpacity(0, 0)).intern(), r6, r7, Arrays.asList(objArr));
            WebViewApp webViewApp = this.f5577;
            if (webViewApp == null) {
                return false;
            }
            boolean zSendEvent = webViewApp.sendEvent(r6, r7, objArr);
            f5568 = (f5570 + 7) % 128;
            return zSendEvent;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
        @Override // com.unity3d.services.core.webview.WebViewApp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setConfiguration(com.unity3d.services.core.configuration.Configuration r6) {
            /*
                r5 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568
                int r0 = r0 + 123
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570 = r1
                int r0 = r0 % 2
                java.lang.String r1 = "者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681絉盆\ue894렶櫤\u0992枖뙹㡢李挫ᕕꧪ圪꿌럥"
                if (r0 == 0) goto L31
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r2 = r5.f5578
                int r3 = android.view.ViewConfiguration.getJumpTapTimeout()
                int r3 = r3 << 6
                r4 = 116(0x74, float:1.63E-43)
                int r3 = r4 << r3
                java.lang.String r1 = m6096(r1, r3)
                java.lang.String r1 = r1.intern()
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r4[r3] = r6
                r0.m5464(r5, r2, r1, r4)
                com.unity3d.services.core.webview.WebViewApp r0 = r5.f5577
                if (r0 == 0) goto L55
                goto L50
            L31:
                com.ironsource.adqualitysdk.sdk.i.cc r0 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.this
                com.ironsource.adqualitysdk.sdk.i.ch r2 = r5.f5578
                int r3 = android.view.ViewConfiguration.getJumpTapTimeout()
                int r3 = r3 >> 16
                int r3 = 27 - r3
                java.lang.String r1 = m6096(r1, r3)
                java.lang.String r1 = r1.intern()
                java.lang.Object[] r3 = new java.lang.Object[]{r6}
                r0.m5464(r5, r2, r1, r3)
                com.unity3d.services.core.webview.WebViewApp r0 = r5.f5577
                if (r0 == 0) goto L55
            L50:
                com.unity3d.services.core.webview.WebViewApp r0 = r5.f5577
                r0.setConfiguration(r6)
            L55:
                int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5570
                int r6 = r6 + 71
                int r6 = r6 % 128
                com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.f5568 = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.a.setConfiguration(com.unity3d.services.core.configuration.Configuration):void");
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureCode(int i) {
            f5570 = (f5568 + 13) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (17 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0081\u0081\t\n\u0004\u0007\u0001\u0002\u0000\b\u0081\u0081\u0006\u0011\u0001\u0010\u000f\u0010\u0000\u0013\u0014\u0015v", (Process.myTid() >> 22) + 31).intern(), Integer.valueOf(i));
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                f5568 = (f5570 + 61) % 128;
                webViewApp.setWebAppFailureCode(i);
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppFailureMessage(String str) {
            f5568 = (f5570 + InterfaceC3173h3.d.b.f8823f) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (View.combineMeasuredStates(0, 0) + 83), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÃÃ\t\n\u0004\u0007\u0001\u0002\u0000\bÃÃ\u0006\u0011\u0001\u0010\u000f\u0010\u0004\r\u0003\u0007\u0006\u000f\r\u0005", Process.getGidForName("") + 35).intern(), str);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                webViewApp.setWebAppFailureMessage(str);
            }
            f5568 = (f5570 + 51) % 128;
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppInitialized(boolean z) {
            f5570 = (f5568 + 55) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (TextUtils.getOffsetBefore("", 0) + 22), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0086\u0086\t\n\u0004\u0007\u0001\u0002\u0000\b\u0086\u0086\u0016\u0017\n\u0010\u0000\u0010\u0010\u0001\u0013\u0005z", 30 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                webViewApp.setWebAppInitialized(z);
                f5568 = (f5570 + 121) % 128;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebAppLoaded(boolean z) {
            f5568 = (f5570 + 43) % 128;
            C2699cc.this.m5464(this, this.f5578, m6096("者뭇Ꮦ援햋緣䬬쐤ﭶ\uf891텈\uf681絉盆者뭇䌤\ue822ﭶ\uf891䥙\uf4e2覆⇎ἥ騦", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25).intern(), Boolean.valueOf(z));
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                webViewApp.setWebAppLoaded(z);
            }
            int i = f5570 + 23;
            f5568 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override // com.unity3d.services.core.webview.WebViewApp
        public void setWebView(WebView webView) {
            f5568 = (f5570 + 63) % 128;
            C2699cc.this.m5464(this, this.f5578, m6097((byte) (View.getDefaultSize(0, 0) + 27), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u008b\u008b\t\n\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0092", 21 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), webView);
            WebViewApp webViewApp = this.f5577;
            if (webViewApp != null) {
                int i = f5568 + 83;
                f5570 = i % 128;
                int i2 = i % 2;
                webViewApp.setWebView(webView);
                if (i2 != 0) {
                    throw null;
                }
            }
            f5568 = (f5570 + 45) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2838hg
        /* renamed from: ﻛ */
        public final /* synthetic */ WebViewApp mo5387() {
            f5568 = (f5570 + 39) % 128;
            WebViewApp webViewAppM6095 = m6095();
            int i = f5570 + 17;
            f5568 = i % 128;
            if (i % 2 != 0) {
                return webViewAppM6095;
            }
            throw null;
        }

        /* renamed from: ﻛ */
        private static String m6096(String str, int i) {
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
                                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5571)) ^ ((c2 >>> 5) + f5569)));
                                cArr3[1] = c3;
                                cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5574) ^ ((c3 + i3) ^ ((c3 << 4) + f5575))));
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

    public C2699cc(String str) {
        super(str);
    }

    /* renamed from: ﭖ */
    private static Object m6073() {
        int i = f5554 + 123;
        f5552 = i % 128;
        if (i % 2 == 0) {
            UnityAds.getListener();
            throw null;
        }
        IUnityAdsListener listener = UnityAds.getListener();
        int i2 = f5552 + 97;
        f5554 = i2 % 128;
        if (i2 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* renamed from: ﮉ */
    public static /* synthetic */ Object m6074() {
        Object objM6073;
        int i = f5554 + 61;
        f5552 = i % 128;
        if (i % 2 == 0) {
            objM6073 = m6073();
            int i2 = 54 / 0;
        } else {
            objM6073 = m6073();
        }
        f5552 = (f5554 + 33) % 128;
        return objM6073;
    }

    /* renamed from: ﮐ */
    public static String m6075() {
        int i = f5552 + 79;
        f5554 = i % 128;
        if (i % 2 == 0) {
            return ClientProperties.getGameId();
        }
        ClientProperties.getGameId();
        throw null;
    }

    /* renamed from: ﱡ */
    public static Object m6077() {
        f5552 = (f5554 + 11) % 128;
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        f5552 = (f5554 + 29) % 128;
        return currentApp;
    }

    /* renamed from: ﺙ */
    private static void m6078(IUnityAdsListener iUnityAdsListener) {
        int i = f5552 + 81;
        f5554 = i % 128;
        int i2 = i % 2;
        UnityAds.removeListener(iUnityAdsListener);
        if (i2 != 0) {
            int i3 = 70 / 0;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m6080(IUnityAdsListener iUnityAdsListener) {
        int i = f5554 + 77;
        f5552 = i % 128;
        int i2 = i % 2;
        m6078(iUnityAdsListener);
        if (i2 == 0) {
            throw null;
        }
        int i3 = f5552 + 123;
        f5554 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m6083(IUnityAdsListener iUnityAdsListener) {
        f5554 = (f5552 + 25) % 128;
        m6092(iUnityAdsListener);
        int i = f5552 + 33;
        f5554 = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m6085(IUnityAdsListener iUnityAdsListener) {
        int i = f5554 + 69;
        f5552 = i % 128;
        int i2 = i % 2;
        m6090(iUnityAdsListener);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ BannerView.IListener m6087(BannerView bannerView) {
        int i = f5552 + 23;
        f5554 = i % 128;
        if (i % 2 != 0) {
            m6079(bannerView);
            throw null;
        }
        BannerView.IListener iListenerM6079 = m6079(bannerView);
        int i2 = f5554 + 15;
        f5552 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return iListenerM6079;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m6091(BannerView bannerView) {
        f5552 = (f5554 + 23) % 128;
        String strM6081 = m6081(bannerView);
        f5552 = (f5554 + 63) % 128;
        return strM6081;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* renamed from: ﱡ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Enum m6076(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 183181625(0xaeb2139, float:2.2642174E-32)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L33
            r1 = 2066319421(0x7b29883d, float:8.802614E35)
            if (r0 == r1) goto L11
            goto L57
        L11:
            int r0 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r0 = r0 >> 24
            int r0 = 127 - r0
            java.lang.String r1 = "«\u008e\u008b\u008a\u0087®"
            java.lang.String r0 = m6082(r3, r3, r0, r1)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.f5552
            int r6 = r6 + 65
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2699cc.f5554 = r6
            r6 = r2
            goto L58
        L33:
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            r4 = -1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            int r0 = 128 - r0
            java.lang.String r1 = "\u008e\u0090\u008e\u008b¨\u009b©\u009f"
            java.lang.String r0 = m6082(r3, r3, r0, r1)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2699cc.f5554
            int r6 = r6 + 39
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2699cc.f5552 = r6
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            if (r6 == 0) goto L60
            if (r6 == r2) goto L5d
            return r3
        L5d:
            com.unity3d.services.core.request.WebRequestEvent r6 = com.unity3d.services.core.request.WebRequestEvent.FAILED
            return r6
        L60:
            com.unity3d.services.core.request.WebRequestEvent r6 = com.unity3d.services.core.request.WebRequestEvent.COMPLETE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.m6076(java.lang.String):java.lang.Enum");
    }

    /* renamed from: ﾇ */
    private static void m6090(IUnityAdsListener iUnityAdsListener) {
        int i = f5552 + 29;
        f5554 = i % 128;
        int i2 = i % 2;
        UnityAds.setListener(iUnityAdsListener);
        if (i2 != 0) {
            throw null;
        }
        int i3 = f5552 + 17;
        f5554 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m6093(BannerView bannerView, BannerView.IListener iListener) {
        f5552 = (f5554 + 63) % 128;
        m6086(bannerView, iListener);
        int i = f5554 + 109;
        f5552 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public final Object m6094(Object obj, InterfaceC2704ch interfaceC2704ch) {
        a aVar = new a((WebViewApp) obj, interfaceC2704ch);
        f5554 = (f5552 + 47) % 128;
        return aVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6082((String) null, (int[]) null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0085\u0083\u008c\u008d\u008d\u0099\u009f\u0085\u008c§").intern(), new AbstractC2676bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.m6077();
            }
        });
        map.put(m6082((String) null, (int[]) null, TextUtils.indexOf("", "") + 127, "\u0096\u0096\u0087\u0095\u008c\u0084\u0094\u0093\u008c\u0092\u0091\u0090\u008c\u0085\u009e\u008c\u008d¡").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.this.m6094(list.get(0), interfaceC2704ch);
            }
        });
        map.put(m6089("昧ۻׅพⵖ˃箱毁隫뭏⨩治\ud8e3讒各젔Ϫ恎ᆄ㸷", KeyEvent.keyCodeFromString("") + 20).intern(), new AbstractC2676bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2699cc.m6084(list.get(0));
                return null;
            }
        });
        map.put(m6082((String) null, (int[]) null, (ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0088\u008a\u008c \u009eª\u0085\u008c§").intern(), new AbstractC2676bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.m6075();
            }
        });
        map.put(m6089("䲽៥濪\uf508앇\ude3c⯓澹쉉⨒\ueb3c\ue2f0뿗\uf2a5⺟\ued75錒⫏럗\uda36", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.m6074();
            }
        });
        map.put(m6082((String) null, (int[]) null, TextUtils.getTrimmedLength("") + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0085\u008c\u0089").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2699cc.m6085((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m6082((String) null, (int[]) null, TextUtils.getOffsetAfter("", 0) + 127, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0088\u0088\u009e").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.11
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2699cc.m6083((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m6082((String) null, (int[]) null, TextUtils.lastIndexOf("", '0', 0) + 128, "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u008c\u009a\u009c \u008c\u008d").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2699cc.m6080((IUnityAdsListener) list.get(0));
                return null;
            }
        });
        map.put(m6089("䲽៥\uef6f؋鍟ﴫ慗⠧行\uf512竘Ỏ鱳햩ׅพ暳ᨶ㇂嘏㜉⊄풤볬", 23 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new AbstractC2676bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.13
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.m6088((String) list.get(0));
            }
        });
        map.put(m6089("䲽៥\uef6f؋鍟ﴫ⟃灜遶甑㘧욞\uf2d8在⩁왥隫뭏", View.MeasureSpec.makeMeasureSpec(0, 0) + 18).intern(), new AbstractC2676bg.b(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.m6076((String) list.get(0));
            }
        });
        map.put(m6082((String) null, (int[]) null, View.MeasureSpec.getSize(0) + 127, "\u0088\u008a\u0085\u0083\u008c \u008c¡\u009e¥¨\u0085\u008c§").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.m6091((BannerView) list.get(0));
            }
        });
        map.put(m6089("䲽៥\u0bc4몵讳ꠌ錒⫏覡\uf60a뿗\uf2a5⺟\ued75錒⫏럗\uda36", 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2699cc.m6087((BannerView) list.get(0));
            }
        });
        map.put(m6082((String) null, (int[]) null, 127 - (Process.myTid() >> 22), "\u008d\u008c\u0083\u008c\u0085\u0089\u0084\u008b\u008d\u008c\u0083\u0083\u009e\u0091\u0085\u008c\u0089").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2699cc.m6093((BannerView) list.get(0), (BannerView.IListener) list.get(1));
                return null;
            }
        });
        int i = f5554 + 55;
        f5552 = i % 128;
        if (i % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0361  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻐ */
    private static BannerView.IListener m6079(BannerView bannerView) {
        f5552 = (f5554 + 29) % 128;
        BannerView.IListener listener = bannerView.getListener();
        f5554 = (f5552 + 3) % 128;
        return listener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Enum m6088(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2699cc.m6088(java.lang.String):java.lang.Enum");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5554 = (f5552 + 63) % 128;
        String version = UnityAds.getVersion();
        if (version == null) {
            f5554 = (f5552 + 99) % 128;
            return null;
        }
        int i = f5554 + InterfaceC3173h3.d.b.f8823f;
        f5552 = i % 128;
        return i % 2 == 0 ? version.split(m6082((String) null, (int[]) null, 99 / (ViewConfiguration.getScrollBarFadeDuration() % 75), "\u0081").intern())[0] : version.split(m6082((String) null, (int[]) null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, "\u0081").intern())[0];
    }

    /* renamed from: ﾒ */
    private static void m6092(IUnityAdsListener iUnityAdsListener) {
        f5552 = (f5554 + 11) % 128;
        UnityAds.addListener(iUnityAdsListener);
        f5554 = (f5552 + 85) % 128;
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.cc$e */
    public static class e extends AbstractC2676bg {

        /* renamed from: ﺙ */
        private static int f5579 = 0;

        /* renamed from: ﻏ */
        private static int f5580 = 1;

        /* renamed from: ﻐ */
        private static int f5581 = 1031895675;

        /* renamed from: ﻛ */
        private static byte[] f5582 = {5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, 5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, 19, -70, 11, -5, -7, 17, 3, 51, -69, 15, 3, 51, -69, 14, 2, -6, -13, 4, 13, -14, 69, -54, 49, -70, 5, 11, -5, -7, 71, -63, -2, 12, 18, -4, 19, -28, 13, -9, 0, 13, 31, 18, -4, 19, -28, 13, -9, 0, 13, 31, 20, -69, 1, 13, -9, 0, 13, -1, 52, -69, 14, 2, -6, -13, 4, 13, -14, 69, -54, 49, -70, 5, 11, -5, -7, 71, -63, -2, 12, 0, 0, 0, 0, 0};

        /* renamed from: ｋ */
        private static int f5583 = 122;

        /* renamed from: ﾇ */
        private static int f5584 = -2092926391;

        /* renamed from: ﾒ */
        private static short[] f5585;

        public e(String str) {
            super(str);
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
        /* renamed from: ﻛ */
        public final Map<String, AbstractC2676bg.b> mo5381() {
            HashMap map = new HashMap();
            int i = f5579 + 33;
            f5580 = i % 128;
            if (i % 2 != 0) {
                return map;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
        /* renamed from: ｋ */
        public final Class mo5382(String str) {
            int i = f5579 + InterfaceC3173h3.d.b.f8821d;
            f5580 = i % 128;
            if (i % 2 == 0) {
                str.hashCode();
                throw null;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case 252148886:
                    if (str.equals(m6098((byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) - 108, (-1031895674) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2092926456 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        f5580 = (f5579 + 23) % 128;
                        c = 0;
                        break;
                    }
                    break;
                case 961844241:
                    if (str.equals(m6098((byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 112, View.resolveSizeAndState(0, 0, 0) - 1031895617, 2092926458 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                        c = 2;
                        break;
                    }
                    break;
                case 1067215379:
                    if (str.equals(m6098((byte) ((-1) - TextUtils.lastIndexOf("", '0')), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-83) - TextUtils.indexOf("", "", 0, 0), (-1031895609) - TextUtils.indexOf((CharSequence) "", '0'), 2092926490 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        int i2 = f5579 + 27;
                        f5580 = i2 % 128;
                        if (i2 % 2 != 0) {
                            c = 3;
                            break;
                        } else {
                            c = 5;
                            break;
                        }
                    }
                    break;
                case 1531208100:
                    if (str.equals(m6098((byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (short) (Process.myPid() >> 22), (-76) - TextUtils.getOffsetAfter("", 0), (-1031895662) - View.MeasureSpec.getMode(0), 2092926490 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        f5580 = (f5579 + 125) % 128;
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0 || c == 1) {
                return AdUnitActivity.class;
            }
            if (c == 2 || c == 3) {
                return BannerView.class;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
        /* renamed from: ﾒ */
        public final String mo5383() {
            String version;
            int i = f5579 + 79;
            f5580 = i % 128;
            if (i % 2 == 0) {
                version = UnityAds.getVersion();
                int i2 = 91 / 0;
                if (version == null) {
                    return null;
                }
            } else {
                version = UnityAds.getVersion();
                if (version == null) {
                    return null;
                }
            }
            f5579 = (f5580 + 121) % 128;
            String str = version.split(m6098((byte) Color.green(0), (short) (ImageFormat.getBitsPerPixel(0) + 1), (-121) - (ViewConfiguration.getTouchSlop() >> 8), (-1031895674) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2092926437 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())[0];
            int i3 = f5579 + 99;
            f5580 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 73 / 0;
            }
            return str;
        }

        /* renamed from: ｋ */
        private static String m6098(byte b, short s, int i, int i2, int i3) {
            String string;
            synchronized (C2912k.f7200) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int i4 = f5583;
                    int i5 = i + i4;
                    int i6 = i5 == -1 ? 1 : 0;
                    if (i6 != 0) {
                        byte[] bArr = f5582;
                        if (bArr != null) {
                            i5 = (byte) (bArr[f5581 + i2] + i4);
                        } else {
                            i5 = (short) (f5585[f5581 + i2] + i4);
                        }
                    }
                    if (i5 > 0) {
                        C2912k.f7203 = ((i2 + i5) - 2) + f5581 + i6;
                        C2912k.f7201 = b;
                        char c = (char) (i3 + f5584);
                        C2912k.f7204 = c;
                        sb.append(c);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205 = 1;
                        while (C2912k.f7205 < i5) {
                            byte[] bArr2 = f5582;
                            if (bArr2 != null) {
                                int i7 = C2912k.f7203;
                                C2912k.f7203 = i7 - 1;
                                C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                            } else {
                                short[] sArr = f5585;
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

    /* renamed from: ﻛ */
    public static void m6084(Object obj) {
        int i = f5552 + 71;
        f5554 = i % 128;
        int i2 = i % 2;
        WebViewApp.setCurrentApp((a) obj);
        if (i2 != 0) {
            int i3 = 17 / 0;
        }
        int i4 = f5552 + 49;
        f5554 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private static String m6081(BannerView bannerView) {
        int i = f5554 + 21;
        f5552 = i % 128;
        int i2 = i % 2;
        String placementId = bannerView.getPlacementId();
        if (i2 == 0) {
            int i3 = 69 / 0;
        }
        return placementId;
    }

    /* renamed from: ﻛ */
    private static String m6082(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f5556;
                int i2 = f5555;
                if (f5559) {
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
                if (f5557) {
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

    /* renamed from: ﾇ */
    private static String m6089(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5551)) ^ ((c2 >>> 5) + f5550)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5553) ^ ((c3 + i3) ^ ((c3 << 4) + f5558))));
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

    /* renamed from: ｋ */
    private static void m6086(BannerView bannerView, BannerView.IListener iListener) {
        f5554 = (f5552 + 33) % 128;
        bannerView.setListener(iListener);
        int i = f5552 + 73;
        f5554 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}

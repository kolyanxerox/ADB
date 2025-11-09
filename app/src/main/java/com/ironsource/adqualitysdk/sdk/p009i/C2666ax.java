package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.p009i.C2670ba;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb.AnonymousClass1;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb.AnonymousClass3;
import com.ironsource.adqualitysdk.sdk.p009i.C2887jb;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ax */
/* loaded from: classes2.dex */
public final class C2666ax {

    /* renamed from: 爫 */
    private static char f4797 = 35991;

    /* renamed from: ﬤ */
    private static char f4798 = 32552;

    /* renamed from: טּ */
    private static int f4799 = 1;

    /* renamed from: סּ */
    private static char[] f4800 = {'$', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'A', '_', 136, 139, 137, '{', '|', 141, 142, 133, 127, ']', 'K', 'm', 'u', '~', 134, 129, 133, 137, 145, 'g', 16, '&', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', 'r', 251, 272, 272, 267, 262, 269, 275, 274, 257, 249, 265, 265, 262, 264, 269, 143, 285, 285, 278, 'd', 222, 245, 243, 243, 204, 195, 229, 231, 233, 238, 237, 198, 196, 236, 241, 241, 236, 231, 238, 244, 243, 204, 197, 238, 245, 243, 243, 245, 132, 269, 267, 261, 267, 268, 264, '+', 'i', 129, '}', 't', 'z', '}', '~', '}', 'V', ':', 'q', 'p', 'r', 'I', 'K', 'l', 'j', 'I', 'G', 'n', 'q', 'J', 'F', 'm', 'h', 'b', 'd', 'd', 'B', 'D', 'k', 'G', 'J', 'n', 'k', 'i', 'S', 'Z', 'J', 'F', 'h', 'c', 'j', 's', 'J', 'G', 'n', 'i', 'B', 'G', 'j', 'C', 'J', 'n', 'f', 'B', 'A', 'i', 'n', 'n', 'i', 'd'};

    /* renamed from: ףּ */
    private static int f4801 = 0;

    /* renamed from: ﭴ */
    private static char f4802 = 31667;

    /* renamed from: ﭸ */
    private static char f4803 = 35875;

    /* renamed from: ﭖ */
    private C2668az f4804;

    /* renamed from: ﮉ */
    private C2882ix f4805;

    /* renamed from: ﮌ */
    private ISAdQualityInitListener f4806;

    /* renamed from: ﱟ */
    private String f4808;

    /* renamed from: ﱡ */
    private C2671bb f4809;

    /* renamed from: ﻐ */
    private boolean f4812 = false;

    /* renamed from: ﻛ */
    private List<C2710cn> f4813 = new ArrayList();

    /* renamed from: ﾒ */
    private List<AbstractC2813gi> f4816 = new ArrayList();

    /* renamed from: ｋ */
    private Map<String, JSONObject> f4814 = new HashMap();

    /* renamed from: ﾇ */
    private Map<String, String> f4815 = new HashMap();

    /* renamed from: ﮐ */
    private C2728de f4807 = new C2728de();

    /* renamed from: ﻏ */
    private C2741dr f4811 = C2741dr.m6654();

    /* renamed from: ﺙ */
    private Map<String, C2665aw> f4810 = new HashMap();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ax$5, reason: invalid class name */
    public class AnonymousClass5 extends AbstractRunnableC2878it {

        /* renamed from: ﱟ */
        private /* synthetic */ List f4886;

        /* renamed from: ﻏ */
        private /* synthetic */ String f4887;

        /* renamed from: ﻐ */
        private /* synthetic */ String f4888;

        /* renamed from: ﻛ */
        final /* synthetic */ Context f4889;

        /* renamed from: ｋ */
        final /* synthetic */ Map f4890;

        /* renamed from: ﾒ */
        final /* synthetic */ Runnable f4892;

        public AnonymousClass5(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f4888 = str;
            this.f4889 = context;
            this.f4887 = str2;
            this.f4886 = list;
            this.f4890 = map;
            this.f4892 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() throws JSONException {
            if (AbstractC2661as.m5141().mo5165(this.f4888, C2666ax.m5253(C2666ax.this))) {
                C2666ax.m5270(C2666ax.this, this.f4889, this.f4887, this.f4888, this.f4886, new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.5.5
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        if (C2666ax.m5248(C2666ax.this)) {
                            C2926s.m7592(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.5.5.1
                                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                /* renamed from: ﾒ */
                                public final void mo4950() {
                                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                    C2666ax.m5297(C2666ax.this, anonymousClass5.f4889, anonymousClass5.f4890, anonymousClass5.f4892);
                                }
                            }, AbstractC2661as.m5141().mo5142());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject = new JSONObject();
            C2666ax.m5271(C2666ax.this, this.f4888, jSONObject);
            C2666ax.m5246(C2666ax.this).put(this.f4888, jSONObject);
            C2926s.m7592(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.5.1
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    C2666ax.m5297(C2666ax.this, anonymousClass5.f4889, anonymousClass5.f4890, anonymousClass5.f4892);
                }
            }, AbstractC2661as.m5141().mo5142());
        }
    }

    public C2666ax(C2882ix c2882ix, C2651ai c2651ai, String str, C2671bb c2671bb, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f4805 = c2882ix;
        C2668az c2668az = new C2668az(C2926s.m7590(), c2651ai);
        this.f4804 = c2668az;
        C2914kb.m7424(c2668az);
        this.f4804.m5407(new InterfaceC2872in() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.1

            /* renamed from: ﱡ */
            private static int f4817 = 0;

            /* renamed from: ﻏ */
            private static int f4818 = 1;

            /* renamed from: ﻐ */
            private static char[] f4819 = {343, 339, 322, 328, 341, 338};

            /* renamed from: ｋ */
            private static boolean f4820 = true;

            /* renamed from: ﾇ */
            private static int f4821 = 227;

            /* renamed from: ﾒ */
            private static boolean f4822 = true;

            /* renamed from: ﾒ */
            private static String m5309(String str2, int[] iArr, int i, String str3) throws UnsupportedEncodingException {
                byte[] bytes = str3;
                if (str3 != null) {
                    bytes = str3.getBytes("ISO-8859-1");
                }
                byte[] bArr = bytes;
                char[] charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2922o.f7244) {
                    try {
                        char[] cArr2 = f4819;
                        int i2 = f4821;
                        if (f4822) {
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
                        if (f4820) {
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2872in
            /* renamed from: ﻛ */
            public final JSONObject mo5310(String str2, JSONObject jSONObject) {
                f4818 = (f4817 + 21) % 128;
                if (!str2.equals(m5309(null, null, 127 - TextUtils.getTrimmedLength(""), "\u0085\u0086\u0085\u0085\u0084\u0083\u0082\u0081").intern())) {
                    f4817 = (f4818 + 19) % 128;
                    return null;
                }
                int i = f4818 + 33;
                f4817 = i % 128;
                if (i % 2 == 0) {
                    return C2666ax.this.m5308();
                }
                int i2 = 48 / 0;
                return C2666ax.this.m5308();
            }
        });
        this.f4808 = str;
        this.f4809 = c2671bb;
        this.f4806 = iSAdQualityInitListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if ((!m5244()) != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (m5244() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        return true;
     */
    /* renamed from: ﭖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m5241() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2666ax.f4801     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + 3
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2666ax.f4799 = r0     // Catch: java.lang.Throwable -> L2e
            com.ironsource.adqualitysdk.sdk.i.as r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.m5141()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.mo5144()     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            if (r0 == 0) goto L38
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2666ax.f4799     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 + 73
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2666ax.f4801 = r2     // Catch: java.lang.Throwable -> L2e
            int r0 = r0 % 2
            r2 = 1
            if (r0 == 0) goto L30
            boolean r0 = r4.m5244()     // Catch: java.lang.Throwable -> L2e
            r3 = 72
            int r3 = r3 / r1
            r0 = r0 ^ r2
            if (r0 == r2) goto L38
            goto L36
        L2c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            goto L3a
        L30:
            boolean r0 = r4.m5244()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L38
        L36:
            monitor-exit(r4)
            return r2
        L38:
            monitor-exit(r4)
            return r1
        L3a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2666ax.m5241():boolean");
    }

    /* renamed from: ﭴ */
    private synchronized void m5242() {
        f4801 = (f4799 + 63) % 128;
        if (!(!this.f4809.m5437())) {
            m5301().adQualitySdkInitSuccess();
        } else {
            m5301().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m5256(false, new int[]{117, 53, 0, 27}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000").intern());
            f4801 = (f4799 + 113) % 128;
        }
    }

    /* renamed from: ﭸ */
    private List<C2710cn> m5243() {
        f4801 = (f4799 + 7) % 128;
        if (this.f4813 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f4813);
        f4801 = (f4799 + 123) % 128;
        return arrayList;
    }

    /* renamed from: ﮌ */
    private synchronized boolean m5244() {
        f4799 = (f4801 + 27) % 128;
        boolean zMo5143 = AbstractC2661as.m5141().mo5143();
        int i = f4799 + 49;
        f4801 = i % 128;
        if (i % 2 == 0) {
            return zMo5143;
        }
        int i2 = 77 / 0;
        return zMo5143;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ Map m5246(C2666ax c2666ax) {
        int i = f4801 + 45;
        f4799 = i % 128;
        int i2 = i % 2;
        Map<String, JSONObject> mapM5254 = c2666ax.m5254();
        if (i2 == 0) {
            int i3 = 24 / 0;
        }
        int i4 = f4799 + 45;
        f4801 = i4 % 128;
        if (i4 % 2 == 0) {
            return mapM5254;
        }
        throw null;
    }

    /* renamed from: ﱟ */
    public static /* synthetic */ boolean m5248(C2666ax c2666ax) {
        f4801 = (f4799 + 7) % 128;
        boolean zM5244 = c2666ax.m5244();
        int i = f4801 + 31;
        f4799 = i % 128;
        if (i % 2 != 0) {
            return zM5244;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ List m5250(C2666ax c2666ax) {
        f4799 = (f4801 + 13) % 128;
        List<AbstractC2813gi> listM5251 = c2666ax.m5251();
        f4799 = (f4801 + 57) % 128;
        return listM5251;
    }

    /* renamed from: ﺙ */
    public static /* synthetic */ void m5252(C2666ax c2666ax) throws JSONException {
        f4801 = (f4799 + 1) % 128;
        c2666ax.m5267();
        f4799 = (f4801 + 71) % 128;
    }

    /* renamed from: ﻏ */
    public static /* synthetic */ String m5253(C2666ax c2666ax) {
        int i = (f4799 + 121) % 128;
        f4801 = i;
        String str = c2666ax.f4808;
        int i2 = i + 51;
        f4799 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ C2741dr m5255(C2666ax c2666ax, C2741dr c2741dr) {
        int i = f4801 + 39;
        f4799 = i % 128;
        int i2 = i % 2;
        c2666ax.f4811 = c2741dr;
        if (i2 != 0) {
            return c2741dr;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ List m5264(C2666ax c2666ax) {
        f4799 = (f4801 + 85) % 128;
        List<C2710cn> listM5243 = c2666ax.m5243();
        f4801 = (f4799 + 13) % 128;
        return listM5243;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2671bb m5273(C2666ax c2666ax) {
        int i = f4799;
        f4801 = (i + 39) % 128;
        C2671bb c2671bb = c2666ax.f4809;
        int i2 = i + 23;
        f4801 = i2 % 128;
        if (i2 % 2 == 0) {
            return c2671bb;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ C2710cn m5284(C2666ax c2666ax, Context context, String str, AbstractC2676bg abstractC2676bg) {
        int i = f4801 + 41;
        f4799 = i % 128;
        if (i % 2 == 0) {
            c2666ax.m5263(context, str, abstractC2676bg);
            throw null;
        }
        C2710cn c2710cnM5263 = c2666ax.m5263(context, str, abstractC2676bg);
        f4799 = (f4801 + 17) % 128;
        return c2710cnM5263;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ List m5291(C2666ax c2666ax) {
        int i = f4799 + 67;
        f4801 = i % 128;
        if (i % 2 != 0) {
            c2666ax.m5245();
            throw null;
        }
        List<C2710cn> listM5245 = c2666ax.m5245();
        f4801 = (f4799 + 65) % 128;
        return listM5245;
    }

    /* renamed from: ﮐ */
    private synchronized List<C2710cn> m5245() {
        List<C2710cn> list;
        int i = f4799;
        int i2 = i + 107;
        f4801 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        list = this.f4813;
        f4801 = (i + 11) % 128;
        return list;
    }

    /* renamed from: ﱟ */
    private synchronized Map<String, String> m5247() {
        Map<String, String> map;
        try {
            int i = f4801 + 57;
            f4799 = i % 128;
            if (i % 2 == 0) {
                map = this.f4815;
                int i2 = 77 / 0;
            } else {
                map = this.f4815;
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    /* renamed from: ﱡ */
    private static long m5249() {
        if (AbstractC2661as.m5141().mo5173()) {
            f4801 = (f4799 + 89) % 128;
            return 2000L;
        }
        f4799 = (f4801 + 25) % 128;
        return 0L;
    }

    /* renamed from: ﺙ */
    private synchronized List<AbstractC2813gi> m5251() {
        List<AbstractC2813gi> list;
        int i = f4801 + 93;
        int i2 = i % 128;
        f4799 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        list = this.f4816;
        int i3 = i2 + 59;
        f4801 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        return list;
    }

    /* renamed from: ﻏ */
    private synchronized Map<String, JSONObject> m5254() {
        Map<String, JSONObject> map;
        int i = (f4801 + 5) % 128;
        f4799 = i;
        map = this.f4814;
        f4801 = (i + 67) % 128;
        return map;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ Map m5257(C2666ax c2666ax) {
        int i = f4801 + 47;
        f4799 = i % 128;
        if (i % 2 == 0) {
            c2666ax.m5247();
            throw null;
        }
        Map<String, String> mapM5247 = c2666ax.m5247();
        int i2 = f4801 + 125;
        f4799 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
        return mapM5247;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5270(C2666ax c2666ax, Context context, String str, String str2, List list, AbstractRunnableC2878it abstractRunnableC2878it) {
        int i = f4799 + 39;
        f4801 = i % 128;
        int i2 = i % 2;
        c2666ax.m5258(context, str, str2, (List<AbstractC2813gi>) list, abstractRunnableC2878it);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ List m5274(C2666ax c2666ax, List list) {
        int i = f4799 + 81;
        f4801 = i % 128;
        int i2 = i % 2;
        c2666ax.f4813 = list;
        if (i2 != 0) {
            int i3 = 7 / 0;
        }
        return list;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m5290(C2666ax c2666ax) {
        f4801 = (f4799 + 107) % 128;
        c2666ax.m5242();
        f4799 = (f4801 + 81) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m5295(C2666ax c2666ax, Context context, String str, String str2, AbstractC2813gi abstractC2813gi, C2710cn c2710cn, boolean z, AbstractC2676bg abstractC2676bg, AbstractRunnableC2878it abstractRunnableC2878it) {
        f4801 = (f4799 + 35) % 128;
        c2666ax.m5268(context, str, str2, abstractC2813gi, c2710cn, z, abstractC2676bg, abstractRunnableC2878it);
        int i = f4801 + 63;
        f4799 = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m5260(C2666ax c2666ax, Context context, List list, List list2, AbstractRunnableC2878it abstractRunnableC2878it) {
        f4801 = (f4799 + 65) % 128;
        c2666ax.m5259(context, list, list2, abstractRunnableC2878it);
        f4801 = (f4799 + 27) % 128;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5271(C2666ax c2666ax, String str, JSONObject jSONObject) throws JSONException {
        f4799 = (f4801 + 95) % 128;
        c2666ax.m5299(str, jSONObject);
        f4801 = (f4799 + 43) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ Map m5275(C2666ax c2666ax, Map map) {
        int i = (f4799 + 55) % 128;
        f4801 = i;
        c2666ax.f4810 = map;
        f4799 = (i + 117) % 128;
        return map;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m5296(C2666ax c2666ax, Context context, String str, String str2, List list, AbstractRunnableC2878it abstractRunnableC2878it) {
        int i = f4799 + 31;
        f4801 = i % 128;
        int i2 = i % 2;
        c2666ax.m5294(context, str, str2, (List<AbstractC2813gi>) list, abstractRunnableC2878it);
        if (i2 != 0) {
            int i3 = 84 / 0;
        }
    }

    /* renamed from: ﾇ */
    public final void m5307(ISAdQualityAdListener iSAdQualityAdListener) {
        int i = f4801 + 67;
        f4799 = i % 128;
        if (i % 2 != 0) {
            this.f4804.m5409(iSAdQualityAdListener);
        } else {
            this.f4804.m5409(iSAdQualityAdListener);
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ boolean m5261(C2666ax c2666ax, String str) {
        f4801 = (f4799 + 61) % 128;
        boolean zM5283 = c2666ax.m5283(str);
        int i = f4799 + 35;
        f4801 = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
        return zM5283;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ JSONObject m5276(C2666ax c2666ax, C2710cn c2710cn) throws JSONException {
        int i = f4801 + 47;
        f4799 = i % 128;
        if (i % 2 == 0) {
            m5265(c2710cn);
            throw null;
        }
        JSONObject jSONObjectM5265 = m5265(c2710cn);
        f4799 = (f4801 + 3) % 128;
        return jSONObjectM5265;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m5297(C2666ax c2666ax, Context context, Map map, Runnable runnable) {
        f4799 = (f4801 + 95) % 128;
        c2666ax.m5269(context, (Map<String, List<AbstractC2813gi>>) map, runnable);
        int i = f4799 + 53;
        f4801 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public final synchronized void m5303(final Context context, final Runnable runnable) {
        try {
            if (!this.f4812) {
                String strIntern = m5285("ﹳ꓁桀\uf7ccѡ䐼銛\uf63f텹ꑗ蠜Ͷ", (Process.myPid() >> 22) + 12).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m5256(false, new int[]{0, 36, 27, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001").intern());
                sb.append(IronSourceAdQuality.getSDKVersion());
                sb.append(m5256(false, new int[]{36, 15, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000").intern());
                C2921n.m7504(strIntern, sb.toString());
                AbstractRunnableC2878it abstractRunnableC2878it = new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.10
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.10.5
                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                runnable.run();
                            }
                        });
                        C2666ax.m5278(C2666ax.this, context);
                    }
                };
                if (m5241()) {
                    int i = f4801 + 1;
                    f4799 = i % 128;
                    if (i % 2 == 0) {
                        m5289(context, abstractRunnableC2878it);
                        throw null;
                    }
                    m5289(context, abstractRunnableC2878it);
                } else {
                    m5292(context, abstractRunnableC2878it);
                    f4799 = (f4801 + 7) % 128;
                }
                this.f4812 = true;
                return;
            }
            C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.12
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    runnable.run();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﾇ */
    public final synchronized void m5306() {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.11
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                Iterator it = C2666ax.m5264(C2666ax.this).iterator();
                while (it.hasNext()) {
                    ((C2710cn) it.next()).m6229();
                }
                C2666ax.m5291(C2666ax.this).clear();
                C2666ax.m5274(C2666ax.this, (List) null);
            }
        });
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4
            public AnonymousClass4() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2671bb.this.f5083.clear();
                C2671bb.this.f5083 = null;
            }
        });
        this.f4809 = null;
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws Exception {
                C2666ax.m5255(C2666ax.this, (C2741dr) null);
            }
        });
        int i = f4799 + 61;
        f4801 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private void m5259(Context context, final List<AbstractC2813gi> list, final List<String> list2, final AbstractRunnableC2878it abstractRunnableC2878it) {
        final Context context2;
        f4801 = (f4799 + 45) % 128;
        if (list.isEmpty()) {
            return;
        }
        AbstractC2813gi abstractC2813giRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (list.isEmpty()) {
            f4801 = (f4799 + 113) % 128;
            context2 = context;
        } else {
            context2 = context;
            abstractRunnableC2878it = new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.13
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2926s.m7594(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.13.4
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            C2666ax.m5260(C2666ax.this, context2, list, list2, abstractRunnableC2878it);
                        }
                    }, AbstractC2661as.m5141().mo5142());
                }
            };
        }
        m5288(context2, abstractC2813giRemove, strRemove, abstractRunnableC2878it);
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5278(C2666ax c2666ax, Context context) {
        int i = f4801 + 99;
        f4799 = i % 128;
        int i2 = i % 2;
        c2666ax.m5287(context);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public final JSONObject m5308() {
        int i = f4801 + 117;
        f4799 = i % 128;
        try {
            if (i % 2 != 0) {
                JSONObject jSONObjectM5277 = m5277(m5254());
                f4801 = (f4799 + 43) % 128;
                return jSONObjectM5277;
            }
            m5277(m5254());
            throw null;
        } catch (JSONException e) {
            C2921n.m7506(m5256(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m5285("餃ꤟ랝騟ࡪ셥㣦촢ﳹ䂘ꥵ㉙욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞\uf6e7뻖햶ﭛ\uf14f\uf69e쒄䱼ᐏ츆", 30 - ImageFormat.getBitsPerPixel(0)).intern(), e);
            return new JSONObject();
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5279(C2666ax c2666ax, Context context, String str, String str2, AbstractC2813gi abstractC2813gi, AbstractRunnableC2878it abstractRunnableC2878it) {
        f4801 = (f4799 + 13) % 128;
        c2666ax.m5293(context, str, str2, abstractC2813gi, abstractRunnableC2878it);
        f4801 = (f4799 + 25) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5280(C2666ax c2666ax, C2710cn c2710cn, String str) {
        int i = f4799 + 31;
        f4801 = i % 128;
        int i2 = i % 2;
        c2666ax.m5298(c2710cn, str);
        if (i2 != 0) {
            int i3 = 46 / 0;
        }
        f4801 = (f4799 + 93) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ boolean m5281(C2710cn c2710cn) {
        int i = f4799 + 31;
        f4801 = i % 128;
        if (i % 2 == 0) {
            return m5300(c2710cn);
        }
        m5300(c2710cn);
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ boolean m5282(C2710cn c2710cn, String str) {
        int i = f4801 + 69;
        f4799 = i % 128;
        if (i % 2 != 0) {
            return m5262(c2710cn, str);
        }
        m5262(c2710cn, str);
        throw null;
    }

    /* renamed from: ﾇ */
    private void m5289(Context context, AbstractRunnableC2878it abstractRunnableC2878it) {
        m5259(context, new ArrayList(C2672bc.m5442()), new ArrayList(C2672bc.m5441()), abstractRunnableC2878it);
        f4799 = (f4801 + 59) % 128;
    }

    /* renamed from: ｋ */
    public final JSONObject m5305() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator it = new HashSet(m5247().keySet()).iterator();
            f4801 = (f4799 + 91) % 128;
            while (it.hasNext()) {
                int i = f4799 + 65;
                f4801 = i % 128;
                if (i % 2 != 0) {
                    String str = (String) it.next();
                    jSONObject2.put(str, m5247().get(str));
                    int i2 = 0 / 0;
                } else {
                    String str2 = (String) it.next();
                    jSONObject2.put(str2, m5247().get(str2));
                }
            }
            jSONObject.put(m5256(true, new int[]{67, 4, 171, 0}, "\u0000\u0001\u0000\u0001").intern(), jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            C2921n.m7506(m5256(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m5256(false, new int[]{71, 29, 131, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001").intern(), e);
            return jSONObject;
        }
    }

    /* renamed from: ﾒ */
    private void m5292(Context context, AbstractRunnableC2878it abstractRunnableC2878it) {
        int i = f4799 + 91;
        f4801 = i % 128;
        if (i % 2 == 0) {
            m5288(context, C2672bc.m5443(), C2672bc.m5448(), abstractRunnableC2878it);
            f4801 = (f4799 + 69) % 128;
        } else {
            m5288(context, C2672bc.m5443(), C2672bc.m5448(), abstractRunnableC2878it);
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private void m5288(final Context context, final AbstractC2813gi abstractC2813gi, final String str, final AbstractRunnableC2878it abstractRunnableC2878it) {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                final String lowerCase = str.toLowerCase();
                C2666ax.m5273(C2666ax.this).m5438(lowerCase);
                C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.14.5

                    /* renamed from: ﮐ */
                    private static int f4841 = 1;

                    /* renamed from: ﻐ */
                    private static char f4842 = 4;

                    /* renamed from: ｋ */
                    private static int f4843;

                    /* renamed from: ﾒ */
                    private static char[] f4844 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', 'I', 'i', 'l', 'z', ' ', 'E'};

                    /* renamed from: ﻛ */
                    private static String m5311(byte b, String str2, int i) {
                        String str3;
                        char[] charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = charArray;
                        synchronized (C2858i.f6710) {
                            try {
                                char[] cArr2 = f4844;
                                char c = f4842;
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
                                str3 = new String(cArr3);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str3;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        String strIntern = m5311((byte) (63 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0001\u0002¬¬\u0000\u0007\t\u0005\u0007\u0004\n\u0000\t\n\u0002\u0007", 15 - TextUtils.indexOf((CharSequence) "", '0')).intern();
                        StringBuilder sb = new StringBuilder();
                        sb.append(m5311((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 104), "\u000e\u0006\t\u0007\b\t\u000f\b\u000f\t\u0001\n\f\u0006\u0002\u0003\u0003\u0000\u0005\u0006\u0002\u0005\u0089", (Process.myTid() >> 22) + 23).intern());
                        sb.append(lowerCase);
                        C2921n.m7518(strIntern, sb.toString());
                        try {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            C2666ax.m5279(C2666ax.this, context, str, lowerCase, abstractC2813gi, abstractRunnableC2878it);
                            int i = f4841 + 91;
                            f4843 = i % 128;
                            if (i % 2 != 0) {
                                int i2 = 77 / 0;
                            }
                        } catch (Throwable th) {
                            C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass3(lowerCase, C2670ba.b.f5065));
                            C2666ax.m5257(C2666ax.this).put(str, C2914kb.m7427(th).toString());
                            String strIntern2 = m5311((byte) (Drawable.resolveOpacity(0, 0) + 62), "\u0001\u0002¬¬\u0000\u0007\t\u0005\u0007\u0004\n\u0000\t\n\u0002\u0007", 15 - MotionEvent.axisFromString("")).intern();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m5311((byte) (65 - View.getDefaultSize(0, 0)), "\u000e\u0007\u0005\u0002\n\u0002\u0005\u0007\u0000\u000b\u0007\t\u0001\n\f\u0006\u0002\u0003\u0003\u0000\u0005\u0006\u0002\u0005a", 25 - ExpandableListView.getPackedPositionGroup(0L)).intern());
                            sb2.append(lowerCase);
                            C2914kb.m7429(strIntern2, sb2.toString(), th, true, true, true);
                        }
                    }
                });
            }
        });
        f4801 = (f4799 + 123) % 128;
    }

    /* renamed from: ﻐ */
    private void m5258(final Context context, final String str, final String str2, final List<AbstractC2813gi> list, final AbstractRunnableC2878it abstractRunnableC2878it) {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.3

            /* renamed from: ﮌ */
            private static int f4860 = 1;

            /* renamed from: ﱟ */
            private static int f4861 = 0;

            /* renamed from: ﱡ */
            private static long f4862 = -6272247352762324575L;

            /* renamed from: ﺙ */
            private static char f4863;

            /* renamed from: ﻏ */
            private static int f4864;

            /* renamed from: ｋ */
            private static String m5313(int i, char c, String str3, String str4, String str5) {
                String str6;
                char[] charArray = str5;
                if (str5 != null) {
                    charArray = str5.toCharArray();
                }
                char[] cArr = charArray;
                char[] charArray2 = str4;
                if (str4 != null) {
                    charArray2 = str4.toCharArray();
                }
                char[] cArr2 = charArray2;
                char[] charArray3 = str3;
                if (str3 != null) {
                    charArray3 = str3.toCharArray();
                }
                char[] cArr3 = charArray3;
                synchronized (C2885j.f6936) {
                    try {
                        char[] cArr4 = (char[]) cArr3.clone();
                        char[] cArr5 = (char[]) cArr.clone();
                        cArr4[0] = (char) (c ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i));
                        int length = cArr2.length;
                        char[] cArr6 = new char[length];
                        C2885j.f6934 = 0;
                        while (true) {
                            int i2 = C2885j.f6934;
                            if (i2 < length) {
                                int i3 = (i2 + 2) % 4;
                                int i4 = (i2 + 3) % 4;
                                int i5 = cArr4[i2 % 4] * 32718;
                                char c2 = cArr5[i3];
                                char c3 = (char) ((i5 + c2) % 65535);
                                C2885j.f6935 = c3;
                                cArr5[i4] = (char) (((cArr4[i4] * 32718) + c2) / 65535);
                                cArr4[i4] = c3;
                                int i6 = C2885j.f6934;
                                cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f4862) ^ f4861) ^ f4863);
                                C2885j.f6934 = i6 + 1;
                            } else {
                                str6 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str6;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                String strIntern = m5313((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.blue(0) + 49089), "Ⴗ호섻調", "㬲炉퍄깑瓗뺑媿吘꣯\uf4dc归閤퀠\ufaf5嘌䏢", "ꦡ댷聃ꣴ").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m5313((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1209627490, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "捠ᥳꁈ䌝", "ᕫᰏ驙냮芊䱉倂ᖺ莵\uee29ꮦ\ue1ac冄됣誛◃瓐輘县昬殖훚\uf519", "ꦡ댷聃ꣴ").intern());
                sb.append(str2);
                C2921n.m7518(strIntern, sb.toString());
                try {
                    C2666ax.m5296(C2666ax.this, context, str, str2, list, abstractRunnableC2878it);
                } catch (Throwable th) {
                    if (C2666ax.m5273(C2666ax.this) != null) {
                        C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass3(str2, C2670ba.b.f5065));
                    }
                    C2666ax.m5257(C2666ax.this).put(str, C2914kb.m7427(th).toString());
                    String strIntern2 = m5313(TextUtils.getTrimmedLength(""), (char) ((Process.myTid() >> 22) + 49089), "Ⴗ호섻調", "㬲炉퍄깑瓗뺑媿吘꣯\uf4dc归閤퀠\ufaf5嘌䏢", "ꦡ댷聃ꣴ").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m5313(View.getDefaultSize(0, 0) + 362923436, (char) Drawable.resolveOpacity(0, 0), "걂ꇅ\ueb15箿", "廮\udfc3좑◪ࣽվ蠢꿙ףּ橡芻㉶۴檣\uedceᩡ걝௨販⟨훆湒窘⪞鮸", "ꦡ댷聃ꣴ").intern());
                    sb2.append(str2);
                    C2914kb.m7429(strIntern2, sb2.toString(), th, true, true, true);
                    int i = f4864 + 115;
                    f4860 = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }
            }
        });
        int i = f4801 + 61;
        f4799 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private void m5287(final Context context) {
        f4799 = (f4801 + 35) % 128;
        if (!m5244()) {
            C2926s.m7594(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.20
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.20.1
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2666ax.m5290(C2666ax.this);
                        }
                    });
                }
            }, AbstractC2661as.m5141().mo5147());
        }
        final Map<String, List<AbstractC2813gi>> mapM5446 = C2672bc.m5446();
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.19
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2666ax.m5275(C2666ax.this, AbstractC2661as.m5141().mo5167());
                C2666ax.m5297(C2666ax.this, context, mapM5446, new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.19.4
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        if (C2666ax.m5248(C2666ax.this)) {
                            C2666ax.m5290(C2666ax.this);
                        }
                    }
                });
                AbstractC2661as.m5141().mo5169(new InterfaceC2662at() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.19.1

                    /* renamed from: ｋ */
                    private static int f4851 = 0;

                    /* renamed from: ﾇ */
                    private static int f4852 = 1;

                    /* renamed from: ﾒ */
                    private static long f4853 = 7143807921309903958L;

                    /* renamed from: ｋ */
                    private static String m5312(String str, int i) {
                        String str2;
                        char[] charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = charArray;
                        synchronized (C2777f.f6322) {
                            try {
                                char[] cArrM6790 = C2777f.m6790(f4853, cArr, i);
                                C2777f.f6321 = 4;
                                while (true) {
                                    int i2 = C2777f.f6321;
                                    if (i2 < cArrM6790.length) {
                                        C2777f.f6320 = i2 - 4;
                                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f4853));
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

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2662at
                    /* renamed from: ﾒ */
                    public final void mo4993() throws JSONException {
                        f4852 = (f4851 + InterfaceC3173h3.d.b.f8823f) % 128;
                        C2666ax.m5275(C2666ax.this, AbstractC2661as.m5141().mo5167());
                        C2921n.m7518(m5312("䌯䍬ᖐ禩ꢕ灗ꥁ\uec2d\uf212摤﨧ᨘ⇭뛢䭪䯱坆戀鲆땕", TextUtils.getCapsMode("", 0, 0)).intern(), m5312("㌄㍀则㸦➯ｰౘ䤻舾⏤甝뼏凓\uf100쑅\ueee7❥브Ꭽၐ\uf608\u0ff9愆䌼䗘\udd08끷\uf2ee᭺ꨮﾩ⑊\uea18篷䴖圢", 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                        C2666ax.m5252(C2666ax.this);
                        int i = f4852 + 27;
                        f4851 = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                    }
                });
            }
        });
        f4799 = (f4801 + InterfaceC3173h3.d.b.f8819b) % 128;
    }

    /* renamed from: ﻐ */
    private static boolean m5262(C2710cn c2710cn, String str) {
        f4801 = (f4799 + InterfaceC3173h3.d.b.f8819b) % 128;
        if (m5256(false, new int[]{100, 7, 196, 7}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern().equals(str)) {
            return true;
        }
        f4799 = (f4801 + 107) % 128;
        if (!TextUtils.isEmpty(str)) {
            f4801 = (f4799 + 7) % 128;
            if (C2916kd.m7455(str, c2710cn.m6223()) >= 0) {
                int i = f4801 + 75;
                f4799 = i % 128;
                int i2 = i % 2;
                String strM6222 = c2710cn.m6222();
                if (i2 == 0) {
                    C2916kd.m7455(str, strM6222);
                    throw null;
                }
                if (C2916kd.m7455(str, strM6222) <= 0) {
                    return true;
                }
            }
        }
        f4799 = (f4801 + 113) % 128;
        return false;
    }

    /* renamed from: ﻛ */
    private void m5269(Context context, Map<String, List<AbstractC2813gi>> map, Runnable runnable) {
        Context context2;
        Map<String, List<AbstractC2813gi>> map2;
        Runnable runnable2;
        while (map != null) {
            f4799 = (f4801 + 27) % 128;
            if (map.size() <= 0) {
                break;
            }
            f4799 = (f4801 + 45) % 128;
            String next = map.keySet().iterator().next();
            List<AbstractC2813gi> listRemove = map.remove(next);
            String strM5286 = m5286(listRemove);
            if (strM5286 != null) {
                this.f4809.m5438(strM5286);
                context2 = context;
                map2 = map;
                runnable2 = runnable;
                C2926s.m7598(new AnonymousClass5(strM5286, context2, next, listRemove, map2, runnable2));
                if (!(!m5244())) {
                    return;
                }
            } else {
                context2 = context;
                map2 = map;
                runnable2 = runnable;
            }
            context = context2;
            map = map2;
            runnable = runnable2;
        }
        final Runnable runnable3 = runnable;
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2926s.m7598(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        runnable3.run();
                    }
                });
            }
        });
    }

    /* renamed from: ﾒ */
    private void m5299(String str, JSONObject jSONObject) throws JSONException {
        C2926s.m7596(this.f4809.new AnonymousClass1(str, C2670ba.c.f5079));
        if (jSONObject != null) {
            f4801 = (f4799 + 43) % 128;
            try {
                jSONObject.put(m5285("寏蟭ᐏ츆", 3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), true);
                int i = f4799 + 17;
                f4801 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: ﾇ */
    private static String m5286(List<AbstractC2813gi> list) {
        if (list == null) {
            return null;
        }
        f4801 = (f4799 + 65) % 128;
        if (list.isEmpty()) {
            return null;
        }
        int i = f4801 + 51;
        f4799 = i % 128;
        if (i % 2 == 0) {
            if (list.get(0) == null) {
                return null;
            }
        } else if (list.get(0) == null) {
            return null;
        }
        return list.get(0).mo6813();
    }

    /* renamed from: ﻐ */
    public final void m5302(String str) {
        m5304(str, new ArrayList());
        int i = f4799 + 85;
        f4801 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public final synchronized ISAdQualityInitListener m5301() {
        ISAdQualityInitListener iSAdQualityInitListener;
        try {
            int i = f4799 + 17;
            int i2 = i % 128;
            f4801 = i2;
            if (i % 2 != 0) {
                iSAdQualityInitListener = this.f4806;
                int i3 = 98 / 0;
            } else {
                iSAdQualityInitListener = this.f4806;
            }
            f4799 = (i2 + 49) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return iSAdQualityInitListener;
    }

    /* renamed from: ﻐ */
    private static String m5256(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f4800, i, cArr, 0, i2);
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

    /* renamed from: ﾒ */
    private void m5298(final C2710cn c2710cn, final String str) {
        final String strM6231 = c2710cn.m6231();
        C2926s.m7596(this.f4809.new AnonymousClass1(strM6231, C2670ba.c.f5081));
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.4

            /* renamed from: ﱟ */
            private static int f4871 = 0;

            /* renamed from: ﱡ */
            private static int f4872 = 1;

            /* renamed from: ﾒ */
            private static char[] f4874 = {'l', 207, 'x', 243, 251, 247, 238, 244, 245, 241, 'F', 136, 131, 138, 144, 143, '~', 'v', 134, 134, 131, 133, 138, 'y', 'x', 141};

            /* renamed from: ﺙ */
            private static int f4873 = 22;

            /* renamed from: ﾇ */
            private static String m5315(int i, int i2, int i3, String str2, boolean z) {
                String str3;
                char[] charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
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
                            cArr2[i5] = (char) (cArr2[i5] - f4873);
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
                        str3 = new String(cArr2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﻐ */
            public final void mo5316(Throwable th) {
                C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass3(strM6231, C2670ba.b.f5063));
                String strIntern = m5314(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m5315(ExpandableListView.getPackedPositionType(0L) + 10, 30 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 121, "\u0011\u0006\u000b\u0006ﾽ\u000f\f\u000f\u000f￢ﾽ\u000f\f\u0011\u0000\u0002\u000b\u000b\f\u0000ﾽ\u0004\u000b\u0006\u0017\u0006\t\ufffe\u0006", true).intern());
                sb.append(strM6231);
                C2914kb.m7429(strIntern, sb.toString(), th, true, true, true);
                f4872 = (f4871 + 97) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws Exception {
                f4871 = (f4872 + 47) % 128;
                JSONObject jSONObjectM5276 = C2666ax.m5276(C2666ax.this, c2710cn);
                int i = 2;
                jSONObjectM5276.put(m5314(true, new int[]{0, 2, 97, 0}, "\u0001\u0001").intern(), true);
                C2666ax.m5246(C2666ax.this).put(c2710cn.m6231(), jSONObjectM5276);
                String strM6221 = c2710cn.m6221();
                if (m5314(false, new int[]{2, 8, 173, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001").intern().equals(strM6221)) {
                    String strIntern = m5314(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(c2710cn.m6227());
                    sb.append(m5315(View.combineMeasuredStates(0, 0) + 6, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), 117 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0014\u0002\u0003\r\u0006\u0005\uffc1\u0004\u0010\u000f\u000f\u0006\u0004\u0015\u0010\u0013\uffc1\n\u0014\uffc1\u0005\n", false).intern());
                    C2921n.m7518(strIntern, sb.toString());
                    C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass1(strM6231, C2670ba.c.f5079));
                } else if (C2666ax.m5261(C2666ax.this, strM6231)) {
                    String strIntern2 = m5314(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c2710cn.m6227());
                    sb2.append(m5315((ViewConfiguration.getLongPressTimeout() >> 16) + 14, 39 - (ViewConfiguration.getScrollBarSize() >> 8), 117 - KeyEvent.normalizeMetaState(0), "\u0013\u0010\u000e\uffc1\u0015\t\u0006\uffc1\u0014\u0006\u0013\u0017\u0006\u0013\uffc1\u0004\u0010\u000f\u000f\u0006\u0004\u0015\u0010\u0013\uffc1\u0018\u0002\u0014\uffc1\u0005\n\u0014\u0002\u0003\r\u0006\u0005\uffc1\u0007", false).intern());
                    C2921n.m7518(strIntern2, sb2.toString());
                    C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass1(strM6231, C2670ba.c.f5079));
                    jSONObjectM5276.put(m5315(3 - KeyEvent.keyCodeFromString(""), 3 - (ViewConfiguration.getJumpTapTimeout() >> 16), 126 - TextUtils.getTrimmedLength(""), "\u000b\ufffb￼", true).intern(), true);
                } else if (C2666ax.m5282(c2710cn, strM6221)) {
                    C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.4.3

                        /* renamed from: ﱟ */
                        private static int f4879 = 0;

                        /* renamed from: ﱡ */
                        private static int f4880 = 1;

                        /* renamed from: ﻐ */
                        private static char f4881 = 26239;

                        /* renamed from: ﻛ */
                        private static char f4882 = 54340;

                        /* renamed from: ﾇ */
                        private static char f4883 = 38473;

                        /* renamed from: ﾒ */
                        private static char f4884 = 41735;

                        /* renamed from: ﾇ */
                        private static String m5317(String str2, int i2) {
                            String str3;
                            char[] charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (C2920m.f7237) {
                                try {
                                    char[] cArr2 = new char[cArr.length];
                                    C2920m.f7236 = 0;
                                    char[] cArr3 = new char[2];
                                    while (true) {
                                        int i3 = C2920m.f7236;
                                        if (i3 < cArr.length) {
                                            cArr3[0] = cArr[i3];
                                            cArr3[1] = cArr[i3 + 1];
                                            int i4 = 58224;
                                            for (int i5 = 0; i5 < 16; i5++) {
                                                char c = cArr3[1];
                                                char c2 = cArr3[0];
                                                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + f4884)) ^ ((c2 >>> 5) + f4882)));
                                                cArr3[1] = c3;
                                                cArr3[0] = (char) (c2 - (((c3 >>> 5) + f4881) ^ ((c3 + i4) ^ ((c3 << 4) + f4883))));
                                                i4 -= 40503;
                                            }
                                            int i6 = C2920m.f7236;
                                            cArr2[i6] = cArr3[0];
                                            cArr2[i6 + 1] = cArr3[1];
                                            C2920m.f7236 = i6 + 2;
                                        } else {
                                            str3 = new String(cArr2, 0, i2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str3;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﻐ */
                        public final void mo5316(Throwable th) throws JSONException {
                            try {
                                ((JSONObject) C2666ax.m5246(C2666ax.this).get(c2710cn.m6231())).put(m5317("\ue0fbⅠ⊡ꇃ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 4).intern(), false);
                                f4879 = (f4880 + 7) % 128;
                            } catch (JSONException e) {
                                C2921n.m7506(m5317("簄햍仯ᕕ輸\uf194ࢅ酒흸▌㝬칆薸졲Ⱅ爜", 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m5317("蓛곊麹놃ꖴ굂겊씄캊浴\ue0fbⅠ\uea5b\uea75\ue0fbⅠ⊡ꇃ觍硳ᙧ\ue55e夓셈仯ᕕ輸\uf194ࢅ酒ꖴ굂䶸\u16fcﺩ님\uee71\udc52럩륮\u07beႠ䲆ᡆ", '\\' - AndroidCharacter.getMirror('0')).intern(), e);
                            }
                            C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass3(strM6231, C2670ba.b.f5067));
                            String strIntern3 = m5317("簄햍仯ᕕ輸\uf194ࢅ酒흸▌㝬칆薸졲Ⱅ爜", 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m5317("蓛곊麹놃ꖴ굂\ue0fbⅠ⊡ꇃ⏄鈺ે斋⋡䆖⟧綂\uf2ee苆", TextUtils.getOffsetBefore("", 0) + 19).intern());
                            sb3.append(c2710cn.m6227());
                            C2914kb.m7429(strIntern3, AbstractC2183w4.OooOO0O(sb3, m5317("\ue6be㔃䲆ᡆ賚튛욀\u05fc漍ᬔ", 10 - KeyEvent.getDeadChar(0, 0))), th, true, true, true);
                            String strIntern4 = m5317("洋\ue506旁䁚ঢ璘⊡ꇃ盺☯茷\ue98d", 12 - TextUtils.getCapsMode("", 0, 0)).intern();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m5317("覩࿇煮诿\ue6c6\uf37f漍ᬔ\uf5d6껚\udd47㮜젴뿣Ꮌꎯ쏤㚄ⴉ❿䞱ᠢ뎭\ue9d9\ue0fbⅠ⊡ꇃ⏄鈺ે斋⋡䆖⟧綂\uab6dᠱ鯽․钳\u19cb㯮聦ે斋㒫蘥ᔪ뤂茷\ue98d\uf2ee苆", 53 - TextUtils.getOffsetBefore("", 0)).intern());
                            sb4.append(c2710cn.m6227());
                            sb4.append(m5317("\ue6be㔃䲆ᡆ賚튛욀\u05fc漍ᬔㇳ\udad1", 11 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                            C2921n.m7502(strIntern4, sb4.toString());
                            int i2 = f4879 + 125;
                            f4880 = i2 % 128;
                            if (i2 % 2 == 0) {
                                throw null;
                            }
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            c2710cn.m6230();
                            C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass1(strM6231, C2670ba.c.f5082));
                            String strIntern3 = m5317("簄햍仯ᕕ輸\uf194ࢅ酒흸▌㝬칆薸졲Ⱅ爜", Color.argb(0, 0, 0, 0) + 16).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(c2710cn.m6227());
                            sb3.append(m5317("\ue6be㔃䲆ᡆ賚튛욀\u05fc漍ᬔ惿䜴첨諅镫뷈\ud8ab쉸\uf7b1∗ꖽ㔍\uf4f2ꖊ\ue0fbⅠ⊡ꇃ⏄鈺ે斋陆䇐奫뙃", 35 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                            C2921n.m7518(strIntern3, sb3.toString());
                            int i2 = f4879 + 121;
                            f4880 = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i3 = 36 / 0;
                            }
                        }
                    });
                    C2666ax.m5291(C2666ax.this).add(c2710cn);
                } else {
                    jSONObjectM5276.put(m5315(-((byte) KeyEvent.getModifierMetaStateMask()), 3 - (Process.myPid() >> 22), 138 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\uffff\uffff\u0002", true).intern(), false);
                    C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass3(strM6231, C2670ba.b.f5068));
                    String strIntern3 = m5314(false, new int[]{10, 16, 31, 13}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001").intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    C2914kb.m7429(strIntern3, AbstractC2183w4.OooOO0O(sb3, m5315(8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 19 - Color.red(0), View.MeasureSpec.getMode(0) + 117, "\u0011\u0016\u0014\uffc1\u0015\u0010\u000f\uffc1\u0015\u0006\u001a\uffc1ￍ\u0005\u0006\u0015\u0013\u0010\u0011", true)), null, true, true, true);
                    ISAdQualityInitListener iSAdQualityInitListenerM5301 = C2666ax.this.m5301();
                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(c2710cn.m6227());
                    sb4.append(m5315(ExpandableListView.getPackedPositionChild(0L) + 3, (ViewConfiguration.getTouchSlop() >> 8) + 13, 106 - (KeyEvent.getMaxKeyCode() >> 16), "\u001aￌￌ\uffff\ufff0\ufff7ￌ\"\u0011\u001e\u001f\u0015\u001b", false).intern());
                    sb4.append(c2710cn.m6221());
                    sb4.append(m5315(TextUtils.indexOf((CharSequence) "", '0', 0) + 35, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38, TextUtils.indexOf("", "") + 117, "\u0006\u000f\u000f\u0010\u0004\uffc1\u0006\t\u0015\uffc1\u001a\u0003\uffc1\u0005\u0006\u0015\u0013\u0010\u0011\u0011\u0016\u0014\uffc1\u0015\u0006\u001a\uffc1\u0015\u0010\u000f\uffc1\u0014\n\uffc1\u0013\u0010\u0015\u0004", true).intern());
                    iSAdQualityInitListenerM5301.adQualitySdkInitFailed(iSAdQualityInitError, sb4.toString());
                    i = 2;
                }
                jSONObjectM5276.remove(m5314(true, new int[]{0, i, 97, 0}, "\u0001\u0001").intern());
                f4871 = (f4872 + 29) % 128;
            }

            /* renamed from: ﻐ */
            private static String m5314(boolean z, int[] iArr, String str2) throws UnsupportedEncodingException {
                String str3;
                byte[] bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = bytes;
                synchronized (C2831h.f6553) {
                    try {
                        int i = iArr[0];
                        int i2 = iArr[1];
                        int i3 = iArr[2];
                        int i4 = iArr[3];
                        char[] cArr = new char[i2];
                        System.arraycopy(f4874, i, cArr, 0, i2);
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
                        str3 = new String(cArr);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str3;
            }
        });
        int i = f4799 + 97;
        f4801 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private boolean m5283(String str) {
        if (!this.f4810.containsKey(str)) {
            return false;
        }
        int i = f4801 + 71;
        f4799 = i % 128;
        if (i % 2 == 0) {
            this.f4810.get(str).m5238(this.f4808);
            throw null;
        }
        if (!this.f4810.get(str).m5238(this.f4808)) {
            return false;
        }
        int i2 = f4801;
        f4799 = (i2 + 29) % 128;
        int i3 = i2 + 121;
        f4799 = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private C2710cn m5263(Context context, String str, AbstractC2676bg abstractC2676bg) {
        int i = f4799;
        int i2 = i + 61;
        f4801 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            int i3 = i + 95;
            f4801 = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        C2710cn c2710cn = new C2710cn(context, new C2733dj(str, this.f4811), this.f4804, this.f4807, abstractC2676bg);
        int i4 = f4801 + 85;
        f4799 = i4 % 128;
        if (i4 % 2 != 0) {
            return c2710cn;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static JSONObject m5277(Map<String, JSONObject> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            int i = f4799 + 31;
            f4801 = i % 128;
            if (i % 2 != 0) {
                String str = (String) it.next();
                jSONObject2.put(str.toLowerCase(), map.get(str));
                int i2 = 19 / 0;
            } else {
                String str2 = (String) it.next();
                jSONObject2.put(str2.toLowerCase(), map.get(str2));
            }
        }
        jSONObject.put(m5285("\uea89捇㛮¥", ExpandableListView.getPackedPositionChild(0L) + 5).intern(), jSONObject2);
        return jSONObject;
    }

    /* renamed from: ﾇ */
    private static String m5285(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f4797)) ^ ((c2 >>> 5) + f4798)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f4803) ^ ((c3 + i3) ^ ((c3 << 4) + f4802))));
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

    /* renamed from: ﾒ */
    private void m5294(Context context, String str, String str2, List<AbstractC2813gi> list, AbstractRunnableC2878it abstractRunnableC2878it) {
        f4801 = (f4799 + 63) % 128;
        Iterator<AbstractC2813gi> it = list.iterator();
        f4801 = (f4799 + 27) % 128;
        while (it.hasNext()) {
            f4799 = (f4801 + 69) % 128;
            m5293(context, str, str2, it.next(), abstractRunnableC2878it);
        }
    }

    /* renamed from: ﻛ */
    private void m5268(final Context context, final String str, final String str2, final AbstractC2813gi abstractC2813gi, final C2710cn c2710cn, final boolean z, final AbstractC2676bg abstractC2676bg, final AbstractRunnableC2878it abstractRunnableC2878it) {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.9

            /* renamed from: ﭖ */
            private static char f4912 = 0;

            /* renamed from: ﭴ */
            private static int f4913 = -816930986;

            /* renamed from: ﭸ */
            private static int f4914 = 1;

            /* renamed from: ﮉ */
            private static int f4915;

            /* renamed from: ﱡ */
            private static long f4916;

            /* renamed from: ﾇ */
            private static String m5318(int i, char c, String str3, String str4, String str5) {
                String str6;
                char[] charArray = str5;
                if (str5 != null) {
                    charArray = str5.toCharArray();
                }
                char[] cArr = charArray;
                char[] charArray2 = str4;
                if (str4 != null) {
                    charArray2 = str4.toCharArray();
                }
                char[] cArr2 = charArray2;
                char[] charArray3 = str3;
                if (str3 != null) {
                    charArray3 = str3.toCharArray();
                }
                char[] cArr3 = charArray3;
                synchronized (C2885j.f6936) {
                    try {
                        char[] cArr4 = (char[]) cArr3.clone();
                        char[] cArr5 = (char[]) cArr.clone();
                        cArr4[0] = (char) (c ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i));
                        int length = cArr2.length;
                        char[] cArr6 = new char[length];
                        C2885j.f6934 = 0;
                        while (true) {
                            int i2 = C2885j.f6934;
                            if (i2 < length) {
                                int i3 = (i2 + 2) % 4;
                                int i4 = (i2 + 3) % 4;
                                int i5 = cArr4[i2 % 4] * 32718;
                                char c2 = cArr5[i3];
                                char c3 = (char) ((i5 + c2) % 65535);
                                C2885j.f6935 = c3;
                                cArr5[i4] = (char) (((cArr4[i4] * 32718) + c2) / 65535);
                                cArr4[i4] = c3;
                                int i6 = C2885j.f6934;
                                cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f4916) ^ f4913) ^ f4912);
                                C2885j.f6934 = i6 + 1;
                            } else {
                                str6 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str6;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                String strIntern;
                AbstractRunnableC2878it abstractRunnableC2878it2;
                if (c2710cn == null || C2666ax.m5250(C2666ax.this).contains(abstractC2813gi)) {
                    return;
                }
                C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.2

                    /* renamed from: ﻐ */
                    private /* synthetic */ boolean f5087;

                    /* renamed from: ｋ */
                    private /* synthetic */ C2710cn f5088;

                    /* renamed from: ﾒ */
                    private /* synthetic */ String f5090;

                    public AnonymousClass2(String str3, C2710cn c2710cn2, boolean z2) {
                        str = str3;
                        c2710cn = c2710cn2;
                        z = z2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        C2670ba c2670baM5434 = C2671bb.m5434(C2671bb.this, str);
                        if (c2670baM5434 != null) {
                            c2670baM5434.m5426(c2710cn);
                        }
                    }
                });
                if (!c2710cn.m6219() && (abstractRunnableC2878it2 = abstractRunnableC2878it) != null) {
                    C2926s.m7600(abstractRunnableC2878it2);
                }
                if (!C2666ax.m5281(c2710cn)) {
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.9.4

                        /* renamed from: ﻐ */
                        private static int f4926 = 0;

                        /* renamed from: ﻛ */
                        private static char[] f4927 = {'9', 'j', 'k', '9', 'n', 'l', 'n', 'G', ' ', 'I', 'k', 'g', 'E', 'K', 'm', 'k', 16, 'G', 'n', 'l', 'n', 'r', 'k', 'm', 'K', 'E', 'g', 'k', 'I', '@', 'f', 'l', 'n', 'o', 'a', '9', 'I', 'l', 'k', 'm', 'o', 's', 'k', 'k', 'I', 24, 'W', 128, 'Y', 'W', 'y', '~', '~', '{', 'D', 136, 143, 149, 148, 131, '{', 139, 139, 136, 138, 143, '~', '}', 146, 146};

                        /* renamed from: ﾒ */
                        private static int f4928 = 1;

                        /* renamed from: ｋ */
                        private static String m5319(boolean z2, int[] iArr, String str3) throws UnsupportedEncodingException {
                            String str4;
                            byte[] bytes = str3;
                            if (str3 != null) {
                                bytes = str3.getBytes("ISO-8859-1");
                            }
                            byte[] bArr = bytes;
                            synchronized (C2831h.f6553) {
                                try {
                                    int i = iArr[0];
                                    int i2 = iArr[1];
                                    int i3 = iArr[2];
                                    int i4 = iArr[3];
                                    char[] cArr = new char[i2];
                                    System.arraycopy(f4927, i, cArr, 0, i2);
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
                                    if (z2) {
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
                                    str4 = new String(cArr);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str4;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() throws JSONException {
                            f4928 = (f4926 + 49) % 128;
                            if (!C2666ax.m5257(C2666ax.this).containsKey(c2710cn.m6231())) {
                                C2926s.m7596(C2666ax.m5273(C2666ax.this).new AnonymousClass3(c2710cn.m6231(), C2670ba.b.f5069));
                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                JSONObject jSONObjectM5276 = C2666ax.m5276(C2666ax.this, c2710cn);
                                try {
                                    jSONObjectM5276.put(m5319(false, new int[]{0, 3, 0, 1}, "\u0001\u0000\u0001").intern(), false);
                                } catch (JSONException unused) {
                                }
                                C2666ax.m5246(C2666ax.this).put(c2710cn.m6231(), jSONObjectM5276);
                                String strM5436 = C2666ax.m5273(C2666ax.this).m5436(c2710cn.m6231());
                                C2666ax.m5257(C2666ax.this).put(c2710cn.m6231(), strM5436);
                                ISAdQualityInitListener iSAdQualityInitListenerM5301 = C2666ax.this.m5301();
                                ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                                StringBuilder sb = new StringBuilder();
                                sb.append(c2710cn.m6227());
                                sb.append(m5319(false, new int[]{3, 13, 0, 5}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern());
                                sb.append(c2710cn.m6221());
                                sb.append(m5319(true, new int[]{16, 29, 0, 0}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000").intern());
                                sb.append(c2710cn.m6225());
                                sb.append(m5319(false, new int[]{45, 9, 16, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001").intern());
                                iSAdQualityInitListenerM5301.adQualitySdkInitFailed(iSAdQualityInitError, sb.toString());
                                C2914kb.m7429(m5319(false, new int[]{54, 16, 36, 12}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000").intern(), strM5436, null, true, true, true);
                                f4926 = (f4928 + InterfaceC3173h3.d.b.f8826i) % 128;
                            }
                            f4926 = (f4928 + InterfaceC3173h3.d.b.f8819b) % 128;
                        }
                    });
                    return;
                }
                String strIntern2 = m5318(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (52796 - (Process.myPid() >> 22)), "᪅\u2e64㲴࿎", "섄邽㉡淋腶딪㠥挔ᅯ\udc3a䴕탿鷏㩿ꭊ䫗", "\u0000\u0000\u0000\u0000").intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m5318(383071107 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 22017), "芯픳Ė퉖", "貫いꭒм軐憐옋뵍\uefe5훖ᔎ䊢\ud9e0", "\u0000\u0000\u0000\u0000").intern());
                sb.append(str);
                sb.append(m5318(TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34184), "鲮쯃蠉礪", "뱔ऒꆅ֛ꝥ湮\ufbc3ꘌ㯤࢞쑭䳢훹뙲쯄矂熥┻", "\u0000\u0000\u0000\u0000").intern());
                if (z) {
                    strIntern = m5318(ViewConfiguration.getFadingEdgeLength() >> 16, (char) KeyEvent.normalizeMetaState(0), "撲\ue663䖺ػ", "\u18ff槿⧷⁌\uf5ae牑樘弯", "\u0000\u0000\u0000\u0000").intern();
                } else {
                    strIntern = m5318((ViewConfiguration.getDoubleTapTimeout() >> 16) - 865976641, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "뾀戾擌\uf140", "ꠤ\ue651紦\ue238ꛌ筘铉␜误", "\u0000\u0000\u0000\u0000").intern();
                    f4915 = (f4914 + 99) % 128;
                }
                sb.append(strIntern);
                C2713cq.m6352(strIntern2, sb.toString());
                abstractC2676bg.m5465();
                if (c2710cn.m6219()) {
                    f4914 = (f4915 + InterfaceC3173h3.d.b.f8821d) % 128;
                    AbstractRunnableC2878it abstractRunnableC2878it3 = abstractRunnableC2878it;
                    if (abstractRunnableC2878it3 != null) {
                        C2926s.m7600(abstractRunnableC2878it3);
                    }
                }
                if (C2925r.m7548().m7579()) {
                    return;
                }
                f4915 = (f4914 + 59) % 128;
                C2666ax.m5280(C2666ax.this, c2710cn, str);
                if (C2666ax.m5261(C2666ax.this, c2710cn.m6231())) {
                    return;
                }
                int i = f4915 + InterfaceC3173h3.d.b.f8826i;
                f4914 = i % 128;
                if (i % 2 != 0) {
                    C2666ax.m5250(C2666ax.this).add(abstractC2813gi);
                } else {
                    C2666ax.m5250(C2666ax.this).add(abstractC2813gi);
                    int i2 = 93 / 0;
                }
            }
        });
        f4801 = (f4799 + 87) % 128;
    }

    /* renamed from: ﻛ */
    private static JSONObject m5265(C2710cn c2710cn) throws JSONException {
        f4801 = (f4799 + 125) % 128;
        JSONObject jSONObjectM5266 = m5266(c2710cn.m6221());
        try {
            jSONObjectM5266.put(C2869ik.f6793, c2710cn.m6226());
        } catch (JSONException e) {
            C2921n.m7506(m5256(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m5285("餃ꤟ랝騟ࡪ셥补ኧ葜⭁鹙縔ꥵ㉙욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞\uf6e7뻖햶ﭛ\uf14f\uf69e쒄䱼⸽ఫ腬랠\udb86著", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36).intern(), e);
        }
        int i = f4799 + 87;
        f4801 = i % 128;
        if (i % 2 == 0) {
            return jSONObjectM5266;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private void m5293(final Context context, final String str, final String str2, final AbstractC2813gi abstractC2813gi, final AbstractRunnableC2878it abstractRunnableC2878it) {
        C2887jb.e eVarM6831 = abstractC2813gi.m6831();
        final AbstractC2676bg abstractC2676bgMo6815 = abstractC2813gi.mo6815();
        m5272(str2, abstractC2676bgMo6815);
        C2926s.m7596(this.f4809.new AnonymousClass1(str2, C2670ba.c.f5080));
        final String strM7161 = this.f4805.m7161(eVarM6831, new InterfaceC2874ip() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2874ip
            /* renamed from: ﻐ */
            public final void mo5224(String str3) {
                C2666ax.m5295(C2666ax.this, context, str, str2, abstractC2813gi, C2666ax.m5284(C2666ax.this, context, str3, abstractC2676bgMo6815), false, abstractC2676bgMo6815, abstractRunnableC2878it);
            }
        });
        C2926s.m7594(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2666ax.m5295(C2666ax.this, context, str, str2, abstractC2813gi, C2666ax.m5284(C2666ax.this, context, strM7161, abstractC2676bgMo6815), true, abstractC2676bgMo6815, abstractRunnableC2878it);
            }
        }, m5249());
        f4801 = (f4799 + 53) % 128;
    }

    /* renamed from: ﻛ */
    private void m5267() throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator<C2710cn> it = m5243().iterator();
        while (it.hasNext()) {
            int i = f4801 + 41;
            f4799 = i % 128;
            if (i % 2 != 0) {
                C2710cn next = it.next();
                if (m5283(next.m6231())) {
                    arrayList.add(next);
                    f4799 = (f4801 + 27) % 128;
                }
                f4799 = (f4801 + 23) % 128;
            } else {
                m5283(it.next().m6231());
                throw null;
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            final C2710cn c2710cn = (C2710cn) obj;
            String strIntern = m5256(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m5256(false, new int[]{107, 10, 19, 10}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001").intern());
            sb.append(c2710cn.m6227());
            sb.append(m5285("욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞", Gravity.getAbsoluteGravity(0, 0) + 10).intern());
            C2921n.m7504(strIntern, sb.toString());
            String strM6231 = c2710cn.m6231();
            m5299(strM6231, m5254().get(strM6231));
            C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.6
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    c2710cn.m6229();
                }
            });
            m5245().remove(c2710cn);
        }
    }

    /* renamed from: ﾒ */
    private static boolean m5300(C2710cn c2710cn) {
        int i = f4799 + 95;
        f4801 = i % 128;
        if (i % 2 == 0) {
            String strM6225 = c2710cn.m6225();
            if (strM6225 == null || C2916kd.m7455(IronSourceAdQuality.getSDKVersion(), strM6225) >= 0) {
                return true;
            }
            f4801 = (f4799 + InterfaceC3173h3.d.b.f8819b) % 128;
            return false;
        }
        c2710cn.m6225();
        throw null;
    }

    /* renamed from: ﻛ */
    private void m5272(String str, AbstractC2676bg abstractC2676bg) {
        if (abstractC2676bg != null) {
            f4799 = (f4801 + 9) % 128;
            m5254().put(str, m5266(abstractC2676bg.m5461()));
        }
        int i = f4799 + InterfaceC3173h3.d.b.f8819b;
        f4801 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private static JSONObject m5266(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2869ik.f6791, str);
        } catch (JSONException e) {
            C2921n.m7506(m5256(false, new int[]{51, 16, 162, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001").intern(), m5285("餃ꤟ랝騟ࡪ셥补ኧ葜⭁鹙縔ꥵ㉙욚\uf8a8쒄䱼\uf77e㋽⻰띺鱖㳞\uf6e7뻖햶ﭛ\uf14f\uf69e쒄䱼⸽ఫ腬랠\udb86著", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37).intern(), e);
        }
        int i = f4799 + 73;
        f4801 = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ﻛ */
    public final void m5304(String str, List<Object> list) {
        f4799 = (f4801 + 77) % 128;
        Iterator<C2710cn> it = m5243().iterator();
        f4799 = (f4801 + 3) % 128;
        while (it.hasNext()) {
            it.next().m6228(str, list);
        }
    }
}

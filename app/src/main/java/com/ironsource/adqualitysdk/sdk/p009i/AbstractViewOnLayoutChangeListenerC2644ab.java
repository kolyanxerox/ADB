package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ab */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnLayoutChangeListenerC2644ab<T> extends AbstractC2931x<WebView, T> implements View.OnLayoutChangeListener {

    /* renamed from: ﭴ */
    private static int f4450 = 1;

    /* renamed from: ﮐ */
    private static int[] f4451 = {-1062384603, -323842024, -497061888, -559740433, -357214044, 1630483275, -1153396497, 1233357459, 996759772, -347832069, 1669280728, -501863502, 2117746409, 1931318882, -1949263467, 581231776, 904858614, -131371034};

    /* renamed from: ﱟ */
    private static int f4452;

    /* renamed from: ﱡ */
    private C2901jp f4453;

    /* renamed from: ﺙ */
    private Map<WebView, C2902jq> f4454 = new WeakHashMap();

    /* renamed from: ﻏ */
    private List<InterfaceC2896jk> f4455 = new ArrayList();

    /* renamed from: ﻐ */
    private boolean f4456;

    /* renamed from: ﻛ */
    private C2902jq f4457;

    /* renamed from: ｋ */
    private String f4458;

    /* renamed from: ﾇ */
    private List<String> f4459;

    /* renamed from: ﾒ */
    private boolean f4460;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ab$3, reason: invalid class name */
    public class AnonymousClass3 implements InterfaceC2896jk {

        /* renamed from: ﮐ */
        private static char f4461 = 19704;

        /* renamed from: ﱟ */
        private static int f4462 = 0;

        /* renamed from: ﱡ */
        private static int f4463 = 1;

        /* renamed from: ﻐ */
        private static char f4464 = 52629;

        /* renamed from: ﻛ */
        private static char f4465 = 15142;

        /* renamed from: ｋ */
        private static long f4466 = 4386436876627656361L;

        /* renamed from: ﾒ */
        private static char f4467 = 338;

        public AnonymousClass3() {
        }

        /* renamed from: ﻛ */
        private static String m4942(String str, int i) {
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
                                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f4467)) ^ ((c2 >>> 5) + f4461)));
                                cArr3[1] = c3;
                                cArr3[0] = (char) (c2 - (((c3 >>> 5) + f4465) ^ ((c3 + i3) ^ ((c3 << 4) + f4464))));
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
        public static /* synthetic */ void m4945(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z) {
            f4462 = (f4463 + 75) % 128;
            anonymousClass3.m4944(webView, str, z);
            f4462 = (f4463 + 115) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
        /* renamed from: ﻐ */
        public final void mo4946(final WebView webView, final String str, final boolean z) {
            C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3.5
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    if (AbstractViewOnLayoutChangeListenerC2644ab.m4930(AbstractViewOnLayoutChangeListenerC2644ab.this)) {
                        if (AbstractViewOnLayoutChangeListenerC2644ab.m4919(AbstractViewOnLayoutChangeListenerC2644ab.this) == null || AbstractViewOnLayoutChangeListenerC2644ab.m4919(AbstractViewOnLayoutChangeListenerC2644ab.this).isEmpty()) {
                            AnonymousClass3.m4945(AnonymousClass3.this, webView, str, z);
                            return;
                        }
                        Iterator it = AbstractViewOnLayoutChangeListenerC2644ab.m4919(AbstractViewOnLayoutChangeListenerC2644ab.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m4945(AnonymousClass3.this, webView, str, z);
                                return;
                            }
                        }
                    }
                }
            });
            f4463 = (f4462 + 5) % 128;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
        /* renamed from: ﾇ */
        public final void mo4948(WebView webView, String str, String str2) throws JSONException, UnsupportedEncodingException {
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (strSubstring.equals(m4943("뻚娶眝ဋⵤ왛", View.resolveSize(0, 0) + 58603).intern())) {
                AbstractViewOnLayoutChangeListenerC2644ab.m4921(AbstractViewOnLayoutChangeListenerC2644ab.this, webView);
                return;
            }
            if (strSubstring.equals(m4942("\ue930橵享ﴥ꼷ꎾ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern())) {
                JSONObject jSONObjectM4926 = AbstractViewOnLayoutChangeListenerC2644ab.m4926(strSubstring2);
                AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab = AbstractViewOnLayoutChangeListenerC2644ab.this;
                abstractViewOnLayoutChangeListenerC2644ab.m4931(jSONObjectM4926, webView, (WebView) abstractViewOnLayoutChangeListenerC2644ab.mo4933(webView));
                return;
            }
            if (strSubstring.equals(m4942("\ue930橵享ﴥ 갞", (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern())) {
                JSONObject jSONObjectM49262 = AbstractViewOnLayoutChangeListenerC2644ab.m4926(strSubstring2);
                AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab2 = AbstractViewOnLayoutChangeListenerC2644ab.this;
                abstractViewOnLayoutChangeListenerC2644ab2.mo6317(jSONObjectM49262, webView, AbstractViewOnLayoutChangeListenerC2644ab.m4922(abstractViewOnLayoutChangeListenerC2644ab2), AbstractViewOnLayoutChangeListenerC2644ab.this.mo4933(webView));
                return;
            }
            if (!(!strSubstring.equals(m4942("\ue930橵享ﴥ\ud7a7䩘", (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern()))) {
                f4463 = (f4462 + 115) % 128;
                JSONObject jSONObjectM49263 = AbstractViewOnLayoutChangeListenerC2644ab.m4926(strSubstring2);
                jSONObjectM49263.remove(C2869ik.f6832);
                AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab3 = AbstractViewOnLayoutChangeListenerC2644ab.this;
                abstractViewOnLayoutChangeListenerC2644ab3.mo6312(jSONObjectM49263, webView, abstractViewOnLayoutChangeListenerC2644ab3.mo4933(webView));
                f4463 = (f4462 + 47) % 128;
                return;
            }
            if (strSubstring.equals(m4942("\ue930橵享ﴥ俦哱", 5 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                JSONObject jSONObjectM49264 = AbstractViewOnLayoutChangeListenerC2644ab.m4926(strSubstring2);
                C2914kb.m7418(jSONObjectM49264.optString(m4943("뻝㍍ꗄ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36228).intern()), jSONObjectM49264.optString(m4942("䰡퓶\ufae5챾杹棦", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5).intern()), jSONObjectM49264.optString(m4942("䰡퓶䘰嘌㚳뮦", 6 - Drawable.resolveOpacity(0, 0)).intern()), jSONObjectM49264.optString(m4943("뻌褎텰ᦢ憖", (ViewConfiguration.getLongPressTimeout() >> 16) + 14293).intern()));
            }
            int i = f4462 + 9;
            f4463 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: ﾒ */
        private void m4944(final WebView webView, final String str, final boolean z) {
            C2926s.m7598(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3.2
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo4933 = AbstractViewOnLayoutChangeListenerC2644ab.this.mo4933(webView);
                    C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.3.2.3

                        /* renamed from: ﺙ */
                        private static int f4473 = 1;

                        /* renamed from: ﻐ */
                        private static long f4474 = 7815998009041492461L;

                        /* renamed from: ｋ */
                        private static int f4475;

                        /* renamed from: ﻐ */
                        private static String m4951(String str2, int i) {
                            String str3;
                            char[] charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
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
                                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f4474);
                                            C2804g.f6421++;
                                        } else {
                                            str3 = new String(cArr2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(C2869ik.f6823, str);
                                jSONObject.put(C2869ik.f6824, m4951("ᦚᓎ̤", KeyEvent.keyCodeFromString("") + 3413).intern());
                                jSONObject.put(C2869ik.f6831, originalUrl);
                                if (!(!z)) {
                                    int i = f4475 + 17;
                                    f4473 = i % 128;
                                    if (i % 2 == 0) {
                                        jSONObject.put(C2869ik.f6834, false);
                                    } else {
                                        jSONObject.put(C2869ik.f6834, true);
                                    }
                                }
                                f4473 = (f4475 + 45) % 128;
                            } catch (JSONException e) {
                                String strIntern = m4951("ᦺ얷ꇱ贆楸咳ムᰕ\uf871Ꞓ菺漶䭽㚲ዺ︮", 56383 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
                                StringBuilder sb = new StringBuilder();
                                sb.append(m4951("ᦨ㠚媕納龋빔킐\uf33cᖠ㐡嚫椳访ꩋ첋\uef45Ǒ⁑䋔教螩ꙮ\uf8f0᭱㷻尪繏", 8581 - TextUtils.getTrimmedLength("")).intern());
                                sb.append(e.getLocalizedMessage());
                                C2921n.m7509(strIntern, sb.toString());
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab = AbstractViewOnLayoutChangeListenerC2644ab.this;
                            abstractViewOnLayoutChangeListenerC2644ab.mo6309(jSONObject, webView, AbstractViewOnLayoutChangeListenerC2644ab.m4922(abstractViewOnLayoutChangeListenerC2644ab), objMo4933);
                        }
                    });
                }
            });
            int i = f4462 + 69;
            f4463 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
        /* renamed from: ﾒ */
        public final void mo4949(WebView webView, String str) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C2869ik.f6833, str);
                jSONObject.put(C2869ik.f6829, C2869ik.f6830);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C2869ik.f6835, jSONObject);
                AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab = AbstractViewOnLayoutChangeListenerC2644ab.this;
                abstractViewOnLayoutChangeListenerC2644ab.mo6313(jSONObject2, webView, this, abstractViewOnLayoutChangeListenerC2644ab.mo4933(webView));
                int i = f4463 + 85;
                f4462 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (Exception e) {
                C2914kb.m7426(m4943("뻾䖹䠡䲠匔垅婠廛敥槼汚烀瞱稴纪Ԁ", 64373 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m4943("뻬屜篕ᥓ㓇툪\uf1e0轪ꫴ䡷枛ԍₓ㸕\uddeb\ufb37隺됽号滉\u0c53⯟쥝\ue4fc舡ꇬ뽬嫻砃", 57991 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), (Throwable) e, false);
            }
        }

        /* renamed from: ﾒ */
        private static String m4943(String str, int i) {
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
                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f4466);
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2896jk
        /* renamed from: ﾇ */
        public final void mo4947(WebView webView) {
            f4462 = (f4463 + 113) % 128;
            AbstractViewOnLayoutChangeListenerC2644ab.m4921(AbstractViewOnLayoutChangeListenerC2644ab.this, webView);
            f4462 = (f4463 + 119) % 128;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ List m4919(AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab) {
        int i = f4452;
        f4450 = (i + 107) % 128;
        List<String> list = abstractViewOnLayoutChangeListenerC2644ab.f4459;
        int i2 = i + 39;
        f4450 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ C2671bb.e m4922(AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab) {
        f4452 = (f4450 + 107) % 128;
        C2671bb.e eVarM4924 = abstractViewOnLayoutChangeListenerC2644ab.m4924();
        int i = f4450 + 21;
        f4452 = i % 128;
        if (i % 2 == 0) {
            return eVarM4924;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ JSONObject m4926(String str) throws UnsupportedEncodingException {
        f4452 = (f4450 + 13) % 128;
        JSONObject jSONObjectM4923 = m4923(str);
        int i = f4452 + 87;
        f4450 = i % 128;
        if (i % 2 != 0) {
            return jSONObjectM4923;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private void m4929(WebView webView) {
        int i = f4450 + 121;
        f4452 = i % 128;
        if (i % 2 == 0) {
            this.f4453.m7312(webView);
        } else {
            this.f4453.m7312(webView);
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ boolean m4930(AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab) {
        int i = f4452 + 9;
        f4450 = i % 128;
        int i2 = i % 2;
        boolean z = abstractViewOnLayoutChangeListenerC2644ab.f4460;
        if (i2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f4454.containsKey(webView)) {
                    f4450 = (f4452 + 93) % 128;
                    m4920(webView);
                    f4452 = (f4450 + 109) % 128;
                }
            }
        } catch (Throwable th) {
            C2914kb.m7426(m4925(new int[]{-1215712433, 1764370700, 700568335, 623014170, 231519827, 1130197701, -1853310940, 1150806973}, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m4925(new int[]{1595330199, -347820987, 1024045471, 897041808, 135806228, -589683021, -1841525177, -1539661940, 32349091, 798512107, -1275768687, 1339724219}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22).intern(), th, false);
        }
    }

    /* renamed from: ﻛ */
    public abstract T mo4933(WebView webView);

    /* renamed from: ﻐ */
    public static /* synthetic */ void m4921(AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab, WebView webView) {
        f4450 = (f4452 + InterfaceC3173h3.d.b.f8819b) % 128;
        abstractViewOnLayoutChangeListenerC2644ab.m4920(webView);
        int i = f4450 + 85;
        f4452 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public final void m4934() {
        for (WebView webView : this.f4454.keySet()) {
            f4450 = (f4452 + 63) % 128;
            webView.removeOnLayoutChangeListener(this);
            C2902jq c2902jq = this.f4454.get(webView);
            Iterator<InterfaceC2896jk> it = this.f4455.iterator();
            while (it.hasNext()) {
                int i = f4450 + 71;
                f4452 = i % 128;
                if (i % 2 != 0) {
                    c2902jq.m7316(it.next());
                    throw null;
                }
                c2902jq.m7316(it.next());
            }
        }
        this.f4455.clear();
        this.f4457 = null;
        this.f4454.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2931x, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ｋ */
    public final /* synthetic */ void mo4939(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
        f4452 = (f4450 + 35) % 128;
        m4931(jSONObject, (WebView) obj, (WebView) obj2);
        f4450 = (f4452 + 27) % 128;
    }

    /* renamed from: ﾇ */
    public final void m4940(String str) {
        int i = (f4452 + 97) % 128;
        f4450 = i;
        this.f4458 = str;
        f4452 = (i + 75) % 128;
    }

    /* renamed from: ﾒ */
    public final WebView m4941() {
        C2902jq c2902jq = this.f4457;
        if (c2902jq == null) {
            f4450 = (f4452 + 3) % 128;
            return null;
        }
        f4450 = (f4452 + 69) % 128;
        WebView webViewM7318 = c2902jq.m7318();
        int i = f4452 + 93;
        f4450 = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
        return webViewM7318;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2931x, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ﻐ */
    public final /* synthetic */ void mo4932(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
        f4452 = (f4450 + 47) % 128;
        m4928(jSONObject, (WebView) obj, (WebView) obj2);
        int i = f4450 + 19;
        f4452 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public final void m4937(String str, List<String> list, boolean z, boolean z2, boolean z3) {
        this.f4456 = z;
        this.f4453 = new C2901jp(str, z3);
        this.f4460 = z2;
        this.f4459 = list;
        int i = f4452 + 49;
        f4450 = i % 128;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    /* renamed from: ﻐ */
    private InterfaceC2896jk m4918() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        int i = f4450 + 65;
        f4452 = i % 128;
        if (i % 2 == 0) {
            return anonymousClass3;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private void m4920(WebView webView) {
        C2902jq c2902jq = this.f4454.get(webView);
        if (this.f4456) {
            f4452 = (f4450 + 91) % 128;
            if (!(!c2902jq.m7320())) {
                f4452 = (f4450 + 45) % 128;
                if (!C2918kh.m7478(webView)) {
                    f4450 = (f4452 + InterfaceC3173h3.d.b.f8821d) % 128;
                    c2902jq.m7317();
                }
                m4929(webView);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return r3.f4457.m7315();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r0 = r0 + 109;
        com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r0 = 81 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3.f4457 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.f4457 != null) goto L9;
     */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.p009i.C2671bb.e m4924() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4452
            int r1 = r0 + 87
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L15
            com.ironsource.adqualitysdk.sdk.i.jq r1 = r3.f4457
            r2 = 89
            int r2 = r2 / 0
            if (r1 == 0) goto L20
            goto L19
        L15:
            com.ironsource.adqualitysdk.sdk.i.jq r1 = r3.f4457
            if (r1 == 0) goto L20
        L19:
            com.ironsource.adqualitysdk.sdk.i.jq r0 = r3.f4457
            com.ironsource.adqualitysdk.sdk.i.bb$e r0 = r0.m7315()
            return r0
        L20:
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L2f
            r0 = 81
            int r0 = r0 / 0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.m4924():com.ironsource.adqualitysdk.sdk.i.bb$e");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4936(android.webkit.WebView r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L63
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4452
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1b
            java.util.Map<android.webkit.WebView, com.ironsource.adqualitysdk.sdk.i.jq> r0 = r3.f4454
            boolean r0 = r0.containsKey(r4)
            r1 = 65
            int r1 = r1 / 0
            if (r0 != 0) goto L63
            goto L24
        L1b:
            java.util.Map<android.webkit.WebView, com.ironsource.adqualitysdk.sdk.i.jq> r0 = r3.f4454
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L24
            goto L63
        L24:
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x006c: FILL_ARRAY_DATA , data: [-1955287396, -1128866343, -334314632, -1786782952, -331857369, 855412766} // fill-array
            int r1 = android.view.KeyEvent.getMaxKeyCode()
            int r1 = r1 >> 16
            int r1 = 9 - r1
            java.lang.String r0 = m4925(r0, r1)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.i.jq r0 = com.ironsource.adqualitysdk.sdk.p009i.C2902jq.m7313(r4, r0)
            com.ironsource.adqualitysdk.sdk.i.jq r1 = r3.f4457
            if (r1 != 0) goto L4c
            r3.f4457 = r0
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4452
            int r1 = r1 + 5
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450 = r1
        L4c:
            java.util.Map<android.webkit.WebView, com.ironsource.adqualitysdk.sdk.i.jq> r1 = r3.f4454
            r1.put(r4, r0)
            com.ironsource.adqualitysdk.sdk.i.jk r1 = r3.m4918()
            java.util.List<com.ironsource.adqualitysdk.sdk.i.jk> r2 = r3.f4455
            r2.add(r1)
            r0.m7319(r1)
            r3.m4920(r4)
            r4.addOnLayoutChangeListener(r3)
        L63:
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450
            int r4 = r4 + 5
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4452 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.m4936(android.webkit.WebView):void");
    }

    /* renamed from: ﻐ */
    public final void m4931(JSONObject jSONObject, WebView webView, T t) throws JSONException {
        f4452 = (f4450 + InterfaceC3173h3.d.b.f8819b) % 128;
        m4927(jSONObject, webView);
        super.mo4939(jSONObject, (JSONObject) webView, (WebView) t);
        int i = f4450 + 61;
        f4452 = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L9;
     */
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject m4923(java.lang.String r6) throws java.io.UnsupportedEncodingException {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4452
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450 = r1
            int r0 = r0 % 2
            r1 = -1866954535(0xffffffff90b888d9, float:-7.278605E-29)
            r2 = 778188404(0x2e623674, float:5.1434815E-11)
            r3 = -1071411217(0xffffffffc0238fef, float:-2.55566)
            r4 = 1033344783(0x3d97970f, float:0.07401859)
            r5 = 0
            if (r0 != 0) goto L3a
            int[] r0 = new int[]{r4, r3, r2, r1}     // Catch: java.lang.Exception -> L66
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = android.graphics.PointF.length(r1, r1)     // Catch: java.lang.Exception -> L66
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            int r1 = 2 - r1
            java.lang.String r0 = m4925(r0, r1)     // Catch: java.lang.Exception -> L66
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L66
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r0)     // Catch: java.lang.Exception -> L66
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L66
            if (r0 != 0) goto L97
            goto L58
        L3a:
            int[] r0 = new int[]{r4, r3, r2, r1}     // Catch: java.lang.Exception -> L66
            float r1 = android.graphics.PointF.length(r5, r5)     // Catch: java.lang.Exception -> L66
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            int r1 = r1 + 5
            java.lang.String r0 = m4925(r0, r1)     // Catch: java.lang.Exception -> L66
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L66
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r0)     // Catch: java.lang.Exception -> L66
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L66
            if (r0 != 0) goto L97
        L58:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L66
            r0.<init>(r6)     // Catch: java.lang.Exception -> L66
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4452
            int r6 = r6 + 13
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.f4450 = r6
            return r0
        L66:
            r6 = move-exception
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [-1215712433, 1764370700, 700568335, 623014170, 231519827, 1130197701, -1853310940, 1150806973} // fill-array
            r1 = 0
            int r1 = android.view.View.getDefaultSize(r1, r1)
            int r1 = r1 + 16
            java.lang.String r0 = m4925(r0, r1)
            java.lang.String r0 = r0.intern()
            r1 = 10
            int[] r1 = new int[r1]
            r1 = {x00b2: FILL_ARRAY_DATA , data: [1595330199, -347820987, 1608506441, 1641155071, -1107171384, -2066723524, 973042341, 1490678316, -146241878, -68764120} // fill-array
            int r2 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r2 = r2 >> 16
            int r2 = 18 - r2
            java.lang.String r1 = m4925(r1, r2)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7506(r0, r1, r6)
        L97:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractViewOnLayoutChangeListenerC2644ab.m4923(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: ｋ */
    public final void m4938(List<WebView> list) {
        int i = f4452 + 47;
        f4450 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (list != null) {
            Iterator<WebView> it = list.iterator();
            f4452 = (f4450 + 65) % 128;
            while (it.hasNext()) {
                f4452 = (f4450 + 37) % 128;
                m4936(it.next());
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2931x
    /* renamed from: ｋ */
    public final String mo4935(T t) {
        int i = f4450 + 43;
        f4452 = i % 128;
        if (i % 2 == 0) {
            return this.f4458;
        }
        int i2 = 34 / 0;
        return this.f4458;
    }

    /* renamed from: ｋ */
    private static void m4927(JSONObject jSONObject, WebView webView) throws JSONException {
        boolean z = true;
        int i = (f4452 + 1) % 128;
        f4450 = i;
        if (webView != null) {
            f4452 = (i + 1) % 128;
            try {
                String str = C2869ik.f6794;
                if (webView.getWindowToken() != null) {
                    f4452 = (f4450 + 65) % 128;
                } else {
                    f4452 = (f4450 + 61) % 128;
                    z = false;
                }
                jSONObject.put(str, z);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: ｋ */
    private void m4928(JSONObject jSONObject, WebView webView, T t) throws JSONException {
        int i = f4452 + 19;
        f4450 = i % 128;
        if (i % 2 != 0) {
            jSONObject.remove(C2869ik.f6832);
            super.mo4932(jSONObject, (JSONObject) webView, (WebView) t);
            int i2 = f4450 + 117;
            f4452 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        jSONObject.remove(C2869ik.f6832);
        super.mo4932(jSONObject, (JSONObject) webView, (WebView) t);
        throw null;
    }

    /* renamed from: ｋ */
    private static String m4925(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f4451.clone();
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

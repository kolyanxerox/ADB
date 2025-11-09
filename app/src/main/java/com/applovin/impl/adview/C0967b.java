package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1061j0;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1089l8;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractC1179r4;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1148o7;
import com.applovin.impl.C1245t;
import com.applovin.impl.C1253t7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.applovin.impl.adview.b */
/* loaded from: classes.dex */
public class C0967b extends AbstractC1061j0 {

    /* renamed from: j */
    private static final Set f281j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    private static final Object f282k = new Object();

    /* renamed from: c */
    private final C1240o f283c;

    /* renamed from: d */
    private final C1220k f284d;

    /* renamed from: e */
    private AbstractC1207b f285e;

    /* renamed from: f */
    private boolean f286f;

    /* renamed from: g */
    private boolean f287g;

    /* renamed from: h */
    private final List f288h;

    /* renamed from: i */
    private final Object f289i;

    /* renamed from: com.applovin.impl.adview.b$a */
    public class a extends AbstractC1179r4 {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC1179r4
        /* renamed from: a */
        public Map mo235a() {
            return CollectionUtils.hashMap("name", "AdWebView");
        }
    }

    public C0967b(C0968c c0968c, C1220k c1220k, Context context) {
        super(context);
        this.f288h = new ArrayList();
        this.f289i = new Object();
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f284d = c1220k;
        this.f283c = c1220k.m2847O();
        Integer num = (Integer) c1220k.m2866a(C1268v4.f2906u6);
        if (num.intValue() > 0) {
            synchronized (f282k) {
                Set set = f281j;
                set.add(this);
                AbstractC1078k7.m1190a("AdWebView", set.size(), num.intValue(), c1220k.m2832E());
            }
        }
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(c0968c != null ? c0968c : new a());
        setWebChromeClient(new C1245t(c0968c != null ? c0968c.m271d() : null, c1220k));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (AbstractC1141o0.m1954j() && ((Boolean) c1220k.m2866a(C1268v4.f2640N5)).booleanValue()) {
            setWebViewRenderProcessClient(new C0969d(c1220k).m273a());
        }
        setOnTouchListener(new OooO0OO(0));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.OooO0o
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f15611OooOo0O.m253a(view);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m254a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* renamed from: b */
    private void m255b() {
        synchronized (this.f289i) {
            try {
                Iterator it = this.f288h.iterator();
                while (it.hasNext()) {
                    AbstractC1089l8.m1421a(this, (String) it.next(), "AdWebView", this.f284d);
                }
                this.f288h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f286f = true;
        this.f287g = false;
        super.destroy();
    }

    public AbstractC1207b getCurrentAd() {
        return this.f285e;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setAdHtmlLoaded(boolean z) {
        this.f287g = z;
        if (z && ((Boolean) this.f284d.m2866a(C1268v4.f2842m6)).booleanValue()) {
            m255b();
        }
    }

    /* renamed from: a */
    public /* synthetic */ boolean m253a(View view) {
        if (!C1240o.m3200a()) {
            return true;
        }
        this.f283c.m3211a("AdWebView", "Received a LongClick event.");
        return true;
    }

    /* renamed from: a */
    public void m256a(AbstractC1207b abstractC1207b) {
        String string;
        if (!this.f286f) {
            this.f285e = abstractC1207b;
            try {
                applySettings(abstractC1207b);
                if (AbstractC1078k7.m1202a(abstractC1207b.getSize())) {
                    setVisibility(0);
                }
                abstractC1207b.m2573a(SystemClock.elapsedRealtime());
                if (abstractC1207b instanceof C1206a) {
                    loadDataWithBaseURL(abstractC1207b.m2612k(), ((C1206a) abstractC1207b).m2488s1(), "text/html", null, "");
                    if (C1240o.m3200a()) {
                        this.f283c.m3211a("AdWebView", "AppLovinAd rendered");
                        return;
                    }
                    return;
                }
                if (abstractC1207b instanceof C1088l7) {
                    C1088l7 c1088l7 = (C1088l7) abstractC1207b;
                    C1148o7 c1148o7M1368s1 = c1088l7.m1368s1();
                    if (c1148o7M1368s1 != null) {
                        C1253t7 c1253t7M2026e = c1148o7M1368s1.m2026e();
                        Uri uriM3357c = c1253t7M2026e.m3357c();
                        if (uriM3357c != null) {
                            string = uriM3357c.toString();
                        } else {
                            string = "";
                        }
                        String strM3356b = c1253t7M2026e.m3356b();
                        String strM1369u1 = c1088l7.m1369u1();
                        if (!StringUtils.isValidString(string) && !StringUtils.isValidString(strM3356b)) {
                            if (C1240o.m3200a()) {
                                this.f283c.m3214b("AdWebView", "Unable to load companion ad. No resources provided.");
                                return;
                            }
                            return;
                        }
                        if (c1253t7M2026e.m3358d() == C1253t7.a.STATIC) {
                            if (C1240o.m3200a()) {
                                this.f283c.m3211a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strM251a = m251a((String) this.f284d.m2866a(C1268v4.f2559D4), string);
                            if (c1088l7.m1353J1() && c1088l7.isOpenMeasurementEnabled() && c1088l7.m1356K1()) {
                                strM251a = this.f284d.m2894e0().m784a(strM251a, AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207b));
                            }
                            loadDataWithBaseURL(abstractC1207b.m2612k(), strM251a, "text/html", null, "");
                            return;
                        }
                        if (c1253t7M2026e.m3358d() == C1253t7.a.HTML) {
                            if (StringUtils.isValidString(strM3356b)) {
                                String strM251a2 = m251a(strM1369u1, strM3356b);
                                String str = StringUtils.isValidString(strM251a2) ? strM251a2 : strM3356b;
                                if (C1240o.m3200a()) {
                                    this.f283c.m3211a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(abstractC1207b.m2612k(), str, "text/html", null, "");
                                return;
                            }
                            if (StringUtils.isValidString(string)) {
                                if (C1240o.m3200a()) {
                                    this.f283c.m3211a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                m252a(string, abstractC1207b.m2612k(), strM1369u1, this.f284d, c1088l7);
                                return;
                            }
                            return;
                        }
                        String str2 = string;
                        if (c1253t7M2026e.m3358d() == C1253t7.a.IFRAME) {
                            if (StringUtils.isValidString(str2)) {
                                if (C1240o.m3200a()) {
                                    this.f283c.m3211a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                m252a(str2, abstractC1207b.m2612k(), strM1369u1, this.f284d, c1088l7);
                                return;
                            } else {
                                if (StringUtils.isValidString(strM3356b)) {
                                    String strM251a3 = m251a(strM1369u1, strM3356b);
                                    String str3 = StringUtils.isValidString(strM251a3) ? strM251a3 : strM3356b;
                                    if (C1240o.m3200a()) {
                                        this.f283c.m3211a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                    }
                                    loadDataWithBaseURL(abstractC1207b.m2612k(), str3, "text/html", null, "");
                                    return;
                                }
                                return;
                            }
                        }
                        if (C1240o.m3200a()) {
                            this.f283c.m3214b("AdWebView", "Failed to render VAST companion ad of invalid type");
                            return;
                        }
                        return;
                    }
                    if (C1240o.m3200a()) {
                        this.f283c.m3211a("AdWebView", "No companion ad provided.");
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                throw new RuntimeException("Unable to render AppLovin ad (" + (abstractC1207b != null ? String.valueOf(abstractC1207b.getAdIdNumber()) : "null") + ") - " + th);
            }
        }
        C1240o.m3207h("AdWebView", "Ad can not be loaded in a destroyed webview");
    }

    /* renamed from: a */
    public void m257a(String str) {
        if (((Boolean) this.f284d.m2866a(C1268v4.f2842m6)).booleanValue()) {
            if (this.f287g) {
                AbstractC1089l8.m1421a(this, str, "AdWebView", this.f284d);
                return;
            }
            synchronized (this.f288h) {
                this.f288h.add(str);
            }
            return;
        }
        AbstractC1089l8.m1421a(this, str, "AdWebView", this.f284d);
    }

    /* renamed from: a */
    private void m252a(String str, String str2, String str3, C1220k c1220k, C1088l7 c1088l7) {
        String strM251a = m251a(str3, str);
        if (StringUtils.isValidString(strM251a)) {
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Rendering webview for VAST ad with resourceContents : ", strM251a, this.f283c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strM251a, "text/html", null, "");
            return;
        }
        String strM251a2 = m251a((String) c1220k.m2866a(C1268v4.f2567E4), str);
        if (StringUtils.isValidString(strM251a2)) {
            if (c1088l7.m1353J1() && c1088l7.isOpenMeasurementEnabled()) {
                strM251a2 = c1220k.m2894e0().m784a(strM251a2, AbstractC1013e2.m675a((AppLovinAdImpl) c1088l7));
            }
            if (C1240o.m3200a()) {
                androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Rendering webview for VAST ad with resourceContents : ", strM251a2, this.f283c, "AdWebView");
            }
            loadDataWithBaseURL(str2, strM251a2, "text/html", null, "");
            return;
        }
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Rendering webview for VAST ad with resourceURL : ", str, this.f283c, "AdWebView");
        }
        loadUrl(str);
    }

    /* renamed from: a */
    private String m251a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}

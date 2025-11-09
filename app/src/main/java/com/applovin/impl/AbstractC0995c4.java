package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.applovin.impl.c4 */
/* loaded from: classes.dex */
public abstract class AbstractC0995c4 {

    /* renamed from: a */
    protected final AppLovinAdBase f568a;

    /* renamed from: b */
    protected final C1220k f569b;

    /* renamed from: c */
    protected final C1240o f570c;

    /* renamed from: d */
    protected final String f571d;

    /* renamed from: e */
    protected boolean f572e;

    /* renamed from: f */
    protected AdSession f573f;

    /* renamed from: g */
    protected AdEvents f574g;

    public AbstractC0995c4(AppLovinAdBase appLovinAdBase) {
        this.f568a = appLovinAdBase;
        this.f569b = appLovinAdBase.getSdk();
        this.f570c = appLovinAdBase.getSdk().m2847O();
        String string = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder sbOooOo = OooO0oO.OooOo.OooOo(string, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sbOooOo.append(appLovinAdBase.getDspName());
            string = sbOooOo.toString();
        }
        this.f571d = string;
    }

    /* renamed from: b */
    public /* synthetic */ void m462b(WebView webView) {
        AdSessionContext adSessionContextMo466a;
        if (!this.f568a.isOpenMeasurementEnabled()) {
            if (C1240o.m3200a()) {
                this.f570c.m3215d(this.f571d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f573f != null) {
            if (C1240o.m3200a()) {
                this.f570c.m3218k(this.f571d, "Attempting to start session again for ad: " + this.f568a);
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            this.f570c.m3211a(this.f571d, "Starting session");
        }
        AdSessionConfiguration adSessionConfigurationMo465a = mo465a();
        if (adSessionConfigurationMo465a == null || (adSessionContextMo466a = mo466a(webView)) == null) {
            return;
        }
        try {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationMo465a, adSessionContextMo466a);
            this.f573f = adSessionCreateAdSession;
            try {
                this.f574g = AdEvents.createAdEvents(adSessionCreateAdSession);
                mo468a(this.f573f);
                this.f573f.start();
                this.f572e = true;
                if (C1240o.m3200a()) {
                    this.f570c.m3211a(this.f571d, "Session started");
                }
            } catch (Throwable th) {
                if (C1240o.m3200a()) {
                    this.f570c.m3212a(this.f571d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (C1240o.m3200a()) {
                this.f570c.m3212a(this.f571d, "Failed to create session", th2);
            }
        }
    }

    /* renamed from: d */
    public /* synthetic */ void m464d() {
        this.f574g.loaded();
    }

    /* renamed from: a */
    public abstract AdSessionConfiguration mo465a();

    /* renamed from: a */
    public abstract AdSessionContext mo466a(WebView webView);

    /* renamed from: a */
    public void mo468a(AdSession adSession) {
    }

    /* renamed from: c */
    public void m472c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new OooO(3, this, webView));
    }

    /* renamed from: e */
    public void m473e() {
        m472c(null);
    }

    /* renamed from: f */
    public void m474f() {
        m471b("stop session", new OooOO0O(this, 0));
    }

    /* renamed from: g */
    public void m475g() {
        m471b("track impression event", new OooOO0O(this, 1));
    }

    /* renamed from: h */
    public void mo476h() {
        m471b("track loaded", new OooOO0O(this, 2));
    }

    /* renamed from: c */
    public /* synthetic */ void m463c() {
        this.f574g.impressionOccurred();
    }

    /* renamed from: a */
    public void m467a(View view) {
        m469b(view, Collections.EMPTY_LIST);
    }

    /* renamed from: a */
    public /* synthetic */ void m458a(View view, List list) {
        this.f573f.registerAdView(view);
        this.f573f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1015e4 c1015e4 = (C1015e4) it.next();
            if (c1015e4.m691c() != null) {
                try {
                    this.f573f.addFriendlyObstruction(c1015e4.m691c(), c1015e4.m690b(), c1015e4.m689a());
                } catch (Throwable th) {
                    if (C1240o.m3200a()) {
                        this.f570c.m3212a(this.f571d, "Failed to add friendly obstruction (" + c1015e4 + ")", th);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m459a(String str) {
        this.f573f.error(ErrorType.VIDEO, str);
    }

    /* renamed from: a */
    public /* synthetic */ void m460a(String str, Runnable runnable) {
        try {
            if (this.f572e) {
                if (C1240o.m3200a()) {
                    this.f570c.m3211a(this.f571d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f570c.m3212a(this.f571d, "Failed to run operation: " + str, th);
            }
        }
    }

    /* renamed from: b */
    public void m469b(View view, List list) {
        m471b("update main view: " + view, new androidx.webkit.OooO00o(this, view, list, 2));
    }

    /* renamed from: b */
    public void m470b(String str) {
        m471b("track error", new OooO(4, this, str));
    }

    /* renamed from: b */
    public /* synthetic */ void m461b() {
        this.f572e = false;
        this.f573f.finish();
        this.f573f = null;
        this.f574g = null;
    }

    /* renamed from: b */
    public void m471b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new androidx.webkit.OooO00o(this, str, runnable, 3));
    }
}

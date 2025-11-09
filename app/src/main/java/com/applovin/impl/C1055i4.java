package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.i4 */
/* loaded from: classes.dex */
public class C1055i4 extends AbstractC0995c4 {

    /* renamed from: p */
    static final /* synthetic */ boolean f896p = true;

    /* renamed from: h */
    private final C1088l7 f897h;

    /* renamed from: i */
    private final AtomicBoolean f898i;

    /* renamed from: j */
    private MediaEvents f899j;

    /* renamed from: k */
    private final VastProperties f900k;

    /* renamed from: l */
    private final AtomicBoolean f901l;

    /* renamed from: m */
    private final AtomicBoolean f902m;

    /* renamed from: n */
    private final AtomicBoolean f903n;

    /* renamed from: o */
    private final AtomicBoolean f904o;

    public C1055i4(C1088l7 c1088l7) {
        super(c1088l7);
        this.f898i = new AtomicBoolean();
        this.f901l = new AtomicBoolean();
        this.f902m = new AtomicBoolean();
        this.f903n = new AtomicBoolean();
        this.f904o = new AtomicBoolean();
        this.f897h = c1088l7;
        float fM1373y1 = c1088l7.m1373y1();
        if (c1088l7.m1373y1() == -1) {
            this.f900k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f900k = VastProperties.createVastPropertiesForSkippableMedia(fM1373y1, true, Position.STANDALONE);
        }
    }

    /* renamed from: k */
    public /* synthetic */ void m980k() {
        this.f899j.bufferFinish();
    }

    /* renamed from: l */
    public /* synthetic */ void m981l() {
        this.f899j.bufferStart();
    }

    /* renamed from: m */
    public /* synthetic */ void m982m() {
        this.f899j.adUserInteraction(InteractionType.CLICK);
    }

    /* renamed from: n */
    public /* synthetic */ void m983n() {
        this.f899j.complete();
    }

    /* renamed from: o */
    public /* synthetic */ void m984o() {
        this.f899j.firstQuartile();
    }

    /* renamed from: p */
    public /* synthetic */ void m985p() {
        this.f574g.loaded(this.f900k);
    }

    /* renamed from: q */
    public /* synthetic */ void m986q() {
        this.f899j.midpoint();
    }

    /* renamed from: r */
    public /* synthetic */ void m987r() {
        this.f899j.pause();
    }

    /* renamed from: s */
    public /* synthetic */ void m988s() {
        this.f899j.resume();
    }

    /* renamed from: t */
    public /* synthetic */ void m989t() {
        this.f899j.skipped();
    }

    /* renamed from: u */
    public /* synthetic */ void m990u() {
        this.f899j.thirdQuartile();
    }

    /* renamed from: A */
    public void m991A() {
        m471b("track resumed", new o00oO0o(this, 0));
    }

    /* renamed from: B */
    public void m992B() {
        m471b("track skipped", new o00oO0o(this, 8));
    }

    /* renamed from: C */
    public void m993C() {
        if (this.f904o.compareAndSet(false, true)) {
            m471b("track third quartile", new o00oO0o(this, 1));
        }
    }

    @Override // com.applovin.impl.AbstractC0995c4
    /* renamed from: a */
    public AdSessionContext mo466a(WebView webView) {
        if (!f896p && this.f897h.m1367r1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (C1098m7 c1098m7 : this.f897h.m1367r1().m1908b()) {
            List<C1191s7> listM1508c = c1098m7.m1508c();
            if (listM1508c.isEmpty()) {
                AbstractC1289x7.m3672a(c1098m7.m1507b(), EnumC1173q7.FAILED_TO_LOAD_RESOURCE, this.f569b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (C1191s7 c1191s7 : listM1508c) {
                    if ("omid".equalsIgnoreCase(c1191s7.m2405b())) {
                        arrayList2.add(c1191s7);
                    }
                }
                if (arrayList2.isEmpty()) {
                    AbstractC1289x7.m3672a(c1098m7.m1507b(), EnumC1173q7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f569b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        try {
                            arrayList3.add(new URL(((C1191s7) obj).m2406c()));
                        } catch (Throwable th) {
                            if (C1240o.m3200a()) {
                                this.f570c.m3212a(this.f571d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        AbstractC1289x7.m3672a(c1098m7.m1507b(), EnumC1173q7.FAILED_TO_LOAD_RESOURCE, this.f569b);
                    } else {
                        String strM1510e = c1098m7.m1510e();
                        String strM1509d = c1098m7.m1509d();
                        if (!StringUtils.isValidString(strM1510e) || StringUtils.isValidString(strM1509d)) {
                            int size2 = arrayList3.size();
                            while (i < size2) {
                                Object obj2 = arrayList3.get(i);
                                i++;
                                URL url = (URL) obj2;
                                arrayList.add(StringUtils.isValidString(strM1510e) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strM1509d, url, strM1510e) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            AbstractC1289x7.m3672a(c1098m7.m1507b(), EnumC1173q7.FAILED_TO_LOAD_RESOURCE, this.f569b);
                        }
                    }
                }
            }
        }
        String strM783a = this.f569b.m2894e0().m783a();
        if (TextUtils.isEmpty(strM783a)) {
            if (C1240o.m3200a()) {
                this.f570c.m3214b(this.f571d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f569b.m2894e0().m785b(), strM783a, arrayList, this.f897h.getOpenMeasurementContentUrl(), this.f897h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.f570c.m3212a(this.f571d, "Failed to create ad session context", th2);
            return null;
        }
    }

    /* renamed from: b */
    public void m994b(final float f, final boolean z) {
        if (this.f901l.compareAndSet(false, true)) {
            m471b("track started", new Runnable() { // from class: com.applovin.impl.o0ooOOo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15801OooOo0O.m978a(f, z);
                }
            });
        }
    }

    @Override // com.applovin.impl.AbstractC0995c4
    /* renamed from: h */
    public void mo476h() {
        m471b("track loaded", new o00oO0o(this, 10));
    }

    /* renamed from: i */
    public void m996i() {
        if (this.f898i.compareAndSet(true, false)) {
            m471b("buffer finished", new o00oO0o(this, 7));
        }
    }

    /* renamed from: j */
    public void m997j() {
        if (this.f898i.compareAndSet(false, true)) {
            m471b("buffer started", new o00oO0o(this, 5));
        }
    }

    /* renamed from: v */
    public void m998v() {
        m471b("track clicked", new o00oO0o(this, 6));
    }

    /* renamed from: w */
    public void m999w() {
        m471b("track completed", new o00oO0o(this, 9));
    }

    /* renamed from: x */
    public void m1000x() {
        if (this.f902m.compareAndSet(false, true)) {
            m471b("track first quartile", new o00oO0o(this, 4));
        }
    }

    /* renamed from: y */
    public void m1001y() {
        if (this.f903n.compareAndSet(false, true)) {
            m471b("track midpoint", new o00oO0o(this, 2));
        }
    }

    /* renamed from: z */
    public void m1002z() {
        m471b("track paused", new o00oO0o(this, 3));
    }

    /* renamed from: b */
    public void m995b(boolean z) {
        m471b("track volume changed", new o0OOO0o(this, z, 0));
    }

    @Override // com.applovin.impl.AbstractC0995c4
    /* renamed from: a */
    public AdSessionConfiguration mo465a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.f570c.m3212a(this.f571d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.AbstractC0995c4
    /* renamed from: a */
    public void mo468a(AdSession adSession) {
        try {
            this.f899j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f570c.m3212a(this.f571d, "Failed to create media events", th);
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m978a(float f, boolean z) {
        this.f899j.start(f, z ? 0.0f : 1.0f);
    }

    /* renamed from: a */
    public /* synthetic */ void m979a(boolean z) {
        this.f899j.volumeChange(z ? 0.0f : 1.0f);
    }
}

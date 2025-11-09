package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.internal.C2539a;
import com.iab.omid.library.ironsrc.internal.C2541c;
import com.iab.omid.library.ironsrc.internal.C2543e;
import com.iab.omid.library.ironsrc.internal.C2544f;
import com.iab.omid.library.ironsrc.internal.C2547i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C2554a;
import com.iab.omid.library.ironsrc.publisher.C2555b;
import com.iab.omid.library.ironsrc.utils.C2562g;
import com.iab.omid.library.ironsrc.weakreference.C2577a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.adsession.a */
/* loaded from: classes2.dex */
public class C2531a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f3581a;

    /* renamed from: b */
    private final AdSessionConfiguration f3582b;

    /* renamed from: c */
    private final C2544f f3583c;

    /* renamed from: d */
    private C2577a f3584d;

    /* renamed from: e */
    private AdSessionStatePublisher f3585e;

    /* renamed from: f */
    private boolean f3586f;

    /* renamed from: g */
    private boolean f3587g;

    /* renamed from: h */
    private final String f3588h;

    /* renamed from: i */
    private boolean f3589i;

    /* renamed from: j */
    private boolean f3590j;

    /* renamed from: k */
    private PossibleObstructionListener f3591k;

    public C2531a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m4235a() {
        if (this.f3589i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m4237b() {
        if (this.f3590j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f3587g) {
            return;
        }
        this.f3583c.m4305a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m4241c() {
        return this.f3584d.get();
    }

    /* renamed from: d */
    public List<C2543e> m4242d() {
        return this.f3583c.m4304a();
    }

    /* renamed from: e */
    public boolean m4243e() {
        return this.f3591k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f3587g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C2562g.m4415a(errorType, "Error type is null");
        C2562g.m4417a(str, "Message is null");
        getAdSessionStatePublisher().m4354a(errorType, str);
    }

    /* renamed from: f */
    public boolean m4244f() {
        return this.f3586f && !this.f3587g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f3587g) {
            return;
        }
        this.f3584d.clear();
        removeAllFriendlyObstructions();
        this.f3587g = true;
        getAdSessionStatePublisher().m4370f();
        C2541c.m4282c().m4286b(this);
        getAdSessionStatePublisher().mo4364b();
        this.f3585e = null;
        this.f3591k = null;
    }

    /* renamed from: g */
    public boolean m4245g() {
        return this.f3587g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f3588h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f3585e;
    }

    /* renamed from: h */
    public boolean m4246h() {
        return this.f3582b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m4247i() {
        return this.f3582b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m4248j() {
        return this.f3586f;
    }

    /* renamed from: k */
    public void m4249k() {
        m4235a();
        getAdSessionStatePublisher().m4371g();
        this.f3589i = true;
    }

    /* renamed from: l */
    public void m4250l() {
        m4237b();
        getAdSessionStatePublisher().m4372h();
        this.f3590j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f3587g || m4241c() == view) {
            return;
        }
        m4238b(view);
        getAdSessionStatePublisher().m4349a();
        m4236a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f3587g) {
            return;
        }
        this.f3583c.m4306b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f3587g) {
            return;
        }
        this.f3583c.m4307c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f3591k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f3586f || this.f3585e == null) {
            return;
        }
        this.f3586f = true;
        C2541c.m4282c().m4287c(this);
        this.f3585e.m4350a(C2547i.m4330c().m4332b());
        this.f3585e.m4361a(C2539a.m4273a().m4277b());
        this.f3585e.mo4355a(this, this.f3581a);
    }

    public C2531a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f3583c = new C2544f();
        this.f3586f = false;
        this.f3587g = false;
        this.f3582b = adSessionConfiguration;
        this.f3581a = adSessionContext;
        this.f3588h = str;
        m4238b(null);
        this.f3585e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C2554a(str, adSessionContext.getWebView()) : new C2555b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f3585e.mo4373i();
        C2541c.m4282c().m4284a(this);
        this.f3585e.m4353a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m4236a(@Nullable View view) {
        Collection<C2531a> collectionM4285b = C2541c.m4282c().m4285b();
        if (collectionM4285b == null || collectionM4285b.isEmpty()) {
            return;
        }
        for (C2531a c2531a : collectionM4285b) {
            if (c2531a != this && c2531a.m4241c() == view) {
                c2531a.f3584d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m4238b(@Nullable View view) {
        this.f3584d = new C2577a(view);
    }

    /* renamed from: a */
    public void m4239a(List<C2577a> list) {
        if (m4243e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C2577a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f3591k.onPossibleObstructionsDetected(this.f3588h, arrayList);
        }
    }

    /* renamed from: a */
    public void m4240a(@NonNull JSONObject jSONObject) {
        m4237b();
        getAdSessionStatePublisher().m4362a(jSONObject);
        this.f3590j = true;
    }
}

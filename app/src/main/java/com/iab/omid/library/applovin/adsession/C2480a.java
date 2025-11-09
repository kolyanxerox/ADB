package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.C2488a;
import com.iab.omid.library.applovin.internal.C2490c;
import com.iab.omid.library.applovin.internal.C2492e;
import com.iab.omid.library.applovin.internal.C2493f;
import com.iab.omid.library.applovin.internal.C2496i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.C2503a;
import com.iab.omid.library.applovin.publisher.C2504b;
import com.iab.omid.library.applovin.utils.C2511g;
import com.iab.omid.library.applovin.weakreference.C2526a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.adsession.a */
/* loaded from: classes2.dex */
public class C2480a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f3446a;

    /* renamed from: b */
    private final AdSessionConfiguration f3447b;

    /* renamed from: c */
    private final C2493f f3448c;

    /* renamed from: d */
    private C2526a f3449d;

    /* renamed from: e */
    private AdSessionStatePublisher f3450e;

    /* renamed from: f */
    private boolean f3451f;

    /* renamed from: g */
    private boolean f3452g;

    /* renamed from: h */
    private final String f3453h;

    /* renamed from: i */
    private boolean f3454i;

    /* renamed from: j */
    private boolean f3455j;

    /* renamed from: k */
    private PossibleObstructionListener f3456k;

    public C2480a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m3980a() {
        if (this.f3454i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m3982b() {
        if (this.f3455j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f3452g) {
            return;
        }
        this.f3448c.m4052a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public String m3986c() {
        return this.f3453h;
    }

    /* renamed from: d */
    public AdSessionStatePublisher m3987d() {
        return this.f3450e;
    }

    /* renamed from: e */
    public View m3988e() {
        return this.f3449d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f3452g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C2511g.m4162a(errorType, "Error type is null");
        C2511g.m4164a(str, "Message is null");
        m3987d().m4101a(errorType, str);
    }

    /* renamed from: f */
    public List<C2492e> m3989f() {
        return this.f3448c.m4051a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f3452g) {
            return;
        }
        this.f3449d.clear();
        removeAllFriendlyObstructions();
        this.f3452g = true;
        m3987d().m4117f();
        C2490c.m4029c().m4033b(this);
        m3987d().mo4111b();
        this.f3450e = null;
        this.f3456k = null;
    }

    /* renamed from: g */
    public boolean m3990g() {
        return this.f3456k != null;
    }

    /* renamed from: h */
    public boolean m3991h() {
        return this.f3451f && !this.f3452g;
    }

    /* renamed from: i */
    public boolean m3992i() {
        return this.f3452g;
    }

    /* renamed from: j */
    public boolean m3993j() {
        return this.f3447b.isNativeImpressionOwner();
    }

    /* renamed from: k */
    public boolean m3994k() {
        return this.f3447b.isNativeMediaEventsOwner();
    }

    /* renamed from: l */
    public boolean m3995l() {
        return this.f3451f;
    }

    /* renamed from: m */
    public void m3996m() {
        m3980a();
        m3987d().m4118g();
        this.f3454i = true;
    }

    /* renamed from: n */
    public void m3997n() {
        m3982b();
        m3987d().m4119h();
        this.f3455j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f3452g || m3988e() == view) {
            return;
        }
        m3983b(view);
        m3987d().m4096a();
        m3981a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f3452g) {
            return;
        }
        this.f3448c.m4053b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f3452g) {
            return;
        }
        this.f3448c.m4054c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f3456k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f3451f || this.f3450e == null) {
            return;
        }
        this.f3451f = true;
        C2490c.m4029c().m4034c(this);
        this.f3450e.m4097a(C2496i.m4077c().m4079b());
        this.f3450e.m4108a(C2488a.m4020a().m4024b());
        this.f3450e.mo4102a(this, this.f3446a);
    }

    public C2480a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f3448c = new C2493f();
        this.f3451f = false;
        this.f3452g = false;
        this.f3447b = adSessionConfiguration;
        this.f3446a = adSessionContext;
        this.f3453h = str;
        m3983b(null);
        this.f3450e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C2503a(str, adSessionContext.getWebView()) : new C2504b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f3450e.mo4120i();
        C2490c.m4029c().m4031a(this);
        this.f3450e.m4100a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m3981a(@Nullable View view) {
        Collection<C2480a> collectionM4032b = C2490c.m4029c().m4032b();
        if (collectionM4032b == null || collectionM4032b.isEmpty()) {
            return;
        }
        for (C2480a c2480a : collectionM4032b) {
            if (c2480a != this && c2480a.m3988e() == view) {
                c2480a.f3449d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m3983b(@Nullable View view) {
        this.f3449d = new C2526a(view);
    }

    /* renamed from: a */
    public void m3984a(List<C2526a> list) {
        if (m3990g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C2526a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f3456k.onPossibleObstructionsDetected(this.f3453h, arrayList);
        }
    }

    /* renamed from: a */
    public void m3985a(@NonNull JSONObject jSONObject) {
        m3982b();
        m3987d().m4109a(jSONObject);
        this.f3455j = true;
    }
}

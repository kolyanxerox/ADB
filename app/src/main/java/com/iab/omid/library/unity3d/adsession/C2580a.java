package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.internal.C2588a;
import com.iab.omid.library.unity3d.internal.C2590c;
import com.iab.omid.library.unity3d.internal.C2592e;
import com.iab.omid.library.unity3d.internal.C2595h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.C2601a;
import com.iab.omid.library.unity3d.publisher.C2602b;
import com.iab.omid.library.unity3d.utils.C2609g;
import com.iab.omid.library.unity3d.weakreference.C2623a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.adsession.a */
/* loaded from: classes2.dex */
public class C2580a extends AdSession {

    /* renamed from: l */
    private static final Pattern f3716l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f3717a;

    /* renamed from: b */
    private final AdSessionConfiguration f3718b;

    /* renamed from: d */
    private C2623a f3720d;

    /* renamed from: e */
    private AdSessionStatePublisher f3721e;

    /* renamed from: h */
    private final String f3724h;

    /* renamed from: i */
    private boolean f3725i;

    /* renamed from: j */
    private boolean f3726j;

    /* renamed from: k */
    private PossibleObstructionListener f3727k;

    /* renamed from: c */
    private final List<C2592e> f3719c = new ArrayList();

    /* renamed from: f */
    private boolean f3722f = false;

    /* renamed from: g */
    private boolean f3723g = false;

    public C2580a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f3718b = adSessionConfiguration;
        this.f3717a = adSessionContext;
        String string = UUID.randomUUID().toString();
        this.f3724h = string;
        m4494d(null);
        this.f3721e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C2601a(string, adSessionContext.getWebView()) : new C2602b(string, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f3721e.mo4614i();
        C2590c.m4538c().m4540a(this);
        this.f3721e.m4595a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m4488a() {
        if (this.f3725i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private C2592e m4491b(View view) {
        for (C2592e c2592e : this.f3719c) {
            if (c2592e.m4555c().get() == view) {
                return c2592e;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f3723g) {
            return;
        }
        m4489a(view);
        m4490a(str);
        if (m4491b(view) == null) {
            this.f3719c.add(new C2592e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: c */
    public View m4497c() {
        return this.f3720d.get();
    }

    /* renamed from: d */
    public List<C2592e> m4498d() {
        return this.f3719c;
    }

    /* renamed from: e */
    public boolean m4499e() {
        return this.f3727k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f3723g) {
            throw new IllegalStateException("AdSession is finished");
        }
        C2609g.m4654a(errorType, "Error type is null");
        C2609g.m4656a(str, "Message is null");
        getAdSessionStatePublisher().m4596a(errorType, str);
    }

    /* renamed from: f */
    public boolean m4500f() {
        return this.f3722f && !this.f3723g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f3723g) {
            return;
        }
        this.f3720d.clear();
        removeAllFriendlyObstructions();
        this.f3723g = true;
        getAdSessionStatePublisher().m4611f();
        C2590c.m4538c().m4542b(this);
        getAdSessionStatePublisher().mo4606b();
        this.f3721e = null;
        this.f3727k = null;
    }

    /* renamed from: g */
    public boolean m4501g() {
        return this.f3723g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f3724h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f3721e;
    }

    /* renamed from: h */
    public boolean m4502h() {
        return this.f3718b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m4503i() {
        return this.f3718b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m4504j() {
        return this.f3722f;
    }

    /* renamed from: k */
    public void m4505k() {
        m4488a();
        getAdSessionStatePublisher().m4612g();
        this.f3725i = true;
    }

    /* renamed from: l */
    public void m4506l() {
        m4492b();
        getAdSessionStatePublisher().m4613h();
        this.f3726j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f3723g) {
            return;
        }
        C2609g.m4654a(view, "AdView is null");
        if (m4497c() == view) {
            return;
        }
        m4494d(view);
        getAdSessionStatePublisher().m4591a();
        m4493c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f3723g) {
            return;
        }
        this.f3719c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f3723g) {
            return;
        }
        m4489a(view);
        C2592e c2592eM4491b = m4491b(view);
        if (c2592eM4491b != null) {
            this.f3719c.remove(c2592eM4491b);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f3727k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f3722f) {
            return;
        }
        this.f3722f = true;
        C2590c.m4538c().m4543c(this);
        this.f3721e.m4592a(C2595h.m4578c().m4580b());
        this.f3721e.m4603a(C2588a.m4529a().m4533b());
        this.f3721e.mo4597a(this, this.f3717a);
    }

    /* renamed from: a */
    private static void m4489a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    private void m4492b() {
        if (this.f3726j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: c */
    private void m4493c(View view) {
        Collection<C2580a> collectionM4541b = C2590c.m4538c().m4541b();
        if (collectionM4541b == null || collectionM4541b.isEmpty()) {
            return;
        }
        for (C2580a c2580a : collectionM4541b) {
            if (c2580a != this && c2580a.m4497c() == view) {
                c2580a.f3720d.clear();
            }
        }
    }

    /* renamed from: d */
    private void m4494d(View view) {
        this.f3720d = new C2623a(view);
    }

    /* renamed from: a */
    private void m4490a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f3716l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* renamed from: a */
    public void m4495a(List<C2623a> list) {
        if (m4499e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<C2623a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f3727k.onPossibleObstructionsDetected(this.f3724h, arrayList);
        }
    }

    /* renamed from: a */
    public void m4496a(@NonNull JSONObject jSONObject) {
        m4492b();
        getAdSessionStatePublisher().m4604a(jSONObject);
        this.f3726j = true;
    }
}

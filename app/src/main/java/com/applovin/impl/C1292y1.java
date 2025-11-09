package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.C0954a1;
import com.applovin.impl.C1088l7;
import com.applovin.impl.adview.C0972g;
import com.applovin.impl.adview.C0976k;
import com.applovin.impl.adview.C0977l;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.y1 */
/* loaded from: classes.dex */
public class C1292y1 extends C1301z1 {

    /* renamed from: p0 */
    private final C1088l7 f3124p0;

    /* renamed from: q0 */
    private final Set f3125q0;

    /* renamed from: com.applovin.impl.y1$a */
    public class a implements C0954a1.b {
        public a() {
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: a */
        public void mo83a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(C1292y1.this.f3193g0 - (C1292y1.this.f3176P.getDuration() - C1292y1.this.f3176P.getCurrentPosition()));
            int iM3840B = C1292y1.this.m3840B();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(C1292y1.this.f3125q0).iterator();
            while (it.hasNext()) {
                C1271v7 c1271v7 = (C1271v7) it.next();
                if (c1271v7.m3576a(seconds, iM3840B)) {
                    hashSet.add(c1271v7);
                    C1292y1.this.f3125q0.remove(c1271v7);
                }
            }
            C1292y1.this.m3720a(hashSet);
            if (iM3840B >= 25 && iM3840B < 50) {
                C1292y1.this.f3124p0.getAdEventTracker().m1000x();
                return;
            }
            if (iM3840B >= 50 && iM3840B < 75) {
                C1292y1.this.f3124p0.getAdEventTracker().m1001y();
            } else if (iM3840B >= 75) {
                C1292y1.this.f3124p0.getAdEventTracker().m993C();
            }
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: b */
        public boolean mo84b() {
            return !C1292y1.this.f3196j0;
        }
    }

    public C1292y1(AbstractC1207b abstractC1207b, final Activity activity, Map map, final C1220k c1220k, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC1207b, activity, map, c1220k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f3125q0 = hashSet;
        C1088l7 c1088l7 = (C1088l7) abstractC1207b;
        this.f3124p0 = c1088l7;
        if (c1088l7.m1347D1()) {
            ImageView imageViewM2346a = C1182r7.m2346a(c1088l7.m1372x1().m2352e(), activity, c1220k);
            this.f3184X = imageViewM2346a;
            imageViewM2346a.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.o000OO0O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15764OooOo0O.m3714a(activity, c1220k, view);
                }
            });
        }
        C1088l7.d dVar = C1088l7.d.VIDEO;
        hashSet.addAll(c1088l7.m1362a(dVar, AbstractC1280w7.f3013a));
        m3715a(C1088l7.d.IMPRESSION);
        m3717a(dVar, "creativeView");
        c1088l7.getAdEventTracker().m475g();
    }

    /* renamed from: U */
    private boolean m3711U() {
        return this.f3184X != null && this.f3124p0.m1347D1();
    }

    /* renamed from: V */
    private void m3712V() {
        if (!m3842F() || this.f3125q0.isEmpty()) {
            return;
        }
        if (C1240o.m3200a()) {
            this.f2485c.m3218k("AppLovinFullscreenActivity", "Firing " + this.f3125q0.size() + " un-fired video progress trackers when video was completed.");
        }
        m3720a(this.f3125q0);
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: C */
    public void mo3723C() {
        m3717a(C1088l7.d.VIDEO, "skip");
        this.f3124p0.getAdEventTracker().m992B();
        super.mo3723C();
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: D */
    public void mo3724D() {
        super.mo3724D();
        C1088l7 c1088l7 = this.f3124p0;
        if (c1088l7 != null) {
            c1088l7.getAdEventTracker().m996i();
        }
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: N */
    public void mo3725N() {
        long jM2569Z;
        int iM2632s;
        long millis = 0;
        if (this.f3124p0.m2567Y() >= 0 || this.f3124p0.m2569Z() >= 0) {
            if (this.f3124p0.m2567Y() >= 0) {
                jM2569Z = this.f3124p0.m2567Y();
            } else {
                C1088l7 c1088l7 = this.f3124p0;
                C1298y7 c1298y7M1345B1 = c1088l7.m1345B1();
                if (c1298y7M1345B1 == null || c1298y7M1345B1.m3812d() <= 0) {
                    long j = this.f3193g0;
                    if (j > 0) {
                        millis = j;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(c1298y7M1345B1.m3812d());
                }
                if (c1088l7.m2611j1() && (iM2632s = (int) c1088l7.m2632s()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iM2632s);
                }
                jM2569Z = (long) ((this.f3124p0.m2569Z() / 100.0d) * millis);
            }
            m3469c(jM2569Z);
        }
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: Q */
    public void mo3726Q() {
        super.mo3726Q();
        C1088l7 c1088l7 = this.f3124p0;
        if (c1088l7 != null) {
            c1088l7.getAdEventTracker().m997j();
        }
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: R */
    public void mo3727R() {
        m3712V();
        if (!AbstractC1289x7.m3674a(this.f3124p0)) {
            if (C1240o.m3200a()) {
                this.f2485c.m3211a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo3462a("no_valid_companion_ad");
        } else {
            if (this.f3196j0) {
                return;
            }
            m3717a(C1088l7.d.COMPANION, "creativeView");
            this.f3124p0.getAdEventTracker().m999w();
            super.mo3727R();
        }
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: T */
    public void mo3728T() {
        super.mo3728T();
        m3717a(C1088l7.d.VIDEO, this.f3192f0 ? "mute" : "unmute");
        this.f3124p0.getAdEventTracker().m995b(this.f3192f0);
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: d */
    public void mo3730d(long j) {
        super.mo3730d(j);
        this.f3124p0.getAdEventTracker().m994b(TimeUnit.MILLISECONDS.toSeconds(j), AbstractC1078k7.m1239e(this.f2484b));
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: g */
    public void mo3731g(String str) {
        m3716a(C1088l7.d.ERROR, EnumC1173q7.MEDIA_FILE_ERROR);
        this.f3124p0.getAdEventTracker().m470b(str);
        super.mo3731g(str);
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: r */
    public void mo3486r() {
        super.mo3486r();
        m3717a(this.f3196j0 ? C1088l7.d.COMPANION : C1088l7.d.VIDEO, "pause");
        this.f3124p0.getAdEventTracker().m1002z();
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: s */
    public void mo3487s() {
        super.mo3487s();
        m3717a(this.f3196j0 ? C1088l7.d.COMPANION : C1088l7.d.VIDEO, "resume");
        this.f3124p0.getAdEventTracker().m991A();
    }

    @Override // com.applovin.impl.C1301z1, com.applovin.impl.AbstractC1265v1
    /* renamed from: u */
    public void mo3489u() {
        this.f3189c0.m82c();
        super.mo3489u();
    }

    @Override // com.applovin.impl.C1301z1, com.applovin.impl.AbstractC1265v1
    /* renamed from: v */
    public void mo3490v() {
        mo3458a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m3714a(Activity activity, C1220k c1220k, View view) {
        Uri uriM2350c = this.f3124p0.m1372x1().m2350c();
        if (uriM2350c != null) {
            if (C1240o.m3200a()) {
                this.f2485c.m3211a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriM2350c);
            }
            m3715a(C1088l7.d.INDUSTRY_ICON_CLICK);
            AbstractC1048h7.m948a(uriM2350c, activity, c1220k);
        }
    }

    @Override // com.applovin.impl.C1301z1, com.applovin.impl.AbstractC1265v1
    /* renamed from: a */
    public void mo3462a(String str) {
        if (this.f3124p0 != null) {
            m3717a(C1088l7.d.VIDEO, "close");
            m3717a(C1088l7.d.COMPANION, "close");
        }
        super.mo3462a(str);
    }

    @Override // com.applovin.impl.C1301z1, com.applovin.impl.AbstractC1265v1
    /* renamed from: a */
    public void mo3458a(ViewGroup viewGroup) {
        super.mo3458a(viewGroup);
        if (m3711U()) {
            m3715a(C1088l7.d.INDUSTRY_ICON_IMPRESSION);
            this.f3184X.setVisibility(0);
        }
        this.f3189c0.m80a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        C0952a c0952a = this.f3177Q;
        if (c0952a != null) {
            arrayList.add(new C1015e4(c0952a, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        C0972g c0972g = this.f3178R;
        if (c0972g != null) {
            arrayList.add(new C1015e4(c0972g, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        C1051i0 c1051i0 = this.f3179S;
        if (c1051i0 != null) {
            arrayList.add(new C1015e4(c1051i0, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.f3182V;
        if (progressBar != null) {
            arrayList.add(new C1015e4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.f3183W;
        if (progressBar2 != null) {
            arrayList.add(new C1015e4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.f3180T;
        if (imageView != null) {
            arrayList.add(new C1015e4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        C0977l c0977l = this.f3181U;
        if (c0977l != null) {
            arrayList.add(new C1015e4(c0977l, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        C0976k c0976k = this.f2492j;
        if (c0976k != null && c0976k.m295a()) {
            C0976k c0976k2 = this.f2492j;
            arrayList.add(new C1015e4(c0976k2, FriendlyObstructionPurpose.NOT_VISIBLE, c0976k2.getIdentifier()));
        }
        this.f3124p0.getAdEventTracker().m469b(this.f3176P, arrayList);
    }

    @Override // com.applovin.impl.C1301z1
    /* renamed from: a */
    public void mo3729a(MotionEvent motionEvent, Bundle bundle) {
        m3715a(C1088l7.d.VIDEO_CLICK);
        this.f3124p0.getAdEventTracker().m998v();
        super.mo3729a(motionEvent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3720a(Set set) {
        m3721a(set, EnumC1173q7.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m3715a(C1088l7.d dVar) {
        m3716a(dVar, EnumC1173q7.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m3717a(C1088l7.d dVar, String str) {
        m3718a(dVar, str, EnumC1173q7.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m3716a(C1088l7.d dVar, EnumC1173q7 enumC1173q7) {
        m3718a(dVar, "", enumC1173q7);
    }

    /* renamed from: a */
    private void m3718a(C1088l7.d dVar, String str, EnumC1173q7 enumC1173q7) {
        m3721a(this.f3124p0.m1361a(dVar, str), enumC1173q7);
    }

    /* renamed from: a */
    private void m3721a(Set set, EnumC1173q7 enumC1173q7) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f3176P.getCurrentPosition());
        C1307z7 c1307z7M1346C1 = this.f3124p0.m1346C1();
        Uri uriM3898d = c1307z7M1346C1 != null ? c1307z7M1346C1.m3898d() : null;
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        AbstractC1289x7.m3671a(set, seconds, uriM3898d, enumC1173q7, this.f2484b);
    }
}

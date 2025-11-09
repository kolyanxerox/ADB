package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractViewOnClickListenerC1152p2;
import com.applovin.impl.privacy.cmp.C1164a;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1212c;
import com.applovin.impl.sdk.C1213d;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class o0O0O00 implements AbstractC1000d.b, AbstractViewOnClickListenerC1152p2.a, UserMessagingPlatform.OnConsentFormLoadSuccessListener, C1213d.a, C1212c.c {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15785OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Object f15786OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15787OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15788OooOoO0;

    public /* synthetic */ o0O0O00(AbstractActivityC1080l abstractActivityC1080l, C1220k c1220k, C1130n c1130n, C1140o c1140o) {
        this.f15788OooOoO0 = abstractActivityC1080l;
        this.f15786OooOo0O = c1220k;
        this.f15787OooOo0o = c1130n;
        this.f15785OooOo = c1140o;
    }

    @Override // com.applovin.impl.AbstractC1000d.b
    /* renamed from: a */
    public void mo327a(Activity activity) {
        AbstractActivityC1080l.m1271a((C1143o2) this.f15788OooOoO0, (C1130n) this.f15787OooOo0o, (C1140o) this.f15785OooOo, (C1220k) this.f15786OooOo0O, (MaxDebuggerAdUnitDetailActivity) activity);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        ((C1164a) this.f15788OooOoO0).m2103a((C1164a.a) this.f15787OooOo0o, (FormError) this.f15785OooOo, (C1071k0) this.f15786OooOo0O, consentForm);
    }

    public /* synthetic */ o0O0O00(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f15788OooOoO0 = obj;
        this.f15787OooOo0o = obj2;
        this.f15785OooOo = obj3;
        this.f15786OooOo0O = obj4;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1152p2.a
    /* renamed from: a */
    public void mo2a(C1053i2 c1053i2, C1143o2 c1143o2) {
        ((AbstractActivityC1080l) this.f15788OooOoO0).m1272a((C1220k) this.f15786OooOo0O, (C1130n) this.f15787OooOo0o, (C1140o) this.f15785OooOo, c1053i2, c1143o2);
    }

    @Override // com.applovin.impl.sdk.C1213d.a
    /* renamed from: a */
    public void mo1974a(AbstractC1207b abstractC1207b) {
        ((AppLovinAdServiceImpl) this.f15788OooOoO0).m2431a((AppLovinAdLoadListener) this.f15787OooOo0o, (JSONObject) this.f15785OooOo, (C1254u) this.f15786OooOo0O, abstractC1207b);
    }

    @Override // com.applovin.impl.sdk.C1212c.c
    /* renamed from: a */
    public void mo1975a(AbstractC1207b abstractC1207b, String str) {
        ((C1213d) this.f15788OooOoO0).m2685a((C1213d.a) this.f15787OooOo0o, (C1212c.a) this.f15785OooOo, (C1254u) this.f15786OooOo0O, abstractC1207b, str);
    }
}

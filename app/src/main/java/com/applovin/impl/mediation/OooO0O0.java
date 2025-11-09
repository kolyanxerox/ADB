package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.C0986b5;
import com.applovin.impl.C1170q4;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.ironsource.InterfaceC3033d8;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSourceBannerLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15626OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15627OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15628OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f15629OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15630OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f15631OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f15632OooOoo0;

    public /* synthetic */ OooO0O0(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        this.f15627OooOo0O = 1;
        this.f15626OooOo = maxFullscreenAdImpl;
        this.f15630OooOoO0 = str;
        this.f15629OooOoO = str2;
        this.f15628OooOo0o = activity;
        this.f15631OooOoOO = viewGroup;
        this.f15632OooOoo0 = lifecycle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15627OooOo0O) {
            case 0:
                ((MediationServiceImpl) this.f15626OooOo).m1533a((C1170q4) this.f15630OooOoO0, (C1129h) this.f15629OooOoO, (MaxAdapterParametersImpl) this.f15631OooOoOO, (C0986b5) this.f15632OooOoo0, (Activity) this.f15628OooOo0o);
                break;
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f15631OooOoOO;
                Lifecycle lifecycle = (Lifecycle) this.f15632OooOoo0;
                ((MaxFullscreenAdImpl) this.f15626OooOo).m1623a((String) this.f15630OooOoO0, (String) this.f15629OooOoO, (Activity) this.f15628OooOo0o, viewGroup, lifecycle);
                break;
            case 2:
                AbstractC1118a.m1672a((String) this.f15626OooOo, (String) this.f15630OooOoO0, (MaxAdFormat) this.f15629OooOoO, (String) this.f15631OooOoOO, (C1220k) this.f15632OooOoo0, (String) this.f15628OooOo0o);
                break;
            case 3:
                C1170q4 c1170q4 = (C1170q4) this.f15630OooOoO0;
                ((C1129h) this.f15629OooOoO).m1796a((MaxSignalProvider) this.f15626OooOo, (MaxAdapterSignalCollectionParameters) this.f15631OooOoOO, (Activity) this.f15628OooOo0o, (C0986b5) this.f15632OooOoo0, c1170q4);
                break;
            default:
                C3395l.m10361a((IronSourceBannerLayout) this.f15626OooOo, (View) this.f15630OooOoO0, (ISBannerSize) this.f15629OooOoO, (Context) this.f15631OooOoOO, (FrameLayout.LayoutParams) this.f15632OooOoo0, (InterfaceC3033d8) this.f15628OooOo0o);
                break;
        }
    }

    public /* synthetic */ OooO0O0(C1129h c1129h, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, C0986b5 c0986b5, C1170q4 c1170q4) {
        this.f15627OooOo0O = 3;
        this.f15629OooOoO = c1129h;
        this.f15626OooOo = maxSignalProvider;
        this.f15631OooOoOO = maxAdapterSignalCollectionParameters;
        this.f15628OooOo0o = activity;
        this.f15632OooOoo0 = c0986b5;
        this.f15630OooOoO0 = c1170q4;
    }

    public /* synthetic */ OooO0O0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f15627OooOo0O = i;
        this.f15626OooOo = obj;
        this.f15630OooOoO0 = obj2;
        this.f15629OooOoO = obj3;
        this.f15631OooOoOO = obj4;
        this.f15632OooOoo0 = obj5;
        this.f15628OooOo0o = obj6;
    }
}

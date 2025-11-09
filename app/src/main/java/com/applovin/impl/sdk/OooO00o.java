package com.applovin.impl.sdk;

import android.view.InputEvent;
import com.applovin.impl.sdk.C1212c;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15816OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15817OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15818OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15819OooOoO0;

    public /* synthetic */ OooO00o(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f15817OooOo0O = 1;
        this.f15818OooOo0o = appLovinAdServiceImpl;
        this.f15819OooOoO0 = appLovinError;
        this.f15816OooOo = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15817OooOo0O) {
            case 0:
                ((AppLovinAdServiceImpl) this.f15818OooOo0o).m2430a((AppLovinAdLoadListener) this.f15816OooOo, (AppLovinAd) this.f15819OooOoO0);
                break;
            case 1:
                ((AppLovinAdServiceImpl) this.f15818OooOo0o).m2423a((AppLovinError) this.f15819OooOoO0, (AppLovinAdLoadListener) this.f15816OooOo);
                break;
            case 2:
                ((C1212c) this.f15818OooOo0o).m2662a((AbstractC1207b) this.f15816OooOo, (C1212c.b) this.f15819OooOoO0);
                break;
            case 3:
                ((C1223n) this.f15818OooOo0o).m3040a((Long) this.f15816OooOo, this.f15819OooOoO0);
                break;
            default:
                ((C1243r) this.f15818OooOo0o).m3241a((List) this.f15816OooOo, (InputEvent) this.f15819OooOoO0);
                break;
        }
    }

    public /* synthetic */ OooO00o(Object obj, Object obj2, Object obj3, int i) {
        this.f15817OooOo0O = i;
        this.f15818OooOo0o = obj;
        this.f15816OooOo = obj2;
        this.f15819OooOoO0 = obj3;
    }
}

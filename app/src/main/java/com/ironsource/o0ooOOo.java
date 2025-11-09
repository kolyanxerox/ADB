package com.ironsource;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LevelPlayBannerAdView f28583OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28584OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TestSuiteActivity f28585OooOo0o;

    public /* synthetic */ o0ooOOo(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView, int i) {
        this.f28584OooOo0O = i;
        this.f28585OooOo0o = testSuiteActivity;
        this.f28583OooOo = levelPlayBannerAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28584OooOo0O) {
            case 0:
                C3433mv.m10891b(this.f28585OooOo0o, this.f28583OooOo);
                break;
            default:
                C3433mv.m10890a(this.f28585OooOo0o, this.f28583OooOo);
                break;
        }
    }
}

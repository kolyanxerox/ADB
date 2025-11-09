package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.C3423ml;
import com.ironsource.sdk.controller.C3657v;
import com.unity3d.mediation.LevelPlayAdInfo;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class o0OoOo0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15796OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15797OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15798OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15799OooOoO0;

    public /* synthetic */ o0OoOo0(Object obj, boolean z, Object obj2, int i) {
        this.f15797OooOo0O = i;
        this.f15796OooOo = obj;
        this.f15798OooOo0o = z;
        this.f15799OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15797OooOo0O) {
            case 0:
                ((C1031g0) this.f15796OooOo).m770a(this.f15798OooOo0o, (Runnable) this.f15799OooOoO0);
                break;
            case 1:
                AbstractC1168q2.m2198a(this.f15798OooOo0o, (MaxAdRequestListener) this.f15796OooOo, (String) this.f15799OooOoO0);
                break;
            case 2:
                AbstractC1168q2.m2199a(this.f15798OooOo0o, (MaxAdRevenueListener) this.f15796OooOo, (MaxAd) this.f15799OooOoO0);
                break;
            case 3:
                C3423ml.m10832a(this.f15798OooOo0o, (LevelPlayAdInfo) this.f15796OooOo, (C3423ml) this.f15799OooOoO0);
                break;
            case 4:
                ((C3657v.r) this.f15796OooOo).m12243a(this.f15798OooOo0o, (String) this.f15799OooOoO0);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleSetAnalyticsCollectionEnabled$lambda$5((FlutterFirebaseAnalyticsPlugin) this.f15796OooOo, this.f15798OooOo0o, (TaskCompletionSource) this.f15799OooOoO0);
                break;
        }
    }

    public /* synthetic */ o0OoOo0(boolean z, Object obj, Object obj2, int i) {
        this.f15797OooOo0O = i;
        this.f15798OooOo0o = z;
        this.f15796OooOo = obj;
        this.f15799OooOoO0 = obj2;
    }
}

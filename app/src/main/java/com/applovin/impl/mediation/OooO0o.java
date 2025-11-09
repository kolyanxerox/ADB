package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C1302z2;
import com.applovin.impl.mediation.ads.AbstractC1118a;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C1129h f15637OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15638OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f15639OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC1118a.a f15640OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Activity f15641OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Object f15642OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ Object f15643OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f15644OooOoo0;

    public /* synthetic */ OooO0o(MediationServiceImpl mediationServiceImpl, C1129h c1129h, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, AbstractC1266v2 abstractC1266v2, Activity activity, AbstractC1118a.a aVar) {
        this.f15639OooOo0o = mediationServiceImpl;
        this.f15637OooOo = c1129h;
        this.f15642OooOoOO = str;
        this.f15644OooOoo0 = maxAdapterParametersImpl;
        this.f15643OooOoo = abstractC1266v2;
        this.f15641OooOoO0 = activity;
        this.f15640OooOoO = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15638OooOo0O) {
            case 0:
                this.f15639OooOo0o.m1532a(this.f15637OooOo, (String) this.f15642OooOoOO, (MaxAdapterParametersImpl) this.f15644OooOoo0, (AbstractC1266v2) this.f15643OooOoo, this.f15641OooOoO0, this.f15640OooOoO);
                break;
            default:
                Activity activity = this.f15641OooOoO0;
                this.f15639OooOo0o.m1541a((C1302z2) this.f15642OooOoOO, this.f15637OooOo, (ViewGroup) this.f15644OooOoo0, (Lifecycle) this.f15643OooOoo, activity, this.f15640OooOoO);
                break;
        }
    }

    public /* synthetic */ OooO0o(MediationServiceImpl mediationServiceImpl, C1302z2 c1302z2, C1129h c1129h, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, AbstractC1118a.a aVar) {
        this.f15639OooOo0o = mediationServiceImpl;
        this.f15642OooOoOO = c1302z2;
        this.f15637OooOo = c1129h;
        this.f15644OooOoo0 = viewGroup;
        this.f15643OooOoo = lifecycle;
        this.f15641OooOoO0 = activity;
        this.f15640OooOoO = aVar;
    }
}

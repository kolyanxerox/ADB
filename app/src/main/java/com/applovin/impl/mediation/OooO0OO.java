package com.applovin.impl.mediation;

import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C1170q4;
import com.applovin.impl.mediation.ads.AbstractC1118a;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements C1170q4.a {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15633OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f15634OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f15635OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f15636OooO0Oo;

    public /* synthetic */ OooO0OO(MediationServiceImpl mediationServiceImpl, Object obj, Object obj2, int i) {
        this.f15633OooO00o = i;
        this.f15634OooO0O0 = mediationServiceImpl;
        this.f15635OooO0OO = obj;
        this.f15636OooO0Oo = obj2;
    }

    @Override // com.applovin.impl.C1170q4.a
    /* renamed from: a */
    public final void mo1567a(Object obj) {
        switch (this.f15633OooO00o) {
            case 0:
                this.f15634OooO0O0.m1531a((C1129h) this.f15635OooO0OO, (C1170q4) this.f15636OooO0Oo, (String) obj);
                break;
            default:
                this.f15634OooO0O0.m1536a((AbstractC1266v2) this.f15635OooO0OO, (AbstractC1118a.a) this.f15636OooO0Oo, (String) obj);
                break;
        }
    }
}

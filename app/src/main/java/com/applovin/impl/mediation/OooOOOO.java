package com.applovin.impl.mediation;

import com.applovin.impl.C1302z2;
import com.applovin.impl.mediation.C1129h;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15658OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15659OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15660OooOo0o;

    public /* synthetic */ OooOOOO(int i, Object obj, Object obj2) {
        this.f15659OooOo0O = i;
        this.f15660OooOo0o = obj;
        this.f15658OooOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15659OooOo0O) {
            case 0:
                ((C1129h.b) this.f15660OooOo0o).m1850a((MaxError) this.f15658OooOo);
                break;
            case 1:
                ((MediationServiceImpl.C1104b) this.f15660OooOo0o).m1557a((MaxAd) this.f15658OooOo);
                break;
            case 2:
                ((C1120b) this.f15660OooOo0o).m1679c((C1302z2) this.f15658OooOo);
                break;
            case 3:
                ((C1121c) this.f15660OooOo0o).m1684a((C1302z2) this.f15658OooOo);
                break;
            default:
                ((C1129h) this.f15660OooOo0o).m1799a((Runnable) this.f15658OooOo);
                break;
        }
    }
}

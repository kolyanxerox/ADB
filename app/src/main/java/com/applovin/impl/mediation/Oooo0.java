package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.C1302z2;
import com.applovin.impl.mediation.C1129h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15668OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15669OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15670OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f15671OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15672OooOoO0;

    public /* synthetic */ Oooo0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f15669OooOo0O = i;
        this.f15670OooOo0o = obj;
        this.f15668OooOo = obj2;
        this.f15672OooOoO0 = obj3;
        this.f15671OooOoO = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15669OooOo0O) {
            case 0:
                ((C1129h.b) this.f15670OooOo0o).m1849a((C1302z2) this.f15668OooOo, (MaxReward) this.f15672OooOoO0, (Bundle) this.f15671OooOoO);
                break;
            case 1:
                ((C1129h.b) this.f15670OooOo0o).m1852a((Runnable) this.f15668OooOo, (MaxAdListener) this.f15672OooOoO0, (String) this.f15671OooOoO);
                break;
            case 2:
                ((MediationServiceImpl) this.f15670OooOo0o).m1543a((C1302z2) this.f15668OooOo, (Long) this.f15672OooOoO0, (MaxAdListener) this.f15671OooOoO);
                break;
            case 3:
                ((C1129h) this.f15670OooOo0o).m1798a((MaxAdapterResponseParameters) this.f15668OooOo, (MaxAdFormat) this.f15672OooOoO0, (Activity) this.f15671OooOoO);
                break;
            default:
                ((C1129h) this.f15670OooOo0o).m1795a((MaxAdapter.OnCompletionListener) this.f15668OooOo, (MaxAdapterInitializationParameters) this.f15672OooOoO0, (Activity) this.f15671OooOoO);
                break;
        }
    }
}

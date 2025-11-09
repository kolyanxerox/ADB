package com.applovin.impl.mediation;

import com.applovin.impl.mediation.C1122d;
import com.applovin.impl.mediation.C1126e;
import com.applovin.impl.mediation.ads.AbstractC1118a;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f15615OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15616OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f15617OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC1118a.a f15618OooOoO0;

    public /* synthetic */ OooO(AbstractC1118a.a aVar, int i, String str, int i2) {
        this.f15616OooOo0O = i2;
        this.f15618OooOoO0 = aVar;
        this.f15617OooOo0o = i;
        this.f15615OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15616OooOo0O) {
            case 0:
                ((C1122d.b) this.f15618OooOoO0).m1706a(this.f15617OooOo0o, this.f15615OooOo);
                break;
            default:
                ((C1126e.b) this.f15618OooOoO0).m1756a(this.f15617OooOo0o, this.f15615OooOo);
                break;
        }
    }
}

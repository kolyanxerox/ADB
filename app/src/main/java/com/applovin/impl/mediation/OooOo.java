package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.mediation.C1129h;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15661OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15662OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15663OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15664OooOoO0;

    public /* synthetic */ OooOo(Object obj, Object obj2, Object obj3, int i) {
        this.f15662OooOo0O = i;
        this.f15663OooOo0o = obj;
        this.f15661OooOo = obj2;
        this.f15664OooOoO0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15662OooOo0O) {
            case 0:
                ((C1129h.b) this.f15663OooOo0o).m1851a((MaxError) this.f15661OooOo, (Bundle) this.f15664OooOoO0);
                break;
            case 1:
                ((C1129h.c) this.f15663OooOo0o).m1868a((MaxAdapter.InitializationStatus) this.f15661OooOo, (String) this.f15664OooOoO0);
                break;
            case 2:
                ((C1129h) this.f15663OooOo0o).m1794a((AbstractC1266v2) this.f15661OooOo, (Runnable) this.f15664OooOoO0);
                break;
            default:
                ((C1129h) this.f15663OooOo0o).m1803a((String) this.f15661OooOo, (Runnable) this.f15664OooOoO0);
                break;
        }
    }
}

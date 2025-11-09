package com.applovin.impl.mediation;

import com.applovin.impl.mediation.C1129h;

/* loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15673OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15674OooOo0o;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f15673OooOo0O = i;
        this.f15674OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15673OooOo0O) {
            case 0:
                ((C1129h.b) this.f15674OooOo0o).m1843a();
                break;
            default:
                ((C1129h) this.f15674OooOo0o).m1822l();
                break;
        }
    }
}

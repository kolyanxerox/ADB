package com.applovin.impl;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class Oooo000 implements View.OnClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15603OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15604OooOo0o;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f15603OooOo0O = i;
        this.f15604OooOo0o = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15603OooOo0O) {
            case 0:
                ((C1002d1) this.f15604OooOo0o).m528a(view);
                break;
            case 1:
                ((AbstractActivityC1132n1) this.f15604OooOo0o).m1882a(view);
                break;
            default:
                ((AbstractC1265v1) this.f15604OooOo0o).m3428a(view);
                break;
        }
    }
}

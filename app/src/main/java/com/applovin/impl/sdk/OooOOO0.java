package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC1207b f15830OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15831OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1222m f15832OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Context f15833OooOoO0;

    public /* synthetic */ OooOOO0(C1222m c1222m, AbstractC1207b abstractC1207b, Context context, int i) {
        this.f15831OooOo0O = i;
        this.f15832OooOo0o = c1222m;
        this.f15830OooOo = abstractC1207b;
        this.f15833OooOoO0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15831OooOo0O) {
            case 0:
                this.f15832OooOo0o.m3007a(this.f15830OooOo, this.f15833OooOoO0);
                break;
            default:
                this.f15832OooOo0o.m3014b(this.f15830OooOo, this.f15833OooOoO0);
                break;
        }
    }
}

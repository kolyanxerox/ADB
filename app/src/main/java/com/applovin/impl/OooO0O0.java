package com.applovin.impl;

import com.applovin.impl.adview.C0977l;
import com.ironsource.C3192hm;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f15577OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15578OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15579OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i, long j) {
        this.f15578OooOo0O = i;
        this.f15579OooOo0o = obj;
        this.f15577OooOo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15578OooOo0O) {
            case 0:
                AbstractC0989b8.m426a((C0977l) this.f15579OooOo0o, this.f15577OooOo, (Runnable) null);
                break;
            case 1:
                AbstractC0989b8.m434b((C0977l) this.f15579OooOo0o, this.f15577OooOo, null);
                break;
            default:
                C3192hm.m9167a((C3192hm) this.f15579OooOo0o, this.f15577OooOo);
                break;
        }
    }
}

package com.applovin.impl.sdk;

import com.applovin.impl.C1301z1;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f15834OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15835OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15836OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15837OooOoO0;

    public /* synthetic */ OooOOOO(Object obj, boolean z, long j, int i) {
        this.f15835OooOo0O = i;
        this.f15837OooOoO0 = obj;
        this.f15836OooOo0o = z;
        this.f15834OooOo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15835OooOo0O) {
            case 0:
                ((C1243r) this.f15837OooOoO0).m3242a(this.f15836OooOo0o, this.f15834OooOo);
                break;
            default:
                ((C1301z1) this.f15837OooOoO0).m3835b(this.f15836OooOo0o, this.f15834OooOo);
                break;
        }
    }
}

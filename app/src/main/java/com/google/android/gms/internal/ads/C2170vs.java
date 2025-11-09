package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.vs */
/* loaded from: classes2.dex */
public final class C2170vs implements InterfaceC1656hv, InterfaceC1481d3 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C1803lv f25116OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final kd0 f25117OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2320zu f25118OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicBoolean f25120OooOoO0 = new AtomicBoolean();

    /* renamed from: OooOoO, reason: collision with root package name */
    public final AtomicBoolean f25119OooOoO = new AtomicBoolean();

    public C2170vs(kd0 kd0Var, C2320zu c2320zu, C1803lv c1803lv) {
        this.f25117OooOo0O = kd0Var;
        this.f25118OooOo0o = c2320zu;
        this.f25116OooOo = c1803lv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final synchronized void OoooOOO() {
        if (this.f25117OooOo0O.f20492OooO0o0 != 1) {
            if (this.f25120OooOoO0.compareAndSet(false, true)) {
                this.f25118OooOo0o.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        if (this.f25117OooOo0O.f20492OooO0o0 == 1 && c1444c3.f17668OooOO0 && this.f25120OooOoO0.compareAndSet(false, true)) {
            this.f25118OooOo0o.zza();
        }
        if (c1444c3.f17668OooOO0 && this.f25119OooOoO.compareAndSet(false, true)) {
            C1803lv c1803lv = this.f25116OooOo;
            synchronized (c1803lv) {
                c1803lv.o0000Ooo(new C1582fv(2));
            }
        }
    }
}

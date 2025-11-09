package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class so0 extends xh0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24128OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24129OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24130OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24131OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24132OooOoo0;

    public so0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(14);
        this.f24128OooOo = atomicReferenceFieldUpdater;
        this.f24130OooOoO0 = atomicReferenceFieldUpdater2;
        this.f24129OooOoO = atomicReferenceFieldUpdater3;
        this.f24131OooOoOO = atomicReferenceFieldUpdater4;
        this.f24132OooOoo0 = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final ro0 OooOO0(ap0 ap0Var) {
        return (ro0) this.f24131OooOoOO.getAndSet(ap0Var, ro0.f23921OooO0Oo);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final zo0 Oooo000(ap0 ap0Var) {
        return (zo0) this.f24129OooOoO.getAndSet(ap0Var, zo0.f26234OooO0OO);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void OoooO00(zo0 zo0Var, zo0 zo0Var2) {
        this.f24130OooOoO0.lazySet(zo0Var, zo0Var2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean Ooooo00(ap0 ap0Var, ro0 ro0Var, ro0 ro0Var2) {
        return ii0.OooOo00(this.f24131OooOoOO, ap0Var, ro0Var, ro0Var2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean OooooOO(ap0 ap0Var, Object obj, Object obj2) {
        return ii0.OooOo00(this.f24132OooOoo0, ap0Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean Oooooo0(ap0 ap0Var, zo0 zo0Var, zo0 zo0Var2) {
        return ii0.OooOo00(this.f24129OooOoO, ap0Var, zo0Var, zo0Var2);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void o000oOoO(zo0 zo0Var, Thread thread) {
        this.f24128OooOo.lazySet(zo0Var, thread);
    }
}

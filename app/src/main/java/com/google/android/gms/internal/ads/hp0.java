package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class hp0 extends xh0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19835OooOo;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f19836OooOoO0;

    public hp0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(15);
        this.f19835OooOo = atomicReferenceFieldUpdater;
        this.f19836OooOoO0 = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final int OooO0Oo(gp0 gp0Var) {
        return this.f19836OooOoO0.decrementAndGet(gp0Var);
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void Oooo0OO(gp0 gp0Var, Set set) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f19835OooOo;
            if (atomicReferenceFieldUpdater.compareAndSet(gp0Var, null, set)) {
                return;
            }
            if (atomicReferenceFieldUpdater.get(gp0Var) != null && atomicReferenceFieldUpdater.get(gp0Var) != null) {
                return;
            }
        }
    }
}

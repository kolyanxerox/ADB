package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class o00 extends o0O000Oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26962OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26963OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26964OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26965OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f26966OooOoOO;

    public o00(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(7);
        this.f26963OooOo0o = atomicReferenceFieldUpdater;
        this.f26962OooOo = atomicReferenceFieldUpdater2;
        this.f26965OooOoO0 = atomicReferenceFieldUpdater3;
        this.f26964OooOoO = atomicReferenceFieldUpdater4;
        this.f26966OooOoOO = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final o000OOo0 OooO0Oo(o00O00O o00o00o) {
        return (o000OOo0) this.f26964OooOoO.getAndSet(o00o00o, o000OOo0.f27028OooO0Oo);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final o00O00 OooOOOO(o00O00O o00o00o) {
        return (o00O00) this.f26965OooOoO0.getAndSet(o00o00o, o00O00.f27038OooO0OO);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOOoo(o00O00 o00o00, o00O00 o00o002) {
        this.f26962OooOo.lazySet(o00o00, o00o002);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOo0(o00O00 o00o00, Thread thread) {
        this.f26963OooOo0o.lazySet(o00o00, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOoO(o00O00O o00o00o, o000OOo0 o000ooo02, o000OOo0 o000ooo03) {
        return o0O000Oo.OooOO0O(this.f26964OooOoO, o00o00o, o000ooo02, o000ooo03);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOooO(o00O00O o00o00o, Object obj, Object obj2) {
        return o0O000Oo.OooOO0O(this.f26966OooOoOO, o00o00o, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean Oooo000(o00O00O o00o00o, o00O00 o00o00, o00O00 o00o002) {
        return o0O000Oo.OooOO0O(this.f26965OooOoO0, o00o00o, o00o00, o00o002);
    }
}

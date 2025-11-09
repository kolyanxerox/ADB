package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class oO0000Oo extends o0O000Oo {

    /* renamed from: OooOo */
    public final AtomicReferenceFieldUpdater f27181OooOo;

    /* renamed from: OooOo0o */
    public final AtomicReferenceFieldUpdater f27182OooOo0o;

    /* renamed from: OooOoO */
    public final AtomicReferenceFieldUpdater f27183OooOoO;

    /* renamed from: OooOoO0 */
    public final AtomicReferenceFieldUpdater f27184OooOoO0;

    /* renamed from: OooOoOO */
    public final AtomicReferenceFieldUpdater f27185OooOoOO;

    public oO0000Oo(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f27182OooOo0o = atomicReferenceFieldUpdater;
        this.f27181OooOo = atomicReferenceFieldUpdater2;
        this.f27184OooOoO0 = atomicReferenceFieldUpdater3;
        this.f27183OooOoO = atomicReferenceFieldUpdater4;
        this.f27185OooOoOO = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooO(oO000Oo oo000oo, oO000Oo oo000oo2) {
        this.f27181OooOo.lazySet(oo000oo, oo000oo2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOOo(oO000Oo oo000oo, Thread thread) {
        this.f27182OooOo0o.lazySet(oo000oo, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOo00(oO000o00 oo000o00, oo0ooO oo0ooo, oo0ooO oo0ooo2) {
        return o0O000Oo.OooOO0o(this.f27183OooOoO, oo000o00, oo0ooo, oo0ooo2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOo0O(oO000o00 oo000o00, Object obj, Object obj2) {
        return o0O000Oo.OooOO0o(this.f27185OooOoOO, oo000o00, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOoOO(oO000o00 oo000o00, oO000Oo oo000oo, oO000Oo oo000oo2) {
        return o0O000Oo.OooOO0o(this.f27184OooOoO0, oo000o00, oo000oo, oo000oo2);
    }
}

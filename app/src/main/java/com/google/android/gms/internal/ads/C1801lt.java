package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.lt */
/* loaded from: classes2.dex */
public final class C1801lt implements zzr {

    /* renamed from: OooOo0O */
    public final C1508dv f20949OooOo0O;

    /* renamed from: OooOo0o */
    public final AtomicBoolean f20950OooOo0o = new AtomicBoolean(false);

    /* renamed from: OooOo */
    public final AtomicBoolean f20948OooOo = new AtomicBoolean(false);

    public C1801lt(C1508dv c1508dv) {
        this.f20949OooOo0O = c1508dv;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        AtomicBoolean atomicBoolean = this.f20948OooOo;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f20949OooOo0O.o0000Ooo(new C2007rd(25));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        this.f20949OooOo0O.o0000Ooo(new C2007rd(27));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        this.f20950OooOo0o.set(true);
        AtomicBoolean atomicBoolean = this.f20948OooOo;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f20949OooOo0O.o0000Ooo(new C2007rd(25));
    }
}

package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d11 extends vn0 {

    /* renamed from: OooOo */
    public vn0 f18130OooOo;

    /* renamed from: OooOo0o */
    public final e11 f18131OooOo0o;

    public d11(f11 f11Var) {
        super(1);
        this.f18131OooOo0o = new e11(f11Var);
        this.f18130OooOo = OooO0O0();
    }

    @Override // com.google.android.gms.internal.ads.vn0
    public final byte OooO00o() {
        vn0 vn0Var = this.f18130OooOo;
        if (vn0Var == null) {
            throw new NoSuchElementException();
        }
        byte bOooO00o = vn0Var.OooO00o();
        if (!this.f18130OooOo.hasNext()) {
            this.f18130OooOo = OooO0O0();
        }
        return bOooO00o;
    }

    public final fz0 OooO0O0() {
        e11 e11Var = this.f18131OooOo0o;
        if (e11Var.hasNext()) {
            return new fz0(e11Var.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18130OooOo != null;
    }
}

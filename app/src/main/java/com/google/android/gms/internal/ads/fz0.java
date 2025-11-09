package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class fz0 extends vn0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f19151OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f19152OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ jz0 f19153OooOoO0;

    public fz0(jz0 jz0Var) {
        super(1);
        this.f19153OooOoO0 = jz0Var;
        this.f19152OooOo0o = 0;
        this.f19151OooOo = jz0Var.OooOO0();
    }

    @Override // com.google.android.gms.internal.ads.vn0
    public final byte OooO00o() {
        int i = this.f19152OooOo0o;
        if (i >= this.f19151OooOo) {
            throw new NoSuchElementException();
        }
        this.f19152OooOo0o = i + 1;
        return this.f19153OooOoO0.OooO0oO(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19152OooOo0o < this.f19151OooOo;
    }
}

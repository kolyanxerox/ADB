package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class na1 extends va1 implements Comparable {

    /* renamed from: OooOoO */
    public final int f21458OooOoO;

    /* renamed from: OooOoOO */
    public final int f21459OooOoOO;

    public na1(int i, C1421bg c1421bg, int i2, qa1 qa1Var, int i3) {
        int i4;
        super(i, c1421bg, i2);
        this.f21458OooOoO = ii0.OooOOo(i3, qa1Var.f23562OooOOo0) ? 1 : 0;
        o0OoOo0 o0oooo0 = this.f24941OooOoO0;
        int i5 = o0oooo0.f22229OooOo00;
        int i6 = -1;
        if (i5 != -1 && (i4 = o0oooo0.OooOo0) != -1) {
            i6 = i5 * i4;
        }
        this.f21459OooOoOO = i6;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final int OooO00o() {
        return this.f21458OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final /* bridge */ /* synthetic */ boolean OooO0O0(va1 va1Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f21459OooOoOO, ((na1) obj).f21459OooOoOO);
    }
}

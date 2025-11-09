package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oa1 implements Comparable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f22948OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f22949OooOo0o;

    public oa1(o0OoOo0 o0oooo0, int i) {
        this.f22948OooOo0O = 1 == (o0oooo0.f22216OooO0o0 & 1);
        this.f22949OooOo0o = ii0.OooOOo(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oa1 oa1Var = (oa1) obj;
        return km0.f20621OooO00o.OooO0Oo(this.f22949OooOo0o, oa1Var.f22949OooOo0o).OooO0Oo(this.f22948OooOo0O, oa1Var.f22948OooOo0O).OooO00o();
    }
}

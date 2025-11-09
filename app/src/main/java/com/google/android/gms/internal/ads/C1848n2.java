package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n2 */
/* loaded from: classes2.dex */
public final class C1848n2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final boolean f21391OooOoo;

    public C1848n2(C2143v1 c2143v1, C2104u c2104u, int i) {
        super(c2143v1, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c2104u, i, 61);
        this.f21391OooOoo = c2143v1.f24828OooOOo.f26398OooO00o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        long jLongValue = ((Long) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o, Boolean.valueOf(this.f21391OooOoo))).longValue();
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u = this.f23492OooOoO0;
            c2104u.OooO0Oo();
            C1514e0.Oooo0((C1514e0) c2104u.f25822OooOo0o, jLongValue);
        }
    }
}

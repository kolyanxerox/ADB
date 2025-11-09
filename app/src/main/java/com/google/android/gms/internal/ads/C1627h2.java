package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h2 */
/* loaded from: classes2.dex */
public final class C1627h2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final long f19524OooOoo;

    public C1627h2(C2143v1 c2143v1, C2104u c2104u, long j, int i) {
        super(c2143v1, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c2104u, i, 25);
        this.f19524OooOoo = j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        long jLongValue = ((Long) this.f23491OooOoO.invoke(null, null)).longValue();
        synchronized (this.f23492OooOoO0) {
            try {
                C2104u c2104u = this.f23492OooOoO0;
                c2104u.OooO0Oo();
                C1514e0.OooOo((C1514e0) c2104u.f25822OooOo0o, jLongValue);
                long j = this.f19524OooOoo;
                if (j != 0) {
                    C2104u c2104u2 = this.f23492OooOoO0;
                    c2104u2.OooO0Oo();
                    C1514e0.OoooOo0((C1514e0) c2104u2.f25822OooOo0o, jLongValue - j);
                    C2104u c2104u3 = this.f23492OooOoO0;
                    long j2 = this.f19524OooOoo;
                    c2104u3.OooO0Oo();
                    C1514e0.OoooOoO((C1514e0) c2104u3.f25822OooOo0o, j2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

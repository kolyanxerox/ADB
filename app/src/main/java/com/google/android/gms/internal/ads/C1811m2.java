package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.m2 */
/* loaded from: classes2.dex */
public final class C1811m2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOoo */
    public final C1847n1 f21029OooOoo;

    /* renamed from: OooOooO */
    public final long f21030OooOooO;

    /* renamed from: OooOooo */
    public final long f21031OooOooo;

    public C1811m2(C2143v1 c2143v1, C2104u c2104u, int i, C1847n1 c1847n1, long j, long j2) {
        super(c2143v1, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", c2104u, i, 11);
        this.f21029OooOoo = c1847n1;
        this.f21030OooOooO = j;
        this.f21031OooOooo = j2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        C1847n1 c1847n1 = this.f21029OooOoo;
        if (c1847n1 != null) {
            String str = (String) this.f23491OooOoO.invoke(null, (NetworkCapabilities) c1847n1.f21381OooOo0o, Long.valueOf(this.f21030OooOooO), Long.valueOf(this.f21031OooOooo));
            C1773l1 c1773l1 = new C1773l1();
            HashMap mapOooO0oo = ze0.OooO0oo(str);
            if (mapOooO0oo != null) {
                c1773l1.f20768OooO0oo = (Long) mapOooO0oo.get(0);
                c1773l1.f20766OooO = (Long) mapOooO0oo.get(1);
                c1773l1.f20769OooOO0 = (Long) mapOooO0oo.get(2);
            }
            synchronized (this.f23492OooOoO0) {
                try {
                    C2104u c2104u = this.f23492OooOoO0;
                    long jLongValue = c1773l1.f20768OooO0oo.longValue();
                    c2104u.OooO0Oo();
                    C1514e0.OooOooO((C1514e0) c2104u.f25822OooOo0o, jLongValue);
                    if (((Long) c1773l1.f20766OooO).longValue() >= 0) {
                        C2104u c2104u2 = this.f23492OooOoO0;
                        long jLongValue2 = ((Long) c1773l1.f20766OooO).longValue();
                        c2104u2.OooO0Oo();
                        C1514e0.OoooOO0((C1514e0) c2104u2.f25822OooOo0o, jLongValue2);
                    }
                    if (((Long) c1773l1.f20769OooOO0).longValue() >= 0) {
                        C2104u c2104u3 = this.f23492OooOoO0;
                        long jLongValue3 = ((Long) c1773l1.f20769OooOO0).longValue();
                        c2104u3.OooO0Oo();
                        C1514e0.oo0o0Oo((C1514e0) c2104u3.f25822OooOo0o, jLongValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

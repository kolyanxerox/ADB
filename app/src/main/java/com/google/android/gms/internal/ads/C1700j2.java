package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.j2 */
/* loaded from: classes2.dex */
public final class C1700j2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOoo */
    public final /* synthetic */ int f20155OooOoo = 3;

    /* renamed from: OooOooO */
    public final Object f20156OooOooO;

    public C1700j2(C2143v1 c2143v1, C2104u c2104u, int i, View view) {
        super(c2143v1, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", c2104u, i, 57);
        this.f20156OooOooO = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        switch (this.f20155OooOoo) {
            case 0:
                long[] jArr = (long[]) this.f23491OooOoO.invoke(null, Long.valueOf(((o0OOO0o) this.f20156OooOooO).f22133OooO0OO), Long.valueOf(((o0OOO0o) this.f20156OooOooO).f22134OooO0Oo), Long.valueOf(((o0OOO0o) this.f20156OooOooO).f22136OooO0o0), Long.valueOf(((o0OOO0o) this.f20156OooOooO).f22135OooO0o));
                synchronized (this.f23492OooOoO0) {
                    C2104u c2104u = this.f23492OooOoO0;
                    long j = jArr[0];
                    c2104u.OooO0Oo();
                    C1514e0.OooOoO((C1514e0) c2104u.f25822OooOo0o, j);
                    C2104u c2104u2 = this.f23492OooOoO0;
                    long j2 = jArr[1];
                    c2104u2.OooO0Oo();
                    C1514e0.OooOoO0((C1514e0) c2104u2.f25822OooOo0o, j2);
                }
                return;
            case 1:
                Method method = this.f23491OooOoO;
                p80 p80Var = (p80) this.f20156OooOooO;
                List list = (List) p80Var.f23242OooOo0o;
                p80Var.f23242OooOo0o = Collections.EMPTY_LIST;
                int iIntValue = ((Integer) method.invoke(null, list)).intValue();
                synchronized (this.f23492OooOoO0) {
                    C2104u c2104u3 = this.f23492OooOoO0;
                    int iOooO00o = af0.OooO00o(iIntValue);
                    c2104u3.OooO0Oo();
                    C1514e0.o00Oo0((C1514e0) c2104u3.f25822OooOo0o, iOooO00o);
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.f20156OooOooO;
                if (stackTraceElementArr != null) {
                    C1773l1 c1773l1 = new C1773l1((String) this.f23491OooOoO.invoke(null, stackTraceElementArr));
                    synchronized (this.f23492OooOoO0) {
                        try {
                            C2104u c2104u4 = this.f23492OooOoO0;
                            long jLongValue = c1773l1.f20768OooO0oo.longValue();
                            c2104u4.OooO0Oo();
                            C1514e0.Oooo0O0((C1514e0) c2104u4.f25822OooOo0o, jLongValue);
                            if (((Boolean) c1773l1.f20766OooO).booleanValue()) {
                                C2104u c2104u5 = this.f23492OooOoO0;
                                int i = true != ((Boolean) c1773l1.f20769OooOO0).booleanValue() ? 2 : 1;
                                c2104u5.OooO0Oo();
                                C1514e0.ooOO((C1514e0) c2104u5.f25822OooOo0o, i);
                            } else {
                                C2104u c2104u6 = this.f23492OooOoO0;
                                c2104u6.OooO0Oo();
                                C1514e0.ooOO((C1514e0) c2104u6.f25822OooOo0o, 3);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.f20156OooOooO;
                if (view != null) {
                    Boolean bool = (Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17899o00OOO00);
                    Boolean bool2 = (Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOO0o);
                    String str = (String) this.f23491OooOoO.invoke(null, view, this.f23489OooOo0O.f24814OooO00o.getResources().getDisplayMetrics(), bool, bool2);
                    C2254y1 c2254y1 = new C2254y1(13);
                    HashMap mapOooO0oo = ze0.OooO0oo(str);
                    if (mapOooO0oo != null) {
                        c2254y1.f25831OooO0oO = (Long) mapOooO0oo.get(0);
                        c2254y1.f25832OooO0oo = (Long) mapOooO0oo.get(1);
                        c2254y1.f25830OooO = (Long) mapOooO0oo.get(2);
                        c2254y1.f25833OooOO0 = (Long) mapOooO0oo.get(3);
                        c2254y1.f25834OooOO0O = (Long) mapOooO0oo.get(4);
                    }
                    C1441c0 c1441c0OooOo0o = C1478d0.OooOo0o();
                    long jLongValue2 = c2254y1.f25831OooO0oO.longValue();
                    c1441c0OooOo0o.OooO0Oo();
                    C1478d0.OooOoO0((C1478d0) c1441c0OooOo0o.f25822OooOo0o, jLongValue2);
                    long jLongValue3 = c2254y1.f25832OooO0oo.longValue();
                    c1441c0OooOo0o.OooO0Oo();
                    C1478d0.OooOoOO((C1478d0) c1441c0OooOo0o.f25822OooOo0o, jLongValue3);
                    long jLongValue4 = c2254y1.f25830OooO.longValue();
                    c1441c0OooOo0o.OooO0Oo();
                    C1478d0.OooOoo0((C1478d0) c1441c0OooOo0o.f25822OooOo0o, jLongValue4);
                    if (bool2.booleanValue()) {
                        long jLongValue5 = c2254y1.f25834OooOO0O.longValue();
                        c1441c0OooOo0o.OooO0Oo();
                        C1478d0.OooOoO((C1478d0) c1441c0OooOo0o.f25822OooOo0o, jLongValue5);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue6 = c2254y1.f25833OooOO0.longValue();
                        c1441c0OooOo0o.OooO0Oo();
                        C1478d0.OooOo((C1478d0) c1441c0OooOo0o.f25822OooOo0o, jLongValue6);
                    }
                    C1478d0 c1478d0 = (C1478d0) c1441c0OooOo0o.OooO0O0();
                    C2104u c2104u7 = this.f23492OooOoO0;
                    c2104u7.OooO0Oo();
                    C1514e0.OooooO0((C1514e0) c2104u7.f25822OooOo0o, c1478d0);
                    return;
                }
                return;
        }
    }

    public C1700j2(C2143v1 c2143v1, C2104u c2104u, int i, o0OOO0o o0ooo0o) {
        super(c2143v1, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", c2104u, i, 85);
        this.f20156OooOooO = o0ooo0o;
    }

    public C1700j2(C2143v1 c2143v1, C2104u c2104u, int i, p80 p80Var) {
        super(c2143v1, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", c2104u, i, 94);
        this.f20156OooOooO = p80Var;
    }

    public C1700j2(C2143v1 c2143v1, C2104u c2104u, int i, StackTraceElement[] stackTraceElementArr) {
        super(c2143v1, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", c2104u, i, 45);
        this.f20156OooOooO = stackTraceElementArr;
    }
}

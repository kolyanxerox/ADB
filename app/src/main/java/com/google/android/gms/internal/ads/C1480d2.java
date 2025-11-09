package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.d2 */
/* loaded from: classes2.dex */
public final class C1480d2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ int f18132OooOoo = 1;

    /* renamed from: OooOooO, reason: collision with root package name */
    public Object f18133OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final Object f18134OooOooo;

    public C1480d2(C2143v1 c2143v1, C2104u c2104u, int i, Context context) {
        super(c2143v1, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", c2104u, i, 31);
        this.f18133OooOooO = null;
        this.f18134OooOooo = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        switch (this.f18132OooOoo) {
            case 0:
                if (((View) this.f18134OooOooo) == null) {
                    return;
                }
                Boolean bool = (Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17856o00O0);
                boolean zBooleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.f23491OooOoO.invoke(null, (View) this.f18134OooOooo, (Activity) this.f18133OooOooO, bool);
                synchronized (this.f23492OooOoO0) {
                    try {
                        C2104u c2104u = this.f23492OooOoO0;
                        long jLongValue = ((Long) objArr[0]).longValue();
                        c2104u.OooO0Oo();
                        C1514e0.o0OOO0o((C1514e0) c2104u.f25822OooOo0o, jLongValue);
                        C2104u c2104u2 = this.f23492OooOoO0;
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        c2104u2.OooO0Oo();
                        C1514e0.o0OO00O((C1514e0) c2104u2.f25822OooOo0o, jLongValue2);
                        if (zBooleanValue) {
                            C2104u c2104u3 = this.f23492OooOoO0;
                            String str = (String) objArr[2];
                            c2104u3.OooO0Oo();
                            C1514e0.o0Oo0oo((C1514e0) c2104u3.f25822OooOo0o, str);
                        }
                    } finally {
                    }
                }
                return;
            default:
                C2104u c2104u4 = this.f23492OooOoO0;
                c2104u4.OooO0Oo();
                C1514e0.Ooooo00((C1514e0) c2104u4.f25822OooOo0o, -1L);
                C2104u c2104u5 = this.f23492OooOoO0;
                c2104u5.OooO0Oo();
                C1514e0.OoooOOo((C1514e0) c2104u5.f25822OooOo0o, -1L);
                Context context = (Context) this.f18134OooOooo;
                if (context == null) {
                    context = this.f23489OooOo0O.f24814OooO00o;
                }
                if (((List) this.f18133OooOooO) == null) {
                    this.f18133OooOooO = (List) this.f23491OooOoO.invoke(null, context);
                }
                List list = (List) this.f18133OooOooO;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (this.f23492OooOoO0) {
                    C2104u c2104u6 = this.f23492OooOoO0;
                    long jLongValue3 = ((Long) ((List) this.f18133OooOooO).get(0)).longValue();
                    c2104u6.OooO0Oo();
                    C1514e0.Ooooo00((C1514e0) c2104u6.f25822OooOo0o, jLongValue3);
                    C2104u c2104u7 = this.f23492OooOoO0;
                    long jLongValue4 = ((Long) ((List) this.f18133OooOooO).get(1)).longValue();
                    c2104u7.OooO0Oo();
                    C1514e0.OoooOOo((C1514e0) c2104u7.f25822OooOo0o, jLongValue4);
                }
                return;
        }
    }

    public C1480d2(C2143v1 c2143v1, C2104u c2104u, int i, View view, Activity activity) {
        super(c2143v1, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", c2104u, i, 62);
        this.f18134OooOooo = view;
        this.f18133OooOooO = activity;
    }
}

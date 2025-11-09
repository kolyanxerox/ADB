package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.k2 */
/* loaded from: classes2.dex */
public final class C1737k2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final HashMap f20412OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final View f20413OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final Context f20414OooOooo;

    public C1737k2(C2143v1 c2143v1, C2104u c2104u, int i, HashMap map, View view, Context context) {
        super(c2143v1, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", c2104u, i, 85);
        this.f20412OooOoo = map;
        this.f20413OooOooO = view;
        this.f20414OooOooo = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        HashMap map = this.f20412OooOoo;
        long jLongValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        HashMap map2 = this.f20412OooOoo;
        long[] jArr = {jLongValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.f20414OooOooo;
        if (context == null) {
            context = this.f23489OooOo0O.f24814OooO00o;
        }
        long[] jArr2 = (long[]) this.f23491OooOoO.invoke(null, jArr, context, this.f20413OooOooO);
        long j = jArr2[0];
        this.f20412OooOoo.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.f20412OooOoo.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u = this.f23492OooOoO0;
            c2104u.OooO0Oo();
            C1514e0.OooOoO((C1514e0) c2104u.f25822OooOo0o, j);
            C2104u c2104u2 = this.f23492OooOoO0;
            c2104u2.OooO0Oo();
            C1514e0.OooOoO0((C1514e0) c2104u2.f25822OooOo0o, j2);
        }
    }
}

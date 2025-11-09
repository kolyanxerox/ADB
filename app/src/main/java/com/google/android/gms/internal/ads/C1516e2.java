package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.e2 */
/* loaded from: classes2.dex */
public final class C1516e2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOooO */
    public static final sj0 f18456OooOooO = new sj0(5);

    /* renamed from: OooOoo */
    public final Context f18457OooOoo;

    public C1516e2(C2143v1 c2143v1, C2104u c2104u, int i, Context context) {
        super(c2143v1, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", c2104u, i, 29);
        this.f18457OooOoo = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        C2104u c2104u = this.f23492OooOoO0;
        c2104u.OooO0Oo();
        C1514e0.o00000O((C1514e0) c2104u.f25822OooOo0o, "E");
        AtomicReference atomicReferenceOooO0O0 = f18456OooOooO.OooO0O0(this.f18457OooOoo.getPackageName());
        if (atomicReferenceOooO0O0.get() == null) {
            synchronized (atomicReferenceOooO0O0) {
                try {
                    if (atomicReferenceOooO0O0.get() == null) {
                        atomicReferenceOooO0O0.set((String) this.f23491OooOoO.invoke(null, this.f18457OooOoo));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceOooO0O0.get();
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u2 = this.f23492OooOoO0;
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            c2104u2.OooO0Oo();
            C1514e0.o00000O((C1514e0) c2104u2.f25822OooOo0o, strEncodeToString);
        }
    }
}

package com.applovin.impl;

import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.g6 */
/* loaded from: classes.dex */
public class C1037g6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final WeakReference f782g;

    /* renamed from: h */
    private final Object f783h;

    public C1037g6(C1170q4 c1170q4, Object obj, String str, C1220k c1220k) {
        super(str, c1220k);
        this.f782g = new WeakReference(c1170q4);
        this.f783h = obj;
    }

    /* renamed from: a */
    public static void m799a(long j, C1170q4 c1170q4, Object obj, String str, C1220k c1220k) {
        if (j <= 0) {
            return;
        }
        c1220k.m2918r0().m404a(new C1037g6(c1170q4, obj, str, c1220k), C0987b6.b.TIMEOUT, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        C1170q4 c1170q4 = (C1170q4) this.f782g.get();
        if (c1170q4 == null || c1170q4.m2273c()) {
            return;
        }
        this.f776a.m2847O();
        if (C1240o.m3200a()) {
            this.f776a.m2847O().m3215d(this.f777b, "Attempting to timeout pending task " + c1170q4.m2272b() + " with " + this.f783h);
        }
        c1170q4.m2266a(this.f783h);
    }
}

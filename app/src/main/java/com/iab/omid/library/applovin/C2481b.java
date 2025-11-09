package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.internal.C2488a;
import com.iab.omid.library.applovin.internal.C2489b;
import com.iab.omid.library.applovin.internal.C2494g;
import com.iab.omid.library.applovin.internal.C2496i;
import com.iab.omid.library.applovin.internal.C2497j;
import com.iab.omid.library.applovin.utils.C2505a;
import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.utils.C2509e;
import com.iab.omid.library.applovin.utils.C2511g;

/* renamed from: com.iab.omid.library.applovin.b */
/* loaded from: classes2.dex */
public class C2481b {

    /* renamed from: a */
    private boolean f3461a;

    /* renamed from: b */
    private void m3999b(Context context) {
        C2511g.m4162a(context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String m4000a() {
        return "1.5.3-Applovin";
    }

    /* renamed from: c */
    public void m4004c() {
        C2511g.m4159a();
        C2488a.m4020a().m4025d();
    }

    /* renamed from: a */
    public void m4001a(Context context) {
        m3999b(context);
        if (m4003b()) {
            return;
        }
        m4002a(true);
        C2496i.m4077c().m4078a(context);
        C2489b.m4026g().m4038a(context);
        C2505a.m4124a(context);
        C2507c.m4132a(context);
        C2509e.m4156a(context);
        C2494g.m4055b().m4057a(context);
        C2488a.m4020a().m4022a(context);
        C2497j.m4084b().m4086a(context);
    }

    /* renamed from: b */
    public boolean m4003b() {
        return this.f3461a;
    }

    /* renamed from: a */
    public void m4002a(boolean z) {
        this.f3461a = z;
    }
}

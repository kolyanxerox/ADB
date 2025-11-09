package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.C2539a;
import com.iab.omid.library.ironsrc.internal.C2540b;
import com.iab.omid.library.ironsrc.internal.C2545g;
import com.iab.omid.library.ironsrc.internal.C2547i;
import com.iab.omid.library.ironsrc.internal.C2548j;
import com.iab.omid.library.ironsrc.utils.C2556a;
import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2560e;
import com.iab.omid.library.ironsrc.utils.C2562g;

/* renamed from: com.iab.omid.library.ironsrc.b */
/* loaded from: classes2.dex */
public class C2532b {

    /* renamed from: a */
    private boolean f3596a;

    /* renamed from: b */
    private void m4252b(Context context) {
        C2562g.m4415a(context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String m4253a() {
        return "1.5.2-Ironsrc";
    }

    /* renamed from: c */
    public void m4257c() {
        C2562g.m4412a();
        C2539a.m4273a().m4278d();
    }

    /* renamed from: a */
    public void m4254a(Context context) {
        m4252b(context);
        if (m4256b()) {
            return;
        }
        m4255a(true);
        C2547i.m4330c().m4331a(context);
        C2540b.m4279g().m4291a(context);
        C2556a.m4377a(context);
        C2558c.m4385a(context);
        C2560e.m4409a(context);
        C2545g.m4308b().m4310a(context);
        C2539a.m4273a().m4275a(context);
        C2548j.m4337b().m4339a(context);
    }

    /* renamed from: b */
    public boolean m4256b() {
        return this.f3596a;
    }

    /* renamed from: a */
    public void m4255a(boolean z) {
        this.f3596a = z;
    }
}

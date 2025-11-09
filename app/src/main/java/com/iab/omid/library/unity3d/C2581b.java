package com.iab.omid.library.unity3d;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.C2588a;
import com.iab.omid.library.unity3d.internal.C2589b;
import com.iab.omid.library.unity3d.internal.C2593f;
import com.iab.omid.library.unity3d.internal.C2595h;
import com.iab.omid.library.unity3d.utils.C2603a;
import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.utils.C2607e;
import com.iab.omid.library.unity3d.utils.C2609g;

/* renamed from: com.iab.omid.library.unity3d.b */
/* loaded from: classes2.dex */
public class C2581b {

    /* renamed from: a */
    private boolean f3732a;

    /* renamed from: b */
    private void m4508b(Context context) {
        C2609g.m4654a(context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String m4509a() {
        return "1.4.9-Unity3d";
    }

    /* renamed from: c */
    public void m4513c() {
        C2609g.m4651a();
        C2588a.m4529a().m4534d();
    }

    /* renamed from: a */
    public void m4510a(Context context) {
        m4508b(context);
        if (m4512b()) {
            return;
        }
        m4511a(true);
        C2595h.m4578c().m4579a(context);
        C2589b.m4535g().m4547a(context);
        C2603a.m4618a(context);
        C2605c.m4626a(context);
        C2607e.m4648a(context);
        C2593f.m4557b().m4559a(context);
        C2588a.m4529a().m4531a(context);
    }

    /* renamed from: b */
    public boolean m4512b() {
        return this.f3732a;
    }

    /* renamed from: a */
    public void m4511a(boolean z) {
        this.f3732a = z;
    }
}

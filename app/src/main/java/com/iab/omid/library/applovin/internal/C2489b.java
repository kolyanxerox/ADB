package com.iab.omid.library.applovin.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C2480a;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.applovin.internal.b */
/* loaded from: classes2.dex */
public class C2489b extends C2491d {

    /* renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static C2489b f3480d = new C2489b();

    private C2489b() {
    }

    /* renamed from: g */
    public static C2489b m4026g() {
        return f3480d;
    }

    @Override // com.iab.omid.library.applovin.internal.C2491d
    /* renamed from: b */
    public void mo4027b(boolean z) {
        Iterator<C2480a> it = C2490c.m4029c().m4032b().iterator();
        while (it.hasNext()) {
            it.next().m3987d().m4110a(z);
        }
    }

    @Override // com.iab.omid.library.applovin.internal.C2491d
    /* renamed from: d */
    public boolean mo4028d() {
        Iterator<C2480a> it = C2490c.m4029c().m4030a().iterator();
        while (it.hasNext()) {
            View viewM3988e = it.next().m3988e();
            if (viewM3988e != null && viewM3988e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

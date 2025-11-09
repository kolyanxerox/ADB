package com.iab.omid.library.ironsrc.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.ironsrc.internal.b */
/* loaded from: classes2.dex */
public class C2540b extends C2542d {

    /* renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static C2540b f3615d = new C2540b();

    private C2540b() {
    }

    /* renamed from: g */
    public static C2540b m4279g() {
        return f3615d;
    }

    @Override // com.iab.omid.library.ironsrc.internal.C2542d
    /* renamed from: b */
    public void mo4280b(boolean z) {
        Iterator<C2531a> it = C2541c.m4282c().m4285b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m4363a(z);
        }
    }

    @Override // com.iab.omid.library.ironsrc.internal.C2542d
    /* renamed from: d */
    public boolean mo4281d() {
        Iterator<C2531a> it = C2541c.m4282c().m4283a().iterator();
        while (it.hasNext()) {
            View viewM4241c = it.next().m4241c();
            if (viewM4241c != null && viewM4241c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

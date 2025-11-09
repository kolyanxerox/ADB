package com.iab.omid.library.unity3d.internal;

import android.annotation.SuppressLint;
import android.view.View;
import com.iab.omid.library.unity3d.adsession.C2580a;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.unity3d.internal.b */
/* loaded from: classes2.dex */
public class C2589b extends C2591d {

    /* renamed from: d */
    @SuppressLint({"StaticFieldLeak"})
    private static C2589b f3751d = new C2589b();

    private C2589b() {
    }

    /* renamed from: g */
    public static C2589b m4535g() {
        return f3751d;
    }

    @Override // com.iab.omid.library.unity3d.internal.C2591d
    /* renamed from: b */
    public void mo4536b(boolean z) {
        Iterator<C2580a> it = C2590c.m4538c().m4541b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m4605a(z);
        }
    }

    @Override // com.iab.omid.library.unity3d.internal.C2591d
    /* renamed from: d */
    public boolean mo4537d() {
        Iterator<C2580a> it = C2590c.m4538c().m4539a().iterator();
        while (it.hasNext()) {
            View viewM4497c = it.next().m4497c();
            if (viewM4497c != null && viewM4497c.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}

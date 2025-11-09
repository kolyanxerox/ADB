package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.devicevolume.C2584b;
import com.iab.omid.library.unity3d.devicevolume.C2586d;
import com.iab.omid.library.unity3d.devicevolume.C2587e;
import com.iab.omid.library.unity3d.devicevolume.InterfaceC2585c;
import com.iab.omid.library.unity3d.internal.C2591d;
import com.iab.omid.library.unity3d.walking.TreeWalker;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.unity3d.internal.h */
/* loaded from: classes2.dex */
public class C2595h implements C2591d.a, InterfaceC2585c {

    /* renamed from: f */
    private static C2595h f3768f;

    /* renamed from: a */
    private float f3769a = 0.0f;

    /* renamed from: b */
    private final C2587e f3770b;

    /* renamed from: c */
    private final C2584b f3771c;

    /* renamed from: d */
    private C2586d f3772d;

    /* renamed from: e */
    private C2590c f3773e;

    public C2595h(C2587e c2587e, C2584b c2584b) {
        this.f3770b = c2587e;
        this.f3771c = c2584b;
    }

    /* renamed from: a */
    private C2590c m4577a() {
        if (this.f3773e == null) {
            this.f3773e = C2590c.m4538c();
        }
        return this.f3773e;
    }

    /* renamed from: c */
    public static C2595h m4578c() {
        if (f3768f == null) {
            f3768f = new C2595h(new C2587e(), new C2584b());
        }
        return f3768f;
    }

    /* renamed from: b */
    public float m4580b() {
        return this.f3769a;
    }

    /* renamed from: d */
    public void m4581d() {
        C2589b.m4535g().m4548a(this);
        C2589b.m4535g().m4551e();
        TreeWalker.getInstance().m4686h();
        this.f3772d.m4526c();
    }

    /* renamed from: e */
    public void m4582e() {
        TreeWalker.getInstance().m4687j();
        C2589b.m4535g().m4552f();
        this.f3772d.m4527d();
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.InterfaceC2585c
    /* renamed from: a */
    public void mo4522a(float f) {
        this.f3769a = f;
        Iterator<C2580a> it = m4577a().m4539a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m4592a(f);
        }
    }

    /* renamed from: a */
    public void m4579a(Context context) {
        this.f3772d = this.f3770b.m4528a(new Handler(), context, this.f3771c.m4521a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.C2591d.a
    /* renamed from: a */
    public void mo4532a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m4686h();
        } else {
            TreeWalker.getInstance().m4685g();
        }
    }
}

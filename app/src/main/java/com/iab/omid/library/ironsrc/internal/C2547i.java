package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.devicevolume.C2535b;
import com.iab.omid.library.ironsrc.devicevolume.C2537d;
import com.iab.omid.library.ironsrc.devicevolume.C2538e;
import com.iab.omid.library.ironsrc.devicevolume.InterfaceC2536c;
import com.iab.omid.library.ironsrc.internal.C2542d;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.ironsrc.internal.i */
/* loaded from: classes2.dex */
public class C2547i implements C2542d.a, InterfaceC2536c {

    /* renamed from: f */
    private static C2547i f3634f;

    /* renamed from: a */
    private float f3635a = 0.0f;

    /* renamed from: b */
    private final C2538e f3636b;

    /* renamed from: c */
    private final C2535b f3637c;

    /* renamed from: d */
    private C2537d f3638d;

    /* renamed from: e */
    private C2541c f3639e;

    public C2547i(C2538e c2538e, C2535b c2535b) {
        this.f3636b = c2538e;
        this.f3637c = c2535b;
    }

    /* renamed from: a */
    private C2541c m4329a() {
        if (this.f3639e == null) {
            this.f3639e = C2541c.m4282c();
        }
        return this.f3639e;
    }

    /* renamed from: c */
    public static C2547i m4330c() {
        if (f3634f == null) {
            f3634f = new C2547i(new C2538e(), new C2535b());
        }
        return f3634f;
    }

    /* renamed from: b */
    public float m4332b() {
        return this.f3635a;
    }

    /* renamed from: d */
    public void m4333d() {
        C2540b.m4279g().m4292a(this);
        C2540b.m4279g().m4295e();
        TreeWalker.getInstance().m4451h();
        this.f3638d.m4270c();
    }

    /* renamed from: e */
    public void m4334e() {
        TreeWalker.getInstance().m4452j();
        C2540b.m4279g().m4296f();
        this.f3638d.m4271d();
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.InterfaceC2536c
    /* renamed from: a */
    public void mo4266a(float f) {
        this.f3635a = f;
        Iterator<C2531a> it = m4329a().m4283a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m4350a(f);
        }
    }

    /* renamed from: a */
    public void m4331a(Context context) {
        this.f3638d = this.f3636b.m4272a(new Handler(), context, this.f3637c.m4265a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.C2542d.a
    /* renamed from: a */
    public void mo4276a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m4451h();
        } else {
            TreeWalker.getInstance().m4450g();
        }
    }
}

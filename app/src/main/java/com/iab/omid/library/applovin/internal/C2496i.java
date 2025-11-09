package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.devicevolume.C2484b;
import com.iab.omid.library.applovin.devicevolume.C2486d;
import com.iab.omid.library.applovin.devicevolume.C2487e;
import com.iab.omid.library.applovin.devicevolume.InterfaceC2485c;
import com.iab.omid.library.applovin.internal.C2491d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.applovin.internal.i */
/* loaded from: classes2.dex */
public class C2496i implements C2491d.a, InterfaceC2485c {

    /* renamed from: f */
    private static C2496i f3499f;

    /* renamed from: a */
    private float f3500a = 0.0f;

    /* renamed from: b */
    private final C2487e f3501b;

    /* renamed from: c */
    private final C2484b f3502c;

    /* renamed from: d */
    private C2486d f3503d;

    /* renamed from: e */
    private C2490c f3504e;

    public C2496i(C2487e c2487e, C2484b c2484b) {
        this.f3501b = c2487e;
        this.f3502c = c2484b;
    }

    /* renamed from: a */
    private C2490c m4076a() {
        if (this.f3504e == null) {
            this.f3504e = C2490c.m4029c();
        }
        return this.f3504e;
    }

    /* renamed from: c */
    public static C2496i m4077c() {
        if (f3499f == null) {
            f3499f = new C2496i(new C2487e(), new C2484b());
        }
        return f3499f;
    }

    /* renamed from: b */
    public float m4079b() {
        return this.f3500a;
    }

    /* renamed from: d */
    public void m4080d() {
        C2489b.m4026g().m4039a(this);
        C2489b.m4026g().m4042e();
        TreeWalker.getInstance().m4198h();
        this.f3503d.m4017c();
    }

    /* renamed from: e */
    public void m4081e() {
        TreeWalker.getInstance().m4199j();
        C2489b.m4026g().m4043f();
        this.f3503d.m4018d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.InterfaceC2485c
    /* renamed from: a */
    public void mo4013a(float f) {
        this.f3500a = f;
        Iterator<C2480a> it = m4076a().m4030a().iterator();
        while (it.hasNext()) {
            it.next().m3987d().m4097a(f);
        }
    }

    /* renamed from: a */
    public void m4078a(Context context) {
        this.f3503d = this.f3501b.m4019a(new Handler(), context, this.f3502c.m4012a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.C2491d.a
    /* renamed from: a */
    public void mo4023a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m4198h();
        } else {
            TreeWalker.getInstance().m4197g();
        }
    }
}

package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.internal.C2542d;
import com.iab.omid.library.ironsrc.utils.C2561f;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.ironsrc.internal.a */
/* loaded from: classes2.dex */
public class C2539a implements C2542d.a {

    /* renamed from: f */
    private static C2539a f3609f = new C2539a(new C2542d());

    /* renamed from: a */
    protected C2561f f3610a = new C2561f();

    /* renamed from: b */
    private Date f3611b;

    /* renamed from: c */
    private boolean f3612c;

    /* renamed from: d */
    private C2542d f3613d;

    /* renamed from: e */
    private boolean f3614e;

    private C2539a(C2542d c2542d) {
        this.f3613d = c2542d;
    }

    /* renamed from: a */
    public static C2539a m4273a() {
        return f3609f;
    }

    /* renamed from: c */
    private void m4274c() {
        if (!this.f3612c || this.f3611b == null) {
            return;
        }
        Iterator<C2531a> it = C2541c.m4282c().m4283a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m4361a(m4277b());
        }
    }

    /* renamed from: b */
    public Date m4277b() {
        Date date = this.f3611b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m4278d() {
        Date dateM4411a = this.f3610a.m4411a();
        Date date = this.f3611b;
        if (date == null || dateM4411a.after(date)) {
            this.f3611b = dateM4411a;
            m4274c();
        }
    }

    /* renamed from: a */
    public void m4275a(@NonNull Context context) {
        if (this.f3612c) {
            return;
        }
        this.f3613d.m4291a(context);
        this.f3613d.m4292a(this);
        this.f3613d.m4295e();
        this.f3614e = this.f3613d.m4294c();
        this.f3612c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.C2542d.a
    /* renamed from: a */
    public void mo4276a(boolean z) {
        if (!this.f3614e && z) {
            m4278d();
        }
        this.f3614e = z;
    }
}

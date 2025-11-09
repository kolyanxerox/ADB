package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.internal.C2491d;
import com.iab.omid.library.applovin.utils.C2510f;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.applovin.internal.a */
/* loaded from: classes2.dex */
public class C2488a implements C2491d.a {

    /* renamed from: f */
    private static C2488a f3474f = new C2488a(new C2491d());

    /* renamed from: a */
    protected C2510f f3475a = new C2510f();

    /* renamed from: b */
    private Date f3476b;

    /* renamed from: c */
    private boolean f3477c;

    /* renamed from: d */
    private C2491d f3478d;

    /* renamed from: e */
    private boolean f3479e;

    private C2488a(C2491d c2491d) {
        this.f3478d = c2491d;
    }

    /* renamed from: a */
    public static C2488a m4020a() {
        return f3474f;
    }

    /* renamed from: c */
    private void m4021c() {
        if (!this.f3477c || this.f3476b == null) {
            return;
        }
        Iterator<C2480a> it = C2490c.m4029c().m4030a().iterator();
        while (it.hasNext()) {
            it.next().m3987d().m4108a(m4024b());
        }
    }

    /* renamed from: b */
    public Date m4024b() {
        Date date = this.f3476b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m4025d() {
        Date dateM4158a = this.f3475a.m4158a();
        Date date = this.f3476b;
        if (date == null || dateM4158a.after(date)) {
            this.f3476b = dateM4158a;
            m4021c();
        }
    }

    /* renamed from: a */
    public void m4022a(@NonNull Context context) {
        if (this.f3477c) {
            return;
        }
        this.f3478d.m4038a(context);
        this.f3478d.m4039a(this);
        this.f3478d.m4042e();
        this.f3479e = this.f3478d.m4041c();
        this.f3477c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.C2491d.a
    /* renamed from: a */
    public void mo4023a(boolean z) {
        if (!this.f3479e && z) {
            m4025d();
        }
        this.f3479e = z;
    }
}

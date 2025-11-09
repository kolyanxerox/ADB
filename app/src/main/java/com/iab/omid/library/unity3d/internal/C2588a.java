package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.internal.C2591d;
import com.iab.omid.library.unity3d.utils.C2608f;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.iab.omid.library.unity3d.internal.a */
/* loaded from: classes2.dex */
public class C2588a implements C2591d.a {

    /* renamed from: f */
    private static C2588a f3745f = new C2588a(new C2591d());

    /* renamed from: a */
    protected C2608f f3746a = new C2608f();

    /* renamed from: b */
    private Date f3747b;

    /* renamed from: c */
    private boolean f3748c;

    /* renamed from: d */
    private C2591d f3749d;

    /* renamed from: e */
    private boolean f3750e;

    private C2588a(C2591d c2591d) {
        this.f3749d = c2591d;
    }

    /* renamed from: a */
    public static C2588a m4529a() {
        return f3745f;
    }

    /* renamed from: c */
    private void m4530c() {
        if (!this.f3748c || this.f3747b == null) {
            return;
        }
        Iterator<C2580a> it = C2590c.m4538c().m4539a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().m4603a(m4533b());
        }
    }

    /* renamed from: b */
    public Date m4533b() {
        Date date = this.f3747b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m4534d() {
        Date dateM4650a = this.f3746a.m4650a();
        Date date = this.f3747b;
        if (date == null || dateM4650a.after(date)) {
            this.f3747b = dateM4650a;
            m4530c();
        }
    }

    /* renamed from: a */
    public void m4531a(@NonNull Context context) {
        if (this.f3748c) {
            return;
        }
        this.f3749d.m4547a(context);
        this.f3749d.m4548a(this);
        this.f3749d.m4551e();
        this.f3750e = this.f3749d.m4550c();
        this.f3748c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.C2591d.a
    /* renamed from: a */
    public void mo4532a(boolean z) {
        if (!this.f3750e && z) {
            m4534d();
        }
        this.f3750e = z;
    }
}

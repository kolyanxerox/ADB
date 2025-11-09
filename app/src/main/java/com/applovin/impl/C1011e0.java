package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* renamed from: com.applovin.impl.e0 */
/* loaded from: classes.dex */
public class C1011e0 extends AbstractCallableC0991c0 {

    /* renamed from: f */
    private final String f706f;

    /* renamed from: g */
    private final AbstractC1207b f707g;

    /* renamed from: h */
    private final List f708h;

    /* renamed from: i */
    private final boolean f709i;

    /* renamed from: j */
    private final String f710j;

    /* renamed from: k */
    private final C1220k f711k;

    /* renamed from: l */
    private final a f712l;

    /* renamed from: com.applovin.impl.e0$a */
    public interface a {
        /* renamed from: a */
        void mo523a(Uri uri);
    }

    public C1011e0(String str, AbstractC1207b abstractC1207b, String str2, C1220k c1220k, a aVar) {
        this(str, abstractC1207b, abstractC1207b.m2588c0(), true, str2, c1220k, aVar);
    }

    /* renamed from: a */
    private void m658a(Uri uri) {
        a aVar;
        if (this.f457e.get() || (aVar = this.f712l) == null) {
            return;
        }
        aVar.mo523a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Boolean call() {
        if (this.f457e.get()) {
            return Boolean.FALSE;
        }
        String strM3025a = this.f711k.m2837H().m3025a(m441a(), this.f706f, this.f707g.getCachePrefix(), this.f708h, this.f709i, this.f711k.m2837H().m3022a(this.f706f, this.f707g), this.f710j, AbstractC1013e2.m675a((AppLovinAdImpl) this.f707g));
        if (TextUtils.isEmpty(strM3025a)) {
            m658a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f457e.get()) {
            return Boolean.FALSE;
        }
        File fileM3023a = this.f711k.m2837H().m3023a(strM3025a, m441a());
        if (fileM3023a == null) {
            if (C1240o.m3200a()) {
                this.f455c.m3214b(this.f454b, "Unable to retrieve File for cached filename = " + strM3025a);
            }
            m658a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f457e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileM3023a);
        if (uriFromFile == null) {
            if (C1240o.m3200a()) {
                this.f455c.m3214b(this.f454b, "Unable to extract Uri from file");
            }
            m658a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f457e.get()) {
            return Boolean.FALSE;
        }
        m658a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f706f.equals(((C1011e0) obj).f706f);
    }

    public int hashCode() {
        String str = this.f706f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C1011e0(String str, AbstractC1207b abstractC1207b, List list, boolean z, String str2, C1220k c1220k, a aVar) {
        super("AsyncTaskCacheResource", c1220k);
        this.f706f = str;
        this.f707g = abstractC1207b;
        this.f708h = list;
        this.f709i = z;
        this.f710j = str2;
        this.f711k = c1220k;
        this.f712l = aVar;
    }
}

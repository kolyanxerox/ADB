package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.g5 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1036g5 implements Runnable {

    /* renamed from: a */
    protected final C1220k f776a;

    /* renamed from: b */
    protected final String f777b;

    /* renamed from: c */
    protected final C1240o f778c;

    /* renamed from: d */
    private final Context f779d;

    /* renamed from: e */
    private String f780e;

    /* renamed from: f */
    private boolean f781f;

    public AbstractRunnableC1036g5(String str, C1220k c1220k) {
        this(str, c1220k, false, null);
    }

    /* renamed from: a */
    public Context m791a() {
        return this.f779d;
    }

    /* renamed from: b */
    public C1220k m795b() {
        return this.f776a;
    }

    /* renamed from: c */
    public String m797c() {
        return this.f777b;
    }

    /* renamed from: d */
    public boolean m798d() {
        return this.f781f;
    }

    public AbstractRunnableC1036g5(String str, C1220k c1220k, boolean z) {
        this(str, c1220k, z, null);
    }

    /* renamed from: a */
    public void m792a(String str) {
        this.f780e = str;
    }

    /* renamed from: b */
    public ScheduledFuture m796b(Thread thread, long j) {
        if (j <= 0) {
            return null;
        }
        return this.f776a.m2918r0().m409b(new C1156p6(this.f776a, "timeout:" + this.f777b, new o00Oo0(this, thread, j)), C0987b6.b.TIMEOUT, j);
    }

    public AbstractRunnableC1036g5(String str, C1220k c1220k, String str2) {
        this(str, c1220k, false, str2);
    }

    /* renamed from: a */
    public void m794a(boolean z) {
        this.f781f = z;
    }

    public AbstractRunnableC1036g5(String str, C1220k c1220k, boolean z, String str2) {
        this.f777b = str;
        this.f776a = c1220k;
        this.f778c = c1220k.m2847O();
        this.f779d = C1220k.m2824o();
        this.f781f = z;
        this.f780e = str2;
    }

    /* renamed from: a */
    public void m793a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f777b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f780e));
        this.f776a.m2832E().m576d(C0993c2.f484J0, map);
    }

    /* renamed from: a */
    public /* synthetic */ void m790a(Thread thread, long j) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f780e)) {
            mapHashMap.put("details", this.f780e);
        }
        this.f776a.m2832E().m572a(C0993c2.f486K0, this.f777b, mapHashMap);
        if (C1240o.m3200a()) {
            this.f778c.m3218k(this.f777b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        }
    }
}

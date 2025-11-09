package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.gb */
/* loaded from: classes2.dex */
public class C3146gb implements InterfaceC3801wf {

    /* renamed from: e */
    private static final int f8716e = 5;

    /* renamed from: f */
    private static C3146gb f8717f;

    /* renamed from: a */
    private HandlerC3111fb f8718a;

    /* renamed from: b */
    private final JSONObject f8719b;

    /* renamed from: c */
    private Thread f8720c;

    /* renamed from: d */
    private final String f8721d;

    private C3146gb(String str, C3523pg c3523pg, JSONObject jSONObject) {
        this.f8721d = str;
        this.f8718a = new HandlerC3111fb(c3523pg.m11395a());
        this.f8719b = jSONObject;
        IronSourceStorageUtils.deleteFolder(m8933b());
        IronSourceStorageUtils.makeDir(m8933b());
    }

    /* renamed from: a */
    public static synchronized C3146gb m8931a(String str, C3523pg c3523pg, JSONObject jSONObject) {
        try {
            if (f8717f == null) {
                f8717f = new C3146gb(str, c3523pg, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8717f;
    }

    /* renamed from: b */
    private String m8933b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f8721d, C3109f9.f8517D);
    }

    /* renamed from: c */
    public boolean m8940c() {
        Thread thread = this.f8720c;
        return thread != null && thread.isAlive();
    }

    /* renamed from: d */
    public synchronized void m8941d() {
        f8717f = null;
        HandlerC3111fb handlerC3111fb = this.f8718a;
        if (handlerC3111fb != null) {
            handlerC3111fb.m8657a();
            this.f8718a = null;
        }
    }

    /* renamed from: b */
    private Thread m8934b(C3769vh c3769vh, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.f8719b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.f8719b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f8719b.optBoolean(C3109f9.f8521H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return m8932a(new C3036db(c3769vh, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), zOptBoolean, m8933b()), handler);
    }

    /* renamed from: a */
    public String m8935a() {
        return this.f8721d;
    }

    /* renamed from: a */
    private Thread m8932a(C3036db c3036db, Handler handler) {
        return new Thread(new RunnableC3712tu(c3036db, handler));
    }

    @Override // com.ironsource.InterfaceC3801wf
    /* renamed from: a */
    public void mo8936a(InterfaceC3602rp interfaceC3602rp) {
        this.f8718a.m8658a(interfaceC3602rp);
    }

    @Override // com.ironsource.InterfaceC3801wf
    /* renamed from: a */
    public void mo8937a(C3769vh c3769vh, String str) {
        int iOptInt = this.f8719b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f8719b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f8719b.optBoolean(C3109f9.f8521H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadM8932a = m8932a(new C3036db(c3769vh, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, m8933b()), this.f8718a);
        this.f8720c = threadM8932a;
        threadM8932a.start();
    }

    @Override // com.ironsource.InterfaceC3801wf
    /* renamed from: a */
    public void mo8938a(C3769vh c3769vh, String str, int i, int i2) {
        m8934b(c3769vh, str, i, i2, this.f8718a).start();
    }

    @Override // com.ironsource.InterfaceC3801wf
    /* renamed from: a */
    public void mo8939a(C3769vh c3769vh, String str, int i, int i2, Handler handler) {
        m8934b(c3769vh, str, i, i2, handler).start();
    }
}

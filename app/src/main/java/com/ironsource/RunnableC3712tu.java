package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* renamed from: com.ironsource.tu */
/* loaded from: classes2.dex */
class RunnableC3712tu implements Runnable {

    /* renamed from: a */
    private final Handler f12104a;

    /* renamed from: b */
    private final C3036db f12105b;

    public RunnableC3712tu(C3036db c3036db, Handler handler) {
        this.f12105b = c3036db;
        this.f12104a = handler;
    }

    /* renamed from: a */
    public Message m12486a() {
        return new Message();
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        int iM8464b;
        C3769vh c3769vh = new C3769vh(this.f12105b.m8290b().getParent(), this.f12105b.m8290b().getName());
        Message messageM12486a = m12486a();
        messageM12486a.obj = c3769vh;
        String strM12488a = m12488a(c3769vh.getParent());
        if (strM12488a == null) {
            iM8464b = 1020;
        } else {
            C3071eb c3071ebCall = m12487a(new C3036db(c3769vh, this.f12105b.m8293e(), this.f12105b.m8289a(), this.f12105b.m8291c(), this.f12105b.m8294f(), this.f12105b.m8292d()), strM12488a, 3L).call();
            iM8464b = c3071ebCall.m8464b() == 200 ? 1016 : c3071ebCall.m8464b();
        }
        messageM12486a.what = iM8464b;
        this.f12104a.sendMessage(messageM12486a);
    }

    /* renamed from: a */
    public CallableC3900zc m12487a(C3036db c3036db, String str, long j) {
        return new CallableC3900zc(c3036db, str, j);
    }

    /* renamed from: a */
    public String m12488a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}

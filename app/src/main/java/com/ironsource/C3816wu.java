package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C3399d;

/* renamed from: com.ironsource.wu */
/* loaded from: classes2.dex */
public class C3816wu extends Thread {

    /* renamed from: b */
    private static C3816wu f12539b;

    /* renamed from: a */
    private a f12540a;

    /* renamed from: com.ironsource.wu$a */
    public class a extends HandlerThread {

        /* renamed from: a */
        private Handler f12541a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C3399d());
        }

        /* renamed from: a */
        public Handler m12972a() {
            return this.f12541a;
        }

        /* renamed from: b */
        public void m12973b() {
            this.f12541a = new Handler(getLooper());
        }
    }

    private C3816wu() {
        a aVar = new a(getClass().getSimpleName());
        this.f12540a = aVar;
        aVar.start();
        this.f12540a.m12973b();
    }

    /* renamed from: a */
    public static synchronized C3816wu m12970a() {
        try {
            if (f12539b == null) {
                f12539b = new C3816wu();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12539b;
    }

    /* renamed from: a */
    public synchronized void m12971a(Runnable runnable) {
        a aVar = this.f12540a;
        if (aVar == null) {
            return;
        }
        Handler handlerM12972a = aVar.m12972a();
        if (handlerM12972a != null) {
            handlerM12972a.post(runnable);
        }
    }
}

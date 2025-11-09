package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.Date;

/* renamed from: com.ironsource.an */
/* loaded from: classes2.dex */
public class C2943an implements SegmentListener {

    /* renamed from: a */
    private SegmentListener f7548a;

    /* renamed from: b */
    private final b f7549b;

    /* renamed from: c */
    protected long f7550c;

    /* renamed from: com.ironsource.an$b */
    public class b extends Thread {

        /* renamed from: a */
        private Handler f7551a;

        private b() {
        }

        /* renamed from: a */
        public Handler m7827a() {
            return this.f7551a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f7551a = new Handler();
            Looper.loop();
        }
    }

    public C2943an() {
        b bVar = new b();
        this.f7549b = bVar;
        bVar.start();
        this.f7550c = new Date().getTime();
    }

    /* renamed from: a */
    public void m7824a(SegmentListener segmentListener) {
        this.f7548a = segmentListener;
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public void onSegmentReceived(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, OooO0oO.OooOo.OooOO0O("onSegmentReceived(", str, ")"), 1);
        if (m7826a((Object) this.f7548a)) {
            m7825a((Runnable) new o00000O0(2, this, str));
        }
    }

    /* renamed from: a */
    public void m7825a(Runnable runnable) {
        Handler handlerM7827a;
        b bVar = this.f7549b;
        if (bVar == null || (handlerM7827a = bVar.m7827a()) == null) {
            return;
        }
        handlerM7827a.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m7823a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f7548a.onSegmentReceived(str);
    }

    /* renamed from: a */
    public boolean m7826a(Object obj) {
        return (obj == null || this.f7549b == null) ? false : true;
    }
}

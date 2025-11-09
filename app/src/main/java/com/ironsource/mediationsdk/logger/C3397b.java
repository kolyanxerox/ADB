package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.b */
/* loaded from: classes2.dex */
public class C3397b extends IronSourceLogger {

    /* renamed from: e */
    private static final String f9895e = "publisher";

    /* renamed from: c */
    private LogListener f9896c;

    /* renamed from: d */
    private boolean f9897d;

    /* renamed from: com.ironsource.mediationsdk.logger.b$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9898a;

        /* renamed from: b */
        final /* synthetic */ IronSourceLogger.IronSourceTag f9899b;

        /* renamed from: c */
        final /* synthetic */ int f9900c;

        public a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i) {
            this.f9898a = str;
            this.f9899b = ironSourceTag;
            this.f9900c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3397b.this.f9896c == null || this.f9898a == null) {
                return;
            }
            C3397b.this.f9896c.onLog(this.f9899b, this.f9898a, this.f9900c);
        }
    }

    private C3397b() {
        super("publisher");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        a aVar = new a(str, ironSourceTag, i);
        if (this.f9897d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }

    public C3397b(LogListener logListener, int i) {
        super("publisher", i);
        this.f9896c = logListener;
        this.f9897d = false;
    }

    /* renamed from: a */
    public void m10382a(LogListener logListener) {
        this.f9896c = logListener;
    }

    /* renamed from: a */
    public void m10383a(boolean z) {
        this.f9897d = z;
    }
}

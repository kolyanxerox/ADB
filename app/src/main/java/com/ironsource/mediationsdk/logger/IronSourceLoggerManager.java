package com.ironsource.mediationsdk.logger;

import com.ironsource.C3424mm;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {

    /* renamed from: d */
    private static volatile IronSourceLoggerManager f9891d;

    /* renamed from: c */
    private final List<IronSourceLogger> f9892c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f9892c = new CopyOnWriteArrayList();
        m10378c();
    }

    /* renamed from: a */
    private IronSourceLogger m10376a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f9892c) {
            if (ironSourceLogger.m10375b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m10378c() {
        this.f9892c.add(new C3396a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (f9891d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (f9891d == null) {
                        f9891d = new IronSourceLoggerManager("IronSourceLoggerManager");
                    }
                } finally {
                }
            }
        }
        return f9891d;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f9892c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (m10377a(i)) {
            return;
        }
        m10380a(ironSourceTag, str, i);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th == null) {
            Iterator<IronSourceLogger> it = this.f9892c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f9892c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerM10376a = m10376a(str);
        if (ironSourceLoggerM10376a == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            return;
        }
        if (i < 0 || i > 3) {
            this.f9892c.remove(ironSourceLoggerM10376a);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        ironSourceLoggerM10376a.setDebugLevel(i);
    }

    private IronSourceLoggerManager(String str, int i) {
        super(str, i);
        this.f9892c = new CopyOnWriteArrayList();
        m10378c();
    }

    public static IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager logger = getLogger();
        logger.f9887a = i;
        return logger;
    }

    /* renamed from: a */
    public void m10379a(IronSourceLogger.IronSourceTag ironSourceTag, C3424mm c3424mm) {
        if (m10377a(c3424mm.m10866a())) {
            return;
        }
        m10380a(ironSourceTag, c3424mm.m10867c(), c3424mm.m10866a());
    }

    /* renamed from: a */
    public void m10380a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        for (IronSourceLogger ironSourceLogger : this.f9892c) {
            if (ironSourceLogger.m10374a() <= i) {
                ironSourceLogger.log(ironSourceTag, str, i);
            }
        }
    }

    /* renamed from: a */
    private boolean m10377a(int i) {
        return i < this.f9887a;
    }
}

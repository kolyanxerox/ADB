package com.ironsource.mediationsdk.logger;

import com.ironsource.C3424mm;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes2.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* renamed from: a */
    IronSourceLogger.IronSourceTag f9884a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f9884a = ironSourceTag;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm("", 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm("", 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm(str, 3));
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().m10379a(this.f9884a, new C3424mm(str, 2));
    }
}

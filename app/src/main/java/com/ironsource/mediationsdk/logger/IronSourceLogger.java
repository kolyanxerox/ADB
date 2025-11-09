package com.ironsource.mediationsdk.logger;

/* loaded from: classes2.dex */
public abstract class IronSourceLogger {

    /* renamed from: a */
    int f9887a;

    /* renamed from: b */
    private String f9888b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public IronSourceLogger(String str) {
        this.f9888b = str;
        this.f9887a = 0;
    }

    /* renamed from: a */
    public int m10374a() {
        return this.f9887a;
    }

    /* renamed from: b */
    public String m10375b() {
        return this.f9888b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f9888b;
            if (str != null && str.equals(ironSourceLogger.f9888b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i) {
        this.f9887a = i;
    }

    public IronSourceLogger(String str, int i) {
        this.f9888b = str;
        this.f9887a = i;
    }
}

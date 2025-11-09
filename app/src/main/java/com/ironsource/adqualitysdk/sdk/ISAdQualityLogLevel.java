package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes2.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ﻛ */
    private final int f4393;

    ISAdQualityLogLevel(int i) {
        this.f4393 = i;
    }

    public static ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }

    public final int getValue() {
        return this.f4393;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f4393;
        return i != NONE.f4393 && i >= iSAdQualityLogLevel.f4393;
    }
}

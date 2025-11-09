package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes2.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ﻛ */
    private final int f4389;

    ISAdQualityDeviceIdType(int i) {
        this.f4389 = i;
    }

    public static ISAdQualityDeviceIdType fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return GAID;
        }
        if (i != 2) {
            return null;
        }
        return IDFA;
    }

    public final int getValue() {
        return this.f4389;
    }
}

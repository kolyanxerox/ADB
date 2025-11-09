package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public enum o000000 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(OooOOO0.class, OooOOO0.f28025OooOo0o),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Serializable f28071OooOo0O;

    o000000(Class cls, Serializable serializable) {
        this.f28071OooOo0O = serializable;
    }
}

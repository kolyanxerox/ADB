package com.applovin.shadow.okio;

import kotlin.jvm.internal.OooOo;

/* renamed from: com.applovin.shadow.okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(String string) {
        OooOo.OooO0o0(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    public final long size(String string, int i, int i2) {
        OooOo.OooO0o0(string, "string");
        return Utf8.size(string, i, i2);
    }
}

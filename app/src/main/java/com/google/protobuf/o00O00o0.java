package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class o00O00o0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int[] f28257OooO00o;

    static {
        int[] iArr = new int[WireFormat.JavaType.values().length];
        f28257OooO00o = iArr;
        try {
            iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f28257OooO00o[WireFormat.JavaType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

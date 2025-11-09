package com.google.protobuf;

import com.google.protobuf.WireFormat;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class o00OOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int[] f28277OooO00o;

    static {
        int[] iArr = new int[WireFormat.FieldType.values().length];
        f28277OooO00o = iArr;
        try {
            iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f28277OooO00o[WireFormat.FieldType.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f28277OooO00o[WireFormat.FieldType.GROUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

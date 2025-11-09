package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class o0OO000 implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o0OO000 f28353OooO00o = new o0OO000();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return Syntax.forNumber(i) != null;
    }
}

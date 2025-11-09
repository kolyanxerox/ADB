package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class o000OOo0 implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o000OOo0 f28223OooO00o = new o000OOo0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return Field.Kind.forNumber(i) != null;
    }
}

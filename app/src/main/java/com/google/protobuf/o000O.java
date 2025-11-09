package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class o000O implements Internal.EnumVerifier {

    /* renamed from: OooO00o */
    public static final o000O f28211OooO00o = new o000O();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return Field.Cardinality.forNumber(i) != null;
    }
}

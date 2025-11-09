package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public final class o000O0O0 implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return Field.Cardinality.forNumber(i);
    }
}

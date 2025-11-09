package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueKt;

/* loaded from: classes2.dex */
public final class UInt64ValueKtKt {
    /* renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final UInt64Value m13735initializeuInt64Value(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builderNewBuilder = UInt64Value.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(uInt64Value, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builder = uInt64Value.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

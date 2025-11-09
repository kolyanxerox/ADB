package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueKt;

/* loaded from: classes2.dex */
public final class EnumValueKtKt {
    /* renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m13719initializeenumValue(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builderNewBuilder = EnumValue.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(enumValue, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builder = enumValue.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

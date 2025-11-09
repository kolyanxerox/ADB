package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;

/* loaded from: classes2.dex */
public final class FieldKtKt {
    /* renamed from: -initializefield, reason: not valid java name */
    public static final Field m13720initializefield(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builderNewBuilder = Field.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Field copy(Field field, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(field, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

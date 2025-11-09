package com.google.protobuf;

import com.google.protobuf.Struct;
import com.google.protobuf.StructKt;

/* loaded from: classes2.dex */
public final class StructKtKt {
    /* renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m13731initializestruct(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        StructKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Struct copy(Struct struct, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(struct, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builder = struct.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        StructKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

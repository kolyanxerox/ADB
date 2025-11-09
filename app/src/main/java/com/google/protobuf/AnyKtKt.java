package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.AnyKt;

/* loaded from: classes2.dex */
public final class AnyKtKt {
    /* renamed from: -initializeany, reason: not valid java name */
    public static final Any m13711initializeany(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builderNewBuilder = Any.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any copy(Any any, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(any, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builder = any.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

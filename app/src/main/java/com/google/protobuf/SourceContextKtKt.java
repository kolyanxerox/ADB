package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextKt;

/* loaded from: classes2.dex */
public final class SourceContextKtKt {
    /* renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m13729initializesourceContext(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builderNewBuilder = SourceContext.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(sourceContext, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

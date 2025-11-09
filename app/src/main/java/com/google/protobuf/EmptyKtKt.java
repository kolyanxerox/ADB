package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;

/* loaded from: classes2.dex */
public final class EmptyKtKt {
    /* renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m13717initializeempty(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builderNewBuilder = Empty.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Empty copy(Empty empty, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(empty, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

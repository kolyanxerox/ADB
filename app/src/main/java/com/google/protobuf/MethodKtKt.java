package com.google.protobuf;

import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;

/* loaded from: classes2.dex */
public final class MethodKtKt {
    /* renamed from: -initializemethod, reason: not valid java name */
    public static final Method m13726initializemethod(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builderNewBuilder = Method.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Method copy(Method method, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(method, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builder = method.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

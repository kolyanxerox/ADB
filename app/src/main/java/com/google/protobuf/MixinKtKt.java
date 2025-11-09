package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;

/* loaded from: classes2.dex */
public final class MixinKtKt {
    /* renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m13727initializemixin(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builderNewBuilder = Mixin.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Mixin copy(Mixin mixin, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(mixin, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builder = mixin.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

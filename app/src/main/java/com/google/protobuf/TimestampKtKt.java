package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;

/* loaded from: classes2.dex */
public final class TimestampKtKt {
    /* renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m13732initializetimestamp(o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builderNewBuilder = Timestamp.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, o00O0Oo.Oooo000 block) {
        kotlin.jvm.internal.OooOo.OooO0o0(timestamp, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builder, "this.toBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}

package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, ExtensionLite<M, ?> extension) {
        OooOo.OooO0o0(morbt, "<this>");
        OooOo.OooO0o0(extension, "extension");
        return morbt.hasExtension(extension);
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, ExtensionLite<M, T> extension) {
        OooOo.OooO0o0(morbt, "<this>");
        OooOo.OooO0o0(extension, "extension");
        T t = (T) morbt.getExtension(extension);
        OooOo.OooO0Oo(t, "getExtension(extension)");
        return t;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b, ExtensionLite<M, T> extension, T value) {
        OooOo.OooO0o0(b, "<this>");
        OooOo.OooO0o0(extension, "extension");
        OooOo.OooO0o0(value, "value");
        b.setExtension(extension, value);
    }
}

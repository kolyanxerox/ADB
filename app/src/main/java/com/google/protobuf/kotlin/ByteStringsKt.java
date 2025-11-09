package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i) {
        OooOo.OooO0o0(byteString, "<this>");
        return byteString.byteAt(i);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString other) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(other, "other");
        ByteString byteStringConcat = byteString.concat(other);
        OooOo.OooO0Oo(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        OooOo.OooO0o0(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        OooOo.OooO0Oo(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        OooOo.OooO0o0(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        OooOo.OooO0Oo(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        OooOo.OooO0o0(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        OooOo.OooO0Oo(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }
}

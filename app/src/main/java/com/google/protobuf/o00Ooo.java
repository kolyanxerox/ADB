package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class o00Ooo extends ByteString {
    public abstract boolean OooO0o0(o00Ooo o00ooo2, int i, int i2);

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return byteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return super.iterator2();
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) throws IOException {
        writeTo(byteOutput);
    }
}

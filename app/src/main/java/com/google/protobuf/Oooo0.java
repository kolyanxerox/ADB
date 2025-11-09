package com.google.protobuf;

import com.google.protobuf.ByteString;

/* loaded from: classes2.dex */
public abstract class Oooo0 implements ByteString.ByteIterator {
    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

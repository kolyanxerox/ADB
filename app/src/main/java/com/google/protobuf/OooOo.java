package com.google.protobuf;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class OooOo extends Oooo0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ByteString f28172OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f28173OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f28174OooOo0o;

    public OooOo(ByteString byteString) {
        this.f28172OooOo = byteString;
        this.f28174OooOo0o = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28173OooOo0O < this.f28174OooOo0o;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        int i = this.f28173OooOo0O;
        if (i >= this.f28174OooOo0o) {
            throw new NoSuchElementException();
        }
        this.f28173OooOo0O = i + 1;
        return this.f28172OooOo.internalByteAt(i);
    }
}

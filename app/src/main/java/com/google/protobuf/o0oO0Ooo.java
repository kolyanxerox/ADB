package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o0oO0Ooo extends Oooo0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0O00o00 f28404OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public ByteString.ByteIterator f28405OooOo0o = OooO00o();

    public o0oO0Ooo(o0O0O0O o0o0o0o) {
        this.f28404OooOo0O = new o0O00o00(o0o0o0o);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator OooO00o() {
        o0O00o00 o0o00o00 = this.f28404OooOo0O;
        if (o0o00o00.hasNext()) {
            return o0o00o00.next().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28405OooOo0o != null;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        ByteString.ByteIterator byteIterator = this.f28405OooOo0o;
        if (byteIterator == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = byteIterator.nextByte();
        if (!this.f28405OooOo0o.hasNext()) {
            this.f28405OooOo0o = OooO00o();
        }
        return bNextByte;
    }
}

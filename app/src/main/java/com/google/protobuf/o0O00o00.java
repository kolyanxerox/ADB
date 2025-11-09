package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o0O00o00 implements Iterator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ArrayDeque f28301OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public o00Ooo f28302OooOo0o;

    public o0O00o00(ByteString byteString) {
        if (!(byteString instanceof o0O0O0O)) {
            this.f28301OooOo0O = null;
            this.f28302OooOo0o = (o00Ooo) byteString;
            return;
        }
        o0O0O0O o0o0o0o = (o0O0O0O) byteString;
        ArrayDeque arrayDeque = new ArrayDeque(o0o0o0o.f28315OooOoO);
        this.f28301OooOo0O = arrayDeque;
        arrayDeque.push(o0o0o0o);
        ByteString byteString2 = o0o0o0o.f28314OooOo0o;
        while (byteString2 instanceof o0O0O0O) {
            o0O0O0O o0o0o0o2 = (o0O0O0O) byteString2;
            this.f28301OooOo0O.push(o0o0o0o2);
            byteString2 = o0o0o0o2.f28314OooOo0o;
        }
        this.f28302OooOo0o = (o00Ooo) byteString2;
    }

    @Override // java.util.Iterator
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final o00Ooo next() {
        o00Ooo o00ooo2;
        o00Ooo o00ooo3 = this.f28302OooOo0o;
        if (o00ooo3 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f28301OooOo0O;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                o00ooo2 = null;
                break;
            }
            ByteString byteString = ((o0O0O0O) arrayDeque.pop()).f28312OooOo;
            while (byteString instanceof o0O0O0O) {
                o0O0O0O o0o0o0o = (o0O0O0O) byteString;
                arrayDeque.push(o0o0o0o);
                byteString = o0o0o0o.f28314OooOo0o;
            }
            o00ooo2 = (o00Ooo) byteString;
        } while (o00ooo2.isEmpty());
        this.f28302OooOo0o = o00ooo2;
        return o00ooo3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28302OooOo0o != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

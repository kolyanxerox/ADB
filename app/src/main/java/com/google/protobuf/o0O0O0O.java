package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o0O0O0O extends ByteString {

    /* renamed from: OooOoOO */
    public static final int[] f28311OooOoOO = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: OooOo */
    public final ByteString f28312OooOo;

    /* renamed from: OooOo0O */
    public final int f28313OooOo0O;

    /* renamed from: OooOo0o */
    public final ByteString f28314OooOo0o;

    /* renamed from: OooOoO */
    public final int f28315OooOoO;

    /* renamed from: OooOoO0 */
    public final int f28316OooOoO0;

    public o0O0O0O(ByteString byteString, ByteString byteString2) {
        this.f28314OooOo0o = byteString;
        this.f28312OooOo = byteString2;
        int size = byteString.size();
        this.f28316OooOoO0 = size;
        this.f28313OooOo0O = byteString2.size() + size;
        this.f28315OooOoO = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int OooO0o0(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return f28311OooOoOO[i];
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        o00Ooo o00ooo2;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f28315OooOoO);
        arrayDeque.push(this);
        ByteString byteString = this.f28314OooOo0o;
        while (byteString instanceof o0O0O0O) {
            o0O0O0O o0o0o0o = (o0O0O0O) byteString;
            arrayDeque.push(o0o0o0o);
            byteString = o0o0o0o.f28314OooOo0o;
        }
        o00Ooo o00ooo3 = (o00Ooo) byteString;
        while (true) {
            if (!(o00ooo3 != null)) {
                return arrayList;
            }
            if (o00ooo3 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    o00ooo2 = null;
                    break;
                }
                ByteString byteString2 = ((o0O0O0O) arrayDeque.pop()).f28312OooOo;
                while (byteString2 instanceof o0O0O0O) {
                    o0O0O0O o0o0o0o2 = (o0O0O0O) byteString2;
                    arrayDeque.push(o0o0o0o2);
                    byteString2 = o0o0o0o2.f28314OooOo0o;
                }
                o00ooo2 = (o00Ooo) byteString2;
                if (!o00ooo2.isEmpty()) {
                    break;
                }
            }
            arrayList.add(o00ooo3.asReadOnlyByteBuffer());
            o00ooo3 = o00ooo2;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i) {
        ByteString.checkIndex(i, this.f28313OooOo0O);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.f28314OooOo0o.copyTo(byteBuffer);
        this.f28312OooOo.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        ByteString byteString = this.f28314OooOo0o;
        int i5 = this.f28316OooOoO0;
        if (i4 <= i5) {
            byteString.copyToInternal(bArr, i, i2, i3);
            return;
        }
        ByteString byteString2 = this.f28312OooOo;
        if (i >= i5) {
            byteString2.copyToInternal(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        byteString.copyToInternal(bArr, i, i2, i6);
        byteString2.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i = this.f28313OooOo0O;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                int iPeekCachedHashCode = peekCachedHashCode();
                int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
                if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                    o0O00o00 o0o00o00 = new o0O00o00(this);
                    o00Ooo next = o0o00o00.next();
                    o0O00o00 o0o00o002 = new o0O00o00(byteString);
                    o00Ooo next2 = o0o00o002.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int size2 = next.size() - i2;
                        int size3 = next2.size() - i3;
                        int iMin = Math.min(size2, size3);
                        if (!(i2 == 0 ? next.OooO0o0(next2, i3, iMin) : next2.OooO0o0(next, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            next = o0o00o00.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == size3) {
                            next2 = o0o00o002.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.f28315OooOoO;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i) {
        int i2 = this.f28316OooOoO0;
        return i < i2 ? this.f28314OooOo0o.internalByteAt(i) : this.f28312OooOo.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return this.f28313OooOo0O >= OooO0o0(this.f28315OooOoO);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f28314OooOo0o.partialIsValidUtf8(0, 0, this.f28316OooOoO0);
        ByteString byteString = this.f28312OooOo;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new o0oO0Ooo(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new o0O00oO0(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f28314OooOo0o;
        int i5 = this.f28316OooOoO0;
        if (i4 <= i5) {
            return byteString.partialHash(i, i2, i3);
        }
        ByteString byteString2 = this.f28312OooOo;
        if (i2 >= i5) {
            return byteString2.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialHash(byteString.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        ByteString byteString = this.f28314OooOo0o;
        int i5 = this.f28316OooOoO0;
        if (i4 <= i5) {
            return byteString.partialIsValidUtf8(i, i2, i3);
        }
        ByteString byteString2 = this.f28312OooOo;
        if (i2 >= i5) {
            return byteString2.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f28313OooOo0O;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int i3 = this.f28313OooOo0O;
        int iCheckRange = ByteString.checkRange(i, i2, i3);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == i3) {
            return this;
        }
        ByteString byteString = this.f28314OooOo0o;
        int i4 = this.f28316OooOoO0;
        if (i2 <= i4) {
            return byteString.substring(i, i2);
        }
        ByteString byteString2 = this.f28312OooOo;
        return i >= i4 ? byteString2.substring(i - i4, i2 - i4) : new o0O0O0O(byteString.substring(i), byteString2.substring(0, i2 - i4));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.f28314OooOo0o.writeTo(outputStream);
        this.f28312OooOo.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        ByteString byteString = this.f28314OooOo0o;
        int i4 = this.f28316OooOoO0;
        if (i3 <= i4) {
            byteString.writeToInternal(outputStream, i, i2);
            return;
        }
        ByteString byteString2 = this.f28312OooOo;
        if (i >= i4) {
            byteString2.writeToInternal(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        byteString.writeToInternal(outputStream, i, i5);
        byteString2.writeToInternal(outputStream, 0, i2 - i5);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.f28312OooOo.writeToReverse(byteOutput);
        this.f28314OooOo0o.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new o0oO0Ooo(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        this.f28314OooOo0o.writeTo(byteOutput);
        this.f28312OooOo.writeTo(byteOutput);
    }
}

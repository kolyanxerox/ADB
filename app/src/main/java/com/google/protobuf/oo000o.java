package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class oo000o extends o00Ooo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final byte[] f28428OooOo0O;

    public oo000o(byte[] bArr) {
        bArr.getClass();
        this.f28428OooOo0O = bArr;
    }

    public int OooO0o() {
        return 0;
    }

    @Override // com.google.protobuf.o00Ooo
    public final boolean OooO0o0(o00Ooo o00ooo2, int i, int i2) {
        if (i2 > o00ooo2.size()) {
            throw new IllegalArgumentException("Length too large: " + i2 + size());
        }
        int i3 = i + i2;
        if (i3 > o00ooo2.size()) {
            StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("Ran off end of other: ", i, ", ", i2, ", ");
            sbOooOo0o.append(o00ooo2.size());
            throw new IllegalArgumentException(sbOooOo0o.toString());
        }
        if (!(o00ooo2 instanceof oo000o)) {
            return o00ooo2.substring(i, i3).equals(substring(0, i2));
        }
        oo000o oo000oVar = (oo000o) o00ooo2;
        int iOooO0o = OooO0o() + i2;
        int iOooO0o2 = OooO0o();
        int iOooO0o3 = oo000oVar.OooO0o() + i;
        while (iOooO0o2 < iOooO0o) {
            if (this.f28428OooOo0O[iOooO0o2] != oo000oVar.f28428OooOo0O[iOooO0o3]) {
                return false;
            }
            iOooO0o2++;
            iOooO0o3++;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.f28428OooOo0O, OooO0o(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i) {
        return this.f28428OooOo0O[i];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f28428OooOo0O, OooO0o(), size());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f28428OooOo0O, i, bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof oo000o)) {
                return obj.equals(this);
            }
            oo000o oo000oVar = (oo000o) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = oo000oVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return OooO0o0(oo000oVar, 0, size());
            }
        }
        return false;
    }

    @Override // com.google.protobuf.o00Ooo, com.google.protobuf.ByteString
    public byte internalByteAt(int i) {
        return this.f28428OooOo0O[i];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iOooO0o = OooO0o();
        return o0OOO0OO.f28370OooO00o.OooOO0(this.f28428OooOo0O, iOooO0o, size() + iOooO0o);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f28428OooOo0O, OooO0o(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.f28428OooOo0O, OooO0o(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i, int i2, int i3) {
        return Internal.partialHash(i, this.f28428OooOo0O, OooO0o() + i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i, int i2, int i3) {
        int iOooO0o = OooO0o() + i2;
        return o0OOO0OO.f28370OooO00o.OooOO0o(i, this.f28428OooOo0O, iOooO0o, i3 + iOooO0o);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f28428OooOo0O.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, size());
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        return new o0OoOo0(this.f28428OooOo0O, OooO0o() + i, iCheckRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.f28428OooOo0O, OooO0o(), size(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f28428OooOo0O, OooO0o() + i, i2);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.f28428OooOo0O, OooO0o(), size());
    }
}

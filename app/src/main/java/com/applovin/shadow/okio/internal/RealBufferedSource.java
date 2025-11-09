package com.applovin.shadow.okio.internal;

import OooO00o.OooO00o;
import androidx.core.location.LocationRequestCompat;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.PeekSource;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.applovin.shadow.okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes2.dex */
public final class RealBufferedSource {
    public static final void commonClose(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte b, long j, long j2) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j, "fromIndex=", " toIndex=");
            sbOooOOo.append(j2);
            throw new IllegalArgumentException(sbOooOOo.toString().toString());
        }
        long jMax = j;
        while (jMax < j2) {
            byte b2 = b;
            long j3 = j2;
            long jIndexOf = realBufferedSource.bufferField.indexOf(b2, jMax, j3);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j3 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public static final long commonIndexOfElement(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, ByteString targetBytes, long j) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(targetBytes, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    public static final BufferedSource commonPeek(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j, ByteString bytes, int i, int i2) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!realBufferedSource.request(1 + j2) || realBufferedSource.bufferField.getByte(j2) != bytes.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Buffer sink, long j) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Sink sink) throws IOException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(sink, "sink");
        long j = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j;
        }
        long size = realBufferedSource.bufferField.size() + j;
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteArray(j);
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteString(j);
    }

    public static final long commonReadDecimalLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b;
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!realBufferedSource.request(j2)) {
                break;
            }
            b = realBufferedSource.bufferField.getByte(j);
            if ((b < 48 || b > 57) && !(j == 0 && b == 45)) {
                break;
            }
            j = j2;
        }
        if (j == 0) {
            OooO00o.OooO00o(16);
            OooO00o.OooO00o(16);
            String string = Integer.toString(b, 16);
            OooOo.OooO0Oo(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte[] sink) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i2 = buffer.read(sink, i, (int) buffer.size());
                if (i2 == -1) {
                    throw new AssertionError();
                }
                i += i2;
            }
            throw e;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b;
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!realBufferedSource.request(i2)) {
                break;
            }
            b = realBufferedSource.bufferField.getByte(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            OooO00o.OooO00o(16);
            OooO00o.OooO00o(16);
            String string = Integer.toString(b, 16);
            OooOo.OooO0Oo(string, "toString(this, checkRadix(radix))");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readUtf8(j);
    }

    public static final int commonReadUtf8CodePoint(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b = realBufferedSource.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "limit < 0: ").toString());
        }
        long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j2);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && realBufferedSource.request(j2) && realBufferedSource.bufferField.getByte(j2 - 1) == 13 && realBufferedSource.request(j2 + 1) && realBufferedSource.bufferField.getByte(j2) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j2);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Options options) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j) throws EOFException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j -= jMin;
        }
    }

    public static final Timeout commonTimeout(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        return realBufferedSource.source.timeout();
    }

    public static final String commonToString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    public static final byte[] commonReadByteArray(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final String commonReadUtf8(com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, Buffer sink, long j) throws IOException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(sink, "sink");
        try {
            realBufferedSource.require(j);
            realBufferedSource.bufferField.readFully(sink, j);
        } catch (EOFException e) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonIndexOf(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, ByteString bytes, long j) throws IOException {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(bytes, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - bytes.size()) + 1);
        }
    }

    public static final int commonRead(com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte[] sink, int i, int i2) {
        OooOo.OooO0o0(realBufferedSource, "<this>");
        OooOo.OooO0o0(sink, "sink");
        long j = i2;
        SegmentedByteString.checkOffsetAndCount(sink.length, i, j);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(sink, i, (int) Math.min(j, realBufferedSource.bufferField.size()));
    }
}

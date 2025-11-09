package org.apache.tika.p015io;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public class EndianUtils {
    private static final int LONG_SIZE = 8;

    public static class BufferUnderrunException extends TikaException {
        private static final long serialVersionUID = 8358288231138076276L;

        public BufferUnderrunException() {
            super("Insufficient data left in stream for required read");
        }
    }

    public static int getIntBE(byte[] bArr) {
        return getIntBE(bArr, 0);
    }

    public static int getIntLE(byte[] bArr) {
        return getIntLE(bArr, 0);
    }

    public static long getLongLE(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = i + 7; i2 >= i; i2--) {
            j = (j << 8) | (bArr[i2] & ForkServer.ERROR);
        }
        return j;
    }

    public static short getShortBE(byte[] bArr) {
        return getShortBE(bArr, 0);
    }

    public static short getShortLE(byte[] bArr) {
        return getShortLE(bArr, 0);
    }

    public static short getUByte(byte[] bArr, int i) {
        return (short) (bArr[i] & ForkServer.ERROR);
    }

    public static long getUIntBE(byte[] bArr) {
        return getUIntBE(bArr, 0);
    }

    public static long getUIntLE(byte[] bArr) {
        return getUIntLE(bArr, 0);
    }

    public static int getUShortBE(byte[] bArr) {
        return getUShortBE(bArr, 0);
    }

    public static int getUShortLE(byte[] bArr) {
        return getUShortLE(bArr, 0);
    }

    public static int readIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if ((i | i2 | i3 | i4) >= 0) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if ((i | i2 | i3 | i4) >= 0) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntME(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if ((i | i2 | i3 | i4) >= 0) {
            return (i2 << 24) + (i << 16) + (i4 << 8) + i3;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        int i7 = inputStream.read();
        int i8 = inputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) >= 0) {
            return (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        int i7 = inputStream.read();
        int i8 = inputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) >= 0) {
            return (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        throw new BufferUnderrunException();
    }

    public static short readShortBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        return (short) readUShortBE(inputStream);
    }

    public static short readShortLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        return (short) readUShortLE(inputStream);
    }

    public static long readUE7(InputStream inputStream) throws IOException {
        int i;
        long j = 0;
        int i2 = 0;
        while (true) {
            i = inputStream.read();
            if (i < 0) {
                break;
            }
            int i3 = i2 + 1;
            if (i2 >= 6) {
                break;
            }
            long j2 = j << 7;
            if ((i & 128) != 128) {
                j = j2 + i;
                break;
            }
            j = j2 + (i & 127);
            i2 = i3;
        }
        if (i >= 0) {
            return j;
        }
        throw new IOException("Buffer underun; expected one more byte");
    }

    public static long readUIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        if ((i | i2 | i3 | inputStream.read()) >= 0) {
            return ((i << 24) + (i2 << 16) + (i3 << 8) + r4) & KeyboardMap.kValueMask;
        }
        throw new BufferUnderrunException();
    }

    public static long readUIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        int i3 = inputStream.read();
        if ((i | i2 | i3 | inputStream.read()) >= 0) {
            return ((r4 << 24) + (i3 << 16) + (i2 << 8) + i) & KeyboardMap.kValueMask;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        if ((i | i2) >= 0) {
            return (i << 8) + i2;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i = inputStream.read();
        int i2 = inputStream.read();
        if ((i | i2) >= 0) {
            return (i2 << 8) + i;
        }
        throw new BufferUnderrunException();
    }

    public static int ubyteToInt(byte b) {
        return b & ForkServer.ERROR;
    }

    public static int getIntBE(byte[] bArr, int i) {
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        int i4 = bArr[i + 2] & ForkServer.ERROR;
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + (bArr[i + 3] & ForkServer.ERROR);
    }

    public static int getIntLE(byte[] bArr, int i) {
        int i2 = bArr[i] & ForkServer.ERROR;
        int i3 = bArr[i + 1] & ForkServer.ERROR;
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) + ((bArr[i + 2] & ForkServer.ERROR) << 16) + (i3 << 8) + i2;
    }

    public static short getShortBE(byte[] bArr, int i) {
        return (short) getUShortBE(bArr, i);
    }

    public static short getShortLE(byte[] bArr, int i) {
        return (short) getUShortLE(bArr, i);
    }

    public static long getUIntBE(byte[] bArr, int i) {
        return getIntBE(bArr, i) & KeyboardMap.kValueMask;
    }

    public static long getUIntLE(byte[] bArr, int i) {
        return getIntLE(bArr, i) & KeyboardMap.kValueMask;
    }

    public static int getUShortBE(byte[] bArr, int i) {
        int i2 = bArr[i] & ForkServer.ERROR;
        return (i2 << 8) + (bArr[i + 1] & ForkServer.ERROR);
    }

    public static int getUShortLE(byte[] bArr, int i) {
        return ((bArr[i + 1] & ForkServer.ERROR) << 8) + (bArr[i] & ForkServer.ERROR);
    }
}

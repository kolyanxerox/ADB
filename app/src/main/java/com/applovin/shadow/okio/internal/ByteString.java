package com.applovin.shadow.okio.internal;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.shadow.okio.Base64;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio._JvmPlatformKt;
import java.util.Arrays;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00O0oO.o0000O00;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.applovin.shadow.okio.internal.-ByteString */
/* loaded from: classes2.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:278:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x010a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0189, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01a5, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString other) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i2 = byteString.getByte(i) & ForkServer.ERROR;
            int i3 = other.getByte(i) & ForkServer.ERROR;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(com.applovin.shadow.okio.ByteString byteString, int i, byte[] target, int i2, int i3) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(target, "target");
        OooOOO.Oooo0O0(byteString.getData$okio(), i2, target, i, i3 + i);
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeBase64(String str) {
        OooOo.OooO0o0(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new com.applovin.shadow.okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    public static final com.applovin.shadow.okio.ByteString commonDecodeHex(String str) {
        OooOo.OooO0o0(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (decodeHexDigit(str.charAt(i2 + 1)) + (decodeHexDigit(str.charAt(i2)) << 4));
        }
        return new com.applovin.shadow.okio.ByteString(bArr);
    }

    public static final com.applovin.shadow.okio.ByteString commonEncodeUtf8(String str) {
        OooOo.OooO0o0(str, "<this>");
        com.applovin.shadow.okio.ByteString byteString = new com.applovin.shadow.okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString suffix) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.ByteString byteString, Object obj) {
        OooOo.OooO0o0(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof com.applovin.shadow.okio.ByteString) {
            com.applovin.shadow.okio.ByteString byteString2 = (com.applovin.shadow.okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(com.applovin.shadow.okio.ByteString byteString, int i) {
        OooOo.OooO0o0(byteString, "<this>");
        return byteString.getData$okio()[i];
    }

    public static final int commonGetSize(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    public static final String commonHex(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i = 0;
        for (byte b : byteString.getData$okio()) {
            int i2 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] other, int i) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(other, "other");
        int length = byteString.getData$okio().length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public static final byte[] commonInternalArray(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString other, int i) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i);
    }

    public static final com.applovin.shadow.okio.ByteString commonOf(byte[] data) {
        OooOo.OooO0o0(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        OooOo.OooO0Oo(bArrCopyOf, "copyOf(this, size)");
        return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i, com.applovin.shadow.okio.ByteString other, int i2, int i3) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(other, "other");
        return other.rangeEquals(i2, byteString.getData$okio(), i, i3);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, com.applovin.shadow.okio.ByteString prefix) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final com.applovin.shadow.okio.ByteString commonSubstring(com.applovin.shadow.okio.ByteString byteString, int i, int i2) {
        OooOo.OooO0o0(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOOO0(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter - i >= 0) {
            return (i == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new com.applovin.shadow.okio.ByteString(OooOOO.Oooo0oo(byteString.getData$okio(), i, iResolveDefaultParameter));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiLowercase(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b = byteString.getData$okio()[i];
            if (b >= 65 && b <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                OooOo.OooO0Oo(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final com.applovin.shadow.okio.ByteString commonToAsciiUppercase(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b = byteString.getData$okio()[i];
            if (b >= 97 && b <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                OooOo.OooO0Oo(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArrCopyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new com.applovin.shadow.okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    public static final byte[] commonToByteArray(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        OooOo.OooO0Oo(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public static final com.applovin.shadow.okio.ByteString commonToByteString(byte[] bArr, int i, int i2) {
        OooOo.OooO0o0(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i2);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
        return new com.applovin.shadow.okio.ByteString(OooOOO.Oooo0oo(bArr, i, iResolveDefaultParameter + i));
    }

    public static final String commonToString(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            OooOo.OooO0Oo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strOooo0 = o0000O00.Oooo0(o0000O00.Oooo0(o0000O00.Oooo0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return OooO00o.OooO0o(']', "[text=", strOooo0);
            }
            return "[size=" + byteString.getData$okio().length + " text=" + strOooo0 + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(byteString.getData$okio().length);
        sb.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOOO0(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString.getData$okio().length) {
            byteString = new com.applovin.shadow.okio.ByteString(OooOOO.Oooo0oo(byteString.getData$okio(), 0, iResolveDefaultParameter));
        }
        sb.append(byteString.hex());
        sb.append("…]");
        return sb.toString();
    }

    public static final String commonUtf8(com.applovin.shadow.okio.ByteString byteString) {
        OooOo.OooO0o0(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(com.applovin.shadow.okio.ByteString byteString, Buffer buffer, int i, int i2) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i, i2);
    }

    public static final int decodeHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final boolean commonEndsWith(com.applovin.shadow.okio.ByteString byteString, byte[] suffix) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(com.applovin.shadow.okio.ByteString byteString, byte[] other, int i) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(com.applovin.shadow.okio.ByteString byteString, int i, byte[] other, int i2, int i3) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(other, "other");
        return i >= 0 && i <= byteString.getData$okio().length - i3 && i2 >= 0 && i2 <= other.length - i3 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i, other, i2, i3);
    }

    public static final boolean commonStartsWith(com.applovin.shadow.okio.ByteString byteString, byte[] prefix) {
        OooOo.OooO0o0(byteString, "<this>");
        OooOo.OooO0o0(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }
}

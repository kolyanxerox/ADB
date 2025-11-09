package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3037dc;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.applovin.impl.s4 */
/* loaded from: classes.dex */
public abstract class AbstractC1188s4 {

    /* renamed from: a */
    private static final byte[] f1877a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* renamed from: b */
    private static final byte[] f1878b;

    /* renamed from: com.applovin.impl.s4$a */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* renamed from: a */
        private final int f1883a;

        a(int i) {
            this.f1883a = i;
        }

        /* renamed from: b */
        public int m2394b() {
            return this.f1883a;
        }

        /* renamed from: a */
        public static a m2392a(int i) {
            return i == 0 ? DEFAULT : i == 1 ? V2 : DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f1878b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    /* renamed from: a */
    public static byte[] m2381a(String str, long j, a aVar, String str2, C1220k c1220k) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() >= 86) {
            return TextUtils.isEmpty(str) ? new byte[0] : a.NONE == aVar ? str.getBytes() : a.V2 == aVar ? m2383a(str, j, false, str2, c1220k) : m2382a(str, j, str2, c1220k);
        }
        throw new IllegalArgumentException("SDK key is too short");
    }

    /* renamed from: b */
    public static String m2387b(String str, long j, a aVar, String str2, C1220k c1220k) {
        if (str2 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (str2.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrM2383a = a.V2 == aVar ? m2383a(str, j, true, str2, c1220k) : m2382a(str, j, str2, c1220k);
        if (bArrM2383a != null) {
            return new String(bArrM2383a);
        }
        return null;
    }

    /* renamed from: c */
    private static int m2390c(byte[] bArr, String str, C1220k c1220k) {
        int iM2375a;
        int i;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iM2375a = m2375a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = m2379a(f1878b, c1220k).getBytes();
        int i2 = iM2375a + 1;
        int length = bytes.length + i2;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i = length + 55) || bArr[i] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i2, bytes.length + i2), bytes)) {
            return 0;
        }
        int i3 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i3;
    }

    /* renamed from: a */
    private static byte[] m2382a(String str, long j, String str2, C1220k c1220k) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        char c = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArrM2384a = m2384a(strSubstring2, f1877a, c1220k);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j & 255)) ^ bArrM2384a[0]);
            char c2 = '\b';
            byteArrayOutputStream.write(((byte) ((j >> 8) & 255)) ^ bArrM2384a[1]);
            char c3 = 16;
            byteArrayOutputStream.write(((byte) ((j >> 16) & 255)) ^ bArrM2384a[2]);
            byteArrayOutputStream.write(((byte) ((j >> 24) & 255)) ^ bArrM2384a[3]);
            byteArrayOutputStream.write(((byte) ((j >> 32) & 255)) ^ bArrM2384a[4]);
            byteArrayOutputStream.write(((byte) ((j >> 40) & 255)) ^ bArrM2384a[5]);
            byteArrayOutputStream.write(((byte) ((j >> 48) & 255)) ^ bArrM2384a[6]);
            byteArrayOutputStream.write(((byte) ((j >> 56) & 255)) ^ bArrM2384a[7]);
            int i = 0;
            while (i < bytes.length) {
                char c4 = c2;
                char c5 = c3;
                long j2 = j + i;
                long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                long j5 = j4 ^ (j4 >> c);
                char c6 = c;
                byteArrayOutputStream.write((byte) (((i >= bytes.length ? b : bytes[i]) ^ bArrM2384a[i % bArrM2384a.length]) ^ (j5 & 255)));
                byteArrayOutputStream.write((byte) ((bArrM2384a[r4 % bArrM2384a.length] ^ (i + 1 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> c4) & 255)));
                byteArrayOutputStream.write((byte) ((bArrM2384a[r4 % bArrM2384a.length] ^ (i + 2 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> c5) & 255)));
                byteArrayOutputStream.write((byte) ((bArrM2384a[r4 % bArrM2384a.length] ^ (i + 3 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 24) & 255)));
                byteArrayOutputStream.write((byte) ((bArrM2384a[r4 % bArrM2384a.length] ^ (i + 4 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> c6) & 255)));
                byteArrayOutputStream.write((byte) ((bArrM2384a[r4 % bArrM2384a.length] ^ (i + 5 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 40) & 255)));
                byteArrayOutputStream.write((byte) ((bArrM2384a[r4 % bArrM2384a.length] ^ (i + 6 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 48) & 255)));
                byteArrayOutputStream.write((byte) ((bArrM2384a[r4 % bArrM2384a.length] ^ (i + 7 >= bytes.length ? (byte) 0 : bytes[r4])) ^ ((j5 >> 56) & 255)));
                i += 8;
                c2 = c4;
                c3 = c5;
                c = c6;
                b = 0;
            }
            String strM2391c = m2391c(byteArrayOutputStream.toByteArray());
            return ("1:" + m2379a(f1877a, c1220k) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strSubstring + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strM2391c).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            c1220k.m2832E().m2148a("AppLovinSdk", "encode", e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m2388b(byte[] bArr, String str, C1220k c1220k) {
        if (str != null) {
            if (str.length() < 86) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a aVarM2386b = m2386b(bArr);
            if (a.NONE == aVarM2386b) {
                return new String(bArr);
            }
            if (aVarM2386b == a.V2) {
                return m2380a(bArr, str, c1220k);
            }
            return m2377a(new String(bArr), str, c1220k);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    /* renamed from: c */
    private static String m2391c(byte[] bArr) {
        return m2378a(Base64.encode(bArr, 2));
    }

    /* renamed from: b */
    public static a m2386b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c = (char) bArr[0];
            if (c == '2') {
                return a.V2;
            }
            if (c == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    /* renamed from: b */
    private static byte[] m2389b(String str) {
        return Base64.decode(m2376a(str), 0);
    }

    /* renamed from: a */
    private static byte[] m2383a(String str, long j, boolean z, String str2, C1220k c1220k) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f1878b;
            byte[] bArrM2384a = m2384a(strSubstring2, bArr, c1220k);
            long jM1224c = AbstractC1078k7.m1224c(bArrM2384a) ^ j;
            byte[] bytes2 = ("2:" + m2379a(bArr, c1220k) + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strSubstring + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER).getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong((long) length);
            byteBufferAllocate2.putLong(jM1224c);
            byteBufferAllocate2.flip();
            byte[] bArrM2385a = m2385a(AbstractC1078k7.m1207a(bytes), j, bArrM2384a);
            if (z) {
                byte[] bytes3 = m2391c(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = m2391c(bArrM2385a).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrM2385a.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrM2385a);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e) {
            c1220k.m2832E().m2148a("AppLovinSdk", "encode2", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            c1220k.m2832E().m2148a("AppLovinSdk", "encode2", e2);
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m2385a(byte[] bArr, long j, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j2 = j;
        for (int i = 0; i < bArr.length; i++) {
            if (i % 8 == 0) {
                long j3 = i + j;
                long j4 = (j3 ^ (j3 >>> 33)) * (-4417276706812531889L);
                long j5 = (j4 ^ (j4 >>> 29)) * (-8796714831421723037L);
                j2 = j5 ^ (j5 >>> 32);
            }
            byte b = bArrCopyOf[i];
            bArrCopyOf[i] = (byte) (b ^ (((j2 >> (r4 * 8)) & 255) ^ bArr2[i % bArr2.length]));
        }
        return bArrCopyOf;
    }

    /* renamed from: a */
    private static String m2377a(String str, String str2, C1220k c1220k) throws NoSuchAlgorithmException, IOException {
        String str3;
        String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        try {
            try {
                if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                    return null;
                }
                String str4 = strArrSplit[1];
                char c = 2;
                String str5 = strArrSplit[2];
                char c2 = 3;
                byte[] bArrM2389b = m2389b(strArrSplit[3]);
                if (!str2.endsWith(str5)) {
                    return null;
                }
                byte[] bArr = f1877a;
                if (!m2379a(bArr, c1220k).equals(str4)) {
                    return null;
                }
                byte[] bArrM2384a = m2384a(str2.substring(0, 32), bArr, c1220k);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM2389b);
                char c3 = 5;
                str3 = null;
                char c4 = '(';
                try {
                    char c5 = 7;
                    long j = (((byteArrayInputStream.read() ^ bArrM2384a[1]) & 255) << 8) | ((byteArrayInputStream.read() ^ bArrM2384a[0]) & 255) | (((byteArrayInputStream.read() ^ bArrM2384a[2]) & 255) << 16) | (((byteArrayInputStream.read() ^ bArrM2384a[3]) & 255) << 24) | (((byteArrayInputStream.read() ^ bArrM2384a[4]) & 255) << 32) | (((byteArrayInputStream.read() ^ bArrM2384a[5]) & 255) << 40) | (((byteArrayInputStream.read() ^ bArrM2384a[6]) & 255) << 48) | (((byteArrayInputStream.read() ^ bArrM2384a[7]) & 255) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[8];
                    int i = byteArrayInputStream.read(bArr2);
                    int i2 = 0;
                    while (i >= 0) {
                        char c6 = c5;
                        long j2 = i2 + j;
                        long j3 = (j2 ^ (j2 >> 33)) * (-4417276706812531889L);
                        long j4 = (j3 ^ (j3 >> 29)) * (-8796714831421723037L);
                        long j5 = j4 ^ (j4 >> 32);
                        byteArrayOutputStream.write((byte) ((bArr2[0] ^ bArrM2384a[i2 % bArrM2384a.length]) ^ (j5 & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[1] ^ bArrM2384a[(i2 + 1) % bArrM2384a.length]) ^ ((j5 >> 8) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r23] ^ bArrM2384a[(i2 + 2) % bArrM2384a.length]) ^ ((j5 >> 16) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r27] ^ bArrM2384a[(i2 + 3) % bArrM2384a.length]) ^ ((j5 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[4] ^ bArrM2384a[(i2 + 4) % bArrM2384a.length]) ^ ((j5 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[r26] ^ bArrM2384a[(i2 + 5) % bArrM2384a.length]) ^ ((j5 >> r28) & 255)));
                        byteArrayOutputStream.write((byte) ((bArr2[6] ^ bArrM2384a[(i2 + 6) % bArrM2384a.length]) ^ ((j5 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((j5 >> 56) & 255) ^ (bArr2[c6] ^ bArrM2384a[(i2 + 7) % bArrM2384a.length])));
                        i2 += 8;
                        c = c;
                        c3 = c3;
                        c2 = c2;
                        c4 = c4;
                        i = byteArrayInputStream.read(bArr2);
                        c5 = c6;
                    }
                    return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                } catch (IOException e) {
                    e = e;
                    C1240o.m3202b("AppLovinSdk", "Failed to read bytes", e);
                    c1220k.m2832E().m2148a("AppLovinSdk", "decode", e);
                    return str3;
                }
            } catch (UnsupportedEncodingException e2) {
                c1220k.m2832E().m2148a("AppLovinSdk", "decode", e2);
                throw new RuntimeException("UTF-8 encoding not found", e2);
            }
        } catch (IOException e3) {
            e = e3;
            str3 = null;
        }
    }

    /* renamed from: a */
    private static String m2380a(byte[] bArr, String str, C1220k c1220k) throws NoSuchAlgorithmException {
        try {
            int iM2390c = m2390c(bArr, str, c1220k);
            if (iM2390c == 0) {
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iM2390c, bArr.length);
            if (bArrCopyOfRange.length < 16) {
                return null;
            }
            long jM1161a = AbstractC1078k7.m1161a(bArrCopyOfRange, 8);
            byte[] bArrM2384a = m2384a(str.substring(0, 32), f1878b, c1220k);
            return new String(AbstractC1078k7.m1235d(m2385a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jM1161a ^ AbstractC1078k7.m1224c(bArrM2384a), bArrM2384a)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            c1220k.m2832E().m2148a("AppLovinSdk", "decode2", e);
            throw new RuntimeException("UTF-8 encoding not found", e);
        } catch (IOException e2) {
            C1240o.m3202b("AppLovinSdk", "Failed to ungzip decode", e2);
            c1220k.m2832E().m2148a("AppLovinSdk", "decode2", e2);
            return null;
        }
    }

    /* renamed from: a */
    private static int m2375a(byte[] bArr, byte b) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == b) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static byte[] m2384a(String str, byte[] bArr, C1220k c1220k) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            c1220k.m2832E().m2148a("AppLovinSdk", "SHA256", e);
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    /* renamed from: a */
    private static String m2379a(byte[] bArr, C1220k c1220k) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            c1220k.m2832E().m2148a("AppLovinSdk", "SHA1", e);
            throw new RuntimeException("SHA-1 algorithm not found", e);
        }
    }

    /* renamed from: a */
    private static String m2376a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', C3037dc.f8244T);
    }

    /* renamed from: a */
    private static String m2378a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace(C3037dc.f8244T, '*');
    }
}

package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.apache.tika.utils.StringUtils;

/* renamed from: com.google.android.gms.internal.ads.p3 */
/* loaded from: classes2.dex */
public final class C1923p3 extends p11 {

    /* renamed from: OooOo, reason: collision with root package name */
    public MessageDigest f23188OooOo;

    public final byte[] o00000oo(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(StringUtils.SPACE);
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iOooO0OO = af0.OooO0OO(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iOooO0OO);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iOooO0OO2 = af0.OooO0OO(strArrSplit[i2]);
                    int i3 = (iOooO0OO2 >> 16) ^ ((char) iOooO0OO2);
                    byte b = (byte) i3;
                    byte b2 = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{b, b2}[0];
                    bArr[i4 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iOooO0OO3 = af0.OooO0OO(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iOooO0OO3 >> 24) ^ (((iOooO0OO3 & 255) ^ ((iOooO0OO3 >> 8) & 255)) ^ ((iOooO0OO3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f23188OooOo = o0OO00O();
        synchronized (this.f23178OooOo0O) {
            try {
                MessageDigest messageDigest = this.f23188OooOo;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f23188OooOo.update(bArrArray);
                byte[] bArrDigest = this.f23188OooOo.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

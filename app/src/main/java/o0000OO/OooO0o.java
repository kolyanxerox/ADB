package o0000Oo;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class OooO0o extends o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f29432OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f29433OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29434OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f29435OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f29436OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f29437OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final byte[] f29438OooO0oO;

    public OooO0o(byte[] bArr, String str, int i, String str2, int i2, int i3) throws GeneralSecurityException {
        if (!AbstractC2183w4.OooO00o(1)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        int length = bArr.length;
        if (length < 16 || length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        o0Oo0oo.OooO00o(i);
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException(OooO0oO.OooOo.OooO0o(i2, "tag size too small "));
        }
        if ((str2.equals("HmacSha1") && i2 > 20) || ((str2.equals("HmacSha256") && i2 > 32) || (str2.equals("HmacSha512") && i2 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        if (((i3 - i2) - i) - 8 <= 0) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f29438OooO0oO = Arrays.copyOf(bArr, bArr.length);
        this.f29436OooO0o = str;
        this.f29432OooO00o = i;
        this.f29433OooO0O0 = str2;
        this.f29434OooO0OO = i2;
        this.f29435OooO0Oo = i3;
        this.f29437OooO0o0 = i3 - i2;
    }

    public static byte[] OooO(OooO0o oooO0o, byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        oooO0o.getClass();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        if (0 > j || j >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0OO() {
        return OooO0o0();
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0Oo() {
        return this.f29435OooO0Oo;
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0o() {
        return this.f29437OooO0o0;
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0o0() {
        return this.f29432OooO00o + 8;
    }

    @Override // o0000Oo.o00O0O
    public final oo000o OooO0oO() {
        return new o000OO.o0OoOo0(this);
    }

    @Override // o0000Oo.o00O0O
    public final o00oO0o OooO0oo(byte[] bArr) {
        return new OooO0OO(this, bArr);
    }
}

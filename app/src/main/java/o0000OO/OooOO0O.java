package o0000Oo;

import OoooOOO.o0oOo0O0;
import com.google.android.gms.internal.ads.C1386ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes2.dex */
public final class OooOO0O extends o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f29445OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29446OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f29447OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f29448OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f29449OooO0o0;

    public OooOO0O(String str, byte[] bArr, int i, int i2) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i));
        }
        o0Oo0oo.OooO00o(i);
        if (i2 <= OooO0o0() + 16) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        this.f29449OooO0o0 = Arrays.copyOf(bArr, bArr.length);
        this.f29448OooO0Oo = str;
        this.f29445OooO00o = i;
        this.f29446OooO0O0 = i2;
        this.f29447OooO0OO = i2 - 16;
    }

    public static GCMParameterSpec OooO(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        if (0 > j || j >= 4294967296L) {
            throw new GeneralSecurityException("Index out of range");
        }
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0OO() {
        return OooO0o0();
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0Oo() {
        return this.f29446OooO0O0;
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0o() {
        return this.f29447OooO0OO;
    }

    @Override // o0000Oo.o00O0O
    public final int OooO0o0() {
        return this.f29445OooO00o + 8;
    }

    @Override // o0000Oo.o00O0O
    public final oo000o OooO0oO() {
        return new C1386ai(this);
    }

    @Override // o0000Oo.o00O0O
    public final o00oO0o OooO0oo(byte[] bArr) {
        return new o0oOo0O0(this, bArr);
    }
}

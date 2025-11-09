package o0000Oo;

import Oooo0oO.o00000;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class OooO0OO implements o00oO0o {

    /* renamed from: OooO00o */
    public final SecretKeySpec f29424OooO00o;

    /* renamed from: OooO0O0 */
    public final SecretKeySpec f29425OooO0O0;

    /* renamed from: OooO0OO */
    public final Cipher f29426OooO0OO = (Cipher) Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/CTR/NoPadding");

    /* renamed from: OooO0Oo */
    public final Mac f29427OooO0Oo;

    /* renamed from: OooO0o */
    public final ByteBuffer f29428OooO0o;

    /* renamed from: OooO0o0 */
    public final byte[] f29429OooO0o0;

    /* renamed from: OooO0oO */
    public long f29430OooO0oO;

    /* renamed from: OooO0oo */
    public final /* synthetic */ OooO0o f29431OooO0oo;

    public OooO0OO(OooO0o oooO0o, byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        this.f29431OooO0oo = oooO0o;
        this.f29430OooO0oO = 0L;
        oooO0o.getClass();
        Oooo000 oooo000 = Oooo0.f29464OooO0OO.f29465OooO00o;
        String str = oooO0o.f29433OooO0O0;
        this.f29427OooO0Oo = (Mac) oooo000.OooO00o(str);
        this.f29430OooO0oO = 0L;
        int i = oooO0o.f29432OooO00o;
        byte[] bArrOooO00o = o00Ooo.OooO00o(i);
        byte[] bArrOooO00o2 = o00Ooo.OooO00o(7);
        this.f29429OooO0o0 = bArrOooO00o2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(oooO0o.OooO0o0());
        this.f29428OooO0o = byteBufferAllocate;
        byteBufferAllocate.put((byte) oooO0o.OooO0o0());
        byteBufferAllocate.put(bArrOooO00o);
        byteBufferAllocate.put(bArrOooO00o2);
        byteBufferAllocate.flip();
        byte[] bArrOooO0O0 = o00000.OooO0O0(oooO0o.f29436OooO0o, oooO0o.f29438OooO0oO, bArrOooO00o, bArr, i + 32);
        this.f29424OooO00o = new SecretKeySpec(bArrOooO0O0, 0, i, "AES");
        this.f29425OooO0O0 = new SecretKeySpec(bArrOooO0O0, i, 32, str);
    }

    @Override // o0000Oo.o00oO0o
    public final ByteBuffer OooO00o() {
        return this.f29428OooO0o.asReadOnlyBuffer();
    }

    @Override // o0000Oo.o00oO0o
    public final synchronized void OooO0O0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        int iPosition = byteBuffer3.position();
        byte[] bArrOooO = OooO0o.OooO(this.f29431OooO0oo, this.f29429OooO0o0, this.f29430OooO0oO, false);
        this.f29426OooO0OO.init(1, this.f29424OooO00o, new IvParameterSpec(bArrOooO));
        this.f29430OooO0oO++;
        this.f29426OooO0OO.update(byteBuffer, byteBuffer3);
        this.f29426OooO0OO.doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        this.f29427OooO0Oo.init(this.f29425OooO0O0);
        this.f29427OooO0Oo.update(bArrOooO);
        this.f29427OooO0Oo.update(byteBufferDuplicate);
        byteBuffer3.put(this.f29427OooO0Oo.doFinal(), 0, this.f29431OooO0oo.f29434OooO0OO);
    }

    @Override // o0000Oo.o00oO0o
    public final synchronized void OooO0OO(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iPosition = byteBuffer2.position();
        byte[] bArrOooO = OooO0o.OooO(this.f29431OooO0oo, this.f29429OooO0o0, this.f29430OooO0oO, true);
        this.f29426OooO0OO.init(1, this.f29424OooO00o, new IvParameterSpec(bArrOooO));
        this.f29430OooO0oO++;
        this.f29426OooO0OO.doFinal(byteBuffer, byteBuffer2);
        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
        byteBufferDuplicate.flip();
        byteBufferDuplicate.position(iPosition);
        this.f29427OooO0Oo.init(this.f29425OooO0O0);
        this.f29427OooO0Oo.update(bArrOooO);
        this.f29427OooO0Oo.update(byteBufferDuplicate);
        byteBuffer2.put(this.f29427OooO0Oo.doFinal(), 0, this.f29431OooO0oo.f29434OooO0OO);
    }
}

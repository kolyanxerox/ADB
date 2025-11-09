package o0000;

import OoooOOO.o0o0000;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import o0000OOo.o00O00OO;

/* loaded from: classes2.dex */
public final class o0OO00O implements o00000oo.OooOOOO {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f28959OooO0OO = new byte[0];

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00O00OO f28960OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0O.OooO0O0 f28961OooO0O0;

    public o0OO00O(o00O00OO o00o00oo, o0000O0O.OooO0O0 oooO0O0) {
        this.f28960OooO00o = o00o00oo;
        this.f28961OooO0O0 = oooO0O0;
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws InterruptedException {
        com.google.crypto.tink.shaded.protobuf.OooO00o oooO00oOooO0oO;
        o00O00OO o00o00oo = this.f28960OooO00o;
        AtomicReference atomicReference = o00000oo.o0OOO0o.f29297OooO00o;
        synchronized (o00000oo.o0OOO0o.class) {
            try {
                o000OO.OooO oooO = ((o00000oo.Oooo0) o00000oo.o0OOO0o.f29297OooO00o.get()).OooO00o(o00o00oo.OooOoOO()).f29287OooO00o;
                Class cls = oooO.f30157OooO0OO;
                if (!oooO.f30156OooO0O0.keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + oooO.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) o00000oo.o0OOO0o.f29299OooO0OO.get(o00o00oo.OooOoOO())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + o00o00oo.OooOoOO());
                }
                com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoo02 = o00o00oo.OooOoo0();
                try {
                    o0o0000 o0o0000VarOooO0Oo = oooO.OooO0Oo();
                    com.google.crypto.tink.shaded.protobuf.OooO00o oooO00oOooO = o0o0000VarOooO0Oo.OooO(OooOoo02);
                    o0o0000VarOooO0Oo.OooOO0(oooO00oOooO);
                    oooO00oOooO0oO = o0o0000VarOooO0Oo.OooO0oO(oooO00oOooO);
                } catch (com.google.crypto.tink.shaded.protobuf.o000OOo e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) oooO.OooO0Oo().f14574OooOo0O).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrOooO0Oo = oooO00oOooO0oO.OooO0Oo();
        byte[] bArrOooO00o = this.f28961OooO0O0.OooO00o(bArrOooO0Oo, f28959OooO0OO);
        byte[] bArrOooO00o2 = ((o00000oo.OooOOOO) o00000oo.o0OOO0o.OooO0OO(this.f28960OooO00o.OooOoOO(), com.google.crypto.tink.shaded.protobuf.OooOOO0.OooO0oO(bArrOooO0Oo, 0, bArrOooO0Oo.length), o00000oo.OooOOOO.class)).OooO00o(bArr, bArr2);
        return ByteBuffer.allocate(bArrOooO00o.length + 4 + bArrOooO00o2.length).putInt(bArrOooO00o.length).put(bArrOooO00o).put(bArrOooO00o2).array();
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrOooO0O0 = this.f28961OooO0O0.OooO0O0(bArr3, f28959OooO0OO);
            String strOooOoOO = this.f28960OooO00o.OooOoOO();
            AtomicReference atomicReference = o00000oo.o0OOO0o.f29297OooO00o;
            com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
            return ((o00000oo.OooOOOO) o00000oo.o0OOO0o.OooO0OO(strOooOoOO, com.google.crypto.tink.shaded.protobuf.OooOOO0.OooO0oO(bArrOooO0O0, 0, bArrOooO0O0.length), o00000oo.OooOOOO.class)).OooO0O0(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}

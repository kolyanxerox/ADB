package o0000;

import OoooOOO.o0O00000;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class OooO0o implements o00000oo.OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Oooo.OooOo00 f28895OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00000 f28896OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00000 f28897OooO0OO;

    public OooO0o(Oooo.OooOo00 oooOo00) throws GeneralSecurityException {
        this.f28895OooO00o = oooOo00;
        boolean zIsEmpty = ((o0000OO.OooO00o) oooOo00.f13713OooOoO0).f29382OooO00o.isEmpty();
        o0O00000 o0o00000 = o000OO.o00O0O.f30178OooO00o;
        if (zIsEmpty) {
            this.f28896OooO0O0 = o0o00000;
            this.f28897OooO0OO = o0o00000;
            return;
        }
        o000OO.OooOO0 oooOO0 = (o000OO.OooOO0) o000OO.OooOO0O.f30163OooO0O0.f30165OooO00o.get();
        oooOO0 = oooOO0 == null ? o000OO.OooOO0O.f30164OooO0OO : oooOO0;
        o000OO.o00O0O.OooO00o(oooOo00);
        oooOO0.getClass();
        this.f28896OooO0O0 = o0o00000;
        this.f28897OooO0OO = o0o00000;
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        o0O00000 o0o00000 = this.f28896OooO0O0;
        Oooo.OooOo00 oooOo00 = this.f28895OooO00o;
        try {
            byte[] bArr3 = ((o00000oo.oo000o) oooOo00.f13710OooOo).f29304OooO0OO;
            byte[] bArrOooO0OO = OooO00o.OooO00o.OooO0OO(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((o00000oo.OooOOOO) ((o00000oo.oo000o) oooOo00.f13710OooOo).f29303OooO0O0).OooO00o(bArr, bArr2));
            int i = ((o00000oo.oo000o) oooOo00.f13710OooOo).f29306OooO0o;
            int length = bArr.length;
            o0o00000.getClass();
            return bArrOooO0OO;
        } catch (GeneralSecurityException e) {
            o0o00000.getClass();
            throw e;
        }
    }

    @Override // o00000oo.OooOOOO
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        Oooo.OooOo00 oooOo00 = this.f28895OooO00o;
        o0O00000 o0o00000 = this.f28897OooO0OO;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = oooOo00.OooOOO(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrOooO0O0 = ((o00000oo.OooOOOO) ((o00000oo.oo000o) it.next()).f29303OooO0O0).OooO0O0(bArrCopyOfRange, bArr2);
                    o0o00000.getClass();
                    return bArrOooO0O0;
                } catch (GeneralSecurityException e) {
                    OooO.f28893OooO00o.info("ciphertext prefix matches a key, but cannot decrypt: " + e);
                }
            }
        }
        Iterator it2 = oooOo00.OooOOO(o00000oo.OooOo00.f29284OooO00o).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrOooO0O02 = ((o00000oo.OooOOOO) ((o00000oo.oo000o) it2.next()).f29303OooO0O0).OooO0O0(bArr, bArr2);
                o0o00000.getClass();
                return bArrOooO0O02;
            } catch (GeneralSecurityException unused) {
            }
        }
        o0o00000.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}

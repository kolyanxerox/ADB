package o0000O;

import OoooOOO.o0O00000;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import o00000oo.o00Ooo;
import o00000oo.oo000o;
import o0000OOo.o00OO0OO;

/* loaded from: classes2.dex */
public final class o0OoOo0 implements o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Oooo.OooOo00 f29351OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00000 f29352OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00000 f29353OooO0OO;

    public o0OoOo0(Oooo.OooOo00 oooOo00) throws GeneralSecurityException {
        this.f29351OooO00o = oooOo00;
        boolean zIsEmpty = ((o0000OO.OooO00o) oooOo00.f13713OooOoO0).f29382OooO00o.isEmpty();
        o0O00000 o0o00000 = o000OO.o00O0O.f30178OooO00o;
        if (zIsEmpty) {
            this.f29352OooO0O0 = o0o00000;
            this.f29353OooO0OO = o0o00000;
            return;
        }
        o000OO.OooOO0 oooOO0 = (o000OO.OooOO0) o000OO.OooOO0O.f30163OooO0O0.f30165OooO00o.get();
        oooOO0 = oooOO0 == null ? o000OO.OooOO0O.f30164OooO0OO : oooOO0;
        o000OO.o00O0O.OooO00o(oooOo00);
        oooOO0.getClass();
        this.f29352OooO0O0 = o0o00000;
        this.f29353OooO0OO = o0o00000;
    }

    @Override // o00000oo.o00Ooo
    public final void OooO00o(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        o0O00000 o0o00000 = this.f29353OooO0OO;
        if (length <= 5) {
            o0o00000.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        Oooo.OooOo00 oooOo00 = this.f29351OooO00o;
        for (oo000o oo000oVar : oooOo00.OooOOO(bArrCopyOf)) {
            try {
                ((o00Ooo) oo000oVar.f29303OooO0O0).OooO00o(bArrCopyOfRange, oo000oVar.f29307OooO0o0.equals(o00OO0OO.LEGACY) ? OooO00o.OooO00o.OooO0OO(bArr2, o00O0O.f29349OooO0O0) : bArr2);
                o0o00000.getClass();
                return;
            } catch (GeneralSecurityException e) {
                o00O0O.f29348OooO00o.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = oooOo00.OooOOO(o00000oo.OooOo00.f29284OooO00o).iterator();
        while (it.hasNext()) {
            try {
                ((o00Ooo) ((oo000o) it.next()).f29303OooO0O0).OooO00o(bArr, bArr2);
                o0o00000.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        o0o00000.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // o00000oo.o00Ooo
    public final byte[] OooO0O0(byte[] bArr) throws GeneralSecurityException {
        o0O00000 o0o00000 = this.f29352OooO0O0;
        Oooo.OooOo00 oooOo00 = this.f29351OooO00o;
        if (((oo000o) oooOo00.f13710OooOo).f29307OooO0o0.equals(o00OO0OO.LEGACY)) {
            bArr = OooO00o.OooO00o.OooO0OO(bArr, o00O0O.f29349OooO0O0);
        }
        try {
            byte[] bArr2 = ((oo000o) oooOo00.f13710OooOo).f29304OooO0OO;
            byte[] bArrOooO0OO = OooO00o.OooO00o.OooO0OO(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((o00Ooo) ((oo000o) oooOo00.f13710OooOo).f29303OooO0O0).OooO0O0(bArr));
            int i = ((oo000o) oooOo00.f13710OooOo).f29306OooO0o;
            o0o00000.getClass();
            return bArrOooO0OO;
        } catch (GeneralSecurityException e) {
            o0o00000.getClass();
            throw e;
        }
    }
}

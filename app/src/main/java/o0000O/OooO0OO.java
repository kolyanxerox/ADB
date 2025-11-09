package o0000O;

import OooOOo0.o0ooOOo;
import OoooOOO.o0o0000;
import java.security.GeneralSecurityException;
import o00000oo.o00Ooo;
import o0000OOo.o00;
import o0000OOo.o000O;
import o0000OOo.o000OOo0;
import o0000OOo.o00O0000;
import o0000OOo.o00O000o;
import o0000OOo.o00oOoo;
import o0000OOo.o0O0ooO;
import o0000Oo.o0Oo0oo;

/* loaded from: classes2.dex */
public final class OooO0OO extends o000OO.OooO {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f29317OooO0Oo = 1;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final o000OO.OooOo f29316OooO0o0 = new o000OO.OooOo(OooO00o.class, new o0ooOOo(28));

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final o000OO.OooOo f29315OooO0o = new o000OO.OooOo(OooOOOO.class, new OooOo00(0));

    public /* synthetic */ OooO0OO(Class cls, o0000.OooOO0O[] oooOO0OArr) {
        super(cls, oooOO0OArr);
    }

    public static void OooO(o0000OOo.OooOO0O oooOO0O) {
        if (oooOO0O.OooOo() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (oooOO0O.OooOo() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static o000OO.OooO0o OooO0oo(int i, int i2, o000O o000o, int i3) {
        o00 o00VarOooOoOO = o00O0000.OooOoOO();
        o0O0ooO o0o0oooOooOoOO = o00oOoo.OooOoOO();
        o0o0oooOooOoOO.OooO0Oo();
        o00oOoo.OooOo0O((o00oOoo) o0o0oooOooOoOO.f28132OooOo0o, o000o);
        o0o0oooOooOoOO.OooO0Oo();
        o00oOoo.OooOo0o((o00oOoo) o0o0oooOooOoOO.f28132OooOo0o, i2);
        o00oOoo o00oooo = (o00oOoo) o0o0oooOooOoOO.OooO00o();
        o00VarOooOoOO.OooO0Oo();
        o00O0000.OooOo0O((o00O0000) o00VarOooOoOO.f28132OooOo0o, o00oooo);
        o00VarOooOoOO.OooO0Oo();
        o00O0000.OooOo0o((o00O0000) o00VarOooOoOO.f28132OooOo0o, i);
        return new o000OO.OooO0o((o00O0000) o00VarOooOoOO.OooO00o(), i3);
    }

    public static void OooOO0(o00oOoo o00oooo) {
        if (o00oooo.OooOoO() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = o00oooo.OooOoO0().ordinal();
        if (iOrdinal == 1) {
            if (o00oooo.OooOoO() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (o00oooo.OooOoO() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (o00oooo.OooOoO() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (o00oooo.OooOoO() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (o00oooo.OooOoO() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // o000OO.OooO
    public int OooO00o() {
        switch (this.f29317OooO0Oo) {
            case 1:
                return 2;
            default:
                return super.OooO00o();
        }
    }

    @Override // o000OO.OooO
    public final String OooO0O0() {
        switch (this.f29317OooO0Oo) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // o000OO.OooO
    public final o0o0000 OooO0Oo() {
        switch (this.f29317OooO0Oo) {
            case 0:
                return new OooO0O0(o0000OOo.OooO.class);
            default:
                return new o0000.OooOOO0(this);
        }
    }

    @Override // o000OO.OooO
    public final com.google.crypto.tink.shaded.protobuf.OooO00o OooO0o(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0) {
        switch (this.f29317OooO0Oo) {
            case 0:
                return o0000OOo.OooO0OO.OooOoo(oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
            default:
                return o000OOo0.OooOooO(oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0.OooO00o());
        }
    }

    @Override // o000OO.OooO
    public final o00O000o OooO0o0() {
        switch (this.f29317OooO0Oo) {
        }
        return o00O000o.SYMMETRIC;
    }

    @Override // o000OO.OooO
    public final void OooO0oO(com.google.crypto.tink.shaded.protobuf.OooO00o oooO00o) throws GeneralSecurityException {
        switch (this.f29317OooO0Oo) {
            case 0:
                o0000OOo.OooO0OO oooO0OO = (o0000OOo.OooO0OO) oooO00o;
                o0Oo0oo.OooO0OO(oooO0OO.OooOoOO());
                if (oooO0OO.OooOoO0().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                OooO(oooO0OO.OooOoO());
                return;
            default:
                o000OOo0 o000ooo02 = (o000OOo0) oooO00o;
                o0Oo0oo.OooO0OO(o000ooo02.OooOoo0());
                if (o000ooo02.OooOoO().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                OooOO0(o000ooo02.OooOoOO());
                return;
        }
    }

    public OooO0OO() {
        super(o000OOo0.class, new o0000.OooOO0O(o00Ooo.class, 10));
    }
}

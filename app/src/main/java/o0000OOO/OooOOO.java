package o0000OOo;

/* loaded from: classes2.dex */
public final class OooOOO extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final OooOOO DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private o00Ooo aesCtrKey_;
    private o000OOo0 hmacKey_;
    private int version_;

    static {
        OooOOO oooOOO = new OooOOO();
        DEFAULT_INSTANCE = oooOOO;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(OooOOO.class, oooOOO);
    }

    public static void OooOo(OooOOO oooOOO, o000OOo0 o000ooo02) {
        oooOOO.getClass();
        o000ooo02.getClass();
        oooOOO.hmacKey_ = o000ooo02;
    }

    public static void OooOo0O(OooOOO oooOOO) {
        oooOOO.version_ = 0;
    }

    public static void OooOo0o(OooOOO oooOOO, o00Ooo o00ooo2) {
        oooOOO.getClass();
        o00ooo2.getClass();
        oooOOO.aesCtrKey_ = o00ooo2;
    }

    public static OooOOO OooOoo(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (OooOOO) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
    }

    public static OooOOO0 OooOoo0() {
        return (OooOOO0) DEFAULT_INSTANCE.OooO0oO();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0ooOOo
    public final Object OooO0oo(int i) {
        com.google.crypto.tink.shaded.protobuf.o000O00 o00oo0o;
        switch (OooOOo.OooOOO.OooO0O0(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new OooOOO();
            case 4:
                return new OooOOO0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (OooOOO.class) {
                    try {
                        o00oo0o = PARSER;
                        if (o00oo0o == null) {
                            o00oo0o = new com.google.crypto.tink.shaded.protobuf.o00oO0o();
                            PARSER = o00oo0o;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return o00oo0o;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final o000OOo0 OooOoO() {
        o000OOo0 o000ooo02 = this.hmacKey_;
        return o000ooo02 == null ? o000OOo0.OooOoO0() : o000ooo02;
    }

    public final o00Ooo OooOoO0() {
        o00Ooo o00ooo2 = this.aesCtrKey_;
        return o00ooo2 == null ? o00Ooo.OooOoO0() : o00ooo2;
    }

    public final int OooOoOO() {
        return this.version_;
    }
}

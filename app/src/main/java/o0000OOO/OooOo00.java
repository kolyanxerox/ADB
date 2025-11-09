package o0000OOo;

/* loaded from: classes2.dex */
public final class OooOo00 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final OooOo00 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private o00oO0o aesCtrKeyFormat_;
    private o00O0000 hmacKeyFormat_;

    static {
        OooOo00 oooOo00 = new OooOo00();
        DEFAULT_INSTANCE = oooOo00;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(OooOo00.class, oooOo00);
    }

    public static void OooOo0O(OooOo00 oooOo00, o00oO0o o00oo0o) {
        oooOo00.getClass();
        oooOo00.aesCtrKeyFormat_ = o00oo0o;
    }

    public static void OooOo0o(OooOo00 oooOo00, o00O0000 o00o0000) {
        oooOo00.getClass();
        oooOo00.hmacKeyFormat_ = o00o0000;
    }

    public static OooOOOO OooOoO() {
        return (OooOOOO) DEFAULT_INSTANCE.OooO0oO();
    }

    public static OooOo00 OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (OooOo00) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new OooOo00();
            case 4:
                return new OooOOOO(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (OooOo00.class) {
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

    public final o00oO0o OooOo() {
        o00oO0o o00oo0o = this.aesCtrKeyFormat_;
        return o00oo0o == null ? o00oO0o.OooOo() : o00oo0o;
    }

    public final o00O0000 OooOoO0() {
        o00O0000 o00o0000 = this.hmacKeyFormat_;
        return o00o0000 == null ? o00O0000.OooOo() : o00o0000;
    }
}

package o0000OOo;

/* loaded from: classes2.dex */
public final class o00O0O extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final o00O0O DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private o00oOoo hmacParams_;

    static {
        o00O0O o00o0o = new o00O0O();
        DEFAULT_INSTANCE = o00o0o;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00O0O.class, o00o0o);
    }

    public static void OooOo(o00O0O o00o0o) {
        o000O o000o = o000O.SHA256;
        o00o0o.getClass();
        o00o0o.hkdfHashType_ = o000o.getNumber();
    }

    public static void OooOo0O(o00O0O o00o0o, int i) {
        o00o0o.ciphertextSegmentSize_ = i;
    }

    public static void OooOo0o(o00O0O o00o0o, int i) {
        o00o0o.derivedKeySize_ = i;
    }

    public static void OooOoO0(o00O0O o00o0o, o00oOoo o00oooo) {
        o00o0o.getClass();
        o00o0o.hmacParams_ = o00oooo;
    }

    public static o00O0O OooOoOO() {
        return DEFAULT_INSTANCE;
    }

    public static o0OoOo0 OooOooo() {
        return (o0OoOo0) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 3:
                return new o00O0O();
            case 4:
                return new o0OoOo0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00O0O.class) {
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

    public final int OooOoO() {
        return this.ciphertextSegmentSize_;
    }

    public final o000O OooOoo() {
        o000O o000oOooO00o = o000O.OooO00o(this.hkdfHashType_);
        return o000oOooO00o == null ? o000O.UNRECOGNIZED : o000oOooO00o;
    }

    public final int OooOoo0() {
        return this.derivedKeySize_;
    }

    public final o00oOoo OooOooO() {
        o00oOoo o00oooo = this.hmacParams_;
        return o00oooo == null ? o00oOoo.OooOo() : o00oooo;
    }
}

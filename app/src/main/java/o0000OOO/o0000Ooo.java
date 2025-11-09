package o0000OOo;

/* loaded from: classes2.dex */
public final class o0000Ooo extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final o0000Ooo DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    static {
        o0000Ooo o0000ooo = new o0000Ooo();
        DEFAULT_INSTANCE = o0000ooo;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o0000Ooo.class, o0000ooo);
    }

    public static void OooOo(o0000Ooo o0000ooo) {
        o000O o000o = o000O.SHA256;
        o0000ooo.getClass();
        o0000ooo.hkdfHashType_ = o000o.getNumber();
    }

    public static void OooOo0O(o0000Ooo o0000ooo, int i) {
        o0000ooo.ciphertextSegmentSize_ = i;
    }

    public static void OooOo0o(o0000Ooo o0000ooo, int i) {
        o0000ooo.derivedKeySize_ = i;
    }

    public static o0000Ooo OooOoO() {
        return DEFAULT_INSTANCE;
    }

    public static o00000OO OooOoo() {
        return (o00000OO) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 3:
                return new o0000Ooo();
            case 4:
                return new o00000OO(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o0000Ooo.class) {
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

    public final int OooOoO0() {
        return this.ciphertextSegmentSize_;
    }

    public final int OooOoOO() {
        return this.derivedKeySize_;
    }

    public final o000O OooOoo0() {
        o000O o000oOooO00o = o000O.OooO00o(this.hkdfHashType_);
        return o000oOooO00o == null ? o000O.UNRECOGNIZED : o000oOooO00o;
    }
}

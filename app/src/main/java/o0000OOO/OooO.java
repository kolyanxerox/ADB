package o0000OOo;

/* loaded from: classes2.dex */
public final class OooO extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final OooO DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private int keySize_;
    private OooOO0O params_;

    static {
        OooO oooO = new OooO();
        DEFAULT_INSTANCE = oooO;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(OooO.class, oooO);
    }

    public static void OooOo0O(OooO oooO) {
        oooO.keySize_ = 32;
    }

    public static void OooOo0o(OooO oooO, OooOO0O oooOO0O) {
        oooO.getClass();
        oooO.params_ = oooOO0O;
    }

    public static OooO0o OooOoO() {
        return (OooO0o) DEFAULT_INSTANCE.OooO0oO();
    }

    public static OooO OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (OooO) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new OooO();
            case 4:
                return new OooO0o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (OooO.class) {
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

    public final int OooOo() {
        return this.keySize_;
    }

    public final OooOO0O OooOoO0() {
        OooOO0O oooOO0O = this.params_;
        return oooOO0O == null ? OooOO0O.OooOo0o() : oooOO0O;
    }
}

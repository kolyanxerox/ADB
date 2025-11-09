package o0000OOo;

/* loaded from: classes2.dex */
public final class OooO0OO extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final OooO0OO DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private OooOO0O params_;
    private int version_;

    static {
        OooO0OO oooO0OO = new OooO0OO();
        DEFAULT_INSTANCE = oooO0OO;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(OooO0OO.class, oooO0OO);
    }

    public static void OooOo(OooO0OO oooO0OO, OooOO0O oooOO0O) {
        oooO0OO.getClass();
        oooOO0O.getClass();
        oooO0OO.params_ = oooOO0O;
    }

    public static void OooOo0O(OooO0OO oooO0OO) {
        oooO0OO.version_ = 0;
    }

    public static void OooOo0o(OooO0OO oooO0OO, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        oooO0OO.getClass();
        oooO0OO.keyValue_ = oooOO0O;
    }

    public static OooO0OO OooOoo(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (OooO0OO) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
    }

    public static OooO0O0 OooOoo0() {
        return (OooO0O0) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new OooO0OO();
            case 4:
                return new OooO0O0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (OooO0OO.class) {
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

    public final OooOO0O OooOoO() {
        OooOO0O oooOO0O = this.params_;
        return oooOO0O == null ? OooOO0O.OooOo0o() : oooOO0O;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoO0() {
        return this.keyValue_;
    }

    public final int OooOoOO() {
        return this.version_;
    }
}

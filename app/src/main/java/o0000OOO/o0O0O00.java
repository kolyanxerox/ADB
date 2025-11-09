package o0000OOo;

/* loaded from: classes2.dex */
public final class o0O0O00 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o0O0O00 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private int keySize_;
    private o000000 params_;

    static {
        o0O0O00 o0o0o00 = new o0O0O00();
        DEFAULT_INSTANCE = o0o0o00;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o0O0O00.class, o0o0o00);
    }

    public static void OooOo0O(o0O0O00 o0o0o00, o000000 o000000Var) {
        o0o0o00.getClass();
        o0o0o00.params_ = o000000Var;
    }

    public static void OooOo0o(o0O0O00 o0o0o00, int i) {
        o0o0o00.keySize_ = i;
    }

    public static oo0o0Oo OooOoO() {
        return (oo0o0Oo) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o0O0O00 OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o0O0O00) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new o0O0O00();
            case 4:
                return new oo0o0Oo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o0O0O00.class) {
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

    public final o000000 OooOoO0() {
        o000000 o000000Var = this.params_;
        return o000000Var == null ? o000000.OooOo0o() : o000000Var;
    }
}

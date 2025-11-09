package o0000OOo;

/* loaded from: classes2.dex */
public final class o00000 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00000 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private o0000Ooo params_;
    private int version_;

    static {
        o00000 o00000Var = new o00000();
        DEFAULT_INSTANCE = o00000Var;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00000.class, o00000Var);
    }

    public static void OooOo(o00000 o00000Var, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o00000Var.getClass();
        o00000Var.keyValue_ = oooOO0O;
    }

    public static void OooOo0O(o00000 o00000Var) {
        o00000Var.version_ = 0;
    }

    public static void OooOo0o(o00000 o00000Var, o0000Ooo o0000ooo) {
        o00000Var.getClass();
        o0000ooo.getClass();
        o00000Var.params_ = o0000ooo;
    }

    public static o00000 OooOoo(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o00000) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
    }

    public static o000000O OooOoo0() {
        return (o000000O) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new o00000();
            case 4:
                return new o000000O(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00000.class) {
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

    public final o0000Ooo OooOoO() {
        o0000Ooo o0000ooo = this.params_;
        return o0000ooo == null ? o0000Ooo.OooOoO() : o0000ooo;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoO0() {
        return this.keyValue_;
    }

    public final int OooOoOO() {
        return this.version_;
    }
}

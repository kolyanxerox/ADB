package o0000OOo;

/* loaded from: classes2.dex */
public final class o0OO00O extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o0OO00O DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private o000000 params_;
    private int version_;

    static {
        o0OO00O o0oo00o = new o0OO00O();
        DEFAULT_INSTANCE = o0oo00o;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o0OO00O.class, o0oo00o);
    }

    public static void OooOo(o0OO00O o0oo00o, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o0oo00o.getClass();
        o0oo00o.keyValue_ = oooOO0O;
    }

    public static void OooOo0O(o0OO00O o0oo00o) {
        o0oo00o.version_ = 0;
    }

    public static void OooOo0o(o0OO00O o0oo00o, o000000 o000000Var) {
        o0oo00o.getClass();
        o000000Var.getClass();
        o0oo00o.params_ = o000000Var;
    }

    public static o0OO00O OooOoo(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o0OO00O) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
    }

    public static o0Oo0oo OooOoo0() {
        return (o0Oo0oo) DEFAULT_INSTANCE.OooO0oO();
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
                return new o0OO00O();
            case 4:
                return new o0Oo0oo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o0OO00O.class) {
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

    public final o000000 OooOoO() {
        o000000 o000000Var = this.params_;
        return o000000Var == null ? o000000.OooOo0o() : o000000Var;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoO0() {
        return this.keyValue_;
    }

    public final int OooOoOO() {
        return this.version_;
    }
}

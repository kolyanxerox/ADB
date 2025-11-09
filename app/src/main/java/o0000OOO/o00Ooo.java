package o0000OOo;

/* loaded from: classes2.dex */
public final class o00Ooo extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00Ooo DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private o0OOO0o params_;
    private int version_;

    static {
        o00Ooo o00ooo2 = new o00Ooo();
        DEFAULT_INSTANCE = o00ooo2;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00Ooo.class, o00ooo2);
    }

    public static void OooOo(o00Ooo o00ooo2, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o00ooo2.getClass();
        o00ooo2.keyValue_ = oooOO0O;
    }

    public static void OooOo0O(o00Ooo o00ooo2) {
        o00ooo2.version_ = 0;
    }

    public static void OooOo0o(o00Ooo o00ooo2, o0OOO0o o0ooo0o) {
        o00ooo2.getClass();
        o0ooo0o.getClass();
        o00ooo2.params_ = o0ooo0o;
    }

    public static o00Ooo OooOoO0() {
        return DEFAULT_INSTANCE;
    }

    public static o00Oo0 OooOoo() {
        return (o00Oo0) DEFAULT_INSTANCE.OooO0oO();
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
                return new o00Ooo();
            case 4:
                return new o00Oo0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00Ooo.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoO() {
        return this.keyValue_;
    }

    public final o0OOO0o OooOoOO() {
        o0OOO0o o0ooo0o = this.params_;
        return o0ooo0o == null ? o0OOO0o.OooOo0o() : o0ooo0o;
    }

    public final int OooOoo0() {
        return this.version_;
    }
}

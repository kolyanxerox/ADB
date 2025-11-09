package o0000OOo;

/* loaded from: classes2.dex */
public final class o000OOo0 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o000OOo0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private o00oOoo params_;
    private int version_;

    static {
        o000OOo0 o000ooo02 = new o000OOo0();
        DEFAULT_INSTANCE = o000ooo02;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o000OOo0.class, o000ooo02);
    }

    public static void OooOo(o000OOo0 o000ooo02, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o000ooo02.getClass();
        o000ooo02.keyValue_ = oooOO0O;
    }

    public static void OooOo0O(o000OOo0 o000ooo02) {
        o000ooo02.version_ = 0;
    }

    public static void OooOo0o(o000OOo0 o000ooo02, o00oOoo o00oooo) {
        o000ooo02.getClass();
        o00oooo.getClass();
        o000ooo02.params_ = o00oooo;
    }

    public static o000OOo0 OooOoO0() {
        return DEFAULT_INSTANCE;
    }

    public static o000OO00 OooOoo() {
        return (o000OO00) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o000OOo0 OooOooO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o000OOo0) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new o000OOo0();
            case 4:
                return new o000OO00(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o000OOo0.class) {
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

    public final o00oOoo OooOoOO() {
        o00oOoo o00oooo = this.params_;
        return o00oooo == null ? o00oOoo.OooOo() : o00oooo;
    }

    public final int OooOoo0() {
        return this.version_;
    }
}

package o0000OOo;

/* loaded from: classes2.dex */
public final class o00O0000 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00O0000 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private o00oOoo params_;
    private int version_;

    static {
        o00O0000 o00o0000 = new o00O0000();
        DEFAULT_INSTANCE = o00o0000;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00O0000.class, o00o0000);
    }

    public static o00O0000 OooOo() {
        return DEFAULT_INSTANCE;
    }

    public static void OooOo0O(o00O0000 o00o0000, o00oOoo o00oooo) {
        o00o0000.getClass();
        o00o0000.params_ = o00oooo;
    }

    public static void OooOo0o(o00O0000 o00o0000, int i) {
        o00o0000.keySize_ = i;
    }

    public static o00 OooOoOO() {
        return (o00) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o00O0000 OooOoo0(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o00O0000) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new o00O0000();
            case 4:
                return new o00(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00O0000.class) {
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

    public final o00oOoo OooOoO() {
        o00oOoo o00oooo = this.params_;
        return o00oooo == null ? o00oOoo.OooOo() : o00oooo;
    }

    public final int OooOoO0() {
        return this.keySize_;
    }
}

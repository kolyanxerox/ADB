package o0000OOo;

/* loaded from: classes2.dex */
public final class Oooo000 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final Oooo000 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private o00O0O params_;
    private int version_;

    static {
        Oooo000 oooo000 = new Oooo000();
        DEFAULT_INSTANCE = oooo000;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(Oooo000.class, oooo000);
    }

    public static void OooOo(Oooo000 oooo000, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        oooo000.getClass();
        oooo000.keyValue_ = oooOO0O;
    }

    public static void OooOo0O(Oooo000 oooo000) {
        oooo000.version_ = 0;
    }

    public static void OooOo0o(Oooo000 oooo000, o00O0O o00o0o) {
        oooo000.getClass();
        o00o0o.getClass();
        oooo000.params_ = o00o0o;
    }

    public static Oooo000 OooOoo(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (Oooo000) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
    }

    public static OooOo OooOoo0() {
        return (OooOo) DEFAULT_INSTANCE.OooO0oO();
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
                return new Oooo000();
            case 4:
                return new OooOo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (Oooo000.class) {
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

    public final o00O0O OooOoO() {
        o00O0O o00o0o = this.params_;
        return o00o0o == null ? o00O0O.OooOoOO() : o00o0o;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoO0() {
        return this.keyValue_;
    }

    public final int OooOoOO() {
        return this.version_;
    }
}

package o0000OOo;

/* loaded from: classes2.dex */
public final class o000oOoO extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o000oOoO DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private o00O0O params_;
    private int version_;

    static {
        o000oOoO o000oooo2 = new o000oOoO();
        DEFAULT_INSTANCE = o000oooo2;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o000oOoO.class, o000oooo2);
    }

    public static void OooOo0O(o000oOoO o000oooo2, o00O0O o00o0o) {
        o000oooo2.getClass();
        o000oooo2.params_ = o00o0o;
    }

    public static void OooOo0o(o000oOoO o000oooo2, int i) {
        o000oooo2.keySize_ = i;
    }

    public static Oooo0 OooOoO() {
        return (Oooo0) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o000oOoO OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o000oOoO) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new o000oOoO();
            case 4:
                return new Oooo0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o000oOoO.class) {
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

    public final o00O0O OooOoO0() {
        o00O0O o00o0o = this.params_;
        return o00o0o == null ? o00O0O.OooOoOO() : o00o0o;
    }
}

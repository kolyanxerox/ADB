package o0000OOo;

/* loaded from: classes2.dex */
public final class oo0oOO0 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final oo0oOO0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private o00O params_;
    private int version_;

    static {
        oo0oOO0 oo0ooo0 = new oo0oOO0();
        DEFAULT_INSTANCE = oo0ooo0;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(oo0oOO0.class, oo0ooo0);
    }

    public static void OooOo0O(oo0oOO0 oo0ooo0) {
        oo0ooo0.version_ = 0;
    }

    public static void OooOo0o(oo0oOO0 oo0ooo0, o00O o00o) {
        oo0ooo0.getClass();
        o00o.getClass();
        oo0ooo0.params_ = o00o;
    }

    public static o00O0OOO OooOoO() {
        return (o00O0OOO) DEFAULT_INSTANCE.OooO0oO();
    }

    public static oo0oOO0 OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (oo0oOO0) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new oo0oOO0();
            case 4:
                return new o00O0OOO(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (oo0oOO0.class) {
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

    public final o00O OooOo() {
        o00O o00o = this.params_;
        return o00o == null ? o00O.OooOo0O() : o00o;
    }

    public final int OooOoO0() {
        return this.version_;
    }
}

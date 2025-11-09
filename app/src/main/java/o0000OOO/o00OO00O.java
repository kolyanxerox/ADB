package o0000OOo;

/* loaded from: classes2.dex */
public final class o00OO00O extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00OO00O DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private o00OO0O0 params_;
    private int version_;

    static {
        o00OO00O o00oo00o = new o00OO00O();
        DEFAULT_INSTANCE = o00oo00o;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00OO00O.class, o00oo00o);
    }

    public static void OooOo0O(o00OO00O o00oo00o) {
        o00oo00o.version_ = 0;
    }

    public static void OooOo0o(o00OO00O o00oo00o, o00OO0O0 o00oo0o0) {
        o00oo00o.getClass();
        o00oo0o0.getClass();
        o00oo00o.params_ = o00oo0o0;
    }

    public static o00OO000 OooOoO() {
        return (o00OO000) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o00OO00O OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o00OO00O) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new o00OO00O();
            case 4:
                return new o00OO000(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00OO00O.class) {
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

    public final o00OO0O0 OooOo() {
        o00OO0O0 o00oo0o0 = this.params_;
        return o00oo0o0 == null ? o00OO0O0.OooOo0O() : o00oo0o0;
    }

    public final int OooOoO0() {
        return this.version_;
    }
}

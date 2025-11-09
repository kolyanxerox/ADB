package o0000OOo;

/* loaded from: classes2.dex */
public final class o000O00O extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o000O00O DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private int version_;

    static {
        o000O00O o000o00o2 = new o000O00O();
        DEFAULT_INSTANCE = o000o00o2;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o000O00O.class, o000o00o2);
    }

    public static void OooOo0O(o000O00O o000o00o2) {
        o000o00o2.version_ = 0;
    }

    public static void OooOo0o(o000O00O o000o00o2, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o000o00o2.getClass();
        o000o00o2.keyValue_ = oooOO0O;
    }

    public static o000O00 OooOoO() {
        return (o000O00) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o000O00O OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o000O00O) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new o000O00O();
            case 4:
                return new o000O00(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o000O00O.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOo() {
        return this.keyValue_;
    }

    public final int OooOoO0() {
        return this.version_;
    }
}

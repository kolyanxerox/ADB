package o0000OOo;

/* loaded from: classes2.dex */
public final class o00000O extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00000O DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private o0000Ooo params_;
    private int version_;

    static {
        o00000O o00000o = new o00000O();
        DEFAULT_INSTANCE = o00000o;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00000O.class, o00000o);
    }

    public static void OooOo0O(o00000O o00000o, o0000Ooo o0000ooo) {
        o00000o.getClass();
        o00000o.params_ = o0000ooo;
    }

    public static void OooOo0o(o00000O o00000o, int i) {
        o00000o.keySize_ = i;
    }

    public static o00000O0 OooOoO() {
        return (o00000O0) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o00000O OooOoOO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o00000O) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new o00000O();
            case 4:
                return new o00000O0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00000O.class) {
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

    public final o0000Ooo OooOoO0() {
        o0000Ooo o0000ooo = this.params_;
        return o0000ooo == null ? o0000Ooo.OooOoO() : o0000ooo;
    }
}

package o0000OOo;

/* loaded from: classes2.dex */
public final class o000Oo0 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o000Oo0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        o000Oo0 o000oo02 = new o000Oo0();
        DEFAULT_INSTANCE = o000oo02;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o000Oo0.class, o000oo02);
    }

    public static o000O0o OooOo() {
        return (o000O0o) DEFAULT_INSTANCE.OooO0oO();
    }

    public static void OooOo0O(o000Oo0 o000oo02) {
        o000oo02.keySize_ = 64;
    }

    public static o000Oo0 OooOoO0(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o000Oo0) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new o000Oo0();
            case 4:
                return new o000O0o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o000Oo0.class) {
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

    public final int OooOo0o() {
        return this.keySize_;
    }
}

package o0000OOo;

/* loaded from: classes2.dex */
public final class o00oO0o extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00oO0o DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private int keySize_;
    private o0OOO0o params_;

    static {
        o00oO0o o00oo0o = new o00oO0o();
        DEFAULT_INSTANCE = o00oo0o;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00oO0o.class, o00oo0o);
    }

    public static o00oO0o OooOo() {
        return DEFAULT_INSTANCE;
    }

    public static void OooOo0O(o00oO0o o00oo0o, o0OOO0o o0ooo0o) {
        o00oo0o.getClass();
        o00oo0o.params_ = o0ooo0o;
    }

    public static void OooOo0o(o00oO0o o00oo0o, int i) {
        o00oo0o.keySize_ = i;
    }

    public static oo000o OooOoOO() {
        return (oo000o) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new o00oO0o();
            case 4:
                return new oo000o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00oO0o.class) {
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

    public final o0OOO0o OooOoO() {
        o0OOO0o o0ooo0o = this.params_;
        return o0ooo0o == null ? o0OOO0o.OooOo0o() : o0ooo0o;
    }

    public final int OooOoO0() {
        return this.keySize_;
    }
}

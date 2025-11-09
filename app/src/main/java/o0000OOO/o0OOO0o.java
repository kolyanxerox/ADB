package o0000OOo;

/* loaded from: classes2.dex */
public final class o0OOO0o extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o0OOO0o DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private int ivSize_;

    static {
        o0OOO0o o0ooo0o = new o0OOO0o();
        DEFAULT_INSTANCE = o0ooo0o;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o0OOO0o.class, o0ooo0o);
    }

    public static void OooOo0O(o0OOO0o o0ooo0o) {
        o0ooo0o.ivSize_ = 16;
    }

    public static o0OOO0o OooOo0o() {
        return DEFAULT_INSTANCE;
    }

    public static o0ooOOo OooOoO0() {
        return (o0ooOOo) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new o0OOO0o();
            case 4:
                return new o0ooOOo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o0OOO0o.class) {
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
        return this.ivSize_;
    }
}

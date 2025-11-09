package o0000OOo;

/* loaded from: classes2.dex */
public final class o000O0Oo extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o000O0Oo DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;

    static {
        o000O0Oo o000o0oo2 = new o000O0Oo();
        DEFAULT_INSTANCE = o000o0oo2;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o000O0Oo.class, o000o0oo2);
    }

    public static o000O0Oo OooOo0O() {
        return DEFAULT_INSTANCE;
    }

    public static o000O0Oo OooOo0o(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o000O0Oo) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new o000O0Oo();
            case 4:
                return new o000O0(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o000O0Oo.class) {
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
}

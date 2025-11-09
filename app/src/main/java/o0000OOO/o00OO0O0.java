package o0000OOo;

/* loaded from: classes2.dex */
public final class o00OO0O0 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00OO0O0 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private o00O00OO dekTemplate_;
    private String kekUri_ = "";

    static {
        o00OO0O0 o00oo0o0 = new o00OO0O0();
        DEFAULT_INSTANCE = o00oo0o0;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00OO0O0.class, o00oo0o0);
    }

    public static o00OO0O0 OooOo0O() {
        return DEFAULT_INSTANCE;
    }

    public static o00OO0O0 OooOoO(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        return (o00OO0O0) com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo0(DEFAULT_INSTANCE, oooOOO0, oooo0);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new o00OO0O0();
            case 4:
                return new o000O0(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00OO0O0.class) {
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

    public final String OooOo() {
        return this.kekUri_;
    }

    public final o00O00OO OooOo0o() {
        o00O00OO o00o00oo = this.dekTemplate_;
        return o00o00oo == null ? o00O00OO.OooOoO0() : o00o00oo;
    }

    public final boolean OooOoO0() {
        return this.dekTemplate_ != null;
    }
}

package o0000OOo;

/* loaded from: classes2.dex */
public final class o00O00OO extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00O00OO DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 value_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;

    static {
        o00O00OO o00o00oo = new o00O00OO();
        DEFAULT_INSTANCE = o00o00oo;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00O00OO.class, o00o00oo);
    }

    public static void OooOo(o00O00OO o00o00oo, o00OO0OO o00oo0oo) {
        o00o00oo.getClass();
        o00o00oo.outputPrefixType_ = o00oo0oo.getNumber();
    }

    public static void OooOo0O(o00O00OO o00o00oo, String str) {
        o00o00oo.getClass();
        str.getClass();
        o00o00oo.typeUrl_ = str;
    }

    public static void OooOo0o(o00O00OO o00o00oo, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o00o00oo.getClass();
        o00o00oo.value_ = oooOO0O;
    }

    public static o00O00OO OooOoO0() {
        return DEFAULT_INSTANCE;
    }

    public static oOO00O OooOoo() {
        return (oOO00O) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new o00O00OO();
            case 4:
                return new oOO00O(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00O00OO.class) {
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

    public final o00OO0OO OooOoO() {
        o00OO0OO o00oo0ooOooO00o = o00OO0OO.OooO00o(this.outputPrefixType_);
        return o00oo0ooOooO00o == null ? o00OO0OO.UNRECOGNIZED : o00oo0ooOooO00o;
    }

    public final String OooOoOO() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoo0() {
        return this.value_;
    }
}

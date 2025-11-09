package o0000OOo;

/* loaded from: classes2.dex */
public final class oo0o0O0 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final oo0o0O0 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        oo0o0O0 oo0o0o0 = new oo0o0O0();
        DEFAULT_INSTANCE = oo0o0o0;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(oo0o0O0.class, oo0o0o0);
    }

    public static void OooOo(oo0o0O0 oo0o0o0, o00O00O o00o00o) {
        oo0o0o0.getClass();
        oo0o0o0.status_ = o00o00o.getNumber();
    }

    public static void OooOo0O(oo0o0O0 oo0o0o0, String str) {
        oo0o0o0.getClass();
        str.getClass();
        oo0o0o0.typeUrl_ = str;
    }

    public static void OooOo0o(oo0o0O0 oo0o0o0, o00OO0OO o00oo0oo) {
        oo0o0o0.getClass();
        oo0o0o0.outputPrefixType_ = o00oo0oo.getNumber();
    }

    public static void OooOoO0(oo0o0O0 oo0o0o0, int i) {
        oo0o0o0.keyId_ = i;
    }

    public static o00O0OO0 OooOoOO() {
        return (o00O0OO0) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new oo0o0O0();
            case 4:
                return new o00O0OO0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (oo0o0O0.class) {
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

    public final int OooOoO() {
        return this.keyId_;
    }
}

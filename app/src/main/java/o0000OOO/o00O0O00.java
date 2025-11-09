package o0000OOo;

/* loaded from: classes2.dex */
public final class o00O0O00 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00O0O00 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private o00O00 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        o00O0O00 o00o0o00 = new o00O0O00();
        DEFAULT_INSTANCE = o00o0o00;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00O0O00.class, o00o0o00);
    }

    public static void OooOo(o00O0O00 o00o0o00) {
        o00O00O o00o00o = o00O00O.ENABLED;
        o00o0o00.getClass();
        o00o0o00.status_ = o00o00o.getNumber();
    }

    public static void OooOo0O(o00O0O00 o00o0o00, o00O00 o00o00) {
        o00o0o00.getClass();
        o00o0o00.keyData_ = o00o00;
    }

    public static void OooOo0o(o00O0O00 o00o0o00, o00OO0OO o00oo0oo) {
        o00o0o00.getClass();
        o00o0o00.outputPrefixType_ = o00oo0oo.getNumber();
    }

    public static void OooOoO0(o00O0O00 o00o0o00, int i) {
        o00o0o00.keyId_ = i;
    }

    public static o00O0 OooOooo() {
        return (o00O0) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new o00O0O00();
            case 4:
                return new o00O0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00O0O00.class) {
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

    public final o00O00 OooOoO() {
        o00O00 o00o00 = this.keyData_;
        return o00o00 == null ? o00O00.OooOoO0() : o00o00;
    }

    public final int OooOoOO() {
        return this.keyId_;
    }

    public final o00O00O OooOoo() {
        int i = this.status_;
        o00O00O o00o00o = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : o00O00O.DESTROYED : o00O00O.DISABLED : o00O00O.ENABLED : o00O00O.UNKNOWN_STATUS;
        return o00o00o == null ? o00O00O.UNRECOGNIZED : o00o00o;
    }

    public final o00OO0OO OooOoo0() {
        o00OO0OO o00oo0ooOooO00o = o00OO0OO.OooO00o(this.outputPrefixType_);
        return o00oo0ooOooO00o == null ? o00OO0OO.UNRECOGNIZED : o00oo0ooOooO00o;
    }

    public final boolean OooOooO() {
        return this.keyData_ != null;
    }
}

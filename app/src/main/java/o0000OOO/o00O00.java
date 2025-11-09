package o0000OOo;

/* loaded from: classes2.dex */
public final class o00O00 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00O00 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 value_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;

    static {
        o00O00 o00o00 = new o00O00();
        DEFAULT_INSTANCE = o00o00;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00O00.class, o00o00);
    }

    public static void OooOo(o00O00 o00o00, o00O000o o00o000o) {
        o00o00.getClass();
        if (o00o000o != o00O000o.UNRECOGNIZED) {
            o00o00.keyMaterialType_ = o00o000o.f29404OooOo0O;
        } else {
            o00o000o.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static void OooOo0O(o00O00 o00o00, String str) {
        o00o00.getClass();
        str.getClass();
        o00o00.typeUrl_ = str;
    }

    public static void OooOo0o(o00O00 o00o00, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o00o00.getClass();
        o00o00.value_ = oooOO0O;
    }

    public static o00O00 OooOoO0() {
        return DEFAULT_INSTANCE;
    }

    public static o00O000 OooOoo() {
        return (o00O000) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new o00O00();
            case 4:
                return new o00O000(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00O00.class) {
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

    public final o00O000o OooOoO() {
        int i = this.keyMaterialType_;
        o00O000o o00o000o = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : o00O000o.REMOTE : o00O000o.ASYMMETRIC_PUBLIC : o00O000o.ASYMMETRIC_PRIVATE : o00O000o.SYMMETRIC : o00O000o.UNKNOWN_KEYMATERIAL;
        return o00o000o == null ? o00O000o.UNRECOGNIZED : o00o000o;
    }

    public final String OooOoOO() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOoo0() {
        return this.value_;
    }
}

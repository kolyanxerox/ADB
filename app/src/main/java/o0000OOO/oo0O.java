package o0000OOo;

/* loaded from: classes2.dex */
public final class oo0O extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final oo0O DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private String configName_ = "";
    private com.google.crypto.tink.shaded.protobuf.o0OO00O entry_ = com.google.crypto.tink.shaded.protobuf.o000O0Oo.f28093OooOoO0;

    static {
        oo0O oo0o = new oo0O();
        DEFAULT_INSTANCE = oo0o;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(oo0O.class, oo0o);
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", o00O00o0.class});
            case 3:
                return new oo0O();
            case 4:
                return new o000O0(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (oo0O.class) {
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

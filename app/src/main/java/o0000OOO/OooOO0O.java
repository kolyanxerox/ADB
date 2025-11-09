package o0000OOo;

/* loaded from: classes2.dex */
public final class OooOO0O extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final OooOO0O DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        OooOO0O oooOO0O = new OooOO0O();
        DEFAULT_INSTANCE = oooOO0O;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(OooOO0O.class, oooOO0O);
    }

    public static void OooOo0O(OooOO0O oooOO0O) {
        oooOO0O.tagSize_ = 16;
    }

    public static OooOO0O OooOo0o() {
        return DEFAULT_INSTANCE;
    }

    public static OooOO0 OooOoO0() {
        return (OooOO0) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new OooOO0O();
            case 4:
                return new OooOO0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (OooOO0O.class) {
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
        return this.tagSize_;
    }
}

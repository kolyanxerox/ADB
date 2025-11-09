package o0000OOo;

/* loaded from: classes2.dex */
public final class o00oOoo extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00oOoo DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        o00oOoo o00oooo = new o00oOoo();
        DEFAULT_INSTANCE = o00oooo;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00oOoo.class, o00oooo);
    }

    public static o00oOoo OooOo() {
        return DEFAULT_INSTANCE;
    }

    public static void OooOo0O(o00oOoo o00oooo, o000O o000o) {
        o00oooo.getClass();
        o00oooo.hash_ = o000o.getNumber();
    }

    public static void OooOo0o(o00oOoo o00oooo, int i) {
        o00oooo.tagSize_ = i;
    }

    public static o0O0ooO OooOoOO() {
        return (o0O0ooO) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new o00oOoo();
            case 4:
                return new o0O0ooO(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00oOoo.class) {
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
        return this.tagSize_;
    }

    public final o000O OooOoO0() {
        o000O o000oOooO00o = o000O.OooO00o(this.hash_);
        return o000oOooO00o == null ? o000O.UNRECOGNIZED : o000oOooO00o;
    }
}

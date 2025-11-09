package o0000OOo;

/* loaded from: classes2.dex */
public final class o00O0OO extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00O0OO DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.o0OO00O keyInfo_ = com.google.crypto.tink.shaded.protobuf.o000O0Oo.f28093OooOoO0;
    private int primaryKeyId_;

    static {
        o00O0OO o00o0oo = new o00O0OO();
        DEFAULT_INSTANCE = o00o0oo;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00O0OO.class, o00o0oo);
    }

    public static void OooOo0O(o00O0OO o00o0oo, int i) {
        o00o0oo.primaryKeyId_ = i;
    }

    public static void OooOo0o(o00O0OO o00o0oo, oo0o0O0 oo0o0o0) {
        o00o0oo.getClass();
        com.google.crypto.tink.shaded.protobuf.o0OO00O o0oo00o = o00o0oo.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.OooO0O0) o0oo00o).f28011OooOo0O) {
            int size = o0oo00o.size();
            o00o0oo.keyInfo_ = o0oo00o.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        o00o0oo.keyInfo_.add(oo0o0o0);
    }

    public static o00O0O0O OooOoO0() {
        return (o00O0O0O) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", oo0o0O0.class});
            case 3:
                return new o00O0OO();
            case 4:
                return new o00O0O0O(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00O0OO.class) {
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

    public final oo0o0O0 OooOo() {
        return (oo0o0O0) this.keyInfo_.get(0);
    }
}

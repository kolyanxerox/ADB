package o0000OOo;

import java.io.ByteArrayInputStream;

/* loaded from: classes2.dex */
public final class o000O0O0 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o000O0O0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER;
    private com.google.crypto.tink.shaded.protobuf.OooOOO0 encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
    private o00O0OO keysetInfo_;

    static {
        o000O0O0 o000o0o02 = new o000O0O0();
        DEFAULT_INSTANCE = o000o0o02;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o000O0O0.class, o000o0o02);
    }

    public static void OooOo0O(o000O0O0 o000o0o02, com.google.crypto.tink.shaded.protobuf.OooOO0O oooOO0O) {
        o000o0o02.getClass();
        o000o0o02.encryptedKeyset_ = oooOO0O;
    }

    public static void OooOo0o(o000O0O0 o000o0o02, o00O0OO o00o0oo) {
        o000o0o02.getClass();
        o000o0o02.keysetInfo_ = o00o0oo;
    }

    public static o000O0O0 OooOoO(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        com.google.crypto.tink.shaded.protobuf.o0ooOOo o0oooooOooOOo = com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.OooOOOO(byteArrayInputStream), oooo0);
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooO0o(o0oooooOooOOo);
        return (o000O0O0) o0oooooOooOOo;
    }

    public static o000OO0O OooOoO0() {
        return (o000OO0O) DEFAULT_INSTANCE.OooO0oO();
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new o000O0O0();
            case 4:
                return new o000OO0O(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o000O0O0.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.OooOOO0 OooOo() {
        return this.encryptedKeyset_;
    }
}

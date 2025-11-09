package o0000OOo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00O0O0 extends com.google.crypto.tink.shaded.protobuf.o0ooOOo {
    private static final o00O0O0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O00 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.o0OO00O key_ = com.google.crypto.tink.shaded.protobuf.o000O0Oo.f28093OooOoO0;
    private int primaryKeyId_;

    static {
        o00O0O0 o00o0o0 = new o00O0O0();
        DEFAULT_INSTANCE = o00o0o0;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOoo(o00O0O0.class, o00o0o0);
    }

    public static void OooOo0O(o00O0O0 o00o0o0, int i) {
        o00o0o0.primaryKeyId_ = i;
    }

    public static void OooOo0o(o00O0O0 o00o0o0, o00O0O00 o00o0o00) {
        o00o0o0.getClass();
        com.google.crypto.tink.shaded.protobuf.o0OO00O o0oo00o = o00o0o0.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.OooO0O0) o0oo00o).f28011OooOo0O) {
            int size = o0oo00o.size();
            o00o0o0.key_ = o0oo00o.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        o00o0o0.key_.add(o00o0o00);
    }

    public static o00O0O0 OooOoo(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        com.google.crypto.tink.shaded.protobuf.o0ooOOo o0oooooOooOOo = com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooOOo(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.OooOOOO(byteArrayInputStream), oooo0);
        com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooO0o(o0oooooOooOOo);
        return (o00O0O0) o0oooooOooOOo;
    }

    public static oo00o OooOoo0() {
        return (oo00o) DEFAULT_INSTANCE.OooO0oO();
    }

    public static o00O0O0 OooOooO(byte[] bArr, com.google.crypto.tink.shaded.protobuf.Oooo0 oooo0) {
        o00O0O0 o00o0o0 = DEFAULT_INSTANCE;
        int length = bArr.length;
        com.google.crypto.tink.shaded.protobuf.o0ooOOo o0oooooOooOOOo = o00o0o0.OooOOOo();
        try {
            com.google.crypto.tink.shaded.protobuf.o000O0 o000o0 = com.google.crypto.tink.shaded.protobuf.o000O0.f28087OooO0OO;
            o000o0.getClass();
            com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0OooO00o = o000o0.OooO00o(o0oooooOooOOOo.getClass());
            OooOOOO.OooO0O0 oooO0O0 = new OooOOOO.OooO0O0(4);
            oooo0.getClass();
            o000o0o0OooO00o.OooO0o(o0oooooOooOOOo, bArr, 0, length, oooO0O0);
            o000o0o0OooO00o.makeImmutable(o0oooooOooOOOo);
            com.google.crypto.tink.shaded.protobuf.o0ooOOo.OooO0o(o0oooooOooOOOo);
            return (o00O0O0) o0oooooOooOOOo;
        } catch (com.google.crypto.tink.shaded.protobuf.o000OO00 e) {
            throw new com.google.crypto.tink.shaded.protobuf.o000OOo(e.getMessage());
        } catch (com.google.crypto.tink.shaded.protobuf.o000OOo e2) {
            if (e2.f28100OooOo0O) {
                throw new com.google.crypto.tink.shaded.protobuf.o000OOo(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof com.google.crypto.tink.shaded.protobuf.o000OOo) {
                throw ((com.google.crypto.tink.shaded.protobuf.o000OOo) e3.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.o000OOo(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oo();
        }
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
                return new com.google.crypto.tink.shaded.protobuf.o000OO0O(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", o00O0O00.class});
            case 3:
                return new o00O0O0();
            case 4:
                return new oo00o(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O00 o000o002 = PARSER;
                if (o000o002 != null) {
                    return o000o002;
                }
                synchronized (o00O0O0.class) {
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

    public final o00O0O00 OooOo(int i) {
        return (o00O0O00) this.key_.get(i);
    }

    public final List OooOoO() {
        return this.key_;
    }

    public final int OooOoO0() {
        return this.key_.size();
    }

    public final int OooOoOO() {
        return this.primaryKeyId_;
    }
}

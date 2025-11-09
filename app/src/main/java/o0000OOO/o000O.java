package o0000OOo;

/* loaded from: classes2.dex */
public enum o000O implements com.google.crypto.tink.shaded.protobuf.o0Oo0oo {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f29395OooOo0O;

    o000O(int i) {
        this.f29395OooOo0O = i;
    }

    public static o000O OooO00o(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29395OooOo0O;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
